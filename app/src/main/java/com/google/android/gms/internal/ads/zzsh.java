package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzsh {
    private final AudioTrack zza;
    private final Handler zzb;
    private AudioRouting.OnRoutingChangedListener zzc;
    private final zzsu zzd;

    /* synthetic */ zzsh(AudioTrack audioTrack, zzsu zzsuVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zzsuVar;
        Handler handlerZzd = zzfk.zzd(null);
        this.zzb = handlerZzd;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzsg
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzc = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerZzd);
    }

    final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzse
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        zzsv zzsvVar = this.zzd.zza;
        if (zzsvVar.zzj() != null) {
            zzsvVar.zzj().zzc(audioDeviceInfo);
        }
    }

    final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m427m((Object) onRoutingChangedListener));
        this.zzc = null;
    }
}
