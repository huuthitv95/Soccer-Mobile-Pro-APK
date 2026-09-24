package com.bytedance.sdk.openadsdk.p236ka;

/* JADX INFO: loaded from: classes3.dex */
public class slm {
    /* JADX INFO: renamed from: lr */
    public static String m15700lr() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    /* JADX INFO: renamed from: ri */
    public static String m15701ri() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
