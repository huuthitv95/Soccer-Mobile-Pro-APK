package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.internal.ads.zzes$$ExternalSyntheticBackport0;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.video.C12887b;
import com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;

/* JADX INFO: loaded from: classes5.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a */
    private C12887b f34541a;

    /* JADX INFO: renamed from: b */
    private String f34542b;

    /* JADX INFO: renamed from: c */
    private boolean f34543c;

    /* JADX INFO: renamed from: d */
    private boolean f34544d;

    /* JADX INFO: renamed from: e */
    private boolean f34545e;

    /* JADX INFO: renamed from: f */
    private boolean f34546f;

    /* JADX INFO: renamed from: g */
    private SurfaceHolder f34547g;

    /* JADX INFO: renamed from: h */
    protected float f34548h;

    /* JADX INFO: renamed from: i */
    protected float f34549i;

    /* JADX INFO: renamed from: j */
    protected int f34550j;

    /* JADX INFO: renamed from: k */
    private boolean f34551k;

    /* JADX INFO: renamed from: l */
    private MediaEvents f34552l;

    /* JADX INFO: renamed from: m */
    private String f34553m;

    /* JADX INFO: renamed from: n */
    private AudioManager f34554n;

    /* JADX INFO: renamed from: o */
    private AudioManager.OnAudioFocusChangeListener f34555o;

    /* JADX INFO: renamed from: p */
    private boolean f34556p;

    /* JADX INFO: renamed from: q */
    private boolean f34557q;

    /* JADX INFO: renamed from: r */
    private boolean f34558r;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView$a */
    class C12868a implements AudioManager.OnAudioFocusChangeListener {
        C12868a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            CusPlayerView.this.m35921a(i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView$b */
    private class SurfaceHolderCallbackC12869b implements SurfaceHolder.Callback {
        private SurfaceHolderCallbackC12869b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            try {
                C13219q0.m37818c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f34541a != null && surfaceHolder != null && CusPlayerView.this.f34547g != surfaceHolder) {
                    CusPlayerView.this.f34547g = surfaceHolder;
                    CusPlayerView.this.f34541a.m36000a(surfaceHolder);
                }
                CusPlayerView.this.f34544d = false;
            } catch (Exception e) {
                C13219q0.m37816b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                C13219q0.m37818c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f34541a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f34547g = surfaceHolder;
                CusPlayerView.this.f34541a.m36000a(surfaceHolder);
            } catch (Exception e) {
                C13219q0.m37816b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                C13219q0.m37818c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f34544d = true;
                CusPlayerView.this.f34546f = true;
                CusPlayerView.this.f34541a.m36016m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e) {
                C13219q0.m37816b("PlayerView", e.getMessage());
            }
        }

        /* synthetic */ SurfaceHolderCallbackC12869b(CusPlayerView cusPlayerView, C12868a c12868a) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34543c = false;
        this.f34544d = false;
        this.f34545e = false;
        this.f34546f = false;
        this.f34550j = 1;
        this.f34551k = false;
        this.f34553m = "";
        this.f34556p = false;
        this.f34557q = false;
        this.f34558r = true;
        m35925b();
    }

    /* JADX INFO: renamed from: c */
    private void m35927c() {
        try {
            this.f34554n = (AudioManager) getContext().getSystemService("audio");
            this.f34555o = new C12868a();
            C13219q0.m37818c("PlayerView", "AudioManager initialized");
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", "Failed to initialize AudioManager: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m35928d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f34547g = holder;
        holder.setKeepScreenOn(true);
        this.f34547g.addCallback(new SurfaceHolderCallbackC12869b(this, null));
        C12887b c12887b = new C12887b();
        this.f34541a = c12887b;
        c12887b.m35999a(getContext(), this.f34547g);
        addView(surfaceView, -1, -1);
    }

    /* JADX INFO: renamed from: e */
    private boolean m35929e() {
        int i;
        try {
            if (this.f34554n == null) {
                C13219q0.m37816b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z = true;
            if (this.f34557q) {
                C13219q0.m37818c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i = 3;
            } else {
                C13219q0.m37818c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i = 1;
            }
            if (this.f34554n.requestAudioFocus(this.f34555o, 3, i) != 1) {
                z = false;
            }
            this.f34556p = z;
            return z;
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", "Error requesting audio focus: " + e.getMessage());
            return false;
        }
    }

    public void closeSound() {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m36013j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f34541a != null) {
                C13219q0.m37818c("PlayerView", "coverUnlockResume========");
                if (this.f34541a.m36009f() && !this.f34546f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        long jM36005c;
        try {
            C12887b c12887b = this.f34541a;
            jM36005c = c12887b != null ? c12887b.m36005c() : 0L;
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
        return zzes$$ExternalSyntheticBackport0.m22291m(jM36005c);
    }

    public int getDuration() {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            return c12887b.m36007d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f34553m;
    }

    public MediaEvents getVideoEvents() {
        return this.f34552l;
    }

    public float getVolume() {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            return c12887b.m36008e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i) {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m36003b(i);
        }
    }

    public boolean initVFPData(String str, String str2, InterfaceC12886a interfaceC12886a) {
        if (TextUtils.isEmpty(str)) {
            C13219q0.m37818c("PlayerView", "playUrl==null");
            return false;
        }
        this.f34542b = str;
        this.f34541a.m36001a(interfaceC12886a);
        this.f34541a.m36006c(this.f34542b);
        this.f34543c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            C12887b c12887b = this.f34541a;
            return c12887b != null && c12887b.m36010g();
        } catch (Throwable th) {
            C13219q0.m37817b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f34557q;
    }

    public boolean isPlayIng() {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                return c12887b.m36011h();
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37816b("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f34558r;
    }

    public boolean isSilent() {
        return this.f34541a.m36012i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34548h = motionEvent.getRawX();
        this.f34549i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f34541a == null || this.f34544d || isComplete() || this.f34545e) {
                return;
            }
            C13219q0.m37818c("PlayerView", "onresume========");
            if (this.f34541a.m36009f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void openSound() {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m36022t();
        }
    }

    public void pause() {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                c12887b.m36016m();
            }
            pauseOmsdk();
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f34552l == null || this.f34551k) {
                return;
            }
            C13219q0.m37813a("omsdk", "play view:  pause");
            this.f34551k = true;
            this.f34552l.pause();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean playVideo(int i) {
        try {
            if (this.f34541a == null) {
                C13219q0.m37818c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f34543c) {
                C13219q0.m37818c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (m35929e()) {
                this.f34541a.m36022t();
            } else {
                C13219q0.m37820d("PlayerView", "Audio focus request denied");
                if (this.f34558r) {
                    C13219q0.m37818c("PlayerView", "Continuing playback without audio");
                    this.f34541a.m36013j();
                }
            }
            this.f34541a.m35998a(i);
            this.f34546f = false;
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                c12887b.m36018o();
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                c12887b.m36019p();
            }
            if (this.f34552l != null) {
                this.f34552l = null;
            }
            m35920a();
            if (this.f34547g != null) {
                C13219q0.m37816b("PlayerView", "mSurfaceHolder release");
                this.f34547g.getSurface().release();
            }
        } catch (Throwable th) {
            C13219q0.m37816b("PlayerView", th.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f34552l;
            if (mediaEvents != null) {
                this.f34551k = false;
                mediaEvents.resume();
                C13219q0.m37813a("omsdk", "play view:  resume");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void resumeStart() {
        try {
            if (m35929e()) {
                C12887b c12887b = this.f34541a;
                if (c12887b != null) {
                    c12887b.m36022t();
                }
            } else {
                C12887b c12887b2 = this.f34541a;
                if (c12887b2 != null) {
                    c12887b2.m36013j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void seekTo(int i) {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                c12887b.m35997a(i);
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void seekToEndFrame() {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m36020q();
        }
    }

    public void setIsCovered(boolean z) {
        try {
            this.f34545e = z;
            C13219q0.m37816b("PlayerView", "mIsCovered:" + z);
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i) {
        this.f34557q = i == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z) {
        this.f34558r = z;
        C13219q0.m37818c("PlayerView", "setPlayWithoutAudioFocus: " + z);
    }

    public void setPlaybackParams(float f) {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m35995a(f);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34553m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f34552l = mediaEvents;
    }

    public void setVolume(float f, float f2) {
        C12887b c12887b = this.f34541a;
        if (c12887b != null) {
            c12887b.m35996a(f, f2);
        }
    }

    public void start(boolean z) {
        try {
            if (this.f34541a != null) {
                if (z) {
                    if (m35929e()) {
                        this.f34541a.m36022t();
                    } else {
                        this.f34541a.m36013j();
                    }
                }
                C12887b c12887b = this.f34541a;
                if (c12887b == null || this.f34545e) {
                    return;
                }
                c12887b.m36017n();
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    public void stop() {
        try {
            C12887b c12887b = this.f34541a;
            if (c12887b != null) {
                c12887b.m36021s();
            }
            if (this.f34552l != null) {
                this.f34552l = null;
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35925b() {
        try {
            m35928d();
            m35927c();
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35921a(int i) {
        try {
            if (i == -3) {
                C13219q0.m37818c("PlayerView", "Audio focus lost transient can duck");
                C12887b c12887b = this.f34541a;
                if (c12887b != null) {
                    c12887b.m35996a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i == -2) {
                C13219q0.m37818c("PlayerView", "Audio focus lost transient");
                this.f34556p = false;
                C12887b c12887b2 = this.f34541a;
                if (c12887b2 == null || !c12887b2.m36011h()) {
                    return;
                }
                this.f34541a.m36016m();
                return;
            }
            if (i == -1) {
                C13219q0.m37818c("PlayerView", "Audio focus lost");
                this.f34556p = false;
                C12887b c12887b3 = this.f34541a;
                if (c12887b3 == null || !c12887b3.m36011h()) {
                    return;
                }
                this.f34541a.m36016m();
                return;
            }
            if (i != 1) {
                return;
            }
            C13219q0.m37818c("PlayerView", "Audio focus gained");
            this.f34556p = true;
            C12887b c12887b4 = this.f34541a;
            if (c12887b4 != null) {
                c12887b4.m35996a(1.0f, 1.0f);
                if (this.f34541a.m36011h()) {
                    return;
                }
                this.f34541a.m36017n();
            }
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", "Error handling audio focus change: " + e.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    /* JADX INFO: renamed from: a */
    private void m35920a() {
        try {
            AudioManager audioManager = this.f34554n;
            if (audioManager == null || !this.f34556p) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f34555o);
            this.f34556p = false;
            C13219q0.m37818c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e) {
            C13219q0.m37816b("PlayerView", "Error abandoning audio focus: " + e.getMessage());
        }
    }
}
