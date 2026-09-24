package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.core.AbstractC45353y;
import com.facebook.ads.redexgen.core.AbstractC46115C;
import com.facebook.ads.redexgen.core.HandlerThreadC5243Fi;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC5243Fi A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{Ascii.SYN, Ascii.DC4, Ascii.f22502US, Ascii.f22492FF, Ascii.SYN, Ascii.f22503VT, 7, Ascii.f22492FF, 35, 33, 60, 39, 54, 48, 39, 54, 55, Ascii.f22492FF, 48, 60, Base64.padSymbol, 39, 54, Base64.padSymbol, 39, 4, 6, Ascii.f22490CR, Ascii.f22498RS, 10, 9, 19, Ascii.f22498RS, 50, 52, 51, 39, 32, 34, 36, 45, 36, 50, 50, Ascii.f22498RS, 34, 46, 47, 53, 36, 57, 53, 32, Ascii.ESC, 6, 0, 5, 5, Ascii.SUB, 7, 1, Ascii.DLE, 17, 85, 5, 7, Ascii.f22493FS, Ascii.SUB, 7, 85, 1, Ascii.SUB, 85, 52, 37, 60, 85, Ascii.f22491EM, Ascii.DLE, 3, Ascii.DLE, Ascii.f22491EM, 85, 68, 66, 101, 105, Ascii.f22492FF, Ascii.f22503VT, 8, Ascii.f22490CR, 63, 48, 58, 44, 49, 55, 58, 112, 54, 63, 44, 58, 41, 63, 44, 59, 112, 40, 44, 112, 54, 55, 57, 54, 1, 46, 59, 44, 56, 49, 44, 51, 63, 48, Base64.padSymbol, 59, Ascii.f22503VT, Ascii.f22491EM, Ascii.NAK, Ascii.f22503VT, Ascii.f22490CR, Ascii.SYN, Ascii.f22502US};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        z = true;
        if (!A04) {
            A03 = AbstractC46115C.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z = false;
        }
        return z;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC5243Fi handlerThreadC5243Fi, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = handlerThreadC5243Fi;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String strEglQueryString;
        if (AbstractC46115C.A02 < 26 && (A02(127, 7, 48).equals(AbstractC46115C.A05) || A02(85, 6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).equals(AbstractC46115C.A06))) {
            return 0;
        }
        if ((AbstractC46115C.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 27))) {
            return 0;
        }
        if (strEglQueryString.contains(A02(25, 27, 9))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        AbstractC45353y.A08(!z || A05(context));
        return new HandlerThreadC5243Fi().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (AbstractC46115C.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 61));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
