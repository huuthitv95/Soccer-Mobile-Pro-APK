package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbo {
    private Context zza;
    private zzfkm zzb;
    private Bundle zzc;
    private zzfkf zzd;
    private zzdbi zze;
    private zzell zzf;

    public final zzdbo zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbo zzb(zzfkm zzfkmVar) {
        this.zzb = zzfkmVar;
        return this;
    }

    public final zzdbo zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbo zzd(zzdbi zzdbiVar) {
        this.zze = zzdbiVar;
        return this;
    }

    public final zzdbp zze() {
        return new zzdbp(this, null);
    }

    public final zzdbo zzf(zzfkf zzfkfVar) {
        this.zzd = zzfkfVar;
        return this;
    }

    public final zzdbo zzg(zzell zzellVar) {
        this.zzf = zzellVar;
        return this;
    }

    final /* synthetic */ Context zzh() {
        return this.zza;
    }

    final /* synthetic */ zzfkm zzi() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzfkf zzk() {
        return this.zzd;
    }

    final /* synthetic */ zzdbi zzl() {
        return this.zze;
    }

    final /* synthetic */ zzell zzm() {
        return this.zzf;
    }
}
