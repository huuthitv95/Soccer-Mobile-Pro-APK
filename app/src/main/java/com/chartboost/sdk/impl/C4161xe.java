package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.GDPR;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xe */
/* JADX INFO: loaded from: classes3.dex */
public final class C4161xe implements InterfaceC4054sh {

    /* JADX INFO: renamed from: b */
    public static final a f16943b = new a(null);

    /* JADX INFO: renamed from: a */
    public final C4117ve f16944a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xe$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4161xe(C4117ve privacyApi) {
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.f16944a = privacyApi;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C4139we c4139weM19706g = this.f16944a.m19706g();
        Integer numM19794d = c4139weM19706g.m19794d();
        if (numM19794d != null) {
            jSONObject.put(COPPA.COPPA_STANDARD, numM19794d.intValue());
        }
        Integer numM19795e = c4139weM19706g.m19795e();
        if (numM19795e != null) {
            jSONObject.put(GDPR.GDPR_STANDARD, numM19795e.intValue());
        }
        Integer numM19793c = c4139weM19706g.m19793c();
        if (numM19793c != null) {
            jSONObject.put(C11744X3.j.f26435b0, numM19793c.intValue());
        }
        String strM19798h = c4139weM19706g.m19798h();
        if (strM19798h != null) {
            if (StringsKt.isBlank(strM19798h)) {
                strM19798h = null;
            }
            if (strM19798h != null) {
                jSONObject.put("tcf", strM19798h);
            }
        }
        String strM19796f = c4139weM19706g.m19796f();
        if (strM19796f != null) {
            if (StringsKt.isBlank(strM19796f) || Intrinsics.areEqual(strM19796f, C11794a2.f26725f)) {
                strM19796f = null;
            }
            if (strM19796f != null) {
                jSONObject.put(CCPA.CCPA_STANDARD, strM19796f);
            }
        }
        String strM19792b = c4139weM19706g.m19792b();
        if (strM19792b != null) {
            if (StringsKt.isBlank(strM19792b)) {
                strM19792b = null;
            }
            if (strM19792b != null) {
                jSONObject.put("gpp", strM19792b);
            }
        }
        String strM19791a = c4139weM19706g.m19791a();
        if (strM19791a != null) {
            String str = StringsKt.isBlank(strM19791a) ? null : strM19791a;
            if (str != null) {
                jSONObject.put("gpp_sid", str);
            }
        }
        return jSONObject;
    }
}
