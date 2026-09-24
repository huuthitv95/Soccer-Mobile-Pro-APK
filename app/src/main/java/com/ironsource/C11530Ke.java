package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.Ke */
/* JADX INFO: loaded from: classes6.dex */
public class C11530Ke {

    /* JADX INFO: renamed from: A */
    private static final String f24831A = "mcc";

    /* JADX INFO: renamed from: B */
    private static final String f24832B = "mnc";

    /* JADX INFO: renamed from: C */
    private static final String f24833C = "icc";

    /* JADX INFO: renamed from: D */
    private static final String f24834D = "mCar";

    /* JADX INFO: renamed from: E */
    private static final String f24835E = "tz";

    /* JADX INFO: renamed from: F */
    private static final String f24836F = "tzOff";

    /* JADX INFO: renamed from: G */
    private static final String f24837G = "rvManual";

    /* JADX INFO: renamed from: H */
    private static final String f24838H = "ts";

    /* JADX INFO: renamed from: I */
    private static final String f24839I = "android";

    /* JADX INFO: renamed from: J */
    private static final String f24840J = "impression";

    /* JADX INFO: renamed from: K */
    private static final String f24841K = "placementId";

    /* JADX INFO: renamed from: L */
    private static final String f24842L = "=";

    /* JADX INFO: renamed from: M */
    private static final String f24843M = "&";

    /* JADX INFO: renamed from: N */
    static String f24844N = "";

    /* JADX INFO: renamed from: O */
    static String f24845O = "";

    /* JADX INFO: renamed from: a */
    private static String f24846a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* JADX INFO: renamed from: b */
    private static final String f24847b = "?request=";

    /* JADX INFO: renamed from: c */
    private static final String f24848c = "platform";

    /* JADX INFO: renamed from: d */
    private static final String f24849d = "applicationKey";

    /* JADX INFO: renamed from: e */
    private static final String f24850e = "applicationUserId";

    /* JADX INFO: renamed from: f */
    private static final String f24851f = "sdkVersion";

    /* JADX INFO: renamed from: g */
    private static final String f24852g = "pluginType";

    /* JADX INFO: renamed from: h */
    private static final String f24853h = "pluginVersion";

    /* JADX INFO: renamed from: i */
    private static final String f24854i = "plugin_fw_v";

    /* JADX INFO: renamed from: j */
    private static final String f24855j = "advId";

    /* JADX INFO: renamed from: k */
    private static final String f24856k = "auid";

    /* JADX INFO: renamed from: l */
    private static final String f24857l = "isDemandOnly";

    /* JADX INFO: renamed from: m */
    private static final String f24858m = "serr";

    /* JADX INFO: renamed from: n */
    private static final String f24859n = "appVer";

    /* JADX INFO: renamed from: o */
    private static final String f24860o = "osVer";

    /* JADX INFO: renamed from: p */
    private static final String f24861p = "devModel";

    /* JADX INFO: renamed from: q */
    private static final String f24862q = "devMake";

    /* JADX INFO: renamed from: r */
    private static final String f24863r = "connType";

    /* JADX INFO: renamed from: s */
    private static final String f24864s = "rawConnType";

    /* JADX INFO: renamed from: t */
    private static final String f24865t = "mt";

    /* JADX INFO: renamed from: u */
    private static final String f24866u = "fs";

    /* JADX INFO: renamed from: v */
    private static final String f24867v = "coppa";

    /* JADX INFO: renamed from: w */
    private static final String f24868w = "dff";

    /* JADX INFO: renamed from: x */
    private static final String f24869x = "browserUserAgent";

    /* JADX INFO: renamed from: y */
    private static final String f24870y = "deviceLang";

    /* JADX INFO: renamed from: z */
    private static final String f24871z = "bundleId";

    /* JADX INFO: renamed from: a */
    public static String m26296a() {
        return f24844N;
    }

    /* JADX INFO: renamed from: b */
    public static String m26301b() {
        return f24845O;
    }

