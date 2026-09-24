package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.redexgen.core.InterfaceC5220FL;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC5219FK<T extends InterfaceC5220FL> extends Handler implements Runnable {
    public static byte[] A0B;
    public static String[] A0C = {"YmYVw2S8DUZhSIJBKV9mYTBB1tKcIZso", "NDdcnO0NsMMFHF2bezmvYcIUkVZ5OtU8", "8rmJYKaybwW0Gr1XfrD6wU0k3D4t0vPA", "YmCBBtrMVj6S7IBVYd0tuHNRqLOHp", "BNlgZVMbySVAlN8KpxiSIEQEMbKarpeH", "QLj0CyLyWcLoHh5we5tUZrDrecYjAsKC", "eBbXtTNPiPKoehNQThYFNgHDUWIcJfTE", "1Eh"};
    public boolean A00;
    public int A01;
    public InterfaceC5217FI<T> A02;
    public IOException A03;
    public Thread A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final T A08;
    public volatile boolean A09;
    public final /* synthetic */ C7277n7 A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.A02.AEi(this.A08, jElapsedRealtime, jElapsedRealtime - this.A07, this.A01);
        this.A03 = null;
        this.A0A.A02.execute((Runnable) AbstractC45353y.A01(this.A0A.A00));
    }

    public static void A04() {
        A0B = new byte[]{-122, -87, -101, -98, -114, -101, -83, -91, -99, -61, -62, -99, -76, -101, -77, -69, -67, -64, -57, 110, -77, -64, -64, -67, -64, 110, -70, -67, -81, -78, -73, -68, -75, 110, -63, -62, -64, -77, -81, -69, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, -12, 1, 1, -2, 1, -81, -5, -2, -16, -13, -8, -3, -10, -81, 2, 3, 1, -12, -16, -4, 5, Ascii.f22498RS, Ascii.NAK, 40, 32, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -48, Ascii.NAK, 40, 19, Ascii.NAK, 32, 36, Ascii.f22491EM, Ascii.f22502US, Ascii.f22498RS, -48, Ascii.CAN, 17, Ascii.f22498RS, Ascii.DC4, Ascii.f22493FS, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, -48, Ascii.f22493FS, Ascii.f22502US, 17, Ascii.DC4, -48, 19, Ascii.f22502US, Ascii.f22494GS, 32, Ascii.f22493FS, Ascii.NAK, 36, Ascii.NAK, Ascii.DC4, -63, -38, -47, -28, -36, -47, -49, -32, -47, -48, -116, -47, -28, -49, -47, -36, -32, -43, -37, -38, -116, -40, -37, -51, -48, -43, -38, -45, -116, -33, -32, -34, -47, -51, -39, Ascii.f22491EM, Ascii.f22493FS, Ascii.f22500SO, 17, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @MetaExoPlayerCustomization("enableContinueLoadingLogging is custom")
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        String[] strArr = A0C;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0C[6] = "QgUPNZuYIqR5G6UUc33KVEWLFVIzbhR6";
        try {
            if (this.A09) {
                return;
            }
            if (message.what == 0) {
                A02();
                this.A00 = false;
                return;
            }
            if (message.what == 3) {
                throw ((Error) message.obj);
            }
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.A07;
            InterfaceC5217FI interfaceC5217FI = (InterfaceC5217FI) AbstractC45353y.A01(this.A02);
            if (this.A05) {
                interfaceC5217FI.AEc(this.A08, jElapsedRealtime, j, false);
                return;
            }
            switch (message.what) {
                case 1:
                    try {
                        interfaceC5217FI.AEe(this.A08, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        AbstractC45794g.A08(A01(0, 8, 0), A01(71, 44, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), e);
                        this.A0A.A01 = new C5224FP(e);
                        return;
                    }
                case 2:
                    this.A03 = (IOException) message.obj;
                    this.A01++;
                    C5218FJ c5218fjAEf = interfaceC5217FI.AEf(this.A08, jElapsedRealtime, j, this.A03, this.A01);
                    if (c5218fjAEf.A00 == 3) {
                        this.A0A.A01 = this.A03;
                        return;
                    } else {
                        if (c5218fjAEf.A00 != 2) {
                            if (c5218fjAEf.A00 == 1) {
                                this.A01 = 1;
                            }
                            this.A00 = true;
                            A06(c5218fjAEf.A01 != -9223372036854775807L ? c5218fjAEf.A01 : A00());
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
            AbstractC6271WU.A00(th, this);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public HandlerC5219FK(C7277n7 c7277n7, Looper looper, T loadable, InterfaceC5217FI<T> interfaceC5217FI, int i, long j) {
        super(looper);
        this.A0A = c7277n7;
        this.A08 = loadable;
        this.A02 = interfaceC5217FI;
        this.A06 = i;
        this.A07 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return AbstractC7032is.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    private void A03() {
        this.A0A.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A05(int i) throws IOException {
        if (this.A03 == null || this.A01 <= i) {
        } else {
            throw this.A03;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A06(long j) {
        AbstractC45353y.A08(this.A0A.A00 == null);
        this.A0A.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A07(boolean z) {
        this.A09 = z;
        this.A03 = null;
        if (hasMessages(0)) {
            this.A05 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A05 = true;
                this.A08.A4r();
                Thread thread = this.A04;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((InterfaceC5217FI) AbstractC45353y.A01(this.A02)).AEc(this.A08, jElapsedRealtime, jElapsedRealtime - this.A07, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z = !this.A05;
                            this.A04 = Thread.currentThread();
                        }
                        if (z) {
                            AbstractC460354.A02(A01(150, 5, 115) + this.A08.getClass().getSimpleName());
                            try {
                                this.A08.AAr();
                                AbstractC460354.A00();
                            } catch (Throwable th) {
                                AbstractC460354.A00();
                                throw th;
                            }
                        }
                        synchronized (this) {
                            this.A04 = null;
                            Thread.interrupted();
                        }
                        if (!this.A09) {
                            sendEmptyMessage(1);
                        }
                    } catch (Throwable th2) {
                        AbstractC6271WU.A00(th2, this);
                    }
                } catch (Error e) {
                    if (!this.A09) {
                        AbstractC45794g.A08(A01(0, 8, 0), A01(40, 31, 85), e);
                        obtainMessage(3, e).sendToTarget();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                if (!this.A09) {
                    AbstractC45794g.A08(A01(0, 8, 0), A01(115, 35, 50), e2);
                    obtainMessage(2, new C5224FP(e2)).sendToTarget();
                }
            }
        } catch (IOException e3) {
            if (!this.A09) {
                obtainMessage(2, e3).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.A09) {
                AbstractC45794g.A08(A01(0, 8, 0), A01(8, 32, 20), e4);
                obtainMessage(2, new C5224FP(e4)).sendToTarget();
            }
        }
    }
}
