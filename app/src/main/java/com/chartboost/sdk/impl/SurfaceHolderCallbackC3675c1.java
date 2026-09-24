package com.chartboost.sdk.impl;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC3675c1 implements InterfaceC3698d1, SurfaceHolder.Callback, InterfaceC3763fk.b, C4122vj.b, InterfaceC3653b2 {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f13631a;

    /* JADX INFO: renamed from: b */
    public SurfaceView f13632b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3721e1 f13633c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3945ni f13634d;

    /* JADX INFO: renamed from: e */
    public final Function4 f13635e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f13636f;

    /* JADX INFO: renamed from: g */
    public final C4001q8 f13637g;

    /* JADX INFO: renamed from: h */
    public long f13638h;

    /* JADX INFO: renamed from: i */
    public boolean f13639i;

    /* JADX INFO: renamed from: j */
    public boolean f13640j;

    /* JADX INFO: renamed from: k */
    public boolean f13641k;

    /* JADX INFO: renamed from: l */
    public boolean f13642l;

    /* JADX INFO: renamed from: m */
    public boolean f13643m;

    /* JADX INFO: renamed from: n */
    public SurfaceHolder f13644n;

    /* JADX INFO: renamed from: o */
    public C3827if f13645o;

    /* JADX INFO: renamed from: p */
    public C4122vj f13646p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC3763fk f13647q;

    /* JADX INFO: renamed from: r */
    public boolean f13648r;

    /* JADX INFO: renamed from: s */
    public float f13649s;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c1$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public a(Object obj) {
            super(0, obj, SurfaceHolderCallbackC3675c1.class, "startMediaPlayer", "startMediaPlayer$ChartboostMonetization_9_11_1_productionRelease()V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17014a() {
            ((SurfaceHolderCallbackC3675c1) this.receiver).m17012n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17014a();
            return Unit.INSTANCE;
        }
    }

    public SurfaceHolderCallbackC3675c1(MediaPlayer mediaPlayer, SurfaceView surfaceView, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni uiPoster, Function3 videoProgressFactory, Function4 videoBufferFactory, CoroutineDispatcher coroutineDispatcher, C4001q8 fileCache) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        Intrinsics.checkNotNullParameter(videoBufferFactory, "videoBufferFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        this.f13631a = mediaPlayer;
        this.f13632b = surfaceView;
        this.f13633c = interfaceC3721e1;
        this.f13634d = uiPoster;
        this.f13635e = videoBufferFactory;
        this.f13636f = coroutineDispatcher;
        this.f13637g = fileCache;
        this.f13644n = surfaceView != null ? surfaceView.getHolder() : null;
        this.f13647q = (InterfaceC3763fk) videoProgressFactory.invoke(this.f13633c, this, uiPoster);
    }

    public /* synthetic */ SurfaceHolderCallbackC3675c1(MediaPlayer mediaPlayer, SurfaceView surfaceView, InterfaceC3721e1 interfaceC3721e1, InterfaceC3945ni interfaceC3945ni, Function3 function3, Function4 function4, CoroutineDispatcher coroutineDispatcher, C4001q8 c4001q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MediaPlayer() : mediaPlayer, surfaceView, interfaceC3721e1, interfaceC3945ni, function3, function4, (i & 64) != 0 ? Dispatchers.getMain() : coroutineDispatcher, c4001q8);
    }

    /* JADX INFO: renamed from: a */
    public static final void m16999a(SurfaceHolderCallbackC3675c1 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f13638h < ((double) mediaPlayer.getDuration()) - (((double) mediaPlayer.getDuration()) * 0.05d)) {
            this$0.m17006e();
            return;
        }
        InterfaceC3721e1 interfaceC3721e1 = this$0.f13633c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17466b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17000a(SurfaceHolderCallbackC3675c1 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((i != 805 && i != 804) || i2 != -1004) {
            return true;
        }
        this$0.m17006e();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final void m17001b(int i, int i2) {
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.f13632b;
        int videoHeight = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 1;
        MediaPlayer mediaPlayer2 = this.f13631a;
        AbstractC3947nk.m18806a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m17002b(SurfaceHolderCallbackC3675c1 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m17004c(i, i2);
        return true;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3763fk.b
    /* JADX INFO: renamed from: a */
    public long mo16777a() {
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.f13638h = currentPosition;
        return currentPosition;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3874kg
    /* JADX INFO: renamed from: a */
    public void mo16778a(int i, int i2) {
        m17001b(i2, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m17003a(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.f13642l = false;
        int duration = mp.getDuration();
        SurfaceView surfaceView = this.f13632b;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.f13632b;
        m17001b(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17467b(duration);
        }
        this.f13639i = true;
        C4122vj c4122vj = this.f13646p;
        if (c4122vj != null) {
            c4122vj.m19722a(duration);
        }
        if (this.f13640j) {
            m17012n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: a */
    public void mo16779a(C4078tj asset) {
        InterfaceC3721e1 interfaceC3721e1;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Unit unit = null;
        C4048sb.m19408a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        if (this.f13631a != null) {
            C4122vj c4122vj = (C4122vj) this.f13635e.invoke(asset, this, this.f13636f, this.f13637g);
            this.f13646p = c4122vj;
            this.f13645o = c4122vj != null ? c4122vj.m19725d() : null;
            SurfaceHolder surfaceHolder = this.f13644n;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                interfaceC3721e1 = this.f13633c;
                if (interfaceC3721e1 != null) {
                    interfaceC3721e1.mo17465a("Missing media player during startMediaPlayer");
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        } else {
            interfaceC3721e1 = this.f13633c;
            if (interfaceC3721e1 != null) {
                interfaceC3721e1.mo17465a("Missing media player during startMediaPlayer");
                Unit unit3 = Unit.INSTANCE;
            }
        }
        this.f13648r = false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: b */
    public void mo16781b() {
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3653b2
    /* JADX INFO: renamed from: c */
    public void mo16783c() {
        this.f13643m = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m17004c(int i, int i2) {
        C4048sb.m19411b("MediaPlayer error: " + ("error: " + i + " extra: " + i2), (Throwable) null, 2, (Object) null);
        if (this.f13639i) {
            m17006e();
        }
    }

    @Override // com.chartboost.sdk.impl.C4122vj.b
    /* JADX INFO: renamed from: d */
    public void mo17005d() {
        this.f13640j = true;
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        m17010l();
        MediaPlayer mediaPlayer2 = this.f13631a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17469d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17006e() {
        if (!this.f13640j || this.f13642l) {
            return;
        }
        C4122vj c4122vj = this.f13646p;
        if (c4122vj != null) {
            c4122vj.m19721a();
        }
        this.f13642l = false;
        InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
        if (interfaceC3721e1 != null) {
            interfaceC3721e1.mo17468c();
        }
        pause();
        C4122vj c4122vj2 = this.f13646p;
        if (c4122vj2 != null) {
            c4122vj2.m19724c();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: f */
    public void mo16786f() {
        this.f13649s = 0.0f;
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: g */
    public float mo16787g() {
        return this.f13649s;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    /* JADX INFO: renamed from: h */
    public boolean mo16788h() {
        return this.f13648r;
    }

    /* JADX INFO: renamed from: i */
    public final void m17007i() {
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f13633c = null;
        this.f13631a = null;
        this.f13644n = null;
        this.f13632b = null;
        this.f13646p = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m17008j() {
        this.f13647q.mo17746a();
    }

    /* JADX INFO: renamed from: k */
    public final void m17009k() {
        InterfaceC3763fk.a.m17748a(this.f13647q, 0L, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x000f, B:17:0x0027, B:12:0x0018, B:14:0x001c), top: B:26:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x000f, B:17:0x0027, B:12:0x0018, B:14:0x001c), top: B:26:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX INFO: renamed from: l */
    public final void m17010l() {
        InterfaceC3721e1 interfaceC3721e1;
        Unit unit;
        FileDescriptor fileDescriptorM18017b;
        Unit unit2 = null;
        try {
            C3827if c3827if = this.f13645o;
            if (c3827if == null || (fileDescriptorM18017b = c3827if.m18017b()) == null) {
                interfaceC3721e1 = this.f13633c;
                if (interfaceC3721e1 != null) {
                    interfaceC3721e1.mo17465a("Missing video asset");
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                MediaPlayer mediaPlayer = this.f13631a;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(fileDescriptorM18017b);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    interfaceC3721e1 = this.f13633c;
                    if (interfaceC3721e1 != null) {
                        interfaceC3721e1.mo17465a("Missing video asset");
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                }
            }
            if (unit == null) {
                C4048sb.m19411b("MediaPlayer missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } catch (IOException e) {
            InterfaceC3721e1 interfaceC3721e2 = this.f13633c;
            if (interfaceC3721e2 != null) {
                interfaceC3721e2.mo17465a(e.toString());
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                C4048sb.m19410b("MediaPlayer missing callback on IOException", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m17011m() {
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f$0.m17003a(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return SurfaceHolderCallbackC3675c1.m17000a(this.f$0, mediaPlayer2, i, i2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    SurfaceHolderCallbackC3675c1.m16999a(this.f$0, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.chartboost.sdk.impl.c1$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return SurfaceHolderCallbackC3675c1.m17002b(this.f$0, mediaPlayer2, i, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17012n() {
        Unit unit;
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                this.f13648r = true;
                m17009k();
                InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
                if (interfaceC3721e1 != null) {
                    interfaceC3721e1.mo17463a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.f13638h, 3);
                } else {
                    mediaPlayer.seekTo((int) this.f13638h);
                }
                unit = Unit.INSTANCE;
            } catch (IllegalStateException e) {
                InterfaceC3721e1 interfaceC3721e2 = this.f13633c;
                if (interfaceC3721e2 != null) {
                    interfaceC3721e2.mo17465a(e.toString());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        InterfaceC3721e1 interfaceC3721e3 = this.f13633c;
        if (interfaceC3721e3 != null) {
            interfaceC3721e3.mo17465a("Missing video player during startVideoPlayer");
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m17013o() {
        this.f13634d.mo18804a(500L, new a(this));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void pause() {
        C4048sb.m19408a("pause()", (Throwable) null, 2, (Object) null);
        if (this.f13639i && this.f13640j) {
            C4122vj c4122vj = this.f13646p;
            if (c4122vj != null) {
                c4122vj.m19726e();
            }
            m17008j();
            try {
                MediaPlayer mediaPlayer = this.f13631a;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e) {
                InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
                if (interfaceC3721e1 != null) {
                    interfaceC3721e1.mo17465a(e.toString());
                }
            }
            this.f13638h = mo16777a();
            this.f13640j = false;
            this.f13641k = true;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void play() {
        C4048sb.m19408a("play()", (Throwable) null, 2, (Object) null);
        if (this.f13639i && !this.f13640j) {
            m17013o();
        }
        this.f13640j = true;
        this.f13641k = this.f13643m;
        this.f13643m = false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3698d1
    public void stop() throws IOException {
        C4048sb.m19408a("stop()", (Throwable) null, 2, (Object) null);
        if (this.f13639i) {
            C4122vj c4122vj = this.f13646p;
            if (c4122vj != null) {
                c4122vj.m19726e();
            }
            this.f13646p = null;
            this.f13638h = 0L;
            m17008j();
            try {
                MediaPlayer mediaPlayer = this.f13631a;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e) {
                InterfaceC3721e1 interfaceC3721e1 = this.f13633c;
                if (interfaceC3721e1 != null) {
                    interfaceC3721e1.mo17465a(e.toString());
                }
            }
            this.f13640j = false;
            this.f13641k = false;
            C3827if c3827if = this.f13645o;
            if (c3827if != null) {
                c3827if.m18016a();
            }
            this.f13645o = null;
            m17007i();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f13641k) {
            MediaPlayer mediaPlayer = this.f13631a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(holder);
            }
            play();
            return;
        }
        try {
            m17011m();
            m17010l();
            MediaPlayer mediaPlayer2 = this.f13631a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f13631a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(holder);
            }
        } catch (Exception e) {
            C4048sb.m19410b("SurfaceCreated exception", e);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaPlayer mediaPlayer = this.f13631a;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }
}
