package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.video.b */
/* JADX INFO: compiled from: ComponentVideoPlayer.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12887b implements Player.EventListener {

    /* JADX INFO: renamed from: e */
    private long f34660e;

    /* JADX INFO: renamed from: f */
    private boolean f34661f;

    /* JADX INFO: renamed from: g */
    private Context f34662g;

    /* JADX INFO: renamed from: h */
    private SimpleExoPlayer f34663h;

    /* JADX INFO: renamed from: i */
    private MediaSource f34664i;

    /* JADX INFO: renamed from: k */
    private volatile InterfaceC12886a f34666k;

    /* JADX INFO: renamed from: l */
    SurfaceHolder f34667l;

    /* JADX INFO: renamed from: m */
    private C12888c f34668m;

    /* JADX INFO: renamed from: a */
    private boolean f34656a = false;

    /* JADX INFO: renamed from: b */
    private boolean f34657b = false;

    /* JADX INFO: renamed from: c */
    private boolean f34658c = false;

    /* JADX INFO: renamed from: d */
    private int f34659d = 5;

    /* JADX INFO: renamed from: j */
    private final Handler f34665j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n */
    private final Runnable f34669n = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.video.b$a */
    /* JADX INFO: compiled from: ComponentVideoPlayer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (C12887b.this.f34663h == null || !C12887b.this.m36004b()) {
                    return;
                }
                C12887b c12887b = C12887b.this;
                c12887b.f34660e = c12887b.f34663h.getCurrentPosition();
                float f = C12887b.this.f34660e / 1000.0f;
                float f2 = C12887b.this.f34660e % 1000;
                int iRound = Math.round(f);
                C13219q0.m37818c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + C12887b.this.f34660e);
                if (C12887b.this.f34663h == null || C12887b.this.f34663h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = C12887b.this.f34663h.getDuration() / 1000;
                    if (f2 > 0.0f && f2 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j = iRound;
                    if (j < 1 + duration && C12887b.this.f34666k != null) {
                        C12887b.this.f34666k.mo35567a(j, duration);
                    }
                }
                C12887b.this.f34656a = false;
                C12887b.this.f34665j.postDelayed(this, 1000L);
            } catch (Exception e) {
                C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m35994r() {
        try {
            m35988a();
            this.f34665j.post(this.f34669n);
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public float m36008e() {
        SimpleExoPlayer simpleExoPlayer = this.f34663h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m36009f() {
        return this.f34657b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m36010g() {
        return this.f34656a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m36011h() {
        return this.f34663h != null && m36004b();
    }

    /* JADX INFO: renamed from: i */
    public boolean m36012i() {
        return this.f34661f;
    }

    /* JADX INFO: renamed from: j */
    public void m36013j() {
        SimpleExoPlayer simpleExoPlayer = this.f34663h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f34661f = true;
    }

    /* JADX INFO: renamed from: k */
    public void m36014k() {
        try {
            this.f34656a = true;
            this.f34660e = 0L;
            if (this.f34666k != null) {
                this.f34666k.onPlayCompleted();
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m36015l() {
        try {
            this.f34657b = true;
            if (this.f34663h != null && !this.f34658c) {
                this.f34658c = true;
                if (this.f34666k != null) {
                    this.f34666k.mo35566a(this.f34663h.getDuration() / 1000);
                }
            }
            m35994r();
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m36016m() {
        try {
            if (this.f34657b && this.f34663h != null && m36004b()) {
                this.f34663h.setPlayWhenReady(false);
                m35988a();
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m36017n() {
        try {
            if (this.f34657b) {
                m35994r();
            } else {
                this.f34663h.prepare(this.f34664i);
            }
            this.f34663h.setPlayWhenReady(true);
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
            m36019p();
            m35991b("play error");
        }
    }

    /* JADX INFO: renamed from: o */
    public void m36018o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f34657b || (simpleExoPlayer = this.f34663h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f34664i);
            this.f34657b = true;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i);
        if (i == 1) {
            C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i == 2) {
            C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i == 3) {
            C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            m36015l();
        } else {
            if (i != 4) {
                return;
            }
            C13219q0.m37816b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            m35988a();
            m36014k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    /* JADX INFO: renamed from: p */
    public void m36019p() {
        try {
            m35988a();
            if (this.f34663h != null) {
                m36021s();
                this.f34663h.removeListener(this);
                this.f34663h.release();
                this.f34666k = null;
            }
            C12888c c12888c = this.f34668m;
            if (c12888c != null) {
                c12888c.m36032c();
            }
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m36020q() {
        SimpleExoPlayer simpleExoPlayer = this.f34663h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m36021s() {
        try {
            if (this.f34657b && this.f34663h != null && m36004b()) {
                this.f34663h.stop();
                m35988a();
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m36022t() {
        SimpleExoPlayer simpleExoPlayer = this.f34663h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f34661f = false;
    }

    /* JADX INFO: renamed from: b */
    public void m36003b(int i) {
        this.f34659d = i;
    }

    /* JADX INFO: renamed from: c */
    public void m36006c(String str) {
        if (TextUtils.isEmpty(str)) {
            m35991b("play url is illegal");
            return;
        }
        try {
            this.f34663h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f34662g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f34664i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f34662g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f34663h.setRepeatMode(0);
            this.f34663h.prepare(this.f34664i);
            this.f34663h.addListener(this);
            SurfaceHolder surfaceHolder = this.f34667l;
            if (surfaceHolder != null) {
                m36000a(surfaceHolder);
            }
            C12888c c12888c = new C12888c(this.f34662g, this.f34663h);
            this.f34668m = c12888c;
            c12888c.m36030a(str, this.f34666k, this.f34659d);
        } catch (Throwable unused) {
            m35991b("Player init error");
        }
    }

    /* JADX INFO: renamed from: d */
    public int m36007d() {
        SimpleExoPlayer simpleExoPlayer = this.f34663h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        C12888c c12888c = this.f34668m;
        if ((c12888c == null || !c12888c.m36031a(exoPlaybackException)) && exoPlaybackException != null) {
            int i = exoPlaybackException.type;
            if (i == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i != 1) {
                message = i != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException.";
            } else {
                message = "Play error, because have a RendererException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            C13219q0.m37816b("ComponentVideoPlayer", "onPlayerError : " + message);
            m36002a(message);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35991b(String str) {
        if (this.f34666k != null) {
            this.f34666k.onPlayError(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35999a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f34662g = context;
            this.f34667l = surfaceHolder;
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m36004b() {
        return this.f34663h.getPlaybackState() == 3 && this.f34663h.getPlayWhenReady();
    }

    /* JADX INFO: renamed from: a */
    public void m36000a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f34663h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
            m35991b(th.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35998a(long j) {
        try {
            if (!this.f34657b) {
                this.f34663h.prepare(this.f34664i);
            } else {
                m35994r();
            }
            this.f34663h.seekTo(j);
            this.f34663h.setPlayWhenReady(true);
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
            m36019p();
            m35991b("play error");
        }
    }

    /* JADX INFO: renamed from: c */
    public long m36005c() {
        return this.f34660e;
    }

    /* JADX INFO: renamed from: a */
    public void m35997a(int i) {
        long j = i;
        try {
            this.f34660e = j;
            if (!this.f34657b) {
                C13219q0.m37813a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f34663h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j);
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35988a() {
        try {
            this.f34665j.removeCallbacks(this.f34669n);
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36001a(InterfaceC12886a interfaceC12886a) {
        this.f34666k = interfaceC12886a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m36002a(String str) {
        try {
            this.f34657b = false;
            m35991b(str);
            return true;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentVideoPlayer", e.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35996a(float f, float f2) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f34663h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f2);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35995a(float f) {
        try {
            if (m36004b()) {
                this.f34663h.setPlaybackParameters(new PlaybackParameters(f));
            } else {
                this.f34663h.setPlaybackParameters(new PlaybackParameters(f));
                this.f34663h.stop();
            }
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentVideoPlayer", th.getMessage());
        }
    }
}
