package com.mbridge.msdk.video.module.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.module.request.C14077b;
import com.mbridge.msdk.videocommon.entity.C14216c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.report.b */
/* JADX INFO: compiled from: VideoViewReport.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14075b {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<String>> f40592a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    private static String m42194a(String str, C13126e c13126e) {
        if (c13126e == null) {
            return "";
        }
        String strTrim = c13126e.m37246b().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return "";
        }
        if (!str.endsWith("?") && !str.endsWith(C11744X3.j.f26436c)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? C11744X3.j.f26436c : "?");
            str = sb.toString();
        }
        return str + strTrim;
    }

    /* JADX INFO: renamed from: a */
    public static void m42195a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        String campaignUnitId = campaignEx.getCampaignUnitId();
        ArrayList<String> arrayList = f40592a.get(campaignUnitId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f40592a.put(campaignUnitId, arrayList);
        }
        if (arrayList.contains(campaignEx.getId())) {
            return;
        }
        try {
            C13156d.m37475b().m37482a("2000142", campaignEx);
        } catch (Exception unused) {
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36901i(), false, false);
        arrayList.add(campaignEx.getId());
    }

    /* JADX INFO: renamed from: a */
    public static void m42196a(Context context, CampaignEx campaignEx, int i, int i2) {
        try {
            String[] strArrM36909m = campaignEx.getNativeVideoTracking().m36909m();
            if (campaignEx.getNativeVideoTracking() == null || strArrM36909m == null) {
                return;
            }
            String[] strArr = new String[strArrM36909m.length];
            for (int i3 = 0; i3 < strArrM36909m.length; i3++) {
                String str = strArrM36909m[i3];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i);
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = C13207k0.m37713b(string);
                }
                if (!TextUtils.isEmpty(string)) {
                    str = str + "&value=" + URLEncoder.encode(string);
                }
                strArr[i3] = campaignEx.getSpareOfferFlag() == 1 ? str + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2 : str + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
            }
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", Integer.valueOf(i));
                C13156d.m37475b().m37483a("2000144", campaignEx, c13157e);
                C13156d.m37475b().m37483a("2000147", campaignEx, c13157e);
            } catch (Exception unused) {
            }
            C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
        } catch (Throwable unused2) {
            C13219q0.m37816b("VideoViewReport", "reportEndcardshowData error");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42197a(Context context, CampaignEx campaignEx, int i, int i2, int i3) {
        String str;
        if (i2 == 0 || context == null || campaignEx == null) {
            return;
        }
        try {
            List<Map<Integer, String>> listM36922t = campaignEx.getNativeVideoTracking().m36922t();
            int i4 = ((i + 1) * 100) / i2;
            if (listM36922t != null) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < listM36922t.size()) {
                    Map<Integer, String> map = listM36922t.get(i5);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        int i7 = i5;
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            Integer key = next.getKey();
                            int iIntValue = key.intValue();
                            String value = next.getValue();
                            if (campaignEx.getSpareOfferFlag() == 1) {
                                str = value + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i3;
                            } else {
                                str = value + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i3;
                            }
                            if (iIntValue <= i4 && !TextUtils.isEmpty(str)) {
                                String[] strArr = {str};
                                if (i6 < 1) {
                                    i6++;
                                    try {
                                        C13157e c13157e = new C13157e();
                                        c13157e.m37501a("percent", key);
                                        C13156d.m37475b().m37483a("2000140", campaignEx, c13157e);
                                    } catch (Exception unused) {
                                    }
                                }
                                int i8 = i6;
                                C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
                                it.remove();
                                listM36922t.remove(i7);
                                i7--;
                                i6 = i8;
                            }
                        }
                        i5 = i7;
                    }
                    i5++;
                }
            }
        } catch (Throwable unused2) {
            C13219q0.m37816b("VideoViewReport", "reportPlayPercentageData error");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42198a(CampaignEx campaignEx, C14216c c14216c, String str, String str2, String str3) {
        if (campaignEx == null || c14216c == null) {
            return;
        }
        try {
            C14077b c14077b = new C14077b(C13008c.m36588n().m36542d());
            C13126e c13126e = new C13126e();
            c13126e.m37245a("user_id", C13207k0.m37713b(str2));
            c13126e.m37245a("cb_type", "1");
            c13126e.m37245a(CampaignEx.JSON_KEY_REWARD_NAME, c14216c.m42626c());
            c13126e.m37245a(CampaignEx.JSON_KEY_REWARD_AMOUNT, c14216c.m42623a() + "");
            c13126e.m37245a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            c13126e.m37245a("click_id", campaignEx.getRequestIdNotice());
            if (!TextUtils.isEmpty(str3)) {
                c13126e.m37245a("extra", str3);
            }
            c14077b.addExtraParams("", c13126e);
            String strM42194a = m42194a(campaignEx.getHost() + "/addReward?", c13126e);
            StringBuilder sb = new StringBuilder("rewardUrl:");
            sb.append(strM42194a);
            C13219q0.m37816b("VideoViewReport", sb.toString());
            C12682a.m34605a(C13008c.m36588n().m36542d(), campaignEx, campaignEx.getCampaignUnitId(), strM42194a, false, false);
        } catch (Throwable th) {
            C13219q0.m37817b("VideoViewReport", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42199a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() == null || campaignEx.getAdUrlList().size() <= 0) {
                    return;
                }
                for (String str2 : campaignEx.getAdUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        CampaignEx campaignEx2 = campaignEx;
                        String str3 = str;
                        C12682a.m34605a(C13008c.m36588n().m36542d(), campaignEx2, str3, str2, false, false);
                        campaignEx = campaignEx2;
                        str = str3;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42200a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i) {
        if (campaignEx == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i == key.intValue() && !TextUtils.isEmpty(value)) {
                        CampaignEx campaignEx2 = campaignEx;
                        String str2 = str;
                        C12682a.m34605a(C13008c.m36588n().m36542d(), campaignEx2, str2, value, false, false);
                        it.remove();
                        campaignEx = campaignEx2;
                        str = str2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42201a(String str) {
        f40592a.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m42202b(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36903j() == null) {
            return;
        }
        C13156d.m37475b().m37482a("2000143", campaignEx);
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36903j(), false, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m42203c(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36921s() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36921s(), false, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m42204d(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36915p() == null) {
            return;
        }
        C13156d.m37475b().m37482a("2000141", campaignEx);
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36915p(), false, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m42205e(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36919r() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36919r(), false, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m42206f(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36929x() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36929x(), false, false);
    }
}
