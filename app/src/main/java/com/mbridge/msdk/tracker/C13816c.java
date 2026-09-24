package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.c */
/* JADX INFO: compiled from: DatabaseManager.java */
/* JADX INFO: loaded from: classes7.dex */
class C13816c {

    /* JADX INFO: renamed from: a */
    private final C13815b f39372a;

    /* JADX INFO: renamed from: b */
    private final String f39373b;

    /* JADX INFO: renamed from: c */
    private final Object f39374c = new Object();

    public C13816c(C13815b c13815b, String str) {
        this.f39372a = c13815b;
        this.f39373b = str;
    }

    /* JADX INFO: renamed from: a */
    private static void m40990a(SQLiteDatabase sQLiteDatabase) {
        if (C13882y.m41417b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "beginTransaction: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m40991b(SQLiteDatabase sQLiteDatabase) {
        if (C13882y.m41417b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "endTransaction: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m40992c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    /* JADX INFO: renamed from: d */
    private static void m40993d(SQLiteDatabase sQLiteDatabase) {
        if (C13882y.m41417b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "transactionSuccess: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m40994a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            int iDelete = -1;
            if (C13882y.m41417b(this.f39372a)) {
                return -1;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return -1;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    iDelete = writableDatabase.delete(this.f39373b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                }
                return iDelete;
            } catch (Throwable th) {
                m40991b(writableDatabase);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m40995a(C13822i c13822i) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            long jInsert = -1;
            if (C13882y.m41417b(this.f39372a)) {
                return -1L;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (m40992c(writableDatabase)) {
                    return -1L;
                }
                m40990a(writableDatabase);
                ContentValues contentValues = new ContentValues(16);
                C13818e c13818eM41031d = c13822i.m41031d();
                contentValues.put("name", c13818eM41031d.m41012g());
                contentValues.put("type", Integer.valueOf(c13818eM41031d.m41018m()));
                contentValues.put("time_stamp", Long.valueOf(c13818eM41031d.m41017l()));
                contentValues.put("properties", c13818eM41031d.m41014i().toString());
                contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(c13818eM41031d.m41013h()));
                contentValues.put("state", Integer.valueOf(c13822i.m41035j()));
                contentValues.put("report_count", Integer.valueOf(c13822i.m41033h()));
                contentValues.put("uuid", c13818eM41031d.m41019n());
                contentValues.put("ignore_max_timeout", Integer.valueOf(!c13818eM41031d.m41021p() ? 1 : 0));
                contentValues.put("ignore_max_retry_times", Integer.valueOf(!c13818eM41031d.m41020o() ? 1 : 0));
                contentValues.put("invalid_time", Long.valueOf(c13822i.m41032g()));
                jInsert = writableDatabase.insert(this.f39373b, null, contentValues);
                m40993d(writableDatabase);
                return jInsert;
            } catch (Exception e2) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "insert: " + e2.getMessage());
                }
            } finally {
                m40991b(writableDatabase);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C13822i> m40996a(int i) {
        SQLiteDatabase writableDatabase;
        List<C13822i> list;
        synchronized (this.f39374c) {
            Cursor cursor = null;
            List<C13822i> listM41416b = null;
            cursor = null;
            if (C13882y.m41417b(this.f39372a)) {
                return null;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return null;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    Cursor cursorQuery = writableDatabase.query(this.f39373b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i));
                    try {
                        listM41416b = C13882y.m41416b(cursorQuery);
                        m40993d(writableDatabase);
                        m40991b(writableDatabase);
                        C13882y.m41412a(cursorQuery);
                    } catch (Exception e2) {
                        e = e2;
                        List<C13822i> list2 = listM41416b;
                        cursor = cursorQuery;
                        list = list2;
                        if (C13814a.f39370a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        m40991b(writableDatabase);
                        C13882y.m41412a(cursor);
                        listM41416b = list;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        m40991b(writableDatabase);
                        C13882y.m41412a(cursor);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    list = null;
                }
                return listM41416b;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40997a(List<C13822i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            if (C13882y.m41417b(this.f39372a) || C13882y.m41418b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    for (C13822i c13822i : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(c13822i.m41035j()));
                        contentValues.put("report_count", Integer.valueOf(c13822i.m41033h()));
                        String strM41034i = c13822i.m41034i();
                        if (!TextUtils.isEmpty(strM41034i)) {
                            contentValues.put("report_error_message", strM41034i);
                        }
                        writableDatabase.update(this.f39373b, contentValues, "uuid = ?", new String[]{c13822i.m41036k()});
                    }
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                }
            } catch (Throwable th) {
                m40991b(writableDatabase);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m40998b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            int iMax = 0;
            if (C13882y.m41417b(this.f39372a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (m40992c(writableDatabase)) {
                    return 0;
                }
                try {
                    m40990a(writableDatabase);
                    cursorQuery = writableDatabase.query(this.f39373b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToNext()) {
                        iMax = Math.max(cursorQuery.getCount(), 0);
                    }
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                    C13882y.m41412a(cursorQuery);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "getAvailableCount: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                    C13882y.m41412a(cursorQuery);
                }
                return iMax;
            } catch (Throwable th) {
                m40991b(writableDatabase);
                C13882y.m41412a((Cursor) null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40999b(List<C13822i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            if (C13882y.m41417b(this.f39372a) || C13882y.m41418b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    for (C13822i c13822i : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        writableDatabase.update(this.f39373b, contentValues, "uuid = ?", new String[]{c13822i.m41036k()});
                    }
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                }
            } catch (Throwable th) {
                m40991b(writableDatabase);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41000c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            if (C13882y.m41417b(this.f39372a)) {
                return;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    contentValues.put("report_error_message", "update from reporting");
                    writableDatabase.update(this.f39373b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                }
            } catch (Throwable th) {
                m40991b(writableDatabase);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41001c(List<C13822i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f39374c) {
            if (C13882y.m41417b(this.f39372a) || C13882y.m41418b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f39372a.getWritableDatabase();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (m40992c(writableDatabase)) {
                return;
            }
            try {
                try {
                    m40990a(writableDatabase);
                    for (C13822i c13822i : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        writableDatabase.update(this.f39373b, contentValues, "uuid = ?", new String[]{c13822i.m41036k()});
                    }
                    m40993d(writableDatabase);
                    m40991b(writableDatabase);
                } catch (Exception e2) {
                    if (C13814a.f39370a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e2.getMessage());
                    }
                    m40991b(writableDatabase);
                }
            } catch (Throwable th) {
                m40991b(writableDatabase);
                throw th;
            }
        }
    }
}
