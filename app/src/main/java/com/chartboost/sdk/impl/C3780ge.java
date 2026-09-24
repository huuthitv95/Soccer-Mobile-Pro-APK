package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ge */
/* JADX INFO: loaded from: classes3.dex */
public final class C3780ge extends C3792h3 {

    /* JADX INFO: renamed from: v */
    public static final b f14323v = new b(null);

    /* JADX INFO: renamed from: w */
    public static final Json f14324w = JsonKt.Json$default(null, a.f14326b, 1, null);

    /* JADX INFO: renamed from: u */
    public final boolean f14325u;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ge$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f14326b = new a();

        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m17808a(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setEncodeDefaults(true);
            Json.setIgnoreUnknownKeys(true);
            Json.setPrettyPrint(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17808a((JsonBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ge$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3780ge(C3984pd networkParameters, C4190z adParameters, C3665be c3665be, InterfaceC3888l7 eventTracker, C4031rg session, boolean z) {
        JSONObject jSONObjectM17882h;
        Intrinsics.checkNotNullParameter(networkParameters, "networkParameters");
        Intrinsics.checkNotNullParameter(adParameters, "adParameters");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        AbstractC3654b3.c method = networkParameters.f15812a;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        String endpoint = networkParameters.f15813b;
        Intrinsics.checkNotNullExpressionValue(endpoint, "endpoint");
        String path = networkParameters.f15814c;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        C3690cg c3690cg = networkParameters.f15815d;
        EnumC4095ue priority = networkParameters.f15816e;
        Intrinsics.checkNotNullExpressionValue(priority, "priority");
        super(method, endpoint, path, c3690cg, priority, (String) null, networkParameters.f15817f, eventTracker, session);
        this.f14325u = z;
        if (z) {
            C3690cg requestBodyFields = networkParameters.f15815d;
            Intrinsics.checkNotNullExpressionValue(requestBodyFields, "requestBodyFields");
            C3883l2 c3883l2M18004a = new C3826ie(requestBodyFields, adParameters, c3665be).m18004a();
            Json json = f14324w;
            json.getSerializersModule();
            jSONObjectM17882h = new JSONObject(json.encodeToString(C3883l2.INSTANCE.serializer(), c3883l2M18004a));
        } else {
            jSONObjectM17882h = new C3803he(networkParameters.f15815d, adParameters, c3665be).m17882h();
            Intrinsics.checkNotNull(jSONObjectM17882h);
        }
        m17835a(jSONObjectM17882h);
    }

    @Override // com.chartboost.sdk.impl.C3792h3, com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3700d3 mo16888a(C3723e3 c3723e3) {
        byte[] bArrM17473a;
        try {
            if (c3723e3 == null || (bArrM17473a = c3723e3.m17473a()) == null) {
                bArrM17473a = new byte[0];
            }
            return C3700d3.f13797c.m17258a(new JSONObject(new String(bArrM17473a, Charsets.UTF_8)));
        } catch (JSONException e) {
            C4048sb.m19410b("parseServerResponse", e);
            return C3700d3.f13797c.m17257a(new CBError(CBError.Internal.HTTP_NOT_FOUND, "No Bid"));
        }
    }

    @Override // com.chartboost.sdk.impl.C3792h3
    /* JADX INFO: renamed from: f */
    public void mo17807f() {
    }
}
