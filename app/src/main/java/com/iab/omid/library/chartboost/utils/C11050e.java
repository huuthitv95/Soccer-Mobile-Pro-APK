package com.iab.omid.library.chartboost.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.chartboost.adsession.DeviceCategory;
import com.iab.omid.library.chartboost.adsession.OutputDeviceStatus;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11050e {

    /* JADX INFO: renamed from: a */
    private static OutputDeviceStatus f23033a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.e$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                }
                OutputDeviceStatus unused = C11050e.f23033a = outputDeviceStatus;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static OutputDeviceStatus m23850a() {
        return C11046a.m23819a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f23033a;
    }

    /* JADX INFO: renamed from: a */
    public static void m23852a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
