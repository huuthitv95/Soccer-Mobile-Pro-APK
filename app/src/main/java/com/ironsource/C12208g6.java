package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12208g6 extends AbstractC11353B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* JADX INFO: renamed from: x */
    private WeakReference<InterfaceC12226h6> f30425x;

    /* JADX INFO: renamed from: y */
    private C12189f5 f30426y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12208g6(C11707V0 adTools, C11371C instanceData, C11479I adInstancePayload, InterfaceC12226h6 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30425x = new WeakReference<>(listener);
    }

    /* JADX INFO: renamed from: I */
    private final List<String> m31530I() {
        JSONObject jSONObjectOptJSONObject = new C11576N6().m26660a(new String[]{C11540L6.f25016u}).optJSONObject(C11540L6.f25016u);
        if (jSONObjectOptJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(C11540L6.f24902C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    private final Map<String, Object> m31531J() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        for (String str : m31530I()) {
            List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C11744X3.j.f26434b}, false, 2, 2, (Object) null);
            if (listSplit$default.size() < 2) {
                IronLog.INTERNAL.warning(m25335a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listSplit$default.get(0);
                mapCreateMapBuilder.put("custom_" + str2, (String) listSplit$default.get(1));
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: renamed from: K */
    private final void m31532K() {
        if (m25361v()) {
            m25346f().m33047e().m34220h().m27991l("closed after failure");
            return;
        }
        this.f30426y = new C12189f5();
        IronLog.INTERNAL.verbose(AbstractC11353B.m25318a(this, (String) null, 1, (Object) null));
        m25346f().m33047e().m34211a().m26691a(m25351k(), "");
        InterfaceC12226h6 interfaceC12226h6 = this.f30425x.get();
        if (interfaceC12226h6 != null) {
            interfaceC12226h6.mo31589b(this);
        }
        mo25343c();
    }

    /* JADX INFO: renamed from: L */
    private final void m31533L() {
        IronLog.INTERNAL.verbose(AbstractC11353B.m25318a(this, (String) null, 1, (Object) null));
        m25346f().m33047e().m34211a().m26698d(m25351k());
    }

    /* JADX INFO: renamed from: M */
    private final void m31534M() {
        if (m25361v()) {
            m25346f().m33047e().m34220h().m27991l("rewarded after failure");
            return;
        }
        Map<String, Object> mapM31531J = m31531J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM27634a = m25346f().m27634a(jCurrentTimeMillis, m25355p());
        long jM31432a = C12189f5.m31432a(this.f30426y);
        LevelPlayReward levelPlayRewardMo25732a = C11455Gb.f24351s.m25905d().mo25839B().mo25732a(m25351k(), m25354n().m25527i().mo26467b().m31570c());
        m25346f().m33047e().m34211a().m26692a(m25351k(), levelPlayRewardMo25732a.getName(), levelPlayRewardMo25732a.getAmount(), jCurrentTimeMillis, strM27634a, jM31432a, mapM31531J, m25346f().m27640j());
        InterfaceC12226h6 interfaceC12226h6 = this.f30425x.get();
        if (interfaceC12226h6 != null) {
            interfaceC12226h6.mo31588a(this, levelPlayRewardMo25732a);
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m31535N() {
        IronLog.INTERNAL.verbose(AbstractC11353B.m25318a(this, (String) null, 1, (Object) null));
        InterfaceC12226h6 interfaceC12226h6 = this.f30425x.get();
        if (interfaceC12226h6 != null) {
            interfaceC12226h6.mo31587a(this);
        }
    }

    /* JADX INFO: renamed from: O */
    private final void m31536O() {
        IronLog.INTERNAL.verbose(AbstractC11353B.m25318a(this, (String) null, 1, (Object) null));
        m25346f().m33047e().m34211a().m26703i(m25351k());
    }

    /* JADX INFO: renamed from: P */
    private final void m31537P() {
        IronLog.INTERNAL.verbose(AbstractC11353B.m25318a(this, (String) null, 1, (Object) null));
        m25346f().m33047e().m34211a().m26705k(m25351k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m31539b(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31533L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m31541d(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31534M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m31542e(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31536O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m31543f(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31537P();
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: A */
    protected void mo25334A() {
        if (!(m25347g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(m25335a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objM25347g = m25347g();
        Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objM25347g).loadAd(m25354n().m25525g(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: a */
    public void mo25338a(InterfaceC11515K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo25765a(this);
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: c */
    public void mo25343c() {
        if (!(m25347g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(m25335a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objM25347g = m25347g();
        Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objM25347g).destroyAd(m25354n().m25525g());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31538a(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdClosed(Map map) {
        onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31539b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdEnded(Map map) {
        onAdEnded();
    }

    @Override // com.ironsource.AbstractC11353B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31541d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public /* synthetic */ void onAdRewarded(Map map) {
        onAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31542e(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdStarted(Map map) {
        onAdStarted();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31543f(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdVisible(Map map) {
        onAdVisible();
    }

    /* JADX INFO: renamed from: a */
    public final void m31544a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m25335a("placementName = " + m25351k()));
        try {
            m25346f().m33047e().m34211a().m26688a(activity, m25351k());
            if (!(m25347g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(m25335a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                m25346f().m33047e().m34220h().m27986g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objM25347g = m25347g();
                Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objM25347g).showAd(m25349i(), activity, this);
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(m25335a(str));
            m25346f().m33047e().m34220h().m27986g(str);
            m25336a(C11354B0.m25374h(m25354n().m25526h()), str);
        }
    }

    @Override // com.ironsource.AbstractC11353B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        m25340a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12208g6.m31540c(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m31540c(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31535N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31538a(C12208g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m31532K();
    }
}
