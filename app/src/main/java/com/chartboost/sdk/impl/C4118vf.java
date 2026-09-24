package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vf */
/* JADX INFO: loaded from: classes3.dex */
public final class C4118vf implements InterfaceC4096uf, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C4090u9 f16614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3911m7 f16615b;

    /* JADX INFO: renamed from: c */
    public WeakReference f16616c;

    /* JADX INFO: renamed from: d */
    public WeakReference f16617d;

    /* JADX INFO: renamed from: e */
    public boolean f16618e;

    public C4118vf(C4090u9 impressionActivityIntentWrapper, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(impressionActivityIntentWrapper, "impressionActivityIntentWrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f16614a = impressionActivityIntentWrapper;
        this.f16615b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19591a() {
        InterfaceC3650b interfaceC3650b;
        WeakReference weakReference = this.f16616c;
        if (weakReference == null || (interfaceC3650b = (InterfaceC3650b) weakReference.get()) == null) {
            return;
        }
        interfaceC3650b.mo16851a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19592a(int i, boolean z) {
        InterfaceC3650b interfaceC3650b;
        WeakReference weakReference = this.f16616c;
        if (weakReference == null || (interfaceC3650b = (InterfaceC3650b) weakReference.get()) == null) {
            return;
        }
        interfaceC3650b.mo16852a(i, z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19593a(InterfaceC3650b activityInterface, CBImpressionActivity activity) {
        InterfaceC3927n0 interfaceC3927n0;
        Intrinsics.checkNotNullParameter(activityInterface, "activityInterface");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16616c = new WeakReference(activityInterface);
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            return;
        }
        interfaceC3927n0.mo18594a(activity);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19594a(InterfaceC3927n0 adUnitRendererActivityInterface) {
        Intrinsics.checkNotNullParameter(adUnitRendererActivityInterface, "adUnitRendererActivityInterface");
        this.f16617d = new WeakReference(adUnitRendererActivityInterface);
        try {
            C4090u9 c4090u9 = this.f16614a;
            c4090u9.m19578a(c4090u9.m19577a());
        } catch (Exception e) {
            C4048sb.m19410b("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions", e);
            mo19596a(CBError.Impression.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19595a(AbstractC3969ok viewBase) {
        Unit unit;
        InterfaceC3650b interfaceC3650b;
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        WeakReference weakReference = this.f16616c;
        if (weakReference == null || (interfaceC3650b = (InterfaceC3650b) weakReference.get()) == null) {
            unit = null;
        } else {
            interfaceC3650b.mo16853a(viewBase);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("activityInterface is null", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: a */
    public void mo19596a(CBError.Impression error) {
        InterfaceC3927n0 interfaceC3927n0;
        Intrinsics.checkNotNullParameter(error, "error");
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            return;
        }
        interfaceC3927n0.mo18593a(error);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: b */
    public void mo19597b() {
        Unit unit;
        InterfaceC3927n0 interfaceC3927n0;
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            unit = null;
        } else {
            interfaceC3927n0.mo18618y();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("Bridge onPause missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: c */
    public void mo19598c() {
        Unit unit;
        InterfaceC3927n0 interfaceC3927n0;
        m19707d();
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            unit = null;
        } else {
            interfaceC3927n0.mo18617x();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("Bridge onDestroy missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
        WeakReference weakReference2 = this.f16616c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference weakReference3 = this.f16617d;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16615b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16615b.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16615b.mo43985clearFromStorage(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m19707d() {
        if (this.f16618e) {
            return;
        }
        track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.i.DISMISS_MISSING, "dismiss_missing happened due to sdk closure outside expected flow", null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    /* JADX INFO: renamed from: e */
    public void mo19599e() {
        InterfaceC3927n0 interfaceC3927n0;
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            return;
        }
        interfaceC3927n0.mo18607e();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    public void finishActivity() {
        InterfaceC3650b interfaceC3650b;
        this.f16618e = true;
        WeakReference weakReference = this.f16616c;
        if (weakReference == null || (interfaceC3650b = (InterfaceC3650b) weakReference.get()) == null) {
            return;
        }
        interfaceC3650b.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    public void onResume() {
        Unit unit;
        InterfaceC3927n0 interfaceC3927n0;
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            unit = null;
        } else {
            interfaceC3927n0.mo18616r();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("Bridge onResume missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4096uf
    public void onStart() {
        Unit unit;
        InterfaceC3927n0 interfaceC3927n0;
        WeakReference weakReference = this.f16617d;
        if (weakReference == null || (interfaceC3927n0 = (InterfaceC3927n0) weakReference.get()) == null) {
            unit = null;
        } else {
            interfaceC3927n0.mo18615p();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("Bridge onStart missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16615b.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16615b.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f16615b.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f16615b.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f16615b.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f16615b.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f16615b.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16615b.mo43989track(event);
    }
}
