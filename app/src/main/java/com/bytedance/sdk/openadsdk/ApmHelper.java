package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.common.C2933di;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3213fr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.ironsource.C12460ra;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.tiktok.util.UrlConst;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ApmHelper {

    /* JADX INFO: renamed from: di */
    private static C2750ri f7893di;

    /* JADX INFO: renamed from: fi */
    private static InterfaceC2749lr f7894fi;

    /* JADX INFO: renamed from: ik */
    private static String f7895ik;

    /* JADX INFO: renamed from: ka */
    private static boolean f7896ka;

    /* JADX INFO: renamed from: lr */
    private static final AtomicBoolean f7897lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    private static volatile boolean f7898ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ApmHelper$lr */
    private interface InterfaceC2749lr {
        /* JADX INFO: renamed from: ri */
        void mo10460ri(String str, String str2, Throwable th);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ApmHelper$ri */
    private static class C2750ri {

        /* JADX INFO: renamed from: ik */
        public final Throwable f7906ik;

        /* JADX INFO: renamed from: lr */
        public final String f7907lr;

        /* JADX INFO: renamed from: ri */
        public final String f7908ri;

        public C2750ri(String str, String str2, Throwable th) {
            this.f7908ri = str;
            this.f7907lr = str2;
            this.f7906ik = th;
        }
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
            jSONObject.put("ipv6", C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", C3299nr.m14639ka().m14843fe());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new C3213fr(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = ExifInterface.GPS_MEASUREMENT_3D;
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m10448ik(String str, String str2) {
        m10451lr(str, str2);
    }

    public static void initAPM() {
        if (C2933di.m11291ri()) {
            return;
        }
        try {
            String strM14689ka = C3304qt.m14669lr().m14689ka();
            if (TextUtils.isEmpty(strM14689ka)) {
                return;
            }
            initApm(C3299nr.m14642ri(), strM14689ka);
        } catch (Exception unused) {
        }
    }

    public static void initApm(final Context context, final String str) {
        if (C3307lr.m14718ri().m14722fi() || !f7897lr.compareAndSet(false, true) || f7898ri) {
            return;
        }
        dzy.m16409ri(new AbstractRunnableC2676ik("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.f7898ri) {
                    C3322sf c3322sfM14639ka = C3299nr.m14639ka();
                    boolean unused = ApmHelper.f7896ka = c3322sfM14639ka.qmx();
                    String strM16464nr = C3571ig.m16464nr();
                    if (ApmHelper.f7896ka && !TextUtils.isEmpty(strM16464nr)) {
                        String unused2 = ApmHelper.f7895ik = str;
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String strM12377ri = C3089aw.m12377ri(context);
                        try {
                            Npth.setCrashWaitTime(C3606fi.m16703ri("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", C3299nr.m14639ka().tpb());
                                }
                            });
                            final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7911L, BuildConfig.VERSION_NAME, strArr);
                            monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> mapXha = ApmHelper.xha();
                                    if (mapXha.containsKey("render_type")) {
                                        monitorCrashInitSDK.addTags("render_type", mapXha.get("render_type"));
                                        return mapXha;
                                    }
                                    monitorCrashInitSDK.addTags("render_type", "-2");
                                    return mapXha;
                                }
                            });
                            if (c3322sfM14639ka.m14894xm()) {
                                monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            monitorCrashInitSDK.config().setDeviceId(strM12377ri);
                            monitorCrashInitSDK.setReportUrl(strM16464nr);
                            monitorCrashInitSDK.addTags("host_appid", str);
                            monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            InterfaceC2749lr unused3 = ApmHelper.f7894fi = new InterfaceC2749lr() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.InterfaceC2749lr
                                /* JADX INFO: renamed from: ri */
                                public void mo10460ri(String str2, String str3, Throwable th) {
                                    monitorCrashInitSDK.reportCustomErr(str2, str3, th);
                                }
                            };
                            boolean unused4 = ApmHelper.f7898ri = true;
                            ApmHelper.m10448ik(strM12377ri, strM16464nr);
                            C2750ri c2750ri = ApmHelper.f7893di;
                            C2750ri unused5 = ApmHelper.f7893di = null;
                            if (c2750ri != null) {
                                ApmHelper.f7894fi.mo10460ri(c2750ri.f7908ri, c2750ri.f7907lr, c2750ri.f7906ik);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.f7898ri = false;
                        }
                    }
                }
                ApmHelper.f7897lr.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return f7898ri;
    }

    /* JADX INFO: renamed from: lr */
    private static JSONObject m10450lr(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f7895ik);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(C11540L6.f24911F, C11744X3.f26142d);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C12460ra.f31825b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            C2707ac.m10196ik("ApmHelper", e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m10451lr(String str, String str2) {
        if (C3307lr.m14718ri().m14722fi() || TextUtils.isEmpty(str2)) {
            return;
        }
        C3299nr.m14638ik().mo12643ri(m10450lr(str), UrlConst.HTTPS + str2 + "/monitor/collect/c/session?version_code=7911&device_platform=android&aid=10000001");
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        InterfaceC2749lr interfaceC2749lr = f7894fi;
        if (interfaceC2749lr != null) {
            interfaceC2749lr.mo10460ri(str, str2, th);
        } else {
            f7893di = new C2750ri(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (f7896ka) {
            m10451lr(C3089aw.m12377ri(C3299nr.m14642ri()), C3571ig.m16464nr());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> xha() {
        HashMap map = new HashMap();
        wjv wjvVarM16534ik = C3578lr.m16534ik();
        if (wjvVarM16534ik != null) {
            map.put("adType", String.valueOf(wjvVarM16534ik.m14404go()));
            map.put(C12460ra.f31825b, String.valueOf(wjvVarM16534ik.m14457nq()));
            map.put("cid", wjvVarM16534ik.m14533tn());
            map.put("reqId", wjvVarM16534ik.m14424jf());
            map.put("rit", wjvVarM16534ik.hcw(C11794a2.f26725f));
            int iHpn = wjvVarM16534ik.hpn();
            if (wjvVarM16534ik.ajz() != 2) {
                iHpn = -1;
            }
            map.put("render_type", String.valueOf(iHpn));
        }
        return map;
    }
}
