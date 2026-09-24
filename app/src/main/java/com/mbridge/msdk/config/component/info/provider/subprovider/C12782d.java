package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.d */
/* JADX INFO: compiled from: OtherDeviceInfoProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12782d {

    /* JADX INFO: renamed from: a */
    static String f34052a = "OtherDeviceInfoProvider";

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35300a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            HashMap map = new HashMap();
            map.put("totalSpace", Long.valueOf(totalBytes));
            map.put("freeExternalSize", Long.valueOf(availableBlocksLong));
            return map;
        } catch (Throwable th) {
            C13219q0.m37817b(f34052a, th.getMessage(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public float m35304c(Context context) {
        if (context == null) {
            return -1.0f;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f34052a, th.getMessage());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: d */
    public int m35305d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Throwable th) {
            C13219q0.m37816b(f34052a, th.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m35303b(Context context) {
        if (context == null) {
            return C11794a2.f26725f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? C11794a2.f26725f : str;
        } catch (Throwable th) {
            C13219q0.m37816b(f34052a, th.getMessage());
            return C11794a2.f26725f;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m35302b() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (Throwable th) {
            C13219q0.m37817b(f34052a, th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35301a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        HashMap map = new HashMap();
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            int i = (intExtra == -1 || intExtra2 == -1) ? -1 : (intExtra * 100) / intExtra2;
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            map.put(C11744X3.j.f26431Y, Integer.valueOf(i));
            map.put("charging", Integer.valueOf(intExtra3 == 2 ? 1 : 2));
        }
        return map;
    }
}
