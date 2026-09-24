package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5250Fq extends AbstractC5956RK implements InterfaceC6413Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C5734Ng A00;
    public AbstractC6846fo A01;
    public C6847fp A02;
    public C6847fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C6902gi A06;
    public final C46836M A07;

    public C5250Fq(C46836M c46836m, SparseBooleanArray sparseBooleanArray, C6847fp c6847fp, int i, C6902gi c6902gi, C5734Ng c5734Ng) {
        super(c46836m);
        this.A06 = c6902gi;
        this.A07 = c46836m;
        this.A05 = sparseBooleanArray;
        this.A02 = c6847fp;
        this.A04 = i;
        this.A00 = c5734Ng;
    }

    private void A05(InterfaceC6192VA interfaceC6192VA, C6365Y2 c6365y2, String str, C6740e5 c6740e5) {
        if (this.A05.get(c6740e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C5252Fs(this, str, c6740e5, interfaceC6192VA, c6740e5.A04(), c6365y2);
        this.A03 = new C6847fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C5251Fr(this, c6740e5));
    }

    public final void A0p(C6740e5 c6740e5, InterfaceC6192VA interfaceC6192VA, C6056Sx c6056Sx, C6365Y2 c6365y2, String str, int i, int i2, int i3) {
        int iA02 = c6740e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c6740e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = iA02 == 0 ? i3 : i2;
        if (iA02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String strA08 = c6740e5.A03().A0H().A08();
        String strA09 = c6740e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(c6056Sx.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c6740e5.A03().A0J(), c6740e5.A04());
        this.A07.A1W(c6740e5.A04());
        A05(interfaceC6192VA, c6365y2, str, c6740e5);
    }

    public final void A0q(C6847fp c6847fp) {
        this.A02 = c6847fp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6413Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
