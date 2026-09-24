package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12240i2 {

    /* JADX INFO: renamed from: a */
    private final AbstractC12593x0 f30516a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f30517b;

    /* JADX INFO: renamed from: c */
    private final List<String> f30518c;

    /* JADX INFO: renamed from: d */
    private final StringBuilder f30519d;

    public C12240i2(AbstractC12593x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f30516a = adUnitData;
        this.f30517b = new HashMap();
        this.f30518c = new ArrayList();
        this.f30519d = new StringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m31663a() {
        return this.f30517b;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m31667b() {
        return this.f30518c;
    }

    /* JADX INFO: renamed from: c */
    public final StringBuilder m31668c() {
        return this.f30519d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m31669d() {
        return (this.f30517b.isEmpty() && this.f30518c.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m31664a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.f30518c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.f30519d;
        sb.append(providerSettings.getInstanceType(this.f30516a.mo26467b().m31567a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(",");
    }

    /* JADX INFO: renamed from: a */
    public final void m31665a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        m31662a(providerInstanceName, providerSettings.getInstanceType(this.f30516a.mo26467b().m31567a()), biddingData);
    }

    /* JADX INFO: renamed from: a */
    public final void m31666a(C12542u3 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String strM33877c = biddingResponse.m33877c();
        Intrinsics.checkNotNullExpressionValue(strM33877c, "biddingResponse.instanceName");
        int iM33878d = biddingResponse.m33878d();
        Map<String, Object> mapM33875a = biddingResponse.m33875a();
        Intrinsics.checkNotNullExpressionValue(mapM33875a, "biddingResponse.biddingData");
        m31662a(strM33877c, iM33878d, mapM33875a);
    }

    /* JADX INFO: renamed from: a */
    private final void m31662a(String str, int i, Map<String, ? extends Object> map) {
        this.f30517b.put(str, map);
        StringBuilder sb = this.f30519d;
        sb.append(i);
        sb.append(str);
        sb.append(",");
    }
}
