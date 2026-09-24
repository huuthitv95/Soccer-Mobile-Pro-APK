package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ue */
/* JADX INFO: loaded from: classes6.dex */
public final class C12553ue {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11368Be f32575a;

    /* JADX INFO: renamed from: b */
    private final C12612y1 f32576b;

    /* JADX INFO: renamed from: c */
    private final C11399D9 f32577c;

    /* JADX INFO: renamed from: d */
    private final C11686Td f32578d;

    /* JADX INFO: renamed from: e */
    private final C11648R9 f32579e;

    public C12553ue() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m33914a(Context context, C11440Fe serverResponse) {
        C11609P3.c.C15513c c15513cM27010m;
        JSONObject jSONObjectM27114u;
        String strM26994c;
        C11609P3.c.C15513c c15513cM27010m2;
        String strM27110q;
        Boolean boolM27017t;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        C11609P3.c cVarM26823g = serverResponse.m25800d().m26823g();
        this.f32575a.mo25306a(context, InterfaceC12582w7.f32700a, (cVarM26823g == null || (boolM27017t = cVarM26823g.m27017t()) == null) ? true : boolM27017t.booleanValue());
        C11609P3.c cVarM26823g2 = serverResponse.m25800d().m26823g();
        if (cVarM26823g2 != null && (c15513cM27010m2 = cVarM26823g2.m27010m()) != null && (strM27110q = c15513cM27010m2.m27110q()) != null) {
            this.f32576b.m32035a(strM27110q);
            this.f32577c.m32035a(strM27110q);
            this.f32578d.m32035a(strM27110q);
        }
        C11609P3.b bVarM26822f = serverResponse.m25800d().m26822f();
        if (bVarM26822f != null && (strM26994c = bVarM26822f.m26994c()) != null) {
            this.f32579e.m27352b(strM26994c);
        }
        C11609P3.c cVarM26823g3 = serverResponse.m25800d().m26823g();
        if (cVarM26823g3 == null || (c15513cM27010m = cVarM26823g3.m27010m()) == null || (jSONObjectM27114u = c15513cM27010m.m27114u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(jSONObjectM27114u.toString());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("events");
        if (jSONObjectOptJSONObject != null) {
            Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(\"events\")");
            jSONObject.remove("events");
            Map<String, String> mapM32749b = IronSourceUtils.m32749b(jSONObjectOptJSONObject);
            this.f32576b.m32039b(mapM32749b);
            this.f32577c.m32039b(mapM32749b);
            this.f32578d.m32039b(mapM32749b);
        }
        Map<String, String> mapM32749b2 = IronSourceUtils.m32749b(jSONObject);
        this.f32576b.m32036a(mapM32749b2);
        this.f32577c.m32036a(mapM32749b2);
        this.f32578d.m32036a(mapM32749b2);
    }

    public C12553ue(InterfaceC11368Be sharedPreferences, C12612y1 appEventsManager, C11399D9 interstitialEventsManager, C11686Td rewardedVideoEventsManager, C11648R9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f32575a = sharedPreferences;
        this.f32576b = appEventsManager;
        this.f32577c = interstitialEventsManager;
        this.f32578d = rewardedVideoEventsManager;
        this.f32579e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12553ue(InterfaceC11368Be interfaceC11368Be, C12612y1 c12612y1, C11399D9 c11399d9, C11686Td c11686Td, C11648R9 c11648r9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC11368Be = (i & 1) != 0 ? new C11350Ae() : interfaceC11368Be;
        c12612y1 = (i & 2) != 0 ? C11455Gb.f24351s.m25905d().mo25850q() : c12612y1;
        if ((i & 4) != 0) {
            c11399d9 = C11399D9.m25613i();
            Intrinsics.checkNotNullExpressionValue(c11399d9, "getInstance()");
        }
        if ((i & 8) != 0) {
            c11686Td = C11686Td.m27533i();
            Intrinsics.checkNotNullExpressionValue(c11686Td, "getInstance()");
        }
        this(interfaceC11368Be, c12612y1, c11399d9, c11686Td, (i & 16) != 0 ? new C11648R9() : c11648r9);
    }
}
