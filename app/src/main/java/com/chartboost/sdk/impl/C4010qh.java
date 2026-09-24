package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qh */
/* JADX INFO: loaded from: classes3.dex */
public final class C4010qh extends AbstractC4191z0 {

    /* JADX INFO: renamed from: k */
    public static final a f15996k = new a(null);

    /* JADX INFO: renamed from: l */
    public static final int f15997l = -14669512;

    /* JADX INFO: renamed from: m */
    public static final int f15998m = -436207617;

    /* JADX INFO: renamed from: n */
    public static final int f15999n = -1;

    /* JADX INFO: renamed from: d */
    public final String f16000d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3680c6 f16001e;

    /* JADX INFO: renamed from: f */
    public final C3988ph f16002f;

    /* JADX INFO: renamed from: g */
    public final TextView f16003g;

    /* JADX INFO: renamed from: h */
    public EnumC4032rh f16004h;

    /* JADX INFO: renamed from: i */
    public String f16005i;

    /* JADX INFO: renamed from: j */
    public String f16006j;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qh$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qh$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16007a;

        static {
            int[] iArr = new int[EnumC4032rh.values().length];
            try {
                iArr[EnumC4032rh.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4032rh.ARC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16007a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4010qh(Context context, AttributeSet attributeSet, int i, String timerContentDescription, InterfaceC3680c6 densityProvider) {
        super(context, attributeSet, i, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f16000d = timerContentDescription;
        this.f16001e = densityProvider;
        this.f16004h = EnumC4032rh.ARC;
        this.f16005i = "Reward in %d seconds";
        this.f16006j = "Reward granted";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
        setCornerRadius(m20090a(14));
        setContentDescription((CharSequence) timerContentDescription);
        C3988ph c3988ph = new C3988ph(context, attributeSet, i, densityProvider);
        c3988ph.setId(View.generateViewId());
        c3988ph.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
        c3988ph.setBackgroundPaintColor(-15262682);
        c3988ph.setArcColor(f15998m);
        this.f16002f = c3988ph;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setTextSize(12.0f);
        textView.setTextColor(f15999n);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        this.f16003g = textView;
        addView(c3988ph);
        addView(textView);
        setFocusable(true);
        setClickable(true);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(c3988ph.getId(), 1, 0, 1);
        constraintSet.connect(c3988ph.getId(), 2, 0, 2);
        constraintSet.connect(c3988ph.getId(), 3, 0, 3);
        constraintSet.connect(c3988ph.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, 0, 1);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4010qh(Context context, AttributeSet attributeSet, int i, String str, InterfaceC3680c6 interfaceC3680c6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str = context.getString(C3613R.string.timer_notification_icon_description);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet2, i3, str, (i2 & 16) != 0 ? new C4130w5(context) : interfaceC3680c6);
    }

    /* JADX INFO: renamed from: a */
    public final String m19212a(long j) {
        return String.valueOf((int) Math.rint(j / 1000.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m19213a(long j, long j2) {
        this.f16002f.setProgress(RangesKt.coerceIn(j / j2, 0.0f, 1.0f));
        m19216b(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m19214a(EnumC4032rh mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f16004h = mode;
        int i = b.f16007a[mode.ordinal()];
        if (i == 1) {
            setLayoutParams(new ConstraintLayout.LayoutParams(-2, m20090a(28)));
            this.f16002f.setVisibility(8);
            this.f16003g.setVisibility(0);
            setCornerRadius(m20090a(14));
            getBackgroundDrawable().setColor(f15997l);
            if (str != null) {
                this.f16005i = str;
            }
            if (str2 != null) {
                this.f16006j = str2;
            }
            this.f16003g.setPadding(m20090a(12), m20090a(8), m20090a(12), m20090a(8));
        } else if (i == 2) {
            setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(28), m20090a(28)));
            this.f16002f.setVisibility(0);
            this.f16003g.setVisibility(0);
            setCornerRadius(m20090a(14));
            getBackgroundDrawable().setColor(-15262682);
            this.f16003g.setPadding(0, 0, 0, 0);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public final void m19215a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f16002f, purpose);
        tracker.mo18913a(this.f16003g, purpose);
    }

    /* JADX INFO: renamed from: b */
    public final void m19216b(long j) {
        int i = b.f16007a[this.f16004h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f16003g.setText(m19212a(j));
        } else {
            if (j <= 0) {
                this.f16003g.setText(this.f16006j);
                return;
            }
            TextView textView = this.f16003g;
            String str = String.format(this.f16005i, Arrays.copyOf(new Object[]{Long.valueOf(j / ((long) 1000))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
    }

    public final C3988ph getTimerArc() {
        return this.f16002f;
    }

    public final TextView getTimerText() {
        return this.f16003g;
    }

    public final void setContentDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setDurationMs(long j) {
        this.f16002f.setProgress(1.0f);
        m19216b(j);
    }
}
