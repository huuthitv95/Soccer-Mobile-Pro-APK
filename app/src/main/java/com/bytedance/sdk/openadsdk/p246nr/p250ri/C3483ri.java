package com.bytedance.sdk.openadsdk.p246nr.p250ri;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.p246nr.C3482ri;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3483ri extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: lr */
    private static volatile C3483ri f12604lr;

    /* JADX INFO: renamed from: ri */
    final Context f12605ri;

    private C3483ri(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f12605ri = context;
    }

    /* JADX INFO: renamed from: ik */
    private static C3483ri m15808ik() {
        if (f12604lr == null) {
            synchronized (C3483ri.class) {
                if (f12604lr == null) {
                    if (ihz.m10229ri(C3482ri.m15801ri())) {
                        f12604lr = new C3483ri(C3482ri.m15801ri(), "pag_monitor.db");
                    } else {
                        f12604lr = new C3483ri(C3482ri.m15801ri(), "pag_monitor_" + ihz.m10225ik(C3482ri.m15801ri()) + ".db");
                    }
                }
            }
        }
        return f12604lr;
    }

    /* JADX INFO: renamed from: lr */
    public static SQLiteDatabase m15809lr() {
        try {
            C3483ri c3483riM15808ik = m15808ik();
            if (c3483riM15808ik == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = c3483riM15808ik.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private ArrayList<String> m15810lr(SQLiteDatabase sQLiteDatabase) {
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
                return arrayList;
            }
        } catch (Exception e) {
            C2707ac.m10196ik("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static SQLiteDatabase m15811ri() {
        try {
            C3483ri c3483riM15808ik = m15808ik();
            if (c3483riM15808ik == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = c3483riM15808ik.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m15812ri(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListM15810lr = m15810lr(sQLiteDatabase);
        if (arrayListM15810lr == null || arrayListM15810lr.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListM15810lr.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                onCreate(sQLiteDatabase);
            } else {
                m15812ri(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
