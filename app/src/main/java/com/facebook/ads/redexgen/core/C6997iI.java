package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC4297Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6997iI implements InterfaceC6064T5 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public InterfaceC4297Ad A09;
    public WeakReference<InterfaceC4297Ad> A0A;
    public final C6902gi A0B;
    public final InterfaceC6123U3 A0C;
    public final String A0D;

    public C6997iI(C6902gi c6902gi, String str, InterfaceC4297Ad interfaceC4297Ad, InterfaceC6123U3 interfaceC6123U3) {
        this.A0B = c6902gi;
        this.A0D = str;
        this.A09 = interfaceC4297Ad;
        this.A0A = new WeakReference<>(interfaceC4297Ad);
        this.A0C = interfaceC6123U3;
        c6902gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC6064T5
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final C6902gi A01() {
        return this.A0B;
    }

    public final void A02(InterfaceC4297Ad interfaceC4297Ad) {
        if (interfaceC4297Ad == null && !C6171Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = interfaceC4297Ad;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6064T5
    public final InterfaceC4297Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
