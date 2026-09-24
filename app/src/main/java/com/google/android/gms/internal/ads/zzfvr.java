package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvr {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfvq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfvn.zzb() != zzfua.CTV) {
            return 2;
        }
        return zza;
    }
}
