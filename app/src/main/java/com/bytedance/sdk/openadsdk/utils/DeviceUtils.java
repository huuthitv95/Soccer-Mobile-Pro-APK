package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2713bu;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p225ri.C3310ri;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt;
import com.bytedance.sdk.openadsdk.core.settings.C3317ka;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2884mj;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11540L6;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {

    /* JADX INFO: renamed from: aw */
    private static int f13104aw = 0;
    private static int bgr = 0;
    private static int jbs = 0;

    /* JADX INFO: renamed from: mj */
    private static int f13112mj = 0;

    /* JADX INFO: renamed from: ri */
    public static String f13115ri = "";
    private static int slm;

    /* JADX INFO: renamed from: vr */
    private static int f13117vr;

    /* JADX INFO: renamed from: lr */
    private static volatile long f13111lr = System.currentTimeMillis();

    /* JADX INFO: renamed from: ik */
    private static volatile boolean f13109ik = false;

    /* JADX INFO: renamed from: ka */
    private static volatile boolean f13110ka = false;

    /* JADX INFO: renamed from: fi */
    private static volatile boolean f13108fi = false;

    /* JADX INFO: renamed from: di */
    private static volatile boolean f13107di = true;
    private static long xha = 0;

    /* JADX INFO: renamed from: qt */
    private static String f13114qt = "";

    /* JADX INFO: renamed from: sf */
    private static int f13116sf = 0;

    /* JADX INFO: renamed from: co */
    private static final AtomicBoolean f13106co = new AtomicBoolean(false);

    /* JADX INFO: renamed from: bu */
    private static AtomicBoolean f13105bu = new AtomicBoolean(false);

    /* JADX INFO: renamed from: nr */
    private static final Object f13113nr = new Object();
    private static volatile String tan = null;

    /* JADX INFO: renamed from: ac */
    private static volatile String f13103ac = null;

    public static class AudioInfoReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: ri */
        static final CopyOnWriteArrayList<InterfaceC2884mj> f13120ri = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static void m16353lr(Context context) {
            if (DeviceUtils.f13110ka || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.jbs.m10235ri());
                boolean unused = DeviceUtils.f13110ka = true;
            } catch (Throwable unused2) {
            }
        }

        /* JADX INFO: renamed from: lr */
        public static void m16354lr(InterfaceC2884mj interfaceC2884mj) {
            if (interfaceC2884mj == null) {
                return;
            }
            f13120ri.remove(interfaceC2884mj);
        }

        /* JADX INFO: renamed from: ri */
        public static void m16356ri(InterfaceC2884mj interfaceC2884mj) {
            if (interfaceC2884mj != null) {
                CopyOnWriteArrayList<InterfaceC2884mj> copyOnWriteArrayList = f13120ri;
                if (copyOnWriteArrayList.contains(interfaceC2884mj)) {
                    return;
                }
                copyOnWriteArrayList.add(interfaceC2884mj);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.f13117vr = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.f13104aw = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!f13120ri.isEmpty()) {
                        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<InterfaceC2884mj> it = AudioInfoReceiver.f13120ri.iterator();
                                while (it.hasNext()) {
                                    it.next().mo11095ik(DeviceUtils.f13104aw);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.jbs != 0) {
                        int unused3 = DeviceUtils.bgr = (int) ((((double) DeviceUtils.f13104aw) / ((double) DeviceUtils.jbs)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.DeviceUtils$lr */
    static class C3558lr extends BroadcastReceiver {
        C3558lr() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.f13107di = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.f13107di = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f13111lr = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.DeviceUtils$ri */
    private static class C3559ri extends BroadcastReceiver {
        private C3559ri() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static void m16357lr(Context context) {
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new C3559ri(), intentFilter, 2);
                } else {
                    context.registerReceiver(new C3559ri(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.ihz(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.slm = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* JADX INFO: renamed from: ac */
    private static void m16310ac(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            jbs = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f13104aw = streamVolume;
            bgr = (int) ((((double) streamVolume) / ((double) jbs)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ay */
    private static void m16313ay(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.ihz(applicationContext);
            }
        });
    }

    /* JADX INFO: renamed from: bu */
    private static int m16314bu(Context context) {
        return f13117vr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bu */
    public static void m16315bu() {
        if (C3299nr.m14639ka().igq("bt_id")) {
            try {
                if (f13103ac == null) {
                    synchronized (f13113nr) {
                        try {
                            if (f13103ac == null) {
                                f13103ac = m16343ri(PglSupport.getBootid(), C3215ik.m13505ri().m13508lr("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
                f13103ac = "";
            }
        }
    }

    /* JADX INFO: renamed from: co */
    public static void m16316co() {
        try {
            int ringerMode = ((AudioManager) C3299nr.m14642ri().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f13112mj = 1;
            } else if (ringerMode == 1) {
                f13112mj = 2;
            } else {
                f13112mj = 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: co */
    public static void m16317co(Context context) {
        Context applicationContext;
        if (f13108fi || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                m16313ay(applicationContext);
            } else {
                C3559ri.m16357lr(applicationContext);
            }
            f13108fi = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: di */
    public static int m16318di() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C3299nr.m14642ri().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    /* JADX INFO: renamed from: di */
    public static int m16319di(Context context) {
        if (!f13106co.get()) {
            m16352vr(context);
        }
        return f13116sf;
    }

    /* JADX INFO: renamed from: fi */
    public static float m16320fi() {
        int i = -1;
        try {
            Context contextM14642ri = C3299nr.m14642ri();
            if (contextM14642ri != null) {
                i = Settings.System.getInt(contextM14642ri.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    /* JADX INFO: renamed from: fi */
    public static String m16321fi(Context context) {
        if (!f13106co.get()) {
            m16352vr(context);
        }
        return f13114qt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ihz(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.slm = DeviceUtils.m16350uq(applicationContext);
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static int m16322ik() {
        return C3215ik.m13505ri().m13506lr("limit_ad_track", -1);
    }

    /* JADX INFO: renamed from: ik */
    private static void m16324ik(JSONObject jSONObject) throws JSONException {
        jSONObject.put(C11540L6.f24899B, Build.MODEL);
        C3369ri.m15224ri().m15232ri(jSONObject);
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m16325ik(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
        }
    }

    public static int jbs() {
        return jbs;
    }

    public static int jbs(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ka */
    public static int m16327ka(Context context) {
        if (m16325ik(context)) {
            return 3;
        }
        return m16332lr(context) ? 2 : 1;
    }

    /* JADX INFO: renamed from: ka */
    public static String m16328ka() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    /* JADX INFO: renamed from: lr */
    private static void m16330lr(JSONObject jSONObject) throws JSONException {
        m16324ik(jSONObject);
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16331lr() {
        if (SystemClock.elapsedRealtime() - xha >= 20000) {
            xha = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) C3299nr.m14642ri().getSystemService("power");
                if (powerManager != null) {
                    f13107di = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return f13107di;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16332lr(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: mj */
    public static int m16334mj() {
        return bgr;
    }

    /* JADX INFO: renamed from: mj */
    public static int m16335mj(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: nr */
    private static float m16336nr(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: nr */
    private static String m16337nr() {
        try {
            return f13103ac == null ? C3215ik.m13505ri().m13508lr("bt_id", "") : f13103ac;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: qt */
    public static int m16338qt(Context context) {
        return f13112mj;
    }

    /* JADX INFO: renamed from: qt */
    public static String m16339qt() {
        if (TextUtils.isEmpty(f13115ri)) {
            f13115ri = C3215ik.m13505ri().m13508lr("framework_name", "");
        }
        return f13115ri;
    }

    /* JADX INFO: renamed from: ri */
    public static long m16341ri() {
        return f13111lr;
    }

    /* JADX INFO: renamed from: ri */
    private static String m16343ri(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split(",");
                int iIgq = C3322sf.m14819lr().igq();
                if (iIgq != 1) {
                    if (!str.equals(strArrSplit[0]) && (!"bt_time".equals(str3) || Math.abs(Long.parseLong(str) - Long.parseLong(strArrSplit[0])) >= 1000)) {
                        if (strArrSplit.length < iIgq) {
                            str = str + "," + str2;
                        } else {
                            int iLastIndexOf = str2.lastIndexOf(",");
                            if (iLastIndexOf != -1) {
                                str = str + "," + str2.substring(0, iLastIndexOf);
                            }
                        }
                    }
                }
            }
            C3215ik.m13505ri().m13512ri(str3, str);
            return str;
        }
        return str2;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m16344ri(Context context, boolean z) {
        String strM16467qt;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", m16335mj(context));
            m16330lr(jSONObject);
            jSONObject.put("type", m16327ka(context));
            jSONObject.put(C11540L6.f24911F, 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", C3571ig.m16460mj(context));
            jSONObject.put("app_set_id", C3317ka.m14782ik());
            jSONObject.put("app_set_id_scope", C3317ka.m14784lr());
            jSONObject.put("installed_source", C3317ka.m14783ka());
            jSONObject.put("screen_scale", C3583qd.m16576di(context));
            jSONObject.put("density", C3583qd.m16598mj(context));
            jSONObject.put("screen_width", C3583qd.m16580ik(context));
            jSONObject.put("screen_height", C3583qd.m16578fi(context));
            jSONObject.put("sec_did", C3324ik.m14908di());
            C3322sf c3322sfM14639ka = C3299nr.m14639ka();
            if (c3322sfM14639ka.igq("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", C3089aw.m12373ik(context));
            jSONObject.put("rom_version", igq.m16516ri());
            jSONObject.put("sys_compiling_time", C3089aw.m12376lr(context));
            jSONObject.put("timezone", C3571ig.m16492su());
            jSONObject.put("language", C3089aw.m12375lr());
            jSONObject.put("carrier_name", C3566dw.m16386ri());
            if (z) {
                strM16467qt = C3571ig.m16475ri(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", C3571ig.wjv());
                m16346ri(jSONObject);
            } else {
                strM16467qt = C3571ig.m16467qt();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strM16467qt) * 1024));
            jSONObject.put("locale_language", m16328ka());
            jSONObject.put("screen_bright", Math.ceil(m16320fi() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !m16331lr() ? 1 : 0);
            jSONObject.put("cpu_num", C3584qt.m16631lr());
            jSONObject.put("cpu_max_freq", C3584qt.m16629ik());
            jSONObject.put("cpu_min_freq", C3584qt.m16630ka());
            xha.C3598ri c3598riM16681ri = xha.m16681ri();
            jSONObject.put("battery_remaining_pct", (int) c3598riM16681ri.f13349lr);
            jSONObject.put("is_charging", c3598riM16681ri.f13350ri);
            jSONObject.put("total_space", String.valueOf(C3571ig.m16455lr(context)));
            jSONObject.put("free_space_in", String.valueOf(C3571ig.m16429aw()));
            jSONObject.put("sdcard_size", String.valueOf(C3571ig.bgr()));
            jSONObject.put("rooted", C3571ig.slm());
            jSONObject.put("enable_assisted_clicking", m16318di());
            jSONObject.put("force_language", C2729uq.m10311ri(context, "tt_choose_language"));
            jSONObject.put("airplane", jbs(context));
            jSONObject.put("darkmode", slm(context));
            jSONObject.put("headset", m16314bu(context));
            jSONObject.put("ringmute", m16338qt(context));
            jSONObject.put("screenscale", m16336nr(context));
            jSONObject.put("volume", m16334mj());
            jSONObject.put("low_power_mode", tan(context));
            jSONObject.put("enable_draw_feed", C3571ig.ory());
            if (z) {
                C3579mj.m16555ri(jSONObject, context);
                jSONObject.put("gp_v_name", m16321fi(context));
                jSONObject.put("gp_v_code", m16319di(context));
            }
            if (c3322sfM14639ka.igq("mnc")) {
                jSONObject.put("mnc", C3566dw.m16383ik());
            }
            if (c3322sfM14639ka.igq("mcc")) {
                jSONObject.put("mcc", C3566dw.m16385lr());
            }
            jSONObject.put("act", C3310ri.m14751lr(context));
            jSONObject.put("act_event", C3310ri.m14752ri());
            String strM14910ik = C3324ik.m14910ik();
            Long.valueOf(C3324ik.m14911ka());
            if (!TextUtils.isEmpty(strM14910ik)) {
                jSONObject.put("sof_chara", strM14910ik);
            }
            String strM16058lr = C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strM16058lr.isEmpty()) {
                jSONObject.put("ipv6", strM16058lr);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.ihz.m10229ri(C3299nr.m14642ri()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16345ri(Context context) {
        if (f13109ik) {
            return;
        }
        try {
            C3558lr c3558lr = new C3558lr();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(c3558lr, intentFilter);
            f13109ik = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16346ri(JSONObject jSONObject) {
        try {
            C3322sf c3322sfM14639ka = C3299nr.m14639ka();
            if (c3322sfM14639ka.igq("boot")) {
                jSONObject.put("bt_time", tan());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                C3215ik.m13505ri().m13509ri("bt_time");
            }
            if (c3322sfM14639ka.igq("bt_id")) {
                jSONObject.put("bt_id", m16337nr());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                C3215ik.m13505ri().m13509ri("bt_id");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: sf */
    public static void m16348sf() {
        C3322sf.m14825ri(new AbstractC3320qt.ri() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: lr */
            public void mo14811lr() {
                C3369ri.m15224ri().m15233ri(true);
                DeviceUtils.m16315bu();
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: ri */
            public void mo14812ri() {
                C3369ri.m15224ri().m15233ri(true);
            }
        });
        Context contextM14642ri = C3299nr.m14642ri();
        if (contextM14642ri != null) {
            C3215ik.m13505ri().m13510ri("cpu_count", C3584qt.m16633ri());
            C3215ik.m13505ri().m13510ri("cpu_max_frequency", C3584qt.m16634ri(C3584qt.m16633ri()));
            C3215ik.m13505ri().m13510ri("cpu_min_frequency", C3584qt.m16632lr(C3584qt.m16633ri()));
            String strM16490sf = C3571ig.m16490sf();
            if (strM16490sf != null) {
                C3215ik.m13505ri().m13512ri("total_memory", strM16490sf);
            }
            C3215ik.m13505ri().m13511ri("total_internal_storage", C3571ig.m16432co());
            C3215ik.m13505ri().m13511ri("free_internal_storage", C2713bu.m10212ri());
            C3215ik.m13505ri().m13511ri("total_sdcard_storage", C3571ig.m16494vr());
            C3215ik.m13505ri().m13510ri("is_root", C3571ig.m16431bu() ? 1 : 0);
            if (TextUtils.isEmpty(m16339qt())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    f13115ri = "unity";
                } catch (ClassNotFoundException unused) {
                    f13115ri = "native";
                }
                C3215ik.m13505ri().m13512ri("framework_name", f13115ri);
            }
            m16316co();
            m16310ac(contextM14642ri);
            slm = m16350uq(contextM14642ri);
            C3579mj.m16554ri(contextM14642ri);
            m16315bu();
        }
    }

    /* JADX INFO: renamed from: sf */
    public static void m16349sf(Context context) {
        AudioInfoReceiver.m16353lr(context);
    }

    private static int slm(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    private static int tan(Context context) {
        return slm;
    }

    private static String tan() {
        try {
            if (tan == null) {
                synchronized (f13113nr) {
                    if (tan == null) {
                        tan = m16343ri(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), C3215ik.m13505ri().m13508lr("bt_time", ""), "bt_time");
                    }
                }
            }
        } catch (Throwable unused) {
            tan = "";
        }
        return tan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uq */
    public static int m16350uq(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return wjv(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: vr */
    private static void m16352vr(Context context) {
        if (context == null || !f13106co.compareAndSet(false, true)) {
            return;
        }
        try {
            if (C3606fi.m16703ri("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                f13114qt = packageInfo.versionName;
                f13116sf = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    private static int wjv(Context context) {
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int xha() {
        return f13104aw;
    }

    public static JSONObject xha(Context context) {
        return m16344ri(context, false);
    }
}
