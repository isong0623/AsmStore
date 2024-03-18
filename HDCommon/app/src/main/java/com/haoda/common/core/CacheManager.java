package com.haoda.common.core;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class CacheManager {
    private static final RealmConfiguration memoryConfig = new RealmConfiguration.Builder()
            .name("memory.cache")
            .inMemory()
            .build();
    public static Realm getMemoryCacheManager() {
        return Realm.getInstance(memoryConfig);
    }

    private static final RealmConfiguration localConfig = new RealmConfiguration.Builder()
            .name("local.cache")
            .schemaVersion(0L)
            .build();

    public static Realm getStorageCacheManager(){
        return Realm.getInstance(localConfig);
    }

    public static <T> void save(String key,T value){
        getStorageCacheManager().beginTransaction();
        //delete if exist
        RealmResults<LocalData> realmResults = getStorageCacheManager().where(LocalData.class).equalTo("key",key).findAllAsync();
        for(LocalData ld:realmResults){ ld.deleteFromRealm(); }
        //save
        getStorageCacheManager().copyFromRealm(new LocalData<T>(key,value));

        getStorageCacheManager().commitTransaction();
    }

    public static <T> T get(String key,T defaultValue){
        Object resultValue = getStorageCacheManager().where(LocalData.class).equalTo("key",key).findFirst().value;
        if(resultValue == null){
            return defaultValue;
        }
        if(defaultValue.getClass().equals(resultValue.getClass())){
            return (T)resultValue;
        }
        if(defaultValue instanceof String){
            return (T) String.valueOf(resultValue);
        }
        try {
            return (T)resultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

}
