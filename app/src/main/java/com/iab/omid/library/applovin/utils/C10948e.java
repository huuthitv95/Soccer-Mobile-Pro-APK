package com.iab.omid.library.applovin.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.applovin.adsession.DeviceCategory;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public class C10948e {

    /* JADX INFO: renamed from: a */
    private static OutputDeviceStatus f22763a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.e$a */
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
                OutputDeviceStatus unused = C10948e.f22763a = outputDeviceStatus;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static OutputDeviceStatus m23349a() {
        return C10944a.m23318a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f22763a;
    }

    /* JADX INFO: renamed from: a */
    public static void m23351a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
