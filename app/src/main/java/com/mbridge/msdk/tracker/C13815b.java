package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.b */
/* JADX INFO: compiled from: Database.java */
/* JADX INFO: loaded from: classes7.dex */
class C13815b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private final String f39371a;

    public C13815b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.f39371a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (C13882y.m41417b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(C13822i.f39390i, this.f39371a));
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "create table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C13882y.m41417b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(C13822i.f39391j, this.f39371a));
            sQLiteDatabase.execSQL(String.format(C13822i.f39390i, this.f39371a));
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "downgrade table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C13882y.m41417b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(C13822i.f39391j, this.f39371a));
            sQLiteDatabase.execSQL(String.format(C13822i.f39390i, this.f39371a));
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "upgrade table error", e);
            }
        }
    }
}
