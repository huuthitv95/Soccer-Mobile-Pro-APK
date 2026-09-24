package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhh {
    final /* synthetic */ zzbhi zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbhh(zzbhi zzbhiVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbhiVar);
        this.zza = zzbhiVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbhi zzbhiVar = this.zza;
            if (zzbhiVar.zzb) {
                zzbhiVar.zza.zzh(this.zzb);
                zzbhiVar.zza.zzi(0);
                zzbhiVar.zza.zzj(this.zzc);
                zzbhiVar.zza.zzg(null);
                zzbhiVar.zza.zzf();
                return;
            }
            return;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e);
            return;
        }
        throw th;
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbhh zzb(int i) {
        this.zzc = i;
        return this;
    }
}
