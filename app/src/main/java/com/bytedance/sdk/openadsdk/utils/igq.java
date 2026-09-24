package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.p165mj.p166lr.C2678lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class igq {

    /* JADX INFO: renamed from: di */
    private static int f13176di = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: fi */
    private static String f13177fi;

    /* JADX INFO: renamed from: lr */
    public static boolean f13180lr;

    /* JADX INFO: renamed from: ri */
    public static boolean f13181ri;

    /* JADX INFO: renamed from: ik */
    private static final CharSequence f13178ik = "amigo";

    /* JADX INFO: renamed from: ka */
    private static final CharSequence f13179ka = "funtouch";
    private static final ConcurrentHashMap<String, String> xha = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.igq$ri */
    public static class CallableC3573ri implements Callable<String> {

        /* JADX INFO: renamed from: ri */
        private final String f13183ri;

        public CallableC3573ri(String str) {
            this.f13183ri = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) igq.xha.get(this.f13183ri);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strM16508ik = igq.m16508ik(this.f13183ri);
            System.currentTimeMillis();
            if (strM16508ik != null) {
                igq.xha.put(this.f13183ri, strM16508ik);
            }
            return strM16508ik;
        }
    }

    /* JADX INFO: renamed from: ac */
    public static boolean m16501ac() {
        try {
            return (!TextUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("huawei")) || (!TextUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("huawei"));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: aw */
    public static String m16502aw() {
        String strBgr = bgr();
        if (strBgr == null || !strBgr.toLowerCase().contains("emotionui")) {
            return "";
        }
        return strBgr + "_" + Build.DISPLAY;
    }

    public static String bgr() {
        return m16509ka("ro.build.version.emui");
    }

    /* JADX INFO: renamed from: bu */
    public static String m16503bu() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    /* JADX INFO: renamed from: co */
    public static String m16504co() {
        if (!m16506fi()) {
            return "";
        }
        return "miui_" + m16509ka("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: di */
    public static String m16505di() {
        return m16509ka("ro.vivo.os.build.display.id") + "_" + m16509ka("ro.vivo.product.version");
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m16506fi() {
        if (!f13180lr) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f13181ri = true;
                    f13180lr = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f13180lr = true;
        }
        return f13181ri;
    }

    /* JADX INFO: renamed from: ik */
    public static String m16507ik() {
        return m16509ka("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static String m16508ik(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                            bufferedReader.close();
                        } catch (IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return line;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                C2707ac.m10206ri("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        C2707ac.m10206ri("ToolUtils", "Exception while closing InputStream", e);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (IOException e2) {
                    C2707ac.m10206ri("ToolUtils", "Exception while closing InputStream", e2);
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            return line;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static String jbs() {
        return Build.DISPLAY + "_" + m16509ka("ro.gn.sv.version");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ka */
    private static String m16509ka(String str) {
        String str2;
        String str3 = xha.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (TextUtils.isEmpty("")) {
                final C2678lr c2678lr = new C2678lr(new CallableC3573ri(str), 5, 2);
                dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.igq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c2678lr.run();
                    }
                });
                str2 = (String) c2678lr.get(1L, TimeUnit.SECONDS);
            } else {
                str2 = "";
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16510ka() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16512lr() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m16513mj() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(f13178ik);
    }

    /* JADX INFO: renamed from: nr */
    public static boolean m16514nr() {
        if (f13176di == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strM16462mj = C3571ig.m16462mj("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strM16462mj)) {
                f13176di = 0;
            } else {
                f13176di = 1;
            }
        }
        return f13176di == 1;
    }

    /* JADX INFO: renamed from: qt */
    public static String m16515qt() {
        if (!m16518sf()) {
            return "";
        }
        return "eui_" + m16509ka("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: ri */
    public static String m16516ri() {
        if (!TextUtils.isEmpty(f13177fi)) {
            return f13177fi;
        }
        String strM14673ri = C3304qt.m14673ri("sdk_local_rom_info", 604800000L);
        f13177fi = strM14673ri;
        if (TextUtils.isEmpty(strM14673ri)) {
            String strM16519uq = m16519uq();
            f13177fi = strM16519uq;
            C3304qt.m14677ri("sdk_local_rom_info", strM16519uq);
        }
        return f13177fi;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16517ri(String str) {
        if (TextUtils.isEmpty(str)) {
            str = bgr();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || m16501ac();
    }

    /* JADX INFO: renamed from: sf */
    public static boolean m16518sf() {
        return !TextUtils.isEmpty(m16509ka("ro.letv.release.version"));
    }

    public static String slm() {
        if (m16520vr()) {
            try {
                return "smartisan_".concat(String.valueOf(m16509ka("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String tan() {
        if (!m16514nr()) {
            return "";
        }
        return "coloros_" + m16509ka(C3571ig.m16462mj("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: uq */
    private static String m16519uq() {
        if (m16520vr()) {
            return slm();
        }
        if (m16506fi()) {
            return m16504co();
        }
        if (m16512lr()) {
            return m16503bu();
        }
        if (m16514nr()) {
            return tan();
        }
        String strM16502aw = m16502aw();
        if (!TextUtils.isEmpty(strM16502aw)) {
            return strM16502aw;
        }
        if (xha()) {
            return m16505di();
        }
        if (m16513mj()) {
            return jbs();
        }
        if (m16510ka()) {
            return m16507ik();
        }
        String strM16515qt = m16515qt();
        return !TextUtils.isEmpty(strM16515qt) ? strM16515qt : Build.DISPLAY;
    }

    /* JADX INFO: renamed from: vr */
    public static boolean m16520vr() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean xha() {
        String strM16509ka = m16509ka("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strM16509ka) && strM16509ka.toLowerCase().contains(f13179ka);
    }
}
