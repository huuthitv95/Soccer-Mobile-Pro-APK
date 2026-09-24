package com.bytedance.sdk.openadsdk.p236ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3471vr {
    /* JADX INFO: renamed from: lr */
    public static String m15715lr() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }

    /* JADX INFO: renamed from: ri */
    public static String m15716ri() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
