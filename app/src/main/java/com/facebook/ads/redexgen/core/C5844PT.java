package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5844PT implements InterfaceC6399Ya {
    public static String[] A02 = {"YUGwJzzikBNzfLIllCMdkir2Jyj8DuFq", "ntVfVONdyCctXWp", "AonpNDk7AlTTh7WnvPqW51ITIbVwFUJp", "NJZ9S98WzFijxyBcJxql7T6JOIFmEfw7", "8QFO", "nOxceDp", "zcnAPzBVA2CXXQsDQKs94da1Vf1b77Qu", "s6TvhQwfXdUE9Ss2QaqLkXkKVbAwWXrL"};
    public final /* synthetic */ C5976Re A00;
    public final /* synthetic */ AbstractC5834PJ A01;

    public C5844PT(AbstractC5834PJ abstractC5834PJ, C5976Re c5976Re) {
        this.A01 = abstractC5834PJ;
        this.A00 = c5976Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6399Ya
    public final void ACl(AbstractC6400Yb abstractC6400Yb) {
        if (abstractC6400Yb.getToolbarActionMode() == 8) {
            this.A01.A0d();
            return;
        }
        this.A01.A0G.A04(EnumC6199VH.A07, null);
        if (this.A01.A0l()) {
            return;
        }
        AbstractC5834PJ abstractC5834PJ = this.A01;
        if (A02[3].charAt(29) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "pLKL5MIsKfCUMWoMxvxDNCAoAO8BGlnS";
        strArr[7] = "7PsgTAKpTeXTqL7VuWAjeXRdKL6HZN4L";
        if (abstractC5834PJ.A0i()) {
            this.A01.A0h(this.A00);
        } else {
            this.A01.A0E.A0F().AB0();
            this.A00.finish(1);
        }
    }
}
