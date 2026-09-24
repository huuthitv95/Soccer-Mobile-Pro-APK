package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MetaData {

    /* JADX INFO: renamed from: a */
    private String f31311a;

    /* JADX INFO: renamed from: b */
    private List<String> f31312b;

    /* JADX INFO: renamed from: c */
    private List<MetaDataValueTypes> f31313c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f31311a = str;
        this.f31312b = list;
        this.f31313c = list2;
    }

    public String getMetaDataKey() {
        return this.f31311a;
    }

    public List<String> getMetaDataValue() {
        return this.f31312b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f31313c;
    }

    public MetaData(String str, List<String> list) {
        this.f31311a = str;
        this.f31312b = list;
        this.f31313c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f31313c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
