package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbhj;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzat {
    private final String zza;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzbhj.zza.EnumC15492zza zzc() {
        byte b;
        switch (this.zza) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return zzbhj.zza.EnumC15492zza.BANNER;
        }
        if (b == 1) {
            return zzbhj.zza.EnumC15492zza.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? zzbhj.zza.EnumC15492zza.AD_INITIATER_UNSPECIFIED : zzbhj.zza.EnumC15492zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbhj.zza.EnumC15492zza.AD_LOADER;
    }
}
