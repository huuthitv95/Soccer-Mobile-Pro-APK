package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.li */
/* JADX INFO: loaded from: classes3.dex */
public final class C3899li extends C3792h3 {

    /* JADX INFO: renamed from: u */
    public final C3784gi f15232u;

    /* JADX INFO: renamed from: v */
    public final String f15233v;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.li$a */
    public static final class a implements C3792h3.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3784gi f15234a;

        public a(C3784gi c3784gi) {
            this.f15234a = c3784gi;
        }

        @Override // com.chartboost.sdk.impl.C3792h3.a
        /* JADX INFO: renamed from: a */
        public void mo17844a(C3792h3 c3792h3, CBError cBError) {
            JSONArray jSONArrayM17840h;
            C4048sb.m19408a("Request " + (c3792h3 != null ? c3792h3.m16895e() : null) + " failed!", (Throwable) null, 2, (Object) null);
            if (c3792h3 == null || (jSONArrayM17840h = c3792h3.m17840h()) == null) {
                return;
            }
            this.f15234a.m17818a(jSONArrayM17840h);
        }

        @Override // com.chartboost.sdk.impl.C3792h3.a
        /* JADX INFO: renamed from: a */
        public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3899li(String url, C3784gi trackingEventCache, String sessionId, C3792h3.a callback, InterfaceC3888l7 eventTracker) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        NetworkHelper networkHelper = NetworkHelper.f17175a;
        super(networkHelper.m20164a(url), networkHelper.m20166b(url), (C3690cg) null, EnumC4095ue.NORMAL, callback, eventTracker, (C4031rg) null, 64, (DefaultConstructorMarker) null);
        this.f15232u = trackingEventCache;
        this.f15233v = sessionId;
        this.f14362s = false;
    }

    public /* synthetic */ C3899li(String str, C3784gi c3784gi, String str2, C3792h3.a aVar, InterfaceC3888l7 interfaceC3888l7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c3784gi, str2, (i & 8) != 0 ? new a(c3784gi) : aVar, interfaceC3888l7);
    }

    @Override // com.chartboost.sdk.impl.C3792h3, com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3677c3 mo16887a() {
        Map mapM18518c = m18518c(this.f15233v);
        JSONArray jSONArrayM17840h = m17840h();
        return new C3677c3(mapM18518c, jSONArrayM17840h != null ? AbstractC4193z2.m20095a(jSONArrayM17840h) : null, C11341A5.f23800M);
    }

    /* JADX INFO: renamed from: c */
    public final Map m18518c(String str) {
        return MapsKt.mapOf(TuplesKt.m43482to(HttpHeaders.ACCEPT, C11341A5.f23800M), TuplesKt.m43482to("X-Chartboost-Client", C3907m3.m18629b()), TuplesKt.m43482to("X-Chartboost-API", "9.11.1"), TuplesKt.m43482to("x-monetization-session-id", str));
    }
}
