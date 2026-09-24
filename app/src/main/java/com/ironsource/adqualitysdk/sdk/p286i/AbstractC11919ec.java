package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ec */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28764 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28765 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f28766 = {22, Typography.amp, 'd', '7', 'i', 'B', ' ', '@', 'j', 'J', 'F', 'i', 'l', 'n'};

    /* JADX INFO: renamed from: ﾒ */
    private C11904do f28767;

    /* JADX INFO: renamed from: ﾇ */
    public abstract C11908ds mo30123(C11907dr c11907dr, C11877co c11877co);

    public AbstractC11919ec(C11904do c11904do) {
        this.f28767 = c11904do;
    }

    /* JADX INFO: renamed from: ｋ */
    public final C11908ds m30156(C11907dr c11907dr, C11877co c11877co) {
        C11908ds c11908dsMo30123;
        int i = 2 % 2;
        AbstractC11919ec abstractC11919ec = this;
        while (true) {
            c11908dsMo30123 = abstractC11919ec.mo30123(c11907dr, c11877co);
            if (c11908dsMo30123 == null) {
                break;
            }
            int i2 = f28765 + 115;
            f28764 = i2 % 128;
            int i3 = i2 % 2;
            if (!(c11908dsMo30123.m30066() instanceof AbstractC11919ec)) {
                break;
            }
            int i4 = f28765 + 69;
            f28764 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            abstractC11919ec = (AbstractC11919ec) c11908dsMo30123.m30066();
        }
        int i5 = f28764 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28765 = i5 % 128;
        int i6 = i5 % 2;
        return c11908dsMo30123;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[PHI: r7
  0x0026: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v6 java.lang.Object) binds: [B:10:0x0024, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ */
    static String m30152(Object[] objArr) {
        Object obj;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        int i2 = 0;
        boolean z = true;
        while (i2 < length) {
            int i3 = f28764 + 75;
            f28765 = i3 % 128;
            if (i3 % 2 == 0) {
                obj = objArr[i2];
                int i4 = 32 / 0;
                if (!z) {
                    sb.append(m30153(new int[]{0, 2, 0, 0}, "\u0000\u0000", false).intern());
                    int i5 = f28765 + 109;
                    f28764 = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                obj = objArr[i2];
                if (!z) {
                    sb.append(m30153(new int[]{0, 2, 0, 0}, "\u0000\u0000", false).intern());
                    int i7 = f28765 + 109;
                    f28764 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            if (obj instanceof String) {
                int i9 = f28764 + 29;
                f28765 = i9 % 128;
                int i10 = i9 % 2;
                sb.append(m30153(new int[]{2, 1, 166, 1}, "\u0000", true).intern());
                sb.append(obj);
                sb.append(m30153(new int[]{2, 1, 166, 1}, "\u0000", true).intern());
            } else {
                sb.append(obj);
            }
            i2++;
            z = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﻛ */
    public final int m30155() {
        int i = 2 % 2;
        int i2 = f28764 + 75;
        f28765 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
            if (this.f28767 == null) {
                return -1;
            }
        } else if (this.f28767 == null) {
            return -1;
        }
        int iM30038 = this.f28767.m30038();
        int i4 = f28764 + 49;
        f28765 = i4 % 128;
        if (i4 % 2 != 0) {
            return iM30038;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30154() {
        int i = 2 % 2;
        int i2 = f28764;
        int i3 = i2 + 1;
        f28765 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f28767 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30153(new int[]{3, 11, 0, 3}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false).intern());
            sb.append(this.f28767);
            return sb.toString();
        }
        int i5 = i2 + 97;
        f28765 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return "";
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30153(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f28766, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
