package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.c2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1518c2 extends AbstractC1819y1 implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: M */
    private final C1528d2 f1238M;

    /* JADX INFO: renamed from: N */
    private MediaPlayer f1239N;

    /* JADX INFO: renamed from: O */
    private final View f1240O;

    /* JADX INFO: renamed from: P */
    protected final AppLovinVideoView f1241P;

    /* JADX INFO: renamed from: Q */
    protected final C1478a f1242Q;

    /* JADX INFO: renamed from: R */
    protected final C1498g f1243R;

    /* JADX INFO: renamed from: S */
    protected C1596k0 f1244S;

    /* JADX INFO: renamed from: T */
    protected final ImageView f1245T;

    /* JADX INFO: renamed from: U */
    protected final ProgressBar f1246U;

    /* JADX INFO: renamed from: V */
    protected ProgressBar f1247V;

    /* JADX INFO: renamed from: W */
    protected ImageView f1248W;

    /* JADX INFO: renamed from: X */
    private final d f1249X;

    /* JADX INFO: renamed from: Y */
    private final Handler f1250Y;

    /* JADX INFO: renamed from: Z */
    private final Handler f1251Z;

    /* JADX INFO: renamed from: a0 */
    protected final C1517c1 f1252a0;

    /* JADX INFO: renamed from: b0 */
    protected final C1517c1 f1253b0;

    /* JADX INFO: renamed from: c0 */
    private final boolean f1254c0;

    /* JADX INFO: renamed from: d0 */
    protected boolean f1255d0;

    /* JADX INFO: renamed from: e0 */
    protected long f1256e0;

    /* JADX INFO: renamed from: f0 */
    private int f1257f0;

    /* JADX INFO: renamed from: g0 */
    private int f1258g0;

    /* JADX INFO: renamed from: h0 */
    protected boolean f1259h0;

    /* JADX INFO: renamed from: i0 */
    private boolean f1260i0;

    /* JADX INFO: renamed from: j0 */
    private final AtomicBoolean f1261j0;

    /* JADX INFO: renamed from: k0 */
    private final AtomicBoolean f1262k0;

    /* JADX INFO: renamed from: l0 */
    private long f1263l0;

    /* JADX INFO: renamed from: m0 */
    private long f1264m0;

    /* JADX INFO: renamed from: com.applovin.impl.c2$a */
    class a implements C1517c1.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f1265a;

        a(int i) {
            this.f1265a = i;
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: a */
        public void mo2092a() {
            C1518c2 c1518c2 = C1518c2.this;
            if (c1518c2.f1244S != null) {
                long seconds = ((long) this.f1265a) - TimeUnit.MILLISECONDS.toSeconds(c1518c2.f1241P.getCurrentPosition());
                if (seconds <= 0) {
                    C1518c2.this.f3615v = true;
                } else if (C1518c2.this.m2182P()) {
                    C1518c2.this.f1244S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: b */
        public boolean mo2093b() {
            return C1518c2.this.m2182P();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.c2$b */
    class b implements C1517c1.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Integer f1267a;

        b(Integer num) {
            this.f1267a = num;
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: a */
        public void mo2092a() {
            C1518c2 c1518c2 = C1518c2.this;
            if (c1518c2.f1259h0) {
                c1518c2.f1246U.setVisibility(8);
            } else {
                C1518c2.this.f1246U.setProgress((int) ((c1518c2.f1241P.getCurrentPosition() / C1518c2.this.f1256e0) * this.f1267a.intValue()));
            }
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: b */
        public boolean mo2093b() {
            return !C1518c2.this.f1259h0;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.c2$c */
    class c implements C1517c1.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f1269a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Integer f1270b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Long f1271c;

        c(long j, Integer num, Long l) {
            this.f1269a = j;
            this.f1270b = num;
            this.f1271c = l;
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: a */
        public void mo2092a() {
            C1518c2.this.f1247V.setProgress((int) ((C1518c2.this.f3611r / this.f1269a) * this.f1270b.intValue()));
            C1518c2.this.f3611r += this.f1271c.longValue();
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: b */
        public boolean mo2093b() {
            return C1518c2.this.f3611r < this.f1269a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.c2$d */
    private class d implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        /* synthetic */ d(C1518c2 c1518c2, a aVar) {
            this();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            C1518c2.this.mo2083a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C1768p c1768p = C1518c2.this.f3596c;
            if (C1768p.m5160a()) {
                C1518c2.this.f3596c.m5171a("AppLovinFullscreenActivity", "Video completed");
            }
            C1518c2.this.f1260i0 = true;
            C1518c2 c1518c2 = C1518c2.this;
            if (!c1518c2.f3613t) {
                c1518c2.mo2081R();
            } else if (c1518c2.m5662h()) {
                C1518c2.this.mo2178A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1518c2.this.mo2087g("Video view error (" + i + "," + i2 + ")");
            C1518c2.this.f1241P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C1768p c1768p = C1518c2.this.f3596c;
            if (C1768p.m5160a()) {
                C1518c2.this.f3596c.m5171a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                C1518c2.this.mo2080Q();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                C1518c2.this.mo2078E();
                return false;
            }
            C1518c2.this.f1252a0.m2153b();
            C1518c2 c1518c2 = C1518c2.this;
            if (c1518c2.f1243R != null) {
                c1518c2.m2167O();
            }
            C1518c2.this.mo2078E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C1518c2.this.f1239N = mediaPlayer;
            mediaPlayer.setOnInfoListener(C1518c2.this.f1249X);
            mediaPlayer.setOnErrorListener(C1518c2.this.f1249X);
            float f = !C1518c2.this.f1255d0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            C1518c2.this.f3614u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            C1518c2.this.mo2086d(mediaPlayer.getDuration());
            C1518c2.this.mo2079N();
            C1768p c1768p = C1518c2.this.f3596c;
            if (C1768p.m5160a()) {
                C1518c2.this.f3596c.m5171a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1518c2.this.f1239N);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.c2$e */
    private class e implements View.OnClickListener {
        private e() {
        }

        /* synthetic */ e(C1518c2 c1518c2, a aVar) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1518c2 c1518c2 = C1518c2.this;
            if (view == c1518c2.f1243R) {
                c1518c2.m2183S();
                return;
            }
            if (view == c1518c2.f1245T) {
                c1518c2.mo2082T();
                return;
            }
            C1768p c1768p = c1518c2.f3596c;
            if (C1768p.m5160a()) {
                C1518c2.this.f3596c.m5174b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1518c2(AbstractC1736b abstractC1736b, Activity activity, Map map, C1748l c1748l, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f1238M = new C1528d2(this.f3594a, this.f3597d, this.f3595b);
        a aVar = null;
        this.f1248W = null;
        d dVar = new d(this, aVar);
        this.f1249X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f1250Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f1251Z = handler2;
        C1517c1 c1517c1 = new C1517c1(handler, this.f3595b);
        this.f1252a0 = c1517c1;
        this.f1253b0 = new C1517c1(handler2, this.f3595b);
        boolean zMo4248y0 = this.f3594a.mo4248y0();
        this.f1254c0 = zMo4248y0;
        this.f1255d0 = AbstractC1701q7.m4103e(this.f3595b);
        this.f1258g0 = -1;
        this.f1261j0 = new AtomicBoolean();
        this.f1262k0 = new AtomicBoolean();
        this.f1263l0 = -2L;
        this.f1264m0 = 0L;
        if (!abstractC1736b.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f1241P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(dVar);
        appLovinVideoView.setOnCompletionListener(dVar);
        appLovinVideoView.setOnErrorListener(dVar);
        abstractC1736b.m4538h().putString("video_view_address", AbstractC1564g8.m2752a(appLovinVideoView));
        View view = new View(activity);
        this.f1240O = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) c1748l.m4801a(C1831z4.f4004o1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(c1748l, C1831z4.f3913e0, activity, dVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c1748l, C1831z4.f3913e0, activity, dVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return C1518c2.m2171a(view2, motionEvent);
                }
            });
        }
        e eVar = new e(this, aVar);
        if (abstractC1736b.m4524a0() >= 0) {
            C1498g c1498g = new C1498g(abstractC1736b.m4509U(), activity);
            this.f1243R = c1498g;
            c1498g.setVisibility(8);
            c1498g.setOnClickListener(eVar);
        } else {
            this.f1243R = null;
        }
        if (m2173a(this.f1255d0, c1748l)) {
            ImageView imageView = new ImageView(activity);
            this.f1245T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            m2176e(this.f1255d0);
        } else {
            this.f1245T = null;
        }
        if (zMo4248y0) {
            C1478a c1478a = new C1478a(activity, ((Integer) c1748l.m4801a(C1831z4.f3987m2)).intValue(), R.attr.progressBarStyleLarge);
            this.f1242Q = c1478a;
            c1478a.setColor(Color.parseColor("#75FFFFFF"));
            c1478a.setBackgroundColor(Color.parseColor("#00000000"));
            c1478a.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f1242Q = null;
        }
        int iM5655c = m5655c();
        if (((Boolean) c1748l.m4801a(C1831z4.f3848W1)).booleanValue() && iM5655c > 0) {
            z = true;
        }
        if (this.f1244S == null && z) {
            this.f1244S = new C1596k0(activity);
            int iM4559s = abstractC1736b.m4559s();
            this.f1244S.setTextColor(iM4559s);
            this.f1244S.setTextSize(((Integer) c1748l.m4801a(C1831z4.f3840V1)).intValue());
            this.f1244S.setFinishedStrokeColor(iM4559s);
            this.f1244S.setFinishedStrokeWidth(((Integer) c1748l.m4801a(C1831z4.f3832U1)).intValue());
            this.f1244S.setMax(iM5655c);
            this.f1244S.setProgress(iM5655c);
            c1517c1.m2152a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iM5655c));
        }
        if (!abstractC1736b.m4539h0()) {
            this.f1246U = null;
            return;
        }
        Long l = (Long) c1748l.m4801a(C1831z4.f3960j2);
        Integer num = (Integer) c1748l.m4801a(C1831z4.f3969k2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.f1246U = progressBar;
        m2170a(progressBar, abstractC1736b.m4537g0(), num.intValue());
        c1517c1.m2152a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m2161H() {
        C1478a c1478a = this.f1242Q;
        if (c1478a != null) {
            c1478a.m1759b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m2162I() {
        C1478a c1478a = this.f1242Q;
        if (c1478a != null) {
            c1478a.m1758a();
            final C1478a c1478a2 = this.f1242Q;
            Objects.requireNonNull(c1478a2);
            m5651a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    c1478a2.m1759b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m2163J() {
        this.f1263l0 = -1L;
        this.f1264m0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m2164K() {
        C1478a c1478a = this.f1242Q;
        if (c1478a != null) {
            c1478a.m1758a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m2165L() {
        this.f3610q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m2166M() {
        if (this.f1259h0) {
            if (C1768p.m5160a()) {
                this.f3596c.m5178k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f3595b.m4846o0().isApplicationPaused()) {
            if (C1768p.m5160a()) {
                this.f3596c.m5178k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f1258g0 < 0) {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Resuming video at position " + this.f1258g0 + "ms for MediaPlayer: " + this.f1239N);
        }
        this.f1241P.seekTo(this.f1258g0);
        this.f1241P.start();
        this.f1252a0.m2153b();
        this.f1258g0 = -1;
        m5651a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2162I();
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m2167O() {
        if (this.f1262k0.compareAndSet(false, true)) {
            m5649a(this.f1243R, this.f3594a.m4524a0(), new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2163J();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2170a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        progressBar.setProgressTintList(ColorStateList.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2171a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2173a(boolean z, C1748l c1748l) {
        if (!((Boolean) c1748l.m4801a(C1831z4.f3888b2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) c1748l.m4801a(C1831z4.f3897c2)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) c1748l.m4801a(C1831z4.f3915e2)).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    private void m2176e(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f3597d.getDrawable(z ? C1846R.drawable.applovin_ic_unmute_to_mute : C1846R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.f1245T, z ? this.f3594a.m4482G() : this.f3594a.m4517Y(), this.f3595b);
            return;
        }
        this.f1245T.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f1245T.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    /* JADX INFO: renamed from: f */
    private void m2177f(boolean z) {
        this.f1257f0 = m2179C();
        if (z) {
            this.f1241P.pause();
        } else {
            this.f1241P.stopPlayback();
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: A */
    protected void mo2178A() {
        this.f1238M.mo1805a(this.f3605l);
        this.f3610q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: C */
    protected int m2179C() {
        long currentPosition = this.f1241P.getCurrentPosition();
        if (this.f1260i0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f1256e0) * 100.0f) : this.f1257f0;
    }

    /* JADX INFO: renamed from: D */
    public void mo2077D() {
        this.f3618y++;
        if (this.f3594a.m4563u()) {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            mo2085a("video_skip");
        } else {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Skipping video...");
            }
            mo2081R();
        }
    }

    /* JADX INFO: renamed from: E */
    protected void mo2078E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2161H();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    protected boolean m2180F() {
        if (this.f3591J && this.f3594a.m4510U0()) {
            return true;
        }
        return m2181G();
    }

    /* JADX INFO: renamed from: G */
    protected boolean m2181G() {
        return m2179C() >= this.f3594a.m4530c0();
    }

    /* JADX INFO: renamed from: N */
    protected void mo2079N() {
        long jM4499P;
        long millis;
        if (this.f3594a.m4497O() >= 0 || this.f3594a.m4499P() >= 0) {
            if (this.f3594a.m4497O() >= 0) {
                jM4499P = this.f3594a.m4497O();
            } else {
                C1735a c1735a = (C1735a) this.f3594a;
                long j = this.f1256e0;
                long j2 = j > 0 ? j : 0L;
                if (c1735a.m4502Q0()) {
                    int iM4441b1 = (int) ((C1735a) this.f3594a).m4441b1();
                    if (iM4441b1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iM4441b1);
                    } else {
                        int iM4557r = (int) c1735a.m4557r();
                        if (iM4557r > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iM4557r);
                        }
                    }
                    j2 += millis;
                }
                jM4499P = (long) (j2 * (((double) this.f3594a.m4499P()) / 100.0d));
            }
            m5656c(jM4499P);
        }
    }

    /* JADX INFO: renamed from: P */
    protected boolean m2182P() {
        return (this.f3615v || this.f1259h0 || !this.f1241P.isPlaying()) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    protected void mo2080Q() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2164K();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void mo2081R() {
        C1518c2 c1518c2;
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m2177f(this.f3594a.m4516X0());
        long jM4493M = this.f3594a.m4493M();
        if (jM4493M > 0) {
            this.f3611r = 0L;
            Long l = (Long) this.f3595b.m4801a(C1831z4.f4029r2);
            Integer num = (Integer) this.f3595b.m4801a(C1831z4.f4053u2);
            ProgressBar progressBar = new ProgressBar(this.f3597d, null, R.attr.progressBarStyleHorizontal);
            this.f1247V = progressBar;
            m2170a(progressBar, this.f3594a.m4491L(), num.intValue());
            c1518c2 = this;
            this.f1253b0.m2152a("POSTITIAL_PROGRESS_BAR", l.longValue(), c1518c2.new c(jM4493M, num, l));
            c1518c2.f1253b0.m2153b();
        } else {
            c1518c2 = this;
        }
        c1518c2.f1238M.m2347a(c1518c2.f3604k, c1518c2.f3603j, m5654b(), c1518c2.f1247V);
        mo2184a("javascript:al_onPoststitialShow(" + c1518c2.f3618y + "," + c1518c2.f3619z + ");", c1518c2.f3594a.m4568x());
        if (c1518c2.f3604k != null) {
            if (c1518c2.f3594a.m4557r() >= 0) {
                m5649a(c1518c2.f3604k, c1518c2.f3594a.m4557r(), new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m2165L();
                    }
                });
            } else {
                c1518c2.f3604k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        C1498g c1498g = c1518c2.f3604k;
        if (c1498g != null) {
            arrayList.add(new C1590j4(c1498g, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        C1502k c1502k = c1518c2.f3603j;
        if (c1502k != null && c1502k.m2036a()) {
            C1502k c1502k2 = c1518c2.f3603j;
            arrayList.add(new C1590j4(c1502k2, FriendlyObstructionPurpose.NOT_VISIBLE, c1502k2.getIdentifier()));
        }
        ProgressBar progressBar2 = c1518c2.f1247V;
        if (progressBar2 != null) {
            arrayList.add(new C1590j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        c1518c2.f3594a.getAdEventTracker().m2805b(m5654b(), arrayList);
        m5667p();
        c1518c2.f1259h0 = true;
    }

    /* JADX INFO: renamed from: S */
    public void m2183S() {
        this.f1263l0 = SystemClock.elapsedRealtime() - this.f1264m0;
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f1263l0 + "ms");
        }
        mo2077D();
    }

    /* JADX INFO: renamed from: T */
    protected void mo2082T() {
        MediaPlayer mediaPlayer = this.f1239N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f = this.f1255d0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            boolean z = !this.f1255d0;
            this.f1255d0 = z;
            m2176e(z);
            m5652a(this.f1255d0, 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo2083a(MotionEvent motionEvent) {
        Context context;
        if (this.f3594a.mo4247x0()) {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriMo4224Z = this.f3594a.mo4224Z();
            if (uriMo4224Z != null) {
                if (!((Boolean) this.f3595b.m4801a(C1831z4.f4066w)).booleanValue() || (context = this.f3597d) == null) {
                    context = m5654b() != null ? m5654b().getContext() : C1748l.m4756p();
                }
                this.f3595b.m4840l().trackAndLaunchVideoClick(this.f3594a, uriMo4224Z, motionEvent, this, context);
                AbstractC1793v2.m5387a(this.f3586E, this.f3594a);
                this.f3619z++;
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2084a(ViewGroup viewGroup) {
        String str;
        this.f1238M.m2346a(this.f1245T, this.f1243R, this.f1242Q, this.f1246U, this.f1244S, this.f1241P, this.f1240O, m5654b(), this.f3603j, this.f1248W, viewGroup);
        if (AbstractC1677p0.m3811e() && (str = this.f3595b.m4847p0().getExtraParameters().get("audio_focus_request")) != null) {
            this.f1241P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3892b6)).booleanValue() || !m5653a(!this.f1254c0)) {
            this.f1241P.setVideoURI(this.f3594a.mo4235i0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            C1502k c1502k = this.f3603j;
            if (c1502k != null) {
                c1502k.m2037b();
            }
            this.f1241P.start();
            if (this.f1254c0) {
                mo2080Q();
            }
            m5654b().renderAd(this.f3594a);
            if (this.f1243R != null) {
                this.f3595b.m4853s0().m2606a(new C1788u6(this.f3595b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m2167O();
                    }
                }), C1552f6.b.TIMEOUT, this.f3594a.m4528b0(), true);
            }
            super.m5657c(this.f1255d0);
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2085a(String str) {
        this.f1252a0.m2151a();
        this.f1253b0.m2151a();
        this.f1250Y.removeCallbacksAndMessages(null);
        this.f1251Z.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f3595b.m4801a(C1831z4.f3813R6)).booleanValue()) {
            AbstractC1736b abstractC1736b = this.f3594a;
            if (abstractC1736b != null) {
                abstractC1736b.m4522a(str);
            }
            mo2189m();
        }
        super.mo2085a(str);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    protected void mo2184a(String str, long j) {
        super.mo2184a(str, j);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: b */
    public void mo2185b(long j) {
        m5651a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2166M();
            }
        }, j);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: b */
    public void mo2186b(boolean z) {
        super.mo2186b(z);
        if (z) {
            mo2185b(0L);
            if (this.f1259h0) {
                this.f1253b0.m2153b();
                return;
            }
            return;
        }
        if (this.f1259h0) {
            this.f1253b0.m2154c();
        } else {
            mo2090v();
        }
    }

    /* JADX INFO: renamed from: d */
    protected void mo2086d(long j) {
        this.f1256e0 = j;
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: e */
    public void mo2187e() {
        super.mo2187e();
        mo2178A();
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: f */
    public void mo2188f() {
        super.mo2188f();
        this.f1238M.mo2345a((View) this.f1243R);
        if (!m5662h() || this.f1259h0) {
            mo2178A();
        }
    }

    /* JADX INFO: renamed from: g */
    protected void mo2087g(String str) {
        if (C1768p.m5160a()) {
            this.f3596c.m5174b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f3594a);
        }
        if (this.f1261j0.compareAndSet(false, true)) {
            if (((Boolean) this.f3595b.m4801a(C1831z4.f3791P0)).booleanValue()) {
                this.f3595b.m4771I().m4984d(this.f3594a, C1748l.m4756p());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f3587F;
            if (appLovinAdDisplayListener instanceof InterfaceC1659n2) {
                ((InterfaceC1659n2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f3594a instanceof C1711r7 ? "handleVastVideoError" : "handleVideoError";
            this.f3595b.m4764E().m4331a(str2, str, this.f3594a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f3595b.m4830g().m2526a(C1548f2.f1474F, this.f3594a, mapHashMap);
            mo2085a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: m */
    protected void mo2189m() {
        super.m5647a(m2179C(), this.f1254c0, m2180F(), this.f1263l0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f3594a.getAdIdNumber() && this.f1254c0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !AbstractC1714s0.m4314a(i)) || this.f1260i0 || this.f1241P.isPlaying()) {
                    return;
                }
                mo2087g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: r */
    public void mo2190r() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f1254c0) {
                AppLovinCommunicator.getInstance(this.f3597d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f1241P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f1241P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f1239N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo2190r();
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: v */
    public void mo2090v() {
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f1258g0 = this.f1241P.getCurrentPosition();
        this.f1241P.pause();
        this.f1252a0.m2154c();
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Paused video at position " + this.f1258g0 + "ms");
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: w */
    public void mo2091w() {
        mo2084a((ViewGroup) null);
    }
}
