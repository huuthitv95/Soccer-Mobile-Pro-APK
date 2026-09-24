package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C11391D1;
import com.ironsource.C11455Gb;
import com.ironsource.C11486I6;
import com.ironsource.C11579N9;
import com.ironsource.C11666Sa;
import com.ironsource.C11676T3;
import com.ironsource.C11753Xc;
import com.ironsource.C12193f9;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.logger.C12362c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.unity3d.mediation.LevelPlay;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceUtils {

    /* JADX INFO: renamed from: A */
    private static int f31474A = 1;

    /* JADX INFO: renamed from: B */
    private static AtomicBoolean f31475B = new AtomicBoolean(false);

    /* JADX INFO: renamed from: C */
    private static String f31476C = null;

    /* JADX INFO: renamed from: D */
    private static Boolean f31477D = null;

    /* JADX INFO: renamed from: E */
    private static IronSourceUtils f31478E = new IronSourceUtils();

    /* JADX INFO: renamed from: a */
    private static final String f31479a = "default_is_events_formatter_type";

    /* JADX INFO: renamed from: b */
    private static final String f31480b = "default_is_events_url";

    /* JADX INFO: renamed from: c */
    private static final String f31481c = "default_is_non_connectivity_events";

    /* JADX INFO: renamed from: d */
    private static final String f31482d = "default_is_opt_in_events";

    /* JADX INFO: renamed from: e */
    private static final String f31483e = "default_is_opt_out_events";

    /* JADX INFO: renamed from: f */
    private static final String f31484f = "default_is_trigger_events";

    /* JADX INFO: renamed from: g */
    private static final String f31485g = "default_rv_events_formatter_type";

    /* JADX INFO: renamed from: h */
    private static final String f31486h = "default_rv_events_url";

    /* JADX INFO: renamed from: i */
    private static final String f31487i = "default_rv_non_connectivity_events";

    /* JADX INFO: renamed from: j */
    private static final String f31488j = "default_rv_opt_in_events";

    /* JADX INFO: renamed from: k */
    private static final String f31489k = "default_rv_opt_out_events";

    /* JADX INFO: renamed from: l */
    private static final String f31490l = "default_rv_trigger_events";

    /* JADX INFO: renamed from: m */
    private static final String f31491m = "default_pxl_events_url";

    /* JADX INFO: renamed from: n */
    private static final String f31492n = "default_pxl_trigger_events";

    /* JADX INFO: renamed from: o */
    private static final String f31493o = "default_app_opt_in_events";

    /* JADX INFO: renamed from: p */
    private static final String f31494p = "default_app_opt_out_events";

    /* JADX INFO: renamed from: q */
    private static final String f31495q = "default_app_events_url";

    /* JADX INFO: renamed from: r */
    private static final String f31496r = "default_app_trigger_events";

    /* JADX INFO: renamed from: s */
    private static final String f31497s = "default_app_events_formatter_type";

    /* JADX INFO: renamed from: t */
    private static final String f31498t = "default_app_non_connectivity_events";

    /* JADX INFO: renamed from: u */
    private static final String f31499u = "general_properties";

    /* JADX INFO: renamed from: v */
    private static final String f31500v = "last_response";

    /* JADX INFO: renamed from: w */
    private static final String f31501w = "firstSessionTimestamp";

    /* JADX INFO: renamed from: x */
    private static final String f31502x = "providerPriority";

    /* JADX INFO: renamed from: y */
    private static final String f31503y = "9.3.0";

    /* JADX INFO: renamed from: z */
    private static final String f31504z = "Mediation_Shared_Preferences";

    /* JADX INFO: renamed from: a */
    public static String m32732a(long j, String str) {
        return m32781h(String.format("%s%s%s", Long.valueOf(j), C12367p.m32628h().m32668i(), str));
    }

    /* JADX INFO: renamed from: b */
    public static IronSourceUtils m32745b() {
        return f31478E;
    }

    /* JADX INFO: renamed from: c */
    private static String m32759c(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31479a;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f31485g;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31497s : "";
    }

    /* JADX INFO: renamed from: d */
    private static String m32765d(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31481c;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f31487i;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31498t : "";
    }

    /* JADX INFO: renamed from: e */
    private static String m32771e(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31482d;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f31488j;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31493o : "";
    }

    /* JADX INFO: renamed from: f */
    private static String m32775f(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31483e;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f31489k;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31494p : "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m32779g() {
        return f31474A == 1;
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        HashMap map = new HashMap();
        try {
            C11666Sa c11666SaMo25856a = C11455Gb.m25891U().mo25844f().mo25856a();
            if (c11666SaMo25856a != null) {
                for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
                    HashMap map2 = new HashMap();
                    map.put(adFormat, map2);
                    for (String str : c11666SaMo25856a.m27463a(adFormat)) {
                        if (!str.equals(C11391D1.f24195e)) {
                            map2.put(str, new JSONObject());
                        }
                    }
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e);
        }
        return map;
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.3.0";
    }

    /* JADX INFO: renamed from: h */
    public static String m32781h(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            C12317m4.m32153d().m32155a(e);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m32782i(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i) {
        f31474A = i;
    }

    /* JADX INFO: renamed from: b */
    private static String m32748b(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31480b;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f31486h;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f31491m;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31495q : "";
    }

    /* JADX INFO: renamed from: g */
    private static String m32778g(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f31484f;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f31490l;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f31492n;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f31496r : "";
    }

    /* JADX INFO: renamed from: a */
    public static String m32733a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return C11676T3.f25719b;
            }
            return networkCapabilities.hasTransport(0) ? C11676T3.f25724g : "none";
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.NATIVE.error("failed to connection type - exception = " + e);
            return "none";
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m32767d(Context context, String str, int[] iArr) {
        String string;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(m32778g(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m32773e(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            editorEdit.putString(m32748b(str), str2);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m32776f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m32760c(Context context, String str, int[] iArr) {
        String string;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(m32775f(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m32755b(Context context, String str, int[] iArr) {
        String string;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(m32771e(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m32780g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m32774f() {
        String strM26070a = C11486I6.m26069a().m26070a("userId");
        if (TextUtils.isEmpty(strM26070a)) {
            return null;
        }
        return strM26070a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m32777f(Context context) {
        return C11753Xc.m27956e(context);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m32772e(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
        editorEdit.putString(f31500v, str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public static String m32770e(Context context) {
        return context.getSharedPreferences(f31504z, 0).getString(f31500v, "");
    }

    /* JADX INFO: renamed from: e */
    public static long m32769e() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m32766d(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            editorEdit.putString(m32759c(str), str2);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized int[] m32762c(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f31504z, 0).getString(m32775f(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m32747b(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f31504z, 0).getString(m32748b(str), str2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
        }
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized int[] m32768d(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f31504z, 0).getString(m32778g(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized int[] m32756b(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f31504z, 0).getString(m32771e(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m32741a(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new C12362c());
        thread.start();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m32740a(Context context, String str, int[] iArr) {
        String string;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(m32765d(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m32758c(Context context, String str, String str2) {
        return context.getSharedPreferences(f31504z, 0).getString(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m32761c(Context context) {
        if (f31477D == null) {
            f31477D = Boolean.valueOf(!C12193f9.m31469a(context));
        }
        return f31477D.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static String m32757c() {
        return C11486I6.m26069a().m26070a("userId");
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m32751b(boolean z) {
        return m32739a(z, false, 1);
    }

    /* JADX INFO: renamed from: b */
    public static void m32754b(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m32764d() {
        if (f31475B.compareAndSet(false, true)) {
            f31476C = UUID.randomUUID().toString();
        }
        return f31476C;
    }

    /* JADX INFO: renamed from: b */
    public static void m32752b(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public static C11579N9 m32763d(Context context) {
        String str;
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        if (context == null) {
            return null;
        }
        String strMo27297b = C12367p.m32628h().mo27297b(context);
        if (!TextUtils.isEmpty(strMo27297b)) {
            str = IronSourceConstants.TYPE_GAID;
        } else {
            strMo27297b = interfaceC12582w7Mo25842a.mo27886a(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        }
        return new C11579N9(strMo27297b, str);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m32734a(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f31504z, 0).getString(m32759c(str), str2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m32753b(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f31504z, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m32750b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject == null && jSONObject2 == null) {
                return new JSONObject();
            }
            if (jSONObject == null) {
                return jSONObject2;
            }
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.has(next)) {
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized int[] m32744a(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f31504z, 0).getString(m32765d(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m32749b(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static String m32746b(Context context) {
        if (C11455Gb.m25891U().mo25842a().mo27891b(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m32738a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
                return jSONObject;
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m32736a(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i < list.size() && i2 < list2.size(); i2++) {
                String str2 = list.get(i);
                String str3 = list2.get(i2);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m32739a(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2 && i != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i);
                return jSONObject;
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32742a(Context context, String str, boolean z) {
        return context.getSharedPreferences(f31504z, 0).getBoolean(str, z);
    }

    /* JADX INFO: renamed from: a */
    public static int m32729a(Context context, String str, int i) {
        return context.getSharedPreferences(f31504z, 0).getInt(str, i);
    }

    /* JADX INFO: renamed from: a */
    public static long m32730a(Context context, String str, long j) {
        return context.getSharedPreferences(f31504z, 0).getLong(str, j);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m32737a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObject3.optJSONObject(next) != null) {
                jSONObject3.put(next, m32737a(jSONObject3.getJSONObject(next), (JSONObject) obj));
            } else {
                jSONObject3.put(next, obj);
            }
        }
        return jSONObject3;
    }

    /* JADX INFO: renamed from: a */
    public static List<Pair<String, String>> m32735a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32743a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m32731a() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }
}
