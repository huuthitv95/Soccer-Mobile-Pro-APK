package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6454ZT extends View {

    @Nullable
    public InterfaceC6453ZS A00;

    public C6454ZT(C6902gi c6902gi, InterfaceC6453ZS interfaceC6453ZS) {
        super(c6902gi);
        this.A00 = interfaceC6453ZS;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        InterfaceC6453ZS interfaceC6453ZS = this.A00;
    }
}
