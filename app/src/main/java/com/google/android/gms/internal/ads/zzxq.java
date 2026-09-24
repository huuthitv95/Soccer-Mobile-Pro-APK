package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzxq implements zzxa, zzwz {
    private final zzxa[] zza;
    private final boolean[] zzb;
    private zzwz zzf;
    private zzzf zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzyw zzi = new zzwm(zzgvz.zzi(), zzgvz.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzxa[] zzh = new zzxa[0];

    public zzxq(zzwn zzwnVar, long[] jArr, zzxa... zzxaVarArr) {
        this.zza = zzxaVarArr;
        this.zzb = new boolean[zzxaVarArr.length];
        for (int i = 0; i < zzxaVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzzc(zzxaVarArr[i], j);
            }
        }
    }

    public final zzxa zza(int i) {
        return this.zzb[i] ? ((zzzc) this.zza[i]).zza() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzf = zzwzVar;
        ArrayList arrayList = this.zzd;
        zzxa[] zzxaVarArr = this.zza;
        Collections.addAll(arrayList, zzxaVarArr);
        for (zzxa zzxaVar : zzxaVarArr) {
            zzxaVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        int i = 0;
        while (true) {
            zzxa[] zzxaVarArr = this.zza;
            if (i >= zzxaVarArr.length) {
                return;
            }
            zzxaVarArr[i].zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzaasVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzaasVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzyu zzyuVar = zzyuVarArr[i2];
            Integer num = zzyuVar == null ? null : (Integer) this.zzc.get(zzyuVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            zzaas zzaasVar = zzaasVarArr[i2];
            if (zzaasVar != null) {
                String str = zzaasVar.zza().zzb;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(CertificateUtil.DELIMITER)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzxa[] zzxaVarArr = this.zza;
        zzyu[] zzyuVarArr2 = new zzyu[length];
        zzyu[] zzyuVarArr3 = new zzyu[length];
        zzaas[] zzaasVarArr2 = new zzaas[length];
        ArrayList arrayList = new ArrayList(zzxaVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzxaVarArr.length) {
            int i4 = i;
            while (i4 < zzaasVarArr.length) {
                zzyuVarArr3[i4] = iArr[i4] == i3 ? zzyuVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzaas zzaasVar2 = zzaasVarArr[i4];
                    zzaasVar2.getClass();
                    zzbg zzbgVar = (zzbg) this.zze.get(zzaasVar2.zza());
                    zzbgVar.getClass();
                    zzaasVarArr2[i4] = new zzxp(zzaasVar2, zzbgVar);
                } else {
                    zzaasVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jZze = zzxaVarArr[i3].zze(zzaasVarArr2, zArr, zzyuVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jZze;
            } else if (jZze != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzaasVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    zzyu zzyuVar2 = zzyuVarArr3[i6];
                    zzyuVar2.getClass();
                    zzyuVarArr2[i6] = zzyuVar2;
                    identityHashMap.put(zzyuVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzgsw.zzi(zzyuVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzxaVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzyuVarArr2, i7, zzyuVarArr, i7, length);
        this.zzh = (zzxa[]) arrayList3.toArray(new zzxa[i7]);
        this.zzi = new zzwm(arrayList3, zzgwz.zzc(arrayList3, zzxo.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        for (zzxa zzxaVar : this.zzh) {
            zzxaVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        long j = -9223372036854775807L;
        for (zzxa zzxaVar : this.zzh) {
            long jZzh = zzxaVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzxaVar.zzj(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzxa zzxaVar2 : this.zzh) {
                    if (zzxaVar2 == zzxaVar) {
                        break;
                    }
                    if (zzxaVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzh;
            } else if (jZzh != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        long jZzj = this.zzh[0].zzj(j);
        int i = 1;
        while (true) {
            zzxa[] zzxaVarArr = this.zzh;
            if (i >= zzxaVarArr.length) {
                return jZzj;
            }
            if (zzxaVarArr[i].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        zzxa[] zzxaVarArr = this.zzh;
        return (zzxaVarArr.length > 0 ? zzxaVarArr[0] : this.zza[0]).zzk(j, zzncVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzluVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxa) arrayList.get(i)).zzm(zzluVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzxaVar);
        if (arrayList.isEmpty()) {
            zzxa[] zzxaVarArr = this.zza;
            int i = 0;
            for (zzxa zzxaVar2 : zzxaVarArr) {
                i += zzxaVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzxaVarArr.length; i3++) {
                zzzf zzzfVarZzd = zzxaVarArr[i3].zzd();
                int i4 = zzzfVarZzd.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzbg zzbgVarZza = zzzfVarZzd.zza(i5);
                    int i6 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        zzv zzvVarZza = zzbgVarZza.zza(i7);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxa[] zzxaVarArr2 = zzxaVarArr;
                        int i8 = i2;
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + str.length());
                        sb.append(i3);
                        sb.append(CertificateUtil.DELIMITER);
                        sb.append(str);
                        zztVarZza.zza(sb.toString());
                        String str2 = zzvVarZza.zzn;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + str2.length());
                            sb2.append(i3);
                            sb2.append(CertificateUtil.DELIMITER);
                            sb2.append(str2);
                            zztVarZza.zzm(sb2.toString());
                        }
                        zzvVarArr[i7] = zztVarZza.zzO();
                        i7++;
                        zzxaVarArr = zzxaVarArr2;
                        i2 = i8;
                    }
                    zzxa[] zzxaVarArr3 = zzxaVarArr;
                    int i9 = i2;
                    String str3 = zzbgVarZza.zzb;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i3);
                    sb3.append(CertificateUtil.DELIMITER);
                    sb3.append(str3);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    i2 = i9 + 1;
                    zzbgVarArr[i9] = zzbgVar;
                    i5++;
                    zzxaVarArr = zzxaVarArr3;
                }
            }
            this.zzg = new zzzf(zzbgVarArr);
            zzwz zzwzVar = this.zzf;
            zzwzVar.getClass();
            zzwzVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        zzwz zzwzVar = this.zzf;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        zzzf zzzfVar = this.zzg;
        zzzfVar.getClass();
        return zzzfVar;
    }
}
