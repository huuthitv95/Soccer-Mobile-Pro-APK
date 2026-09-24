package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7111kB extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public final /* synthetic */ C5700N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C7111kB(C5700N8 c5700n8, String str) {
        this.A00 = c5700n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((C5733Nf) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            InterfaceC6097Tc interfaceC6097TcA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC6097TcA08.ABC(encryptedId, AbstractC6098Td.A1B, new C6099Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            InterfaceC6097Tc interfaceC6097TcA09 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC6097TcA09.ABC(encryptedId2, AbstractC6098Td.A1A, new C6099Te(e2));
        }
    }
}
