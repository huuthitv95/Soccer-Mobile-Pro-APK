package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.D */
/* JADX INFO: loaded from: classes6.dex */
public final class C11389D implements InterfaceC11408E0 {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f24185a;

    /* JADX INFO: renamed from: b */
    private final C11371C f24186b;

    /* JADX INFO: renamed from: c */
    private final BaseAdAdapter<?, ?> f24187c;

    public C11389D(C11707V0 adTools, C11371C instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.f24185a = adTools;
        this.f24186b = instanceData;
        this.f24187c = baseAdAdapter;
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 event) {
        String adapterVersion;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f24187c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            Intrinsics.checkNotNullExpressionValue(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f24187c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.checkNotNull(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(C12414p0.m33033a(this.f24185a, "could not get adapter version for event data " + this.f24186b.m25541w(), (String) null, 2, (Object) null));
        }
        String strM31343i = this.f24186b.m25528j().m31343i();
        Intrinsics.checkNotNullExpressionValue(strM31343i, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strM31343i);
        String strM31335a = this.f24186b.m25528j().m31335a();
        Intrinsics.checkNotNullExpressionValue(strM31335a, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strM31335a);
        map.put("instanceType", Integer.valueOf(this.f24186b.m25537s()));
        String serverData = this.f24186b.m25532n().m33151k();
        C11707V0 c11707v0 = this.f24185a;
        Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        String strM27637e = c11707v0.m27637e(serverData);
        if (!TextUtils.isEmpty(strM27637e)) {
            map.put("dynamicDemandSource", strM27637e);
        }
        map.put("sessionDepth", Integer.valueOf(this.f24186b.m25540v()));
        if (!TextUtils.isEmpty(this.f24186b.m25539u().getCustomNetwork())) {
            String customNetwork = this.f24186b.m25539u().getCustomNetwork();
            Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
