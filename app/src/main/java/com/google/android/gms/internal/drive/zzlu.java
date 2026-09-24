package com.google.android.gms.internal.drive;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzlu<T> implements zzmf<T> {
    private static final int[] zzub = new int[0];
    private static final Unsafe zzuc = zznd.zzff();
    private final int[] zzud;
    private final Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final zzly zzup;
    private final zzla zzuq;
    private final zzmx<?, ?> zzur;
    private final zzjy<?> zzus;
    private final zzll zzut;

    private zzlu(int[] iArr, Object[] objArr, int i, int i2, zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0370  */
    /* JADX WARN: Code duplicated, block: B:170:0x0374  */
    /* JADX WARN: Code duplicated, block: B:172:0x037f  */
    /* JADX WARN: Code duplicated, block: B:175:0x038b A[LOOP:6: B:173:0x0383->B:175:0x038b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0399  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:183:0x03be  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:191:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x0395 A[EDGE_INSN: B:214:0x0395->B:176:0x0395 BREAK  A[LOOP:6: B:173:0x0383->B:175:0x038b], SYNTHETIC] */
    static <T> zzlu<T> zza(Class<T> cls, zzlo zzloVar, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
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
        int i19;
        int i20;
        int iObjectFieldOffset;
        int i21;
        int iObjectFieldOffset2;
        int i22;
        int i23;
        int i24;
        int iCharAt2;
        int i25;
        Object obj;
        Field fieldZza;
        int i26;
        int i27;
        char cCharAt9;
        int i28;
        Field fieldZza2;
        Field fieldZza3;
        int i29;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        char cCharAt14;
        if (zzloVar instanceof zzme) {
            zzme zzmeVar = (zzme) zzloVar;
            int i35 = 0;
            boolean z = zzmeVar.zzec() == zzkk.zze.zzsg;
            String strZzek = zzmeVar.zzek();
            int length = strZzek.length();
            int iCharAt3 = strZzek.charAt(0);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 1;
                int i38 = 13;
                while (true) {
                    i = i37 + 1;
                    cCharAt14 = strZzek.charAt(i37);
                    if (cCharAt14 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt14 & 8191) << i38;
                    i38 += 13;
                    i37 = i;
                }
                iCharAt3 = i36 | (cCharAt14 << i38);
            } else {
                i = 1;
            }
            int i39 = i + 1;
            int iCharAt4 = strZzek.charAt(i);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i34 = i39 + 1;
                    cCharAt13 = strZzek.charAt(i39);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt13 & 8191) << i41;
                    i41 += 13;
                    i39 = i34;
                }
                iCharAt4 = i40 | (cCharAt13 << i41);
                i39 = i34;
            }
            if (iCharAt4 == 0) {
                i4 = 0;
                iCharAt = 0;
                i6 = 0;
                i7 = 0;
                i3 = 0;
                iArr = zzub;
                i5 = 0;
            } else {
                int i42 = i39 + 1;
                int iCharAt5 = strZzek.charAt(i39);
                if (iCharAt5 >= 55296) {
                    int i43 = iCharAt5 & 8191;
                    int i44 = 13;
                    while (true) {
                        i15 = i42 + 1;
                        cCharAt8 = strZzek.charAt(i42);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i43 |= (cCharAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i15;
                    }
                    iCharAt5 = i43 | (cCharAt8 << i44);
                    i42 = i15;
                }
                int i45 = i42 + 1;
                int iCharAt6 = strZzek.charAt(i42);
                if (iCharAt6 >= 55296) {
                    int i46 = iCharAt6 & 8191;
                    int i47 = 13;
                    while (true) {
                        i14 = i45 + 1;
                        cCharAt7 = strZzek.charAt(i45);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i46 |= (cCharAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i14;
                    }
                    iCharAt6 = i46 | (cCharAt7 << i47);
                    i45 = i14;
                }
                int i48 = i45 + 1;
                iCharAt = strZzek.charAt(i45);
                if (iCharAt >= 55296) {
                    int i49 = iCharAt & 8191;
                    int i50 = 13;
                    while (true) {
                        i13 = i48 + 1;
                        cCharAt6 = strZzek.charAt(i48);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i49 |= (cCharAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i13;
                    }
                    iCharAt = i49 | (cCharAt6 << i50);
                    i48 = i13;
                }
                int i51 = i48 + 1;
                int iCharAt7 = strZzek.charAt(i48);
                if (iCharAt7 >= 55296) {
                    int i52 = iCharAt7 & 8191;
                    int i53 = 13;
                    while (true) {
                        i12 = i51 + 1;
                        cCharAt5 = strZzek.charAt(i51);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i52 |= (cCharAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i12;
                    }
                    iCharAt7 = i52 | (cCharAt5 << i53);
                    i51 = i12;
                }
                int i54 = i51 + 1;
                int iCharAt8 = strZzek.charAt(i51);
                if (iCharAt8 >= 55296) {
                    int i55 = iCharAt8 & 8191;
                    int i56 = 13;
                    while (true) {
                        i11 = i54 + 1;
                        cCharAt4 = strZzek.charAt(i54);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i55 |= (cCharAt4 & 8191) << i56;
                        i56 += 13;
                        i54 = i11;
                    }
                    iCharAt8 = i55 | (cCharAt4 << i56);
                    i54 = i11;
                }
                int i57 = i54 + 1;
                int iCharAt9 = strZzek.charAt(i54);
                if (iCharAt9 >= 55296) {
                    int i58 = iCharAt9 & 8191;
                    int i59 = 13;
                    while (true) {
                        i10 = i57 + 1;
                        cCharAt3 = strZzek.charAt(i57);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i58 |= (cCharAt3 & 8191) << i59;
                        i59 += 13;
                        i57 = i10;
                    }
                    iCharAt9 = i58 | (cCharAt3 << i59);
                    i57 = i10;
                }
                int i60 = i57 + 1;
                int iCharAt10 = strZzek.charAt(i57);
                if (iCharAt10 >= 55296) {
                    int i61 = iCharAt10 & 8191;
                    int i62 = i60;
                    int i63 = 13;
                    while (true) {
                        i9 = i62 + 1;
                        cCharAt2 = strZzek.charAt(i62);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i61 |= (cCharAt2 & 8191) << i63;
                        i63 += 13;
                        i62 = i9;
                    }
                    iCharAt10 = i61 | (cCharAt2 << i63);
                    i2 = i9;
                } else {
                    i2 = i60;
                }
                int i64 = i2 + 1;
                int iCharAt11 = strZzek.charAt(i2);
                if (iCharAt11 >= 55296) {
                    int i65 = iCharAt11 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i8 = i66 + 1;
                        cCharAt = strZzek.charAt(i66);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i65 |= (cCharAt & 8191) << i67;
                        i67 += 13;
                        i66 = i8;
                    }
                    iCharAt11 = i65 | (cCharAt << i67);
                    i64 = i8;
                }
                int[] iArr2 = new int[iCharAt11 + iCharAt9 + iCharAt10];
                i3 = (iCharAt5 << 1) + iCharAt6;
                int i68 = iCharAt8;
                iArr = iArr2;
                i4 = i68;
                i5 = iCharAt7;
                i6 = iCharAt9;
                i7 = iCharAt11;
                i35 = iCharAt5;
                i39 = i64;
            }
            int i69 = 1;
            Unsafe unsafe = zzuc;
            Object[] objArrZzel = zzmeVar.zzel();
            Class<?> cls2 = zzmeVar.zzee().getClass();
            int[] iArr3 = new int[i4 * 3];
            Object[] objArr = new Object[i4 << 1];
            int i70 = i6 + i7;
            int i71 = i70;
            int i72 = i7;
            int i73 = 0;
            int i74 = 0;
            while (i39 < length) {
                int i75 = i39 + 1;
                int iCharAt12 = strZzek.charAt(i39);
                int[] iArr4 = iArr3;
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i33 = i77 + 1;
                        cCharAt12 = strZzek.charAt(i77);
                        i16 = length;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt12 & 8191) << i78;
                        i78 += 13;
                        i77 = i33;
                        length = i16;
                    }
                    iCharAt12 = i76 | (cCharAt12 << i78);
                    i17 = i33;
                } else {
                    i16 = length;
                    i17 = i75;
                }
                int i79 = i17 + 1;
                int iCharAt13 = strZzek.charAt(i17);
                if (iCharAt13 >= 55296) {
                    int i80 = iCharAt13 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i31 = i81 + 1;
                        cCharAt11 = strZzek.charAt(i81);
                        i32 = i80;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i80 = i32 | ((cCharAt11 & 8191) << i82);
                        i82 += 13;
                        i81 = i31;
                    }
                    iCharAt13 = i32 | (cCharAt11 << i82);
                    i18 = i31;
                } else {
                    i18 = i79;
                }
                int i83 = i35;
                int i84 = iCharAt13 & 255;
                int i85 = iCharAt3;
                if ((iCharAt13 & 1024) != 0) {
                    iArr[i73] = i74;
                    i73++;
                }
                Object[] objArr2 = objArr;
                if (i84 >= 51) {
                    int i86 = i18 + 1;
                    int iCharAt14 = strZzek.charAt(i18);
                    char c = 55296;
                    if (iCharAt14 >= 55296) {
                        int i87 = iCharAt14 & 8191;
                        int i88 = 13;
                        while (true) {
                            i30 = i86 + 1;
                            cCharAt10 = strZzek.charAt(i86);
                            if (cCharAt10 < c) {
                                break;
                            }
                            i87 |= (cCharAt10 & 8191) << i88;
                            i88 += 13;
                            i86 = i30;
                            c = 55296;
                        }
                        iCharAt14 = i87 | (cCharAt10 << i88);
                        i86 = i30;
                    }
                    int i89 = i84 - 51;
                    int i90 = iCharAt14;
                    if (i89 == 9 || i89 == 17) {
                        objArr2[((i74 / 3) << 1) + 1] = objArrZzel[i3];
                        i3++;
                    } else if (i89 == 12 && (i85 & 1) == (i29 = i69)) {
                        objArr2[((i74 / 3) << i29) + i29] = objArrZzel[i3];
                        i3++;
                    }
                    int i91 = i90 << 1;
                    Object obj2 = objArrZzel[i91];
                    if (obj2 instanceof Field) {
                        fieldZza2 = (Field) obj2;
                    } else {
                        fieldZza2 = zza(cls2, (String) obj2);
                        objArrZzel[i91] = fieldZza2;
                    }
                    int i92 = i86;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i93 = i91 + 1;
                    Object obj3 = objArrZzel[i93];
                    if (obj3 instanceof Field) {
                        fieldZza3 = (Field) obj3;
                    } else {
                        fieldZza3 = zza(cls2, (String) obj3);
                        objArrZzel[i93] = fieldZza3;
                    }
                    i19 = iCharAt12;
                    i39 = i92;
                    strZzek = strZzek;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    i20 = i3;
                    i23 = iObjectFieldOffset3;
                    i22 = 0;
                    i69 = 1;
                    i5 = i5;
                } else {
                    int i94 = i3 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZzel[i3]);
                    if (i84 == 9 || i84 == 17) {
                        i19 = iCharAt12;
                        objArr2[((i74 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i84 == 27 || i84 == 49) {
                            i19 = iCharAt12;
                            i28 = i3 + 2;
                            objArr2[((i74 / 3) << 1) + 1] = objArrZzel[i94];
                        } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                            i19 = iCharAt12;
                            if ((i85 & 1) == 1) {
                                i28 = i3 + 2;
                                objArr2[((i74 / 3) << 1) + 1] = objArrZzel[i94];
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                            if ((i85 & 1) == 1) {
                                if (i84 <= 17) {
                                    i24 = i18 + 1;
                                    iCharAt2 = strZzek.charAt(i18);
                                    if (iCharAt2 >= 55296) {
                                        i26 = iCharAt2 & 8191;
                                        i27 = 13;
                                        while (true) {
                                            i21 = i24 + 1;
                                            cCharAt9 = strZzek.charAt(i24);
                                            if (cCharAt9 >= 55296) {
                                                break;
                                            }
                                            i26 |= (cCharAt9 & 8191) << i27;
                                            i27 += 13;
                                            i24 = i21;
                                        }
                                        iCharAt2 = i26 | (cCharAt9 << i27);
                                    } else {
                                        i21 = i24;
                                    }
                                    i69 = 1;
                                    i25 = (i83 << 1) + (iCharAt2 / 32);
                                    obj = objArrZzel[i25];
                                    if (obj instanceof Field) {
                                        fieldZza = (Field) obj;
                                    } else {
                                        fieldZza = zza(cls2, (String) obj);
                                        objArrZzel[i25] = fieldZza;
                                    }
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                                    i22 = iCharAt2 % 32;
                                } else {
                                    i69 = 1;
                                }
                                if (i84 >= 18 || i84 > 49) {
                                    i23 = iObjectFieldOffset;
                                } else {
                                    iArr[i71] = iObjectFieldOffset;
                                    i23 = iObjectFieldOffset;
                                    i71++;
                                }
                                i39 = i21;
                            } else {
                                i69 = 1;
                            }
                            i21 = i18;
                            iObjectFieldOffset2 = 0;
                            i22 = 0;
                            if (i84 >= 18) {
                                i23 = iObjectFieldOffset;
                            } else {
                                i23 = iObjectFieldOffset;
                            }
                            i39 = i21;
                        } else {
                            if (i84 == 50) {
                                int i95 = i72 + 1;
                                iArr[i72] = i74;
                                int i96 = (i74 / 3) << 1;
                                int i97 = i3 + 2;
                                objArr2[i96] = objArrZzel[i94];
                                if ((iCharAt13 & 2048) != 0) {
                                    i20 = i3 + 3;
                                    objArr2[i96 + 1] = objArrZzel[i97];
                                    i19 = iCharAt12;
                                    i72 = i95;
                                } else {
                                    i20 = i97;
                                    i72 = i95;
                                    i19 = iCharAt12;
                                }
                            } else {
                                i19 = iCharAt12;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                            if ((i85 & 1) == 1) {
                                if (i84 <= 17) {
                                    i24 = i18 + 1;
                                    iCharAt2 = strZzek.charAt(i18);
                                    if (iCharAt2 >= 55296) {
                                        i26 = iCharAt2 & 8191;
                                        i27 = 13;
                                        while (true) {
                                            i21 = i24 + 1;
                                            cCharAt9 = strZzek.charAt(i24);
                                            if (cCharAt9 >= 55296) {
                                                break;
                                                break;
                                            }
                                            i26 |= (cCharAt9 & 8191) << i27;
                                            i27 += 13;
                                            i24 = i21;
                                        }
                                        iCharAt2 = i26 | (cCharAt9 << i27);
                                    } else {
                                        i21 = i24;
                                    }
                                    i69 = 1;
                                    i25 = (i83 << 1) + (iCharAt2 / 32);
                                    obj = objArrZzel[i25];
                                    if (obj instanceof Field) {
                                        fieldZza = (Field) obj;
                                    } else {
                                        fieldZza = zza(cls2, (String) obj);
                                        objArrZzel[i25] = fieldZza;
                                    }
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                                    i22 = iCharAt2 % 32;
                                } else {
                                    i69 = 1;
                                }
                                if (i84 >= 18) {
                                    i23 = iObjectFieldOffset;
                                } else {
                                    i23 = iObjectFieldOffset;
                                }
                                i39 = i21;
                            } else {
                                i69 = 1;
                            }
                            i21 = i18;
                            iObjectFieldOffset2 = 0;
                            i22 = 0;
                            if (i84 >= 18) {
                                i23 = iObjectFieldOffset;
                            } else {
                                i23 = iObjectFieldOffset;
                            }
                            i39 = i21;
                        }
                        i20 = i28;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                        if ((i85 & 1) == 1) {
                            if (i84 <= 17) {
                                i24 = i18 + 1;
                                iCharAt2 = strZzek.charAt(i18);
                                if (iCharAt2 >= 55296) {
                                    i26 = iCharAt2 & 8191;
                                    i27 = 13;
                                    while (true) {
                                        i21 = i24 + 1;
                                        cCharAt9 = strZzek.charAt(i24);
                                        if (cCharAt9 >= 55296) {
                                            break;
                                            break;
                                        }
                                        i26 |= (cCharAt9 & 8191) << i27;
                                        i27 += 13;
                                        i24 = i21;
                                    }
                                    iCharAt2 = i26 | (cCharAt9 << i27);
                                } else {
                                    i21 = i24;
                                }
                                i69 = 1;
                                i25 = (i83 << 1) + (iCharAt2 / 32);
                                obj = objArrZzel[i25];
                                if (obj instanceof Field) {
                                    fieldZza = (Field) obj;
                                } else {
                                    fieldZza = zza(cls2, (String) obj);
                                    objArrZzel[i25] = fieldZza;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                                i22 = iCharAt2 % 32;
                            } else {
                                i69 = 1;
                            }
                            if (i84 >= 18) {
                                i23 = iObjectFieldOffset;
                            } else {
                                i23 = iObjectFieldOffset;
                            }
                            i39 = i21;
                        } else {
                            i69 = 1;
                        }
                        i21 = i18;
                        iObjectFieldOffset2 = 0;
                        i22 = 0;
                        if (i84 >= 18) {
                            i23 = iObjectFieldOffset;
                        } else {
                            i23 = iObjectFieldOffset;
                        }
                        i39 = i21;
                    }
                    i20 = i94;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((i85 & 1) == 1) {
                        if (i84 <= 17) {
                            i24 = i18 + 1;
                            iCharAt2 = strZzek.charAt(i18);
                            if (iCharAt2 >= 55296) {
                                i26 = iCharAt2 & 8191;
                                i27 = 13;
                                while (true) {
                                    i21 = i24 + 1;
                                    cCharAt9 = strZzek.charAt(i24);
                                    if (cCharAt9 >= 55296) {
                                        break;
                                        break;
                                    }
                                    i26 |= (cCharAt9 & 8191) << i27;
                                    i27 += 13;
                                    i24 = i21;
                                }
                                iCharAt2 = i26 | (cCharAt9 << i27);
                            } else {
                                i21 = i24;
                            }
                            i69 = 1;
                            i25 = (i83 << 1) + (iCharAt2 / 32);
                            obj = objArrZzel[i25];
                            if (obj instanceof Field) {
                                fieldZza = (Field) obj;
                            } else {
                                fieldZza = zza(cls2, (String) obj);
                                objArrZzel[i25] = fieldZza;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                            i22 = iCharAt2 % 32;
                        } else {
                            i69 = 1;
                        }
                        if (i84 >= 18) {
                            i23 = iObjectFieldOffset;
                        } else {
                            i23 = iObjectFieldOffset;
                        }
                        i39 = i21;
                    } else {
                        i69 = 1;
                    }
                    i21 = i18;
                    iObjectFieldOffset2 = 0;
                    i22 = 0;
                    if (i84 >= 18) {
                        i23 = iObjectFieldOffset;
                    } else {
                        i23 = iObjectFieldOffset;
                    }
                    i39 = i21;
                }
                int i98 = i74 + 1;
                iArr4[i74] = i19;
                int i99 = i74 + 2;
                int i100 = iObjectFieldOffset2;
                iArr4[i98] = ((iCharAt13 & 256) != 0 ? 268435456 : 0) | ((iCharAt13 & 512) != 0 ? 536870912 : 0) | (i84 << 20) | i23;
                i74 += 3;
                iArr4[i99] = (i22 << 20) | i100;
                i5 = i5;
                i35 = i83;
                iArr3 = iArr4;
                iCharAt3 = i85;
                length = i16;
                strZzek = strZzek;
                i3 = i20;
                objArr = objArr2;
            }
            return new zzlu<>(iArr3, objArr, iCharAt, i5, zzmeVar.zzee(), z, false, iArr, i7, i70, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
        }
        ((zzms) zzloVar).zzec();
        int i101 = zzkk.zze.zzsg;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzup.newInstance(this.zzuh);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        int length = this.zzud.length;
        int i = 0;
        while (true) {
            boolean zZzd = true;
            if (i < length) {
                int iZzas = zzas(i);
                long j = iZzas & 1048575;
                switch ((iZzas & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || Double.doubleToLongBits(zznd.zzn(t, j)) != Double.doubleToLongBits(zznd.zzn(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || Float.floatToIntBits(zznd.zzm(t, j)) != Float.floatToIntBits(zznd.zzm(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || zznd.zzl(t, j) != zznd.zzl(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
                            zZzd = false;
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
                        zZzd = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
                        break;
                    case 50:
                        zZzd = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
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
                        long jZzat = zzat(i) & 1048575;
                        if (zznd.zzj(t, jZzat) != zznd.zzj(t2, jZzat) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                }
                if (!zZzd) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
                    return false;
                }
                if (this.zzui) {
                    return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int i;
        int iZzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & iZzas;
            int iHashCode = 37;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(t, j)));
                    i2 = i + iZzu;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzu = Float.floatToIntBits(zznd.zzm(t, j));
                    i2 = i + iZzu;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzu = zzkm.zze(zznd.zzl(t, j));
                    i2 = i + iZzu;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzu = ((String) zznd.zzo(t, j)).hashCode();
                    i2 = i + iZzu;
                    break;
                case 9:
                    Object objZzo = zznd.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 17:
                    Object objZzo2 = zznd.zzo(t, j);
                    if (objZzo2 != null) {
                        iHashCode = objZzo2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(Double.doubleToLongBits(zze(t, j)));
                        i2 = i + iZzu;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = Float.floatToIntBits(zzf(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 55:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 56:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 57:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 58:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zze(zzi(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = ((String) zznd.zzo(t, j)).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 62:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 63:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 64:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 65:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 66:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 67:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzur.zzr(t).hashCode();
        return this.zzui ? (iHashCode2 * 53) + this.zzus.zzb(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzud.length; i += 3) {
            int iZzas = zzas(i);
            long j = 1048575 & iZzas;
            int i2 = this.zzud[i];
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    if (zza(t2, i)) {
                        zznd.zza(t, j, zznd.zzn(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 1:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzm(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 2:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 3:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 4:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 5:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 6:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 7:
                    if (zza(t2, i)) {
                        zznd.zza(t, j, zznd.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 8:
                    if (zza(t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza(t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 11:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 12:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 13:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 14:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 15:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 16:
                    if (zza(t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 17:
                    zza(t, t2, i);
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
                    this.zzuq.zza(t, t2, j);
                    break;
                case 50:
                    zzmh.zza(this.zzut, t, t2, j);
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
                    if (zza(t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            zzmh.zza(this.zzus, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzas = zzas(i) & 1048575;
        if (zza(t2, i)) {
            Object objZzo = zznd.zzo(t, jZzas);
            Object objZzo2 = zznd.zzo(t2, jZzas);
            if (objZzo != null && objZzo2 != null) {
                zznd.zza(t, jZzas, zzkm.zza(objZzo, objZzo2));
                zzb(t, i);
            } else if (objZzo2 != null) {
                zznd.zza(t, jZzas, objZzo2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzas = zzas(i);
        int i2 = this.zzud[i];
        long j = iZzas & 1048575;
        if (zza(t2, i2, i)) {
            Object objZzo = zznd.zzo(t, j);
            Object objZzo2 = zznd.zzo(t2, j);
            if (objZzo != null && objZzo2 != null) {
                zznd.zza(t, j, zzkm.zza(objZzo, objZzo2));
                zzb(t, i2, i);
            } else if (objZzo2 != null) {
                zznd.zza(t, j, objZzo2);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:420:0x090b A[PHI: r6
  0x090b: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v12 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v13 int)
  (r6v1 int)
 binds: [B:255:0x0549, B:461:0x09b5, B:458:0x09ab, B:452:0x098f, B:449:0x097d, B:446:0x096e, B:443:0x0961, B:440:0x0954, B:436:0x0949, B:433:0x0940, B:430:0x0933, B:427:0x0926, B:424:0x0913, B:395:0x081e, B:389:0x0801, B:383:0x07e4, B:377:0x07c7, B:371:0x07a9, B:365:0x078b, B:359:0x076d, B:353:0x074f, B:347:0x0731, B:341:0x0713, B:335:0x06f5, B:329:0x06d7, B:323:0x06b9, B:317:0x069b, B:312:0x0667, B:309:0x065a, B:306:0x064a, B:303:0x063a, B:300:0x062a, B:297:0x061e, B:294:0x0611, B:291:0x0605, B:285:0x05e7, B:282:0x05d3, B:279:0x05c1, B:276:0x05b1, B:273:0x05a1, B:438:0x0950, B:270:0x0594, B:267:0x0588, B:264:0x0578, B:261:0x0568, B:419:0x090a, B:258:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        int iZzd;
        int iZzc;
        int iZzk;
        int i4;
        int iZzv;
        int iZzi;
        int iZzab;
        int iZzad;
        int iZzb;
        int iZzi2;
        int iZzab2;
        int iZzad2;
        int i5 = 267386880;
        int i6 = 1048575;
        int i7 = 0;
        if (this.zzuk) {
            Unsafe unsafe = zzuc;
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.zzud.length) {
                int iZzas = zzas(i8);
                int i10 = (iZzas & i5) >>> 20;
                int i11 = i5;
                int i12 = this.zzud[i8];
                long j = iZzas & 1048575;
                int i13 = (i10 < zzke.DOUBLE_LIST_PACKED.m22294id() || i10 > zzke.SINT64_LIST_PACKED.m22294id()) ? 0 : this.zzud[i8 + 2] & 1048575;
                switch (i10) {
                    case 0:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzb(i12, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                            i9 += iZzb;
                        }
                        break;
                    case 1:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzb(i12, 0.0f);
                            i9 += iZzb;
                        }
                        break;
                    case 2:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzd(i12, zznd.zzk(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 3:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zze(i12, zznd.zzk(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 4:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzg(i12, zznd.zzj(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 5:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzg(i12, 0L);
                            i9 += iZzb;
                        }
                        break;
                    case 6:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzj(i12, 0);
                            i9 += iZzb;
                        }
                        break;
                    case 7:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzc(i12, true);
                            i9 += iZzb;
                        }
                        break;
                    case 8:
                        if (zza(t, i8)) {
                            Object objZzo = zznd.zzo(t, j);
                            if (objZzo instanceof zzjc) {
                                iZzb = zzjr.zzc(i12, (zzjc) objZzo);
                            } else {
                                iZzb = zzjr.zzb(i12, (String) objZzo);
                            }
                            i9 += iZzb;
                        }
                        break;
                    case 9:
                        if (zza(t, i8)) {
                            iZzb = zzmh.zzc(i12, zznd.zzo(t, j), zzap(i8));
                            i9 += iZzb;
                        }
                        break;
                    case 10:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzc(i12, (zzjc) zznd.zzo(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 11:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzh(i12, zznd.zzj(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 12:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzl(i12, zznd.zzj(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 13:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzk(i12, 0);
                            i9 += iZzb;
                        }
                        break;
                    case 14:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzh(i12, 0L);
                            i9 += iZzb;
                        }
                        break;
                    case 15:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzi(i12, zznd.zzj(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 16:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzf(i12, zznd.zzk(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 17:
                        if (zza(t, i8)) {
                            iZzb = zzjr.zzc(i12, (zzlq) zznd.zzo(t, j), zzap(i8));
                            i9 += iZzb;
                        }
                        break;
                    case 18:
                        iZzb = zzmh.zzw(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 19:
                        iZzb = zzmh.zzv(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 20:
                        iZzb = zzmh.zzo(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 21:
                        iZzb = zzmh.zzp(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 22:
                        iZzb = zzmh.zzs(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 23:
                        iZzb = zzmh.zzw(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 24:
                        iZzb = zzmh.zzv(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 25:
                        iZzb = zzmh.zzx(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 26:
                        iZzb = zzmh.zzc(i12, zzd(t, j));
                        i9 += iZzb;
                        break;
                    case 27:
                        iZzb = zzmh.zzc(i12, (List<?>) zzd(t, j), zzap(i8));
                        i9 += iZzb;
                        break;
                    case 28:
                        iZzb = zzmh.zzd(i12, (List<zzjc>) zzd(t, j));
                        i9 += iZzb;
                        break;
                    case 29:
                        iZzb = zzmh.zzt(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 30:
                        iZzb = zzmh.zzr(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 31:
                        iZzb = zzmh.zzv(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 32:
                        iZzb = zzmh.zzw(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 33:
                        iZzb = zzmh.zzu(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 34:
                        iZzb = zzmh.zzq(i12, zzd(t, j), false);
                        i9 += iZzb;
                        break;
                    case 35:
                        iZzi2 = zzmh.zzi((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 36:
                        iZzi2 = zzmh.zzh((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 37:
                        iZzi2 = zzmh.zza((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 38:
                        iZzi2 = zzmh.zzb((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 39:
                        iZzi2 = zzmh.zze((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 40:
                        iZzi2 = zzmh.zzi((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 41:
                        iZzi2 = zzmh.zzh((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 42:
                        iZzi2 = zzmh.zzj((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 43:
                        iZzi2 = zzmh.zzf((List<Integer>) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 44:
                        iZzi2 = zzmh.zzd((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 45:
                        iZzi2 = zzmh.zzh((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 46:
                        iZzi2 = zzmh.zzi((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 47:
                        iZzi2 = zzmh.zzg((List<Integer>) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 48:
                        iZzi2 = zzmh.zzc((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i13, iZzi2);
                            }
                            iZzab2 = zzjr.zzab(i12);
                            iZzad2 = zzjr.zzad(iZzi2);
                            iZzb = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb;
                        }
                        break;
                    case 49:
                        iZzb = zzmh.zzd(i12, zzd(t, j), zzap(i8));
                        i9 += iZzb;
                        break;
                    case 50:
                        iZzb = this.zzut.zzb(i12, zznd.zzo(t, j), zzaq(i8));
                        i9 += iZzb;
                        break;
                    case 51:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzb(i12, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                            i9 += iZzb;
                        }
                        break;
                    case 52:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzb(i12, 0.0f);
                            i9 += iZzb;
                        }
                        break;
                    case 53:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzd(i12, zzh(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 54:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zze(i12, zzh(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 55:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzg(i12, zzg(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 56:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzg(i12, 0L);
                            i9 += iZzb;
                        }
                        break;
                    case 57:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzj(i12, 0);
                            i9 += iZzb;
                        }
                        break;
                    case 58:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzc(i12, true);
                            i9 += iZzb;
                        }
                        break;
                    case 59:
                        if (zza(t, i12, i8)) {
                            Object objZzo2 = zznd.zzo(t, j);
                            if (objZzo2 instanceof zzjc) {
                                iZzb = zzjr.zzc(i12, (zzjc) objZzo2);
                            } else {
                                iZzb = zzjr.zzb(i12, (String) objZzo2);
                            }
                            i9 += iZzb;
                        }
                        break;
                    case 60:
                        if (zza(t, i12, i8)) {
                            iZzb = zzmh.zzc(i12, zznd.zzo(t, j), zzap(i8));
                            i9 += iZzb;
                        }
                        break;
                    case 61:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzc(i12, (zzjc) zznd.zzo(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 62:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzh(i12, zzg(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 63:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzl(i12, zzg(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 64:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzk(i12, 0);
                            i9 += iZzb;
                        }
                        break;
                    case 65:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzh(i12, 0L);
                            i9 += iZzb;
                        }
                        break;
                    case 66:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzi(i12, zzg(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 67:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzf(i12, zzh(t, j));
                            i9 += iZzb;
                        }
                        break;
                    case 68:
                        if (zza(t, i12, i8)) {
                            iZzb = zzjr.zzc(i12, (zzlq) zznd.zzo(t, j), zzap(i8));
                            i9 += iZzb;
                        }
                        break;
                }
                i8 += 3;
                i5 = i11;
            }
            return i9 + zza(this.zzur, t);
        }
        Unsafe unsafe2 = zzuc;
        int i14 = -1;
        int i15 = 0;
        int iZzb2 = 0;
        int i16 = 0;
        while (i15 < this.zzud.length) {
            int iZzas2 = zzas(i15);
            int[] iArr = this.zzud;
            int i17 = iArr[i15];
            int i18 = i6;
            int i19 = (iZzas2 & 267386880) >>> 20;
            if (i19 <= 17) {
                i = iArr[i15 + 2];
                int i20 = i & i18;
                i2 = 1 << (i >>> 20);
                if (i20 != i14) {
                    i16 = unsafe2.getInt(t, i20);
                    i14 = i20;
                }
            } else {
                i = (!this.zzul || i19 < zzke.DOUBLE_LIST_PACKED.m22294id() || i19 > zzke.SINT64_LIST_PACKED.m22294id()) ? 0 : this.zzud[i15 + 2] & i18;
                i2 = 0;
            }
            long j2 = iZzas2 & i18;
            switch (i19) {
                case 0:
                    i3 = 0;
                    z = false;
                    if ((i16 & i2) != 0) {
                        iZzb2 += zzjr.zzb(i17, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    }
                    break;
                case 1:
                    i3 = 0;
                    if ((i16 & i2) != 0) {
                        z = false;
                        iZzb2 += zzjr.zzb(i17, 0.0f);
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    i3 = 0;
                    if ((i16 & i2) != 0) {
                        iZzd = zzjr.zzd(i17, unsafe2.getLong(t, j2));
                        iZzb2 += iZzd;
                    }
                    z = false;
                    break;
                case 3:
                    i3 = 0;
                    if ((i16 & i2) != 0) {
                        iZzd = zzjr.zze(i17, unsafe2.getLong(t, j2));
                        iZzb2 += iZzd;
                    }
                    z = false;
                    break;
                case 4:
                    i3 = 0;
                    if ((i16 & i2) != 0) {
                        iZzd = zzjr.zzg(i17, unsafe2.getInt(t, j2));
                        iZzb2 += iZzd;
                    }
                    z = false;
                    break;
                case 5:
                    i3 = 0;
                    if ((i16 & i2) != 0) {
                        iZzd = zzjr.zzg(i17, 0L);
                        iZzb2 += iZzd;
                    }
                    z = false;
                    break;
                case 6:
                    if ((i16 & i2) != 0) {
                        i3 = 0;
                        iZzd = zzjr.zzj(i17, 0);
                        iZzb2 += iZzd;
                    } else {
                        i3 = 0;
                    }
                    z = false;
                    break;
                case 7:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzc(i17, true);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 8:
                    if ((i16 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j2);
                        if (object instanceof zzjc) {
                            iZzc = zzjr.zzc(i17, (zzjc) object);
                        } else {
                            iZzc = zzjr.zzb(i17, (String) object);
                        }
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 9:
                    if ((i16 & i2) != 0) {
                        iZzc = zzmh.zzc(i17, unsafe2.getObject(t, j2), zzap(i15));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 10:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzc(i17, (zzjc) unsafe2.getObject(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 11:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzh(i17, unsafe2.getInt(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 12:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzl(i17, unsafe2.getInt(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 13:
                    if ((i16 & i2) != 0) {
                        iZzk = zzjr.zzk(i17, 0);
                        iZzb2 += iZzk;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 14:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzh(i17, 0L);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 15:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzi(i17, unsafe2.getInt(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 16:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzf(i17, unsafe2.getLong(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 17:
                    if ((i16 & i2) != 0) {
                        iZzc = zzjr.zzc(i17, (zzlq) unsafe2.getObject(t, j2), zzap(i15));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 18:
                    iZzc = zzmh.zzw(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 19:
                    i4 = 0;
                    iZzv = zzmh.zzv(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 20:
                    i4 = 0;
                    iZzv = zzmh.zzo(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 21:
                    i4 = 0;
                    iZzv = zzmh.zzp(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 22:
                    i4 = 0;
                    iZzv = zzmh.zzs(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 23:
                    i4 = 0;
                    iZzv = zzmh.zzw(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 24:
                    i4 = 0;
                    iZzv = zzmh.zzv(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 25:
                    i4 = 0;
                    iZzv = zzmh.zzx(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 26:
                    iZzc = zzmh.zzc(i17, (List) unsafe2.getObject(t, j2));
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 27:
                    iZzc = zzmh.zzc(i17, (List<?>) unsafe2.getObject(t, j2), zzap(i15));
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 28:
                    iZzc = zzmh.zzd(i17, (List<zzjc>) unsafe2.getObject(t, j2));
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 29:
                    iZzc = zzmh.zzt(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 30:
                    i4 = 0;
                    iZzv = zzmh.zzr(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 31:
                    i4 = 0;
                    iZzv = zzmh.zzv(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 32:
                    i4 = 0;
                    iZzv = zzmh.zzw(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 33:
                    i4 = 0;
                    iZzv = zzmh.zzu(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 34:
                    i4 = 0;
                    iZzv = zzmh.zzq(i17, (List) unsafe2.getObject(t, j2), false);
                    iZzb2 += iZzv;
                    i3 = i4;
                    z = false;
                    break;
                case 35:
                    iZzi = zzmh.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 36:
                    iZzi = zzmh.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 37:
                    iZzi = zzmh.zza((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 38:
                    iZzi = zzmh.zzb((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 39:
                    iZzi = zzmh.zze((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 40:
                    iZzi = zzmh.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 41:
                    iZzi = zzmh.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 42:
                    iZzi = zzmh.zzj((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 43:
                    iZzi = zzmh.zzf((List<Integer>) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 44:
                    iZzi = zzmh.zzd((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 45:
                    iZzi = zzmh.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 46:
                    iZzi = zzmh.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 47:
                    iZzi = zzmh.zzg((List<Integer>) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 48:
                    iZzi = zzmh.zzc((List) unsafe2.getObject(t, j2));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = zzjr.zzab(i17);
                        iZzad = zzjr.zzad(iZzi);
                        iZzc = iZzab + iZzad + iZzi;
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 49:
                    iZzc = zzmh.zzd(i17, (List) unsafe2.getObject(t, j2), zzap(i15));
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 50:
                    iZzc = this.zzut.zzb(i17, unsafe2.getObject(t, j2), zzaq(i15));
                    iZzb2 += iZzc;
                    i3 = 0;
                    z = false;
                    break;
                case 51:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzb(i17, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 52:
                    if (zza(t, i17, i15)) {
                        iZzk = zzjr.zzb(i17, 0.0f);
                        iZzb2 += iZzk;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 53:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzd(i17, zzh(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 54:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zze(i17, zzh(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 55:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzg(i17, zzg(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 56:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzg(i17, 0L);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 57:
                    if (zza(t, i17, i15)) {
                        iZzk = zzjr.zzj(i17, 0);
                        iZzb2 += iZzk;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 58:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzc(i17, true);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 59:
                    if (zza(t, i17, i15)) {
                        Object object2 = unsafe2.getObject(t, j2);
                        if (object2 instanceof zzjc) {
                            iZzc = zzjr.zzc(i17, (zzjc) object2);
                        } else {
                            iZzc = zzjr.zzb(i17, (String) object2);
                        }
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 60:
                    if (zza(t, i17, i15)) {
                        iZzc = zzmh.zzc(i17, unsafe2.getObject(t, j2), zzap(i15));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 61:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzc(i17, (zzjc) unsafe2.getObject(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 62:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzh(i17, zzg(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 63:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzl(i17, zzg(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 64:
                    if (zza(t, i17, i15)) {
                        iZzk = zzjr.zzk(i17, 0);
                        iZzb2 += iZzk;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 65:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzh(i17, 0L);
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 66:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzi(i17, zzg(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 67:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzf(i17, zzh(t, j2));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                case 68:
                    if (zza(t, i17, i15)) {
                        iZzc = zzjr.zzc(i17, (zzlq) unsafe2.getObject(t, j2), zzap(i15));
                        iZzb2 += iZzc;
                    }
                    i3 = 0;
                    z = false;
                    break;
                default:
                    i3 = 0;
                    z = false;
                    break;
            }
            i15 += 3;
            i7 = i3;
            i6 = i18;
        }
        int iZzb3 = i7;
        int iZza = iZzb2 + zza(this.zzur, t);
        if (!this.zzui) {
            return iZza;
        }
        zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
        for (int i21 = iZzb3; i21 < zzkbVarZzb.zzos.zzer(); i21++) {
            Map.Entry entryZzaw = zzkbVarZzb.zzos.zzaw(i21);
            iZzb3 += zzkb.zzb((zzkd<?>) entryZzaw.getKey(), entryZzaw.getValue());
        }
        for (Map.Entry entry : zzkbVarZzb.zzos.zzes()) {
            iZzb3 += zzkb.zzb((zzkd<?>) entry.getKey(), entry.getValue());
        }
        return iZza + iZzb3;
    }

    private static <UT, UB> int zza(zzmx<UT, UB> zzmxVar, T t) {
        return zzmxVar.zzn(zzmxVar.zzr(t));
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zznd.zzo(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, zzns zznsVar) throws IOException {
        Iterator it;
        Map.Entry<?, ?> entry;
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry2;
        if (zznsVar.zzcd() == zzkk.zze.zzsj) {
            zza(this.zzur, t, zznsVar);
            if (this.zzui) {
                zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
                if (zzkbVarZzb.zzos.isEmpty()) {
                    itDescendingIterator = null;
                    entry2 = null;
                } else {
                    itDescendingIterator = zzkbVarZzb.descendingIterator();
                    entry2 = (Map.Entry) itDescendingIterator.next();
                }
            } else {
                itDescendingIterator = null;
                entry2 = null;
            }
            for (int length = this.zzud.length - 3; length >= 0; length -= 3) {
                int iZzas = zzas(length);
                int i = this.zzud[length];
                while (entry2 != null && this.zzus.zza(entry2) > i) {
                    this.zzus.zza(zznsVar, entry2);
                    entry2 = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
                }
                switch ((iZzas & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, length)) {
                            zznsVar.zza(i, zznd.zzn(t, iZzas & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, length)) {
                            zznsVar.zza(i, zznd.zzm(t, iZzas & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, length)) {
                            zznsVar.zzi(i, zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, length)) {
                            zznsVar.zza(i, zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, length)) {
                            zznsVar.zzc(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, length)) {
                            zznsVar.zzc(i, zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, length)) {
                            zznsVar.zzf(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, zznd.zzl(t, iZzas & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, length)) {
                            zza(i, zznd.zzo(t, iZzas & 1048575), zznsVar);
                        }
                        break;
                    case 9:
                        if (zza(t, length)) {
                            zznsVar.zza(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 10:
                        if (zza(t, length)) {
                            zznsVar.zza(i, (zzjc) zznd.zzo(t, iZzas & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, length)) {
                            zznsVar.zzd(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, length)) {
                            zznsVar.zzn(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, length)) {
                            zznsVar.zzm(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, length)) {
                            zznsVar.zzj(i, zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, length)) {
                            zznsVar.zze(i, zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 18:
                        zzmh.zza(this.zzud[length], (List<Double>) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 19:
                        zzmh.zzb(this.zzud[length], (List<Float>) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 20:
                        zzmh.zzc(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 21:
                        zzmh.zzd(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 22:
                        zzmh.zzh(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 23:
                        zzmh.zzf(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 24:
                        zzmh.zzk(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 25:
                        zzmh.zzn(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 26:
                        zzmh.zza(this.zzud[length], (List<String>) zznd.zzo(t, iZzas & 1048575), zznsVar);
                        break;
                    case 27:
                        zzmh.zza(this.zzud[length], (List<?>) zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                        break;
                    case 28:
                        zzmh.zzb(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar);
                        break;
                    case 29:
                        zzmh.zzi(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 30:
                        zzmh.zzm(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 31:
                        zzmh.zzl(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 32:
                        zzmh.zzg(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 33:
                        zzmh.zzj(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 34:
                        zzmh.zze(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 35:
                        zzmh.zza(this.zzud[length], (List<Double>) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 36:
                        zzmh.zzb(this.zzud[length], (List<Float>) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 37:
                        zzmh.zzc(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 38:
                        zzmh.zzd(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 39:
                        zzmh.zzh(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 40:
                        zzmh.zzf(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 41:
                        zzmh.zzk(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 42:
                        zzmh.zzn(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 43:
                        zzmh.zzi(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 44:
                        zzmh.zzm(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 45:
                        zzmh.zzl(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 46:
                        zzmh.zzg(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 47:
                        zzmh.zzj(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 48:
                        zzmh.zze(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 49:
                        zzmh.zzb(this.zzud[length], (List<?>) zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                        break;
                    case 50:
                        zza(zznsVar, i, zznd.zzo(t, iZzas & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zze(t, iZzas & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zzf(t, iZzas & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            zznsVar.zzi(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            zznsVar.zzc(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            zznsVar.zzc(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            zznsVar.zzf(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, zzi(t, iZzas & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, zznd.zzo(t, iZzas & 1048575), zznsVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, (zzjc) zznd.zzo(t, iZzas & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            zznsVar.zzd(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            zznsVar.zzn(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            zznsVar.zzm(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            zznsVar.zzj(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            zznsVar.zze(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzus.zza(zznsVar, entry2);
                entry2 = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            return;
        }
        if (this.zzuk) {
            if (this.zzui) {
                zzkb<T> zzkbVarZzb2 = this.zzus.zzb(t);
                if (zzkbVarZzb2.zzos.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = zzkbVarZzb2.iterator();
                    entry = (Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length2 = this.zzud.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int iZzas2 = zzas(i2);
                int i3 = this.zzud[i2];
                while (entry != null && this.zzus.zza(entry) <= i3) {
                    this.zzus.zza(zznsVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                switch ((iZzas2 & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, zznd.zzn(t, iZzas2 & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, zznd.zzm(t, iZzas2 & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, i2)) {
                            zznsVar.zzi(i3, zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, i2)) {
                            zznsVar.zzc(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, i2)) {
                            zznsVar.zzc(i3, zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, i2)) {
                            zznsVar.zzf(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, zznd.zzl(t, iZzas2 & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, i2)) {
                            zza(i3, zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        }
                        break;
                    case 9:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 10:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, (zzjc) zznd.zzo(t, iZzas2 & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, i2)) {
                            zznsVar.zzd(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, i2)) {
                            zznsVar.zzn(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, i2)) {
                            zznsVar.zzm(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, i2)) {
                            zznsVar.zzj(i3, zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, i2)) {
                            zznsVar.zze(i3, zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 18:
                        zzmh.zza(this.zzud[i2], (List<Double>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 19:
                        zzmh.zzb(this.zzud[i2], (List<Float>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 20:
                        zzmh.zzc(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 21:
                        zzmh.zzd(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 22:
                        zzmh.zzh(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 23:
                        zzmh.zzf(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 24:
                        zzmh.zzk(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 25:
                        zzmh.zzn(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 26:
                        zzmh.zza(this.zzud[i2], (List<String>) zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        break;
                    case 27:
                        zzmh.zza(this.zzud[i2], (List<?>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                        break;
                    case 28:
                        zzmh.zzb(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        break;
                    case 29:
                        zzmh.zzi(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 30:
                        zzmh.zzm(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 31:
                        zzmh.zzl(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 32:
                        zzmh.zzg(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 33:
                        zzmh.zzj(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 34:
                        zzmh.zze(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 35:
                        zzmh.zza(this.zzud[i2], (List<Double>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 36:
                        zzmh.zzb(this.zzud[i2], (List<Float>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 37:
                        zzmh.zzc(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 38:
                        zzmh.zzd(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 39:
                        zzmh.zzh(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 40:
                        zzmh.zzf(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 41:
                        zzmh.zzk(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 42:
                        zzmh.zzn(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 43:
                        zzmh.zzi(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 44:
                        zzmh.zzm(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 45:
                        zzmh.zzl(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 46:
                        zzmh.zzg(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 47:
                        zzmh.zzj(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 48:
                        zzmh.zze(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 49:
                        zzmh.zzb(this.zzud[i2], (List<?>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                        break;
                    case 50:
                        zza(zznsVar, i3, zznd.zzo(t, iZzas2 & 1048575), i2);
                        break;
                    case 51:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zze(t, iZzas2 & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zzf(t, iZzas2 & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzi(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzc(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzc(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzf(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, zzi(t, iZzas2 & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i3, i2)) {
                            zza(i3, zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 61:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, (zzjc) zznd.zzo(t, iZzas2 & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzd(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzn(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzm(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzj(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i3, i2)) {
                            zznsVar.zze(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                }
            }
            while (entry != null) {
                this.zzus.zza(zznsVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            zza(this.zzur, t, zznsVar);
            return;
        }
        zzb(t, zznsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzb(T t, zzns zznsVar) throws IOException {
        Iterator it;
        Map.Entry<?, ?> entry;
        boolean z;
        int i;
        boolean z2;
        if (this.zzui) {
            zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
            if (zzkbVarZzb.zzos.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzkbVarZzb.iterator();
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.zzud.length;
        Unsafe unsafe = zzuc;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzas = zzas(i4);
            int[] iArr = this.zzud;
            int i5 = iArr[i4];
            int i6 = (267386880 & iZzas) >>> 20;
            if (this.zzuk || i6 > 17) {
                z = true;
                i = 0;
            } else {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                z = true;
                if (i8 != i2) {
                    i3 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            }
            while (entry != null && this.zzus.zza(entry) <= i5) {
                this.zzus.zza(zznsVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzas & 1048575;
            switch (i6) {
                case 0:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, zznd.zzn(t, j));
                    }
                    break;
                case 1:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, zznd.zzm(t, j));
                    }
                    break;
                case 2:
                    if ((i & i3) != 0) {
                        zznsVar.zzi(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 3:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 4:
                    if ((i & i3) != 0) {
                        zznsVar.zzc(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 5:
                    if ((i & i3) != 0) {
                        zznsVar.zzc(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 6:
                    if ((i & i3) != 0) {
                        zznsVar.zzf(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 7:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, zznd.zzl(t, j));
                    }
                    break;
                case 8:
                    if ((i & i3) != 0) {
                        zza(i5, unsafe.getObject(t, j), zznsVar);
                    }
                    break;
                case 9:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 10:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                    }
                    break;
                case 11:
                    if ((i & i3) != 0) {
                        zznsVar.zzd(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 12:
                    if ((i & i3) != 0) {
                        zznsVar.zzn(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 13:
                    if ((i & i3) != 0) {
                        zznsVar.zzm(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 14:
                    if ((i & i3) != 0) {
                        zznsVar.zzj(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 15:
                    if ((i & i3) != 0) {
                        zznsVar.zze(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 17:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 18:
                    zzmh.zza(this.zzud[i4], (List<Double>) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 19:
                    zzmh.zzb(this.zzud[i4], (List<Float>) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 20:
                    zzmh.zzc(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 21:
                    zzmh.zzd(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 22:
                    zzmh.zzh(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 23:
                    zzmh.zzf(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 24:
                    zzmh.zzk(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 25:
                    zzmh.zzn(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 26:
                    zzmh.zza(this.zzud[i4], (List<String>) unsafe.getObject(t, j), zznsVar);
                    break;
                case 27:
                    zzmh.zza(this.zzud[i4], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                    break;
                case 28:
                    zzmh.zzb(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar);
                    break;
                case 29:
                    z2 = false;
                    zzmh.zzi(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 30:
                    z2 = false;
                    zzmh.zzm(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 31:
                    z2 = false;
                    zzmh.zzl(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 32:
                    z2 = false;
                    zzmh.zzg(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 33:
                    z2 = false;
                    zzmh.zzj(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 34:
                    z2 = false;
                    zzmh.zze(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 35:
                    zzmh.zza(this.zzud[i4], (List<Double>) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 36:
                    zzmh.zzb(this.zzud[i4], (List<Float>) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 37:
                    zzmh.zzc(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 38:
                    zzmh.zzd(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 39:
                    zzmh.zzh(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 40:
                    zzmh.zzf(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 41:
                    zzmh.zzk(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 42:
                    zzmh.zzn(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 43:
                    zzmh.zzi(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 44:
                    zzmh.zzm(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 45:
                    zzmh.zzl(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 46:
                    zzmh.zzg(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 47:
                    zzmh.zzj(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 48:
                    zzmh.zze(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                    break;
                case 49:
                    zzmh.zzb(this.zzud[i4], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                    break;
                case 50:
                    zza(zznsVar, i5, unsafe.getObject(t, j), i4);
                    break;
                case 51:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zze(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzi(i5, zzh(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zzh(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzc(i5, zzg(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzc(i5, zzh(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzf(i5, zzg(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, zzi(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i4)) {
                        zza(i5, unsafe.getObject(t, j), zznsVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzd(i5, zzg(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzn(i5, zzg(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzm(i5, zzg(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzj(i5, zzh(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i4)) {
                        zznsVar.zze(i5, zzg(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, zzh(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                default:
                    break;
            }
        }
        while (entry != null) {
            this.zzus.zza(zznsVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        zza(this.zzur, t, zznsVar);
    }

    private final <K, V> void zza(zzns zznsVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static <UT, UB> void zza(zzmx<UT, UB> zzmxVar, T t, zzns zznsVar) throws IOException {
        zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
    }

    private static zzmy zzo(Object obj) {
        zzkk zzkkVar = (zzkk) obj;
        zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != zzmy.zzfa()) {
            return zzmyVar;
        }
        zzmy zzmyVarZzfb = zzmy.zzfb();
        zzkkVar.zzrq = zzmyVarZzfb;
        return zzmyVarZzfb;
    }

    private static int zza(byte[] bArr, int i, int i2, zznm zznmVar, Class<?> cls, zziz zzizVar) throws IOException {
        switch (zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int iZzb = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Boolean.valueOf(zzizVar.zznl != 0);
                return iZzb;
            case 2:
                return zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = Double.valueOf(zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = Integer.valueOf(zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = Long.valueOf(zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = Float.valueOf(zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzizVar.zznk);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzizVar.zznl);
                return iZzb2;
            case 14:
                return zziy.zza(zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int iZza2 = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzjo.zzw(zzizVar.zznk));
                return iZza2;
            case 16:
                int iZzb3 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzjo.zzk(zzizVar.zznl));
                return iZzb3;
            case 17:
                return zziy.zzd(bArr, i, zzizVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziz zzizVar) throws IOException {
        int i8;
        int i9;
        int iZza;
        Unsafe unsafe = zzuc;
        zzkp zzkpVarZzr = (zzkp) unsafe.getObject(t, j2);
        if (!zzkpVarZzr.zzbo()) {
            int size = zzkpVarZzr.size();
            zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzkpVarZzr);
        }
        zzkp zzkpVar = zzkpVarZzr;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzju zzjuVar = (zzju) zzkpVar;
                    int iZza2 = zziy.zza(bArr, i, zzizVar);
                    int i10 = zzizVar.zznk + iZza2;
                    while (iZza2 < i10) {
                        zzjuVar.zzc(zziy.zzc(bArr, iZza2));
                        iZza2 += 8;
                    }
                    if (iZza2 == i10) {
                        return iZza2;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 1) {
                    return i;
                }
                zzju zzjuVar2 = (zzju) zzkpVar;
                zzjuVar2.zzc(zziy.zzc(bArr, i));
                int i11 = i + 8;
                while (i11 < i2) {
                    int iZza3 = zziy.zza(bArr, i11, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return i11;
                    }
                    zzjuVar2.zzc(zziy.zzc(bArr, iZza3));
                    i11 = iZza3 + 8;
                }
                return i11;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzkh zzkhVar = (zzkh) zzkpVar;
                    int iZza4 = zziy.zza(bArr, i, zzizVar);
                    int i12 = zzizVar.zznk + iZza4;
                    while (iZza4 < i12) {
                        zzkhVar.zzc(zziy.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i12) {
                        return iZza4;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 5) {
                    return i;
                }
                zzkh zzkhVar2 = (zzkh) zzkpVar;
                zzkhVar2.zzc(zziy.zzd(bArr, i));
                int i13 = i + 4;
                while (i13 < i2) {
                    int iZza5 = zziy.zza(bArr, i13, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return i13;
                    }
                    zzkhVar2.zzc(zziy.zzd(bArr, iZza5));
                    i13 = iZza5 + 4;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzle zzleVar = (zzle) zzkpVar;
                    int iZza6 = zziy.zza(bArr, i, zzizVar);
                    int i14 = zzizVar.zznk + iZza6;
                    while (iZza6 < i14) {
                        iZza6 = zziy.zzb(bArr, iZza6, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (iZza6 == i14) {
                        return iZza6;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 0) {
                    return i;
                }
                zzle zzleVar2 = (zzle) zzkpVar;
                int iZzb = zziy.zzb(bArr, i, zzizVar);
                zzleVar2.zzv(zzizVar.zznl);
                while (iZzb < i2) {
                    int iZza7 = zziy.zza(bArr, iZzb, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return iZzb;
                    }
                    iZzb = zziy.zzb(bArr, iZza7, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                }
                return iZzb;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zziy.zza(bArr, i, (zzkp<?>) zzkpVar, zzizVar);
                }
                return i5 == 0 ? zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVar, zzizVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzle zzleVar3 = (zzle) zzkpVar;
                    int iZza8 = zziy.zza(bArr, i, zzizVar);
                    int i15 = zzizVar.zznk + iZza8;
                    while (iZza8 < i15) {
                        zzleVar3.zzv(zziy.zzb(bArr, iZza8));
                        iZza8 += 8;
                    }
                    if (iZza8 == i15) {
                        return iZza8;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 1) {
                    return i;
                }
                zzle zzleVar4 = (zzle) zzkpVar;
                zzleVar4.zzv(zziy.zzb(bArr, i));
                int i16 = i + 8;
                while (i16 < i2) {
                    int iZza9 = zziy.zza(bArr, i16, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return i16;
                    }
                    zzleVar4.zzv(zziy.zzb(bArr, iZza9));
                    i16 = iZza9 + 8;
                }
                return i16;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkl zzklVar = (zzkl) zzkpVar;
                    int iZza10 = zziy.zza(bArr, i, zzizVar);
                    int i17 = zzizVar.zznk + iZza10;
                    while (iZza10 < i17) {
                        zzklVar.zzam(zziy.zza(bArr, iZza10));
                        iZza10 += 4;
                    }
                    if (iZza10 == i17) {
                        return iZza10;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 5) {
                    return i;
                }
                zzkl zzklVar2 = (zzkl) zzkpVar;
                zzklVar2.zzam(zziy.zza(bArr, i));
                int i18 = i + 4;
                while (i18 < i2) {
                    int iZza11 = zziy.zza(bArr, i18, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return i18;
                    }
                    zzklVar2.zzam(zziy.zza(bArr, iZza11));
                    i18 = iZza11 + 4;
                }
                return i18;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzja zzjaVar = (zzja) zzkpVar;
                    int iZza12 = zziy.zza(bArr, i, zzizVar);
                    int i19 = zzizVar.zznk + iZza12;
                    while (iZza12 < i19) {
                        iZza12 = zziy.zzb(bArr, iZza12, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (iZza12 == i19) {
                        return iZza12;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 != 0) {
                    return i;
                }
                zzja zzjaVar2 = (zzja) zzkpVar;
                int iZzb2 = zziy.zzb(bArr, i, zzizVar);
                zzjaVar2.addBoolean(zzizVar.zznl != 0);
                while (iZzb2 < i2) {
                    int iZza13 = zziy.zza(bArr, iZzb2, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return iZzb2;
                    }
                    iZzb2 = zziy.zzb(bArr, iZza13, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                }
                return iZzb2;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    int iZza14 = zziy.zza(bArr, i, zzizVar);
                    int i20 = zzizVar.zznk;
                    if (i20 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i20 == 0) {
                        zzkpVar.add("");
                    } else {
                        zzkpVar.add(new String(bArr, iZza14, i20, zzkm.UTF_8));
                        iZza14 += i20;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = zziy.zza(bArr, iZza14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza14;
                        }
                        iZza14 = zziy.zza(bArr, iZza15, zzizVar);
                        int i21 = zzizVar.zznk;
                        if (i21 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i21 == 0) {
                            zzkpVar.add("");
                        } else {
                            zzkpVar.add(new String(bArr, iZza14, i21, zzkm.UTF_8));
                            iZza14 += i21;
                        }
                    }
                    return iZza14;
                }
                int iZza16 = zziy.zza(bArr, i, zzizVar);
                int i22 = zzizVar.zznk;
                if (i22 < 0) {
                    throw zzkq.zzdj();
                }
                if (i22 == 0) {
                    zzkpVar.add("");
                } else {
                    int i23 = iZza16 + i22;
                    if (!zznf.zze(bArr, iZza16, i23)) {
                        throw zzkq.zzdn();
                    }
                    zzkpVar.add(new String(bArr, iZza16, i22, zzkm.UTF_8));
                    iZza16 = i23;
                }
                while (iZza16 < i2) {
                    int iZza17 = zziy.zza(bArr, iZza16, zzizVar);
                    if (i3 != zzizVar.zznk) {
                        return iZza16;
                    }
                    iZza16 = zziy.zza(bArr, iZza17, zzizVar);
                    int i24 = zzizVar.zznk;
                    if (i24 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i24 == 0) {
                        zzkpVar.add("");
                    } else {
                        int i25 = iZza16 + i24;
                        if (!zznf.zze(bArr, iZza16, i25)) {
                            throw zzkq.zzdn();
                        }
                        zzkpVar.add(new String(bArr, iZza16, i24, zzkm.UTF_8));
                        iZza16 = i25;
                    }
                }
                return iZza16;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return zziy.zza(zzap(i6), i3, bArr, i8, i2, zzkpVar, zzizVar);
                }
                return i8;
            case 28:
                i8 = i;
                if (i5 == 2) {
                    int iZza18 = zziy.zza(bArr, i8, zzizVar);
                    int i26 = zzizVar.zznk;
                    if (i26 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i26 > bArr.length - iZza18) {
                        throw zzkq.zzdi();
                    }
                    if (i26 == 0) {
                        zzkpVar.add(zzjc.zznq);
                    } else {
                        zzkpVar.add(zzjc.zzb(bArr, iZza18, i26));
                        iZza18 += i26;
                    }
                    while (iZza18 < i2) {
                        int iZza19 = zziy.zza(bArr, iZza18, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza18;
                        }
                        iZza18 = zziy.zza(bArr, iZza19, zzizVar);
                        int i27 = zzizVar.zznk;
                        if (i27 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i27 > bArr.length - iZza18) {
                            throw zzkq.zzdi();
                        }
                        if (i27 == 0) {
                            zzkpVar.add(zzjc.zznq);
                        } else {
                            zzkpVar.add(zzjc.zzb(bArr, iZza18, i27));
                            iZza18 += i27;
                        }
                    }
                    return iZza18;
                }
                return i8;
            case 30:
            case 44:
                i9 = i;
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = zziy.zza(i3, bArr, i9, i2, (zzkp<?>) zzkpVar, zzizVar);
                    }
                    return i9;
                }
                iZza = zziy.zza(bArr, i9, (zzkp<?>) zzkpVar, zzizVar);
                zzkk zzkkVar = (zzkk) t;
                zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == zzmy.zzfa()) {
                    zzmyVar = null;
                }
                zzmy zzmyVar2 = (zzmy) zzmh.zza(i4, zzkpVar, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return iZza;
            case 33:
            case 47:
                i9 = i;
                if (i5 == 2) {
                    zzkl zzklVar3 = (zzkl) zzkpVar;
                    int iZza20 = zziy.zza(bArr, i9, zzizVar);
                    int i28 = zzizVar.zznk + iZza20;
                    while (iZza20 < i28) {
                        iZza20 = zziy.zza(bArr, iZza20, zzizVar);
                        zzklVar3.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    if (iZza20 == i28) {
                        return iZza20;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzkl zzklVar4 = (zzkl) zzkpVar;
                    int iZza21 = zziy.zza(bArr, i9, zzizVar);
                    zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    while (iZza21 < i2) {
                        int iZza22 = zziy.zza(bArr, iZza21, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza21;
                        }
                        iZza21 = zziy.zza(bArr, iZza22, zzizVar);
                        zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    return iZza21;
                }
                return i9;
            case 34:
            case 48:
                i9 = i;
                if (i5 == 2) {
                    zzle zzleVar5 = (zzle) zzkpVar;
                    int iZza23 = zziy.zza(bArr, i9, zzizVar);
                    int i29 = zzizVar.zznk + iZza23;
                    while (iZza23 < i29) {
                        iZza23 = zziy.zzb(bArr, iZza23, zzizVar);
                        zzleVar5.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    if (iZza23 == i29) {
                        return iZza23;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar6 = (zzle) zzkpVar;
                    int iZzb3 = zziy.zzb(bArr, i9, zzizVar);
                    zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    while (iZzb3 < i2) {
                        int iZza24 = zziy.zza(bArr, iZzb3, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZzb3;
                        }
                        iZzb3 = zziy.zzb(bArr, iZza24, zzizVar);
                        zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    return iZzb3;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    zzmf zzmfVarZzap = zzap(i6);
                    int i30 = (i3 & (-8)) | 4;
                    int iZza25 = zziy.zza(zzmfVarZzap, bArr, i, i2, i30, zzizVar);
                    zzmf zzmfVar = zzmfVarZzap;
                    int i31 = i2;
                    zziz zzizVar2 = zzizVar;
                    zzkpVar.add(zzizVar2.zznm);
                    while (iZza25 < i31) {
                        int iZza26 = zziy.zza(bArr, iZza25, zzizVar2);
                        if (i3 != zzizVar2.zznk) {
                            return iZza25;
                        }
                        zzmf zzmfVar2 = zzmfVar;
                        int i32 = i31;
                        zziz zzizVar3 = zzizVar2;
                        iZza25 = zziy.zza(zzmfVar2, bArr, iZza26, i32, i30, zzizVar3);
                        zzkpVar.add(zzizVar3.zznm);
                        zzmfVar = zzmfVar2;
                        i31 = i32;
                        zzizVar2 = zzizVar3;
                    }
                    return iZza25;
                }
            default:
                return i;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zziz zzizVar) throws IOException {
        byte[] bArr2;
        zziz zzizVar2;
        int i4;
        Unsafe unsafe = zzuc;
        Object objZzaq = zzaq(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzut.zzj(object)) {
            Object objZzl = this.zzut.zzl(objZzaq);
            this.zzut.zzb(objZzl, object);
            unsafe.putObject(t, j, objZzl);
            object = objZzl;
        }
        zzlj<?, ?> zzljVarZzm = this.zzut.zzm(objZzaq);
        Map<?, ?> mapZzh = this.zzut.zzh(object);
        int iZza = zziy.zza(bArr, i, zzizVar);
        int i5 = zzizVar.zznk;
        if (i5 < 0 || i5 > i2 - iZza) {
            throw zzkq.zzdi();
        }
        int i6 = i5 + iZza;
        K k = zzljVarZzm.zztv;
        V v = zzljVarZzm.zztx;
        while (iZza < i6) {
            int iZza2 = iZza + 1;
            int i7 = bArr[iZza];
            if (i7 < 0) {
                iZza2 = zziy.zza(i7, bArr, iZza2, zzizVar);
                i7 = zzizVar.zznk;
            }
            int i8 = iZza2;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                bArr2 = bArr;
                int i11 = i2;
                zzizVar2 = zzizVar;
                if (i10 == zzljVarZzm.zztu.zzfk()) {
                    i4 = i11;
                    iZza = zza(bArr2, i8, i4, zzljVarZzm.zztu, (Class<?>) null, zzizVar2);
                    k = zzizVar2.zznm;
                } else {
                    i4 = i11;
                }
                bArr = bArr2;
                i2 = i4;
                zzizVar = zzizVar2;
            } else if (i9 == 2 && i10 == zzljVarZzm.zztw.zzfk()) {
                byte[] bArr3 = bArr;
                int i12 = i2;
                zziz zzizVar3 = zzizVar;
                iZza = zza(bArr3, i8, i12, zzljVarZzm.zztw, zzljVarZzm.zztx.getClass(), zzizVar3);
                v = (V) zzizVar3.zznm;
                i2 = i12;
                bArr = bArr3;
            } else {
                bArr2 = bArr;
                i4 = i2;
                zzizVar2 = zzizVar;
            }
            iZza = zziy.zza(i7, bArr2, i8, i4, zzizVar2);
            k = k;
            bArr = bArr2;
            i2 = i4;
            zzizVar = zzizVar2;
        }
        if (iZza != i6) {
            throw zzkq.zzdm();
        }
        mapZzh.put(k, v);
        return i6;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziz zzizVar) throws IOException {
        int i9;
        int i10;
        int iZzb;
        Object object;
        Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Double.valueOf(zziy.zzc(bArr, i)));
                iZzb = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Float.valueOf(zziy.zzd(bArr, i)));
                iZzb = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, Long.valueOf(zzizVar.zznl));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zziy.zza(bArr, i, zzizVar);
                unsafe.putObject(t, j, Integer.valueOf(zzizVar.zznk));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Long.valueOf(zziy.zzb(bArr, i)));
                iZzb = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Integer.valueOf(zziy.zza(bArr, i)));
                iZzb = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, Boolean.valueOf(zzizVar.zznl != 0));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zziy.zza(bArr, i, zzizVar);
                int i11 = zzizVar.zznk;
                if (i11 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zznf.zze(bArr, iZza, iZza + i11)) {
                        throw zzkq.zzdn();
                    }
                    unsafe.putObject(t, j, new String(bArr, iZza, i11, zzkm.UTF_8));
                    iZza += i11;
                }
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzizVar.zznm);
                } else {
                    unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = zziy.zze(bArr, i, zzizVar);
                unsafe.putObject(t, j, zzizVar.zznm);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = zziy.zza(bArr, i, zzizVar);
                int i12 = zzizVar.zznk;
                zzko zzkoVarZzar = zzar(i8);
                if (zzkoVarZzar == null || zzkoVarZzar.zzan(i12)) {
                    unsafe.putObject(t, j, Integer.valueOf(i12));
                    iZzb = iZza3;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                zzo(t).zzb(i3, Long.valueOf(i12));
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zziy.zza(bArr, i, zzizVar);
                unsafe.putObject(t, j, Integer.valueOf(zzjo.zzw(zzizVar.zznk)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, Long.valueOf(zzjo.zzk(zzizVar.zznl)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 == 3) {
                    iZzb = zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
            default:
                return i;
        }
    }

    private final zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        zzmf zzmfVar = (zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf<T> zzmfVarZzf = zzmd.zzej().zzf((Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzmfVarZzf;
        return zzmfVarZzf;
    }

    private final Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final zzko zzar(int i) {
        return (zzko) this.zzue[((i / 3) << 1) + 1];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zza(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.drive.zziz r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.drive.zziz):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x005b. Please report as an issue. */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
        int iZzau;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int iZzb;
        T t2;
        this = this;
        bArr = bArr;
        i2 = i2;
        zzizVar = zzizVar;
        if (this.zzuk) {
            Unsafe unsafe3 = zzuc;
            int i10 = -1;
            int iZza = i;
            int i11 = -1;
            int i12 = 0;
            while (iZza < i2) {
                int iZza2 = iZza + 1;
                int i13 = bArr[iZza];
                if (i13 < 0) {
                    iZza2 = zziy.zza(i13, bArr, iZza2, zzizVar);
                    i13 = zzizVar.zznk;
                }
                int i14 = iZza2;
                int i15 = i13;
                int i16 = (i15 == true ? 1 : 0) >>> 3;
                int i17 = (i15 == true ? 1 : 0) & 7;
                if (i16 > i11) {
                    iZzau = this.zzp(i16, i12 / 3);
                } else {
                    iZzau = this.zzau(i16);
                }
                int i18 = iZzau;
                if (i18 == i10) {
                    unsafe = unsafe3;
                    i3 = i14;
                    i4 = i16;
                    i5 = 0;
                    z = i15 == true ? 1 : 0;
                } else {
                    int i19 = this.zzud[i18 + 1];
                    int i20 = (267386880 & i19) >>> 20;
                    long j = 1048575 & i19;
                    if (i20 <= 17) {
                        switch (i20) {
                            case 0:
                                unsafe2 = unsafe3;
                                if (i17 != 1) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    zznd.zza(t, j, zziy.zzc(bArr, i14));
                                    iZza = i14 + 8;
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 1:
                                unsafe2 = unsafe3;
                                if (i17 != 5) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    zznd.zza((Object) t, j, zziy.zzd(bArr, i14));
                                    iZza = i14 + 4;
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe2 = unsafe3;
                                if (i17 != 0) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZzb = zziy.zzb(bArr, i14, zzizVar);
                                    t2 = t;
                                    unsafe3 = unsafe2;
                                    unsafe3.putLong(t2, j, zzizVar.zznl);
                                    unsafe3 = unsafe3;
                                    iZza = iZzb;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe2 = unsafe3;
                                if (i17 != 0) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZza = zziy.zza(bArr, i14, zzizVar);
                                    unsafe2.putInt(t, j, zzizVar.zznk);
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe2 = unsafe3;
                                if (i17 != 1) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    unsafe2.putLong(t, j, zziy.zzb(bArr, i14));
                                    unsafe2 = unsafe2;
                                    iZza = i14 + 8;
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                unsafe2 = unsafe3;
                                if (i17 != 5) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    unsafe2.putInt(t, j, zziy.zza(bArr, i14));
                                    iZza = i14 + 4;
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 7:
                                unsafe2 = unsafe3;
                                if (i17 != 0) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    int iZzb2 = zziy.zzb(bArr, i14, zzizVar);
                                    zznd.zza(t, j, zzizVar.zznl != 0);
                                    iZza = iZzb2;
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 8:
                                unsafe2 = unsafe3;
                                if (i17 != 2) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    if ((536870912 & i19) == 0) {
                                        iZza = zziy.zzc(bArr, i14, zzizVar);
                                    } else {
                                        iZza = zziy.zzd(bArr, i14, zzizVar);
                                    }
                                    unsafe2.putObject(t, j, zzizVar.zznm);
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 9:
                                unsafe2 = unsafe3;
                                if (i17 != 2) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZza = zziy.zza(this.zzap(i18), bArr, i14, i2, zzizVar);
                                    Object object = unsafe2.getObject(t, j);
                                    if (object == null) {
                                        unsafe2.putObject(t, j, zzizVar.zznm);
                                    } else {
                                        unsafe2.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                                    }
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 10:
                                unsafe2 = unsafe3;
                                if (i17 != 2) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZza = zziy.zze(bArr, i14, zzizVar);
                                    unsafe2.putObject(t, j, zzizVar.zznm);
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 12:
                                unsafe2 = unsafe3;
                                if (i17 != 0) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZza = zziy.zza(bArr, i14, zzizVar);
                                    unsafe2.putInt(t, j, zzizVar.zznk);
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 15:
                                unsafe2 = unsafe3;
                                if (i17 != 0) {
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZza = zziy.zza(bArr, i14, zzizVar);
                                    unsafe2.putInt(t, j, zzjo.zzw(zzizVar.zznk));
                                    unsafe3 = unsafe2;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            case 16:
                                if (i17 != 0) {
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i8 = i16;
                                    i7 = i18;
                                    z4 = i15 == true ? 1 : 0;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                } else {
                                    iZzb = zziy.zzb(bArr, i14, zzizVar);
                                    t2 = t;
                                    unsafe3.putLong(t2, j, zzjo.zzk(zzizVar.zznl));
                                    unsafe3 = unsafe3;
                                    iZza = iZzb;
                                    i11 = i16;
                                    i12 = i18;
                                    i10 = -1;
                                }
                                break;
                            default:
                                unsafe2 = unsafe3;
                                unsafe = unsafe2;
                                i9 = i14;
                                i8 = i16;
                                i7 = i18;
                                z4 = i15 == true ? 1 : 0;
                                i3 = i9;
                                i5 = i7;
                                z3 = z4;
                                break;
                        }
                    } else {
                        unsafe2 = unsafe3;
                        if (i20 != 27) {
                            unsafe = unsafe2;
                            if (i20 <= 49) {
                                int iZza3 = this.zza(t, bArr, i14, i2, i15 == true ? 1 : 0, i16, i17, i18, i19, i20, j, zzizVar);
                                z2 = i15 == true ? 1 : 0;
                                i6 = i18;
                                if (iZza3 == i14) {
                                    i3 = iZza3;
                                    i4 = i16;
                                    i5 = i6;
                                    z = z2;
                                } else {
                                    i2 = i2;
                                    i12 = i6;
                                    iZza = iZza3;
                                    i11 = i16;
                                }
                            } else {
                                i7 = i18;
                                i8 = i16;
                                boolean z5 = i15 == true ? 1 : 0;
                                if (i20 != 50) {
                                    i4 = i8;
                                    int iZza4 = zza(t, bArr, i14, i2, z5 ? 1 : 0, i4, i17, i19, i20, j, i7, zzizVar);
                                    z2 = z5 ? 1 : 0;
                                    i6 = i7;
                                    if (iZza4 == i14) {
                                        i3 = iZza4;
                                        i5 = i6;
                                        z = z2;
                                    } else {
                                        i2 = i2;
                                        i12 = i6;
                                        i11 = i4;
                                        iZza = iZza4;
                                    }
                                } else if (i17 == 2) {
                                    int iZza5 = zza(t, bArr, i14, i2, i7, j, zzizVar);
                                    if (iZza5 == i14) {
                                        i5 = i7;
                                        i3 = iZza5;
                                        z3 = z5;
                                    } else {
                                        this = this;
                                        i12 = i7;
                                        iZza = iZza5;
                                        i11 = i8;
                                    }
                                } else {
                                    i9 = i14;
                                    z4 = z5;
                                    i3 = i9;
                                    i5 = i7;
                                    z3 = z4;
                                }
                            }
                            unsafe3 = unsafe;
                            i10 = -1;
                            bArr = bArr;
                        } else if (i17 == 2) {
                            zzkp zzkpVarZzr = (zzkp) unsafe2.getObject(t, j);
                            if (!zzkpVarZzr.zzbo()) {
                                int size = zzkpVarZzr.size();
                                zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t, j, zzkpVarZzr);
                            }
                            unsafe = unsafe2;
                            iZza = zziy.zza(this.zzap(i18), i15 == true ? 1 : 0, bArr, i14, i2, zzkpVarZzr, zzizVar);
                            i11 = i16;
                            i12 = i18;
                        } else {
                            unsafe = unsafe2;
                            i9 = i14;
                            i8 = i16;
                            i7 = i18;
                            z4 = i15 == true ? 1 : 0;
                            i3 = i9;
                            i5 = i7;
                            z3 = z4;
                        }
                        unsafe3 = unsafe;
                        i10 = -1;
                    }
                    i4 = i8;
                    z = z3;
                }
                iZza = zziy.zza(z ? 1 : 0, bArr, i3, i2, zzo(t), zzizVar);
                i2 = i2;
                i11 = i4;
                i12 = i5;
                unsafe3 = unsafe;
                i10 = -1;
                bArr = bArr;
            }
            if (iZza != i2) {
                throw zzkq.zzdm();
            }
            return;
        }
        zza(t, bArr, i, i2, 0, zzizVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long jZzas = zzas(this.zzum[i2]) & 1048575;
            Object objZzo = zznd.zzo(t, jZzas);
            if (objZzo != null) {
                zznd.zza(t, jZzas, this.zzut.zzk(objZzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(t, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(t);
        if (this.zzui) {
            this.zzus.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzko zzkoVar, UB ub, zzmx<UT, UB> zzmxVar) {
        zzlj<?, ?> zzljVarZzm = this.zzut.zzm(zzaq(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzkoVar.zzan(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmxVar.zzez();
                }
                zzjk zzjkVarZzu = zzjc.zzu(zzli.zza(zzljVarZzm, next.getKey(), next.getValue()));
                try {
                    zzli.zza(zzjkVarZzu.zzby(), zzljVarZzm, next.getKey(), next.getValue());
                    zzmxVar.zza(ub, i2, zzjkVarZzu.zzbx());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[LOOP:2: B:52:0x00d6->B:57:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        int i;
        List list;
        ?? Zzap;
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzun; i5++) {
            int i6 = this.zzum[i5];
            int i7 = this.zzud[i6];
            int iZzas = zzas(i6);
            if (this.zzuk) {
                i = 0;
            } else {
                int i8 = this.zzud[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i4 = zzuc.getInt(t, i9);
                    i3 = i9;
                }
            }
            if ((268435456 & iZzas) != 0 && !zza(t, i6, i4, i)) {
                return false;
            }
            int i10 = (267386880 & iZzas) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (zza(t, i6, i4, i) && !zza(t, iZzas, zzap(i6))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) zznd.zzo(t, iZzas & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Zzap = zzap(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!Zzap.zzp(list.get(i2))) {
                            return false;
                        }
                    }
                }
            } else if (i10 == 60 || i10 == 68) {
                if (zza(t, i7, i6) && !zza(t, iZzas, zzap(i6))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) zznd.zzo(t, iZzas & 1048575);
                if (list.isEmpty()) {
                    Zzap = zzap(i6);
                    while (i2 < list.size()) {
                        if (!Zzap.zzp(list.get(i2))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i10 != 50) {
                continue;
            } else {
                Map<?, ?> mapZzi = this.zzut.zzi(zznd.zzo(t, iZzas & 1048575));
                if (mapZzi.isEmpty()) {
                    continue;
                } else if (this.zzut.zzm(zzaq(i6)).zztw.zzfj() == zznr.MESSAGE) {
                    ?? Zzf = 0;
                    for (Object obj : mapZzi.values()) {
                        if (Zzf == 0) {
                            Zzf = Zzf;
                            Zzf = zzmd.zzej().zzf(obj.getClass());
                        }
                        Zzf = Zzf;
                        if (!Zzf.zzp(obj)) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return !this.zzui || this.zzus.zzb(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzmf zzmfVar) {
        return zzmfVar.zzp(zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzns zznsVar) throws IOException {
        if (obj instanceof String) {
            zznsVar.zza(i, (String) obj);
        } else {
            zznsVar.zza(i, (zzjc) obj);
        }
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zznd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zznd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zznd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zznd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zznd.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzuk) {
            int iZzas = zzas(i);
            long j = iZzas & 1048575;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    return zznd.zzn(t, j) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return zznd.zzm(t, j) != 0.0f;
                case 2:
                    return zznd.zzk(t, j) != 0;
                case 3:
                    return zznd.zzk(t, j) != 0;
                case 4:
                    return zznd.zzj(t, j) != 0;
                case 5:
                    return zznd.zzk(t, j) != 0;
                case 6:
                    return zznd.zzj(t, j) != 0;
                case 7:
                    return zznd.zzl(t, j);
                case 8:
                    Object objZzo = zznd.zzo(t, j);
                    if (objZzo instanceof String) {
                        return !((String) objZzo).isEmpty();
                    }
                    if (objZzo instanceof zzjc) {
                        return !zzjc.zznq.equals(objZzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zznd.zzo(t, j) != null;
                case 10:
                    return !zzjc.zznq.equals(zznd.zzo(t, j));
                case 11:
                    return zznd.zzj(t, j) != 0;
                case 12:
                    return zznd.zzj(t, j) != 0;
                case 13:
                    return zznd.zzj(t, j) != 0;
                case 14:
                    return zznd.zzk(t, j) != 0;
                case 15:
                    return zznd.zzj(t, j) != 0;
                case 16:
                    return zznd.zzk(t, j) != 0;
                case 17:
                    return zznd.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int iZzat = zzat(i);
        return (zznd.zzj(t, (long) (iZzat & 1048575)) & (1 << (iZzat >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzuk) {
            return;
        }
        int iZzat = zzat(i);
        long j = iZzat & 1048575;
        zznd.zza((Object) t, j, zznd.zzj(t, j) | (1 << (iZzat >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zznd.zza((Object) t, zzat(i2) & 1048575, i);
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
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
}
