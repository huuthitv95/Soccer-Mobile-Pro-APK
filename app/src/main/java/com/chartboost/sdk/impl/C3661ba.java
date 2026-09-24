package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ba */
/* JADX INFO: loaded from: classes3.dex */
public final class C3661ba implements InterfaceC3638aa {

    /* JADX INFO: renamed from: a */
    public final C3651b0 f13551a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3628a0 f13552b;

    /* JADX INFO: renamed from: c */
    public final C4195z4 f13553c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3971p0 f13554d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ba$a */
    public static final class a implements InterfaceC3633a5 {
        @Override // com.chartboost.sdk.impl.InterfaceC3633a5
        /* JADX INFO: renamed from: a */
        public void mo16803a(String str) {
            C4048sb.m19411b("onCompleteRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3633a5
        /* JADX INFO: renamed from: a */
        public void mo16804a(JSONObject jSONObject) {
            C4048sb.m19411b("onCompleteRequestSuccess " + jSONObject, (Throwable) null, 2, (Object) null);
        }
    }

    public C3661ba(C3651b0 adUnit, AbstractC3628a0 adType, C4195z4 completeRequest, InterfaceC3971p0 adUnitRendererImpressionCallback) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        this.f13551a = adUnit;
        this.f13552b = adType;
        this.f13553c = completeRequest;
        this.f13554d = adUnitRendererImpressionCallback;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3638aa
    /* JADX INFO: renamed from: a */
    public void mo16810a() {
        AbstractC3628a0 abstractC3628a0 = this.f13552b;
        if (abstractC3628a0 == AbstractC3628a0.b.f13429g) {
            C4048sb.m19411b("didCompleteInterstitial delegate used to be sent here", (Throwable) null, 2, (Object) null);
        } else if (abstractC3628a0 == AbstractC3628a0.c.f13430g) {
            this.f13554d.mo18596a(this.f13551a.m16871m(), this.f13551a.m16880v());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3638aa
    /* JADX INFO: renamed from: a */
    public void mo16811a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f13553c.m20104a(new a(), new C4173y4(location, this.f13551a.m16859a(), this.f13551a.m16865g(), this.f13551a.m16880v(), this.f13551a.m16881w(), f, f2));
    }
}
