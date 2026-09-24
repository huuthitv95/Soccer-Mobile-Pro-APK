package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.p130di.p131ri.p132di.C2534di;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2582di;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2585ka;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2587ri;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2579ka extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: ri */
    final Context f7214ri;

    public C2579ka(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f7214ri = context;
    }

    /* JADX INFO: renamed from: ik */
    private ArrayList<String> m9472ik(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    private void m9473lr(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListM9472ik = m9472ik(sQLiteDatabase);
        if (arrayListM9472ik == null || arrayListM9472ik.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListM9472ik.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9474ri(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C2587ri.m9502lr(xha.m9524di().m9530ik().mo9457lr()));
        sQLiteDatabase.execSQL(C2585ka.m9499ik(xha.m9524di().m9530ik().mo9459ri()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.xha.m9513ik(xha.m9524di().m9530ik().mo9456ka()));
        sQLiteDatabase.execSQL(C2582di.m9485ri(xha.m9524di().m9530ik().mo9454fi()));
        sQLiteDatabase.execSQL(C2534di.m9177lr());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            m9474ri(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                m9474ri(sQLiteDatabase);
            } else {
                m9473lr(sQLiteDatabase);
                m9474ri(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
