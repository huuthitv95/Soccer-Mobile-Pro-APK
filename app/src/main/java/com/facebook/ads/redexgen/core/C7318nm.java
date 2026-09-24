package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7318nm implements InterfaceC5104DT, InterfaceC5105DU {
    public final int A00;
    public final /* synthetic */ C48819p A01;

    public C7318nm(C48819p c48819p, int i) {
        this.A01 = c48819p;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5105DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5104DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5104DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5104DT
    public final int AHP(C47226z c47226z, C7393p0 c7393p0, int i) {
        return this.A01.A0Y(this.A00, c47226z, c7393p0, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5104DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
