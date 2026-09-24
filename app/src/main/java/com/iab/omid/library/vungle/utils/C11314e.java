package com.iab.omid.library.vungle.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.vungle.adsession.DeviceCategory;
import com.iab.omid.library.vungle.adsession.OutputDeviceStatus;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11314e {

    /* JADX INFO: renamed from: a */
    private static OutputDeviceStatus f23731a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.e$a */
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
                OutputDeviceStatus unused = C11314e.f23731a = outputDeviceStatus;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static OutputDeviceStatus m25151a() {
        return C11310a.m25117a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f23731a;
    }

    /* JADX INFO: renamed from: a */
    public static void m25153a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
