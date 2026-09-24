package com.bytedance.sdk.openadsdk.component.xha;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.C2949nr;
import com.bytedance.sdk.openadsdk.component.C2958di;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.internal.NativeProtocol;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3087ri {

    /* JADX INFO: renamed from: lr */
    private static Boolean f9702lr;

    /* JADX INFO: renamed from: ri */
    private static AtomicInteger f9703ri = new AtomicInteger(0);

    /* JADX INFO: renamed from: ik */
    private static Integer f9701ik = null;

    /* JADX INFO: renamed from: co */
    public static int m12348co() {
        if (f9701ik == null) {
            int iM16703ri = C3606fi.m16703ri("aoa_preload_size", 10);
            Integer numValueOf = Integer.valueOf(iM16703ri);
            f9701ik = numValueOf;
            numValueOf.getClass();
            if (iM16703ri < 0) {
                f9701ik = 10;
            }
        }
        Objects.toString(f9701ik);
        return f9701ik.intValue();
    }

    /* JADX INFO: renamed from: di */
    public static boolean m12349di() {
        return C3299nr.m14639ka().m14880sf() == 1;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m12350fi() {
        return C3606fi.m16703ri("aoa_cache_opt_enable", 0) == 1;
    }

    /* JADX INFO: renamed from: ik */
    public static int m12351ik() {
        return f9703ri.incrementAndGet();
    }

    public static int jbs() {
        int iM16703ri = C3606fi.m16703ri("aoa_cache_refresh_time", 72000000);
        if (iM16703ri < 60000) {
            return 72000000;
        }
        return iM16703ri;
    }

    /* JADX INFO: renamed from: ka */
    public static int m12352ka() {
        return C3332vr.f11697lr.get() ? 1 : 2;
    }

    /* JADX INFO: renamed from: lr */
    public static long m12353lr() {
        return Build.VERSION.SDK_INT >= 24 ? SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime() : Process.getElapsedCpuTime();
    }

    /* JADX INFO: renamed from: lr */
    public static File m12354lr(String str) {
        return new File(C2958di.m11449ri(C3299nr.m14642ri()).m11456lr(), str);
    }

    /* JADX INFO: renamed from: mj */
    public static int m12355mj() {
        if (m12350fi()) {
            return C3606fi.m16703ri("aoa_cache_count", 3);
        }
        return 1;
    }

    /* JADX INFO: renamed from: qt */
    public static int m12356qt() {
        int iM16703ri = C3606fi.m16703ri("aoa_cache_poll_interval", Constants.ONE_HOUR);
        return iM16703ri < 60000 ? Constants.ONE_HOUR : iM16703ri;
    }

    /* JADX INFO: renamed from: ri */
    public static int m12357ri(wjv wjvVar, int i) {
        return i - wjvVar.m14445mf();
    }

    /* JADX INFO: renamed from: ri */
    public static File m12358ri(String str) {
        return new File(CacheDirFactory.getICacheDir(0).mo6273lr() + File.separator + str);
    }

    /* JADX INFO: renamed from: ri */
    public static String m12359ri() {
        return C2958di.m11449ri(C3299nr.m14642ri()).m11456lr().getAbsolutePath();
    }

    /* JADX INFO: renamed from: ri */
    public static void m12360ri(int i) {
        Map<String, AdSlot> mapM11391ik;
        if (!m12350fi() || (mapM11391ik = C2949nr.m11382ri().m11391ik()) == null || mapM11391ik.size() == 0) {
            return;
        }
        mapM11391ik.size();
        for (AdSlot adSlot : mapM11391ik.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i);
                    C2958di.m11449ri(C3299nr.m14642ri()).m11463ri(adSlot);
                } catch (Throwable unused) {
                    Objects.toString(adSlot);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12361ri(Context context) {
        try {
            C2958di.m11449ri(context).m11460ri();
            if (m12350fi()) {
                C2949nr.m11382ri().m11393lr();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12362ri(File file) {
        if (file == null) {
            return;
        }
        try {
            xha.m10329lr(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12363ri(JSONObject jSONObject, int i, boolean z) {
        try {
            String strM14693mj = C3304qt.m14669lr().m14693mj();
            int iJbs = C3304qt.m14669lr().jbs();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, strM14693mj);
            if (!z) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iJbs)));
            } else if (C3304qt.m14669lr().jbs() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", C3299nr.m14639ka().wjv(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            C2707ac.m10196ik("TTAppOpenUtils", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m12364ri(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }

    /* JADX INFO: renamed from: sf */
    public static boolean m12365sf() {
        if (f9702lr == null) {
            boolean z = false;
            boolean z2 = C3606fi.m16703ri("open_ad_ugen_backup_enable", 0) == 1;
            boolean z3 = C3606fi.m16703ri("express_backup_type", 0) == 1;
            if (z2 && z3) {
                z = true;
            }
            f9702lr = Boolean.valueOf(z);
        }
        Objects.toString(f9702lr);
        return f9702lr.booleanValue();
    }

    public static int xha() {
        return f9703ri.get() == 0 ? C3606fi.m16703ri("aoa_cold_load_timeout", 3500) : C3606fi.m16703ri("aoa_hot_load_timeout", 3500);
    }
}
