package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8M */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC48078M implements InterfaceC7211lq {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C43871V A02;
    public final ArrayDeque<C43871V> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC48108P> A04;
    public final PriorityQueue<C43871V> A05;

    public abstract C7202lh A0Z();

    public abstract void A0b(C48138S c48138s);

    public abstract boolean A0d();

    public AbstractC48078M() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C43871V());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<AbstractC48108P> arrayDeque = this.A04;
            final InterfaceC466564 interfaceC466564 = new InterfaceC466564() { // from class: com.facebook.ads.redexgen.X.li
                @Override // com.facebook.ads.redexgen.core.InterfaceC466564
                public final void AHj(AbstractC7392oz abstractC7392oz) {
                    this.A00.A0c((C43861U) abstractC7392oz);
                }
            };
            arrayDeque.add(new AbstractC48108P(interfaceC466564) { // from class: com.facebook.ads.redexgen.X.1U
                public InterfaceC466564<C43861U> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = interfaceC466564;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC48108P, com.facebook.ads.redexgen.core.AbstractC7392oz
                public final void A0B() {
                    this.A00.AHj(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C43871V c43871v) {
        c43871v.A0A();
        this.A03.add(c43871v);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C48138S A5r() throws C7204lj {
        AbstractC45353y.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A0X */
    public AbstractC48108P A5t() throws C7204lj {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (true) {
            boolean zIsEmpty = this.A05.isEmpty();
            if (A06[5].charAt(7) != 's') {
                throw new RuntimeException();
            }
            A06[6] = "DOprmnWJZ9SCRw8WSrP7EOY5DTOSvJmV";
            if (!zIsEmpty) {
                C43871V c43871vPeek = this.A05.peek();
                if (A06[7].length() != 10) {
                    throw new RuntimeException();
                }
                A06[2] = "urX0HrInINzEpwrp6LaPdmgGjQDQJQna";
                if (((C43871V) AbstractC46115C.A0f(c43871vPeek)).A01 <= this.A00) {
                    C43871V c43871v = (C43871V) AbstractC46115C.A0f(this.A05.poll());
                    if (c43871v.A05()) {
                        AbstractC48108P abstractC48108P = (AbstractC48108P) AbstractC46115C.A0f(this.A04.pollFirst());
                        abstractC48108P.A00(4);
                        A0U(c43871v);
                        String[] strArr = A06;
                        if (strArr[4].charAt(25) != strArr[3].charAt(25)) {
                            return abstractC48108P;
                        }
                        String[] strArr2 = A06;
                        strArr2[4] = "oxl05cpa7UEpdlHPP7s3uyaLsYMYJfaH";
                        strArr2[3] = "7KvbtL7fQFgbKwZtHueu0Zl9fYEN12Vy";
                        return abstractC48108P;
                    }
                    A0b(c43871v);
                    if (A0d()) {
                        C7202lh c7202lhA0Z = A0Z();
                        AbstractC48108P abstractC48108P2 = (AbstractC48108P) AbstractC46115C.A0f(this.A04.pollFirst());
                        long j = c43871v.A01;
                        String[] strArr3 = A06;
                        if (strArr3[4].charAt(25) != strArr3[3].charAt(25)) {
                            throw new RuntimeException();
                        }
                        A06[5] = "oIgvRTusAdocLQHm4RFtRlwv19XF7U3W";
                        abstractC48108P2.A0C(j, c7202lhA0Z, Long.MAX_VALUE);
                        A0U(c43871v);
                        return abstractC48108P2;
                    }
                    A0U(c43871v);
                }
            }
            return null;
        }
    }

    public final AbstractC48108P A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    /* JADX INFO: renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AHJ(C48138S c48138s) throws C7204lj {
        AbstractC45353y.A07(c48138s == this.A02);
        C43871V c43871v = (C43871V) c48138s;
        if (c43871v.A04()) {
            A0U(c43871v);
        } else {
            long j = this.A01;
            this.A01 = 1 + j;
            c43871v.A00 = j;
            this.A05.add(c43871v);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC48108P abstractC48108P) {
        abstractC48108P.A0A();
        this.A04.add(abstractC48108P);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    public void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7211lq
    public void AJh(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC466160
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C43871V) AbstractC46115C.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
