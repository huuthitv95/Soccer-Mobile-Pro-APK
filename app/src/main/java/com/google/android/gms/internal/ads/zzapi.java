package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapi implements zzapm {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzahb zzi;
    private zzahb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzahb zzw;
    private long zzx;
    private final zzer zzc = new zzer(new byte[7], 7);
    private final zzes zzd = new zzes(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzapi(boolean z, String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzes zzesVar, byte[] bArr, int i) {
        int iMin = Math.min(zzesVar.zzd(), i - this.zzl);
        zzesVar.zzm(bArr, this.zzl, iMin);
        int i2 = this.zzl + iMin;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzahb zzahbVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzahbVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzes zzesVar, byte[] bArr, int i) {
        if (zzesVar.zzd() < i) {
            return false;
        }
        zzesVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzh = zzaraVar.zzc();
        zzahb zzahbVarZzu = zzafsVar.zzu(zzaraVar.zzb(), 1);
        this.zzi = zzahbVarZzu;
        this.zzw = zzahbVarZzu;
        if (!this.zzb) {
            this.zzj = new zzafm();
            return;
        }
        zzaraVar.zza();
        zzahb zzahbVarZzu2 = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzj = zzahbVarZzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaraVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo("application/id3");
        zzahbVarZzu2.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    /* JADX WARN: Code duplicated, block: B:73:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x021a  */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0222  */
    /* JADX WARN: Code duplicated, block: B:84:0x0231  */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        boolean z;
        int i2;
        int iZzj;
        byte[] bArrZzi;
        int iZze;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        byte b2;
        this.zzi.getClass();
        String str = zzfk.zza;
        while (zzesVar.zzd() > 0) {
            int i7 = this.zzk;
            char c = 7;
            int i8 = 3;
            int i9 = 2;
            if (i7 == 0) {
                byte[] bArrZzi2 = zzesVar.zzi();
                int iZzg = zzesVar.zzg();
                int iZze2 = zzesVar.zze();
                while (true) {
                    if (iZzg < iZze2) {
                        int i10 = iZzg + 1;
                        byte b3 = bArrZzi2[iZzg];
                        int i11 = b3 & 255;
                        int i12 = i8;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i11)) {
                            if (!this.zzo) {
                                int i13 = iZzg - 1;
                                zzesVar.zzh(iZzg);
                                zzer zzerVar = this.zzc;
                                if (zzm(zzesVar, zzerVar.zza, 1)) {
                                    zzerVar.zzf(4);
                                    int iZzj2 = zzerVar.zzj(1);
                                    int i14 = this.zzp;
                                    if (i14 != -1 && iZzj2 != i14) {
                                        c = 7;
                                    } else if (this.zzq == -1) {
                                        if (zzm(zzesVar, zzerVar.zza, 4)) {
                                            zzerVar.zzf(14);
                                            iZzj = zzerVar.zzj(13);
                                            c = 7;
                                            if (iZzj >= 7) {
                                                bArrZzi = zzesVar.zzi();
                                                iZze = zzesVar.zze();
                                                i3 = i13 + iZzj;
                                                if (i3 >= iZze) {
                                                    b = bArrZzi[i3];
                                                    if (b == -1) {
                                                        i6 = i3 + 1;
                                                        if (i6 != iZze) {
                                                            b2 = bArrZzi[i6];
                                                            if (zzl((byte) -1, b2) || ((b2 & 8) >> 3) != iZzj2) {
                                                            }
                                                        }
                                                    } else if (b == 73 || ((i4 = i3 + 1) != iZze && (bArrZzi[i4] != 68 || ((i5 = i3 + 2) != iZze && bArrZzi[i5] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zzm(zzesVar, zzerVar.zza, 1)) {
                                        zzerVar.zzf(i9);
                                        if (zzerVar.zzj(4) == this.zzq) {
                                            zzesVar.zzh(iZzg + 1);
                                            if (zzm(zzesVar, zzerVar.zza, 4)) {
                                                zzerVar.zzf(14);
                                                iZzj = zzerVar.zzj(13);
                                                c = 7;
                                                if (iZzj >= 7) {
                                                    bArrZzi = zzesVar.zzi();
                                                    iZze = zzesVar.zze();
                                                    i3 = i13 + iZzj;
                                                    if (i3 >= iZze) {
                                                        b = bArrZzi[i3];
                                                        if (b == -1) {
                                                            i6 = i3 + 1;
                                                            if (i6 != iZze) {
                                                                b2 = bArrZzi[i6];
                                                                if (zzl((byte) -1, b2)) {
                                                                }
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c = 7;
                                        }
                                    }
                                } else {
                                    c = 7;
                                }
                            }
                            this.zzr = (b3 & 8) >> 3;
                            this.zzn = 1 == ((b3 & 1) ^ 1);
                            if (this.zzo) {
                                zzk();
                            } else {
                                this.zzk = 1;
                                this.zzl = 0;
                            }
                            zzesVar.zzh(i10);
                        } else {
                            c = c;
                        }
                        int i15 = this.zzm;
                        int i16 = i15 | i11;
                        if (i16 == 329) {
                            i = 2;
                            z = false;
                            i2 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                        } else if (i16 == 511) {
                            i = 2;
                            z = false;
                            i2 = 512;
                        } else if (i16 == 836) {
                            i = 2;
                            z = false;
                            i2 = 1024;
                        } else if (i16 == 1075) {
                            this.zzk = 2;
                            this.zzl = i12;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzesVar.zzh(i10);
                        } else if (i15 != 256) {
                            this.zzm = 256;
                            i8 = i12;
                            i9 = 2;
                        } else {
                            i12 = i12;
                            i = 2;
                            z = false;
                            iZzg = i10;
                            i8 = i12;
                            i9 = i;
                        }
                        this.zzm = i2;
                        iZzg = i10;
                        i8 = i12;
                        i9 = i;
                    } else {
                        zzesVar.zzh(iZzg);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    zzes zzesVar2 = this.zzd;
                    if (zzh(zzesVar, zzesVar2.zzi(), 10)) {
                        this.zzj.zzc(zzesVar2, 10);
                        zzesVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzesVar2.zzG() + 10);
                    }
                } else if (i7 != 3) {
                    int iMin = Math.min(zzesVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzesVar, iMin);
                    int i17 = this.zzl + iMin;
                    this.zzl = i17;
                    if (i17 == this.zzu) {
                        zzgsw.zzi(this.zzv != -9223372036854775807L);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i18 = true != this.zzn ? 5 : 7;
                    zzer zzerVar2 = this.zzc;
                    if (zzh(zzesVar, zzerVar2.zza, i18)) {
                        zzerVar2.zzf(0);
                        if (this.zzs) {
                            zzerVar2.zzh(10);
                        } else {
                            int iZzj3 = zzerVar2.zzj(2) + 1;
                            if (iZzj3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iZzj3);
                                sb.append(", but assuming AAC LC.");
                                zzef.zzc("AdtsReader", sb.toString());
                            }
                            zzerVar2.zzh(5);
                            int iZzj4 = zzerVar2.zzj(3);
                            int i19 = this.zzq;
                            int i20 = zzaeo.zza;
                            byte[] bArr = {(byte) (((i19 >> 1) & 7) | 16), (byte) (((iZzj4 << 3) & 120) | ((i19 << 7) & 128))};
                            zzaen zzaenVarZza = zzaeo.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzn(this.zzg);
                            zztVar.zzo("audio/mp4a-latm");
                            zztVar.zzk(zzaenVarZza.zzc);
                            zztVar.zzG(zzaenVarZza.zzb);
                            zztVar.zzH(zzaenVarZza.zza);
                            zztVar.zzr(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzvVarZzO = zztVar.zzO();
                            this.zzt = 1024000000 / ((long) zzvVarZzO.zzI);
                            this.zzi.zzA(zzvVarZzO);
                            this.zzs = true;
                        }
                        zzerVar2.zzh(4);
                        int iZzj5 = zzerVar2.zzj(13);
                        int i21 = iZzj5 - 7;
                        if (this.zzn) {
                            i21 = iZzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i21);
                    }
                }
            } else if (zzesVar.zzd() != 0) {
                zzer zzerVar3 = this.zzc;
                zzerVar3.zza[0] = zzesVar.zzi()[zzesVar.zzg()];
                zzerVar3.zzf(2);
                int iZzj6 = zzerVar3.zzj(4);
                int i22 = this.zzq;
                if (i22 == -1 || iZzj6 == i22) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
