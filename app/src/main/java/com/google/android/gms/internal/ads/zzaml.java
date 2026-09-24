package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaml implements zzafp {
    private zzafs zza;
    private zzams zzb;
    private boolean zzc;

    static {
        int i = zzamk.zza;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zzh(zzafq zzafqVar) throws IOException {
        zzamn zzamnVar = new zzamn();
        if (zzamnVar.zzc(zzafqVar, true) && (zzamnVar.zza & 2) == 2) {
            int iMin = Math.min(zzamnVar.zze, 8);
            zzes zzesVar = new zzes(iMin);
            zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
            zzesVar.zzh(0);
            if (zzesVar.zzd() >= 5 && zzesVar.zzs() == 127 && zzesVar.zzz() == 1179402563) {
                this.zzb = new zzamj();
            } else {
                zzesVar.zzh(0);
                try {
                    if (zzahh.zzd(1, zzesVar, true)) {
                        this.zzb = new zzamu();
                    } else {
                        zzesVar.zzh(0);
                        if (zzamp.zzd(zzesVar)) {
                            this.zzb = new zzamp();
                        }
                    }
                } catch (zzat unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        try {
            return zzh(zzafqVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zza = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzafqVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzafqVar.zzl();
        }
        if (!this.zzc) {
            zzahb zzahbVarZzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzahbVarZzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzafqVar, zzagpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        zzams zzamsVar = this.zzb;
        if (zzamsVar != null) {
            zzamsVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }
}
