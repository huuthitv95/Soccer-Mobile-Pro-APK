package com.bytedance.sdk.openadsdk.p175ay;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2887lr {
    /* JADX INFO: renamed from: ri */
    public static String m11101ri() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )";
    }

    /* JADX INFO: renamed from: ri */
    public static void m11102ri(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}
