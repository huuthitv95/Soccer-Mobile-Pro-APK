package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8869p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a */
    public final Context f20813a;

    /* JADX INFO: renamed from: h */
    public final Handler f20820h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8867n f20821i;

    /* JADX INFO: renamed from: j */
    public Surface f20822j;

    /* JADX INFO: renamed from: k */
    public SurfaceHolder f20823k;

    /* JADX INFO: renamed from: l */
    public long f20824l;

    /* JADX INFO: renamed from: n */
    public HandlerThread f20826n;

    /* JADX INFO: renamed from: o */
    public Handler f20827o;

    /* JADX INFO: renamed from: p */
    public RunnableC8856c f20828p;

    /* JADX INFO: renamed from: q */
    public RunnableC8855b f20829q;

    /* JADX INFO: renamed from: b */
    public volatile EnumC8489b f20814b = EnumC8489b.Idle;

    /* JADX INFO: renamed from: c */
    public boolean f20815c = false;

    /* JADX INFO: renamed from: d */
    public boolean f20816d = false;

    /* JADX INFO: renamed from: e */
    public boolean f20817e = false;

    /* JADX INFO: renamed from: f */
    public boolean f20818f = false;

    /* JADX INFO: renamed from: g */
    public boolean f20819g = false;

    /* JADX INFO: renamed from: m */
    public int f20825m = 0;

    /* JADX INFO: renamed from: r */
    public int f20830r = 0;

    /* JADX INFO: renamed from: s */
    public int f20831s = 0;

    /* JADX INFO: renamed from: t */
    public int f20832t = 0;

    public C8869p(Context context, InterfaceC8867n interfaceC8867n, Handler handler) {
        this.f20813a = context;
        this.f20821i = interfaceC8867n;
        this.f20820h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f20826n = handlerThread;
        handlerThread.start();
        this.f20827o = new Handler(this.f20826n.getLooper());
        this.f20829q = new RunnableC8855b(this);
    }

    /* JADX INFO: renamed from: a */
    public static void m21403a(C8869p c8869p) {
        if (c8869p.m21412a()) {
            c8869p.f20831s = super.getVideoWidth();
            c8869p.f20832t = super.getVideoHeight();
            c8869p.f20830r = super.getDuration();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21404a(C8869p c8869p, Surface surface) {
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.m21945a("%s setSurface called with %s", c8869p.m21413b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m21945a("%s setSurface with null! current surface cleared", c8869p.m21413b());
            } else {
                IAlog.m21945a("%s setSurface - replacing surface!", c8869p.m21413b());
            }
            IAlog.m21949e(strM21413b + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m21945a("%s super.setSurface threw exception!", c8869p.m21413b());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21405a(C8869p c8869p, SurfaceHolder surfaceHolder) {
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.m21945a("%s setDisplay called with %s", c8869p.m21413b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m21945a("%s setDisplay with null! current display cleared", c8869p.m21413b());
            } else {
                IAlog.m21945a("%s setDisplay - replacing surface holder!", c8869p.m21413b());
            }
            IAlog.m21949e(strM21413b + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m21945a("%s super.setDisplay threw exception!", c8869p.m21413b());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21406b(C8869p c8869p) {
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.m21949e(strM21413b + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public static void m21407c(C8869p c8869p) {
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC8489b enumC8489b = c8869p.f20814b;
        if (enumC8489b == EnumC8489b.Paused || enumC8489b == EnumC8489b.Prepared || enumC8489b == EnumC8489b.Completed || enumC8489b == EnumC8489b.Start_in_progress) {
            super.start();
            c8869p.m21409a(EnumC8489b.Playing);
        } else {
            IAlog.m21945a("%s Start called in wrong mState! %s", c8869p.m21413b(), enumC8489b);
            if (c8869p.f20814b == EnumC8489b.Seeking) {
                c8869p.f20815c = true;
            }
        }
        IAlog.m21949e(strM21413b + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public static void m21408d(C8869p c8869p) {
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m21945a("%s paused called cannot set to pause, canceled", c8869p.m21413b());
        }
        IAlog.m21949e(strM21413b + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m21409a(EnumC8489b enumC8489b) {
        IAlog.m21945a("%s updatePlayerState - %s", m21413b(), enumC8489b);
        if (this.f20814b == enumC8489b) {
            IAlog.m21945a("%s updatePlayerState - mState didn't change!", m21413b());
            return;
        }
        IAlog.m21945a("%s updatePlayerState - changing from %s to %s", m21413b(), this.f20814b, enumC8489b);
        this.f20814b = enumC8489b;
        this.f20820h.post(new RunnableC8857d(this, enumC8489b));
    }

    /* JADX INFO: renamed from: a */
    public final void m21410a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f20826n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f20826n.isInterrupted() && (handler2 = this.f20827o) != null) {
            handler2.post(runnable);
        }
        if ((this.f20831s == 0 || this.f20832t == 0 || this.f20830r == 0) && (handler = this.f20827o) != null) {
            handler.post(this.f20829q);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21411a(String str) {
        String strM21413b = m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20818f = false;
        this.f20819g = false;
        if (isPlaying()) {
            IAlog.m21945a("%s loadUri stopping play before refresh", m21413b());
            stop();
        }
        this.f20824l = System.currentTimeMillis();
        m21416e();
        IAlog.m21945a("%s calling setDataSource with %s", m21413b(), str);
        try {
            setDataSource(str);
            IAlog.m21945a("%s setDataSource succeeded, calling prepareAsync", m21413b());
            m21409a(EnumC8489b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m21946b("%s prepareAsync failed with illegal mState exception: %s", m21413b(), e.getMessage());
                this.f20825m++;
                if (this.f20825m < 5) {
                    m21411a(str);
                }
                this.f20825m = 0;
            }
            IAlog.m21949e(strM21413b + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e2) {
            IAlog.m21946b("%s error setting data source %s", m21413b(), str);
            IAlog.m21946b("%s exception message: %s", m21413b(), e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21412a() {
        return (this.f20814b == EnumC8489b.Idle || this.f20814b == EnumC8489b.Preparing) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final String m21413b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* JADX INFO: renamed from: c */
    public final void m21414c() {
        if (this.f20819g) {
            if (!this.f20818f) {
                IAlog.m21945a("%sGot prepared only, waiting for video size", m21413b());
                if (this.f20828p == null) {
                    this.f20828p = new RunnableC8856c(this);
                }
                AbstractC9183r.f21478b.postDelayed(this.f20828p, 2000L);
                return;
            }
            IAlog.m21945a("%sMedia load time took %d msec", m21413b(), Long.valueOf(System.currentTimeMillis() - this.f20824l));
            this.f20830r = super.getDuration();
            m21409a(EnumC8489b.Prepared);
            if (this.f20816d) {
                m21415d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21415d() {
        this.f20816d = true;
        if (m21412a()) {
            m21410a(new RunnableC8865l(this));
        } else {
            IAlog.m21945a("%s mute called when player is not ready!", m21413b());
        }
        IAlog.m21945a("%s mute", m21413b());
    }

    /* JADX INFO: renamed from: e */
    public final void m21416e() {
        String strM21413b = m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC8489b enumC8489b = this.f20814b;
        EnumC8489b enumC8489b2 = EnumC8489b.Idle;
        if (enumC8489b == enumC8489b2) {
            IAlog.m21945a("%s reset called, but player is already resetted. Do nothing", m21413b());
            return;
        }
        m21409a(enumC8489b2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.m21949e(strM21413b + "timelog: reset took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (m21412a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f20830r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f20832t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f20831s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return m21412a() && this.f20814b != EnumC8489b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        m21409a(EnumC8489b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m21950f("%s onError code = %d code2 = %d", m21413b(), Integer.valueOf(i), Integer.valueOf(i2));
        m21416e();
        this.f20820h.post(new RunnableC8854a(this, i, i2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m21945a("%s onPrepared %s gotPrepared = %s", m21413b(), this, Boolean.valueOf(this.f20819g));
        IAlog.m21945a("%sMedia prepare time took %d msec", m21413b(), Long.valueOf(System.currentTimeMillis() - this.f20824l));
        if (this.f20814b != EnumC8489b.Preparing && this.f20814b != EnumC8489b.Seeking) {
            IAlog.m21950f("%s onPrepared: previous error encountered. Aborting", m21413b());
        } else if (this.f20819g) {
            IAlog.m21945a("%s onPrepared called again??? We are already prepared", m21413b());
        } else {
            this.f20819g = true;
            m21414c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m21945a("%s onSeekComplete called current position = %d", m21413b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f20814b != EnumC8489b.Seeking) {
            IAlog.m21945a("%s onSeekComplete called when Story is not seeking", m21413b());
            return;
        }
        if (this.f20816d) {
            m21415d();
        }
        if (!this.f20815c) {
            IAlog.m21945a("%s onSeekComplete mPlayAfterSeek = false", m21413b());
            m21409a(EnumC8489b.Paused);
        } else {
            IAlog.m21945a("%s onSeekComplete mPlayAfterSeek = true", m21413b());
            this.f20814b = EnumC8489b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m21945a("%s onVideoSizeChanged %d, %d", m21413b(), Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f20818f) {
            return;
        }
        RunnableC8856c runnableC8856c = this.f20828p;
        if (runnableC8856c != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC8856c);
            IAlog.m21945a("%s onVideoSizeChanged cancelling prepared runnable", m21413b());
        }
        this.f20818f = true;
        if (i == 0 || i2 == 0) {
            IAlog.m21950f("%s onVideoSizeChanged - Invalid video size!", m21413b());
            onError(this, 0, 0);
        } else {
            IAlog.m21945a("%sMedia got video size time took %d msec", m21413b(), Long.valueOf(System.currentTimeMillis() - this.f20824l));
            this.f20831s = i;
            this.f20832t = i2;
            m21414c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f20814b != EnumC8489b.Idle && this.f20814b != EnumC8489b.Completed) {
            EnumC8489b enumC8489b = this.f20814b;
            EnumC8489b enumC8489b2 = EnumC8489b.Paused;
            if (enumC8489b != enumC8489b2 && this.f20814b != EnumC8489b.Prepared) {
                m21409a(enumC8489b2);
                if (m21412a()) {
                    m21410a(new RunnableC8864k(this));
                } else {
                    IAlog.m21945a("%s paused called when player is not ready!", m21413b());
                }
                IAlog.m21945a("%s pause", m21413b());
                return;
            }
        }
        IAlog.m21945a("%s paused called when player is in mState: %s ignoring", m21413b(), this.f20814b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f20817e) {
            m21410a(new RunnableC8860g(this));
        }
        this.f20821i = null;
        this.f20829q = null;
        this.f20817e = true;
        IAlog.m21945a("%s release called", m21413b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.m21945a("%s reset called", m21413b());
        RunnableC8856c runnableC8856c = this.f20828p;
        if (runnableC8856c != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC8856c);
        }
        m21410a(new RunnableC8861h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.m21945a("%s setDisplay called", m21413b());
        if (!m21412a()) {
            IAlog.m21945a("%s setDisplay called when player is not ready!", m21413b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f20823k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.m21945a("%s setDisplay called with existing surface. ignoring!", m21413b());
        } else {
            this.f20823k = surfaceHolder;
            m21410a(new RunnableC8858e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.m21945a("%s setSurface called", m21413b());
        Surface surface2 = this.f20822j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.m21945a("%s setSurface called with existing surface. ignoring!", m21413b());
        } else {
            this.f20822j = surface;
            m21410a(new RunnableC8859f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.m21945a("%s Start called", m21413b());
        if (!m21412a()) {
            IAlog.m21945a("%s MediaPlayer: Start called when player is not ready! - mState = %s", m21413b(), this.f20814b);
            return;
        }
        if (this.f20814b == EnumC8489b.Seeking) {
            this.f20815c = true;
        } else if (isPlaying()) {
            IAlog.m21945a("%s MediaPlayer: Start called when player is already playing. do nothing", m21413b());
        } else {
            m21409a(EnumC8489b.Start_in_progress);
            m21410a(new RunnableC8862i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String strM21413b = m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (m21412a()) {
            super.stop();
        }
        IAlog.m21945a("%s stop called", m21413b());
        IAlog.m21949e(strM21413b + "timelog: stop took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
