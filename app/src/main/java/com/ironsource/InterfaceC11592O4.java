package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.O4 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11592O4 {

    /* JADX INFO: renamed from: com.ironsource.O4$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Map<String, Object> f25276a;

        public a(String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.f25276a = MapsKt.mutableMapOf(TuplesKt.m43482to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.m43482to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        /* JADX INFO: renamed from: a */
        public final void m26725a(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f25276a.put(key, value);
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, Object> m26724a() {
            return MapsKt.toMutableMap(this.f25276a);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo26722a(EnumC12598x5 enumC12598x5, EnumC12446qe enumC12446qe);

    /* JADX INFO: renamed from: a */
    void mo26723a(EnumC12598x5 enumC12598x5, String str);

    /* JADX INFO: renamed from: com.ironsource.O4$b */
    public static final class b implements InterfaceC11592O4 {

        /* JADX INFO: renamed from: a */
        private final InterfaceC11343A7 f25277a;

        /* JADX INFO: renamed from: b */
        private final a f25278b;

        public b(InterfaceC11343A7 eventManager, a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f25277a = eventManager;
            this.f25278b = eventBaseData;
        }

        @Override // com.ironsource.InterfaceC11592O4
        /* JADX INFO: renamed from: a */
        public void mo26723a(EnumC12598x5 eventName, String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> mapM26724a = this.f25278b.m26724a();
            mapM26724a.put("spId", instanceId);
            this.f25277a.mo25281a(new C12580w5(eventName, new JSONObject(MapsKt.toMap(mapM26724a))));
        }

        @Override // com.ironsource.InterfaceC11592O4
        /* JADX INFO: renamed from: a */
        public void mo26722a(EnumC12598x5 eventName, EnumC12446qe enumC12446qe) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> mapM26724a = this.f25278b.m26724a();
            if (enumC12446qe != null) {
                mapM26724a.put(IronSourceConstants.EVENTS_EXT1, enumC12446qe.toString());
            }
            this.f25277a.mo25281a(new C12580w5(eventName, new JSONObject(MapsKt.toMap(mapM26724a))));
        }
    }
}
