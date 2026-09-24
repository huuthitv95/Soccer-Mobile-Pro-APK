package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45043S extends AbstractC5150ED {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C6902gi A01;
    public final AbstractC6143UN<C45574K> A02;
    public final AbstractC6143UN<C5140E3> A03;

    public C45043S(C6902gi c6902gi) {
        this(c6902gi, false);
    }

    public C45043S(C6902gi c6902gi, boolean z) {
        ImageView.ScaleType scaleType;
        int color;
        super(c6902gi);
        this.A03 = new C5113Dc(this);
        this.A02 = new C5112Db(this);
        this.A01 = c6902gi;
        this.A00 = new ImageView(c6902gi);
        if (!z) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            color = ViewCompat.MEASURED_STATE_MASK;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        AbstractC6374YB.A0N(this.A00, color);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5150ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C6142UM<AbstractC6143UN, C6141UL> eventBus = getVideoView().getEventBus();
            AbstractC6143UN[] abstractC6143UNArr = new AbstractC6143UN[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC6143UNArr[0] = this.A03;
            abstractC6143UNArr[1] = this.A02;
            eventBus.A03(abstractC6143UNArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5150ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC6557b8 interfaceC6557b8) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC5591LM downloadImageTask = new AsyncTaskC5591LM(this.A00, this.A01).A04();
        if (interfaceC6557b8 != null) {
            downloadImageTask.A06(interfaceC6557b8);
        }
        downloadImageTask.A07(str);
    }
}
