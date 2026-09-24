package com.mbridge.msdk.foundation.same;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.c */
/* JADX INFO: compiled from: SameCommon.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13092c {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.c$a */
    /* JADX INFO: compiled from: SameCommon.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract void mo34472a(String str, C13154c c13154c);
    }

    /* JADX INFO: renamed from: a */
    public static long m37115a(long j, long j2) {
        return j >= 0 ? j : j2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37121a(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        boolean zM37915c = C13229v0.m37915c(context, campaignEx.getPackageName());
        boolean zM37916c = C13229v0.m37916c(campaignEx);
        return campaignEx.getWtick() == 1 || (zM37916c && zM37915c) || !(zM37916c || zM37915c);
    }

    /* JADX INFO: renamed from: b */
    public static String m37122b(List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null && campaignEx.getCreativeId() != 0) {
                arrayList.add(campaignEx);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                CampaignEx campaignEx2 = (CampaignEx) arrayList.get(i);
                if (campaignEx2 != null) {
                    long creativeId = campaignEx2.getCreativeId();
                    if (i == arrayList.size() - 1) {
                        sb.append(creativeId);
                    } else {
                        sb.append(creativeId);
                        sb.append(",");
                    }
                }
            } catch (Exception e) {
                C13219q0.m37817b("SameCommon", "getCreativeID", e);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m37119a(CampaignEx campaignEx, Context context, C13154c c13154c, a aVar) {
        m37120a(campaignEx, context, c13154c, aVar, 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m37120a(CampaignEx campaignEx, Context context, C13154c c13154c, a aVar, int i) {
        int i2;
        if (campaignEx == null || aVar == null) {
            return;
        }
        if (c13154c == null) {
            try {
                c13154c = new C13154c();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean zM37916c = C13229v0.m37916c(campaignEx);
        int iM37919d = C13229v0.m37919d(context, campaignEx.getPackageName());
        if (context != null) {
            try {
                i2 = C13198g.m37686b(context) ? 1 : 2;
            } catch (Exception e2) {
                C13219q0.m37816b("SameCommon", e2.getMessage());
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        C13157e c13157e = new C13157e();
        c13157e.m37501a("cid", campaignEx.getId());
        c13157e.m37501a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
        c13157e.m37501a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
        c13157e.m37501a("ind", Integer.valueOf(iM37919d));
        c13157e.m37501a(C11744X3.i.f26386q, Integer.valueOf(i));
        c13157e.m37501a(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, 0);
        c13157e.m37501a("per", Integer.valueOf(i2));
        if (zM37916c) {
            if (iM37919d != 1) {
                c13154c.m37423a("m_campaign_filtered", c13157e);
                aVar.mo34472a("m_campaign_filtered", c13154c);
            }
            c13154c.m37423a("m_campaign_ind_retarget", c13157e);
            aVar.mo34472a("m_campaign_ind_retarget", c13154c);
            return;
        }
        if (iM37919d == 1) {
            c13154c.m37423a("m_campaign_filtered", c13157e);
            aVar.mo34472a("m_campaign_filtered", c13154c);
        }
        c13154c.m37423a("m_campaign_ind_unretarget", c13157e);
        aVar.mo34472a("m_campaign_ind_unretarget", c13154c);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37123b(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        return C13229v0.m37916c(campaignEx) || campaignEx.getWtick() == 1 || !C13229v0.m37915c(context, campaignEx.getPackageName());
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m37124b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length != 4) {
                return null;
            }
            byte[] bArr = new byte[4];
            for (int i = 0; i < 4; i++) {
                int i2 = Integer.parseInt(strArrSplit[i]);
                if (i2 >= 0 && i2 <= 255) {
                    bArr[i] = (byte) i2;
                }
                return null;
            }
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37118a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split(C11744X3.j.f26436c)) {
                String[] strArrSplit = str2.split(C11744X3.j.f26434b);
                String str3 = "";
                if (strArrSplit.length == 2) {
                    String str4 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str4)) {
                        String str5 = strArrSplit[1];
                        if (str5 != null) {
                            str3 = str5;
                        }
                        jSONObject.put(str4, str3);
                    }
                } else if (strArrSplit.length == 1) {
                    String str6 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject.put(str6, "");
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            C13219q0.m37814a("SameCommon", "coverReportMessage", e);
            return null;
        } catch (Throwable th) {
            C13219q0.m37814a("SameCommon", "coverReportMessage", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37117a(List<CampaignEx> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                try {
                    CampaignEx campaignEx = list.get(i);
                    if (campaignEx != null) {
                        String id = campaignEx.getId();
                        if (i == list.size() - 1) {
                            sb.append(id);
                        } else {
                            sb.append(id);
                            sb.append(",");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return sb.toString();
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m37116a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    sb.append(new String(bArr, 0, i));
                } else {
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
