package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.InterfaceC8062a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.renderers.C9070n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8324d implements InterfaceC8062a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAMraidKit f18593a;

    public C8324d(IAMraidKit iAMraidKit) {
        this.f18593a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8062a
    /* JADX INFO: renamed from: a */
    public final InterfaceC8263d mo20463a() {
        return new C9070n();
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8062a
    /* JADX INFO: renamed from: a */
    public final boolean mo20464a(InneractiveAdSpot inneractiveAdSpot) {
        return this.f18593a.isMRaidSpotContent(inneractiveAdSpot);
    }
}
