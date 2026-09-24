package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziff<T> implements zzifu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzigo.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzigh zzm;
    private final zzidc zzn;

    private zziff(int[] iArr, Object[] objArr, int i, int i2, zzifc zzifcVar, boolean z, int[] iArr2, int i3, int i4, zzifi zzifiVar, zzieo zzieoVar, zzigh zzighVar, zzidc zzidcVar, zziex zziexVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzifcVar instanceof zzidr;
        boolean z2 = false;
        if (zzidcVar != null && (zzifcVar instanceof zzidn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzighVar;
        this.zzn = zzidcVar;
        this.zzg = zzifcVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzidr) {
            return ((zzidr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        String.valueOf(strValueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(strValueOf)));
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zzigo.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zzigo.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zzigo.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zzigo.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zzigo.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzB = zzB(i);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zzigo.zzd(obj, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzigo.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzigo.zzj(obj, j2)) != 0;
            case 2:
                return zzigo.zzf(obj, j2) != 0;
            case 3:
                return zzigo.zzf(obj, j2) != 0;
            case 4:
                return zzigo.zzd(obj, j2) != 0;
            case 5:
                return zzigo.zzf(obj, j2) != 0;
            case 6:
                return zzigo.zzd(obj, j2) != 0;
            case 7:
                return zzigo.zzh(obj, j2);
            case 8:
                Object objZzn = zzigo.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzicn) {
                    return !zzicn.zza.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzigo.zzn(obj, j2) != null;
            case 10:
                return !zzicn.zza.equals(zzigo.zzn(obj, j2));
            case 11:
                return zzigo.zzd(obj, j2) != 0;
            case 12:
                return zzigo.zzd(obj, j2) != 0;
            case 13:
                return zzigo.zzd(obj, j2) != 0;
            case 14:
                return zzigo.zzf(obj, j2) != 0;
            case 15:
                return zzigo.zzd(obj, j2) != 0;
            case 16:
                return zzigo.zzf(obj, j2) != 0;
            case 17:
                return zzigo.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int iZzB = zzB(i);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zzigo.zze(obj, j, (1 << (iZzB >>> 20)) | zzigo.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zzigo.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zzigo.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static final int zzT(byte[] bArr, int i, int i2, zzigu zziguVar, Class cls, zzicb zzicbVar) throws IOException {
        zzigu zziguVar2 = zzigu.DOUBLE;
        switch (zziguVar) {
            case DOUBLE:
                int i3 = i + 8;
                zzicbVar.zzc = Double.valueOf(Double.longBitsToDouble(zzicc.zze(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zzicbVar.zzc = Float.valueOf(Float.intBitsToFloat(zzicc.zzd(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int iZzc = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Long.valueOf(zzicbVar.zzb);
                return iZzc;
            case INT32:
            case UINT32:
            case ENUM:
                int iZza = zzicc.zza(bArr, i, zzicbVar);
                zzicbVar.zzc = Integer.valueOf(zzicbVar.zza);
                return iZza;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                zzicbVar.zzc = Long.valueOf(zzicc.zze(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zzicbVar.zzc = Integer.valueOf(zzicc.zzd(bArr, i));
                return i6;
            case BOOL:
                int iZzc2 = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Boolean.valueOf(zzicbVar.zzb != 0);
                return iZzc2;
            case STRING:
                return zzicc.zzf(bArr, i, zzicbVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzicc.zzh(zzifm.zza().zzb(cls), bArr, i, i2, zzicbVar);
            case BYTES:
                return zzicc.zzg(bArr, i, zzicbVar);
            case SINT32:
                int iZza2 = zzicc.zza(bArr, i, zzicbVar);
                zzicbVar.zzc = Integer.valueOf(zzicr.zzM(zzicbVar.zza));
                return iZza2;
            case SINT64:
                int iZzc3 = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Long.valueOf(zzicr.zzN(zzicbVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i, Object obj, zzigw zzigwVar) throws IOException {
        if (obj instanceof String) {
            zzigwVar.zzm(i, (String) obj);
        } else {
            zzigwVar.zzn(i, (zzicn) obj);
        }
    }

    static zzigi zzh(Object obj) {
        zzidr zzidrVar = (zzidr) obj;
        zzigi zzigiVar = zzidrVar.zzt;
        if (zzigiVar != zzigi.zza()) {
            return zzigiVar;
        }
        zzigi zzigiVarZzb = zzigi.zzb();
        zzidrVar.zzt = zzigiVarZzb;
        return zzigiVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0270  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x028d  */
    /* JADX WARN: Code duplicated, block: B:170:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ad  */
    static zziff zzm(Class cls, zziez zziezVar, zzifi zzifiVar, zzieo zzieoVar, zzigh zzighVar, zzidc zzidcVar, zziex zziexVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldZzn;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzn2;
        int i27;
        Object obj2;
        Field fieldZzn3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zziezVar instanceof zzifo)) {
            throw null;
        }
        zzifo zzifoVar = (zzifo) zziezVar;
        String strZzd = zzifoVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzifoVar.zze();
        Class<?> cls2 = zzifoVar.zzb().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strZzd.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strZzd.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i76 = iCharAt11 & 255;
            zzifo zzifoVar2 = zzifoVar;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i67 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (zzifoVar2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i67 / 3;
                        objArr[i85 + i85 + 1] = objArrZze[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i26] = fieldZzn2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i26] = fieldZzn2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = fieldZzn4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zzifoVar2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i67 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i67;
                            int i95 = i67 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = i18 + i18 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzn;
                            }
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn);
                            i19 = iCharAt13 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i101 = i67 / 3;
                    objArr[i101 + i101 + i22] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i102 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i103 = i67 + 2;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i103] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strZzd = strZzd;
            c2 = c;
            zzifoVar = zzifoVar2;
            length = length;
            i7 = i18;
        }
        return new zziff(iArr3, objArr, i2, i4, zzifoVar.zzb(), false, iArr, i5, i62, zzifiVar, zzieoVar, zzighVar, zzidcVar, zziexVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzifu zzifuVarZzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object objZza = zzifuVarZzq.zza();
                    zzifuVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzifuVarZzq.zza();
                zzifuVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzifuVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzifu zzifuVarZzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object objZza = zzifuVarZzq.zza();
                    zzifuVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzifuVarZzq.zza();
                zzifuVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzifuVarZzq.zzd(object2, object);
        }
    }

    private final zzifu zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzifu zzifuVar = (zzifu) objArr[i3];
        if (zzifuVar != null) {
            return zzifuVar;
        }
        zzifu zzifuVarZzb = zzifm.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzifuVarZzb;
        return zzifuVarZzb;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzidx zzs(int i) {
        int i2 = i / 3;
        return (zzidx) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzifu zzifuVarZzq = zzq(i);
        int iZzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzifuVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzifuVarZzq.zza();
        if (object != null) {
            zzifuVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzifu zzifuVarZzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zzifuVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzifuVarZzq.zza();
        if (object != null) {
            zzifuVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzigh zzighVar, Object obj3) {
        zzidx zzidxVarZzs;
        int i2 = this.zzc[i];
        Object objZzn = zzigo.zzn(obj, zzA(i) & 1048575);
        if (objZzn == null || (zzidxVarZzs = zzs(i)) == null) {
            return obj2;
        }
        zzieu zzieuVarZze = ((zziev) zzr(i)).zze();
        Iterator it = ((zziew) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzidxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzighVar.zzh(obj3);
                }
                int iZzc = zziev.zzc(zzieuVarZze, entry.getKey(), entry.getValue());
                zzicn zzicnVar = zzicn.zza;
                byte[] bArr = new byte[iZzc];
                int i3 = zzicw.zzb;
                zzict zzictVar = new zzict(bArr, 0, iZzc);
                try {
                    zziev.zzb(zzictVar, zzieuVarZze, entry.getKey(), entry.getValue());
                    zzighVar.zzd(obj2, i2, zzicj.zza(zzictVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzifu zzifuVar) {
        return zzifuVar.zzl(zzigo.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzifp zzifpVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzigo.zzo(obj, j, zzifpVar.zzn());
        } else if (this.zzi) {
            zzigo.zzo(obj, j, zzifpVar.zzm());
        } else {
            zzigo.zzo(obj, j, zzifpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final Object zza() {
        return ((zzidr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzA = zzA(i);
            long j = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzigo.zzl(obj, j)) != Double.doubleToLongBits(zzigo.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzigo.zzj(obj, j)) != Float.floatToIntBits(zzigo.zzj(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzigo.zzf(obj, j) != zzigo.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzigo.zzf(obj, j) != zzigo.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzigo.zzf(obj, j) != zzigo.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzigo.zzh(obj, j) != zzigo.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzigo.zzf(obj, j) != zzigo.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzigo.zzd(obj, j) != zzigo.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzigo.zzf(obj, j) != zzigo.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzG = zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j));
                    break;
                case 50:
                    zZzG = zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzB = zzB(i) & 1048575;
                    if (zzigo.zzd(obj, jZzB) != zzigo.zzd(obj2, jZzB) || !zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzidr) obj).zzt.equals(((zzidr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzidn) obj).zza.equals(((zzidn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zzc(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int iHashCode = (i4 * 53) + ((zzidr) obj).zzt.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzidn) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i3);
            int i5 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i6 = iArr[i3];
            long j = i5;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzigo.zzl(obj, j));
                    byte[] bArr = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzigo.zzj(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr2 = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr3 = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr4 = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    iFloatToIntBits = zziee.zzb(zzigo.zzh(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    iFloatToIntBits = ((String) zzigo.zzn(obj, j)).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object objZzn = zzigo.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr5 = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr6 = zziee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object objZzn2 = zzigo.zzn(obj, j);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zziee.zzb(zzK(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = ((String) zzigo.zzn(obj, j)).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzI(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zziee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzP(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzifw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzifw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i);
            int i2 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzC) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzigo.zzm(obj, j, zzigo.zzl(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzigo.zzk(obj, j, zzigo.zzj(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzigo.zzi(obj, j, zzigo.zzh(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzied zziedVarZzh = (zzied) zzigo.zzn(obj, j);
                    zzied zziedVar = (zzied) zzigo.zzn(obj2, j);
                    int size = zziedVarZzh.size();
                    int size2 = zziedVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zziedVarZzh.zza()) {
                            zziedVarZzh = zziedVarZzh.zzh(size2 + size);
                        }
                        zziedVarZzh.addAll(zziedVar);
                    }
                    if (size > 0) {
                        zziedVar = zziedVarZzh;
                    }
                    zzigo.zzo(obj, j, zziedVar);
                    break;
                case 50:
                    int i4 = zzifw.zza;
                    zzigo.zzo(obj, j, zziex.zzb(zzigo.zzn(obj, j), zzigo.zzn(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzP(obj2, i3, i)) {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzQ(obj, i3, i);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i3, i)) {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzQ(obj, i3, i);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0390  */
    /* JADX WARN: Code duplicated, block: B:211:0x055a  */
    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zze(Object obj) {
        int i;
        int iZzF;
        int iZzF2;
        int iZzG;
        int iZzF3;
        int iZzF4;
        int iZzF5;
        int iZzc;
        int iZzF6;
        int iZzD;
        int iZzs;
        int size;
        int iZzt;
        int iZzF7;
        int iZzc2;
        int iZzF8;
        int iZzc3;
        int iZzF9;
        int iZzF10;
        int iZzaT;
        int iZzF11;
        int iZzF12;
        int iZzG2;
        int iZzB;
        int iZzF13;
        int iZzF14;
        int iZzE;
        int iZzF15;
        int iZzF16;
        int iZzF17;
        int iZzc4;
        int iZzF18;
        zziff<T> zziffVar = this;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int iZzF19 = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = zziffVar.zzc;
            if (i2 >= iArr.length) {
                int iZzi = iZzF19 + ((zzidr) obj).zzt.zzi();
                if (!zziffVar.zzh) {
                    return iZzi;
                }
                zzigb zzigbVar = ((zzidn) obj).zza.zza;
                int iZzc5 = zzigbVar.zzc();
                int iZzj = 0;
                for (int i5 = 0; i5 < iZzc5; i5++) {
                    Map.Entry entryZzd = zzigbVar.zzd(i5);
                    iZzj += zzidg.zzj((zzidf) ((zzify) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzigbVar.zze()) {
                    iZzj += zzidg.zzj((zzidf) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA = zziffVar.zzA(i2);
            int iZzC = zzC(iZzA);
            int i6 = iArr[i2];
            int i7 = iArr[i2 + 2];
            int i8 = i7 & 1048575;
            if (iZzC <= 17) {
                if (i8 != i4) {
                    i3 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzA & 1048575;
            if (iZzC >= zzidh.DOUBLE_LIST_PACKED.zza()) {
                zzidh.SINT64_LIST_PACKED.zza();
            }
            long j = i9;
            switch (iZzC) {
                case 0:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF19 += zzicw.zzF(i6 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF = zzicw.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 2:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzG(j2);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 3:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzG(j3);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 4:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzG(j4);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 5:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF3 = zzicw.zzF(i6 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 6:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF = zzicw.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 7:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF4 = zzicw.zzF(i6 << 3) + 1;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 8:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzicn) {
                            iZzF5 = zzicw.zzF(i10);
                            iZzc = ((zzicn) object).zzb();
                            iZzF6 = zzicw.zzF(iZzc);
                        } else {
                            iZzF5 = zzicw.zzF(i10);
                            iZzc = zzigt.zzc((String) object);
                            iZzF6 = zzicw.zzF(iZzc);
                        }
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 9:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzD = zzifw.zzD(i6, unsafe.getObject(obj, j), zziffVar.zzq(i2));
                        iZzF19 += iZzD;
                    }
                    break;
                case 10:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        zzicn zzicnVar = (zzicn) unsafe.getObject(obj, j);
                        iZzF5 = zzicw.zzF(i6 << 3);
                        iZzc = zzicnVar.zzb();
                        iZzF6 = zzicw.zzF(iZzc);
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 11:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzF(i11);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 12:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzG(j5);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 13:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF = zzicw.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 14:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzF3 = zzicw.zzF(i6 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 15:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzF((i12 >> 31) ^ (i12 + i12));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 16:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzF2 = zzicw.zzF(i6 << 3);
                        iZzG = zzicw.zzG((j6 >> 63) ^ (j6 + j6));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zziffVar = this;
                    break;
                case 17:
                    if (zziffVar.zzM(obj, i2, i4, i3, i)) {
                        iZzD = zzifw.zzE(i6, (zzifc) unsafe.getObject(obj, j), zziffVar.zzq(i2));
                        iZzF19 += iZzD;
                    }
                    break;
                case 18:
                    iZzD = zzifw.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 19:
                    iZzD = zzifw.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzifw.zza;
                    if (list.size() == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzifw.zzs(list) + (list.size() * zzicw.zzF(i6 << 3));
                    }
                    iZzF19 += iZzs;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zzifw.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzt(list2);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzifw.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzw(list3);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 23:
                    iZzD = zzifw.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 24:
                    iZzD = zzifw.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zzifw.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzD = 0;
                    } else {
                        iZzD = size2 * (zzicw.zzF(i6 << 3) + 1);
                    }
                    iZzF19 += iZzD;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i17 = zzifw.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzicw.zzF(i6 << 3) * size3;
                        if (list5 instanceof zzien) {
                            zzien zzienVar = (zzien) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object objZzc = zzienVar.zzc();
                                if (objZzc instanceof zzicn) {
                                    iZzc3 = ((zzicn) objZzc).zzb();
                                    iZzF9 = zzicw.zzF(iZzc3);
                                } else {
                                    iZzc3 = zzigt.zzc((String) objZzc);
                                    iZzF9 = zzicw.zzF(iZzc3);
                                }
                                iZzs += iZzF9 + iZzc3;
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof zzicn) {
                                    iZzc2 = ((zzicn) obj2).zzb();
                                    iZzF8 = zzicw.zzF(iZzc2);
                                } else {
                                    iZzc2 = zzigt.zzc((String) obj2);
                                    iZzF8 = zzicw.zzF(iZzc2);
                                }
                                iZzs += iZzF8 + iZzc2;
                            }
                        }
                    }
                    iZzF19 += iZzs;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzifu zzifuVarZzq = zziffVar.zzq(i2);
                    int i20 = zzifw.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzF10 = 0;
                    } else {
                        iZzF10 = zzicw.zzF(i6 << 3) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj3 = list6.get(i21);
                            if (obj3 instanceof zziem) {
                                iZzaT = ((zziem) obj3).zzb();
                                iZzF11 = zzicw.zzF(iZzaT);
                            } else {
                                iZzaT = ((zzibw) obj3).zzaT(zzifuVarZzq);
                                iZzF11 = zzicw.zzF(iZzaT);
                            }
                            iZzF10 += iZzF11 + iZzaT;
                        }
                    }
                    iZzF19 += iZzF10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zzifw.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzF12 = 0;
                    } else {
                        iZzF12 = size5 * zzicw.zzF(i6 << 3);
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzb = ((zzicn) list7.get(i23)).zzb();
                            iZzF12 += zzicw.zzF(iZzb) + iZzb;
                        }
                    }
                    iZzF19 += iZzF12;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzifw.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzx(list8);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzifw.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzv(list9);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 31:
                    iZzD = zzifw.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 32:
                    iZzD = zzifw.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF19 += iZzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i26 = zzifw.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzy(list10);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i27 = zzifw.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzifw.zzu(list11);
                        iZzF7 = zzicw.zzF(i6 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 35:
                    iZzB = zzifw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 36:
                    iZzB = zzifw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 37:
                    iZzB = zzifw.zzs((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 38:
                    iZzB = zzifw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 39:
                    iZzB = zzifw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 40:
                    iZzB = zzifw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 41:
                    iZzB = zzifw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i28 = zzifw.zza;
                    iZzB = list12.size();
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 43:
                    iZzB = zzifw.zzx((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 44:
                    iZzB = zzifw.zzv((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 45:
                    iZzB = zzifw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 46:
                    iZzB = zzifw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 47:
                    iZzB = zzifw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 48:
                    iZzB = zzifw.zzu((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF13 = zzicw.zzF(i6 << 3);
                        iZzF14 = zzicw.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzifu zzifuVarZzq2 = zziffVar.zzq(i2);
                    int i29 = zzifw.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzE = 0;
                    } else {
                        iZzE = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iZzE += zzifw.zzE(i6, (zzifc) list13.get(i30), zzifuVarZzq2);
                        }
                    }
                    iZzF19 += iZzE;
                    break;
                case 50:
                    zziew zziewVar = (zziew) unsafe.getObject(obj, j);
                    zziev zzievVar = (zziev) zziffVar.zzr(i2);
                    if (zziewVar.isEmpty()) {
                        iZzs = 0;
                    } else {
                        iZzs = 0;
                        for (Map.Entry entry2 : zziewVar.entrySet()) {
                            iZzs += zzievVar.zzd(i6, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzF19 += iZzs;
                    break;
                case 51:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF15 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case 52:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF16 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 53:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        long jZzJ = zzJ(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzG(jZzJ);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 54:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        long jZzJ2 = zzJ(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzG(jZzJ2);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 55:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        long jZzI = zzI(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzG(jZzI);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 56:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF15 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case 57:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF16 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 58:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzD = zzicw.zzF(i6 << 3) + 1;
                        iZzF19 += iZzD;
                    }
                    break;
                case 59:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        int i31 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzicn) {
                            iZzF17 = zzicw.zzF(i31);
                            iZzc4 = ((zzicn) object2).zzb();
                            iZzF18 = zzicw.zzF(iZzc4);
                        } else {
                            iZzF17 = zzicw.zzF(i31);
                            iZzc4 = zzigt.zzc((String) object2);
                            iZzF18 = zzicw.zzF(iZzc4);
                        }
                        iZzD = iZzF17 + iZzF18 + iZzc4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 60:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzD = zzifw.zzD(i6, unsafe.getObject(obj, j), zziffVar.zzq(i2));
                        iZzF19 += iZzD;
                    }
                    break;
                case 61:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        zzicn zzicnVar2 = (zzicn) unsafe.getObject(obj, j);
                        iZzF17 = zzicw.zzF(i6 << 3);
                        iZzc4 = zzicnVar2.zzb();
                        iZzF18 = zzicw.zzF(iZzc4);
                        iZzD = iZzF17 + iZzF18 + iZzc4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 62:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        int iZzI = zzI(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzF(iZzI);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 63:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        long jZzI2 = zzI(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzG(jZzI2);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 64:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF16 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 65:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzF15 = zzicw.zzF(i6 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case 66:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        int iZzI2 = zzI(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzF((iZzI2 >> 31) ^ (iZzI2 + iZzI2));
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 67:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        long jZzJ3 = zzJ(obj, j);
                        iZzt = zzicw.zzF(i6 << 3);
                        iZzG2 = zzicw.zzG((jZzJ3 >> 63) ^ (jZzJ3 + jZzJ3));
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 68:
                    if (zziffVar.zzP(obj, i6, i2)) {
                        iZzD = zzifw.zzE(i6, (zzifc) unsafe.getObject(obj, j), zziffVar.zzq(i2));
                        iZzF19 += iZzD;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzf(Object obj, zzigw zzigwVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        zziff<T> zziffVar = this;
        if (zziffVar.zzh) {
            zzidg zzidgVar = ((zzidn) obj).zza;
            if (zzidgVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzidgVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zziffVar.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr.length) {
            int iZzA = zziffVar.zzA(i6);
            int iZzC = zzC(iZzA);
            int i8 = iArr[i6];
            if (iZzC <= 17) {
                int i9 = iArr[i6 + 2];
                z = true;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i7;
                i3 = 1 << (i9 >>> 20);
            } else {
                z = true;
                i = i5;
                i2 = i7;
                i3 = 0;
            }
            while (true) {
                if (entry != null) {
                    zzidc zzidcVar = zziffVar.zzn;
                    i4 = i4;
                    if (((zzido) entry.getKey()).zza <= i8) {
                        zzidcVar.zzb(zzigwVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i4 = i4;
                }
            }
            long j = iZzA & i4;
            switch (iZzC) {
                case 0:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzf(i8, zzigo.zzl(obj, j));
                    }
                    break;
                case 1:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zze(i8, zzigo.zzj(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 2:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzc(i8, unsafe.getLong(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 3:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzh(i8, unsafe.getLong(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 4:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 5:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzj(i8, unsafe.getLong(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 6:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 7:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzl(i8, zzigo.zzh(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 8:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzU(i8, unsafe.getObject(obj, j), zzigwVar);
                    }
                    zziffVar = this;
                    break;
                case 9:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzr(i8, unsafe.getObject(obj, j), zziffVar.zzq(i6));
                    }
                    break;
                case 10:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzn(i8, (zzicn) unsafe.getObject(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 11:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzo(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 12:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzg(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 13:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzb(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 14:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzd(i8, unsafe.getLong(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 15:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzp(i8, unsafe.getInt(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 16:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzq(i8, unsafe.getLong(obj, j));
                    }
                    zziffVar = this;
                    break;
                case 17:
                    if (zziffVar.zzM(obj, i6, i, i2, i3)) {
                        zzigwVar.zzs(i8, unsafe.getObject(obj, j), zziffVar.zzq(i6));
                    }
                    break;
                case 18:
                    zzifw.zza(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 19:
                    zzifw.zzb(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 20:
                    zzifw.zzc(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 21:
                    zzifw.zzd(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 22:
                    zzifw.zzh(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 23:
                    zzifw.zzf(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 24:
                    zzifw.zzk(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 25:
                    zzifw.zzn(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 26:
                    zzifw.zzo(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar);
                    break;
                case 27:
                    zzifw.zzq(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, zziffVar.zzq(i6));
                    break;
                case 28:
                    zzifw.zzp(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar);
                    break;
                case 29:
                    zzifw.zzi(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 30:
                    zzifw.zzm(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 31:
                    zzifw.zzl(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 32:
                    zzifw.zzg(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 33:
                    zzifw.zzj(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 34:
                    zzifw.zze(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, false);
                    break;
                case 35:
                    zzifw.zza(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 36:
                    zzifw.zzb(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 37:
                    zzifw.zzc(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 38:
                    zzifw.zzd(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 39:
                    zzifw.zzh(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 40:
                    zzifw.zzf(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 41:
                    zzifw.zzk(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 42:
                    zzifw.zzn(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 43:
                    zzifw.zzi(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 44:
                    zzifw.zzm(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 45:
                    zzifw.zzl(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 46:
                    zzifw.zzg(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 47:
                    zzifw.zzj(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 48:
                    zzifw.zze(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, z);
                    break;
                case 49:
                    zzifw.zzr(iArr[i6], (List) unsafe.getObject(obj, j), zzigwVar, zziffVar.zzq(i6));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zzigwVar.zzM(i8, ((zziev) zziffVar.zzr(i6)).zze(), (zziew) object);
                    }
                    break;
                case 51:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzf(i8, zzG(obj, j));
                    }
                    break;
                case 52:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zze(i8, zzH(obj, j));
                    }
                    break;
                case 53:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzc(i8, zzJ(obj, j));
                    }
                    break;
                case 54:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzh(i8, zzJ(obj, j));
                    }
                    break;
                case 55:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzi(i8, zzI(obj, j));
                    }
                    break;
                case 56:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzj(i8, zzJ(obj, j));
                    }
                    break;
                case 57:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzk(i8, zzI(obj, j));
                    }
                    break;
                case 58:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzl(i8, zzK(obj, j));
                    }
                    break;
                case 59:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzU(i8, unsafe.getObject(obj, j), zzigwVar);
                    }
                    break;
                case 60:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzr(i8, unsafe.getObject(obj, j), zziffVar.zzq(i6));
                    }
                    break;
                case 61:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzn(i8, (zzicn) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzo(i8, zzI(obj, j));
                    }
                    break;
                case 63:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzg(i8, zzI(obj, j));
                    }
                    break;
                case 64:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzb(i8, zzI(obj, j));
                    }
                    break;
                case 65:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzd(i8, zzJ(obj, j));
                    }
                    break;
                case 66:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzp(i8, zzI(obj, j));
                    }
                    break;
                case 67:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzq(i8, zzJ(obj, j));
                    }
                    break;
                case 68:
                    if (zziffVar.zzP(obj, i8, i6)) {
                        zzigwVar.zzs(i8, unsafe.getObject(obj, j), zziffVar.zzq(i6));
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i7 = i2;
            i4 = i4;
            i5 = i;
            entry = entry;
        }
        while (entry != null) {
            zziffVar.zzn.zzb(zzigwVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzidr) obj).zzt.zzg(zzigwVar);
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0585 A[LOOP:3: B:182:0x0581->B:184:0x0585, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0595  */
    /* JADX WARN: Code duplicated, block: B:195:0x05a8 A[LOOP:1: B:193:0x05a4->B:195:0x05a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:209:0x0570 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzg(Object obj, zzifp zzifpVar, zzidb zzidbVar) throws Throwable {
        zziff<T> zziffVar;
        Object obj2;
        Throwable th;
        int i;
        Object objZzx;
        zzigh zzighVar;
        Object objZzx2;
        Object obj3;
        int i2;
        zzidbVar.getClass();
        zzF(obj);
        zzigh zzighVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzifpVar.zzb();
                int iZzR = zzR(iZzb);
                if (iZzR >= 0) {
                    obj3 = obj;
                    zziffVar = this;
                    try {
                        int iZzA = zzA(iZzR);
                        try {
                            switch (zzC(iZzA)) {
                                case 0:
                                    obj2 = obj3;
                                    zzigo.zzm(obj2, iZzA & 1048575, zzifpVar.zze());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 1:
                                    obj2 = obj3;
                                    zzigo.zzk(obj2, iZzA & 1048575, zzifpVar.zzf());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 2:
                                    obj2 = obj3;
                                    zzigo.zzg(obj2, iZzA & 1048575, zzifpVar.zzh());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 3:
                                    obj2 = obj3;
                                    zzigo.zzg(obj2, iZzA & 1048575, zzifpVar.zzg());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 4:
                                    obj2 = obj3;
                                    zzigo.zze(obj2, iZzA & 1048575, zzifpVar.zzi());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 5:
                                    obj2 = obj3;
                                    zzigo.zzg(obj2, iZzA & 1048575, zzifpVar.zzj());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 6:
                                    obj2 = obj3;
                                    zzigo.zze(obj2, iZzA & 1048575, zzifpVar.zzk());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 7:
                                    obj2 = obj3;
                                    zzigo.zzi(obj2, iZzA & 1048575, zzifpVar.zzl());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 8:
                                    obj2 = obj3;
                                    zzz(obj2, iZzA, zzifpVar);
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 9:
                                    obj2 = obj3;
                                    zzifc zzifcVar = (zzifc) zzt(obj2, iZzR);
                                    zzifpVar.zzo(zzifcVar, zzq(iZzR), zzidbVar);
                                    zzu(obj2, iZzR, zzifcVar);
                                    obj = obj2;
                                    break;
                                case 10:
                                    obj2 = obj3;
                                    zzigo.zzo(obj2, iZzA & 1048575, zzifpVar.zzq());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 11:
                                    obj2 = obj3;
                                    zzigo.zze(obj2, iZzA & 1048575, zzifpVar.zzr());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 12:
                                    obj2 = obj3;
                                    int iZzs = zzifpVar.zzs();
                                    zzidx zzidxVarZzs = zzs(iZzR);
                                    if (zzidxVarZzs == null || zzidxVarZzs.zza(iZzs)) {
                                        zzigo.zze(obj2, iZzA & 1048575, iZzs);
                                        zzO(obj2, iZzR);
                                    } else {
                                        objZzh = zzifw.zzK(obj2, iZzb, iZzs, objZzh, zzighVar2);
                                    }
                                    obj = obj2;
                                    break;
                                case 13:
                                    obj2 = obj3;
                                    zzigo.zze(obj2, iZzA & 1048575, zzifpVar.zzt());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 14:
                                    obj2 = obj3;
                                    zzigo.zzg(obj2, iZzA & 1048575, zzifpVar.zzu());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 15:
                                    obj2 = obj3;
                                    zzigo.zze(obj2, iZzA & 1048575, zzifpVar.zzv());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 16:
                                    obj2 = obj3;
                                    zzigo.zzg(obj2, iZzA & 1048575, zzifpVar.zzw());
                                    zzO(obj2, iZzR);
                                    obj = obj2;
                                    break;
                                case 17:
                                    obj2 = obj3;
                                    zzifc zzifcVar2 = (zzifc) zzt(obj2, iZzR);
                                    zzifpVar.zzp(zzifcVar2, zzq(iZzR), zzidbVar);
                                    zzu(obj2, iZzR, zzifcVar2);
                                    obj = obj2;
                                    break;
                                case 18:
                                    obj2 = obj3;
                                    zzifpVar.zzx(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 19:
                                    obj2 = obj3;
                                    zzifpVar.zzy(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 20:
                                    obj2 = obj3;
                                    zzifpVar.zzA(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 21:
                                    obj2 = obj3;
                                    zzifpVar.zzz(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 22:
                                    obj2 = obj3;
                                    zzifpVar.zzB(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 23:
                                    obj2 = obj3;
                                    zzifpVar.zzC(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 24:
                                    obj2 = obj3;
                                    zzifpVar.zzD(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 25:
                                    obj2 = obj3;
                                    zzifpVar.zzE(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 26:
                                    obj2 = obj3;
                                    if (zzD(iZzA)) {
                                        ((zzics) zzifpVar).zzF(zzieo.zza(obj2, iZzA & 1048575), true);
                                    } else {
                                        ((zzics) zzifpVar).zzF(zzieo.zza(obj2, iZzA & 1048575), false);
                                    }
                                    obj = obj2;
                                    break;
                                case 27:
                                    obj2 = obj3;
                                    zzifpVar.zzG(zzieo.zza(obj2, iZzA & 1048575), zzq(iZzR), zzidbVar);
                                    obj = obj2;
                                    break;
                                case 28:
                                    obj2 = obj3;
                                    zzifpVar.zzI(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 29:
                                    obj2 = obj3;
                                    zzifpVar.zzJ(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 30:
                                    List listZza = zzieo.zza(obj3, iZzA & 1048575);
                                    zzifpVar.zzK(listZza);
                                    objZzh = zzifw.zzJ(obj3, iZzb, listZza, zzs(iZzR), objZzh, zzighVar2);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 31:
                                    obj2 = obj3;
                                    zzifpVar.zzL(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 32:
                                    obj2 = obj3;
                                    zzifpVar.zzM(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 33:
                                    obj2 = obj3;
                                    zzifpVar.zzN(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 34:
                                    obj2 = obj3;
                                    zzifpVar.zzO(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 35:
                                    obj2 = obj3;
                                    zzifpVar.zzx(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 36:
                                    obj2 = obj3;
                                    zzifpVar.zzy(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 37:
                                    obj2 = obj3;
                                    zzifpVar.zzA(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 38:
                                    obj2 = obj3;
                                    zzifpVar.zzz(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 39:
                                    obj2 = obj3;
                                    zzifpVar.zzB(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 40:
                                    obj2 = obj3;
                                    zzifpVar.zzC(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 41:
                                    obj2 = obj3;
                                    zzifpVar.zzD(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 42:
                                    obj2 = obj3;
                                    zzifpVar.zzE(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 43:
                                    obj2 = obj3;
                                    zzifpVar.zzJ(zzieo.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 44:
                                    try {
                                        List listZza2 = zzieo.zza(obj3, iZzA & 1048575);
                                        zzifpVar.zzK(listZza2);
                                        try {
                                            objZzh = zzifw.zzJ(obj3, iZzb, listZza2, zzs(iZzR), objZzh, zzighVar2);
                                            obj2 = obj3;
                                        } catch (zzief unused) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzighVar2.zzh(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    i = zziffVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i < zziffVar.zzl) {
                                                        zzigh zzighVar3 = zzighVar2;
                                                        objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar3, obj2);
                                                        i++;
                                                        zziffVar = this;
                                                        zzighVar2 = zzighVar3;
                                                    }
                                                    zzighVar = zzighVar2;
                                                    if (objZzx != null) {
                                                        throw th;
                                                    }
                                                    zzighVar.zzi(obj2, objZzx);
                                                    throw th;
                                                }
                                            }
                                            if (!zzighVar2.zzk(objZzh, zzifpVar, 0)) {
                                                objZzx2 = objZzh;
                                                for (i2 = zziffVar.zzk; i2 < zziffVar.zzl; i2++) {
                                                    zzigh zzighVar4 = zzighVar2;
                                                    objZzx2 = zziffVar.zzx(obj2, zziffVar.zzj[i2], objZzx2, zzighVar4, obj2);
                                                    zzighVar2 = zzighVar4;
                                                }
                                                if (objZzx2 != null) {
                                                    zzighVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj3;
                                            th = th;
                                            zziffVar = zziffVar;
                                            i = zziffVar.zzk;
                                            objZzx = objZzh;
                                            while (i < zziffVar.zzl) {
                                                zzigh zzighVar5 = zzighVar2;
                                                objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar5, obj2);
                                                i++;
                                                zziffVar = this;
                                                zzighVar2 = zzighVar5;
                                            }
                                            zzighVar = zzighVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzighVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj3;
                                    }
                                    break;
                                case 45:
                                    zzifpVar.zzL(zzieo.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 46:
                                    zzifpVar.zzM(zzieo.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 47:
                                    zzifpVar.zzN(zzieo.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 48:
                                    zzifpVar.zzO(zzieo.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 49:
                                    zzifpVar.zzH(zzieo.zza(obj3, iZzA & 1048575), zzq(iZzR), zzidbVar);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 50:
                                    Object objZzr = zzr(iZzR);
                                    long jZzA = zzA(iZzR) & 1048575;
                                    Object objZzn = zzigo.zzn(obj3, jZzA);
                                    if (objZzn == null) {
                                        objZzn = zziew.zza().zzc();
                                        zzigo.zzo(obj3, jZzA, objZzn);
                                    } else if (zziex.zza(objZzn)) {
                                        Object objZzc = zziew.zza().zzc();
                                        zziex.zzb(objZzc, objZzn);
                                        zzigo.zzo(obj3, jZzA, objZzc);
                                        objZzn = objZzc;
                                    }
                                    zzifpVar.zzP((zziew) objZzn, ((zziev) objZzr).zze(), zzidbVar);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 51:
                                    zzigo.zzo(obj3, iZzA & 1048575, Double.valueOf(zzifpVar.zze()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 52:
                                    zzigo.zzo(obj3, iZzA & 1048575, Float.valueOf(zzifpVar.zzf()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 53:
                                    zzigo.zzo(obj3, iZzA & 1048575, Long.valueOf(zzifpVar.zzh()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 54:
                                    zzigo.zzo(obj3, iZzA & 1048575, Long.valueOf(zzifpVar.zzg()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 55:
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzifpVar.zzi()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 56:
                                    zzigo.zzo(obj3, iZzA & 1048575, Long.valueOf(zzifpVar.zzj()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 57:
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzifpVar.zzk()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 58:
                                    zzigo.zzo(obj3, iZzA & 1048575, Boolean.valueOf(zzifpVar.zzl()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 59:
                                    zzz(obj3, iZzA, zzifpVar);
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 60:
                                    zzifc zzifcVar3 = (zzifc) zzv(obj3, iZzb, iZzR);
                                    zzifpVar.zzo(zzifcVar3, zzq(iZzR), zzidbVar);
                                    zzw(obj3, iZzb, iZzR, zzifcVar3);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 61:
                                    zzigo.zzo(obj3, iZzA & 1048575, zzifpVar.zzq());
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 62:
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzifpVar.zzr()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 63:
                                    int iZzs2 = zzifpVar.zzs();
                                    zzidx zzidxVarZzs2 = zzs(iZzR);
                                    if (zzidxVarZzs2 != null && !zzidxVarZzs2.zza(iZzs2)) {
                                        objZzh = zzifw.zzK(obj3, iZzb, iZzs2, objZzh, zzighVar2);
                                        obj = obj3;
                                    }
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 64:
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzifpVar.zzt()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 65:
                                    zzigo.zzo(obj3, iZzA & 1048575, Long.valueOf(zzifpVar.zzu()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 66:
                                    zzigo.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzifpVar.zzv()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 67:
                                    zzigo.zzo(obj3, iZzA & 1048575, Long.valueOf(zzifpVar.zzw()));
                                    zzQ(obj3, iZzb, iZzR);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 68:
                                    try {
                                        zzifc zzifcVar4 = (zzifc) zzv(obj3, iZzb, iZzR);
                                        zzifpVar.zzp(zzifcVar4, zzq(iZzR), zzidbVar);
                                        zzw(obj3, iZzb, iZzR, zzifcVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        zziffVar = zziffVar;
                                        obj2 = obj3;
                                        i = zziffVar.zzk;
                                        objZzx = objZzh;
                                        while (i < zziffVar.zzl) {
                                            zzigh zzighVar6 = zzighVar2;
                                            objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar6, obj2);
                                            i++;
                                            zziffVar = this;
                                            zzighVar2 = zzighVar6;
                                        }
                                        zzighVar = zzighVar2;
                                        if (objZzx != null) {
                                            throw th;
                                        }
                                        zzighVar.zzi(obj2, objZzx);
                                        throw th;
                                    }
                                    break;
                                default:
                                    obj2 = obj3;
                                    if (objZzh == null) {
                                        try {
                                            try {
                                                objZzh = zzighVar2.zzh(obj2);
                                            } catch (zzief unused2) {
                                                if (objZzh == null) {
                                                    objZzh = zzighVar2.zzh(obj2);
                                                }
                                                if (!zzighVar2.zzk(objZzh, zzifpVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    while (i2 < zziffVar.zzl) {
                                                        zzigh zzighVar7 = zzighVar2;
                                                        objZzx2 = zziffVar.zzx(obj2, zziffVar.zzj[i2], objZzx2, zzighVar7, obj2);
                                                        zzighVar2 = zzighVar7;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzighVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            zziffVar = zziffVar;
                                            i = zziffVar.zzk;
                                            objZzx = objZzh;
                                            while (i < zziffVar.zzl) {
                                                zzigh zzighVar8 = zzighVar2;
                                                objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar8, obj2);
                                                i++;
                                                zziffVar = this;
                                                zzighVar2 = zzighVar8;
                                            }
                                            zzighVar = zzighVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzighVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                    }
                                    try {
                                        if (zzighVar2.zzk(objZzh, zzifpVar, 0)) {
                                            obj = obj2;
                                        } else {
                                            objZzx2 = objZzh;
                                            for (int i3 = zziffVar.zzk; i3 < zziffVar.zzl; i3++) {
                                                zzigh zzighVar9 = zzighVar2;
                                                objZzx2 = zziffVar.zzx(obj2, zziffVar.zzj[i3], objZzx2, zzighVar9, obj2);
                                                zzighVar2 = zzighVar9;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        zziffVar = zziffVar;
                                        th = th;
                                        i = zziffVar.zzk;
                                        objZzx = objZzh;
                                        while (i < zziffVar.zzl) {
                                            zzigh zzighVar10 = zzighVar2;
                                            objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar10, obj2);
                                            i++;
                                            zziffVar = this;
                                            zzighVar2 = zzighVar10;
                                        }
                                        zzighVar = zzighVar2;
                                        if (objZzx != null) {
                                            throw th;
                                        }
                                        zzighVar.zzi(obj2, objZzx);
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (zzief unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zziffVar = zziffVar;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzigh zzighVar11 = zzighVar2;
                        objZzx2 = zzx(obj, this.zzj[i4], objZzx2, zzighVar11, obj);
                        zzighVar2 = zzighVar11;
                    }
                    obj2 = obj;
                } else {
                    zziffVar = this;
                    try {
                        if ((!zziffVar.zzh ? null : zzidbVar.zzc(zziffVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zziffVar = zziffVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzighVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i = zziffVar.zzk;
                                objZzx = objZzh;
                                while (i < zziffVar.zzl) {
                                    zzigh zzighVar12 = zzighVar2;
                                    objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar12, obj2);
                                    i++;
                                    zziffVar = this;
                                    zzighVar2 = zzighVar12;
                                }
                                zzighVar = zzighVar2;
                                if (objZzx != null) {
                                    throw th;
                                }
                                zzighVar.zzi(obj2, objZzx);
                                throw th;
                            }
                        }
                        try {
                            if (zzighVar2.zzk(objZzh, zzifpVar, 0)) {
                                obj3 = obj;
                                obj = obj3;
                            } else {
                                int i5 = zziffVar.zzk;
                                objZzx2 = objZzh;
                                while (i5 < zziffVar.zzl) {
                                    zzigh zzighVar13 = zzighVar2;
                                    Object obj4 = obj;
                                    objZzx2 = zziffVar.zzx(obj4, zziffVar.zzj[i5], objZzx2, zzighVar13, obj);
                                    zzighVar2 = zzighVar13;
                                    i5++;
                                    obj = obj4;
                                }
                                obj2 = obj;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj3 = obj;
                            zziffVar = zziffVar;
                            th = th;
                            zziffVar = zziffVar;
                            obj2 = obj3;
                            i = zziffVar.zzk;
                            objZzx = objZzh;
                            while (i < zziffVar.zzl) {
                                zzigh zzighVar14 = zzighVar2;
                                objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar14, obj2);
                                i++;
                                zziffVar = this;
                                zzighVar2 = zzighVar14;
                            }
                            zzighVar = zzighVar2;
                            if (objZzx != null) {
                                throw th;
                            }
                            zzighVar.zzi(obj2, objZzx);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        obj3 = obj;
                        th = th11;
                        obj2 = obj3;
                        i = zziffVar.zzk;
                        objZzx = objZzh;
                        while (i < zziffVar.zzl) {
                            zzigh zzighVar15 = zzighVar2;
                            objZzx = zziffVar.zzx(obj2, zziffVar.zzj[i], objZzx, zzighVar15, obj2);
                            i++;
                            zziffVar = this;
                            zzighVar2 = zzighVar15;
                        }
                        zzighVar = zzighVar2;
                        if (objZzx != null) {
                            throw th;
                        }
                        zzighVar.zzi(obj2, objZzx);
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                zziffVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzighVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zzicb r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziff.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzicb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzicb zzicbVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzicbVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzidr) {
                zzidr zzidrVar = (zzidr) obj;
                zzidrVar.zzbq();
                zzidrVar.zzbb();
                zzidrVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzA = zzA(i);
                int i2 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j = i2;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzq(i).zzk(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzied) zzigo.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zziew) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzP(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5 A[LOOP:2: B:52:0x00d4->B:57:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzifu zzifuVarZzq;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzA = zzA(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i12;
            }
            if ((268435456 & iZzA) != 0 && !zzM(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzM(obj, i7, i, i2, i11) && !zzy(obj, iZzA, zzq(i7))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzigo.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzifuVarZzq = zzq(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzifuVarZzq.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzP(obj, i8, i7) && !zzy(obj, iZzA, zzq(i7))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzigo.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzifuVarZzq = zzq(i7);
                    while (i3 < list.size()) {
                        if (!zzifuVarZzq.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zziew zziewVar = (zziew) zzigo.zzn(obj, iZzA & 1048575);
                if (!zziewVar.isEmpty() && ((zziev) zzr(i7)).zze().zzc.zza() == zzigv.MESSAGE) {
                    zzifu zzifuVarZzb = null;
                    for (Object obj2 : zziewVar.values()) {
                        if (zzifuVarZzb == null) {
                            zzifuVarZzb = zzifm.zza().zzb(obj2.getClass());
                        }
                        if (!zzifuVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzidn) obj).zza.zze();
    }
}
