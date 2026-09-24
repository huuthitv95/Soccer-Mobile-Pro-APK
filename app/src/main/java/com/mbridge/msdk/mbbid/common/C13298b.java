package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.metrics.C12756b;
import com.mbridge.msdk.config.component.common.util.C12768a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13199g0;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13209l0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13225t0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13233x0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.util.C13885c;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.b */
/* JADX INFO: compiled from: BidCommon.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13298b extends C13297a {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f36786a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static JSONArray f36787b;

    /* JADX INFO: renamed from: a */
    public static String m38348a(Context context, String str) {
        HashMap map = new HashMap();
        map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return m38350a(context, map);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m38356b(Context context, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        JSONArray jSONArray = f36787b;
        int i5 = 2;
        if (jSONArray == null || jSONArray.length() == 0) {
            m38353a(str, 2);
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        int i6 = 0;
        while (true) {
            try {
                if (i6 >= f36787b.length()) {
                    i2 = 0;
                    i = 0;
                    break;
                }
                JSONObject jSONObjectOptJSONObject = f36787b.optJSONObject(i6);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("key_tpl");
                    String strOptString2 = jSONObjectOptJSONObject.optString("key_value");
                    long jLongValue = ((Long) C13233x0.m37952a(context, strOptString2, 0L)).longValue();
                    if (m38355a(strOptString, strOptString2)) {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                if (jLongValue <= 0 || jCurrentTimeMillis - jLongValue >= ((long) jSONObjectOptJSONObject.optInt("ttl")) * 1000) {
                                    m38352a(context, strOptString2, jCurrentTimeMillis);
                                    i2 = 0;
                                    i4 = 1;
                                } else {
                                    try {
                                        double dOptDouble = jSONObjectOptJSONObject.optDouble("rate");
                                        i2 = (dOptDouble == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dOptDouble * 100.0d < ((double) new Random().nextInt(100))) ? 2 : 1;
                                        i5 = i2;
                                        i4 = 2;
                                    } catch (Exception e) {
                                        e = e;
                                        i3 = 2;
                                        i = i3;
                                        jSONObject = jSONObjectOptJSONObject;
                                        if (MBridgeConstans.DEBUG) {
                                            C13219q0.m37816b("BidCommon", e.getMessage());
                                        }
                                        i2 = 0;
                                    }
                                }
                                i = i4;
                                jSONObject = jSONObjectOptJSONObject;
                                break;
                            } catch (Exception e2) {
                                e = e2;
                                i3 = 1;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i3 = 0;
                        }
                    }
                }
                i6++;
            } catch (Exception e4) {
                e = e4;
                i = 0;
            }
        }
        m38351a(i5, jSONObject, i, i2);
        m38353a(str, i5);
        return i5 == 1;
    }

    /* JADX INFO: renamed from: a */
    public static String m38350a(Context context, Map<String, String> map) {
        String md5;
        String str;
        f36786a = map;
        try {
            if (C13008c.m36588n().m36542d() == null) {
                C13008c.m36588n().m36535b(context);
            }
            if (C12907a.m36194c().m36202d()) {
                try {
                    C12768a c12768a = new C12768a();
                    b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(c12768a);
                    HashMap map2 = new HashMap();
                    if (map != null) {
                        map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, map.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                        map2.put("buyer_params", map);
                    }
                    HashMap map3 = new HashMap();
                    map3.put("callback", b__externalsyntheticlambda0);
                    map2.put("sdk_context", map3);
                    String strM35199a = C12770c.m35199a();
                    C12907a.m36194c().m36201b(strM35199a, "c4", map2);
                    m38354a("buyerIdStart", strM35199a, 0, 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Object objM35184a = c12768a.m35184a(C12907a.f34884h);
                    if (objM35184a instanceof Map) {
                        Object obj = ((Map) objM35184a).get("buyer_id");
                        if (obj instanceof String) {
                            m38354a("buyerIdEnd", strM35199a, 1, System.currentTimeMillis() - jCurrentTimeMillis);
                            return String.valueOf(obj);
                        }
                        m38354a("buyerIdEnd", strM35199a, 2, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("BidCommon", th.getMessage());
                }
            }
            if (f36787b == null) {
                f36787b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b()).m39538m0();
            }
            md5 = SameMD5.getMD5(C13229v0.m37920d());
            try {
                if (m38356b(context, md5)) {
                    return "";
                }
                Map<String, String> map4 = f36786a;
                if (map4 == null || !map4.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                    str = "";
                } else {
                    str = f36786a.get(BidConstants.BID_FILTER_KEY_UNIT_ID);
                }
                return m38349a(context, str, md5);
            } catch (Exception unused) {
                return m38349a(context, "", md5);
            }
        } catch (Exception unused2) {
            md5 = "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m38349a(Context context, String str, String str2) {
        long jM37714a;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (C13008c.m36588n().m36542d() == null) {
                    C13008c.m36588n().m36535b(context);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("BidCommon", e.getMessage());
                }
            }
        }
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        stringBuffer.append(C13198g.m37689d()).append("|");
        stringBuffer.append(C13297a.m38347a(1, c13635gM39718d, context)).append("|");
        stringBuffer.append(C13297a.m38347a(2, c13635gM39718d, context)).append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37771t()).append("|");
        stringBuffer.append(C13211m0.m37774u()).append("|");
        stringBuffer.append(C13211m0.m37770s(context)).append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION).append("|");
        stringBuffer.append(C13211m0.m37760n(context)).append("x").append(C13211m0.m37757m(context)).append("|");
        stringBuffer.append(C13211m0.m37749i()).append("|");
        stringBuffer.append(C13297a.m38347a(3, c13635gM39718d, context)).append("|");
        stringBuffer.append(C13229v0.m37904b(20)).append("|");
        stringBuffer.append(System.currentTimeMillis()).append("|");
        stringBuffer.append(C13088a.f35862d).append("|");
        stringBuffer.append(C13211m0.m37779x()).append("|");
        stringBuffer.append(C13211m0.m37747h()).append("|");
        stringBuffer.append(C13297a.m38347a(4, c13635gM39718d, context)).append("|");
        stringBuffer.append(C13297a.m38347a(5, c13635gM39718d, context)).append("|");
        stringBuffer.append(C13297a.m38347a(6, c13635gM39718d, context)).append("|");
        stringBuffer.append(C13225t0.m37852c()).append("|");
        stringBuffer.append(C13225t0.m37848a()).append("|");
        try {
            jM37714a = C13209l0.m37714a();
        } catch (Exception unused) {
            jM37714a = 0;
        }
        if (jM37714a > 0) {
            stringBuffer.append(jM37714a).append("|");
        } else {
            stringBuffer.append("").append("|");
        }
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C12998a.m36460b().m36462a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)).append("|");
        stringBuffer.append(C12998a.m36460b().m36462a("c"));
        stringBuffer.append("|").append(C13211m0.m37751j());
        stringBuffer.append("|").append(c13635gM39718d != null ? c13635gM39718d.m39456a() : "");
        stringBuffer.append("|");
        stringBuffer.append(C13229v0.m37874a());
        stringBuffer.append("|");
        String strM37913c = C13229v0.m37913c();
        if (TextUtils.isEmpty(strM37913c)) {
            strM37913c = "";
        }
        stringBuffer.append(strM37913c);
        stringBuffer.append("|");
        stringBuffer.append(C13229v0.m37914c(str));
        stringBuffer.append("|");
        if (c13635gM39718d != null && c13635gM39718d.m39578w0() == 1 && C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append(C13297a.m38347a(7, c13635gM39718d, context));
        }
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37727G());
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37724E(context));
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37721D() + "");
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37741e(C13008c.m36588n().m36551j()) + "");
        stringBuffer.append("|");
        stringBuffer.append(C13211m0.m37723E());
        stringBuffer.append("|");
        stringBuffer.append(AbstractC13005b.m36562i() ? "1" : "2");
        stringBuffer.append("|");
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (C13884b.m41422b()) {
                stringBuffer.append(C13211m0.m37725F());
            } else {
                stringBuffer.append(C13297a.m38347a(8, c13635gM39718d, context));
            }
        }
        stringBuffer.append("|").append("");
        stringBuffer.append("|").append("");
        stringBuffer.append("|").append("");
        stringBuffer.append("|").append("1");
        stringBuffer.append("|").append(C13006c.m36583m().m36573c());
        stringBuffer.append("|");
        if (C13211m0.m37715A() != 0) {
            stringBuffer.append(C13211m0.m37715A() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append("|").append(1);
        } else {
            stringBuffer.append("|").append("");
        }
        stringBuffer.append("|").append("");
        stringBuffer.append("|").append(str2);
        stringBuffer.append("|").append(C13211m0.m37768r(context));
        stringBuffer.append("|").append(C13211m0.m37766q(context));
        stringBuffer.append("|").append(C13198g.m37690e());
        stringBuffer.append("|").append(C13198g.m37679a());
        stringBuffer.append("|").append(C13885c.f39663b);
        stringBuffer.append("|").append("");
        stringBuffer.append("|").append(C13199g0.m37691a().m37693b());
        stringBuffer.append("|").append(C13211m0.m37753k(context));
        stringBuffer.append("|").append(C13211m0.m37773u(context));
        stringBuffer.append("|").append(C13211m0.m37761o(context));
        stringBuffer.append("|").append(Build.VERSION.RELEASE);
        stringBuffer.append("|").append(Build.VERSION.SDK_INT);
        stringBuffer.append("|").append(C13211m0.m37775v());
        return C13207k0.m37713b(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m38352a(Context context, String str, long j) {
        C13233x0.m37953b(context, str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m38355a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String strSubstring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = f36786a;
                if (map != null && map.containsKey(strSubstring)) {
                    String strValueOf = String.valueOf(f36786a.get(strSubstring));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        str = str.replace(str3, strValueOf + "");
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, C13211m0.m37770s(C13008c.m36588n().m36542d()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m38351a(int i, JSONObject jSONObject, int i2, int i3) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", "2000122");
                jSONObject2.put("filter", i);
                jSONObject2.put("network_type", C13211m0.m37770s(contextM36542d));
                jSONObject2.put("timeout", i2);
                if (jSONObject != null && jSONObject.length() > 0) {
                    jSONObject2.put("hitNode", jSONObject);
                }
                jSONObject2.put("hitRate", i3);
                Map<String, String> map = f36786a;
                if (map != null) {
                    if (map.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                        jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, f36786a.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                    }
                    if (f36786a.containsKey(BidConstants.BID_FILTER_KEY_PLACEMENT_ID)) {
                        jSONObject2.put("placementId", f36786a.get(BidConstants.BID_FILTER_KEY_PLACEMENT_ID));
                    }
                    if (f36786a.containsKey(BidConstants.BID_FILTER_KEY_AD_TYPE)) {
                        jSONObject2.put("adType", f36786a.get(BidConstants.BID_FILTER_KEY_AD_TYPE));
                    }
                }
                C13156d.m37475b().m37488a(jSONObject2);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BidCommon", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m38353a(String str, int i) {
        C13157e c13157e = new C13157e();
        c13157e.m37501a("filter", Integer.valueOf(i));
        c13157e.m37501a("lrid", str);
        C13156d.m37475b().m37492b("2000124", c13157e);
    }

    /* JADX INFO: renamed from: a */
    private static void m38354a(String str, String str2, int i, long j) {
        String str3;
        try {
            if (str.equals("buyerIdStart")) {
                str3 = "m_pipe_buyerid_start";
            } else {
                str3 = "m_pipe_buyerid_end";
            }
            HashMap map = new HashMap();
            map.put("context_id", str2);
            if (str.equals("buyerIdEnd")) {
                map.put("result", Integer.valueOf(i));
                map.put("duration", Long.valueOf(j));
            }
            C12756b.m35099a(str3, map);
        } catch (Throwable th) {
            C13219q0.m37816b("BidCommon", th.getMessage());
        }
    }
}
