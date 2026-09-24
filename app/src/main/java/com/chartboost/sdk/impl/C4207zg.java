package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4207zg extends AbstractC4191z0 {

    /* JADX INFO: renamed from: i */
    public static final b f17141i = new b(null);

    /* JADX INFO: renamed from: d */
    public final int f17142d;

    /* JADX INFO: renamed from: e */
    public final String f17143e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3680c6 f17144f;

    /* JADX INFO: renamed from: g */
    public final Function0 f17145g;

    /* JADX INFO: renamed from: h */
    public final ImageView f17146h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.zg$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f17147b = new a();

        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m20151a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m20151a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.zg$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4207zg(Context context, AttributeSet attributeSet, int i, int i2, String skipButtonContentDescription, InterfaceC3680c6 densityProvider, Function0 onSkipClicked) {
        super(context, attributeSet, i, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skipButtonContentDescription, "skipButtonContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.f17142d = i2;
        this.f17143e = skipButtonContentDescription;
        this.f17144f = densityProvider;
        this.f17145g = onSkipClicked;
        setId(View.generateViewId());
        setCornerRadius(m20090a(14));
        setContentDescription((CharSequence) skipButtonContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
        imageView.setImageResource(i2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.f17146h = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4207zg(Context context, AttributeSet attributeSet, int i, int i2, String str, InterfaceC3680c6 interfaceC3680c6, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i;
        int i5 = (i3 & 8) != 0 ? C3613R.drawable.cb_skip_icon : i2;
        if ((i3 & 16) != 0) {
            string = context.getString(C3613R.string.skip_button_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        this(context, attributeSet2, i4, i5, string, (i3 & 32) != 0 ? new C4130w5(context) : interfaceC3680c6, (i3 & 64) != 0 ? a.f17147b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final void m20150a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f17146h, purpose);
    }

    public final ImageView getIconView() {
        return this.f17146h;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.f17145g.invoke();
        }
        return true;
    }

    public final void setContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setSkipIcon(int i) {
        this.f17146h.setImageResource(i);
    }
}
