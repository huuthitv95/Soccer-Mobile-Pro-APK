package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7110kA extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public final /* synthetic */ C5700N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, Ascii.f22494GS, 33, 35, 50, 50, 43, 44, 37};
    }

    public C7110kA(C5700N8 c5700n8, String str) {
        this.A00 = c5700n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        String strA00 = A00(0, 17, 81);
        try {
            this.A00.A06.await();
            if (this.A00.A0J(this.A01)) {
                ((C5733Nf) this.A00.A02.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                this.A00.A02.A07(this.A01);
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            this.A00.A03.A08().ABC(strA00, AbstractC6098Td.A1B, new C6099Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A08().ABC(strA00, AbstractC6098Td.A1A, new C6099Te(e2));
        }
    }
}
