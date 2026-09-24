package com.bytedance.sdk.openadsdk.slm;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3410ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3521ka {

    /* JADX INFO: renamed from: ri */
    private static volatile C3521ka f12759ri;

    private C3521ka() {
    }

    /* JADX INFO: renamed from: ik */
    private boolean m15937ik(C3531ka c3531ka) {
        return c3531ka == null;
    }

    /* JADX INFO: renamed from: ka */
    public static void m15938ka() {
        m15952ri("disk_log", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.7
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jM15941ri = C3521ka.m15941ri(file2);
                        j += jM15941ri;
                        jSONObject.put(file2.getName(), jM15941ri);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return C3531ka.m15967lr().m15985ri("disk_log").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15939lr() {
        dzy.m16401lr(new AbstractRunnableC2676ik("showFailLog") { // from class: com.bytedance.sdk.openadsdk.slm.ka.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3521ka.m15942ri().m15958ri("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    C2707ac.m10196ik("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15940lr(final wjv wjvVar) {
        if (C3571ig.m16476ri(wjvVar) == null || TextUtils.isEmpty(wjvVar.mvf())) {
            return;
        }
        m15952ri("download_gecko_start", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.14
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", wjvVar.smj());
                jSONObject.put("channel_name", wjvVar.mvf());
                return C3531ka.m15967lr().m15985ri("download_gecko_start").m15984ri(wjvVar.m14404go()).m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static long m15941ri(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jM15941ri = 0;
        for (File file2 : file.listFiles()) {
            jM15941ri += m15941ri(file2);
        }
        return jM15941ri;
    }

    /* JADX INFO: renamed from: ri */
    public static C3521ka m15942ri() {
        if (f12759ri == null) {
            synchronized (C3521ka.class) {
                if (f12759ri == null) {
                    f12759ri = new C3521ka();
                }
            }
        }
        return f12759ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m15943ri(int i, String str) {
        m15944ri(i, str, 0, (String) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15944ri(final int i, final String str, final int i2, final String str2) {
        m15952ri("ipv6_req", false, new InterfaceC3522lr<InterfaceC3530ik>() { // from class: com.bytedance.sdk.openadsdk.slm.ka.10
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = C11744X3.g.f26257e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return C3531ka.m15967lr().m15985ri("ipv6_req").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15945ri(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        m15952ri("ad_show_cost_time", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.9
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put(ViewHierarchyConstants.TAG_KEY, str);
                jSONObject.put("renderType", i);
                return C3531ka.m15967lr().m15985ri("ad_show_cost_time").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15946ri(final wjv wjvVar) {
        if (wjvVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m15952ri("bidding_receive", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (wjvVar.m14404go() == 3) {
                    jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                }
                return C3531ka.m15967lr().m15985ri("bidding_receive").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15947ri(wjv wjvVar, final long j) {
        if (wjvVar == null) {
            return;
        }
        m15952ri("bidding_load", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.8
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return C3531ka.m15967lr().m15985ri("bidding_load").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15948ri(final wjv wjvVar, final JSONObject jSONObject) {
        if (C3571ig.m16476ri(wjvVar) == null || TextUtils.isEmpty(wjvVar.mvf())) {
            return;
        }
        m15952ri("download_gecko_end", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.15
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", wjvVar.smj());
                jSONObject2.put("channel_name", wjvVar.mvf());
                jSONObject2.put("data", jSONObject);
                return C3531ka.m15967lr().m15985ri("download_gecko_end").m15984ri(wjvVar.m14404go()).m15980lr(jSONObject2.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15949ri(final String str, final C3410ri c3410ri) {
        if (c3410ri == null) {
            return;
        }
        m15952ri(str, false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.13
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObjectM15442ik = c3410ri.m15442ik();
                if (jSONObjectM15442ik == null) {
                    jSONObjectM15442ik = new JSONObject();
                }
                wjv wjvVarM15445ri = c3410ri.m15445ri();
                jSONObjectM15442ik.put("req_id", wjvVarM15445ri.m14424jf());
                AbstractC3405ik abstractC3405ikM15441fi = c3410ri.m15441fi();
                if (abstractC3405ikM15441fi != null) {
                    abstractC3405ikM15441fi.mo15410ri(jSONObjectM15442ik);
                }
                return C3531ka.m15967lr().m15985ri(str).m15984ri(wjvVarM15445ri.m14404go()).m15980lr(jSONObjectM15442ik.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15950ri(final String str, final boolean z) {
        m15952ri("img_error_param", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.11
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return C3531ka.m15967lr().m15985ri("img_error_param").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15951ri(String str, boolean z, int i, InterfaceC3522lr interfaceC3522lr) {
        if (!TextUtils.isEmpty(str) && C3520ik.m15936ri(str, i)) {
            C3299nr.m14637fi().mo15674ri(interfaceC3522lr, z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15952ri(String str, boolean z, InterfaceC3522lr interfaceC3522lr) {
        m15951ri(str, z, -1, interfaceC3522lr);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15953ri(final boolean z) {
        m15952ri("web_container_reuse", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.12
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z ? 1 : 0);
                return C3531ka.m15967lr().m15985ri("web_container_reuse").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public void m15954ik() {
        m15952ri("blind_mode_status", true, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.5
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                return C3531ka.m15967lr().m15985ri("blind_mode_status");
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public void m15955lr(final C3531ka c3531ka) {
        if (m15937ik(c3531ka)) {
            return;
        }
        c3531ka.m15985ri("show_backup_endcard");
        C3299nr.m14637fi().mo15673ri(new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.17
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                return c3531ka;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15956ri(final long j, final long j2) {
        final long j3 = j2 - j;
        m15952ri("general_label", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.2
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                int i = !C3332vr.f11697lr.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return C3531ka.m15967lr().m15985ri("general_label").m15982mj(String.valueOf(j3)).m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15957ri(final C3531ka c3531ka) {
        if (m15937ik(c3531ka)) {
            return;
        }
        c3531ka.m15985ri("express_ad_render");
        C3299nr.m14637fi().mo15673ri(new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.16
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                return c3531ka;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15958ri(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        m15952ri(str, false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.4
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                return C3531ka.m15967lr().m15985ri(str).m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15959ri(final JSONObject jSONObject) {
        if (jSONObject == null) {
            C2707ac.m10205ri("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            C2707ac.m10205ri("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            C2707ac.m10207ri("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            m15952ri("ad_revenue", true, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ka.6
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", C3089aw.m12373ik(C3299nr.m14642ri()));
                        String strM12377ri = "";
                        try {
                            if (C3089aw.m12377ri(C3299nr.m14642ri()) != null) {
                                strM12377ri = C3089aw.m12377ri(C3299nr.m14642ri());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strM12377ri);
                        jSONObject.put(C11540L6.f24917H, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return C3531ka.m15967lr().m15985ri("ad_revenue").m15980lr(jSONObject.toString());
                }
            });
        }
    }
}
