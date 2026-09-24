package com.vungle.ads.internal.p298ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.nativead.NativeVideoContract;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AdVideoView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0003z{|B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020AH\u0002J\b\u0010G\u001a\u00020AH\u0002J\b\u0010H\u001a\u00020AH\u0002J\u0006\u0010I\u001a\u00020\rJ\u0006\u0010J\u001a\u00020\rJ\u0006\u0010K\u001a\u00020\tJ\b\u0010L\u001a\u00020\tH\u0002J\b\u0010M\u001a\u00020AH\u0002J\u0018\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010S\u001a\u00020AH\u0002J\b\u0010T\u001a\u00020AH\u0002J\u0010\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020\rH\u0002J\b\u0010W\u001a\u00020AH\u0014J\b\u0010X\u001a\u00020AH\u0014J \u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\t2\u0006\u0010Z\u001a\u00020[H\u0016J \u0010_\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010`\u001a\u00020A2\u0006\u0010Z\u001a\u00020[H\u0016J\u0006\u0010a\u001a\u00020AJ\b\u0010b\u001a\u00020AH\u0002J\r\u0010c\u001a\u00020AH\u0000¢\u0006\u0002\bdJ\u0006\u0010e\u001a\u00020AJ\r\u0010f\u001a\u00020AH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020AH\u0002J\u0006\u0010i\u001a\u00020AJ\u000e\u0010j\u001a\u00020A2\u0006\u0010k\u001a\u00020\rJ\u0018\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020\t2\b\b\u0002\u0010n\u001a\u00020>J\u000e\u0010o\u001a\u00020A2\u0006\u0010p\u001a\u00020\tJ\u000e\u0010q\u001a\u00020A2\u0006\u0010r\u001a\u00020\tJ\u000e\u0010s\u001a\u00020A2\u0006\u0010t\u001a\u00020(J\u000e\u0010u\u001a\u00020A2\u0006\u0010v\u001a\u00020\u000bJ\u0017\u0010w\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0002\bxJ\u0006\u0010y\u001a\u00020AR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010)\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0002018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoVisibility", "", "callback", "Lcom/vungle/ads/nativead/NativeVideoContract$VideoLifecycleCallback;", "durationMs", "", "handler", "Landroid/os/Handler;", "lastPosMs", "lastProgressSent", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "looping", "mediaPlayerFactory", "Lkotlin/Function0;", "Landroid/media/MediaPlayer;", "getMediaPlayerFactory$vungle_ads_release$annotations", "()V", "getMediaPlayerFactory$vungle_ads_release", "()Lkotlin/jvm/functions/Function0;", "setMediaPlayerFactory$vungle_ads_release", "(Lkotlin/jvm/functions/Function0;)V", CampaignEx.JSON_KEY_AD_MP, "muted", "prepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preparing", "progressUpdater", "Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "sourceUri", "Landroid/net/Uri;", "surface", "Landroid/view/Surface;", "getSurface$vungle_ads_release$annotations", "getSurface$vungle_ads_release", "()Landroid/view/Surface;", "setSurface$vungle_ads_release", "(Landroid/view/Surface;)V", "texture", "Landroid/view/TextureView;", "getTexture$vungle_ads_release$annotations", "getTexture$vungle_ads_release", "()Landroid/view/TextureView;", "setTexture$vungle_ads_release", "(Landroid/view/TextureView;)V", "videoCompleted", "videoH", "videoPaused", "videoTransformCallback", "Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "videoW", "visibilityThreshold", "", "wantPlay", "applyMute", "", "applyTransform", "beginProgressUpdates", "calculateAndNotifyProgress", "checkVisibility", "detachSurface", "endProgressUpdates", "ensurePlayer", "getCurrentPositionMs", "getDurationMs", "isMuted", "isVisibleEnough", "notifyCompleted", "notifyError", "what", "extra", "", "notifyMuted", "notifyPause", "notifyPlay", "notifyProgress", "percentage", "onAttachedToWindow", "onDetachedFromWindow", "onSurfaceTextureAvailable", "st", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "pauseInternal", "pauseOnActivityPaused", "pauseOnActivityPaused$vungle_ads_release", "play", "playOnActivityResumed", "playOnActivityResumed$vungle_ads_release", "prepareIfNeeded", "release", "seekTo", "ms", "setAutoVisibility", "enabled", "threshold", "setLooping", "loop", "setMuted", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "setSource", ShareConstants.MEDIA_URI, "setVideoLifecycleCallback", "lifecycleCallback", "setVideoTransformCallback", "setVideoTransformCallback$vungle_ads_release", "stop", "Companion", "ProgressUpdateRunnable", "VideoTransformCallback", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class AdVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private NativeVideoContract.VideoLifecycleCallback callback;
    private int durationMs;
    private final Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private Function0<? extends MediaPlayer> mediaPlayerFactory;
    private MediaPlayer mp;
    private boolean muted;
    private AtomicBoolean prepared;
    private AtomicBoolean preparing;
    private final ProgressUpdateRunnable progressUpdater;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Uri sourceUri;
    private Surface surface;
    private TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private VideoTransformCallback videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* JADX INFO: compiled from: AdVideoView.kt */
    @Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "Ljava/lang/Runnable;", "adVideoView", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "(Lcom/vungle/ads/internal/ui/view/AdVideoView;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "run", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    private static final class ProgressUpdateRunnable implements Runnable {
        private final WeakReference<AdVideoView> weakRef;

        public ProgressUpdateRunnable(AdVideoView adVideoView) {
            Intrinsics.checkNotNullParameter(adVideoView, "adVideoView");
            this.weakRef = new WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer;
            AdVideoView adVideoView = this.weakRef.get();
            if (adVideoView == null) {
                return;
            }
            adVideoView.calculateAndNotifyProgress();
            if (!adVideoView.prepared.get() || (mediaPlayer = adVideoView.mp) == null || !mediaPlayer.isPlaying() || adVideoView.videoCompleted) {
                return;
            }
            adVideoView.handler.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: compiled from: AdVideoView.kt */
    @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "", "onVideoTransformed", "", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public interface VideoTransformCallback {
        void onVideoTransformed(float left, float top);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdVideoView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AdVideoView.m44847scrollListener$lambda0(this.f$0);
            }
        };
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AdVideoView.m44846layoutListener$lambda1(this.f$0);
            }
        };
        this.visibilityThreshold = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new AtomicBoolean(false);
        this.preparing = new AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressUpdater = new ProgressUpdateRunnable(this);
        this.mediaPlayerFactory = new Function0<MediaPlayer>() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$mediaPlayerFactory$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MediaPlayer invoke() {
                return new MediaPlayer();
            }
        };
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new FrameLayout.LayoutParams(-1, -1));
    }

    public /* synthetic */ AdVideoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void applyMute() {
        float f = this.muted ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    private final void applyTransform() {
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        float f4 = this.videoW / this.videoH;
        Matrix matrix = new Matrix();
        float f5 = f3 > f4 ? f2 / this.videoH : f / this.videoW;
        matrix.setScale((this.videoW * f5) / f, (this.videoH * f5) / f2, f / 2.0f, f2 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f6 = (f - (this.videoW * f5)) / 2.0f;
        float f7 = (f2 - (this.videoH * f5)) / 2.0f;
        VideoTransformCallback videoTransformCallback = this.videoTransformCallback;
        if (videoTransformCallback != null) {
            videoTransformCallback.onVideoTransformed(this.texture.getX() + f6, this.texture.getY() + f7);
        }
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int iCoerceIn;
        int i = this.durationMs;
        if (i <= 0 || !this.prepared.get() || (iCoerceIn = RangesKt.coerceIn((int) ((((long) getCurrentPositionMs()) * ((long) 100)) / ((long) i)), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = iCoerceIn;
        notifyProgress(iCoerceIn);
    }

    private final void checkVisibility() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.autoVisibility) {
            if (!isVisibleEnough() || !this.wantPlay || this.videoPaused) {
                if (this.prepared.get() && (mediaPlayer = this.mp) != null && mediaPlayer.isPlaying()) {
                    Logger.INSTANCE.m43467d(TAG, "auto-pause: visibility NOT enough");
                    pauseInternal();
                    return;
                }
                return;
            }
            if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid()) {
                prepareIfNeeded();
                return;
            }
            MediaPlayer mediaPlayer2 = this.mp;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.videoCompleted) {
                Logger.Companion companion = Logger.INSTANCE;
                StringBuilder sb = new StringBuilder("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.mp;
                sb.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                sb.append(" ms");
                companion.m43467d(TAG, sb.toString());
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        }
    }

    private final void detachSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    private final void ensurePlayer() {
        if (this.mp != null) {
            return;
        }
        MediaPlayer mediaPlayerInvoke = this.mediaPlayerFactory.invoke();
        mediaPlayerInvoke.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayerInvoke.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AdVideoView.m44842ensurePlayer$lambda14$lambda10(this.f$0, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                AdVideoView.m44843ensurePlayer$lambda14$lambda11(this.f$0, mediaPlayer, i, i2);
            }
        });
        mediaPlayerInvoke.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                AdVideoView.m44844ensurePlayer$lambda14$lambda12(this.f$0, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return AdVideoView.m44845ensurePlayer$lambda14$lambda13(this.f$0, mediaPlayer, i, i2);
            }
        });
        this.mp = mediaPlayerInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m44842ensurePlayer$lambda14$lambda10(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this$0.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i = this$0.lastPosMs;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        this$0.applyMute();
        Logger.INSTANCE.m43467d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay && (surface = this$0.surface) != null && surface.isValid()) {
            Logger.INSTANCE.m43467d(TAG, "start video on prepared.");
            mediaPlayer.start();
            this$0.notifyPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m44843ensurePlayer$lambda14$lambda11(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.videoW = i;
        this$0.videoH = i2;
        SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m44844ensurePlayer$lambda14$lambda12(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.m43467d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m44845ensurePlayer$lambda14$lambda13(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.m43471w(TAG, "onError(): what=" + i + ", extra=" + i2);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i, String.valueOf(i2));
        return true;
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!getGlobalVisibleRect(rect)) {
            return false;
        }
        long jHeight = ((long) rect.height()) * ((long) rect.width());
        long height = ((long) getHeight()) * ((long) getWidth());
        return height > 0 && ((float) jHeight) / ((float) height) >= this.visibilityThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m44846layoutListener$lambda1(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    private final void notifyCompleted() {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoCompleted();
        }
    }

    private final void notifyError(int what, String extra) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoError(what, extra);
        }
    }

    private final void notifyMuted(boolean muted) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoMuted(muted);
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPause();
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPlay();
        }
    }

    private final void notifyProgress(int percentage) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoProgress(percentage);
        }
    }

    private final void pauseInternal() {
        Object objM44946constructorimpl;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null && this.prepared.get() && mediaPlayer.isPlaying()) {
            Logger.INSTANCE.m43467d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            mediaPlayer.pause();
            notifyPause();
        } else {
            Logger.INSTANCE.m43467d(TAG, "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            objM44946constructorimpl = Result.m44946constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = numValueOf;
        }
        this.lastPosMs = ((Number) objM44946constructorimpl).intValue();
    }

    private final void prepareIfNeeded() {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            Uri uri = this.sourceUri;
            if (uri != null && !this.prepared.get() && !this.preparing.get()) {
                ensurePlayer();
                this.preparing.set(true);
                this.prepared.set(false);
                MediaPlayer mediaPlayer = this.mp;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(this.looping);
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setSurface(this.surface);
                }
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setDataSource(getContext(), uri);
                }
                Logger.Companion companion2 = Logger.INSTANCE;
                StringBuilder sb = new StringBuilder("prepareAsync(): uri=");
                sb.append(uri);
                sb.append(", surfaceValid=");
                Surface surface = this.surface;
                Unit unit = null;
                sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
                companion2.m43467d(TAG, sb.toString());
                MediaPlayer mediaPlayer5 = this.mp;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                    unit = Unit.INSTANCE;
                }
                objM44946constructorimpl = Result.m44946constructorimpl(unit);
                Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                if (thM44949exceptionOrNullimpl != null) {
                    notifyError(-1, String.valueOf(thM44949exceptionOrNullimpl.getLocalizedMessage()));
                }
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m44847scrollListener$lambda0(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    public static /* synthetic */ void setAutoVisibility$default(AdVideoView adVideoView, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        adVideoView.setAutoVisibility(z, f);
    }

    public final int getCurrentPositionMs() {
        Object objM44946constructorimpl;
        if (!this.prepared.get()) {
            return RangesKt.coerceAtLeast(this.lastPosMs, 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            objM44946constructorimpl = Result.m44946constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = numValueOf;
        }
        return RangesKt.coerceAtLeast(((Number) objM44946constructorimpl).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final Function0<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    /* JADX INFO: renamed from: getSurface$vungle_ads_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getTexture$vungle_ads_release, reason: from getter */
    public final TextureView getTexture() {
        return this.texture;
    }

    /* JADX INFO: renamed from: isMuted, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Logger.INSTANCE.m43467d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Logger.INSTANCE.m43467d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture st, int width, int height) {
        Object objM44946constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = new Surface(st);
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(this.surface);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Logger.INSTANCE.m43469e(TAG, "Failed to set surface", thM44949exceptionOrNullimpl);
        }
        boolean zM44953isSuccessimpl = Result.m44953isSuccessimpl(objM44946constructorimpl);
        Logger.INSTANCE.m43467d(TAG, "onSurfaceTextureAvailable(): " + width + " x " + height + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + zM44953isSuccessimpl);
        if (zM44953isSuccessimpl && this.prepared.get() && this.wantPlay) {
            Logger.INSTANCE.m43467d(TAG, "onSurfaceTextureAvailable and videoCompleted=" + this.videoCompleted);
            if (this.videoCompleted) {
                seekTo(this.durationMs);
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.pause();
                }
            } else {
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object objM44946constructorimpl;
        Intrinsics.checkNotNullParameter(st, "st");
        Logger.INSTANCE.m43467d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            Unit unit = null;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit = Unit.INSTANCE;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Logger.INSTANCE.m43469e(TAG, "Failed to clear surface", thM44949exceptionOrNullimpl);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
        Logger.INSTANCE.m43467d(TAG, "onSurfaceTextureSizeChanged() width=" + width + " height=" + height);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public final void pause() {
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.mp;
        sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        companion.m43467d(TAG, sb.toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void play() {
        Surface surface;
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb = new StringBuilder("play(): prepared=");
        sb.append(this.prepared);
        sb.append(", surfaceValid=");
        Surface surface2 = this.surface;
        sb.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb.append(", visible=");
        sb.append(isVisibleEnough());
        companion.m43467d(TAG, sb.toString());
        if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid() || !isVisibleEnough()) {
            prepareIfNeeded();
            return;
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            Logger.Companion companion2 = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("play(): pos=");
            MediaPlayer mediaPlayer2 = this.mp;
            sb2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            sb2.append(" ms");
            companion2.m43467d(TAG, sb2.toString());
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            notifyPlay();
        }
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void release() {
        Object objM44946constructorimpl;
        Object objM44946constructorimpl2;
        Object objM44946constructorimpl3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        Logger.INSTANCE.m43467d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit3 = Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(unit3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Logger.INSTANCE.m43469e(TAG, "Failed to clear Surface", thM44949exceptionOrNullimpl);
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            AdVideoView adVideoView2 = this;
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            objM44946constructorimpl2 = Result.m44946constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM44946constructorimpl2 = Result.m44946constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM44949exceptionOrNullimpl2 = Result.m44949exceptionOrNullimpl(objM44946constructorimpl2);
        if (thM44949exceptionOrNullimpl2 != null) {
            Logger.INSTANCE.m43469e(TAG, "Failed to stop MediaPlayer", thM44949exceptionOrNullimpl2);
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            AdVideoView adVideoView3 = this;
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM44946constructorimpl3 = Result.m44946constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            objM44946constructorimpl3 = Result.m44946constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM44949exceptionOrNullimpl3 = Result.m44949exceptionOrNullimpl(objM44946constructorimpl3);
        if (thM44949exceptionOrNullimpl3 != null) {
            Logger.INSTANCE.m43469e(TAG, "Failed to release MediaPlayer", thM44949exceptionOrNullimpl3);
        }
        this.mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    public final void seekTo(int ms) {
        this.lastPosMs = RangesKt.coerceAtLeast(ms, 0);
        Logger.INSTANCE.m43467d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setAutoVisibility(boolean enabled, float threshold) {
        Logger.INSTANCE.m43467d(TAG, "setAutoVisibility enabled=" + enabled + " threshold=" + threshold);
        this.autoVisibility = enabled;
        this.visibilityThreshold = RangesKt.coerceIn(threshold, 0.0f, 1.0f);
        if (enabled) {
            checkVisibility();
        }
    }

    public final void setLooping(boolean loop) {
        Logger.INSTANCE.m43467d(TAG, "setLooping to " + this.looping);
        this.looping = loop;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(loop);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(Function0<? extends MediaPlayer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mediaPlayerFactory = function0;
    }

    public final void setMuted(boolean mute) {
        Logger.INSTANCE.m43467d(TAG, "setMuted to " + mute);
        this.muted = mute;
        applyMute();
        notifyMuted(mute);
    }

    public final void setSource(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.surface = surface;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.texture = textureView;
    }

    public final void setVideoLifecycleCallback(NativeVideoContract.VideoLifecycleCallback lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(VideoTransformCallback callback) {
        this.videoTransformCallback = callback;
    }

    public final void stop() {
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        MediaPlayer mediaPlayer = this.mp;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb = new StringBuilder("stop(): prepared=");
        sb.append(this.prepared);
        sb.append(", surface=");
        Surface surface = this.surface;
        sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        companion.m43467d(TAG, sb.toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid() && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer.pause();
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }
}
