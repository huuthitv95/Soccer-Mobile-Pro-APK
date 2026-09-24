package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6593bi extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC6400Yb A00;
    public C6428Z3 A01;
    public final AbstractC7077jd A02;
    public final C6902gi A03;
    public final InterfaceC6406Yh A04;
    public final InterfaceC6592bh A05;
    public final C5183Ek A06;
    public final List<View> A07;

    public C6593bi(C6618c7 c6618c7, AbstractC7077jd abstractC7077jd, C5183Ek c5183Ek, C5110DZ c5110dz, AbstractC6564bF abstractC6564bF, InterfaceC6406Yh interfaceC6406Yh, InterfaceC6592bh interfaceC6592bh) {
        this(c6618c7, abstractC7077jd, c5183Ek, interfaceC6406Yh, interfaceC6592bh, c5110dz, abstractC6564bF);
    }

    public C6593bi(C6618c7 c6618c7, AbstractC7077jd abstractC7077jd, C5183Ek c5183Ek, InterfaceC6406Yh interfaceC6406Yh, InterfaceC6592bh interfaceC6592bh, View... viewArr) {
        this(c6618c7.A06(), c6618c7.A0B(), abstractC7077jd, c5183Ek, interfaceC6406Yh, interfaceC6592bh, viewArr);
    }

    public C6593bi(C6902gi c6902gi, AbstractC6400Yb abstractC6400Yb, AbstractC7077jd abstractC7077jd, C5183Ek c5183Ek, InterfaceC6406Yh interfaceC6406Yh, InterfaceC6592bh interfaceC6592bh, View... viewArr) {
        super(c6902gi);
        this.A07 = new ArrayList();
        this.A03 = c6902gi;
        this.A00 = abstractC6400Yb;
        this.A02 = abstractC7077jd;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC6406Yh;
        this.A06 = c5183Ek;
        this.A05 = interfaceC6592bh;
        A04();
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA0s = this.A02.A0s();
        if (rewardDataA0s == null) {
            strA06 = this.A02.A2B().A05();
        } else {
            strA06 = this.A02.A2B().A06(rewardDataA0s.getCurrency(), rewardDataA0s.getQuantity());
        }
        this.A01 = new C6428Z3(this.A03, -1, ViewCompat.MEASURED_STATE_MASK, strA06, null, this.A02.A2B().A04(), this.A02.A2B().A03(), AbstractC6386YN.A01(EnumC6385YM.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC6590bf(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC6591bg(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0d(EnumC6781el.A07);
        }
        this.A05.ACt();
        if (!this.A02.A29().A0V()) {
            this.A02.A2H(this.A04);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[LOOP:0: B:15:0x004d->B:20:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0024 A[EDGE_INSN: B:23:0x0024->B:8:0x0024 BREAK  A[LOOP:0: B:15:0x004d->B:20:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[SYNTHETIC] */
    public final void A07(ViewGroup viewGroup) {
        Iterator<View> it;
        boolean zHasNext;
        String[] strArr;
        if (this.A06 != null && !this.A06.A0o()) {
            C5183Ek c5183Ek = this.A06;
            String[] strArr2 = A08;
            if (strArr2[0].length() == strArr2[3].length()) {
                String[] strArr3 = A08;
                strArr3[4] = "1Ran1dt8ESvXQPCOL";
                strArr3[1] = BidResponsed.KEY_WN;
                c5183Ek.A0j(false, false, 11);
                AbstractC6374YB.A0O(this.A06, 4);
                if (this.A00 != null) {
                    AbstractC6374YB.A0H(this.A00);
                }
                it = this.A07.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    strArr = A08;
                    if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                        break;
                        break;
                    }
                    String[] strArr4 = A08;
                    strArr4[0] = "6LHnkwVNW3v3BurcJpp";
                    strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
                    if (zHasNext) {
                        View next = it.next();
                        next.clearAnimation();
                        AbstractC6374YB.A0O(next, 4);
                    } else {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        viewGroup.addView(this, layoutParams);
                        this.A05.AEn();
                        return;
                    }
                }
            }
        } else {
            if (this.A00 != null) {
                AbstractC6374YB.A0H(this.A00);
            }
            it = this.A07.iterator();
            while (true) {
                zHasNext = it.hasNext();
                strArr = A08;
                if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                    break;
                }
                String[] strArr5 = A08;
                strArr5[0] = "6LHnkwVNW3v3BurcJpp";
                strArr5[3] = "pBsoAnuzgJgS4JAM4BB";
                if (zHasNext) {
                    View next2 = it.next();
                    next2.clearAnimation();
                    AbstractC6374YB.A0O(next2, 4);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    viewGroup.addView(this, layoutParams2);
                    this.A05.AEn();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }
}
