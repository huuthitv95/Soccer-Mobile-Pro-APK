package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3860k2 extends AbstractC3986pf {

    /* JADX INFO: renamed from: d */
    public final C4008qf f15005d;

    /* JADX INFO: renamed from: e */
    public final C4168y f15006e;

    /* JADX INFO: renamed from: f */
    public final C3829ih f15007f;

    /* JADX INFO: renamed from: g */
    public final EnumC4036s f15008g;

    /* JADX INFO: renamed from: h */
    public final Mediation f15009h;

    /* JADX INFO: renamed from: i */
    public final Lazy f15010i;

    /* JADX INFO: renamed from: j */
    public final C4143wi f15011j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3911m7 f15012k;

    /* JADX INFO: renamed from: l */
    public final long f15013l;

    /* JADX INFO: renamed from: m */
    public final long f15014m;

    /* JADX INFO: renamed from: n */
    public final int f15015n;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.k2$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3747f4 invoke() {
            return new C3747f4(AbstractC3860k2.this.m18336v(), AbstractC3860k2.this.m18334q(), C3678c4.f13658b.mo17019a().mo19003q(), AbstractC3860k2.this.f15009h);
        }
    }

    public AbstractC3860k2(C4008qf renderableConfig, C4168y adMarkupConfig, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, EnumC4036s adFormat, Mediation mediation) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f15005d = renderableConfig;
        this.f15006e = adMarkupConfig;
        this.f15007f = telemetryManager;
        this.f15008g = adFormat;
        this.f15009h = mediation;
        this.f15010i = LazyKt.lazy(new a());
        this.f15011j = new C4143wi(new C4121vi(null, null, 3, null), null, null, 6, null);
        this.f15012k = trackerComponent.mo19602a();
        C3840j5 c3840j5M19179d = renderableConfig.m19179d();
        this.f15013l = c3840j5M19179d != null ? c3840j5M19179d.m18187b() : 0L;
        C3840j5 c3840j5M19179d2 = renderableConfig.m19179d();
        this.f15014m = c3840j5M19179d2 != null ? c3840j5M19179d2.m18186a() : 0L;
        this.f15015n = renderableConfig.m19186k();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18329a(AbstractC3860k2 abstractC3860k2, ChartboostError.Render render, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRender");
        }
        if ((i & 1) != 0) {
            render = null;
        }
        abstractC3860k2.m18330a(render);
    }

    /* JADX INFO: renamed from: a */
    public final void m18330a(ChartboostError.Render render) {
        if (!Chartboost.isSdkStarted()) {
            C4048sb.m19411b("SDK not initialized. Cannot track render event for auction " + this.f15006e.m20000b() + (render != null ? " (triggered by error handler): " + render : ""), (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            C3829ih c3829ih = this.f15007f;
            C3942nf c3942nf = new C3942nf(this.f15006e.m20000b(), "", render != null ? render.getMessage() : null, render != null ? render.getCode() : null, render != null ? render.getConstant() : null, render != null ? render.getCauseDescription() : null, this.f15009h);
            List listM19181f = this.f15005d.m19181f();
            ArrayList<C3865k7> arrayList = new ArrayList();
            for (Object obj : listM19181f) {
                if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.RENDER.m18362b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (C3865k7 c3865k7 : arrayList) {
                arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
            }
            C3829ih.m18024a(c3829ih, c3942nf, arrayList2, null, 4, null);
        } catch (Exception e) {
            C4048sb.m19410b("Failed to track " + (render != null ? "render error" : "render") + " event for auction " + this.f15006e.m20000b(), e);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17975a(EnumC3704d7 type, EnumC4020r5 enumC4020r5) {
        EnumC4020r5 enumC4020r6;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == EnumC3704d7.CTA_SHOW) {
            if (enumC4020r5 == null) {
                C3670bj c3670bjM19190o = this.f15005d.m19190o();
                enumC4020r5 = AbstractC3998q5.m19092a(c3670bjM19190o != null ? c3670bjM19190o.m16950a() : null);
            }
            enumC4020r6 = enumC4020r5;
        } else {
            enumC4020r6 = null;
        }
        C3829ih c3829ih = this.f15007f;
        C3658b7 c3658b7 = new C3658b7(this.f15006e.m20000b(), CollectionsKt.emptyList(), type == EnumC3704d7.COUNTDOWN_COMPLETE ? EnumC3681c7.COUNTDOWN_COMPLETE : EnumC3681c7.CTA_SHOW, enumC4020r6, null, null, null, null, this.f15009h, 240, null);
        List listM19181f = this.f15005d.m19181f();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM19181f) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.ENGAGEMENT.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3658b7, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18331a(String str, boolean z) {
        if (str != null) {
            try {
                new URL(str);
                this.f15011j.m19815a(str, EnumC3816i4.CLICK_PREFERENCE_EMBEDDED, new C3931n4(this.f15008g.toString(), str, null, this.f15012k, 4, null), z);
            } catch (MalformedURLException e) {
                m18330a(new ChartboostError.Render.InvalidClickthroughUrl(str, "Invalid clickthrough URL format", e));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo17382b(String str, boolean z) {
        List listEmptyList;
        InterfaceC4074tf interfaceC4074tfM19067i;
        m18331a(str, z);
        C3747f4 c3747f4M18335r = m18335r();
        if (str == null || (listEmptyList = CollectionsKt.listOf(str)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!c3747f4M18335r.m17617a(new AbstractC3724e4.b(listEmptyList), z) || (interfaceC4074tfM19067i = m19067i()) == null) {
            return;
        }
        interfaceC4074tfM19067i.mo17323f();
    }

    /* JADX INFO: renamed from: b */
    public void m18332b(boolean z) {
        C3829ih c3829ih = this.f15007f;
        C3645ah c3645ah = new C3645ah(this.f15006e.m20000b(), CollectionsKt.emptyList(), z, null, null, null, null, this.f15009h, 120, null);
        List listPlus = CollectionsKt.plus((Collection) this.f15005d.m19181f(), (Iterable) this.f15006e.m20002d());
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.SKIP.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3645ah, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: p */
    public final EnumC4036s m18333p() {
        return this.f15008g;
    }

    /* JADX INFO: renamed from: q */
    public final C4168y m18334q() {
        return this.f15006e;
    }

    /* JADX INFO: renamed from: r */
    public final C3747f4 m18335r() {
        return (C3747f4) this.f15010i.getValue();
    }

    /* JADX INFO: renamed from: s */
    public long mo17332s() {
        return this.f15014m;
    }

    /* JADX INFO: renamed from: t */
    public long mo17333t() {
        return this.f15013l;
    }

    /* JADX INFO: renamed from: u */
    public int mo17334u() {
        return this.f15015n;
    }

    /* JADX INFO: renamed from: v */
    public final C4008qf m18336v() {
        return this.f15005d;
    }

    /* JADX INFO: renamed from: w */
    public final C3829ih m18337w() {
        return this.f15007f;
    }

    /* JADX INFO: renamed from: x */
    public void mo17335x() {
        C3829ih c3829ih = this.f15007f;
        C3822ia c3822ia = new C3822ia(this.f15006e.m20000b(), CollectionsKt.emptyList(), null, null, null, null, this.f15009h, 60, null);
        List listM19181f = this.f15005d.m19181f();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM19181f) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.IMPRESSION.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3822ia, arrayList2, null, 4, null);
        m18329a(this, (ChartboostError.Render) null, 1, (Object) null);
    }
}
