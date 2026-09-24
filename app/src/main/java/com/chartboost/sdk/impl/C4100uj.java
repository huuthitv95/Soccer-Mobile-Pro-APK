package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.uj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4100uj extends AbstractC3805hg {

    /* JADX INFO: renamed from: e */
    public SurfaceView f16500e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f16501f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.uj$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16502b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3952o3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C3952o3(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100uj(Context context, String html, InterfaceC4064t5 callback, InterfaceC3868ka impressionInterface, C3848jd nativeBridgeCommand, String str, SurfaceView surfaceView, FrameLayout videoBackground, InterfaceC3888l7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(videoBackground, "videoBackground");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.f16500e = surfaceView;
        this.f16501f = videoBackground;
        if (surfaceView == null) {
            throw new IllegalStateException("SurfaceView is not ready. Cannot display video.".toString());
        }
        videoBackground.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoBackground.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        addView(this.f16501f);
        this.f16501f.addView(this.f16500e);
        addView(getWebViewContainer());
        callback.mo18757a();
        callback.mo18762d();
    }

    public /* synthetic */ C4100uj(Context context, String str, InterfaceC4064t5 interfaceC4064t5, InterfaceC3868ka interfaceC3868ka, C3848jd c3848jd, String str2, SurfaceView surfaceView, FrameLayout frameLayout, InterfaceC3888l7 interfaceC3888l7, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, interfaceC4064t5, interfaceC3868ka, c3848jd, str2, surfaceView, (i & 128) != 0 ? new FrameLayout(context) : frameLayout, interfaceC3888l7, (i & 512) != 0 ? a.f16502b : function1);
    }

    /* JADX INFO: renamed from: b */
    public final void m19605b() {
        SurfaceView surfaceView = this.f16500e;
        if (surfaceView != null) {
            if (surfaceView != null) {
                surfaceView.setVisibility(8);
            }
            this.f16501f.removeView(this.f16500e);
            removeView(this.f16501f);
        }
    }
}
