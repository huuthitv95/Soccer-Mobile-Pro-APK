package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7112kC extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public final /* synthetic */ C5700N8 A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C7112kC(C5700N8 c5700n8, JSONObject jSONObject) {
        this.A00 = c5700n8;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                try {
                    this.A00.A02.A0B(this.A01);
                    this.A00.A06.countDown();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            this.A00.A03.A08().ABC(A00(0, 17, 25), AbstractC6098Td.A1B, new C6099Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A08().ABC(A00(0, 17, 25), AbstractC6098Td.A1A, new C6099Te(e2));
        }
    }
}
