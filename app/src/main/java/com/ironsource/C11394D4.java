package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.D4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11394D4 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static C11376C4 f24201a = new C11376C4();

    public C11394D4(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m25601a(C11503J5 c11503j5) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM25559a = f24201a.m25559a(true, new C11394D4(C12317m4.m32153d().m32154a()));
            try {
                sQLiteDatabaseM25559a.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String strM26180e = c11503j5.m26180e();
                String strM26177b = c11503j5.m26177b();
                String strM26179d = c11503j5.m26179d();
                contentValues.put("stack_trace", strM26180e);
                contentValues.put("crash_date", strM26177b);
                contentValues.put("crashType", strM26179d);
                sQLiteDatabaseM25559a.insert("REPORTS", null, contentValues);
                sQLiteDatabaseM25559a.setTransactionSuccessful();
                sQLiteDatabaseM25559a.endTransaction();
                sQLiteDatabaseM25559a.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM25559a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11503J5 m25602b(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM25558a = f24201a.m25558a(new C11394D4(C12317m4.m32153d().m32154a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM25558a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                C11503J5 c11503j5 = new C11503J5(i2, string, string2, string3);
                sQLiteDatabaseM25558a.close();
                return c11503j5;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM25558a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Cursor m25604c() throws Throwable {
        C11394D4 c11394d4 = new C11394D4(C12317m4.m32153d().m32154a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM25558a = f24201a.m25558a(c11394d4);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM25558a.rawQuery("SELECT * FROM REPORTS;", null);
                sQLiteDatabaseM25558a.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM25558a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public static Cursor m25599a(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM25558a = f24201a.m25558a(new C11394D4(C12317m4.m32153d().m32154a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM25558a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                sQLiteDatabaseM25558a.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM25558a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<C11503J5> m25603b() {
        C11394D4 c11394d4 = new C11394D4(C12317m4.m32153d().m32154a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM25558a = f24201a.m25558a(c11394d4);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM25558a.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new C11503J5(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseM25558a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM25558a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25600a() {
        SQLiteDatabase sQLiteDatabaseM25559a = null;
        try {
            sQLiteDatabaseM25559a = f24201a.m25559a(true, new C11394D4(C12317m4.m32153d().m32154a()));
            sQLiteDatabaseM25559a.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseM25559a.close();
        } catch (Throwable th) {
            if (sQLiteDatabaseM25559a != null) {
                sQLiteDatabaseM25559a.close();
            }
            throw th;
        }
    }
}
