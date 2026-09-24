package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C12294l2;
import com.ironsource.C12470s2;
import com.ironsource.InterfaceC11691U1;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12353f implements InterfaceC12354g {

    /* JADX INFO: renamed from: a */
    private final C12470s2 f31242a;

    /* JADX INFO: renamed from: b */
    private final String f31243b;

    public C12353f(C12470s2 settings, String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f31242a = settings;
        this.f31243b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC12354g
    /* JADX INFO: renamed from: a */
    public C12352e.a mo32477a(Context context, C12355h auctionRequestParams, InterfaceC11691U1 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject jSONObjectM32476a = m32476a(context, auctionRequestParams);
        String strM33274a = this.f31242a.m33274a(auctionRequestParams.m32518s());
        return auctionRequestParams.m32518s() ? new C12294l2(auctionListener, new URL(strM33274a), jSONObjectM32476a, auctionRequestParams.m32519t(), this.f31242a) : new C12352e.a(auctionListener, new URL(strM33274a), jSONObjectM32476a, auctionRequestParams.m32519t(), this.f31242a);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC12354g
    /* JADX INFO: renamed from: b */
    public boolean mo32479b() {
        return this.f31242a.m33281g() > 0;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC12354g
    /* JADX INFO: renamed from: a */
    public boolean mo32478a() {
        return this.f31242a.m33288n();
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m32476a(Context context, C12355h c12355h) throws JSONException {
        JSONObject jSONObjectM32338a = C12333d.m32333b().m32338a(c12355h);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32338a, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectM32338a;
    }
}
