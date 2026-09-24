package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9k */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48769k implements InterfaceC7211lq {
    public static String[] A05 = {"09FvAMDbH0ybjBvy7etGUlmvLnEax64M", "9UhXzLA65KAjnLS2nIkoWygikqgIUMi6", "7x5jjcV5dGluzAi4xLXm7mPjpISGuC5w", "OMb242EU3cjCZF5lkBhqnraDuTpVEe8I", "YkwDHYmprJhwUHAQbO7ClYxi5co4mZVB", "F0wri1MO2ggHk2Yd2fKtZmsEqFQ1SY6P", "VahsyjeijnOod8dsGLMZVGg77qfAqG3R", "hv5jyUmHRXfPhpozztfXRSgwdurH1xzL"};
    public int A00;
    public boolean A01;
    public final C5488Jh A02 = new C5488Jh();
    public final C48138S A03 = new C48138S();
    public final Deque<AbstractC48108P> A04 = new ArrayDeque();

    public C48769k() {
        for (int i = 0; i < 2; i++) {
            this.A04.addFirst(new AbstractC48108P() { // from class: com.facebook.ads.redexgen.X.1c
                @Override // com.facebook.ads.redexgen.core.AbstractC48108P, com.facebook.ads.redexgen.core.AbstractC7392oz
                public final void A0B() {
                    this.A00.A04(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C48138S A5r() throws C7204lj {
        AbstractC45353y.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbstractC48108P A5t() throws C7204lj {
        AbstractC45353y.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        AbstractC48108P abstractC48108PRemoveFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            String[] strArr = A05;
            if (strArr[5].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A05[4] = "JYyYZLdoMjCFjS6FBvPaG66m4kKjUjXi";
            abstractC48108PRemoveFirst.A00(4);
        } else {
            abstractC48108PRemoveFirst.A0C(this.A03.A01, new C7299nT(this.A03.A01, this.A02.A02(((ByteBuffer) AbstractC45353y.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return abstractC48108PRemoveFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void AHJ(C48138S c48138s) throws C7204lj {
        AbstractC45353y.A08(!this.A01);
        AbstractC45353y.A08(this.A00 == 1);
        AbstractC45353y.A07(this.A03 == c48138s);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(AbstractC48108P abstractC48108P) {
        AbstractC45353y.A08(this.A04.size() < 2);
        AbstractC45353y.A07(!this.A04.contains(abstractC48108P));
        abstractC48108P.A0A();
        this.A04.addFirst(abstractC48108P);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    public final void AHb() {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7211lq
    public final void AJh(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    public final void flush() {
        AbstractC45353y.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
