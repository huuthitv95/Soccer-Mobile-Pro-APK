package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5848PY extends AbstractC5943R7 {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C43751J A00;

    public C5848PY(C43751J c43751j) {
        this.A00 = c43751j;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5943R7
    public final void A0L(C47457M c47457m, int i) {
        int iA25;
        InterfaceC6413Yo interfaceC6413Yo;
        super.A0L(c47457m, i);
        C6972hr linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C43751J c43751j = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c43751j.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC6413Yo = (InterfaceC6413Yo) c47457m.A1F(iA25)) == null) {
                return;
            }
            interfaceC6413Yo.AJF();
        }
    }
}
