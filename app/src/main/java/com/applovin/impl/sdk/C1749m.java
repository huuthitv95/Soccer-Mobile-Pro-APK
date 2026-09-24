package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Range;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.AbstractC1675o8;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1694q0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1714s0;
import com.applovin.impl.AbstractC1790v;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1804w4;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1540e4;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1684p7;
import com.applovin.impl.C1699q5;
import com.applovin.impl.C1704r0;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.d$$ExternalSyntheticApiModelOutline0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.Scopes;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.tiktok.util.UrlConst;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.model.Cookie;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.m */
/* JADX INFO: loaded from: classes3.dex */
public class C1749m {

    /* JADX INFO: renamed from: j */
    private static String f3097j;

    /* JADX INFO: renamed from: k */
    private static String f3098k;

    /* JADX INFO: renamed from: l */
    private static final AtomicReference f3099l = new AtomicReference();

    /* JADX INFO: renamed from: m */
    private static final AtomicReference f3100m = new AtomicReference();

    /* JADX INFO: renamed from: a */
    private final C1748l f3101a;

    /* JADX INFO: renamed from: b */
    private final C1768p f3102b;

    /* JADX INFO: renamed from: c */
    private final Context f3103c;

    /* JADX INFO: renamed from: d */
    private final Map f3104d;

    /* JADX INFO: renamed from: f */
    private final Map f3106f;

    /* JADX INFO: renamed from: h */
    private boolean f3108h;

    /* JADX INFO: renamed from: e */
    private final Object f3105e = new Object();

    /* JADX INFO: renamed from: g */
    private final Object f3107g = new Object();

    /* JADX INFO: renamed from: i */
    private final AtomicReference f3109i = new AtomicReference();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.m$a */
    class a implements C1699q5.a {
        a() {
        }

