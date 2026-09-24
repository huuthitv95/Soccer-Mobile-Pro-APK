package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5046CX {
    public static byte[] A07;
    public static String[] A08 = {"CYKD2nMMR2kwPobHu8vj2zaJDmBsbtuJ", "1T97HHMVTjXeNt4gEkhbfce0p1OpTQmk", "SUWpzIO8VifItPl53IwYK2GxvFHViABr", "RYVPvk", "LWuCRuFF1x0IzMhL3qP3Bi6UDYkfn6RT", "aSZX88VI8Agv5yyz6W8MmPiDkeOBfUV2", "yvrxvgzWs1HIxL", "zzJQ3nHJo9RAIXvSLHnZEz6WzVBAgkTr"};
    public int A00;
    public C5041CS A01;
    public C5045CW A02;
    public final Context A03;
    public final Handler A04 = AbstractC46115C.A0Z();
    public final Requirements A05;
    public final InterfaceC5042CT A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-24, -11, -21, -7, -10, -16, -21, -75, -16, -11, -5, -20, -11, -5, -75, -24, -22, -5, -16, -10, -11, -75, -56, -54, -37, -48, -42, -43, -26, -41, -42, -34, -52, -39, -26, -54, -42, -43, -43, -52, -54, -37, -52, -53, -44, -31, -41, -27, -30, -36, -41, -95, -36, -31, -25, -40, -31, -25, -95, -44, -42, -25, -36, -30, -31, -95, -76, -74, -57, -68, -62, -63, -46, -61, -62, -54, -72, -59, -46, -73, -68, -58, -74, -62, -63, -63, -72, -74, -57, -72, -73, 57, 70, 60, 74, 71, 65, 60, 6, 65, 70, 76, Base64.padSymbol, 70, 76, 6, 57, 59, 76, 65, 71, 70, 6, Ascii.f22493FS, Ascii.f22494GS, 46, 33, Ascii.ESC, Ascii.f22494GS, 55, 43, 44, 39, 42, Ascii.f22491EM, Ascii.f22502US, Ascii.f22494GS, 55, 36, 39, 47, -37, -24, -34, -20, -23, -29, -34, -88, -29, -24, -18, -33, -24, -18, -88, -37, -35, -18, -29, -23, -24, -88, -66, -65, -48, -61, -67, -65, -39, -51, -50, -55, -52, -69, -63, -65, -39, -55, -59, 35, 48, 38, 52, 49, 43, 38, -16, 43, 48, 54, 39, 48, 54, -16, 35, 37, 54, 43, 49, 48, -16, Ascii.NAK, 5, Ascii.DC4, 7, 7, Ascii.DLE, 33, 17, 8, 8, -4, 9, -1, Ascii.f22490CR, 10, 4, -1, -55, 4, 9, Ascii.f22499SI, 0, 9, Ascii.f22499SI, -55, -4, -2, Ascii.f22499SI, 4, 10, 9, -55, -18, -34, -19, -32, -32, -23, -6, -22, -23, -38, -25, -35, -21, -24, -30, -35, -89, -25, -34, -19, -89, -36, -24, -25, -25, -89, -68, -56, -57, -57, -66, -68, -51, -62, -49, -62, -51, -46, -40, -68, -63, -70, -57, -64, -66, 67, 80, 70, 84, 81, 75, 70, Ascii.DLE, 81, 85, Ascii.DLE, 67, 69, 86, 75, 81, 80, Ascii.DLE, 38, 39, 56, 43, 37, 39, 65, 43, 38, 46, 39, 65, 47, 49, 38, 39, 65, 37, 42, 35, 48, 41, 39, 38, -15, -3, -4, -4, -13, -15, 2, -9, 4, -9, 2, 7};
    }

    static {
        A06();
    }

    public C5046CX(Context context, InterfaceC5042CT interfaceC5042CT, Requirements requirements) {
        this.A03 = context.getApplicationContext();
        this.A06 = interfaceC5042CT;
        this.A05 = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        int iA07 = this.A05.A07(this.A03);
        int notMetRequirements = this.A00;
        if (notMetRequirements != iA07) {
            this.A00 = iA07;
            this.A06.AFh(this, iA07);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if ((this.A00 & 3) == 0) {
            return;
        }
        A03();
    }

    private void A05() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC45353y.A01((ConnectivityManager) this.A03.getSystemService(A02(311, 12, 37)));
        this.A02 = new C5045CW(this);
        connectivityManager.registerDefaultNetworkCallback(this.A02);
    }

    public final int A09() {
        this.A00 = this.A05.A07(this.A03);
        IntentFilter intentFilter = new IntentFilter();
        if (this.A05.A0A()) {
            if (AbstractC46115C.A02 >= 24) {
                A05();
            } else {
                intentFilter.addAction(A02(233, 36, 16));
            }
        }
        if (this.A05.A08()) {
            intentFilter.addAction(A02(0, 44, 30));
            intentFilter.addAction(A02(44, 47, 10));
        }
        if (this.A05.A09()) {
            if (AbstractC46115C.A02 >= 23) {
                intentFilter.addAction(A02(269, 42, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
            } else {
                intentFilter.addAction(A02(202, 31, 50));
                String strA02 = A02(170, 32, 89);
                if (A08[1].charAt(13) != 't') {
                    throw new RuntimeException();
                }
                A08[1] = "34fJRbWthZD6PtxUK55RQZaVQ6NgySS1";
                intentFilter.addAction(strA02);
            }
        }
        if (this.A05.A0B()) {
            intentFilter.addAction(A02(91, 40, 111));
            intentFilter.addAction(A02(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 39, 17));
        }
        this.A01 = new C5041CS(this);
        this.A03.registerReceiver(this.A01, intentFilter, null, this.A04);
        return this.A00;
    }

    public final Requirements A0A() {
        return this.A05;
    }
}
