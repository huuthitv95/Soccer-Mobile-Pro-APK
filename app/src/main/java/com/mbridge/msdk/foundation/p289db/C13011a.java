package com.mbridge.msdk.foundation.p289db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.a */
/* JADX INFO: compiled from: BaseDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13011a<T> {
    protected AbstractC13016f mHelper;

    public C13011a(AbstractC13016f abstractC13016f) {
        this.mHelper = abstractC13016f;
    }

    protected synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            C13219q0.m37813a("BaseDao", "getReadableDatabase error");
            return null;
        }
        return this.mHelper.m36691c();
    }

    protected synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            C13219q0.m37813a("BaseDao", "getWritableDatabase error");
            return null;
        }
        return this.mHelper.m36692d();
    }
}
