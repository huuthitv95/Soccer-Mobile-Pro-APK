package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1737c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.q7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1701q7 {

    /* JADX INFO: renamed from: a */
    private static final int[] f2659a = {60, 60, 24, 7, 4, 12};

    /* JADX INFO: renamed from: b */
    private static final String[] f2660b = {" second", " minute", " hour", " day", " week", " month"};

    /* JADX INFO: renamed from: c */
    private static final String[] f2661c = {CmcdData.Factory.STREAMING_FORMAT_SS, InneractiveMediationDefs.GENDER_MALE, CmcdData.Factory.STREAMING_FORMAT_HLS, "d", "w", "mth"};

    /* JADX INFO: renamed from: d */
    private static final DecimalFormat f2662d = new DecimalFormat();

    /* JADX INFO: renamed from: e */
    private static final Random f2663e = new Random();

    /* JADX INFO: renamed from: f */
    private static Boolean f2664f;

    /* JADX INFO: renamed from: g */
    private static Boolean f2665g;

    /* JADX INFO: renamed from: h */
    private static String f2666h;

    /* JADX INFO: renamed from: i */
    private static Boolean f2667i;

    /* JADX INFO: renamed from: com.applovin.impl.q7$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q7$b */
    class b extends AbstractC1795v4 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f2668a;

        b(String str) {
            this.f2668a = str;
        }

        @Override // com.applovin.impl.AbstractC1795v4
        /* JADX INFO: renamed from: a */
        protected Map mo1977a() {
            return CollectionUtils.hashMap("name", "Utils:" + this.f2668a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static double m4014a(long j) {
        return j / 1024.0d;
    }

    /* JADX INFO: renamed from: a */
    public static double m4015a(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Failed to parse double from String: " + str, th);
            return d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4016a(int i, int i2) {
        return (i < 0 || i > 100) ? i2 : i;
    }

    /* JADX INFO: renamed from: a */
    public static int m4017a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m4018a(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i = 0;
            while (i < iMax) {
                String str3 = i < strArrSplit.length ? strArrSplit[i] : "0";
                String str4 = i < strArrSplit2.length ? strArrSplit2[i] : "0";
                int i2 = Integer.parseInt(str3);
                int i3 = Integer.parseInt(str4);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m4019a(float f) {
        return Math.round(f);
    }

    /* JADX INFO: renamed from: a */
    public static long m4020a(C1748l c1748l) {
        long jLongValue = ((Long) c1748l.m4801a(C1831z4.f3756K5)).longValue();
        long jLongValue2 = ((Long) c1748l.m4801a(C1831z4.f3764L5)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : jCurrentTimeMillis + (jLongValue - jLongValue2);
    }

    /* JADX INFO: renamed from: a */
    public static long m4021a(byte[] bArr, int i) {
        int i2 = i + 8;
        if (bArr.length < i2) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j = 0;
        while (i < i2) {
            j |= (((long) bArr[i]) & 255) << (i * 8);
            i++;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static ActivityManager.MemoryInfo m4022a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            C1768p.m5162b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PackageInfo m4023a(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static WebView m4024a(Context context, String str, boolean z) {
        try {
            WebView webView = new WebView(context);
            if (z) {
                webView.setWebViewClient(new b(str));
            }
            return webView;
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1781u m4025a(JSONObject jSONObject, C1748l c1748l) {
        return C1781u.m5251a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: renamed from: a */
    public static AppLovinAd m4026a(AppLovinAd appLovinAd, C1748l c1748l) {
        if (!(appLovinAd instanceof C1737c)) {
            return appLovinAd;
        }
        C1737c c1737c = (C1737c) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = c1748l.m4840l().dequeueAd(c1737c.getAdZone());
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd == null) {
            return c1737c.m4579f();
        }
        c1737c.m4577a(appLovinAdDequeueAd);
        ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(c1737c);
        return appLovinAdDequeueAd;
    }

    /* JADX INFO: renamed from: a */
    private static String m4027a(int i) {
        if (i == 0) {
            return "landscape_right";
        }
        if (i == 1) {
            return "portrait_upside_down";
        }
        if (i != 2) {
            return i != 3 ? "unknown" : C11744X3.i.f26322D;
        }
        return "landscape_left";
    }

    /* JADX INFO: renamed from: a */
    public static String m4028a(int i, Context context, C1748l c1748l) {
        if (i == 0) {
            return "";
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e) {
                if (c1748l != null) {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5172a("Utils", "Opening raw resource file threw exception", e);
                    }
                }
                return "";
            } finally {
                m4050a(inputStreamOpenRawResource, c1748l);
            }
        } catch (Throwable th) {
            if (c1748l != null) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("Utils", "Failed to retrieve resource " + i, th);
                }
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4029a(long j, boolean z) {
        String[] strArr = z ? f2660b : f2661c;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        for (int i = 0; i < strArr.length; i++) {
            long j2 = f2659a[i];
            if (jCurrentTimeMillis < j2) {
                if (jCurrentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                return String.format("%d%s%s%s", Long.valueOf(jCurrentTimeMillis), strArr[i], (!z || jCurrentTimeMillis <= 1) ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, z ? " ago" : "");
            }
            jCurrentTimeMillis /= j2;
        }
        return z ? "just now" : "now";
    }

    /* JADX INFO: renamed from: a */
    public static String m4030a(Context context, String str, C1748l c1748l) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities.isEmpty()) {
                return null;
            }
            return listQueryIntentActivities.get(0).activityInfo.name;
        } catch (Throwable th) {
            c1748l.m4764E().m4333a(str, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4031a(Uri uri, String str, C1748l c1748l) {
        List listM4821c = c1748l.m4821c(C1831z4.f3727H0);
        String lastPathSegment = uri.getLastPathSegment();
        if (listM4821c.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) c1748l.m4801a(C1831z4.f3735I0);
        int length = StringUtils.emptyIfNull(strEncodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        if (!StringUtils.isValidString(strEncodeUriString) || !StringUtils.isValidString(str)) {
            return strEncodeUriString;
        }
        return str + strEncodeUriString;
    }

    /* JADX INFO: renamed from: a */
    public static String m4032a(AppLovinSdkSettings appLovinSdkSettings) {
        String strEmptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(strEmptyIfNull)) {
            return null;
        }
        Map<String, String> mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(strEmptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(mapTryToStringMap)) {
            return null;
        }
        return mapTryToStringMap.get("UnityVersion");
    }

    /* JADX INFO: renamed from: a */
    public static String m4033a(Object obj) {
        if (obj instanceof AbstractC1482a3) {
            return ((AbstractC1482a3) obj).m1833T();
        }
        if (AbstractC1821y3.m5701a(obj)) {
            return ((AbstractC1736b) obj).getMediationServeId();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m4034a(String str, int i) {
        String[] strArrSplit = StringUtils.toDigitsOnlyVersionString(str).split("\\.");
        if (strArrSplit.length == i) {
            return UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) ".", (CharSequence[]) strArrSplit);
        }
        if (strArrSplit.length > i) {
            return UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ".", (Iterable) new ArrayList(Arrays.asList(strArrSplit)).subList(0, i));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
        arrayList.addAll(Collections.nCopies(i - arrayList.size(), "0"));
        return UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ".", (Iterable) arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static String m4035a(Map map, boolean z) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(C11744X3.j.f26436c);
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains(C11744X3.j.f26436c)) {
                    value = str.replace(C11744X3.j.f26436c, "%26");
                }
            }
            sb.append(entry.getKey());
            sb.append(C11341A5.f23808U);
            sb.append(value);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static Field m4036a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return m4036a(superclass, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m4037a(String str, List list, C1748l c1748l) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null || CollectionUtils.isEmpty(arrayList)) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (StringUtils.containsIgnoreCase(line, str2)) {
                            arrayList2.add(str2);
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                c1748l.m4764E().m4336b("Utils", "getStringsPresentInFileLines", th);
                return arrayList2;
            }
            bufferedReader.close();
            return arrayList2;
        } catch (Throwable th3) {
            c1748l.m4764E().m4336b("Utils", "getStringsPresentInFileLines", th3);
            return arrayList2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m4038a(JSONObject jSONObject, String str, String str2, C1748l c1748l) {
        return m4039a(jSONObject, str, null, str2, null, false, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static List m4039a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z, C1748l c1748l) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return m4040a(jSONObject, map3, str2, map2, z, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static List m4040a(JSONObject jSONObject, Map map, String str, Map map2, boolean z, C1748l c1748l) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new C1535e(str, null, map2, z));
        }
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (AppLovinSdkUtils.isValidString(strOptString)) {
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new C1535e(strReplace, strOptString, map2, z));
                    }
                } catch (Throwable th) {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5172a("Utils", "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static List m4041a(boolean z, AbstractC1736b abstractC1736b, C1748l c1748l, Context context) {
        if (abstractC1736b instanceof C1711r7) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(abstractC1736b.m4545l().keySet()).iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse((String) it.next());
            if (m4063a(uri, c1748l, context)) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        Uri uriMo4235i0 = abstractC1736b.mo4235i0();
        if (z && uriMo4235i0 != null && m4063a(uriMo4235i0, c1748l, context)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("Utils", "Cached video missing: " + uriMo4235i0);
            }
            arrayList.add(uriMo4235i0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static Map m4042a(Map map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static Map m4043a(Map map, C1748l c1748l) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static void m4044a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m4045a(float f, long j, C1748l c1748l) {
        Vibrator vibrator = (Vibrator) C1748l.m4756p().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("Utils", "Vibrating with intensity: " + f + " for duration: " + j + "ms");
            }
            if (AbstractC1677p0.m3811e()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, Math.max(1, Math.min(255, (int) (255.0f * f)))));
            } else {
                vibrator.vibrate(j);
            }
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("Utils", "Failed to vibrate", th);
            }
            HashMap map = new HashMap();
            map.put("top_main_method", th.toString());
            map.put("details", "intensity=" + f + ", duration=" + j);
            c1748l.m4764E().m2678a(C1548f2.f1513Y0, "hapticsVibrate", map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4046a(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
    }

    /* JADX INFO: renamed from: a */
    public static void m4047a(Uri uri, Activity activity, C1748l c1748l) {
        if (activity == null) {
            activity = c1748l.m4861w0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, c1748l.m4839k0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static void m4048a(C1748l c1748l, String str) {
        String strM4839k0 = c1748l.m4839k0();
        if (((Boolean) c1748l.m4801a(C1831z4.f4074x)).booleanValue()) {
            if (strM4839k0 == null || strM4839k0.length() != 86) {
                m4058a(TextUtils.isEmpty(strM4839k0) ? "Empty SDK key" : "Invalid SDK key length", str, c1748l);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4049a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        m4057a("", sb.toString(), context);
    }

    /* JADX INFO: renamed from: a */
    public static void m4050a(Closeable closeable, C1748l c1748l) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (c1748l != null) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4051a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    /* JADX INFO: renamed from: a */
    public static void m4052a(String str, int i, int i2, C1715s1 c1715s1) {
        if (i > i2) {
            c1715s1.m2678a(C1548f2.f1519b1, str, CollectionUtils.hashMap("details", i + " Leaking Instances"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4053a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.q7$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1701q7.m4046a(context, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m4054a(String str, AppLovinAdBase appLovinAdBase, String str2, C1748l c1748l) {
        StringBuilder sb = new StringBuilder("sdkKey=");
        sb.append(c1748l.m4839k0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=");
            sb.append(appLovinAdBase.getSdk().m4839k0());
        }
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), map);
        CollectionUtils.putStringIfValid("error_message", str, map);
        c1748l.m4764E().m2678a(C1548f2.f1515Z0, str2, map);
    }

    /* JADX INFO: renamed from: a */
    public static void m4055a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    /* JADX INFO: renamed from: a */
    public static void m4056a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            sb.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb.append("\"\n..SDK KEY: \"");
            sb.append(c1748l.m4839k0());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(C1748l.m4756p().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String string = sb.toString();
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinSdk", string);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4057a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    /* JADX INFO: renamed from: a */
    private static void m4058a(String str, String str2, C1748l c1748l) {
        m4054a(str, (AppLovinAdBase) null, str2, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static void m4059a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4060a(HttpURLConnection httpURLConnection, C1748l c1748l) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (c1748l != null) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4061a(double d) {
        if (d >= 100.0d) {
            return true;
        }
        return d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && ((double) f2663e.nextFloat()) < d / 100.0d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4062a(long j, long j2) {
        return (j & j2) != 0;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4063a(Uri uri, C1748l c1748l, Context context) {
        return !c1748l.m4771I().m4983c(uri.getLastPathSegment(), context) || (((Boolean) c1748l.m4801a(C1831z4.f3868Y5)).booleanValue() && (m4074b(uri.getPath()) > 0L ? 1 : (m4074b(uri.getPath()) == 0L ? 0 : -1)) == 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4064a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        if (maxAdFormat == null || maxAdFormat2 == null) {
            return false;
        }
        if (maxAdFormat == maxAdFormat2) {
            return true;
        }
        if (maxAdFormat.isAdViewAd() && maxAdFormat2.isAdViewAd()) {
            return true;
        }
        return maxAdFormat.isFullscreenAd() && maxAdFormat2.isFullscreenAd();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4065a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4066a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4067a(String str, C1748l c1748l) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, c1748l.m4821c(C1831z4.f4043t0));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4068a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4069a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m4066a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4070a(List list, AbstractC1736b abstractC1736b) {
        if (list.isEmpty()) {
            return false;
        }
        List listM4501Q = abstractC1736b.m4501Q();
        Map mapM4545l = abstractC1736b.m4545l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (listM4501Q.contains((String) mapM4545l.get(((Uri) it.next()).toString()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4071a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static float m4072b(float f) {
        return f * 1000.0f;
    }

    /* JADX INFO: renamed from: b */
    public static long m4073b(long j) {
        return j * 8;
    }

    /* JADX INFO: renamed from: b */
    private static long m4074b(String str) {
        if (str == null) {
            return 0L;
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: b */
    public static WebView m4075b(Context context, String str) {
        return m4024a(context, str, false);
    }

    /* JADX INFO: renamed from: b */
    private static String m4076b(int i) {
        if (i == 0) {
            return C11744X3.i.f26322D;
        }
        if (i == 1) {
            return "landscape_right";
        }
        if (i != 2) {
            return i != 3 ? "unknown" : "landscape_left";
        }
        return "portrait_upside_down";
    }

    /* JADX INFO: renamed from: b */
    public static String m4077b(Context context) {
        Point pointM3800b = AbstractC1677p0.m3800b(context);
        int i = pointM3800b.x;
        int i2 = pointM3800b.y;
        int iM4095d = m4095d(context);
        return ((i <= i2 || !(iM4095d == 0 || iM4095d == 2)) && (i2 <= i || !(iM4095d == 1 || iM4095d == 3))) ? m4076b(iM4095d) : m4027a(iM4095d);
    }

    /* JADX INFO: renamed from: b */
    public static String m4078b(Class cls, String str) {
        try {
            Field fieldM4036a = m4036a(cls, str);
            fieldM4036a.setAccessible(true);
            return (String) fieldM4036a.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4079b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m4080b(AppLovinAd appLovinAd, C1748l c1748l) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String strM4839k0 = c1748l.m4839k0();
            String strM4839k1 = appLovinAdBase.getSdk().m4839k0();
            if (strM4839k0.equals(strM4839k1)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + strM4839k1 + ", but is being rendered from sdk with key: " + strM4839k0;
            C1768p.m5167h("AppLovinAd", str);
            m4054a(str, appLovinAdBase, "AppLovinAd", c1748l);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4081b(String str, String str2) {
        if (str == null || str.length() <= m4094d(8)) {
            return;
        }
        C1768p.m5169j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + m4094d(8) + " maximum)");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4082b(C1748l c1748l) {
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (!C1768p.m5160a()) {
                return false;
            }
            c1748l.m4782Q().m5176d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4083b(List list) {
        Context contextM4756p = C1748l.m4756p();
        if (contextM4756p != null) {
            return list.contains(contextM4756p.getPackageName());
        }
        C1768p.m5167h("Utils", "Failed to check whether or not app is member of package names");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4084b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    /* JADX INFO: renamed from: c */
    public static double m4085c(long j) {
        return m4014a(m4073b(j));
    }

    /* JADX INFO: renamed from: c */
    public static int m4086c(int i) {
        return m4016a(i, 95);
    }

    /* JADX INFO: renamed from: c */
    public static long m4087c(float f) {
        return m4019a(m4072b(f));
    }

    /* JADX INFO: renamed from: c */
    public static long m4088c(byte[] bArr) {
        return m4021a(bArr, 0);
    }

    /* JADX INFO: renamed from: c */
    public static String m4089c(Context context) {
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f2666h)) {
            return f2666h;
        }
        try {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                C1768p.m5163c("Utils", "No running app processes. Unable to determine process name");
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (iMyPid == runningAppProcessInfo.pid) {
                    String str = runningAppProcessInfo.processName;
                    f2666h = str;
                    return str;
                }
            }
            return null;
        } catch (Throwable th) {
            C1768p.m5162b("Utils", "Unable to determine process name", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m4090c(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    /* JADX INFO: renamed from: c */
    public static void m4091c() {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4092c(C1748l c1748l) {
        String str = c1748l.m4847p0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (C1748l.m4756p().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static double m4093d(long j) {
        return j / 1000.0d;
    }

    /* JADX INFO: renamed from: d */
    public static int m4094d(int i) {
        return i * 1024;
    }

    /* JADX INFO: renamed from: d */
    public static int m4095d(Context context) {
        WindowManager windowManagerM4104f = m4104f(context);
        if (windowManagerM4104f == null) {
            return 0;
        }
        return windowManagerM4104f.getDefaultDisplay().getRotation();
    }

    /* JADX INFO: renamed from: d */
    public static String m4096d() {
        try {
            return Build.VERSION.RELEASE + " (" + m4102e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m4097d(String str) {
        return m4034a(str, str.split("\\.").length);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4098d(C1748l c1748l) {
        String str = c1748l.m4847p0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m4099d(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0 || !m4084b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i <= 0) {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m4100e(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Context m4101e(Context context) {
        return m4119l(context) ? context : C1748l.m4756p();
    }

    /* JADX INFO: renamed from: e */
    public static String m4102e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4103e(C1748l c1748l) {
        return ((Boolean) c1748l.m4801a(C1831z4.f3924f2)).booleanValue() ? c1748l.m4847p0().isMuted() : ((Boolean) c1748l.m4801a(C1831z4.f3906d2)).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static WindowManager m4104f(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StrictMode.setVmPolicy(vmPolicy);
        return windowManager;
    }

    /* JADX INFO: renamed from: f */
    public static C1748l m4105f() {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l != null) {
            return c1748l;
        }
        Context contextM4756p = C1748l.m4756p();
        if (contextM4756p == null) {
            return null;
        }
        return AppLovinSdk.getInstance(contextM4756p).m5807a();
    }

    /* JADX INFO: renamed from: f */
    public static String m4106f(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    /* JADX INFO: renamed from: g */
    public static int m4107g() {
        if (AbstractC1677p0.m3804b()) {
            return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m4108g(String str) {
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                C1768p.m5167h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4109g(Context context) {
        return C1817y.m5604a(context).m5606a("applovin.sdk.is_test_environment");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4110h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4111h(Context context) {
        if (f2664f == null) {
            f2664f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f2664f.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m4112i(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f2667i;
        if (bool != null) {
            return bool;
        }
        try {
            String strM5605a = C1817y.m5604a(context).m5605a();
            String strM4089c = m4089c(context);
            if (strM4089c == null) {
                return null;
            }
            if (strM4089c.equals(strM5605a)) {
                Boolean bool2 = Boolean.TRUE;
                f2667i = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(strM5605a) && strM4089c.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f2667i = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f2667i = bool4;
            return bool4;
        } catch (Throwable th) {
            C1768p.m5162b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4113i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4114j() {
        return !m4066a("com.applovin.sdk.AppLovinSdk");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4115j(Context context) {
        if (f2665g == null) {
            f2665g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f2665g.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4116k() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C1768p.m5164c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4117k(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4118l() {
        Context contextM4756p = C1748l.m4756p();
        if (contextM4756p != null) {
            return C1817y.m5604a(contextM4756p).m5606a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4119l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4120m(Context context) {
        if (context == null) {
            context = C1748l.m4756p();
        }
        if (context != null) {
            return C1817y.m5604a(context).m5607a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }
}
