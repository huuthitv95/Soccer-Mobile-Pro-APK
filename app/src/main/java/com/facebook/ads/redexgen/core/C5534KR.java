package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5534KR implements InterfaceC6539aq {
    public static byte[] A01;
    public final /* synthetic */ C5521KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, Base64.padSymbol, 59, 53, 72, Base64.padSymbol, 67, 66, 51, Base64.padSymbol, 53, 54};
    }

    public C5534KR(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF7(String str) {
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        AbstractC6374YB.A0O(this.A00.A0H, 8);
        if (this.A00.A0E.A1l() && this.A00.A0I != null) {
            String strA14 = this.A00.A0E.A14();
            if (!TextUtils.isEmpty(strA14)) {
                this.A00.A0I.loadUrl(strA14);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF9(String str) {
        this.A00.A0T = true;
        AbstractC6374YB.A0O(this.A00.A0H, 0);
        this.A00.setUrlToBrowser(str);
        if (!this.A00.A0R && this.A00.A01 > 1) {
            this.A00.A0R = true;
            this.A00.A0h(A00(0, 19, 108));
        }
        C5521KE.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFY(int i) {
        if (this.A00.A0T) {
            this.A00.setBrowserProgressBarValue(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFb(String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFe() {
        this.A00.A0J.A0C().ADJ(14);
    }
}
