package com.fyber.inneractive.sdk.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.i2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8955i2 implements InterfaceC9019t2 {

    /* JADX INFO: renamed from: q */
    public static final int[] f21032q = new int[0];

    /* JADX INFO: renamed from: r */
    public static final Unsafe f21033r;

    /* JADX INFO: renamed from: a */
    public final int[] f21034a;

    /* JADX INFO: renamed from: b */
    public final Object[] f21035b;

    /* JADX INFO: renamed from: c */
    public final int f21036c;

    /* JADX INFO: renamed from: d */
    public final int f21037d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8925d2 f21038e;

    /* JADX INFO: renamed from: f */
    public final boolean f21039f;

    /* JADX INFO: renamed from: g */
    public final boolean f21040g;

    /* JADX INFO: renamed from: h */
    public final boolean f21041h;

    /* JADX INFO: renamed from: i */
    public final int[] f21042i;

    /* JADX INFO: renamed from: j */
    public final int f21043j;

    /* JADX INFO: renamed from: k */
    public final int f21044k;

    /* JADX INFO: renamed from: l */
    public final C8967k2 f21045l;

    /* JADX INFO: renamed from: m */
    public final AbstractC9018t1 f21046m;

    /* JADX INFO: renamed from: n */
    public final C8992o3 f21047n;

    /* JADX INFO: renamed from: o */
    public final C8959j0 f21048o;

    /* JADX INFO: renamed from: p */
    public final C9048z1 f21049p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C9015s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f21033r = unsafe;
    }

    public C8955i2(int[] iArr, Object[] objArr, int i, int i2, InterfaceC8925d2 interfaceC8925d2, boolean z, int[] iArr2, int i3, int i4, C8967k2 c8967k2, AbstractC9018t1 abstractC9018t1, C8992o3 c8992o3, C8959j0 c8959j0, C9048z1 c9048z1) {
        this.f21034a = iArr;
        this.f21035b = objArr;
        this.f21036c = i;
        this.f21037d = i2;
        this.f21040g = interfaceC8925d2 instanceof AbstractC9047z0;
        this.f21041h = z;
        this.f21039f = c8959j0 != null && (interfaceC8925d2 instanceof GeneratedMessageLite$ExtendableMessage);
        this.f21042i = iArr2;
        this.f21043j = i3;
        this.f21044k = i4;
        this.f21045l = c8967k2;
        this.f21046m = abstractC9018t1;
        this.f21047n = c8992o3;
        this.f21048o = c8959j0;
        this.f21038e = interfaceC8925d2;
        this.f21049p = c9048z1;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x027c  */
    /* JADX WARN: Code duplicated, block: B:130:0x027f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:134:0x029c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0385  */
    /* JADX INFO: renamed from: a */
    public static C8955i2 m21621a(C9009r2 c9009r2, C8967k2 c8967k2, AbstractC9018t1 abstractC9018t1, C8992o3 c8992o3, C8959j0 c8959j0, C9048z1 c9048z1) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int iCharAt5;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset3;
        int i18;
        Field fieldM21622a;
        char cCharAt9;
        int i19;
        int i20;
        Object obj;
        Field fieldM21622a2;
        int i21;
        Object obj2;
        Field fieldM21622a3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        int i25;
        char cCharAt12;
        int i26;
        int i27;
        char cCharAt13;
        if (!(c9009r2 instanceof C9009r2)) {
            c9009r2.getClass();
            throw new ClassCastException();
        }
        boolean z = ((c9009r2.f21104d & 1) == 1 ? EnumC8991o2.PROTO2 : EnumC8991o2.PROTO3) == EnumC8991o2.PROTO3;
        String str = c9009r2.f21102b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (str.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt6 = str.charAt(i);
        if (iCharAt6 >= 55296) {
            int i30 = iCharAt6 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = str.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt6 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt6 == 0) {
            i4 = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            i3 = 0;
            iCharAt5 = 0;
            i2 = i29;
            iArr = f21032q;
            iCharAt = 0;
        } else {
            int i32 = i29 + 1;
            iCharAt = str.charAt(i29);
            if (iCharAt >= 55296) {
                int i33 = iCharAt & 8191;
                int i34 = 13;
                while (true) {
                    i12 = i32 + 1;
                    cCharAt8 = str.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i12;
                }
                iCharAt = i33 | (cCharAt8 << i34);
                i32 = i12;
            }
            int i35 = i32 + 1;
            int iCharAt7 = str.charAt(i32);
            if (iCharAt7 >= 55296) {
                int i36 = iCharAt7 & 8191;
                int i37 = 13;
                while (true) {
                    i11 = i35 + 1;
                    cCharAt7 = str.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i11;
                }
                iCharAt7 = i36 | (cCharAt7 << i37);
                i35 = i11;
            }
            int i38 = i35 + 1;
            iCharAt2 = str.charAt(i35);
            if (iCharAt2 >= 55296) {
                int i39 = iCharAt2 & 8191;
                int i40 = 13;
                while (true) {
                    i10 = i38 + 1;
                    cCharAt6 = str.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i10;
                }
                iCharAt2 = i39 | (cCharAt6 << i40);
                i38 = i10;
            }
            int i41 = i38 + 1;
            iCharAt3 = str.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i9 = i41 + 1;
                    cCharAt5 = str.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i9;
                }
                iCharAt3 = i42 | (cCharAt5 << i43);
                i41 = i9;
            }
            int i44 = i41 + 1;
            int iCharAt8 = str.charAt(i41);
            if (iCharAt8 >= 55296) {
                int i45 = iCharAt8 & 8191;
                int i46 = 13;
                while (true) {
                    i8 = i44 + 1;
                    cCharAt4 = str.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i8;
                }
                iCharAt8 = i45 | (cCharAt4 << i46);
                i44 = i8;
            }
            int i47 = i44 + 1;
            iCharAt4 = str.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i7 = i47 + 1;
                    cCharAt3 = str.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i7;
                }
                iCharAt4 = i48 | (cCharAt3 << i49);
                i47 = i7;
            }
            int i50 = i47 + 1;
            int iCharAt9 = str.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i6 = i50 + 1;
                    cCharAt2 = str.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i6;
                }
                iCharAt9 = i51 | (cCharAt2 << i52);
                i50 = i6;
            }
            i2 = i50 + 1;
            iCharAt5 = str.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i53 = iCharAt5 & 8191;
                int i54 = i2;
                int i55 = 13;
                while (true) {
                    i5 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i54 = i5;
                }
                iCharAt5 = i53 | (cCharAt << i55);
                i2 = i5;
            }
            int[] iArr2 = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i3 = (iCharAt * 2) + iCharAt7;
            int i56 = iCharAt8;
            iArr = iArr2;
            i4 = i56;
        }
        Unsafe unsafe = f21033r;
        Object[] objArr = c9009r2.f21103c;
        Class<?> cls = c9009r2.f21101a.getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr2 = new Object[i4 * 2];
        int i57 = iCharAt4 + iCharAt5;
        int i58 = i2;
        int i59 = i57;
        int i60 = iCharAt5;
        int i61 = 0;
        int i62 = 0;
        while (i58 < length) {
            int i63 = i58 + 1;
            int iCharAt10 = str.charAt(i58);
            int i64 = length;
            if (iCharAt10 >= 55296) {
                int i65 = iCharAt10 & 8191;
                int i66 = i63;
                int i67 = 13;
                while (true) {
                    i25 = i66 + 1;
                    cCharAt12 = str.charAt(i66);
                    i26 = i65;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i65 = i26 | ((cCharAt12 & 8191) << i67);
                    i67 += 13;
                    i66 = i25;
                }
                iCharAt10 = i26 | (cCharAt12 << i67);
                i13 = i25;
            } else {
                i13 = i63;
            }
            int i68 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            int i69 = iCharAt10;
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i23 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i24 = i70;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 = i24 | ((cCharAt11 & 8191) << i72);
                    i72 += 13;
                    i71 = i23;
                }
                iCharAt11 = i24 | (cCharAt11 << i72);
                i14 = i23;
            } else {
                i14 = i68;
            }
            Object[] objArr3 = objArr;
            int i73 = iCharAt11 & 255;
            int i74 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i61] = i62;
                i61++;
            }
            int[] iArr4 = iArr3;
            if (i73 >= 51) {
                int i75 = i14 + 1;
                int iCharAt12 = str.charAt(i14);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = 13;
                    while (true) {
                        i22 = i75 + 1;
                        cCharAt10 = str.charAt(i75);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i75 = i22;
                        c = 55296;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i77);
                    i75 = i22;
                }
                int i78 = i73 - 51;
                int i79 = iCharAt12;
                if (i78 == 9 || i78 == 17) {
                    i19 = i3 + 1;
                    objArr2[((i62 / 3) * 2) + 1] = objArr3[i3];
                } else {
                    if (i78 == 12 && !z) {
                        i19 = i3 + 1;
                        objArr2[((i62 / 3) * 2) + 1] = objArr3[i3];
                    }
                    i20 = i79 * 2;
                    obj = objArr3[i20];
                    if (obj instanceof Field) {
                        fieldM21622a2 = (Field) obj;
                    } else {
                        fieldM21622a2 = m21622a((Class) cls, (String) obj);
                        objArr3[i20] = fieldM21622a2;
                    }
                    int i80 = i75;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM21622a2);
                    i21 = i20 + 1;
                    i17 = i80;
                    obj2 = objArr3[i21];
                    i16 = iObjectFieldOffset4;
                    if (obj2 instanceof Field) {
                        fieldM21622a3 = (Field) obj2;
                    } else {
                        fieldM21622a3 = m21622a((Class) cls, (String) obj2);
                        objArr3[i21] = fieldM21622a3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM21622a3);
                    i15 = 0;
                }
                i3 = i19;
                i20 = i79 * 2;
                obj = objArr3[i20];
                if (obj instanceof Field) {
                    fieldM21622a2 = (Field) obj;
                } else {
                    fieldM21622a2 = m21622a((Class) cls, (String) obj);
                    objArr3[i20] = fieldM21622a2;
                }
                int i81 = i75;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM21622a2);
                i21 = i20 + 1;
                i17 = i81;
                obj2 = objArr3[i21];
                i16 = iObjectFieldOffset5;
                if (obj2 instanceof Field) {
                    fieldM21622a3 = (Field) obj2;
                } else {
                    fieldM21622a3 = m21622a((Class) cls, (String) obj2);
                    objArr3[i21] = fieldM21622a3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM21622a3);
                i15 = 0;
            } else {
                int i82 = i3 + 1;
                Field fieldM21622a4 = m21622a((Class) cls, (String) objArr3[i3]);
                if (i73 == 9 || i73 == 17) {
                    objArr2[((i62 / 3) * 2) + 1] = fieldM21622a4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i3 += 2;
                        objArr2[((i62 / 3) * 2) + 1] = objArr3[i82];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            i3 += 2;
                            objArr2[((i62 / 3) * 2) + 1] = objArr3[i82];
                        }
                    } else if (i73 == 50) {
                        int i83 = i60 + 1;
                        iArr[i60] = i62;
                        int i84 = (i62 / 3) * 2;
                        int i85 = i3 + 2;
                        objArr2[i84] = objArr3[i82];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i84 + 1] = objArr3[i85];
                            i3 += 3;
                        } else {
                            i3 = i85;
                        }
                        i60 = i83;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM21622a4);
                    if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = 0;
                    } else {
                        int i86 = i14 + 1;
                        int iCharAt13 = str.charAt(i14);
                        if (iCharAt13 >= 55296) {
                            int i87 = iCharAt13 & 8191;
                            int i88 = 13;
                            while (true) {
                                i18 = i86 + 1;
                                cCharAt9 = str.charAt(i86);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i87 |= (cCharAt9 & 8191) << i88;
                                i88 += 13;
                                i86 = i18;
                            }
                            iCharAt13 = i87 | (cCharAt9 << i88);
                        } else {
                            i18 = i86;
                        }
                        int i89 = (iCharAt13 / 32) + (i74 * 2);
                        Object obj3 = objArr3[i89];
                        if (obj3 instanceof Field) {
                            fieldM21622a = (Field) obj3;
                        } else {
                            fieldM21622a = m21622a((Class) cls, (String) obj3);
                            objArr3[i89] = fieldM21622a;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM21622a);
                        i15 = iCharAt13 % 32;
                        i14 = i18;
                    }
                    if (i73 >= 18 && i73 <= 49) {
                        iArr[i59] = iObjectFieldOffset;
                        i59++;
                    }
                    i16 = iObjectFieldOffset;
                    i17 = i14;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                }
                i3 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM21622a4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i15 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i15 = 0;
                }
                if (i73 >= 18) {
                    iArr[i59] = iObjectFieldOffset;
                    i59++;
                }
                i16 = iObjectFieldOffset;
                i17 = i14;
                iObjectFieldOffset3 = iObjectFieldOffset2;
            }
            int i90 = i62 + 1;
            iArr4[i62] = i69;
            int i91 = i62 + 2;
            iArr4[i90] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | i16;
            i62 += 3;
            iArr4[i91] = (i15 << 20) | iObjectFieldOffset3;
            str = str;
            objArr = objArr3;
            length = i64;
            iCharAt = i74;
            i58 = i17;
            iArr3 = iArr4;
        }
        return new C8955i2(iArr3, objArr2, iCharAt2, iCharAt3, c9009r2.f21101a, z, iArr, iCharAt5, i57, c8967k2, abstractC9018t1, c8992o3, c8959j0, c9048z1);
    }

    /* JADX INFO: renamed from: a */
    public static Field m21622a(Class cls, String str) {
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

    /* JADX INFO: renamed from: a */
    public static void m21623a(int i, Object obj, C8917c0 c8917c0) {
        if (obj instanceof String) {
            c8917c0.f20990a.mo21481a((String) obj, i);
        } else {
            c8917c0.f20990a.mo21478a(i, (AbstractC9011s) obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m21624d(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: a */
    public final int m21625a(int i, int i2) {
        int length = (this.f21034a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f21034a[i4];
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

    /* JADX INFO: renamed from: a */
    public final int m21626a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C8934f c8934f) throws C8984n1 {
        Object object;
        Unsafe unsafe = f21033r;
        long j2 = this.f21034a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC8940g.m21553b(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC8940g.m21542a(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM21557e = AbstractC8940g.m21557e(bArr, i, c8934f);
                unsafe.putObject(obj, j, Long.valueOf(c8934f.f21013b));
                unsafe.putInt(obj, j2, i4);
                return iM21557e;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM21556d = AbstractC8940g.m21556d(bArr, i, c8934f);
                unsafe.putObject(obj, j, Integer.valueOf(c8934f.f21012a));
                unsafe.putInt(obj, j2, i4);
                return iM21556d;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC8940g.m21553b(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC8940g.m21542a(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM21557e2 = AbstractC8940g.m21557e(bArr, i, c8934f);
                unsafe.putObject(obj, j, Boolean.valueOf(c8934f.f21013b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM21557e2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM21556d2 = AbstractC8940g.m21556d(bArr, i, c8934f);
                int i13 = c8934f.f21012a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!AbstractC8927d4.f21001a.m21852b(bArr, iM21556d2, iM21556d2 + i13)) {
                            throw new C8984n1("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM21556d2, i13, AbstractC8972l1.f21064a));
                    iM21556d2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iM21556d2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM21548a = AbstractC8940g.m21548a(m21650c(i8), bArr, i, i2, c8934f);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, c8934f.f21014c);
                } else {
                    unsafe.putObject(obj, j, AbstractC8972l1.m21664a(object, c8934f.f21014c));
                }
                unsafe.putInt(obj, j2, i4);
                return iM21548a;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM21549a = AbstractC8940g.m21549a(bArr, i, c8934f);
                unsafe.putObject(obj, j, c8934f.f21014c);
                unsafe.putInt(obj, j2, i4);
                return iM21549a;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM21556d3 = AbstractC8940g.m21556d(bArr, i, c8934f);
                int i14 = c8934f.f21012a;
                m21630a(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iM21556d3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM21556d4 = AbstractC8940g.m21556d(bArr, i, c8934f);
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC9031w.m21818b(c8934f.f21012a)));
                unsafe.putInt(obj, j2, i4);
                return iM21556d4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM21557e3 = AbstractC8940g.m21557e(bArr, i, c8934f);
                unsafe.putObject(obj, j, Long.valueOf(AbstractC9031w.m21817a(c8934f.f21013b)));
                unsafe.putInt(obj, j2, i4);
                return iM21557e3;
            case 68:
                if (i5 == 3) {
                    int iM21547a = AbstractC8940g.m21547a(m21650c(i8), bArr, i, i2, (i3 & (-8)) | 4, c8934f);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, c8934f.f21014c);
                    } else {
                        unsafe.putObject(obj, j, AbstractC8972l1.m21664a(object, c8934f.f21014c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM21547a;
                }
                break;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final int m21627a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C8934f c8934f) throws C8984n1 {
        int iM21546a;
        int iM21546a2;
        int iM21546a3;
        int i7;
        int i8;
        int iM21554c;
        Unsafe unsafe = f21033r;
        InterfaceC8966k1 interfaceC8966k1Mo21502b = (InterfaceC8966k1) unsafe.getObject(obj, j2);
        if (!((AbstractC8916c) interfaceC8966k1Mo21502b).f20989a) {
            int size = interfaceC8966k1Mo21502b.size();
            interfaceC8966k1Mo21502b = interfaceC8966k1Mo21502b.mo21502b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC8966k1Mo21502b);
        }
        InterfaceC8966k1 interfaceC8966k1 = interfaceC8966k1Mo21502b;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    C8923d0 c8923d0 = (C8923d0) interfaceC8966k1;
                    int iM21556d = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i9 = c8934f.f21012a + iM21556d;
                    while (iM21556d < i9) {
                        c8923d0.m21529a(Double.longBitsToDouble(AbstractC8940g.m21553b(iM21556d, bArr)));
                        iM21556d += 8;
                    }
                    if (iM21556d == i9) {
                        return iM21556d;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 1) {
                    return i;
                }
                C8923d0 c8923d1 = (C8923d0) interfaceC8966k1;
                c8923d1.m21529a(Double.longBitsToDouble(AbstractC8940g.m21553b(i, bArr)));
                int i10 = i + 8;
                while (i10 < i2) {
                    int iM21546a4 = i10 + 1;
                    byte b = bArr[i10];
                    if (b >= 0) {
                        c8934f.f21012a = b;
                    } else {
                        iM21546a4 = AbstractC8940g.m21546a(b, bArr, iM21546a4, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return i10;
                    }
                    c8923d1.m21529a(Double.longBitsToDouble(AbstractC8940g.m21553b(iM21546a4, bArr)));
                    i10 = iM21546a4 + 8;
                }
                return i10;
            case 19:
            case 36:
                if (i4 == 2) {
                    C9001q0 c9001q0 = (C9001q0) interfaceC8966k1;
                    int iM21556d2 = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i11 = c8934f.f21012a + iM21556d2;
                    while (iM21556d2 < i11) {
                        c9001q0.m21706a(Float.intBitsToFloat(AbstractC8940g.m21542a(iM21556d2, bArr)));
                        iM21556d2 += 4;
                    }
                    if (iM21556d2 == i11) {
                        return iM21556d2;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 5) {
                    return i;
                }
                C9001q0 c9001q1 = (C9001q0) interfaceC8966k1;
                c9001q1.m21706a(Float.intBitsToFloat(AbstractC8940g.m21542a(i, bArr)));
                for (int i12 = i + 4; i12 < i2; i12 = iM21546a + 4) {
                    iM21546a = i12 + 1;
                    byte b2 = bArr[i12];
                    if (b2 >= 0) {
                        c8934f.f21012a = b2;
                    } else {
                        iM21546a = AbstractC8940g.m21546a(b2, bArr, iM21546a, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return i12;
                    }
                    c9001q1.m21706a(Float.intBitsToFloat(AbstractC8940g.m21542a(iM21546a, bArr)));
                }
                return i12;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    C9023u1 c9023u1 = (C9023u1) interfaceC8966k1;
                    int iM21556d3 = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i13 = c8934f.f21012a + iM21556d3;
                    while (iM21556d3 < i13) {
                        iM21556d3 = AbstractC8940g.m21557e(bArr, iM21556d3, c8934f);
                        c9023u1.m21775a(c8934f.f21013b);
                    }
                    if (iM21556d3 == i13) {
                        return iM21556d3;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 0) {
                    return i;
                }
                C9023u1 c9023u2 = (C9023u1) interfaceC8966k1;
                int iM21557e = AbstractC8940g.m21557e(bArr, i, c8934f);
                c9023u2.m21775a(c8934f.f21013b);
                while (iM21557e < i2) {
                    int iM21546a5 = iM21557e + 1;
                    byte b3 = bArr[iM21557e];
                    if (b3 >= 0) {
                        c8934f.f21012a = b3;
                    } else {
                        iM21546a5 = AbstractC8940g.m21546a(b3, bArr, iM21546a5, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return iM21557e;
                    }
                    iM21557e = AbstractC8940g.m21557e(bArr, iM21546a5, c8934f);
                    c9023u2.m21775a(c8934f.f21013b);
                }
                return iM21557e;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return AbstractC8940g.m21550a(bArr, i, interfaceC8966k1, c8934f);
                }
                return i4 == 0 ? AbstractC8940g.m21554c(i3, bArr, i, i2, interfaceC8966k1, c8934f) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    C9023u1 c9023u3 = (C9023u1) interfaceC8966k1;
                    int iM21556d4 = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i14 = c8934f.f21012a + iM21556d4;
                    while (iM21556d4 < i14) {
                        c9023u3.m21775a(AbstractC8940g.m21553b(iM21556d4, bArr));
                        iM21556d4 += 8;
                    }
                    if (iM21556d4 == i14) {
                        return iM21556d4;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 1) {
                    return i;
                }
                C9023u1 c9023u4 = (C9023u1) interfaceC8966k1;
                c9023u4.m21775a(AbstractC8940g.m21553b(i, bArr));
                for (int i15 = i + 8; i15 < i2; i15 = iM21546a2 + 8) {
                    iM21546a2 = i15 + 1;
                    byte b4 = bArr[i15];
                    if (b4 >= 0) {
                        c8934f.f21012a = b4;
                    } else {
                        iM21546a2 = AbstractC8940g.m21546a(b4, bArr, iM21546a2, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return i15;
                    }
                    c9023u4.m21775a(AbstractC8940g.m21553b(iM21546a2, bArr));
                }
                return i15;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    C8906a1 c8906a1 = (C8906a1) interfaceC8966k1;
                    int iM21556d5 = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i16 = c8934f.f21012a + iM21556d5;
                    while (iM21556d5 < i16) {
                        c8906a1.m21503c(AbstractC8940g.m21542a(iM21556d5, bArr));
                        iM21556d5 += 4;
                    }
                    if (iM21556d5 == i16) {
                        return iM21556d5;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 5) {
                    return i;
                }
                C8906a1 c8906a2 = (C8906a1) interfaceC8966k1;
                c8906a2.m21503c(AbstractC8940g.m21542a(i, bArr));
                for (int i17 = i + 4; i17 < i2; i17 = iM21546a3 + 4) {
                    iM21546a3 = i17 + 1;
                    byte b5 = bArr[i17];
                    if (b5 >= 0) {
                        c8934f.f21012a = b5;
                    } else {
                        iM21546a3 = AbstractC8940g.m21546a(b5, bArr, iM21546a3, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return i17;
                    }
                    c8906a2.m21503c(AbstractC8940g.m21542a(iM21546a3, bArr));
                }
                return i17;
            case 25:
            case 42:
                if (i4 == 2) {
                    C8958j c8958j = (C8958j) interfaceC8966k1;
                    int iM21556d6 = AbstractC8940g.m21556d(bArr, i, c8934f);
                    int i18 = c8934f.f21012a + iM21556d6;
                    while (iM21556d6 < i18) {
                        iM21556d6 = AbstractC8940g.m21557e(bArr, iM21556d6, c8934f);
                        c8958j.m21656a(c8934f.f21013b != 0);
                    }
                    if (iM21556d6 == i18) {
                        return iM21556d6;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 != 0) {
                    return i;
                }
                C8958j c8958j2 = (C8958j) interfaceC8966k1;
                int iM21557e2 = AbstractC8940g.m21557e(bArr, i, c8934f);
                c8958j2.m21656a(c8934f.f21013b != 0);
                while (iM21557e2 < i2) {
                    int iM21546a6 = iM21557e2 + 1;
                    byte b6 = bArr[iM21557e2];
                    if (b6 >= 0) {
                        c8934f.f21012a = b6;
                    } else {
                        iM21546a6 = AbstractC8940g.m21546a(b6, bArr, iM21546a6, c8934f);
                    }
                    if (i3 != c8934f.f21012a) {
                        return iM21557e2;
                    }
                    iM21557e2 = AbstractC8940g.m21557e(bArr, iM21546a6, c8934f);
                    c8958j2.m21656a(c8934f.f21013b != 0);
                }
                return iM21557e2;
            case 26:
                i7 = i;
                if (i4 == 2) {
                    return (j & 536870912) == 0 ? AbstractC8940g.m21544a(i3, bArr, i7, i2, interfaceC8966k1, c8934f) : AbstractC8940g.m21551b(i3, bArr, i7, i2, interfaceC8966k1, c8934f);
                }
                return i7;
            case 27:
                i7 = i;
                if (i4 == 2) {
                    InterfaceC9019t2 interfaceC9019t2M21650c = m21650c(i5);
                    int iM21548a = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, i7, i2, c8934f);
                    interfaceC8966k1.add(c8934f.f21014c);
                    while (iM21548a < i2) {
                        int iM21546a7 = iM21548a + 1;
                        byte b7 = bArr[iM21548a];
                        if (b7 >= 0) {
                            c8934f.f21012a = b7;
                        } else {
                            iM21546a7 = AbstractC8940g.m21546a(b7, bArr, iM21546a7, c8934f);
                        }
                        if (i3 != c8934f.f21012a) {
                            return iM21548a;
                        }
                        iM21548a = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, iM21546a7, i2, c8934f);
                        interfaceC8966k1.add(c8934f.f21014c);
                    }
                    return iM21548a;
                }
                return i7;
            case 28:
                i7 = i;
                if (i4 == 2) {
                    int iM21556d7 = AbstractC8940g.m21556d(bArr, i7, c8934f);
                    int i19 = c8934f.f21012a;
                    if (i19 < 0) {
                        throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    if (i19 > bArr.length - iM21556d7) {
                        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if (i19 == 0) {
                        interfaceC8966k1.add(AbstractC9011s.f21106b);
                    } else {
                        int i20 = iM21556d7 + i19;
                        AbstractC9011s.m21712a(iM21556d7, i20, bArr.length);
                        interfaceC8966k1.add(new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, iM21556d7, i19)));
                        iM21556d7 = i20;
                    }
                    while (iM21556d7 < i2) {
                        int iM21546a8 = iM21556d7 + 1;
                        byte b8 = bArr[iM21556d7];
                        if (b8 >= 0) {
                            c8934f.f21012a = b8;
                        } else {
                            iM21546a8 = AbstractC8940g.m21546a(b8, bArr, iM21546a8, c8934f);
                        }
                        if (i3 != c8934f.f21012a) {
                            return iM21556d7;
                        }
                        iM21556d7 = iM21546a8 + 1;
                        byte b9 = bArr[iM21546a8];
                        if (b9 >= 0) {
                            c8934f.f21012a = b9;
                        } else {
                            iM21556d7 = AbstractC8940g.m21546a(b9, bArr, iM21556d7, c8934f);
                        }
                        int i21 = c8934f.f21012a;
                        if (i21 < 0) {
                            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                        }
                        if (i21 > bArr.length - iM21556d7) {
                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i21 == 0) {
                            interfaceC8966k1.add(AbstractC9011s.f21106b);
                        } else {
                            int i22 = iM21556d7 + i21;
                            AbstractC9011s.m21712a(iM21556d7, i22, bArr.length);
                            interfaceC8966k1.add(new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, iM21556d7, i21)));
                            iM21556d7 = i22;
                        }
                    }
                    return iM21556d7;
                }
                return i7;
            case 30:
            case 44:
                i8 = i;
                if (i4 != 2) {
                    if (i4 == 0) {
                        iM21554c = AbstractC8940g.m21554c(i3, bArr, i8, i2, interfaceC8966k1, c8934f);
                    }
                    return i8;
                }
                iM21554c = AbstractC8940g.m21550a(bArr, i8, interfaceC8966k1, c8934f);
                AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj;
                C8986n3 c8986n3 = abstractC9047z0.unknownFields;
                if (c8986n3 == C8986n3.f21077f) {
                    c8986n3 = null;
                }
                m21630a(i5);
                Class cls = AbstractC9024u2.f21133a;
                if (c8986n3 != null) {
                    abstractC9047z0.unknownFields = c8986n3;
                }
                return iM21554c;
            case 33:
            case 47:
                i8 = i;
                if (i4 == 2) {
                    C8906a1 c8906a3 = (C8906a1) interfaceC8966k1;
                    int iM21556d8 = AbstractC8940g.m21556d(bArr, i8, c8934f);
                    int i23 = c8934f.f21012a + iM21556d8;
                    while (iM21556d8 < i23) {
                        int i24 = iM21556d8 + 1;
                        byte b10 = bArr[iM21556d8];
                        if (b10 >= 0) {
                            c8934f.f21012a = b10;
                            iM21556d8 = i24;
                        } else {
                            iM21556d8 = AbstractC8940g.m21546a(b10, bArr, i24, c8934f);
                        }
                        c8906a3.m21503c(AbstractC9031w.m21818b(c8934f.f21012a));
                    }
                    if (iM21556d8 == i23) {
                        return iM21556d8;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    C8906a1 c8906a4 = (C8906a1) interfaceC8966k1;
                    int iM21556d9 = AbstractC8940g.m21556d(bArr, i8, c8934f);
                    c8906a4.m21503c(AbstractC9031w.m21818b(c8934f.f21012a));
                    while (iM21556d9 < i2) {
                        int iM21546a9 = iM21556d9 + 1;
                        byte b11 = bArr[iM21556d9];
                        if (b11 >= 0) {
                            c8934f.f21012a = b11;
                        } else {
                            iM21546a9 = AbstractC8940g.m21546a(b11, bArr, iM21546a9, c8934f);
                        }
                        if (i3 != c8934f.f21012a) {
                            return iM21556d9;
                        }
                        iM21556d9 = iM21546a9 + 1;
                        byte b12 = bArr[iM21546a9];
                        if (b12 >= 0) {
                            c8934f.f21012a = b12;
                        } else {
                            iM21556d9 = AbstractC8940g.m21546a(b12, bArr, iM21556d9, c8934f);
                        }
                        c8906a4.m21503c(AbstractC9031w.m21818b(c8934f.f21012a));
                    }
                    return iM21556d9;
                }
                return i8;
            case 34:
            case 48:
                i8 = i;
                if (i4 == 2) {
                    C9023u1 c9023u5 = (C9023u1) interfaceC8966k1;
                    int iM21556d10 = AbstractC8940g.m21556d(bArr, i8, c8934f);
                    int i25 = c8934f.f21012a + iM21556d10;
                    while (iM21556d10 < i25) {
                        iM21556d10 = AbstractC8940g.m21557e(bArr, iM21556d10, c8934f);
                        c9023u5.m21775a(AbstractC9031w.m21817a(c8934f.f21013b));
                    }
                    if (iM21556d10 == i25) {
                        return iM21556d10;
                    }
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    C9023u1 c9023u6 = (C9023u1) interfaceC8966k1;
                    int iM21557e3 = AbstractC8940g.m21557e(bArr, i8, c8934f);
                    c9023u6.m21775a(AbstractC9031w.m21817a(c8934f.f21013b));
                    while (iM21557e3 < i2) {
                        int iM21546a10 = iM21557e3 + 1;
                        byte b13 = bArr[iM21557e3];
                        if (b13 >= 0) {
                            c8934f.f21012a = b13;
                        } else {
                            iM21546a10 = AbstractC8940g.m21546a(b13, bArr, iM21546a10, c8934f);
                        }
                        if (i3 != c8934f.f21012a) {
                            return iM21557e3;
                        }
                        iM21557e3 = AbstractC8940g.m21557e(bArr, iM21546a10, c8934f);
                        c9023u6.m21775a(AbstractC9031w.m21817a(c8934f.f21013b));
                    }
                    return iM21557e3;
                }
                return i8;
            case 49:
                if (i4 == 3) {
                    InterfaceC9019t2 interfaceC9019t2M21650c2 = m21650c(i5);
                    int i26 = (i3 & (-8)) | 4;
                    int iM21547a = AbstractC8940g.m21547a(interfaceC9019t2M21650c2, bArr, i, i2, i26, c8934f);
                    InterfaceC9019t2 interfaceC9019t2 = interfaceC9019t2M21650c2;
                    int i27 = i2;
                    C8934f c8934f2 = c8934f;
                    interfaceC8966k1.add(c8934f2.f21014c);
                    while (iM21547a < i27) {
                        int iM21556d11 = AbstractC8940g.m21556d(bArr, iM21547a, c8934f2);
                        if (i3 != c8934f2.f21012a) {
                            return iM21547a;
                        }
                        InterfaceC9019t2 interfaceC9019t3 = interfaceC9019t2;
                        int i28 = i27;
                        C8934f c8934f3 = c8934f2;
                        iM21547a = AbstractC8940g.m21547a(interfaceC9019t3, bArr, iM21556d11, i28, i26, c8934f3);
                        interfaceC8966k1.add(c8934f3.f21014c);
                        interfaceC9019t2 = interfaceC9019t3;
                        i27 = i28;
                        c8934f2 = c8934f3;
                    }
                    return iM21547a;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:302:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:303:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:305:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:308:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:310:0x07d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final int m21628a(Object obj, byte[] bArr, int i, int i2, int i3, C8934f c8934f) throws C8984n1 {
        int i4;
        Unsafe unsafe;
        C8955i2 c8955i2;
        Object obj2;
        int iM21625a;
        int i5;
        int i6;
        boolean z;
        int iM21557e;
        int i7;
        C8934f c8934f2;
        int i8;
        int i9;
        Object objM21664a;
        C9032w0 c9032w0;
        int i10;
        Object obj3;
        int iM21556d;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        Unsafe unsafe2;
        C8934f c8934f3;
        int iM21557e2;
        Unsafe unsafe3;
        Unsafe unsafe4;
        int i15;
        int i16;
        int iM21548a;
        C8955i2 c8955i3;
        int i17;
        int i18;
        int i19;
        int iM21626a;
        C8955i2 c8955i4 = this;
        Object obj4 = obj;
        bArr = bArr;
        int i20 = i2;
        C8934f c8934f4 = c8934f;
        Unsafe unsafe5 = f21033r;
        int i21 = 0;
        int i22 = i;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (true) {
            Object objValueOf = null;
            if (i22 < i20) {
                int iM21546a = i22 + 1;
                int i28 = bArr[i22];
                if (i28 < 0) {
                    iM21546a = AbstractC8940g.m21546a(i28, bArr, iM21546a, c8934f4);
                    i28 = c8934f4.f21012a;
                }
                int i29 = iM21546a;
                int i30 = i28;
                int i31 = (i30 == true ? 1 : 0) >>> 3;
                int i32 = (i30 == true ? 1 : 0) & 7;
                if (i31 > i26) {
                    int i33 = i23 / 3;
                    if (i31 < c8955i4.f21036c || i31 > c8955i4.f21037d) {
                        iM21625a = -1;
                    } else {
                        iM21625a = c8955i4.m21625a(i31, i33);
                    }
                } else if (i31 < c8955i4.f21036c || i31 > c8955i4.f21037d) {
                    iM21625a = -1;
                } else {
                    iM21625a = c8955i4.m21625a(i31, i21);
                }
                if (iM21625a == -1) {
                    i26 = i31;
                    i4 = i27;
                    unsafe = unsafe5;
                    i5 = 0;
                    i6 = 0;
                    z = true;
                    c8955i2 = c8955i4;
                    obj2 = obj4;
                    iM21557e = i29;
                    i7 = i30 == true ? 1 : 0;
                    c8934f2 = c8934f;
                } else {
                    int[] iArr = c8955i4.f21034a;
                    int i34 = iArr[iM21625a + 1];
                    int i35 = (i34 & 267386880) >>> 20;
                    long j = i34 & 1048575;
                    if (i35 <= 17) {
                        int i36 = iArr[iM21625a + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i27) {
                            if (i27 != 1048575) {
                                unsafe5.putInt(obj4, i27, i24);
                            }
                            i11 = unsafe5.getInt(obj4, i38);
                            i12 = i38;
                        } else {
                            i11 = i24;
                            i12 = i27;
                        }
                        switch (i35) {
                            case 0:
                                i2 = i2;
                                i14 = i12;
                                z2 = true;
                                i13 = i29;
                                i5 = iM21625a;
                                unsafe2 = unsafe5;
                                c8934f3 = c8934f;
                                if (i32 == 1) {
                                    AbstractC9040x3.f21172c.mo21757a(obj4, j, Double.longBitsToDouble(AbstractC8940g.m21553b(i13, bArr)));
                                    iM21557e2 = i13 + 8;
                                    int i39 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i39;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 1:
                                i2 = i2;
                                i14 = i12;
                                i13 = i29;
                                i5 = iM21625a;
                                unsafe2 = unsafe5;
                                c8934f3 = c8934f;
                                if (i32 == 5) {
                                    AbstractC9040x3.f21172c.mo21758a(obj4, j, Float.intBitsToFloat(AbstractC8940g.m21542a(i13, bArr)));
                                    iM21557e2 = i13 + 4;
                                    int i310 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i310;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                z2 = true;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe5;
                                i14 = i12;
                                c8934f3 = c8934f;
                                i13 = i29;
                                i5 = iM21625a;
                                if (i32 == 0) {
                                    iM21557e2 = AbstractC8940g.m21557e(bArr, i13, c8934f3);
                                    unsafe3.putLong(obj4, j, c8934f3.f21013b);
                                    unsafe2 = unsafe3;
                                    int i311 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i311;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                unsafe2 = unsafe3;
                                z2 = true;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe5;
                                i14 = i12;
                                c8934f3 = c8934f;
                                i13 = i29;
                                i5 = iM21625a;
                                if (i32 == 0) {
                                    int iM21546a2 = i13 + 1;
                                    int i40 = bArr[i13];
                                    if (i40 >= 0) {
                                        c8934f3.f21012a = i40;
                                    } else {
                                        iM21546a2 = AbstractC8940g.m21546a(i40, bArr, iM21546a2, c8934f3);
                                    }
                                    iM21557e2 = iM21546a2;
                                    unsafe3.putInt(obj4, j, c8934f3.f21012a);
                                    unsafe2 = unsafe3;
                                    int i312 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i312;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                unsafe2 = unsafe3;
                                z2 = true;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 5:
                            case 14:
                                unsafe4 = unsafe5;
                                i14 = i12;
                                z2 = true;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 1) {
                                    unsafe3 = unsafe4;
                                    unsafe3.putLong(obj4, j, AbstractC8940g.m21553b(i29, bArr));
                                    iM21557e2 = i29 + 8;
                                    unsafe2 = unsafe3;
                                    int i313 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i313;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                } else {
                                    i13 = i29;
                                    unsafe2 = unsafe4;
                                    i4 = i14;
                                    c8955i2 = c8955i4;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i7 = i30 == true ? 1 : 0;
                                    i26 = i31;
                                    i24 = i11;
                                    i6 = 0;
                                    c8934f2 = c8934f3;
                                    obj2 = obj4;
                                    iM21557e = i13;
                                }
                                break;
                            case 6:
                            case 13:
                                i2 = i2;
                                i15 = i29;
                                unsafe4 = unsafe5;
                                i14 = i12;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 5) {
                                    unsafe4.putInt(obj4, j, AbstractC8940g.m21542a(i15, bArr));
                                    iM21557e2 = i15 + 4;
                                    unsafe2 = unsafe4;
                                    int i314 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i314;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i15;
                                unsafe2 = unsafe4;
                                z2 = true;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 7:
                                i2 = i2;
                                i15 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 0) {
                                    iM21557e2 = AbstractC8940g.m21557e(bArr, i15, c8934f3);
                                    i14 = i12;
                                    AbstractC9040x3.f21172c.mo21759a(obj4, j, c8934f3.f21013b != 0);
                                    unsafe2 = unsafe4;
                                    int i315 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i315;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                } else {
                                    i14 = i12;
                                    i13 = i15;
                                    unsafe2 = unsafe4;
                                    z2 = true;
                                    i4 = i14;
                                    c8955i2 = c8955i4;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i7 = i30 == true ? 1 : 0;
                                    i26 = i31;
                                    i24 = i11;
                                    i6 = 0;
                                    c8934f2 = c8934f3;
                                    obj2 = obj4;
                                    iM21557e = i13;
                                }
                                break;
                            case 8:
                                i2 = i2;
                                i16 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 2) {
                                    iM21557e2 = (i34 & 536870912) == 0 ? AbstractC8940g.m21552b(bArr, i16, c8934f3) : AbstractC8940g.m21555c(bArr, i16, c8934f3);
                                    unsafe4.putObject(obj4, j, c8934f3.f21014c);
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i316 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i316;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i16;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe4;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 9:
                                i2 = i2;
                                i16 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 2) {
                                    iM21548a = AbstractC8940g.m21548a(c8955i4.m21650c(i5), bArr, i16, i2, c8934f3);
                                    if ((i11 & i37) == 0) {
                                        unsafe4.putObject(obj4, j, c8934f3.f21014c);
                                    } else {
                                        unsafe4.putObject(obj4, j, AbstractC8972l1.m21664a(unsafe4.getObject(obj4, j), c8934f3.f21014c));
                                    }
                                    iM21557e2 = iM21548a;
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i317 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i317;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i16;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe4;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 10:
                                i2 = i2;
                                i16 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 2) {
                                    iM21557e2 = AbstractC8940g.m21549a(bArr, i16, c8934f3);
                                    unsafe4.putObject(obj4, j, c8934f3.f21014c);
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i318 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i318;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i16;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe4;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 12:
                                i2 = i2;
                                i16 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 0) {
                                    int iM21546a3 = i16 + 1;
                                    int i41 = bArr[i16];
                                    if (i41 >= 0) {
                                        c8934f3.f21012a = i41;
                                    } else {
                                        iM21546a3 = AbstractC8940g.m21546a(i41, bArr, iM21546a3, c8934f3);
                                    }
                                    iM21557e2 = iM21546a3;
                                    int i42 = c8934f3.f21012a;
                                    c8955i4.m21630a(i5);
                                    unsafe4.putInt(obj4, j, i42);
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i319 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i319;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i16;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe4;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 15:
                                i2 = i2;
                                i16 = i29;
                                unsafe4 = unsafe5;
                                c8934f3 = c8934f;
                                i5 = iM21625a;
                                if (i32 == 0) {
                                    int iM21546a4 = i16 + 1;
                                    int i43 = bArr[i16];
                                    if (i43 >= 0) {
                                        c8934f3.f21012a = i43;
                                    } else {
                                        iM21546a4 = AbstractC8940g.m21546a(i43, bArr, iM21546a4, c8934f3);
                                    }
                                    iM21557e2 = iM21546a4;
                                    unsafe4.putInt(obj4, j, AbstractC9031w.m21818b(c8934f3.f21012a));
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i3110 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i3110;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                }
                                i13 = i16;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe4;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                            case 16:
                                i16 = i29;
                                int i44 = iM21625a;
                                if (i32 == 0) {
                                    iM21557e2 = AbstractC8940g.m21557e(bArr, i16, c8934f);
                                    i5 = i44;
                                    unsafe3 = unsafe5;
                                    unsafe3.putLong(obj4, j, AbstractC9031w.m21817a(c8934f.f21013b));
                                    i14 = i12;
                                    unsafe2 = unsafe3;
                                    int i3111 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i3111;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                } else {
                                    Unsafe unsafe6 = unsafe5;
                                    c8934f3 = c8934f;
                                    unsafe4 = unsafe6;
                                    i5 = i44;
                                    i13 = i16;
                                    i14 = i12;
                                    z2 = true;
                                    unsafe2 = unsafe4;
                                    i4 = i14;
                                    c8955i2 = c8955i4;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i7 = i30 == true ? 1 : 0;
                                    i26 = i31;
                                    i24 = i11;
                                    i6 = 0;
                                    c8934f2 = c8934f3;
                                    obj2 = obj4;
                                    iM21557e = i13;
                                }
                                break;
                            case 17:
                                if (i32 == 3) {
                                    int i45 = iM21625a;
                                    iM21548a = AbstractC8940g.m21547a(c8955i4.m21650c(iM21625a), bArr, i29, i2, (i31 << 3) | 4, c8934f);
                                    i2 = i2;
                                    if ((i11 & i37) == 0) {
                                        unsafe5.putObject(obj4, j, c8934f.f21014c);
                                    } else {
                                        unsafe5.putObject(obj4, j, AbstractC8972l1.m21664a(unsafe5.getObject(obj4, j), c8934f.f21014c));
                                    }
                                    unsafe4 = unsafe5;
                                    i5 = i45;
                                    iM21557e2 = iM21548a;
                                    i14 = i12;
                                    unsafe2 = unsafe4;
                                    int i3112 = i11 | i37;
                                    i4 = i14;
                                    obj2 = obj4;
                                    i20 = i2;
                                    i23 = i5;
                                    unsafe = unsafe2;
                                    i8 = i30 == true ? 1 : 0;
                                    i22 = iM21557e2;
                                    i26 = i31;
                                    i6 = 0;
                                    c8955i2 = c8955i4;
                                    i24 = i3112;
                                    i25 = i8;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                    c8934f4 = c8934f;
                                    break;
                                }
                            default:
                                i13 = i29;
                                i5 = iM21625a;
                                i14 = i12;
                                z2 = true;
                                unsafe2 = unsafe5;
                                c8934f3 = c8934f;
                                i4 = i14;
                                c8955i2 = c8955i4;
                                z = z2;
                                unsafe = unsafe2;
                                i7 = i30 == true ? 1 : 0;
                                i26 = i31;
                                i24 = i11;
                                i6 = 0;
                                c8934f2 = c8934f3;
                                obj2 = obj4;
                                iM21557e = i13;
                                break;
                        }
                    } else {
                        int i46 = i30 == true ? 1 : 0;
                        Unsafe unsafe7 = unsafe5;
                        i5 = iM21625a;
                        int i47 = i24;
                        if (i35 == 27) {
                            if (i32 == 2) {
                                InterfaceC8966k1 interfaceC8966k1Mo21502b = (InterfaceC8966k1) unsafe7.getObject(obj4, j);
                                if (!((AbstractC8916c) interfaceC8966k1Mo21502b).f20989a) {
                                    int size = interfaceC8966k1Mo21502b.size();
                                    interfaceC8966k1Mo21502b = interfaceC8966k1Mo21502b.mo21502b(size == 0 ? 10 : size * 2);
                                    unsafe7.putObject(obj4, j, interfaceC8966k1Mo21502b);
                                }
                                InterfaceC9019t2 interfaceC9019t2M21650c = c8955i4.m21650c(i5);
                                int iM21548a2 = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, i29, i20, c8934f);
                                interfaceC8966k1Mo21502b.add(c8934f.f21014c);
                                while (true) {
                                    if (iM21548a2 < i20) {
                                        int iM21546a5 = iM21548a2 + 1;
                                        int i48 = bArr[iM21548a2];
                                        if (i48 >= 0) {
                                            c8934f.f21012a = i48;
                                        } else {
                                            iM21546a5 = AbstractC8940g.m21546a(i48, bArr, iM21546a5, c8934f);
                                        }
                                        i19 = i46;
                                        if (i19 == c8934f.f21012a) {
                                            iM21548a2 = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, iM21546a5, i20, c8934f);
                                            interfaceC8966k1Mo21502b.add(c8934f.f21014c);
                                            i46 = i19 == true ? 1 : 0;
                                        }
                                    } else {
                                        i19 = i46;
                                    }
                                }
                                obj2 = obj4;
                                unsafe = unsafe7;
                                i24 = i47;
                                i4 = i27;
                                i23 = i5;
                                i22 = iM21548a2;
                                i8 = i19;
                                i26 = i31;
                                i6 = 0;
                                c8955i2 = c8955i4;
                            } else {
                                c8955i3 = c8955i4;
                                unsafe = unsafe7;
                                i4 = i27;
                                i17 = i29;
                                i6 = 0;
                                z = true;
                                i7 = i46 == true ? 1 : 0;
                                i18 = i47;
                            }
                            i25 = i8;
                            c8955i4 = c8955i2;
                            obj4 = obj2;
                            unsafe5 = unsafe;
                            i21 = i6;
                            i27 = i4;
                            c8934f4 = c8934f;
                        } else if (i35 <= 49) {
                            i4 = i27;
                            unsafe = unsafe7;
                            i18 = i47;
                            i6 = 0;
                            z = true;
                            i7 = i46 == true ? 1 : 0;
                            Object obj5 = obj4;
                            c8934f2 = c8934f;
                            int iM21627a = m21627a(obj5, bArr, i29, i20, i7 == true ? 1 : 0, i32, i5, i34, i35, j, c8934f2);
                            c8955i2 = this;
                            obj2 = obj5;
                            if (iM21627a != i29) {
                                i5 = i5;
                                i22 = iM21627a;
                                i26 = i31;
                                C8934f c8934f5 = c8934f2;
                                i25 = i7;
                                c8934f4 = c8934f5;
                                i24 = i18;
                                i20 = i2;
                                c8955i4 = c8955i2;
                                obj4 = obj2;
                                i23 = i5;
                                unsafe5 = unsafe;
                                i21 = i6;
                                i27 = i4;
                            } else {
                                i5 = i5;
                                iM21626a = iM21627a;
                                i26 = i31;
                                i24 = i18;
                                iM21557e = iM21626a;
                            }
                        } else {
                            i6 = 0;
                            z = true;
                            unsafe = unsafe7;
                            i18 = i47;
                            i4 = i27;
                            i17 = i29;
                            i7 = i46 == true ? 1 : 0;
                            c8955i3 = this;
                            if (i35 != 50) {
                                c8934f2 = c8934f;
                                Object obj6 = obj4;
                                i26 = i31;
                                iM21626a = c8955i3.m21626a(obj6, bArr, i17, i2, i7 == true ? 1 : 0, i26, i32, i34, i35, j, i5, c8934f2);
                                c8955i2 = c8955i3;
                                obj2 = obj6;
                                if (iM21626a != i17) {
                                    i5 = i5;
                                    i22 = iM21626a;
                                    C8934f c8934f6 = c8934f2;
                                    i25 = i7;
                                    c8934f4 = c8934f6;
                                    i24 = i18;
                                    i20 = i2;
                                    c8955i4 = c8955i2;
                                    obj4 = obj2;
                                    i23 = i5;
                                    unsafe5 = unsafe;
                                    i21 = i6;
                                    i27 = i4;
                                } else {
                                    i5 = i5;
                                    i24 = i18;
                                    iM21557e = iM21626a;
                                }
                            } else if (i32 == 2) {
                                Unsafe unsafe8 = f21033r;
                                Object objM21644b = c8955i3.m21644b(i5);
                                Object object = unsafe8.getObject(obj4, j);
                                c8955i3.f21049p.getClass();
                                if (!((C9043y1) object).f21182a) {
                                    c8955i3.f21049p.getClass();
                                    C9043y1 c9043y1 = C9043y1.f21181b;
                                    C9043y1 c9043y2 = c9043y1.isEmpty() ? new C9043y1() : new C9043y1(c9043y1);
                                    c8955i3.f21049p.getClass();
                                    C9048z1.m21850a(c9043y2, object);
                                    unsafe8.putObject(obj4, j, c9043y2);
                                }
                                c8955i3.f21049p.getClass();
                                objM21644b.getClass();
                                throw new ClassCastException();
                            }
                        }
                        i24 = i18;
                        c8934f2 = c8934f;
                        c8955i2 = c8955i3;
                        obj2 = obj4;
                        iM21557e = i17;
                        i26 = i31;
                    }
                }
                if (i7 != i3 || i3 == 0) {
                    if (!c8955i2.f21039f || c8934f2.f21015d == C8947h0.m21617a()) {
                        int i49 = i7;
                        int i50 = i5;
                        C8934f c8934f7 = c8934f2;
                        AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj2;
                        C8986n3 c8986n3 = abstractC9047z0.unknownFields;
                        if (c8986n3 == C8986n3.f21077f) {
                            c8986n3 = new C8986n3();
                            abstractC9047z0.unknownFields = c8986n3;
                        }
                        C8986n3 c8986n4 = c8986n3;
                        i20 = i2;
                        int iM21545a = AbstractC8940g.m21545a(i49 == true ? 1 : 0, bArr, iM21557e, i20, c8986n4, c8934f7);
                        i8 = i49 == true ? 1 : 0;
                        i23 = i50;
                        i22 = iM21545a;
                    } else {
                        InterfaceC8925d2 interfaceC8925d2 = c8955i2.f21038e;
                        C8992o3 c8992o3 = c8955i2.f21047n;
                        C9037x0 c9037x0M21618a = c8934f2.f21015d.m21618a(i26, interfaceC8925d2);
                        if (c9037x0M21618a == null) {
                            AbstractC9047z0 abstractC9047z1 = (AbstractC9047z0) obj2;
                            C8986n3 c8986n5 = abstractC9047z1.unknownFields;
                            if (c8986n5 == C8986n3.f21077f) {
                                c8986n5 = new C8986n3();
                                abstractC9047z1.unknownFields = c8986n5;
                            }
                            i20 = i2;
                            int i51 = i7;
                            int iM21545a2 = AbstractC8940g.m21545a(i51 == true ? 1 : 0, bArr, iM21557e, i20, c8986n5, c8934f2);
                            i8 = i51 == true ? 1 : 0;
                            i22 = iM21545a2;
                            i23 = i5;
                        } else {
                            i20 = i2;
                            int i52 = i7;
                            C8934f c8934f8 = c8934f2;
                            GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj2;
                            generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
                            C8983n0 c8983n0 = generatedMessageLite$ExtendableMessage.extensions;
                            C9032w0 c9032w1 = c9037x0M21618a.f21166d;
                            i23 = i5;
                            if (c9032w1.f21152d && c9032w1.f21153e) {
                                switch (AbstractC8928e.f21002a[c9032w1.f21151c.ordinal()]) {
                                    case 1:
                                        i9 = i52 == true ? 1 : 0;
                                        C8923d0 c8923d0 = new C8923d0();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i53 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i53) {
                                            c8923d0.m21529a(Double.longBitsToDouble(AbstractC8940g.m21553b(iM21556d, bArr)));
                                            iM21556d += 8;
                                        }
                                        if (iM21556d != i53) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8923d0);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 2:
                                        i9 = i52 == true ? 1 : 0;
                                        C9001q0 c9001q0 = new C9001q0();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i54 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i54) {
                                            c9001q0.m21706a(Float.intBitsToFloat(AbstractC8940g.m21542a(iM21556d, bArr)));
                                            iM21556d += 4;
                                        }
                                        if (iM21556d != i54) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c9001q0);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 3:
                                    case 4:
                                        i9 = i52 == true ? 1 : 0;
                                        C9023u1 c9023u1 = new C9023u1();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i55 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i55) {
                                            iM21556d = AbstractC8940g.m21557e(bArr, iM21556d, c8934f8);
                                            c9023u1.m21775a(c8934f8.f21013b);
                                        }
                                        if (iM21556d != i55) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c9023u1);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 5:
                                    case 6:
                                        i9 = i52 == true ? 1 : 0;
                                        C8906a1 c8906a1 = new C8906a1();
                                        iM21556d = AbstractC8940g.m21550a(bArr, iM21557e, c8906a1, c8934f8);
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8906a1);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                    case 7:
                                    case 8:
                                        i9 = i52 == true ? 1 : 0;
                                        C9023u1 c9023u2 = new C9023u1();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i56 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i56) {
                                            c9023u2.m21775a(AbstractC8940g.m21553b(iM21556d, bArr));
                                            iM21556d += 8;
                                        }
                                        if (iM21556d != i56) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c9023u2);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 9:
                                    case 10:
                                        i9 = i52 == true ? 1 : 0;
                                        C8906a1 c8906a2 = new C8906a1();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i57 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i57) {
                                            c8906a2.m21503c(AbstractC8940g.m21542a(iM21556d, bArr));
                                            iM21556d += 4;
                                        }
                                        if (iM21556d != i57) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8906a2);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 11:
                                        i9 = i52 == true ? 1 : 0;
                                        C8958j c8958j = new C8958j();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i58 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i58) {
                                            iM21556d = AbstractC8940g.m21557e(bArr, iM21556d, c8934f8);
                                            c8958j.m21656a(c8934f8.f21013b != 0 ? z : i6);
                                        }
                                        if (iM21556d != i58) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8958j);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 12:
                                        i9 = i52 == true ? 1 : 0;
                                        C8906a1 c8906a3 = new C8906a1();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i59 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i59) {
                                            int i60 = iM21556d + 1;
                                            int i61 = bArr[iM21556d];
                                            if (i61 >= 0) {
                                                c8934f8.f21012a = i61;
                                                iM21556d = i60;
                                            } else {
                                                iM21556d = AbstractC8940g.m21546a(i61, bArr, i60, c8934f8);
                                            }
                                            c8906a3.m21503c(AbstractC9031w.m21818b(c8934f8.f21012a));
                                        }
                                        if (iM21556d != i59) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8906a3);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 13:
                                        C9023u1 c9023u3 = new C9023u1();
                                        iM21556d = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                        int i62 = c8934f8.f21012a + iM21556d;
                                        while (iM21556d < i62) {
                                            iM21556d = AbstractC8940g.m21557e(bArr, iM21556d, c8934f8);
                                            c9023u3.m21775a(AbstractC9031w.m21817a(c8934f8.f21013b));
                                            i52 = i52 == true ? 1 : 0;
                                        }
                                        i9 = i52;
                                        if (iM21556d != i62) {
                                            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c9023u3);
                                        i23 = i23;
                                        i22 = iM21556d;
                                        break;
                                        break;
                                    case 14:
                                        C8906a1 c8906a4 = new C8906a1();
                                        int iM21550a = AbstractC8940g.m21550a(bArr, iM21557e, c8906a4, c8934f8);
                                        C8986n3 c8986n6 = generatedMessageLite$ExtendableMessage.unknownFields;
                                        if (c8986n6 == C8986n3.f21077f) {
                                            c8986n6 = null;
                                        }
                                        C8986n3 c8986n7 = (C8986n3) AbstractC9024u2.m21782a(i26, c8906a4, c9037x0M21618a.f21166d.f21149a, c8986n6, c8992o3);
                                        if (c8986n7 != null) {
                                            generatedMessageLite$ExtendableMessage.unknownFields = c8986n7;
                                        }
                                        c8983n0.m21681c(c9037x0M21618a.f21166d, c8906a4);
                                        i23 = i23;
                                        i8 = i52 == true ? 1 : 0;
                                        i22 = iM21550a;
                                        break;
                                    default:
                                        throw new IllegalStateException("Type cannot be packed: " + c9037x0M21618a.f21166d.f21151c);
                                }
                            } else {
                                i9 = i52 == true ? 1 : 0;
                                EnumC8963j4 enumC8963j4 = c9032w1.f21151c;
                                if (enumC8963j4 != EnumC8963j4.ENUM) {
                                    switch (AbstractC8928e.f21002a[enumC8963j4.ordinal()]) {
                                        case 1:
                                            objValueOf = Double.valueOf(Double.longBitsToDouble(AbstractC8940g.m21553b(iM21557e, bArr)));
                                            iM21557e += 8;
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17 || i10 == 18) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 2:
                                            objValueOf = Float.valueOf(Float.intBitsToFloat(AbstractC8940g.m21542a(iM21557e, bArr)));
                                            iM21557e += 4;
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 3:
                                        case 4:
                                            iM21557e = AbstractC8940g.m21557e(bArr, iM21557e, c8934f8);
                                            objValueOf = Long.valueOf(c8934f8.f21013b);
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 5:
                                        case 6:
                                            iM21557e = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                            objValueOf = Integer.valueOf(c8934f8.f21012a);
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 7:
                                        case 8:
                                            objValueOf = Long.valueOf(AbstractC8940g.m21553b(iM21557e, bArr));
                                            iM21557e += 8;
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 9:
                                        case 10:
                                            objValueOf = Integer.valueOf(AbstractC8940g.m21542a(iM21557e, bArr));
                                            iM21557e += 4;
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 11:
                                            iM21557e = AbstractC8940g.m21557e(bArr, iM21557e, c8934f8);
                                            objValueOf = Boolean.valueOf(c8934f8.f21013b != 0 ? z : i6);
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 12:
                                            iM21557e = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                            objValueOf = Integer.valueOf(AbstractC9031w.m21818b(c8934f8.f21012a));
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 13:
                                            iM21557e = AbstractC8940g.m21557e(bArr, iM21557e, c8934f8);
                                            objValueOf = Long.valueOf(AbstractC9031w.m21817a(c8934f8.f21013b));
                                            objM21664a = objValueOf;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 14:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 15:
                                            iM21557e = AbstractC8940g.m21549a(bArr, iM21557e, c8934f8);
                                            objM21664a = c8934f8.f21014c;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 16:
                                            iM21557e = AbstractC8940g.m21552b(bArr, iM21557e, c8934f8);
                                            objM21664a = c8934f8.f21014c;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 17:
                                            iM21557e = AbstractC8940g.m21547a(C8997p2.f21087c.m21698a(c9037x0M21618a.f21165c.getClass()), bArr, iM21557e, i20, (i26 << 3) | 4, c8934f8);
                                            objM21664a = c8934f8.f21014c;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                        case 18:
                                            iM21557e = AbstractC8940g.m21548a(C8997p2.f21087c.m21698a(c9037x0M21618a.f21165c.getClass()), bArr, iM21557e, i20, c8934f8);
                                            objM21664a = c8934f8.f21014c;
                                            c9032w0 = c9037x0M21618a.f21166d;
                                            if (c9032w0.f21152d) {
                                                c8983n0.m21679a(c9032w0, objM21664a);
                                            } else {
                                                i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                                if (i10 != 17) {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                } else {
                                                    obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                                    if (obj3 != null) {
                                                        objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                                    }
                                                }
                                                c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                            }
                                            i20 = i2;
                                            i22 = iM21557e;
                                            break;
                                    }
                                } else {
                                    iM21557e = AbstractC8940g.m21556d(bArr, iM21557e, c8934f8);
                                    if (c9037x0M21618a.f21166d.f21149a.mo20329a(c8934f8.f21012a) == null) {
                                        C8986n3 c8986n8 = generatedMessageLite$ExtendableMessage.unknownFields;
                                        if (c8986n8 == C8986n3.f21077f) {
                                            c8986n8 = new C8986n3();
                                            generatedMessageLite$ExtendableMessage.unknownFields = c8986n8;
                                        }
                                        AbstractC9024u2.m21781a(i26, c8934f8.f21012a, c8986n8, c8992o3);
                                    } else {
                                        objValueOf = Integer.valueOf(c8934f8.f21012a);
                                    }
                                    i22 = iM21557e;
                                }
                                objM21664a = objValueOf;
                                c9032w0 = c9037x0M21618a.f21166d;
                                if (c9032w0.f21152d) {
                                    c8983n0.m21679a(c9032w0, objM21664a);
                                } else {
                                    i10 = AbstractC8928e.f21002a[c9032w0.f21151c.ordinal()];
                                    if (i10 != 17) {
                                        obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                        if (obj3 != null) {
                                            objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                        }
                                    } else {
                                        obj3 = c8983n0.f21073a.get(c9037x0M21618a.f21166d);
                                        if (obj3 != null) {
                                            objM21664a = AbstractC8972l1.m21664a(obj3, objM21664a);
                                        }
                                    }
                                    c8983n0.m21681c(c9037x0M21618a.f21166d, objM21664a);
                                }
                                i20 = i2;
                                i22 = iM21557e;
                            }
                            i8 = i9;
                        }
                    }
                    i25 = i8;
                    c8955i4 = c8955i2;
                    obj4 = obj2;
                    unsafe5 = unsafe;
                    i21 = i6;
                    i27 = i4;
                    c8934f4 = c8934f;
                } else {
                    i20 = i2;
                    i22 = iM21557e;
                    i25 = i7;
                }
            } else {
                i4 = i27;
                unsafe = unsafe5;
                c8955i2 = c8955i4;
                obj2 = obj4;
            }
        }
        int i63 = i4;
        if (i63 != 1048575) {
            unsafe.putInt(obj2, i63, i24);
        }
        C8986n3 c8986n9 = null;
        for (int i64 = c8955i2.f21043j; i64 < c8955i2.f21044k; i64++) {
            c8986n9 = (C8986n3) c8955i2.m21645b(c8955i2.f21042i[i64], obj2, c8986n9);
        }
        if (c8986n9 != null) {
            c8955i2.f21047n.getClass();
            ((AbstractC9047z0) obj2).unknownFields = c8986n9;
        }
        if (i3 == 0) {
            if (i22 != i20) {
                throw new C8984n1("Failed to parse the message.");
            }
        } else if (i22 > i20 || i25 != i3) {
            throw new C8984n1("Failed to parse the message.");
        }
        return i22;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final Object mo21629a() {
        C8967k2 c8967k2 = this.f21045l;
        InterfaceC8925d2 interfaceC8925d2 = this.f21038e;
        c8967k2.getClass();
        return ((AbstractC9047z0) interfaceC8925d2).dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public final void m21630a(int i) {
        if (this.f21035b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20201. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m21631a(com.fyber.inneractive.sdk.protobuf.C8992o3 r17, com.fyber.inneractive.sdk.protobuf.C8959j0 r18, java.lang.Object r19, com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2 r20, com.fyber.inneractive.sdk.protobuf.C8947h0 r21) {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C8955i2.m21631a(com.fyber.inneractive.sdk.protobuf.o3, com.fyber.inneractive.sdk.protobuf.j0, java.lang.Object, com.fyber.inneractive.sdk.protobuf.s2, com.fyber.inneractive.sdk.protobuf.h0):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m21632a(Object obj, int i, InterfaceC9014s2 interfaceC9014s2) {
        if ((536870912 & i) != 0) {
            interfaceC9014s2.mo21572b(this.f21046m.mo21711b(obj, i & 1048575));
        } else {
            interfaceC9014s2.mo21608q(this.f21046m.mo21711b(obj, i & 1048575));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21633a(Object obj, int i, InterfaceC9014s2 interfaceC9014s2, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) {
        interfaceC9014s2.mo21573b(this.f21046m.mo21711b(obj, i & 1048575), interfaceC9019t2, c8947h0);
    }

    /* JADX INFO: renamed from: a */
    public final void m21634a(Object obj, long j, InterfaceC9014s2 interfaceC9014s2, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) {
        interfaceC9014s2.mo21566a(this.f21046m.mo21711b(obj, j), interfaceC9019t2, c8947h0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x030b  */
    /* JADX WARN: Code duplicated, block: B:101:0x031c  */
    /* JADX WARN: Code duplicated, block: B:102:0x032d  */
    /* JADX WARN: Code duplicated, block: B:103:0x033e  */
    /* JADX WARN: Code duplicated, block: B:104:0x034f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0360  */
    /* JADX WARN: Code duplicated, block: B:106:0x0371  */
    /* JADX WARN: Code duplicated, block: B:107:0x0382  */
    /* JADX WARN: Code duplicated, block: B:108:0x0393  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x040e  */
    /* JADX WARN: Code duplicated, block: B:116:0x041f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0430  */
    /* JADX WARN: Code duplicated, block: B:118:0x0441  */
    /* JADX WARN: Code duplicated, block: B:119:0x0452  */
    /* JADX WARN: Code duplicated, block: B:120:0x0463  */
    /* JADX WARN: Code duplicated, block: B:121:0x0474  */
    /* JADX WARN: Code duplicated, block: B:122:0x0485  */
    /* JADX WARN: Code duplicated, block: B:123:0x0496  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x04de  */
    /* JADX WARN: Code duplicated, block: B:135:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x0504  */
    /* JADX WARN: Code duplicated, block: B:141:0x050a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0517  */
    /* JADX WARN: Code duplicated, block: B:144:0x051d  */
    /* JADX WARN: Code duplicated, block: B:145:0x052a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0530  */
    /* JADX WARN: Code duplicated, block: B:148:0x053f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0545  */
    /* JADX WARN: Code duplicated, block: B:151:0x0558  */
    /* JADX WARN: Code duplicated, block: B:153:0x055e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0569  */
    /* JADX WARN: Code duplicated, block: B:156:0x056f  */
    /* JADX WARN: Code duplicated, block: B:157:0x057e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0584  */
    /* JADX WARN: Code duplicated, block: B:160:0x0590  */
    /* JADX WARN: Code duplicated, block: B:162:0x0596  */
    /* JADX WARN: Code duplicated, block: B:163:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:171:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x05de  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:177:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:194:0x0643  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:216:0x06af  */
    /* JADX WARN: Code duplicated, block: B:217:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:219:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:220:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:223:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:225:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:226:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:228:0x0703  */
    /* JADX WARN: Code duplicated, block: B:229:0x0714  */
    /* JADX WARN: Code duplicated, block: B:231:0x071a  */
    /* JADX WARN: Code duplicated, block: B:232:0x072b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0731  */
    /* JADX WARN: Code duplicated, block: B:235:0x0742  */
    /* JADX WARN: Code duplicated, block: B:237:0x0748  */
    /* JADX WARN: Code duplicated, block: B:238:0x0755  */
    /* JADX WARN: Code duplicated, block: B:240:0x075b  */
    /* JADX WARN: Code duplicated, block: B:241:0x076c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0772  */
    /* JADX WARN: Code duplicated, block: B:244:0x077b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0781  */
    /* JADX WARN: Code duplicated, block: B:247:0x0792  */
    /* JADX WARN: Code duplicated, block: B:249:0x0798  */
    /* JADX WARN: Code duplicated, block: B:250:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:252:0x07af  */
    /* JADX WARN: Code duplicated, block: B:253:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:255:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:256:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:258:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:259:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:261:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:262:0x0805  */
    /* JADX WARN: Code duplicated, block: B:264:0x080b  */
    /* JADX WARN: Code duplicated, block: B:265:0x081a  */
    /* JADX WARN: Code duplicated, block: B:267:0x0820  */
    /* JADX WARN: Code duplicated, block: B:268:0x082f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0849  */
    /* JADX WARN: Code duplicated, block: B:274:0x085c  */
    /* JADX WARN: Code duplicated, block: B:275:0x086b  */
    /* JADX WARN: Code duplicated, block: B:276:0x087a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0889  */
    /* JADX WARN: Code duplicated, block: B:278:0x0898  */
    /* JADX WARN: Code duplicated, block: B:279:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:280:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:281:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:282:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:283:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:284:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:285:0x0901  */
    /* JADX WARN: Code duplicated, block: B:286:0x0910  */
    /* JADX WARN: Code duplicated, block: B:287:0x091f  */
    /* JADX WARN: Code duplicated, block: B:288:0x092e  */
    /* JADX WARN: Code duplicated, block: B:289:0x093e  */
    /* JADX WARN: Code duplicated, block: B:290:0x094e  */
    /* JADX WARN: Code duplicated, block: B:291:0x095e  */
    /* JADX WARN: Code duplicated, block: B:292:0x096e  */
    /* JADX WARN: Code duplicated, block: B:293:0x097e  */
    /* JADX WARN: Code duplicated, block: B:294:0x098e  */
    /* JADX WARN: Code duplicated, block: B:295:0x099c  */
    /* JADX WARN: Code duplicated, block: B:296:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:298:0x09be  */
    /* JADX WARN: Code duplicated, block: B:299:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:300:0x09de  */
    /* JADX WARN: Code duplicated, block: B:301:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:302:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:303:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:312:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:315:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:318:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:321:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:323:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:324:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:330:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:332:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:333:0x0ad4  */
    /* JADX WARN: Code duplicated, block: B:335:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:336:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:338:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:339:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:341:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:342:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:344:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:345:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:347:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:348:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:351:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:354:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:356:0x0b43  */
    /* JADX WARN: Code duplicated, block: B:357:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:369:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:371:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:391:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:401:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:439:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:451:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:461:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x05fb A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:489:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:507:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:511:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:541:0x0b5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x017a  */
    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x0234  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:84:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262  */
    /* JADX WARN: Code duplicated, block: B:92:0x027f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0294  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fa  */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21635a(Object obj, C8917c0 c8917c0) {
        Iterator itM21684d;
        Map.Entry entry;
        int i;
        int i2;
        long j;
        int i3;
        Map.Entry entry2;
        Iterator c9034w2;
        c8917c0.getClass();
        int i4 = 267386880;
        int i5 = 0;
        int i6 = 1048575;
        if (EnumC9005q4.ASCENDING == EnumC9005q4.DESCENDING) {
            this.f21047n.getClass();
            ((AbstractC9047z0) obj).unknownFields.m21689a(c8917c0);
            if (this.f21039f) {
                this.f21048o.getClass();
                C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (c8983n0.f21073a.isEmpty()) {
                    entry2 = null;
                    c9034w2 = null;
                } else {
                    if (c8983n0.f21075c) {
                        AbstractC8932e3 abstractC8932e3 = c8983n0.f21073a;
                        if (abstractC8932e3.f21010g == null) {
                            abstractC8932e3.f21010g = new C9039x2(abstractC8932e3);
                        }
                        c9034w2 = new C8990o1(new C9034w2(abstractC8932e3.f21010g.f21169b));
                    } else {
                        AbstractC8932e3 abstractC8932e4 = c8983n0.f21073a;
                        if (abstractC8932e4.f21010g == null) {
                            abstractC8932e4.f21010g = new C9039x2(abstractC8932e4);
                        }
                        c9034w2 = new C9034w2(abstractC8932e4.f21010g.f21169b);
                    }
                    entry2 = (Map.Entry) c9034w2.next();
                }
            } else {
                entry2 = null;
                c9034w2 = null;
            }
            for (int length = this.f21034a.length - 3; length >= 0; length -= 3) {
                int[] iArr = this.f21034a;
                int i7 = iArr[length + 1];
                int i8 = iArr[length];
                while (entry2 != null) {
                    this.f21048o.getClass();
                    if (((C9032w0) entry2.getKey()).f21150b > i8) {
                        this.f21048o.getClass();
                        C8959j0.m21659a(c8917c0, entry2);
                        entry2 = c9034w2.hasNext() ? (Map.Entry) c9034w2.next() : null;
                    } else {
                        switch ((i7 & 267386880) >>> 20) {
                            case 0:
                                if (m21639a(length, obj)) {
                                    c8917c0.m21522a(i8, AbstractC9040x3.f21172c.mo21763c(obj, i7 & 1048575));
                                }
                                break;
                            case 1:
                                if (m21639a(length, obj)) {
                                    c8917c0.m21523a(i8, AbstractC9040x3.f21172c.mo21764d(obj, i7 & 1048575));
                                }
                                break;
                            case 2:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21484b(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                                }
                                break;
                            case 3:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21484b(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                                }
                                break;
                            case 4:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21483b(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 5:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21475a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                                }
                                break;
                            case 6:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21474a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 7:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21479a(i8, AbstractC9040x3.f21172c.mo21760a(obj, i7 & 1048575));
                                }
                                break;
                            case 8:
                                if (m21639a(length, obj)) {
                                    m21623a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                                }
                                break;
                            case 9:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21477a(i8, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                                }
                                break;
                            case 10:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21478a(i8, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i7 & 1048575));
                                }
                                break;
                            case 11:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21491d(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 12:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21483b(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 13:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21474a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 14:
                                if (m21639a(length, obj)) {
                                    c8917c0.f20990a.mo21475a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                                }
                                break;
                            case 15:
                                if (m21639a(length, obj)) {
                                    c8917c0.m21524a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                                }
                                break;
                            case 16:
                                if (m21639a(length, obj)) {
                                    c8917c0.m21525a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                                }
                                break;
                            case 17:
                                if (m21639a(length, obj)) {
                                    c8917c0.m21526a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                                }
                                break;
                            case 18:
                                AbstractC9024u2.m21792b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 19:
                                AbstractC9024u2.m21801f(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 20:
                                AbstractC9024u2.m21804h(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 21:
                                AbstractC9024u2.m21810n(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 22:
                                AbstractC9024u2.m21803g(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 23:
                                AbstractC9024u2.m21799e(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 24:
                                AbstractC9024u2.m21797d(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 25:
                                AbstractC9024u2.m21786a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 26:
                                AbstractC9024u2.m21790b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                                break;
                            case 27:
                                AbstractC9024u2.m21791b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, m21650c(length));
                                break;
                            case 28:
                                AbstractC9024u2.m21784a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                                break;
                            case 29:
                                AbstractC9024u2.m21809m(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 30:
                                AbstractC9024u2.m21795c(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 31:
                                AbstractC9024u2.m21805i(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 32:
                                AbstractC9024u2.m21806j(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 33:
                                AbstractC9024u2.m21807k(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 34:
                                AbstractC9024u2.m21808l(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                                break;
                            case 35:
                                AbstractC9024u2.m21792b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 36:
                                AbstractC9024u2.m21801f(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 37:
                                AbstractC9024u2.m21804h(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 38:
                                AbstractC9024u2.m21810n(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 39:
                                AbstractC9024u2.m21803g(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 40:
                                AbstractC9024u2.m21799e(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 41:
                                AbstractC9024u2.m21797d(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 42:
                                AbstractC9024u2.m21786a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 43:
                                AbstractC9024u2.m21809m(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 44:
                                AbstractC9024u2.m21795c(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 45:
                                AbstractC9024u2.m21805i(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 46:
                                AbstractC9024u2.m21806j(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 47:
                                AbstractC9024u2.m21807k(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 48:
                                AbstractC9024u2.m21808l(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                                break;
                            case 49:
                                AbstractC9024u2.m21785a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, m21650c(length));
                                break;
                            case 50:
                                if (AbstractC9040x3.m21839e(obj, i7 & 1048575) == null) {
                                    C9048z1 c9048z1 = this.f21049p;
                                    Object objM21644b = m21644b(length);
                                    c9048z1.getClass();
                                    objM21644b.getClass();
                                    throw new ClassCastException();
                                }
                                break;
                                break;
                            case 51:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.m21522a(i8, ((Double) AbstractC9040x3.m21839e(obj, i7 & 1048575)).doubleValue());
                                }
                                break;
                            case 52:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.m21523a(i8, ((Float) AbstractC9040x3.m21839e(obj, i7 & 1048575)).floatValue());
                                }
                                break;
                            case 53:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21484b(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                                }
                                break;
                            case 54:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21484b(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                                }
                                break;
                            case 55:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21483b(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 56:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21475a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                                }
                                break;
                            case 57:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21474a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 58:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21479a(i8, ((Boolean) AbstractC9040x3.m21839e(obj, i7 & 1048575)).booleanValue());
                                }
                                break;
                            case 59:
                                if (m21642a(obj, i8, length)) {
                                    m21623a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                                }
                                break;
                            case 60:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21477a(i8, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                                }
                                break;
                            case 61:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21478a(i8, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i7 & 1048575));
                                }
                                break;
                            case 62:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21491d(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 63:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21483b(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 64:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21474a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 65:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.f20990a.mo21475a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                                }
                                break;
                            case 66:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.m21524a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                                }
                                break;
                            case 67:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.m21525a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                                }
                                break;
                            case 68:
                                if (m21642a(obj, i8, length)) {
                                    c8917c0.m21526a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                                }
                                break;
                        }
                    }
                }
                switch ((i7 & 267386880) >>> 20) {
                    case 0:
                        if (m21639a(length, obj)) {
                            c8917c0.m21522a(i8, AbstractC9040x3.f21172c.mo21763c(obj, i7 & 1048575));
                        }
                        break;
                    case 1:
                        if (m21639a(length, obj)) {
                            c8917c0.m21523a(i8, AbstractC9040x3.f21172c.mo21764d(obj, i7 & 1048575));
                        }
                        break;
                    case 2:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21484b(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                        }
                        break;
                    case 3:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21484b(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                        }
                        break;
                    case 4:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21483b(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 5:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21475a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                        }
                        break;
                    case 6:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21474a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 7:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21479a(i8, AbstractC9040x3.f21172c.mo21760a(obj, i7 & 1048575));
                        }
                        break;
                    case 8:
                        if (m21639a(length, obj)) {
                            m21623a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                        }
                        break;
                    case 9:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21477a(i8, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                        }
                        break;
                    case 10:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21478a(i8, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i7 & 1048575));
                        }
                        break;
                    case 11:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21491d(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 12:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21483b(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 13:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21474a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 14:
                        if (m21639a(length, obj)) {
                            c8917c0.f20990a.mo21475a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                        }
                        break;
                    case 15:
                        if (m21639a(length, obj)) {
                            c8917c0.m21524a(i8, AbstractC9040x3.m21836c(obj, i7 & 1048575));
                        }
                        break;
                    case 16:
                        if (m21639a(length, obj)) {
                            c8917c0.m21525a(i8, AbstractC9040x3.m21838d(obj, i7 & 1048575));
                        }
                        break;
                    case 17:
                        if (m21639a(length, obj)) {
                            c8917c0.m21526a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                        }
                        break;
                    case 18:
                        AbstractC9024u2.m21792b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 19:
                        AbstractC9024u2.m21801f(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 20:
                        AbstractC9024u2.m21804h(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 21:
                        AbstractC9024u2.m21810n(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 22:
                        AbstractC9024u2.m21803g(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 23:
                        AbstractC9024u2.m21799e(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 24:
                        AbstractC9024u2.m21797d(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 25:
                        AbstractC9024u2.m21786a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 26:
                        AbstractC9024u2.m21790b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                        break;
                    case 27:
                        AbstractC9024u2.m21791b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, m21650c(length));
                        break;
                    case 28:
                        AbstractC9024u2.m21784a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                        break;
                    case 29:
                        AbstractC9024u2.m21809m(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 30:
                        AbstractC9024u2.m21795c(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 31:
                        AbstractC9024u2.m21805i(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 32:
                        AbstractC9024u2.m21806j(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 33:
                        AbstractC9024u2.m21807k(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 34:
                        AbstractC9024u2.m21808l(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, false);
                        break;
                    case 35:
                        AbstractC9024u2.m21792b(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 36:
                        AbstractC9024u2.m21801f(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 37:
                        AbstractC9024u2.m21804h(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 38:
                        AbstractC9024u2.m21810n(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 39:
                        AbstractC9024u2.m21803g(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 40:
                        AbstractC9024u2.m21799e(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 41:
                        AbstractC9024u2.m21797d(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 42:
                        AbstractC9024u2.m21786a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 43:
                        AbstractC9024u2.m21809m(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 44:
                        AbstractC9024u2.m21795c(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 45:
                        AbstractC9024u2.m21805i(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 46:
                        AbstractC9024u2.m21806j(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 47:
                        AbstractC9024u2.m21807k(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 48:
                        AbstractC9024u2.m21808l(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, true);
                        break;
                    case 49:
                        AbstractC9024u2.m21785a(this.f21034a[length], (List) AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0, m21650c(length));
                        break;
                    case 50:
                        if (AbstractC9040x3.m21839e(obj, i7 & 1048575) == null) {
                            C9048z1 c9048z2 = this.f21049p;
                            Object objM21644b2 = m21644b(length);
                            c9048z2.getClass();
                            objM21644b2.getClass();
                            throw new ClassCastException();
                        }
                        break;
                        break;
                    case 51:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.m21522a(i8, ((Double) AbstractC9040x3.m21839e(obj, i7 & 1048575)).doubleValue());
                        }
                        break;
                    case 52:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.m21523a(i8, ((Float) AbstractC9040x3.m21839e(obj, i7 & 1048575)).floatValue());
                        }
                        break;
                    case 53:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21484b(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                        }
                        break;
                    case 54:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21484b(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                        }
                        break;
                    case 55:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21483b(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 56:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21475a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                        }
                        break;
                    case 57:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21474a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 58:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21479a(i8, ((Boolean) AbstractC9040x3.m21839e(obj, i7 & 1048575)).booleanValue());
                        }
                        break;
                    case 59:
                        if (m21642a(obj, i8, length)) {
                            m21623a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), c8917c0);
                        }
                        break;
                    case 60:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21477a(i8, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                        }
                        break;
                    case 61:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21478a(i8, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i7 & 1048575));
                        }
                        break;
                    case 62:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21491d(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 63:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21483b(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 64:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21474a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 65:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.f20990a.mo21475a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                        }
                        break;
                    case 66:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.m21524a(i8, ((Integer) AbstractC9040x3.m21839e(obj, i7 & 1048575)).intValue());
                        }
                        break;
                    case 67:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.m21525a(i8, ((Long) AbstractC9040x3.m21839e(obj, i7 & 1048575)).longValue());
                        }
                        break;
                    case 68:
                        if (m21642a(obj, i8, length)) {
                            c8917c0.m21526a(i8, AbstractC9040x3.m21839e(obj, i7 & 1048575), m21650c(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f21048o.getClass();
                C8959j0.m21659a(c8917c0, entry2);
                entry2 = c9034w2.hasNext() ? (Map.Entry) c9034w2.next() : null;
            }
            return;
        }
        if (this.f21041h) {
            m21648b(obj, c8917c0);
            return;
        }
        if (this.f21039f) {
            this.f21048o.getClass();
            C8983n0 c8983n1 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (c8983n1.f21073a.isEmpty()) {
                itM21684d = null;
                entry = null;
            } else {
                itM21684d = c8983n1.m21684d();
                entry = (Map.Entry) itM21684d.next();
            }
        } else {
            itM21684d = null;
            entry = null;
        }
        int length2 = this.f21034a.length;
        Unsafe unsafe = f21033r;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length2) {
            int[] iArr2 = this.f21034a;
            int i12 = iArr2[i9 + 1];
            int i13 = i4;
            int i14 = iArr2[i9];
            int i15 = (i12 & i13) >>> 20;
            int i16 = i6;
            if (i15 <= 17) {
                int i17 = iArr2[i9 + 2];
                int i18 = i17 & i16;
                if (i18 != i11) {
                    i10 = unsafe.getInt(obj, i18);
                    i11 = i18;
                }
                i = 1 << (i17 >>> 20);
            } else {
                i = i5;
            }
            while (entry != null) {
                this.f21048o.getClass();
                if (((C9032w0) entry.getKey()).f21150b <= i14) {
                    this.f21048o.getClass();
                    C8959j0.m21659a(c8917c0, entry);
                    entry = itM21684d.hasNext() ? (Map.Entry) itM21684d.next() : null;
                } else {
                    i2 = i;
                    j = i12 & i16;
                    switch (i15) {
                        case 0:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.m21522a(i14, AbstractC9040x3.f21172c.mo21763c(obj, j));
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 1:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.m21523a(i14, AbstractC9040x3.f21172c.mo21764d(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 2:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21484b(i14, unsafe.getLong(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 3:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21484b(i14, unsafe.getLong(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 4:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21483b(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 5:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21475a(i14, unsafe.getLong(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 6:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21474a(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 7:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21479a(i14, AbstractC9040x3.f21172c.mo21760a(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 8:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                m21623a(i14, unsafe.getObject(obj, j), c8917c0);
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 9:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21477a(i14, (InterfaceC8925d2) unsafe.getObject(obj, j), m21650c(i9));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 10:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21478a(i14, (AbstractC9011s) unsafe.getObject(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 11:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21491d(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 12:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21483b(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 13:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21474a(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 14:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.f20990a.mo21475a(i14, unsafe.getLong(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 15:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.m21524a(i14, unsafe.getInt(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 16:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.m21525a(i14, unsafe.getLong(obj, j));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 17:
                            i3 = 0;
                            if ((i10 & i2) != 0) {
                                c8917c0.m21526a(i14, unsafe.getObject(obj, j), m21650c(i9));
                            } else {
                                continue;
                                continue;
                            }
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 18:
                            i3 = 0;
                            AbstractC9024u2.m21792b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 19:
                            i3 = 0;
                            AbstractC9024u2.m21801f(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 20:
                            i3 = 0;
                            AbstractC9024u2.m21804h(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 21:
                            i3 = 0;
                            AbstractC9024u2.m21810n(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 22:
                            i3 = 0;
                            AbstractC9024u2.m21803g(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 23:
                            i3 = 0;
                            AbstractC9024u2.m21799e(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 24:
                            i3 = 0;
                            AbstractC9024u2.m21797d(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 25:
                            i3 = 0;
                            AbstractC9024u2.m21786a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 26:
                            AbstractC9024u2.m21790b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0);
                            break;
                        case 27:
                            AbstractC9024u2.m21791b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, m21650c(i9));
                            break;
                        case 28:
                            AbstractC9024u2.m21784a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0);
                            break;
                        case 29:
                            i3 = 0;
                            AbstractC9024u2.m21809m(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 30:
                            i3 = 0;
                            AbstractC9024u2.m21795c(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 31:
                            i3 = 0;
                            AbstractC9024u2.m21805i(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 32:
                            i3 = 0;
                            AbstractC9024u2.m21806j(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 33:
                            i3 = 0;
                            AbstractC9024u2.m21807k(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 34:
                            i3 = 0;
                            AbstractC9024u2.m21808l(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                            continue;
                            continue;
                            i9 += 3;
                            i5 = i3;
                            i4 = i13;
                            i6 = i16;
                            break;
                        case 35:
                            AbstractC9024u2.m21792b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 36:
                            AbstractC9024u2.m21801f(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 37:
                            AbstractC9024u2.m21804h(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 38:
                            AbstractC9024u2.m21810n(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 39:
                            AbstractC9024u2.m21803g(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 40:
                            AbstractC9024u2.m21799e(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 41:
                            AbstractC9024u2.m21797d(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 42:
                            AbstractC9024u2.m21786a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 43:
                            AbstractC9024u2.m21809m(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 44:
                            AbstractC9024u2.m21795c(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 45:
                            AbstractC9024u2.m21805i(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 46:
                            AbstractC9024u2.m21806j(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 47:
                            AbstractC9024u2.m21807k(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 48:
                            AbstractC9024u2.m21808l(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                            break;
                        case 49:
                            AbstractC9024u2.m21785a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, m21650c(i9));
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                C9048z1 c9048z3 = this.f21049p;
                                Object objM21644b3 = m21644b(i9);
                                c9048z3.getClass();
                                objM21644b3.getClass();
                                throw new ClassCastException();
                            }
                            break;
                        case 51:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.m21522a(i14, ((Double) AbstractC9040x3.m21839e(obj, j)).doubleValue());
                            }
                            break;
                        case 52:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.m21523a(i14, ((Float) AbstractC9040x3.m21839e(obj, j)).floatValue());
                            }
                            break;
                        case 53:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21484b(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                            }
                            break;
                        case 54:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21484b(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                            }
                            break;
                        case 55:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21483b(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 56:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21475a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                            }
                            break;
                        case 57:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21474a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 58:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21479a(i14, ((Boolean) AbstractC9040x3.m21839e(obj, j)).booleanValue());
                            }
                            break;
                        case 59:
                            if (m21642a(obj, i14, i9)) {
                                m21623a(i14, unsafe.getObject(obj, j), c8917c0);
                            }
                            break;
                        case 60:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21477a(i14, (InterfaceC8925d2) unsafe.getObject(obj, j), m21650c(i9));
                            }
                            break;
                        case 61:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21478a(i14, (AbstractC9011s) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21491d(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 63:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21483b(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 64:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21474a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 65:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.f20990a.mo21475a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                            }
                            break;
                        case 66:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.m21524a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                            }
                            break;
                        case 67:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.m21525a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                            }
                            break;
                        case 68:
                            if (m21642a(obj, i14, i9)) {
                                c8917c0.m21526a(i14, unsafe.getObject(obj, j), m21650c(i9));
                            }
                            break;
                    }
                    i3 = 0;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                }
            }
            i2 = i;
            j = i12 & i16;
            switch (i15) {
                case 0:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.m21522a(i14, AbstractC9040x3.f21172c.mo21763c(obj, j));
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 1:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.m21523a(i14, AbstractC9040x3.f21172c.mo21764d(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 2:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21484b(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 3:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21484b(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 4:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21483b(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 5:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21475a(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 6:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21474a(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 7:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21479a(i14, AbstractC9040x3.f21172c.mo21760a(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 8:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        m21623a(i14, unsafe.getObject(obj, j), c8917c0);
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 9:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21477a(i14, (InterfaceC8925d2) unsafe.getObject(obj, j), m21650c(i9));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 10:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21478a(i14, (AbstractC9011s) unsafe.getObject(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 11:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21491d(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 12:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21483b(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 13:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21474a(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 14:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.f20990a.mo21475a(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 15:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.m21524a(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 16:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.m21525a(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 17:
                    i3 = 0;
                    if ((i10 & i2) != 0) {
                        c8917c0.m21526a(i14, unsafe.getObject(obj, j), m21650c(i9));
                    } else {
                        continue;
                        continue;
                    }
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 18:
                    i3 = 0;
                    AbstractC9024u2.m21792b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 19:
                    i3 = 0;
                    AbstractC9024u2.m21801f(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 20:
                    i3 = 0;
                    AbstractC9024u2.m21804h(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 21:
                    i3 = 0;
                    AbstractC9024u2.m21810n(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 22:
                    i3 = 0;
                    AbstractC9024u2.m21803g(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 23:
                    i3 = 0;
                    AbstractC9024u2.m21799e(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 24:
                    i3 = 0;
                    AbstractC9024u2.m21797d(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 25:
                    i3 = 0;
                    AbstractC9024u2.m21786a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 26:
                    AbstractC9024u2.m21790b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0);
                    break;
                case 27:
                    AbstractC9024u2.m21791b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, m21650c(i9));
                    break;
                case 28:
                    AbstractC9024u2.m21784a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0);
                    break;
                case 29:
                    i3 = 0;
                    AbstractC9024u2.m21809m(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 30:
                    i3 = 0;
                    AbstractC9024u2.m21795c(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 31:
                    i3 = 0;
                    AbstractC9024u2.m21805i(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 32:
                    i3 = 0;
                    AbstractC9024u2.m21806j(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 33:
                    i3 = 0;
                    AbstractC9024u2.m21807k(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 34:
                    i3 = 0;
                    AbstractC9024u2.m21808l(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, false);
                    continue;
                    continue;
                    i9 += 3;
                    i5 = i3;
                    i4 = i13;
                    i6 = i16;
                    break;
                case 35:
                    AbstractC9024u2.m21792b(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 36:
                    AbstractC9024u2.m21801f(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 37:
                    AbstractC9024u2.m21804h(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 38:
                    AbstractC9024u2.m21810n(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 39:
                    AbstractC9024u2.m21803g(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 40:
                    AbstractC9024u2.m21799e(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 41:
                    AbstractC9024u2.m21797d(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 42:
                    AbstractC9024u2.m21786a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 43:
                    AbstractC9024u2.m21809m(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 44:
                    AbstractC9024u2.m21795c(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 45:
                    AbstractC9024u2.m21805i(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 46:
                    AbstractC9024u2.m21806j(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 47:
                    AbstractC9024u2.m21807k(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 48:
                    AbstractC9024u2.m21808l(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, true);
                    break;
                case 49:
                    AbstractC9024u2.m21785a(this.f21034a[i9], (List) unsafe.getObject(obj, j), c8917c0, m21650c(i9));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        C9048z1 c9048z4 = this.f21049p;
                        Object objM21644b4 = m21644b(i9);
                        c9048z4.getClass();
                        objM21644b4.getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.m21522a(i14, ((Double) AbstractC9040x3.m21839e(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.m21523a(i14, ((Float) AbstractC9040x3.m21839e(obj, j)).floatValue());
                    }
                    break;
                case 53:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21484b(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                    }
                    break;
                case 54:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21484b(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                    }
                    break;
                case 55:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21483b(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 56:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21475a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                    }
                    break;
                case 57:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21474a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 58:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21479a(i14, ((Boolean) AbstractC9040x3.m21839e(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (m21642a(obj, i14, i9)) {
                        m21623a(i14, unsafe.getObject(obj, j), c8917c0);
                    }
                    break;
                case 60:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21477a(i14, (InterfaceC8925d2) unsafe.getObject(obj, j), m21650c(i9));
                    }
                    break;
                case 61:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21478a(i14, (AbstractC9011s) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21491d(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 63:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21483b(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 64:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21474a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 65:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.f20990a.mo21475a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                    }
                    break;
                case 66:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.m21524a(i14, ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue());
                    }
                    break;
                case 67:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.m21525a(i14, ((Long) AbstractC9040x3.m21839e(obj, j)).longValue());
                    }
                    break;
                case 68:
                    if (m21642a(obj, i14, i9)) {
                        c8917c0.m21526a(i14, unsafe.getObject(obj, j), m21650c(i9));
                    }
                    break;
            }
            i3 = 0;
            i9 += 3;
            i5 = i3;
            i4 = i13;
            i6 = i16;
        }
        while (entry != null) {
            this.f21048o.getClass();
            C8959j0.m21659a(c8917c0, entry);
            entry = itM21684d.hasNext() ? (Map.Entry) itM21684d.next() : null;
        }
        this.f21047n.getClass();
        ((AbstractC9047z0) obj).unknownFields.m21689a(c8917c0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21636a(Object obj, InterfaceC9014s2 interfaceC9014s2, C8947h0 c8947h0) {
        c8947h0.getClass();
        m21631a(this.f21047n, this.f21048o, obj, interfaceC9014s2, c8947h0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21637a(Object obj, Object obj2) {
        Object obj3;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f21034a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                C8992o3 c8992o3 = this.f21047n;
                Class cls = AbstractC9024u2.f21133a;
                c8992o3.getClass();
                AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj4;
                C8986n3 c8986n3M21686a = abstractC9047z0.unknownFields;
                C8986n3 c8986n3 = ((AbstractC9047z0) obj2).unknownFields;
                if (!c8986n3.equals(C8986n3.f21077f)) {
                    c8986n3M21686a = C8986n3.m21686a(c8986n3M21686a, c8986n3);
                }
                abstractC9047z0.unknownFields = c8986n3M21686a;
                if (this.f21039f) {
                    this.f21048o.getClass();
                    C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (c8983n0.f21073a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj4).ensureExtensionsAreMutable().m21678a(c8983n0);
                    return;
                }
                return;
            }
            int i2 = iArr[i + 1];
            long j = 1048575 & i2;
            int i3 = iArr[i];
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (!m21639a(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
                        obj3 = obj;
                        abstractC9035w3.mo21757a(obj3, j, abstractC9035w3.mo21763c(obj2, j));
                        m21646b(i, obj3);
                    }
                    break;
                case 1:
                    if (m21639a(i, obj2)) {
                        AbstractC9035w3 abstractC9035w4 = AbstractC9040x3.f21172c;
                        abstractC9035w4.mo21758a(obj, j, abstractC9035w4.mo21764d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21831a(obj, j, AbstractC9040x3.m21838d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21831a(obj, j, AbstractC9040x3.m21838d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21831a(obj, j, AbstractC9040x3.m21838d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m21639a(i, obj2)) {
                        AbstractC9035w3 abstractC9035w5 = AbstractC9040x3.f21172c;
                        abstractC9035w5.mo21759a(obj, j, abstractC9035w5.mo21760a(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21828a(j, obj, AbstractC9040x3.m21839e(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m21654d(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21828a(j, obj, AbstractC9040x3.m21839e(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21831a(obj, j, AbstractC9040x3.m21838d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21830a(obj, j, AbstractC9040x3.m21836c(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m21639a(i, obj2)) {
                        AbstractC9040x3.m21831a(obj, j, AbstractC9040x3.m21838d(obj2, j));
                        m21646b(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m21654d(i, obj, obj2);
                    obj3 = obj;
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
                    this.f21046m.mo21709a(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    C9048z1 c9048z1 = this.f21049p;
                    Class cls2 = AbstractC9024u2.f21133a;
                    Object objM21839e = AbstractC9040x3.m21839e(obj, j);
                    Object objM21839e2 = AbstractC9040x3.m21839e(obj2, j);
                    c9048z1.getClass();
                    AbstractC9040x3.m21828a(j, obj, C9048z1.m21850a(objM21839e, objM21839e2));
                    obj3 = obj;
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
                    if (m21642a(obj2, i3, i)) {
                        AbstractC9040x3.m21828a(j, obj, AbstractC9040x3.m21839e(obj2, j));
                        m21647b(obj, i3, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m21655e(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m21642a(obj2, i3, i)) {
                        AbstractC9040x3.m21828a(j, obj, AbstractC9040x3.m21839e(obj2, j));
                        m21647b(obj, i3, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m21655e(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x009e. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21638a(Object obj, byte[] bArr, int i, int i2, C8934f c8934f) throws C8984n1 {
        int iM21625a;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        Object obj2;
        int i8;
        int i9;
        int i10;
        int iM21557e;
        int i11;
        int i12;
        this = this;
        Object obj3 = obj;
        bArr = bArr;
        int i13 = i2;
        c8934f = c8934f;
        if (!this.f21041h) {
            m21628a(obj3, bArr, i, i13, 0, c8934f);
            return;
        }
        Unsafe unsafe3 = f21033r;
        int i14 = -1;
        int i15 = 0;
        int iM21545a = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (iM21545a < i13) {
            int iM21546a = iM21545a + 1;
            int i20 = bArr[iM21545a];
            if (i20 < 0) {
                iM21546a = AbstractC8940g.m21546a(i20, bArr, iM21546a, c8934f);
                i20 = c8934f.f21012a;
            }
            int i21 = (i20 == true ? 1 : 0) >>> 3;
            int i22 = (i20 == true ? 1 : 0) & 7;
            if (i21 > i16) {
                int i23 = i18 / 3;
                if (i21 < this.f21036c || i21 > this.f21037d) {
                    i18 = i14;
                } else {
                    iM21625a = this.m21625a(i21, i23);
                    i18 = iM21625a;
                }
            } else if (i21 < this.f21036c || i21 > this.f21037d) {
                i18 = i14;
            } else {
                iM21625a = this.m21625a(i21, i15);
                i18 = iM21625a;
            }
            if (i18 == i14) {
                unsafe2 = unsafe3;
                obj2 = obj3;
                i20 = i20 == true ? 1 : 0;
                i3 = i19;
                i9 = iM21546a;
                i4 = i21;
                i18 = i15;
                i7 = i17;
            } else {
                int[] iArr = this.f21034a;
                int i24 = iArr[i18 + 1];
                int i25 = (i24 & 267386880) >>> 20;
                long j = i24 & 1048575;
                if (i25 <= 17) {
                    int i26 = iArr[i18 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    int i29 = 1048575;
                    if (i28 != i19) {
                        if (i19 != 1048575) {
                            unsafe3.putInt(obj3, i19, i17);
                            i29 = 1048575;
                        }
                        if (i28 != i29) {
                            i17 = unsafe3.getInt(obj3, i28);
                        }
                        i10 = i28;
                    } else {
                        i10 = i19;
                    }
                    int i30 = i17;
                    switch (i25) {
                        case 0:
                            i2 = i2;
                            unsafe2 = unsafe3;
                            if (i22 == 1) {
                                AbstractC9040x3.f21172c.mo21757a(obj3, j, Double.longBitsToDouble(AbstractC8940g.m21553b(iM21546a, bArr)));
                                iM21557e = iM21546a + 8;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 1:
                            i2 = i2;
                            unsafe2 = unsafe3;
                            if (i22 == 5) {
                                AbstractC9040x3.f21172c.mo21758a(obj3, j, Float.intBitsToFloat(AbstractC8940g.m21542a(iM21546a, bArr)));
                                iM21557e = iM21546a + 4;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 2:
                        case 3:
                            if (i22 == 0) {
                                iM21557e = AbstractC8940g.m21557e(bArr, iM21546a, c8934f);
                                unsafe3.putLong(obj3, j, c8934f.f21013b);
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 4:
                        case 11:
                            if (i22 == 0) {
                                int iM21546a2 = iM21546a + 1;
                                int i31 = bArr[iM21546a];
                                if (i31 >= 0) {
                                    c8934f.f21012a = i31;
                                } else {
                                    iM21546a2 = AbstractC8940g.m21546a(i31, bArr, iM21546a2, c8934f);
                                }
                                iM21557e = iM21546a2;
                                unsafe3.putInt(obj3, j, c8934f.f21012a);
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 5:
                        case 14:
                            if (i22 == 1) {
                                unsafe3.putLong(obj3, j, AbstractC8940g.m21553b(iM21546a, bArr));
                                iM21557e = iM21546a + 8;
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 6:
                        case 13:
                            if (i22 == 5) {
                                unsafe3.putInt(obj3, j, AbstractC8940g.m21542a(iM21546a, bArr));
                                iM21557e = iM21546a + 4;
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 7:
                            i11 = i2;
                            if (i22 == 0) {
                                iM21557e = AbstractC8940g.m21557e(bArr, iM21546a, c8934f);
                                AbstractC9040x3.f21172c.mo21759a(obj3, j, c8934f.f21013b != 0);
                                unsafe2 = unsafe3;
                                i2 = i11;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 8:
                            i11 = i2;
                            if (i22 == 2) {
                                iM21557e = (536870912 & i24) == 0 ? AbstractC8940g.m21552b(bArr, iM21546a, c8934f) : AbstractC8940g.m21555c(bArr, iM21546a, c8934f);
                                unsafe3.putObject(obj3, j, c8934f.f21014c);
                                unsafe2 = unsafe3;
                                i2 = i11;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                        case 9:
                            if (i22 != 2) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i3 = i10;
                                i9 = iM21546a;
                                i4 = i21;
                                i7 = i30;
                            } else {
                                i11 = i2;
                                iM21557e = AbstractC8940g.m21548a(this.m21650c(i18), bArr, iM21546a, i11, c8934f);
                                Object object = unsafe3.getObject(obj3, j);
                                if (object == null) {
                                    unsafe3.putObject(obj3, j, c8934f.f21014c);
                                } else {
                                    unsafe3.putObject(obj3, j, AbstractC8972l1.m21664a(object, c8934f.f21014c));
                                }
                                unsafe2 = unsafe3;
                                i2 = i11;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            break;
                        case 10:
                            if (i22 != 2) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i3 = i10;
                                i9 = iM21546a;
                                i4 = i21;
                                i7 = i30;
                            } else {
                                iM21557e = AbstractC8940g.m21549a(bArr, iM21546a, c8934f);
                                unsafe3.putObject(obj3, j, c8934f.f21014c);
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            break;
                        case 12:
                            if (i22 != 0) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i3 = i10;
                                i9 = iM21546a;
                                i4 = i21;
                                i7 = i30;
                            } else {
                                int iM21546a3 = iM21546a + 1;
                                int i32 = bArr[iM21546a];
                                if (i32 >= 0) {
                                    c8934f.f21012a = i32;
                                } else {
                                    iM21546a3 = AbstractC8940g.m21546a(i32, bArr, iM21546a3, c8934f);
                                }
                                iM21557e = iM21546a3;
                                unsafe3.putInt(obj3, j, c8934f.f21012a);
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            break;
                        case 15:
                            if (i22 != 0) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i3 = i10;
                                i9 = iM21546a;
                                i4 = i21;
                                i7 = i30;
                            } else {
                                int iM21546a4 = iM21546a + 1;
                                int i33 = bArr[iM21546a];
                                if (i33 >= 0) {
                                    c8934f.f21012a = i33;
                                } else {
                                    iM21546a4 = AbstractC8940g.m21546a(i33, bArr, iM21546a4, c8934f);
                                }
                                iM21557e = iM21546a4;
                                unsafe3.putInt(obj3, j, AbstractC9031w.m21818b(c8934f.f21012a));
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            break;
                        case 16:
                            if (i22 != 0) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i3 = i10;
                                i9 = iM21546a;
                                i4 = i21;
                                i7 = i30;
                            } else {
                                iM21557e = AbstractC8940g.m21557e(bArr, iM21546a, c8934f);
                                unsafe3.putLong(obj3, j, AbstractC9031w.m21817a(c8934f.f21013b));
                                unsafe2 = unsafe3;
                                i17 = i30 | i27;
                                obj2 = obj3;
                                i12 = i2;
                                i3 = i10;
                                iM21545a = iM21557e;
                                i4 = i21;
                            }
                            break;
                        default:
                            unsafe2 = unsafe3;
                            obj2 = obj3;
                            i3 = i10;
                            i9 = iM21546a;
                            i4 = i21;
                            i7 = i30;
                            break;
                    }
                    i13 = i12;
                    obj3 = obj2;
                    unsafe3 = unsafe2;
                    i16 = i4;
                    i19 = i3;
                    i14 = -1;
                    i15 = 0;
                } else {
                    i13 = i2;
                    int i34 = i20 == true ? 1 : 0;
                    int i35 = i19;
                    int i36 = i17;
                    Unsafe unsafe4 = unsafe3;
                    if (i25 == 27) {
                        if (i22 == 2) {
                            InterfaceC8966k1 interfaceC8966k1Mo21502b = (InterfaceC8966k1) unsafe4.getObject(obj3, j);
                            if (!((AbstractC8916c) interfaceC8966k1Mo21502b).f20989a) {
                                int size = interfaceC8966k1Mo21502b.size();
                                interfaceC8966k1Mo21502b = interfaceC8966k1Mo21502b.mo21502b(size == 0 ? 10 : size * 2);
                                unsafe4.putObject(obj3, j, interfaceC8966k1Mo21502b);
                            }
                            InterfaceC9019t2 interfaceC9019t2M21650c = this.m21650c(i18);
                            int iM21548a = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, iM21546a, i13, c8934f);
                            interfaceC8966k1Mo21502b.add(c8934f.f21014c);
                            while (iM21548a < i13) {
                                int iM21546a5 = iM21548a + 1;
                                int i37 = bArr[iM21548a];
                                if (i37 >= 0) {
                                    c8934f.f21012a = i37;
                                } else {
                                    iM21546a5 = AbstractC8940g.m21546a(i37, bArr, iM21546a5, c8934f);
                                }
                                int i38 = i34;
                                if (i38 != c8934f.f21012a) {
                                    unsafe3 = unsafe4;
                                    iM21545a = iM21548a;
                                    i19 = i35;
                                    i16 = i21;
                                    i17 = i36;
                                } else {
                                    iM21548a = AbstractC8940g.m21548a(interfaceC9019t2M21650c, bArr, iM21546a5, i13, c8934f);
                                    interfaceC8966k1Mo21502b.add(c8934f.f21014c);
                                    i34 = i38 == true ? 1 : 0;
                                }
                            }
                            unsafe3 = unsafe4;
                            iM21545a = iM21548a;
                            i19 = i35;
                            i16 = i21;
                            i17 = i36;
                        } else {
                            i20 = i34 == true ? 1 : 0;
                            unsafe = unsafe4;
                            i3 = i35;
                            i6 = iM21546a;
                            i4 = i21;
                            i5 = i18;
                        }
                        i14 = -1;
                        i15 = 0;
                    } else {
                        i20 = i34 == true ? 1 : 0;
                        if (i25 <= 49) {
                            int i39 = iM21546a;
                            i4 = i21;
                            Object obj4 = obj3;
                            byte[] bArr2 = bArr;
                            int i40 = i18;
                            int iM21627a = m21627a(obj4, bArr2, i39, i2, i20 == true ? 1 : 0, i22, i40, i24, i25, j, c8934f);
                            int i41 = i20 == true ? 1 : 0;
                            i5 = i40;
                            unsafe2 = unsafe4;
                            if (iM21627a != i39) {
                                i20 = i41;
                                iM21545a = iM21627a;
                                i3 = i35;
                                i7 = i36;
                                obj2 = obj4;
                                i13 = i2;
                                obj3 = obj2;
                                i18 = i5;
                                unsafe3 = unsafe2;
                                i17 = i7;
                            } else {
                                i20 = i41;
                                i8 = iM21627a;
                                i3 = i35;
                                i7 = i36;
                                obj2 = obj4;
                                i9 = i8;
                                i18 = i5;
                            }
                        } else {
                            i3 = i35;
                            i4 = i21;
                            i5 = i18;
                            unsafe = unsafe4;
                            i6 = iM21546a;
                            if (i25 != 50) {
                                Object obj5 = obj3;
                                i7 = i36;
                                unsafe2 = unsafe;
                                int iM21626a = m21626a(obj5, bArr, i6, i2, i20 == true ? 1 : 0, i4, i22, i24, i25, j, i5, c8934f);
                                obj2 = obj5;
                                int i42 = i20 == true ? 1 : 0;
                                if (iM21626a != i6) {
                                    i20 = i42;
                                    iM21545a = iM21626a;
                                    i13 = i2;
                                    obj3 = obj2;
                                    i18 = i5;
                                    unsafe3 = unsafe2;
                                    i17 = i7;
                                } else {
                                    i20 = i42;
                                    i8 = iM21626a;
                                    i9 = i8;
                                    i18 = i5;
                                }
                            } else if (i22 == 2) {
                                Unsafe unsafe5 = f21033r;
                                Object objM21644b = m21644b(i5);
                                Object object2 = unsafe5.getObject(obj3, j);
                                this.f21049p.getClass();
                                if (!((C9043y1) object2).f21182a) {
                                    this.f21049p.getClass();
                                    C9043y1 c9043y1 = C9043y1.f21181b;
                                    C9043y1 c9043y2 = c9043y1.isEmpty() ? new C9043y1() : new C9043y1(c9043y1);
                                    this.f21049p.getClass();
                                    C9048z1.m21850a(c9043y2, object2);
                                    unsafe5.putObject(obj3, j, c9043y2);
                                }
                                this.f21049p.getClass();
                                objM21644b.getClass();
                                throw new ClassCastException();
                            }
                        }
                        i16 = i4;
                        i19 = i3;
                        i14 = -1;
                        i15 = 0;
                    }
                    obj2 = obj3;
                    i9 = i6;
                    unsafe2 = unsafe;
                    i18 = i5;
                    i7 = i36;
                }
            }
            AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj2;
            C8986n3 c8986n3 = abstractC9047z0.unknownFields;
            if (c8986n3 == C8986n3.f21077f) {
                c8986n3 = new C8986n3();
                abstractC9047z0.unknownFields = c8986n3;
            }
            i12 = i2;
            iM21545a = AbstractC8940g.m21545a(i20 == true ? 1 : 0, bArr, i9, i2, c8986n3, c8934f);
            i17 = i7;
            i13 = i12;
            obj3 = obj2;
            unsafe3 = unsafe2;
            i16 = i4;
            i19 = i3;
            i14 = -1;
            i15 = 0;
        }
        Unsafe unsafe6 = unsafe3;
        Object obj6 = obj3;
        int i43 = i19;
        int i44 = i17;
        int i45 = i13;
        if (i43 != 1048575) {
            unsafe6.putInt(obj6, i43, i44);
        }
        if (iM21545a != i45) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21639a(int i, Object obj) {
        int[] iArr = this.f21034a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC9040x3.m21836c(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return AbstractC9040x3.f21172c.mo21763c(obj, j2) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return AbstractC9040x3.f21172c.mo21764d(obj, j2) != 0.0f;
            case 2:
                return AbstractC9040x3.m21838d(obj, j2) != 0;
            case 3:
                return AbstractC9040x3.m21838d(obj, j2) != 0;
            case 4:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 5:
                return AbstractC9040x3.m21838d(obj, j2) != 0;
            case 6:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 7:
                return AbstractC9040x3.f21172c.mo21760a(obj, j2);
            case 8:
                Object objM21839e = AbstractC9040x3.m21839e(obj, j2);
                if (objM21839e instanceof String) {
                    return !((String) objM21839e).isEmpty();
                }
                if (objM21839e instanceof AbstractC9011s) {
                    return !AbstractC9011s.f21106b.equals(objM21839e);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC9040x3.m21839e(obj, j2) != null;
            case 10:
                return !AbstractC9011s.f21106b.equals(AbstractC9040x3.m21839e(obj, j2));
            case 11:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 12:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 13:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 14:
                return AbstractC9040x3.m21838d(obj, j2) != 0;
            case 15:
                return AbstractC9040x3.m21836c(obj, j2) != 0;
            case 16:
                return AbstractC9040x3.m21838d(obj, j2) != 0;
            case 17:
                return AbstractC9040x3.m21839e(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21640a(int i, Object obj, Object obj2) {
        return m21639a(i, obj) == m21639a(i, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd A[LOOP:1: B:49:0x00bc->B:54:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final boolean mo21641a(Object obj) {
        List list;
        InterfaceC9019t2 interfaceC9019t2M21650c;
        int i;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zM21639a = true;
            if (i3 >= this.f21043j) {
                if (this.f21039f) {
                    this.f21048o.getClass();
                    if (!((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21683c()) {
                        return false;
                    }
                }
                return true;
            }
            int i5 = this.f21042i[i3];
            int[] iArr = this.f21034a;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i2) {
                if (i9 != 1048575) {
                    i4 = f21033r.getInt(obj, i9);
                }
                i2 = i9;
            }
            if ((268435456 & i7) != 0) {
                if (!(i2 == 1048575 ? m21639a(i5, obj) : (i4 & i10) != 0)) {
                    return false;
                }
            }
            int i11 = (267386880 & i7) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (i2 == 1048575) {
                    zM21639a = m21639a(i5, obj);
                } else if ((i10 & i4) == 0) {
                    zM21639a = false;
                }
                if (zM21639a && !m21650c(i5).mo21641a(AbstractC9040x3.m21839e(obj, i7 & 1048575))) {
                    return false;
                }
            } else if (i11 == 27) {
                list = (List) AbstractC9040x3.m21839e(obj, i7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC9019t2M21650c = m21650c(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!interfaceC9019t2M21650c.mo21641a(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (m21642a(obj, i6, i5) && !m21650c(i5).mo21641a(AbstractC9040x3.m21839e(obj, i7 & 1048575))) {
                    return false;
                }
            } else if (i11 == 49) {
                list = (List) AbstractC9040x3.m21839e(obj, i7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC9019t2M21650c = m21650c(i5);
                    while (i < list.size()) {
                        if (!interfaceC9019t2M21650c.mo21641a(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i11 != 50) {
                continue;
            } else {
                C9048z1 c9048z1 = this.f21049p;
                Object objM21839e = AbstractC9040x3.m21839e(obj, i7 & 1048575);
                c9048z1.getClass();
                if (!((C9043y1) objM21839e).isEmpty()) {
                    Object objM21644b = m21644b(i5);
                    this.f21049p.getClass();
                    objM21644b.getClass();
                    throw new ClassCastException();
                }
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21642a(Object obj, int i, int i2) {
        return AbstractC9040x3.m21836c(obj, (long) (this.f21034a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x039b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0449  */
    /* JADX WARN: Code duplicated, block: B:238:0x0637 A[PHI: r4
  0x0637: PHI (r4v102 int) = (r4v40 int), (r4v104 int) binds: [B:236:0x0630, B:59:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:415:0x0b0a A[PHI: r22
  0x0b0a: PHI (r22v48 int) = (r22v22 int), (r22v23 int), (r22v51 int) binds: [B:414:0x0b08, B:407:0x0ad8, B:341:0x08b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:438:0x0bb9 A[PHI: r22
  0x0bb9: PHI (r22v29 int) = (r22v15 int), (r22v16 int), (r22v17 int), (r22v24 int), (r22v25 int), (r22v28 int), (r22v31 int) binds: [B:437:0x0bb7, B:433:0x0b9d, B:429:0x0b83, B:403:0x0abc, B:399:0x0aa0, B:393:0x0a68, B:389:0x0a4c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:475:0x0ca7 A[PHI: r4 r22
  0x0ca7: PHI (r4v27 int) = 
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v8 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v9 int)
  (r4v2 int)
  (r4v10 int)
  (r4v2 int)
  (r4v2 int)
  (r4v2 int)
  (r4v11 int)
  (r4v12 int)
  (r4v2 int)
  (r4v13 int)
  (r4v2 int)
  (r4v14 int)
  (r4v2 int)
  (r4v15 int)
  (r4v2 int)
  (r4v16 int)
  (r4v2 int)
  (r4v17 int)
  (r4v2 int)
  (r4v18 int)
  (r4v2 int)
  (r4v19 int)
  (r4v2 int)
  (r4v20 int)
  (r4v2 int)
  (r4v21 int)
  (r4v2 int)
  (r4v22 int)
  (r4v2 int)
  (r4v23 int)
  (r4v2 int)
  (r4v24 int)
  (r4v2 int)
  (r4v25 int)
  (r4v2 int)
  (r4v26 int)
  (r4v28 int)
 binds: [B:483:0x0cd1, B:477:0x0cae, B:473:0x0c8b, B:474:0x0c8d, B:468:0x0c73, B:465:0x0c61, B:462:0x0c4f, B:459:0x0c45, B:460:0x0c47, B:456:0x0c3b, B:457:0x0c3d, B:452:0x0c21, B:449:0x0c09, B:445:0x0beb, B:425:0x0b55, B:440:0x0bc7, B:386:0x0a32, B:387:0x0a34, B:383:0x0a17, B:384:0x0a19, B:380:0x09fc, B:381:0x09fe, B:377:0x09e4, B:378:0x09e6, B:374:0x09cc, B:375:0x09ce, B:371:0x09b4, B:372:0x09b6, B:368:0x0999, B:369:0x099b, B:365:0x097e, B:366:0x0980, B:362:0x0964, B:363:0x0966, B:359:0x094c, B:360:0x094e, B:356:0x0934, B:357:0x0936, B:353:0x0919, B:354:0x091b, B:350:0x08fe, B:351:0x0900, B:347:0x08e6, B:348:0x08e8, B:419:0x0b2a] A[DONT_GENERATE, DONT_INLINE]
  0x0ca7: PHI (r22v46 int) = 
  (r22v0 int)
  (r22v1 int)
  (r22v2 int)
  (r22v2 int)
  (r22v3 int)
  (r22v4 int)
  (r22v6 int)
  (r22v7 int)
  (r22v7 int)
  (r22v8 int)
  (r22v8 int)
  (r22v9 int)
  (r22v11 int)
  (r22v12 int)
  (r22v20 int)
  (r22v30 int)
  (r22v32 int)
  (r22v32 int)
  (r22v33 int)
  (r22v33 int)
  (r22v34 int)
  (r22v34 int)
  (r22v35 int)
  (r22v35 int)
  (r22v36 int)
  (r22v36 int)
  (r22v37 int)
  (r22v37 int)
  (r22v38 int)
  (r22v38 int)
  (r22v39 int)
  (r22v39 int)
  (r22v40 int)
  (r22v40 int)
  (r22v41 int)
  (r22v41 int)
  (r22v42 int)
  (r22v42 int)
  (r22v43 int)
  (r22v43 int)
  (r22v44 int)
  (r22v44 int)
  (r22v45 int)
  (r22v45 int)
  (r22v47 int)
 binds: [B:483:0x0cd1, B:477:0x0cae, B:473:0x0c8b, B:474:0x0c8d, B:468:0x0c73, B:465:0x0c61, B:462:0x0c4f, B:459:0x0c45, B:460:0x0c47, B:456:0x0c3b, B:457:0x0c3d, B:452:0x0c21, B:449:0x0c09, B:445:0x0beb, B:425:0x0b55, B:440:0x0bc7, B:386:0x0a32, B:387:0x0a34, B:383:0x0a17, B:384:0x0a19, B:380:0x09fc, B:381:0x09fe, B:377:0x09e4, B:378:0x09e6, B:374:0x09cc, B:375:0x09ce, B:371:0x09b4, B:372:0x09b6, B:368:0x0999, B:369:0x099b, B:365:0x097e, B:366:0x0980, B:362:0x0964, B:363:0x0966, B:359:0x094c, B:360:0x094e, B:356:0x0934, B:357:0x0936, B:353:0x0919, B:354:0x091b, B:350:0x08fe, B:351:0x0900, B:347:0x08e6, B:348:0x08e8, B:419:0x0b2a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:496:0x0cfc A[PHI: r10
  0x0cfc: PHI (r10v25 int) = (r10v3 int), (r10v26 int) binds: [B:494:0x0cf5, B:313:0x080e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: b */
    public final int mo21643b(Object obj) {
        int i;
        int iM21514b;
        int iM21511a;
        int i2;
        int iM21514b2;
        int iM21513a;
        int iM21788b;
        int iM21514b3;
        int iM21514b4;
        int serializedSize;
        int iM21619a;
        int iM21514b5;
        int iM21514b6;
        int iM21513a2;
        int iM21558a;
        int iM21514b7;
        int iM21511a2;
        int iM21511a3;
        int iM21514b8;
        int iM21516c;
        int iM21514b9;
        int iM21513a3;
        int iM21514b10;
        int i3 = 267386880;
        int i4 = 1048575;
        int i5 = 1;
        if (!this.f21041h) {
            Unsafe unsafe = f21033r;
            int i6 = 1048575;
            int i7 = 0;
            int iM21558a2 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr = this.f21034a;
                if (i7 >= iArr.length) {
                    this.f21047n.getClass();
                    int iM21687a = ((AbstractC9047z0) obj).unknownFields.m21687a() + iM21558a2;
                    if (!this.f21039f) {
                        return iM21687a;
                    }
                    this.f21048o.getClass();
                    return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21680b() + iM21687a;
                }
                int i9 = iArr[i7 + 1];
                int i10 = iArr[i7];
                int i11 = (i9 & 267386880) >>> 20;
                int i12 = i4;
                if (i11 <= 17) {
                    int i13 = iArr[i7 + 2];
                    int i14 = i13 & i12;
                    i = i5 << (i13 >>> 20);
                    if (i14 != i6) {
                        i8 = unsafe.getInt(obj, i14);
                        i6 = i14;
                    }
                } else {
                    i = 0;
                }
                long j = i9 & i12;
                switch (i11) {
                    case 0:
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 1:
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 2:
                        if ((i & i8) != 0) {
                            long j2 = unsafe.getLong(obj, j);
                            iM21514b = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(j2);
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 3:
                        if ((i & i8) != 0) {
                            long j3 = unsafe.getLong(obj, j);
                            iM21514b = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(j3);
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 4:
                        if ((i & i8) != 0) {
                            int i15 = unsafe.getInt(obj, j);
                            iM21511a = AbstractC8911b0.m21514b(i10);
                            if (i15 >= 0) {
                                iM21514b = AbstractC8911b0.m21516c(i15);
                            } else {
                                iM21514b = 10;
                            }
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 5:
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 6:
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 7:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            i5 = i2;
                            iM21558a2 = AbstractC8943g2.m21558a(i10, i5, iM21558a2);
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 8:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof AbstractC9011s) {
                                iM21514b2 = AbstractC8911b0.m21514b(i10);
                                iM21513a = AbstractC8911b0.m21512a((AbstractC9011s) object);
                            } else {
                                iM21514b2 = AbstractC8911b0.m21514b(i10);
                                iM21513a = AbstractC8911b0.m21513a((String) object);
                            }
                            iM21788b = iM21513a + iM21514b2;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 9:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            Object object2 = unsafe.getObject(obj, j);
                            InterfaceC9019t2 interfaceC9019t2M21650c = m21650c(i7);
                            Class cls = AbstractC9024u2.f21133a;
                            int iM21514b11 = AbstractC8911b0.m21514b(i10);
                            int serializedSize2 = ((AbstractC8910b) ((InterfaceC8925d2) object2)).getSerializedSize(interfaceC9019t2M21650c);
                            iM21558a2 = AbstractC8971l0.m21663a(serializedSize2, serializedSize2, iM21514b11, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 10:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            AbstractC9011s abstractC9011s = (AbstractC9011s) unsafe.getObject(obj, j);
                            iM21514b2 = AbstractC8911b0.m21514b(i10);
                            iM21513a = AbstractC8911b0.m21512a(abstractC9011s);
                            iM21788b = iM21513a + iM21514b2;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 11:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            int i16 = unsafe.getInt(obj, j);
                            iM21514b2 = AbstractC8911b0.m21514b(i10);
                            iM21513a = AbstractC8911b0.m21516c(i16);
                            iM21788b = iM21513a + iM21514b2;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 12:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            int i17 = unsafe.getInt(obj, j);
                            iM21514b2 = AbstractC8911b0.m21514b(i10);
                            iM21513a = AbstractC8911b0.m21510a(i17);
                            iM21788b = iM21513a + iM21514b2;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 13:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 14:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 15:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            int i18 = unsafe.getInt(obj, j);
                            iM21514b3 = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(i18));
                            iM21514b = iM21514b3;
                            i5 = i2;
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 16:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            long j4 = unsafe.getLong(obj, j);
                            iM21514b3 = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(j4));
                            iM21514b = iM21514b3;
                            i5 = i2;
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 17:
                        i2 = i5;
                        if ((i & i8) != 0) {
                            InterfaceC8925d2 interfaceC8925d2 = (InterfaceC8925d2) unsafe.getObject(obj, j);
                            InterfaceC9019t2 interfaceC9019t2M21650c2 = m21650c(i7);
                            iM21514b4 = AbstractC8911b0.m21514b(i10) * 2;
                            serializedSize = ((AbstractC8910b) interfaceC8925d2).getSerializedSize(interfaceC9019t2M21650c2);
                            iM21788b = serializedSize + iM21514b4;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        } else {
                            i5 = i2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 18:
                        iM21788b = AbstractC9024u2.m21788b(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 19:
                        iM21788b = AbstractC9024u2.m21778a(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 20:
                        i2 = i5;
                        List list = (List) unsafe.getObject(obj, j);
                        Class cls2 = AbstractC9024u2.f21133a;
                        if (list.size() == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, list.size(), AbstractC9024u2.m21794c(list));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 21:
                        i2 = i5;
                        List list2 = (List) unsafe.getObject(obj, j);
                        Class cls3 = AbstractC9024u2.f21133a;
                        int size = list2.size();
                        if (size == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size, AbstractC9024u2.m21802g(list2));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 22:
                        i2 = i5;
                        List list3 = (List) unsafe.getObject(obj, j);
                        Class cls4 = AbstractC9024u2.f21133a;
                        int size2 = list3.size();
                        if (size2 == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size2, AbstractC9024u2.m21789b(list3));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 23:
                        iM21788b = AbstractC9024u2.m21788b(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 24:
                        iM21788b = AbstractC9024u2.m21778a(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 25:
                        i2 = i5;
                        List list4 = (List) unsafe.getObject(obj, j);
                        Class cls5 = AbstractC9024u2.f21133a;
                        int size3 = list4.size();
                        iM21558a2 = (size3 == 0 ? 0 : (AbstractC8911b0.m21514b(i10) + 1) * size3) + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 26:
                        iM21788b = AbstractC9024u2.m21793c(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 27:
                        i2 = i5;
                        List list5 = (List) unsafe.getObject(obj, j);
                        InterfaceC9019t2 interfaceC9019t2M21650c3 = m21650c(i7);
                        Class cls6 = AbstractC9024u2.f21133a;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            iM21514b5 = 0;
                        } else {
                            iM21514b5 = AbstractC8911b0.m21514b(i10) * size4;
                            for (int i19 = 0; i19 < size4; i19++) {
                                int serializedSize3 = ((AbstractC8910b) ((InterfaceC8925d2) list5.get(i19))).getSerializedSize(interfaceC9019t2M21650c3);
                                iM21514b5 += AbstractC8911b0.m21516c(serializedSize3) + serializedSize3;
                            }
                        }
                        iM21558a2 = iM21514b5 + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 28:
                        i2 = i5;
                        List list6 = (List) unsafe.getObject(obj, j);
                        Class cls7 = AbstractC9024u2.f21133a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            iM21514b5 = 0;
                        } else {
                            iM21514b5 = AbstractC8911b0.m21514b(i10) * size5;
                            for (int i20 = 0; i20 < list6.size(); i20++) {
                                iM21514b5 += AbstractC8911b0.m21512a((AbstractC9011s) list6.get(i20));
                            }
                        }
                        iM21558a2 = iM21514b5 + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 29:
                        i2 = i5;
                        List list7 = (List) unsafe.getObject(obj, j);
                        Class cls8 = AbstractC9024u2.f21133a;
                        int size6 = list7.size();
                        if (size6 == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size6, AbstractC9024u2.m21800f(list7));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 30:
                        i2 = i5;
                        List list8 = (List) unsafe.getObject(obj, j);
                        Class cls9 = AbstractC9024u2.f21133a;
                        int size7 = list8.size();
                        if (size7 == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size7, AbstractC9024u2.m21779a(list8));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 31:
                        iM21788b = AbstractC9024u2.m21778a(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 32:
                        iM21788b = AbstractC9024u2.m21788b(i10, (List) unsafe.getObject(obj, j));
                        iM21558a2 = iM21788b + iM21558a2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 33:
                        i2 = i5;
                        List list9 = (List) unsafe.getObject(obj, j);
                        Class cls10 = AbstractC9024u2.f21133a;
                        int size8 = list9.size();
                        if (size8 == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size8, AbstractC9024u2.m21796d(list9));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 34:
                        i2 = i5;
                        List list10 = (List) unsafe.getObject(obj, j);
                        Class cls11 = AbstractC9024u2.f21133a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            iM21619a = 0;
                        } else {
                            iM21619a = AbstractC8949h2.m21619a(i10, size9, AbstractC9024u2.m21798e(list10));
                        }
                        iM21558a2 = iM21619a + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 35:
                        i2 = i5;
                        List list11 = (List) unsafe.getObject(obj, j);
                        Class cls12 = AbstractC9024u2.f21133a;
                        int size10 = list11.size() * 8;
                        if (size10 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size10, AbstractC8911b0.m21514b(i10), size10, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 36:
                        i2 = i5;
                        List list12 = (List) unsafe.getObject(obj, j);
                        Class cls13 = AbstractC9024u2.f21133a;
                        int size11 = list12.size() * 4;
                        if (size11 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size11, AbstractC8911b0.m21514b(i10), size11, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 37:
                        i2 = i5;
                        int iM21794c = AbstractC9024u2.m21794c((List) unsafe.getObject(obj, j));
                        if (iM21794c > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21794c, AbstractC8911b0.m21514b(i10), iM21794c, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 38:
                        i2 = i5;
                        int iM21802g = AbstractC9024u2.m21802g((List) unsafe.getObject(obj, j));
                        if (iM21802g > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21802g, AbstractC8911b0.m21514b(i10), iM21802g, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 39:
                        i2 = i5;
                        int iM21789b = AbstractC9024u2.m21789b((List) unsafe.getObject(obj, j));
                        if (iM21789b > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21789b, AbstractC8911b0.m21514b(i10), iM21789b, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 40:
                        i2 = i5;
                        List list13 = (List) unsafe.getObject(obj, j);
                        Class cls14 = AbstractC9024u2.f21133a;
                        int size12 = list13.size() * 8;
                        if (size12 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size12, AbstractC8911b0.m21514b(i10), size12, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 41:
                        i2 = i5;
                        List list14 = (List) unsafe.getObject(obj, j);
                        Class cls15 = AbstractC9024u2.f21133a;
                        int size13 = list14.size() * 4;
                        if (size13 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size13, AbstractC8911b0.m21514b(i10), size13, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 42:
                        i2 = i5;
                        List list15 = (List) unsafe.getObject(obj, j);
                        Class cls16 = AbstractC9024u2.f21133a;
                        int size14 = list15.size();
                        if (size14 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size14, AbstractC8911b0.m21514b(i10), size14, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 43:
                        i2 = i5;
                        int iM21800f = AbstractC9024u2.m21800f((List) unsafe.getObject(obj, j));
                        if (iM21800f > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21800f, AbstractC8911b0.m21514b(i10), iM21800f, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 44:
                        i2 = i5;
                        int iM21779a = AbstractC9024u2.m21779a((List) unsafe.getObject(obj, j));
                        if (iM21779a > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21779a, AbstractC8911b0.m21514b(i10), iM21779a, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 45:
                        i2 = i5;
                        List list16 = (List) unsafe.getObject(obj, j);
                        Class cls17 = AbstractC9024u2.f21133a;
                        int size15 = list16.size() * 4;
                        if (size15 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size15, AbstractC8911b0.m21514b(i10), size15, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 46:
                        i2 = i5;
                        List list17 = (List) unsafe.getObject(obj, j);
                        Class cls18 = AbstractC9024u2.f21133a;
                        int size16 = list17.size() * 8;
                        if (size16 > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(size16, AbstractC8911b0.m21514b(i10), size16, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 47:
                        i2 = i5;
                        int iM21796d = AbstractC9024u2.m21796d((List) unsafe.getObject(obj, j));
                        if (iM21796d > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21796d, AbstractC8911b0.m21514b(i10), iM21796d, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 48:
                        i2 = i5;
                        int iM21798e = AbstractC9024u2.m21798e((List) unsafe.getObject(obj, j));
                        if (iM21798e > 0) {
                            iM21558a2 = AbstractC8971l0.m21663a(iM21798e, AbstractC8911b0.m21514b(i10), iM21798e, iM21558a2);
                        }
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 49:
                        List list18 = (List) unsafe.getObject(obj, j);
                        InterfaceC9019t2 interfaceC9019t2M21650c4 = m21650c(i7);
                        Class cls19 = AbstractC9024u2.f21133a;
                        int size17 = list18.size();
                        if (size17 == 0) {
                            i2 = i5;
                            iM21514b5 = 0;
                        } else {
                            int i21 = 0;
                            iM21514b5 = 0;
                            while (i21 < size17) {
                                iM21514b5 += ((AbstractC8910b) ((InterfaceC8925d2) list18.get(i21))).getSerializedSize(interfaceC9019t2M21650c4) + (AbstractC8911b0.m21514b(i10) * 2);
                                i21++;
                                i5 = i5;
                            }
                            i2 = i5;
                        }
                        iM21558a2 = iM21514b5 + iM21558a2;
                        i5 = i2;
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 50:
                        C9048z1 c9048z1 = this.f21049p;
                        Object object3 = unsafe.getObject(obj, j);
                        Object objM21644b = m21644b(i7);
                        c9048z1.getClass();
                        C9043y1 c9043y1 = (C9043y1) object3;
                        if (objM21644b != null) {
                            throw new ClassCastException();
                        }
                        if (c9043y1.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = c9043y1.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 51:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 52:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 53:
                        if (m21642a(obj, i10, i7)) {
                            long jLongValue = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                            iM21514b = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(jLongValue);
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 54:
                        if (m21642a(obj, i10, i7)) {
                            long jLongValue2 = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                            iM21514b = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(jLongValue2);
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 55:
                        if (m21642a(obj, i10, i7)) {
                            int iIntValue = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                            iM21511a = AbstractC8911b0.m21514b(i10);
                            if (iIntValue >= 0) {
                                iM21514b = AbstractC8911b0.m21516c(iIntValue);
                            } else {
                                iM21514b = 10;
                            }
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 56:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 57:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 58:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, i5, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 59:
                        if (m21642a(obj, i10, i7)) {
                            Object object4 = unsafe.getObject(obj, j);
                            if (object4 instanceof AbstractC9011s) {
                                iM21514b6 = AbstractC8911b0.m21514b(i10);
                                iM21513a2 = AbstractC8911b0.m21512a((AbstractC9011s) object4);
                            } else {
                                iM21514b6 = AbstractC8911b0.m21514b(i10);
                                iM21513a2 = AbstractC8911b0.m21513a((String) object4);
                            }
                            iM21788b = iM21513a2 + iM21514b6;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 60:
                        if (m21642a(obj, i10, i7)) {
                            Object object5 = unsafe.getObject(obj, j);
                            InterfaceC9019t2 interfaceC9019t2M21650c5 = m21650c(i7);
                            Class cls20 = AbstractC9024u2.f21133a;
                            int iM21514b12 = AbstractC8911b0.m21514b(i10);
                            int serializedSize4 = ((AbstractC8910b) ((InterfaceC8925d2) object5)).getSerializedSize(interfaceC9019t2M21650c5);
                            iM21558a2 = AbstractC8971l0.m21663a(serializedSize4, serializedSize4, iM21514b12, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 61:
                        if (m21642a(obj, i10, i7)) {
                            AbstractC9011s abstractC9011s2 = (AbstractC9011s) unsafe.getObject(obj, j);
                            iM21514b6 = AbstractC8911b0.m21514b(i10);
                            iM21513a2 = AbstractC8911b0.m21512a(abstractC9011s2);
                            iM21788b = iM21513a2 + iM21514b6;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 62:
                        if (m21642a(obj, i10, i7)) {
                            int iIntValue2 = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                            iM21514b6 = AbstractC8911b0.m21514b(i10);
                            iM21513a2 = AbstractC8911b0.m21516c(iIntValue2);
                            iM21788b = iM21513a2 + iM21514b6;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 63:
                        if (m21642a(obj, i10, i7)) {
                            int iIntValue3 = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                            iM21514b6 = AbstractC8911b0.m21514b(i10);
                            iM21513a2 = AbstractC8911b0.m21510a(iIntValue3);
                            iM21788b = iM21513a2 + iM21514b6;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 64:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 4, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 65:
                        if (m21642a(obj, i10, i7)) {
                            iM21558a2 = AbstractC8943g2.m21558a(i10, 8, iM21558a2);
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 66:
                        if (m21642a(obj, i10, i7)) {
                            int iIntValue4 = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                            int iM21514b13 = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(iIntValue4));
                            iM21514b = iM21514b13;
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 67:
                        if (m21642a(obj, i10, i7)) {
                            long jLongValue3 = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                            iM21514b = AbstractC8911b0.m21514b(i10);
                            iM21511a = AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(jLongValue3));
                            iM21788b = iM21514b + iM21511a;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    case 68:
                        if (m21642a(obj, i10, i7)) {
                            InterfaceC8925d2 interfaceC8925d3 = (InterfaceC8925d2) unsafe.getObject(obj, j);
                            InterfaceC9019t2 interfaceC9019t2M21650c6 = m21650c(i7);
                            iM21514b4 = AbstractC8911b0.m21514b(i10) * 2;
                            serializedSize = ((AbstractC8910b) interfaceC8925d3).getSerializedSize(interfaceC9019t2M21650c6);
                            i2 = i5;
                            iM21788b = serializedSize + iM21514b4;
                            i5 = i2;
                            iM21558a2 = iM21788b + iM21558a2;
                        }
                        i7 += 3;
                        i4 = i12;
                        break;
                    default:
                        i7 += 3;
                        i4 = i12;
                        break;
                }
            }
        } else {
            Unsafe unsafe2 = f21033r;
            int i22 = 0;
            int iM21514b14 = 0;
            while (true) {
                int[] iArr2 = this.f21034a;
                if (i22 >= iArr2.length) {
                    this.f21047n.getClass();
                    return ((AbstractC9047z0) obj).unknownFields.m21687a() + iM21514b14;
                }
                int i23 = iArr2[i22 + 1];
                int i24 = (i23 & i3) >>> 20;
                int i25 = iArr2[i22];
                int i26 = i3;
                long j5 = i23 & 1048575;
                if (i24 >= FieldType.DOUBLE_LIST_PACKED.m21468id() && i24 <= FieldType.SINT64_LIST_PACKED.m21468id()) {
                    int i27 = this.f21034a[i22 + 2];
                }
                switch (i24) {
                    case 0:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 1:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 2:
                        if (m21639a(i22, obj)) {
                            long jM21838d = AbstractC9040x3.m21838d(obj, j5);
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21511a(jM21838d);
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 3:
                        if (m21639a(i22, obj)) {
                            iM21511a3 = AbstractC8911b0.m21511a(AbstractC9040x3.m21838d(obj, j5)) + AbstractC8911b0.m21514b(i25);
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 4:
                        if (m21639a(i22, obj)) {
                            int iM21836c = AbstractC9040x3.m21836c(obj, j5);
                            iM21514b8 = AbstractC8911b0.m21514b(i25);
                            if (iM21836c >= 0) {
                                iM21516c = AbstractC8911b0.m21516c(iM21836c);
                            } else {
                                iM21516c = 10;
                            }
                            iM21511a3 = iM21516c + iM21514b8;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 5:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 6:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 7:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 1, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 8:
                        if (m21639a(i22, obj)) {
                            Object objM21839e = AbstractC9040x3.m21839e(obj, j5);
                            if (objM21839e instanceof AbstractC9011s) {
                                iM21514b9 = AbstractC8911b0.m21514b(i25);
                                iM21513a3 = AbstractC8911b0.m21512a((AbstractC9011s) objM21839e);
                            } else {
                                iM21514b9 = AbstractC8911b0.m21514b(i25);
                                iM21513a3 = AbstractC8911b0.m21513a((String) objM21839e);
                            }
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 9:
                        if (m21639a(i22, obj)) {
                            Object objM21839e2 = AbstractC9040x3.m21839e(obj, j5);
                            InterfaceC9019t2 interfaceC9019t2M21650c7 = m21650c(i22);
                            Class cls21 = AbstractC9024u2.f21133a;
                            int iM21514b15 = AbstractC8911b0.m21514b(i25);
                            int serializedSize5 = ((AbstractC8910b) ((InterfaceC8925d2) objM21839e2)).getSerializedSize(interfaceC9019t2M21650c7);
                            iM21558a = AbstractC8971l0.m21663a(serializedSize5, serializedSize5, iM21514b15, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 10:
                        if (m21639a(i22, obj)) {
                            AbstractC9011s abstractC9011s3 = (AbstractC9011s) AbstractC9040x3.m21839e(obj, j5);
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21512a(abstractC9011s3);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 11:
                        if (m21639a(i22, obj)) {
                            int iM21836c2 = AbstractC9040x3.m21836c(obj, j5);
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21516c(iM21836c2);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 12:
                        if (m21639a(i22, obj)) {
                            int iM21836c3 = AbstractC9040x3.m21836c(obj, j5);
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21510a(iM21836c3);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 13:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 14:
                        if (m21639a(i22, obj)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 15:
                        if (m21639a(i22, obj)) {
                            int iM21836c4 = AbstractC9040x3.m21836c(obj, j5);
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(iM21836c4));
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 16:
                        if (m21639a(i22, obj)) {
                            long jM21838d2 = AbstractC9040x3.m21838d(obj, j5);
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(jM21838d2));
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 17:
                        if (m21639a(i22, obj)) {
                            InterfaceC8925d2 interfaceC8925d4 = (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, j5);
                            InterfaceC9019t2 interfaceC9019t2M21650c8 = m21650c(i22);
                            iM21514b7 = AbstractC8911b0.m21514b(i25) * 2;
                            iM21511a2 = ((AbstractC8910b) interfaceC8925d4).getSerializedSize(interfaceC9019t2M21650c8);
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 18:
                        iM21511a3 = AbstractC9024u2.m21788b(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 19:
                        iM21511a3 = AbstractC9024u2.m21778a(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 20:
                        List list19 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls22 = AbstractC9024u2.f21133a;
                        if (list19.size() == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, list19.size(), AbstractC9024u2.m21794c(list19));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 21:
                        List list20 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls23 = AbstractC9024u2.f21133a;
                        int size18 = list20.size();
                        if (size18 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size18, AbstractC9024u2.m21802g(list20));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 22:
                        List list21 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls24 = AbstractC9024u2.f21133a;
                        int size19 = list21.size();
                        if (size19 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size19, AbstractC9024u2.m21789b(list21));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 23:
                        iM21511a3 = AbstractC9024u2.m21788b(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 24:
                        iM21511a3 = AbstractC9024u2.m21778a(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 25:
                        List list22 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls25 = AbstractC9024u2.f21133a;
                        int size20 = list22.size();
                        iM21514b14 = (size20 == 0 ? 0 : (AbstractC8911b0.m21514b(i25) + 1) * size20) + iM21514b14;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 26:
                        iM21511a3 = AbstractC9024u2.m21793c(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 27:
                        List list23 = (List) AbstractC9040x3.m21839e(obj, j5);
                        InterfaceC9019t2 interfaceC9019t2M21650c9 = m21650c(i22);
                        Class cls26 = AbstractC9024u2.f21133a;
                        int size21 = list23.size();
                        if (size21 == 0) {
                            iM21514b10 = 0;
                        } else {
                            iM21514b10 = AbstractC8911b0.m21514b(i25) * size21;
                            for (int i28 = 0; i28 < size21; i28++) {
                                int serializedSize6 = ((AbstractC8910b) ((InterfaceC8925d2) list23.get(i28))).getSerializedSize(interfaceC9019t2M21650c9);
                                iM21514b10 = AbstractC8911b0.m21516c(serializedSize6) + serializedSize6 + iM21514b10;
                            }
                        }
                        iM21514b14 = iM21514b10 + iM21514b14;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 28:
                        List list24 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls27 = AbstractC9024u2.f21133a;
                        int size22 = list24.size();
                        if (size22 == 0) {
                            iM21514b10 = 0;
                        } else {
                            iM21514b10 = AbstractC8911b0.m21514b(i25) * size22;
                            for (int i29 = 0; i29 < list24.size(); i29++) {
                                iM21514b10 = AbstractC8911b0.m21512a((AbstractC9011s) list24.get(i29)) + iM21514b10;
                            }
                        }
                        iM21514b14 = iM21514b10 + iM21514b14;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 29:
                        List list25 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls28 = AbstractC9024u2.f21133a;
                        int size23 = list25.size();
                        if (size23 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size23, AbstractC9024u2.m21800f(list25));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 30:
                        List list26 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls29 = AbstractC9024u2.f21133a;
                        int size24 = list26.size();
                        if (size24 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size24, AbstractC9024u2.m21779a(list26));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 31:
                        iM21511a3 = AbstractC9024u2.m21778a(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 32:
                        iM21511a3 = AbstractC9024u2.m21788b(i25, (List) AbstractC9040x3.m21839e(obj, j5));
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 33:
                        List list27 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls30 = AbstractC9024u2.f21133a;
                        int size25 = list27.size();
                        if (size25 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size25, AbstractC9024u2.m21796d(list27));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 34:
                        List list28 = (List) AbstractC9040x3.m21839e(obj, j5);
                        Class cls31 = AbstractC9024u2.f21133a;
                        int size26 = list28.size();
                        if (size26 == 0) {
                            iM21511a3 = 0;
                        } else {
                            iM21511a3 = AbstractC8949h2.m21619a(i25, size26, AbstractC9024u2.m21798e(list28));
                        }
                        iM21558a = iM21511a3 + iM21514b14;
                        iM21514b14 = iM21558a;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 35:
                        List list29 = (List) unsafe2.getObject(obj, j5);
                        Class cls32 = AbstractC9024u2.f21133a;
                        int size27 = list29.size() * 8;
                        if (size27 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size27, AbstractC8911b0.m21514b(i25), size27, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 36:
                        List list30 = (List) unsafe2.getObject(obj, j5);
                        Class cls33 = AbstractC9024u2.f21133a;
                        int size28 = list30.size() * 4;
                        if (size28 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size28, AbstractC8911b0.m21514b(i25), size28, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 37:
                        int iM21794c2 = AbstractC9024u2.m21794c((List) unsafe2.getObject(obj, j5));
                        if (iM21794c2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21794c2, AbstractC8911b0.m21514b(i25), iM21794c2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 38:
                        int iM21802g2 = AbstractC9024u2.m21802g((List) unsafe2.getObject(obj, j5));
                        if (iM21802g2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21802g2, AbstractC8911b0.m21514b(i25), iM21802g2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 39:
                        int iM21789b2 = AbstractC9024u2.m21789b((List) unsafe2.getObject(obj, j5));
                        if (iM21789b2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21789b2, AbstractC8911b0.m21514b(i25), iM21789b2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 40:
                        List list31 = (List) unsafe2.getObject(obj, j5);
                        Class cls34 = AbstractC9024u2.f21133a;
                        int size29 = list31.size() * 8;
                        if (size29 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size29, AbstractC8911b0.m21514b(i25), size29, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 41:
                        List list32 = (List) unsafe2.getObject(obj, j5);
                        Class cls35 = AbstractC9024u2.f21133a;
                        int size30 = list32.size() * 4;
                        if (size30 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size30, AbstractC8911b0.m21514b(i25), size30, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 42:
                        List list33 = (List) unsafe2.getObject(obj, j5);
                        Class cls36 = AbstractC9024u2.f21133a;
                        int size31 = list33.size();
                        if (size31 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size31, AbstractC8911b0.m21514b(i25), size31, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 43:
                        int iM21800f2 = AbstractC9024u2.m21800f((List) unsafe2.getObject(obj, j5));
                        if (iM21800f2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21800f2, AbstractC8911b0.m21514b(i25), iM21800f2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 44:
                        int iM21779a2 = AbstractC9024u2.m21779a((List) unsafe2.getObject(obj, j5));
                        if (iM21779a2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21779a2, AbstractC8911b0.m21514b(i25), iM21779a2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 45:
                        List list34 = (List) unsafe2.getObject(obj, j5);
                        Class cls37 = AbstractC9024u2.f21133a;
                        int size32 = list34.size() * 4;
                        if (size32 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size32, AbstractC8911b0.m21514b(i25), size32, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 46:
                        List list35 = (List) unsafe2.getObject(obj, j5);
                        Class cls38 = AbstractC9024u2.f21133a;
                        int size33 = list35.size() * 8;
                        if (size33 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(size33, AbstractC8911b0.m21514b(i25), size33, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 47:
                        int iM21796d2 = AbstractC9024u2.m21796d((List) unsafe2.getObject(obj, j5));
                        if (iM21796d2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21796d2, AbstractC8911b0.m21514b(i25), iM21796d2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 48:
                        int iM21798e2 = AbstractC9024u2.m21798e((List) unsafe2.getObject(obj, j5));
                        if (iM21798e2 > 0) {
                            iM21558a = AbstractC8971l0.m21663a(iM21798e2, AbstractC8911b0.m21514b(i25), iM21798e2, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 49:
                        List list36 = (List) AbstractC9040x3.m21839e(obj, j5);
                        InterfaceC9019t2 interfaceC9019t2M21650c10 = m21650c(i22);
                        Class cls39 = AbstractC9024u2.f21133a;
                        int size34 = list36.size();
                        if (size34 == 0) {
                            iM21514b10 = 0;
                        } else {
                            iM21514b10 = 0;
                            for (int i30 = 0; i30 < size34; i30++) {
                                iM21514b10 = ((AbstractC8910b) ((InterfaceC8925d2) list36.get(i30))).getSerializedSize(interfaceC9019t2M21650c10) + (AbstractC8911b0.m21514b(i25) * 2) + iM21514b10;
                            }
                        }
                        iM21514b14 = iM21514b10 + iM21514b14;
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 50:
                        C9048z1 c9048z2 = this.f21049p;
                        Object objM21839e3 = AbstractC9040x3.m21839e(obj, j5);
                        Object objM21644b2 = m21644b(i22);
                        c9048z2.getClass();
                        C9043y1 c9043y2 = (C9043y1) objM21839e3;
                        if (objM21644b2 != null) {
                            throw new ClassCastException();
                        }
                        if (c9043y2.isEmpty()) {
                            continue;
                        } else {
                            Iterator it2 = c9043y2.entrySet().iterator();
                            if (it2.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                entry2.getKey();
                                entry2.getValue();
                                throw null;
                            }
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 51:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 52:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 53:
                        if (m21642a(obj, i25, i22)) {
                            long jLongValue4 = ((Long) AbstractC9040x3.m21839e(obj, j5)).longValue();
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21511a(jLongValue4);
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 54:
                        if (m21642a(obj, i25, i22)) {
                            long jLongValue5 = ((Long) AbstractC9040x3.m21839e(obj, j5)).longValue();
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21511a(jLongValue5);
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 55:
                        if (m21642a(obj, i25, i22)) {
                            int iIntValue5 = ((Integer) AbstractC9040x3.m21839e(obj, j5)).intValue();
                            iM21514b8 = AbstractC8911b0.m21514b(i25);
                            if (iIntValue5 >= 0) {
                                iM21516c = AbstractC8911b0.m21516c(iIntValue5);
                            } else {
                                iM21516c = 10;
                            }
                            iM21511a3 = iM21516c + iM21514b8;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 56:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 57:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 58:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 1, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 59:
                        if (m21642a(obj, i25, i22)) {
                            Object objM21839e4 = AbstractC9040x3.m21839e(obj, j5);
                            if (objM21839e4 instanceof AbstractC9011s) {
                                iM21514b9 = AbstractC8911b0.m21514b(i25);
                                iM21513a3 = AbstractC8911b0.m21512a((AbstractC9011s) objM21839e4);
                            } else {
                                iM21514b9 = AbstractC8911b0.m21514b(i25);
                                iM21513a3 = AbstractC8911b0.m21513a((String) objM21839e4);
                            }
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 60:
                        if (m21642a(obj, i25, i22)) {
                            Object objM21839e5 = AbstractC9040x3.m21839e(obj, j5);
                            InterfaceC9019t2 interfaceC9019t2M21650c11 = m21650c(i22);
                            Class cls40 = AbstractC9024u2.f21133a;
                            int iM21514b16 = AbstractC8911b0.m21514b(i25);
                            int serializedSize7 = ((AbstractC8910b) ((InterfaceC8925d2) objM21839e5)).getSerializedSize(interfaceC9019t2M21650c11);
                            iM21558a = AbstractC8971l0.m21663a(serializedSize7, serializedSize7, iM21514b16, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 61:
                        if (m21642a(obj, i25, i22)) {
                            AbstractC9011s abstractC9011s4 = (AbstractC9011s) AbstractC9040x3.m21839e(obj, j5);
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21512a(abstractC9011s4);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 62:
                        if (m21642a(obj, i25, i22)) {
                            int iIntValue6 = ((Integer) AbstractC9040x3.m21839e(obj, j5)).intValue();
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21516c(iIntValue6);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 63:
                        if (m21642a(obj, i25, i22)) {
                            int iIntValue7 = ((Integer) AbstractC9040x3.m21839e(obj, j5)).intValue();
                            iM21514b9 = AbstractC8911b0.m21514b(i25);
                            iM21513a3 = AbstractC8911b0.m21510a(iIntValue7);
                            iM21511a3 = iM21513a3 + iM21514b9;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 64:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 4, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 65:
                        if (m21642a(obj, i25, i22)) {
                            iM21558a = AbstractC8943g2.m21558a(i25, 8, iM21514b14);
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 66:
                        if (m21642a(obj, i25, i22)) {
                            int iIntValue8 = ((Integer) AbstractC9040x3.m21839e(obj, j5)).intValue();
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(iIntValue8));
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 67:
                        if (m21642a(obj, i25, i22)) {
                            long jLongValue6 = ((Long) AbstractC9040x3.m21839e(obj, j5)).longValue();
                            iM21514b7 = AbstractC8911b0.m21514b(i25);
                            iM21511a2 = AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(jLongValue6));
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    case 68:
                        if (m21642a(obj, i25, i22)) {
                            InterfaceC8925d2 interfaceC8925d5 = (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, j5);
                            InterfaceC9019t2 interfaceC9019t2M21650c12 = m21650c(i22);
                            iM21514b7 = AbstractC8911b0.m21514b(i25) * 2;
                            iM21511a2 = ((AbstractC8910b) interfaceC8925d5).getSerializedSize(interfaceC9019t2M21650c12);
                            iM21511a3 = iM21511a2 + iM21514b7;
                            iM21558a = iM21511a3 + iM21514b14;
                            iM21514b14 = iM21558a;
                        }
                        i22 += 3;
                        i3 = i26;
                        break;
                    default:
                        i22 += 3;
                        i3 = i26;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m21644b(int i) {
        return this.f21035b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: b */
    public final Object m21645b(int i, Object obj, Object obj2) {
        int[] iArr = this.f21034a;
        int i2 = iArr[i];
        if (AbstractC9040x3.m21839e(obj, iArr[i + 1] & 1048575) == null) {
            return obj2;
        }
        m21630a(i);
        return obj2;
    }

    /* JADX INFO: renamed from: b */
    public final void m21646b(int i, Object obj) {
        int i2 = this.f21034a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC9040x3.m21830a(obj, j, (1 << (i2 >>> 20)) | AbstractC9040x3.m21836c(obj, j));
    }

    /* JADX INFO: renamed from: b */
    public final void m21647b(Object obj, int i, int i2) {
        AbstractC9040x3.m21830a(obj, this.f21034a[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0388  */
    /* JADX WARN: Code duplicated, block: B:101:0x0399  */
    /* JADX WARN: Code duplicated, block: B:102:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:105:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0403  */
    /* JADX WARN: Code duplicated, block: B:108:0x0414  */
    /* JADX WARN: Code duplicated, block: B:109:0x0425  */
    /* JADX WARN: Code duplicated, block: B:110:0x0436  */
    /* JADX WARN: Code duplicated, block: B:111:0x0447  */
    /* JADX WARN: Code duplicated, block: B:112:0x0458  */
    /* JADX WARN: Code duplicated, block: B:114:0x045e  */
    /* JADX WARN: Code duplicated, block: B:115:0x046d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0473  */
    /* JADX WARN: Code duplicated, block: B:118:0x047e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0484  */
    /* JADX WARN: Code duplicated, block: B:121:0x048f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0495  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x04db  */
    /* JADX WARN: Code duplicated, block: B:135:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x0509  */
    /* JADX WARN: Code duplicated, block: B:141:0x050f  */
    /* JADX WARN: Code duplicated, block: B:142:0x051a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0520  */
    /* JADX WARN: Code duplicated, block: B:145:0x052f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0535  */
    /* JADX WARN: Code duplicated, block: B:148:0x0541  */
    /* JADX WARN: Code duplicated, block: B:150:0x0547  */
    /* JADX WARN: Code duplicated, block: B:151:0x0553  */
    /* JADX WARN: Code duplicated, block: B:153:0x0559  */
    /* JADX WARN: Code duplicated, block: B:154:0x0565  */
    /* JADX WARN: Code duplicated, block: B:156:0x056b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0577  */
    /* JADX WARN: Code duplicated, block: B:159:0x057d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0589  */
    /* JADX WARN: Code duplicated, block: B:162:0x058f  */
    /* JADX WARN: Code duplicated, block: B:163:0x059b  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:175:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:245:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:271:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ac A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:80:0x0230  */
    /* JADX WARN: Code duplicated, block: B:81:0x0245  */
    /* JADX WARN: Code duplicated, block: B:82:0x0256  */
    /* JADX WARN: Code duplicated, block: B:83:0x0267  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:86:0x029a  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x02de  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0300  */
    /* JADX WARN: Code duplicated, block: B:93:0x0311  */
    /* JADX WARN: Code duplicated, block: B:94:0x0322  */
    /* JADX WARN: Code duplicated, block: B:95:0x0333  */
    /* JADX WARN: Code duplicated, block: B:96:0x0344  */
    /* JADX WARN: Code duplicated, block: B:97:0x0355  */
    /* JADX WARN: Code duplicated, block: B:98:0x0366  */
    /* JADX WARN: Code duplicated, block: B:99:0x0377  */
    /* JADX INFO: renamed from: b */
    public final void m21648b(Object obj, C8917c0 c8917c0) {
        Iterator itM21684d;
        Map.Entry entry;
        if (this.f21039f) {
            this.f21048o.getClass();
            C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (c8983n0.f21073a.isEmpty()) {
                itM21684d = null;
                entry = null;
            } else {
                itM21684d = c8983n0.m21684d();
                entry = (Map.Entry) itM21684d.next();
            }
        } else {
            itM21684d = null;
            entry = null;
        }
        int length = this.f21034a.length;
        for (int i = 0; i < length; i += 3) {
            int[] iArr = this.f21034a;
            int i2 = iArr[i + 1];
            int i3 = iArr[i];
            while (entry != null) {
                this.f21048o.getClass();
                if (((C9032w0) entry.getKey()).f21150b <= i3) {
                    this.f21048o.getClass();
                    C8959j0.m21659a(c8917c0, entry);
                    entry = itM21684d.hasNext() ? (Map.Entry) itM21684d.next() : null;
                } else {
                    switch ((267386880 & i2) >>> 20) {
                        case 0:
                            if (m21639a(i, obj)) {
                                c8917c0.m21522a(i3, AbstractC9040x3.f21172c.mo21763c(obj, i2 & 1048575));
                            }
                            break;
                        case 1:
                            if (m21639a(i, obj)) {
                                c8917c0.m21523a(i3, AbstractC9040x3.f21172c.mo21764d(obj, i2 & 1048575));
                            }
                            break;
                        case 2:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21484b(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                            }
                            break;
                        case 3:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21484b(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                            }
                            break;
                        case 4:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21483b(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 5:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21475a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                            }
                            break;
                        case 6:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21474a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 7:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21479a(i3, AbstractC9040x3.f21172c.mo21760a(obj, i2 & 1048575));
                            }
                            break;
                        case 8:
                            if (m21639a(i, obj)) {
                                m21623a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                            }
                            break;
                        case 9:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21477a(i3, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                            }
                            break;
                        case 10:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21478a(i3, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i2 & 1048575));
                            }
                            break;
                        case 11:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21491d(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 12:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21483b(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 13:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21474a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 14:
                            if (m21639a(i, obj)) {
                                c8917c0.f20990a.mo21475a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                            }
                            break;
                        case 15:
                            if (m21639a(i, obj)) {
                                c8917c0.m21524a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                            }
                            break;
                        case 16:
                            if (m21639a(i, obj)) {
                                c8917c0.m21525a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                            }
                            break;
                        case 17:
                            if (m21639a(i, obj)) {
                                c8917c0.m21526a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                            }
                            break;
                        case 18:
                            AbstractC9024u2.m21792b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 19:
                            AbstractC9024u2.m21801f(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 20:
                            AbstractC9024u2.m21804h(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 21:
                            AbstractC9024u2.m21810n(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 22:
                            AbstractC9024u2.m21803g(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 23:
                            AbstractC9024u2.m21799e(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 24:
                            AbstractC9024u2.m21797d(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 25:
                            AbstractC9024u2.m21786a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 26:
                            AbstractC9024u2.m21790b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                            break;
                        case 27:
                            AbstractC9024u2.m21791b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, m21650c(i));
                            break;
                        case 28:
                            AbstractC9024u2.m21784a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                            break;
                        case 29:
                            AbstractC9024u2.m21809m(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 30:
                            AbstractC9024u2.m21795c(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 31:
                            AbstractC9024u2.m21805i(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 32:
                            AbstractC9024u2.m21806j(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 33:
                            AbstractC9024u2.m21807k(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 34:
                            AbstractC9024u2.m21808l(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                            break;
                        case 35:
                            AbstractC9024u2.m21792b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 36:
                            AbstractC9024u2.m21801f(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 37:
                            AbstractC9024u2.m21804h(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 38:
                            AbstractC9024u2.m21810n(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 39:
                            AbstractC9024u2.m21803g(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 40:
                            AbstractC9024u2.m21799e(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 41:
                            AbstractC9024u2.m21797d(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 42:
                            AbstractC9024u2.m21786a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 43:
                            AbstractC9024u2.m21809m(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 44:
                            AbstractC9024u2.m21795c(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 45:
                            AbstractC9024u2.m21805i(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 46:
                            AbstractC9024u2.m21806j(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 47:
                            AbstractC9024u2.m21807k(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 48:
                            AbstractC9024u2.m21808l(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                            break;
                        case 49:
                            AbstractC9024u2.m21785a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, m21650c(i));
                            break;
                        case 50:
                            if (AbstractC9040x3.m21839e(obj, i2 & 1048575) == null) {
                                C9048z1 c9048z1 = this.f21049p;
                                Object objM21644b = m21644b(i);
                                c9048z1.getClass();
                                objM21644b.getClass();
                                throw new ClassCastException();
                            }
                            break;
                            break;
                        case 51:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.m21522a(i3, ((Double) AbstractC9040x3.m21839e(obj, i2 & 1048575)).doubleValue());
                            }
                            break;
                        case 52:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.m21523a(i3, ((Float) AbstractC9040x3.m21839e(obj, i2 & 1048575)).floatValue());
                            }
                            break;
                        case 53:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21484b(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                            }
                            break;
                        case 54:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21484b(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                            }
                            break;
                        case 55:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21483b(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 56:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21475a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                            }
                            break;
                        case 57:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21474a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 58:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21479a(i3, ((Boolean) AbstractC9040x3.m21839e(obj, i2 & 1048575)).booleanValue());
                            }
                            break;
                        case 59:
                            if (m21642a(obj, i3, i)) {
                                m21623a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                            }
                            break;
                        case 60:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21477a(i3, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                            }
                            break;
                        case 61:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21478a(i3, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i2 & 1048575));
                            }
                            break;
                        case 62:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21491d(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 63:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21483b(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 64:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21474a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 65:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.f20990a.mo21475a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                            }
                            break;
                        case 66:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.m21524a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                            }
                            break;
                        case 67:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.m21525a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                            }
                            break;
                        case 68:
                            if (m21642a(obj, i3, i)) {
                                c8917c0.m21526a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                            }
                            break;
                    }
                }
            }
            switch ((267386880 & i2) >>> 20) {
                case 0:
                    if (m21639a(i, obj)) {
                        c8917c0.m21522a(i3, AbstractC9040x3.f21172c.mo21763c(obj, i2 & 1048575));
                    }
                    break;
                case 1:
                    if (m21639a(i, obj)) {
                        c8917c0.m21523a(i3, AbstractC9040x3.f21172c.mo21764d(obj, i2 & 1048575));
                    }
                    break;
                case 2:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21484b(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                    }
                    break;
                case 3:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21484b(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                    }
                    break;
                case 4:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21483b(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 5:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21475a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                    }
                    break;
                case 6:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21474a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 7:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21479a(i3, AbstractC9040x3.f21172c.mo21760a(obj, i2 & 1048575));
                    }
                    break;
                case 8:
                    if (m21639a(i, obj)) {
                        m21623a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                    }
                    break;
                case 9:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21477a(i3, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                    }
                    break;
                case 10:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21478a(i3, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i2 & 1048575));
                    }
                    break;
                case 11:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21491d(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 12:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21483b(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 13:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21474a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 14:
                    if (m21639a(i, obj)) {
                        c8917c0.f20990a.mo21475a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                    }
                    break;
                case 15:
                    if (m21639a(i, obj)) {
                        c8917c0.m21524a(i3, AbstractC9040x3.m21836c(obj, i2 & 1048575));
                    }
                    break;
                case 16:
                    if (m21639a(i, obj)) {
                        c8917c0.m21525a(i3, AbstractC9040x3.m21838d(obj, i2 & 1048575));
                    }
                    break;
                case 17:
                    if (m21639a(i, obj)) {
                        c8917c0.m21526a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                    }
                    break;
                case 18:
                    AbstractC9024u2.m21792b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 19:
                    AbstractC9024u2.m21801f(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 20:
                    AbstractC9024u2.m21804h(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 21:
                    AbstractC9024u2.m21810n(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 22:
                    AbstractC9024u2.m21803g(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 23:
                    AbstractC9024u2.m21799e(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 24:
                    AbstractC9024u2.m21797d(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 25:
                    AbstractC9024u2.m21786a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 26:
                    AbstractC9024u2.m21790b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                    break;
                case 27:
                    AbstractC9024u2.m21791b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, m21650c(i));
                    break;
                case 28:
                    AbstractC9024u2.m21784a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                    break;
                case 29:
                    AbstractC9024u2.m21809m(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 30:
                    AbstractC9024u2.m21795c(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 31:
                    AbstractC9024u2.m21805i(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 32:
                    AbstractC9024u2.m21806j(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 33:
                    AbstractC9024u2.m21807k(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 34:
                    AbstractC9024u2.m21808l(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, false);
                    break;
                case 35:
                    AbstractC9024u2.m21792b(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 36:
                    AbstractC9024u2.m21801f(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 37:
                    AbstractC9024u2.m21804h(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 38:
                    AbstractC9024u2.m21810n(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 39:
                    AbstractC9024u2.m21803g(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 40:
                    AbstractC9024u2.m21799e(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 41:
                    AbstractC9024u2.m21797d(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 42:
                    AbstractC9024u2.m21786a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 43:
                    AbstractC9024u2.m21809m(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 44:
                    AbstractC9024u2.m21795c(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 45:
                    AbstractC9024u2.m21805i(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 46:
                    AbstractC9024u2.m21806j(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 47:
                    AbstractC9024u2.m21807k(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 48:
                    AbstractC9024u2.m21808l(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, true);
                    break;
                case 49:
                    AbstractC9024u2.m21785a(this.f21034a[i], (List) AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0, m21650c(i));
                    break;
                case 50:
                    if (AbstractC9040x3.m21839e(obj, i2 & 1048575) == null) {
                        C9048z1 c9048z2 = this.f21049p;
                        Object objM21644b2 = m21644b(i);
                        c9048z2.getClass();
                        objM21644b2.getClass();
                        throw new ClassCastException();
                    }
                    break;
                    break;
                case 51:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.m21522a(i3, ((Double) AbstractC9040x3.m21839e(obj, i2 & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.m21523a(i3, ((Float) AbstractC9040x3.m21839e(obj, i2 & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21484b(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                    }
                    break;
                case 54:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21484b(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                    }
                    break;
                case 55:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21483b(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 56:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21475a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                    }
                    break;
                case 57:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21474a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 58:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21479a(i3, ((Boolean) AbstractC9040x3.m21839e(obj, i2 & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (m21642a(obj, i3, i)) {
                        m21623a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), c8917c0);
                    }
                    break;
                case 60:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21477a(i3, (InterfaceC8925d2) AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                    }
                    break;
                case 61:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21478a(i3, (AbstractC9011s) AbstractC9040x3.m21839e(obj, i2 & 1048575));
                    }
                    break;
                case 62:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21491d(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 63:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21483b(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 64:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21474a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 65:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.f20990a.mo21475a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                    }
                    break;
                case 66:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.m21524a(i3, ((Integer) AbstractC9040x3.m21839e(obj, i2 & 1048575)).intValue());
                    }
                    break;
                case 67:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.m21525a(i3, ((Long) AbstractC9040x3.m21839e(obj, i2 & 1048575)).longValue());
                    }
                    break;
                case 68:
                    if (m21642a(obj, i3, i)) {
                        c8917c0.m21526a(i3, AbstractC9040x3.m21839e(obj, i2 & 1048575), m21650c(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f21048o.getClass();
            C8959j0.m21659a(c8917c0, entry);
            entry = itM21684d.hasNext() ? (Map.Entry) itM21684d.next() : null;
        }
        this.f21047n.getClass();
        ((AbstractC9047z0) obj).unknownFields.m21689a(c8917c0);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: b */
    public final boolean mo21649b(Object obj, Object obj2) {
        int length = this.f21034a.length;
        int i = 0;
        while (true) {
            boolean zM21787a = true;
            if (i >= length) {
                this.f21047n.getClass();
                C8986n3 c8986n3 = ((AbstractC9047z0) obj).unknownFields;
                this.f21047n.getClass();
                if (!c8986n3.equals(((AbstractC9047z0) obj2).unknownFields)) {
                    return false;
                }
                if (!this.f21039f) {
                    return true;
                }
                this.f21048o.getClass();
                C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                this.f21048o.getClass();
                return c8983n0.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
            }
            int[] iArr = this.f21034a;
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (!m21640a(i, obj, obj2)) {
                        zM21787a = false;
                    } else {
                        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
                        if (Double.doubleToLongBits(abstractC9035w3.mo21763c(obj, j)) != Double.doubleToLongBits(abstractC9035w3.mo21763c(obj2, j))) {
                            zM21787a = false;
                        }
                    }
                    break;
                case 1:
                    if (!m21640a(i, obj, obj2)) {
                        zM21787a = false;
                    } else {
                        AbstractC9035w3 abstractC9035w4 = AbstractC9040x3.f21172c;
                        if (Float.floatToIntBits(abstractC9035w4.mo21764d(obj, j)) != Float.floatToIntBits(abstractC9035w4.mo21764d(obj2, j))) {
                            zM21787a = false;
                        }
                    }
                    break;
                case 2:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21838d(obj, j) != AbstractC9040x3.m21838d(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 3:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21838d(obj, j) != AbstractC9040x3.m21838d(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 4:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 5:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21838d(obj, j) != AbstractC9040x3.m21838d(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 6:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 7:
                    if (!m21640a(i, obj, obj2)) {
                        zM21787a = false;
                    } else {
                        AbstractC9035w3 abstractC9035w5 = AbstractC9040x3.f21172c;
                        if (abstractC9035w5.mo21760a(obj, j) != abstractC9035w5.mo21760a(obj2, j)) {
                            zM21787a = false;
                        }
                    }
                    break;
                case 8:
                    if (!m21640a(i, obj, obj2) || !AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j))) {
                        zM21787a = false;
                    }
                    break;
                case 9:
                    if (!m21640a(i, obj, obj2) || !AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j))) {
                        zM21787a = false;
                    }
                    break;
                case 10:
                    if (!m21640a(i, obj, obj2) || !AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j))) {
                        zM21787a = false;
                    }
                    break;
                case 11:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 12:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 13:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 14:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21838d(obj, j) != AbstractC9040x3.m21838d(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 15:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21836c(obj, j) != AbstractC9040x3.m21836c(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 16:
                    if (!m21640a(i, obj, obj2) || AbstractC9040x3.m21838d(obj, j) != AbstractC9040x3.m21838d(obj2, j)) {
                        zM21787a = false;
                    }
                    break;
                case 17:
                    if (!m21640a(i, obj, obj2) || !AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j))) {
                        zM21787a = false;
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
                    zM21787a = AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j));
                    break;
                case 50:
                    zM21787a = AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j));
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
                    long j2 = iArr[i + 2] & 1048575;
                    if (AbstractC9040x3.m21836c(obj, j2) != AbstractC9040x3.m21836c(obj2, j2) || !AbstractC9024u2.m21787a(AbstractC9040x3.m21839e(obj, j), AbstractC9040x3.m21839e(obj2, j))) {
                        zM21787a = false;
                    }
                    break;
            }
            if (!zM21787a) {
                return false;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC9019t2 m21650c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f21035b;
        InterfaceC9019t2 interfaceC9019t2 = (InterfaceC9019t2) objArr[i2];
        if (interfaceC9019t2 != null) {
            return interfaceC9019t2;
        }
        InterfaceC9019t2 interfaceC9019t2M21698a = C8997p2.f21087c.m21698a((Class) objArr[i2 + 1]);
        this.f21035b[i2] = interfaceC9019t2M21698a;
        return interfaceC9019t2M21698a;
    }

    /* JADX INFO: renamed from: c */
    public final void m21651c(int i, Object obj, Object obj2) {
        long j = this.f21034a[i + 1] & 1048575;
        Object objM21839e = AbstractC9040x3.m21839e(obj, j);
        if (objM21839e != null) {
            this.f21049p.getClass();
            if (!((C9043y1) objM21839e).f21182a) {
                this.f21049p.getClass();
                C9043y1 c9043y1 = C9043y1.f21181b;
                C9043y1 c9043y2 = c9043y1.isEmpty() ? new C9043y1() : new C9043y1(c9043y1);
                this.f21049p.getClass();
                C9048z1.m21850a(c9043y2, objM21839e);
                AbstractC9040x3.m21828a(j, obj, c9043y2);
                objM21839e = c9043y2;
            }
        } else {
            this.f21049p.getClass();
            C9043y1 c9043y3 = C9043y1.f21181b;
            objM21839e = c9043y3.isEmpty() ? new C9043y1() : new C9043y1(c9043y3);
            AbstractC9040x3.m21828a(j, obj, objM21839e);
        }
        this.f21049p.getClass();
        this.f21049p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: c */
    public final void mo21652c(Object obj) {
        int i;
        int i2 = this.f21043j;
        while (true) {
            i = this.f21044k;
            if (i2 >= i) {
                break;
            }
            long j = this.f21034a[this.f21042i[i2] + 1] & 1048575;
            Object objM21839e = AbstractC9040x3.m21839e(obj, j);
            if (objM21839e != null) {
                this.f21049p.getClass();
                ((C9043y1) objM21839e).f21182a = false;
                AbstractC9040x3.m21828a(j, obj, objM21839e);
            }
            i2++;
        }
        int length = this.f21042i.length;
        while (i < length) {
            this.f21046m.mo21710a(obj, this.f21042i[i]);
            i++;
        }
        this.f21047n.getClass();
        ((AbstractC9047z0) obj).unknownFields.f21082e = false;
        if (this.f21039f) {
            this.f21048o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21685e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0228 A[PHI: r2
  0x0228: PHI (r2v30 int) = (r2v10 int), (r2v31 int) binds: [B:81:0x0225, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: d */
    public final int mo21653d(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int length = this.f21034a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int[] iArr = this.f21034a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6];
            long j = 1048575 & i7;
            int i9 = 1231;
            int iHashCode = 37;
            switch ((i7 & 267386880) >>> 20) {
                case 0:
                    i = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC9040x3.f21172c.mo21763c(obj, j));
                    Charset charset = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC9040x3.f21172c.mo21764d(obj, j));
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 2:
                    i = i5 * 53;
                    jDoubleToLongBits = AbstractC9040x3.m21838d(obj, j);
                    Charset charset2 = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 3:
                    i = i5 * 53;
                    jDoubleToLongBits = AbstractC9040x3.m21838d(obj, j);
                    Charset charset3 = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 4:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 5:
                    i = i5 * 53;
                    jDoubleToLongBits = AbstractC9040x3.m21838d(obj, j);
                    Charset charset4 = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 6:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 7:
                    i3 = i5 * 53;
                    boolean zMo21760a = AbstractC9040x3.f21172c.mo21760a(obj, j);
                    Charset charset5 = AbstractC8972l1.f21064a;
                    if (!zMo21760a) {
                        i9 = 1237;
                    }
                    i4 = i9 + i3;
                    i5 = i4;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) AbstractC9040x3.m21839e(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 9:
                    Object objM21839e = AbstractC9040x3.m21839e(obj, j);
                    if (objM21839e != null) {
                        iHashCode = objM21839e.hashCode();
                    }
                    iFloatToIntBits = i5 * 53;
                    i2 = iHashCode;
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 11:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 12:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 13:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 14:
                    i = i5 * 53;
                    jDoubleToLongBits = AbstractC9040x3.m21838d(obj, j);
                    Charset charset6 = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 15:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21836c(obj, j);
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 16:
                    i = i5 * 53;
                    jDoubleToLongBits = AbstractC9040x3.m21838d(obj, j);
                    Charset charset7 = AbstractC8972l1.f21064a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 17:
                    Object objM21839e2 = AbstractC9040x3.m21839e(obj, j);
                    if (objM21839e2 != null) {
                        iHashCode = objM21839e2.hashCode();
                    }
                    iFloatToIntBits = i5 * 53;
                    i2 = iHashCode;
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
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
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    i5 = i4;
                    break;
                case 51:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC9040x3.m21839e(obj, j)).doubleValue());
                        Charset charset8 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 52:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC9040x3.m21839e(obj, j)).floatValue());
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 53:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                        Charset charset9 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 54:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                        Charset charset10 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 55:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 56:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                        Charset charset11 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 57:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 58:
                    if (m21642a(obj, i8, i6)) {
                        i3 = i5 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC9040x3.m21839e(obj, j)).booleanValue();
                        Charset charset12 = AbstractC8972l1.f21064a;
                        if (!zBooleanValue) {
                            i9 = 1237;
                        }
                        i4 = i9 + i3;
                        i5 = i4;
                    }
                    break;
                case 59:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) AbstractC9040x3.m21839e(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 60:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 61:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 62:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 63:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 64:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 65:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                        Charset charset13 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 66:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((Integer) AbstractC9040x3.m21839e(obj, j)).intValue();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
                case 67:
                    if (m21642a(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = ((Long) AbstractC9040x3.m21839e(obj, j)).longValue();
                        Charset charset14 = AbstractC8972l1.f21064a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i5 = i4;
                    }
                    break;
                case 68:
                    if (m21642a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = AbstractC9040x3.m21839e(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        i5 = i4;
                    }
                    break;
            }
        }
        this.f21047n.getClass();
        int iHashCode2 = ((AbstractC9047z0) obj).unknownFields.hashCode() + (i5 * 53);
        if (!this.f21039f) {
            return iHashCode2;
        }
        this.f21048o.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f21073a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX INFO: renamed from: d */
    public final void m21654d(int i, Object obj, Object obj2) {
        long j = this.f21034a[i + 1] & 1048575;
        if (m21639a(i, obj2)) {
            Object objM21839e = AbstractC9040x3.m21839e(obj, j);
            Object objM21839e2 = AbstractC9040x3.m21839e(obj2, j);
            if (objM21839e != null && objM21839e2 != null) {
                AbstractC9040x3.m21828a(j, obj, AbstractC8972l1.m21664a(objM21839e, objM21839e2));
                m21646b(i, obj);
            } else if (objM21839e2 != null) {
                AbstractC9040x3.m21828a(j, obj, objM21839e2);
                m21646b(i, obj);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21655e(int i, Object obj, Object obj2) {
        int[] iArr = this.f21034a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (m21642a(obj2, i3, i)) {
            Object objM21839e = m21642a(obj, i3, i) ? AbstractC9040x3.m21839e(obj, j) : null;
            Object objM21839e2 = AbstractC9040x3.m21839e(obj2, j);
            if (objM21839e != null && objM21839e2 != null) {
                AbstractC9040x3.m21828a(j, obj, AbstractC8972l1.m21664a(objM21839e, objM21839e2));
                m21647b(obj, i3, i);
            } else if (objM21839e2 != null) {
                AbstractC9040x3.m21828a(j, obj, objM21839e2);
                m21647b(obj, i3, i);
            }
        }
    }
}
