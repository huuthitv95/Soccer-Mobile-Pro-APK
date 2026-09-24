package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8789n implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f20562a;

    /* JADX INFO: renamed from: b */
    public final C8794s f20563b;

    /* JADX INFO: renamed from: c */
    public final C8777d f20564c;

    /* JADX INFO: renamed from: d */
    public final C8781f f20565d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8783h f20566e;

    public C8789n(Context context, C8788m c8788m, InterfaceC8783h interfaceC8783h) {
        interfaceC8783h.getClass();
        this.f20562a = interfaceC8783h;
        this.f20563b = new C8794s(c8788m);
        this.f20564c = new C8777d(context, c8788m);
        this.f20565d = new C8781f(context, c8788m);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) {
        if (this.f20566e != null) {
            throw new IllegalStateException();
        }
        String scheme = c8786k.f20545a.getScheme();
        Uri uri = c8786k.f20545a;
        int i = AbstractC8827z.f20671a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C11744X3.i.f26356b)) {
            if (c8786k.f20545a.getPath().startsWith("/android_asset/")) {
                this.f20566e = this.f20564c;
            } else {
                this.f20566e = this.f20563b;
            }
        } else if ("asset".equals(scheme)) {
            this.f20566e = this.f20564c;
        } else if ("content".equals(scheme)) {
            this.f20566e = this.f20565d;
        } else {
            this.f20566e = this.f20562a;
        }
        return this.f20566e.mo20829a(c8786k);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        InterfaceC8783h interfaceC8783h = this.f20566e;
        if (interfaceC8783h == null) {
            return null;
        }
        return interfaceC8783h.mo20830a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
        InterfaceC8783h interfaceC8783h = this.f20566e;
        if (interfaceC8783h != null) {
            try {
                interfaceC8783h.close();
            } finally {
                this.f20566e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) {
        return this.f20566e.read(bArr, i, i2);
    }
}
