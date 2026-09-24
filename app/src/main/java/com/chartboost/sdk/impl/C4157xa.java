package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xa */
/* JADX INFO: loaded from: classes3.dex */
public final class C4157xa extends AbstractC4191z0 {

    /* JADX INFO: renamed from: i */
    public static final b f16927i = new b(null);

    /* JADX INFO: renamed from: d */
    public final String f16928d;

    /* JADX INFO: renamed from: e */
    public final Function1 f16929e;

    /* JADX INFO: renamed from: f */
    public final ImageView f16930f;

    /* JADX INFO: renamed from: g */
    public final TextView f16931g;

    /* JADX INFO: renamed from: h */
    public String f16932h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xa$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16933b = new a();

        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19945a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19945a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xa$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4157xa(Context context, AttributeSet attributeSet, int i, String infoIconContentDescription, Function1 onInfoIconClicked) {
        super(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(infoIconContentDescription, "infoIconContentDescription");
        Intrinsics.checkNotNullParameter(onInfoIconClicked, "onInfoIconClicked");
        this.f16928d = infoIconContentDescription;
        this.f16929e = onInfoIconClicked;
        this.f16932h = "";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setCornerRadius(m20090a(14));
        setContentDescription(infoIconContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
        imageView.setImageResource(C3613R.drawable.cb_info_icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        this.f16930f = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(context.getString(C3613R.string.sponsored_text));
        textView.setTextSize(12.0f);
        textView.setTextColor(-1);
        textView.setGravity(16);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setVisibility(8);
        textView.setImportantForAccessibility(2);
        this.f16931g = textView;
        addView(imageView);
        addView(textView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, imageView.getId(), 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.setMargin(textView.getId(), 2, m20090a(8));
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4157xa(Context context, AttributeSet attributeSet, int i, String str, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str = context.getString(C3613R.string.info_icon_view_description);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet2, i3, str, (i2 & 16) != 0 ? a.f16933b : function1);
    }

    /* JADX INFO: renamed from: a */
    public final void m19941a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f16930f, purpose);
        tracker.mo18913a(this.f16931g, purpose);
    }

    /* JADX INFO: renamed from: a */
    public final void m19942a(C4103v0 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        ViewGroup.LayoutParams layoutParams = this.f16930f.getLayoutParams();
        layoutParams.width = m20089a(size.m19620b());
        layoutParams.height = m20089a(size.m19619a());
        this.f16930f.setLayoutParams(layoutParams);
        setCornerRadius(m20089a(size.m19619a() / ((double) 2)));
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public final void m19943a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() > 0) {
            return;
        }
        this.f16930f.setImageResource(C3613R.drawable.cb_info_icon);
    }

    /* JADX INFO: renamed from: b */
    public final void m19944b() {
        String str;
        if (this.f16931g.getVisibility() == 0) {
            str = this.f16928d + ": " + ((Object) this.f16931g.getText());
        } else {
            str = this.f16928d;
        }
        setContentDescription(str);
    }

    public final String getClickthroughUrl() {
        return this.f16932h;
    }

    public final ImageView getIconView() {
        return this.f16930f;
    }

    public final TextView getSponsorText() {
        return this.f16931g;
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f16929e.invoke(this.f16932h);
        return super.performClick();
    }

    public final void setClickthroughUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f16932h = url;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        m19944b();
    }

    public final void setEnableSponsorText(boolean z) {
        this.f16931g.setVisibility(z ? 0 : 8);
        m19944b();
    }
}
