package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamu extends zzams {
    private zzamt zza;
    private int zzb;
    private boolean zzc;
    private zzahg zzd;
    private zzahe zze;

    zzamu() {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final long zzb(zzes zzesVar) {
        if ((zzesVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzesVar.zzi()[0];
        zzamt zzamtVar = this.zza;
        zzamtVar.getClass();
        int i = !zzamtVar.zzd[(b >> 1) & (255 >>> (8 - zzamtVar.zze))].zza ? zzamtVar.zza.zze : zzamtVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzesVar.zzj() < zzesVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzesVar.zzi(), zzesVar.zze() + 4);
            zzesVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzesVar.zzf(zzesVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzi = zzesVar.zzi();
        bArrZzi[zzesVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzesVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzesVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzesVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzahg zzahgVar = this.zzd;
        this.zzb = zzahgVar != null ? zzahgVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ea  */
    @Override // com.google.android.gms.internal.ads.zzams
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) throws IOException {
        zzamt zzamtVar;
        int i;
        int iZzb;
        int i2;
        int[] iArr;
        if (this.zza != null) {
            zzamqVar.zza.getClass();
            return false;
        }
        zzahg zzahgVar = this.zzd;
        int i3 = 1;
        if (zzahgVar != null) {
            int i4 = 4;
            zzahe zzaheVar = this.zze;
            if (zzaheVar == null) {
                this.zze = zzahh.zzb(zzesVar, true, true);
            } else {
                byte[] bArr = new byte[zzesVar.zze()];
                System.arraycopy(zzesVar.zzi(), 0, bArr, 0, zzesVar.zze());
                int i5 = zzahgVar.zza;
                int i6 = 5;
                zzahh.zzd(5, zzesVar, false);
                int iZzs = zzesVar.zzs() + 1;
                zzahd zzahdVar = new zzahd(zzesVar.zzi());
                zzahdVar.zzc(zzesVar.zzg() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iZzs) {
                        int i10 = i3;
                        int i11 = 6;
                        int iZzb2 = zzahdVar.zzb(6) + i10;
                        for (int i12 = 0; i12 < iZzb2; i12++) {
                            if (zzahdVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzahdVar.zzb(6) + i10;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iZzb3) {
                                int i15 = 1;
                                int iZzb4 = zzahdVar.zzb(i11) + 1;
                                int i16 = 0;
                                while (i16 < iZzb4) {
                                    if (zzahdVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzahdVar.zzc(24);
                                    zzahdVar.zzc(24);
                                    zzahdVar.zzc(24);
                                    int iZzb5 = zzahdVar.zzb(i11) + i15;
                                    int i17 = 8;
                                    zzahdVar.zzc(8);
                                    int[] iArr2 = new int[iZzb5];
                                    for (int i18 = 0; i18 < iZzb5; i18++) {
                                        iArr2[i18] = ((zzahdVar.zza() ? zzahdVar.zzb(5) : 0) * 8) + zzahdVar.zzb(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr2[i19] & (1 << i20)) != 0) {
                                                zzahdVar.zzc(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i11 = 6;
                                    i15 = 1;
                                }
                                int iZzb6 = zzahdVar.zzb(i11) + 1;
                                for (int i21 = 0; i21 < iZzb6; i21++) {
                                    int iZzb7 = zzahdVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iZzb7);
                                        zzef.zze("VorbisUtil", sb.toString());
                                    } else {
                                        if (zzahdVar.zza()) {
                                            i = 1;
                                            iZzb = zzahdVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzahdVar.zza()) {
                                            int iZzb8 = zzahdVar.zzb(8) + i;
                                            for (int i22 = 0; i22 < iZzb8; i22++) {
                                                int i23 = i5 - 1;
                                                zzahdVar.zzc(zzahh.zza(i23));
                                                zzahdVar.zzc(zzahh.zza(i23));
                                            }
                                        }
                                        if (zzahdVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                zzahdVar.zzc(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iZzb; i25++) {
                                            zzahdVar.zzc(8);
                                            zzahdVar.zzc(8);
                                            zzahdVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzahdVar.zzb(6);
                                int i26 = iZzb9 + 1;
                                zzahf[] zzahfVarArr = new zzahf[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    zzahfVarArr[i27] = new zzahf(zzahdVar.zza(), zzahdVar.zzb(16), zzahdVar.zzb(16), zzahdVar.zzb(8));
                                }
                                if (!zzahdVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzamtVar = new zzamt(zzahgVar, zzaheVar, bArr, zzahfVarArr, zzahh.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzahdVar.zzb(i9);
                            if (iZzb10 == 0) {
                                int i28 = 8;
                                zzahdVar.zzc(8);
                                zzahdVar.zzc(16);
                                zzahdVar.zzc(16);
                                zzahdVar.zzc(6);
                                zzahdVar.zzc(8);
                                int iZzb11 = zzahdVar.zzb(4) + 1;
                                int i29 = 0;
                                while (i29 < iZzb11) {
                                    zzahdVar.zzc(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iZzb10 != i10) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iZzb10);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                int iZzb12 = zzahdVar.zzb(5);
                                int[] iArr3 = new int[iZzb12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iZzb12; i31++) {
                                    int iZzb13 = zzahdVar.zzb(4);
                                    iArr3[i31] = iZzb13;
                                    if (iZzb13 > i30) {
                                        i30 = iZzb13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr4 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    int i34 = 1;
                                    iArr4[i33] = zzahdVar.zzb(i14) + 1;
                                    int iZzb14 = zzahdVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i2 = 8;
                                        zzahdVar.zzc(8);
                                    } else {
                                        i2 = 8;
                                    }
                                    int i35 = i32;
                                    int i36 = 0;
                                    while (true) {
                                        int i37 = i34 << iZzb14;
                                        iArr = iArr3;
                                        if (i36 < i37) {
                                            zzahdVar.zzc(i2);
                                            i36++;
                                            iArr3 = iArr;
                                            i2 = 8;
                                            i34 = 1;
                                        }
                                    }
                                    i33++;
                                    iArr3 = iArr;
                                    i32 = i35;
                                    i14 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zzahdVar.zzc(2);
                                int iZzb15 = zzahdVar.zzb(4);
                                int i38 = 0;
                                int i39 = 0;
                                for (int i40 = 0; i40 < iZzb12; i40++) {
                                    i38 += iArr4[iArr5[i40]];
                                    while (i39 < i38) {
                                        zzahdVar.zzc(iZzb15);
                                        i39++;
                                    }
                                }
                            }
                            i13++;
                            i11 = 6;
                            i9 = 16;
                            i10 = 1;
                        }
                    } else {
                        if (zzahdVar.zzb(24) != 5653314) {
                            int iZzd = zzahdVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzahdVar.zzb(16);
                        int iZzb17 = zzahdVar.zzb(24);
                        if (zzahdVar.zza()) {
                            zzahdVar.zzc(i6);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzahdVar.zzb(zzahh.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzahdVar.zza();
                            for (int i41 = 0; i41 < iZzb17; i41++) {
                                if (!zZza) {
                                    zzahdVar.zzc(i6);
                                } else if (zzahdVar.zza()) {
                                    zzahdVar.zzc(i6);
                                }
                            }
                        }
                        int i42 = i4;
                        int iZzb19 = zzahdVar.zzb(i42);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i3) {
                            if (iZzb19 != 2) {
                                i3 = i3;
                            }
                            i7++;
                            i3 = i3;
                            i4 = 4;
                            i6 = 5;
                        } else {
                            i8 = iZzb19;
                        }
                        zzahdVar.zzc(32);
                        zzahdVar.zzc(32);
                        int iZzb20 = zzahdVar.zzb(i42) + i3;
                        zzahdVar.zzc(i3);
                        zzahdVar.zzc((int) ((i8 == i3 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i7++;
                        i3 = i3;
                        i4 = 4;
                        i6 = 5;
                    }
                }
            }
            this.zza = zzamtVar;
            if (zzamtVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzahg zzahgVar2 = zzamtVar.zza;
            arrayList.add(zzahgVar2.zzg);
            arrayList.add(zzamtVar.zzc);
            zzap zzapVarZzc = zzahh.zzc(zzgvz.zzr(zzamtVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/vorbis");
            zztVar.zzi(zzahgVar2.zzd);
            zztVar.zzj(zzahgVar2.zzc);
            zztVar.zzG(zzahgVar2.zza);
            zztVar.zzH(zzahgVar2.zzb);
            zztVar.zzr(arrayList);
            zztVar.zzl(zzapVarZzc);
            zzamqVar.zza = zztVar.zzO();
            return true;
        }
        zzahh.zzd(1, zzesVar, false);
        int iZzI = zzesVar.zzI();
        int iZzs2 = zzesVar.zzs();
        int iZzI2 = zzesVar.zzI();
        int iZzC = zzesVar.zzC();
        int i43 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzesVar.zzC();
        int i44 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzesVar.zzC();
        int i45 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzesVar.zzs();
        this.zzd = new zzahg(iZzI, iZzs2, iZzI2, i43, i44, i45, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & 240) >> 4), 1 == (zzesVar.zzs() & 1), Arrays.copyOf(zzesVar.zzi(), zzesVar.zze()));
        zzamtVar = null;
        this.zza = zzamtVar;
        if (zzamtVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzahg zzahgVar3 = zzamtVar.zza;
        arrayList2.add(zzahgVar3.zzg);
        arrayList2.add(zzamtVar.zzc);
        zzap zzapVarZzc2 = zzahh.zzc(zzgvz.zzr(zzamtVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzn("audio/ogg");
        zztVar2.zzo("audio/vorbis");
        zztVar2.zzi(zzahgVar3.zzd);
        zztVar2.zzj(zzahgVar3.zzc);
        zztVar2.zzG(zzahgVar3.zza);
        zztVar2.zzH(zzahgVar3.zzb);
        zztVar2.zzr(arrayList2);
        zztVar2.zzl(zzapVarZzc2);
        zzamqVar.zza = zztVar2.zzO();
        return true;
    }
}
