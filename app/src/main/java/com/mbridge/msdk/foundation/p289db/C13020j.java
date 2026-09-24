package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.p289db.middle.C13024a;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.j */
/* JADX INFO: compiled from: FrequenceDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13020j extends C13011a<C13073g> {

    /* JADX INFO: renamed from: a */
    private static C13020j f35586a;

    private C13020j(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13020j m36706a(AbstractC13016f abstractC13016f) {
        if (f35586a == null) {
            synchronized (C13020j.class) {
                if (f35586a == null) {
                    f35586a = new C13020j(abstractC13016f);
                }
            }
        }
        return f35586a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m36709b(String str) {
        C13024a.m36730b().m36735a(str);
        if (m36707a(str) && getReadableDatabase() != null) {
            getReadableDatabase().execSQL("UPDATE frequence Set impression_count=impression_count+1 WHERE id= ?", new Object[]{str});
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m36710d() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS;
            C13024a.m36730b().m36733a(jCurrentTimeMillis);
            String[] strArr = {String.valueOf(jCurrentTimeMillis)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", "ts< ? ", strArr);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m36708b(C13073g c13073g) {
        if (!m36707a(c13073g.m36856a())) {
            m36705a(c13073g);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m36707a(String str) {
        Cursor cursor = null;
        try {
            try {
                synchronized (str) {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id= ?", new String[]{str});
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        cursorRawQuery.close();
                        return true;
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception unused) {
            if (0 != 0) {
                cursor.close();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized long m36705a(C13073g c13073g) {
        try {
            C13024a.m36730b().m36734a(c13073g);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", c13073g.m36856a());
            contentValues.put("fc_a", Integer.valueOf(c13073g.m36862c()));
            contentValues.put("fc_b", Integer.valueOf(c13073g.m36864d()));
            contentValues.put("ts", Long.valueOf(c13073g.m36867f()));
            contentValues.put("impression_count", Integer.valueOf(c13073g.m36866e()));
            contentValues.put("click_count", Integer.valueOf(c13073g.m36860b()));
            contentValues.put("ts", Long.valueOf(c13073g.m36867f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
