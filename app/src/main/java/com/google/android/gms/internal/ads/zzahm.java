package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahm implements zzags {
    final /* synthetic */ zzaho zza;
    private final long zzb;

    public zzahm(zzaho zzahoVar, long j) {
        Objects.requireNonNull(zzahoVar);
        this.zza = zzahoVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzaho zzahoVar = this.zza;
        zzagq zzagqVarZzg = zzahoVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzahoVar.zzh().length; i++) {
            zzagq zzagqVarZzg2 = zzahoVar.zzh()[i].zzg(j);
            if (zzagqVarZzg2.zza.zzc < zzagqVarZzg.zza.zzc) {
                zzagqVarZzg = zzagqVarZzg2;
            }
        }
        return zzagqVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
