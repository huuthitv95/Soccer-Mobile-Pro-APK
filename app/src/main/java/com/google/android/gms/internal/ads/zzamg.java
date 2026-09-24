package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamg implements zzags {
    final /* synthetic */ zzamh zza;

    /* synthetic */ zzamg(zzamh zzamhVar, byte[] bArr) {
        Objects.requireNonNull(zzamhVar);
        this.zza = zzamhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        zzamh zzamhVar = this.zza;
        return zzamhVar.zzf().zzh(zzamhVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzamh zzamhVar = this.zza;
        long jZzd = zzamhVar.zzd() + BigInteger.valueOf(zzamhVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzamhVar.zze() - zzamhVar.zzd())).divide(BigInteger.valueOf(zzamhVar.zzg())).longValue();
        String str = zzfk.zza;
        zzagt zzagtVar = new zzagt(j, Math.max(zzamhVar.zzd(), Math.min(jZzd - 30000, zzamhVar.zze() - 1)));
        return new zzagq(zzagtVar, zzagtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
