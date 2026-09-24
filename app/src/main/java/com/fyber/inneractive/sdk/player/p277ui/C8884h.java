package com.fyber.inneractive.sdk.player.p277ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9170m1;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9155h1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8884h implements InterfaceC8877a {
    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8877a
    /* JADX INFO: renamed from: a */
    public final C9155h1 mo21424a(UnitDisplayType unitDisplayType, int i, int i2, C9155h1 c9155h1, int i3, ViewGroup viewGroup) {
        C9155h1 c9155h2 = new C9155h1(0, 0);
        if (unitDisplayType != UnitDisplayType.SQUARE) {
            AbstractC9170m1.m21979a(unitDisplayType, c9155h2, i, i2, c9155h1.f21454a, c9155h1.f21455b);
            return c9155h2;
        }
        int i4 = c9155h1.f21454a;
        AbstractC9170m1.m21979a(unitDisplayType, c9155h2, i, i2, i4, i4);
        return c9155h2;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8877a
    /* JADX INFO: renamed from: a */
    public final C9155h1 mo21425a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, C9155h1 c9155h1, int i3, int i4, int i5, int i6) {
        if (c9155h1 == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int iMin = Math.min(i3, i5) - AbstractC9174o.m21998b(i6 * 2);
            c9155h1.f21454a = iMin;
            c9155h1.f21455b = iMin;
            return c9155h1;
        }
        if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int iMin2 = Math.min(i3, i5) - AbstractC9174o.m21998b(i6 * 2);
            c9155h1.f21454a = iMin2;
            c9155h1.f21455b = (iMin2 * 9) / 16;
            return c9155h1;
        }
        if (unitDisplayType == UnitDisplayType.MRECT) {
            c9155h1.f21454a = AbstractC9174o.m21998b(300);
            c9155h1.f21455b = AbstractC9174o.m21998b(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            return c9155h1;
        }
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            AbstractC9170m1.m21979a(unitDisplayType, c9155h1, i, i2, i3, i4);
            return c9155h1;
        }
        c9155h1.f21454a = 0;
        c9155h1.f21455b = 0;
        return c9155h1;
    }
}
