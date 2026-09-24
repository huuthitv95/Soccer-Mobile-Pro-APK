package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.pa */
/* JADX INFO: loaded from: classes3.dex */
public final class C3981pa implements InterfaceC4025ra {

    /* JADX INFO: renamed from: a */
    public final C3950o1 f15792a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3930n3 f15793b;

    /* JADX INFO: renamed from: c */
    public final C4131w6 f15794c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3971p0 f15795d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3891la f15796e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4178y9 f15797f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f15798g;

    /* JADX INFO: renamed from: h */
    public boolean f15799h;

    /* JADX INFO: renamed from: i */
    public boolean f15800i;

    /* JADX INFO: renamed from: j */
    public boolean f15801j;

    /* JADX INFO: renamed from: k */
    public boolean f15802k;

    /* JADX INFO: renamed from: l */
    public boolean f15803l;

    /* JADX INFO: renamed from: m */
    public boolean f15804m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.pa$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19054a() {
            C4048sb.m19411b("Cannot display on host because view was not created!", (Throwable) null, 2, (Object) null);
            C3981pa.this.mo19037a(CBError.Impression.ERROR_CREATING_VIEW);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19054a();
            return Unit.INSTANCE;
        }
    }

    public C3981pa(C3950o1 appRequest, AbstractC3930n3 viewProtocol, C4131w6 downloader, ViewGroup viewGroup, InterfaceC3971p0 adUnitRendererImpressionCallback, InterfaceC3891la impressionIntermediateCallback, InterfaceC4178y9 impressionClickCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        this.f15792a = appRequest;
        this.f15793b = viewProtocol;
        this.f15794c = downloader;
        this.f15795d = adUnitRendererImpressionCallback;
        this.f15796e = impressionIntermediateCallback;
        this.f15797f = impressionClickCallback;
        this.f15798g = new WeakReference(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19034a(ViewGroup viewGroup) {
        try {
            if (viewGroup == null) {
                C4048sb.m19411b("Cannot display on host because it is null!", (Throwable) null, 2, (Object) null);
                mo19037a(CBError.Impression.ERROR_DISPLAYING_VIEW);
                return;
            }
            CBError.Impression impressionM18721a = this.f15793b.m18721a(viewGroup);
            if (impressionM18721a != null) {
                C4048sb.m19411b("displayOnHostView tryCreatingViewOnHostView error " + impressionM18721a, (Throwable) null, 2, (Object) null);
                mo19037a(impressionM18721a);
                return;
            }
            AbstractC3969ok abstractC3969okM18753u = this.f15793b.m18753u();
            if (abstractC3969okM18753u == null) {
                new a();
            } else {
                m19035a(viewGroup, abstractC3969okM18753u);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            C4048sb.m19410b("displayOnHostView e", e);
            mo19037a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19035a(ViewGroup viewGroup, View view) {
        Unit unit;
        Context context;
        this.f15796e.mo18496a(EnumC3937na.DISPLAYED);
        AbstractC3969ok abstractC3969okM18753u = this.f15793b.m18753u();
        if (abstractC3969okM18753u == null || (context = abstractC3969okM18753u.getContext()) == null) {
            unit = null;
        } else {
            this.f15795d.mo18586a(context);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19411b("Missing context on onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
        viewGroup.addView(view);
        this.f15794c.m19750a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19036a(EnumC3937na state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (state != EnumC3937na.LOADING) {
            m19038a(activity);
            return;
        }
        C4048sb.m19408a("displayOnActivity invalid state: " + state, (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19037a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f15803l = true;
        this.f15795d.mo18591a(this.f15792a, error);
    }

    /* JADX INFO: renamed from: a */
    public final void m19038a(CBImpressionActivity cBImpressionActivity) {
        this.f15796e.mo18496a(EnumC3937na.DISPLAYED);
        try {
            CBError.Impression impressionM18722a = this.f15793b.m18722a(cBImpressionActivity);
            if (impressionM18722a != null) {
                mo19037a(impressionM18722a);
            } else {
                C4048sb.m19413c("Displaying the impression", null, 2, null);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Cannot create view in protocol", e);
            mo19037a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: a */
    public void mo19039a(boolean z) {
        this.f15801j = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19040a() {
        return this.f15804m;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: b */
    public void mo19041b() {
        if (this.f15802k) {
            return;
        }
        this.f15802k = true;
        this.f15793b.mo17932y();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: b */
    public void mo19042b(boolean z) {
        this.f15800i = z;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: c */
    public void mo19043c(boolean z) {
        this.f15799h = z;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: d */
    public void mo19044d(boolean z) {
        this.f15803l = z;
    }

    /* JADX INFO: renamed from: e */
    public void m19045e(boolean z) {
        this.f15804m = z;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: e */
    public boolean mo19046e() {
        return this.f15799h;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: f */
    public boolean mo19047f() {
        return this.f15801j;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: g */
    public void mo19048g() {
        this.f15795d.mo18614o();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: h */
    public boolean mo19049h() {
        return this.f15800i;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: i */
    public ViewGroup mo19050i() {
        return (ViewGroup) this.f15798g.get();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: j */
    public boolean mo19051j() {
        return this.f15803l;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: k */
    public void mo19052k() {
        if (m19040a()) {
            return;
        }
        m19045e(true);
        if (mo19051j()) {
            this.f15796e.mo18497c();
        } else {
            mo19037a(CBError.Impression.INTERNAL);
        }
        this.f15793b.m18730a(EnumC4012qj.SKIP);
        this.f15796e.mo18498g();
        this.f15793b.m18719C();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    /* JADX INFO: renamed from: l */
    public void mo19053l() {
        this.f15795d.mo18600b(this.f15792a);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    public void onResume() {
        this.f15797f.mo18599a(false);
        if (this.f15802k) {
            this.f15802k = false;
            this.f15793b.mo17933z();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4025ra
    public void onStart() {
        this.f15797f.mo18599a(false);
    }
}
