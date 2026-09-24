package com.facebook.ads.redexgen.core;

import android.net.Uri;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7319nn implements InterfaceC5220FL, InterfaceC5064Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C46435i A01;
    public InterfaceC5361Hd A02;
    public boolean A04;
    public final Uri A06;
    public final C454548 A07;
    public final C4907AG A08;
    public final InterfaceC5088DD A09;
    public final InterfaceC5332HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C48819p A0D;
    public final C5353HV A0B = new C5353HV();
    public boolean A03 = true;
    public final long A05 = C5065Cq.A00();

    public C7319nn(C48819p c48819p, Uri uri, InterfaceC7408pF interfaceC7408pF, InterfaceC5088DD interfaceC5088DD, InterfaceC5332HA interfaceC5332HA, C454548 c454548) {
        this.A0D = c48819p;
        this.A06 = uri;
        this.A08 = new C4907AG(interfaceC7408pF);
        this.A09 = interfaceC5088DD;
        this.A0A = interfaceC5332HA;
        this.A07 = c454548;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5220FL
    public final void A4r() {
        this.A0C = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5220FL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAr() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7319nn.AAr():void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5064Cp
    public final void AE5(C45944v c45944v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c45944v.A07();
        InterfaceC5361Hd interfaceC5361Hd = (InterfaceC5361Hd) AbstractC45353y.A01(this.A02);
        interfaceC5361Hd.AIr(c45944v, iA07);
        interfaceC5361Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
