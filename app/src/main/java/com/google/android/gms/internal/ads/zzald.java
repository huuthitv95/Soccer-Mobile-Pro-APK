package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.C0684C;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzald {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfk.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:290:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:572:0x0bf3  */
    /* JADX WARN: Code duplicated, block: B:573:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:608:0x0d6c  */
    /* JADX WARN: Code duplicated, block: B:609:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:611:0x0d74  */
    /* JADX WARN: Code duplicated, block: B:613:0x0d81  */
    /* JADX WARN: Code duplicated, block: B:614:0x0d8d  */
    /* JADX WARN: Code duplicated, block: B:619:0x0dd9  */
    /* JADX WARN: Code duplicated, block: B:620:0x0e0d  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static List zzb(zzfw zzfwVar, zzagi zzagiVar, long j, zzq zzqVar, boolean z, boolean z2, zzgsn zzgsnVar, boolean z3) throws zzat {
        int i;
        int i2;
        long jZzz;
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        long j2;
        long jZzv;
        long jZzv2;
        String str;
        zzfw zzfwVar2;
        long[] jArr;
        long[] jArr2;
        zzv zzvVarZzO;
        zzamb zzambVar;
        zzfv zzfvVar;
        zzap zzapVar;
        zzap zzapVar2;
        Pair pairZzn;
        int i6;
        short s;
        int i7;
        long j3;
        ArrayList arrayList;
        zzq zzqVar2;
        int i8;
        String str2;
        long j4;
        int i9;
        int i10;
        char c;
        String str3;
        String str4;
        int i11;
        int i12;
        zzakz zzakzVar;
        int i13;
        String str5;
        String str6;
        zzakz zzakzVar2;
        int i14;
        int i15;
        int i16;
        zzgl zzglVar;
        boolean z6;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        boolean z9;
        zzq zzqVarZzb;
        zzgvz zzgvzVarZzj;
        String str7;
        String str8;
        String str9;
        long j5;
        zzgvz zzgvzVar;
        boolean z10;
        zzamb zzambVar2;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        int i19 = 0;
        while (true) {
            List list = zzfwVar.zzc;
            if (i19 >= list.size()) {
                return arrayList3;
            }
            zzfw zzfwVar3 = (zzfw) list.get(i19);
            if (zzfwVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i2 = i19;
            } else {
                zzfx zzfxVarZzc = zzfwVar.zzc(1836476516);
                zzfxVarZzc.getClass();
                zzfw zzfwVarZzd = zzfwVar3.zzd(1835297121);
                zzfwVarZzd.getClass();
                zzfx zzfxVarZzc2 = zzfwVarZzd.zzc(1751411826);
                zzfxVarZzc2.getClass();
                int iZzi = zzi(zzfxVarZzc2.zza);
                int i20 = 1;
                if (iZzi == 1936684398) {
                    i = 1;
                } else if (iZzi == 1986618469) {
                    i = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728 || iZzi == 1937072752) {
                    i = 3;
                } else {
                    i = iZzi == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    i2 = i19;
                    zzfwVar2 = zzfwVar3;
                } else {
                    zzfx zzfxVarZzc3 = zzfwVar3.zzc(1953196132);
                    zzfxVarZzc3.getClass();
                    zzes zzesVar = zzfxVarZzc3.zza;
                    int i21 = 8;
                    zzesVar.zzh(8);
                    int iZza = zza(zzesVar.zzB());
                    zzesVar.zzk(iZza == 0 ? 8 : 16);
                    int iZzB = zzesVar.zzB();
                    char c2 = 0;
                    int i22 = 4;
                    zzesVar.zzk(4);
                    int iZzg = zzesVar.zzg();
                    int i23 = 0;
                    while (true) {
                        if (iZza == 0) {
                            i21 = i22;
                        }
                        i2 = i19;
                        if (i23 >= i21) {
                            zzesVar.zzk(i21);
                        } else {
                            if (zzesVar.zzi()[iZzg + i23] != -1) {
                                jZzz = iZza == 0 ? zzesVar.zzz() : zzesVar.zzJ();
                                if (jZzz != 0) {
                                    break;
                                }
                                break;
                            }
                            i23++;
                            i19 = i2;
                            i21 = 8;
                            i22 = 4;
                        }
                        jZzz = -9223372036854775807L;
                        break;
                    }
                    zzesVar.zzk(10);
                    int iZzt = zzesVar.zzt();
                    zzesVar.zzk(4);
                    int iZzB2 = zzesVar.zzB();
                    int iZzB3 = zzesVar.zzB();
                    zzesVar.zzk(4);
                    int iZzB4 = zzesVar.zzB();
                    int iZzB5 = zzesVar.zzB();
                    if (iZzB2 != 0) {
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        z4 = z5;
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (true != z4) {
                                    i5 = 270;
                                    i4 = i5;
                                    i20 = 1;
                                }
                                iZzB3 = -65536;
                            }
                            i3 = 0;
                        } else {
                            i3 = iZzB2;
                        }
                        i4 = ((i3 != -65536 || i3 == 65536) && iZzB3 == 0 && iZzB4 == 0 && iZzB5 == -65536) ? 180 : 0;
                    } else {
                        if (iZzB3 == 65536) {
                            if (iZzB4 != -65536) {
                                if (iZzB4 == 65536) {
                                    z10 = iZzB5 != 0;
                                    iZzB4 = 65536;
                                }
                                iZzB3 = 65536;
                            } else {
                                z10 = iZzB5 != 0;
                            }
                            if (true != z10) {
                                i5 = 90;
                            } else {
                                iZzB3 = 65536;
                            }
                            i4 = i5;
                            i20 = 1;
                        }
                        iZzB2 = 0;
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        z4 = z5;
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (true != z4) {
                                    i5 = 270;
                                    i4 = i5;
                                    i20 = 1;
                                }
                                iZzB3 = -65536;
                            }
                            i3 = 0;
                        } else {
                            i3 = iZzB2;
                        }
                        if (i3 != -65536) {
                        }
                    }
                    zzesVar.zzk(16);
                    short sZzv = zzesVar.zzv();
                    zzesVar.zzk(2);
                    short sZzv2 = zzesVar.zzv();
                    long j6 = j == -9223372036854775807L ? jZzz : j;
                    long j7 = zzd(zzfxVarZzc.zza).zzc;
                    if (j6 == -9223372036854775807L) {
                        j2 = j7;
                        jZzv = -9223372036854775807L;
                    } else {
                        j2 = j7;
                        jZzv = zzfk.zzv(j6, 1000000L, j2, RoundingMode.DOWN);
                    }
                    zzfw zzfwVarZzd2 = zzfwVarZzd.zzd(1835626086);
                    zzfwVarZzd2.getClass();
                    zzfw zzfwVarZzd3 = zzfwVarZzd2.zzd(1937007212);
                    zzfwVarZzd3.getClass();
                    zzfx zzfxVarZzc4 = zzfwVarZzd.zzc(1835296868);
                    zzfxVarZzc4.getClass();
                    zzes zzesVar2 = zzfxVarZzc4.zza;
                    int i24 = 8;
                    zzesVar2.zzh(8);
                    int iZza2 = zza(zzesVar2.zzB());
                    zzesVar2.zzk(iZza2 == 0 ? 8 : 16);
                    long jZzz2 = zzesVar2.zzz();
                    int iZzg2 = zzesVar2.zzg();
                    int i25 = 0;
                    while (true) {
                        if (iZza2 == 0) {
                            i24 = 4;
                        }
                        if (i25 >= i24) {
                            zzfwVar3 = zzfwVar3;
                            zzesVar2.zzk(i24);
                            jZzv2 = -9223372036854775807L;
                            break;
                        }
                        if (zzesVar2.zzi()[iZzg2 + i25] != -1) {
                            long jZzz3 = iZza2 == 0 ? zzesVar2.zzz() : zzesVar2.zzJ();
                            jZzv2 = jZzz3 == 0 ? -9223372036854775807L : zzfk.zzv(jZzz3, 1000000L, jZzz2, RoundingMode.DOWN);
                            break;
                        }
                        i25++;
                        zzfwVar3 = zzfwVar3;
                        i24 = 8;
                    }
                    int iZzt2 = zzesVar2.zzt();
                    char c3 = (char) (((iZzt2 >> 10) & 31) + 96);
                    char c4 = (char) (((iZzt2 >> 5) & 31) + 96);
                    char c5 = (char) ((iZzt2 & 31) + 96);
                    int i26 = 3;
                    char[] cArr = new char[3];
                    cArr[0] = c3;
                    cArr[i20] = c4;
                    char c6 = 2;
                    cArr[2] = c5;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= i26) {
                            str = new String(cArr);
                            break;
                        }
                        char c7 = cArr[i27];
                        if (c7 < 'a' || c7 > 'z') {
                            str = null;
                            break;
                        }
                        i27++;
                        i26 = 3;
                    }
                    zzfx zzfxVarZzc5 = zzfwVarZzd3.zzc(1937011556);
                    if (zzfxVarZzc5 == null) {
                        zzef.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        zzfwVar2 = zzfwVar3;
                    } else {
                        String strZzc = zzakw.zzc(jZzz2, jZzv2, str);
                        zzes zzesVar3 = zzfxVarZzc5.zza;
                        zzesVar3.zzh(12);
                        int iZzB6 = zzesVar3.zzB();
                        zzakz zzakzVar3 = new zzakz(iZzB6);
                        int i28 = i;
                        int i29 = 0;
                        while (i29 < iZzB6) {
                            int i30 = i29;
                            int iZzg3 = zzesVar3.zzg();
                            int iZzB7 = zzesVar3.zzB();
                            int i31 = iZzt;
                            String str10 = "childAtomSize must be positive";
                            zzaft.zza(iZzB7 > 0 ? i20 : c2, "childAtomSize must be positive");
                            int iZzB8 = zzesVar3.zzB();
                            long j8 = jZzv2;
                            if (iZzB8 == 1635148593 || iZzB8 == 1635148595 || iZzB8 == 1701733238 || iZzB8 == 1831958048 || iZzB8 == 1836070006 || iZzB8 == 1752589105 || iZzB8 == 1751479857 || iZzB8 == 1987470129 || iZzB8 == 1987471665 || iZzB8 == 1932670515 || iZzB8 == 1211250227 || iZzB8 == 1748121139 || iZzB8 == 1987063864 || iZzB8 == 1987063865 || iZzB8 == 1635135537 || iZzB8 == 1685479798 || iZzB8 == 1685479729 || iZzB8 == 1685481573 || iZzB8 == 1685481521 || iZzB8 == 1634760241 || iZzB8 == 1684108849) {
                                sZzv2 = sZzv2;
                                i6 = iZzB6;
                                zzakz zzakzVar4 = zzakzVar3;
                                s = sZzv;
                                int i32 = iZzB7;
                                i7 = i31;
                                j3 = j8;
                                String str11 = strZzc;
                                int i33 = iZzB8;
                                int i34 = iZzB;
                                zzesVar3 = zzesVar3;
                                zzesVar3.zzh(iZzg3 + 16);
                                zzesVar3.zzk(16);
                                int iZzt3 = zzesVar3.zzt();
                                i30 = i30;
                                int iZzt4 = zzesVar3.zzt();
                                arrayList = arrayList3;
                                zzesVar3.zzk(50);
                                int iZzg4 = zzesVar3.zzg();
                                str = str;
                                int i35 = 1701733238;
                                if (i33 == 1701733238) {
                                    Pair pairZzr = zzr(zzesVar3, iZzg3, i32);
                                    if (pairZzr != null) {
                                        int iIntValue = ((Integer) pairZzr.first).intValue();
                                        zzqVarZzb = zzqVar == null ? null : zzqVar.zzb(((zzamc) pairZzr.second).zzb);
                                        zzakzVar4.zza[i30] = (zzamc) pairZzr.second;
                                        i35 = iIntValue;
                                    } else {
                                        zzqVarZzb = zzqVar;
                                    }
                                    zzesVar3.zzh(iZzg4);
                                    i33 = i35;
                                    zzqVar2 = zzqVarZzb;
                                } else {
                                    zzqVar2 = zzqVar;
                                }
                                if (i33 == 1831958048) {
                                    int i36 = i33;
                                    str2 = "video/mpeg";
                                    i8 = i36;
                                } else {
                                    i8 = 1211250227;
                                    if (i33 == 1211250227) {
                                        str2 = "video/3gpp";
                                    } else {
                                        i8 = i33;
                                        str2 = null;
                                    }
                                }
                                zzq zzqVar3 = zzqVar2;
                                int i37 = iZzg4;
                                int i38 = i4;
                                String str12 = str2;
                                j4 = jZzz2;
                                float fZzH = 1.0f;
                                int i39 = 8;
                                int iZzc = -1;
                                int i40 = 8;
                                List listZzj = null;
                                int i41 = -1;
                                zzgl zzglVar2 = null;
                                int i42 = -1;
                                ByteBuffer byteBufferZzm = null;
                                String str13 = null;
                                zzaks zzaksVarZzq = null;
                                zzaku zzakuVar = null;
                                int i43 = -1;
                                int i44 = -1;
                                byte[] bArrCopyOfRange = null;
                                int i45 = -1;
                                boolean z11 = false;
                                int i46 = -1;
                                zzft zzftVarZza = null;
                                i9 = iZzg3;
                                int i47 = -1;
                                while (i37 - i9 < i32) {
                                    zzesVar3.zzh(i37);
                                    int iZzg5 = zzesVar3.zzg();
                                    int iZzB9 = zzesVar3.zzB();
                                    if (iZzB9 != 0) {
                                        i13 = iZzB9;
                                    } else {
                                        if (zzesVar3.zzg() - i9 == i32) {
                                            break;
                                        }
                                        i13 = 0;
                                    }
                                    zzaft.zza(i13 > 0, str10);
                                    int iZzB10 = zzesVar3.zzB();
                                    if (iZzB10 == 1635148611) {
                                        int i48 = iZzg5 + 8;
                                        zzaft.zza(str12 == null, null);
                                        zzesVar3.zzh(i48);
                                        zzaeu zzaeuVarZza = zzaeu.zza(zzesVar3);
                                        List list2 = zzaeuVarZza.zza;
                                        zzakzVar4.zzc = zzaeuVarZza.zzb;
                                        if (z11) {
                                            z9 = true;
                                        } else {
                                            fZzH = zzaeuVarZza.zzk;
                                            z9 = false;
                                        }
                                        String str14 = zzaeuVarZza.zzl;
                                        int i49 = zzaeuVarZza.zzj;
                                        int i50 = zzaeuVarZza.zzg;
                                        int i51 = zzaeuVarZza.zzh;
                                        int i52 = zzaeuVarZza.zzi;
                                        int i53 = zzaeuVarZza.zze;
                                        z11 = z9;
                                        str6 = str10;
                                        i44 = i49;
                                        zzakzVar2 = zzakzVar4;
                                        i47 = i50;
                                        str5 = "video/avc";
                                        i40 = zzaeuVarZza.zzf;
                                        str13 = str14;
                                        iZzc = i52;
                                        i39 = i53;
                                        i41 = i51;
                                        listZzj = list2;
                                    } else {
                                        if (iZzB10 == 1752589123) {
                                            int i54 = iZzg5 + 8;
                                            zzaft.zza(str12 == null, null);
                                            zzesVar3.zzh(i54);
                                            zzagj zzagjVarZza = zzagj.zza(zzesVar3);
                                            List list3 = zzagjVarZza.zza;
                                            zzakzVar4.zzc = zzagjVarZza.zzb;
                                            if (z11) {
                                                z8 = true;
                                            } else {
                                                fZzH = zzagjVarZza.zzl;
                                                z8 = false;
                                            }
                                            int i55 = zzagjVarZza.zzm;
                                            int i56 = zzagjVarZza.zzc;
                                            String str15 = zzagjVarZza.zzn;
                                            int i57 = zzagjVarZza.zzk;
                                            if (i57 == -1) {
                                                i57 = i42;
                                            }
                                            int i58 = zzagjVarZza.zzd;
                                            int i59 = zzagjVarZza.zze;
                                            int i60 = zzagjVarZza.zzh;
                                            int i61 = zzagjVarZza.zzi;
                                            int i62 = zzagjVarZza.zzj;
                                            int i63 = zzagjVarZza.zzf;
                                            int i64 = zzagjVarZza.zzg;
                                            i8 = i8;
                                            z11 = z8;
                                            str6 = str10;
                                            zzakzVar2 = zzakzVar4;
                                            i46 = i58;
                                            i41 = i61;
                                            i47 = i60;
                                            str5 = "video/hevc";
                                            i42 = i57;
                                            i45 = i59;
                                            listZzj = list3;
                                            zzglVar2 = zzagjVarZza.zzo;
                                            str13 = str15;
                                            i39 = i63;
                                            i40 = i64;
                                            i44 = i55;
                                            iZzc = i62;
                                            i43 = i56;
                                        } else {
                                            if (iZzB10 == 1818785347) {
                                                int i65 = iZzg5 + 8;
                                                zzaft.zza("video/hevc".equals(str12), "lhvC must follow hvcC atom");
                                                if (zzglVar2 != null) {
                                                    z7 = zzglVar2.zza.size() >= 2;
                                                } else {
                                                    z7 = false;
                                                    zzglVar2 = null;
                                                }
                                                zzaft.zza(z7, "must have at least two layers");
                                                zzesVar3.zzh(i65);
                                                zzglVar2.getClass();
                                                zzagj zzagjVarZzb = zzagj.zzb(zzesVar3, zzglVar2);
                                                zzaft.zza(zzakzVar4.zzc == zzagjVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                int i66 = zzagjVarZzb.zzh;
                                                if (i66 != -1) {
                                                    zzaft.zza(i47 == i66, "colorSpace must be the same for both views");
                                                }
                                                int i67 = zzagjVarZzb.zzi;
                                                if (i67 != -1) {
                                                    zzaft.zza(i41 == i67, "colorRange must be the same for both views");
                                                }
                                                int i68 = zzagjVarZzb.zzj;
                                                if (i68 != -1) {
                                                    zzaft.zza(iZzc == i68, "colorTransfer must be the same for both views");
                                                }
                                                zzaft.zza(i39 == zzagjVarZzb.zzf, "bitdepthLuma must be the same for both views");
                                                zzaft.zza(i40 == zzagjVarZzb.zzg, "bitdepthChroma must be the same for both views");
                                                if (listZzj != null) {
                                                    int i69 = zzgvz.zzd;
                                                    zzgvw zzgvwVar = new zzgvw();
                                                    zzgvwVar.zzh(listZzj);
                                                    zzgvwVar.zzh(zzagjVarZzb.zza);
                                                    listZzj = zzgvwVar.zzi();
                                                } else {
                                                    zzaft.zza(false, "initializationData must be already set from hvcC atom");
                                                }
                                                str13 = zzagjVarZzb.zzn;
                                                str6 = str10;
                                                str5 = "video/mv-hevc";
                                                zzakzVar2 = zzakzVar4;
                                            } else {
                                                if (iZzB10 == 1987470147) {
                                                    int i70 = iZzg5 + 8;
                                                    zzaft.zza(str12 == null, null);
                                                    zzesVar3.zzh(i70);
                                                    zzahi zzahiVarZza = zzahi.zza(zzesVar3);
                                                    List list4 = zzahiVarZza.zza;
                                                    zzakzVar4.zzc = zzahiVarZza.zzb;
                                                    String str16 = zzahiVarZza.zzc;
                                                    i39 = zzahiVarZza.zzd;
                                                    i8 = i8;
                                                    listZzj = list4;
                                                    str6 = str10;
                                                    str13 = str16;
                                                    zzakzVar2 = zzakzVar4;
                                                    str5 = "video/vvc";
                                                    i44 = 16;
                                                    i40 = i39;
                                                } else if (iZzB10 == 1986361461) {
                                                    zzesVar3.zzh(iZzg5 + 8);
                                                    str5 = str12;
                                                    int iZzg6 = zzesVar3.zzg();
                                                    zzakv zzakvVar = null;
                                                    while (iZzg6 - iZzg5 < i13) {
                                                        zzesVar3.zzh(iZzg6);
                                                        int iZzB11 = zzesVar3.zzB();
                                                        zzaft.zza(iZzB11 > 0, str10);
                                                        zzakz zzakzVar5 = zzakzVar4;
                                                        if (zzesVar3.zzB() == 1702454643) {
                                                            zzesVar3.zzh(iZzg6 + 8);
                                                            int iZzg7 = zzesVar3.zzg();
                                                            while (true) {
                                                                if (iZzg7 - iZzg6 >= iZzB11) {
                                                                    i18 = iZzB11;
                                                                    zzakvVar = null;
                                                                    break;
                                                                }
                                                                zzesVar3.zzh(iZzg7);
                                                                int iZzB12 = zzesVar3.zzB();
                                                                zzaft.zza(iZzB12 > 0, str10);
                                                                i18 = iZzB11;
                                                                if (zzesVar3.zzB() == 1937011305) {
                                                                    zzesVar3.zzk(4);
                                                                    int iZzs = zzesVar3.zzs();
                                                                    zzakvVar = new zzakv(new zzaky(1 == (iZzs & 1), (iZzs & 2) == 2, (iZzs & 8) == 8));
                                                                    break;
                                                                }
                                                                iZzg7 += iZzB12;
                                                                iZzB11 = i18;
                                                            }
                                                        } else {
                                                            i18 = iZzB11;
                                                        }
                                                        iZzg6 += i18;
                                                        zzakzVar4 = zzakzVar5;
                                                        str10 = str10;
                                                    }
                                                    str6 = str10;
                                                    zzakzVar2 = zzakzVar4;
                                                    zzalc zzalcVar = zzakvVar == null ? null : new zzalc(zzakvVar);
                                                    if (zzalcVar != null) {
                                                        if (zzglVar2 == null) {
                                                            zzglVar2 = null;
                                                        } else if (zzglVar2.zza.size() >= 2) {
                                                            zzaft.zza(zzalcVar.zza(), "both eye views must be marked as available");
                                                            zzaft.zza(!zzalcVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                        }
                                                        if (i42 == -1) {
                                                            i8 = i8;
                                                            i42 = true != zzalcVar.zzb().zza().zzc() ? 4 : 5;
                                                        } else {
                                                            i8 = i8;
                                                        }
                                                    }
                                                    i14 = i39;
                                                    i8 = i8;
                                                    i15 = i40;
                                                    i16 = i41;
                                                    zzglVar = zzglVar2;
                                                    zzglVar2 = zzglVar;
                                                    i40 = i15;
                                                    i39 = i14;
                                                    i41 = i16;
                                                } else {
                                                    str5 = str12;
                                                    str6 = str10;
                                                    zzakzVar2 = zzakzVar4;
                                                    if (iZzB10 == 1685480259 || iZzB10 == 1685485123 || iZzB10 == 1685485379) {
                                                        i14 = i39;
                                                        i8 = i8;
                                                        i15 = i40;
                                                        i16 = i41;
                                                        zzglVar = zzglVar2;
                                                        zzftVarZza = zzft.zza(zzesVar3);
                                                    } else if (iZzB10 == 1987076931) {
                                                        int i71 = iZzg5 + 12;
                                                        zzaft.zza(str5 == null, null);
                                                        zzesVar3.zzh(i71);
                                                        byte bZzs = (byte) zzesVar3.zzs();
                                                        byte bZzs2 = (byte) zzesVar3.zzs();
                                                        int iZzs2 = zzesVar3.zzs();
                                                        int i72 = iZzs2 >> 4;
                                                        int i73 = iZzs2 >> 1;
                                                        String str17 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        if (str17.equals("video/x-vnd.on2.vp9")) {
                                                            listZzj = zzdp.zza(bZzs, bZzs2, (byte) i72, (byte) (i73 & 7));
                                                        }
                                                        int i74 = iZzs2 & 1;
                                                        int iZzs3 = zzesVar3.zzs();
                                                        int iZzs4 = zzesVar3.zzs();
                                                        int iZzb = zzi.zzb(iZzs3);
                                                        int i75 = 1 != i74 ? 2 : 1;
                                                        int iZzc2 = zzi.zzc(iZzs4);
                                                        i8 = i8;
                                                        i47 = iZzb;
                                                        i40 = i72;
                                                        i41 = i75;
                                                        str5 = str17;
                                                        iZzc = iZzc2;
                                                        i39 = i40;
                                                    } else if (iZzB10 == 1635135811) {
                                                        int i76 = i13 - 8;
                                                        byte[] bArr = new byte[i76];
                                                        zzesVar3.zzm(bArr, 0, i76);
                                                        zzgvz zzgvzVarZzj2 = zzgvz.zzj(bArr);
                                                        zzesVar3.zzh(iZzg5 + 8);
                                                        zzi zziVarZzk = zzk(zzesVar3);
                                                        listZzj = zzgvzVarZzj2;
                                                        i39 = zziVarZzk.zzf;
                                                        i40 = zziVarZzk.zzg;
                                                        i47 = zziVarZzk.zzb;
                                                        i41 = zziVarZzk.zzc;
                                                        str5 = "video/av01";
                                                        iZzc = zziVarZzk.zzd;
                                                    } else if (iZzB10 == 1668050025) {
                                                        if (byteBufferZzm == null) {
                                                            byteBufferZzm = zzm();
                                                        }
                                                        ByteBuffer byteBuffer = byteBufferZzm;
                                                        byteBuffer.position(21);
                                                        byteBuffer.putShort(zzesVar3.zzv());
                                                        byteBuffer.putShort(zzesVar3.zzv());
                                                        byteBufferZzm = byteBuffer;
                                                    } else if (iZzB10 == 1835295606) {
                                                        if (byteBufferZzm == null) {
                                                            byteBufferZzm = zzm();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferZzm;
                                                        short sZzv3 = zzesVar3.zzv();
                                                        short sZzv4 = zzesVar3.zzv();
                                                        short sZzv5 = zzesVar3.zzv();
                                                        short sZzv6 = zzesVar3.zzv();
                                                        short sZzv7 = zzesVar3.zzv();
                                                        zzgl zzglVar3 = zzglVar2;
                                                        short sZzv8 = zzesVar3.zzv();
                                                        int i77 = i40;
                                                        short sZzv9 = zzesVar3.zzv();
                                                        int i78 = i39;
                                                        short sZzv10 = zzesVar3.zzv();
                                                        long jZzz4 = zzesVar3.zzz();
                                                        long jZzz5 = zzesVar3.zzz();
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sZzv7);
                                                        byteBuffer2.putShort(sZzv8);
                                                        byteBuffer2.putShort(sZzv3);
                                                        byteBuffer2.putShort(sZzv4);
                                                        byteBuffer2.putShort(sZzv5);
                                                        byteBuffer2.putShort(sZzv6);
                                                        byteBuffer2.putShort(sZzv9);
                                                        byteBuffer2.putShort(sZzv10);
                                                        byteBuffer2.putShort((short) (jZzz4 / 10000));
                                                        byteBuffer2.putShort((short) (jZzz5 / 10000));
                                                        byteBufferZzm = byteBuffer2;
                                                        zzglVar2 = zzglVar3;
                                                        i40 = i77;
                                                        i39 = i78;
                                                        i41 = i41;
                                                    } else {
                                                        i14 = i39;
                                                        i8 = i8;
                                                        i15 = i40;
                                                        i16 = i41;
                                                        zzglVar = zzglVar2;
                                                        if (iZzB10 == 1681012275) {
                                                            zzaft.zza(str5 == null, null);
                                                            str5 = "video/3gpp";
                                                        } else if (iZzB10 == 1702061171) {
                                                            zzaft.zza(str5 == null, null);
                                                            zzaku zzakuVarZzp = zzp(zzesVar3, iZzg5);
                                                            String strZza = zzakuVarZzp.zza();
                                                            byte[] bArrZzb = zzakuVarZzp.zzb();
                                                            if (bArrZzb != null) {
                                                                zzakuVar = zzakuVarZzp;
                                                                str5 = strZza;
                                                                listZzj = zzgvz.zzj(bArrZzb);
                                                            } else {
                                                                zzakuVar = zzakuVarZzp;
                                                                str5 = strZza;
                                                            }
                                                        } else if (iZzB10 == 1651798644) {
                                                            zzaksVarZzq = zzq(zzesVar3, iZzg5);
                                                        } else if (iZzB10 == 1885434736) {
                                                            zzesVar3.zzh(iZzg5 + 8);
                                                            fZzH = zzesVar3.zzH() / zzesVar3.zzH();
                                                            zzglVar2 = zzglVar;
                                                            i40 = i15;
                                                            i39 = i14;
                                                            i41 = i16;
                                                            z11 = true;
                                                        } else if (iZzB10 == 1937126244) {
                                                            int i79 = iZzg5 + 8;
                                                            while (true) {
                                                                if (i79 - iZzg5 >= i13) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                zzesVar3.zzh(i79);
                                                                int iZzB13 = zzesVar3.zzB() + i79;
                                                                if (zzesVar3.zzB() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(zzesVar3.zzi(), i79, iZzB13);
                                                                    break;
                                                                }
                                                                i79 = iZzB13;
                                                            }
                                                        } else if (iZzB10 == 1936995172) {
                                                            int iZzs5 = zzesVar3.zzs();
                                                            zzesVar3.zzk(3);
                                                            if (iZzs5 == 0) {
                                                                int iZzs6 = zzesVar3.zzs();
                                                                if (iZzs6 == 0) {
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    i39 = i14;
                                                                    i41 = i16;
                                                                    i42 = 0;
                                                                } else if (iZzs6 == 1) {
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    i39 = i14;
                                                                    i41 = i16;
                                                                    i42 = 1;
                                                                } else if (iZzs6 == 2) {
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    i39 = i14;
                                                                    i41 = i16;
                                                                    i42 = 2;
                                                                } else if (iZzs6 == 3) {
                                                                    i42 = 3;
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    i39 = i14;
                                                                    i41 = i16;
                                                                }
                                                            }
                                                        } else if (iZzB10 == 1634760259) {
                                                            int i80 = i13 - 12;
                                                            byte[] bArr2 = new byte[i80];
                                                            zzesVar3.zzh(iZzg5 + 12);
                                                            zzesVar3.zzm(bArr2, 0, i80);
                                                            String strZzd = zzdp.zzd(bArr2);
                                                            zzgvz zzgvzVarZzj3 = zzgvz.zzj(bArr2);
                                                            zzi zziVarZzl = zzl(new zzes(bArr2));
                                                            int i81 = zziVarZzl.zzf;
                                                            int i82 = zziVarZzl.zzg;
                                                            int i83 = zziVarZzl.zzb;
                                                            str13 = strZzd;
                                                            i39 = i81;
                                                            i41 = zziVarZzl.zzc;
                                                            str5 = "video/apv";
                                                            zzglVar2 = zzglVar;
                                                            iZzc = zziVarZzl.zzd;
                                                            listZzj = zzgvzVarZzj3;
                                                            i40 = i82;
                                                            i47 = i83;
                                                        } else if (iZzB10 == 1668246642 && i47 == -1) {
                                                            if (iZzc == -1) {
                                                                int iZzB14 = zzesVar3.zzB();
                                                                if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                                    int iZzt5 = zzesVar3.zzt();
                                                                    int iZzt6 = zzesVar3.zzt();
                                                                    zzesVar3.zzk(2);
                                                                    int i84 = 19;
                                                                    if (i13 == 19) {
                                                                        z6 = (zzesVar3.zzs() & 128) != 0;
                                                                        int iZzb2 = zzi.zzb(iZzt5);
                                                                        if (true != z6) {
                                                                            i17 = 2;
                                                                        } else {
                                                                            i17 = 1;
                                                                        }
                                                                        i13 = i84;
                                                                        i41 = i17;
                                                                        zzglVar2 = zzglVar;
                                                                        i40 = i15;
                                                                        iZzc = zzi.zzc(iZzt6);
                                                                        i47 = iZzb2;
                                                                        i39 = i14;
                                                                    } else {
                                                                        i84 = i13;
                                                                    }
                                                                    int iZzb3 = zzi.zzb(iZzt5);
                                                                    if (true != z6) {
                                                                        i17 = 2;
                                                                    } else {
                                                                        i17 = 1;
                                                                    }
                                                                    i13 = i84;
                                                                    i41 = i17;
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    iZzc = zzi.zzc(iZzt6);
                                                                    i47 = iZzb3;
                                                                    i39 = i14;
                                                                } else {
                                                                    zzef.zzc("BoxParsers", "Unsupported color type: ".concat(zzfy.zze(iZzB14)));
                                                                    i47 = -1;
                                                                    iZzc = -1;
                                                                    zzglVar2 = zzglVar;
                                                                    i40 = i15;
                                                                    i39 = i14;
                                                                    i41 = i16;
                                                                }
                                                            } else {
                                                                i47 = -1;
                                                            }
                                                        }
                                                        zzglVar2 = zzglVar;
                                                        i40 = i15;
                                                        i39 = i14;
                                                        i41 = i16;
                                                    }
                                                    zzglVar2 = zzglVar;
                                                    i40 = i15;
                                                    i39 = i14;
                                                    i41 = i16;
                                                }
                                                i37 += i13;
                                                i32 = i32;
                                                str12 = str5;
                                                i8 = i8;
                                                zzakzVar4 = zzakzVar2;
                                                str10 = str6;
                                            }
                                            i37 += i13;
                                            i32 = i32;
                                            str12 = str5;
                                            i8 = i8;
                                            zzakzVar4 = zzakzVar2;
                                            str10 = str6;
                                        }
                                        i37 += i13;
                                        i32 = i32;
                                        str12 = str5;
                                        i8 = i8;
                                        zzakzVar4 = zzakzVar2;
                                        str10 = str6;
                                    }
                                    i37 += i13;
                                    i32 = i32;
                                    str12 = str5;
                                    i8 = i8;
                                    zzakzVar4 = zzakzVar2;
                                    str10 = str6;
                                }
                                int i85 = i39;
                                String str18 = str12;
                                i10 = i32;
                                zzakz zzakzVar6 = zzakzVar4;
                                int i86 = i40;
                                int i87 = i41;
                                c = 2;
                                if (zzftVarZza != null) {
                                    str3 = zzftVarZza.zza;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str3 = str13;
                                    str4 = str18;
                                }
                                if (str4 == null) {
                                    strZzc = str11;
                                    i12 = i38;
                                    i11 = i34;
                                    zzakzVar = zzakzVar6;
                                } else {
                                    zzt zztVar = new zzt();
                                    i11 = i34;
                                    zztVar.zzb(i11);
                                    zztVar.zzo(str4);
                                    zztVar.zzk(str3);
                                    zztVar.zzv(iZzt3);
                                    zztVar.zzw(iZzt4);
                                    zztVar.zzx(i46);
                                    zztVar.zzy(i45);
                                    zztVar.zzB(fZzH);
                                    i12 = i38;
                                    zztVar.zzA(i12);
                                    zztVar.zzC(bArrCopyOfRange);
                                    zztVar.zzD(i42);
                                    zztVar.zzr(listZzj);
                                    zztVar.zzq(i44);
                                    zztVar.zzF(i43);
                                    zztVar.zzs(zzqVar3);
                                    strZzc = str11;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar = new zzh();
                                    zzhVar.zza(i47);
                                    zzhVar.zzb(i87);
                                    zzhVar.zzc(iZzc);
                                    zzhVar.zzd(byteBufferZzm != null ? byteBufferZzm.array() : null);
                                    zzhVar.zze(i85);
                                    zzhVar.zzf(i86);
                                    zztVar.zzE(zzhVar.zzg());
                                    if (zzaksVarZzq != null) {
                                        zztVar.zzi(zzgzt.zzb(zzaksVarZzq.zza()));
                                        zztVar.zzj(zzgzt.zzb(zzaksVarZzq.zzb()));
                                    } else if (zzakuVar != null) {
                                        zztVar.zzi(zzgzt.zzb(zzakuVar.zzc()));
                                        zztVar.zzj(zzgzt.zzb(zzakuVar.zzd()));
                                    }
                                    zzakzVar = zzakzVar6;
                                    zzakzVar.zzb = zztVar.zzO();
                                }
                            } else if (iZzB8 == 1836069985 || iZzB8 == 1701733217 || iZzB8 == 1633889587 || iZzB8 == 1700998451 || iZzB8 == 1633889588 || iZzB8 == 1835823201 || iZzB8 == 1685353315 || iZzB8 == 1685353317 || iZzB8 == 1685353320 || iZzB8 == 1685353324 || iZzB8 == 1685353336 || iZzB8 == 1935764850 || iZzB8 == 1935767394 || iZzB8 == 1819304813 || iZzB8 == 1936684916 || iZzB8 == 1953984371 || iZzB8 == 778924082 || iZzB8 == 778924083 || iZzB8 == 1835557169 || iZzB8 == 1835560241 || iZzB8 == 1634492771 || iZzB8 == 1634492791 || iZzB8 == 1970037111 || iZzB8 == 1332770163 || iZzB8 == 1716281667 || iZzB8 == 1767992678 || iZzB8 == 1768973165 || iZzB8 == 1718641517) {
                                int i88 = iZzB;
                                sZzv2 = sZzv2;
                                i6 = iZzB6;
                                zzakz zzakzVar7 = zzakzVar3;
                                s = sZzv;
                                i7 = i31;
                                j3 = j8;
                                String str19 = strZzc;
                                zzo(zzesVar3, iZzB8, iZzg3, iZzB7, i88, str19, z2, zzqVar, zzakzVar7, i30);
                                zzesVar3 = zzesVar3;
                                i11 = i88;
                                strZzc = str19;
                                zzakzVar = zzakzVar7;
                                str = str;
                                i9 = iZzg3;
                                i10 = iZzB7;
                                i30 = i30;
                                arrayList = arrayList3;
                                i12 = i4;
                                j4 = jZzz2;
                                c = 2;
                            } else {
                                if (iZzB8 == 1414810956 || iZzB8 == 1954034535 || iZzB8 == 2004251764 || iZzB8 == 1937010800 || iZzB8 == 1664495672 || iZzB8 == 1836070003) {
                                    zzesVar3.zzh(iZzg3 + 16);
                                    if (iZzB8 == 1414810956) {
                                        str9 = "application/ttml+xml";
                                    } else {
                                        if (iZzB8 == 1954034535) {
                                            int i89 = iZzB7 - 16;
                                            byte[] bArr3 = new byte[i89];
                                            zzesVar3.zzm(bArr3, 0, i89);
                                            zzgvzVarZzj = zzgvz.zzj(bArr3);
                                            str8 = "application/x-quicktime-tx3g";
                                        } else if (iZzB8 == 2004251764) {
                                            str9 = "application/x-mp4-vtt";
                                        } else {
                                            if (iZzB8 == 1937010800) {
                                                str9 = "application/ttml+xml";
                                                j5 = 0;
                                            } else if (iZzB8 == 1664495672) {
                                                zzakzVar3.zzd = i20;
                                                str9 = "application/x-mp4-cea-608";
                                            } else {
                                                int iZzg8 = zzesVar3.zzg();
                                                zzesVar3.zzk(4);
                                                if (zzesVar3.zzB() == 1702061171) {
                                                    zzaku zzakuVarZzp2 = zzp(zzesVar3, iZzg8);
                                                    if (zzakuVarZzp2.zzb() != null && zzakuVarZzp2.zzb().length == 64) {
                                                        String strZzj = zzj(zzakuVarZzp2.zzb(), sZzv, sZzv2);
                                                        String str20 = zzfk.zza;
                                                        zzgvzVarZzj = zzgvz.zzj(strZzj.getBytes(StandardCharsets.UTF_8));
                                                        str7 = "application/vobsub";
                                                    }
                                                    i6 = iZzB6;
                                                    zzakzVar = zzakzVar3;
                                                    i12 = i4;
                                                    s = sZzv;
                                                    j4 = jZzz2;
                                                    c = c6;
                                                    i10 = iZzB7;
                                                    i9 = iZzg3;
                                                    i7 = i31;
                                                    j3 = j8;
                                                    i11 = iZzB;
                                                    arrayList = arrayList3;
                                                } else {
                                                    zzgvzVarZzj = null;
                                                    str7 = null;
                                                }
                                                str8 = str7;
                                            }
                                            zzgvzVar = null;
                                            if (str9 != null) {
                                                zzt zztVar2 = new zzt();
                                                zztVar2.zzb(iZzB);
                                                zztVar2.zzo(str9);
                                                zztVar2.zze(strZzc);
                                                zztVar2.zzt(j5);
                                                zztVar2.zzr(zzgvzVar);
                                                zzakzVar3.zzb = zztVar2.zzO();
                                            }
                                            i6 = iZzB6;
                                            zzakzVar = zzakzVar3;
                                            i12 = i4;
                                            s = sZzv;
                                            j4 = jZzz2;
                                            c = c6;
                                            i10 = iZzB7;
                                            i9 = iZzg3;
                                            i7 = i31;
                                            j3 = j8;
                                            i11 = iZzB;
                                            arrayList = arrayList3;
                                        }
                                        zzgvzVar = zzgvzVarZzj;
                                        str9 = str8;
                                        sZzv2 = sZzv2;
                                        j5 = Long.MAX_VALUE;
                                        if (str9 != null) {
                                            zzt zztVar3 = new zzt();
                                            zztVar3.zzb(iZzB);
                                            zztVar3.zzo(str9);
                                            zztVar3.zze(strZzc);
                                            zztVar3.zzt(j5);
                                            zztVar3.zzr(zzgvzVar);
                                            zzakzVar3.zzb = zztVar3.zzO();
                                        }
                                        i6 = iZzB6;
                                        zzakzVar = zzakzVar3;
                                        i12 = i4;
                                        s = sZzv;
                                        j4 = jZzz2;
                                        c = c6;
                                        i10 = iZzB7;
                                        i9 = iZzg3;
                                        i7 = i31;
                                        j3 = j8;
                                        i11 = iZzB;
                                        arrayList = arrayList3;
                                    }
                                    j5 = Long.MAX_VALUE;
                                    zzgvzVar = null;
                                    if (str9 != null) {
                                        zzt zztVar4 = new zzt();
                                        zztVar4.zzb(iZzB);
                                        zztVar4.zzo(str9);
                                        zztVar4.zze(strZzc);
                                        zztVar4.zzt(j5);
                                        zztVar4.zzr(zzgvzVar);
                                        zzakzVar3.zzb = zztVar4.zzO();
                                    }
                                    i6 = iZzB6;
                                    zzakzVar = zzakzVar3;
                                    i12 = i4;
                                    s = sZzv;
                                    j4 = jZzz2;
                                    c = c6;
                                    i10 = iZzB7;
                                    i9 = iZzg3;
                                    i7 = i31;
                                    j3 = j8;
                                    i11 = iZzB;
                                    arrayList = arrayList3;
                                } else if (iZzB8 == 1835365492) {
                                    zzesVar3.zzh(iZzg3 + 16);
                                    char c8 = c2;
                                    zzesVar3.zzM(c8);
                                    String strZzM = zzesVar3.zzM(c8);
                                    if (strZzM != null) {
                                        zzt zztVar5 = new zzt();
                                        zztVar5.zzb(iZzB);
                                        zztVar5.zzo(strZzM);
                                        zzakzVar3.zzb = zztVar5.zzO();
                                    }
                                } else if (iZzB8 == 1667329389) {
                                    zzt zztVar6 = new zzt();
                                    zztVar6.zzb(iZzB);
                                    zztVar6.zzo("application/x-camera-motion");
                                    zzakzVar3.zzb = zztVar6.zzO();
                                }
                                sZzv2 = sZzv2;
                                i6 = iZzB6;
                                zzakzVar = zzakzVar3;
                                i12 = i4;
                                s = sZzv;
                                j4 = jZzz2;
                                c = c6;
                                i10 = iZzB7;
                                i9 = iZzg3;
                                i7 = i31;
                                j3 = j8;
                                i11 = iZzB;
                                arrayList = arrayList3;
                            }
                            zzesVar3.zzh(i9 + i10);
                            i4 = i12;
                            zzesVar3 = zzesVar3;
                            i29 = i30 + 1;
                            strZzc = strZzc;
                            zzakzVar3 = zzakzVar;
                            c6 = c;
                            iZzB = i11;
                            sZzv2 = sZzv2;
                            iZzB6 = i6;
                            str = str;
                            arrayList3 = arrayList;
                            sZzv = s;
                            jZzz2 = j4;
                            iZzt = i7;
                            jZzv2 = j3;
                            i20 = 1;
                            c2 = 0;
                        }
                        String str21 = str;
                        int i90 = iZzB;
                        int i91 = iZzt;
                        long j9 = jZzv2;
                        zzakz zzakzVar8 = zzakzVar3;
                        arrayList3 = arrayList3;
                        long j10 = jZzz2;
                        if (z) {
                            zzfwVar2 = zzfwVar3;
                        } else {
                            zzfwVar2 = zzfwVar3;
                            zzfw zzfwVarZzd4 = zzfwVar2.zzd(1701082227);
                            if (zzfwVarZzd4 != null && (pairZzn = zzn(zzfwVarZzd4)) != null) {
                                long[] jArr3 = (long[]) pairZzn.first;
                                jArr2 = (long[]) pairZzn.second;
                                jArr = jArr3;
                            }
                            zzvVarZzO = zzakzVar8.zzb;
                            if (zzvVarZzO == null) {
                                zzgsnVar = zzgsnVar;
                                zzambVar = null;
                            } else {
                                if (i91 != 0) {
                                    zzfvVar = new zzfv(i91);
                                    zzt zztVarZza = zzvVarZzO.zza();
                                    zzapVar = zzvVarZzO.zzl;
                                    if (zzapVar != null) {
                                        zzapVar2 = zzapVar.zzg(zzfvVar);
                                    } else {
                                        zzapVar2 = new zzap(-9223372036854775807L, zzfvVar);
                                    }
                                    zztVarZza.zzl(zzapVar2);
                                    zzvVarZzO = zztVarZza.zzO();
                                }
                                zzamb zzambVar3 = new zzamb(i90, i28, zzakw.zza(j10, j9, str21), j2, jZzv, zzakw.zzb(j10, j9, str21), zzvVarZzO, zzakzVar8.zzd, zzakzVar8.zza, zzakzVar8.zzc, jArr, jArr2);
                                zzgsnVar = zzgsnVar;
                                zzambVar = zzambVar3;
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        zzvVarZzO = zzakzVar8.zzb;
                        if (zzvVarZzO == null) {
                            zzgsnVar = zzgsnVar;
                            zzambVar = null;
                        } else {
                            if (i91 != 0) {
                                zzfvVar = new zzfv(i91);
                                zzt zztVarZza2 = zzvVarZzO.zza();
                                zzapVar = zzvVarZzO.zzl;
                                if (zzapVar != null) {
                                    zzapVar2 = zzapVar.zzg(zzfvVar);
                                } else {
                                    zzapVar2 = new zzap(-9223372036854775807L, zzfvVar);
                                }
                                zztVarZza2.zzl(zzapVar2);
                                zzvVarZzO = zztVarZza2.zzO();
                            }
                            zzamb zzambVar4 = new zzamb(i90, i28, zzakw.zza(j10, j9, str21), j2, jZzv, zzakw.zzb(j10, j9, str21), zzvVarZzO, zzakzVar8.zzd, zzakzVar8.zza, zzakzVar8.zzc, jArr, jArr2);
                            zzgsnVar = zzgsnVar;
                            zzambVar = zzambVar4;
                        }
                    }
                    zzambVar2 = (zzamb) zzgsnVar.apply(zzambVar);
                    if (zzambVar2 != null) {
                        zzfw zzfwVarZzd5 = zzfwVar2.zzd(1835297121);
                        zzfwVarZzd5.getClass();
                        zzfw zzfwVarZzd6 = zzfwVarZzd5.zzd(1835626086);
                        zzfwVarZzd6.getClass();
                        zzfw zzfwVarZzd7 = zzfwVarZzd6.zzd(1937007212);
                        zzfwVarZzd7.getClass();
                        zzame zzameVarZzg = zzg(zzambVar2, zzfwVarZzd7, zzagiVar, false);
                        arrayList2 = arrayList3;
                        arrayList2.add(zzameVarZzg);
                    } else {
                        arrayList2 = arrayList3;
                    }
                    i19 = i2 + 1;
                    arrayList3 = arrayList2;
                }
                zzambVar = null;
                zzambVar2 = (zzamb) zzgsnVar.apply(zzambVar);
                if (zzambVar2 != null) {
                    zzfw zzfwVarZzd8 = zzfwVar2.zzd(1835297121);
                    zzfwVarZzd8.getClass();
                    zzfw zzfwVarZzd9 = zzfwVarZzd8.zzd(1835626086);
                    zzfwVarZzd9.getClass();
                    zzfw zzfwVarZzd10 = zzfwVarZzd9.zzd(1937007212);
                    zzfwVarZzd10.getClass();
                    zzame zzameVarZzg2 = zzg(zzambVar2, zzfwVarZzd10, zzagiVar, false);
                    arrayList2 = arrayList3;
                    arrayList2.add(zzameVarZzg2);
                } else {
                    arrayList2 = arrayList3;
                }
                i19 = i2 + 1;
                arrayList3 = arrayList2;
            }
            i19 = i2 + 1;
            arrayList3 = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static zzap zzc(zzfx zzfxVar) {
        int iZzF;
        zzes zzesVar = zzfxVar.zza;
        zzesVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzesVar.zzd() >= 8) {
            int iZzg = zzesVar.zzg();
            int iZzB = zzesVar.zzB() + iZzg;
            int iZzB2 = zzesVar.zzB();
            zzap zzapVar2 = null;
            if (iZzB2 == 1835365473) {
                zzesVar.zzh(iZzg);
                zzesVar.zzk(8);
                zzf(zzesVar);
                while (zzesVar.zzg() < iZzB) {
                    int iZzg2 = zzesVar.zzg();
                    int iZzB3 = zzesVar.zzB() + iZzg2;
                    if (zzesVar.zzB() == 1768715124) {
                        zzesVar.zzh(iZzg2);
                        zzesVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzesVar.zzg() < iZzB3) {
                            zzao zzaoVarZzc = zzalm.zzc(zzesVar);
                            if (zzaoVarZzc != null) {
                                arrayList.add(zzaoVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            break;
                        }
                        break;
                    }
                    zzesVar.zzh(iZzB3);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == 1936553057) {
                zzesVar.zzh(iZzg);
                zzesVar.zzk(12);
                while (zzesVar.zzg() < iZzB) {
                    int iZzg3 = zzesVar.zzg();
                    int iZzB4 = zzesVar.zzB();
                    if (zzesVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzesVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iZzs = zzesVar.zzs();
                            int iZzs2 = zzesVar.zzs();
                            if (iZzs == 0) {
                                i = iZzs2;
                            } else if (iZzs == 1) {
                                i2 = iZzs2;
                            }
                        }
                        if (i == 12) {
                            iZzF = 240;
                        } else if (i == 13) {
                            iZzF = 120;
                        } else if (i == 21 && zzesVar.zzd() >= 8 && zzesVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzesVar.zzB();
                            int iZzB6 = zzesVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzesVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzapVar2 = new zzap(-9223372036854775807L, new zzajr(iZzF, i2));
                        break;
                    }
                    zzesVar.zzh(iZzg3 + iZzB4);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzesVar));
            }
            zzesVar.zzh(iZzB);
        }
        return zzapVar;
    }

    public static zzga zzd(zzes zzesVar) {
        long jZzD;
        long jZzD2;
        zzesVar.zzh(8);
        if (zza(zzesVar.zzB()) == 0) {
            jZzD = zzesVar.zzz();
            jZzD2 = zzesVar.zzz();
        } else {
            jZzD = zzesVar.zzD();
            jZzD2 = zzesVar.zzD();
        }
        return new zzga(jZzD, jZzD2, zzesVar.zzz());
    }

    public static zzap zze(zzfw zzfwVar) {
        zzfu zzfuVar;
        zzfx zzfxVarZzc = zzfwVar.zzc(1751411826);
        zzfx zzfxVarZzc2 = zzfwVar.zzc(1801812339);
        zzfx zzfxVarZzc3 = zzfwVar.zzc(1768715124);
        if (zzfxVarZzc != null && zzfxVarZzc2 != null && zzfxVarZzc3 != null && zzi(zzfxVarZzc.zza) == 1835299937) {
            zzes zzesVar = zzfxVarZzc2.zza;
            zzesVar.zzh(12);
            int iZzB = zzesVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i = 0; i < iZzB; i++) {
                int iZzB2 = zzesVar.zzB();
                zzesVar.zzk(4);
                strArr[i] = zzesVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzes zzesVar2 = zzfxVarZzc3.zza;
            zzesVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzesVar2.zzd() > 8) {
                int iZzg = zzesVar2.zzg() + zzesVar2.zzB();
                int iZzB3 = zzesVar2.zzB() - 1;
                if (iZzB3 < 0 || iZzB3 >= iZzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(iZzB3);
                    zzef.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzesVar2.zzg();
                        if (iZzg2 >= iZzg) {
                            zzfuVar = null;
                            break;
                        }
                        int iZzB4 = zzesVar2.zzB();
                        if (zzesVar2.zzB() == 1684108385) {
                            int iZzB5 = zzesVar2.zzB();
                            int iZzB6 = zzesVar2.zzB();
                            int i2 = iZzB4 - 16;
                            byte[] bArr = new byte[i2];
                            zzesVar2.zzm(bArr, 0, i2);
                            zzfuVar = new zzfu(str, bArr, iZzB6, iZzB5);
                            break;
                        }
                        zzesVar2.zzh(iZzg2 + iZzB4);
                    }
                    if (zzfuVar != null) {
                        arrayList.add(zzfuVar);
                    }
                }
                zzesVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzes zzesVar) {
        int iZzg = zzesVar.zzg();
        zzesVar.zzk(4);
        if (zzesVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzesVar.zzh(iZzg);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x029a  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e3 A[DONT_INVERT, LOOP:14: B:115:0x02e3->B:119:0x02ee, LOOP_START, PHI: r33
  0x02e3: PHI (r33v2 int) = (r33v1 int), (r33v3 int) binds: [B:114:0x02e1, B:119:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ee A[LOOP:14: B:115:0x02e3->B:119:0x02ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02f4 A[EDGE_INSN: B:120:0x02f4->B:121:0x02f6 BREAK  A[LOOP:14: B:115:0x02e3->B:119:0x02ee]] */
    /* JADX WARN: Code duplicated, block: B:122:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0300 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0302  */
    /* JADX WARN: Code duplicated, block: B:128:0x030f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0317  */
    /* JADX WARN: Code duplicated, block: B:130:0x0322  */
    /* JADX WARN: Code duplicated, block: B:131:0x032c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0335  */
    /* JADX WARN: Code duplicated, block: B:136:0x0345  */
    /* JADX WARN: Code duplicated, block: B:139:0x039e  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x0401  */
    /* JADX WARN: Code duplicated, block: B:152:0x043e  */
    /* JADX WARN: Code duplicated, block: B:154:0x044d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0453  */
    /* JADX WARN: Code duplicated, block: B:181:0x0509  */
    /* JADX WARN: Code duplicated, block: B:183:0x050d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0564  */
    /* JADX WARN: Code duplicated, block: B:196:0x0566  */
    /* JADX WARN: Code duplicated, block: B:200:0x057e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0588  */
    /* JADX WARN: Code duplicated, block: B:205:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:207:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:208:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:220:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:222:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:228:0x0601  */
    /* JADX WARN: Code duplicated, block: B:231:0x060a  */
    /* JADX WARN: Code duplicated, block: B:232:0x060c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0613  */
    /* JADX WARN: Code duplicated, block: B:238:0x062f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0631  */
    /* JADX WARN: Code duplicated, block: B:242:0x0637  */
    /* JADX WARN: Code duplicated, block: B:243:0x063a  */
    /* JADX WARN: Code duplicated, block: B:245:0x063d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0640  */
    /* JADX WARN: Code duplicated, block: B:249:0x0644  */
    /* JADX WARN: Code duplicated, block: B:251:0x0648  */
    /* JADX WARN: Code duplicated, block: B:252:0x064b  */
    /* JADX WARN: Code duplicated, block: B:254:0x064e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0662  */
    /* JADX WARN: Code duplicated, block: B:260:0x066e  */
    /* JADX WARN: Code duplicated, block: B:262:0x067b  */
    /* JADX WARN: Code duplicated, block: B:264:0x069e  */
    /* JADX WARN: Code duplicated, block: B:265:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:280:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:293:0x05c9 A[EDGE_INSN: B:293:0x05c9->B:212:0x05c9 BREAK  A[LOOP:6: B:203:0x05b2->B:211:0x05c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151 A[LOOP:0: B:60:0x014b->B:62:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0165 A[LOOP:1: B:64:0x0163->B:65:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:70:0x019d A[LOOP:3: B:69:0x019b->B:70:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0219  */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0225 A[LOOP:12: B:78:0x021d->B:81:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0259 A[ADDED_TO_REGION, LOOP:13: B:89:0x0259->B:91:0x025d, LOOP_START, PHI: r9 r33 r34
  0x0259: PHI (r9v9 int) = (r9v3 int), (r9v10 int) binds: [B:87:0x0256, B:91:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0259: PHI (r33v5 int) = (r33v1 int), (r33v6 int) binds: [B:87:0x0256, B:91:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0259: PHI (r34v4 int) = (r34v1 int), (r34v8 int) binds: [B:87:0x0256, B:91:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x025d A[LOOP:13: B:89:0x0259->B:91:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0279  */
    /* JADX WARN: Code duplicated, block: B:99:0x0289  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r23v32 */
    /* JADX WARN: Type inference failed for: r23v33 */
    /* JADX WARN: Type inference failed for: r23v34 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r29v2, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r42v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    public static zzame zzg(zzamb zzambVar, zzfw zzfwVar, zzagi zzagiVar, boolean z) throws zzat {
        zzakx zzalbVar;
        boolean z2;
        int iZzH;
        int iZzH2;
        int i;
        int iZzH3;
        int i2;
        int i3;
        ArrayList arrayList;
        ?? r31;
        long[] jArr;
        int[] iArr;
        zzes zzesVar;
        long[] jArrCopyOf;
        int i4;
        zzakx zzakxVar;
        int iZzH4;
        int i5;
        int i6;
        long j;
        long j2;
        long j3;
        int i7;
        int i8;
        int i9;
        int iZzH5;
        int iZzB;
        int iZzB2;
        ?? r4;
        long[] jArr2;
        ?? CopyOf;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long[] jArr3;
        int i16;
        int[] iArr2;
        long j4;
        long j5;
        int i17;
        String str;
        long j6;
        ?? r23;
        int i18;
        ?? r24;
        int i19;
        int iZzc;
        ?? r38;
        int i20;
        boolean zZza;
        ?? r15;
        long[] jArr4;
        long j7;
        long j8;
        long jZzv;
        int[] iArrZzf;
        long[] jArr5;
        ?? r29;
        int length;
        long j9;
        int i21;
        long j10;
        int[] iArr3;
        int i22;
        boolean z3;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        long[] jArr7;
        int i23;
        int i24;
        int i25;
        boolean z4;
        int[] iArr6;
        boolean z5;
        boolean z6;
        long[] jArr8;
        int[] iArr7;
        ?? r5;
        long[] jArr9;
        int i26;
        boolean z7;
        int i27;
        int i28;
        long j11;
        ?? r6;
        long j12;
        int i29;
        int i30;
        long[] jArr10;
        long jZzv2;
        boolean z8;
        int[] iArr8;
        int[] iArr9;
        long j13;
        int i31;
        long jZzv3;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z9;
        boolean z10;
        int length2;
        long jZzv4;
        int i37;
        long[] jArr11;
        int[] iArr10;
        long j14;
        int i38;
        int i39;
        int i40;
        int[] iArr11;
        int[] iArr12;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        long j15;
        int iMax;
        int i46;
        int i47;
        zzamb zzambVarZzb = zzambVar;
        zzfx zzfxVarZzc = zzfwVar.zzc(1937011578);
        if (zzfxVarZzc != null) {
            zzalbVar = new zzala(zzfxVarZzc, zzambVarZzb.zzg);
        } else {
            zzfx zzfxVarZzc2 = zzfwVar.zzc(1937013298);
            if (zzfxVarZzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzalbVar = new zzalb(zzfxVarZzc2);
        }
        int iZza = zzalbVar.zza();
        if (iZza == 0) {
            return new zzame(zzambVarZzb, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzambVarZzb.zzb == 2) {
            long j16 = zzambVarZzb.zzf;
            if (j16 > 0) {
                zzt zztVarZza = zzambVarZzb.zzg.zza();
                zztVarZza.zzz(iZza / (j16 / 1000000.0f));
                zzambVarZzb = zzambVarZzb.zzb(zztVarZza.zzO());
            }
        }
        zzfx zzfxVarZzc3 = zzfwVar.zzc(1937007471);
        if (zzfxVarZzc3 == null) {
            zzfxVarZzc3 = zzfwVar.zzc(1668232756);
            zzfxVarZzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzfx zzfxVarZzc4 = zzfwVar.zzc(1937011555);
        zzfxVarZzc4.getClass();
        zzes zzesVar2 = zzfxVarZzc4.zza;
        zzfx zzfxVarZzc5 = zzfwVar.zzc(1937011827);
        zzfxVarZzc5.getClass();
        zzes zzesVar3 = zzfxVarZzc5.zza;
        zzfx zzfxVarZzc6 = zzfwVar.zzc(1937011571);
        zzes zzesVar4 = zzfxVarZzc6 != null ? zzfxVarZzc6.zza : null;
        zzfx zzfxVarZzc7 = zzfwVar.zzc(1668576371);
        zzes zzesVar5 = zzfxVarZzc7 != null ? zzfxVarZzc7.zza : null;
        zzakt zzaktVar = new zzakt(zzesVar2, zzfxVarZzc3.zza, z2);
        zzesVar3.zzh(12);
        int iZzH6 = zzesVar3.zzH() - 1;
        int iZzH7 = zzesVar3.zzH();
        int iZzH8 = zzesVar3.zzH();
        if (zzesVar5 != null) {
            zzesVar5.zzh(12);
            iZzH = zzesVar5.zzH();
        } else {
            iZzH = 0;
        }
        if (zzesVar4 != null) {
            zzesVar4.zzh(12);
            iZzH2 = zzesVar4.zzH();
            if (iZzH2 > 0) {
                iZzH3 = zzesVar4.zzH() - 1;
                i = 0;
            } else {
                i = 0;
                iZzH3 = -1;
                zzesVar4 = null;
            }
        } else {
            iZzH2 = 0;
            i = 0;
            iZzH3 = -1;
        }
        int iZzb = zzalbVar.zzb();
        zzv zzvVar = zzambVarZzb.zzg;
        if (iZzb != -1) {
            String str2 = zzvVar.zzp;
            i2 = 1;
            if (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iZzH6 == 0) {
                if (iZzH == 0 && iZzH2 == 0) {
                    iZzH6 = i;
                    i3 = 1;
                } else {
                    i3 = i;
                    iZzH6 = i3;
                }
            }
            arrayList = new ArrayList();
            if (zzesVar4 == null) {
                r31 = i2;
            } else {
                r31 = i;
            }
            if (i3 != 0) {
                i37 = zzaktVar.zza;
                jArr11 = new long[i37];
                iArr10 = new int[i37];
                while (zzaktVar.zza()) {
                    int i48 = zzaktVar.zzb;
                    jArr11[i48] = zzaktVar.zzd;
                    iArr10[i48] = zzaktVar.zzc;
                }
                j14 = iZzH8;
                i38 = 8192 / iZzb;
                i39 = i;
                i40 = i39;
                while (i39 < i37) {
                    int i49 = iArr10[i39];
                    String str3 = zzfk.zza;
                    i40 += ((i49 + i38) - 1) / i38;
                    i39++;
                }
                jArr2 = new long[i40];
                iArr11 = new int[i40];
                jArr3 = new long[i40];
                iArr12 = new int[i40];
                i41 = i;
                i42 = i41;
                i43 = i42;
                i44 = i43;
                i45 = i44;
                while (i41 < i37) {
                    int i50 = iArr10[i41];
                    j15 = jArr11[i41];
                    int i51 = i45;
                    int i52 = i37;
                    iMax = i44;
                    i46 = i51;
                    int i53 = i41;
                    i47 = i50;
                    while (i47 > 0) {
                        int iMin = Math.min(i38, i47);
                        jArr2[i46] = j15;
                        int i54 = i47;
                        int i55 = iZzb * iMin;
                        iArr11[i46] = i55;
                        int i56 = i43 + i55;
                        iMax = Math.max(iMax, i55);
                        long j17 = j14;
                        jArr3[i46] = j17 * ((long) i42);
                        iArr12[i46] = i2;
                        j15 += (long) iArr11[i46];
                        i42 += iMin;
                        i47 = i54 - iMin;
                        i46++;
                        i43 = i56;
                        j14 = j17;
                    }
                    long j18 = j14;
                    i41 = i53 + 1;
                    int i57 = i46;
                    i44 = iMax;
                    i37 = i52;
                    i45 = i57;
                    j14 = j18;
                }
                j5 = i43;
                j4 = j14 * ((long) i42);
                i16 = i40;
                iArr2 = iArr11;
                i17 = i44;
                r15 = iArr12;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                zzesVar = zzesVar5;
                jArrCopyOf = new long[iZza];
                i4 = iZzH2;
                int i58 = iZzH3;
                zzakxVar = zzalbVar;
                iZzH4 = i58;
                i5 = iZzH;
                i6 = iZzH6;
                j = 0;
                j2 = 0;
                j3 = 0;
                i7 = i;
                i8 = i7;
                i9 = i8;
                iZzH5 = i9;
                iZzB = iZzH8;
                iZzB2 = iZzH5;
                r4 = new int[iZza];
                while (true) {
                    if (i7 < iZza) {
                        jArr2 = jArr;
                        CopyOf = r4;
                        break;
                    }
                    j6 = j;
                    r23 = i2;
                    while (true) {
                        if (i9 != 0) {
                            i18 = i9;
                            r24 = r23;
                            break;
                        }
                        zZza = zzaktVar.zza();
                        if (zZza) {
                            i18 = i;
                            r24 = zZza;
                            break;
                        }
                        j6 = zzaktVar.zzd;
                        i9 = zzaktVar.zzc;
                        iZza = iZza;
                        r23 = zZza;
                    }
                    i19 = iZza;
                    if (r24 == 0) {
                        zzef.zzc("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i7);
                        int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                        jArr2 = jArrCopyOf2;
                        iArr = iArrCopyOf;
                        CopyOf = Arrays.copyOf((int[]) r4, i7);
                        iZza = i7;
                        break;
                    }
                    if (zzesVar != null) {
                        while (iZzH5 == 0) {
                            if (i5 > 0) {
                                iZzH5 = i;
                                break;
                            }
                            i5--;
                            iZzH5 = zzesVar.zzH();
                            iZzB2 = zzesVar.zzB();
                        }
                        iZzH5--;
                    }
                    iZzc = zzakxVar.zzc();
                    r38 = r4;
                    long[] jArr12 = jArr;
                    long j19 = iZzc;
                    j3 += j19;
                    if (iZzc > i8) {
                        i8 = iZzc;
                    }
                    jArr12[i7] = j6;
                    iArr[i7] = iZzc;
                    int i59 = i18;
                    jArrCopyOf[i7] = j2 + ((long) iZzB2);
                    r38[i7] = r31;
                    if (i7 == iZzH4) {
                        r38[i7] = i2;
                        arrayList.add(Integer.valueOf(i7));
                    }
                    if (zzesVar4 != null && i7 == iZzH4) {
                        i20 = i4 - 1;
                        if (i20 > 0) {
                            i4 = i20;
                            iZzH4 = zzesVar4.zzH() - 1;
                        } else {
                            i4 = i20;
                        }
                    }
                    j2 += (long) iZzB;
                    iZzH7--;
                    if (iZzH7 != 0) {
                        if (i6 > 0) {
                            i6--;
                            iZzH7 = zzesVar3.zzH();
                            iZzB = zzesVar3.zzB();
                        } else {
                            iZzH7 = i;
                        }
                    }
                    long j20 = j6 + j19;
                    i9 = i59 - 1;
                    i7++;
                    jArr = jArr12;
                    r4 = r38;
                    iZza = i19;
                    j = j20;
                }
                long j21 = j2 + ((long) iZzB2);
                if (zzesVar != null) {
                    i10 = i2;
                    break;
                }
                while (true) {
                    if (i5 > 0) {
                        i10 = i2;
                        break;
                    }
                    if (zzesVar.zzH() != 0) {
                        i10 = i;
                        break;
                    }
                    zzesVar.zzB();
                    i5--;
                }
                if (i4 == 0) {
                    if (iZzH7 == 0) {
                        if (i9 == 0) {
                            i15 = i;
                            i11 = i15;
                        } else if (i6 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i10 = i10;
                            iZza = iZza;
                            i15 = i;
                            i11 = i15;
                            i12 = i11;
                            i13 = i6;
                            i14 = iZzH5;
                        } else if (iZzH5 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i10 = i10;
                            iZza = iZza;
                            i15 = i;
                            i11 = i15;
                            i12 = i11;
                            i13 = i12;
                            i14 = iZzH5;
                        } else if (i10 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            iZza = iZza;
                            i10 = i;
                            i15 = i10;
                            i11 = i15;
                            i12 = i11;
                            i13 = i12;
                            i14 = i13;
                        } else {
                            jArrCopyOf = jArrCopyOf;
                            iZza = iZza;
                        }
                        jArr3 = jArrCopyOf;
                        i16 = iZza;
                        iArr2 = iArr;
                        j4 = j21;
                        j5 = j3;
                        i17 = i8;
                        r15 = CopyOf;
                    } else {
                        i11 = iZzH7;
                        i15 = i;
                    }
                    i12 = i9;
                    i13 = i6;
                    i14 = iZzH5;
                } else {
                    jArrCopyOf = jArrCopyOf;
                    i10 = i10;
                    iZza = iZza;
                    i11 = iZzH7;
                    i12 = i9;
                    i13 = i6;
                    i14 = iZzH5;
                    i15 = i4;
                }
                int i60 = zzambVarZzb.zza;
                int length3 = String.valueOf(i60).length() + 66 + String.valueOf(i15).length() + 35 + String.valueOf(i11).length() + 26 + String.valueOf(i12).length() + 33 + String.valueOf(i13).length() + 36;
                int length4 = String.valueOf(i14).length();
                if (i2 != i10) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(length3 + length4 + str.length());
                sb.append("Inconsistent stbl box for track ");
                sb.append(i60);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i15);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i11);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i12);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i13);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i14);
                sb.append(str);
                zzef.zzc("BoxParsers", sb.toString());
                jArr3 = jArrCopyOf;
                i16 = iZza;
                iArr2 = iArr;
                j4 = j21;
                j5 = j3;
                i17 = i8;
                r15 = CopyOf;
            }
            jArr4 = jArr2;
            j7 = zzambVarZzb.zzf;
            if (j7 > 0) {
                jZzv4 = zzfk.zzv(j5 * 8, 1000000L, j7, RoundingMode.HALF_DOWN);
                if (jZzv4 > 0 && jZzv4 < 2147483647L) {
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzi((int) jZzv4);
                    zzambVarZzb = zzambVarZzb.zzb(zztVarZza2.zzO());
                }
            }
            j8 = zzambVarZzb.zzc;
            jZzv = zzfk.zzv(j4, 1000000L, j8, RoundingMode.DOWN);
            iArrZzf = zzgzt.zzf(arrayList);
            jArr5 = zzambVarZzb.zzi;
            if (jArr5 == null) {
                zzfk.zzw(jArr3, 1000000L, j8);
                return new zzame(zzambVarZzb, jArr4, iArr2, i17, jArr3, r15, iArrZzf, r31, jZzv, i16);
            }
            r29 = r15;
            length = jArr5.length;
            if (length == 1) {
                if (zzambVarZzb.zzb == 1 || (length2 = jArr3.length) < 2) {
                    j9 = j8;
                } else {
                    long[] jArr13 = zzambVarZzb.zzj;
                    jArr13.getClass();
                    long j22 = jArr13[i];
                    long j23 = jArr5[i];
                    long j24 = zzambVarZzb.zzd;
                    long jZzv5 = zzfk.zzv(j23, j8, j24, RoundingMode.DOWN) + j22;
                    int i61 = length2 - 1;
                    int i62 = i;
                    int iMax2 = Math.max(i62, Math.min(4, i61));
                    int iMax3 = Math.max(i62, Math.min(length2 - 4, i61));
                    if (jArr3[i62] > j22 || j22 >= jArr3[iMax2] || jArr3[iMax3] >= jZzv5 || jZzv5 > 2 + j4) {
                        j9 = j8;
                    } else {
                        long jMax = Math.max(0L, j4 - jZzv5);
                        long j25 = j22 - jArr3[0];
                        long j26 = zzambVarZzb.zzg.zzI;
                        long jZzv6 = zzfk.zzv(j25, j26, j8, RoundingMode.DOWN);
                        long jZzv7 = zzfk.zzv(jMax, j26, j8, RoundingMode.DOWN);
                        j9 = j8;
                        if (jZzv6 != 0) {
                            if (jZzv6 <= 2147483647L && jZzv7 <= 2147483647L) {
                                zzagiVar.zza = (int) jZzv6;
                                zzagiVar.zzb = (int) jZzv7;
                                zzfk.zzw(jArr3, 1000000L, j9);
                                return new zzame(zzambVarZzb, jArr4, iArr2, i17, jArr3, r29, iArrZzf, r31, zzfk.zzv(jArr5[0], 1000000L, j24, RoundingMode.DOWN), i16);
                            }
                        } else if (jZzv7 != 0) {
                            jZzv6 = 0;
                            if (jZzv6 <= 2147483647L) {
                                zzagiVar.zza = (int) jZzv6;
                                zzagiVar.zzb = (int) jZzv7;
                                zzfk.zzw(jArr3, 1000000L, j9);
                                return new zzame(zzambVarZzb, jArr4, iArr2, i17, jArr3, r29, iArrZzf, r31, zzfk.zzv(jArr5[0], 1000000L, j24, RoundingMode.DOWN), i16);
                            }
                        }
                    }
                }
                i21 = 1;
                length = 1;
            } else {
                j9 = j8;
                i21 = 1;
            }
            if (length != i21 && jArr5[0] == 0) {
                long[] jArr14 = zzambVarZzb.zzj;
                jArr14.getClass();
                long j27 = jArr14[0];
                int i63 = 0;
                while (i63 < jArr3.length) {
                    long j28 = j9;
                    jArr3[i63] = zzfk.zzv(jArr3[i63] - j27, 1000000L, j28, RoundingMode.DOWN);
                    i63++;
                    j9 = j28;
                }
                return new zzame(zzambVarZzb, jArr4, iArr2, i17, jArr3, r29, iArrZzf, r31, zzfk.zzv(j4 - j27, 1000000L, j9, RoundingMode.DOWN), i16);
            }
            j10 = j9;
            iArr3 = iArr2;
            i22 = i16;
            if (zzambVarZzb.zzb == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            jArr6 = zzambVarZzb.zzj;
            iArr4 = new int[length];
            iArr5 = new int[length];
            jArr6.getClass();
            jArr7 = jArr6;
            i23 = 0;
            i24 = 0;
            i25 = 0;
            z4 = false;
            while (i24 < jArr5.length) {
                iArr9 = iArr4;
                j13 = jArr7[i24];
                if (j13 != -1) {
                    i31 = i24;
                    long j29 = j10;
                    j10 = j29;
                    jZzv3 = zzfk.zzv(jArr5[i24], j29, zzambVarZzb.zzd, RoundingMode.DOWN) + j13;
                    boolean z11 = z4;
                    iArr9[i31] = zzfk.zzo(jArr3, j13, true, true);
                    int iZzq = zzfk.zzq(jArr3, jZzv3, z3, false);
                    i33 = iZzq - 1;
                    i34 = 0;
                    for (i32 = iZzq; i32 < jArr3.length; i32++) {
                        if (jArr3[i32] < jZzv3) {
                            i34++;
                            if (i34 > zzambVarZzb.zzg.zzr) {
                                break;
                            }
                        } else {
                            i33 = i32;
                        }
                    }
                    iArr5[i31] = i33 + 1;
                    i35 = iArr9[i31];
                    while (true) {
                        i36 = iArr9[i31];
                        if (i36 > 0 || (r29[i36] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr9[i31] = i36 - 1;
                    }
                    if (i36 == 0) {
                        z9 = false;
                        if ((r29[0] & 1) == 0) {
                            iArr9[i31] = i35;
                            while (true) {
                                i36 = iArr9[i31];
                                if (i36 >= iArr5[i31] || (r29[i36] & 1) != 0) {
                                    break;
                                }
                                iArr9[i31] = i36 + 1;
                            }
                        }
                    } else {
                        z9 = false;
                    }
                    int i64 = iArr5[i31];
                    i25 += i64 - i36;
                    if (i23 != i36) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    z4 = z11 | z10;
                    i23 = i64;
                } else {
                    i31 = i24;
                }
                i24 = i31 + 1;
                jArr7 = jArr7;
                iArr4 = iArr9;
                z3 = z3;
            }
            iArr6 = iArr4;
            boolean z12 = z4;
            if (i25 != i22) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z12 | z5;
            if (z6) {
                jArr8 = new long[i25];
            } else {
                jArr8 = jArr4;
            }
            if (z6) {
                iArr7 = new int[i25];
            } else {
                iArr7 = iArr3;
            }
            if (true == z6) {
                i17 = 0;
            }
            if (z6) {
                iArr8 = new int[i25];
            } else {
                r5 = r29;
            }
            if (z6) {
                r5 = iArr8;
                arrayList = new ArrayList();
            }
            r5 = iArr8;
            jArr9 = new long[i25];
            i26 = 0;
            z7 = false;
            i27 = 0;
            i28 = i17;
            j11 = 0;
            r6 = r5;
            while (i26 < jArr5.length) {
                j12 = jArr6[i26];
                i29 = iArr6[i26];
                long[] jArr15 = jArr5;
                i30 = iArr5[i26];
                jArr10 = jArr9;
                if (z6) {
                    int i65 = i30 - i29;
                    System.arraycopy(jArr4, i29, jArr8, i27, i65);
                    System.arraycopy(iArr3, i29, iArr7, i27, i65);
                    System.arraycopy(r29, i29, r6, i27, i65);
                }
                while (i29 < i30) {
                    int[] iArr13 = iArr7;
                    ?? r42 = r6;
                    long jZzv8 = zzfk.zzv(j11, 1000000L, zzambVarZzb.zzd, RoundingMode.DOWN);
                    jZzv2 = zzfk.zzv(jArr3[i29] - j12, 1000000L, j10, RoundingMode.DOWN);
                    if (jZzv2 < 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    z7 = (!z8) | z7;
                    jArr10[i27] = jZzv8 + jZzv2;
                    if (z6 && iArr13[i27] > i28) {
                        i28 = iArr3[i29];
                    }
                    if (!z6 && r31 == 0 && (r42[i27] & 1) != 0) {
                        arrayList.add(Integer.valueOf(i27));
                    }
                    i27++;
                    i29++;
                    iArr7 = iArr13;
                    r6 = r42;
                }
                j11 += jArr15[i26];
                i26++;
                iArr7 = iArr7;
                jArr5 = jArr15;
                jArr9 = jArr10;
                r6 = r6;
            }
            ?? r43 = r6;
            long[] jArr16 = jArr9;
            int[] iArr14 = iArr7;
            long jZzv9 = zzfk.zzv(j11, 1000000L, zzambVarZzb.zzd, RoundingMode.DOWN);
            if (z7) {
                zzt zztVarZza3 = zzambVarZzb.zzg.zza();
                zztVarZza3.zzu(true);
                zzambVarZzb = zzambVarZzb.zzb(zztVarZza3.zzO());
            }
            return new zzame(zzambVarZzb, jArr8, iArr14, i28, jArr16, r43, zzgzt.zzf(arrayList), r31, jZzv9, jArr8.length);
        }
        i2 = 1;
        i3 = i;
        arrayList = new ArrayList();
        if (zzesVar4 == null) {
            r31 = i2;
        } else {
            r31 = i;
        }
        if (i3 != 0) {
            i37 = zzaktVar.zza;
            jArr11 = new long[i37];
            iArr10 = new int[i37];
            while (zzaktVar.zza()) {
                int i410 = zzaktVar.zzb;
                jArr11[i410] = zzaktVar.zzd;
                iArr10[i410] = zzaktVar.zzc;
            }
            j14 = iZzH8;
            i38 = 8192 / iZzb;
            i39 = i;
            i40 = i39;
            while (i39 < i37) {
                int i411 = iArr10[i39];
                String str4 = zzfk.zza;
                i40 += ((i411 + i38) - 1) / i38;
                i39++;
            }
            jArr2 = new long[i40];
            iArr11 = new int[i40];
            jArr3 = new long[i40];
            iArr12 = new int[i40];
            i41 = i;
            i42 = i41;
            i43 = i42;
            i44 = i43;
            i45 = i44;
            while (i41 < i37) {
                int i510 = iArr10[i41];
                j15 = jArr11[i41];
                int i511 = i45;
                int i512 = i37;
                iMax = i44;
                i46 = i511;
                int i513 = i41;
                i47 = i510;
                while (i47 > 0) {
                    int iMin2 = Math.min(i38, i47);
                    jArr2[i46] = j15;
                    int i514 = i47;
                    int i515 = iZzb * iMin2;
                    iArr11[i46] = i515;
                    int i516 = i43 + i515;
                    iMax = Math.max(iMax, i515);
                    long j110 = j14;
                    jArr3[i46] = j110 * ((long) i42);
                    iArr12[i46] = i2;
                    j15 += (long) iArr11[i46];
                    i42 += iMin2;
                    i47 = i514 - iMin2;
                    i46++;
                    i43 = i516;
                    j14 = j110;
                }
                long j111 = j14;
                i41 = i513 + 1;
                int i517 = i46;
                i44 = iMax;
                i37 = i512;
                i45 = i517;
                j14 = j111;
            }
            j5 = i43;
            j4 = j14 * ((long) i42);
            i16 = i40;
            iArr2 = iArr11;
            i17 = i44;
            r15 = iArr12;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            zzesVar = zzesVar5;
            jArrCopyOf = new long[iZza];
            i4 = iZzH2;
            int i518 = iZzH3;
            zzakxVar = zzalbVar;
            iZzH4 = i518;
            i5 = iZzH;
            i6 = iZzH6;
            j = 0;
            j2 = 0;
            j3 = 0;
            i7 = i;
            i8 = i7;
            i9 = i8;
            iZzH5 = i9;
            iZzB = iZzH8;
            iZzB2 = iZzH5;
            r4 = new int[iZza];
            while (true) {
                if (i7 < iZza) {
                    jArr2 = jArr;
                    CopyOf = r4;
                    break;
                }
                j6 = j;
                r23 = i2;
                while (true) {
                    if (i9 != 0) {
                        i18 = i9;
                        r24 = r23;
                        break;
                    }
                    zZza = zzaktVar.zza();
                    if (zZza) {
                        i18 = i;
                        r24 = zZza;
                        break;
                    }
                    j6 = zzaktVar.zzd;
                    i9 = zzaktVar.zzc;
                    iZza = iZza;
                    r23 = zZza;
                }
                i19 = iZza;
                if (r24 == 0) {
                    zzef.zzc("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i7);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr, i7);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                    jArr2 = jArrCopyOf3;
                    iArr = iArrCopyOf2;
                    CopyOf = Arrays.copyOf((int[]) r4, i7);
                    iZza = i7;
                    break;
                }
                if (zzesVar != null) {
                    while (iZzH5 == 0) {
                        if (i5 > 0) {
                            iZzH5 = i;
                            break;
                        }
                        i5--;
                        iZzH5 = zzesVar.zzH();
                        iZzB2 = zzesVar.zzB();
                    }
                    iZzH5--;
                }
                iZzc = zzakxVar.zzc();
                r38 = r4;
                long[] jArr17 = jArr;
                long j112 = iZzc;
                j3 += j112;
                if (iZzc > i8) {
                    i8 = iZzc;
                }
                jArr17[i7] = j6;
                iArr[i7] = iZzc;
                int i519 = i18;
                jArrCopyOf[i7] = j2 + ((long) iZzB2);
                r38[i7] = r31;
                if (i7 == iZzH4) {
                    r38[i7] = i2;
                    arrayList.add(Integer.valueOf(i7));
                }
                if (zzesVar4 != null) {
                    i20 = i4 - 1;
                    if (i20 > 0) {
                        i4 = i20;
                        iZzH4 = zzesVar4.zzH() - 1;
                    } else {
                        i4 = i20;
                    }
                }
                j2 += (long) iZzB;
                iZzH7--;
                if (iZzH7 != 0) {
                    if (i6 > 0) {
                        i6--;
                        iZzH7 = zzesVar3.zzH();
                        iZzB = zzesVar3.zzB();
                    } else {
                        iZzH7 = i;
                    }
                }
                long j210 = j6 + j112;
                i9 = i519 - 1;
                i7++;
                jArr = jArr17;
                r4 = r38;
                iZza = i19;
                j = j210;
            }
            long j211 = j2 + ((long) iZzB2);
            if (zzesVar != null) {
                i10 = i2;
                break;
            }
            while (true) {
                if (i5 > 0) {
                    i10 = i2;
                    break;
                }
                if (zzesVar.zzH() != 0) {
                    i10 = i;
                    break;
                }
                zzesVar.zzB();
                i5--;
            }
            if (i4 == 0) {
                if (iZzH7 == 0) {
                    if (i9 == 0) {
                        i15 = i;
                        i11 = i15;
                    } else if (i6 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i10 = i10;
                        iZza = iZza;
                        i15 = i;
                        i11 = i15;
                        i12 = i11;
                        i13 = i6;
                        i14 = iZzH5;
                    } else if (iZzH5 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i10 = i10;
                        iZza = iZza;
                        i15 = i;
                        i11 = i15;
                        i12 = i11;
                        i13 = i12;
                        i14 = iZzH5;
                    } else if (i10 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        iZza = iZza;
                        i10 = i;
                        i15 = i10;
                        i11 = i15;
                        i12 = i11;
                        i13 = i12;
                        i14 = i13;
                    } else {
                        jArrCopyOf = jArrCopyOf;
                        iZza = iZza;
                    }
                    jArr3 = jArrCopyOf;
                    i16 = iZza;
                    iArr2 = iArr;
                    j4 = j211;
                    j5 = j3;
                    i17 = i8;
                    r15 = CopyOf;
                } else {
                    i11 = iZzH7;
                    i15 = i;
                }
                i12 = i9;
                i13 = i6;
                i14 = iZzH5;
            } else {
                jArrCopyOf = jArrCopyOf;
                i10 = i10;
                iZza = iZza;
                i11 = iZzH7;
                i12 = i9;
                i13 = i6;
                i14 = iZzH5;
                i15 = i4;
            }
            int i66 = zzambVarZzb.zza;
            int length5 = String.valueOf(i66).length() + 66 + String.valueOf(i15).length() + 35 + String.valueOf(i11).length() + 26 + String.valueOf(i12).length() + 33 + String.valueOf(i13).length() + 36;
            int length6 = String.valueOf(i14).length();
            if (i2 != i10) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder(length5 + length6 + str.length());
            sb2.append("Inconsistent stbl box for track ");
            sb2.append(i66);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i15);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i11);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i12);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i13);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i14);
            sb2.append(str);
            zzef.zzc("BoxParsers", sb2.toString());
            jArr3 = jArrCopyOf;
            i16 = iZza;
            iArr2 = iArr;
            j4 = j211;
            j5 = j3;
            i17 = i8;
            r15 = CopyOf;
        }
        jArr4 = jArr2;
        j7 = zzambVarZzb.zzf;
        if (j7 > 0) {
            jZzv4 = zzfk.zzv(j5 * 8, 1000000L, j7, RoundingMode.HALF_DOWN);
            if (jZzv4 > 0) {
                zzt zztVarZza4 = zzvVar.zza();
                zztVarZza4.zzi((int) jZzv4);
                zzambVarZzb = zzambVarZzb.zzb(zztVarZza4.zzO());
            }
        }
        j8 = zzambVarZzb.zzc;
        jZzv = zzfk.zzv(j4, 1000000L, j8, RoundingMode.DOWN);
        iArrZzf = zzgzt.zzf(arrayList);
        jArr5 = zzambVarZzb.zzi;
        if (jArr5 == null) {
            zzfk.zzw(jArr3, 1000000L, j8);
            return new zzame(zzambVarZzb, jArr4, iArr2, i17, jArr3, r15, iArrZzf, r31, jZzv, i16);
        }
        r29 = r15;
        length = jArr5.length;
        if (length == 1) {
            if (zzambVarZzb.zzb == 1) {
                j9 = j8;
            } else {
                j9 = j8;
            }
            i21 = 1;
            length = 1;
        } else {
            j9 = j8;
            i21 = 1;
        }
        if (length != i21) {
        }
        j10 = j9;
        iArr3 = iArr2;
        i22 = i16;
        if (zzambVarZzb.zzb == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        jArr6 = zzambVarZzb.zzj;
        iArr4 = new int[length];
        iArr5 = new int[length];
        jArr6.getClass();
        jArr7 = jArr6;
        i23 = 0;
        i24 = 0;
        i25 = 0;
        z4 = false;
        while (i24 < jArr5.length) {
            iArr9 = iArr4;
            j13 = jArr7[i24];
            if (j13 != -1) {
                i31 = i24;
                long j212 = j10;
                j10 = j212;
                jZzv3 = zzfk.zzv(jArr5[i24], j212, zzambVarZzb.zzd, RoundingMode.DOWN) + j13;
                boolean z13 = z4;
                iArr9[i31] = zzfk.zzo(jArr3, j13, true, true);
                int iZzq2 = zzfk.zzq(jArr3, jZzv3, z3, false);
                i33 = iZzq2 - 1;
                i34 = 0;
                while (i32 < jArr3.length) {
                    if (jArr3[i32] < jZzv3) {
                        i34++;
                        if (i34 > zzambVarZzb.zzg.zzr) {
                            break;
                            break;
                        }
                    } else {
                        i33 = i32;
                    }
                }
                iArr5[i31] = i33 + 1;
                i35 = iArr9[i31];
                while (true) {
                    i36 = iArr9[i31];
                    if (i36 > 0) {
                        break;
                    }
                    iArr9[i31] = i36 - 1;
                }
                if (i36 == 0) {
                    z9 = false;
                    if ((r29[0] & 1) == 0) {
                        iArr9[i31] = i35;
                        while (true) {
                            i36 = iArr9[i31];
                            if (i36 >= iArr5[i31]) {
                                break;
                            }
                            break;
                            break;
                            iArr9[i31] = i36 + 1;
                        }
                    }
                } else {
                    z9 = false;
                }
                int i67 = iArr5[i31];
                i25 += i67 - i36;
                if (i23 != i36) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                z4 = z13 | z10;
                i23 = i67;
            } else {
                i31 = i24;
            }
            i24 = i31 + 1;
            jArr7 = jArr7;
            iArr4 = iArr9;
            z3 = z3;
        }
        iArr6 = iArr4;
        boolean z14 = z4;
        if (i25 != i22) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z14 | z5;
        if (z6) {
            jArr8 = new long[i25];
        } else {
            jArr8 = jArr4;
        }
        if (z6) {
            iArr7 = new int[i25];
        } else {
            iArr7 = iArr3;
        }
        if (true == z6) {
            i17 = 0;
        }
        if (z6) {
            iArr8 = new int[i25];
        } else {
            r5 = r29;
        }
        if (z6) {
            r5 = iArr8;
            arrayList = new ArrayList();
        }
        r5 = iArr8;
        jArr9 = new long[i25];
        i26 = 0;
        z7 = false;
        i27 = 0;
        i28 = i17;
        j11 = 0;
        r6 = r5;
        while (i26 < jArr5.length) {
            j12 = jArr6[i26];
            i29 = iArr6[i26];
            long[] jArr18 = jArr5;
            i30 = iArr5[i26];
            jArr10 = jArr9;
            if (z6) {
                int i68 = i30 - i29;
                System.arraycopy(jArr4, i29, jArr8, i27, i68);
                System.arraycopy(iArr3, i29, iArr7, i27, i68);
                System.arraycopy(r29, i29, r6, i27, i68);
            }
            while (i29 < i30) {
                int[] iArr15 = iArr7;
                ?? r44 = r6;
                long jZzv10 = zzfk.zzv(j11, 1000000L, zzambVarZzb.zzd, RoundingMode.DOWN);
                jZzv2 = zzfk.zzv(jArr3[i29] - j12, 1000000L, j10, RoundingMode.DOWN);
                if (jZzv2 < 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z7 = (!z8) | z7;
                jArr10[i27] = jZzv10 + jZzv2;
                if (z6) {
                    i28 = iArr3[i29];
                }
                if (!z6) {
                }
                i27++;
                i29++;
                iArr7 = iArr15;
                r6 = r44;
            }
            j11 += jArr18[i26];
            i26++;
            iArr7 = iArr7;
            jArr5 = jArr18;
            jArr9 = jArr10;
            r6 = r6;
        }
        ?? r45 = r6;
        long[] jArr19 = jArr9;
        int[] iArr16 = iArr7;
        long jZzv11 = zzfk.zzv(j11, 1000000L, zzambVarZzb.zzd, RoundingMode.DOWN);
        if (z7) {
            zzt zztVarZza5 = zzambVarZzb.zzg.zza();
            zztVarZza5.zzu(true);
            zzambVarZzb = zzambVarZzb.zzb(zztVarZza5.zzO());
        }
        return new zzame(zzambVarZzb, jArr8, iArr16, i28, jArr19, r45, zzgzt.zzf(arrayList), r31, jZzv11, jArr8.length);
    }

    private static zzap zzh(zzes zzesVar) {
        short sZzv = zzesVar.zzv();
        zzesVar.zzk(2);
        String strZzK = zzesVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfz(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzes zzesVar) {
        zzesVar.zzh(16);
        return zzesVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzgsw.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int iZze = zzgzt.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfk.zza;
            int i4 = ((iZze >> 8) & 255) - 128;
            int i5 = (iZze >> 16) & 255;
            int i6 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgsq.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + strZzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(strZzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177 A[PHI: r3
  0x0177: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:75:0x0169, B:76:0x016b, B:81:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    private static zzi zzk(zzes zzesVar) {
        int i;
        int iZzj;
        int iZzj2;
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzesVar.zzi();
        zzer zzerVar = new zzer(bArrZzi, bArrZzi.length);
        zzerVar.zzf(zzesVar.zzg() * 8);
        zzerVar.zzo(1);
        int iZzj3 = zzerVar.zzj(3);
        zzerVar.zzh(6);
        boolean zZzi = zzerVar.zzi();
        boolean zZzi2 = zzerVar.zzi();
        boolean z = false;
        if (iZzj3 != 2) {
            if (iZzj3 <= 2) {
                i = true != zZzi ? 8 : 10;
                zzhVar.zze(i);
                zzhVar.zzf(i);
            }
        } else if (zZzi) {
            i = true == zZzi2 ? 12 : 10;
            zzhVar.zze(i);
            zzhVar.zzf(i);
        } else {
            zZzi = false;
            iZzj3 = 2;
            if (iZzj3 <= 2) {
                if (true != zZzi) {
                }
                zzhVar.zze(i);
                zzhVar.zzf(i);
            }
        }
        int i2 = 13;
        zzerVar.zzh(13);
        zzerVar.zzg();
        int iZzj4 = zzerVar.zzj(4);
        if (iZzj4 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 22);
            sb.append("Unsupported obu_type: ");
            sb.append(iZzj4);
            zzef.zzb("BoxParsers", sb.toString());
            return zzhVar.zzg();
        }
        if (zzerVar.zzi()) {
            zzef.zzb("BoxParsers", "Unsupported obu_extension_flag");
            return zzhVar.zzg();
        }
        boolean zZzi3 = zzerVar.zzi();
        zzerVar.zzg();
        if (zZzi3 && zzerVar.zzj(8) > 127) {
            zzef.zzb("BoxParsers", "Excessive obu_size");
            return zzhVar.zzg();
        }
        int iZzj5 = zzerVar.zzj(3);
        zzerVar.zzg();
        if (zzerVar.zzi()) {
            zzef.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
            return zzhVar.zzg();
        }
        if (zzerVar.zzi()) {
            zzef.zzb("BoxParsers", "Unsupported timing_info_present_flag");
            return zzhVar.zzg();
        }
        if (zzerVar.zzi()) {
            zzef.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zzhVar.zzg();
        }
        int iZzj6 = zzerVar.zzj(5);
        for (int i3 = 0; i3 <= iZzj6; i3++) {
            zzerVar.zzh(12);
            if (zzerVar.zzj(5) > 7) {
                zzerVar.zzg();
            }
        }
        int iZzj7 = zzerVar.zzj(4);
        int iZzj8 = zzerVar.zzj(4);
        zzerVar.zzh(iZzj7 + 1);
        zzerVar.zzh(iZzj8 + 1);
        if (zzerVar.zzi()) {
            zzerVar.zzh(7);
        }
        zzerVar.zzh(7);
        boolean zZzi4 = zzerVar.zzi();
        if (zZzi4) {
            zzerVar.zzh(2);
        }
        if ((zzerVar.zzi() || zzerVar.zzj(1) > 0) && !zzerVar.zzi()) {
            zzerVar.zzh(1);
        }
        if (zZzi4) {
            zzerVar.zzh(3);
        }
        zzerVar.zzh(3);
        boolean zZzi5 = zzerVar.zzi();
        if (iZzj5 != 2) {
            if (iZzj5 != 1) {
            }
            if (zzerVar.zzi()) {
                int iZzj9 = zzerVar.zzj(8);
                iZzj = zzerVar.zzj(8);
                int iZzj10 = zzerVar.zzj(8);
                if (!z || iZzj9 != 1) {
                    i2 = iZzj;
                    iZzj2 = zzerVar.zzj(1);
                } else if (iZzj != 13) {
                    iZzj9 = 1;
                    i2 = iZzj;
                    iZzj2 = zzerVar.zzj(1);
                } else if (iZzj10 == 0) {
                    iZzj2 = 1;
                    iZzj9 = 1;
                } else {
                    iZzj9 = 1;
                    iZzj2 = zzerVar.zzj(1);
                }
                zzhVar.zza(zzi.zzb(iZzj9));
                zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
                zzhVar.zzc(zzi.zzc(i2));
            }
            return zzhVar.zzg();
        }
        if (zZzi5) {
            zzerVar.zzg();
        }
        if (zzerVar.zzi()) {
            z = true;
        }
        if (zzerVar.zzi()) {
            int iZzj11 = zzerVar.zzj(8);
            iZzj = zzerVar.zzj(8);
            int iZzj12 = zzerVar.zzj(8);
            if (!z) {
                i2 = iZzj;
                iZzj2 = zzerVar.zzj(1);
            } else {
                i2 = iZzj;
                iZzj2 = zzerVar.zzj(1);
            }
            zzhVar.zza(zzi.zzb(iZzj11));
            zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
            zzhVar.zzc(zzi.zzc(i2));
        }
        return zzhVar.zzg();
    }

    private static zzi zzl(zzes zzesVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzesVar.zzi();
        zzer zzerVar = new zzer(bArrZzi, bArrZzi.length);
        zzerVar.zzf(zzesVar.zzg() * 8);
        zzerVar.zzo(1);
        int iZzj = zzerVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzerVar.zzo(1);
            int iZzj2 = zzerVar.zzj(8);
            for (int i2 = 0; i2 < iZzj2; i2++) {
                zzerVar.zzh(6);
                boolean zZzi = zzerVar.zzi();
                zzerVar.zzg();
                zzerVar.zzo(11);
                zzerVar.zzh(4);
                int iZzj3 = zzerVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzerVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzerVar.zzj(8);
                    int iZzj5 = zzerVar.zzj(8);
                    zzerVar.zzo(1);
                    boolean zZzi2 = zzerVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfw zzfwVar) {
        zzfx zzfxVarZzc = zzfwVar.zzc(1701606260);
        if (zzfxVarZzc == null) {
            return null;
        }
        zzes zzesVar = zzfxVarZzc.zza;
        zzesVar.zzh(8);
        int iZza = zza(zzesVar.zzB());
        int iZzH = zzesVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i = 0; i < iZzH; i++) {
            jArr[i] = iZza == 1 ? zzesVar.zzJ() : zzesVar.zzz();
            jArr2[i] = iZza == 1 ? zzesVar.zzD() : zzesVar.zzB();
            if (zzesVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzesVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x0207  */
    /* JADX WARN: Code duplicated, block: B:141:0x021d  */
    /* JADX WARN: Code duplicated, block: B:142:0x022d  */
    /* JADX WARN: Code duplicated, block: B:145:0x024a  */
    /* JADX WARN: Code duplicated, block: B:146:0x025b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0266  */
    /* JADX WARN: Code duplicated, block: B:149:0x026b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0276  */
    /* JADX WARN: Code duplicated, block: B:153:0x027e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0291  */
    /* JADX WARN: Code duplicated, block: B:158:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:182:0x031a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0320  */
    /* JADX WARN: Code duplicated, block: B:185:0x0325  */
    /* JADX WARN: Code duplicated, block: B:186:0x0336  */
    /* JADX WARN: Code duplicated, block: B:188:0x033b  */
    /* JADX WARN: Code duplicated, block: B:189:0x034c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0351  */
    /* JADX WARN: Code duplicated, block: B:192:0x0362  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0369  */
    /* JADX WARN: Code duplicated, block: B:198:0x0397  */
    /* JADX WARN: Code duplicated, block: B:272:0x05e7 A[PHI: r10 r11 r27 r29 r31 r32
  0x05e7: PHI (r10v13 int) = (r44v1 int), (r10v18 int), (r10v21 int), (r10v22 int), (r10v22 int) binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]
  0x05e7: PHI (r11v42 java.lang.String) = 
  (r11v41 java.lang.String)
  (r11v41 java.lang.String)
  (r11v41 java.lang.String)
  (r11v41 java.lang.String)
  (r11v46 java.lang.String)
 binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]
  0x05e7: PHI (r27v2 int) = (r27v1 int), (r27v1 int), (r27v1 int), (r27v3 int), (r27v3 int) binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]
  0x05e7: PHI (r29v1 int) = (r8v11 int), (r29v3 int), (r29v4 int), (r29v4 int), (r29v4 int) binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]
  0x05e7: PHI (r31v1 int) = (r31v2 int), (r31v3 int), (r31v4 int), (r31v4 int), (r31v4 int) binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]
  0x05e7: PHI (r32v1 int) = (r14v5 int), (r32v3 int), (r32v4 int), (r32v4 int), (r32v4 int) binds: [B:276:0x0626, B:274:0x05ed, B:273:0x05ea, B:270:0x05e3, B:271:0x05e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:275:0x0617  */
    /* JADX WARN: Code duplicated, block: B:277:0x0628  */
    /* JADX WARN: Code duplicated, block: B:279:0x0636  */
    /* JADX WARN: Code duplicated, block: B:281:0x063e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0697  */
    /* JADX WARN: Code duplicated, block: B:296:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:297:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:299:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:314:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    private static void zzo(zzes zzesVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, zzakz zzakzVar, int i5) throws zzat {
        int iZzt;
        int i6;
        int iZzt2;
        int iZzF;
        int iZzB;
        int i7;
        String str2;
        String string;
        List listZzk;
        zzaku zzakuVarZzp;
        zzaks zzaksVarZzq;
        int iZzB2;
        boolean z2;
        String str3;
        int iZzB3;
        int i8;
        int i9;
        int i10;
        String strZza;
        byte[] bArrZzb;
        String str4;
        zzes zzesVar2;
        int i11;
        int i12;
        int i13;
        int iZzB4;
        int iZzs;
        byte[] bArr;
        int iZzs2;
        String str5;
        byte[] bArr2;
        int i14;
        int i15 = i;
        int i16 = i3;
        zzq zzqVarZzb = zzqVar;
        zzesVar.zzh(i2 + 16);
        if (z) {
            iZzt = zzesVar.zzt();
            zzesVar.zzk(6);
        } else {
            zzesVar.zzk(8);
            iZzt = 0;
        }
        int i17 = 32;
        int i18 = 0;
        if (iZzt == 0 || iZzt == 1) {
            i6 = 2;
            iZzt2 = zzesVar.zzt();
            zzesVar.zzk(6);
            iZzF = zzesVar.zzF();
            zzesVar.zzh(zzesVar.zzg() - 4);
            iZzB = zzesVar.zzB();
            if (iZzt == 1) {
                zzesVar.zzk(16);
            }
            i7 = -1;
        } else {
            if (iZzt != 2) {
                return;
            }
            zzesVar.zzk(16);
            iZzF = (int) Math.round(Double.longBitsToDouble(zzesVar.zzD()));
            int iZzH = zzesVar.zzH();
            zzesVar.zzk(4);
            i6 = 2;
            int iZzH2 = zzesVar.zzH();
            int iZzH3 = zzesVar.zzH();
            int i19 = iZzH3 & 1;
            int i20 = iZzH3 & 2;
            if (i19 == 0) {
                if (iZzH2 == 8) {
                    i7 = 3;
                } else if (iZzH2 == 16) {
                    i7 = i20 != 0 ? 268435456 : 2;
                } else if (iZzH2 == 24) {
                    i7 = i20 != 0 ? C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else if (iZzH2 == 32) {
                    i7 = i20 != 0 ? C0684C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                } else {
                    i7 = -1;
                }
            } else if (iZzH2 == 32) {
                i7 = 4;
            } else {
                i7 = -1;
            }
            zzesVar.zzk(8);
            iZzt2 = iZzH;
            iZzB = 0;
        }
        if (i15 == 1767992678) {
            iZzt2 = -1;
            iZzF = -1;
        } else {
            if (i15 == 1935764850) {
                iZzF = 8000;
            } else if (i15 == 1935767394) {
                iZzF = 16000;
                i15 = 1935767394;
            }
            iZzt2 = 1;
        }
        int iZzg = zzesVar.zzg();
        int iIntValue = 1701733217;
        if (i15 == 1701733217) {
            Pair pairZzr = zzr(zzesVar, i2, i16);
            if (pairZzr != null) {
                iIntValue = ((Integer) pairZzr.first).intValue();
                zzqVarZzb = zzqVarZzb == null ? null : zzqVarZzb.zzb(((zzamc) pairZzr.second).zzb);
                zzakzVar.zza[i5] = (zzamc) pairZzr.second;
            }
            i15 = iIntValue;
            zzesVar.zzh(iZzg);
        }
        if (i15 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i15 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i15 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i15 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i15 == 1685353320 || i15 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i15 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i15 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i15 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i15 != 1935767394) {
                if (i15 == 1936684916) {
                    i7 = i6;
                    str2 = "audio/raw";
                } else if (i15 == 1953984371) {
                    i15 = i15;
                    str2 = "audio/raw";
                    i7 = 268435456;
                } else if (i15 == 1819304813) {
                    if (i7 == -1) {
                        i7 = i6;
                    }
                    str2 = "audio/raw";
                } else if (i15 == 778924082 || i15 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i15 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i15 == 1835560241) {
                    i15 = i15;
                    str2 = "audio/mhm1";
                } else if (i15 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i15 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i15 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i15 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i15 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i15 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i15 == 1767992678) {
                    i15 = 1767992678;
                    str2 = "audio/iamf";
                } else {
                    i15 = i15;
                    str2 = null;
                }
                int i21 = i7;
                string = null;
                listZzk = null;
                zzakuVarZzp = null;
                zzaksVarZzq = null;
                while (iZzg - i2 < i16) {
                    zzesVar.zzh(iZzg);
                    iZzB2 = zzesVar.zzB();
                    if (iZzB2 > 0) {
                        z2 = 1;
                    } else {
                        z2 = i18;
                    }
                    str3 = string;
                    String str6 = "childAtomSize must be positive";
                    zzaft.zza(z2, "childAtomSize must be positive");
                    iZzB3 = zzesVar.zzB();
                    iZzF = iZzF;
                    if (iZzB3 == 1835557187) {
                        zzesVar.zzh(iZzg + 8);
                        zzesVar.zzk(1);
                        iZzs2 = zzesVar.zzs();
                        zzesVar.zzk(1);
                        if (Objects.equals(str2, "audio/mhm1")) {
                            Object[] objArr = new Object[1];
                            objArr[i18] = Integer.valueOf(iZzs2);
                            str5 = String.format("mhm1.%02X", objArr);
                        } else {
                            Object[] objArr2 = new Object[1];
                            objArr2[i18] = Integer.valueOf(iZzs2);
                            str5 = String.format("mha1.%02X", objArr2);
                        }
                        int iZzt3 = zzesVar.zzt();
                        bArr2 = new byte[iZzt3];
                        str3 = str5;
                        i14 = i18;
                        zzesVar.zzm(bArr2, i14, iZzt3);
                        if (listZzk == null) {
                            listZzk = zzgvz.zzj(bArr2);
                            iZzF = iZzF;
                            iZzB2 = iZzB2;
                            iZzg = iZzg;
                            iZzB = iZzB;
                            i10 = i14;
                            string = str3;
                        } else {
                            listZzk = zzgvz.zzk(bArr2, (byte[]) listZzk.get(i14));
                            string = str3;
                            iZzB2 = iZzB2;
                            iZzB = iZzB;
                            i10 = 0;
                        }
                    } else if (iZzB3 == 1835557200) {
                        zzesVar.zzh(iZzg + 8);
                        iZzs = zzesVar.zzs();
                        if (iZzs > 0) {
                            bArr = new byte[iZzs];
                            zzesVar.zzm(bArr, 0, iZzs);
                            if (listZzk == null) {
                                listZzk = zzgvz.zzj(bArr);
                                string = str3;
                                iZzB2 = iZzB2;
                                iZzg = iZzg;
                                iZzB = iZzB;
                                i10 = 0;
                                iZzF = iZzF;
                            } else {
                                listZzk = zzgvz.zzk((byte[]) listZzk.get(0), bArr);
                                string = str3;
                                iZzB2 = iZzB2;
                                iZzB = iZzB;
                                i10 = 0;
                            }
                        } else {
                            iZzF = iZzF;
                            iZzB2 = iZzB2;
                            iZzg = iZzg;
                            iZzB = iZzB;
                            i10 = 0;
                            string = str3;
                        }
                    } else {
                        if (iZzB3 == 1702061171) {
                            iZzg = iZzg;
                            i8 = iZzg;
                            i9 = -1;
                        } else if (!z && iZzB3 == 2002876005) {
                            int iZzg2 = zzesVar.zzg();
                            zzaft.zza(iZzg2 >= iZzg, null);
                            int i22 = iZzg2;
                            while (true) {
                                if (i22 - iZzg >= iZzB2) {
                                    iZzg = iZzg;
                                    i8 = -1;
                                    i9 = -1;
                                    break;
                                }
                                zzesVar.zzh(i22);
                                int iZzB5 = zzesVar.zzB();
                                zzaft.zza(iZzB5 > 0, str6);
                                String str7 = str6;
                                if (zzesVar.zzB() == 1702061171) {
                                    iZzg = iZzg;
                                    i8 = i22;
                                    i9 = -1;
                                    break;
                                }
                                i22 += iZzB5;
                                str6 = str7;
                            }
                        } else if (iZzB3 == 1651798644) {
                            zzaksVarZzq = zzq(zzesVar, iZzg);
                            string = str3;
                            iZzB2 = iZzB2;
                            iZzB = iZzB;
                            i10 = 0;
                        } else {
                            if (iZzB3 == 1684103987) {
                                zzesVar.zzh(iZzg + 8);
                                zzakzVar.zzb = zzaeq.zza(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                            } else if (iZzB3 == 1684366131) {
                                zzesVar.zzh(iZzg + 8);
                                zzakzVar.zzb = zzaeq.zzb(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                            } else if (iZzB3 == 1684103988) {
                                zzesVar.zzh(iZzg + 8);
                                zzakzVar.zzb = zzaet.zza(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                            } else if (iZzB3 != 1684892784) {
                                if (iZzB3 != 1684305011 || iZzB3 == 1969517683) {
                                    iZzB2 = iZzB2;
                                    iZzg = iZzg;
                                    iZzB = iZzB;
                                    zzt zztVar = new zzt();
                                    zztVar.zzb(i4);
                                    zztVar.zzo(str2);
                                    zztVar.zzG(iZzt2);
                                    iZzF = iZzF;
                                    zztVar.zzH(iZzF);
                                    zztVar.zzs(zzqVarZzb);
                                    zztVar.zze(str);
                                    zzakzVar.zzb = zztVar.zzO();
                                } else {
                                    if (iZzB3 == 1682927731) {
                                        int i23 = iZzB2 - 8;
                                        byte[] bArr3 = zzb;
                                        int length = bArr3.length;
                                        iZzB2 = iZzB2;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i23);
                                        zzesVar.zzh(iZzg + 8);
                                        zzesVar.zzm(bArrCopyOf, length, i23);
                                        listZzk = zzgu.zza(bArrCopyOf);
                                    } else {
                                        iZzB2 = iZzB2;
                                        if (iZzB3 == 1684425825) {
                                            byte[] bArr4 = new byte[iZzB2 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[i6] = 97;
                                            bArr4[3] = 67;
                                            zzesVar.zzh(iZzg + 12);
                                            zzesVar.zzm(bArr4, 4, iZzB2 - 12);
                                            listZzk = zzgvz.zzj(bArr4);
                                        } else if (iZzB3 == 1634492771) {
                                            int i24 = iZzB2 - 12;
                                            byte[] bArr5 = new byte[i24];
                                            zzesVar.zzh(iZzg + 12);
                                            zzesVar.zzm(bArr5, 0, i24);
                                            int i25 = zzdp.zza;
                                            zzes zzesVar3 = new zzes(bArr5);
                                            zzesVar3.zzh(5);
                                            int iZzs3 = zzesVar3.zzs();
                                            zzesVar3.zzh(9);
                                            int iZzs4 = zzesVar3.zzs();
                                            zzesVar3.zzh(20);
                                            int[] iArr = {zzesVar3.zzH(), iZzs4, iZzs3};
                                            int i26 = iArr[0];
                                            int i27 = iArr[1];
                                            int iZzB6 = zzfk.zzB(iZzs3, ByteOrder.LITTLE_ENDIAN);
                                            listZzk = zzgvz.zzj(bArr5);
                                            iZzt2 = i27;
                                            i21 = iZzB6;
                                            iZzF = i26;
                                            iZzg = iZzg;
                                            iZzB = iZzB;
                                            i10 = 0;
                                            string = str3;
                                        } else if (iZzB3 == 1767990114) {
                                            zzesVar.zzh(iZzg + 9);
                                            int iZza = zzgzt.zza(zzesVar.zzP());
                                            byte[] bArr6 = new byte[iZza];
                                            zzesVar.zzm(bArr6, 0, iZza);
                                            int i28 = zzdp.zza;
                                            zzes zzesVar4 = new zzes(bArr6);
                                            String str8 = null;
                                            String str9 = null;
                                            while (zzesVar4.zzd() > 0 && (str8 == null || str9 == null)) {
                                                int iZzs5 = zzesVar4.zzs();
                                                byte[] bArr7 = bArr6;
                                                int i29 = iZzs5 >> 3;
                                                int i30 = iZzs5 & 2;
                                                int i31 = iZzs5 & 1;
                                                int iZza2 = zzgzt.zza(zzesVar4.zzP());
                                                if (i29 > 4 && i29 < 24 && i30 != 0) {
                                                    zzesVar4.zzQ();
                                                    zzesVar4.zzQ();
                                                }
                                                if (i31 != 0) {
                                                    zzesVar4.zzk(zzgzt.zza(zzesVar4.zzP()));
                                                }
                                                int iZzg3 = zzesVar4.zzg() + iZza2;
                                                int i32 = iZzg;
                                                if (i29 == 31) {
                                                    zzesVar4.zzk(4);
                                                    int iZzs6 = zzesVar4.zzs();
                                                    int iZzs7 = zzesVar4.zzs();
                                                    Integer numValueOf = Integer.valueOf(iZzs6);
                                                    Integer numValueOf2 = Integer.valueOf(iZzs7);
                                                    Object[] objArr3 = new Object[i6];
                                                    objArr3[0] = numValueOf;
                                                    objArr3[1] = numValueOf2;
                                                    String str10 = zzfk.zza;
                                                    str8 = String.format(Locale.US, "iamf.%03X.%03X", objArr3);
                                                } else {
                                                    if (i29 == 0) {
                                                        zzesVar4.zzQ();
                                                        String strZzK = zzesVar4.zzK(4, StandardCharsets.UTF_8);
                                                        if (strZzK.equals("mp4a")) {
                                                            zzesVar4.zzQ();
                                                            zzesVar4.zzk(2);
                                                            zzer zzerVar = new zzer();
                                                            zzerVar.zza(zzesVar4);
                                                            int iZzj = zzerVar.zzj(5);
                                                            if (iZzj == 31) {
                                                                iZzj = zzerVar.zzj(6) + 32;
                                                            }
                                                            StringBuilder sb = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
                                                            sb.append(strZzK);
                                                            sb.append(".40.");
                                                            sb.append(iZzj);
                                                            strZzK = sb.toString();
                                                        }
                                                        str9 = strZzK;
                                                    }
                                                    zzesVar4.zzh(iZzg3);
                                                    bArr6 = bArr7;
                                                    iZzg = i32;
                                                    iZzB = iZzB;
                                                    i6 = 2;
                                                }
                                                iZzB = iZzB;
                                                zzesVar4.zzh(iZzg3);
                                                bArr6 = bArr7;
                                                iZzg = i32;
                                                iZzB = iZzB;
                                                i6 = 2;
                                            }
                                            byte[] bArr8 = bArr6;
                                            iZzg = iZzg;
                                            iZzB = iZzB;
                                            if (str8 == null || str9 == null) {
                                                string = null;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder(str8.length() + 1 + str9.length());
                                                sb2.append(str8);
                                                sb2.append(".");
                                                sb2.append(str9);
                                                string = sb2.toString();
                                            }
                                            listZzk = zzgvz.zzj(bArr8);
                                            iZzF = iZzF;
                                            i10 = 0;
                                        } else {
                                            iZzg = iZzg;
                                            iZzB = iZzB;
                                            if (iZzB3 == 1885564227) {
                                                zzesVar.zzh(iZzg + 12);
                                                ByteOrder byteOrder = (zzesVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                int iZzs8 = zzesVar.zzs();
                                                if (i15 == 1768973165) {
                                                    iZzB4 = zzfk.zzB(iZzs8, byteOrder);
                                                } else {
                                                    iZzB4 = (i15 == 1718641517 && iZzs8 == i17 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i21;
                                                }
                                                iZzF = iZzF;
                                                i21 = iZzB4;
                                                if (iZzB4 != -1) {
                                                    str2 = "audio/raw";
                                                }
                                            } else {
                                                iZzF = iZzF;
                                            }
                                        }
                                    }
                                    string = str3;
                                    iZzB = iZzB;
                                    i10 = 0;
                                }
                                i10 = 0;
                                string = str3;
                            } else {
                                if (iZzB > 0) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(iZzB);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                string = str3;
                                iZzB2 = iZzB2;
                                iZzF = iZzB;
                                iZzB = iZzF;
                                iZzt2 = i6;
                                i10 = 0;
                            }
                            iZzF = iZzF;
                            iZzB2 = iZzB2;
                            iZzg = iZzg;
                            iZzB = iZzB;
                            i10 = 0;
                            string = str3;
                        }
                        if (i8 != i9) {
                            zzakuVarZzp = zzp(zzesVar, i8);
                            strZza = zzakuVarZzp.zza();
                            bArrZzb = zzakuVarZzp.zzb();
                            if (bArrZzb != null) {
                                i10 = 0;
                            } else if ("audio/vorbis".equals(strZza)) {
                                zzesVar2 = new zzes(bArrZzb);
                                i11 = 1;
                                zzesVar2.zzk(1);
                                i12 = 0;
                                while (zzesVar2.zzd() > 0 && zzesVar2.zzn() == 255) {
                                    zzesVar2.zzk(i11);
                                    i12 += 255;
                                    i11 = 1;
                                }
                                int iZzs9 = i12 + zzesVar2.zzs();
                                i13 = 0;
                                while (zzesVar2.zzd() > 0 && zzesVar2.zzn() == 255) {
                                    zzesVar2.zzk(1);
                                    i13 += 255;
                                }
                                int iZzs10 = i13 + zzesVar2.zzs();
                                byte[] bArr9 = new byte[iZzs9];
                                int iZzg4 = zzesVar2.zzg();
                                i10 = 0;
                                System.arraycopy(bArrZzb, iZzg4, bArr9, 0, iZzs9);
                                int i33 = iZzg4 + iZzs9 + iZzs10;
                                int length2 = bArrZzb.length - i33;
                                byte[] bArr10 = new byte[length2];
                                System.arraycopy(bArrZzb, i33, bArr10, 0, length2);
                                listZzk = zzgvz.zzk(bArr9, bArr10);
                            } else {
                                i10 = 0;
                                if ("audio/mp4a-latm".equals(strZza)) {
                                    zzaen zzaenVarZza = zzaeo.zza(bArrZzb);
                                    iZzF = zzaenVarZza.zza;
                                    iZzt2 = zzaenVarZza.zzb;
                                    str4 = zzaenVarZza.zzc;
                                } else {
                                    str4 = str3;
                                }
                                zzgvz zzgvzVarZzj = zzgvz.zzj(bArrZzb);
                                str2 = strZza;
                                string = str4;
                                listZzk = zzgvzVarZzj;
                            }
                            str2 = strZza;
                        } else {
                            i10 = 0;
                        }
                        string = str3;
                    }
                    i18 = i10;
                    iZzB = iZzB;
                    i6 = 2;
                    i17 = 32;
                    iZzg += iZzB2;
                    i16 = i3;
                }
                String str11 = string;
                if (zzakzVar.zzb == null || str2 == null) {
                }
                zzt zztVar2 = new zzt();
                zztVar2.zzb(i4);
                zztVar2.zzo(str2);
                zztVar2.zzk(str11);
                zztVar2.zzG(iZzt2);
                zztVar2.zzH(iZzF);
                zztVar2.zzI(i21);
                zztVar2.zzr(listZzk);
                zztVar2.zzs(zzqVarZzb);
                zztVar2.zze(str);
                if (zzakuVarZzp != null) {
                    zztVar2.zzi(zzgzt.zzb(zzakuVarZzp.zzc()));
                    zztVar2.zzj(zzgzt.zzb(zzakuVarZzp.zzd()));
                } else if (zzaksVarZzq != null) {
                    zztVar2.zzi(zzgzt.zzb(zzaksVarZzq.zza()));
                    zztVar2.zzj(zzgzt.zzb(zzaksVarZzq.zzb()));
                }
                zzakzVar.zzb = zztVar2.zzO();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i15 = i15;
        int i210 = i7;
        string = null;
        listZzk = null;
        zzakuVarZzp = null;
        zzaksVarZzq = null;
        while (iZzg - i2 < i16) {
            zzesVar.zzh(iZzg);
            iZzB2 = zzesVar.zzB();
            if (iZzB2 > 0) {
                z2 = 1;
            } else {
                z2 = i18;
            }
            str3 = string;
            String str12 = "childAtomSize must be positive";
            zzaft.zza(z2, "childAtomSize must be positive");
            iZzB3 = zzesVar.zzB();
            iZzF = iZzF;
            if (iZzB3 == 1835557187) {
                zzesVar.zzh(iZzg + 8);
                zzesVar.zzk(1);
                iZzs2 = zzesVar.zzs();
                zzesVar.zzk(1);
                if (Objects.equals(str2, "audio/mhm1")) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i18] = Integer.valueOf(iZzs2);
                    str5 = String.format("mhm1.%02X", objArr4);
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[i18] = Integer.valueOf(iZzs2);
                    str5 = String.format("mha1.%02X", objArr5);
                }
                int iZzt4 = zzesVar.zzt();
                bArr2 = new byte[iZzt4];
                str3 = str5;
                i14 = i18;
                zzesVar.zzm(bArr2, i14, iZzt4);
                if (listZzk == null) {
                    listZzk = zzgvz.zzj(bArr2);
                    iZzF = iZzF;
                    iZzB2 = iZzB2;
                    iZzg = iZzg;
                    iZzB = iZzB;
                    i10 = i14;
                    string = str3;
                } else {
                    listZzk = zzgvz.zzk(bArr2, (byte[]) listZzk.get(i14));
                    string = str3;
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    i10 = 0;
                }
            } else if (iZzB3 == 1835557200) {
                zzesVar.zzh(iZzg + 8);
                iZzs = zzesVar.zzs();
                if (iZzs > 0) {
                    bArr = new byte[iZzs];
                    zzesVar.zzm(bArr, 0, iZzs);
                    if (listZzk == null) {
                        listZzk = zzgvz.zzj(bArr);
                        string = str3;
                        iZzB2 = iZzB2;
                        iZzg = iZzg;
                        iZzB = iZzB;
                        i10 = 0;
                        iZzF = iZzF;
                    } else {
                        listZzk = zzgvz.zzk((byte[]) listZzk.get(0), bArr);
                        string = str3;
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        i10 = 0;
                    }
                } else {
                    iZzF = iZzF;
                    iZzB2 = iZzB2;
                    iZzg = iZzg;
                    iZzB = iZzB;
                    i10 = 0;
                    string = str3;
                }
            } else {
                if (iZzB3 == 1702061171) {
                    if (!z) {
                    }
                    if (iZzB3 == 1651798644) {
                        zzaksVarZzq = zzq(zzesVar, iZzg);
                        string = str3;
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        i10 = 0;
                    } else {
                        if (iZzB3 == 1684103987) {
                            zzesVar.zzh(iZzg + 8);
                            zzakzVar.zzb = zzaeq.zza(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                        } else if (iZzB3 == 1684366131) {
                            zzesVar.zzh(iZzg + 8);
                            zzakzVar.zzb = zzaeq.zzb(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                        } else if (iZzB3 == 1684103988) {
                            zzesVar.zzh(iZzg + 8);
                            zzakzVar.zzb = zzaet.zza(zzesVar, Integer.toString(i4), str, zzqVarZzb);
                        } else if (iZzB3 != 1684892784) {
                            if (iZzB > 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                sb4.append(iZzB);
                                throw zzat.zzb(sb4.toString(), null);
                            }
                            string = str3;
                            iZzB2 = iZzB2;
                            iZzF = iZzB;
                            iZzB = iZzF;
                            iZzt2 = i6;
                            i10 = 0;
                        } else if (iZzB3 != 1684305011) {
                            iZzB2 = iZzB2;
                            iZzg = iZzg;
                            iZzB = iZzB;
                            zzt zztVar3 = new zzt();
                            zztVar3.zzb(i4);
                            zztVar3.zzo(str2);
                            zztVar3.zzG(iZzt2);
                            iZzF = iZzF;
                            zztVar3.zzH(iZzF);
                            zztVar3.zzs(zzqVarZzb);
                            zztVar3.zze(str);
                            zzakzVar.zzb = zztVar3.zzO();
                            i10 = 0;
                            string = str3;
                        } else {
                            iZzB2 = iZzB2;
                            iZzg = iZzg;
                            iZzB = iZzB;
                            zzt zztVar4 = new zzt();
                            zztVar4.zzb(i4);
                            zztVar4.zzo(str2);
                            zztVar4.zzG(iZzt2);
                            iZzF = iZzF;
                            zztVar4.zzH(iZzF);
                            zztVar4.zzs(zzqVarZzb);
                            zztVar4.zze(str);
                            zzakzVar.zzb = zztVar4.zzO();
                            i10 = 0;
                            string = str3;
                        }
                        iZzF = iZzF;
                        iZzB2 = iZzB2;
                        iZzg = iZzg;
                        iZzB = iZzB;
                        i10 = 0;
                        string = str3;
                    }
                } else {
                    iZzg = iZzg;
                    i8 = iZzg;
                    i9 = -1;
                }
                if (i8 != i9) {
                    zzakuVarZzp = zzp(zzesVar, i8);
                    strZza = zzakuVarZzp.zza();
                    bArrZzb = zzakuVarZzp.zzb();
                    if (bArrZzb != null) {
                        i10 = 0;
                    } else if ("audio/vorbis".equals(strZza)) {
                        zzesVar2 = new zzes(bArrZzb);
                        i11 = 1;
                        zzesVar2.zzk(1);
                        i12 = 0;
                        while (zzesVar2.zzd() > 0) {
                            zzesVar2.zzk(i11);
                            i12 += 255;
                            i11 = 1;
                        }
                        int iZzs11 = i12 + zzesVar2.zzs();
                        i13 = 0;
                        while (zzesVar2.zzd() > 0) {
                            zzesVar2.zzk(1);
                            i13 += 255;
                        }
                        int iZzs12 = i13 + zzesVar2.zzs();
                        byte[] bArr11 = new byte[iZzs11];
                        int iZzg5 = zzesVar2.zzg();
                        i10 = 0;
                        System.arraycopy(bArrZzb, iZzg5, bArr11, 0, iZzs11);
                        int i34 = iZzg5 + iZzs11 + iZzs12;
                        int length3 = bArrZzb.length - i34;
                        byte[] bArr12 = new byte[length3];
                        System.arraycopy(bArrZzb, i34, bArr12, 0, length3);
                        listZzk = zzgvz.zzk(bArr11, bArr12);
                    } else {
                        i10 = 0;
                        if ("audio/mp4a-latm".equals(strZza)) {
                            zzaen zzaenVarZza2 = zzaeo.zza(bArrZzb);
                            iZzF = zzaenVarZza2.zza;
                            iZzt2 = zzaenVarZza2.zzb;
                            str4 = zzaenVarZza2.zzc;
                        } else {
                            str4 = str3;
                        }
                        zzgvz zzgvzVarZzj2 = zzgvz.zzj(bArrZzb);
                        str2 = strZza;
                        string = str4;
                        listZzk = zzgvzVarZzj2;
                    }
                    str2 = strZza;
                } else {
                    i10 = 0;
                }
                string = str3;
            }
            i18 = i10;
            iZzB = iZzB;
            i6 = 2;
            i17 = 32;
            iZzg += iZzB2;
            i16 = i3;
        }
        String str13 = string;
        if (zzakzVar.zzb == null) {
        }
    }

    private static zzaku zzp(zzes zzesVar, int i) {
        zzesVar.zzh(i + 12);
        zzesVar.zzk(1);
        zzs(zzesVar);
        zzesVar.zzk(2);
        int iZzs = zzesVar.zzs();
        if ((iZzs & 128) != 0) {
            zzesVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzesVar.zzk(zzesVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzesVar.zzk(2);
        }
        zzesVar.zzk(1);
        zzs(zzesVar);
        String strZze = zzas.zze(zzesVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzaku(strZze, null, -1L, -1L);
        }
        zzesVar.zzk(4);
        long jZzz = zzesVar.zzz();
        long jZzz2 = zzesVar.zzz();
        zzesVar.zzk(1);
        int iZzs2 = zzs(zzesVar);
        long j = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzesVar.zzm(bArr, 0, iZzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzaku(strZze, bArr, j, jZzz > 0 ? jZzz : -1L);
    }

    private static zzaks zzq(zzes zzesVar, int i) {
        zzesVar.zzh(i + 8);
        zzesVar.zzk(4);
        return new zzaks(zzesVar.zzz(), zzesVar.zzz());
    }

    private static Pair zzr(zzes zzesVar, int i, int i2) throws zzat {
        zzamc zzamcVar;
        Pair pairCreate;
        int i3;
        int i4;
        int iZzg = zzesVar.zzg();
        while (iZzg - i < i2) {
            zzesVar.zzh(iZzg);
            int iZzB = zzesVar.zzB();
            zzaft.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzesVar.zzB() == 1936289382) {
                int i5 = iZzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i5 - iZzg < iZzB) {
                    zzesVar.zzh(i5);
                    int iZzB2 = zzesVar.zzB();
                    int iZzB3 = zzesVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzesVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzesVar.zzk(4);
                        strZzK = zzesVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzB2;
                    }
                    i5 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzaft.zza(numValueOf != null, "frma atom is mandatory");
                    zzaft.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            zzamcVar = null;
                            break;
                        }
                        zzesVar.zzh(i8);
                        int iZzB4 = zzesVar.zzB();
                        if (zzesVar.zzB() == 1952804451) {
                            int iZza = zza(zzesVar.zzB());
                            zzesVar.zzk(1);
                            if (iZza == 0) {
                                zzesVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZzs = zzesVar.zzs();
                                i3 = iZzs & 15;
                                i4 = (iZzs & 240) >> 4;
                            }
                            boolean z = zzesVar.zzs() == 1;
                            int iZzs2 = zzesVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzesVar.zzm(bArr2, 0, 16);
                            if (z && iZzs2 == 0) {
                                int iZzs3 = zzesVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzesVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            zzamcVar = new zzamc(z, strZzK, iZzs2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzB4;
                    }
                    zzaft.zza(zzamcVar != null, "tenc atom is mandatory");
                    String str = zzfk.zza;
                    pairCreate = Pair.create(numValueOf, zzamcVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzes zzesVar) {
        int iZzs = zzesVar.zzs();
        int i = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzesVar.zzs();
            i = (i << 7) | (iZzs & 127);
        }
        return i;
    }
}
