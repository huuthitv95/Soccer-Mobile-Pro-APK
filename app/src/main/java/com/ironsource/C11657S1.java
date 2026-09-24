package com.ironsource;

import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.ironsource.S1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11657S1 {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f25609a;

    /* JADX INFO: renamed from: b */
    private final AbstractC12593x0 f25610b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C11479I> f25611c;

    /* JADX INFO: renamed from: d */
    private final C12240i2 f25612d;

    /* JADX INFO: renamed from: e */
    private final List<CallableC12435q3> f25613e;

    /* JADX INFO: renamed from: f */
    private final boolean f25614f;

    /* JADX INFO: renamed from: com.ironsource.S1$a */
    public static final class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12524t3 f25615b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11657S1 f25616c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C12524t3.b f25617d;

        a(C12524t3 c12524t3, C11657S1 c11657s1, C12524t3.b bVar) {
            this.f25615b = c12524t3;
            this.f25616c = c11657s1;
            this.f25617d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f25615b.m33734a(this.f25616c.m27424e(), this.f25617d, this.f25616c.f25610b.m34077f(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.S1$c */
    public static final class c implements C12524t3.b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f25620b;

        c(d dVar) {
            this.f25620b = dVar;
        }

        @Override // com.ironsource.C12524t3.b
        /* JADX INFO: renamed from: a */
        public void mo27432a(final List<? extends C12542u3> biddingDataList, final long j, final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            C11707V0 c11707v0 = C11657S1.this.f25609a;
            final C11657S1 c11657s1 = C11657S1.this;
            final d dVar = this.f25620b;
            c11707v0.m33233a(new Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C11657S1.c.m27430a(c11657s1, j, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C12524t3.b
        public void onFailure(final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C11707V0 c11707v0 = C11657S1.this.f25609a;
            final C11657S1 c11657s1 = C11657S1.this;
            final d dVar = this.f25620b;
            c11707v0.m33233a(new Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C11657S1.c.m27431a(c11657s1, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27430a(C11657S1 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.m27415a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27431a(C11657S1 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f25609a.m33047e().m34219g().m27539a(error);
            biddingDataListener.mo27434a(this$0, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.S1$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo27433a(C11657S1 c11657s1);

        /* JADX INFO: renamed from: a */
        void mo27434a(C11657S1 c11657s1, String str);
    }

    public C11657S1(C11707V0 adTools, AbstractC12593x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f25609a = adTools;
        this.f25610b = adUnitData;
        this.f25611c = m27411a();
        this.f25612d = new C12240i2(adUnitData);
        this.f25613e = new ArrayList();
        this.f25614f = adUnitData.m34076e().m33291q();
        b bVarM27417b = m27417b();
        C11405Df c11405DfM31574g = adUnitData.mo26467b().m31574g();
        for (NetworkSettings networkSettings : adUnitData.m34083m()) {
            if (c11405DfM31574g == null || c11405DfM31574g.m25634a(networkSettings, this.f25610b.mo26467b().m31567a())) {
                AdData adDataMo26466a = this.f25610b.mo26466a(networkSettings);
                if (networkSettings.isBidder(this.f25610b.mo26467b().m31567a())) {
                    Object objM27418b = this.f25614f ? m27418b(networkSettings.getProviderName()) : m27409a(networkSettings);
                    if (objM27418b instanceof InterfaceC12471s3) {
                        this.f25613e.add(new CallableC12435q3(networkSettings.getInstanceType(this.f25610b.mo26467b().m31567a()), networkSettings.getProviderInstanceName(), adDataMo26466a, (InterfaceC12471s3) objM27418b, bVarM27417b, networkSettings));
                    } else {
                        this.f25609a.m33047e().m34220h().m27986g(objM27418b == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else {
                    this.f25612d.m31664a(networkSettings);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, C11479I> m27422c() {
        return this.f25611c;
    }

    /* JADX INFO: renamed from: d */
    public final C12240i2 m27423d() {
        return this.f25612d;
    }

    /* JADX INFO: renamed from: e */
    public final List<CallableC12435q3> m27424e() {
        return this.f25613e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m27425f() {
        return !this.f25613e.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27426g() {
        return this.f25612d.m31669d();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27427h() {
        return this.f25614f;
    }

    /* JADX INFO: renamed from: b */
    private final b m27417b() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    private final C12524t3.b m27419b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final BaseAdAdapter<?, ?> m27418b(String str) {
        C11479I c11479i = this.f25611c.get(str);
        if (c11479i != null) {
            return c11479i.m26041b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, C11479I> m27411a() {
        List<NetworkSettings> listM34083m = this.f25610b.m34083m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM34083m, 10)), 16));
        Iterator<T> it = listM34083m.iterator();
        while (it.hasNext()) {
            C11479I c11479i = new C11479I(this.f25609a, this.f25610b, (NetworkSettings) it.next());
            Pair pairM43482to = TuplesKt.m43482to(c11479i.m26042c(), c11479i);
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: com.ironsource.S1$b */
    public static final class b implements InterfaceC12453r3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC12453r3
        /* JADX INFO: renamed from: a */
        public void mo27428a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceM27409a;
            if (C11657S1.this.m27427h()) {
                adapterBaseInterfaceM27409a = null;
                BaseAdAdapter baseAdAdapterM27418b = C11657S1.this.m27418b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterM27418b != null) {
                    adapterBaseInterfaceM27409a = baseAdAdapterM27418b.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceM27409a = C11657S1.this.m27409a(networkSettings);
            }
            if (adapterBaseInterfaceM27409a != null) {
                C11657S1.this.f25609a.m33047e().m34219g().m27540a(C11657S1.this.m27413a(networkSettings, adapterBaseInterfaceM27409a));
            }
        }

        @Override // com.ironsource.InterfaceC12453r3
        /* JADX INFO: renamed from: a */
        public void mo27429a(String str) {
            C11657S1.this.f25609a.m33047e().m34220h().m27986g(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27421a(d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        C12524t3 c12524t3 = new C12524t3();
        C12524t3.b bVarM27419b = m27419b(biddingDataListener);
        this.f25609a.m33047e().m34219g().m27537a();
        this.f25609a.m27636c((AbstractRunnableC11754Xd) new a(c12524t3, this, bVarM27419b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m27415a(long j, List<? extends C12542u3> list, List<String> list2, d dVar) {
        this.f25609a.m33047e().m34219g().m27538a(j);
        for (C12542u3 c12542u3 : list) {
            String strM33877c = c12542u3.m33877c();
            Intrinsics.checkNotNullExpressionValue(strM33877c, "biddingResponse.instanceName");
            Map<String, Object> mapM27414a = m27414a(strM33877c);
            if (c12542u3.m33875a() != null) {
                this.f25612d.m31666a(c12542u3);
                this.f25609a.m33047e().m34219g().m27541a(mapM27414a, c12542u3.m33879e());
            } else {
                this.f25609a.m33047e().m34219g().m27542a(mapM27414a, c12542u3.m33879e(), c12542u3.m33876b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f25609a.m33047e().m34219g().m27543b(m27414a(it.next()), j);
        }
        dVar.mo27433a(this);
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> m27414a(String str) {
        AdapterBaseInterface adapterBaseInterfaceM27409a;
        NetworkSettings networkSettingsM34071a = this.f25610b.m34071a(str);
        if (this.f25614f) {
            BaseAdAdapter<?, ?> baseAdAdapterM27418b = m27418b(str);
            adapterBaseInterfaceM27409a = baseAdAdapterM27418b != null ? baseAdAdapterM27418b.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceM27409a = m27409a(networkSettingsM34071a);
        }
        return m27413a(networkSettingsM34071a, adapterBaseInterfaceM27409a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m27413a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f25610b.mo26467b().m31567a())) : null);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final AdapterBaseInterface m27409a(NetworkSettings networkSettings) {
        return C12332c.m32303b().m32322b(networkSettings, this.f25610b.mo26467b().m31567a(), this.f25610b.mo26467b().m31569b());
    }
}
