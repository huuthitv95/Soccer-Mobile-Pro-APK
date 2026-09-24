package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import com.google.android.material.imageview.ShapeableImageView;
import java.net.URL;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ld */
/* JADX INFO: loaded from: classes3.dex */
public final class C3894ld extends AbstractC3814i2 {

    /* JADX INFO: renamed from: n */
    public static final a f15206n = new a(null);

    /* JADX INFO: renamed from: o */
    public static final int f15207o = C3613R.drawable.chartboost_monetization_default_icon_background;

    /* JADX INFO: renamed from: p */
    public static final int f15208p = Color.parseColor("#4C6EF5");

    /* JADX INFO: renamed from: q */
    public static final Typeface f15209q = Typeface.DEFAULT_BOLD;

    /* JADX INFO: renamed from: f */
    public final String f15210f;

    /* JADX INFO: renamed from: g */
    public final String f15211g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f15212h;

    /* JADX INFO: renamed from: i */
    public final C4127w2 f15213i;

    /* JADX INFO: renamed from: j */
    public final ImageView f15214j;

    /* JADX INFO: renamed from: k */
    public final TextView f15215k;

    /* JADX INFO: renamed from: l */
    public final Button f15216l;

    /* JADX INFO: renamed from: m */
    public Job f15217m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ld$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ld$b */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15218b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f15219c;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ URL f15221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URL url, Continuation continuation) {
            super(2, continuation);
            this.f15221e = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = C3894ld.this.new b(this.f15221e, continuation);
            bVar.f15219c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15218b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f15219c;
                C4127w2 c4127w2 = C3894ld.this.f15213i;
                String string = this.f15221e.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.f15219c = coroutineScope;
                this.f15218b = 1;
                obj = c4127w2.m19737a(string, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C3894ld c3894ld = C3894ld.this;
                c3894ld.getIconView().setImageBitmap(bitmap);
                c3894ld.getIconView().setVisibility(0);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C3894ld.this.getIconView().setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ld$c */
    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18508a(Throwable th) {
            C3894ld.this.setAppIconDownloadJob(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18508a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3894ld(Context context, AttributeSet attributeSet, int i, String persistentCtaContentDescription, String openButtonContentDescription, CoroutineDispatcher dispatcher, C4127w2 cbImageDownloader, final Function0 function0) {
        super(context, attributeSet, i, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        Intrinsics.checkNotNullParameter(openButtonContentDescription, "openButtonContentDescription");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.f15210f = persistentCtaContentDescription;
        this.f15211g = openButtonContentDescription;
        this.f15212h = dispatcher;
        this.f15213i = cbImageDownloader;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, m20090a(84)));
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(View.generateViewId());
        shapeableImageView.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(48), m20090a(48)));
        shapeableImageView.setImageResource(f15207o);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setImportantForAccessibility(2);
        shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(0, m20090a(12)).build());
        this.f15214j = shapeableImageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.matchConstraintMinWidth = m20090a(100);
        textView.setLayoutParams(layoutParams);
        textView.setText("App Name");
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setTypeface(f15209q);
        textView.setGravity(16);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        this.f15215k = textView;
        Button button = new Button(context);
        button.setId(View.generateViewId());
        button.setLayoutParams(new ConstraintLayout.LayoutParams(-2, m20090a(44)));
        button.setText("Get");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setGravity(17);
        button.setMinWidth(m20090a(80));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m20090a(8));
        gradientDrawable.setColor(f15208p);
        button.setBackground(gradientDrawable);
        button.setPadding(m20090a(16), 0, m20090a(16), 0);
        button.setContentDescription(openButtonContentDescription);
        button.setFocusable(true);
        button.setClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.ld$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3894ld.m18505a(function0, view);
            }
        });
        this.f15216l = button;
        setContentDescription(persistentCtaContentDescription);
        addView(shapeableImageView);
        addView(textView);
        addView(button);
        m18506b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3894ld(Context context, AttributeSet attributeSet, int i, String str, String str2, CoroutineDispatcher coroutineDispatcher, C4127w2 c4127w2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            string = context.getString(C3613R.string.persistent_cta_description, "App Name");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i2 & 16) != 0) {
            string2 = context.getString(C3613R.string.open_app_button_description, "App Name");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        this(context, attributeSet, i3, string, string2, (i2 & 32) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i2 & 64) != 0 ? new C4127w2(null, null, null, 7, null) : c4127w2, (i2 & 128) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18505a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3814i2
    /* JADX INFO: renamed from: a */
    public void mo17936a(C3976p5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C3928n1 c3928n1M19023a = config.m19023a();
        setTitle(c3928n1M19023a != null ? c3928n1M19023a.m18701c() : null);
        setIcon(c3928n1M19023a != null ? c3928n1M19023a.m18700b() : null);
        setOpenText(c3928n1M19023a != null ? c3928n1M19023a.m18699a() : null);
        m18506b();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3814i2
    /* JADX INFO: renamed from: a */
    public void mo17937a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f15214j, purpose);
        tracker.mo18913a(this.f15215k, purpose);
        tracker.mo18913a(this.f15216l, purpose);
    }

    /* JADX INFO: renamed from: b */
    public final void m18506b() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(this.f15216l.getId(), 3);
        constraintSet.clear(this.f15216l.getId(), 4);
        constraintSet.connect(this.f15216l.getId(), 3, 0, 3);
        constraintSet.connect(this.f15216l.getId(), 4, 0, 4);
        constraintSet.clear(this.f15216l.getId(), 1);
        constraintSet.clear(this.f15216l.getId(), 2);
        if (this.f15214j.getVisibility() == 0) {
            constraintSet.clear(this.f15214j.getId(), 3);
            constraintSet.clear(this.f15214j.getId(), 4);
            constraintSet.clear(this.f15214j.getId(), 1);
            constraintSet.clear(this.f15214j.getId(), 2);
            constraintSet.connect(this.f15214j.getId(), 1, 0, 1);
            constraintSet.connect(this.f15214j.getId(), 3, 0, 3);
            constraintSet.connect(this.f15214j.getId(), 4, 0, 4);
        }
        if (this.f15215k.getVisibility() == 0) {
            constraintSet.clear(this.f15215k.getId(), 3);
            constraintSet.clear(this.f15215k.getId(), 4);
            constraintSet.clear(this.f15215k.getId(), 1);
            constraintSet.clear(this.f15215k.getId(), 2);
            constraintSet.connect(this.f15215k.getId(), 1, this.f15214j.getVisibility() == 0 ? this.f15214j.getId() : 0, 2, m20090a(12));
            constraintSet.connect(this.f15215k.getId(), 3, 0, 3);
            constraintSet.connect(this.f15215k.getId(), 4, 0, 4);
        }
        if (this.f15214j.getVisibility() == 0 && this.f15215k.getVisibility() == 0) {
            constraintSet.connect(this.f15216l.getId(), 1, this.f15215k.getId(), 2, m20090a(12));
            constraintSet.connect(this.f15216l.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.f15216l.getId(), -2);
        } else if (this.f15214j.getVisibility() == 8 && this.f15215k.getVisibility() == 0) {
            constraintSet.connect(this.f15215k.getId(), 1, 0, 1, m20090a(12));
            constraintSet.connect(this.f15216l.getId(), 1, this.f15215k.getId(), 2, m20090a(12));
            constraintSet.connect(this.f15216l.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.f15216l.getId(), -2);
        } else if (this.f15214j.getVisibility() == 8 && this.f15215k.getVisibility() == 8) {
            constraintSet.connect(this.f15216l.getId(), 1, 0, 1, m20090a(12));
            constraintSet.connect(this.f15216l.getId(), 2, 0, 2, m20090a(12));
            constraintSet.constrainWidth(this.f15216l.getId(), 0);
        }
        constraintSet.applyTo(this);
    }

    public final Job getAppIconDownloadJob() {
        return this.f15217m;
    }

    public final ImageView getIconView() {
        return this.f15214j;
    }

    public final Button getOpenButton() {
        return this.f15216l;
    }

    public final TextView getTitleText() {
        return this.f15215k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        Job job = this.f15217m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f15217m = null;
        super.onViewRemoved(view);
    }

    public final void setAppIconDownloadJob(Job job) {
        this.f15217m = job;
    }

    public final void setIcon(int i) {
        this.f15214j.setImageResource(i);
        this.f15214j.setVisibility(0);
    }

    public final void setIcon(URL url) {
        if (url == null) {
            this.f15214j.setVisibility(8);
            return;
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f15212h), null, null, new b(url, null), 3, null);
        jobLaunch$default.invokeOnCompletion(new c());
        this.f15217m = jobLaunch$default;
    }

    public final void setOpenText(String str) {
        if (str == null || str.length() == 0) {
            str = "Get";
        }
        this.f15216l.setText(str);
        this.f15216l.setContentDescription(getContext().getString(C3613R.string.open_app_custom_button_description, str, this.f15215k.getText()));
        this.f15216l.requestLayout();
    }

    public final void setTitle(String str) {
        if (str == null || str.length() == 0) {
            this.f15215k.setVisibility(8);
            return;
        }
        this.f15215k.setText(str);
        this.f15215k.setVisibility(0);
        setContentDescription(getContext().getString(C3613R.string.persistent_cta_description, str));
        this.f15216l.setContentDescription(getContext().getString(C3613R.string.open_app_button_description, str));
    }
}
