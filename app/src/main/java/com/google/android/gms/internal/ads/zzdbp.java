package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbp {
    private final Context zza;
    private final zzfkm zzb;
    private final Bundle zzc;
    private final zzfkf zzd;
    private final zzdbi zze;
    private final zzell zzf;

    /* synthetic */ zzdbp(zzdbo zzdboVar, byte[] bArr) {
        this.zza = zzdboVar.zzh();
        this.zzb = zzdboVar.zzi();
        this.zzc = zzdboVar.zzj();
        this.zzd = zzdboVar.zzk();
        this.zze = zzdboVar.zzl();
        this.zzf = zzdboVar.zzm();
    }

    final zzdbo zza() {
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(this.zza);
        zzdboVar.zzb(this.zzb);
        zzdboVar.zzc(this.zzc);
        zzdboVar.zzd(this.zze);
        zzdboVar.zzg(this.zzf);
        return zzdboVar;
    }

    final zzfkm zzb() {
        return this.zzb;
    }

    final zzfkf zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzdbi zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzell zzg(String str) {
        zzell zzellVar = this.zzf;
        return zzellVar != null ? zzellVar : new zzell(str);
    }
}
