package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Campaign;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.h */
/* JADX INFO: compiled from: DailyPlayCapDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13018h extends C13011a<Campaign> {

    /* JADX INFO: renamed from: a */
    private static final String f35583a = "com.mbridge.msdk.foundation.db.h";

    /* JADX INFO: renamed from: b */
    private static C13018h f35584b;

    private C13018h(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13018h m36696a(AbstractC13016f abstractC13016f) {
        if (f35584b == null) {
            synchronized (C13018h.class) {
                if (f35584b == null) {
                    f35584b = new C13018h(abstractC13016f);
                }
            }
        }
        return f35584b;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m36697c(String str) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("first_insert_timestamp", (Integer) 0);
            contentValues.put("play_time", (Integer) 0);
            getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
        } catch (Throwable unused) {
            C13219q0.m37818c(f35583a, "resetTimeAndTimestamp error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af A[EXC_TOP_SPLITTER, PHI: r1
  0x00af: PHI (r1v1 android.database.Cursor) = (r1v0 android.database.Cursor), (r1v2 android.database.Cursor) binds: [B:29:0x00ad, B:23:0x00a4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public synchronized void m36700b(String str) {
        long j;
        long j2;
        Cursor cursorRawQuery = null;
        try {
            try {
                if (getWritableDatabase() == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (m36698a(str)) {
                    cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
                    if (cursorRawQuery == null || cursorRawQuery.getCount() <= 0) {
                        j = 0;
                        j2 = 0;
                    } else {
                        cursorRawQuery.moveToFirst();
                        j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("first_insert_timestamp"));
                        j2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("play_time"));
                        if (jCurrentTimeMillis - SignalManager.TWENTY_FOUR_HOURS_MILLIS > j) {
                            m36697c(str);
                            j2 = 0;
                        }
                    }
                    if (j == 0) {
                        contentValues.put("first_insert_timestamp", Long.valueOf(jCurrentTimeMillis));
                    }
                    contentValues.put("play_time", Long.valueOf(j2 + 1));
                    getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
                } else {
                    contentValues.put("first_insert_timestamp", Long.valueOf(jCurrentTimeMillis));
                    contentValues.put("play_time", (Long) 1L);
                    contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    getWritableDatabase().insert("dailyplaycap", null, contentValues);
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable unused2) {
                }
            }
            try {
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m36698a(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m36699a(String str, int i) {
        Cursor cursorRawQuery = null;
        boolean z = false;
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("first_insert_timestamp"));
                long j2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("play_time"));
                if (j != 0) {
                    if (System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS > j) {
                        m36697c(str);
                    } else if (i > 0 && j2 >= i) {
                        z = true;
                    }
                }
            }
            if (cursorRawQuery == null) {
                return z;
            }
        } catch (Throwable th) {
            try {
                C13219q0.m37818c(f35583a, "isOverCap is error" + th);
                return z;
            } finally {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return z;
    }
}
