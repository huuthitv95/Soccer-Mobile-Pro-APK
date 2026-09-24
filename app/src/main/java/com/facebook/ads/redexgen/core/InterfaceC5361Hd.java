package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC5361Hd {
    void A6e(C7472qI c7472qI);

    int AIp(InterfaceC44562c interfaceC44562c, int i, boolean z) throws IOException;

    int AIq(InterfaceC44562c interfaceC44562c, int i, boolean z, int i2) throws IOException;

    void AIr(C45944v c45944v, int i);

    void AIs(C45944v c45944v, int i, int i2);

    void AIu(long j, int i, int i2, int i3, C5359Hb c5359Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
