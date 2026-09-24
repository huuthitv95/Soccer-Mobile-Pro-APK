package com.fyber.inneractive.sdk.flow.endcard.loaders;

import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.C8092j;
import com.fyber.inneractive.sdk.flow.endcard.C8107m;
import com.fyber.inneractive.sdk.flow.endcard.loaders.companion.C8097a;
import com.fyber.inneractive.sdk.flow.endcard.loaders.fmp.C8103a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8096b {

    /* JADX INFO: renamed from: a */
    public final C8103a f18009a;

    /* JADX INFO: renamed from: b */
    public final C8097a f18010b;

    /* JADX INFO: renamed from: c */
    public final C8095a f18011c;

    /* JADX INFO: renamed from: d */
    public final C8107m f18012d;

    public C8096b(C8237x0 c8237x0, C8107m c8107m) {
        C8092j c8092j = new C8092j();
        this.f18012d = c8107m;
        this.f18009a = new C8103a(c8092j, c8237x0, this);
        this.f18010b = new C8097a(c8092j, c8237x0, this);
        this.f18011c = new C8095a(c8092j, c8237x0, this);
    }
}
