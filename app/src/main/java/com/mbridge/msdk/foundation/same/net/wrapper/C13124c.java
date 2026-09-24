package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.middle.C13025b;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.C13107Aa;
import com.mbridge.msdk.foundation.same.net.C13108a;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.C13114f;
import com.mbridge.msdk.foundation.same.net.InterfaceC13109b;
import com.mbridge.msdk.foundation.same.net.utils.C13120c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.report.C13133b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.C13629a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.tracker.network.AbstractC13838h;
import com.mbridge.msdk.tracker.network.C13839i;
import com.mbridge.msdk.tracker.network.C13841k;
import com.mbridge.msdk.tracker.network.C13842l;
import com.mbridge.msdk.util.C13884b;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.c */
/* JADX INFO: compiled from: CommonAsyncHttpRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13124c {
    private static final String TAG = "c";
    protected Context mContext;

    public C13124c(Context context) {
        if (context == null) {
            this.mContext = C13008c.m36588n().m36542d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append(C11744X3.j.f26436c);
                        sb.append(str);
                        sb.append(C11744X3.j.f26434b);
                        sb.append(str2);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b(TAG, e.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) ? C13229v0.m37905b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A") : sb.toString();
            }
        }
        return null;
    }

    private static AbstractC13838h<?> createRequest(int i, int i2, String str, InterfaceC13109b interfaceC13109b, String str2, long j) {
        if (i == 0) {
            return new C13841k(i2, str, str2, j, new C13130i(interfaceC13109b));
        }
        if (i != 1) {
            return null;
        }
        return new C13839i(i2, str, str2, j, new C13130i(interfaceC13109b));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x000c, B:8:0x0020, B:9:0x002a, B:12:0x003c), top: B:85:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x000c, B:8:0x0020, B:9:0x002a, B:12:0x003c), top: B:85:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    private void post(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, boolean z, boolean z2, String str2, long j) {
        String str3;
        C13629a c13629aM39523j;
        AbstractC13838h<?> abstractC13838hCreateRequest;
        String str4;
        int iM39397C0;
        String strM39527k;
        int iM39422L;
        String str5;
        C13112e c13112eM37215a;
        String key;
        String strIsRKE;
        if (c13126e == null) {
            try {
                c13126e = new C13126e();
                if (interfaceC13109b instanceof C13110c) {
                    key = ((C13110c) interfaceC13109b).getKey();
                    strIsRKE = ((C13110c) interfaceC13109b).isRKE();
                    if (!TextUtils.isEmpty(key)) {
                        c13126e.m37245a("rk", key);
                        c13126e.m37245a("erk", strIsRKE);
                    }
                }
                addExtraParams(str, c13126e);
                C13127f.m37260k(c13126e);
                c13112eM37215a = C13120c.m37214b().m37215a(c13126e);
                if (c13112eM37215a != null && interfaceC13109b != null) {
                    interfaceC13109b.onSuccess(c13112eM37215a);
                    return;
                }
            } catch (Exception e) {
                C13219q0.m37813a(TAG, e.getMessage());
            }
        } else {
            if (interfaceC13109b instanceof C13110c) {
                key = ((C13110c) interfaceC13109b).getKey();
                strIsRKE = ((C13110c) interfaceC13109b).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    c13126e.m37245a("rk", key);
                    c13126e.m37245a("erk", strIsRKE);
                }
            }
            addExtraParams(str, c13126e);
            C13127f.m37260k(c13126e);
            c13112eM37215a = C13120c.m37214b().m37215a(c13126e);
            if (c13112eM37215a != null) {
                interfaceC13109b.onSuccess(c13112eM37215a);
                return;
            }
        }
        C13219q0.m37818c(TAG, "post url = " + str);
        if (str.contains(C13121d.m37226h().f36024d)) {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null) {
                iM39422L = c13635gM39718d.m39422L();
                try {
                    str5 = c13126e.m37243a().get("data");
                    if (!z2) {
                        try {
                            if (!C13133b.m37277a(c13635gM39718d, str5)) {
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    str5 = "";
                }
                strM39527k = c13635gM39718d.m39527k();
                iM39397C0 = c13635gM39718d.m39397C0();
                c13126e.m37245a("a_stid", c13635gM39718d.m39456a());
            } else {
                iM39397C0 = 0;
                strM39527k = "UNKNOWN";
                iM39422L = 1;
                str5 = "";
            }
            c13126e.m37245a("country_code", strM39527k);
            try {
                if (iM39422L == 2) {
                    if (!TextUtils.isEmpty(str5)) {
                        if (C13133b.m37277a(c13635gM39718d, str5)) {
                            if (iM39397C0 == 1 || iM39397C0 == 3) {
                                C13114f.m37197b().m37199a(C13121d.m37226h().f36033j, C13121d.m37226h().f36037n, c13126e.toString(), false, interfaceC13109b, false);
                            }
                        } else if (z2) {
                            if (iM39397C0 == 1 || iM39397C0 == 3) {
                                C13114f.m37197b().m37199a(C13121d.m37226h().f36033j, C13121d.m37226h().f36037n, c13126e.toString(), false, interfaceC13109b, false);
                            }
                        }
                    }
                    return;
                }
                if (iM39422L == 1) {
                    C13114f.m37197b().m37199a(C13121d.m37226h().f36033j, C13121d.m37226h().f36037n, c13126e.toString(), false, interfaceC13109b, false);
                    return;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            abstractC13838hCreateRequest = createRequest(i, 1, str3, interfaceC13109b, str2, j);
            if (abstractC13838hCreateRequest != null) {
                if (c13126e != null && c13126e.m37243a() != null) {
                    str4 = c13126e.m37243a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    abstractC13838hCreateRequest.m41225a("local_id", str4);
                    String str6 = c13126e.m37243a().get("ad_type");
                    abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                    abstractC13838hCreateRequest.m41107a(c13126e.m37243a());
                }
                abstractC13838hCreateRequest.m41110d(canTrack());
                abstractC13838hCreateRequest.m41109b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
            }
        }
        if (!str.contains(C13121d.m37226h().f36031h)) {
            if (str.contains(C13121d.m37226h().f36025d0)) {
                if (c13126e != null) {
                    str = str + "?" + c13126e.toString();
                }
                JSONArray jSONArrayM36742b = C13025b.m36738a().m36742b();
                if (jSONArrayM36742b != null) {
                    String string = jSONArrayM36742b.toString();
                    C13126e c13126e2 = new C13126e();
                    c13126e2.m37245a(C13126e.f36060k, string);
                    str3 = str;
                    c13126e = c13126e2;
                }
            }
            abstractC13838hCreateRequest = createRequest(i, 1, str3, interfaceC13109b, str2, j);
            if (abstractC13838hCreateRequest != null) {
                if (c13126e != null) {
                    str4 = c13126e.m37243a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    abstractC13838hCreateRequest.m41225a("local_id", str4);
                    String str7 = c13126e.m37243a().get("ad_type");
                    abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str7) ? "" : str7);
                    abstractC13838hCreateRequest.m41107a(c13126e.m37243a());
                }
                abstractC13838hCreateRequest.m41110d(canTrack());
                abstractC13838hCreateRequest.m41109b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
            }
        }
        C13635g c13635gM39718d2 = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d2 != null && (c13629aM39523j = c13635gM39718d2.m39523j()) != null && c13629aM39523j.m39381h() == 1) {
            C13114f.m37197b().m37199a(C13121d.m37226h().f36035l, C13121d.m37226h().f36039p, c13126e.toString(), false, interfaceC13109b, false);
            return;
        }
        str3 = str;
        abstractC13838hCreateRequest = createRequest(i, 1, str3, interfaceC13109b, str2, j);
        if (abstractC13838hCreateRequest != null) {
            if (c13126e != null) {
                str4 = c13126e.m37243a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                abstractC13838hCreateRequest.m41225a("local_id", str4);
                String str8 = c13126e.m37243a().get("ad_type");
                abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str8) ? "" : str8);
                abstractC13838hCreateRequest.m41107a(c13126e.m37243a());
            }
            abstractC13838hCreateRequest.m41110d(canTrack());
            abstractC13838hCreateRequest.m41109b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
        }
    }

    public void addExtraParams(String str, C13126e c13126e) {
        if (c13126e == null) {
            C13219q0.m37816b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String strM37185a = C13107Aa.m37185a();
        if (strM37185a == null) {
            strM37185a = "";
        }
        c13126e.m37245a("channel", strM37185a);
        c13126e.m37245a("band_width", C13108a.m37190b().m37191a() + "");
        c13126e.m37245a("open", C13088a.f35853S);
        if (C13884b.m41421a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String strM37186b = C13107Aa.m37186b();
            if (!TextUtils.isEmpty(strM37186b)) {
                c13126e.m37245a("keyword", strM37186b);
            }
        }
        String str2 = c13126e.m37243a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                c13126e.m37245a("ch_info", customInfoByUnitId);
            }
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), str2);
            if (c13640lM39720e != null && !TextUtils.isEmpty(c13640lM39720e.m39617a())) {
                c13126e.m37245a("u_stid", c13640lM39720e.m39617a());
            }
        }
        if (!AbstractC13005b.m36562i()) {
            c13126e.m37245a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            c13126e.m37245a("re_domain", "1");
        }
    }

    protected boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str, long j) {
        C13126e c13126e2;
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        int iM39566t0 = TextUtils.isEmpty(str) ? c13635gM39714b.m39566t0() : c13635gM39714b.m39394C();
        String strM37227a = C13121d.m37226h().m37227a(str, iM39566t0);
        if (iM39566t0 < 2) {
            postV5(i, strM37227a, c13126e, interfaceC13109b, "campaign", j);
            return;
        }
        if (iM39566t0 % 2 == 0) {
            if (c13126e == null) {
                c13126e = new C13126e();
            }
            c13126e2 = c13126e;
            JSONArray jSONArrayM36742b = C13025b.m36738a().m36742b();
            if (jSONArrayM36742b != null) {
                String string = jSONArrayM36742b.toString();
                int iM37236i = C13121d.m37226h().m37236i();
                if (iM37236i > 0 && string.length() > iM37236i) {
                    post(i, strM37227a, c13126e2, interfaceC13109b, "campaign", j);
                    return;
                }
                c13126e2.m37245a(C13126e.f36060k, string);
            }
        } else {
            c13126e2 = c13126e;
        }
        getLoadOrSetting(i, strM37227a, c13126e2, interfaceC13109b, "campaign", j);
    }

    public void get(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str2, long j) {
        get(i, str, c13126e, interfaceC13109b, false, false, str2, j);
    }

    public void getCampaign(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, long j) {
        C13126e c13126e2;
        try {
            C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
            int iM39566t0 = TextUtils.isEmpty(str) ? c13635gM39714b.m39566t0() : c13635gM39714b.m39394C();
            String strM37227a = C13121d.m37226h().m37227a(str, iM39566t0);
            if (iM39566t0 < 2) {
                postV5(i, strM37227a, c13126e, interfaceC13109b, true, "campaign", j);
                return;
            }
            if (iM39566t0 % 2 == 0) {
                if (c13126e == null) {
                    c13126e = new C13126e();
                }
                c13126e2 = c13126e;
                JSONArray jSONArrayM36742b = C13025b.m36738a().m36742b();
                if (jSONArrayM36742b != null) {
                    String string = jSONArrayM36742b.toString();
                    int iM37236i = C13121d.m37226h().m37236i();
                    if (iM37236i > 0 && string.length() > iM37236i) {
                        post(i, strM37227a, c13126e2, interfaceC13109b, true, false, "campaign", j);
                        return;
                    }
                    c13126e2.m37245a(C13126e.f36060k, string);
                }
            } else {
                c13126e2 = c13126e;
            }
            get(i, strM37227a, c13126e2, interfaceC13109b, true, true, "campaign", j);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b(TAG, e.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str2, long j) {
        getLoadOrSetting(i, str, c13126e, interfaceC13109b, true, str2, j);
    }

    public void postFocusReport(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str2, long j) {
        post(i, str, c13126e, interfaceC13109b, false, true, str2, j);
    }

    public void postV5(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str2, long j) {
        String str3 = c13126e.m37243a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13126e.m37245a("ts", jCurrentTimeMillis + "");
        c13126e.m37245a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i, str, c13126e, interfaceC13109b, false, false, str2, j);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x0232  */
    /* JADX WARN: Code duplicated, block: B:81:0x024b  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0199, please report this as an issue */
    public void get(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, boolean z, boolean z2, String str2, long j) {
        C13126e c13126e2;
        C13126e c13126e3;
        String str3;
        C13635g c13635gM39714b;
        AbstractC13838h<?> abstractC13838hCreateRequest;
        String str4;
        boolean z3;
        if (c13126e == null) {
            try {
                c13126e2 = new C13126e();
            } catch (Exception e) {
                e = e;
                c13126e2 = c13126e;
                C13219q0.m37813a(TAG, e.getMessage());
                c13126e3 = c13126e2;
                if (str.contains(C13121d.m37226h().f36032i)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(ShareConstants.MEDIA_URI, C13121d.m37226h().f36036m + Uri.parse(str).getPath());
                            jSONObject.put("data", c13126e3.m37246b());
                        } catch (Throwable th) {
                            C13219q0.m37816b(TAG, th.getMessage());
                        }
                        C13114f c13114fM37197b = C13114f.m37197b();
                        String str5 = C13121d.m37226h().f36036m;
                        int i2 = C13121d.m37226h().f36040q;
                        String string = jSONObject.toString();
                        if (c13126e3 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        c13114fM37197b.m37199a(str5, i2, string, true, interfaceC13109b, z3);
                        return;
                    } catch (Throwable th2) {
                        C13219q0.m37816b(TAG, th2.getMessage());
                    }
                }
                if (c13126e3 != null) {
                    str3 = str;
                } else if (TextUtils.isEmpty(c13126e3.m37247c().optString("rk"))) {
                    str3 = str + "?" + c13126e3.toString();
                } else {
                    str3 = str + "?" + c13126e3.toString();
                }
                c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
                if (str3.length() < c13635gM39714b.m39554q0()) {
                }
                if (str3.length() < c13635gM39714b.m39425M()) {
                }
                abstractC13838hCreateRequest = createRequest(i, 0, str, interfaceC13109b, str2, j);
                if (abstractC13838hCreateRequest != null) {
                    if (c13126e3 != null) {
                        str4 = c13126e3.m37243a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "";
                        }
                        abstractC13838hCreateRequest.m41225a("local_id", str4);
                        String str6 = c13126e3.m37243a().get("ad_type");
                        abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                        abstractC13838hCreateRequest.m41107a(c13126e3.m37243a());
                    }
                    abstractC13838hCreateRequest.m41110d(canTrack());
                    C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
                }
            }
        } else {
            c13126e2 = c13126e;
        }
        try {
            if (interfaceC13109b instanceof C13110c) {
                String key = ((C13110c) interfaceC13109b).getKey();
                String strIsRKE = ((C13110c) interfaceC13109b).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    c13126e2.m37245a("rk", key);
                    c13126e2.m37245a("erk", strIsRKE);
                }
            }
            addExtraParams(str, c13126e2);
            C13127f.m37260k(c13126e2);
            String str7 = c13126e2.m37243a().get("sign");
            if (TextUtils.isEmpty(str7)) {
                str7 = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            c13126e2.m37245a("ts", jCurrentTimeMillis + "");
            if (C13884b.m41421a()) {
                c13126e2.m37245a("st", SameMD5.getMD5(str7 + jCurrentTimeMillis));
            } else {
                c13126e2.m37245a("st", SameMD5.getMD5(jCurrentTimeMillis + str7));
            }
            C13112e c13112eM37215a = C13120c.m37214b().m37215a(c13126e2);
            if (c13112eM37215a != null && interfaceC13109b != null) {
                interfaceC13109b.onSuccess(c13112eM37215a);
                return;
            }
        } catch (Exception e2) {
            e = e2;
            C13219q0.m37813a(TAG, e.getMessage());
        }
        c13126e3 = c13126e2;
        if (str.contains(C13121d.m37226h().f36032i) && C13121d.m37226h().f36042s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ShareConstants.MEDIA_URI, C13121d.m37226h().f36036m + Uri.parse(str).getPath());
            jSONObject2.put("data", c13126e3.m37246b());
            C13114f c13114fM37197b2 = C13114f.m37197b();
            String str8 = C13121d.m37226h().f36036m;
            int i3 = C13121d.m37226h().f36040q;
            String string2 = jSONObject2.toString();
            if (c13126e3 == null && !TextUtils.isEmpty(c13126e3.m37247c().optString("rk")) && c13126e3.m37247c().optString("erk").equals("1")) {
                z3 = true;
            } else {
                z3 = false;
            }
            c13114fM37197b2.m37199a(str8, i3, string2, true, interfaceC13109b, z3);
            return;
        }
        if (c13126e3 != null) {
            str3 = str;
        } else if (TextUtils.isEmpty(c13126e3.m37247c().optString("rk")) || !c13126e3.m37247c().optString("erk").equals("1")) {
            str3 = str + "?" + c13126e3.toString();
        } else {
            try {
                str3 = str + "?p=" + URLEncoder.encode(C13229v0.m37905b(c13126e3.toString(), "ebmclXzZOhtU2sRlZxGL8A"), "UTF-8");
            } catch (Exception unused) {
                str3 = str;
            }
        }
        c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        if (str3.length() < c13635gM39714b.m39554q0() && str3.contains(C13121d.m37226h().f36032i)) {
            post(i, str, c13126e3, interfaceC13109b, z2, false, str2, j);
            return;
        }
        if (str3.length() < c13635gM39714b.m39425M() && z) {
            post(i, str, c13126e3, interfaceC13109b, z2, false, str2, j);
            return;
        }
        abstractC13838hCreateRequest = createRequest(i, 0, str, interfaceC13109b, str2, j);
        if (abstractC13838hCreateRequest != null) {
            if (c13126e3 != null && c13126e3.m37243a() != null) {
                str4 = c13126e3.m37243a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                abstractC13838hCreateRequest.m41225a("local_id", str4);
                String str9 = c13126e3.m37243a().get("ad_type");
                abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str9) ? "" : str9);
                abstractC13838hCreateRequest.m41107a(c13126e3.m37243a());
            }
            abstractC13838hCreateRequest.m41110d(canTrack());
            C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
        }
    }

    public void getLoadOrSetting(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, boolean z, String str2, long j) {
        get(i, str, c13126e, interfaceC13109b, z, false, str2, j);
    }

    public void postV5(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, boolean z, String str2, long j) {
        String str3 = c13126e.m37243a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13126e.m37245a("ts", jCurrentTimeMillis + "");
        c13126e.m37245a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i, str, c13126e, interfaceC13109b, z, false, str2, j);
    }

    public void get(int i, String str, Map<String, String> map, InterfaceC13109b interfaceC13109b, String str2, long j) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app_id", C13008c.m36588n().m36533b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put(C11540L6.f24917H, "1");
        String strAsUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(strAsUrlParams)) {
            str = str + "?" + strAsUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a("AppletsModel", "get wx scheme url = " + str3);
        }
        AbstractC13838h<?> abstractC13838hCreateRequest = createRequest(i, 0, str3, interfaceC13109b, str2, j);
        if (abstractC13838hCreateRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            abstractC13838hCreateRequest.m41225a("local_id", str4);
            String str5 = map.get("ad_type");
            abstractC13838hCreateRequest.m41225a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            abstractC13838hCreateRequest.m41107a(map);
            abstractC13838hCreateRequest.m41110d(canTrack());
            C13842l.m41123a().m41124b().m41327a(abstractC13838hCreateRequest);
        }
    }

    public void post(int i, String str, C13126e c13126e, InterfaceC13109b interfaceC13109b, String str2, long j) {
        post(i, str, c13126e, interfaceC13109b, false, false, str2, j);
    }
}
