package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzako implements zzakn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzako(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzako zze(long j, long j2, zzagm zzagmVar, zzes zzesVar) {
        int iZzs;
        zzes zzesVar2 = zzesVar;
        zzesVar2.zzk(6);
        int iZzB = zzesVar2.zzB();
        long j3 = zzagmVar.zzc;
        long j4 = iZzB;
        int iZzB2 = zzesVar2.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzt = zzfk.zzt((((long) iZzB2) * ((long) zzagmVar.zzg)) - 1, zzagmVar.zzd);
        int iZzt = zzesVar2.zzt();
        int iZzt2 = zzesVar2.zzt();
        int iZzt3 = zzesVar2.zzt();
        zzesVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i = 0;
        long j5 = j2 + ((long) zzagmVar.zzc);
        while (i < iZzt) {
            long j6 = j3;
            jArr[i] = (((long) i) * jZzt) / ((long) iZzt);
            jArr2[i] = j5;
            if (iZzt3 == 1) {
                iZzs = zzesVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzesVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzesVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzesVar2.zzH();
            }
            j5 += ((long) iZzs) * ((long) iZzt2);
            i++;
            zzesVar2 = zzesVar;
            iZzt = iZzt;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long jMax = j7 + j4;
        if (j != -1 && j != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(jMax).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(jMax);
            zzef.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j5).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(jMax);
            sb2.append(", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzef.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j5);
        }
        return new zzako(jArr, jArr2, jZzt, j7, jMax, zzagmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        long[] jArr = this.zza;
        int iZzo = zzfk.zzo(jArr, j, true, true);
        long j2 = jArr[iZzo];
        long[] jArr2 = this.zzb;
        zzagt zzagtVar = new zzagt(j2, jArr2[iZzo]);
        if (zzagtVar.zzb >= j || iZzo == jArr.length - 1) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i = iZzo + 1;
        return new zzagq(zzagtVar, new zzagt(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j) {
        return this.zza[zzfk.zzo(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
