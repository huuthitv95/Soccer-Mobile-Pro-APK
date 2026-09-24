package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cl */
/* JADX INFO: loaded from: classes3.dex */
public final class C3695cl extends AbstractC4191z0 {

    /* JADX INFO: renamed from: i */
    public static final a f13764i = new a(null);

    /* JADX INFO: renamed from: d */
    public final String f13765d;

    /* JADX INFO: renamed from: e */
    public final String f13766e;

    /* JADX INFO: renamed from: f */
    public final Function1 f13767f;

    /* JADX INFO: renamed from: g */
    public final ImageView f13768g;

    /* JADX INFO: renamed from: h */
    public boolean f13769h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.cl$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3695cl(Context context, AttributeSet attributeSet, int i, String volumeOnContentDescription, String volumeOffContentDescription, Function1 function1) {
        super(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(volumeOnContentDescription, "volumeOnContentDescription");
        Intrinsics.checkNotNullParameter(volumeOffContentDescription, "volumeOffContentDescription");
        this.f13765d = volumeOnContentDescription;
        this.f13766e = volumeOffContentDescription;
        this.f13767f = function1;
        setId(View.generateViewId());
        setCornerRadius(m20090a(14));
        m17215c();
        setFocusable(true);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
        imageView.setImageResource(C3613R.drawable.cb_volume_on_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.f13768g = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.cl$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3695cl.m17214a(this.f$0, view);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3695cl(Context context, AttributeSet attributeSet, int i, String str, String str2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str = context.getString(C3613R.string.volume_on_description);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i2 & 16) != 0) {
            str2 = context.getString(C3613R.string.volume_off_description);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        this(context, attributeSet, i, str, str2, (i2 & 32) != 0 ? null : function1);
    }

    /* JADX INFO: renamed from: a */
    public static final void m17214a(C3695cl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m17217b();
    }

    /* JADX INFO: renamed from: c */
    private final void m17215c() {
        setContentDescription(this.f13769h ? this.f13766e : this.f13765d);
    }

    /* JADX INFO: renamed from: a */
    public final void m17216a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f13768g, purpose);
    }

    /* JADX INFO: renamed from: b */
    public final void m17217b() {
        boolean z = this.f13769h;
        this.f13769h = !z;
        this.f13768g.setImageResource(!z ? C3613R.drawable.cb_volume_off_icon : C3613R.drawable.cb_volume_on_icon);
        m17215c();
        Function1 function1 = this.f13767f;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.f13769h));
        }
    }

    public final ImageView getIconView() {
        return this.f13768g;
    }

    public final void setMuted(boolean z) {
        if (this.f13769h != z) {
            this.f13769h = z;
            this.f13768g.setImageResource(z ? C3613R.drawable.cb_volume_off_icon : C3613R.drawable.cb_volume_on_icon);
            m17215c();
            Function1 function1 = this.f13767f;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }
}
