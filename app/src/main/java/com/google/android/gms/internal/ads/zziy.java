package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziy implements zzabd {
    final /* synthetic */ zzja zza;
    private final HashMap zzb;
    private final zzpz zzc;

    public zziy(zzja zzjaVar, zzpz zzpzVar) {
        Objects.requireNonNull(zzjaVar);
        this.zza = zzjaVar;
        this.zzb = new HashMap();
        this.zzc = zzpzVar;
    }

    private final void zze(zzabb zzabbVar) {
        zzpz zzpzVar = (zzpz) this.zzb.remove(zzabbVar);
        zzpzVar.getClass();
        zziz zzizVar = (zziz) this.zza.zzl().get(zzpzVar);
        if (zzizVar != null) {
            zzizVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized zzabb zza() {
        zzabb zzabbVarZza;
        zzja zzjaVar = this.zza;
        zzabj zzabjVarZzk = zzjaVar.zzk();
        HashMap map = this.zzb;
        zzabbVarZza = zzabjVarZzk.zza();
        zzpz zzpzVar = this.zzc;
        map.put(zzabbVarZza, zzpzVar);
        zziz zzizVar = (zziz) zzjaVar.zzl().get(zzpzVar);
        if (zzizVar != null) {
            zzizVar.zza();
        }
        return zzabbVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzb(zzabb zzabbVar) {
        this.zza.zzk().zzb(zzabbVar);
        zze(zzabbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzc(zzabc zzabcVar) {
        this.zza.zzk().zzc(zzabcVar);
        while (zzabcVar != null) {
            zze(zzabcVar.zzd());
            zzabcVar = zzabcVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}
