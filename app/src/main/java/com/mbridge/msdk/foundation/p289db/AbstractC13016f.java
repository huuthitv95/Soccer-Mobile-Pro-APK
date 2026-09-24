package com.mbridge.msdk.foundation.p289db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.f */
/* JADX INFO: compiled from: CommonAbsDBHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13016f {

    /* JADX INFO: renamed from: a */
    private a f35580a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.f$a */
    /* JADX INFO: compiled from: CommonAbsDBHelper.java */
    private class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("DatabaseOpenHelper", "数据库创建了");
            }
            AbstractC13016f.this.mo36687a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC13016f.this.mo36688a(sQLiteDatabase, i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("DatabaseOpenHelper", "数据库升级了");
            }
            AbstractC13016f.this.mo36690b(sQLiteDatabase, i, i2);
        }
    }

    public AbstractC13016f(Context context) {
        this.f35580a = new a(context, mo36686a(), mo36689b());
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo36686a();

    /* JADX INFO: renamed from: a */
    protected abstract void mo36687a(SQLiteDatabase sQLiteDatabase);

    /* JADX INFO: renamed from: a */
    protected abstract void mo36688a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: b */
    protected abstract int mo36689b();

    /* JADX INFO: renamed from: b */
    protected abstract void mo36690b(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: c */
    public SQLiteDatabase m36691c() {
        return this.f35580a.getReadableDatabase();
    }

    /* JADX INFO: renamed from: d */
    public synchronized SQLiteDatabase m36692d() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f35580a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }
}
