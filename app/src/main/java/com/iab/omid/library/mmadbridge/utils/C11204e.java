package com.iab.omid.library.mmadbridge.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.DeviceCategory;
import com.iab.omid.library.mmadbridge.adsession.OutputDeviceStatus;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public class C11204e {

    /* JADX INFO: renamed from: a */
    private static OutputDeviceStatus f23438a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.e$a */
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
                OutputDeviceStatus unused = C11204e.f23438a = outputDeviceStatus;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static OutputDeviceStatus m24612a() {
        return C11200a.m24581a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f23438a;
    }

    /* JADX INFO: renamed from: a */
    public static void m24614a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
