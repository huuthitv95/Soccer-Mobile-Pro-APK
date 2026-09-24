package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznk<T> implements zzns<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzol.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznh zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoe zzl;
    private final zzlq zzm;

    private zznk(int[] iArr, Object[] objArr, int i, int i2, zznh zznhVar, boolean z, int[] iArr2, int i3, int i4, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlqVar != null && (zznhVar instanceof zzma)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoeVar;
        this.zzm = zzlqVar;
        this.zzg = zznhVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzns zznsVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zznsVarZzv.zze();
                    zznsVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zznsVarZzv.zze();
                zznsVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zznsVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzns zznsVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zznsVarZzv.zze();
                    zznsVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zznsVarZzv.zze();
                zznsVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zznsVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzol.zzq(obj, j, (1 << (iZzp >>> 20)) | zzol.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzol.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzol.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzol.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzol.zzb(obj, j2)) != 0;
            case 2:
                return zzol.zzd(obj, j2) != 0;
            case 3:
                return zzol.zzd(obj, j2) != 0;
            case 4:
                return zzol.zzc(obj, j2) != 0;
            case 5:
                return zzol.zzd(obj, j2) != 0;
            case 6:
                return zzol.zzc(obj, j2) != 0;
            case 7:
                return zzol.zzw(obj, j2);
            case 8:
                Object objZzf = zzol.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzld) {
                    return !zzld.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzol.zzf(obj, j2) != null;
            case 10:
                return !zzld.zzb.equals(zzol.zzf(obj, j2));
            case 11:
                return zzol.zzc(obj, j2) != 0;
            case 12:
                return zzol.zzc(obj, j2) != 0;
            case 13:
                return zzol.zzc(obj, j2) != 0;
            case 14:
                return zzol.zzd(obj, j2) != 0;
            case 15:
                return zzol.zzc(obj, j2) != 0;
            case 16:
                return zzol.zzd(obj, j2) != 0;
            case 17:
                return zzol.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzns zznsVar) {
        return zznsVar.zzk(zzol.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmd) {
            return ((zzmd) obj).zzcw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzol.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzol.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzor zzorVar) throws IOException {
        if (obj instanceof String) {
            zzorVar.zzG(i, (String) obj);
        } else {
            zzorVar.zzd(i, (zzld) obj);
        }
    }

    static zzof zzd(Object obj) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        if (zzofVar != zzof.zzc()) {
            return zzofVar;
        }
        zzof zzofVarZzf = zzof.zzf();
        zzmdVar.zzc = zzofVarZzf;
        return zzofVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0270  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x028d  */
    /* JADX WARN: Code duplicated, block: B:170:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ad  */
    static zznk zzl(Class cls, zzne zzneVar, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
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
        Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzz2;
        int i27;
        Object obj2;
        Field fieldZzz3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzneVar instanceof zznr)) {
            throw null;
        }
        zznr zznrVar = (zznr) zzneVar;
        String strZzd = zznrVar.zzd();
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
        Object[] objArrZze = zznrVar.zze();
        Class<?> cls2 = zznrVar.zza().getClass();
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
            zznr zznrVar2 = zznrVar;
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
                    } else if (zznrVar2.zzc() == 1 || i77 != 0) {
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
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i26] = fieldZzz2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i26] = fieldZzz2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = fieldZzz4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zznrVar2.zzc() == 1 || i77 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzz;
                            }
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
            zznrVar = zznrVar2;
            length = length;
            i7 = i18;
        }
        return new zznk(iArr3, objArr, i2, i4, zznrVar.zza(), false, iArr, i5, i62, zznmVar, zzmuVar, zzoeVar, zzlqVar, zzncVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzol.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzol.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzol.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzol.zzf(obj, j)).longValue();
    }

    private final zzmg zzu(int i) {
        int i2 = i / 3;
        return (zzmg) this.zzd[i2 + i2 + 1];
    }

    private final zzns zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzns zznsVar = (zzns) objArr[i3];
        if (zznsVar != null) {
            return zznsVar;
        }
        zzns zznsVarZzb = zznp.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zznsVarZzb;
        return zznsVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzns zznsVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zznsVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zznsVarZzv.zze();
        if (object != null) {
            zznsVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzns zznsVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zznsVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zznsVarZzv.zze();
        if (object != null) {
            zznsVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0385  */
    /* JADX WARN: Code duplicated, block: B:211:0x0546  */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(Object obj) {
        int i;
        int iZzz;
        int iZzz2;
        int iZzA;
        int iZzz3;
        int iZzz4;
        int iZzz5;
        int iZzd;
        int iZzz6;
        int iZzh;
        int iZzg;
        int size;
        int iZzl;
        int iZzz7;
        int iZzz8;
        int iZzz9;
        int iZzA2;
        int iZze;
        int iZzz10;
        int iZzz11;
        int iZzw;
        int iZzz12;
        int iZzz13;
        int iZzz14;
        int iZzd2;
        int iZzz15;
        zznk<T> zznkVar = this;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int iZzz16 = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = zznkVar.zzc;
            if (i2 >= iArr.length) {
                int iZza = iZzz16 + ((zzmd) obj).zzc.zza();
                if (!zznkVar.zzh) {
                    return iZza;
                }
                zzoa zzoaVar = ((zzma) obj).zzb.zza;
                int iZzc = zzoaVar.zzc();
                int iZzb = 0;
                for (int i5 = 0; i5 < iZzc; i5++) {
                    Map.Entry entryZzg = zzoaVar.zzg(i5);
                    iZzb += zzlu.zzb((zzlt) ((zznw) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzoaVar.zzd()) {
                    iZzb += zzlu.zzb((zzlt) entry.getKey(), entry.getValue());
                }
                return iZza + iZzb;
            }
            int iZzs = zznkVar.zzs(i2);
            int iZzr = zzr(iZzs);
            int i6 = iArr[i2];
            int i7 = iArr[i2 + 2];
            int i8 = i7 & 1048575;
            if (iZzr <= 17) {
                if (i8 != i4) {
                    i3 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzs & 1048575;
            if (iZzr >= zzlv.DOUBLE_LIST_PACKED.zza()) {
                zzlv.SINT64_LIST_PACKED.zza();
            }
            long j = i9;
            switch (iZzr) {
                case 0:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz16 += zzlk.zzz(i6 << 3) + 8;
                    }
                    i2 += 3;
                    break;
                case 1:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz = zzlk.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 2:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzA(j2);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 3:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzA(j3);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 4:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzA(j4);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 5:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz3 = zzlk.zzz(i6 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 6:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz = zzlk.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 7:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz4 = zzlk.zzz(i6 << 3) + 1;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 8:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzld) {
                            iZzz5 = zzlk.zzz(i10);
                            iZzd = ((zzld) object).zzd();
                            iZzz6 = zzlk.zzz(iZzd);
                            iZzz4 = iZzz5 + iZzz6 + iZzd;
                            iZzz16 += iZzz4;
                        } else {
                            iZzz2 = zzlk.zzz(i10);
                            iZzA = zzlk.zzy((String) object);
                            iZzz4 = iZzz2 + iZzA;
                            iZzz16 += iZzz4;
                        }
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 9:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzh = zznu.zzh(i6, unsafe.getObject(obj, j), zznkVar.zzv(i2));
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 10:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        zzld zzldVar = (zzld) unsafe.getObject(obj, j);
                        iZzz5 = zzlk.zzz(i6 << 3);
                        iZzd = zzldVar.zzd();
                        iZzz6 = zzlk.zzz(iZzd);
                        iZzz4 = iZzz5 + iZzz6 + iZzd;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 11:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzz(i11);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 12:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzA(j5);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 13:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz = zzlk.zzz(i6 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 14:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzz3 = zzlk.zzz(i6 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 15:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzz((i12 >> 31) ^ (i12 + i12));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 16:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz2 = zzlk.zzz(i6 << 3);
                        iZzA = zzlk.zzA((j6 >> 63) ^ (j6 + j6));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz16 += iZzz4;
                    }
                    zznkVar = this;
                    i2 += 3;
                    break;
                case 17:
                    if (zznkVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzh = zzlk.zzw(i6, (zznh) unsafe.getObject(obj, j), zznkVar.zzv(i2));
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 18:
                    iZzh = zznu.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 19:
                    iZzh = zznu.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zznu.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zznu.zzg(list) + (list.size() * zzlk.zzz(i6 << 3));
                    }
                    iZzz16 += iZzg;
                    i2 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zznu.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zzl(list2);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zznu.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zzf(list3);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 23:
                    iZzh = zznu.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 24:
                    iZzh = zznu.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zznu.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzlk.zzz(i6 << 3) + 1);
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i17 = zznu.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzlk.zzz(i6 << 3) * size3;
                        if (list5 instanceof zzmt) {
                            zzmt zzmtVar = (zzmt) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object objZzc = zzmtVar.zzc();
                                if (objZzc instanceof zzld) {
                                    int iZzd3 = ((zzld) objZzc).zzd();
                                    iZzg += zzlk.zzz(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzlk.zzy((String) objZzc);
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof zzld) {
                                    int iZzd4 = ((zzld) obj2).zzd();
                                    iZzg += zzlk.zzz(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzlk.zzy((String) obj2);
                                }
                            }
                        }
                    }
                    iZzz16 += iZzg;
                    i2 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzns zznsVarZzv = zznkVar.zzv(i2);
                    int i20 = zznu.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz8 = 0;
                    } else {
                        iZzz8 = zzlk.zzz(i6 << 3) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj3 = list6.get(i21);
                            if (obj3 instanceof zzms) {
                                int iZza2 = ((zzms) obj3).zza();
                                iZzz8 += zzlk.zzz(iZza2) + iZza2;
                            } else {
                                iZzz8 += zzlk.zzx((zznh) obj3, zznsVarZzv);
                            }
                        }
                    }
                    iZzz16 += iZzz8;
                    i2 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zznu.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = size5 * zzlk.zzz(i6 << 3);
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd5 = ((zzld) list7.get(i23)).zzd();
                            iZzz9 += zzlk.zzz(iZzd5) + iZzd5;
                        }
                    }
                    iZzz16 += iZzz9;
                    i2 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zznu.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zzk(list8);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zznu.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zza(list9);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 31:
                    iZzh = zznu.zzb(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 32:
                    iZzh = zznu.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i26 = zznu.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zzi(list10);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i27 = zznu.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zznu.zzj(list11);
                        iZzz7 = zzlk.zzz(i6 << 3);
                        iZzA2 = size * iZzz7;
                        iZzh = iZzl + iZzA2;
                    }
                    iZzz16 += iZzh;
                    i2 += 3;
                    break;
                case 35:
                    iZze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 36:
                    iZze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 37:
                    iZze = zznu.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 38:
                    iZze = zznu.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 39:
                    iZze = zznu.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 40:
                    iZze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 41:
                    iZze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i28 = zznu.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 43:
                    iZze = zznu.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 44:
                    iZze = zznu.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 45:
                    iZze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 46:
                    iZze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 47:
                    iZze = zznu.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 48:
                    iZze = zznu.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz10 = zzlk.zzz(i6 << 3);
                        iZzz11 = zzlk.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz16 += iZzz9;
                    }
                    i2 += 3;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzns zznsVarZzv2 = zznkVar.zzv(i2);
                    int i29 = zznu.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iZzw += zzlk.zzw(i6, (zznh) list13.get(i30), zznsVarZzv2);
                        }
                    }
                    iZzz16 += iZzw;
                    i2 += 3;
                    break;
                case 50:
                    zznb zznbVar = (zznb) unsafe.getObject(obj, j);
                    if (zznbVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zznbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i2 += 3;
                case 51:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz12 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 52:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz13 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 53:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        long jZzt = zzt(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzA(jZzt);
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 54:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        long jZzt2 = zzt(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzA(jZzt2);
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 55:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        long jZzo = zzo(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzA(jZzo);
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 56:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz12 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 57:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz13 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 58:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzh = zzlk.zzz(i6 << 3) + 1;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 59:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        int i31 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzld) {
                            iZzz14 = zzlk.zzz(i31);
                            iZzd2 = ((zzld) object2).zzd();
                            iZzz15 = zzlk.zzz(iZzd2);
                            iZzh = iZzz14 + iZzz15 + iZzd2;
                            iZzz16 += iZzh;
                        } else {
                            iZzl = zzlk.zzz(i31);
                            iZzA2 = zzlk.zzy((String) object2);
                            iZzh = iZzl + iZzA2;
                            iZzz16 += iZzh;
                        }
                    }
                    i2 += 3;
                    break;
                case 60:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzh = zznu.zzh(i6, unsafe.getObject(obj, j), zznkVar.zzv(i2));
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 61:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        zzld zzldVar2 = (zzld) unsafe.getObject(obj, j);
                        iZzz14 = zzlk.zzz(i6 << 3);
                        iZzd2 = zzldVar2.zzd();
                        iZzz15 = zzlk.zzz(iZzd2);
                        iZzh = iZzz14 + iZzz15 + iZzd2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 62:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        int iZzo = zzo(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzz(iZzo);
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 63:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        long jZzo2 = zzo(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzA(jZzo2);
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 64:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz13 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz13 + 4;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 65:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzz12 = zzlk.zzz(i6 << 3);
                        iZzh = iZzz12 + 8;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 66:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        int iZzo2 = zzo(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzz((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 67:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        long jZzt3 = zzt(obj, j);
                        iZzl = zzlk.zzz(i6 << 3);
                        iZzA2 = zzlk.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzh = iZzl + iZzA2;
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                case 68:
                    if (zznkVar.zzM(obj, i6, i2)) {
                        iZzh = zzlk.zzw(i6, (zznh) unsafe.getObject(obj, j), zznkVar.zzv(i2));
                        iZzz16 += iZzh;
                    }
                    i2 += 3;
                    break;
                default:
                    i2 += 3;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int iHashCode = (i4 * 53) + ((zzmd) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzma) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzs = zzs(i3);
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i3];
            long j = i5;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzol.zza(obj, j));
                    byte[] bArr = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzol.zzb(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr2 = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr3 = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr4 = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    iFloatToIntBits = zzmk.zza(zzol.zzw(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    iFloatToIntBits = ((String) zzol.zzf(obj, j)).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object objZzf = zzol.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr5 = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr6 = zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object objZzf2 = zzol.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
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
                    iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzmk.zza(zzN(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = ((String) zzol.zzf(obj, j)).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0279  */
    /* JADX WARN: Code duplicated, block: B:103:0x027d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0295  */
    /* JADX WARN: Code duplicated, block: B:108:0x0299  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:559:0x0d09 A[PHI: r6 r11 r12 r15 r23
  0x0d09: PHI (r6v60 byte[]) = 
  (r6v41 byte[])
  (r6v42 byte[])
  (r6v43 byte[])
  (r6v44 byte[])
  (r6v45 byte[])
  (r6v46 byte[])
  (r6v47 byte[])
  (r6v49 byte[])
  (r6v50 byte[])
  (r6v52 byte[])
  (r6v61 byte[])
 binds: [B:556:0x0cf1, B:553:0x0cd1, B:550:0x0cb5, B:547:0x0c9a, B:544:0x0c7e, B:541:0x0c61, B:534:0x0c3b, B:520:0x0bfd, B:518:0x0be9, B:514:0x0bc1, B:487:0x0b02] A[DONT_GENERATE, DONT_INLINE]
  0x0d09: PHI (r11v97 int) = 
  (r11v74 int)
  (r11v75 int)
  (r11v76 int)
  (r11v77 int)
  (r11v78 int)
  (r11v79 int)
  (r11v80 int)
  (r11v82 int)
  (r11v83 int)
  (r11v88 int)
  (r11v98 int)
 binds: [B:556:0x0cf1, B:553:0x0cd1, B:550:0x0cb5, B:547:0x0c9a, B:544:0x0c7e, B:541:0x0c61, B:534:0x0c3b, B:520:0x0bfd, B:518:0x0be9, B:514:0x0bc1, B:487:0x0b02] A[DONT_GENERATE, DONT_INLINE]
  0x0d09: PHI (r12v53 int) = 
  (r12v36 int)
  (r12v37 int)
  (r12v38 int)
  (r12v39 int)
  (r12v40 int)
  (r12v41 int)
  (r12v42 int)
  (r12v44 int)
  (r12v45 int)
  (r12v48 int)
  (r12v54 int)
 binds: [B:556:0x0cf1, B:553:0x0cd1, B:550:0x0cb5, B:547:0x0c9a, B:544:0x0c7e, B:541:0x0c61, B:534:0x0c3b, B:520:0x0bfd, B:518:0x0be9, B:514:0x0bc1, B:487:0x0b02] A[DONT_GENERATE, DONT_INLINE]
  0x0d09: PHI (r15v68 com.google.android.gms.internal.measurement.zzks) = 
  (r15v53 com.google.android.gms.internal.measurement.zzks)
  (r15v54 com.google.android.gms.internal.measurement.zzks)
  (r15v55 com.google.android.gms.internal.measurement.zzks)
  (r15v56 com.google.android.gms.internal.measurement.zzks)
  (r15v57 com.google.android.gms.internal.measurement.zzks)
  (r15v58 com.google.android.gms.internal.measurement.zzks)
  (r15v59 com.google.android.gms.internal.measurement.zzks)
  (r15v61 com.google.android.gms.internal.measurement.zzks)
  (r15v62 com.google.android.gms.internal.measurement.zzks)
  (r15v64 com.google.android.gms.internal.measurement.zzks)
  (r15v69 com.google.android.gms.internal.measurement.zzks)
 binds: [B:556:0x0cf1, B:553:0x0cd1, B:550:0x0cb5, B:547:0x0c9a, B:544:0x0c7e, B:541:0x0c61, B:534:0x0c3b, B:520:0x0bfd, B:518:0x0be9, B:514:0x0bc1, B:487:0x0b02] A[DONT_GENERATE, DONT_INLINE]
  0x0d09: PHI (r23v26 int) = 
  (r23v5 int)
  (r23v6 int)
  (r23v7 int)
  (r23v8 int)
  (r23v9 int)
  (r23v10 int)
  (r23v11 int)
  (r23v13 int)
  (r23v14 int)
  (r23v19 int)
  (r23v27 int)
 binds: [B:556:0x0cf1, B:553:0x0cd1, B:550:0x0cb5, B:547:0x0c9a, B:544:0x0c7e, B:541:0x0c61, B:534:0x0c3b, B:520:0x0bfd, B:518:0x0be9, B:514:0x0bc1, B:487:0x0b02] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:575:0x0d5f  */
    /* JADX WARN: Code duplicated, block: B:644:0x0a95 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0d0c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0aaa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0d20 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0230 A[EDGE_INSN: B:777:0x0230->B:775:0x0230 BREAK  A[LOOP:26: B:86:0x0244->B:90:0x0250], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x0230 A[EDGE_INSN: B:778:0x0230->B:775:0x0230 BREAK  A[LOOP:26: B:86:0x0244->B:90:0x0250], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0232  */
    /* JADX WARN: Code duplicated, block: B:88:0x0248  */
    /* JADX WARN: Code duplicated, block: B:90:0x0250 A[LOOP:26: B:86:0x0244->B:90:0x0250, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0275  */
    /* JADX WARN: Multi-variable type inference failed */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzks zzksVar) throws IOException {
        Object obj2;
        int i4;
        Unsafe unsafe;
        int i5;
        int iZzq;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte[] bArr2;
        zzks zzksVar2;
        int i12;
        int i13;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr3;
        zzks zzksVar3;
        int i14;
        int i15;
        int i16;
        byte[] bArr4;
        Unsafe unsafe3;
        int i17;
        int i18;
        int i19;
        int i20;
        byte b;
        int i21;
        byte b2;
        int i22;
        Object obj4;
        int i23;
        zzks zzksVar4;
        int i24;
        zznk<T> zznkVar;
        Unsafe unsafe4;
        int i25;
        int iZzh;
        int i26;
        Object[] objArr;
        int iZzf;
        int i27;
        int i28;
        int i29;
        int iZzh2;
        int iZzh3;
        int i30;
        int i31;
        int iZzk;
        byte[] bArr5;
        int i32;
        int iZza;
        int iZzh4;
        zznk<T> zznkVar2 = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i2 = i2;
        zzks zzksVar5 = zzksVar;
        zzA(obj5);
        Unsafe unsafe5 = zzb;
        int i33 = 0;
        int iZzg = i;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        int i38 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int iZzi = iZzg + 1;
                int i39 = bArr6[iZzg];
                if (i39 < 0) {
                    iZzi = zzkt.zzi(i39, bArr6, iZzi, zzksVar5);
                    i39 = zzksVar5.zza;
                }
                int i40 = iZzi;
                int i41 = i39;
                iZzg = i40;
                int i42 = (i41 == true ? 1 : 0) >>> 3;
                if (i42 > i37) {
                    int i43 = i34 / 3;
                    if (i42 < zznkVar2.zze || i42 > zznkVar2.zzf) {
                        iZzq = -1;
                    } else {
                        iZzq = zznkVar2.zzq(i42, i43);
                    }
                } else if (i42 < zznkVar2.zze || i42 > zznkVar2.zzf) {
                    iZzq = -1;
                } else {
                    iZzq = zznkVar2.zzq(i42, i33);
                }
                if (iZzq != -1) {
                    boolean z = (i41 == true ? 1 : 0) & 7;
                    int[] iArr = zznkVar2.zzc;
                    int i44 = iArr[iZzq + 1];
                    int i45 = iZzq;
                    int iZzr = zzr(i44);
                    long j = i44 & 1048575;
                    if (iZzr <= 17) {
                        int i46 = iArr[i45 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        i37 = i42;
                        if (i48 != i38) {
                            int i49 = 1048575;
                            if (i38 != 1048575) {
                                unsafe5.putInt(obj5, i38, i36);
                                i49 = 1048575;
                            }
                            i36 = i48 == i49 ? 0 : unsafe5.getInt(obj5, i48);
                            i38 = i48;
                        }
                        switch (iZzr) {
                            case 0:
                                zzks zzksVar6 = zzksVar5;
                                bArr3 = bArr6;
                                zzksVar3 = zzksVar6;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                unsafe2 = unsafe5;
                                obj3 = obj5;
                                if (z == 1) {
                                    i14 = iZzg + 8;
                                    i15 = i10 | i47;
                                    zzol.zzo(obj3, j, Double.longBitsToDouble(zzkt.zzn(bArr3, iZzg)));
                                    byte[] bArr7 = bArr3;
                                    zzksVar5 = zzksVar3;
                                    bArr6 = bArr7;
                                    i2 = i2;
                                    iZzg = i14;
                                    i35 = i11;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i38 = i9;
                                    i37 = i37;
                                    i36 = i15;
                                    i34 = i6;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 1:
                                zzks zzksVar7 = zzksVar5;
                                bArr3 = bArr6;
                                zzksVar3 = zzksVar7;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                unsafe2 = unsafe5;
                                obj3 = obj5;
                                if (z == 5) {
                                    i14 = iZzg + 4;
                                    i15 = i10 | i47;
                                    zzol.zzp(obj3, j, Float.intBitsToFloat(zzkt.zzb(bArr3, iZzg)));
                                    byte[] bArr8 = bArr3;
                                    zzksVar5 = zzksVar3;
                                    bArr6 = bArr8;
                                    i2 = i2;
                                    iZzg = i14;
                                    i35 = i11;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i38 = i9;
                                    i37 = i37;
                                    i36 = i15;
                                    i34 = i6;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 2:
                            case 3:
                                zzks zzksVar8 = zzksVar5;
                                byte[] bArr9 = bArr6;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 0) {
                                    int iZzk2 = zzkt.zzk(bArr9, iZzg, zzksVar8);
                                    unsafe5.putLong(obj5, j, zzksVar8.zzb);
                                    zzksVar5 = zzksVar8;
                                    bArr6 = bArr9;
                                    i36 = i10 | i47;
                                    iZzg = iZzk2;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i2 = i2;
                                } else {
                                    unsafe2 = unsafe5;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 4:
                            case 11:
                                zzks zzksVar9 = zzksVar5;
                                byte[] bArr10 = bArr6;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 0) {
                                    i16 = i10 | i47;
                                    iZzg = zzkt.zzh(bArr10, iZzg, zzksVar9);
                                    unsafe5.putInt(obj5, j, zzksVar9.zza);
                                    bArr4 = bArr10;
                                    zzksVar5 = zzksVar9;
                                    bArr6 = bArr4;
                                    i2 = i2;
                                    i36 = i16;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                } else {
                                    unsafe2 = unsafe5;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 5:
                            case 14:
                                byte[] bArr11 = bArr6;
                                Unsafe unsafe6 = unsafe5;
                                zzks zzksVar10 = zzksVar5;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 1) {
                                    unsafe5 = unsafe6;
                                    unsafe5.putLong(obj5, j, zzkt.zzn(bArr11, iZzg));
                                    zzksVar5 = zzksVar10;
                                    bArr6 = bArr11;
                                    iZzg += 8;
                                    i36 = i10 | i47;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i2 = i2;
                                } else {
                                    unsafe5 = unsafe6;
                                    unsafe2 = unsafe5;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 6:
                            case 13:
                                byte[] bArr12 = bArr6;
                                unsafe3 = unsafe5;
                                zzks zzksVar11 = zzksVar5;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 5) {
                                    i17 = i10 | i47;
                                    unsafe3.putInt(obj5, j, zzkt.zzb(bArr12, iZzg));
                                    zzksVar5 = zzksVar11;
                                    unsafe5 = unsafe3;
                                    bArr6 = bArr12;
                                    iZzg += 4;
                                    i36 = i17;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                } else {
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 7:
                                byte[] bArr13 = bArr6;
                                unsafe3 = unsafe5;
                                zzks zzksVar12 = zzksVar5;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 0) {
                                    i16 = i10 | i47;
                                    iZzg = zzkt.zzk(bArr13, iZzg, zzksVar12);
                                    zzol.zzm(obj5, j, zzksVar12.zzb != 0);
                                    bArr4 = bArr13;
                                    zzksVar5 = zzksVar12;
                                    unsafe5 = unsafe3;
                                    bArr6 = bArr4;
                                    i2 = i2;
                                    i36 = i16;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                } else {
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 8:
                                byte[] bArr14 = bArr6;
                                unsafe3 = unsafe5;
                                zzks zzksVar13 = zzksVar5;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i9 = i38;
                                i10 = i36;
                                if (z == 2) {
                                    if ((i44 & 536870912) != 0) {
                                        iZzg = zzkt.zzh(bArr14, iZzg, zzksVar13);
                                        int i50 = zzksVar13.zza;
                                        if (i50 < 0) {
                                            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i51 = i10 | i47;
                                        if (i50 == 0) {
                                            zzksVar13.zzc = "";
                                            i18 = i51;
                                            i33 = 0;
                                        } else {
                                            int i52 = zzoo.zza;
                                            int length = bArr14.length;
                                            if ((((length - iZzg) - i50) | iZzg | i50) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzg), Integer.valueOf(i50)));
                                            }
                                            int i53 = iZzg + i50;
                                            char[] cArr = new char[i50];
                                            int i54 = 0;
                                            while (iZzg < i53) {
                                                byte b3 = bArr14[iZzg];
                                                if (zzom.zzd(b3)) {
                                                    iZzg++;
                                                    cArr[i54] = (char) b3;
                                                    i54++;
                                                } else {
                                                    while (iZzg < i53) {
                                                        i19 = iZzg + 1;
                                                        i20 = iZzg;
                                                        b = bArr14[i20];
                                                        if (zzom.zzd(b)) {
                                                            i21 = i54 + 1;
                                                            cArr[i54] = (char) b;
                                                            iZzg = i19;
                                                            while (true) {
                                                                i54 = i21;
                                                                if (iZzg < i53) {
                                                                }
                                                                b2 = bArr14[iZzg];
                                                                if (zzom.zzd(b2)) {
                                                                }
                                                                iZzg++;
                                                                i21 = i54 + 1;
                                                                cArr[i54] = (char) b2;
                                                            }
                                                        } else {
                                                            int i55 = i51;
                                                            if (b < -32) {
                                                                if (b < -16) {
                                                                    if (i19 < i53 - 1) {
                                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    int i56 = i20 + 2;
                                                                    i22 = i20 + 3;
                                                                    zzom.zzb(b, bArr14[i19], bArr14[i56], cArr, i54);
                                                                    i54++;
                                                                } else {
                                                                    if (i19 < i53 - 2) {
                                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    char[] cArr2 = cArr;
                                                                    zzom.zza(b, bArr14[i19], bArr14[i20 + 2], bArr14[i20 + 3], cArr2, i54);
                                                                    i54 += 2;
                                                                    cArr = cArr2;
                                                                    iZzg = i20 + 4;
                                                                }
                                                                i51 = i55;
                                                            } else {
                                                                if (i19 < i53) {
                                                                    throw new zzmm("Protocol message had invalid UTF-8.");
                                                                }
                                                                i22 = i20 + 2;
                                                                zzom.zzc(b, bArr14[i19], cArr, i54);
                                                                i54++;
                                                            }
                                                            iZzg = i22;
                                                            i51 = i55;
                                                        }
                                                        break;
                                                    }
                                                    i18 = i51;
                                                    i33 = 0;
                                                    zzksVar13.zzc = new String(cArr, 0, i54);
                                                    iZzg = i53;
                                                }
                                            }
                                            while (iZzg < i53) {
                                                i19 = iZzg + 1;
                                                i20 = iZzg;
                                                b = bArr14[i20];
                                                if (zzom.zzd(b)) {
                                                    i21 = i54 + 1;
                                                    cArr[i54] = (char) b;
                                                    iZzg = i19;
                                                    while (true) {
                                                        i54 = i21;
                                                        if (iZzg < i53) {
                                                        }
                                                        b2 = bArr14[iZzg];
                                                        if (zzom.zzd(b2)) {
                                                        }
                                                        iZzg++;
                                                        i21 = i54 + 1;
                                                        cArr[i54] = (char) b2;
                                                    }
                                                } else {
                                                    int i57 = i51;
                                                    if (b < -32) {
                                                        if (b < -16) {
                                                            if (i19 < i53 - 1) {
                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                            }
                                                            int i58 = i20 + 2;
                                                            i22 = i20 + 3;
                                                            zzom.zzb(b, bArr14[i19], bArr14[i58], cArr, i54);
                                                            i54++;
                                                        } else {
                                                            if (i19 < i53 - 2) {
                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                            }
                                                            char[] cArr3 = cArr;
                                                            zzom.zza(b, bArr14[i19], bArr14[i20 + 2], bArr14[i20 + 3], cArr3, i54);
                                                            i54 += 2;
                                                            cArr = cArr3;
                                                            iZzg = i20 + 4;
                                                        }
                                                        i51 = i57;
                                                    } else {
                                                        if (i19 < i53) {
                                                            throw new zzmm("Protocol message had invalid UTF-8.");
                                                        }
                                                        i22 = i20 + 2;
                                                        zzom.zzc(b, bArr14[i19], cArr, i54);
                                                        i54++;
                                                    }
                                                    iZzg = i22;
                                                    i51 = i57;
                                                }
                                                break;
                                            }
                                            i18 = i51;
                                            i33 = 0;
                                            zzksVar13.zzc = new String(cArr, 0, i54);
                                            iZzg = i53;
                                        }
                                        i17 = i18;
                                    } else {
                                        i33 = 0;
                                        iZzg = zzkt.zzh(bArr14, iZzg, zzksVar13);
                                        int i59 = zzksVar13.zza;
                                        if (i59 < 0) {
                                            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i17 = i10 | i47;
                                        if (i59 == 0) {
                                            zzksVar13.zzc = "";
                                        } else {
                                            zzksVar13.zzc = new String(bArr14, iZzg, i59, zzmk.zza);
                                            iZzg += i59;
                                        }
                                    }
                                    unsafe3.putObject(obj5, j, zzksVar13.zzc);
                                    zzksVar5 = zzksVar13;
                                    unsafe5 = unsafe3;
                                    bArr6 = bArr14;
                                    i36 = i17;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                } else {
                                    i33 = 0;
                                    obj3 = obj5;
                                    unsafe2 = unsafe3;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 9:
                                obj4 = obj5;
                                int i60 = i36;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i9 = i38;
                                if (z == 2) {
                                    i36 = i60 | i47;
                                    Unsafe unsafe7 = unsafe5;
                                    Object objZzx = zznkVar2.zzx(obj4, i6);
                                    byte[] bArr15 = bArr6;
                                    zzks zzksVar14 = zzksVar5;
                                    int iZzm = zzkt.zzm(objZzx, zznkVar2.zzv(i6), bArr15, iZzg, i2, zzksVar14);
                                    zznkVar2.zzF(obj4, i6, objZzx);
                                    zzksVar5 = zzksVar14;
                                    unsafe5 = unsafe7;
                                    bArr6 = bArr15;
                                    iZzg = iZzm;
                                    obj5 = obj4;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                    i33 = 0;
                                } else {
                                    i10 = i60;
                                    unsafe2 = unsafe5;
                                    obj3 = obj4;
                                    i33 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 10:
                                obj4 = obj5;
                                i23 = i36;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i9 = i38;
                                if (z == 2) {
                                    i23 |= i47;
                                    iZzg = zzkt.zza(bArr6, iZzg, zzksVar5);
                                    unsafe5.putObject(obj4, j, zzksVar5.zzc);
                                    i36 = i23;
                                    obj5 = obj4;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                    i33 = 0;
                                } else {
                                    unsafe2 = unsafe5;
                                    i10 = i23;
                                    obj3 = obj4;
                                    i33 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 12:
                                obj4 = obj5;
                                i23 = i36;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i9 = i38;
                                if (z == 0) {
                                    iZzg = zzkt.zzh(bArr6, iZzg, zzksVar5);
                                    int i61 = zzksVar5.zza;
                                    zzmg zzmgVarZzu = zznkVar2.zzu(i6);
                                    if ((Integer.MIN_VALUE & i44) == 0 || zzmgVarZzu == null || zzmgVarZzu.zza(i61)) {
                                        i23 |= i47;
                                        unsafe5.putInt(obj4, j, i61);
                                    } else {
                                        zzd(obj4).zzj(i11 == true ? 1 : 0, Long.valueOf(i61));
                                    }
                                    i36 = i23;
                                    obj5 = obj4;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                    i33 = 0;
                                } else {
                                    unsafe2 = unsafe5;
                                    i10 = i23;
                                    obj3 = obj4;
                                    i33 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 15:
                                obj4 = obj5;
                                i23 = i36;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i9 = i38;
                                if (z == 0) {
                                    i23 |= i47;
                                    iZzg = zzkt.zzh(bArr6, iZzg, zzksVar5);
                                    unsafe5.putInt(obj4, j, zzlg.zzb(zzksVar5.zza));
                                    i36 = i23;
                                    obj5 = obj4;
                                    i34 = i6;
                                    i35 = i11;
                                    i38 = i9;
                                    i37 = i37;
                                    i33 = 0;
                                } else {
                                    unsafe2 = unsafe5;
                                    i10 = i23;
                                    obj3 = obj4;
                                    i33 = 0;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            case 16:
                                if (z == 0) {
                                    i36 |= i47;
                                    int iZzk3 = zzkt.zzk(bArr6, iZzg, zzksVar5);
                                    unsafe5.putLong(obj5, j, zzlg.zzc(zzksVar5.zzb));
                                    iZzg = iZzk3;
                                    i34 = i45;
                                    i35 = i41 == true ? 1 : 0;
                                    i33 = 0;
                                    i2 = i2;
                                } else {
                                    i6 = i45;
                                    i11 = i41 == true ? 1 : 0;
                                    i9 = i38;
                                    i10 = i36;
                                    i33 = 0;
                                    unsafe2 = unsafe5;
                                    obj3 = obj5;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                            default:
                                zzks zzksVar15 = zzksVar5;
                                byte[] bArr16 = bArr6;
                                i6 = i45;
                                i11 = i41 == true ? 1 : 0;
                                i33 = 0;
                                i9 = i38;
                                i10 = i36;
                                unsafe2 = unsafe5;
                                obj3 = obj5;
                                if (z == 3) {
                                    Object objZzx2 = zznkVar2.zzx(obj3, i6);
                                    int iZzl = zzkt.zzl(objZzx2, zznkVar2.zzv(i6), bArr16, iZzg, i2, (i37 << 3) | 4, zzksVar15);
                                    zznkVar2.zzF(obj3, i6, objZzx2);
                                    bArr6 = bArr;
                                    zzksVar5 = zzksVar;
                                    iZzg = iZzl;
                                    i34 = i6;
                                    i35 = i11 == true ? 1 : 0;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i38 = i9;
                                    i36 = i10 | i47;
                                    i2 = i2;
                                } else {
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i7 = i33;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i8 = i37;
                                    zzksVar2 = zzksVar;
                                }
                                break;
                        }
                    } else {
                        Unsafe unsafe8 = unsafe5;
                        obj2 = obj5;
                        int i62 = i42;
                        i6 = i45;
                        i7 = 0;
                        if (iZzr != 27) {
                            int i63 = i41 == true ? 1 : 0;
                            i10 = i36;
                            i24 = iZzg;
                            zzksVar4 = zzksVar;
                            Unsafe unsafe9 = unsafe8;
                            i9 = i38;
                            if (iZzr <= 49) {
                                long j2 = i44;
                                zzmj zzmjVarZzd = (zzmj) unsafe9.getObject(obj2, j);
                                if (!zzmjVarZzd.zzc()) {
                                    int size = zzmjVarZzd.size();
                                    zzmjVarZzd = zzmjVarZzd.zzd(size + size);
                                    unsafe9.putObject(obj2, j, zzmjVarZzd);
                                }
                                switch (iZzr) {
                                    case 18:
                                    case 35:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        i11 = i63 == true ? 1 : 0;
                                        i25 = i24;
                                        if (z != 2) {
                                            if (z == 1) {
                                                iZzh = i25 + 8;
                                                int i64 = zzkt.zza;
                                                zzlm zzlmVar = (zzlm) zzmjVarZzd;
                                                zzlmVar.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, i25)));
                                                while (iZzh < i2) {
                                                    int iZzh5 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i11 == zzksVar4.zza) {
                                                        zzlmVar.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, iZzh5)));
                                                        iZzh = iZzh5 + 8;
                                                    }
                                                }
                                            }
                                            i24 = i25;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i65 = zzkt.zza;
                                            zzlm zzlmVar2 = (zzlm) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i25, zzksVar4);
                                            int i66 = zzksVar4.zza;
                                            int i67 = iZzh + i66;
                                            if (i67 > bArr.length) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzlmVar2.zzg(zzlmVar2.size() + (i66 / 8));
                                            while (iZzh < i67) {
                                                zzlmVar2.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, iZzh)));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i67) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i24 = i25;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        i11 = i63 == true ? 1 : 0;
                                        i25 = i24;
                                        if (z != 2) {
                                            if (z == 5) {
                                                iZzh = i25 + 4;
                                                int i68 = zzkt.zza;
                                                zzlw zzlwVar = (zzlw) zzmjVarZzd;
                                                zzlwVar.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, i25)));
                                                while (iZzh < i2) {
                                                    int iZzh6 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i11 == zzksVar4.zza) {
                                                        zzlwVar.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, iZzh6)));
                                                        iZzh = iZzh6 + 4;
                                                    }
                                                }
                                            }
                                            i24 = i25;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i69 = zzkt.zza;
                                            zzlw zzlwVar2 = (zzlw) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i25, zzksVar4);
                                            int i70 = zzksVar4.zza;
                                            int i71 = iZzh + i70;
                                            if (i71 > bArr.length) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzlwVar2.zzg(zzlwVar2.size() + (i70 / 4));
                                            while (iZzh < i71) {
                                                zzlwVar2.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, iZzh)));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i71) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i24 = i25;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        i11 = i63 == true ? 1 : 0;
                                        i25 = i24;
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i72 = zzkt.zza;
                                                zzmw zzmwVar = (zzmw) zzmjVarZzd;
                                                iZzh = zzkt.zzk(bArr, i25, zzksVar4);
                                                zzmwVar.zzg(zzksVar4.zzb);
                                                while (iZzh < i2) {
                                                    int iZzh7 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i11 == zzksVar4.zza) {
                                                        iZzh = zzkt.zzk(bArr, iZzh7, zzksVar4);
                                                        zzmwVar.zzg(zzksVar4.zzb);
                                                    }
                                                }
                                            }
                                            i24 = i25;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i73 = zzkt.zza;
                                            zzmw zzmwVar2 = (zzmw) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i25, zzksVar4);
                                            int i74 = zzksVar4.zza + iZzh;
                                            while (iZzh < i74) {
                                                iZzh = zzkt.zzk(bArr, iZzh, zzksVar4);
                                                zzmwVar2.zzg(zzksVar4.zzb);
                                            }
                                            if (iZzh != i74) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i24 = i25;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        if (z != 2) {
                                            if (z == 0) {
                                                iZzh = zzkt.zzj(i63 == true ? 1 : 0, bArr, i24, i2, zzmjVarZzd, zzksVar4);
                                                i11 = i63 == true ? 1 : 0;
                                            }
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            iZzh = zzkt.zzf(bArr, i24, zzmjVarZzd, zzksVar4);
                                            i11 = i63;
                                        }
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        if (z != 2) {
                                            if (z == 1) {
                                                iZzh = i24 + 8;
                                                int i75 = zzkt.zza;
                                                zzmw zzmwVar3 = (zzmw) zzmjVarZzd;
                                                zzmwVar3.zzg(zzkt.zzn(bArr, i24));
                                                while (iZzh < i2) {
                                                    int iZzh8 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i63 == zzksVar4.zza) {
                                                        zzmwVar3.zzg(zzkt.zzn(bArr, iZzh8));
                                                        iZzh = iZzh8 + 8;
                                                    }
                                                }
                                            }
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i76 = zzkt.zza;
                                            zzmw zzmwVar4 = (zzmw) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i77 = zzksVar4.zza;
                                            int i78 = iZzh + i77;
                                            if (i78 > bArr.length) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmwVar4.zzh(zzmwVar4.size() + (i77 / 8));
                                            while (iZzh < i78) {
                                                zzmwVar4.zzg(zzkt.zzn(bArr, iZzh));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i78) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i11 = i63;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        if (z != 2) {
                                            if (z == 5) {
                                                iZzh = i24 + 4;
                                                int i79 = zzkt.zza;
                                                zzme zzmeVar = (zzme) zzmjVarZzd;
                                                zzmeVar.zzh(zzkt.zzb(bArr, i24));
                                                while (iZzh < i2) {
                                                    int iZzh9 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i63 == zzksVar4.zza) {
                                                        zzmeVar.zzh(zzkt.zzb(bArr, iZzh9));
                                                        iZzh = iZzh9 + 4;
                                                    }
                                                }
                                            }
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i80 = zzkt.zza;
                                            zzme zzmeVar2 = (zzme) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i81 = zzksVar4.zza;
                                            int i82 = iZzh + i81;
                                            if (i82 > bArr.length) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmeVar2.zzi(zzmeVar2.size() + (i81 / 4));
                                            while (iZzh < i82) {
                                                zzmeVar2.zzh(zzkt.zzb(bArr, iZzh));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i82) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i11 = i63;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        int i83 = i62;
                                        if (z != 2) {
                                            i62 = i83;
                                            if (z == 0) {
                                                int i84 = zzkt.zza;
                                                zzku zzkuVar = (zzku) zzmjVarZzd;
                                                iZzh = zzkt.zzk(bArr, i24, zzksVar4);
                                                zzkuVar.zze(zzksVar4.zzb != 0);
                                                while (iZzh < i2) {
                                                    int iZzh10 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i63 == zzksVar4.zza) {
                                                        iZzh = zzkt.zzk(bArr, iZzh10, zzksVar4);
                                                        zzkuVar.zze(zzksVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int i85 = zzkt.zza;
                                            zzku zzkuVar2 = (zzku) zzmjVarZzd;
                                            iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i86 = zzksVar4.zza + iZzh;
                                            while (iZzh < i86) {
                                                iZzh = zzkt.zzk(bArr, iZzh, zzksVar4);
                                                int i87 = i83;
                                                zzkuVar2.zze(zzksVar4.zzb != 0);
                                                i83 = i87;
                                            }
                                            i62 = i83;
                                            if (iZzh != i86) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i11 = i63;
                                        iZzg = iZzh;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 26:
                                        zznkVar = zznkVar2;
                                        unsafe4 = unsafe9;
                                        i26 = i62;
                                        if (z == 2) {
                                            if ((j2 & 536870912) == 0) {
                                                iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                                int i88 = zzksVar4.zza;
                                                if (i88 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i88 == 0) {
                                                    objArr = "";
                                                    zzmjVarZzd.add(objArr);
                                                } else {
                                                    objArr = "";
                                                    zzmjVarZzd.add(new String(bArr, iZzh, i88, zzmk.zza));
                                                    iZzh += i88;
                                                }
                                                while (iZzh < i2) {
                                                    int iZzh11 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i63 == zzksVar4.zza) {
                                                        iZzh = zzkt.zzh(bArr, iZzh11, zzksVar4);
                                                        int i89 = zzksVar4.zza;
                                                        if (i89 < 0) {
                                                            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i89 == 0) {
                                                            zzmjVarZzd.add(objArr);
                                                        } else {
                                                            zzmjVarZzd.add(new String(bArr, iZzh, i89, zzmk.zza));
                                                            iZzh += i89;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                                int i90 = zzksVar4.zza;
                                                if (i90 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i90 == 0) {
                                                    zzmjVarZzd.add("");
                                                } else {
                                                    int i91 = iZzh + i90;
                                                    if (!zzoo.zzd(bArr, iZzh, i91)) {
                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzmjVarZzd.add(new String(bArr, iZzh, i90, zzmk.zza));
                                                    iZzh = i91;
                                                }
                                                while (iZzh < i2) {
                                                    int iZzh12 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                    if (i63 == zzksVar4.zza) {
                                                        iZzh = zzkt.zzh(bArr, iZzh12, zzksVar4);
                                                        int i92 = zzksVar4.zza;
                                                        if (i92 < 0) {
                                                            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i92 == 0) {
                                                            zzmjVarZzd.add("");
                                                        } else {
                                                            int i93 = iZzh + i92;
                                                            if (!zzoo.zzd(bArr, iZzh, i93)) {
                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzmjVarZzd.add(new String(bArr, iZzh, i92, zzmk.zza));
                                                            iZzh = i93;
                                                        }
                                                    }
                                                }
                                            }
                                            i62 = i26;
                                            i11 = i63;
                                            iZzg = iZzh;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        i62 = i26;
                                        i11 = i63 == true ? 1 : 0;
                                        iZzg = i24;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 27:
                                        unsafe4 = unsafe9;
                                        i26 = i62;
                                        if (z == 2) {
                                            zznkVar = this;
                                            iZzh = zzkt.zze(zznkVar.zzv(i6), i63 == true ? 1 : 0, bArr, i24, i2, zzmjVarZzd, zzksVar4);
                                            i63 = i63 == true ? 1 : 0;
                                            i24 = i24;
                                            zzksVar4 = zzksVar4;
                                            i62 = i26;
                                            i11 = i63;
                                            iZzg = iZzh;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        zznkVar = this;
                                        i62 = i26;
                                        i11 = i63 == true ? 1 : 0;
                                        iZzg = i24;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 28:
                                        unsafe4 = unsafe9;
                                        i26 = i62;
                                        if (z == 2) {
                                            iZzh = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i94 = zzksVar4.zza;
                                            if (i94 < 0) {
                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i94 > bArr.length - iZzh) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i94 == 0) {
                                                zzmjVarZzd.add(zzld.zzb);
                                            } else {
                                                zzmjVarZzd.add(zzld.zzj(bArr, iZzh, i94));
                                                iZzh += i94;
                                            }
                                            while (iZzh < i2) {
                                                int iZzh13 = zzkt.zzh(bArr, iZzh, zzksVar4);
                                                if (i63 != zzksVar4.zza) {
                                                    zznkVar = this;
                                                    i62 = i26;
                                                    i11 = i63;
                                                    iZzg = iZzh;
                                                    if (iZzg != i24) {
                                                        bArr6 = bArr;
                                                        zznkVar2 = zznkVar;
                                                        obj5 = obj2;
                                                        i34 = i6;
                                                        i38 = i9;
                                                        i33 = 0;
                                                        i36 = i10;
                                                        unsafe5 = unsafe4;
                                                        i37 = i62;
                                                        i2 = i2;
                                                        zzksVar5 = zzksVar4;
                                                        i35 = i11 == true ? 1 : 0;
                                                    } else {
                                                        zzksVar2 = zzksVar4;
                                                        unsafe = unsafe4;
                                                        i8 = i62;
                                                        bArr2 = bArr;
                                                    }
                                                    break;
                                                } else {
                                                    iZzh = zzkt.zzh(bArr, iZzh13, zzksVar4);
                                                    int i95 = zzksVar4.zza;
                                                    if (i95 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i95 > bArr.length - iZzh) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i95 == 0) {
                                                        zzmjVarZzd.add(zzld.zzb);
                                                    } else {
                                                        zzmjVarZzd.add(zzld.zzj(bArr, iZzh, i95));
                                                        iZzh += i95;
                                                    }
                                                }
                                            }
                                            zznkVar = this;
                                            i62 = i26;
                                            i11 = i63;
                                            iZzg = iZzh;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        zznkVar = this;
                                        i62 = i26;
                                        i11 = i63 == true ? 1 : 0;
                                        iZzg = i24;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (z == 2) {
                                            iZzf = zzkt.zzf(bArr, i24, zzmjVarZzd, zzksVar4);
                                        } else if (z != 0) {
                                            unsafe4 = unsafe9;
                                            zznkVar = this;
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        } else {
                                            int iZzj = zzkt.zzj(i63 == true ? 1 : 0, bArr, i24, i2, zzmjVarZzd, zzksVar4);
                                            i63 = i63 == true ? 1 : 0;
                                            iZzf = iZzj;
                                        }
                                        zzmg zzmgVarZzu2 = zznkVar2.zzu(i6);
                                        zzoe zzoeVar = zznkVar2.zzl;
                                        int i96 = zznu.zza;
                                        if (zzmgVarZzu2 == null) {
                                            i27 = iZzf;
                                            unsafe4 = unsafe9;
                                            i28 = i62;
                                        } else if (zzmjVarZzd instanceof RandomAccess) {
                                            int size2 = zzmjVarZzd.size();
                                            i27 = iZzf;
                                            Object objZzn = null;
                                            int i97 = 0;
                                            int i98 = 0;
                                            while (i97 < size2) {
                                                Unsafe unsafe10 = unsafe9;
                                                Integer num = (Integer) zzmjVarZzd.get(i97);
                                                int iIntValue = num.intValue();
                                                if (zzmgVarZzu2.zza(iIntValue)) {
                                                    if (i97 != i98) {
                                                        zzmjVarZzd.set(i98, num);
                                                    }
                                                    i98++;
                                                    i29 = i62;
                                                } else {
                                                    i29 = i62;
                                                    objZzn = zznu.zzn(obj2, i29, iIntValue, objZzn, zzoeVar);
                                                }
                                                i97++;
                                                i62 = i29;
                                                unsafe9 = unsafe10;
                                            }
                                            unsafe4 = unsafe9;
                                            i28 = i62;
                                            if (i98 != size2) {
                                                zzmjVarZzd.subList(i98, size2).clear();
                                            }
                                        } else {
                                            i27 = iZzf;
                                            unsafe4 = unsafe9;
                                            i28 = i62;
                                            Iterator it = zzmjVarZzd.iterator();
                                            Object objZzn2 = null;
                                            while (it.hasNext()) {
                                                int iIntValue2 = ((Integer) it.next()).intValue();
                                                if (!zzmgVarZzu2.zza(iIntValue2)) {
                                                    objZzn2 = zznu.zzn(obj2, i28, iIntValue2, objZzn2, zzoeVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        zznkVar = this;
                                        i62 = i28;
                                        i11 = i63;
                                        iZzg = i27;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i99 = zzkt.zza;
                                                zzme zzmeVar3 = (zzme) zzmjVarZzd;
                                                iZzh2 = zzkt.zzh(bArr, i24, zzksVar4);
                                                zzmeVar3.zzh(zzlg.zzb(zzksVar4.zza));
                                                while (iZzh2 < i2) {
                                                    int iZzh14 = zzkt.zzh(bArr, iZzh2, zzksVar4);
                                                    if (i63 != zzksVar4.zza) {
                                                        zznkVar = zznkVar2;
                                                        unsafe4 = unsafe9;
                                                        i11 = i63 == true ? 1 : 0;
                                                        iZzg = iZzh2;
                                                        if (iZzg != i24) {
                                                            bArr6 = bArr;
                                                            zznkVar2 = zznkVar;
                                                            obj5 = obj2;
                                                            i34 = i6;
                                                            i38 = i9;
                                                            i33 = 0;
                                                            i36 = i10;
                                                            unsafe5 = unsafe4;
                                                            i37 = i62;
                                                            i2 = i2;
                                                            zzksVar5 = zzksVar4;
                                                            i35 = i11 == true ? 1 : 0;
                                                        } else {
                                                            zzksVar2 = zzksVar4;
                                                            unsafe = unsafe4;
                                                            i8 = i62;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        iZzh2 = zzkt.zzh(bArr, iZzh14, zzksVar4);
                                                        zzmeVar3.zzh(zzlg.zzb(zzksVar4.zza));
                                                    }
                                                    break;
                                                }
                                                zznkVar = zznkVar2;
                                                unsafe4 = unsafe9;
                                                i11 = i63 == true ? 1 : 0;
                                                iZzg = iZzh2;
                                                if (iZzg != i24) {
                                                    bArr6 = bArr;
                                                    zznkVar2 = zznkVar;
                                                    obj5 = obj2;
                                                    i34 = i6;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    unsafe5 = unsafe4;
                                                    i37 = i62;
                                                    i2 = i2;
                                                    zzksVar5 = zzksVar4;
                                                    i35 = i11 == true ? 1 : 0;
                                                } else {
                                                    zzksVar2 = zzksVar4;
                                                    unsafe = unsafe4;
                                                    i8 = i62;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            zznkVar = zznkVar2;
                                            unsafe4 = unsafe9;
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i100 = zzkt.zza;
                                            zzme zzmeVar4 = (zzme) zzmjVarZzd;
                                            iZzh3 = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i101 = zzksVar4.zza + iZzh3;
                                            while (iZzh3 < i101) {
                                                iZzh3 = zzkt.zzh(bArr, iZzh3, zzksVar4);
                                                zzmeVar4.zzh(zzlg.zzb(zzksVar4.zza));
                                            }
                                            if (iZzh3 != i101) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zznkVar = zznkVar2;
                                            unsafe4 = unsafe9;
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = iZzh3;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (z != 2) {
                                            if (z == 0) {
                                                int i102 = zzkt.zza;
                                                zzmw zzmwVar5 = (zzmw) zzmjVarZzd;
                                                iZzh2 = zzkt.zzk(bArr, i24, zzksVar4);
                                                zzmwVar5.zzg(zzlg.zzc(zzksVar4.zzb));
                                                while (iZzh2 < i2) {
                                                    int iZzh15 = zzkt.zzh(bArr, iZzh2, zzksVar4);
                                                    if (i63 != zzksVar4.zza) {
                                                        zznkVar = zznkVar2;
                                                        unsafe4 = unsafe9;
                                                        i11 = i63 == true ? 1 : 0;
                                                        iZzg = iZzh2;
                                                        if (iZzg != i24) {
                                                            bArr6 = bArr;
                                                            zznkVar2 = zznkVar;
                                                            obj5 = obj2;
                                                            i34 = i6;
                                                            i38 = i9;
                                                            i33 = 0;
                                                            i36 = i10;
                                                            unsafe5 = unsafe4;
                                                            i37 = i62;
                                                            i2 = i2;
                                                            zzksVar5 = zzksVar4;
                                                            i35 = i11 == true ? 1 : 0;
                                                        } else {
                                                            zzksVar2 = zzksVar4;
                                                            unsafe = unsafe4;
                                                            i8 = i62;
                                                            bArr2 = bArr;
                                                        }
                                                    } else {
                                                        iZzh2 = zzkt.zzk(bArr, iZzh15, zzksVar4);
                                                        zzmwVar5.zzg(zzlg.zzc(zzksVar4.zzb));
                                                    }
                                                    break;
                                                }
                                                zznkVar = zznkVar2;
                                                unsafe4 = unsafe9;
                                                i11 = i63 == true ? 1 : 0;
                                                iZzg = iZzh2;
                                                if (iZzg != i24) {
                                                    bArr6 = bArr;
                                                    zznkVar2 = zznkVar;
                                                    obj5 = obj2;
                                                    i34 = i6;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    unsafe5 = unsafe4;
                                                    i37 = i62;
                                                    i2 = i2;
                                                    zzksVar5 = zzksVar4;
                                                    i35 = i11 == true ? 1 : 0;
                                                } else {
                                                    zzksVar2 = zzksVar4;
                                                    unsafe = unsafe4;
                                                    i8 = i62;
                                                    bArr2 = bArr;
                                                }
                                            }
                                            zznkVar = zznkVar2;
                                            unsafe4 = unsafe9;
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = i24;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                            break;
                                        } else {
                                            int i103 = zzkt.zza;
                                            zzmw zzmwVar6 = (zzmw) zzmjVarZzd;
                                            iZzh3 = zzkt.zzh(bArr, i24, zzksVar4);
                                            int i104 = zzksVar4.zza + iZzh3;
                                            while (iZzh3 < i104) {
                                                iZzh3 = zzkt.zzk(bArr, iZzh3, zzksVar4);
                                                zzmwVar6.zzg(zzlg.zzc(zzksVar4.zzb));
                                            }
                                            if (iZzh3 != i104) {
                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zznkVar = zznkVar2;
                                            unsafe4 = unsafe9;
                                            i11 = i63 == true ? 1 : 0;
                                            iZzg = iZzh3;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        break;
                                    default:
                                        zznkVar = zznkVar2;
                                        byte[] bArr17 = bArr;
                                        unsafe4 = unsafe9;
                                        int i105 = i2;
                                        i11 = i63 == true ? 1 : 0;
                                        i25 = i24;
                                        if (z == 3) {
                                            int i106 = ((i11 == true ? 1 : 0) & (-8)) | 4;
                                            zzns zznsVarZzv = zznkVar.zzv(i6);
                                            iZzh = zzkt.zzc(zznsVarZzv, bArr17, i25, i105, i106, zzksVar4);
                                            i24 = i25;
                                            zzmjVarZzd.add(zzksVar4.zzc);
                                            while (iZzh < i105) {
                                                int iZzh16 = zzkt.zzh(bArr17, iZzh, zzksVar4);
                                                if (i11 != zzksVar4.zza) {
                                                    iZzg = iZzh;
                                                    if (iZzg != i24) {
                                                        bArr6 = bArr;
                                                        zznkVar2 = zznkVar;
                                                        obj5 = obj2;
                                                        i34 = i6;
                                                        i38 = i9;
                                                        i33 = 0;
                                                        i36 = i10;
                                                        unsafe5 = unsafe4;
                                                        i37 = i62;
                                                        i2 = i2;
                                                        zzksVar5 = zzksVar4;
                                                        i35 = i11 == true ? 1 : 0;
                                                    } else {
                                                        zzksVar2 = zzksVar4;
                                                        unsafe = unsafe4;
                                                        i8 = i62;
                                                        bArr2 = bArr;
                                                    }
                                                } else {
                                                    iZzh = zzkt.zzc(zznsVarZzv, bArr17, iZzh16, i105, i106, zzksVar4);
                                                    zzmjVarZzd.add(zzksVar4.zzc);
                                                    bArr17 = bArr;
                                                    i105 = i2;
                                                }
                                                break;
                                            }
                                            iZzg = iZzh;
                                            if (iZzg != i24) {
                                                bArr6 = bArr;
                                                zznkVar2 = zznkVar;
                                                obj5 = obj2;
                                                i34 = i6;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                unsafe5 = unsafe4;
                                                i37 = i62;
                                                i2 = i2;
                                                zzksVar5 = zzksVar4;
                                                i35 = i11 == true ? 1 : 0;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                unsafe = unsafe4;
                                                i8 = i62;
                                                bArr2 = bArr;
                                            }
                                        }
                                        i24 = i25;
                                        iZzg = i24;
                                        if (iZzg != i24) {
                                            bArr6 = bArr;
                                            zznkVar2 = zznkVar;
                                            obj5 = obj2;
                                            i34 = i6;
                                            i38 = i9;
                                            i33 = 0;
                                            i36 = i10;
                                            unsafe5 = unsafe4;
                                            i37 = i62;
                                            i2 = i2;
                                            zzksVar5 = zzksVar4;
                                            i35 = i11 == true ? 1 : 0;
                                        } else {
                                            zzksVar2 = zzksVar4;
                                            unsafe = unsafe4;
                                            i8 = i62;
                                            bArr2 = bArr;
                                        }
                                        break;
                                }
                            } else {
                                zznk<T> zznkVar3 = zznkVar2;
                                i11 = i63 == true ? 1 : 0;
                                if (iZzr != 50) {
                                    unsafe = unsafe9;
                                    long j3 = iArr[i6 + 2] & 1048575;
                                    switch (iZzr) {
                                        case 51:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 1) {
                                                iZzk = i31 + 8;
                                                unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzkt.zzn(bArr2, i31))));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 52:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 5) {
                                                iZzk = i31 + 4;
                                                unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzkt.zzb(bArr2, i31))));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzkt.zzk(bArr2, i31, zzksVar2);
                                                unsafe.putObject(obj2, j, Long.valueOf(zzksVar2.zzb));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzkt.zzh(bArr2, i31, zzksVar2);
                                                unsafe.putObject(obj2, j, Integer.valueOf(zzksVar2.zza));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 1) {
                                                iZzk = i31 + 8;
                                                unsafe.putObject(obj2, j, Long.valueOf(zzkt.zzn(bArr2, i31)));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 5) {
                                                iZzk = i31 + 4;
                                                unsafe.putObject(obj2, j, Integer.valueOf(zzkt.zzb(bArr2, i31)));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 58:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 0) {
                                                iZzk = zzkt.zzk(bArr2, i31, zzksVar2);
                                                unsafe.putObject(obj2, j, Boolean.valueOf(zzksVar2.zzb != 0));
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 59:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            if (z == 2) {
                                                iZzk = zzkt.zzh(bArr2, i31, zzksVar2);
                                                int i107 = zzksVar2.zza;
                                                if (i107 == 0) {
                                                    unsafe.putObject(obj2, j, "");
                                                } else {
                                                    int i108 = iZzk + i107;
                                                    if ((i44 & 536870912) != 0 && !zzoo.zzd(bArr2, iZzk, i108)) {
                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j, new String(bArr2, iZzk, i107, zzmk.zza));
                                                    iZzk = i108;
                                                }
                                                unsafe.putInt(obj2, j3, i8);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 60:
                                            if (z == 2) {
                                                Object objZzy = zznkVar3.zzy(obj2, i62, i6);
                                                int iZzm2 = zzkt.zzm(objZzy, zznkVar3.zzv(i6), bArr, i24, i2, zzksVar4);
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr;
                                                zznkVar3.zzG(obj2, i62, i6, objZzy);
                                                iZzg = iZzm2;
                                                i8 = i62;
                                                i30 = i6;
                                                i31 = i24;
                                            } else {
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr;
                                                i8 = i62;
                                                i30 = i6;
                                                i31 = i24;
                                                iZzg = i31;
                                            }
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 61:
                                            bArr5 = bArr;
                                            i32 = i62;
                                            if (z == 2) {
                                                iZza = zzkt.zza(bArr5, i24, zzksVar4);
                                                unsafe.putObject(obj2, j, zzksVar4.zzc);
                                                unsafe.putInt(obj2, j3, i32);
                                                iZzg = iZza;
                                                i8 = i32;
                                                i30 = i6;
                                                i31 = i24;
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i31) {
                                                    zznkVar2 = this;
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i37 = i8;
                                                    i35 = i11 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    zzksVar5 = zzksVar2;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    i34 = i30;
                                                } else {
                                                    i3 = i3;
                                                    i6 = i30;
                                                }
                                            }
                                            i8 = i32;
                                            i30 = i6;
                                            i31 = i24;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr5;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 63:
                                            bArr5 = bArr;
                                            i30 = i6;
                                            i32 = i62;
                                            if (z == 0) {
                                                iZza = zzkt.zzh(bArr5, i24, zzksVar4);
                                                int i109 = zzksVar4.zza;
                                                i6 = i30;
                                                zzmg zzmgVarZzu3 = zznkVar3.zzu(i6);
                                                if (zzmgVarZzu3 == null || zzmgVarZzu3.zza(i109)) {
                                                    unsafe.putObject(obj2, j, Integer.valueOf(i109));
                                                    unsafe.putInt(obj2, j3, i32);
                                                } else {
                                                    zzd(obj2).zzj(i11 == true ? 1 : 0, Long.valueOf(i109));
                                                }
                                                iZzg = iZza;
                                                i8 = i32;
                                                i30 = i6;
                                                i31 = i24;
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i31) {
                                                    zznkVar2 = this;
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i37 = i8;
                                                    i35 = i11 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    zzksVar5 = zzksVar2;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    i34 = i30;
                                                } else {
                                                    i3 = i3;
                                                    i6 = i30;
                                                }
                                            }
                                            i8 = i32;
                                            i31 = i24;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr5;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            i30 = i6;
                                            i32 = i62;
                                            if (z == 0) {
                                                iZzh4 = zzkt.zzh(bArr5, i24, zzksVar4);
                                                unsafe.putObject(obj2, j, Integer.valueOf(zzlg.zzb(zzksVar4.zza)));
                                                unsafe.putInt(obj2, j3, i32);
                                                iZzg = iZzh4;
                                                i8 = i32;
                                                i31 = i24;
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i31) {
                                                    zznkVar2 = this;
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i37 = i8;
                                                    i35 = i11 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    zzksVar5 = zzksVar2;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    i34 = i30;
                                                } else {
                                                    i3 = i3;
                                                    i6 = i30;
                                                }
                                            }
                                            i8 = i32;
                                            i31 = i24;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr5;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            i32 = i62;
                                            if (z == 0) {
                                                iZzh4 = zzkt.zzk(bArr5, i24, zzksVar4);
                                                i30 = i6;
                                                unsafe.putObject(obj2, j, Long.valueOf(zzlg.zzc(zzksVar4.zzb)));
                                                unsafe.putInt(obj2, j3, i32);
                                                iZzg = iZzh4;
                                                i8 = i32;
                                                i31 = i24;
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i31) {
                                                    zznkVar2 = this;
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i37 = i8;
                                                    i35 = i11 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    zzksVar5 = zzksVar2;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    i34 = i30;
                                                } else {
                                                    i3 = i3;
                                                    i6 = i30;
                                                }
                                            }
                                            i8 = i32;
                                            i30 = i6;
                                            i31 = i24;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr5;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                        case 68:
                                            if (z == 3) {
                                                int i110 = ((i11 == true ? 1 : 0) & (-8)) | 4;
                                                i32 = i62;
                                                Object objZzy2 = zznkVar3.zzy(obj2, i32, i6);
                                                iZza = zzkt.zzl(objZzy2, zznkVar3.zzv(i6), bArr, i24, i2, i110, zzksVar4);
                                                zzksVar4 = zzksVar4;
                                                bArr5 = bArr;
                                                zznkVar3.zzG(obj2, i32, i6, objZzy2);
                                                iZzg = iZza;
                                                i8 = i32;
                                                i30 = i6;
                                                i31 = i24;
                                                zzksVar2 = zzksVar4;
                                                bArr2 = bArr5;
                                                if (iZzg != i31) {
                                                    zznkVar2 = this;
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i37 = i8;
                                                    i35 = i11 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    zzksVar5 = zzksVar2;
                                                    i38 = i9;
                                                    i33 = 0;
                                                    i36 = i10;
                                                    i34 = i30;
                                                } else {
                                                    i3 = i3;
                                                    i6 = i30;
                                                }
                                                break;
                                            }
                                        default:
                                            i30 = i6;
                                            i31 = i24;
                                            i8 = i62;
                                            zzksVar2 = zzksVar4;
                                            bArr2 = bArr;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                zznkVar2 = this;
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i37 = i8;
                                                i35 = i11 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                zzksVar5 = zzksVar2;
                                                i38 = i9;
                                                i33 = 0;
                                                i36 = i10;
                                                i34 = i30;
                                            } else {
                                                i3 = i3;
                                                i6 = i30;
                                            }
                                            break;
                                    }
                                } else {
                                    if (z == 2) {
                                        Object objZzw = zznkVar3.zzw(i6);
                                        Object object = unsafe9.getObject(obj2, j);
                                        if (!((zznb) object).zze()) {
                                            zznb zznbVarZzb = zznb.zza().zzb();
                                            zznc.zza(zznbVarZzb, object);
                                            unsafe9.putObject(obj2, j, zznbVarZzb);
                                        }
                                        throw null;
                                    }
                                    unsafe = unsafe9;
                                    iZzg = i24;
                                    i8 = i62;
                                    zzksVar2 = zzksVar4;
                                    bArr2 = bArr;
                                }
                            }
                        } else if (z == 2) {
                            zzmj zzmjVarZzd2 = (zzmj) unsafe8.getObject(obj2, j);
                            if (!zzmjVarZzd2.zzc()) {
                                int size3 = zzmjVarZzd2.size();
                                zzmjVarZzd2 = zzmjVarZzd2.zzd(size3 == 0 ? 10 : size3 + size3);
                                unsafe8.putObject(obj2, j, zzmjVarZzd2);
                            }
                            int iZze = zzkt.zze(zznkVar2.zzv(i6), i41 == true ? 1 : 0, bArr, iZzg, i2, zzmjVarZzd2, zzksVar);
                            bArr6 = bArr;
                            i2 = i2;
                            i35 = i41 == true ? 1 : 0;
                            obj5 = obj2;
                            i34 = i6;
                            i33 = 0;
                            i37 = i62;
                            zzksVar5 = zzksVar;
                            iZzg = iZze;
                            unsafe5 = unsafe8;
                        } else {
                            zzksVar4 = zzksVar;
                            i10 = i36;
                            i24 = iZzg;
                            i9 = i38;
                            unsafe = unsafe8;
                            i11 = i41 == true ? 1 : 0;
                            iZzg = i24;
                            i8 = i62;
                            zzksVar2 = zzksVar4;
                            bArr2 = bArr;
                        }
                    }
                } else {
                    i3 = i3;
                    i6 = i33;
                    i7 = i6;
                    i8 = i42;
                    i9 = i38;
                    i10 = i36;
                    unsafe = unsafe5;
                    i11 = i41 == true ? 1 : 0;
                    bArr2 = bArr6;
                    zzksVar2 = zzksVar5;
                    obj2 = obj5;
                }
                if (i11 != i3 || i3 == 0) {
                    zznkVar2 = this;
                    if (zznkVar2.zzh) {
                        zzlp zzlpVar = zzksVar2.zzd;
                        int i111 = zzlp.zzb;
                        int i112 = zznp.zza;
                        if (zzlpVar != zzlp.zza) {
                            zznh zznhVar = zznkVar2.zzg;
                            int i113 = zzkt.zza;
                            if (zzlpVar.zzb(zznhVar, i8) != null) {
                                throw null;
                            }
                            i13 = i2;
                            i12 = i11;
                            iZzg = zzkt.zzg(i12 == true ? 1 : 0, bArr2, iZzg, i13, zzd(obj2), zzksVar2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                            iZzg = zzkt.zzg(i12 == true ? 1 : 0, bArr, iZzg, i13, zzd(obj2), zzksVar);
                        }
                    } else {
                        i12 = i11;
                        i13 = i2;
                        iZzg = zzkt.zzg(i12 == true ? 1 : 0, bArr, iZzg, i13, zzd(obj2), zzksVar);
                    }
                    bArr6 = bArr;
                    i35 = i12;
                    i2 = i13;
                    obj5 = obj2;
                    i37 = i8;
                    i34 = i6;
                    unsafe5 = unsafe;
                    i38 = i9;
                    i33 = i7;
                    i36 = i10;
                    zzksVar5 = zzksVar;
                } else {
                    zznkVar2 = this;
                    i4 = i2;
                    i35 = i11;
                    i5 = i9;
                    i36 = i10;
                }
            } else {
                i3 = i3;
                obj2 = obj5;
                i4 = i2;
                int i114 = i38;
                unsafe = unsafe5;
                i5 = i114;
            }
        }
        if (i5 != 1048575) {
            unsafe.putInt(obj2, i5, i36);
        }
        for (int i115 = zznkVar2.zzj; i115 < zznkVar2.zzk; i115++) {
            int[] iArr2 = zznkVar2.zzi;
            int[] iArr3 = zznkVar2.zzc;
            int i116 = iArr2[i115];
            int i117 = iArr3[i116];
            Object objZzf = zzol.zzf(obj2, zznkVar2.zzs(i116) & 1048575);
            if (objZzf != null && zznkVar2.zzu(i116) != null) {
                throw null;
            }
        }
        if (i3 == 0) {
            if (iZzg != i4) {
                throw new zzmm("Failed to parse the message.");
            }
        } else if (iZzg > i4 || i35 != i3) {
            throw new zzmm("Failed to parse the message.");
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final Object zze() {
        return ((zzmd) this.zzg).zzcj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzmd) {
                zzmd zzmdVar = (zzmd) obj;
                zzmdVar.zzcu(Integer.MAX_VALUE);
                zzmdVar.zza = 0;
                zzmdVar.zzcs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzv(i).zzf(zzb.getObject(obj, j));
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
                                ((zzmj) zzol.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zznb) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznu.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznu.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzol.zzo(obj, j, zzol.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzol.zzp(obj, j, zzol.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzol.zzm(obj, j, zzol.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
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
                    zzmj zzmjVarZzd = (zzmj) zzol.zzf(obj, j);
                    zzmj zzmjVar = (zzmj) zzol.zzf(obj2, j);
                    int size = zzmjVarZzd.size();
                    int size2 = zzmjVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmjVarZzd.zzc()) {
                            zzmjVarZzd = zzmjVarZzd.zzd(size2 + size);
                        }
                        zzmjVarZzd.addAll(zzmjVar);
                    }
                    if (size > 0) {
                        zzmjVar = zzmjVarZzd;
                    }
                    zzol.zzs(obj, j, zzmjVar);
                    break;
                case 50:
                    int i4 = zznu.zza;
                    zzol.zzs(obj, j, zznc.zza(zzol.zzf(obj, j), zzol.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzks zzksVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzksVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzi(Object obj, zzor zzorVar) throws IOException {
        Map.Entry entry;
        int i;
        zznk<T> zznkVar = this;
        if (zznkVar.zzh) {
            zzlu zzluVar = ((zzma) obj).zzb;
            if (zzluVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzluVar.zze().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zznkVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iZzs = zznkVar.zzs(i4);
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            if (iZzr <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzs & i2;
            switch (iZzr) {
                case 0:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzf(i6, zzol.zza(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 1:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzo(i6, zzol.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 2:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 3:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzK(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 4:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 5:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 6:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 7:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzb(i6, zzol.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 8:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzO(i6, unsafe.getObject(obj, j), zzorVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 9:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzv(i6, unsafe.getObject(obj, j), zznkVar.zzv(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 10:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzd(i6, (zzld) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 11:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzI(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 12:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 13:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzx(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 14:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzz(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 15:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzB(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 16:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzD(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 17:
                    if (zznkVar.zzJ(obj, i4, i3, i5, i)) {
                        zzorVar.zzq(i6, unsafe.getObject(obj, j), zznkVar.zzv(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 18:
                    zznu.zzr(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 19:
                    zznu.zzv(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 20:
                    zznu.zzx(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 21:
                    zznu.zzD(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 22:
                    zznu.zzw(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 23:
                    zznu.zzu(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 24:
                    zznu.zzt(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 25:
                    zznu.zzq(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 26:
                    int i9 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zznu.zza;
                    if (list != null && !list.isEmpty()) {
                        zzorVar.zzH(i9, list);
                    }
                    break;
                case 27:
                    int i11 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzns zznsVarZzv = zznkVar.zzv(i4);
                    int i12 = zznu.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzll) zzorVar).zzv(i11, list2.get(i13), zznsVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zznu.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzorVar.zze(i14, list3);
                    }
                    break;
                case 29:
                    zznu.zzC(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 30:
                    zznu.zzs(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 31:
                    zznu.zzy(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 32:
                    zznu.zzz(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 33:
                    zznu.zzA(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 34:
                    zznu.zzB(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zznkVar = this;
                    break;
                case 35:
                    zznu.zzr(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 36:
                    zznu.zzv(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 37:
                    zznu.zzx(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 38:
                    zznu.zzD(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 39:
                    zznu.zzw(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 40:
                    zznu.zzu(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 41:
                    zznu.zzt(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 42:
                    zznu.zzq(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 43:
                    zznu.zzC(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 44:
                    zznu.zzs(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 45:
                    zznu.zzy(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 46:
                    zznu.zzz(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 47:
                    zznu.zzA(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 48:
                    zznu.zzB(iArr[i4], (List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzns zznsVarZzv2 = zznkVar.zzv(i4);
                    int i17 = zznu.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzll) zzorVar).zzq(i16, list4.get(i18), zznsVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzf(i6, zzm(obj, j));
                    }
                    break;
                case 52:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzo(i6, zzn(obj, j));
                    }
                    break;
                case 53:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzt(i6, zzt(obj, j));
                    }
                    break;
                case 54:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzK(i6, zzt(obj, j));
                    }
                    break;
                case 55:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzr(i6, zzo(obj, j));
                    }
                    break;
                case 56:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzm(i6, zzt(obj, j));
                    }
                    break;
                case 57:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzk(i6, zzo(obj, j));
                    }
                    break;
                case 58:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzb(i6, zzN(obj, j));
                    }
                    break;
                case 59:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzO(i6, unsafe.getObject(obj, j), zzorVar);
                    }
                    break;
                case 60:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzv(i6, unsafe.getObject(obj, j), zznkVar.zzv(i4));
                    }
                    break;
                case 61:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzd(i6, (zzld) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzI(i6, zzo(obj, j));
                    }
                    break;
                case 63:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzi(i6, zzo(obj, j));
                    }
                    break;
                case 64:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzx(i6, zzo(obj, j));
                    }
                    break;
                case 65:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzz(i6, zzt(obj, j));
                    }
                    break;
                case 66:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzB(i6, zzo(obj, j));
                    }
                    break;
                case 67:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzD(i6, zzt(obj, j));
                    }
                    break;
                case 68:
                    if (zznkVar.zzM(obj, i6, i4)) {
                        zzorVar.zzq(i6, unsafe.getObject(obj, j), zznkVar.zzv(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            zznkVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzmd) obj).zzc.zzl(zzorVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzol.zza(obj, j)) != Double.doubleToLongBits(zzol.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzol.zzb(obj, j)) != Float.floatToIntBits(zzol.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzol.zzd(obj, j) != zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzol.zzd(obj, j) != zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzol.zzd(obj, j) != zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzol.zzw(obj, j) != zzol.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzol.zzd(obj, j) != zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzol.zzc(obj, j) != zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzol.zzd(obj, j) != zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
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
                    zZzE = zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j));
                    break;
                case 50:
                    zZzE = zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzol.zzc(obj, jZzp) != zzol.zzc(obj2, jZzp) || !zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzmd) obj).zzc.equals(((zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzma) obj).zzb.equals(((zzma) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzns zznsVarZzv;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzs = zzs(i7);
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
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i7, i, i2, i11) && !zzK(obj, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzol.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznsVarZzv = zzv(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zznsVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i8, i7) && !zzK(obj, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzol.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    zznsVarZzv = zzv(i7);
                    while (i3 < list.size()) {
                        if (!zznsVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zznb) zzol.zzf(obj, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzma) obj).zzb.zzh();
    }
}
