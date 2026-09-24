package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13231w0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.d */
/* JADX INFO: compiled from: CampaignClickDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13014d extends C13011a<JumpLoaderResult> {

    /* JADX INFO: renamed from: a */
    public static final String f35557a = "d";

    /* JADX INFO: renamed from: b */
    private static C13014d f35558b;

    private C13014d(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13014d m36637a(AbstractC13016f abstractC13016f) {
        if (f35558b == null) {
            f35558b = new C13014d(abstractC13016f);
        }
        return f35558b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b A[Catch: all -> 0x0069, PHI: r12
  0x005b: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v5 android.database.Cursor) binds: [B:27:0x0059, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0069, blocks: (B:13:0x003b, B:28:0x005b, B:34:0x0065, B:35:0x0068), top: B:43:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #4 {all -> 0x0069, blocks: (B:13:0x003b, B:28:0x005b, B:34:0x0065, B:35:0x0068), top: B:43:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:45:? A[Catch: all -> 0x0069, SYNTHETIC, TryCatch #4 {all -> 0x0069, blocks: (B:13:0x003b, B:28:0x005b, B:34:0x0065, B:35:0x0068), top: B:43:0x0002 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: b */
    public synchronized JumpLoaderResult m36640b(String str, String str2) {
        Throwable th;
        Exception exc;
        Cursor cursorQuery;
        ?? r1 = 0;
        try {
            try {
                try {
                    cursorQuery = getReadableDatabase().query("campaignclick", null, "id=? AND unitid=?", new String[]{str, str2}, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("result"));
                                if (!TextUtils.isEmpty(string)) {
                                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) C13231w0.m37950a(string);
                                    cursorQuery.close();
                                    return jumpLoaderResult;
                                }
                            }
                        } catch (Exception e) {
                            exc = e;
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37816b(f35557a, exc.getMessage());
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = str;
                    if (r1 != 0) {
                        throw th;
                    }
                    r1.close();
                    throw th;
                }
            } catch (Exception e2) {
                exc = e2;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
            return null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m36641c(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b(f35557a, e.getMessage());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m36642d() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b(f35557a, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m36638a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            String strM37951a = C13231w0.m37951a(campaignEx.getJumpResult());
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", campaignEx.getId());
            contentValues.put("unitid", str);
            contentValues.put("result", strM37951a);
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
            contentValues.put("package_name", campaignEx.getPackageName());
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
            if (c13635gM39718d != null && c13635gM39718d.m39452Y() > 0) {
                contentValues.put("cpei", Integer.valueOf(c13635gM39718d.m39452Y() * 1000));
            }
            if (c13635gM39718d != null && c13635gM39718d.m39454Z() > 0) {
                contentValues.put("cpoci", Integer.valueOf(c13635gM39718d.m39454Z() * 1000));
            }
            if (m36639a(campaignEx.getId(), str)) {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
            }
            return getWritableDatabase().insert("campaignclick", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b(f35557a, e.getMessage());
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m36639a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return false;
    }
}
