package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6492a5 extends LinearLayout {
    public final Bitmap A00;

    public C6492a5(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        super(c6902gi);
        this.A00 = AbstractC6386YN.A01(EnumC6385YM.AD_CHOICE_ICON);
        c6902gi.A0F().AAz(enumC6509aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c6902gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(AbstractC6332XV.A0I, AbstractC6332XV.A0I, AbstractC6332XV.A0I, AbstractC6332XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        AbstractC6374YB.A0N(this, -859190839);
        AbstractC6374YB.A0E(AbstractC6332XV.A0C, this);
    }

    private void setAdChoiceIcon(C6902gi c6902gi) {
        ImageView imageView = new ImageView(c6902gi);
        AbstractC6374YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, AbstractC6332XV.A0U));
        addView(imageView);
    }
}
