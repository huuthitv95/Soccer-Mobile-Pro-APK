package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.he */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6960he extends AbstractC5836PL {
    public static String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final C6957hb A00;

    public C6960he(C6957hb c6957hb) {
        this.A00 = c6957hb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5836PL
    public final void A08(View view, C5881Q6 c5881q6) {
        super.A08(view, c5881q6);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            AbstractC5938R2 layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1E(view, c5881q6);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5836PL
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1Z(view, i, bundle);
        }
        return false;
    }
}
