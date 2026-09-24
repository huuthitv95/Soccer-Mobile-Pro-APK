package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13162o;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.n */
/* JADX INFO: compiled from: VideoReportDataDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13026n extends C13011a<C13080n> {

    /* JADX INFO: renamed from: a */
    private static final String f35601a = "com.mbridge.msdk.foundation.db.n";

    /* JADX INFO: renamed from: b */
    private static C13026n f35602b;

    private C13026n(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13026n m36744a(AbstractC13016f abstractC13016f) {
        if (f35602b == null) {
            synchronized (C13026n.class) {
                if (f35602b == null) {
                    f35602b = new C13026n(abstractC13016f);
                }
            }
        }
        return f35602b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0024 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0024: PHI (r0v4 int) = (r0v0 int), (r0v6 int) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0022, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public synchronized int m36747d() {
        int i;
        i = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i = cursorRawQuery.getInt(0);
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0330 A[EXC_TOP_SPLITTER, PHI: r10 r21
  0x0330: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v14 android.database.Cursor) binds: [B:102:0x032e, B:96:0x0315] A[DONT_GENERATE, DONT_INLINE]
  0x0330: PHI (r21v3 java.util.List<com.mbridge.msdk.foundation.entity.n>) = 
  (r21v2 java.util.List<com.mbridge.msdk.foundation.entity.n>)
  (r21v6 java.util.List<com.mbridge.msdk.foundation.entity.n>)
 binds: [B:102:0x032e, B:96:0x0315] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0338 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c0  */
    /* JADX INFO: renamed from: a */
    public synchronized List<C13080n> m36746a(String str) {
        Cursor cursor;
        List<C13080n> list;
        Cursor cursorQuery;
        Cursor cursor2;
        C13080n c13080n;
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor3;
        C13080n c13080n2;
        if (TextUtils.isEmpty(str)) {
            list = null;
        } else {
            try {
                cursorQuery = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.getCount() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("key"));
                                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("networkType"));
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("network_str"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("isCompleteView"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("watchedMillis"));
                                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("videoLength"));
                                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("offerUrl"));
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("reason"));
                                    int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("result"));
                                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndex("duration"));
                                    int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex("videoSize"));
                                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndex("campaignId"));
                                    String string7 = cursorQuery.getString(cursorQuery.getColumnIndex("video_url"));
                                    String string8 = cursorQuery.getString(cursorQuery.getColumnIndex("unitId"));
                                    String string9 = cursorQuery.getString(cursorQuery.getColumnIndex("rid"));
                                    String string10 = cursorQuery.getString(cursorQuery.getColumnIndex("rid_n"));
                                    String string11 = cursorQuery.getString(cursorQuery.getColumnIndex("ad_type"));
                                    String string12 = cursorQuery.getString(cursorQuery.getColumnIndex("resource_type"));
                                    String string13 = cursorQuery.getString(cursorQuery.getColumnIndex("device_id"));
                                    list = null;
                                    try {
                                        String string14 = cursorQuery.getString(cursorQuery.getColumnIndex("creative"));
                                        int i5 = cursorQuery.getInt(cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                        if (str.equals("2000021")) {
                                            try {
                                                try {
                                                    c13080n = new C13080n(string, i, string3, string4, string2);
                                                    c13080n.m36962b(string6);
                                                    c13080n.m37006v(string7);
                                                    c13080n.m36990n(string9);
                                                    c13080n.m36992o(string10);
                                                    c13080n.m37004u(string8);
                                                    cursor2 = cursorQuery;
                                                    arrayList = arrayList3;
                                                    if (c13080n != null) {
                                                        try {
                                                            arrayList2 = arrayList;
                                                            arrayList2.add(c13080n);
                                                        } catch (Exception e) {
                                                            e = e;
                                                            cursorQuery = cursor2;
                                                            e.printStackTrace();
                                                            C13219q0.m37816b(f35601a, e.getMessage());
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    cursorQuery.close();
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                            return list;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            cursor = cursor2;
                                                            if (cursor != null) {
                                                                try {
                                                                    cursor.close();
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                    int i6 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i6 + ""});
                                                    arrayList3 = arrayList2;
                                                    cursorQuery = cursor2;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    e.printStackTrace();
                                                    C13219q0.m37816b(f35601a, e.getMessage());
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    return list;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            if (str.equals("2000022")) {
                                                c13080n2 = new C13080n(string, i, i2, string3, i3, string5, i4, string2);
                                                c13080n2.m36962b(string6);
                                                c13080n2.m37006v(string7);
                                                c13080n2.m36990n(string9);
                                                c13080n2.m37004u(string8);
                                                c13080n2.m36988m(string4);
                                                c13080n2.m36992o(string10);
                                                c13080n2.m36959a(string11);
                                            } else {
                                                if (str.equals("2000025")) {
                                                    c13080n2 = new C13080n(string, i, i2, string3, i3, string5, i4, string2);
                                                } else {
                                                    if (str.equals("2000024")) {
                                                        c13080n = new C13080n(string, i, string3, string4, string2);
                                                    } else if ("2000039".equals(str)) {
                                                        c13080n = new C13080n(cursorQuery.getString(cursorQuery.getColumnIndex("h5_click_data")));
                                                    } else {
                                                        if ("2000043".equals(str)) {
                                                            try {
                                                                arrayList = arrayList3;
                                                                cursor3 = cursorQuery;
                                                                try {
                                                                    C13080n c13080n3 = new C13080n(str, i3, string5, cursorQuery.getString(cursorQuery.getColumnIndex(CampaignEx.ENDCARD_URL)), string6, string8, string4, cursorQuery.getString(cursorQuery.getColumnIndex("type")));
                                                                    c13080n3.m36990n(string9);
                                                                    c13080n3.m36992o(string10);
                                                                    if (!TextUtils.isEmpty(string6)) {
                                                                        c13080n3.m36962b(string6);
                                                                    }
                                                                    c13080n3.m36958a(i5);
                                                                    c13080n3.m36959a(string11);
                                                                    c13080n3.m36994p(string12);
                                                                    c13080n3.m36969d(string13);
                                                                    c13080n3.m36966c(string14);
                                                                    c13080n = c13080n3;
                                                                    cursor2 = cursor3;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    cursorQuery = cursor3;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    cursor = cursor3;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cursor3 = cursorQuery;
                                                            }
                                                        } else {
                                                            arrayList = arrayList3;
                                                            Cursor cursor4 = cursorQuery;
                                                            try {
                                                                if ("2000045".equals(str)) {
                                                                    C13080n c13080n4 = new C13080n();
                                                                    c13080n4.m36982j(str);
                                                                    c13080n4.m36965c(i);
                                                                    c13080n4.m36968d(i3);
                                                                    c13080n4.m36962b(string6);
                                                                    cursor2 = cursor4;
                                                                    c13080n4.m37002t(cursor2.getString(cursor2.getColumnIndex("template_url")));
                                                                    c13080n4.m36988m(string4);
                                                                    c13080n4.m36990n(string9);
                                                                    c13080n4.m36992o(string10);
                                                                    c13080n4.m37004u(string8);
                                                                    c13080n = c13080n4;
                                                                } else {
                                                                    cursor2 = cursor4;
                                                                    if ("2000044".equals(str)) {
                                                                        c13080n = new C13080n();
                                                                        c13080n.m36982j(str);
                                                                        c13080n.m36965c(i);
                                                                        c13080n.m36962b(string6);
                                                                        c13080n.m36980i(cursor2.getString(cursor2.getColumnIndex("image_url")));
                                                                        c13080n.m36988m(string4);
                                                                        c13080n.m36990n(string9);
                                                                        c13080n.m36992o(string10);
                                                                        c13080n.m37004u(string8);
                                                                    } else if ("2000054".equals(str)) {
                                                                        C13080n c13080n5 = new C13080n();
                                                                        c13080n5.m36982j(str);
                                                                        c13080n5.m36994p(string12);
                                                                        c13080n5.m37004u(string8);
                                                                        c13080n5.m36969d(string13);
                                                                        c13080n5.m36959a(string11);
                                                                        c13080n5.m36962b(string6);
                                                                        c13080n5.m36990n(string9);
                                                                        c13080n5.m36992o(string10);
                                                                        c13080n5.m36968d(i3);
                                                                        c13080n5.m36988m(string4);
                                                                        c13080n5.m36965c(i);
                                                                        c13080n5.m36966c(string14);
                                                                        c13080n5.m36958a(i5);
                                                                        c13080n = c13080n5;
                                                                    } else {
                                                                        c13080n = null;
                                                                    }
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                cursor2 = cursor4;
                                                                cursorQuery = cursor2;
                                                                e.printStackTrace();
                                                                C13219q0.m37816b(f35601a, e.getMessage());
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                return list;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                cursor2 = cursor4;
                                                                cursor = cursor2;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (c13080n != null) {
                                                            arrayList2 = arrayList;
                                                            arrayList2.add(c13080n);
                                                        } else {
                                                            arrayList2 = arrayList;
                                                        }
                                                        int i7 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                        getWritableDatabase().delete("reward_report", "id = ?", new String[]{i7 + ""});
                                                        arrayList3 = arrayList2;
                                                        cursorQuery = cursor2;
                                                    }
                                                    cursor2 = cursorQuery;
                                                    arrayList = arrayList3;
                                                    if (c13080n != null) {
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(c13080n);
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                    int i8 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i8 + ""});
                                                    arrayList3 = arrayList2;
                                                    cursorQuery = cursor2;
                                                }
                                                e.printStackTrace();
                                                C13219q0.m37816b(f35601a, e.getMessage());
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            }
                                            cursor2 = cursorQuery;
                                            arrayList = arrayList3;
                                            c13080n = c13080n2;
                                            if (c13080n != null) {
                                                arrayList2 = arrayList;
                                                arrayList2.add(c13080n);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            int i9 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                            getWritableDatabase().delete("reward_report", "id = ?", new String[]{i9 + ""});
                                            arrayList3 = arrayList2;
                                            cursorQuery = cursor2;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                }
                                ArrayList arrayList4 = arrayList3;
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused3) {
                                }
                                return arrayList4;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            list = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cursor2 = cursorQuery;
                    }
                }
                list = null;
                if (cursorQuery != null) {
                    cursorQuery = cursorQuery;
                    cursorQuery.close();
                }
            } catch (Exception e8) {
                e = e8;
                list = null;
                cursorQuery = null;
            } catch (Throwable th7) {
                th = th7;
                cursor = null;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m36745a(C13080n c13080n) {
        if (c13080n != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", c13080n.m36989n());
                contentValues.put("networkType", Integer.valueOf(c13080n.m36995q()));
                contentValues.put("network_str", c13080n.m36997r());
                contentValues.put("isCompleteView", Integer.valueOf(c13080n.m36987m()));
                contentValues.put("watchedMillis", Integer.valueOf(c13080n.m36955F()));
                contentValues.put("videoLength", Integer.valueOf(c13080n.m36952C()));
                if (!TextUtils.isEmpty(c13080n.m36999s())) {
                    contentValues.put("offerUrl", c13080n.m36999s());
                }
                if (!TextUtils.isEmpty(c13080n.m37001t())) {
                    contentValues.put("reason", URLEncoder.encode(c13080n.m37001t(), C11341A5.f23802O));
                }
                contentValues.put("result", Integer.valueOf(c13080n.m37008x()));
                contentValues.put("duration", c13080n.m36975g());
                contentValues.put("videoSize", Long.valueOf(c13080n.m36953D()));
                contentValues.put("type", c13080n.m36977h());
                String strM36979i = c13080n.m36979i();
                if (!TextUtils.isEmpty(strM36979i)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, strM36979i);
                }
                String strM36954E = c13080n.m36954E();
                if (!TextUtils.isEmpty(strM36954E)) {
                    contentValues.put("video_url", strM36954E);
                }
                String strM37003u = c13080n.m37003u();
                if (!TextUtils.isEmpty(strM37003u)) {
                    contentValues.put("rid", strM37003u);
                }
                String strM37005v = c13080n.m37005v();
                if (!TextUtils.isEmpty(strM37005v)) {
                    contentValues.put("rid_n", strM37005v);
                }
                String strM37010z = c13080n.m37010z();
                if (!TextUtils.isEmpty(strM37010z)) {
                    contentValues.put("template_url", strM37010z);
                }
                String strM36985l = c13080n.m36985l();
                if (!TextUtils.isEmpty(strM36985l)) {
                    contentValues.put("image_url", strM36985l);
                }
                String strM36956a = c13080n.m36956a();
                if (!TextUtils.isEmpty(strM36956a)) {
                    contentValues.put("ad_type", URLEncoder.encode(strM36956a, C11341A5.f23802O));
                }
                contentValues.put("unitId", c13080n.m36951B());
                contentValues.put("campaignId", c13080n.m36967d());
                if ("2000039".equals(c13080n.m36989n())) {
                    String strM37519b = C13162o.m37519b(c13080n);
                    if (C13182a1.m37597b(strM37519b)) {
                        contentValues.put("h5_click_data", strM37519b);
                    }
                }
                String strM37007w = c13080n.m37007w();
                if (!TextUtils.isEmpty(strM37007w)) {
                    contentValues.put("resource_type", URLEncoder.encode(strM37007w, C11341A5.f23802O));
                }
                String strM36973f = c13080n.m36973f();
                if (!TextUtils.isEmpty(strM36973f)) {
                    contentValues.put("device_id", URLEncoder.encode(strM36973f, C11341A5.f23802O));
                }
                String strM36970e = c13080n.m36970e();
                if (!TextUtils.isEmpty(strM36970e)) {
                    contentValues.put("creative", URLEncoder.encode(strM36970e, C11341A5.f23802O));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(c13080n.m36960b()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e) {
                C13219q0.m37816b(f35601a, e.getMessage());
                return -1L;
            }
        }
        return -1L;
    }
}
