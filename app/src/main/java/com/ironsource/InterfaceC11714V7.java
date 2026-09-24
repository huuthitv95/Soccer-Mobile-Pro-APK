package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.V7 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11714V7<T> {
    /* JADX INFO: renamed from: a */
    T mo27669a(String str);

    /* JADX INFO: renamed from: a */
    void mo27670a(T t);

    /* JADX INFO: renamed from: a */
    void mo27671a(String str, T t);

    /* JADX INFO: renamed from: com.ironsource.V7$a */
    public static final class a implements InterfaceC11714V7<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a */
        private C11697U7 f26015a = new C11697U7();

        /* JADX INFO: renamed from: b */
        private final Map<String, C11697U7> f26016b = new HashMap();

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener mo27669a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C11697U7 c11697u7 = this.f26016b.get(instanceId);
            return c11697u7 != null ? c11697u7 : this.f26015a;
        }

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo27670a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f26015a.mo27810a(listener);
            Iterator<String> it = this.f26016b.keySet().iterator();
            while (it.hasNext()) {
                C11697U7 c11697u7 = this.f26016b.get(it.next());
                if (c11697u7 != null) {
                    c11697u7.mo27810a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo27671a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.f26016b.containsKey(instanceId)) {
                C11697U7 c11697u7 = this.f26016b.get(instanceId);
                if (c11697u7 != null) {
                    c11697u7.mo27810a(listener);
                    return;
                }
                return;
            }
            this.f26016b.put(instanceId, new C11697U7(listener));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.V7$b */
    public static final class b implements InterfaceC11714V7<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a */
        private C11748X7 f26017a = new C11748X7();

        /* JADX INFO: renamed from: b */
        private final Map<String, C11748X7> f26018b = new HashMap();

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener mo27669a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C11748X7 c11748x7 = this.f26018b.get(instanceId);
            return c11748x7 != null ? c11748x7 : this.f26017a;
        }

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo27670a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f26017a.mo27810a(listener);
            Iterator<String> it = this.f26018b.keySet().iterator();
            while (it.hasNext()) {
                C11748X7 c11748x7 = this.f26018b.get(it.next());
                if (c11748x7 != null) {
                    c11748x7.mo27810a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC11714V7
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo27671a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.f26018b.containsKey(instanceId)) {
                C11748X7 c11748x7 = this.f26018b.get(instanceId);
                if (c11748x7 != null) {
                    c11748x7.mo27810a(listener);
                    return;
                }
                return;
            }
            this.f26018b.put(instanceId, new C11748X7(listener));
        }
    }
}
