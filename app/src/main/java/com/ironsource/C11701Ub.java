package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Ub */
/* JADX INFO: loaded from: classes6.dex */
public final class C11701Ub extends AbstractC12241i3<C11769Yb, AdapterAdListener> implements InterfaceC11639R0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11701Ub(List<? extends NetworkSettings> list, C11545Lb configs, String str, C12266ja publisherDataHolder, C11767Y9 c11767y9) {
        super(new C11718Vb(str, list, configs), publisherDataHolder, c11767y9);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: D */
    protected void mo27613D() {
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: E */
    protected boolean mo27614E() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final void m27615J() {
        C11756Xf c11756Xf;
        int iIntValue;
        C12568vb c12568vb;
        IronLog.INTERNAL.verbose();
        try {
            C11769Yb c11769Yb = (C11769Yb) this.f30530a.m34196d();
            if (c11769Yb != null) {
                Integer numM31832r = c11769Yb.m31832r();
                if (numM31832r == null) {
                    iIntValue = this.f30522C.mo26265a(this.f30544o.m27768b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(numM31832r, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numM31832r.intValue();
                }
                C11426F0 c11426f0 = this.f30548s;
                if (c11426f0 != null && (c12568vb = c11426f0.f24288f) != null) {
                    c12568vb.m33945a(iIntValue);
                }
                c11769Yb.m28050P();
                this.f30530a.m34190a(null);
                this.f30530a.m34194b(null);
            }
            this.f30538i = null;
            m31710a(AbstractC12241i3.f.NONE);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m31715b(str));
            C11426F0 c11426f1 = this.f30548s;
            if (c11426f1 == null || (c11756Xf = c11426f1.f24292j) == null) {
                return;
            }
            c11756Xf.m27986g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11769Yb mo27616a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i, String currentAuctionId, C12434q2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new C11769Yb(this, new C12378n0(IronSource.EnumC12328a.NATIVE_AD, this.f30544o.mo27740o(), i, this.f30536g, currentAuctionId, this.f30534e, this.f30535f, providerSettings, this.f30544o.m27780n()), adapter, this.f30538i, item, this);
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: d */
    protected AbstractC11534L0 mo27623d() {
        return new C12207g5();
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: i */
    protected String mo27624i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: l */
    protected String mo27625l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: s */
    protected boolean mo27626s() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m27617a(C12135cd c12135cd) {
        String str;
        int iM25368b;
        IronLog.INTERNAL.verbose("placement = " + c12135cd);
        if (c12135cd == null || TextUtils.isEmpty(c12135cd.m32814c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c12135cd == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iM25368b = C11354B0.m25368b(this.f30544o.m27768b());
        } else if (this.f30524E.mo26262c(ContextProvider.getInstance().getApplicationContext(), c12135cd, this.f30544o.m27768b())) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c12135cd.m32814c()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iM25368b = C11354B0.m25372f(this.f30544o.m27768b());
        } else {
            str = null;
            iM25368b = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f30538i = c12135cd;
            m31734x();
        } else {
            IronLog.API.error(m31715b(str));
            m31704a(iM25368b, str, false);
        }
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: b */
    protected JSONObject mo27622b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    /* JADX INFO: renamed from: a */
    public final void m27619a(InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        m31708a(new C11684Tb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: a */
    protected void mo27618a(AbstractC12259j3<?> abstractC12259j3, AdInfo adInfo) {
        if (abstractC12259j3 instanceof C11769Yb) {
            C11769Yb c11769Yb = (C11769Yb) abstractC12259j3;
            this.f30549t.mo26320a(c11769Yb.m28051Q(), c11769Yb.m28052R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC12241i3
    /* JADX INFO: renamed from: a */
    protected void mo27620a(IronSourceError ironSourceError) {
        this.f30549t.mo26322a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC12241i3, com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.mo25594a(event);
        C12135cd c12135cd = this.f30538i;
        if (c12135cd != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c12135cd.m32814c());
        }
        UUID uuid = this.f30552w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
