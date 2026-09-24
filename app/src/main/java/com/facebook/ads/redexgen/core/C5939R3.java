package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.R3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5939R3 extends ViewGroup.MarginLayoutParams {
    public AbstractC5956RK A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C5939R3(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C5939R3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C5939R3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C5939R3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C5939R3(C5939R3 c5939r3) {
        super((ViewGroup.LayoutParams) c5939r3);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0O();
    }

    public final boolean A01() {
        return this.A00.A0j();
    }

    public final boolean A02() {
        return this.A00.A0g();
    }

    public final boolean A03() {
        return this.A00.A0f();
    }
}
