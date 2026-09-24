package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.J6 */
/* JADX INFO: loaded from: classes6.dex */
public class RunnableC11504J6 implements Runnable {

    /* JADX INFO: renamed from: M */
    public static final String f24724M = "sdkVersion";

    /* JADX INFO: renamed from: N */
    public static final String f24725N = "AdvIdOptOutReason";

    /* JADX INFO: renamed from: O */
    private static final int f24726O = 15;

    /* JADX INFO: renamed from: P */
    private static final int f24727P = 840;

    /* JADX INFO: renamed from: Q */
    private static final int f24728Q = -720;

    /* JADX INFO: renamed from: K */
    private Context f24739K;

    /* JADX INFO: renamed from: a */
    private final String f24741a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    private final String f24742b = "bundleId";

    /* JADX INFO: renamed from: c */
    private final String f24743c = "advertisingId";

    /* JADX INFO: renamed from: d */
    private final String f24744d = C11744X3.j.f26419M;

    /* JADX INFO: renamed from: e */
    private final String f24745e = "appKey";

    /* JADX INFO: renamed from: f */
    private final String f24746f = C11683Ta.f25802o;

    /* JADX INFO: renamed from: g */
    private final String f24747g = "osVersion";

    /* JADX INFO: renamed from: h */
    private final String f24748h = "connectionType";

    /* JADX INFO: renamed from: i */
    private final String f24749i = "rawConnectionType";

    /* JADX INFO: renamed from: j */
    private final String f24750j = "language";

    /* JADX INFO: renamed from: k */
    private final String f24751k = "deviceOEM";

    /* JADX INFO: renamed from: l */
    private final String f24752l = "deviceModel";

    /* JADX INFO: renamed from: m */
    private final String f24753m = C11744X3.j.f26466r;

    /* JADX INFO: renamed from: n */
    private final String f24754n = C11683Ta.f25805r;

    /* JADX INFO: renamed from: o */
    private final String f24755o = C11683Ta.f25806s;

    /* JADX INFO: renamed from: p */
    private final String f24756p = "battery";

    /* JADX INFO: renamed from: q */
    private final String f24757q = "gmtMinutesOffset";

    /* JADX INFO: renamed from: r */
    private final String f24758r = "appVersion";

    /* JADX INFO: renamed from: s */
    private final String f24759s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* JADX INFO: renamed from: t */
    private final String f24760t = "pluginType";

    /* JADX INFO: renamed from: u */
    private final String f24761u = "pluginVersion";

    /* JADX INFO: renamed from: v */
    private final String f24762v = "plugin_fw_v";

    /* JADX INFO: renamed from: w */
    private final String f24763w = C11683Ta.f25808u;

    /* JADX INFO: renamed from: x */
    private final String f24764x = C11683Ta.f25807t;

    /* JADX INFO: renamed from: y */
    private final String f24765y = C11540L6.f24958a1;

    /* JADX INFO: renamed from: z */
    private final String f24766z = C11683Ta.f25810w;

    /* JADX INFO: renamed from: A */
    private final String f24729A = "mcc";

    /* JADX INFO: renamed from: B */
    private final String f24730B = "mnc";

    /* JADX INFO: renamed from: C */
    private final String f24731C = "icc";

    /* JADX INFO: renamed from: D */
    private final String f24732D = "tz";

    /* JADX INFO: renamed from: E */
    private final String f24733E = "auid";

    /* JADX INFO: renamed from: F */
    private final String f24734F = "userLat";

    /* JADX INFO: renamed from: G */
    private final String f24735G = "publisherAPI";

    /* JADX INFO: renamed from: H */
    private final String f24736H = "missingDependencies";

    /* JADX INFO: renamed from: I */
    private final String f24737I = "missingManifest";

    /* JADX INFO: renamed from: J */
    private final String f24738J = "other";

    /* JADX INFO: renamed from: L */
    private final InterfaceC12582w7 f24740L = C11455Gb.m25891U().mo25842a();

    private RunnableC11504J6() {
    }

