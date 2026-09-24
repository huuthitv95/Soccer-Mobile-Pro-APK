package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.C13072f;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.i */
/* JADX INFO: compiled from: FqInfoDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13019i extends C13011a<C13072f> {

    /* JADX INFO: renamed from: a */
    private static C13019i f35585a;

    private C13019i(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13019i m36701a(AbstractC13016f abstractC13016f) {
        if (f35585a == null) {
            f35585a = new C13019i(abstractC13016f);
        }
        return f35585a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36704a(String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", "time< ? and unitId=?", strArr);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36703a(C13072f c13072f) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            if (c13072f != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", c13072f.m36848a());
                contentValues.put("time", Long.valueOf(c13072f.m36852b()));
                contentValues.put("unitId", c13072f.m36855d());
                contentValues.put("type", Integer.valueOf(c13072f.m36854c()));
                if (m36702a(c13072f.m36855d(), c13072f.m36848a())) {
                    getWritableDatabase().update("fq_info", contentValues, "id = ? AND unitId = ? ", new String[]{c13072f.m36848a(), c13072f.m36855d()});
                } else {
                    getWritableDatabase().insert("fq_info", null, contentValues);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized boolean m36702a(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId= ?  and id= ? ", new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
