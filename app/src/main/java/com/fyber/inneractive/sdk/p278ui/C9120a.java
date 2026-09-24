package com.fyber.inneractive.sdk.p278ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C9120a implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f21414a;

    public C9120a(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f21414a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        Bitmap bitmap = (Bitmap) obj;
        if (exc != null || bitmap == null) {
            return;
        }
        this.f21414a.f21395r = bitmap;
    }
}
