package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaag extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaag(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, String str, String str2) {
        int iZzj;
        int i4;
        boolean z;
        super(i, zzbgVar, i2);
        int i5 = 0;
        this.zzf = zzmw.CC.zzac(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzaaeVar.zzC;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzgvz zzgvzVarZzj = str2 != null ? zzgvz.zzj(str2) : zzaaeVar.zzy.isEmpty() ? zzgvz.zzj("") : zzaaeVar.zzy;
        int i8 = 0;
        while (true) {
            if (i8 >= zzgvzVarZzj.size()) {
                iZzj = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            zzv zzvVar = this.zzd;
            String str3 = (String) zzgvzVarZzj.get(i8);
            boolean z2 = zzaaeVar.zzD;
            iZzj = zzaaq.zzj(zzvVar, str3, false);
            if (iZzj > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = iZzj;
        if (str2 != null) {
            i4 = 1088;
        } else {
            int i9 = zzaaeVar.zzA;
            i4 = 0;
        }
        int iZzm = zzaaq.zzm(this.zzd.zzf, i4);
        this.zzk = iZzm;
        zzv zzvVar2 = this.zzd;
        this.zzn = (1088 & zzvVar2.zzf) != 0;
        int iZzn = zzaaq.zzn(zzvVar2, zzaaeVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        this.zzm = iZzj2;
        if (iZzj > 0 || ((zzaaeVar.zzy.isEmpty() && iZzm > 0) || ((zzaaeVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzaaeVar.zzx;
            z = false;
        }
        if (zzmw.CC.zzac(i3, zzaaeVar.zzV) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaag zzaagVar) {
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(this.zzf, zzaagVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaagVar.zzi), zzgxt.zzb().zza());
        int i = this.zzj;
        zzgvm zzgvmVarZzb = zzgvmVarZza.zzb(i, zzaagVar.zzj);
        int i2 = this.zzk;
        zzgvm zzgvmVarZzb2 = zzgvmVarZzb.zzb(i2, zzaagVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaagVar.zzl), zzgxt.zzb().zza()).zzd(this.zzg, zzaagVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaagVar.zzh), i == 0 ? zzgxt.zzb() : zzgxt.zzb().zza()).zzb(this.zzm, zzaagVar.zzm);
        if (i2 == 0) {
            zzgvmVarZzb2 = zzgvmVarZzb2.zzc(this.zzn, zzaagVar.zzn);
        }
        return zzgvmVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        return false;
    }
}
