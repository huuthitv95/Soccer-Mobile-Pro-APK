package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.player.C8438c;
import com.fyber.inneractive.sdk.player.C8848h;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.mediaplayer.InterfaceC8867n;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.q */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8476q implements InterfaceC8867n {

    /* JADX INFO: renamed from: a */
    public final Context f18867a;

    /* JADX INFO: renamed from: d */
    public C8483x f18870d;

    /* JADX INFO: renamed from: f */
    public C8438c f18872f;

    /* JADX INFO: renamed from: g */
    public boolean f18873g;

    /* JADX INFO: renamed from: i */
    public final Handler f18875i;

    /* JADX INFO: renamed from: j */
    public TextureView f18876j;

    /* JADX INFO: renamed from: k */
    public SurfaceTexture f18877k;

    /* JADX INFO: renamed from: l */
    public Surface f18878l;

    /* JADX INFO: renamed from: m */
    public TextureViewSurfaceTextureListenerC8468i f18879m;

    /* JADX INFO: renamed from: o */
    public boolean f18881o;

    /* JADX INFO: renamed from: e */
    public EnumC8489b f18871e = EnumC8489b.Idle;

    /* JADX INFO: renamed from: n */
    public boolean f18880n = false;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f18868b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f18869c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h */
    public C8848h f18874h = new C8848h(this);

    public AbstractC8476q(Context context) {
        this.f18867a = context.getApplicationContext();
        this.f18875i = new Handler(context.getMainLooper());
        mo20840a(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m20905a(AbstractC8476q abstractC8476q, SurfaceTexture surfaceTexture) {
        boolean zEquals = surfaceTexture.equals(abstractC8476q.f18877k);
        SurfaceTexture surfaceTexture2 = abstractC8476q.f18877k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        abstractC8476q.f18877k = surfaceTexture;
        Surface surface = abstractC8476q.f18878l;
        if (surface == null || !zEquals) {
            if (surface != null) {
                surface.release();
            }
            abstractC8476q.f18878l = new Surface(abstractC8476q.f18877k);
        }
        abstractC8476q.mo20838a(abstractC8476q.f18878l);
    }

    /* JADX INFO: renamed from: a */
    public void mo20835a() {
        IAlog.m21945a("%sdestroy started", IAlog.m21943a(this));
        m20909k();
        this.f18874h = null;
        AbstractC9195v.m22027a(this.f18876j);
        this.f18876j = null;
        SurfaceTexture surfaceTexture = this.f18877k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f18877k = null;
        }
        Surface surface = this.f18878l;
        if (surface != null) {
            surface.release();
            this.f18878l = null;
        }
        this.f18875i.removeCallbacksAndMessages(null);
        this.f18868b.clear();
        this.f18872f = null;
        this.f18873g = true;
        IAlog.m21945a("%sdestroy finished", IAlog.m21943a(this));
    }

    /* JADX INFO: renamed from: a */
    public void mo20836a(int i) {
        this.f18875i.post(new RunnableC8471l(this, i));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20837a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo20838a(Surface surface);

    /* JADX INFO: renamed from: a */
    public final void m20906a(TextureView textureView) {
        TextureView textureView2 = this.f18876j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f18876j = textureView;
            if (textureView != null) {
                TextureViewSurfaceTextureListenerC8468i textureViewSurfaceTextureListenerC8468i = this.f18879m;
                if (textureViewSurfaceTextureListenerC8468i == null) {
                    textureViewSurfaceTextureListenerC8468i = new TextureViewSurfaceTextureListenerC8468i(this);
                    this.f18879m = textureViewSurfaceTextureListenerC8468i;
                }
                textureView.setSurfaceTextureListener(textureViewSurfaceTextureListenerC8468i);
            }
            if (this.f18877k != null) {
                IAlog.m21945a("%scalling setSurfaceTexture with cached texture", IAlog.m21943a(this));
                if (this.f18876j.getSurfaceTexture() != null && this.f18876j.getSurfaceTexture().equals(this.f18877k)) {
                    IAlog.m21945a("%scalling setSurfaceTexture with cached texture failed", IAlog.m21943a(this));
                } else {
                    IAlog.m21945a("%scalling setSurfaceTexture with cached texture success", IAlog.m21943a(this));
                    this.f18876j.setSurfaceTexture(this.f18877k);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20907a(EnumC8489b enumC8489b) {
        if (enumC8489b == this.f18871e) {
            return;
        }
        this.f18871e = enumC8489b;
        if (enumC8489b == EnumC8489b.Playing) {
            C8848h c8848h = this.f18874h;
            if (c8848h != null && c8848h.f20789b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                c8848h.f20789b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(c8848h.f20790c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (enumC8489b == EnumC8489b.Paused || enumC8489b == EnumC8489b.Idle || enumC8489b == EnumC8489b.Completed) {
            m20909k();
        }
        this.f18875i.post(new RunnableC8472m(this, enumC8489b));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20839a(String str, int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo20840a(boolean z);

    /* JADX INFO: renamed from: b */
    public abstract int mo20841b();

    /* JADX INFO: renamed from: b */
    public abstract void mo20842b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract int mo20843c();

    /* JADX INFO: renamed from: c */
    public final void m20908c(boolean z) {
        C8272f c8272f;
        C8438c c8438c = this.f18872f;
        if (c8438c == null || (c8272f = c8438c.f18773a.f20776e) == null) {
            return;
        }
        if (z) {
            if (c8272f.f18444c == null || !c8272f.f18445d) {
                return;
            }
            IAlog.m21945a("%s mute", "OMVideo");
            try {
                c8272f.f18444c.volumeChange(0.0f);
                return;
            } catch (Throwable th) {
                c8272f.m20675a(th);
                return;
            }
        }
        if (c8272f.f18444c == null || !c8272f.f18445d) {
            return;
        }
        IAlog.m21945a("%s unMute", "OMVideo");
        try {
            c8272f.f18444c.volumeChange(1.0f);
        } catch (Throwable th2) {
            c8272f.m20675a(th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo20844d();

    /* JADX INFO: renamed from: d */
    public abstract void mo20845d(boolean z);

    /* JADX INFO: renamed from: e */
    public abstract int mo20846e();

    /* JADX INFO: renamed from: f */
    public abstract int mo20847f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo20848g();

    /* JADX INFO: renamed from: h */
    public boolean mo20872h() {
        return this.f18871e == EnumC8489b.Playing;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo20849i();

    /* JADX INFO: renamed from: j */
    public abstract void mo20850j();

    /* JADX INFO: renamed from: k */
    public final void m20909k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C8848h c8848h = this.f18874h;
        if (c8848h == null || (scheduledThreadPoolExecutor = c8848h.f20789b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        c8848h.f20789b = null;
    }
}
