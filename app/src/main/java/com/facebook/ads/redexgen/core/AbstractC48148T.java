package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8T */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC48148T extends AbstractC7391oy<C48138S, AbstractC48108P, C7204lj> implements InterfaceC7211lq {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{Ascii.f22493FS, 53, 44, 63, 55, 44, 42, 59, 44, 43, -25, 43, 44, 42, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract InterfaceC5490Jj A0g(byte[] bArr, int i, boolean z) throws C7204lj;

    static {
        A0M();
    }

    public AbstractC48148T(String str) {
        super(new C48138S[2], new AbstractC48108P[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1Y] */
    @Override // com.facebook.ads.redexgen.core.AbstractC7391oy
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C43901Y A0c() {
        return new AbstractC48108P(this) { // from class: com.facebook.ads.redexgen.X.1Y
            public final AbstractC48148T A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC48108P, com.facebook.ads.redexgen.core.AbstractC7392oz
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC7391oy
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C7204lj A0Y(C48138S c48138s, AbstractC48108P abstractC48108P, boolean z) {
        try {
            ByteBuffer inputData = (ByteBuffer) AbstractC45353y.A01(c48138s.A02);
            abstractC48108P.A0C(c48138s.A01, A0g(inputData.array(), inputData.limit(), z), c48138s.A00);
            abstractC48108P.A01(Integer.MIN_VALUE);
            return null;
        } catch (C7204lj e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC7391oy
    /* JADX INFO: renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C7204lj A0Z(Throwable th) {
        return new C7204lj(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC7391oy
    /* JADX INFO: renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C48138S A0a() {
        return new C48138S();
    }

    public final void A0h(AbstractC48108P abstractC48108P) {
        super.A0f(abstractC48108P);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7211lq
    public final void AJh(long j) {
    }
}
