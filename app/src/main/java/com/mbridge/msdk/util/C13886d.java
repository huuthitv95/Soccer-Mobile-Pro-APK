package com.mbridge.msdk.util;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.mbridge.msdk.util.d */
/* JADX INFO: compiled from: MBridgeDatabaseUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13886d {
    /* JADX INFO: renamed from: a */
    public static boolean m41426a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen() && !sQLiteDatabase.isReadOnly()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
