package com.iab.omid.library.fyber.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.fyber.adsession.DeviceCategory;
import com.iab.omid.library.fyber.adsession.OutputDeviceStatus;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11102e {

    /* JADX INFO: renamed from: a */
    private static OutputDeviceStatus f23168a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.e$a */
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
                OutputDeviceStatus unused = C11102e.f23168a = outputDeviceStatus;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static OutputDeviceStatus m24106a() {
        return C11098a.m24075a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f23168a;
    }

    /* JADX INFO: renamed from: a */
    public static void m24108a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
