package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.work.WorkRequest;
import com.chartboost.sdk.C3613R;
import com.chartboost.sdk.Mediation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4081u0 extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public final C3976p5 f16408a;

    /* JADX INFO: renamed from: b */
    public final EnumC4036s f16409b;

    /* JADX INFO: renamed from: c */
    public final C4168y f16410c;

    /* JADX INFO: renamed from: d */
    public final Mediation f16411d;

    /* JADX INFO: renamed from: e */
    public final C4157xa f16412e;

    /* JADX INFO: renamed from: f */
    public final C3695cl f16413f;

    /* JADX INFO: renamed from: g */
    public final C3679c5 f16414g;

    /* JADX INFO: renamed from: h */
    public final C3656b5 f16415h;

    /* JADX INFO: renamed from: i */
    public AbstractC3814i2 f16416i;

    /* JADX INFO: renamed from: j */
    public final C3829ih f16417j;

    /* JADX INFO: renamed from: k */
    public InterfaceC4169y0 f16418k;

    /* JADX INFO: renamed from: l */
    public boolean f16419l;

    /* JADX INFO: renamed from: m */
    public long f16420m;

    /* JADX INFO: renamed from: n */
    public EnumC4032rh f16421n;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$a */
    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19541a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18554g();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19541a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$b */
    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19542a(boolean z) {
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18548a(z);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19542a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19543a() {
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18553e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19543a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19544a() {
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18551c();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19544a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$e */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19545a() {
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18549b();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19545a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$f */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16427a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16428b;

        static {
            int[] iArr = new int[EnumC4125w0.values().length];
            try {
                iArr[EnumC4125w0.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4125w0.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4125w0.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4125w0.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16427a = iArr;
            int[] iArr2 = new int[EnumC4147x0.values().length];
            try {
                iArr2[EnumC4147x0.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC4147x0.VOLUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC4147x0.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC4147x0.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC4147x0.TIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC4147x0.CTA.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f16428b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$g */
    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19546a() {
            C4081u0.this.m19523a(EnumC4147x0.CLOSE, true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19546a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u0$h */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19547a() {
            InterfaceC4169y0 adViewOverlayListener = C4081u0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.mo18552d();
            }
            C3829ih c3829ih = C4081u0.this.f16417j;
            C3658b7 c3658b7 = new C3658b7(C4081u0.this.f16410c.m20000b(), CollectionsKt.emptyList(), EnumC3681c7.COUNTDOWN_COMPLETE, null, null, null, null, null, C4081u0.this.f16411d, 240, null);
            List listM20002d = C4081u0.this.f16410c.m20002d();
            ArrayList<C3865k7> arrayList = new ArrayList();
            for (Object obj : listM20002d) {
                if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.ENGAGEMENT.m18362b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (C3865k7 c3865k7 : arrayList) {
                arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), null, 8, null));
            }
            C3829ih.m18024a(c3829ih, c3658b7, arrayList2, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19547a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4081u0(Context context, C3976p5 c3976p5, EnumC4036s adFormat, C4168y adMarkupConfig, Mediation mediation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.f16408a = c3976p5;
        this.f16409b = adFormat;
        this.f16410c = adMarkupConfig;
        this.f16411d = mediation;
        this.f16417j = C3678c4.f13658b.mo17019a().mo19003q();
        this.f16420m = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f16421n = EnumC4032rh.ARC;
        EnumC4036s enumC4036s = EnumC4036s.BANNER;
        if (adFormat != enumC4036s) {
            setPadding(m19520a(16), m19520a(4), m19520a(16), m19520a(0));
        }
        C4157xa c4157xa = new C4157xa(context, null, 0, null, new a(), 14, null);
        this.f16412e = c4157xa;
        if (adFormat == enumC4036s) {
            c4157xa.m20092a(false);
        }
        C3695cl c3695cl = new C3695cl(context, null, 0, null, null, new b(), 30, null);
        this.f16413f = c3695cl;
        String string = context.getString(C3613R.string.timer_notification_icon_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(C3613R.string.close_button_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(C3613R.string.skip_button_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C3679c5 c3679c5 = new C3679c5(context, null, 0, string, string2, string3, null, new c(), new d(), 70, null);
        C3679c5.m17035a(c3679c5, false, 1, null);
        this.f16414g = c3679c5;
        this.f16415h = new C3656b5(c3679c5);
        if (c3976p5 != null) {
            AbstractC3814i2 abstractC3814i2M18801a = C3941ne.f15515a.m18801a(context, c3976p5, new e());
            this.f16416i = abstractC3814i2M18801a;
            addView(abstractC3814i2M18801a);
            m19516a(this, true, (String) null, 2, (Object) null);
        }
        addView(c4157xa);
        addView(c3695cl);
        addView(c3679c5);
        m19538g();
        m19536f();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19516a(C4081u0 c4081u0, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c4081u0.m19527a(z, str);
    }

    private final void setTimerRunning(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public final int m19519a(double d2) {
        return (int) (d2 * ((double) getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: a */
    public final int m19520a(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: a */
    public final void m19521a() {
        this.f16415h.m16901a();
    }

    /* JADX INFO: renamed from: a */
    public final void m19522a(InterfaceC4101uk tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        tracker.mo18913a(this, EnumC4057sk.f16302i);
        this.f16412e.m19941a(tracker, EnumC4057sk.f16300g);
        this.f16413f.m17216a(tracker, EnumC4057sk.f16296c);
        this.f16414g.getTimerChipView().m19215a(tracker, EnumC4057sk.f16301h);
        this.f16414g.getCloseButton().m19021a(tracker, EnumC4057sk.f16297d);
        this.f16414g.getSkipButton().m20150a(tracker, EnumC4057sk.f16299f);
        AbstractC3814i2 abstractC3814i2 = this.f16416i;
        if (abstractC3814i2 != null) {
            abstractC3814i2.mo17937a(tracker, EnumC4057sk.f16298e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19523a(EnumC4147x0 chip, boolean z) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        switch (f.f16428b[chip.ordinal()]) {
            case 1:
                m19530c(z);
                break;
            case 2:
                m19537f(z);
                break;
            case 3:
                m19524a(z);
                break;
            case 4:
                m19533d(z);
                break;
            case 5:
                m19535e(z);
                break;
            case 6:
                m19528b(z);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19524a(boolean z) {
        this.f16414g.m17037a(z);
        this.f16414g.setImportantForAccessibility(z ? 1 : 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m19525a(boolean z, EnumC4125w0 position, C4103v0 margin, C4103v0 padding, C4103v0 size) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        if (!z) {
            this.f16414g.setVisibility(8);
        } else if (this.f16419l) {
            this.f16414g.setShouldOnlyShowOneButton(true);
        } else {
            this.f16414g.setShouldOnlyShowOneButton(false);
        }
        if (z) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.f16414g.getId(), 1);
            constraintSet.clear(this.f16414g.getId(), 2);
            constraintSet.clear(this.f16414g.getId(), 3);
            constraintSet.clear(this.f16414g.getId(), 4);
            int i = f.f16427a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.f16414g.getId(), 1, 0, 1, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16414g.getId(), 3, 0, 3, m19519a(margin.m19619a()));
            } else if (i == 2) {
                constraintSet.connect(this.f16414g.getId(), 2, 0, 2, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16414g.getId(), 3, 0, 3, m19519a(margin.m19619a()));
            } else if (i == 3) {
                constraintSet.connect(this.f16414g.getId(), 1, 0, 1, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16414g.getId(), 4, 0, 4, m19519a(margin.m19619a()));
            } else if (i == 4) {
                constraintSet.connect(this.f16414g.getId(), 2, 0, 2, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16414g.getId(), 4, 0, 4, m19519a(margin.m19619a()));
            }
            constraintSet.applyTo(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19526a(boolean z, EnumC4125w0 position, C4103v0 margin, C4103v0 padding, C4103v0 size, String imageUrl, String clickthroughUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        m19523a(EnumC4147x0.INFO, z);
        if (z) {
            this.f16412e.m19942a(size);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.f16412e.getId(), 1);
            constraintSet.clear(this.f16412e.getId(), 2);
            constraintSet.clear(this.f16412e.getId(), 3);
            constraintSet.clear(this.f16412e.getId(), 4);
            int i = f.f16427a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.f16412e.getId(), 1, 0, 1, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16412e.getId(), 3, 0, 3, m19519a(margin.m19619a()));
                constraintSet.connect(this.f16413f.getId(), 3, 0, 3, m19519a(margin.m19619a()));
                constraintSet.connect(this.f16414g.getId(), 3, 0, 3, m19519a(margin.m19619a()));
            } else if (i == 2) {
                constraintSet.connect(this.f16412e.getId(), 2, 0, 2, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16412e.getId(), 3, 0, 3, m19519a(margin.m19619a()));
            } else if (i == 3) {
                constraintSet.connect(this.f16412e.getId(), 1, 0, 1, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16412e.getId(), 4, 0, 4, m19519a(margin.m19619a()));
            } else if (i == 4) {
                constraintSet.connect(this.f16412e.getId(), 2, 0, 2, m19519a(margin.m19620b()));
                constraintSet.connect(this.f16412e.getId(), 4, 0, 4, m19519a(margin.m19619a()));
            }
            constraintSet.applyTo(this);
            if (imageUrl.length() > 0) {
                this.f16412e.m19943a(imageUrl);
            }
            this.f16412e.setClickthroughUrl(clickthroughUrl);
            this.f16412e.setEnableSponsorText(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19527a(boolean z, String ctaTextTitle) {
        AbstractC3814i2 abstractC3814i2;
        Intrinsics.checkNotNullParameter(ctaTextTitle, "ctaTextTitle");
        if (this.f16416i == null) {
            return;
        }
        m19523a(EnumC4147x0.CTA, z);
        if (z && (abstractC3814i2 = this.f16416i) != null) {
            abstractC3814i2.setCustomContentDescription(ctaTextTitle);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19528b(boolean z) {
        AbstractC3814i2 abstractC3814i2 = this.f16416i;
        if (abstractC3814i2 != null) {
            abstractC3814i2.setVisibility(z ? 0 : 8);
            abstractC3814i2.setImportantForAccessibility(z ? 1 : 2);
            if (z) {
                C3829ih c3829ih = this.f16417j;
                C3658b7 c3658b7 = new C3658b7(this.f16410c.m20000b(), CollectionsKt.emptyList(), EnumC3681c7.CTA_SHOW, AbstractC3998q5.m19092a(this.f16408a), null, null, null, null, this.f16411d, 240, null);
                List listM20002d = this.f16410c.m20002d();
                ArrayList<C3865k7> arrayList = new ArrayList();
                for (Object obj : listM20002d) {
                    if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.ENGAGEMENT.m18362b())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (C3865k7 c3865k7 : arrayList) {
                    arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), null, 8, null));
                }
                C3829ih.m18024a(c3829ih, c3658b7, arrayList2, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19529b() {
        return this.f16414g.getCloseButton().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m19530c(boolean z) {
        this.f16412e.setVisibility(z ? 0 : 8);
        this.f16412e.setImportantForAccessibility(z ? 1 : 2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19531c() {
        C3966oh c3966ohM16904b = this.f16415h.m16904b();
        return (c3966ohM16904b != null ? c3966ohM16904b.m18972d() : null) == C3966oh.b.STARTED;
    }

    /* JADX INFO: renamed from: d */
    public final void m19532d() {
        this.f16415h.m16905c();
    }

    /* JADX INFO: renamed from: d */
    public final void m19533d(boolean z) {
        this.f16414g.m17038b(z);
        this.f16414g.setImportantForAccessibility(z ? 1 : 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m19534e() {
        this.f16415h.m16906d();
    }

    /* JADX INFO: renamed from: e */
    public final void m19535e(boolean z) {
        this.f16414g.m17039c(z);
        this.f16414g.setImportantForAccessibility(z ? 1 : 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m19536f() {
        this.f16412e.setAccessibilityTraversalBefore(this.f16413f.getId());
        this.f16413f.setAccessibilityTraversalBefore(this.f16414g.getId());
        AbstractC3814i2 abstractC3814i2 = this.f16416i;
        if (abstractC3814i2 != null) {
            this.f16414g.setAccessibilityTraversalBefore(abstractC3814i2.getId());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19537f(boolean z) {
        this.f16413f.setVisibility(z ? 0 : 8);
        this.f16413f.setImportantForAccessibility(z ? 1 : 2);
    }

    /* JADX INFO: renamed from: g */
    public final void m19538g() {
        this.f16412e.setId(View.generateViewId());
        this.f16413f.setId(View.generateViewId());
        this.f16414g.setId(View.generateViewId());
        AbstractC3814i2 abstractC3814i2 = this.f16416i;
        if (abstractC3814i2 != null) {
            abstractC3814i2.setId(View.generateViewId());
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.constrainWidth(this.f16412e.getId(), -2);
        constraintSet.constrainHeight(this.f16412e.getId(), -2);
        constraintSet.connect(this.f16412e.getId(), 1, 0, 1);
        constraintSet.connect(this.f16412e.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.f16413f.getId(), -2);
        constraintSet.constrainHeight(this.f16413f.getId(), -2);
        constraintSet.connect(this.f16413f.getId(), 1, this.f16412e.getId(), 2, (int) (8 * getResources().getDisplayMetrics().density));
        constraintSet.connect(this.f16413f.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.f16414g.getId(), -2);
        constraintSet.constrainHeight(this.f16414g.getId(), -2);
        constraintSet.connect(this.f16414g.getId(), 2, 0, 2);
        constraintSet.connect(this.f16414g.getId(), 3, 0, 3);
        AbstractC3814i2 abstractC3814i3 = this.f16416i;
        if (abstractC3814i3 != null) {
            constraintSet.constrainWidth(abstractC3814i3.getId(), 0);
            constraintSet.connect(abstractC3814i3.getId(), 1, 0, 1);
            constraintSet.connect(abstractC3814i3.getId(), 2, 0, 2);
            constraintSet.connect(abstractC3814i3.getId(), 4, 0, 4);
        }
        constraintSet.applyTo(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m19539g(boolean z) {
        this.f16413f.setMuted(z);
    }

    public final InterfaceC4169y0 getAdViewOverlayListener() {
        return this.f16418k;
    }

    public final boolean getShouldOnlyShowOneButtonForCloseChip() {
        return this.f16414g.getShouldOnlyShowOneButton();
    }

    /* JADX INFO: renamed from: h */
    public final void m19540h() {
        this.f16415h.m16907e();
    }

    public final void setAdViewOverlayListener(InterfaceC4169y0 interfaceC4169y0) {
        this.f16418k = interfaceC4169y0;
    }

    public final void setRewardedMode(boolean z) {
        this.f16419l = z;
        if (!z) {
            this.f16414g.setShouldOnlyShowOneButton(false);
        } else {
            this.f16414g.setShouldOnlyShowOneButton(true);
            this.f16415h.m16903a(new g());
        }
    }

    public final void setShouldOnlyShowOneButtonForCloseChip(boolean z) {
        this.f16414g.setShouldOnlyShowOneButton(z);
    }

    public final void setTimer(long j) {
        String string = getContext().getString(C3613R.string.reward_timer_running);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getContext().getString(C3613R.string.reward_timer_complete);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f16415h.m16902a(j, this.f16421n, string, string2, new h());
    }

    public final void setTimerDuration(long j) {
        this.f16420m = j;
    }
}