    /* JADX INFO: renamed from: c */
    public static void m26303c(String str) {
        f24845O = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m26297a(Context context, String str, String str2, String str3, String str4, boolean z, List<Pair<String, String>> list, boolean z2) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z) {
            arrayList.add(new Pair(f24837G, "1"));
        }
        if (!IronSourceUtils.m32779g()) {
            arrayList.add(new Pair(f24858m, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f24852g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f24853h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f24854i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(f24855j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String strM25648b = C11409E1.m25648b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM25648b)) {
            arrayList.add(new Pair(f24859n, strM25648b));
        }
        arrayList.add(new Pair(f24860o, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(f24862q, Build.MANUFACTURER));
        arrayList.add(new Pair(f24861p, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.m32761c(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapM31877c = C12266ja.m31872b().m31877c();
        if (concurrentHashMapM31877c.containsKey(C12364a.f31316b)) {
            arrayList.add(new Pair("coppa", concurrentHashMapM31877c.get(C12364a.f31316b).get(0)));
        }
        if (concurrentHashMapM31877c.containsKey(C12364a.f31320f)) {
            String str6 = concurrentHashMapM31877c.get(C12364a.f31320f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(C12364a.f31324j)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (concurrentHashMapM31877c.containsKey(C12364a.f31318d)) {
            String str7 = concurrentHashMapM31877c.get(C12364a.f31318d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                arrayList.add(new Pair(f24868w, "1"));
            }
        }
        if (concurrentHashMapM31877c.containsKey(C12364a.f31319e) && (list2 = concurrentHashMapM31877c.get(C12364a.f31319e)) != null) {
            arrayList.add(new Pair(C12364a.f31319e, list2.get(0)));
        }
        String strM32733a = IronSourceUtils.m32733a(context);
        if (!TextUtils.isEmpty(strM32733a)) {
            arrayList.add(new Pair(f24863r, strM32733a));
        }
        String strM27579d = C11693U3.m27579d(context);
        if (!TextUtils.isEmpty(strM27579d)) {
            arrayList.add(new Pair(f24864s, strM27579d));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strMo27925s = interfaceC12582w7Mo25842a.mo27925s();
        if (strMo27925s.length() != 0) {
            arrayList.add(new Pair(f24869x, strMo27925s));
        }
        try {
            str5 = interfaceC12582w7Mo25842a.mo27896d(context) + "-" + interfaceC12582w7Mo25842a.mo27870B(context);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new Pair(f24870y, str5));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + C11676T3.m27501b(context)));
        arrayList.add(new Pair("mnc", "" + C11676T3.m27502c(context)));
        String strMo27876H = interfaceC12582w7Mo25842a.mo27876H(context);
        if (!TextUtils.isEmpty(strMo27876H)) {
            arrayList.add(new Pair("icc", strMo27876H));
        }
        String strMo27930v = interfaceC12582w7Mo25842a.mo27930v(context);
        if (!TextUtils.isEmpty(strMo27930v)) {
            arrayList.add(new Pair(f24834D, strMo27930v));
        }
        String strMo27895d = interfaceC12582w7Mo25842a.mo27895d();
        if (!TextUtils.isEmpty(strMo27895d)) {
            arrayList.add(new Pair("tz", strMo27895d));
        }
        arrayList.add(new Pair(f24836F, "" + interfaceC12582w7Mo25842a.mo27913m()));
        String strMo27898e = interfaceC12582w7Mo25842a.mo27898e(context);
        if (!TextUtils.isEmpty(strMo27898e)) {
            arrayList.add(new Pair("auid", strMo27898e));
        }
        if (z2) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(C11540L6.f24984j0, String.valueOf(C12292l0.m31957a())));
        String strM26300a = m26300a(arrayList);
        f24844N = strM26300a;
        return m26298a(LevelPlay.getSdkVersion()) + URLEncoder.encode(C11453G9.m25870e(C12261j5.m31853b().m31855c(), strM26300a), "UTF-8");
    }

    /* JADX INFO: renamed from: b */
    private static void m26302b(String str) {
        f24846a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m26299a(String str, boolean z, int i) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z)));
        arrayList.add(new Pair("placementId", Integer.toString(i)));
        return str + "&" + m26300a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static String m26300a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static String m26298a(String str) {
        return f24846a + str + f24847b;
    }
}
