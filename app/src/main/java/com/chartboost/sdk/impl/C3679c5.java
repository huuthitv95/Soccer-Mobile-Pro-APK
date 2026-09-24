package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3679c5 extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public String f13660a;

    /* JADX INFO: renamed from: b */
    public String f13661b;

    /* JADX INFO: renamed from: c */
    public String f13662c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3680c6 f13663d;

    /* JADX INFO: renamed from: e */
    public final Function0 f13664e;

    /* JADX INFO: renamed from: f */
    public final Function0 f13665f;

    /* JADX INFO: renamed from: g */
    public final C4010qh f13666g;

    /* JADX INFO: renamed from: h */
    public final C3975p4 f13667h;

    /* JADX INFO: renamed from: i */
    public final C4207zg f13668i;

    /* JADX INFO: renamed from: j */
    public boolean f13669j;

    /* JADX INFO: renamed from: k */
    public final int f13670k;

    /* JADX INFO: renamed from: l */
    public final int f13671l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c5$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f13672b = new a();

        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17040a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17040a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c5$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f13673b = new b();

        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17041a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17041a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3679c5(Context context, AttributeSet attributeSet, int i, String timerContentDescription, String closeContentDescription, String skipContentDescription, InterfaceC3680c6 densityProvider, Function0 onCloseClicked, Function0 onSkipClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(closeContentDescription, "closeContentDescription");
        Intrinsics.checkNotNullParameter(skipContentDescription, "skipContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.f13660a = timerContentDescription;
        this.f13661b = closeContentDescription;
        this.f13662c = skipContentDescription;
        this.f13663d = densityProvider;
        this.f13664e = onCloseClicked;
        this.f13665f = onSkipClicked;
        this.f13670k = 28;
        this.f13671l = 8;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        C4130w5 c4130w5 = new C4130w5(context);
        int iMo17043a = c4130w5.mo17043a(28);
        int iMo17043a2 = c4130w5.mo17043a(8);
        C4010qh c4010qh = new C4010qh(context, null, 0, null, null, 30, null);
        c4010qh.setId(View.generateViewId());
        c4010qh.setLayoutParams(new ConstraintLayout.LayoutParams(iMo17043a, iMo17043a));
        c4010qh.setVisibility(8);
        this.f13666g = c4010qh;
        addView(c4010qh);
        C4207zg c4207zg = new C4207zg(context, null, 0, 0, null, null, onSkipClicked, 62, null);
        c4207zg.setId(View.generateViewId());
        c4207zg.setLayoutParams(new ConstraintLayout.LayoutParams(iMo17043a, iMo17043a));
        c4207zg.setVisibility(8);
        this.f13668i = c4207zg;
        addView(c4207zg);
        C3975p4 c3975p4 = new C3975p4(context, null, 0, null, onCloseClicked, 14, null);
        c3975p4.setId(View.generateViewId());
        c3975p4.setLayoutParams(new ConstraintLayout.LayoutParams(iMo17043a, iMo17043a));
        c3975p4.setVisibility(8);
        this.f13667h = c3975p4;
        addView(c3975p4);
        setupConstraints(iMo17043a2);
        m17036a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3679c5(Context context, AttributeSet attributeSet, int i, String str, String str2, String str3, InterfaceC3680c6 interfaceC3680c6, Function0 function0, Function0 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        String string3;
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            string = context.getString(C3613R.string.timer_notification_icon_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i2 & 16) != 0) {
            string2 = context.getString(C3613R.string.close_button_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        if ((i2 & 32) != 0) {
            string3 = context.getString(C3613R.string.skip_button_description);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        } else {
            string3 = str3;
        }
        this(context, attributeSet2, i3, string, string2, string3, (i2 & 64) != 0 ? new C4130w5(context) : interfaceC3680c6, (i2 & 128) != 0 ? a.f13672b : function0, (i2 & 256) != 0 ? b.f13673b : function1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17035a(C3679c5 c3679c5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c3679c5.m17039c(z);
    }

    private final void setupConstraints(int i) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.f13666g.getId(), 1, 0, 1);
        constraintSet.connect(this.f13666g.getId(), 3, 0, 3);
        constraintSet.connect(this.f13666g.getId(), 4, 0, 4);
        constraintSet.connect(this.f13668i.getId(), 1, this.f13666g.getId(), 2, i);
        constraintSet.connect(this.f13668i.getId(), 3, 0, 3);
        constraintSet.connect(this.f13668i.getId(), 4, 0, 4);
        constraintSet.connect(this.f13667h.getId(), 1, this.f13668i.getId(), 2, i);
        constraintSet.connect(this.f13667h.getId(), 3, 0, 3);
        constraintSet.connect(this.f13667h.getId(), 4, 0, 4);
        constraintSet.connect(this.f13667h.getId(), 2, 0, 2);
        constraintSet.applyTo(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m17036a() {
        String str;
        if (this.f13666g.getVisibility() == 0) {
            str = this.f13660a;
        } else if (this.f13667h.getVisibility() == 0) {
            str = this.f13661b;
        } else {
            str = this.f13668i.getVisibility() == 0 ? this.f13662c : null;
        }
        setContentDescription(str);
        setFocusable(getContentDescription() != null);
        setClickable(getContentDescription() != null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17037a(boolean z) {
        this.f13667h.setVisibility(z ? 0 : 8);
        if (z && this.f13669j) {
            m17039c(false);
            m17038b(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17038b(boolean z) {
        this.f13668i.setVisibility(z ? 0 : 8);
        if (z && this.f13669j) {
            m17039c(false);
            m17037a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17039c(boolean z) {
        this.f13666g.setVisibility(z ? 0 : 8);
        if (z && this.f13669j) {
            m17037a(false);
            m17038b(false);
        }
    }

    public final C3975p4 getCloseButton() {
        return this.f13667h;
    }

    public final boolean getShouldOnlyShowOneButton() {
        return this.f13669j;
    }

    public final C4207zg getSkipButton() {
        return this.f13668i;
    }

    public final C4010qh getTimerChipView() {
        return this.f13666g;
    }

    public final void setShouldOnlyShowOneButton(boolean z) {
        this.f13669j = z;
    }
}
