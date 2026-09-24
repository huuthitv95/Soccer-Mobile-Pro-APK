package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6246W4 implements InterfaceC6215VX {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C6241Vz A01;

    public C6246W4(C6241Vz c6241Vz, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c6241Vz;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6215VX
    public final void AJU() {
        this.A01.A00 = 1.0f;
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6215VX
    public final void AJZ(NativeAd nativeAd) {
        this.A01.A02 = nativeAd.getNativeOptions();
        this.A01.A0G();
        this.A01.A0H();
        this.A01.A0Q(C6140UK.A0L(nativeAd.getInternalNativeAd()), new C6242W0(C6140UK.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6215VX
    public final void AKY() {
        this.A01.A0J();
    }
}
