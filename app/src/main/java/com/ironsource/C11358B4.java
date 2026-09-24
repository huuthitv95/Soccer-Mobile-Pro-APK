package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.B4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11358B4 extends SQLiteOpenHelper implements InterfaceC11379C7 {

    /* JADX INFO: renamed from: f */
    private static C11358B4 f23890f = null;

    /* JADX INFO: renamed from: g */
    private static final String f23891g = " TEXT";

    /* JADX INFO: renamed from: h */
    private static final String f23892h = " INTEGER";

    /* JADX INFO: renamed from: i */
    private static final String f23893i = ",";

    /* JADX INFO: renamed from: a */
    private final C11376C4 f23894a;

    /* JADX INFO: renamed from: b */
    private final int f23895b;

    /* JADX INFO: renamed from: c */
    private final int f23896c;

    /* JADX INFO: renamed from: d */
    private final String f23897d;

    /* JADX INFO: renamed from: e */
    private final String f23898e;

    /* JADX INFO: renamed from: com.ironsource.B4$a */
    static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a */
        public static final String f23899a = "events";

        /* JADX INFO: renamed from: b */
        public static final int f23900b = 4;

        /* JADX INFO: renamed from: c */
        public static final String f23901c = "eventid";

        /* JADX INFO: renamed from: d */
        public static final String f23902d = "timestamp";

        /* JADX INFO: renamed from: e */
        public static final String f23903e = "type";

        /* JADX INFO: renamed from: f */
        public static final String f23904f = "data";

        a() {
        }
    }

    public C11358B4(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f23894a = new C11376C4();
        this.f23895b = 4;
        this.f23896c = 400;
        this.f23897d = "DROP TABLE IF EXISTS events";
        this.f23898e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C11358B4 m25402a(Context context, String str, int i) {
        if (f23890f == null) {
            f23890f = new C11358B4(context, str, i);
        }
        return f23890f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[Catch: all -> 0x0044, PHI: r1
  0x0032: PHI (r1v3 android.database.sqlite.SQLiteDatabase) = (r1v2 android.database.sqlite.SQLiteDatabase), (r1v4 android.database.sqlite.SQLiteDatabase) binds: [B:17:0x0030, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:18:0x0032, B:16:0x002c, B:23:0x003a, B:25:0x0040, B:26:0x0043, B:14:0x001c), top: B:30:0x0001, inners: #1 }] */
    @Override // com.ironsource.InterfaceC11379C7
    /* JADX INFO: renamed from: b */
    public synchronized void mo25405b(String str) {
        SQLiteDatabase sQLiteDatabaseM25401a;
        String[] strArr = {str};
        try {
            sQLiteDatabaseM25401a = m25401a(true);
            try {
                sQLiteDatabaseM25401a.delete("events", "type = ?", strArr);
                if (sQLiteDatabaseM25401a.isOpen()) {
                    sQLiteDatabaseM25401a.close();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C12317m4.m32153d().m32155a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                    if (sQLiteDatabaseM25401a != null && sQLiteDatabaseM25401a.isOpen()) {
                        sQLiteDatabaseM25401a.close();
                    }
                } catch (Throwable th2) {
                    if (sQLiteDatabaseM25401a != null && sQLiteDatabaseM25401a.isOpen()) {
                        sQLiteDatabaseM25401a.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseM25401a = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    @Override // com.ironsource.InterfaceC11379C7
    /* JADX INFO: renamed from: a */
    public synchronized void mo25404a(List<C12580w5> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseM25401a = m25401a(true);
                    try {
                        Iterator<C12580w5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesM25400a = m25400a(it.next(), str);
                            if (sQLiteDatabaseM25401a != null && contentValuesM25400a != null) {
                                sQLiteDatabaseM25401a.insert("events", null, contentValuesM25400a);
                            }
                        }
                        if (sQLiteDatabaseM25401a != null && sQLiteDatabaseM25401a.isOpen()) {
                            sQLiteDatabaseM25401a.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseM25401a;
                        try {
                            C12317m4.m32153d().m32155a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseM25401a = sQLiteDatabase;
                            }
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[Catch: all -> 0x00b7, PHI: r3
  0x0099: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:39:0x0097, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:22:0x0062, B:24:0x0068, B:25:0x006b, B:40:0x0099, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:46:0x00a2, B:48:0x00a8, B:50:0x00ad, B:52:0x00b3, B:53:0x00b6, B:32:0x0078), top: B:62:0x0001, inners: #3 }] */
    @Override // com.ironsource.InterfaceC11379C7
    /* JADX INFO: renamed from: a */
    public synchronized ArrayList<C12580w5> mo25403a(String str) {
        ArrayList<C12580w5> arrayList;
        Throwable th;
        SQLiteDatabase sQLiteDatabaseM25401a;
        arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            sQLiteDatabaseM25401a = m25401a(false);
            try {
                cursorQuery = sQLiteDatabaseM25401a.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        int columnIndex = cursorQuery.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i = cursorQuery.getInt(columnIndex);
                            int columnIndex2 = cursorQuery.getColumnIndex("timestamp");
                            if (columnIndex2 >= 0) {
                                long j = cursorQuery.getLong(columnIndex2);
                                int columnIndex3 = cursorQuery.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new C12580w5(i, j, cursorQuery.getString(columnIndex3)));
                                    cursorQuery.moveToNext();
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseM25401a.isOpen()) {
                    sQLiteDatabaseM25401a.close();
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    C12317m4.m32153d().m32155a(th);
                    Log.e("IronSource", "Exception while loading events: ", th);
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseM25401a != null && sQLiteDatabaseM25401a.isOpen()) {
                        sQLiteDatabaseM25401a.close();
                    }
                } catch (Throwable th3) {
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseM25401a == null || !sQLiteDatabaseM25401a.isOpen()) {
                        throw th3;
                    }
                    sQLiteDatabaseM25401a.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseM25401a = null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private ContentValues m25400a(C12580w5 c12580w5, String str) {
        if (c12580w5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c12580w5.m34046c()));
        contentValues.put("timestamp", Long.valueOf(c12580w5.m34047d()));
        contentValues.put("type", str);
        contentValues.put("data", c12580w5.m34041a());
        return contentValues;
    }

    /* JADX INFO: renamed from: a */
    private synchronized SQLiteDatabase m25401a(boolean z) throws Throwable {
        int i = 0;
        while (true) {
            try {
                if (z) {
                    return this.f23894a.m25559a(true, this);
                }
                return this.f23894a.m25559a(false, this);
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                i++;
                if (i < 4) {
                    SystemClock.sleep(i * 400);
                } else {
                    throw th;
                }
            }
        }
    }
}
