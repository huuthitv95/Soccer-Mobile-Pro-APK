package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5869Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C5863Po c5863Po = (C5863Po) view.getLayoutParams();
        C5863Po c5863Po2 = (C5863Po) view2.getLayoutParams();
        if (c5863Po.A05 != c5863Po2.A05) {
            return c5863Po.A05 ? 1 : -1;
        }
        return c5863Po.A02 - c5863Po2.A02;
    }
}
