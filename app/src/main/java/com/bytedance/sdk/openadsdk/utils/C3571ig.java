package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.common.C2946ka;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.C3285mj;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.tan.C3537ri;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C12460ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.util.UrlConst;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig */
/* JADX INFO: loaded from: classes3.dex */
public class C3571ig {

    /* JADX INFO: renamed from: aw */
    private static final byte[] f13157aw;
    private static String bgr;

    /* JADX INFO: renamed from: co */
    private static final byte[] f13158co;

    /* JADX INFO: renamed from: ri */
    public static Integer f13166ri;

    /* JADX INFO: renamed from: sf */
    private static final HashSet<String> f13167sf;

    /* JADX INFO: renamed from: vr */
    private static String f13168vr;

    /* JADX INFO: renamed from: lr */
    private static final ExecutorService f13163lr = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ik */
    private static volatile boolean f13161ik = false;

    /* JADX INFO: renamed from: ka */
    private static final AtomicInteger f13162ka = new AtomicInteger(0);

    /* JADX INFO: renamed from: fi */
    private static volatile String f13160fi = "";

    /* JADX INFO: renamed from: di */
    private static final ReentrantLock f13159di = new ReentrantLock();
    private static String xha = null;

    /* JADX INFO: renamed from: mj */
    private static String f13164mj = null;
    private static String jbs = null;

