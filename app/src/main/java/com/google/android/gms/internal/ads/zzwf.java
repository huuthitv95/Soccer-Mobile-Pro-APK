package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzwf implements zzyu {
    public final zzyu zza;
    final /* synthetic */ zzwg zzb;
    private boolean zzc;

    public zzwf(zzwg zzwgVar, zzyu zzyuVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzb = zzwgVar;
        this.zza = zzyuVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zzd(zzlq zzlqVar, zzip zzipVar, int i) {
        zzwg zzwgVar = this.zzb;
        if (zzwgVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzipVar.zzg(4);
            return -4;
        }
        zzyu zzyuVar = this.zza;
        long jZzi = zzwgVar.zzi();
        int iZzd = zzyuVar.zzd(zzlqVar, zzipVar, i);
        if (zzwgVar.zzq() != -9223372036854775807L && iZzd != -3) {
            zzwgVar.zzr(-9223372036854775807L);
        }
        if (iZzd != -5) {
            long j = zzwgVar.zzb;
            if (j == Long.MIN_VALUE || ((iZzd != -4 || zzipVar.zze < j) && !(iZzd == -3 && jZzi == Long.MIN_VALUE && !zzipVar.zzd))) {
                return iZzd;
            }
            zzipVar.zza();
            zzipVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        long j2 = zzwgVar.zzb;
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        int i2 = zzvVar.zzK;
        if (i2 != 0) {
            int i3 = j2 == Long.MIN_VALUE ? zzvVar.zzL : 0;
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzJ(i2);
            zztVarZza.zzK(i3);
            zzlqVar.zzb = zztVarZza.zzO();
        } else if (zzvVar.zzL != 0) {
            i2 = 0;
            if (j2 == Long.MIN_VALUE) {
            }
            zzt zztVarZza2 = zzvVar.zza();
            zztVarZza2.zzJ(i2);
            zztVarZza2.zzK(i3);
            zzlqVar.zzb = zztVarZza2.zzO();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
