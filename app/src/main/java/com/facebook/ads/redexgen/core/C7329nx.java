package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7329nx implements InterfaceC5031CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public InterfaceC5030CG A00;
    public final AbstractC45153d A01;
    public final C46435i A02;
    public final C47968B A03;
    public final C5671Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC45974y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
            i4++;
        }
    }

    public static void A02() {
        A08 = new byte[]{Ascii.f22502US, 34, 34, Ascii.f22493FS, Ascii.f22498RS, Ascii.ESC, Ascii.f22499SI, 17, 17, Ascii.DLE, Ascii.f22492FF, -1, 7, 9, Ascii.DLE, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5031CH
    public final void A63(InterfaceC5030CG interfaceC5030CG) throws InterruptedException, IOException {
        this.A00 = interfaceC5030CG;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C7330ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) AbstractC45353y.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        AbstractC46115C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC45974y) AbstractC45353y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC45974y) AbstractC45353y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C7329nx(C7461q7 c7461q7, C7128kT c7128kT, Executor executor) {
        this.A05 = (Executor) AbstractC45353y.A01(executor);
        AbstractC45353y.A01(c7461q7.A03);
        this.A02 = new C46405f().A06(c7461q7.A03.A00).A08(c7461q7.A03.A04).A02(4).A09();
        this.A03 = c7128kT.A07();
        this.A04 = new C5671Me(this.A03, this.A02, null, new InterfaceC5670Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.facebook.ads.redexgen.core.InterfaceC5670Md
            public final void AFX(long j, long j2, long j3) {
                this.A00.A03(j, j2, j3);
            }
        });
        this.A01 = c7128kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j2, long j3) {
        float f;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        this.A00.AFW(j, j2, f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5031CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC45974y<Void, IOException> abstractRunnableFutureC45974y = this.A06;
        if (abstractRunnableFutureC45974y != null) {
            abstractRunnableFutureC45974y.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5031CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