    /* JADX INFO: renamed from: qt */
    private static final HashSet<String> f13165qt = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(C3571ig.f13160fi)) {
                    C2634di c2634di = new C2634di(C3299nr.m14642ri(), C2634di.ik.USER_AGENT);
                    c2634di.setWebViewClient(new C2634di.ri());
                    String unused = C3571ig.f13160fi = c2634di.getUserAgentString();
                    C2735zf.m10345ri(c2634di);
                }
            } catch (Exception e) {
                C2707ac.m10206ri("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                C2707ac.m10206ri("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig$ik */
    private static class ik {

        /* JADX INFO: renamed from: ri */
        private static final int f13169ri;

        static {
            C2707ac.m10205ri("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                Class<?> cls = Class.forName("androidx.recyclerview.widget.RecyclerView$ViewHolder");
                if (cls == null) {
                    i = 1;
                } else if (cls.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i = 0;
                }
            } catch (ClassNotFoundException unused) {
            } catch (NoSuchMethodException unused2) {
            }
            f13169ri = i;
            C2707ac.m10205ri("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig$lr */
    public static class lr {

        /* JADX INFO: renamed from: lr */
        public final int f13170lr;

        /* JADX INFO: renamed from: ri */
        public final ComponentName f13171ri;

        public lr(ComponentName componentName, int i) {
            this.f13171ri = componentName;
            this.f13170lr = i;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig$ri */
    public static class ri implements Callable<String> {

        /* JADX INFO: renamed from: ri */
        private final int f13172ri;

        ri(int i) {
            this.f13172ri = i;
        }

        /* JADX INFO: renamed from: ik */
        private synchronized String m16498ik() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ig.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = C3571ig.m16495xd();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C2707ac.m10196ik("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }

        /* JADX INFO: renamed from: lr */
        private String m16499lr() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            C3215ik.m13505ri().m13512ri("android_system_ua", property);
                            return property;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C2707ac.m10196ik("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strM16499lr;
            strM16499lr = "unKnow";
            int i = this.f13172ri;
            if (i == 1) {
                strM16499lr = m16498ik();
            } else if (i == 2) {
                strM16499lr = m16499lr();
            }
            return strM16499lr;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f13167sf = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        f13166ri = null;
        f13158co = new byte[]{108, 111, 97, 100, 105, 110, 103};
        f13157aw = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    /* JADX INFO: renamed from: ac */
    public static String m16428ac() {
        String strM14816jm = C3322sf.m14816jm();
        if (!TextUtils.isEmpty(strM14816jm)) {
            return strM14816jm;
        }
        String strM14854jc = C3299nr.m14639ka().m14854jc();
        return TextUtils.isEmpty(strM14854jc) ? C3594uq.m16662ri() : strM14854jc;
    }

    /* JADX INFO: renamed from: aw */
    public static long m16429aw() {
        return C3215ik.m13505ri().m13507lr("free_internal_storage", 0L).longValue();
    }

    /* JADX INFO: renamed from: ay */
    public static int m16430ay() {
        try {
            String id = TimeZone.getDefault().getID();
            if (f13165qt.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/") || f13167sf.contains(id)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static long bgr() {
        return C3215ik.m13505ri().m13507lr("total_sdcard_storage", 0L).longValue();
    }

    /* JADX INFO: renamed from: bu */
    public static boolean m16431bu() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: co */
    public static long m16432co() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: co */
    private static String m16433co(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C12460ra.f31825b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", xha()).toString();
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: di */
    public static int m16434di(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            Integer.valueOf(i);
            return i;
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.getMessage());
            return i;
        }
    }

    /* JADX INFO: renamed from: di */
    public static synchronized String m16435di() {
        Context contextM14642ri;
        if (TextUtils.isEmpty(xha) && (contextM14642ri = C3299nr.m14642ri()) != null) {
            try {
                xha = contextM14642ri.getPackageName();
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
            }
        }
        return xha;
    }

    /* JADX INFO: renamed from: di */
    public static String m16436di(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith(ProxyConfig.MATCH_HTTP) ? UrlConst.HTTPS.concat(String.valueOf(str)) : str;
    }

    /* JADX INFO: renamed from: di */
    public static boolean m16437di(int i) {
        return i == 6;
    }

    /* JADX INFO: renamed from: dw */
    public static String m16438dw() {
        String str = f13168vr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(f13157aw);
        f13168vr = str2;
        return str2;
    }

    private static boolean dzy() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    public static String m16439fi() {
        return C3593su.m16658ri();
    }

    /* JADX INFO: renamed from: fi */
    public static String m16440fi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C3299nr.m14639ka().m14857kt();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith(ProxyConfig.MATCH_HTTP) ? UrlConst.HTTPS.concat(String.valueOf(str)) : str;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m16441fi(int i) {
        return i == 5;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m16442fi(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: fr */
    public static int m16443fr() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean igq() {
        return f13162ka.get() == 1;
    }

    public static String ihz() {
        return String.format(Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, "log.byteoversea.com/service/2/app_log_test/");
    }

    /* JADX INFO: renamed from: ik */
    public static String m16444ik(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i != 7) {
            return i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    /* JADX INFO: renamed from: ik */
    public static String m16445ik(Context context) {
        try {
            return (Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0) : Locale.getDefault()).getLanguage();
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: ik */
    public static String m16446ik(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C2707ac.m10196ik("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: ik */
    public static void m16447ik() {
        C3521ka.m15952ri("recycle_version_not_valid", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.utils.ig.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", C3571ig.ory());
                return C3531ka.m15967lr().m15985ri("recycle_version_not_valid").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m16448ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return true;
        }
        int iM14858lr = C3299nr.m14639ka().m14858lr(wjvVar.m14545ur());
        int iM10255ik = C2724nr.m10255ik(C3299nr.m14642ri());
        if (iM14858lr == 1) {
            return m16451ka(iM10255ik);
        }
        if (iM14858lr == 2) {
            return m16441fi(iM10255ik) || m16451ka(iM10255ik) || m16437di(iM10255ik);
        }
        if (iM14858lr != 3) {
            return iM14858lr != 5 || m16451ka(iM10255ik) || m16437di(iM10255ik);
        }
        return false;
    }

    public static String jbs() {
        try {
            ActivityManager activityManager = (ActivityManager) C3299nr.m14642ri().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jbs(Context context) {
        try {
            AtomicInteger atomicInteger = f13162ka;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (!zIsEnabled || !zIsTouchExplorationEnabled) {
                atomicInteger.set(2);
            } else {
                atomicInteger.set(1);
                C3521ka.m15942ri().m15954ik();
            }
        } catch (Exception unused) {
            f13162ka.set(2);
        }
    }

    public static boolean jbs(String str) {
        if (C3332vr.m14975fi()) {
            return true;
        }
        C2707ac.m10197ik("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public static String m16449ka() {
        if (!TextUtils.isEmpty(f13160fi)) {
            return f13160fi;
        }
        C3537ri.m16090ri(C3299nr.m14642ri());
        String strM14673ri = C3304qt.m14673ri("sdk_local_web_ua", SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        f13160fi = strM14673ri;
        if (TextUtils.isEmpty(strM14673ri)) {
            ReentrantLock reentrantLock = f13159di;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(f13160fi)) {
                            f13160fi = WebSettings.getDefaultUserAgent(C3299nr.m14642ri());
                        }
                        C3304qt.m14677ri("sdk_local_web_ua", f13160fi);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        C2707ac.m10206ri("TTAD.ToolUtils", "", e);
                        f13159di.unlock();
                    } catch (NoClassDefFoundError e2) {
                        C2707ac.m10206ri("TTAD.ToolUtils", "", e2);
                        f13159di.unlock();
                    }
                }
            } catch (Throwable th) {
                f13159di.unlock();
                throw th;
            }
        }
        return f13160fi;
    }

    /* JADX INFO: renamed from: ka */
    public static String m16450ka(String str) {
        return m16477ri(str, false, false);
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16451ka(int i) {
        return i == 4;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16452ka(Context context) {
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16453ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.evm() && (wjvVar.m14529sz() == 4 || wjvVar.m14529sz() == 5);
    }

    /* JADX INFO: renamed from: lr */
    public static int m16454lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return -1;
        }
        int iLji = wjvVar.lji();
        int i = 1;
        if (iLji == 1) {
            return 2;
        }
        if (iLji == 3) {
            return 4;
        }
        if (iLji != 5) {
            i = 7;
            if (iLji != 7) {
                return iLji != 8 ? -1 : 5;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: lr */
    public static long m16455lr(Context context) {
        return C3215ik.m13505ri().m13507lr("total_internal_storage", 0L).longValue();
    }

    /* JADX INFO: renamed from: lr */
    public static long m16456lr(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static String m16457lr() {
        String str = "unKnow";
        C3537ri.m16090ri(C3299nr.m14642ri());
        try {
            String strM13508lr = C3215ik.m13505ri().m13508lr("android_system_ua", "unKnow");
            if (strM13508lr != null && !"unKnow".equals(strM13508lr)) {
                return strM13508lr;
            }
            FutureTask futureTask = new FutureTask(new ri(2));
            f13163lr.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        C2707ac.m10196ik("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    /* JADX INFO: renamed from: lr */
    public static String m16458lr(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i != 5) {
            return i != 7 ? "unknow" : "rewarded_video_landingpage";
        }
        return "fullscreen_interstitial_ad";
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16459lr(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                C2722lr.m10241ri(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: mj */
    public static int m16460mj(Context context) {
        return xha(C2728su.m10293ri(context, 0L));
    }

    /* JADX INFO: renamed from: mj */
    public static synchronized String m16461mj() {
        if (TextUtils.isEmpty(jbs) && C3299nr.m14642ri() != null) {
            try {
                PackageInfo packageInfo = C3299nr.m14642ri().getPackageManager().getPackageInfo(m16435di(), 0);
                f13164mj = String.valueOf(packageInfo.versionCode);
                jbs = packageInfo.versionName;
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
            }
        }
        return jbs;
    }

    /* JADX INFO: renamed from: mj */
    public static String m16462mj(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m16463mj(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    /* JADX INFO: renamed from: nr */
    public static String m16464nr() {
        String strSrn = C3299nr.m14639ka().srn();
        return TextUtils.isEmpty(strSrn) ? C3594uq.m16662ri() : strSrn;
    }

    public static int ory() {
        return ik.f13169ri;
    }

    /* JADX INFO: renamed from: qt */
    public static int m16466qt(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = f13166ri;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        Integer numValueOf = Integer.valueOf(size);
        f13166ri = numValueOf;
        numValueOf.getClass();
        return size;
    }

    /* JADX INFO: renamed from: qt */
    public static String m16467qt() {
        return C3215ik.m13505ri().m13508lr("total_memory", "0");
    }

    /* JADX INFO: renamed from: qt */
    public static void m16468qt(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        C2707ac.m10197ik("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    /* JADX INFO: renamed from: ri */
    public static int m16469ri(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m16470ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Intent m16471ri(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* JADX INFO: renamed from: ri */
    public static C2934fi m16472ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C2634di c2634di, Context context, String str) {
        int iM14529sz = wjvVar.m14529sz();
        if (wjvVar == null || !wjvVar.evm()) {
            return null;
        }
        if (iM14529sz != 1 && iM14529sz != 3) {
            return null;
        }
        c2634di.m9788ri(true, (View) new C2946ka(context));
        return new C2934fi(wjvVar, c2634di, str, false);
    }

    /* JADX INFO: renamed from: ri */
    public static lr m16473ri(Context context, Intent intent) {
        return new lr(null, 0);
    }

    /* JADX INFO: renamed from: ri */
    public static String m16474ri(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    /* JADX INFO: renamed from: ri */
    public static String m16475ri(Context context) {
        String strM13508lr = C3215ik.m13505ri().m13508lr("total_memory", (String) null);
        if (strM13508lr != null && m16456lr(strM13508lr) > 0) {
            return strM13508lr;
        }
        String strM16446ik = m16446ik("MemTotal");
        if (m16456lr(strM16446ik) <= 0) {
            strM16446ik = jbs();
        }
        C3215ik.m13505ri().m13512ri("total_memory", strM16446ik);
        return strM16446ik;
    }

    /* JADX INFO: renamed from: ri */
    public static String m16476ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        try {
            return m16444ik(wjvVar.lji());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m16477ri(String str, boolean z, boolean z2) {
        if (str != null && !str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = RemoteSettings.FORWARD_SLASH_STRING.concat(String.valueOf(str));
        }
        String strM16428ac = z2 ? m16428ac() : m16464nr();
        if (TextUtils.isEmpty(strM16428ac)) {
            strM16428ac = "api16-access-ttp.tiktokpangle.us";
        }
        String strM16679ri = UrlConst.HTTPS + strM16428ac + str;
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return strM16679ri;
        }
        if (C3597xd.m16680ri() && !z) {
            strM16679ri = C3597xd.m16679ri(strM16679ri);
        }
        return z ? m16433co(strM16679ri) : strM16679ri;
    }

    /* JADX INFO: renamed from: ri */
    public static List<String> m16478ri(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = RemoteSettings.FORWARD_SLASH_STRING.concat(String.valueOf(str));
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setM14842eu = C3299nr.m14639ka().m14842eu();
        if (setM14842eu != null && !setM14842eu.isEmpty()) {
            for (String str2 : setM14842eu) {
                if (!TextUtils.isEmpty(str2)) {
                    String strM16433co = UrlConst.HTTPS + str2 + str;
                    if (C3597xd.m16680ri() && !z) {
                        strM16433co = C3597xd.m16679ri(strM16433co);
                    }
                    if (z) {
                        strM16433co = m16433co(strM16433co);
                    }
                    arrayList.add(strM16433co);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m16479ri(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m16480ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, long j, InterfaceC2004ri interfaceC2004ri) {
        if (wjvVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, wjvVar.m14533tn());
            jSONObject.put("buffers_time", j);
            C1997lr c1997lrM14389eu = wjvVar.m14389eu();
            if (c1997lrM14389eu != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, c1997lrM14389eu.m6342fi());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, c1997lrM14389eu.jbs());
            }
            m16488ri(jSONObject, interfaceC2004ri);
            return jSONObject;
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.ToolUtils", "getVideoAction json error", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16481ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, View view) {
    }

    /* JADX INFO: renamed from: ri */
    public static void m16482ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C2634di c2634di) {
        m16483ri(wjvVar, c2634di, false);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16483ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C2634di c2634di, boolean z) {
        C2634di c2634di2;
        C3285mj c3285mjM14401fr;
        List<Integer> list;
        if (wjvVar == null || c2634di == null) {
            return;
        }
        int iM14529sz = wjvVar.m14529sz();
        if (!wjvVar.evm() || (!(iM14529sz == 2 || iM14529sz == 3 || iM14529sz == 5) || (c3285mjM14401fr = wjvVar.m14401fr()) == null)) {
            c2634di2 = c2634di;
        } else {
            List<Integer> listM14200di = c3285mjM14401fr.m14200di();
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (int i = 0; i < listM14200di.size(); i++) {
                    arrayList.add(Integer.valueOf(listM14200di.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listM14200di;
            }
            c2634di2 = c2634di;
            c2634di2.m9787ri(true, c3285mjM14401fr.m14205ka(), c3285mjM14401fr.m14201fi(), list, c3285mjM14401fr.xha(), c3285mjM14401fr.m14203ik());
        }
        int iOgw = wjvVar.ogw();
        long jM14571zh = wjvVar.m14571zh();
        if ((iOgw == 1 || iOgw == 2) && jM14571zh > 0) {
            c2634di2.m9782ri(iOgw, jM14571zh);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16484ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        if (wjvVar != null) {
            try {
                String strSmj = wjvVar.smj();
                if (TextUtils.isEmpty(strSmj) && wjvVar.lau() != null && wjvVar.lau().m14012ik() == 1 && !TextUtils.isEmpty(wjvVar.lau().m14014lr())) {
                    strSmj = wjvVar.lau().m14014lr();
                }
                String str2 = strSmj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                C3214ig.m13497ri(C3299nr.m14642ri(), str2, wjvVar, m16470ri(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16485ri(String str, String str2, Context context) {
        if (TextUtils.isEmpty(str2) || !m16442fi(context)) {
            return;
        }
        int length = str2.length();
        int i = 1;
        int i2 = length % 3572 == 0 ? length / 3572 : (length / 3572) + 1;
        int i3 = 3572;
        int i4 = 0;
        while (i <= i2) {
            if (i3 >= length) {
                Log.d(str, i2 + "-" + i + CertificateUtil.DELIMITER + str2.substring(i4));
                return;
            }
            Log.d(str, i2 + "-" + i + CertificateUtil.DELIMITER + str2.substring(i4, i3));
            i++;
            i4 = i3;
            i3 += 3572;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16486ri(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16487ri(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairM14668ka = C3304qt.m14668ka("oem_store");
            int i = -1;
            if (pairM14668ka != null && ((iIntValue = Integer.valueOf((String) pairM14668ka.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairM14668ka.second).longValue() < C3606fi.m16703ri("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16488ri(JSONObject jSONObject, InterfaceC2004ri interfaceC2004ri) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || interfaceC2004ri == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(interfaceC2004ri.mo6170ka()), Integer.valueOf(interfaceC2004ri.mo6168fi())));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16489ri() {
        return (com.bytedance.sdk.openadsdk.core.slm.m14959ri() == null || com.bytedance.sdk.openadsdk.core.slm.m14959ri().m14962ka()) ? false : true;
    }

    /* JADX INFO: renamed from: sf */
    public static String m16490sf() {
        return m16446ik("MemTotal");
    }

    public static int slm() {
        return C3215ik.m13505ri().m13506lr("is_root", -1);
    }

    /* JADX INFO: renamed from: su */
    public static String m16492su() {
        int i = -m16443fr();
        return i >= 0 ? "Etc/GMT+".concat(String.valueOf(i)) : "Etc/GMT".concat(String.valueOf(i));
    }

    public static String tan() {
        String strM14891vt = C3299nr.m14639ka().m14891vt();
        if (!TextUtils.isEmpty(strM14891vt)) {
            return strM14891vt;
        }
        String strM16662ri = C3594uq.m16662ri();
        if (TextUtils.isEmpty(strM16662ri)) {
            return strM14891vt;
        }
        return UrlConst.HTTPS + strM16662ri + "/service/2/dual_events/";
    }

    /* JADX INFO: renamed from: uq */
    public static String m16493uq() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    /* JADX INFO: renamed from: vr */
    public static long m16494vr() {
        try {
            if (!dzy()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static String wjv() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: xd */
    public static String m16495xd() {
        try {
            WebView webView = new WebView(C3299nr.m14642ri());
            webView.setWebViewClient(new C2634di.ri());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                C3215ik.m13505ri().m13512ri("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            C2707ac.m10196ik("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static int xha(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static long xha(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
                Integer.valueOf(i);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static synchronized String xha() {
        if (TextUtils.isEmpty(f13164mj) && C3299nr.m14642ri() != null) {
            try {
                PackageInfo packageInfo = C3299nr.m14642ri().getPackageManager().getPackageInfo(m16435di(), 0);
                f13164mj = String.valueOf(packageInfo.versionCode);
                jbs = packageInfo.versionName;
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
            }
        }
        return f13164mj;
    }

    public static boolean xha(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: zf */
    public static String m16496zf() {
        String str = bgr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(f13158co);
        bgr = str2;
        return str2;
    }
}
