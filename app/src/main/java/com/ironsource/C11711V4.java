package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.V4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11711V4 {

    /* JADX INFO: renamed from: a */
    private static final String f26014a = "V4";

    /* JADX INFO: renamed from: a */
    public static JSONObject m27653a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.m33642i(f26014a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.m33642i(f26014a, "add LAT");
                jSONObject.put(C11744X3.j.f26419M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m27658b(Context context) {
        JSONObject jSONObject = new JSONObject();
        m27655a(jSONObject);
        m27664d(context, jSONObject);
        m27663c(jSONObject);
        m27659b(context, jSONObject);
        m27667g(context, jSONObject);
        m27665e(context, jSONObject);
        m27660b(jSONObject);
        m27666f(context, jSONObject);
        m27662c(context, jSONObject);
        m27654a(context, jSONObject);
        m27668h(context, jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private static void m27663c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26476y), SDKUtils.encodeString(String.valueOf(C11455Gb.m25891U().mo25842a().mo27903h())));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m27664d(Context context, JSONObject jSONObject) {
        try {
            String strM27576b = C11693U3.m27576b(context);
            String strM27579d = C11693U3.m27579d(context);
            if (!TextUtils.isEmpty(strM27579d)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strM27579d));
            }
            if (!TextUtils.isEmpty(strM27576b) && !strM27576b.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strM27576b));
            }
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26473v), C11693U3.m27580e(context));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m27665e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26422P), C11728W4.m27793b(context).m27795a(context));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m27666f(Context context, JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            if (m27657a(C11744X3.j.f26453k0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26453k0), interfaceC12582w7Mo25842a.mo27872D(context));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m27667g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C11540L6.f24955Z0), C11455Gb.m25891U().mo25842a().mo27879K(context));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m27668h(Context context, JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            if (m27657a(C11744X3.j.f26459n0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26459n0), interfaceC12582w7Mo25842a.mo27906i(context));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m27659b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26431Y), C11455Gb.m25891U().mo25842a().mo27911l(context));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m27662c(Context context, JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            if (m27657a(C11744X3.j.f26455l0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26455l0), interfaceC12582w7Mo25842a.mo27873E(context));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m27660b(JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            if (m27657a(C11744X3.j.f26449i0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26449i0), interfaceC12582w7Mo25842a.mo27908j());
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m27661c(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        C11728W4 c11728w4M27793b = C11728W4.m27793b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strM27799d = c11728w4M27793b.m27799d();
            if (strM27799d != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strM27799d));
            }
            String strM27798c = c11728w4M27793b.m27798c();
            if (strM27798c != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strM27798c));
            }
            String strM27800e = c11728w4M27793b.m27800e();
            if (strM27800e != null) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26456m), SDKUtils.encodeString(strM27800e));
            }
            String strM27801f = c11728w4M27793b.m27801f();
            if (strM27801f != null) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26458n), strM27801f.replaceAll("[^0-9/.]", ""));
            }
            String strM27801f2 = c11728w4M27793b.m27801f();
            if (strM27801f2 != null) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26460o), SDKUtils.encodeString(strM27801f2));
            }
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26462p), String.valueOf(c11728w4M27793b.m27796a()));
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26464q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (c11728w4M27793b.m27797b() != null && c11728w4M27793b.m27797b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26466r), SDKUtils.encodeString(c11728w4M27793b.m27797b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26475x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (m27657a(C11744X3.j.f26451j0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26451j0), SDKUtils.encodeString(String.valueOf(interfaceC12582w7Mo25842a.mo27924r(context))));
            }
            String strM25655g = C11409E1.m25655g(context);
            if (!TextUtils.isEmpty(strM25655g)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strM25655g));
            }
            String strValueOf = String.valueOf(interfaceC12582w7Mo25842a.mo27923r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26417K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(interfaceC12582w7Mo25842a.mo27920p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26421O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C11753Xc.m27956e(context));
            jSONObject.put("mcc", C11676T3.m27501b(context));
            jSONObject.put("mnc", C11676T3.m27502c(context));
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26425S), C11676T3.m27505f(context));
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26424R), SDKUtils.encodeString(C11676T3.m27506g(context)));
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26428V), C11409E1.m25654f(context));
            jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26430X), C11409E1.m25651d(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C11409E1.m25647b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), C11753Xc.m27955d(context));
            String strM25653e = C11409E1.m25653e(context);
            if (!TextUtils.isEmpty(strM25653e)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26437c0), SDKUtils.encodeString(strM25653e));
            }
            jSONObject.put(C11744X3.j.f26439d0, SDKUtils.encodeString(String.valueOf(interfaceC12582w7Mo25842a.mo27883a())));
            jSONObject.put(C11744X3.j.f26441e0, SDKUtils.encodeString(String.valueOf(interfaceC12582w7Mo25842a.mo27913m())));
            String strMo27876H = interfaceC12582w7Mo25842a.mo27876H(context);
            if (!TextUtils.isEmpty(strMo27876H)) {
                jSONObject.put("icc", strMo27876H);
            }
            String strMo27895d = interfaceC12582w7Mo25842a.mo27895d();
            if (!TextUtils.isEmpty(strMo27895d)) {
                jSONObject.put("tz", SDKUtils.encodeString(strMo27895d));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m27656a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m27657a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    /* JADX INFO: renamed from: a */
    private static void m27655a(JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            m27656a(jSONObject, C11744X3.j.f26414H, String.valueOf(interfaceC12582w7Mo25842a.mo27909k()));
            m27656a(jSONObject, C11744X3.j.f26415I, String.valueOf(interfaceC12582w7Mo25842a.mo27892c()));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m27654a(Context context, JSONObject jSONObject) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        try {
            if (m27657a(C11744X3.j.f26457m0)) {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26457m0), interfaceC12582w7Mo25842a.mo27900f(context));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
