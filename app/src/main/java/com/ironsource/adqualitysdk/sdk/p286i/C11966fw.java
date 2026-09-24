package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11966fw extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﮐ */
    private static boolean f28942 = true;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28943 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28944 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28945 = {199, 184, 185, 188, 181, 'p', 'x', 'y'};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28946 = 80;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f28947 = true;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11961fr f28948;

    /* JADX INFO: renamed from: ｋ */
    private AbstractC11919ec f28949;

    public C11966fw(AbstractC11919ec abstractC11919ec, AbstractC11961fr abstractC11961fr) {
        this.f28949 = abstractC11919ec;
        this.f28948 = abstractC11961fr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        while (this.f28949.m30156(c11907dr, c11877co).m30065()) {
            C11908ds c11908dsMo30195 = this.f28948.mo30195(c11907dr, c11877co);
            if (c11908dsMo30195.m30062()) {
                break;
            }
            int i2 = f28943 + 113;
            f28944 = i2 % 128;
            int i3 = i2 % 2;
            if (c11908dsMo30195.m30064()) {
                return c11908dsMo30195;
            }
        }
        C11908ds c11908ds = new C11908ds(null);
        int i4 = f28944 + 105;
        f28943 = i4 % 128;
        if (i4 % 2 != 0) {
            return c11908ds;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30214(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        sb.append(this.f28949);
        sb.append(m30214(null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), null, "\u0086\u0088").intern());
        sb.append(this.f28948);
        String string = sb.toString();
        int i2 = f28944 + 5;
        f28943 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[RETURN] */
    public final boolean equals(Object obj) {
        C11966fw c11966fw;
        AbstractC11919ec abstractC11919ec;
        AbstractC11961fr abstractC11961fr;
        AbstractC11961fr abstractC11961fr2;
        int i = 2 % 2;
        int i2 = f28944 + 5;
        int i3 = i2 % 128;
        f28943 = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i5 = i3 + 1;
            f28944 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
                if (getClass() == obj.getClass()) {
                    c11966fw = (C11966fw) obj;
                    abstractC11919ec = this.f28949;
                    if (abstractC11919ec != null ? c11966fw.f28949 != null : !abstractC11919ec.equals(c11966fw.f28949)) {
                        return false;
                    }
                    abstractC11961fr = this.f28948;
                    abstractC11961fr2 = c11966fw.f28948;
                    if (abstractC11961fr != null) {
                        return abstractC11961fr.equals(abstractC11961fr2);
                    }
                    if (abstractC11961fr2 == null) {
                        return true;
                    }
                }
            } else if (getClass() == obj.getClass()) {
                c11966fw = (C11966fw) obj;
                abstractC11919ec = this.f28949;
                if (abstractC11919ec != null) {
                    abstractC11961fr = this.f28948;
                    abstractC11961fr2 = c11966fw.f28948;
                    if (abstractC11961fr != null) {
                        return abstractC11961fr.equals(abstractC11961fr2);
                    }
                    if (abstractC11961fr2 == null) {
                        return true;
                    }
                } else {
                    abstractC11961fr = this.f28948;
                    abstractC11961fr2 = c11966fw.f28948;
                    if (abstractC11961fr != null) {
                        return abstractC11961fr.equals(abstractC11961fr2);
                    }
                    if (abstractC11961fr2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28949;
        int iHashCode2 = 0;
        if (abstractC11919ec != null) {
            iHashCode = abstractC11919ec.hashCode();
        } else {
            int i2 = f28943 + 75;
            f28944 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        }
        int i4 = iHashCode * 31;
        AbstractC11961fr abstractC11961fr = this.f28948;
        if (abstractC11961fr != null) {
            int i5 = f28943 + 53;
            f28944 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = abstractC11961fr.hashCode();
        }
        int i7 = i4 + iHashCode2;
        int i8 = f28943 + 89;
        f28944 = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30214(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f28945;
            int i2 = f28946;
            if (f28942) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f28947) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