    /* JADX INFO: renamed from: a */
    private Map<String, Object> m26182a() {
        boolean z;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.m32764d());
        String strM26187e = m26187e();
        if (!TextUtils.isEmpty(strM26187e)) {
            map.put("bundleId", strM26187e);
            String strM25648b = C11409E1.m25648b(this.f24739K, strM26187e);
            if (!TextUtils.isEmpty(strM25648b)) {
                map.put("appVersion", strM25648b);
            }
        }
        map.put("appKey", m26185c());
        String strMo27878J = this.f24740L.mo27878J(this.f24739K);
        String strMo27894c = this.f24740L.mo27894c(this.f24739K);
        boolean z2 = false;
        if (TextUtils.isEmpty(strMo27878J)) {
            strMo27878J = this.f24740L.mo27886a(this.f24739K);
            z = true;
            str = !TextUtils.isEmpty(strMo27878J) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!TextUtils.isEmpty(strMo27878J)) {
            map.put("advertisingId", strMo27878J);
            map.put(C11683Ta.f25807t, str);
        }
        if (!TextUtils.isEmpty(strMo27894c)) {
            z2 = Boolean.parseBoolean(strMo27894c);
            map.put(C11744X3.j.f26419M, Boolean.valueOf(z2));
        }
        if (z || z2) {
            map.put(f24725N, m26181a(strMo27894c));
        }
        map.put(C11683Ta.f25802o, m26190h());
        if (!TextUtils.isEmpty(m26184b())) {
            map.put("osVersion", m26184b());
        }
        String strM32733a = IronSourceUtils.m32733a(this.f24739K);
        if (!TextUtils.isEmpty(strM32733a)) {
            map.put("connectionType", strM32733a);
        }
        String strM27579d = C11693U3.m27579d(this.f24739K);
        if (!TextUtils.isEmpty(strM27579d)) {
            map.put("rawConnectionType", strM27579d);
        }
        map.put("sdkVersion", m26200r());
        String strM26194l = m26194l();
        if (!TextUtils.isEmpty(strM26194l)) {
            map.put("language", strM26194l);
        }
        String strM26189g = m26189g();
        if (!TextUtils.isEmpty(strM26189g)) {
            map.put("deviceOEM", strM26189g);
        }
        String strM26188f = m26188f();
        if (!TextUtils.isEmpty(strM26188f)) {
            map.put("deviceModel", strM26188f);
        }
        String strM26196n = m26196n();
        if (!TextUtils.isEmpty(strM26196n)) {
            map.put(C11744X3.j.f26466r, strM26196n);
        }
        map.put(C11683Ta.f25806s, Long.valueOf(m26193k()));
        map.put(C11683Ta.f25805r, Long.valueOf(m26191i()));
        map.put("battery", Integer.valueOf(m26186d()));
        int iM26192j = m26192j();
        if (m26183a(iM26192j)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iM26192j));
        }
        String strM26198p = m26198p();
        if (!TextUtils.isEmpty(strM26198p)) {
            map.put("pluginType", strM26198p);
        }
        String strM26199q = m26199q();
        if (!TextUtils.isEmpty(strM26199q)) {
            map.put("pluginVersion", strM26199q);
        }
        String strM26197o = m26197o();
        if (!TextUtils.isEmpty(strM26197o)) {
            map.put("plugin_fw_v", strM26197o);
        }
        String strValueOf = String.valueOf(this.f24740L.mo27920p());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put(C11683Ta.f25808u, strValueOf);
        }
        String strM26195m = m26195m();
        if (!TextUtils.isEmpty(strM26195m)) {
            map.put(C11540L6.f24958a1, strM26195m);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.m32761c(this.f24739K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put(C11683Ta.f25810w, strValueOf2);
        }
        String strMo27898e = this.f24740L.mo27898e(this.f24739K);
        if (!TextUtils.isEmpty(strMo27898e)) {
            map.put("auid", strMo27898e);
        }
        map.put("mcc", Integer.valueOf(C11676T3.m27501b(this.f24739K)));
        map.put("mnc", Integer.valueOf(C11676T3.m27502c(this.f24739K)));
        String strMo27876H = this.f24740L.mo27876H(this.f24739K);
        if (!TextUtils.isEmpty(strMo27876H)) {
            map.put("icc", strMo27876H);
        }
        String strMo27895d = this.f24740L.mo27895d();
        if (!TextUtils.isEmpty(strMo27895d)) {
            map.put("tz", strMo27895d);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    /* JADX INFO: renamed from: b */
    private String m26184b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private String m26185c() {
        return C12367p.m32628h().m32668i();
    }

    /* JADX INFO: renamed from: d */
    private int m26186d() {
        try {
            Intent intentRegisterReceiver = this.f24739K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f24741a + ":getBatteryLevel()", e);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private String m26187e() {
        try {
            return this.f24739K.getPackageName();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    private String m26188f() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    private String m26189g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private String m26190h() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: i */
    private long m26191i() {
        if (!m26201s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX INFO: renamed from: j */
    private int m26192j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f24741a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    private long m26193k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    private String m26194l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    private String m26195m() {
        return C12367p.m32628h().m32671k();
    }

    /* JADX INFO: renamed from: n */
    private String m26196n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f24739K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f24741a + ":getMobileCarrier()", e);
        }
        return "";
    }

    /* JADX INFO: renamed from: r */
    private String m26200r() {
        return LevelPlay.getSdkVersion();
    }

    /* JADX INFO: renamed from: s */
    private boolean m26201s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C11486I6.m26069a().m26072a(m26182a());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }

    /* JADX INFO: renamed from: o */
    private String m26197o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    private String m26198p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    private String m26199q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    public RunnableC11504J6(Context context) {
        this.f24739K = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private boolean m26183a(int i) {
        return i <= f24727P && i >= f24728Q && i % 15 == 0;
    }

    /* JADX INFO: renamed from: a */
    private String m26181a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!C11694U4.f25873a.m27585b()) {
            return "publisherAPI";
        }
        if (this.f24740L.mo27904h(this.f24739K)) {
            return Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }
}
