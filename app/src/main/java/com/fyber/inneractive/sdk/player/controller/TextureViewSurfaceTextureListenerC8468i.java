package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.i */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC8468i implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8476q f18857a;

    public TextureViewSurfaceTextureListenerC8468i(AbstractC8476q abstractC8476q) {
        this.f18857a = abstractC8476q;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC8476q abstractC8476q = this.f18857a;
        abstractC8476q.getClass();
        IAlog.m21945a("%s onSurfaceTextureAvailable", IAlog.m21943a(abstractC8476q));
        AbstractC8476q.m20905a(this.f18857a, surfaceTexture);
        AbstractC8476q abstractC8476q2 = this.f18857a;
        C8483x c8483x = abstractC8476q2.f18870d;
        if (c8483x != null) {
            TextureView textureView = abstractC8476q2.f18876j;
            AbstractC8485z abstractC8485z = c8483x.f18894a;
            abstractC8485z.getClass();
            IAlog.m21945a("%s onTextureViewAvailable", IAlog.m21943a(abstractC8485z));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC8476q abstractC8476q = this.f18857a;
        abstractC8476q.getClass();
        IAlog.m21945a("%s onSurfaceTextureDestroyed", IAlog.m21943a(abstractC8476q));
        this.f18857a.mo20849i();
        this.f18857a.mo20838a((Surface) null);
        AbstractC8476q abstractC8476q2 = this.f18857a;
        abstractC8476q2.f18881o = true;
        EnumC8489b enumC8489b = abstractC8476q2.f18871e;
        if (enumC8489b == EnumC8489b.Error || enumC8489b == EnumC8489b.Idle) {
            abstractC8476q2.getClass();
            IAlog.m21945a("%sReleasing surface texture", IAlog.m21943a(abstractC8476q2));
            this.f18857a.f18877k = null;
            return true;
        }
        abstractC8476q2.getClass();
        IAlog.m21945a("%s caching surface texture", IAlog.m21943a(abstractC8476q2));
        AbstractC8476q abstractC8476q3 = this.f18857a;
        abstractC8476q3.f18877k = surfaceTexture;
        abstractC8476q3.f18875i.post(new RunnableC8467h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC8476q abstractC8476q = this.f18857a;
        if (abstractC8476q.f18871e == EnumC8489b.Paused) {
            int iMo20841b = abstractC8476q.mo20841b();
            int iMo20843c = abstractC8476q.mo20843c();
            if (iMo20841b <= 0 || iMo20841b > iMo20843c) {
                return;
            }
            abstractC8476q.mo20837a(iMo20841b - 1, false);
            abstractC8476q.mo20837a(iMo20841b, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        AbstractC8476q abstractC8476q;
        AbstractC8476q abstractC8476q2 = this.f18857a;
        C8483x c8483x = abstractC8476q2.f18870d;
        if (c8483x != null) {
            TextureView textureView = abstractC8476q2.f18876j;
            AbstractC8846f abstractC8846f = c8483x.f18894a.f18897a;
            if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null) {
                abstractC8476q.f18875i.post(new RunnableC8473n(abstractC8476q));
            }
        }
        AbstractC8476q abstractC8476q3 = this.f18857a;
        if (!abstractC8476q3.f18881o || (surface = abstractC8476q3.f18878l) == null) {
            return;
        }
        abstractC8476q3.mo20838a(surface);
        this.f18857a.f18881o = false;
    }
}
