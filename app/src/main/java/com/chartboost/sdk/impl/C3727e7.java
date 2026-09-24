package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3727e7 {

    /* JADX INFO: renamed from: a */
    public static final C3727e7 f14043a = new C3727e7();

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e7$a */
    public enum a {
        BUILTIN_SPEAKER(0),
        WIRED_HEADPHONES(1),
        BLUETOOTH_A2DP(2),
        OTHER(3);


        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ EnumEntries f14049h = EnumEntriesKt.enumEntries(m17522a());

        /* JADX INFO: renamed from: b */
        public final int f14050b;

        a(int i) {
            this.f14050b = i;
        }

        /* JADX INFO: renamed from: b */
        public final int m17523b() {
            return this.f14050b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e7$b */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f14051a;

        /* JADX INFO: renamed from: b */
        public final boolean f14052b;

        public b(int i, boolean z) {
            this.f14051a = i;
            this.f14052b = z;
        }

        public /* synthetic */ b(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }

        /* JADX INFO: renamed from: a */
        public final int m17524a() {
            return this.f14051a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m17525b() {
            return this.f14052b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14051a == bVar.f14051a && this.f14052b == bVar.f14052b;
        }

        public int hashCode() {
            return (this.f14051a * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14052b);
        }

        public String toString() {
            return "DeviceBattery(batteryLevel=" + this.f14051a + ", isCharging=" + this.f14052b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17511a(Application application) {
        try {
            if (application == null) {
                return a.OTHER.m17523b();
            }
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return m17518b((AudioManager) systemService);
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment audio output for tracking", e);
            return a.OTHER.m17523b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17512a(AudioManager audioManager) {
        return audioManager.isSpeakerphoneOn() ? a.BUILTIN_SPEAKER.m17523b() : a.OTHER.m17523b();
    }

    /* JADX INFO: renamed from: a */
    public final long m17513a() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment runtime for tracking", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3750f7 m17514a(C3958o9 c3958o9, C4053sg c4053sg, String str, C4117ve privacyApi, String str2) {
        String strM19432c;
        String string;
        String string2;
        String string3;
        String string4;
        Object consent;
        Object consent2;
        Object consent3;
        Object consent4;
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        C3773g7 c3773g7 = C3773g7.f14286a;
        if (!c3773g7.m17788o()) {
            C4048sb.m19411b("EnvironmentManager not initialized. Call EnvironmentManager.init() first.", (Throwable) null, 2, (Object) null);
            return new C3750f7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
        Application applicationM17776c = c3773g7.m17776c();
        b bVarM17519c = m17519c(applicationM17776c);
        String strM17515a = m17515a((Context) applicationM17776c);
        long jM17520d = m17520d(applicationM17776c);
        long jM17513a = m17513a();
        int iM17517b = m17517b(applicationM17776c);
        boolean zM17521e = m17521e(applicationM17776c);
        int iM17511a = m17511a(applicationM17776c);
        if (c4053sg == null || (strM19432c = c4053sg.m19432c()) == null) {
            strM19432c = "session not ready";
        }
        String str3 = strM19432c;
        int iM19435f = c4053sg != null ? c4053sg.m19435f() : -1;
        String str4 = str2 == null ? "App was not init yet" : str2;
        String strM17775b = c3773g7.m17775b();
        DataUseConsent dataUseConsentM19697a = privacyApi.m19697a(GDPR.GDPR_STANDARD);
        if (dataUseConsentM19697a == null || (consent4 = dataUseConsentM19697a.getConsent()) == null || (string = consent4.toString()) == null) {
            string = "gdpr not available";
        }
        String str5 = string;
        DataUseConsent dataUseConsentM19697a2 = privacyApi.m19697a(CCPA.CCPA_STANDARD);
        if (dataUseConsentM19697a2 == null || (consent3 = dataUseConsentM19697a2.getConsent()) == null || (string2 = consent3.toString()) == null) {
            string2 = "ccpa not available";
        }
        String str6 = string2;
        DataUseConsent dataUseConsentM19697a3 = privacyApi.m19697a(COPPA.COPPA_STANDARD);
        if (dataUseConsentM19697a3 == null || (consent2 = dataUseConsentM19697a3.getConsent()) == null || (string3 = consent2.toString()) == null) {
            string3 = "coppa not available";
        }
        String str7 = string3;
        DataUseConsent dataUseConsentM19697a4 = privacyApi.m19697a(LGPD.LGPD_STANDARD);
        if (dataUseConsentM19697a4 == null || (consent = dataUseConsentM19697a4.getConsent()) == null || (string4 = consent.toString()) == null) {
            string4 = "lgpd not available";
        }
        return new C3750f7(str3, iM19435f, str4, strM17775b, "9.11.1", false, str5, str6, str7, string4, m17516a(c3958o9), c3773g7.m17780g(), c3773g7.m17781h(), c3773g7.m17782i(), c3773g7.m17783j(), c3773g7.m17777d(), c3773g7.m17779f(), c3773g7.m17784k(), str == null ? "connection type not provided" : str, strM17515a, bVarM17519c.m17524a(), bVarM17519c.m17525b(), iM17517b, zM17521e, iM17511a, jM17520d, jM17513a, c4053sg != null ? c4053sg.m19433d() : 0, c4053sg != null ? c4053sg.m19434e() : 0, c4053sg != null ? c4053sg.m19430a() : 0, c4053sg != null ? c4053sg.m19431b() : -1L, SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final String m17515a(Context context) {
        String strM18423b;
        try {
            C4021r6 c4021r6M17785l = C3773g7.f14286a.m17785l();
            return (c4021r6M17785l == null || (strM18423b = AbstractC3872ke.m18423b(context, c4021r6M17785l)) == null) ? "Cannot retrieve orientation" : strM18423b;
        } catch (Exception e) {
            C4048sb.m19407a("Cannot retrieve orientation", e);
            return "Cannot retrieve orientation";
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m17516a(C3958o9 c3958o9) {
        String strM17778e = C3773g7.f14286a.m17778e();
        if (!Intrinsics.areEqual(strM17778e, "unknown")) {
            return strM17778e;
        }
        if (c3958o9 != null) {
            String strM18894a = c3958o9.m18894a();
            if (strM18894a == null) {
                strM18894a = c3958o9.m18900g();
            }
            if (strM18894a != null) {
                return strM18894a;
            }
        }
        return "unknown";
    }

    /* JADX INFO: renamed from: b */
    public final int m17517b(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (int) ((streamVolume / streamMaxVolume) * 100);
            }
            return -1;
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment audio for tracking", e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m17518b(AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        if (devices.length == 0) {
            return a.OTHER.m17523b();
        }
        AudioDeviceInfo audioDeviceInfo = devices[0];
        Intrinsics.checkNotNullExpressionValue(audioDeviceInfo, "get(...)");
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return a.BUILTIN_SPEAKER.m17523b();
        }
        if (type != 4) {
            return type != 8 ? a.OTHER.m17523b() : a.BLUETOOTH_A2DP.m17523b();
        }
        return a.WIRED_HEADPHONES.m17523b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final b m17519c(Application application) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            if (application == null) {
                return new b(i2, objArr3 == true ? 1 : 0, i, defaultConstructorMarker);
            }
            Object systemService = application.getSystemService("batterymanager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            BatteryManager batteryManager = (BatteryManager) systemService;
            return new b(batteryManager.getIntProperty(4), batteryManager.isCharging());
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment device battery for tracking", e);
            return new b(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i, defaultConstructorMarker);
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m17520d(Application application) {
        if (application == null) {
            return -1L;
        }
        try {
            return new StatFs(application.getCacheDir() + "/.chartboost").getAvailableBytes();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment device storage for tracking", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17521e(Application application) {
        if (application == null) {
            return false;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getRingerMode() != 2;
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment audio for tracking", e);
            return false;
        }
    }
}
