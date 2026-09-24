package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.cache.C13000b;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.c */
/* JADX INFO: compiled from: CacheCampaignDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13013c extends C13011a {

    /* JADX INFO: renamed from: a */
    private static volatile C13013c f35556a;

    private C13013c(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13013c m36628a(AbstractC13016f abstractC13016f) {
        if (f35556a == null) {
            synchronized (C13013c.class) {
                if (f35556a == null) {
                    f35556a = new C13013c(abstractC13016f);
                }
            }
        }
        return f35556a;
    }

    /* JADX INFO: renamed from: b */
    public void m36636b(String str, String str2, String str3) {
        if (m36635a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m36629a(String str, String str2, String str3, int i) {
        if (!m36635a(str, str3)) {
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", Integer.valueOf(i));
        return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND unitid = ? AND state = 0", new String[]{str, str3});
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m36635a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid= ? AND unitid = ? ", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36633a(String str, int i) {
        if (i <= 0) {
            i = 1;
        }
        try {
            String str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i)});
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            C13219q0.m37816b("CacheCampaignDao", e2.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36634a(String str, String str2, String str3) {
        try {
            if (m36635a(str2, str)) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.delete("CacheCampaign", "unitid = ? AND rid = ? ", new String[]{str, str2});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            C13219q0.m37816b("CampaignDao", e2.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public long m36630a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                        if (c13635gM39718d == null) {
                            c13635gM39718d = C13636h.m39706b().m39708a();
                        }
                        candidateCacheTime = c13635gM39718d.m39486c0();
                    }
                }
                try {
                    if (C13223s0.m37831a().m37842a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (m36635a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public List<C13000b> m36632a(String str, long j) {
        return m36631a(str, 0, j);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r5
  0x00f7: PHI (r5v4 android.database.Cursor) = (r5v3 android.database.Cursor), (r5v5 android.database.Cursor) binds: [B:32:0x00f5, B:27:0x00ed] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public List<C13000b> m36631a(String str, int i, long j) {
        Cursor cursorRawQuery;
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM CacheCampaign WHERE unitid = ? AND state > ? and (show_time is null or show_time < ? )", new String[]{str, String.valueOf(i), String.valueOf(j)});
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            C13000b c13000b = new C13000b();
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("campaigns"));
                            JSONArray jSONArray = new JSONArray(string);
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    cursorRawQuery.close();
                                } catch (Exception unused) {
                                }
                                return null;
                            }
                            if (jSONArray.length() > 0) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    copyOnWriteArrayList.add(CampaignEx.parseCampaignWithBackData((JSONObject) jSONArray.get(i2)));
                                }
                                c13000b.m36495a(copyOnWriteArrayList);
                            }
                            c13000b.m36499b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("lrid")));
                            c13000b.m36502c(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("rid")));
                            c13000b.m36504d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitid")));
                            c13000b.m36494a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ecppv")));
                            c13000b.m36501c(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("ts")));
                            c13000b.m36497b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("state")));
                            c13000b.m36492a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("show_count")));
                            c13000b.m36498b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("show_time")));
                            c13000b.m36493a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("interval_ts")));
                            arrayList.add(c13000b);
                        }
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                    } finally {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            if (cursorRawQuery != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            cursorRawQuery = null;
        }
        return null;
    }
}
