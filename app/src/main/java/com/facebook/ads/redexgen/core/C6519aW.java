package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6519aW extends ImageView {
    public static String[] A0B = {"bxOOFOssooUR0RjZyatL4oOd1ggfHKhR", "plfhpGKDQv9IGhMy4A8hpuBVWtzTu73m", "mlkot9yGvNPR", "TmCHOkbW5b1zt9NPZxI16MTUer5XzrjL", "vWAJRy5Sp9zXb743yVWn2E8zfo", "KypmqauLEfpZtoNpXrgclfphsSGW0tHg", "5jpOR", "IeZIdLyfRFMrKrbxyFHDhs6fILRacDEb"};
    public Handler A00;
    public View.OnLayoutChangeListener A01;
    public ViewTreeObserver.OnScrollChangedListener A02;
    public ImageView A03;
    public boolean A04;
    public final View A05;
    public final NativeAdLayout A06;
    public final AbstractC7077jd A07;
    public final C6902gi A08;
    public final EnumC6385YM A09;
    public final InterfaceC6507aK A0A;

    public C6519aW(C6902gi c6902gi, EnumC6509aM enumC6509aM, AbstractC7077jd abstractC7077jd, View view, EnumC6385YM enumC6385YM, NativeAdLayout nativeAdLayout, InterfaceC6507aK interfaceC6507aK) {
        super(c6902gi);
        this.A05 = view;
        this.A09 = enumC6385YM;
        this.A08 = c6902gi;
        this.A06 = nativeAdLayout;
        this.A0A = interfaceC6507aK;
        this.A07 = abstractC7077jd;
        AbstractC6508aL.A02(c6902gi, enumC6509aM);
        A02();
    }

    private int A00(Rect rect) {
        return this.A08.getResources().getDisplayMetrics().widthPixels - rect.left;
    }

    private void A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.A03 = new ImageView(this.A08);
        this.A03.setImageBitmap(AbstractC6386YN.A01(this.A09));
        this.A03.setLayoutParams(layoutParams);
        this.A06.addView(this.A03);
        AbstractC6374YB.A0O(this.A03, 4);
        this.A03.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0C(view);
            }
        });
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new View.OnLayoutChangeListener() { // from class: com.facebook.ads.redexgen.X.aS
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.A00.A0D(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.A02 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.ads.redexgen.X.aT
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.A00.A05();
            }
        };
        this.A03.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC6518aV(this));
    }

    private void A03() {
        if (this.A01 != null) {
            this.A06.removeOnLayoutChangeListener(this.A01);
            this.A01 = null;
        }
        if (this.A02 != null) {
            ViewTreeObserver viewTreeObserver = this.A06.getViewTreeObserver();
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.A02;
            if (A0B[1].charAt(24) != 'W') {
                throw new RuntimeException();
            }
            A0B[3] = "RZhHI7oSNBBsQ6jn8HmNiHu90Tl2574S";
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            this.A02 = null;
        }
    }

    private void A04() {
        this.A00.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.aU
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A09();
            }
        }, this.A07.A27());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A03.getLayoutParams();
        Rect rect = new Rect();
        this.A05.getGlobalVisibleRect(rect);
        Rect nativeAdLayoutLocation = new Rect();
        this.A06.getGlobalVisibleRect(nativeAdLayoutLocation);
        layoutParams.leftMargin = rect.left - nativeAdLayoutLocation.left;
        layoutParams.topMargin = rect.top - nativeAdLayoutLocation.top;
        if (rect.left > A00(nativeAdLayoutLocation) / 2) {
            layoutParams.leftMargin = (layoutParams.leftMargin - this.A03.getWidth()) + this.A05.getWidth();
        }
        layoutParams.topMargin += (this.A05.getHeight() - this.A03.getHeight()) / 2;
        this.A03.setLayoutParams(layoutParams);
        AbstractC6374YB.A0O(this.A03, 0);
        if (A0B[3].charAt(3) != 'H') {
            throw new RuntimeException();
        }
        A0B[0] = "t5NtMJanNbto08EujsjrDgIQKMRNzNUY";
        this.A03.bringToFront();
        if (!this.A04) {
            this.A04 = true;
            if (A0B[6].length() == 21) {
                throw new RuntimeException();
            }
            A0B[5] = "2KnGvfPknQwZySrVrzkTNTPZBlnzDeA4";
            A04();
        }
    }

    private void A06(int i, int i2) {
        AbstractC6374YB.A0O(this.A03, i);
        AbstractC6374YB.A0O(this.A05, i2);
    }

    public final void A09() {
        A03();
        A06(8, 0);
        this.A00.removeCallbacksAndMessages(null);
        this.A04 = false;
    }

    public final void A0A() {
        A06(4, 4);
        this.A03.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aQ
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A05();
            }
        });
        if (this.A01 != null) {
            this.A06.addOnLayoutChangeListener(this.A01);
        }
        if (this.A02 != null) {
            this.A06.getViewTreeObserver().addOnScrollChangedListener(this.A02);
        }
    }

    public final void A0B() {
        A06(4, 4);
        A05();
    }

    public final /* synthetic */ void A0C(View view) {
        A03();
        this.A0A.ADW(view);
    }

    public final /* synthetic */ void A0D(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        A05();
    }
}
