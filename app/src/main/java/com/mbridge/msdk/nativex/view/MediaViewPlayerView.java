package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.webkit.ProxyConfig;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.nativex.listener.InterfaceC13398a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {

    /* JADX INFO: renamed from: L */
    private static Handler f37298L = new Handler();

    /* JADX INFO: renamed from: A */
    private String f37299A;

    /* JADX INFO: renamed from: B */
    private String f37300B;

    /* JADX INFO: renamed from: C */
    private CampaignEx f37301C;

    /* JADX INFO: renamed from: D */
    private InterfaceC13398a f37302D;

    /* JADX INFO: renamed from: E */
    private Timer f37303E;

    /* JADX INFO: renamed from: F */
    private C14202a f37304F;

    /* JADX INFO: renamed from: G */
    private VideoNativePlayer f37305G;

    /* JADX INFO: renamed from: H */
    private C13433h f37306H;

    /* JADX INFO: renamed from: I */
    private AdSession f37307I;

    /* JADX INFO: renamed from: J */
    private MediaEvents f37308J;

    /* JADX INFO: renamed from: K */
    private boolean f37309K;

    /* JADX INFO: renamed from: a */
    private boolean f37310a;

    /* JADX INFO: renamed from: b */
    private boolean f37311b;

    /* JADX INFO: renamed from: c */
    private boolean f37312c;

    /* JADX INFO: renamed from: d */
    private boolean f37313d;

    /* JADX INFO: renamed from: e */
    private boolean f37314e;

    /* JADX INFO: renamed from: f */
    private boolean f37315f;

    /* JADX INFO: renamed from: g */
    private boolean f37316g;

    /* JADX INFO: renamed from: h */
    private boolean f37317h;

    /* JADX INFO: renamed from: i */
    private boolean f37318i;

    /* JADX INFO: renamed from: j */
    private boolean f37319j;

    /* JADX INFO: renamed from: k */
    private boolean f37320k;

    /* JADX INFO: renamed from: l */
    private volatile int f37321l;

    /* JADX INFO: renamed from: m */
    private boolean f37322m;

    /* JADX INFO: renamed from: n */
    private boolean f37323n;

    /* JADX INFO: renamed from: o */
    private TextureView f37324o;

    /* JADX INFO: renamed from: p */
    private LinearLayout f37325p;

    /* JADX INFO: renamed from: q */
    private Surface f37326q;

    /* JADX INFO: renamed from: r */
    private ProgressBar f37327r;

    /* JADX INFO: renamed from: s */
    private MyImageView f37328s;

    /* JADX INFO: renamed from: t */
    private ImageView f37329t;

    /* JADX INFO: renamed from: u */
    private ImageView f37330u;

    /* JADX INFO: renamed from: v */
    private ImageView f37331v;

    /* JADX INFO: renamed from: w */
    private ImageView f37332w;

    /* JADX INFO: renamed from: x */
    private View f37333x;

    /* JADX INFO: renamed from: y */
    private AnimationDrawable f37334y;

    /* JADX INFO: renamed from: z */
    private AlphaAnimation f37335z;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$a */
    class ViewOnClickListenerC13426a implements View.OnClickListener {
        ViewOnClickListenerC13426a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (MediaViewPlayerView.this.f37320k) {
                    MediaViewPlayerView.this.closeSound();
                    if (MediaViewPlayerView.this.f37302D != null) {
                        MediaViewPlayerView.this.f37302D.mo38747b();
                        return;
                    }
                    return;
                }
                MediaViewPlayerView.this.openSound();
                if (MediaViewPlayerView.this.f37302D != null) {
                    MediaViewPlayerView.this.f37302D.mo38745a();
                }
            } catch (Throwable th) {
                C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$b */
    class ViewOnClickListenerC13427b implements View.OnClickListener {
        ViewOnClickListenerC13427b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.f37329t.setVisibility(0);
                MediaViewPlayerView.this.m38919n();
                MediaViewPlayerView.this.m38893c();
                if (MediaViewPlayerView.this.f37302D != null) {
                    MediaViewPlayerView.this.f37302D.mo38749c();
                }
                MediaViewPlayerView.this.f37314e = true;
            } catch (Throwable th) {
                C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$c */
    class ViewOnClickListenerC13428c implements View.OnClickListener {
        ViewOnClickListenerC13428c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$d */
    class AnimationAnimationListenerC13429d implements Animation.AnimationListener {
        AnimationAnimationListenerC13429d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.f37330u.setVisibility(0);
            MediaViewPlayerView.this.m38922p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$e */
    class RunnableC13430e implements Runnable {
        RunnableC13430e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.m38893c();
                MediaViewPlayerView.this.m38902f();
            } catch (Exception e) {
                C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$f */
    class C13431f implements InterfaceC13101c {
        C13431f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.f37328s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.f37328s.setImageUrl(str);
            MediaViewPlayerView.this.f37328s.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$g */
    class C13432g extends TimerTask {
        C13432g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th) {
                C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$h */
    public static class C13433h {

        /* JADX INFO: renamed from: a */
        private MediaViewPlayerView f37343a;

        public C13433h(MediaViewPlayerView mediaViewPlayerView) {
            this.f37343a = mediaViewPlayerView;
        }

        /* JADX INFO: renamed from: a */
        public void mo38883a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f37343a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.f37319j) {
                    return;
                }
                C13219q0.m37818c("MediaViewPlayerView", "play end and display endcardView");
                this.f37343a.m38916m();
            } catch (Exception e) {
                C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$i */
    private class TextureViewSurfaceTextureListenerC13434i implements TextureView.SurfaceTextureListener {
        private TextureViewSurfaceTextureListenerC13434i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                MediaViewPlayerView.this.f37326q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f37316g = true;
                MediaViewPlayerView.this.f37318i = true;
                if (MediaViewPlayerView.this.f37313d) {
                    if (MediaViewPlayerView.this.f37317h) {
                        MediaViewPlayerView.this.f37312c = false;
                        MediaViewPlayerView.this.f37317h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f37314e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m38916m();
                    return;
                }
                if (MediaViewPlayerView.this.f37311b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m38916m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m38916m();
            } catch (Exception e) {
                C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.f37305G != null && MediaViewPlayerView.this.f37305G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f37312c = true;
                MediaViewPlayerView.this.f37316g = false;
            } catch (Throwable th) {
                C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C13219q0.m37818c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* synthetic */ TextureViewSurfaceTextureListenerC13434i(MediaViewPlayerView mediaViewPlayerView, ViewOnClickListenerC13426a viewOnClickListenerC13426a) {
            this();
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f37310a = false;
        this.f37311b = false;
        this.f37312c = false;
        this.f37313d = false;
        this.f37314e = false;
        this.f37315f = false;
        this.f37316g = false;
        this.f37317h = true;
        this.f37318i = false;
        this.f37319j = true;
        this.f37320k = false;
        this.f37321l = -1;
        this.f37322m = true;
        this.f37323n = true;
        this.f37307I = null;
        this.f37308J = null;
        this.f37309K = false;
        m38904g();
    }

    private String getPlayUrl() {
        String str;
        try {
            CampaignEx campaignEx = this.f37301C;
            if (campaignEx == null) {
                return null;
            }
            try {
                if (this.f37304F == null) {
                    if (campaignEx.getAdType() == 287 || this.f37301C.getAdType() == 94) {
                        str = this.f37301C.getRequestId() + this.f37301C.getId() + this.f37301C.getVideoUrlEncode();
                    } else {
                        str = this.f37301C.getId() + this.f37301C.getVideoUrlEncode() + this.f37301C.getBidToken();
                    }
                    this.f37304F = C14203b.getInstance().m42516a(this.f37299A, str);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
            }
            C14202a c14202a = this.f37304F;
            if (c14202a != null && c14202a.m42504o() == 5) {
                String strM42505p = this.f37304F.m42505p();
                if (new File(strM42505p).exists()) {
                    return strM42505p;
                }
            }
            String videoUrlEncode = this.f37301C.getVideoUrlEncode();
            if (C13182a1.m37597b(videoUrlEncode)) {
                return videoUrlEncode;
            }
        } catch (Exception e2) {
            C13219q0.m37816b("MediaViewPlayerView", e2.getMessage());
        }
        return null;
    }

    public void closeSound() {
        this.f37320k = false;
        try {
            if (this.f37305G != null) {
                this.f37331v.setImageResource(C13203i0.m37707a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.f37305G.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.f37308J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                }
            } catch (IllegalArgumentException e) {
                C13219q0.m37813a("OMSDK", e.getMessage());
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f37313d;
    }

    public Campaign getCampaign() {
        return this.f37301C;
    }

    public boolean getIsActiviePause() {
        return this.f37314e;
    }

    public void gonePauseView() {
        Handler handler = f37298L;
        if (handler != null) {
            handler.post(new RunnableC13430e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            return videoNativePlayer != null && videoNativePlayer.loadingViewIsVisible();
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z, VideoPlayerStatusListener videoPlayerStatusListener, C14202a c14202a, String str2) {
        try {
            if (TextUtils.isEmpty(str) || campaignEx == null) {
                return false;
            }
            this.f37300B = str;
            this.f37311b = z;
            this.f37301C = campaignEx;
            this.f37304F = c14202a;
            this.f37299A = str2;
            this.f37305G.initParameter(campaignEx.getVideoUrlEncode(), true, this.f37319j, this.f37328s, videoPlayerStatusListener);
            m38907h();
            this.f37310a = true;
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
            this.f37310a = false;
        }
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    public void onClickPlayButton() {
        InterfaceC13398a interfaceC13398a;
        try {
            m38899e();
            m38902f();
            setIsComplete(false);
            if (this.f37315f) {
                this.f37305G.play();
            } else if (!hasPrepare() || this.f37312c) {
                C13219q0.m37818c("MediaViewPlayerView", "点击播放 playVideo()");
                this.f37305G.replaySameSource(getContext(), this.f37300B, this.f37326q);
            } else {
                C13219q0.m37818c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f37312c);
                startOrPlayVideo();
            }
            if (this.f37314e && (interfaceC13398a = this.f37302D) != null) {
                interfaceC13398a.mo38750d();
            }
            this.f37314e = false;
        } catch (Throwable th) {
            C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f37328s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.f37330u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    m38886a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.f37335z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.f37335z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.f37335z.setInterpolator(new DecelerateInterpolator());
                this.f37335z.setAnimationListener(new AnimationAnimationListenerC13429d());
                m38919n();
                this.f37333x.startAnimation(this.f37335z);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.f37302D != null && !TextUtils.isEmpty(this.f37300B)) {
            this.f37302D.mo38746a(this.f37300B);
        }
        C13433h c13433h = this.f37306H;
        if (c13433h != null) {
            c13433h.mo38883a();
            return;
        }
        try {
            if (this.f37319j) {
                return;
            }
            this.f37312c = true;
            m38916m();
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f37312c = true;
            m38916m();
            if (this.f37309K) {
                return;
            }
            this.f37305G.play(getContext(), this.f37300B, this.f37326q);
            this.f37309K = true;
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        try {
            m38899e();
            m38914l();
            this.f37314e = false;
            this.f37312c = false;
            this.f37321l = i;
        } catch (Throwable th) {
            C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
        m38887a(i, i2);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f37312c = true;
            m38891b();
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        if (this.f37302D == null || TextUtils.isEmpty(this.f37300B)) {
            return;
        }
        this.f37302D.mo38748b(this.f37300B);
    }

    public void openSound() {
        this.f37320k = true;
        try {
            if (this.f37305G != null) {
                this.f37331v.setImageResource(C13203i0.m37707a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.f37305G.openSound();
            }
            try {
                MediaEvents mediaEvents = this.f37308J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e) {
                C13219q0.m37813a("OMSDK", e.getMessage());
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f37315f = true;
            }
            if (this.f37308J != null) {
                C13219q0.m37816b("omsdk", "mediaviewplayerview pause");
                this.f37308J.pause();
            }
            m38896d();
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.f37310a && this.f37305G != null) {
                if (!this.f37316g) {
                    m38916m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.f37300B) && this.f37300B.startsWith(ProxyConfig.MATCH_HTTP)) || this.f37300B.startsWith("https")) {
                    this.f37300B = getPlayUrl();
                }
                m38899e();
                this.f37305G.play(getContext(), this.f37300B, this.f37326q);
                if ((this.f37315f || this.f37314e) && (mediaEvents = this.f37308J) != null) {
                    this.f37315f = false;
                    mediaEvents.resume();
                }
                if (this.f37320k) {
                    this.f37305G.openSound();
                } else {
                    this.f37305G.closeSound();
                }
                this.f37312c = false;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void registerView(AdSession adSession) {
        this.f37307I = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            LinearLayout linearLayout = this.f37325p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            adSession.addFriendlyObstruction(linearLayout, friendlyObstructionPurpose, null);
            adSession.addFriendlyObstruction(this.f37327r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.f37328s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            adSession.addFriendlyObstruction(myImageView, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f37329t, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f37330u, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f37331v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.f37305G = null;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z) {
        this.f37319j = z;
    }

    public void setEnterFullScreen() {
        try {
            C13219q0.m37818c("MediaViewPlayerView", "setEnterFullScreen");
            this.f37313d = true;
            this.f37317h = true;
            this.f37331v.setVisibility(0);
            m38896d();
        } catch (Throwable th) {
            C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f37313d = false;
            this.f37312c = false;
            this.f37331v.setVisibility(8);
            m38914l();
            m38899e();
        } catch (Throwable th) {
            C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setIsActivePause(boolean z) {
        this.f37314e = z;
    }

    public void setIsComplete(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setMediaViewPlayListener(C13433h c13433h) {
        this.f37306H = c13433h;
    }

    public void setOnMediaViewPlayerViewListener(InterfaceC13398a interfaceC13398a) {
        this.f37302D = interfaceC13398a;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f37308J = mediaEvents;
    }

    public void showPlayView() {
        this.f37329t.setVisibility(0);
    }

    public void showProgressView(boolean z) {
        this.f37323n = z;
        ProgressBar progressBar = this.f37327r;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z) {
        this.f37322m = z;
        if (z) {
            m38914l();
        } else {
            m38896d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f37316g) {
                m38916m();
            } else if (hasPrepare()) {
                m38920o();
            } else {
                playVideo();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.f37305G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            m38896d();
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    public void unregisterView() {
        AdSession adSession = this.f37307I;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m38902f() {
        if (this.f37329t.getVisibility() != 0) {
            this.f37333x.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m38904g() {
        try {
            m38911j();
            m38909i();
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m38907h() {
        try {
            CampaignEx campaignEx = this.f37301C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!C13182a1.m37596a(imageUrl) && getContext() != null) {
                if (!C13100b.m37152a(getContext()).m37158c(imageUrl)) {
                    C13100b.m37152a(getContext()).m37155a(imageUrl, new C13431f());
                    return;
                }
                Bitmap bitmapM37156b = C13100b.m37152a(C13008c.m36588n().m36542d()).m37156b(imageUrl);
                MyImageView myImageView = this.f37328s;
                if (myImageView == null || bitmapM37156b == null) {
                    return;
                }
                myImageView.setImageUrl(imageUrl);
                this.f37328s.setImageBitmap(bitmapM37156b);
                this.f37328s.setVisibility(0);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m38909i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.f37305G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    /* JADX INFO: renamed from: j */
    private void m38911j() {
        try {
            ViewOnClickListenerC13426a viewOnClickListenerC13426a = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(C13203i0.m37707a(getContext(), "mbridge_nativex_playerview", "layout"), (ViewGroup) null);
            if (viewInflate != null) {
                this.f37325p = (LinearLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_textureview", "id"));
                this.f37324o = textureView;
                textureView.setKeepScreenOn(true);
                this.f37324o.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC13434i(this, viewOnClickListenerC13426a));
                this.f37327r = (ProgressBar) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_progress", "id"));
                this.f37328s = (MyImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f37329t = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_iv_play", "id"));
                this.f37330u = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_iv_pause", "id"));
                this.f37331v = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_iv_sound", "id"));
                this.f37333x = viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f37332w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f37334y = animationDrawable;
                animationDrawable.start();
                m38912k();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m38912k() {
        this.f37331v.setOnClickListener(new ViewOnClickListenerC13426a());
        this.f37330u.setOnClickListener(new ViewOnClickListenerC13427b());
        this.f37329t.setOnClickListener(new ViewOnClickListenerC13428c());
    }

    /* JADX INFO: renamed from: l */
    private void m38914l() {
        ImageView imageView;
        if (this.f37313d || (imageView = this.f37332w) == null || imageView.getVisibility() == 0 || !this.f37322m) {
            return;
        }
        this.f37332w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m38916m() {
        try {
            this.f37328s.setVisibility(0);
            this.f37329t.setVisibility(0);
            m38919n();
            m38893c();
            this.f37327r.setVisibility(8);
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m38919n() {
        this.f37333x.setVisibility(0);
    }

    /* JADX INFO: renamed from: o */
    private void m38920o() {
        MediaEvents mediaEvents;
        try {
            if (this.f37305G == null) {
                return;
            }
            m38899e();
            if (this.f37318i) {
                this.f37305G.start(this.f37326q);
                this.f37318i = false;
            } else {
                this.f37305G.start();
            }
            if ((this.f37315f || this.f37314e) && (mediaEvents = this.f37308J) != null) {
                this.f37315f = false;
                mediaEvents.resume();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m38922p() {
        m38886a();
        this.f37303E = new Timer();
        this.f37303E.schedule(new C13432g(), 2000L);
    }

    /* JADX INFO: renamed from: b */
    private void m38891b() {
        try {
            if (URLUtil.isNetworkUrl(this.f37300B)) {
                return;
            }
            String videoUrlEncode = this.f37301C.getVideoUrlEncode();
            if (C13182a1.m37597b(videoUrlEncode)) {
                this.f37300B = videoUrlEncode;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38893c() {
        this.f37330u.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    private void m38896d() {
        if (this.f37332w.getVisibility() == 0) {
            this.f37332w.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m38899e() {
        try {
            this.f37328s.setVisibility(8);
            this.f37329t.setVisibility(8);
            m38902f();
            showProgressView(this.f37323n);
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38887a(int i, int i2) {
        try {
            ProgressBar progressBar = this.f37327r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i2 > 0) {
                this.f37327r.setMax(i2);
            }
            if (i >= 0) {
                this.f37327r.setProgress(i + 1);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38886a() {
        try {
            Handler handler = f37298L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.f37303E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MediaViewPlayerView", e.getMessage());
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37310a = false;
        this.f37311b = false;
        this.f37312c = false;
        this.f37313d = false;
        this.f37314e = false;
        this.f37315f = false;
        this.f37316g = false;
        this.f37317h = true;
        this.f37318i = false;
        this.f37319j = true;
        this.f37320k = false;
        this.f37321l = -1;
        this.f37322m = true;
        this.f37323n = true;
        this.f37307I = null;
        this.f37308J = null;
        this.f37309K = false;
        m38904g();
    }
}
