package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzzp extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaae zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    public zzzp(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, boolean z, zzgsx zzgsxVar, int i4) {
        int i5;
        int iZzj;
        byte b;
        boolean z2;
        int i6;
        int iZzj2;
        boolean z3;
        super(i, zzbgVar, i2);
        this.zzh = zzaaeVar;
        int i7 = 1;
        int i8 = true != zzaaeVar.zzT ? 16 : 24;
        boolean z4 = zzaaeVar.zzP;
        this.zzg = zzaaq.zzi(this.zzd.zzd);
        this.zzi = zzmw.CC.zzac(i3, false);
        int i9 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i9 >= zzaaeVar.zzq.size()) {
                iZzj = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzq.get(i9), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.zzk = i9;
        this.zzj = iZzj;
        int i10 = this.zzd.zzf;
        int i11 = zzaaeVar.zzs;
        this.zzl = zzaaq.zzm(i10, 0);
        this.zzm = zzaaq.zzn(this.zzd, zzaaeVar.zzr);
        zzv zzvVar = this.zzd;
        int i12 = zzvVar.zzf;
        this.zzn = i12 == 0 || (i12 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0 || b == 1 || b == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zzx = z2;
        this.zzr = zzvVar.zzH;
        this.zzs = zzvVar.zzI;
        this.zzt = zzvVar.zzj;
        int i13 = zzvVar.zzj;
        this.zzf = (i13 == -1 || i13 <= zzaaeVar.zzu) && ((i6 = zzvVar.zzH) == -1 || i6 <= zzaaeVar.zzt) && zzgsxVar.zza(zzvVar);
        String str2 = zzfk.zza;
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = zzfk.zzi(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iZzj2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzaaq.zzj(this.zzd, strArrSplit[i15], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzo = i15;
        this.zzp = iZzj2;
        for (int i16 = 0; i16 < zzaaeVar.zzv.size(); i16++) {
            String str3 = this.zzd.zzp;
            if (str3 != null && str3.equals(zzaaeVar.zzv.get(i16))) {
                i5 = i16;
                break;
            }
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) == 128;
        this.zzw = (i3 & 64) == 64;
        zzaae zzaaeVar2 = this.zzh;
        if (zzmw.CC.zzac(i3, zzaaeVar2.zzV) && ((z3 = this.zzf) || zzaaeVar2.zzO)) {
            int i17 = zzaaeVar2.zzw.zzb;
            if (zzmw.CC.zzac(i3, false) && z3 && this.zzd.zzj != -1) {
                boolean z5 = zzaaeVar2.zzG;
                boolean z6 = zzaaeVar2.zzF;
                if ((zzaaeVar2.zzX || !z) && (i8 & i3) != 0) {
                    i7 = 2;
                }
            }
        } else {
            i7 = 0;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzp zzzpVar) {
        boolean z = this.zzf;
        zzgxt zzgxtVarZza = (z && this.zzi) ? zzaaq.zzc : zzaaq.zzc.zza();
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(this.zzi, zzzpVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzpVar.zzk), zzgxt.zzb().zza()).zzb(this.zzj, zzzpVar.zzj).zzb(this.zzl, zzzpVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzpVar.zzm), zzgxt.zzb().zza()).zzd(this.zzq, zzzpVar.zzq).zzd(this.zzn, zzzpVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzpVar.zzo), zzgxt.zzb().zza()).zzb(this.zzp, zzzpVar.zzp).zzd(z, zzzpVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzpVar.zzu), zzgxt.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgvm zzgvmVarZza2 = zzgvmVarZza.zzd(this.zzv, zzzpVar.zzv).zzd(this.zzw, zzzpVar.zzw).zzd(this.zzx, zzzpVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzpVar.zzr), zzgxtVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzpVar.zzs), zzgxtVarZza);
        if (Objects.equals(this.zzg, zzzpVar.zzg)) {
            zzgvmVarZza2 = zzgvmVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzpVar.zzt), zzgxtVarZza);
        }
        return zzgvmVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        String str;
        zzaae zzaaeVar = this.zzh;
        zzzp zzzpVar = (zzzp) zzaaiVar;
        boolean z = zzaaeVar.zzR;
        zzv zzvVar = this.zzd;
        int i = zzvVar.zzH;
        if (i == -1) {
            return false;
        }
        zzv zzvVar2 = zzzpVar.zzd;
        if (i != zzvVar2.zzH || (str = zzvVar.zzp) == null || !TextUtils.equals(str, zzvVar2.zzp)) {
            return false;
        }
        boolean z2 = zzaaeVar.zzQ;
        int i2 = zzvVar.zzI;
        if (i2 == -1 || i2 != zzvVar2.zzI) {
            return false;
        }
        boolean z3 = zzaaeVar.zzS;
        return this.zzv == zzzpVar.zzv && this.zzw == zzzpVar.zzw;
    }
}
