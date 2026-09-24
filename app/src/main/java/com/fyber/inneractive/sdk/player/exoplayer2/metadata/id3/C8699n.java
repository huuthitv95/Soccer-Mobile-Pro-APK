package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8570l;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8699n {

    /* JADX INFO: renamed from: b */
    public static final int f20280b = AbstractC8827z.m21379a("ID3");

    /* JADX INFO: renamed from: a */
    public final C8570l f20281a;

    public C8699n() {
        this.f20281a = null;
    }

    public C8699n(C8570l c8570l) {
        this.f20281a = c8570l;
    }

    /* JADX INFO: renamed from: a */
    public static int m21243a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    public static int m21244a(byte[] bArr, int i, int i2) {
        int iM21252b = m21252b(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM21252b;
        }
        while (iM21252b < bArr.length - 1) {
            if (iM21252b % 2 == 0 && bArr[iM21252b + 1] == 0) {
                return iM21252b;
            }
            iM21252b = m21252b(iM21252b + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static C8687b m21245a(C8815n c8815n, int i, int i2) {
        int iM21252b;
        String strConcat;
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c8815n.m21339a(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + new String(bArr, 0, 3, C9415C.ISO88591_NAME).toLowerCase(Locale.US);
            if (strConcat.equals("image/jpg")) {
                strConcat = "image/jpeg";
            }
            iM21252b = 2;
        } else {
            iM21252b = m21252b(0, bArr);
            String lowerCase = new String(bArr, 0, iM21252b, C9415C.ISO88591_NAME).toLowerCase(Locale.US);
            strConcat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i4 = bArr[iM21252b + 1] & 255;
        int i5 = iM21252b + 2;
        int iM21244a = m21244a(bArr, i5, iM21352j);
        return new C8687b(strConcat, new String(bArr, i5, iM21244a - i5, strM21256b), i4, Arrays.copyOfRange(bArr, m21243a(iM21352j) + iM21244a, i3));
    }

    /* JADX INFO: renamed from: a */
    public static C8691f m21246a(C8815n c8815n, int i, int i2, boolean z, int i3, C8570l c8570l) throws Throwable {
        int i4 = c8815n.f20644b;
        int iM21252b = m21252b(i4, c8815n.f20643a);
        String str = new String(c8815n.f20643a, i4, iM21252b - i4, C9415C.ISO88591_NAME);
        c8815n.m21347e(iM21252b + 1);
        int iM21340b = c8815n.m21340b();
        int iM21340b2 = c8815n.m21340b();
        long jM21353k = c8815n.m21353k();
        if (jM21353k == 4294967295L) {
            jM21353k = -1;
        }
        long jM21353k2 = c8815n.m21353k();
        long j = jM21353k2 == 4294967295L ? -1L : jM21353k2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c8815n.f20644b < i5) {
            AbstractC8700o abstractC8700oM21248a = m21248a(i2, c8815n, z, i3, c8570l);
            if (abstractC8700oM21248a != null) {
                arrayList.add(abstractC8700oM21248a);
            }
        }
        AbstractC8700o[] abstractC8700oArr = new AbstractC8700o[arrayList.size()];
        arrayList.toArray(abstractC8700oArr);
        return new C8691f(str, iM21340b, iM21340b2, jM21353k, j, abstractC8700oArr);
    }

    /* JADX INFO: renamed from: a */
    public static C8695j m21247a(int i, C8815n c8815n) {
        if (i < 4) {
            return null;
        }
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        byte[] bArr = new byte[3];
        c8815n.m21339a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c8815n.m21339a(bArr2, 0, i2);
        int iM21244a = m21244a(bArr2, 0, iM21352j);
        String str2 = new String(bArr2, 0, iM21244a, strM21256b);
        int iM21243a = m21243a(iM21352j) + iM21244a;
        return new C8695j(str, str2, iM21243a < i2 ? new String(bArr2, iM21243a, m21244a(bArr2, iM21243a, iM21352j) - iM21243a, strM21256b) : "");
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0199  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e6 A[Catch: all -> 0x0138, UnsupportedEncodingException -> 0x021b, TryCatch #2 {all -> 0x0138, blocks: (B:93:0x0125, B:165:0x01fc, B:168:0x021b, B:95:0x012c, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc A[Catch: all -> 0x0138, UnsupportedEncodingException -> 0x021b, TRY_LEAVE, TryCatch #2 {all -> 0x0138, blocks: (B:93:0x0125, B:165:0x01fc, B:168:0x021b, B:95:0x012c, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:165:0x01fc, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static AbstractC8700o m21248a(int i, C8815n c8815n, boolean z, int i2, C8570l c8570l) throws Throwable {
        int iM21355m;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        AbstractC8700o c8689d;
        AbstractC8700o abstractC8700oM21247a;
        int i4 = i;
        C8815n c8815n2 = c8815n;
        int iM21352j = c8815n2.m21352j();
        int iM21352j2 = c8815n2.m21352j();
        int iM21352j3 = c8815n2.m21352j();
        int iM21352j4 = i4 >= 3 ? c8815n2.m21352j() : 0;
        if (i4 == 4) {
            iM21355m = c8815n2.m21355m();
            if (!z) {
                iM21355m = (((iM21355m >> 24) & 255) << 21) | (iM21355m & 255) | (((iM21355m >> 8) & 255) << 7) | (((iM21355m >> 16) & 255) << 14);
            }
        } else {
            iM21355m = i4 == 3 ? c8815n2.m21355m() : c8815n2.m21354l();
        }
        int iM21357o = i4 >= 3 ? c8815n2.m21357o() : 0;
        if (iM21352j == 0 && iM21352j2 == 0 && iM21352j3 == 0 && iM21352j4 == 0 && iM21355m == 0 && iM21357o == 0) {
            c8815n2.m21347e(c8815n2.f20645c);
            return null;
        }
        int i5 = c8815n2.f20644b;
        int i6 = i5 + iM21355m;
        if (i6 > c8815n2.f20645c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            c8815n2.m21347e(c8815n2.f20645c);
            return null;
        }
        if (c8570l != null && (iM21352j != 67 || iM21352j2 != 79 || iM21352j3 != 77 || (iM21352j4 != 77 && i4 != 2))) {
            c8815n2.m21347e(i6);
            return null;
        }
        if (i4 == 3) {
            z3 = (iM21357o & 128) != 0;
            boolean z7 = (iM21357o & 64) != 0;
            z2 = (iM21357o & 32) != 0;
            z5 = z7;
            z6 = false;
            z4 = z3;
        } else if (i4 == 4) {
            boolean z8 = (iM21357o & 64) != 0;
            boolean z9 = (iM21357o & 8) != 0;
            z5 = (iM21357o & 4) != 0;
            z6 = (iM21357o & 2) != 0;
            if ((iM21357o & 1) != 0) {
                z2 = z8;
                z3 = z9;
                z4 = true;
            } else {
                z2 = z8;
                z3 = z9;
                z4 = false;
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z3 || z5) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c8815n2.m21347e(i6);
            return null;
        }
        if (z2) {
            iM21355m--;
            c8815n2.m21347e(i5 + 1);
        }
        if (z4) {
            iM21355m -= 4;
            c8815n2.m21347e(c8815n2.f20644b + 4);
        }
        if (z6) {
            iM21355m = m21260f(iM21355m, c8815n2);
        }
        try {
            try {
                if (iM21352j == 84 && iM21352j2 == 88 && iM21352j3 == 88 && (i4 == 2 || iM21352j4 == 88)) {
                    abstractC8700oM21247a = m21258d(iM21355m, c8815n2);
                } else if (iM21352j == 84) {
                    abstractC8700oM21247a = m21249a(iM21355m, c8815n2, m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4));
                } else if (iM21352j == 87 && iM21352j2 == 88 && iM21352j3 == 88 && (i4 == 2 || iM21352j4 == 88)) {
                    abstractC8700oM21247a = m21259e(iM21355m, c8815n2);
                } else if (iM21352j == 87) {
                    abstractC8700oM21247a = m21255b(iM21355m, c8815n2, m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4));
                } else if (iM21352j == 80 && iM21352j2 == 82 && iM21352j3 == 73 && iM21352j4 == 86) {
                    abstractC8700oM21247a = m21257c(iM21355m, c8815n2);
                } else {
                    if (iM21352j != 71 || iM21352j2 != 69 || iM21352j3 != 79 || (iM21352j4 != 66 && i4 != 2)) {
                        if (i4 == 2) {
                            if (iM21352j == 80 && iM21352j2 == 73 && iM21352j3 == 67) {
                                abstractC8700oM21247a = m21245a(c8815n2, iM21355m, i4);
                            } else if (iM21352j != 67 && iM21352j2 == 79 && iM21352j3 == 77 && (iM21352j4 == 77 || i4 == 2)) {
                                abstractC8700oM21247a = m21247a(iM21355m, c8815n2);
                            } else if (iM21352j != 67 && iM21352j2 == 72 && iM21352j3 == 65 && iM21352j4 == 80) {
                                i3 = iM21355m;
                                try {
                                    c8689d = m21246a(c8815n2, i3, i4, z, i2, c8570l);
                                    i4 = i;
                                    c8815n2 = c8815n;
                                } catch (UnsupportedEncodingException unused) {
                                    c8815n2 = c8815n;
                                    Log.w("Id3Decoder", "Unsupported character encoding");
                                    c8815n2.m21347e(i6);
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    c8815n2 = c8815n;
                                    c8815n2.m21347e(i6);
                                    throw th;
                                }
                            } else {
                                i3 = iM21355m;
                                if (iM21352j != 67 && iM21352j2 == 84 && iM21352j3 == 79 && iM21352j4 == 67) {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    c8689d = m21253b(c8815n2, i3, i4, z, i2, c8570l);
                                } else {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    String strM21250a = m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4);
                                    byte[] bArr = new byte[i3];
                                    c8815n2.m21339a(bArr, 0, i3);
                                    c8689d = new C8689d(strM21250a, bArr);
                                }
                            }
                        } else if (iM21352j == 65 && iM21352j2 == 80 && iM21352j3 == 73 && iM21352j4 == 67) {
                            abstractC8700oM21247a = m21245a(c8815n2, iM21355m, i4);
                        } else {
                            if (iM21352j != 67) {
                            }
                            if (iM21352j != 67) {
                                i3 = iM21355m;
                                if (iM21352j != 67) {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    String strM21250a2 = m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4);
                                    byte[] bArr2 = new byte[i3];
                                    c8815n2.m21339a(bArr2, 0, i3);
                                    c8689d = new C8689d(strM21250a2, bArr2);
                                } else {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    String strM21250a3 = m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4);
                                    byte[] bArr3 = new byte[i3];
                                    c8815n2.m21339a(bArr3, 0, i3);
                                    c8689d = new C8689d(strM21250a3, bArr3);
                                }
                            } else {
                                i3 = iM21355m;
                                if (iM21352j != 67) {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    String strM21250a4 = m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4);
                                    byte[] bArr4 = new byte[i3];
                                    c8815n2.m21339a(bArr4, 0, i3);
                                    c8689d = new C8689d(strM21250a4, bArr4);
                                } else {
                                    i4 = i;
                                    c8815n2 = c8815n;
                                    String strM21250a5 = m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4);
                                    byte[] bArr5 = new byte[i3];
                                    c8815n2.m21339a(bArr5, 0, i3);
                                    c8689d = new C8689d(strM21250a5, bArr5);
                                }
                            }
                        }
                        if (c8689d == null) {
                            Log.w("Id3Decoder", "Failed to decode frame: id=" + m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4) + ", frameSize=" + i3);
                        }
                        c8815n2.m21347e(i6);
                        return c8689d;
                    }
                    abstractC8700oM21247a = m21254b(iM21355m, c8815n2);
                }
                c8689d = abstractC8700oM21247a;
                i3 = iM21355m;
                if (c8689d == null) {
                    Log.w("Id3Decoder", "Failed to decode frame: id=" + m21250a(i4, iM21352j, iM21352j2, iM21352j3, iM21352j4) + ", frameSize=" + i3);
                }
                c8815n2.m21347e(i6);
                return c8689d;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (UnsupportedEncodingException unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C8704s m21249a(int i, C8815n c8815n, String str) {
        if (i < 1) {
            return null;
        }
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c8815n.m21339a(bArr, 0, i2);
        return new C8704s(str, null, new String(bArr, 0, m21244a(bArr, 0, iM21352j), strM21256b));
    }

    /* JADX INFO: renamed from: a */
    public static String m21250a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[PHI: r3
  0x0086: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:39:0x0083, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static boolean m21251a(C8815n c8815n, int i, int i2, boolean z) {
        int iM21354l;
        long jM21354l;
        int iM21357o;
        int i3;
        int i4 = c8815n.f20644b;
        while (true) {
            try {
                boolean z2 = true;
                if (c8815n.f20645c - c8815n.f20644b < i2) {
                    c8815n.m21347e(i4);
                    return true;
                }
                if (i >= 3) {
                    iM21354l = c8815n.m21340b();
                    jM21354l = c8815n.m21353k();
                    iM21357o = c8815n.m21357o();
                } else {
                    iM21354l = c8815n.m21354l();
                    jM21354l = c8815n.m21354l();
                    iM21357o = 0;
                }
                if (iM21354l == 0 && jM21354l == 0 && iM21357o == 0) {
                    c8815n.m21347e(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM21354l) != 0) {
                        c8815n.m21347e(i4);
                        return false;
                    }
                    jM21354l = (((jM21354l >> 24) & 255) << 21) | (jM21354l & 255) | (((jM21354l >> 8) & 255) << 7) | (((jM21354l >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM21357o & 64) != 0 ? 1 : 0;
                    if ((iM21357o & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM21357o & 32) != 0 ? 1 : 0;
                    if ((iM21357o & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM21354l < i3) {
                    c8815n.m21347e(i4);
                    return false;
                }
                int i5 = c8815n.f20645c;
                int i6 = c8815n.f20644b;
                if (i5 - i6 < jM21354l) {
                    c8815n.m21347e(i4);
                    return false;
                }
                c8815n.m21347e(i6 + ((int) jM21354l));
            } catch (Throwable th) {
                c8815n.m21347e(i4);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21252b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: b */
    public static C8693h m21253b(C8815n c8815n, int i, int i2, boolean z, int i3, C8570l c8570l) throws Throwable {
        int i4 = c8815n.f20644b;
        int iM21252b = m21252b(i4, c8815n.f20643a);
        String str = new String(c8815n.f20643a, i4, iM21252b - i4, C9415C.ISO88591_NAME);
        c8815n.m21347e(iM21252b + 1);
        int iM21352j = c8815n.m21352j();
        boolean z2 = (iM21352j & 2) != 0;
        boolean z3 = (iM21352j & 1) != 0;
        int iM21352j2 = c8815n.m21352j();
        String[] strArr = new String[iM21352j2];
        for (int i5 = 0; i5 < iM21352j2; i5++) {
            int i6 = c8815n.f20644b;
            int iM21252b2 = m21252b(i6, c8815n.f20643a);
            strArr[i5] = new String(c8815n.f20643a, i6, iM21252b2 - i6, C9415C.ISO88591_NAME);
            c8815n.m21347e(iM21252b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c8815n.f20644b < i7) {
            AbstractC8700o abstractC8700oM21248a = m21248a(i2, c8815n, z, i3, c8570l);
            if (abstractC8700oM21248a != null) {
                arrayList.add(abstractC8700oM21248a);
            }
        }
        AbstractC8700o[] abstractC8700oArr = new AbstractC8700o[arrayList.size()];
        arrayList.toArray(abstractC8700oArr);
        return new C8693h(str, z2, z3, strArr, abstractC8700oArr);
    }

    /* JADX INFO: renamed from: b */
    public static C8697l m21254b(int i, C8815n c8815n) {
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c8815n.m21339a(bArr, 0, i2);
        int iM21252b = m21252b(0, bArr);
        String str = new String(bArr, 0, iM21252b, C9415C.ISO88591_NAME);
        int i3 = iM21252b + 1;
        int iM21244a = m21244a(bArr, i3, iM21352j);
        String str2 = new String(bArr, i3, iM21244a - i3, strM21256b);
        int iM21243a = m21243a(iM21352j) + iM21244a;
        int iM21244a2 = m21244a(bArr, iM21243a, iM21352j);
        return new C8697l(str, str2, new String(bArr, iM21243a, iM21244a2 - iM21243a, strM21256b), Arrays.copyOfRange(bArr, m21243a(iM21352j) + iM21244a2, i2));
    }

    /* JADX INFO: renamed from: b */
    public static C8706u m21255b(int i, C8815n c8815n, String str) {
        byte[] bArr = new byte[i];
        c8815n.m21339a(bArr, 0, i);
        return new C8706u(str, null, new String(bArr, 0, m21252b(0, bArr), C9415C.ISO88591_NAME));
    }

    /* JADX INFO: renamed from: b */
    public static String m21256b(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? C9415C.ISO88591_NAME : "UTF-8";
        }
        return "UTF-16BE";
    }

    /* JADX INFO: renamed from: c */
    public static C8702q m21257c(int i, C8815n c8815n) {
        byte[] bArr = new byte[i];
        c8815n.m21339a(bArr, 0, i);
        int iM21252b = m21252b(0, bArr);
        String str = new String(bArr, 0, iM21252b, C9415C.ISO88591_NAME);
        int i2 = iM21252b + 1;
        return new C8702q(str, i2 < i ? Arrays.copyOfRange(bArr, i2, i) : new byte[0]);
    }

    /* JADX INFO: renamed from: d */
    public static C8704s m21258d(int i, C8815n c8815n) {
        if (i < 1) {
            return null;
        }
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c8815n.m21339a(bArr, 0, i2);
        int iM21244a = m21244a(bArr, 0, iM21352j);
        String str = new String(bArr, 0, iM21244a, strM21256b);
        int iM21243a = m21243a(iM21352j) + iM21244a;
        return new C8704s("TXXX", str, iM21243a < i2 ? new String(bArr, iM21243a, m21244a(bArr, iM21243a, iM21352j) - iM21243a, strM21256b) : "");
    }

    /* JADX INFO: renamed from: e */
    public static C8706u m21259e(int i, C8815n c8815n) {
        if (i < 1) {
            return null;
        }
        int iM21352j = c8815n.m21352j();
        String strM21256b = m21256b(iM21352j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c8815n.m21339a(bArr, 0, i2);
        int iM21244a = m21244a(bArr, 0, iM21352j);
        String str = new String(bArr, 0, iM21244a, strM21256b);
        int iM21243a = m21243a(iM21352j) + iM21244a;
        return new C8706u("WXXX", str, iM21243a < i2 ? new String(bArr, iM21243a, m21252b(iM21243a, bArr) - iM21243a, C9415C.ISO88591_NAME) : "");
    }

    /* JADX INFO: renamed from: f */
    public static int m21260f(int i, C8815n c8815n) {
        byte[] bArr = c8815n.f20643a;
        int i2 = c8815n.f20644b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final C8685b m21261a(int i, byte[] bArr) throws Throwable {
        boolean z;
        C8698m c8698m;
        int i2;
        int iM21260f;
        AbstractC8700o abstractC8700oM21248a;
        ArrayList arrayList = new ArrayList();
        C8815n c8815n = new C8815n(i, bArr);
        boolean z2 = false;
        if (i - c8815n.f20644b < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM21354l = c8815n.m21354l();
            if (iM21354l == f20280b) {
                int iM21352j = c8815n.m21352j();
                c8815n.m21347e(c8815n.f20644b + 1);
                int iM21352j2 = c8815n.m21352j();
                int iM21351i = c8815n.m21351i();
                if (iM21352j != 2) {
                    if (iM21352j == 3) {
                        if ((iM21352j2 & 64) != 0) {
                            int iM21340b = c8815n.m21340b();
                            c8815n.m21347e(c8815n.f20644b + iM21340b);
                            iM21351i -= iM21340b + 4;
                        }
                    } else if (iM21352j == 4) {
                        if ((iM21352j2 & 64) != 0) {
                            int iM21351i2 = c8815n.m21351i();
                            c8815n.m21347e(c8815n.f20644b + (iM21351i2 - 4));
                            iM21351i -= iM21351i2;
                        }
                        if ((iM21352j2 & 16) != 0) {
                            iM21351i -= 10;
                        }
                    } else {
                        Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM21352j);
                    }
                    if (iM21352j < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c8698m = new C8698m(z, iM21352j, iM21351i);
                } else if ((iM21352j2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM21352j < 4 || (iM21352j2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c8698m = new C8698m(z, iM21352j, iM21351i);
                }
                if (c8698m == null) {
                    return null;
                }
                int i3 = c8815n.f20644b;
                i2 = c8698m.f20277a == 2 ? 6 : 10;
                iM21260f = c8698m.f20279c;
                if (c8698m.f20278b) {
                    iM21260f = m21260f(iM21260f, c8815n);
                }
                c8815n.m21345d(i3 + iM21260f);
                if (!m21251a(c8815n, c8698m.f20277a, i2, false)) {
                    if (c8698m.f20277a == 4 || !m21251a(c8815n, 4, i2, true)) {
                        Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c8698m.f20277a);
                        return null;
                    }
                    z2 = true;
                }
                while (c8815n.f20645c - c8815n.f20644b >= i2) {
                    abstractC8700oM21248a = m21248a(c8698m.f20277a, c8815n, z2, i2, this.f20281a);
                    if (abstractC8700oM21248a != null) {
                        arrayList.add(abstractC8700oM21248a);
                    }
                }
                return new C8685b(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + iM21354l);
        }
        c8698m = null;
        if (c8698m == null) {
            return null;
        }
        int i4 = c8815n.f20644b;
        if (c8698m.f20277a == 2) {
        }
        iM21260f = c8698m.f20279c;
        if (c8698m.f20278b) {
            iM21260f = m21260f(iM21260f, c8815n);
        }
        c8815n.m21345d(i4 + iM21260f);
        if (!m21251a(c8815n, c8698m.f20277a, i2, false)) {
            if (c8698m.f20277a == 4) {
            }
            Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c8698m.f20277a);
            return null;
        }
        while (c8815n.f20645c - c8815n.f20644b >= i2) {
            abstractC8700oM21248a = m21248a(c8698m.f20277a, c8815n, z2, i2, this.f20281a);
            if (abstractC8700oM21248a != null) {
                arrayList.add(abstractC8700oM21248a);
            }
        }
        return new C8685b(arrayList);
    }
}
