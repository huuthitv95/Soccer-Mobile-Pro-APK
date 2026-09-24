package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.tg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4075tg implements InterfaceC4054sh {

    /* JADX INFO: renamed from: b */
    public static final a f16387b = new a(null);

    /* JADX INFO: renamed from: a */
    public final C4031rg f16388a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.tg$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4075tg(C4031rg session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f16388a = session;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C4053sg c4053sgM19358i = this.f16388a.m19358i();
        jSONObject.put("session_duration", (int) RangesKt.coerceAtMost(c4053sgM19358i.m19431b() / ((long) 1000), 2147483647L));
        jSONObject.put("impression_depth_interstitial", c4053sgM19358i.m19433d());
        jSONObject.put("impression_depth_rewarded", c4053sgM19358i.m19434e());
        jSONObject.put("impression_depth_banner", c4053sgM19358i.m19430a());
        return jSONObject;
    }
}
