package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5233FY extends AbstractC5956RK implements InterfaceC6413Yo {
    public C5734Ng A00;
    public AbstractC6846fo A01;
    public C6847fp A02;
    public C6847fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C6902gi A09;
    public final AbstractC466867 A0A;

    public C5233FY(AbstractC466867 abstractC466867, SparseBooleanArray sparseBooleanArray, C6847fp c6847fp, int i, int i2, int i3, int i4, C6902gi c6902gi, C5734Ng c5734Ng) {
        super(abstractC466867);
        this.A09 = c6902gi;
        this.A0A = abstractC466867;
        this.A08 = sparseBooleanArray;
        this.A02 = c6847fp;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c5734Ng;
    }

    private void A05(InterfaceC6192VA interfaceC6192VA, C6365Y2 c6365y2, String str, C6740e5 c6740e5) {
        if (this.A08.get(c6740e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C5237Fc(this, str, c6740e5, interfaceC6192VA, c6740e5.A04(), c6365y2);
        this.A03 = new C6847fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C5234FZ(this, c6740e5));
    }

    public final ViewOnClickListenerC5560Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C6740e5 c6740e5, InterfaceC6192VA interfaceC6192VA, C6056Sx c6056Sx, C6365Y2 c6365y2, String str) {
        int iA02 = c6740e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c6740e5.A03().A0H().A08();
        String strA09 = c6740e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c6056Sx.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c6740e5.A03().A0I().A0G(), c6740e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c6740e5.A03().A0J(), c6740e5.A04());
        this.A0A.A1Y(c6740e5.A04());
        A05(interfaceC6192VA, c6365y2, str, c6740e5);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6413Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
