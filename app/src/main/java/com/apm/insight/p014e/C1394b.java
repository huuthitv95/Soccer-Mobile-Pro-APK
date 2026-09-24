package com.apm.insight.p014e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apm.insight.p014e.p015a.C1393b;

/* JADX INFO: renamed from: com.apm.insight.e.b */
/* JADX INFO: compiled from: NpthDbHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1394b extends SQLiteOpenHelper {
    public C1394b(Context context) {
        super(context, "npth_log.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        new C1393b().m1057a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
