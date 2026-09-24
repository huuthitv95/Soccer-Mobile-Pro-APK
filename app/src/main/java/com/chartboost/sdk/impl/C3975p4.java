package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.C3613R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3975p4 extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final b f15778d = new b(null);

    /* JADX INFO: renamed from: e */
    public static final int f15779e = -15262682;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3680c6 f15780a;

    /* JADX INFO: renamed from: b */
    public final Function0 f15781b;

    /* JADX INFO: renamed from: c */
    public final ImageView f15782c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.p4$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f15783b = new a();

        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19022a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19022a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.p4$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3975p4(Context context, AttributeSet attributeSet, int i, InterfaceC3680c6 densityProvider, Function0 onCloseClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        this.f15780a = densityProvider;
        this.f15781b = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(f15779e);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.mo17043a(28), densityProvider.mo17043a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(C3613R.drawable.cb_close_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f15782c = imageView;
        addView(imageView);
    }

    public /* synthetic */ C3975p4(Context context, AttributeSet attributeSet, int i, InterfaceC3680c6 interfaceC3680c6, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new C4130w5(context) : interfaceC3680c6, (i2 & 16) != 0 ? a.f15783b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final void m19021a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f15782c, purpose);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.f15781b.invoke();
        }
        return true;
    }
}
