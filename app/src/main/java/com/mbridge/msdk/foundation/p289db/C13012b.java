package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.b */
/* JADX INFO: compiled from: BidReplaceCampignDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13012b extends C13011a {

    /* JADX INFO: renamed from: a */
    private static volatile C13012b f35555a;

    public C13012b(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13012b m36621a(Context context) {
        if (f35555a == null) {
            synchronized (C13012b.class) {
                if (f35555a == null) {
                    f35555a = new C13012b(C13017g.m36693a(context));
                }
            }
        }
        return f35555a;
    }

    /* JADX INFO: renamed from: b */
    public int m36626b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m36627d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "is_replace = 0", null);
        } catch (Exception e) {
            C13219q0.m37816b("BidReplaceCampaignDao", e.getLocalizedMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36625a(String str, List<CampaignEx> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        try {
            String requestId = list.get(0).getRequestId();
            String encryptPrice = list.get(0).getEncryptPrice();
            String campaignUnitId = list.get(0).getCampaignUnitId();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("bid_unit_id", campaignUnitId);
            contentValues.put("expect_bid_token", str);
            contentValues.put("expect_encrypt_price", "");
            contentValues.put("real_request_id", requestId);
            contentValues.put("real_encrypt_price", encryptPrice);
            contentValues.put("real_token_rule", (Integer) 1);
            contentValues.put("is_replace", (Integer) 0);
            writableDatabase.insert("bid_replace_campaign", null, contentValues);
            C13219q0.m37816b("HBOPTIMIZE", "插入数据到对应关系表 期望 bidToken 值" + str + "+ 用于替换期望Offer 的RequestId " + requestId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C13070d> m36624a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Cursor cursorRawQuery = null;
            try {
                try {
                    synchronized (new Object()) {
                        cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM bid_replace_campaign WHERE bid_unit_id = ? AND real_request_id = ?", new String[]{str, str2});
                    }
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        while (cursorRawQuery.moveToNext()) {
                            C13070d c13070d = new C13070d();
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("bid_unit_id"));
                            String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("expect_bid_token"));
                            String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("expect_encrypt_price"));
                            String string4 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("real_request_id"));
                            String string5 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("real_encrypt_price"));
                            int i = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("real_token_rule"));
                            int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("is_replace"));
                            c13070d.m36803a(string);
                            c13070d.m36806b(string2);
                            c13070d.m36808c(string3);
                            c13070d.m36811e(string4);
                            c13070d.m36810d(string5);
                            c13070d.m36805b(i);
                            c13070d.m36802a(i2);
                            arrayList.add(c13070d);
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("BidReplaceCampaignDao", e.getLocalizedMessage());
                    if (0 != 0) {
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public int m36622a(String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "real_request_id = ? AND is_replace = 1", new String[]{str});
        } catch (Exception e) {
            C13219q0.m37816b("BidReplaceCampaignDao", e.getLocalizedMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m36623a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expect_encrypt_price", str3);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
