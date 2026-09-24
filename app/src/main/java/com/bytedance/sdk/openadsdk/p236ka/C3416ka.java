package com.bytedance.sdk.openadsdk.p236ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3416ka {
    /* JADX INFO: renamed from: lr */
    public static String m15580lr() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    /* JADX INFO: renamed from: ri */
    public static String m15581ri() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }
}
