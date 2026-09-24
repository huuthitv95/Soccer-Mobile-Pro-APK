package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmr extends zzwq {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmr(zzms zzmsVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmsVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwq, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i, zzbdVar, z);
        if (!zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zzf = true;
            return zzbdVarZzd;
        }
        Object obj = zzbdVar.zza;
        Object obj2 = zzbdVar.zzb;
        int i2 = zzbdVar.zzc;
        long j = zzbdVar.zzd;
        long j2 = zzbdVar.zze;
        zzbdVarZzd.zza(obj, obj2, i2, j, 0L, zzc.zza, true);
        return zzbdVarZzd;
    }
}
