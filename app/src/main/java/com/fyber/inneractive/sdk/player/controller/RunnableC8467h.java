package com.fyber.inneractive.sdk.player.controller;

import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.h */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8467h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC8468i f18856a;

    public RunnableC8467h(TextureViewSurfaceTextureListenerC8468i textureViewSurfaceTextureListenerC8468i) {
        this.f18856a = textureViewSurfaceTextureListenerC8468i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8476q abstractC8476q = this.f18856a.f18857a;
        C8483x c8483x = abstractC8476q.f18870d;
        if (c8483x != null) {
            TextureView textureView = abstractC8476q.f18876j;
            AbstractC8485z abstractC8485z = c8483x.f18894a;
            abstractC8485z.getClass();
            IAlog.m21945a("%s onTextureViewDestroyed", IAlog.m21943a(abstractC8485z));
        }
    }
}
