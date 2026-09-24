package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7398p5 extends C46365b {
    public static byte[] A02;
    public final int A00;
    public final C46435i A01;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C7398p5(C46435i c46435i, int i, int i2) {
        super(A03(i, i2));
        this.A01 = c46435i;
        this.A00 = i2;
    }

    public C7398p5(IOException iOException, C46435i c46435i, int i, int i2) {
        super(iOException, A03(i, i2));
        this.A01 = c46435i;
        this.A00 = i2;
    }

    public C7398p5(String str, C46435i c46435i, int i, int i2) {
        super(str, A03(i, i2));
        this.A01 = c46435i;
        this.A00 = i2;
    }

    public C7398p5(String str, IOException iOException, C46435i c46435i, int i, int i2) {
        super(str, iOException, A03(i, i2));
        this.A01 = c46435i;
        this.A00 = i2;
    }

    public static int A03(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    public static C7398p5 A04(IOException iOException, C46435i c46435i, int i) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else if (message != null) {
            String strA01 = AbstractC7107k7.A01(message);
            String message2 = A05(0, 26, 62);
            if (strA01.matches(message2)) {
                errorCode = 2007;
            } else {
                errorCode = 2001;
            }
        } else {
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new C4913AM(iOException, c46435i);
        }
        return new C7398p5(iOException, c46435i, errorCode, i);
    }
}
