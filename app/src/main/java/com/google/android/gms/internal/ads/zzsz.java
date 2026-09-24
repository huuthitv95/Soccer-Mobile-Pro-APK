package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsz {
    private final Context zza;
    private Boolean zzb;

    public zzsz() {
        this(null);
    }

    public zzsz(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzqm zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzI) == -1) {
            return zzqm.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || Build.VERSION.SDK_INT < zzfk.zzE(iZzg)) {
            return zzqm.zza;
        }
        int iZzD = zzfk.zzD(zzvVar.zzH);
        if (iZzD == 0) {
            return zzqm.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iZzD).setEncoding(iZzg).build();
            if (Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqm.zza;
                }
                z = (directPlaybackSupport & 3) == 3;
                zzql zzqlVar = new zzql();
                zzqlVar.zza(true);
                zzqlVar.zzb(z);
                zzqlVar.zzc(zBooleanValue);
                return zzqlVar.zzd();
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzqm.zza;
                }
                zzql zzqlVar2 = new zzql();
                zzqlVar2.zza(true);
                zzqlVar2.zzc(zBooleanValue);
                return zzqlVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqm.zza;
            }
            zzql zzqlVar3 = new zzql();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzqlVar3.zza(true);
            zzqlVar3.zzb(z);
            zzqlVar3.zzc(zBooleanValue);
            return zzqlVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqm.zza;
        }
    }
}
