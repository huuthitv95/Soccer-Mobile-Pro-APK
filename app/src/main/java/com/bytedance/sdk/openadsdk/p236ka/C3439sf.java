package com.bytedance.sdk.openadsdk.p236ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3439sf extends C3416ka {
    /* JADX INFO: renamed from: ik */
    public static String m15698ik() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    /* JADX INFO: renamed from: ka */
    public static String m15699ka() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
