package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8790o implements InterfaceC8782g {

    /* JADX INFO: renamed from: a */
    public final Context f20567a;

    /* JADX INFO: renamed from: b */
    public final C8788m f20568b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8782g f20569c;

    public C8790o(Context context, C8788m c8788m, C8792q c8792q) {
        this.f20567a = context.getApplicationContext();
        this.f20568b = c8788m;
        this.f20569c = c8792q;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g
    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h mo20831a() {
        return new C8789n(this.f20567a, this.f20568b, this.f20569c.mo20831a());
    }
}
