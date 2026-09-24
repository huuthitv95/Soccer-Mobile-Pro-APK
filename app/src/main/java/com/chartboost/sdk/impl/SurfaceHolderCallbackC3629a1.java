package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC3629a1 implements InterfaceC3698d1, SurfaceHolder.Callback, Player.Listener, InterfaceC3763fk.b, InterfaceC3653b2 {

    /* JADX INFO: renamed from: a */
    public final C3728e8 f13431a;

    /* JADX INFO: renamed from: b */
    public final SurfaceView f13432b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3721e1 f13433c;

    /* JADX INFO: renamed from: d */
    public final Lazy f13434d;

    /* JADX INFO: renamed from: e */
    public final Lazy f13435e;

    /* JADX INFO: renamed from: f */
    public boolean f13436f;

    /* JADX INFO: renamed from: g */
    public boolean f13437g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a1$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3636a8 f13438b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SurfaceHolderCallbackC3629a1 f13439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3636a8 c3636a8, SurfaceHolderCallbackC3629a1 surfaceHolderCallbackC3629a1) {
            super(0);
            this.f13438b = c3636a8;
            this.f13439c = surfaceHolderCallbackC3629a1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExoPlayer invoke() {
            ExoPlayer exoPlayerM16806a = this.f13438b.m16806a();
            exoPlayerM16806a.addListener(this.f13439c);
            return exoPlayerM16806a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a1$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3 f13440b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SurfaceHolderCallbackC3629a1 f13441c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC3945ni f13442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3, SurfaceHolderCallbackC3629a1 surfaceHolderCallbackC3629a1, InterfaceC3945ni interfaceC3945ni) {
            super(0);
            this.f13440b = function3;
            this.f13441c = surfaceHolderCallbackC3629a1;
            this.f13442d = interfaceC3945ni;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3763fk invoke() {
            return (InterfaceC3763fk) this.f13440b.invoke(this.f13441c.f13433c, this.f13441c, this.f13442d);
        }
    }

    public SurfaceHolderCallbackC3629a1(Context context, C3636a8 exoPlayerFactory, C3728e8 exoPlayerMediaItemFactory, SurfaceView surfaceView, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni uiPoster, Function3 videoProgressFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(exoPlayerMediaItemFactory, "exoPlayerMediaItemFactory");
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        this.f13431a = exoPlayerMediaItemFactory;
        this.f13432b = surfaceView;
        this.f13433c = interfaceC3721e1;
        this.f13434d = LazyKt.lazy(new a(exoPlayerFactory, this));
        this.f13435e = LazyKt.lazy(new b(videoProgressFactory, this, uiPoster));
    }

    public /* synthetic */ SurfaceHolderCallbackC3629a1(Context context, C3636a8 c3636a8, C3728e8 c3728e8, SurfaceView surfaceView, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni interfaceC3945ni, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new C3636a8(context, null, null, null, 14, null) : c3636a8, c3728e8, surfaceView, (i & 16) != 0 ? null : interfaceC3721e1, interfaceC3945ni, function3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16776a(SurfaceHolderCallbackC3629a1 surfaceHolderCallbackC3629a1, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = surfaceHolderCallbackC3629a1.f13432b.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = surfaceHolderCallbackC3629a1.f13432b.getHeight();
        }
        surfaceHolderCallbackC3629a1.m16782b(i, i2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3763fk.b
    /* JADX INFO: renamed from: a */
    public long mo16777a() {
        return m16784d().getCurrentPosition();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3874kg
    /* JADX INFO: renamed from: a */
    public void mo16778a(int i, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: a */
    public void mo16779a(C4078tj asset) {
        Unit unit;
        Intrinsics.checkNotNullParameter(asset, "asset");
        C4048sb.m19408a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        MediaItem mediaItemM16780b = m16780b(asset);
        if (mediaItemM16780b != null) {
            ExoPlayer exoPlayerM16784d = m16784d();
            exoPlayerM16784d.addMediaItem(mediaItemM16780b);
            exoPlayerM16784d.prepare();
            SurfaceHolder holder = this.f13432b.getHolder();
            if (holder != null) {
                holder.addCallback(this);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
            if (interfaceC3721e1 != null) {
                interfaceC3721e1.mo17465a("Error retrieving media item");
            }
            C4048sb.m19411b("Error retrieving media item", (Throwable) null, 2, (Object) null);
        }
        this.f13436f = false;
    }

    /* JADX INFO: renamed from: b */
    public final MediaItem m16780b(C4078tj c4078tj) {
        MediaItem mediaItemM17526a = this.f13431a.m17526a(c4078tj);
        C4048sb.m19408a("VideoAsset.toMediaItem() - " + mediaItemM17526a, (Throwable) null, 2, (Object) null);
        return mediaItemM17526a;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: b */
    public void mo16781b() {
        m16784d().setVolume(1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m16782b(int i, int i2) {
        AbstractC3947nk.m18806a(this.f13432b, AbstractC3774g8.m17790b(m16784d()), AbstractC3774g8.m17789a(m16784d()), i, i2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3653b2
    /* JADX INFO: renamed from: c */
    public void mo16783c() {
        this.f13437g = true;
    }

    /* JADX INFO: renamed from: d */
    public final ExoPlayer m16784d() {
        return (ExoPlayer) this.f13434d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC3763fk m16785e() {
        return (InterfaceC3763fk) this.f13435e.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: f */
    public void mo16786f() {
        m16784d().setVolume(0.0f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: g */
    public float mo16787g() {
        return m16784d().getVolume();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: h */
    public boolean mo16788h() {
        return this.f13436f;
    }

    /* JADX INFO: renamed from: i */
    public final void m16789i() {
        stop();
        m16792l();
        InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17466b();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16790j() {
        m16776a(this, 0, 0, 3, null);
        InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17469d();
        }
        InterfaceC3721e1 interfaceC3721e2 = this.f13433c;
        if (interfaceC3721e2 != null) {
            interfaceC3721e2.mo17467b(m16784d().getDuration());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16791k() {
        InterfaceC3763fk.a.m17748a(m16785e(), 0L, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m16792l() {
        m16785e().mo17746a();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i) {
        Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(CueGroup cueGroup) {
        Player.Listener.CC.$default$onCues(this, cueGroup);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(List list) {
        Player.Listener.CC.$default$onCues(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        Player.Listener.CC.$default$onEvents(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onIsLoadingChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        C4048sb.m19408a("onIsPlayingChanged() - isPlaying: " + z, (Throwable) null, 2, (Object) null);
        if (!z) {
            m16792l();
            return;
        }
        this.f13436f = true;
        InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17463a();
        }
        m16791k();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onLoadingChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMetadata(Metadata metadata) {
        Player.Listener.CC.$default$onMetadata(this, metadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i) {
        C4048sb.m19408a("onPlaybackStateChanged() - playbackState: " + AbstractC3652b1.m16886b(i), (Throwable) null, 2, (Object) null);
        if (i == 2) {
            InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
            if (interfaceC3721e1 != null) {
                interfaceC3721e1.mo17468c();
                return;
            }
            return;
        }
        if (i == 3) {
            m16790j();
        } else {
            if (i != 4) {
                return;
            }
            m16789i();
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4048sb.m19410b("ExoPlayer error", error);
        stop();
        InterfaceC3721e1 interfaceC3721e1 = this.f13433c;
        if (interfaceC3721e1 != null) {
            String message = error.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            interfaceC3721e1.mo17465a(message);
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        Player.Listener.CC.$default$onRenderedFirstFrame(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i) {
        Player.Listener.CC.$default$onRepeatModeChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekBackIncrementChanged(long j) {
        Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekProcessed() {
        Player.Listener.CC.$default$onSeekProcessed(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTracksChanged(Tracks tracks) {
        Player.Listener.CC.$default$onTracksChanged(this, tracks);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVolumeChanged(float f) {
        Player.Listener.CC.$default$onVolumeChanged(this, f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void pause() {
        C4048sb.m19408a("pause()", (Throwable) null, 2, (Object) null);
        m16784d().pause();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void play() {
        C4048sb.m19408a("play()", (Throwable) null, 2, (Object) null);
        m16784d().setVideoSurfaceView(this.f13432b);
        m16784d().play();
        this.f13437g = false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void stop() {
        C4048sb.m19408a("stop()", (Throwable) null, 2, (Object) null);
        if (m16784d().isPlaying()) {
            m16784d().stop();
        }
        m16784d().release();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4048sb.m19408a("surfaceCreated()", (Throwable) null, 2, (Object) null);
        if (this.f13437g) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4048sb.m19408a("surfaceDestroyed()", (Throwable) null, 2, (Object) null);
    }
}
