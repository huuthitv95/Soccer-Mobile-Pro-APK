package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzqd extends AudioDeviceCallback {
    final /* synthetic */ zzqh zza;

    /* synthetic */ zzqd(zzqh zzqhVar, byte[] bArr) {
        Objects.requireNonNull(zzqhVar);
        this.zza = zzqhVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfk.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            zzqh zzqhVar = this.zza;
            if (Objects.equals(audioDeviceInfo, zzqhVar.zzj())) {
                zzqhVar.zzk(null);
                break;
            }
        }
        this.zza.zzi();
    }
}
