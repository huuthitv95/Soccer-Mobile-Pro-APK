package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13796f;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.e */
/* JADX INFO: compiled from: Http2.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13751e {

    /* JADX INFO: renamed from: a */
    static final C13796f f38952a = C13796f.m40911c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b */
    private static final String[] f38953b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c */
    static final String[] f38954c = new String[64];

    /* JADX INFO: renamed from: d */
    static final String[] f38955d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f38955d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C13723c.m40272a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f38954c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = strArr2[1] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f38954c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f38954c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f38955d[i];
            }
            i++;
        }
    }

    private C13751e() {
    }

    /* JADX INFO: renamed from: a */
    static IllegalArgumentException m40459a(String str, Object... objArr) {
        throw new IllegalArgumentException(C13723c.m40272a(str, objArr));
    }

    /* JADX INFO: renamed from: a */
    static String m40460a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f38955d[b2];
            }
            if (b != 7 && b != 8) {
                String[] strArr = f38954c;
                String str = b2 < strArr.length ? strArr[b2] : f38955d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f38955d[b2];
    }

    /* JADX INFO: renamed from: a */
    static String m40461a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f38953b;
        return C13723c.m40272a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : C13723c.m40272a("0x%02x", Byte.valueOf(b)), m40460a(b, b2));
    }

    /* JADX INFO: renamed from: b */
    static IOException m40462b(String str, Object... objArr) throws IOException {
        throw new IOException(C13723c.m40272a(str, objArr));
    }
}
