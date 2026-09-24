package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3814i2 extends AbstractC4191z0 {

    /* JADX INFO: renamed from: e */
    public static final a f14543e = new a(null);

    /* JADX INFO: renamed from: d */
    public final Function0 f14544d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3814i2(Context context, AttributeSet attributeSet, int i, Function0 function0) {
        super(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14544d = function0;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setPadding(m20090a(16), m20090a(4), m20090a(16), m20090a(4));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17936a(C3976p5 c3976p5);

    /* JADX INFO: renamed from: a */
    public abstract void mo17937a(InterfaceC4101uk interfaceC4101uk, EnumC4057sk enumC4057sk);

    public final Function0<Unit> getOnCtaClicked() {
        return this.f14544d;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription(description);
    }
}
