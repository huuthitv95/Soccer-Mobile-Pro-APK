package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p008ui.PlayerView;
import com.chartboost.sdk.events.ChartboostError;
import java.io.File;
import java.net.URL;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4110v7 implements InterfaceC3671bk {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3659b8 f16551a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4051se f16552b;

    /* JADX INFO: renamed from: c */
    public final CoroutineScope f16553c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3694ck f16554d;

    /* JADX INFO: renamed from: e */
    public ExoPlayer f16555e;

    /* JADX INFO: renamed from: f */
    public PlayerView f16556f;

    /* JADX INFO: renamed from: g */
    public URL f16557g;

    /* JADX INFO: renamed from: h */
    public CancellableContinuation f16558h;

    /* JADX INFO: renamed from: i */
    public final C4132w7 f16559i;

    /* JADX INFO: renamed from: j */
    public final a f16560j;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v7$a */
    public static final class a implements Player.Listener {
        public a() {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            Player.Listener.CC.$default$onCues(this, cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onCues(List list) {
            Player.Listener.CC.$default$onCues(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            Player.Listener.CC.$default$onEvents(this, player, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            Player.Listener.CC.$default$onIsLoadingChanged(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            Player.Listener.CC.$default$onIsPlayingChanged(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            Player.Listener.CC.$default$onLoadingChanged(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            Player.Listener.CC.$default$onMetadata(this, metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 1) {
                C4048sb.m19408a("Player is idle.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i == 2) {
                C4048sb.m19408a("Player is buffering.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                C4110v7.this.f16559i.m19761a(AbstractC3963oe.d.f15686a);
            } else {
                AbstractC4007qe abstractC4007qeM19763b = C4110v7.this.f16559i.m19763b();
                if (abstractC4007qeM19763b instanceof AbstractC4007qe.c) {
                    C4110v7.this.f16559i.m19761a(new AbstractC3963oe.f(((AbstractC4007qe.c) abstractC4007qeM19763b).mo19170a()));
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4110v7.this.f16559i.m19761a(new AbstractC3963oe.e(error));
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            Player.Listener.CC.$default$onRenderedFirstFrame(this);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            Player.Listener.CC.$default$onRepeatModeChanged(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            Player.Listener.CC.$default$onTracksChanged(this, tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            Player.Listener.CC.$default$onVolumeChanged(this, f);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v7$b */
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16562b;

        /* JADX INFO: renamed from: c */
        public Object f16563c;

        /* JADX INFO: renamed from: d */
        public Object f16564d;

        /* JADX INFO: renamed from: e */
        public Object f16565e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f16566f;

        /* JADX INFO: renamed from: h */
        public int f16568h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16566f = obj;
            this.f16568h |= Integer.MIN_VALUE;
            Object objMo16959a = C4110v7.this.mo16959a(null, null, null, this);
            return objMo16959a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo16959a : Result.m44945boximpl(objMo16959a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v7$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.v7$c$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f16570b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C4110v7 f16571c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4110v7 c4110v7, Continuation continuation) {
                super(2, continuation);
                this.f16571c = c4110v7;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f16571c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f16570b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f16571c.f16559i.m19761a(AbstractC3963oe.i.f15691a);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19671a(Throwable th) {
            BuildersKt__Builders_commonKt.launch$default(C4110v7.this.f16553c, NonCancellable.INSTANCE, null, new a(C4110v7.this, null), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19671a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public C4110v7(InterfaceC3659b8 exoPlayerFactory, InterfaceC4051se playerViewFactory, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(playerViewFactory, "playerViewFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f16551a = exoPlayerFactory;
        this.f16552b = playerViewFactory;
        this.f16553c = coroutineScope;
        this.f16559i = new C4132w7(this, coroutineScope);
        this.f16560j = new a();
    }

    public /* synthetic */ C4110v7(InterfaceC3659b8 interfaceC3659b8, InterfaceC4051se interfaceC4051se, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3659b8, interfaceC4051se, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate())) : coroutineScope);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: a */
    public long mo16957a() {
        return this.f16559i.m19764c();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: a */
    public View mo16958a(Context context) {
        PlayerView playerView;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f16555e == null) {
            return null;
        }
        PlayerView playerView2 = this.f16556f;
        if (playerView2 == null) {
            playerView = this.f16556f;
            if (playerView != null) {
                playerView.setPlayer(null);
            }
            PlayerView playerViewMo19429a = this.f16552b.mo19429a(context);
            playerViewMo19429a.setPlayer(this.f16555e);
            this.f16556f = playerViewMo19429a;
        } else {
            if (!Intrinsics.areEqual(playerView2 != null ? playerView2.getContext() : null, context)) {
                playerView = this.f16556f;
                if (playerView != null) {
                    playerView.setPlayer(null);
                }
                PlayerView playerViewMo19429a2 = this.f16552b.mo19429a(context);
                playerViewMo19429a2.setPlayer(this.f16555e);
                this.f16556f = playerViewMo19429a2;
            }
        }
        return this.f16556f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: a */
    public Object mo16959a(Context context, URL url, InterfaceC4153x6 interfaceC4153x6, Continuation continuation) throws Throwable {
        b bVar;
        CancellableContinuation cancellableContinuation;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f16568h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f16568h = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object result = bVar.f16566f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f16568h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            bVar.f16562b = this;
            bVar.f16563c = context;
            bVar.f16564d = url;
            bVar.f16565e = interfaceC4153x6;
            bVar.f16568h = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bVar), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuation cancellableContinuation2 = this.f16558h;
            if (cancellableContinuation2 != null && cancellableContinuation2.isActive() && (cancellableContinuation = this.f16558h) != null) {
                Boxing.boxBoolean(CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null));
            }
            this.f16558h = cancellableContinuationImpl;
            this.f16557g = url;
            this.f16559i.m19761a(new AbstractC3963oe.a(context, url, interfaceC4153x6));
            cancellableContinuationImpl.invokeOnCancellation(new c());
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(bVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
        }
        return ((Result) result).getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m19659a(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(false);
        URL url = this.f16557g;
        C4048sb.m19408a("Pause command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m19660a(ExoPlayer player, float f) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setVolume(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m19661a(ExoPlayer player, File cachedFile) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        MediaItem mediaItemFromUri = MediaItem.fromUri(Uri.fromFile(cachedFile));
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
        player.setMediaItem(mediaItemFromUri);
        player.prepare();
        URL url = this.f16557g;
        C4048sb.m19408a("Player created and preparing for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: a */
    public void mo16960a(InterfaceC3694ck interfaceC3694ck) {
        this.f16554d = interfaceC3694ck;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: a */
    public void mo16961a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f16559i.m19761a(new AbstractC3963oe.k(reason));
    }

    /* JADX INFO: renamed from: a */
    public final void m19662a(Throwable error) {
        ChartboostError videoPlaybackError;
        Intrinsics.checkNotNullParameter(error, "error");
        URL url = this.f16557g;
        C4048sb.m19410b("ExoPlayerAdapter error for " + (url != null ? url.toString() : null), error);
        if (error instanceof ChartboostError) {
            videoPlaybackError = (ChartboostError) error;
        } else if ((error instanceof PlaybackException) && (error.getCause() instanceof ChartboostError)) {
            Throwable cause = error.getCause();
            Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type com.chartboost.sdk.events.ChartboostError");
            videoPlaybackError = (ChartboostError) cause;
        } else {
            CancellableContinuation cancellableContinuation = this.f16558h;
            videoPlaybackError = (cancellableContinuation == null || !cancellableContinuation.isActive()) ? new ChartboostError.Render.VideoPlaybackError(error.getMessage(), error) : new ChartboostError.Load.Unknown(error.getMessage(), error);
        }
        CancellableContinuation cancellableContinuation2 = this.f16558h;
        if (cancellableContinuation2 != null) {
            if (!cancellableContinuation2.isActive()) {
                cancellableContinuation2 = null;
            }
            if (cancellableContinuation2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(videoPlaybackError)));
            }
        }
        this.f16558h = null;
        if ((videoPlaybackError instanceof ChartboostError.Load.AssetUnavailable) || (videoPlaybackError instanceof ChartboostError.Show.AdInvalidated)) {
            InterfaceC3694ck interfaceC3694ckM19665c = m19665c();
            if (interfaceC3694ckM19665c != null) {
                interfaceC3694ckM19665c.mo17212d();
            }
        } else {
            InterfaceC3694ck interfaceC3694ckM19665c2 = m19665c();
            if (interfaceC3694ckM19665c2 != null) {
                interfaceC3694ckM19665c2.mo17210a(videoPlaybackError);
            }
        }
        this.f16559i.m19761a(AbstractC3963oe.i.f15691a);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    /* JADX INFO: renamed from: b */
    public long mo16962b() {
        return this.f16559i.m19759a();
    }

    /* JADX INFO: renamed from: b */
    public final ExoPlayer m19663b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m19670f();
        ExoPlayer exoPlayerMo16910a = this.f16551a.mo16910a(context);
        this.f16555e = exoPlayerMo16910a;
        exoPlayerMo16910a.addListener(this.f16560j);
        return exoPlayerMo16910a;
    }

    /* JADX INFO: renamed from: b */
    public final void m19664b(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(true);
        URL url = this.f16557g;
        C4048sb.m19408a("Play command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC3694ck m19665c() {
        return this.f16554d;
    }

    /* JADX INFO: renamed from: c */
    public final void m19666c(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.prepare();
    }

    /* JADX INFO: renamed from: d */
    public final void m19667d() {
        InterfaceC3694ck interfaceC3694ckM19665c = m19665c();
        if (interfaceC3694ckM19665c != null) {
            interfaceC3694ckM19665c.mo17211c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19668d(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.stop();
        URL url = this.f16557g;
        C4048sb.m19408a("Stop command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    public final void m19669e() {
        CancellableContinuation cancellableContinuation = this.f16558h;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m44946constructorimpl(Result.m44945boximpl(Result.m44946constructorimpl(Unit.INSTANCE))));
            }
        }
        this.f16558h = null;
        InterfaceC3694ck interfaceC3694ckM19665c = m19665c();
        if (interfaceC3694ckM19665c != null) {
            interfaceC3694ckM19665c.mo17213e();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19670f() {
        ExoPlayer exoPlayer = this.f16555e;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.f16560j);
        }
        ExoPlayer exoPlayer2 = this.f16555e;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.f16555e = null;
        PlayerView playerView = this.f16556f;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        C4048sb.m19408a("ExoPlayer instance has been released.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    public float getVolume() {
        ExoPlayer exoPlayer = this.f16555e;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    public void pause() {
        this.f16559i.m19761a(AbstractC3963oe.g.f15689a);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    public void play() {
        this.f16559i.m19761a(AbstractC3963oe.h.f15690a);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    public void release() {
        this.f16559i.m19761a(AbstractC3963oe.i.f15691a);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3671bk
    public void setVolume(float f) {
        this.f16559i.m19761a(new AbstractC3963oe.j(f));
    }
}