        @Override // com.applovin.impl.C1699q5.a
        /* JADX INFO: renamed from: a */
        public void mo4013a(AbstractC1790v.a aVar) {
            C1749m.f3099l.set(aVar);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.m$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f3111a;

        /* JADX INFO: renamed from: b */
        public final int f3112b;

        public b(String str, int i) {
            this.f3111a = str;
            this.f3112b = i;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.m$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public int f3113a = -1;

        /* JADX INFO: renamed from: b */
        public int f3114b = -1;

        /* JADX INFO: renamed from: c */
        public Boolean f3115c = null;
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.m$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        String mo4948a(ContentResolver contentResolver, String str);
    }

    protected C1749m(C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3101a = c1748l;
        this.f3102b = c1748l.m4782Q();
        this.f3103c = C1748l.m4756p();
        this.f3104d = m4872D();
        this.f3106f = m4871C();
    }

    /* JADX INFO: renamed from: B */
    private String m4870B() {
        AudioManager audioManager = (AudioManager) this.f3103c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            sb.append(audioDeviceInfo.getType());
            sb.append(",");
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && C1768p.m5160a()) {
            this.f3102b.m5171a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    /* JADX INFO: renamed from: C */
    private Map m4871C() {
        HashMap map = new HashMap();
        PackageManager packageManager = this.f3103c.getPackageManager();
        ApplicationInfo applicationInfo = this.f3103c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        int i = AbstractC1677p0.m3812f() ? 134238224 : 20560;
        PackageInfo packageInfoM4023a = AbstractC1701q7.m4023a(this.f3103c, 0);
        PackageInfo packageInfoM4023a2 = AbstractC1701q7.m4023a(this.f3103c, i);
        String strM4890a = m4890a(applicationInfo.packageName, packageManager, this.f3101a);
        String strM4889a = m4889a(applicationInfo.packageName, packageManager);
        map.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfoM4023a != null ? packageInfoM4023a.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfoM4023a != null ? packageInfoM4023a.versionCode : -1));
        map.put("installer_name", StringUtils.emptyIfNull(strM4890a));
        map.put("originating_name", StringUtils.emptyIfNull(strM4889a));
        map.put("tg", C1684p7.m3889a(this.f3101a));
        map.put("debug", Boolean.valueOf(AbstractC1701q7.m4092c(this.f3101a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(C1748l.m4755o()));
        map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.f3101a.m4846o0().getSessionId());
        map.put("j8", Boolean.valueOf(C1748l.m4716H0()));
        map.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        map.put("last_update_ms", Long.valueOf(packageInfoM4023a != null ? packageInfoM4023a.lastUpdateTime : 0L));
        List listM4913d = m4913d(packageInfoM4023a2);
        if (!CollectionUtils.isEmpty(listM4913d)) {
            map.put("signing_info", listM4913d);
        }
        List listM4891a = m4891a(packageInfoM4023a2);
        if (!CollectionUtils.isEmpty(listM4891a)) {
            map.put("instrumentation", listM4891a);
        }
        map.put("install_location", Integer.valueOf(packageInfoM4023a != null ? packageInfoM4023a.installLocation : 0));
        map.put("split_names", packageInfoM4023a != null ? packageInfoM4023a.splitNames : Collections.EMPTY_LIST);
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3787O4)).booleanValue()) {
            Map mapM4910c = m4910c(packageInfoM4023a2);
            if (!CollectionUtils.isEmpty(mapM4910c)) {
                map.put("req_p", mapM4910c);
            }
            List listM4905b = m4905b(packageInfoM4023a2);
            if (!CollectionUtils.isEmpty(listM4905b)) {
                map.put("req_f", listM4905b);
            }
        }
        C1748l c1748l = this.f3101a;
        C1511b5 c1511b5 = C1511b5.f1168h;
        Long l = (Long) c1748l.m4799a(c1511b5);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f3101a.m4818b(c1511b5, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f3101a.m4831g0().m3129c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1585j.m2942b(), map);
        map.put("api_did", this.f3101a.m4801a(C1831z4.f3921f));
        map.put("first_install_v3_ms", packageInfoM4023a != null ? Long.valueOf(packageInfoM4023a.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f3101a.m4778N(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f3101a.m4779O()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (AbstractC1677p0.m3810d()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f3101a.m4774J0()) {
            map.put("unity_version", AbstractC1701q7.m4032a(this.f3101a.m4847p0()));
        }
        List listM4916i = m4916i();
        if (!CollectionUtils.isEmpty(listM4916i)) {
            map.put("application_start_info", listM4916i);
        }
        List listM4914g = m4914g();
        if (!CollectionUtils.isEmpty(listM4914g)) {
            map.put("application_exit_info", listM4914g);
        }
        if (AbstractC1677p0.m3811e()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    /* JADX INFO: renamed from: D */
    private Map m4872D() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(AbstractC1790v.m5320a()));
        map.put("locale", Locale.getDefault().toString());
        map.put(C11540L6.f24899B, Build.MODEL);
        map.put(C11540L6.f24911F, Build.VERSION.RELEASE);
        map.put(C11540L6.f24917H, m4932A());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(m4873E()));
        map.put("gy", Boolean.valueOf(m4926u()));
        map.put("country_code", m4920n());
        map.put("mcc", m4930y());
        map.put("mnc", m4931z());
        map.put(C11540L6.f24937Q0, m4919l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f3103c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", m4881S());
        map.put("supported_abis", CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS));
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f3103c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            AbstractC1677p0.b bVarM3795a = AbstractC1677p0.m3795a(this.f3103c, this.f3101a);
            if (bVarM3795a != null) {
                map.put("tl_cr", Integer.valueOf(bVarM3795a.m3826c()));
                map.put("tr_cr", Integer.valueOf(bVarM3795a.m3827d()));
                map.put("bl_cr", Integer.valueOf(bVarM3795a.m3823a()));
                map.put("br_cr", Integer.valueOf(bVarM3795a.m3825b()));
            }
        }
        map.put("bt_ms", Long.valueOf(m4918k()));
        map.put("tbalsi_ms", Long.valueOf(this.f3101a.m4777M() - C1748l.m4755o()));
        CollectionUtils.putStringIfValid("process_name", AbstractC1701q7.m4089c(this.f3103c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", AbstractC1701q7.m4112i(this.f3103c), map);
        try {
            PackageInfo packageInfo = this.f3103c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", AbstractC1664n7.m3673a(this.f3103c), map);
        m4902a(map);
        return map;
    }

    /* JADX INFO: renamed from: E */
    private double m4873E() {
        return Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01cf, please report this as an issue */
    /* JADX INFO: renamed from: F */
    private JSONArray m4874F() {
        char c2;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        MediaCodecInfo[] mediaCodecInfoArr2;
        int i3;
        int i4;
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        ArrayList arrayList = new ArrayList();
        try {
            char c3 = 1;
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            int i5 = 0;
            while (i5 < length) {
                MediaCodecInfo mediaCodecInfo2 = codecInfos[i5];
                if (mediaCodecInfo2.isEncoder()) {
                    c2 = c3;
                    mediaCodecInfoArr = codecInfos;
                    i = length;
                    i2 = i5;
                } else {
                    HashMap map = new HashMap();
                    map.put("name", mediaCodecInfo2.getName());
                    if (AbstractC1677p0.m3813g()) {
                        map.put("is_hardware_accelerated", Boolean.valueOf(mediaCodecInfo2.isHardwareAccelerated()));
                        map.put("is_software_only", Boolean.valueOf(mediaCodecInfo2.isSoftwareOnly()));
                    }
                    String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                    ArrayList arrayList2 = new ArrayList();
                    HashMap map2 = new HashMap();
                    int length2 = supportedTypes.length;
                    c2 = c3;
                    int i6 = 0;
                    while (i6 < length2) {
                        String str = supportedTypes[i6];
                        int i7 = i6;
                        if (str.toLowerCase(Locale.ROOT).startsWith("video/")) {
                            arrayList2.add(str);
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str);
                                if (capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) {
                                    mediaCodecInfoArr2 = codecInfos;
                                    i3 = length;
                                    i4 = i5;
                                    mediaCodecInfo = mediaCodecInfo2;
                                } else {
                                    mediaCodecInfoArr2 = codecInfos;
                                    try {
                                        HashMap map3 = new HashMap();
                                        i3 = length;
                                        try {
                                            i4 = i5;
                                            try {
                                                map3.put("max_width", videoCapabilities.getSupportedWidths().getUpper());
                                                map3.put("max_height", videoCapabilities.getSupportedHeights().getUpper());
                                                Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
                                                Integer num = (Integer) bitrateRange.getLower();
                                                Integer num2 = (Integer) bitrateRange.getUpper();
                                                mediaCodecInfo = mediaCodecInfo2;
                                                try {
                                                    Integer[] numArr = new Integer[2];
                                                    numArr[0] = num;
                                                    numArr[c2] = num2;
                                                    map3.put("bitrate_range_bps", Arrays.asList(numArr));
                                                    Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
                                                    Integer num3 = (Integer) supportedFrameRates.getLower();
                                                    Integer num4 = (Integer) supportedFrameRates.getUpper();
                                                    Integer[] numArr2 = new Integer[2];
                                                    numArr2[0] = num3;
                                                    numArr2[c2] = num4;
                                                    map3.put("overall_frame_rate_range", Arrays.asList(numArr2));
                                                    int iIntValue = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                                                    int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                                                    if (videoCapabilities.isSizeSupported(iIntValue, iIntValue2)) {
                                                        try {
                                                            Range<Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(iIntValue, iIntValue2);
                                                            if (supportedFrameRatesFor != null) {
                                                                Double d2 = (Double) supportedFrameRatesFor.getLower();
                                                                Double d3 = (Double) supportedFrameRatesFor.getUpper();
                                                                Double[] dArr = new Double[2];
                                                                dArr[0] = d2;
                                                                dArr[c2] = d3;
                                                                map3.put("frame_rate_range_for_max_res", Arrays.asList(dArr));
                                                            }
                                                        } catch (Throwable th) {
                                                            if (C1768p.m5160a()) {
                                                                this.f3102b.m5172a("DataCollector", "Could not get frame rates for max resolution for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                            }
                                                        }
                                                    }
                                                    ArrayList arrayList3 = new ArrayList();
                                                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                                    if (codecProfileLevelArr != null && codecProfileLevelArr.length > 0) {
                                                        int i8 = 0;
                                                        for (int length3 = codecProfileLevelArr.length; i8 < length3; length3 = length3) {
                                                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i8];
                                                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                                            HashMap map4 = new HashMap();
                                                            map4.put(Scopes.PROFILE, Integer.valueOf(codecProfileLevel.profile));
                                                            map4.put("level", Integer.valueOf(codecProfileLevel.level));
                                                            arrayList3.add(map4);
                                                            i8++;
                                                            codecProfileLevelArr = codecProfileLevelArr2;
                                                        }
                                                        map3.put("profile_levels", arrayList3);
                                                    }
                                                    if (!map3.isEmpty()) {
                                                        map2.put(str, map3);
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (C1768p.m5160a()) {
                                                        this.f3102b.m5172a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mediaCodecInfo = mediaCodecInfo2;
                                                if (C1768p.m5160a()) {
                                                    this.f3102b.m5172a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                }
                                                i6 = i7 + 1;
                                                codecInfos = mediaCodecInfoArr2;
                                                length = i3;
                                                i5 = i4;
                                                mediaCodecInfo2 = mediaCodecInfo;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            i4 = i5;
                                            mediaCodecInfo = mediaCodecInfo2;
                                            if (C1768p.m5160a()) {
                                                this.f3102b.m5172a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                            }
                                            i6 = i7 + 1;
                                            codecInfos = mediaCodecInfoArr2;
                                            length = i3;
                                            i5 = i4;
                                            mediaCodecInfo2 = mediaCodecInfo;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i3 = length;
                                        i4 = i5;
                                        mediaCodecInfo = mediaCodecInfo2;
                                        if (C1768p.m5160a()) {
                                            this.f3102b.m5172a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                        }
                                        i6 = i7 + 1;
                                        codecInfos = mediaCodecInfoArr2;
                                        length = i3;
                                        i5 = i4;
                                        mediaCodecInfo2 = mediaCodecInfo;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                mediaCodecInfoArr2 = codecInfos;
                            }
                        } else {
                            mediaCodecInfoArr2 = codecInfos;
                            i3 = length;
                            i4 = i5;
                            mediaCodecInfo = mediaCodecInfo2;
                        }
                        i6 = i7 + 1;
                        codecInfos = mediaCodecInfoArr2;
                        length = i3;
                        i5 = i4;
                        mediaCodecInfo2 = mediaCodecInfo;
                    }
                    mediaCodecInfoArr = codecInfos;
                    i = length;
                    i2 = i5;
                    if (!arrayList2.isEmpty()) {
                        map.put("supported_mime_types", arrayList2);
                        if (!map2.isEmpty()) {
                            map.put("capabilities_by_type", map2);
                        }
                        arrayList.add(map);
                    }
                }
                i5 = i2 + 1;
                c3 = c2;
                codecInfos = mediaCodecInfoArr;
                length = i;
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable th7) {
            if (C1768p.m5160a()) {
                this.f3102b.m5172a("DataCollector", "Failed to get MediaCodecList", th7);
            }
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: J */
    public static String m4875J() {
        return f3098k;
    }

    /* JADX INFO: renamed from: L */
    private Map m4876L() {
        return AbstractC1701q7.m4042a(m4941a((Map) null, true, false));
    }

    /* JADX INFO: renamed from: O */
    private boolean m4877O() {
        try {
            return m4908b() || m4911c();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: P */
    private Boolean m4878P() {
        if (AbstractC1677p0.m3813g()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(AbstractC1701q7.m4037a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f3101a)));
    }

    /* JADX INFO: renamed from: Q */
    private boolean m4879Q() {
        ConnectivityManager connectivityManager;
        if (AbstractC1677p0.m3810d() && (connectivityManager = (ConnectivityManager) this.f3103c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f3101a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f3101a.m4782Q().m5172a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    private boolean m4880R() {
        boolean z = this.f3103c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f3103c.getPackageManager();
        return z && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    /* JADX INFO: renamed from: S */
    private Boolean m4881S() {
        if (AbstractC1677p0.m3811e()) {
            return Boolean.valueOf(this.f3103c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m4882U() {
        this.f3109i.set(m4924s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m4883V() {
        Map mapM4885X = m4885X();
        List listM4884W = m4884W();
        synchronized (this.f3107g) {
            if (mapM4885X != null) {
                try {
                    this.f3106f.putAll(mapM4885X);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (listM4884W != null) {
                this.f3106f.put(CmcdConfiguration.KEY_DEADLINE, listM4884W);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private List m4884W() {
        List listM4821c = this.f3101a.m4821c(C1831z4.f3755K4);
        if (CollectionUtils.isEmpty(listM4821c)) {
            return null;
        }
        return AbstractC1701q7.m4037a("/proc/self/maps", listM4821c, this.f3101a);
    }

    /* JADX INFO: renamed from: X */
    private Map m4885X() {
        boolean z;
        int i;
        Throwable th;
        if (!((Boolean) this.f3101a.m4801a(C1831z4.f3747J4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z = false;
            i = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z && string.contains("de.robv.android.xposed")) {
                            z = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f3101a.m4764E().m4336b("DataCollector", "collectHookingSignals", th);
                }
            }
        } catch (Throwable th3) {
            z = false;
            i = 0;
            th = th3;
        }
        map.put("xpd", Boolean.valueOf(z));
        map.put("zi_count", Integer.valueOf(i));
        CollectionUtils.putBooleanIfValid("fpd", m4878P(), map);
        return map;
    }

    /* JADX INFO: renamed from: Z */
    private void m4886Z() {
        this.f3101a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3101a, "collectPostInitAppInfo", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4883V();
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: a */
    private String m4887a(ApplicationExitInfo applicationExitInfo, int i) {
        InputStream traceInputStream;
        String line;
        if (this.f3101a.m4821c(C1831z4.f3723G4).contains(Integer.toString(i))) {
            return null;
        }
        Integer num = (Integer) this.f3101a.m4801a(C1831z4.f3715F4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th) {
            this.f3101a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3101a.m4782Q().m5172a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
            }
            this.f3101a.m4764E().m4336b("DataCollector", "getTraceInputStream", th);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i2 = 0; i2 < num.intValue() && (line = bufferedReader.readLine()) != null; i2++) {
                try {
                    sb.append(line);
                    sb.append('\n');
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (Throwable th4) {
            this.f3101a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3101a.m4782Q().m5172a("DataCollector", "Failed to read stack trace from input stream", th4);
            }
            this.f3101a.m4764E().m4336b("DataCollector", "readStackTraceFromInputStream", th4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private String m4888a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.mo4948a(contentResolver, str);
        } catch (Throwable th) {
            this.f3101a.m4764E().m4332a("DataCollector", "retrieveSystemSettingValue", th, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m4889a(String str, PackageManager packageManager) {
        if (!AbstractC1677p0.m3804b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th) {
            this.f3101a.m4764E().m4336b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m4890a(String str, PackageManager packageManager, C1748l c1748l) {
        try {
            return AbstractC1677p0.m3804b() ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            c1748l.m4764E().m4336b("DataCollector", "getInstallerName", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private List m4891a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap map = new HashMap();
            map.put("name", instrumentationInfo.name);
            map.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            map.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            map.put("t_pa", instrumentationInfo.targetPackage);
            if (AbstractC1677p0.m3811e()) {
                map.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m4892a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th) {
            this.f3101a.m4764E().m4336b("DataCollector", "parseSignatures", th);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private Map m4893a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put("action", StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    /* JADX INFO: renamed from: a */
    private Map m4894a(Map map, boolean z) {
        AbstractC1790v.a aVarM4945f;
        Map map2 = CollectionUtils.map(map);
        Point pointM3800b = AbstractC1677p0.m3800b(this.f3103c);
        map2.put("dx", Integer.valueOf(pointM3800b.x));
        map2.put("dy", Integer.valueOf(pointM3800b.y));
        DisplayMetrics displayMetrics = this.f3103c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointM3800b.x, 2.0d) + Math.pow(pointM3800b.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f3103c)));
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3731H4)).booleanValue()) {
            String strM4077b = AbstractC1701q7.m4077b(this.f3103c);
            Map mapM3796a = AbstractC1677p0.m3796a(strM4077b);
            if (mapM3796a != null) {
                map2.put("display_cutout_insets", mapM3796a);
            }
            Map mapM3806c = AbstractC1677p0.m3806c(strM4077b);
            if (mapM3806c != null) {
                map2.put("status_bar_insets", mapM3806c);
            }
            Map mapM3802b = AbstractC1677p0.m3802b(strM4077b);
            if (mapM3802b != null) {
                map2.put("nav_bar_insets", mapM3802b);
            }
        }
        if (z) {
            aVarM4945f = (AbstractC1790v.a) f3099l.get();
            if (aVarM4945f != null) {
                m4940Y();
            } else if (AbstractC1701q7.m4113i()) {
                aVarM4945f = new AbstractC1790v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarM4945f = m4945f();
            }
        } else {
            aVarM4945f = m4945f();
        }
        String strM5323a = aVarM4945f.m5323a();
        if (StringUtils.isValidString(strM5323a)) {
            map2.put("idfa", strM5323a);
        }
        map2.put("dnt", Boolean.valueOf(aVarM4945f.m5329c()));
        map2.put("dnt_code", aVarM4945f.m5328b().m5331b());
        b bVar = (b) f3100m.get();
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3698D3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f3111a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f3112b));
        }
        Boolean boolM3959b = AbstractC1694q0.m3953b().m3959b(this.f3103c);
        if (boolM3959b != null) {
            map2.put("huc", boolM3959b);
        }
        Boolean boolM3959b2 = AbstractC1694q0.m3955c().m3959b(this.f3103c);
        if (boolM3959b2 != null) {
            map2.put("aru", boolM3959b2);
        }
        Boolean boolM3959b3 = AbstractC1694q0.m3948a().m3959b(this.f3103c);
        if (boolM3959b3 != null) {
            map2.put("dns", boolM3959b3);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3818S3)).booleanValue()) {
            c cVarM4917j = m4917j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarM4917j.f3113a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarM4917j.f3114b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarM4917j.f3115c, map2);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3882a4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f3101a.m4846o0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3908d4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(m4877O()));
        }
        Float fM4924s = z ? (Float) this.f3109i.get() : m4924s();
        if (fM4924s != null) {
            map2.put("volume", fM4924s);
        }
        CollectionUtils.putBooleanIfValid("ma", m4928w(), map2);
        CollectionUtils.putBooleanIfValid("spo", m4929x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f3101a.m4846o0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f3101a.m4846o0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f3101a.m4846o0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.f3101a.m4846o0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f3103c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (C1768p.m5160a()) {
                this.f3102b.m5172a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3935g4)).booleanValue() && AbstractC1701q7.m4098d(this.f3101a)) {
            AbstractC1675o8.m3770a(this.f3101a);
            String strM3769a = AbstractC1675o8.m3769a();
            if (StringUtils.isValidString(strM3769a)) {
                map2.put(C11540L6.f24966d0, strM3769a);
            }
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f4031r4)).booleanValue()) {
            AbstractC1675o8.m3772b(this.f3101a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(AbstractC1675o8.m3775d()), map2);
            CollectionUtils.putStringIfValid("wvv", AbstractC1675o8.m3774c(), map2);
            CollectionUtils.putStringIfValid("wvpn", AbstractC1675o8.m3771b(), map2);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3834U3)).booleanValue()) {
            try {
                map2.put(C11540L6.f24945U0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put(C11540L6.f24945U0, -1);
                map2.put("tds", -1);
                if (C1768p.m5160a()) {
                    this.f3102b.m5172a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3842V3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoM4022a = AbstractC1701q7.m4022a((ActivityManager) this.f3103c.getSystemService("activity"));
            if (memoryInfoM4022a != null) {
                map2.put("fm", Long.valueOf(memoryInfoM4022a.availMem));
                map2.put("tm", Long.valueOf(memoryInfoM4022a.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoM4022a.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoM4022a.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3850W3)).booleanValue() && AbstractC1677p0.m3799a("android.permission.READ_PHONE_STATE", this.f3103c) && AbstractC1677p0.m3810d()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f3103c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3826T3)).booleanValue()) {
            String strM4870B = m4870B();
            if (!TextUtils.isEmpty(strM4870B)) {
                map2.put("so", strM4870B);
            }
        }
        map2.put("device_orientation", AbstractC1701q7.m4077b(this.f3103c));
        map2.put("orientation_lock", m4915h());
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3858X3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(AbstractC1701q7.m4116k()));
        }
        PowerManager powerManager = (PowerManager) this.f3103c.getSystemService("power");
        if (powerManager != null) {
            map2.put(C11540L6.f24955Z0, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3953i4)).booleanValue() && this.f3101a.m4845n0() != null) {
            map2.put("da", Float.valueOf(this.f3101a.m4845n0().m5711a()));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3962j4)).booleanValue() && this.f3101a.m4845n0() != null) {
            map2.put("dm", Float.valueOf(this.f3101a.m4845n0().m5712b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f3101a.m4848q().m4697c()));
        map2.put("network", AbstractC1714s0.m4327g(this.f3101a));
        String strM4922q = m4922q();
        if (StringUtils.isValidString(strM4922q)) {
            map2.put("kb", strM4922q);
        }
        Map mapM4923r = m4923r();
        if (!CollectionUtils.isEmpty(mapM4923r)) {
            map2.put("ds", mapM4923r);
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private Map m4895a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.f3103c.getContentResolver();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (StringUtils.isValidString(string)) {
                map.put(next, StringUtils.emptyIfNull(m4888a(dVar, contentResolver, string)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private Map m4896a(boolean z) {
        Map map;
        synchronized (this.f3105e) {
            map = CollectionUtils.map(this.f3104d);
        }
        return m4894a(map, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m4898a(b bVar) {
        f3100m.set(bVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m4899a(AbstractC1790v.a aVar) {
        f3099l.set(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4900a(String str, int i, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f3101a.m4764E().m2682d(C1548f2.f1491N0, mapHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m4901a(String str, C1748l c1748l) {
        String strM4890a = m4890a(C1748l.m4756p().getApplicationInfo().packageName, C1748l.m4756p().getPackageManager(), c1748l);
        List listM4821c = c1748l.m4821c(C1831z4.f3877Z6);
        if (!StringUtils.isValidString(strM4890a) || listM4821c.contains(strM4890a)) {
            f3097j = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4902a(Map map) {
        JSONArray jSONArrayM4874F;
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3866Y3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(m4912d()));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3874Z3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(m4925t()));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3935g4)).booleanValue() && AbstractC1701q7.m4098d(this.f3101a)) {
            AbstractC1675o8.m3770a(this.f3101a);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f4031r4)).booleanValue()) {
            AbstractC1675o8.m3772b(this.f3101a);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3926f4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3890b4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(m4879Q()));
        }
        map.put("is_pc", Boolean.valueOf(m4880R()));
        if (((Boolean) this.f3101a.m4801a(C1831z4.f4047t4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", m4936K(), map);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3773M6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", m4921o(), map);
        }
        if (!((Boolean) this.f3101a.m4801a(C1831z4.f3781N6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayM4874F = m4874F()) == null || jSONArrayM4874F.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayM4874F);
    }

    /* JADX INFO: renamed from: a */
    private boolean m4903a(String str) {
        return m4904b(str) == 1;
    }

    /* JADX INFO: renamed from: b */
    private int m4904b(String str) {
        try {
            return Settings.Secure.getInt(this.f3103c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    private List m4905b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4906b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strM4935I = m4935I();
            if (StringUtils.isValidString(strM4935I)) {
                this.f3101a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f3101a.m4782Q().m5171a("DataCollector", "Successfully retrieved bid token");
                }
                AbstractC1793v2.m5394a(appLovinBidTokenCollectionListener, strM4935I);
                return;
            }
            this.f3101a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3101a.m4782Q().m5174b("DataCollector", "Empty bid token");
            }
            AbstractC1793v2.m5425b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f3102b.m5172a("DataCollector", "Failed to collect bid token", th);
            }
            this.f3101a.m4764E().m4329a("DataCollector", "collectBidToken", th);
            AbstractC1793v2.m5425b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4907b(final String str, final int i, final String str2) {
        this.f3101a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3101a, "reportAppExitInfoStackTrace", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4900a(str, i, str2);
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: b */
    private boolean m4908b() {
        String str = Build.TAGS;
        return str != null && str.contains(m4909c("lz}$blpz"));
    }

    /* JADX INFO: renamed from: c */
    private String m4909c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    private Map m4910c(PackageInfo packageInfo) {
        HashMap map = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            map = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                CollectionUtils.putIntegerIfValid(strArr[i], Integer.valueOf(iArr[i]), map);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    private boolean m4911c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m4909c(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d7 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x019a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x01b1, please report this as an issue */
    /* JADX INFO: renamed from: d */
    private long m4912d() {
        long j;
        int iM4904b;
        int iM4904b2;
        int iM4904b3;
        long j2;
        long j3;
        long j4;
        String strEmptyIfNull = StringUtils.emptyIfNull(Settings.Secure.getString(this.f3103c.getContentResolver(), "enabled_accessibility_services"));
        long j5 = strEmptyIfNull.contains("AccessibilityMenuService") ? 256L : 0L;
        if (strEmptyIfNull.contains("SelectToSpeakService")) {
            j5 |= 512;
        }
        if (strEmptyIfNull.contains("SoundAmplifierService")) {
            j5 |= 2;
        }
        if (strEmptyIfNull.contains("SpeechToTextAccessibilityService")) {
            j5 |= 128;
        }
        if (strEmptyIfNull.contains("SwitchAccessService")) {
            j5 |= 4;
        }
        if ((this.f3103c.getResources().getConfiguration().uiMode & 48) == 32) {
            j5 |= 1024;
        }
        if (m4903a("accessibility_enabled")) {
            j5 |= 8;
        }
        if (m4903a("touch_exploration_enabled")) {
            j5 |= 16;
        }
        if (m4903a(AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED)) {
            j5 |= 32;
        }
        if (m4903a("skip_first_use_hints")) {
            j5 |= 64;
        }
        if (m4903a("lock_screen_allow_remote_input")) {
            j5 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        if (m4903a("enabled_accessibility_audio_description_by_default")) {
            j5 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        if (m4903a("accessibility_shortcut_on_lock_screen")) {
            j5 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        if (m4903a("wear_talkback_enabled")) {
            j5 |= 16384;
        }
        if (m4903a("hush_gesture_used")) {
            j5 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        if (m4903a("high_text_contrast_enabled")) {
            j5 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        if (m4903a("accessibility_display_magnification_enabled")) {
            j5 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        if (m4903a("accessibility_display_magnification_navbar_enabled")) {
            j5 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        if (m4903a("accessibility_captioning_enabled")) {
            j5 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (m4903a(AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED)) {
            j5 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (m4903a("accessibility_autoclick_enabled")) {
            j5 |= 2097152;
        }
        if (m4903a("accessibility_large_pointer_icon")) {
            j5 |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
        }
        if (m4903a("reduce_bright_colors_activated")) {
            j5 |= 8388608;
        }
        if (m4903a("reduce_bright_colors_persist_across_reboots")) {
            j5 |= 16777216;
        }
        if (m4903a("tty_mode_enabled")) {
            j5 |= 33554432;
        }
        if (m4903a("rtt_calling_mode")) {
            j5 |= 67108864;
        }
        if (m4903a("accessibility_floating_menu_fade_enabled")) {
            j5 |= 134217728;
        }
        if (m4903a("accessibility_show_window_magnification_prompt")) {
            j5 |= 268435456;
        }
        if (m4903a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j5 |= 536870912;
        }
        int iM4904b4 = m4904b("accessibility_magnification_mode");
        if (iM4904b4 == 0) {
            j = 1073741824;
        } else if (iM4904b4 == 1) {
            j = 2147483648L;
        } else {
            if (iM4904b4 != 2) {
                if (iM4904b4 == 3) {
                    j = 8589934592L;
                }
                iM4904b = m4904b("accessibility_button_mode");
                if (iM4904b == 0) {
                    j4 = iM4904b == 1 ? 34359738368L : 17179869184L;
                    iM4904b2 = m4904b("accessibility_floating_menu_size");
                    if (iM4904b2 == 0) {
                        j3 = iM4904b2 == 1 ? 137438953472L : 68719476736L;
                        iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
                        if (iM4904b3 == 0) {
                            j2 = 274877906944L;
                        } else {
                            if (iM4904b3 == 1) {
                                return j5;
                            }
                            j2 = 549755813888L;
                        }
                        return j5 | j2;
                    }
                    j5 |= j3;
                    iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
                    if (iM4904b3 == 0) {
                        j2 = 274877906944L;
                    } else {
                        if (iM4904b3 == 1) {
                            return j5;
                        }
                        j2 = 549755813888L;
                    }
                    return j5 | j2;
                }
                j5 |= j4;
                iM4904b2 = m4904b("accessibility_floating_menu_size");
                if (iM4904b2 == 0) {
                    if (iM4904b2 == 1) {
                    }
                    iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
                    if (iM4904b3 == 0) {
                        j2 = 274877906944L;
                    } else {
                        if (iM4904b3 == 1) {
                            return j5;
                        }
                        j2 = 549755813888L;
                    }
                    return j5 | j2;
                }
                j5 |= j3;
                iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
                if (iM4904b3 == 0) {
                    j2 = 274877906944L;
                } else {
                    if (iM4904b3 == 1) {
                        return j5;
                    }
                    j2 = 549755813888L;
                }
                return j5 | j2;
            }
            j = 4294967296L;
        }
        j5 |= j;
        iM4904b = m4904b("accessibility_button_mode");
        if (iM4904b == 0) {
            if (iM4904b == 1) {
            }
            iM4904b2 = m4904b("accessibility_floating_menu_size");
            if (iM4904b2 == 0) {
                if (iM4904b2 == 1) {
                }
                iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
                if (iM4904b3 == 0) {
                    j2 = 274877906944L;
                } else {
                    if (iM4904b3 == 1) {
                        return j5;
                    }
                    j2 = 549755813888L;
                }
                return j5 | j2;
            }
            j5 |= j3;
            iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
            if (iM4904b3 == 0) {
                j2 = 274877906944L;
            } else {
                if (iM4904b3 == 1) {
                    return j5;
                }
                j2 = 549755813888L;
            }
            return j5 | j2;
        }
        j5 |= j4;
        iM4904b2 = m4904b("accessibility_floating_menu_size");
        if (iM4904b2 == 0) {
            if (iM4904b2 == 1) {
            }
            iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
            if (iM4904b3 == 0) {
                j2 = 274877906944L;
            } else {
                if (iM4904b3 == 1) {
                    return j5;
                }
                j2 = 549755813888L;
            }
            return j5 | j2;
        }
        j5 |= j3;
        iM4904b3 = m4904b("accessibility_floating_menu_icon_type");
        if (iM4904b3 == 0) {
            j2 = 274877906944L;
        } else {
            if (iM4904b3 == 1) {
                return j5;
            }
            j2 = 549755813888L;
        }
        return j5 | j2;
    }

    /* JADX INFO: renamed from: d */
    private List m4913d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (AbstractC1677p0.m3812f()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return m4892a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return m4892a(signatureArr);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private List m4914g() {
        ActivityManager activityManager;
        if (!AbstractC1677p0.m3804b()) {
            return null;
        }
        Integer num = (Integer) this.f3101a.m4801a(C1831z4.f3699D4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f3103c.getSystemService("activity")) == null) {
            return null;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f3101a.m4801a(C1831z4.f3707E4)).booleanValue() ? this.f3103c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM2264m = d$$ExternalSyntheticApiModelOutline0.m2264m(it.next());
            HashMap map = new HashMap(13);
            int reason = applicationExitInfoM2264m.getReason();
            map.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfoM2264m.getDescription();
            CollectionUtils.putStringIfValid("description", description, map);
            map.put("timestamp", Long.valueOf(applicationExitInfoM2264m.getTimestamp()));
            map.put("status", Integer.valueOf(applicationExitInfoM2264m.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfoM2264m.getImportance()));
            map.put("pss", Long.valueOf(applicationExitInfoM2264m.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfoM2264m.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfoM2264m.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfoM2264m.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfoM2264m.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfoM2264m.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfoM2264m.getDefiningUid()));
            String strM4887a = m4887a(applicationExitInfoM2264m, reason);
            if (StringUtils.isValidString(strM4887a)) {
                map.put("stack_trace", strM4887a);
                m4907b(strM4887a, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private String m4915h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f3103c);
        if (orientation == 1) {
            return C11744X3.i.f26322D;
        }
        return orientation == 2 ? C11744X3.i.f26320C : "none";
    }

    /* JADX INFO: renamed from: i */
    private List m4916i() {
        ActivityManager activityManager;
        if (!AbstractC1677p0.m3808c()) {
            return null;
        }
        Integer num = (Integer) this.f3101a.m4801a(C1831z4.f3691C4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f3103c.getSystemService("activity")) == null) {
            return null;
        }
        List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        Iterator it = historicalProcessStartReasons.iterator();
        while (it.hasNext()) {
            ApplicationStartInfo applicationStartInfoM2265m = d$$ExternalSyntheticApiModelOutline0.m2265m(it.next());
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfoM2265m.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfoM2265m.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfoM2265m.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfoM2265m.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfoM2265m.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfoM2265m.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfoM2265m.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfoM2265m.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfoM2265m.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfoM2265m.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfoM2265m.getLaunchMode()));
            map.put(SDKConstants.PARAM_INTENT, m4893a(applicationStartInfoM2265m.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    private c m4917j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f3103c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f3114b = -1;
        } else {
            cVar.f3114b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f3113a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f3115c = Boolean.valueOf(Settings.Global.getInt(this.f3103c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    /* JADX INFO: renamed from: k */
    private long m4918k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l = (Long) this.f3101a.m4801a(C1831z4.f3739I4);
        return (jCurrentTimeMillis / l.longValue()) * l.longValue();
    }

    /* JADX INFO: renamed from: l */
    private String m4919l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3103c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return "";
            }
            this.f3102b.m5172a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    private String m4920n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3103c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: o */
    private String m4921o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(UrlConst.HTTPS));
        ResolveInfo resolveInfoResolveActivity = this.f3103c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f3098k = activityInfo.packageName;
        }
        return f3098k;
    }

    /* JADX INFO: renamed from: q */
    private String m4922q() {
        if (!AbstractC1677p0.m3810d()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f3103c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    private Map m4923r() {
        HashMap map = new HashMap();
        JSONObject jSONObjectDeserialize = JsonUtils.deserialize((String) this.f3101a.m4801a(C1831z4.f3763L4));
        if (JsonUtils.isValid(jSONObjectDeserialize)) {
            map.putAll(m4895a(jSONObjectDeserialize, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda38
                @Override // com.applovin.impl.sdk.C1749m.d
                /* JADX INFO: renamed from: a */
                public final String mo4948a(ContentResolver contentResolver, String str) {
                    return Settings.System.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize2 = JsonUtils.deserialize((String) this.f3101a.m4801a(C1831z4.f3771M4));
        if (JsonUtils.isValid(jSONObjectDeserialize2)) {
            map.putAll(m4895a(jSONObjectDeserialize2, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda39
                @Override // com.applovin.impl.sdk.C1749m.d
                /* JADX INFO: renamed from: a */
                public final String mo4948a(ContentResolver contentResolver, String str) {
                    return Settings.Secure.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize3 = JsonUtils.deserialize((String) this.f3101a.m4801a(C1831z4.f3779N4));
        if (JsonUtils.isValid(jSONObjectDeserialize3)) {
            map.putAll(m4895a(jSONObjectDeserialize3, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda40
                @Override // com.applovin.impl.sdk.C1749m.d
                /* JADX INFO: renamed from: a */
                public final String mo4948a(ContentResolver contentResolver, String str) {
                    return Settings.Global.getString(contentResolver, str);
                }
            }));
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    private Float m4924s() {
        Float f = (Float) this.f3101a.m4801a(C1831z4.f3917e4);
        Float fM4695b = this.f3101a.m4848q().m4695b();
        if (fM4695b != null) {
            return Float.valueOf(fM4695b.floatValue() * f.floatValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    private float m4925t() {
        try {
            return Settings.System.getFloat(this.f3103c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!C1768p.m5160a()) {
                return -1.0f;
            }
            this.f3102b.m5172a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m4926u() {
        SensorManager sensorManager = (SensorManager) this.f3103c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    private Map m4927v() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid(Cookie.IABTCF_GDPR_APPLIES, this.f3101a.m4855t0().m2232g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f3101a.m4855t0().m2234j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f3101a.m4855t0().m2227c(), map);
        return map;
    }

    /* JADX INFO: renamed from: w */
    private Boolean m4928w() {
        AudioManager audioManager = (AudioManager) this.f3103c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    /* JADX INFO: renamed from: x */
    private Boolean m4929x() {
        AudioManager audioManager = (AudioManager) this.f3103c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    /* JADX INFO: renamed from: y */
    private String m4930y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3103c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return "";
            }
            this.f3102b.m5172a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: z */
    private String m4931z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3103c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return "";
            }
            this.f3102b.m5172a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: A */
    public String m4932A() {
        return AppLovinSdkUtils.isFireOS(this.f3103c) ? "fireos" : "android";
    }

    /* JADX INFO: renamed from: G */
    public Map m4933G() {
        Map map;
        synchronized (this.f3107g) {
            map = CollectionUtils.map(this.f3106f);
        }
        String str = StringUtils.isValidString(f3097j) ? f3097j : this.f3103c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f3101a.m4765E0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f3101a.m4760B0()));
        map.put("test_ads", Boolean.valueOf(this.f3108h));
        map.put("test_mode", Integer.valueOf(this.f3101a.m4857u0().m2928c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f3101a.m4847p0().isMuted()));
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3706E3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f3101a.m4865y0().m3898e(), map);
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3730H3)).booleanValue()) {
            map.put("compass_random_token", this.f3101a.m4858v());
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3746J3)).booleanValue()) {
            map.put("applovin_random_token", this.f3101a.m4837j0());
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3778N3)).booleanValue()) {
            map.put("art", this.f3101a.m4852s());
        }
        map.putAll(m4927v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f3101a.m4851r0().m2209a(C1511b5.f1162T, null), map);
        return map;
    }

    /* JADX INFO: renamed from: H */
    public b m4934H() {
        return (b) f3100m.get();
    }

    /* JADX INFO: renamed from: I */
    protected String m4935I() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(m4876L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f3101a.m4801a(C1831z4.f4016p5)).booleanValue() ? AbstractC1804w4.m5542b(strEncodeToString, AbstractC1701q7.m4020a(this.f3101a), AbstractC1804w4.a.m5546a(((Integer) this.f3101a.m4801a(C1831z4.f4024q5)).intValue()), this.f3101a) : strEncodeToString;
    }

    /* JADX INFO: renamed from: K */
    public String m4936K() {
        ActivityManager activityManager = (ActivityManager) this.f3103c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    /* JADX INFO: renamed from: M */
    public Map m4937M() {
        Map map;
        synchronized (this.f3107g) {
            map = CollectionUtils.map(this.f3106f);
        }
        return map;
    }

    /* JADX INFO: renamed from: N */
    public Map m4938N() {
        Map map;
        synchronized (this.f3105e) {
            map = CollectionUtils.map(this.f3104d);
        }
        return map;
    }

    /* JADX INFO: renamed from: T */
    public boolean m4939T() {
        return this.f3108h;
    }

    /* JADX INFO: renamed from: Y */
    public void m4940Y() {
        C1552f6 c1552f6M4853s0 = this.f3101a.m4853s0();
        C1699q5 c1699q5 = new C1699q5(this.f3101a, new a());
        C1552f6.b bVar = C1552f6.b.OTHER;
        c1552f6M4853s0.m2604a((AbstractRunnableC1601k5) c1699q5, bVar);
        this.f3101a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3101a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4882U();
            }
        }), bVar);
    }

    /* JADX INFO: renamed from: a */
    public Map m4941a(Map map, boolean z, boolean z2) {
        HashMap map2 = new HashMap(64);
        Map mapM4896a = m4896a(z);
        Map mapM4933G = m4933G();
        Map mapM4946m = m4946m();
        Map mapM4843m0 = this.f3101a.m4843m0();
        if (z2) {
            map2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, mapM4896a);
            map2.put("app_info", mapM4933G);
            if (mapM4946m != null) {
                map2.put("connection_info", mapM4946m);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapM4843m0)) {
                map2.put("segments", mapM4843m0);
            }
        } else {
            map2.putAll(mapM4896a);
            map2.putAll(mapM4933G);
            if (mapM4946m != null) {
                map2.putAll(mapM4946m);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapM4843m0)) {
                map2.putAll(mapM4843m0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f3101a.m4794X(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f3101a.m4762D(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f3101a.m4801a(C1831z4.f3794P3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f3101a.m4859v0()), map2);
        if (!((Boolean) this.f3101a.m4801a(C1831z4.f3999n5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3101a.m4839k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f3101a.m4850r(), map2);
        map2.putAll(m4944e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    /* JADX INFO: renamed from: a */
    protected void m4942a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f3101a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3101a, ((Boolean) this.f3101a.m4801a(C1831z4.f3810R3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4906b(appLovinBidTokenCollectionListener);
            }
        }), C1552f6.b.CORE);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4943a0() {
        synchronized (this.f3105e) {
            m4902a(this.f3104d);
        }
        m4886Z();
    }

    /* JADX INFO: renamed from: e */
    public Map m4944e() {
        HashMap map = new HashMap();
        map.put("sc", this.f3101a.m4801a(C1831z4.f3975l));
        map.put("sc2", this.f3101a.m4801a(C1831z4.f3984m));
        map.put("sc3", this.f3101a.m4801a(C1831z4.f3993n));
        map.put("server_installed_at", this.f3101a.m4801a(C1831z4.f4002o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f3101a.m4799a(C1511b5.f1150H), map);
        return map;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1790v.a m4945f() {
        AbstractC1790v.a aVarM5321b = AbstractC1790v.m5321b(this.f3103c);
        if (aVarM5321b == null) {
            return new AbstractC1790v.a();
        }
        if (((Boolean) this.f3101a.m4801a(C1831z4.f3690C3)).booleanValue()) {
            if (aVarM5321b.m5329c() && !((Boolean) this.f3101a.m4801a(C1831z4.f3682B3)).booleanValue()) {
                aVarM5321b.m5325a("");
            }
            f3099l.set(aVarM5321b);
        } else {
            aVarM5321b = new AbstractC1790v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f3101a.m4776L() != null ? this.f3101a.m4776L().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f3108h = false;
            return aVarM5321b;
        }
        String strM5323a = aVarM5321b.m5323a();
        if (StringUtils.isValidString(strM5323a)) {
            this.f3108h = testDeviceAdvertisingIds.contains(strM5323a);
        }
        b bVarM4934H = m4934H();
        String str = bVarM4934H != null ? bVarM4934H.f3111a : null;
        if (StringUtils.isValidString(str)) {
            this.f3108h = testDeviceAdvertisingIds.contains(str) | this.f3108h;
        }
        return aVarM5321b;
    }

    /* JADX INFO: renamed from: m */
    public Map m4946m() {
        HashMap map = new HashMap();
        C1540e4 c1540e4M4829f0 = this.f3101a.m4829f0();
        Deque dequeM2490b = c1540e4M4829f0.m2490b();
        if (!CollectionUtils.isEmpty(dequeM2490b)) {
            map.put("network_throughput_info", dequeM2490b);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c1540e4M4829f0.m2488a(), map);
        C1704r0.d dVarM4141a = this.f3101a.m4862x().m4141a();
        if (dVarM4141a != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarM4141a.m4155c()));
            map.put("lrm_url", dVarM4141a.m4156d());
            map.put("lrm_ct_ms", String.valueOf(dVarM4141a.m4152a()));
            map.put("lrm_rs", String.valueOf(dVarM4141a.m4154b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public Map m4947p() {
        return m4896a(false);
    }
}
