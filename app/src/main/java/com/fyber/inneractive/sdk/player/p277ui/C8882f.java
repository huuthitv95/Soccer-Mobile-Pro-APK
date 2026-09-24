package com.fyber.inneractive.sdk.player.p277ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9170m1;
import com.fyber.inneractive.sdk.util.C9155h1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8882f implements InterfaceC8877a {
    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8877a
    /* JADX INFO: renamed from: a */
    public final C9155h1 mo21424a(UnitDisplayType unitDisplayType, int i, int i2, C9155h1 c9155h1, int i3, ViewGroup viewGroup) {
        C9155h1 c9155h2 = new C9155h1(0, 0);
        if (unitDisplayType != UnitDisplayType.SQUARE) {
            AbstractC9170m1.m21979a(unitDisplayType, c9155h2, i, i2, c9155h1.f21454a, c9155h1.f21455b);
            return c9155h2;
        }
        int iMin = Math.min(c9155h1.f21454a, i3);
        if (viewGroup != null) {
            viewGroup.getLayoutParams().width = iMin;
            viewGroup.getLayoutParams().height = iMin;
        }
        AbstractC9170m1.m21979a(unitDisplayType, c9155h2, i, i2, iMin, iMin);
        return c9155h2;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8877a
    /* JADX INFO: renamed from: a */
    public final C9155h1 mo21425a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, C9155h1 c9155h1, int i3, int i4, int i5, int i6) {
        C9155h1 c9155h2;
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            c9155h2 = c9155h1;
            AbstractC9170m1.m21979a(unitDisplayType, c9155h2, i, i2, i3, i4);
        } else {
            c9155h2 = c9155h1;
        }
        c9155h2.f21454a = 0;
        c9155h2.f21455b = 0;
        return c9155h2;
    }
}
