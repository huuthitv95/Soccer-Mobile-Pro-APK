package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzst {
    private final Context zza;
    private zztb zzb;
    private zzqb zzc;
    private zzsz zzd;

    public zzst(Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zztb.zza;
        if (context == null) {
            this.zzc = zzqb.zza;
        }
    }

    public final zzst zza(zztb zztbVar) {
        this.zzb = zztbVar;
        return this;
    }

    final zzst zzb(zzqb zzqbVar) {
        if (this.zza == null) {
            this.zzc = zzqbVar;
        }
        return this;
    }

    public final zzsv zzc() {
        if (this.zzd == null) {
            this.zzd = new zzsz(this.zza);
        }
        return new zzsv(this, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzqb zze() {
        return this.zzc;
    }

    public final zzst zzf(zzsz zzszVar) {
        this.zzd = zzszVar;
        return this;
    }

    final /* synthetic */ zzsz zzg() {
        return this.zzd;
    }
}
