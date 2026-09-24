package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4191z0 extends ConstraintLayout {

    /* JADX INFO: renamed from: c */
    public static final a f17082c = new a(null);

    /* JADX INFO: renamed from: a */
    public final GradientDrawable f17083a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3680c6 f17084b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z0$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4191z0(Context context, AttributeSet attributeSet, int i, GradientDrawable backgroundDrawable, InterfaceC3680c6 densityProvider) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f17083a = backgroundDrawable;
        this.f17084b = densityProvider;
        m20091a();
    }

    public /* synthetic */ AbstractC4191z0(Context context, AttributeSet attributeSet, int i, GradientDrawable gradientDrawable, InterfaceC3680c6 interfaceC3680c6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i2 & 16) != 0 ? new C4130w5(context) : interfaceC3680c6);
    }

    /* JADX INFO: renamed from: a */
    public final int m20089a(double d) {
        return this.f17084b.mo17042a(d);
    }

    /* JADX INFO: renamed from: a */
    public final int m20090a(int i) {
        return this.f17084b.mo17043a(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m20091a() {
        GradientDrawable gradientDrawable = this.f17083a;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.f17083a);
    }

    /* JADX INFO: renamed from: a */
    public final void m20092a(boolean z) {
        setBackground(z ? this.f17083a : null);
    }

    public final GradientDrawable getBackgroundDrawable() {
        return this.f17083a;
    }

    public final void setCornerRadius(int i) {
        this.f17083a.setCornerRadius(i);
    }
}
