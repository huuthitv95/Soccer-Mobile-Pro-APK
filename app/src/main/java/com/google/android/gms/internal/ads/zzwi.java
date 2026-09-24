package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzwi implements zzxn, zzub {
    final /* synthetic */ zzwk zza;
    private final Object zzb;
    private zzxm zzc;
    private zzua zzd;

    public zzwi(zzwk zzwkVar, Object obj) {
        Objects.requireNonNull(zzwkVar);
        this.zza = zzwkVar;
        this.zzc = zzwkVar.zzf(null);
        this.zzd = zzwkVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzxc zzxcVar) {
        zzxc zzxcVarZzx;
        if (zzxcVar != null) {
            zzxcVarZzx = this.zza.zzx(this.zzb, zzxcVar);
            if (zzxcVarZzx == null) {
                return false;
            }
        } else {
            zzxcVarZzx = null;
        }
        zzwk zzwkVar = this.zza;
        zzwkVar.zzw(this.zzb, 0);
        zzxm zzxmVar = this.zzc;
        int i2 = zzxmVar.zza;
        if (!Objects.equals(zzxmVar.zzb, zzxcVarZzx)) {
            this.zzc = zzwkVar.zzg(0, zzxcVarZzx);
        }
        zzua zzuaVar = this.zzd;
        int i3 = zzuaVar.zza;
        if (Objects.equals(zzuaVar.zzb, zzxcVarZzx)) {
            return true;
        }
        this.zzd = zzwkVar.zzi(0, zzxcVarZzx);
        return true;
    }

    private final zzwy zzg(zzwy zzwyVar, zzxc zzxcVar) {
        zzwk zzwkVar = this.zza;
        Object obj = this.zzb;
        zzwkVar.zzy(obj, zzwyVar.zzc, zzxcVar);
        zzwkVar.zzy(obj, zzwyVar.zzd, zzxcVar);
        return zzwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzai(int i, zzxc zzxcVar, zzwt zzwtVar, zzwy zzwyVar, int i2) {
        if (zzf(0, zzxcVar)) {
            zzxm zzxmVar = this.zzc;
            zzg(zzwyVar, zzxcVar);
            zzxmVar.zzd(zzwtVar, zzwyVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzaj(int i, zzxc zzxcVar, zzwt zzwtVar, zzwy zzwyVar) {
        if (zzf(0, zzxcVar)) {
            zzxm zzxmVar = this.zzc;
            zzg(zzwyVar, zzxcVar);
            zzxmVar.zze(zzwtVar, zzwyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzak(int i, zzxc zzxcVar, zzwt zzwtVar, zzwy zzwyVar) {
        if (zzf(0, zzxcVar)) {
            zzxm zzxmVar = this.zzc;
            zzg(zzwyVar, zzxcVar);
            zzxmVar.zzf(zzwtVar, zzwyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzal(int i, zzxc zzxcVar, zzwt zzwtVar, zzwy zzwyVar, IOException iOException, boolean z) {
        if (zzf(0, zzxcVar)) {
            zzxm zzxmVar = this.zzc;
            zzg(zzwyVar, zzxcVar);
            zzxmVar.zzg(zzwtVar, zzwyVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzam(int i, zzxc zzxcVar, zzwy zzwyVar) {
        if (zzf(0, zzxcVar)) {
            zzxm zzxmVar = this.zzc;
            zzg(zzwyVar, zzxcVar);
            zzxmVar.zzh(zzwyVar);
        }
    }
}
