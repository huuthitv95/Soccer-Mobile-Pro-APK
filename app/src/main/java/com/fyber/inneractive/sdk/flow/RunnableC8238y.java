package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.y */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8238y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f18386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f18387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9152g1 f18388c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EnumC9150g f18389d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f18390e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC7941o f18391f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC8076b0 f18392g;

    public RunnableC8238y(AbstractC8076b0 abstractC8076b0, Context context, String str, C9152g1 c9152g1, EnumC9150g enumC9150g, boolean z, InterfaceC7941o interfaceC7941o) {
        this.f18392g = abstractC8076b0;
        this.f18386a = context;
        this.f18387b = str;
        this.f18388c = c9152g1;
        this.f18389d = enumC9150g;
        this.f18390e = z;
        this.f18391f = interfaceC7941o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18392g.m20479a(this.f18386a, this.f18387b, this.f18388c, this.f18389d, this.f18390e, this.f18391f);
    }
}
