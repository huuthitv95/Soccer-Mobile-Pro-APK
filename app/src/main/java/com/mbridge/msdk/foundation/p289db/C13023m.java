package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.C13079m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Campaign;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.m */
/* JADX INFO: compiled from: VideoDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13023m extends C13011a<Campaign> {

    /* JADX INFO: renamed from: a */
    private static C13023m f35590a;

    private C13023m(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13023m m36721a(AbstractC13016f abstractC13016f) {
        if (f35590a == null) {
            f35590a = new C13023m(abstractC13016f);
        }
        return f35590a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:10:0x001a, B:12:0x0020, B:13:0x0025, B:15:0x002b, B:35:0x00a0, B:37:0x00a4), top: B:65:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public synchronized C13079m m36727b(String str) {
        Exception e;
        Cursor cursorRawQuery;
        Exception e2;
        C13079m c13079m;
        Cursor cursor = null;
        c13079m = null;
        C13079m c13079m2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
            if (cursorRawQuery != null) {
                try {
                    try {
                        if (cursorRawQuery.getCount() > 0) {
                            c13079m = new C13079m();
                            while (cursorRawQuery.moveToNext()) {
                                try {
                                    c13079m.m36946b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_url")));
                                    c13079m.m36940a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                                    c13079m.m36945b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                                    c13079m.m36944b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                                    c13079m.m36942a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                                    c13079m.m36941a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e3) {
                                    e2 = e3;
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37816b("VideoDao", e2.getLocalizedMessage());
                                    }
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception e4) {
                                            if (MBridgeConstans.DEBUG) {
                                                C13219q0.m37816b("VideoDao", e4.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    c13079m2 = c13079m;
                                }
                            }
                            c13079m2 = c13079m;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e5) {
                                if (MBridgeConstans.DEBUG) {
                                    C13219q0.m37816b("VideoDao", e5.getLocalizedMessage());
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    e2 = e;
                    c13079m = null;
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("VideoDao", e2.getLocalizedMessage());
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    c13079m2 = c13079m;
                    return c13079m2;
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e7) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("VideoDao", e7.getLocalizedMessage());
                    }
                }
            }
        } catch (Exception e8) {
            e = e8;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return c13079m2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36724a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
            } else {
                getWritableDatabase().delete("video", "video_url = ? ", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36725a(String str, long j) {
        if (j == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j / 1000));
            if (m36726a(str, "")) {
                getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m36722a(CampaignEx campaignEx, long j, String str, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("unitid", campaignEx.getCampaignUnitId());
            contentValues.put("id", campaignEx.getId());
            contentValues.put("package_name", campaignEx.getPackageName());
            contentValues.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, campaignEx.getAppName());
            contentValues.put("app_desc", campaignEx.getAppDesc());
            contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
            contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            contentValues.put("image_url", campaignEx.getImageUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
            contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
            contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put("video_url", campaignEx.getVideoUrlEncode());
            contentValues.put("total_size", Long.valueOf(j));
            contentValues.put("video_state", Integer.valueOf(i));
            contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("ad_bid_token", campaignEx.getBidToken());
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("video_path", str);
            }
            if (m36726a(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                return 0L;
            }
            return getWritableDatabase().insert("video", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[EXC_TOP_SPLITTER, PHI: r0
  0x0092: PHI (r0v3 android.database.Cursor) = (r0v1 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:25:0x0090, B:17:0x007d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public synchronized C13079m m36728b(String str, String str2) {
        Cursor cursorRawQuery = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C13079m c13079m = new C13079m();
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    while (cursorRawQuery.moveToNext()) {
                        c13079m.m36946b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_url")));
                        c13079m.m36940a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                        c13079m.m36945b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                        c13079m.m36944b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                        c13079m.m36942a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                        c13079m.m36941a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                    }
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
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
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return c13079m;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m36726a(String str, String str2) {
        String[] strArr;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "SELECT id FROM video WHERE video_url = ? ";
            strArr = new String[]{str};
        } else {
            strArr = new String[]{str, str2};
            str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
        }
        Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, strArr);
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
                }
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("VideoDao", e2.getLocalizedMessage());
                }
            }
        }
        return false;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m36723a(String str, long j, int i, long j2) {
        int iUpdate = -1;
        try {
            if (getWritableDatabase() == null) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("pregeress_size", Long.valueOf(j));
            contentValues.put("video_state", Integer.valueOf(i));
            contentValues.put("total_size", Long.valueOf(j2));
            if (m36726a(str, "")) {
                String[] strArr = {str};
                synchronized (new Object()) {
                    iUpdate = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("VideoDao", e.getLocalizedMessage());
            }
        }
        return iUpdate;
    }
}
