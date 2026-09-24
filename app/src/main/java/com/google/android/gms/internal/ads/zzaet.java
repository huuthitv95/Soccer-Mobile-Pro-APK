package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:146:0x0219  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x0248 A[LOOP:2: B:156:0x0246->B:157:0x0248, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0254  */
    /* JADX WARN: Code duplicated, block: B:161:0x025d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0267  */
    /* JADX WARN: Code duplicated, block: B:164:0x026c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0277  */
    /* JADX WARN: Code duplicated, block: B:171:0x027d  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:182:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:186:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:188:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x02da  */
    /* JADX WARN: Code duplicated, block: B:191:0x02df  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:194:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:207:0x0303  */
    /* JADX WARN: Code duplicated, block: B:208:0x0306  */
    /* JADX WARN: Code duplicated, block: B:209:0x030a  */
    /* JADX WARN: Code duplicated, block: B:211:0x030f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0316  */
    /* JADX WARN: Code duplicated, block: B:216:0x031d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0321  */
    /* JADX WARN: Code duplicated, block: B:220:0x0324  */
    /* JADX WARN: Code duplicated, block: B:222:0x0327  */
    /* JADX WARN: Code duplicated, block: B:224:0x032a  */
    /* JADX WARN: Code duplicated, block: B:226:0x032d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0353  */
    /* JADX WARN: Code duplicated, block: B:228:0x0355  */
    /* JADX WARN: Code duplicated, block: B:229:0x0358  */
    /* JADX WARN: Code duplicated, block: B:230:0x035a  */
    /* JADX WARN: Code duplicated, block: B:231:0x035c  */
    /* JADX WARN: Code duplicated, block: B:233:0x035f  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ad  */
    public static zzv zza(zzes zzesVar, String str, String str2, zzq zzqVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        int i10;
        int i11;
        boolean zZzi;
        int iZzj;
        int i12;
        boolean z2;
        int iZzj2;
        int iZzj3;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzc;
        int iZzj4;
        int i17;
        zzer zzerVar = new zzer();
        zzerVar.zza(zzesVar);
        int iZzc2 = zzerVar.zzc();
        int iZzj5 = zzerVar.zzj(3);
        if (iZzj5 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(iZzj5);
            throw zzat.zzc(sb.toString());
        }
        int iZzj6 = zzerVar.zzj(7);
        int i18 = true != zzerVar.zzi() ? 44100 : 48000;
        zzerVar.zzh(4);
        int iZzj7 = zzerVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzerVar.zzi()) {
                zzerVar.zzh(16);
                if (zzerVar.zzi()) {
                    zzerVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzerVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzerVar.zzm();
        }
        zzaer zzaerVar = new zzaer(null);
        int i19 = 0;
        while (true) {
            if (i19 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzerVar.zzi();
                    iZzj = 0;
                    i12 = 0;
                    z2 = false;
                    iZzj2 = zzerVar.zzj(5);
                    iZzj3 = zzerVar.zzj(5);
                } else {
                    int iZzj8 = zzerVar.zzj(8);
                    iZzj = zzerVar.zzj(8);
                    if (iZzj == 255) {
                        iZzj = zzerVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzerVar.zzh(iZzj * 8);
                        i19++;
                    } else {
                        int iZzc3 = (iZzc2 - zzerVar.zzc()) / 8;
                        iZzj2 = zzerVar.zzj(5);
                        iZzj3 = iZzj8;
                        z2 = iZzj2 == 31;
                        i12 = iZzc3;
                        zZzi = false;
                    }
                }
                zzaerVar.zzf = iZzj3;
                if (zZzi || z2 || iZzj2 != 6) {
                    zzaerVar.zzg = zzerVar.zzj(3);
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(5);
                    }
                    zzerVar.zzh(2);
                    if (iZzj5 == 1) {
                        if (iZzj3 != 1) {
                            if (iZzj3 == 2) {
                                iZzj3 = 2;
                                zzerVar.zzh(2);
                            }
                            if (iZzj3 <= 0) {
                                i = 5;
                            } else {
                                if (!zzerVar.zzi() && !zzg(zzerVar)) {
                                    throw zzat.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzerVar.zzi()) {
                                    zzerVar.zzm();
                                    zzerVar.zzo(zzerVar.zzj(16));
                                    i = 5;
                                    iZzj4 = zzerVar.zzj(5);
                                    for (i17 = 0; i17 < iZzj4; i17++) {
                                        zzerVar.zzh(3);
                                        zzerVar.zzh(8);
                                    }
                                } else {
                                    i = 5;
                                }
                            }
                            i2 = 8;
                            zzerVar.zzm();
                            if (iZzj5 == 1) {
                                iZzc = ((i13 - zzerVar.zzc()) / 8) - i12;
                                if (iZzj < iZzc) {
                                    throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzerVar.zzo(iZzj - iZzc);
                            }
                            if (zzaerVar.zza) {
                                i4 = -1;
                                if (zzaerVar.zzb == -1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 45);
                                    sb2.append("Can't determine channel mode of presentation ");
                                    sb2.append(i19);
                                    throw zzat.zzc(sb2.toString());
                                }
                            }
                            if (zzaerVar.zza) {
                                i8 = zzaerVar.zzb;
                                z = zzaerVar.zzd;
                                i9 = zzaerVar.zze;
                                switch (i8) {
                                    case 0:
                                        i10 = 11;
                                        i11 = 1;
                                        break;
                                    case 1:
                                        i10 = 11;
                                        i11 = 2;
                                        break;
                                    case 2:
                                        i10 = 11;
                                        i11 = 3;
                                        break;
                                    case 3:
                                        i11 = i;
                                        i10 = 11;
                                        break;
                                    case 4:
                                        i10 = 11;
                                        i11 = 6;
                                        break;
                                    case 5:
                                    case 7:
                                    case 9:
                                        i11 = i3;
                                        i10 = 11;
                                        break;
                                    case 6:
                                    case 8:
                                    case 10:
                                        i11 = i2;
                                        i10 = 11;
                                        break;
                                    case 11:
                                        i10 = 11;
                                        i11 = 11;
                                        break;
                                    case 12:
                                        i11 = 12;
                                        i10 = 11;
                                        break;
                                    case 13:
                                        i11 = 13;
                                        i10 = 11;
                                        break;
                                    case 14:
                                        i10 = 11;
                                        i11 = 14;
                                        break;
                                    case 15:
                                        i10 = 11;
                                        i11 = 24;
                                        break;
                                    default:
                                        i11 = i4;
                                        i10 = 11;
                                        break;
                                }
                                if (i8 != i10 || i8 == 12 || i8 == 13 || i8 == 14) {
                                    if (!z) {
                                        i11 -= 2;
                                    }
                                    i7 = i11;
                                    if (i9 == 0) {
                                        i7 -= 4;
                                    } else if (i9 == 1) {
                                        i7 -= 2;
                                    }
                                } else {
                                    i7 = i11;
                                }
                            } else {
                                i5 = zzaerVar.zzc;
                                if (i5 > 0) {
                                    i7 = i5 + 1;
                                    if (zzaerVar.zzg == 4 && i7 == 17) {
                                        i7 = 21;
                                    }
                                } else {
                                    i6 = zzaerVar.zzg;
                                    if (i6 == 0) {
                                        i7 = 2;
                                    } else if (i6 != 1) {
                                        i7 = 6;
                                    } else if (i6 != 2) {
                                        i7 = i2;
                                    } else if (i6 != 3) {
                                        i7 = 10;
                                    } else if (i6 != 4) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 33);
                                        sb3.append("AC-4 level ");
                                        sb3.append(i6);
                                        sb3.append(" has not been defined.");
                                        zzef.zzc("Ac4Util", sb3.toString());
                                        i7 = 2;
                                    } else {
                                        i7 = 12;
                                    }
                                }
                            }
                            if (i7 > 0) {
                                throw zzat.zzc("Cannot determine channel count of presentation.");
                            }
                            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzaerVar.zzf), Integer.valueOf(zzaerVar.zzg)};
                            String str3 = zzfk.zza;
                            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzo("audio/ac4");
                            zztVar.zzG(i7);
                            zztVar.zzH(i18);
                            zztVar.zzs(zzqVar);
                            zztVar.zze(str2);
                            zztVar.zzk(str4);
                            return zztVar.zzO();
                        }
                        zzerVar.zzh(2);
                    }
                    zzerVar.zzh(5);
                    zzerVar.zzh(10);
                    if (iZzj5 == 1) {
                        if (iZzj3 > 0) {
                            zzaerVar.zza = zzerVar.zzi();
                        }
                        if (zzaerVar.zza) {
                            if (iZzj3 != 1) {
                                i14 = 2;
                                if (iZzj3 == 2) {
                                    i16 = 2;
                                } else {
                                    i13 = iZzc2;
                                    i16 = iZzj3;
                                }
                                zzerVar.zzh(24);
                                i15 = 1;
                            } else {
                                i16 = 1;
                            }
                            i13 = iZzc2;
                            int iZzj9 = zzerVar.zzj(5);
                            if (iZzj9 >= 0 && iZzj9 <= 15) {
                                zzaerVar.zzb = iZzj9;
                            }
                            if (iZzj9 < 11 || iZzj9 > 14) {
                                i14 = 2;
                            } else {
                                zzaerVar.zzd = zzerVar.zzi();
                                i14 = 2;
                                zzaerVar.zze = zzerVar.zzj(2);
                            }
                            zzerVar.zzh(24);
                            i15 = 1;
                        } else {
                            i13 = iZzc2;
                            i14 = 2;
                            i15 = 1;
                            i16 = iZzj3;
                        }
                        if (iZzj3 == i15 || iZzj3 == i14) {
                            if (zzerVar.zzi() && zzerVar.zzi()) {
                                zzerVar.zzh(i14);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzg();
                                int i20 = 8;
                                int iZzj10 = zzerVar.zzj(8);
                                int i21 = 0;
                                while (i21 < iZzj10) {
                                    zzerVar.zzh(i20);
                                    i21++;
                                    i20 = 8;
                                }
                            }
                        }
                        iZzj3 = i16;
                    } else {
                        i13 = iZzc2;
                    }
                    if (!zZzi && !z2) {
                        zzerVar.zzg();
                        if (iZzj2 == 0 || iZzj2 == 1 || iZzj2 == 2) {
                            if (iZzj3 == 0) {
                                for (int i22 = 0; i22 < 2; i22++) {
                                    zzd(zzerVar, zzaerVar);
                                }
                                iZzj3 = 0;
                            } else {
                                for (int i23 = 0; i23 < 2; i23++) {
                                    zze(zzerVar, zzaerVar);
                                }
                            }
                        } else if (iZzj2 == 3 || iZzj2 == 4) {
                            if (iZzj3 == 0) {
                                for (int i24 = 0; i24 < 3; i24++) {
                                    zzd(zzerVar, zzaerVar);
                                }
                                iZzj3 = 0;
                            } else {
                                for (int i25 = 0; i25 < 3; i25++) {
                                    zze(zzerVar, zzaerVar);
                                }
                            }
                        } else if (iZzj2 != 5) {
                            int iZzj11 = zzerVar.zzj(7);
                            for (int i26 = 0; i26 < iZzj11; i26++) {
                                zzerVar.zzh(8);
                            }
                        } else if (iZzj3 == 0) {
                            zzd(zzerVar, zzaerVar);
                            iZzj3 = 0;
                        } else {
                            int iZzj12 = zzerVar.zzj(3);
                            for (int i27 = 0; i27 < iZzj12 + 2; i27++) {
                                zze(zzerVar, zzaerVar);
                            }
                        }
                    } else if (iZzj3 == 0) {
                        zzd(zzerVar, zzaerVar);
                        iZzj3 = 0;
                    } else {
                        zze(zzerVar, zzaerVar);
                    }
                    zzerVar.zzg();
                    if (!zzerVar.zzi()) {
                        i3 = 7;
                    }
                    if (iZzj3 <= 0) {
                        i = 5;
                    } else {
                        if (!zzerVar.zzi()) {
                        }
                        if (zzerVar.zzi()) {
                            zzerVar.zzm();
                            zzerVar.zzo(zzerVar.zzj(16));
                            i = 5;
                            iZzj4 = zzerVar.zzj(5);
                            while (i17 < iZzj4) {
                                zzerVar.zzh(3);
                                zzerVar.zzh(8);
                            }
                        } else {
                            i = 5;
                        }
                    }
                    i2 = 8;
                    zzerVar.zzm();
                    if (iZzj5 == 1) {
                        iZzc = ((i13 - zzerVar.zzc()) / 8) - i12;
                        if (iZzj < iZzc) {
                            throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                        }
                        zzerVar.zzo(iZzj - iZzc);
                    }
                    if (zzaerVar.zza) {
                        i4 = -1;
                        if (zzaerVar.zzb == -1) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i19).length() + 45);
                            sb4.append("Can't determine channel mode of presentation ");
                            sb4.append(i19);
                            throw zzat.zzc(sb4.toString());
                        }
                    }
                    if (zzaerVar.zza) {
                        i8 = zzaerVar.zzb;
                        z = zzaerVar.zzd;
                        i9 = zzaerVar.zze;
                        switch (i8) {
                            case 0:
                                i10 = 11;
                                i11 = 1;
                                break;
                            case 1:
                                i10 = 11;
                                i11 = 2;
                                break;
                            case 2:
                                i10 = 11;
                                i11 = 3;
                                break;
                            case 3:
                                i11 = i;
                                i10 = 11;
                                break;
                            case 4:
                                i10 = 11;
                                i11 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i11 = i3;
                                i10 = 11;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i11 = i2;
                                i10 = 11;
                                break;
                            case 11:
                                i10 = 11;
                                i11 = 11;
                                break;
                            case 12:
                                i11 = 12;
                                i10 = 11;
                                break;
                            case 13:
                                i11 = 13;
                                i10 = 11;
                                break;
                            case 14:
                                i10 = 11;
                                i11 = 14;
                                break;
                            case 15:
                                i10 = 11;
                                i11 = 24;
                                break;
                            default:
                                i11 = i4;
                                i10 = 11;
                                break;
                        }
                        if (i8 != i10) {
                            if (!z) {
                                i11 -= 2;
                            }
                            i7 = i11;
                            if (i9 == 0) {
                                i7 -= 4;
                            } else if (i9 == 1) {
                                i7 -= 2;
                            }
                        } else {
                            if (!z) {
                                i11 -= 2;
                            }
                            i7 = i11;
                            if (i9 == 0) {
                                i7 -= 4;
                            } else if (i9 == 1) {
                                i7 -= 2;
                            }
                        }
                    } else {
                        i5 = zzaerVar.zzc;
                        if (i5 > 0) {
                            i7 = i5 + 1;
                            if (zzaerVar.zzg == 4) {
                                i7 = 21;
                            }
                        } else {
                            i6 = zzaerVar.zzg;
                            if (i6 == 0) {
                                i7 = 2;
                            } else if (i6 != 1) {
                                i7 = 6;
                            } else if (i6 != 2) {
                                i7 = i2;
                            } else if (i6 != 3) {
                                i7 = 10;
                            } else if (i6 != 4) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(i6).length() + 33);
                                sb5.append("AC-4 level ");
                                sb5.append(i6);
                                sb5.append(" has not been defined.");
                                zzef.zzc("Ac4Util", sb5.toString());
                                i7 = 2;
                            } else {
                                i7 = 12;
                            }
                        }
                    }
                    if (i7 > 0) {
                        throw zzat.zzc("Cannot determine channel count of presentation.");
                    }
                    Object[] objArr2 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaerVar.zzf), Integer.valueOf(zzaerVar.zzg)};
                    String str5 = zzfk.zza;
                    String str6 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr2);
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzo("audio/ac4");
                    zztVar2.zzG(i7);
                    zztVar2.zzH(i18);
                    zztVar2.zzs(zzqVar);
                    zztVar2.zze(str2);
                    zztVar2.zzk(str6);
                    return zztVar2.zzO();
                }
                i13 = iZzc2;
                i3 = 7;
                int iZzj13 = zzerVar.zzj(7);
                for (int i28 = 0; i28 < iZzj13; i28++) {
                    zzerVar.zzh(15);
                }
                if (iZzj3 <= 0) {
                    i = 5;
                } else {
                    if (!zzerVar.zzi()) {
                    }
                    if (zzerVar.zzi()) {
                        zzerVar.zzm();
                        zzerVar.zzo(zzerVar.zzj(16));
                        i = 5;
                        iZzj4 = zzerVar.zzj(5);
                        while (i17 < iZzj4) {
                            zzerVar.zzh(3);
                            zzerVar.zzh(8);
                        }
                    } else {
                        i = 5;
                    }
                }
                i2 = 8;
                zzerVar.zzm();
                if (iZzj5 == 1) {
                    iZzc = ((i13 - zzerVar.zzc()) / 8) - i12;
                    if (iZzj < iZzc) {
                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzerVar.zzo(iZzj - iZzc);
                }
                if (zzaerVar.zza) {
                    i4 = -1;
                    if (zzaerVar.zzb == -1) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i19).length() + 45);
                        sb6.append("Can't determine channel mode of presentation ");
                        sb6.append(i19);
                        throw zzat.zzc(sb6.toString());
                    }
                }
                if (zzaerVar.zza) {
                    i8 = zzaerVar.zzb;
                    z = zzaerVar.zzd;
                    i9 = zzaerVar.zze;
                    switch (i8) {
                        case 0:
                            i10 = 11;
                            i11 = 1;
                            break;
                        case 1:
                            i10 = 11;
                            i11 = 2;
                            break;
                        case 2:
                            i10 = 11;
                            i11 = 3;
                            break;
                        case 3:
                            i11 = i;
                            i10 = 11;
                            break;
                        case 4:
                            i10 = 11;
                            i11 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i11 = i3;
                            i10 = 11;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i11 = i2;
                            i10 = 11;
                            break;
                        case 11:
                            i10 = 11;
                            i11 = 11;
                            break;
                        case 12:
                            i11 = 12;
                            i10 = 11;
                            break;
                        case 13:
                            i11 = 13;
                            i10 = 11;
                            break;
                        case 14:
                            i10 = 11;
                            i11 = 14;
                            break;
                        case 15:
                            i10 = 11;
                            i11 = 24;
                            break;
                        default:
                            i11 = i4;
                            i10 = 11;
                            break;
                    }
                    if (i8 != i10) {
                        if (!z) {
                            i11 -= 2;
                        }
                        i7 = i11;
                        if (i9 == 0) {
                            i7 -= 4;
                        } else if (i9 == 1) {
                            i7 -= 2;
                        }
                    } else {
                        if (!z) {
                            i11 -= 2;
                        }
                        i7 = i11;
                        if (i9 == 0) {
                            i7 -= 4;
                        } else if (i9 == 1) {
                            i7 -= 2;
                        }
                    }
                } else {
                    i5 = zzaerVar.zzc;
                    if (i5 > 0) {
                        i7 = i5 + 1;
                        if (zzaerVar.zzg == 4) {
                            i7 = 21;
                        }
                    } else {
                        i6 = zzaerVar.zzg;
                        if (i6 == 0) {
                            i7 = 2;
                        } else if (i6 != 1) {
                            i7 = 6;
                        } else if (i6 != 2) {
                            i7 = i2;
                        } else if (i6 != 3) {
                            i7 = 10;
                        } else if (i6 != 4) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(i6).length() + 33);
                            sb7.append("AC-4 level ");
                            sb7.append(i6);
                            sb7.append(" has not been defined.");
                            zzef.zzc("Ac4Util", sb7.toString());
                            i7 = 2;
                        } else {
                            i7 = 12;
                        }
                    }
                }
                if (i7 > 0) {
                    throw zzat.zzc("Cannot determine channel count of presentation.");
                }
                Object[] objArr3 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaerVar.zzf), Integer.valueOf(zzaerVar.zzg)};
                String str7 = zzfk.zza;
                String str8 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                zzt zztVar3 = new zzt();
                zztVar3.zza(str);
                zztVar3.zzo("audio/ac4");
                zztVar3.zzG(i7);
                zztVar3.zzH(i18);
                zztVar3.zzs(zzqVar);
                zztVar3.zze(str2);
                zztVar3.zzk(str8);
                return zztVar3.zzO();
            }
            i = 5;
            i2 = 8;
            i3 = 7;
            i4 = -1;
            if (zzaerVar.zza) {
                i8 = zzaerVar.zzb;
                z = zzaerVar.zzd;
                i9 = zzaerVar.zze;
                switch (i8) {
                    case 0:
                        i10 = 11;
                        i11 = 1;
                        break;
                    case 1:
                        i10 = 11;
                        i11 = 2;
                        break;
                    case 2:
                        i10 = 11;
                        i11 = 3;
                        break;
                    case 3:
                        i11 = i;
                        i10 = 11;
                        break;
                    case 4:
                        i10 = 11;
                        i11 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i11 = i3;
                        i10 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i11 = i2;
                        i10 = 11;
                        break;
                    case 11:
                        i10 = 11;
                        i11 = 11;
                        break;
                    case 12:
                        i11 = 12;
                        i10 = 11;
                        break;
                    case 13:
                        i11 = 13;
                        i10 = 11;
                        break;
                    case 14:
                        i10 = 11;
                        i11 = 14;
                        break;
                    case 15:
                        i10 = 11;
                        i11 = 24;
                        break;
                    default:
                        i11 = i4;
                        i10 = 11;
                        break;
                }
                if (i8 != i10) {
                    if (!z) {
                        i11 -= 2;
                    }
                    i7 = i11;
                    if (i9 == 0) {
                        i7 -= 4;
                    } else if (i9 == 1) {
                        i7 -= 2;
                    }
                } else {
                    if (!z) {
                        i11 -= 2;
                    }
                    i7 = i11;
                    if (i9 == 0) {
                        i7 -= 4;
                    } else if (i9 == 1) {
                        i7 -= 2;
                    }
                }
            } else {
                i5 = zzaerVar.zzc;
                if (i5 > 0) {
                    i7 = i5 + 1;
                    if (zzaerVar.zzg == 4) {
                        i7 = 21;
                    }
                } else {
                    i6 = zzaerVar.zzg;
                    if (i6 == 0) {
                        i7 = 2;
                    } else if (i6 != 1) {
                        i7 = 6;
                    } else if (i6 != 2) {
                        i7 = i2;
                    } else if (i6 != 3) {
                        i7 = 10;
                    } else if (i6 != 4) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i6).length() + 33);
                        sb8.append("AC-4 level ");
                        sb8.append(i6);
                        sb8.append(" has not been defined.");
                        zzef.zzc("Ac4Util", sb8.toString());
                        i7 = 2;
                    } else {
                        i7 = 12;
                    }
                }
            }
            if (i7 > 0) {
                throw zzat.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr4 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaerVar.zzf), Integer.valueOf(zzaerVar.zzg)};
            String str9 = zzfk.zza;
            String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr4);
            zzt zztVar4 = new zzt();
            zztVar4.zza(str);
            zztVar4.zzo("audio/ac4");
            zztVar4.zzG(i7);
            zztVar4.zzH(i18);
            zztVar4.zzs(zzqVar);
            zztVar4.zze(str2);
            zztVar4.zzk(str10);
            return zztVar4.zzO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    public static zzaes zzb(zzer zzerVar) {
        int i;
        int iZzj;
        int iZzj2 = zzerVar.zzj(16);
        int iZzj3 = zzerVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzerVar.zzj(24);
            i = 7;
        } else {
            i = 4;
        }
        int i2 = iZzj3 + i;
        if (iZzj2 == 44097) {
            i2 += 2;
        }
        int i3 = i2;
        int iZzj4 = zzerVar.zzj(2);
        int i4 = 0;
        if (iZzj4 == 3) {
            int i5 = 0;
            while (true) {
                iZzj = i5 + zzerVar.zzj(2);
                if (!zzerVar.zzi()) {
                    break;
                }
                i5 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i6 = iZzj4;
        int iZzj5 = zzerVar.zzj(10);
        if (zzerVar.zzi() && zzerVar.zzj(3) > 0) {
            zzerVar.zzh(2);
        }
        int i7 = 44100;
        if (true == zzerVar.zzi()) {
            i7 = 48000;
        }
        int iZzj6 = zzerVar.zzj(4);
        if (i7 == 44100 && iZzj6 == 13) {
            i4 = zzb[13];
        } else if (i7 == 48000 && iZzj6 < 14) {
            i4 = zzb[iZzj6];
            int i8 = iZzj5 % 5;
            if (i8 == 1) {
                if (iZzj6 != 3 || iZzj6 == 8) {
                    i4++;
                }
            } else if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                        i4++;
                    }
                } else if (iZzj6 != 3) {
                    i4++;
                } else {
                    i4++;
                }
            } else if (iZzj6 == 8 || iZzj6 == 11) {
                i4++;
            }
        }
        return new zzaes(i6, 2, i7, i3, i4, null);
    }

    public static void zzc(int i, zzes zzesVar) {
        zzesVar.zza(7);
        byte[] bArrZzi = zzesVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i >> 16) & 255);
        bArrZzi[5] = (byte) ((i >> 8) & 255);
        bArrZzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzer zzerVar, zzaer zzaerVar) throws zzat {
        int iZzj = zzerVar.zzj(5);
        zzerVar.zzh(2);
        if (zzerVar.zzi()) {
            zzerVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzerVar.zzg();
        }
        if (zzerVar.zzi()) {
            int iZzj2 = zzerVar.zzj(3);
            if (zzaerVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzaerVar.zzb = iZzj;
            }
            if (zzerVar.zzi()) {
                zzf(zzerVar);
            }
        }
    }

    private static void zze(zzer zzerVar, zzaer zzaerVar) throws zzat {
        zzerVar.zzh(2);
        boolean zZzi = zzerVar.zzi();
        int iZzj = zzerVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzerVar.zzh(2);
            if (zzerVar.zzi()) {
                zzerVar.zzh(5);
            }
            if (zZzi) {
                zzerVar.zzh(24);
            } else {
                if (zzerVar.zzi()) {
                    if (!zzerVar.zzi()) {
                        zzerVar.zzh(4);
                    }
                    zzaerVar.zzc = zzerVar.zzj(6) + 1;
                }
                zzerVar.zzh(4);
            }
        }
        if (zzerVar.zzi()) {
            zzerVar.zzh(3);
            if (zzerVar.zzi()) {
                zzf(zzerVar);
            }
        }
    }

    private static void zzf(zzer zzerVar) throws zzat {
        int iZzj = zzerVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzerVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzer zzerVar) {
        if (zzerVar.zzc() < 66) {
            return false;
        }
        zzerVar.zzh(66);
        return true;
    }
}
