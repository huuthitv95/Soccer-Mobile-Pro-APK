package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagu implements zzafp {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzafs zzf;
    private zzahb zzg;

    public zzagu(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        int i = this.zza;
        zzgsw.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzes zzesVar = new zzes(i2);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, i2, false);
        return zzesVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzf = zzafsVar;
        zzahb zzahbVarZzu = zzafsVar.zzu(1024, 4);
        this.zzg = zzahbVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzahbVarZzu.zzA(zztVar.zzO());
        this.zzf.zzv();
        this.zzf.zzw(new zzagv(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzahb zzahbVar = this.zzg;
        zzahbVar.getClass();
        int iZza = zzahbVar.zza(zzafqVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
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
