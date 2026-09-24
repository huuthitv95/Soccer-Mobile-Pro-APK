package com.fyber.inneractive.sdk.serverapi;

import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8024p0;
import com.fyber.inneractive.sdk.config.C8026q0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.ironsource.C11366Bc;
import com.ironsource.C11676T3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.serverapi.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9113b {

    /* JADX INFO: renamed from: a */
    public static final C9112a f21363a = new C9112a();

    /* JADX INFO: renamed from: b */
    public static final List f21364b = Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    /* JADX INFO: renamed from: a */
    public static UnitDisplayType m21905a(String str) {
        C8028r0 c8028r0;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        HashMap map = iAConfigManager.f17669a;
        C8026q0 c8026q0 = (map == null || !map.containsKey(str)) ? null : (C8026q0) iAConfigManager.f17669a.get(str);
        if (c8026q0 != null && c8026q0.f17809a.size() > 0 && (c8028r0 = (C8028r0) c8026q0.f17809a.get(0)) != null) {
            C8043t0 c8043t0 = c8028r0.f17816f;
            C8016l0 c8016l0 = c8028r0.f17813c;
            C8024p0 c8024p0 = c8028r0.f17815e;
            if (c8043t0 != null) {
                return c8043t0.f17876j;
            }
            if (c8016l0 != null) {
                return c8016l0.f17798b;
            }
            if (c8024p0 != null) {
                return UnitDisplayType.NATIVE;
            }
        }
        return unitDisplayType;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m21906a() {
        Integer numValueOf = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(SdkExtensions.getExtensionVersion(1000000)) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return null;
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: a */
    public static String m21907a(float f) {
        if (f < 5.0f) {
            return "1";
        }
        if (f <= 9.0f) {
            return "2";
        }
        if (f <= 24.0f) {
            return ExifInterface.GPS_MEASUREMENT_3D;
        }
        if (f <= 39.0f) {
            return "4";
        }
        if (f <= 54.0f) {
            return CampaignEx.CLICKMODE_ON;
        }
        if (f <= 69.0f) {
            return "6";
        }
        if (f <= 84.0f) {
            return C11366Bc.f23952e;
        }
        return f <= 100.0f ? "8" : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m21908b() {
        try {
            Intent intentRegisterReceiver = AbstractC9174o.f21470a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return "";
            }
            return m21907a((intentRegisterReceiver.getIntExtra("level", -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static Long m21909c() {
        long j;
        C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
        c8051x0.getClass();
        try {
            String str = "";
            String str2 = (String) c8051x0.f17891d.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j, TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: renamed from: d */
    public static String m21910d() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: e */
    public static Long m21911e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m21912f() {
        try {
            return Boolean.valueOf(Settings.System.getInt(AbstractC9174o.f21470a.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m21913g() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i >= 34 && AbstractC9174o.m21996a("android.permission.BLUETOOTH_CONNECT");
        if (i < 34 && AbstractC9174o.m21996a("android.permission.BLUETOOTH")) {
            z = true;
        }
        if (!z2 && !z) {
            return null;
        }
        try {
            BluetoothAdapter adapter = ((BluetoothManager) AbstractC9174o.f21470a.getSystemService(C11676T3.f25721d)).getAdapter();
            if (adapter.getProfileConnectionState(1) != 2 && adapter.getProfileConnectionState(2) != 2) {
                return null;
            }
            return Boolean.TRUE;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m21914h() {
        return Boolean.valueOf((AbstractC9174o.f21470a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m21915i() {
        int intExtra;
        try {
            Intent intentRegisterReceiver = AbstractC9174o.f21470a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m21916j() {
        try {
            AudioManager audioManager = (AudioManager) AbstractC9174o.f21470a.getSystemService("audio");
            if (audioManager != null) {
                return Boolean.valueOf(audioManager.getStreamVolume(3) == 0);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m21917k() {
        try {
            int ringerMode = ((AudioManager) AbstractC9174o.f21470a.getSystemService("audio")).getRingerMode();
            boolean z = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m21918l() {
        try {
            int currentInterruptionFilter = ((NotificationManager) AbstractC9174o.f21470a.getSystemService("notification")).getCurrentInterruptionFilter();
            return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m21919m() {
        try {
            boolean z = false;
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) AbstractC9174o.f21470a.getSystemService("audio")).getDevices(2)) {
                if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m21920n() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (TextUtils.isEmpty(upperCase) || !f21363a.containsKey(upperCase)) {
                return Boolean.valueOf(((PowerManager) AbstractC9174o.f21470a.getSystemService("power")).isPowerSaveMode());
            }
            try {
                Iterator it = f21364b.iterator();
                while (it.hasNext()) {
                    int i = Settings.System.getInt(AbstractC9174o.f21470a.getContentResolver(), (String) it.next(), -1);
                    if (i != -1 && (num = (Integer) f21363a.get(upperCase)) != null) {
                        return Boolean.valueOf(num.intValue() == i);
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
