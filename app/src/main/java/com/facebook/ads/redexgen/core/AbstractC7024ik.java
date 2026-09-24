package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ik */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7024ik implements InterfaceC5786OW {
    public static byte[] A06;
    public final InterfaceC5768OE A00;
    public final HandlerC5775OL A01;
    public final C6902gi A02;
    public final Handler A03;
    public final String A04;
    public final InterfaceC5780OQ A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, Ascii.NAK, Ascii.SYN, Ascii.DC4, 33, 7, Ascii.DC4, Ascii.DC4, 17, Ascii.DC4, 33, Ascii.f22499SI, 7, Ascii.NAK, Ascii.NAK, 3, 9, 7, 33, Ascii.f22490CR, 7, Ascii.ESC};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z);

    public AbstractC7024ik(C6902gi c6902gi, String str, InterfaceC5781OR interfaceC5781OR) {
        this.A02 = c6902gi;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C7028io(c6902gi, this);
        this.A01 = new HandlerC5775OL(c6902gi, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = interfaceC5781OR.A5S(this.A00, this, this.A01);
    }

    public final InterfaceC5768OE A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AI0();
            A06();
        } else {
            this.A02.A0F().AHs();
            this.A01.A02 = true;
            this.A01.A0E(AbstractC6174Us.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AI6();
        if (!this.A01.A0F(this.A05.A8P(), this.A05.A5R(this.A04))) {
            A09();
            this.A02.A0F().AHy();
        }
    }

    public final void A07() {
        if (!C6171Up.A0u(this.A02)) {
            return;
        }
        ExecutorC6367Y4.A00(new C7025il(this));
    }

    public final void A0A(int i) {
        this.A01.A0D(this.A02, i);
    }

    public final void A0B(int i, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String strA01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(strA01, str);
        } else {
            bundle.putString(strA01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AEs(i, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A9j(message);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5786OW
    public final void AEs(int i, String str, Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i);
        messageObtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C7026im(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
