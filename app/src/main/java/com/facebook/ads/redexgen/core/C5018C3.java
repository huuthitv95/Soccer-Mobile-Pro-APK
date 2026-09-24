package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.C3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5018C3 implements InterfaceC7148ko {
    public final /* synthetic */ AbstractC5026CC A00;

    public C5018C3(final AbstractC5026CC val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2R] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7148ko
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C44452R AAl(final C7149kp splitter, final CharSequence toSplit) {
        return new AbstractC5011Bw(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.2R
            @Override // com.facebook.ads.redexgen.core.AbstractC5011Bw
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5011Bw
            public final int A05(int start) {
                return this.A00.A00.A08(this.A03, start);
            }
        };
    }
}
