package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7264mt implements InterfaceC5361Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final /* synthetic */ int AIp(InterfaceC44562c interfaceC44562c, int i, boolean z) {
        return AbstractC5358Ha.A00(this, interfaceC44562c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final /* synthetic */ void AIr(C45944v c45944v, int i) {
        AbstractC5358Ha.A01(this, c45944v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final void A6e(C7472qI c7472qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final int AIq(InterfaceC44562c interfaceC44562c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC44562c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final void AIs(C45944v c45944v, int i, int i2) {
        c45944v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    public final void AIu(long j, int i, int i2, int i3, C5359Hb c5359Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5361Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
