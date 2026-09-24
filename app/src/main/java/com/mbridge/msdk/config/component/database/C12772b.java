package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.database.b */
/* JADX INFO: compiled from: ComponentSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes5.dex */
class C12772b extends SQLiteOpenHelper {
    public C12772b(Context context) {
        super(context, "component_data.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX INFO: renamed from: a */
    private void m35218a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListM35221a = C12773c.m35221a("CREATE_");
        if (arrayListM35221a == null || arrayListM35221a.isEmpty()) {
            return;
        }
        Iterator<String> it = arrayListM35221a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35219b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListM35221a = C12773c.m35221a("DROP_");
        if (arrayListM35221a == null || arrayListM35221a.isEmpty()) {
            return;
        }
        Iterator<String> it = arrayListM35221a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m35220c(SQLiteDatabase sQLiteDatabase) {
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly()) ? false : true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (m35220c(sQLiteDatabase)) {
            m35218a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onDowngrade(sQLiteDatabase, i, i2);
        if (m35220c(sQLiteDatabase)) {
            m35219b(sQLiteDatabase);
            m35218a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (m35220c(sQLiteDatabase)) {
            m35219b(sQLiteDatabase);
            m35218a(sQLiteDatabase);
        }
    }
}
