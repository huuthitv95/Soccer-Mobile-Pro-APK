package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ER */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
public class C5164ER {

    @Nullable
    public final C7472qI A00;
    public final Throwable A01;

    public C5164ER(@Nullable C7472qI c7472qI, Throwable th) {
        this.A00 = c7472qI;
        this.A01 = th;
    }
}
