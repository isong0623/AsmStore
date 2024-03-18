package com.haoda.common.core;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class LocalData<T> extends RealmObject {

    public LocalData(String key,T value){
        this.key = key;
        this.value = value;
    }

    @PrimaryKey
    @Required
    String key;

    T value;
}
