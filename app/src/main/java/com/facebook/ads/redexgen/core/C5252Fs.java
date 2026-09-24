package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5252Fs extends AbstractC6846fo {
    public final /* synthetic */ InterfaceC6192VA A00;
    public final /* synthetic */ C6365Y2 A01;
    public final /* synthetic */ C6740e5 A02;
    public final /* synthetic */ C5250Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C5252Fs(C5250Fq c5250Fq, String str, C6740e5 c6740e5, InterfaceC6192VA interfaceC6192VA, Map map, C6365Y2 c6365y2) {
        this.A03 = c5250Fq;
        this.A04 = str;
        this.A02 = c6740e5;
        this.A00 = interfaceC6192VA;
        this.A05 = map;
        this.A01 = c6365y2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A05.get(this.A02.A02())) {
            this.A00.ABJ(this.A04, new C6558b9(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C5734Ng.A07(this.A03.A00, this.A03.A06);
            this.A03.A05.put(this.A02.A02(), true);
        }
    }
}
