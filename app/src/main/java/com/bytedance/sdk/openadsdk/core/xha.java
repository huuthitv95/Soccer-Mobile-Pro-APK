package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3182ik;
import com.bytedance.sdk.openadsdk.p175ay.C2887lr;
import com.bytedance.sdk.openadsdk.p236ka.C3397bu;
import com.bytedance.sdk.openadsdk.p236ka.C3416ka;
import com.bytedance.sdk.openadsdk.p236ka.C3428nr;
import com.bytedance.sdk.openadsdk.p236ka.C3439sf;
import com.bytedance.sdk.openadsdk.p236ka.C3471vr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ik */
    private static final Object f11886ik = new Object();

    /* JADX INFO: renamed from: lr */
    private Context f11887lr;

    /* JADX INFO: renamed from: ri */
    private C3361ik f11888ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.xha$ik */
    public class C3361ik {

        /* JADX INFO: renamed from: lr */
        private SQLiteDatabase f11889lr = null;

        public C3361ik() {
        }

        /* JADX INFO: renamed from: ik */
        private synchronized boolean m15131ik() {
            SQLiteDatabase sQLiteDatabase = this.f11889lr;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        /* JADX INFO: renamed from: lr */
        private synchronized void m15132lr() {
            C3363ri c3363ri;
            try {
                synchronized (xha.f11886ik) {
                    SQLiteDatabase sQLiteDatabase = this.f11889lr;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        if (com.bytedance.sdk.component.utils.ihz.m10229ri(xha.this.m15127ik())) {
                            xha xhaVar = xha.this;
                            c3363ri = xhaVar.new C3363ri(xhaVar.m15127ik(), "ttopensdk.db");
                        } else {
                            xha xhaVar2 = xha.this;
                            c3363ri = xhaVar2.new C3363ri(xhaVar2.m15127ik(), "ttopensdk_" + com.bytedance.sdk.component.utils.ihz.m10225ik(xha.this.m15127ik()) + ".db");
                        }
                        SQLiteDatabase writableDatabase = c3363ri.getWritableDatabase();
                        this.f11889lr = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("DBHelper", th.getMessage());
                if (m15131ik()) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ri */
        public synchronized int m15133ri(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                m15132lr();
                iUpdate = this.f11889lr.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                C2707ac.m10196ik("DBHelper", e.getMessage());
                if (m15131ik()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        /* JADX INFO: renamed from: ri */
        public synchronized int m15134ri(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                m15132lr();
                iDelete = this.f11889lr.delete(str, str2, strArr);
            } catch (Exception e) {
                C2707ac.m10196ik("DBHelper", e.getMessage());
                if (m15131ik()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }

        /* JADX INFO: renamed from: ri */
        public synchronized long m15135ri(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                m15132lr();
                jReplace = this.f11889lr.replace(str, str2, contentValues);
            } catch (Exception e) {
                C2707ac.m10196ik("DBHelper", e.getMessage());
                if (m15131ik()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        /* JADX INFO: renamed from: ri */
        public synchronized Cursor m15136ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                m15132lr();
                cursorQuery = this.f11889lr.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                C2707ac.m10196ik("DBHelper", th.getMessage());
                C3362lr c3362lr = new C3362lr();
                if (m15131ik()) {
                    throw th;
                }
                cursorQuery = c3362lr;
            }
            return cursorQuery;
        }

        /* JADX INFO: renamed from: ri */
        public SQLiteDatabase m15137ri() {
            m15132lr();
            return this.f11889lr;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.xha$lr */
    private class C3362lr extends AbstractCursor {
        private C3362lr() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.xha$ri */
    /* JADX INFO: loaded from: classes9.dex */
    private class C3363ri extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ri */
        final Context f11893ri;

        public C3363ri(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.f11893ri = context;
        }

        /* JADX INFO: renamed from: ik */
        private void m15138ik(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListM15139ka = m15139ka(sQLiteDatabase);
            if (arrayListM15139ka == null || arrayListM15139ka.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListM15139ka.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        /* JADX INFO: renamed from: ka */
        private ArrayList<String> m15139ka(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: lr */
        private void m15140lr(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C3182ik.m13290ka());
        }

        /* JADX INFO: renamed from: ri */
        private void m15141ri(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C3416ka.m15580lr());
            sQLiteDatabase.execSQL(C3439sf.m15699ka());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.p236ka.slm.m15700lr());
            sQLiteDatabase.execSQL(C3471vr.m15715lr());
        }

        /* JADX INFO: renamed from: ri */
        private void m15142ri(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(C3416ka.m15581ri());
            sQLiteDatabase.execSQL(C3439sf.m15698ik());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.p236ka.slm.m15701ri());
            sQLiteDatabase.execSQL(C3471vr.m15716ri());
            sQLiteDatabase.execSQL(C2887lr.m11101ri());
            sQLiteDatabase.execSQL(C3428nr.m15616ik());
            sQLiteDatabase.execSQL(C2523lr.m9108ik());
            sQLiteDatabase.execSQL(C3182ik.m13289ik());
            sQLiteDatabase.execSQL(C3397bu.m15405ri());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                m15142ri(sQLiteDatabase, this.f11893ri);
            } catch (Throwable th) {
                C2707ac.m10196ik("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    m15138ik(sQLiteDatabase);
                    m15142ri(sQLiteDatabase, xha.this.f11887lr);
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= i2) {
                m15142ri(sQLiteDatabase, xha.this.f11887lr);
                switch (i) {
                    case 1:
                        m15141ri(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        m15141ri(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.p236ka.slm.m15701ri());
                        m15141ri(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(C2523lr.m9108ik());
                        m15141ri(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(C3471vr.m15716ri());
                        m15141ri(sQLiteDatabase);
                        break;
                    case 6:
                        m15141ri(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    m15138ik(sQLiteDatabase);
                    m15142ri(sQLiteDatabase, xha.this.f11887lr);
                    switch (i) {
                        case 1:
                            m15141ri(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            m15141ri(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.p236ka.slm.m15701ri());
                            m15141ri(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(C2523lr.m9108ik());
                            m15141ri(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(C3471vr.m15716ri());
                            m15141ri(sQLiteDatabase);
                            break;
                        case 6:
                            m15141ri(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i < 11) {
                try {
                    m15140lr(sQLiteDatabase);
                    C2887lr.m11102ri(sQLiteDatabase);
                } catch (Throwable th) {
                    C2707ac.m10196ik("DBHelper", th.getMessage());
                }
            }
        }
    }

    xha(Context context) {
        try {
            this.f11887lr = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
            if (this.f11888ri == null) {
                this.f11888ri = new C3361ik();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public Context m15127ik() {
        Context context = this.f11887lr;
        return context == null ? C3299nr.m14642ri() : context;
    }

    /* JADX INFO: renamed from: ri */
    public C3361ik mo13326ri() {
        return this.f11888ri;
    }
}
