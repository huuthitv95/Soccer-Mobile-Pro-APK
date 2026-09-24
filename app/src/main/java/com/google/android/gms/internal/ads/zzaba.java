package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaba {
    public final int zza;
    public final zzmx[] zzb;
    public final zzaas[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzaba(zzmx[] zzmxVarArr, zzaas[] zzaasVarArr, zzbn zzbnVar, Object obj) {
        int length = zzmxVarArr.length;
        zzgsw.zza(length == zzaasVarArr.length);
        this.zzb = zzmxVarArr;
        this.zzc = (zzaas[]) zzaasVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzaba zzabaVar, int i) {
        return zzabaVar != null && Objects.equals(this.zzb[i], zzabaVar.zzb[i]) && Objects.equals(this.zzc[i], zzabaVar.zzc[i]);
    }
}
