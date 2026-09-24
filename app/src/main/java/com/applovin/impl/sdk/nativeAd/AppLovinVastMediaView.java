package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1505b;
import com.applovin.impl.AbstractC1524c8;
import com.applovin.impl.AbstractC1525d;
import com.applovin.impl.AbstractC1534d8;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1714s0;
import com.applovin.impl.C1514b8;
import com.applovin.impl.C1517c1;
import com.applovin.impl.C1554f8;
import com.applovin.impl.C1557g1;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1816x7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.EnumC1807w7;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final C1517c1 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final AbstractC1505b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final C1711r7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<C1514b8> videoProgressTrackers;
    private final C1758e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$a */
    class C1754a extends AbstractC1505b {
        C1754a() {
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$b */
    class C1755b implements C1517c1.b {
        C1755b() {
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: a */
        public void mo2092a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - ((long) (AppLovinVastMediaView.this.videoView.getDuration() - AppLovinVastMediaView.this.videoView.getCurrentPosition())));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            for (C1514b8 c1514b8 : new HashSet(AppLovinVastMediaView.this.videoProgressTrackers)) {
                if (c1514b8.m2139a(seconds, videoPercentViewed)) {
                    hashSet.add(c1514b8);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(c1514b8);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m3649x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m3650y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m3642C();
            }
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: b */
        public boolean mo2093b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$c */
    private class ViewOnClickListenerC1756c implements View.OnClickListener {
        private ViewOnClickListenerC1756c() {
        }

        /* synthetic */ ViewOnClickListenerC1756c(AppLovinVastMediaView appLovinVastMediaView, C1754a c1754a) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriM5599c;
            C1816x7 c1816x7M4232f1 = AppLovinVastMediaView.this.vastAd.m4232f1();
            if (c1816x7M4232f1 == null || (uriM5599c = c1816x7M4232f1.m5599c()) == null) {
                return;
            }
            C1768p c1768p = AppLovinVastMediaView.this.logger;
            if (C1768p.m5160a()) {
                AppLovinVastMediaView.this.logger.m5171a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriM5599c);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(C1711r7.d.INDUSTRY_ICON_CLICK);
            if (!AppLovinVastMediaView.this.nativeAd.isCustomTabsEnabled()) {
                AbstractC1664n7.m3685a(uriM5599c, view.getContext(), AppLovinVastMediaView.this.sdk);
                return;
            }
            C1557g1 c1557g1M4757A = AppLovinVastMediaView.this.sdk.m4757A();
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            c1557g1M4757A.m2661a(uriM5599c, appLovinVastMediaView.nativeAd, appLovinVastMediaView.sdk.m4861w0());
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$d */
    private class C1757d implements AppLovinTouchToClickListener.OnClickListener {
        private C1757d() {
        }

        /* synthetic */ C1757d(AppLovinVastMediaView appLovinVastMediaView, C1754a c1754a) {
            this();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri uriMo4224Z;
            AppLovinVastMediaView.this.maybeFireTrackers(C1711r7.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().m3647v();
            if (AppLovinVastMediaView.this.vastAd.mo4247x0() && (uriMo4224Z = AppLovinVastMediaView.this.vastAd.mo4224Z()) != null) {
                C1768p c1768p = AppLovinVastMediaView.this.logger;
                if (C1768p.m5160a()) {
                    AppLovinVastMediaView.this.logger.m5171a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.m4840l().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.m4525b(motionEvent));
                AppLovinVastMediaView.this.nativeAd.handleNativeAdClick(uriMo4224Z, null, (!((Boolean) AppLovinVastMediaView.this.sdk.m4801a(C1831z4.f4066w)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e */
    class C1758e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private C1758e() {
        }

        /* synthetic */ C1758e(AppLovinVastMediaView appLovinVastMediaView, C1754a c1754a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m5001a() {
            AppLovinVastMediaView.this.videoView.seekTo(0);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C1768p c1768p = AppLovinVastMediaView.this.logger;
            if (C1768p.m5160a()) {
                AppLovinVastMediaView.this.logger.m5171a(AppLovinVastMediaView.TAG, "Video completed");
            }
            AppLovinVastMediaView.this.videoWasCompleted = true;
            AppLovinVastMediaView.this.finishVideo();
            if (AppLovinVastMediaView.this.replayIconContainer != null) {
                AbstractC1564g8.m2753a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m5001a();
                    }
                });
            } else {
                AppLovinVastMediaView.this.showMediaImageView();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + i + "," + i2 + ")");
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 3) {
                return false;
            }
            AppLovinVastMediaView.this.countdownManager.m2153b();
            if (AppLovinVastMediaView.this.isViewAttached) {
                return false;
            }
            AppLovinVastMediaView.this.pauseVideo();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView.this.mediaPlayer = mediaPlayer;
            AppLovinVastMediaView.this.mediaPlayer.setOnInfoListener(AppLovinVastMediaView.this.videoUiEventHandler);
            AppLovinVastMediaView.this.mediaPlayer.setOnErrorListener(AppLovinVastMediaView.this.videoUiEventHandler);
            float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
            AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().m3643b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), AbstractC1701q7.m4103e(AppLovinVastMediaView.this.sdk));
            C1768p c1768p = AppLovinVastMediaView.this.logger;
            if (C1768p.m5160a()) {
                AppLovinVastMediaView.this.logger.m5171a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            if (AppLovinVastMediaView.this.isViewAttached) {
                AppLovinVastMediaView.this.videoView.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f */
    class ViewOnClickListenerC1759f implements View.OnClickListener {
        private ViewOnClickListenerC1759f() {
        }

        /* synthetic */ ViewOnClickListenerC1759f(AppLovinVastMediaView appLovinVastMediaView, C1754a c1754a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m5002a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.m4826e().m2144a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.videoView.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    AbstractC1564g8.m2761b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m5002a();
                        }
                    });
                }
            } else {
                if (AppLovinVastMediaView.this.mediaPlayer == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                    appLovinVastMediaView.isVideoMuted = !appLovinVastMediaView.isVideoMuted;
                    float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
                    AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
                    AppLovinVastMediaView appLovinVastMediaView2 = AppLovinVastMediaView.this;
                    appLovinVastMediaView2.populateMuteImage(appLovinVastMediaView2.isVideoMuted);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1748l c1748l, Context context) {
        super(appLovinNativeAdImpl, c1748l, context);
        C1754a c1754a = null;
        C1758e c1758e = new C1758e(this, c1754a);
        this.videoUiEventHandler = c1758e;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new C1517c1(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new C1754a();
        C1711r7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zMo4248y0 = vastAd.mo4248y0();
        this.isVideoStream = zMo4248y0;
        if (zMo4248y0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.m4238l1()) {
            this.industryIconImageView = C1816x7.m5595a(vastAd.m4232f1().m5601e(), context, c1748l);
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3875Z4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) c1748l.m4801a(C1831z4.f3891b5)).intValue()));
            this.industryIconImageView.setOnClickListener(new ViewOnClickListenerC1756c(this, c1754a));
            addView(this.industryIconImageView);
        }
        if (((Boolean) c1748l.m4801a(C1831z4.f3936g5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int iDpToPx2 = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(C1846R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) c1748l.m4801a(C1831z4.f3927f5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            ViewOnClickListenerC1759f viewOnClickListenerC1759f = new ViewOnClickListenerC1759f(this, c1754a);
            this.playPauseButtonImageView.setOnClickListener(viewOnClickListenerC1759f);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3909d5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3900c5)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(viewOnClickListenerC1759f);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3918e5)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx2 + i, Math.max(iDpToPx3, iDpToPx2) + i, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) c1748l.m4801a(C1831z4.f3945h5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new ViewOnClickListenerC1759f(this, c1754a));
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3954i5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(C1846R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(c1758e);
        appLovinVideoView.setOnCompletionListener(c1758e);
        appLovinVideoView.setOnErrorListener(c1758e);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c1748l, C1831z4.f3922f0, getContext(), new C1757d(this, c1754a)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.m4227a(C1711r7.d.VIDEO, AbstractC1524c8.f1297a));
    }

    private void areCachedAdResourcesMissing(boolean z) {
        if (AbstractC1701q7.m4041a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(C1711r7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.m4826e().m2146b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().m3648w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.m4840l().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (C1768p.m5160a()) {
            this.logger.m5174b(TAG, str);
        }
        maybeFireTrackers(C1711r7.d.ERROR, EnumC1807w7.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().m2806b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.m4764E().m4331a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (C1768p.m5160a()) {
            this.logger.m5174b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.m4530c0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5178k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(C1711r7.d dVar) {
        maybeFireTrackers(dVar, EnumC1807w7.UNSPECIFIED);
    }

    private void maybeFireTrackers(C1711r7.d dVar, EnumC1807w7 enumC1807w7) {
        maybeFireTrackers(dVar, "", enumC1807w7);
    }

    private void maybeFireTrackers(C1711r7.d dVar, String str) {
        maybeFireTrackers(dVar, str, EnumC1807w7.UNSPECIFIED);
    }

    private void maybeFireTrackers(C1711r7.d dVar, String str, EnumC1807w7 enumC1807w7) {
        maybeFireTrackers((Set<C1514b8>) this.vastAd.m4226a(dVar, str), enumC1807w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<C1514b8> set) {
        maybeFireTrackers(set, EnumC1807w7.UNSPECIFIED);
    }

    private void maybeFireTrackers(Set<C1514b8> set, EnumC1807w7 enumC1807w7) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        C1554f8 c1554f8M4237k1 = this.vastAd.m4237k1();
        Uri uriM2631d = c1554f8M4237k1 != null ? c1554f8M4237k1.m2631d() : null;
        if (C1768p.m5160a()) {
            this.logger.m5171a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        AbstractC1534d8.m2439a(set, seconds, uriM2631d, enumC1807w7, this.sdk);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.m4238l1()) {
                maybeFireTrackers(C1711r7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(C1711r7.d.IMPRESSION);
            maybeFireTrackers(C1711r7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().m2811g();
            this.vastAd.setHasShown(true);
            this.sdk.m4840l().trackImpression(this.vastAd);
            this.viewActivity = AbstractC1525d.m2242a(AbstractC1564g8.m2760b(this));
            this.sdk.m4826e().m2144a(this.lifecycleCallbacksAdapter);
            this.videoView.start();
            this.countdownManager.m2152a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new C1755b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(C1711r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            this.vastAd.getAdEventTracker().m3651z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(C1711r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            this.vastAd.getAdEventTracker().m3640A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.videoView.start();
                this.countdownManager.m2153b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (C1768p.m5160a()) {
                this.logger.m5171a(TAG, "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseVideo() {
        if (C1768p.m5160a()) {
            this.logger.m5171a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.countdownManager.m2154c();
        if (C1768p.m5160a()) {
            this.logger.m5171a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z ? C1846R.drawable.applovin_ic_unmute_to_mute : C1846R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable != null) {
            this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            return true;
        }
        Uri uriM4482G = z ? this.vastAd.m4482G() : this.vastAd.m4517Y();
        if (uriM4482G == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, uriM4482G, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? C1846R.drawable.applovin_ic_play_icon : C1846R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        areCachedAdResourcesMissing(!this.isVideoStream);
        this.videoView.setVideoURI(this.vastAd.mo4235i0());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
            this.videoView.stopPlayback();
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.vastAd.getAdEventTracker().m2810f();
        this.countdownManager.m2151a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !AbstractC1714s0.m4314a(i)) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }
}
