package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.AbstractC1496e;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.adview.C1493b;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1746j;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1819y1 implements AppLovinBroadcastManager.Receiver, C1488a.b {

    /* JADX INFO: renamed from: A */
    protected int f3582A;

    /* JADX INFO: renamed from: B */
    protected boolean f3583B;

    /* JADX INFO: renamed from: C */
    private ContentObserver f3584C;

    /* JADX INFO: renamed from: D */
    private Float f3585D;

    /* JADX INFO: renamed from: E */
    protected AppLovinAdClickListener f3586E;

    /* JADX INFO: renamed from: F */
    protected AppLovinAdDisplayListener f3587F;

    /* JADX INFO: renamed from: G */
    protected AppLovinAdVideoPlaybackListener f3588G;

    /* JADX INFO: renamed from: H */
    protected C1593j7 f3589H;

    /* JADX INFO: renamed from: I */
    protected C1593j7 f3590I;

    /* JADX INFO: renamed from: J */
    protected boolean f3591J;

    /* JADX INFO: renamed from: K */
    private final C1586j0 f3592K;

    /* JADX INFO: renamed from: L */
    private boolean f3593L;

    /* JADX INFO: renamed from: a */
    protected final AbstractC1736b f3594a;

    /* JADX INFO: renamed from: b */
    protected final C1748l f3595b;

    /* JADX INFO: renamed from: c */
    protected final C1768p f3596c;

    /* JADX INFO: renamed from: d */
    protected Activity f3597d;

    /* JADX INFO: renamed from: e */
    private final int f3598e;

    /* JADX INFO: renamed from: f */
    private final Handler f3599f;

    /* JADX INFO: renamed from: g */
    private final AbstractC1505b f3600g;

    /* JADX INFO: renamed from: h */
    private final C1746j.a f3601h;

    /* JADX INFO: renamed from: i */
    private AppLovinAdView f3602i;

    /* JADX INFO: renamed from: j */
    protected C1502k f3603j;

    /* JADX INFO: renamed from: k */
    protected final C1498g f3604k;

    /* JADX INFO: renamed from: l */
    protected final C1498g f3605l;

    /* JADX INFO: renamed from: m */
    protected final long f3606m;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f3607n;

    /* JADX INFO: renamed from: o */
    private final AtomicBoolean f3608o;

    /* JADX INFO: renamed from: p */
    private boolean f3609p;

    /* JADX INFO: renamed from: q */
    protected long f3610q;

    /* JADX INFO: renamed from: r */
    protected long f3611r;

    /* JADX INFO: renamed from: s */
    private boolean f3612s;

    /* JADX INFO: renamed from: t */
    protected boolean f3613t;

    /* JADX INFO: renamed from: u */
    protected int f3614u;

    /* JADX INFO: renamed from: v */
    protected boolean f3615v;

    /* JADX INFO: renamed from: w */
    private int f3616w;

    /* JADX INFO: renamed from: x */
    private final ArrayList f3617x;

    /* JADX INFO: renamed from: y */
    protected int f3618y;

    /* JADX INFO: renamed from: z */
    protected int f3619z;

    /* JADX INFO: renamed from: com.applovin.impl.y1$a */
    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            C1768p c1768p = AbstractC1819y1.this.f3596c;
            if (C1768p.m5160a()) {
                AbstractC1819y1.this.f3596c.m5171a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            C1768p c1768p = AbstractC1819y1.this.f3596c;
            if (C1768p.m5160a()) {
                AbstractC1819y1.this.f3596c.m5171a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            AbstractC1819y1.this.mo2085a("web_view");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$b */
    class b implements C1746j.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.C1746j.a
        /* JADX INFO: renamed from: a */
        public void mo4698a(int i) {
            AbstractC1819y1 abstractC1819y1 = AbstractC1819y1.this;
            if (abstractC1819y1.f3582A != C1746j.f2992h) {
                abstractC1819y1.f3583B = true;
            }
            C1493b c1493bM1967f = abstractC1819y1.f3602i.getController().m1967f();
            if (c1493bM1967f == null) {
                C1768p c1768p = AbstractC1819y1.this.f3596c;
                if (C1768p.m5160a()) {
                    AbstractC1819y1.this.f3596c.m5178k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (C1746j.m4690a(i) && !C1746j.m4690a(AbstractC1819y1.this.f3582A)) {
                c1493bM1967f.m2000a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                c1493bM1967f.m2000a("javascript:al_muteSwitchOff();");
            }
            AbstractC1819y1.this.f3582A = i;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$c */
    class c extends AbstractC1505b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1748l f3622a;

        c(C1748l c1748l) {
            this.f3622a = c1748l;
        }

        /* JADX INFO: renamed from: a */
        private boolean m5672a(Activity activity) {
            return activity.getClass().getName().equals(AbstractC1701q7.m4030a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f3622a));
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!AbstractC1819y1.this.m5644z() && m5672a(activity)) {
                AbstractC1819y1.this.m5636d();
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (AbstractC1819y1.this.m5644z() && m5672a(activity)) {
                AbstractC1819y1.this.m5636d();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$d */
    class d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1748l f3624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, C1748l c1748l) {
            super(handler);
            this.f3624a = c1748l;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Float fM4695b = this.f3624a.m4848q().m4695b();
            if (fM4695b == null || AbstractC1819y1.this.f3585D == null || fM4695b.equals(AbstractC1819y1.this.f3585D)) {
                return;
            }
            String str = fM4695b.floatValue() > AbstractC1819y1.this.f3585D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fM4695b.floatValue());
            AbstractC1819y1.this.m5660e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            AbstractC1819y1.this.f3585D = fM4695b;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$e */
    class e extends AbstractC1505b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1786u4 f3626a;

        e(C1786u4 c1786u4) {
            this.f3626a = c1786u4;
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f3626a.m5303b(null);
                AbstractC1819y1.this.f3595b.m4826e().m2146b(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$f */
    class f implements C1586j0.c {
        f() {
        }

        @Override // com.applovin.impl.C1586j0.c
        /* JADX INFO: renamed from: a */
        public void mo2976a(int i, int i2) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) AbstractC1819y1.this.f3594a);
            mapM2787a.putAll(AbstractC1568h2.m2788a(AbstractC1819y1.this.f3594a));
            mapM2787a.put("details", "detection_count=" + i + ",total_checks=" + i2);
            AbstractC1819y1.this.f3595b.m4764E().m2682d(C1548f2.f1499R0, mapM2787a);
        }

        @Override // com.applovin.impl.C1586j0.c
        /* JADX INFO: renamed from: a */
        public void mo2977a(int i, int i2, int i3) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) AbstractC1819y1.this.f3594a);
            mapM2787a.putAll(AbstractC1568h2.m2788a(AbstractC1819y1.this.f3594a));
            mapM2787a.put("details", "detections_to_report=" + i + ",detection_count=" + i2 + ",total_checks=" + i3);
            AbstractC1819y1.this.f3595b.m4764E().m2682d(C1548f2.f1501S0, mapM2787a);
            if (((Boolean) AbstractC1819y1.this.f3595b.m4801a(C1831z4.f4065v6)).booleanValue()) {
                AbstractC1819y1.this.mo5670x();
            }
            if (((Boolean) AbstractC1819y1.this.f3595b.m4801a(C1831z4.f3799Q0)).booleanValue()) {
                AbstractC1819y1.this.f3595b.m4771I().m4982c(AbstractC1819y1.this.f3594a, C1748l.m4756p());
            }
            if (((Boolean) AbstractC1819y1.this.f3595b.m4801a(C1831z4.f4033r6)).booleanValue()) {
                AbstractC1819y1.this.mo2085a("black_view_auto_dismiss");
                return;
            }
            AbstractC1819y1 abstractC1819y1 = AbstractC1819y1.this;
            abstractC1819y1.f3593L = ((Boolean) abstractC1819y1.f3595b.m4801a(C1831z4.f4041s6)).booleanValue();
            if (((Boolean) AbstractC1819y1.this.f3595b.m4801a(C1831z4.f4049t6)).booleanValue()) {
                AbstractC1819y1.this.mo2178A();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.y1$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo1754a(AbstractC1819y1 abstractC1819y1);

        /* JADX INFO: renamed from: a */
        void mo1755a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.y1$h */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        /* synthetic */ h(AbstractC1819y1 abstractC1819y1, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m5673a() {
            AbstractC1819y1.this.f3610q = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            C1768p c1768p = AbstractC1819y1.this.f3596c;
            if (C1768p.m5160a()) {
                AbstractC1819y1.this.f3596c.m5171a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            AbstractC1793v2.m5387a(AbstractC1819y1.this.f3586E, appLovinAd);
            AbstractC1819y1.this.f3619z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC1819y1 abstractC1819y1 = AbstractC1819y1.this;
            if (view != abstractC1819y1.f3604k || !((Boolean) abstractC1819y1.f3595b.m4801a(C1831z4.f3872Z1)).booleanValue()) {
                C1768p c1768p = AbstractC1819y1.this.f3596c;
                if (C1768p.m5160a()) {
                    AbstractC1819y1.this.f3596c.m5174b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            AbstractC1819y1.m5639f(AbstractC1819y1.this);
            if (AbstractC1819y1.this.f3594a.m4486I0()) {
                AbstractC1819y1.this.m5660e("javascript:al_onCloseButtonTapped(" + AbstractC1819y1.this.f3616w + "," + AbstractC1819y1.this.f3618y + "," + AbstractC1819y1.this.f3619z + ");");
            }
            List listM4480F = AbstractC1819y1.this.f3594a.m4480F();
            C1768p c1768p2 = AbstractC1819y1.this.f3596c;
            if (C1768p.m5160a()) {
                AbstractC1819y1.this.f3596c.m5171a("AppLovinFullscreenActivity", "Handling close button tap " + AbstractC1819y1.this.f3616w + " with multi close delay: " + listM4480F);
            }
            if (listM4480F == null || listM4480F.size() <= AbstractC1819y1.this.f3616w) {
                AbstractC1819y1.this.mo2085a("native_close_button");
                return;
            }
            AbstractC1819y1.this.f3617x.add(Long.valueOf(SystemClock.elapsedRealtime() - AbstractC1819y1.this.f3610q));
            List listM4477D = AbstractC1819y1.this.f3594a.m4477D();
            if (listM4477D != null && listM4477D.size() > AbstractC1819y1.this.f3616w) {
                AbstractC1819y1 abstractC1819y2 = AbstractC1819y1.this;
                abstractC1819y2.f3604k.m2033a((AbstractC1496e.a) listM4477D.get(abstractC1819y2.f3616w));
            }
            C1768p c1768p3 = AbstractC1819y1.this.f3596c;
            if (C1768p.m5160a()) {
                AbstractC1819y1.this.f3596c.m5171a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listM4480F.get(AbstractC1819y1.this.f3616w));
            }
            AbstractC1819y1.this.f3604k.setVisibility(8);
            AbstractC1819y1 abstractC1819y3 = AbstractC1819y1.this;
            abstractC1819y3.m5649a(abstractC1819y3.f3604k, ((Integer) listM4480F.get(abstractC1819y3.f3616w)).intValue(), new Runnable() { // from class: com.applovin.impl.y1$h$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m5673a();
                }
            });
        }
    }

    AbstractC1819y1(AbstractC1736b abstractC1736b, Activity activity, Map map, C1748l c1748l, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3599f = handler;
        this.f3606m = SystemClock.elapsedRealtime();
        this.f3607n = new AtomicBoolean();
        this.f3608o = new AtomicBoolean();
        this.f3610q = -1L;
        this.f3616w = 0;
        this.f3617x = new ArrayList();
        this.f3618y = 0;
        this.f3619z = 0;
        this.f3582A = C1746j.f2992h;
        this.f3593L = false;
        this.f3594a = abstractC1736b;
        this.f3595b = c1748l;
        this.f3596c = c1748l.m4782Q();
        this.f3597d = activity;
        this.f3598e = abstractC1736b.m4503R();
        this.f3586E = appLovinAdClickListener;
        this.f3587F = appLovinAdDisplayListener;
        this.f3588G = appLovinAdVideoPlaybackListener;
        this.f3592K = new C1586j0(c1748l);
        h hVar = new h(this, null);
        if (((Boolean) c1748l.m4801a(C1831z4.f4013p2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) c1748l.m4801a(C1831z4.f4061v2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        C1801w1 c1801w1 = new C1801w1(c1748l.m4758A0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f3602i = c1801w1;
        c1801w1.setAdClickListener(hVar);
        this.f3602i.setAdDisplayListener(new a());
        abstractC1736b.m4538h().putString("ad_view_address", AbstractC1564g8.m2752a(this.f3602i));
        this.f3602i.getController().m1950a(this);
        C1538e2 c1538e2 = new C1538e2(map, c1748l);
        if (c1538e2.m2464c()) {
            this.f3603j = new C1502k(c1538e2, activity);
        }
        c1748l.m4840l().trackImpression(abstractC1736b);
        List listM4480F = abstractC1736b.m4480F();
        if (abstractC1736b.m4557r() >= 0 || listM4480F != null) {
            C1498g c1498g = new C1498g(abstractC1736b.m4553p(), activity);
            this.f3604k = c1498g;
            c1498g.setVisibility(8);
            c1498g.setOnClickListener(hVar);
        } else {
            this.f3604k = null;
        }
        C1498g c1498g2 = new C1498g(AbstractC1496e.a.WHITE_ON_TRANSPARENT, activity);
        this.f3605l = c1498g2;
        c1498g2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m5618a(view);
            }
        });
        if (abstractC1736b.m4500P0()) {
            this.f3601h = new b();
        } else {
            this.f3601h = null;
        }
        this.f3600g = new c(c1748l);
        if (abstractC1736b.m4492L0()) {
            this.f3585D = c1748l.m4848q().m4695b();
            this.f3584C = new d(handler, c1748l);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.f3584C);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m5614B() {
        if (this.f3601h != null) {
            this.f3595b.m4848q().m4694a(this.f3601h);
        }
        if (this.f3600g != null) {
            this.f3595b.m4826e().m2144a(this.f3600g);
        }
    }

    /* JADX INFO: renamed from: a */
    private C1786u4 m5616a(long j) {
        final C1786u4 c1786u4 = new C1786u4("bringAdActivityToFront");
        final e eVar = new e(c1786u4);
        this.f3595b.m4826e().m2144a(eVar);
        Intent intent = new Intent(this.f3597d, (Class<?>) (this.f3594a.m4481F0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f3597d.startActivity(intent);
        m5651a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5620a(eVar, c1786u4);
            }
        }, j);
        return c1786u4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5618a(View view) {
        mo2085a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5619a(C1498g c1498g, Runnable runnable) {
        c1498g.bringToFront();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5620a(AbstractC1505b abstractC1505b, C1786u4 c1786u4) {
        this.f3595b.m4826e().m2146b(abstractC1505b);
        if (c1786u4.m5307d()) {
            return;
        }
        c1786u4.m5298a((Object) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m5621a(AbstractC1736b abstractC1736b, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, C1748l c1748l, Activity activity, g gVar) {
        AbstractC1819y1 c1508b2;
        if (abstractC1736b instanceof C1711r7) {
            try {
                c1508b2 = new C1508b2(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.mo1755a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + c1748l + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (abstractC1736b.hasVideoUrl()) {
            try {
                c1508b2 = new C1518c2(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.mo1755a("Failed to create FullscreenVideoAdPresenter with sdk: " + c1748l + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                c1508b2 = new C1828z1(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.mo1755a("Failed to create FullscreenGraphicAdPresenter with sdk: " + c1748l + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        c1508b2.m5614B();
        gVar.mo1754a(c1508b2);
    }

    /* JADX INFO: renamed from: a */
    private void m5622a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f3595b.m4764E().m2678a(C1548f2.f1503T0, "missingCachedAdResources", map2);
    }

    /* JADX INFO: renamed from: a */
    private void m5623a(String str, Map map) {
        m5660e(AbstractC1685p8.m3901a(str, map));
    }

    /* JADX INFO: renamed from: a */
    private void m5624a(List list, C1735a c1735a) {
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1735a.m4439a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f3595b.m4830g().m2526a(C1548f2.f1484K, c1735a, mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5625a(boolean z, Void r2, Void r3) {
        if (z) {
            return;
        }
        m5640f("app_relaunch_bring_to_front_failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5627b(final C1498g c1498g, final Runnable runnable) {
        AbstractC1564g8.m2753a(c1498g, 400L, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1819y1.m5619a(c1498g, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m5628b(String str) {
        C1493b c1493bM1967f;
        AppLovinAdView appLovinAdView = this.f3602i;
        if (appLovinAdView == null || (c1493bM1967f = appLovinAdView.getController().m1967f()) == null) {
            return;
        }
        c1493bM1967f.m2000a(str);
    }

    /* JADX INFO: renamed from: b */
    private void m5629b(String str, Map map) {
        m5660e(AbstractC1685p8.m3907b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5631c(final C1498g c1498g, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1819y1.m5627b(c1498g, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m5633c(String str) {
        C1768p.m5167h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            mo2085a(str);
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                m5664l();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5634c(String str, Map map) {
        m5660e(AbstractC1685p8.m3910c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m5636d() {
        if (!m5644z()) {
            m5640f("app_relaunch");
            return;
        }
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
        }
        this.f3609p = true;
        long jM4534f = this.f3594a.m4534f();
        if (jM4534f < 0) {
            return;
        }
        m5651a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5642j();
            }
        }, jM4534f);
    }

    /* JADX INFO: renamed from: d */
    private void m5637d(String str, Map map) {
        m5660e(AbstractC1685p8.m3912d(str, map));
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ int m5639f(AbstractC1819y1 abstractC1819y1) {
        int i = abstractC1819y1.f3616w;
        abstractC1819y1.f3616w = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    private void m5640f(final String str) {
        if (this.f3608o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5633c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m5642j() {
        if (this.f3594a.m4503R() <= this.f3598e && !AbstractC1525d.m2250d(this.f3597d)) {
            if (C1768p.m5160a()) {
                this.f3596c.m5175d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f3609p = false;
            long jM4529c = this.f3594a.m4529c();
            if (jM4529c > 0) {
                m5616a(jM4529c).m5300a(C1786u4.f3414i, new C1786u4.b() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda1
                    @Override // com.applovin.impl.C1786u4.b
                    /* JADX INFO: renamed from: a */
                    public final void mo2509a(boolean z, Object obj, Object obj2) {
                        this.f$0.m5625a(z, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                m5640f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m5643k() {
        if (this.f3594a.m4565v0().getAndSet(true)) {
            return;
        }
        this.f3595b.m4853s0().m2604a((AbstractRunnableC1601k5) new C1683p6(this.f3594a, this.f3595b), C1552f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public boolean m5644z() {
        return m5645a() >= 0;
    }

    /* JADX INFO: renamed from: A */
    protected abstract void mo2178A();

    /* JADX INFO: renamed from: a */
    public long m5645a() {
        AbstractC1736b abstractC1736b = this.f3594a;
        if (abstractC1736b == null) {
            return -1L;
        }
        return abstractC1736b.m4536g();
    }

    /* JADX INFO: renamed from: a */
    public void m5646a(int i, KeyEvent keyEvent) {
        if (this.f3596c == null || !C1768p.m5160a()) {
            return;
        }
        this.f3596c.m5175d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    /* JADX INFO: renamed from: a */
    protected void m5647a(int i, boolean z, boolean z2, long j) {
        if (!this.f3609p && this.f3607n.compareAndSet(false, true)) {
            if (this.f3594a.hasVideoUrl() || m5662h()) {
                AbstractC1793v2.m5393a(this.f3588G, this.f3594a, i, z2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3606m;
            this.f3595b.m4840l().trackVideoEnd(this.f3594a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z);
            long jElapsedRealtime2 = this.f3610q != -1 ? SystemClock.elapsedRealtime() - this.f3610q : -1L;
            this.f3595b.m4840l().trackFullScreenAdClosed(this.f3594a, jElapsedRealtime2, this.f3617x, j, this.f3583B, this.f3582A);
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5648a(Configuration configuration) {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2084a(ViewGroup viewGroup);

    @Override // com.applovin.impl.adview.C1488a.b
    /* JADX INFO: renamed from: a */
    public void mo1978a(C1488a c1488a) {
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f3591J = true;
    }

    /* JADX INFO: renamed from: a */
    protected void m5649a(final C1498g c1498g, long j, final Runnable runnable) {
        if (j >= ((Long) this.f3595b.m4801a(C1831z4.f3864Y1)).longValue()) {
            return;
        }
        this.f3590I = C1593j7.m3012a(TimeUnit.SECONDS.toMillis(j), this.f3595b, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1819y1.m5631c(c1498g, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m5650a(AbstractC1677p0.a aVar, AbstractC1677p0.a aVar2, AbstractC1677p0.a aVar3) {
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3731H4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", AbstractC1701q7.m4077b(this.f3597d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.m3822e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.m3822e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.m3822e());
            }
            m5660e(AbstractC1685p8.m3902a(map));
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m5651a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f3599f);
    }

    /* JADX INFO: renamed from: a */
    public void mo2085a(String str) {
        this.f3612s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3606m;
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        AbstractC1736b abstractC1736b = this.f3594a;
        if (abstractC1736b != null) {
            abstractC1736b.getAdEventTracker().m2810f();
        }
        this.f3599f.removeCallbacksAndMessages(null);
        AbstractC1736b abstractC1736b2 = this.f3594a;
        mo2184a("javascript:al_onPoststitialDismiss();", abstractC1736b2 != null ? abstractC1736b2.m4566w() : 0L);
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3813R6)).booleanValue()) {
            AbstractC1736b abstractC1736b3 = this.f3594a;
            if (abstractC1736b3 != null) {
                abstractC1736b3.m4522a(str);
            }
            mo2189m();
        }
        m5664l();
        this.f3592K.m2973b();
        if (this.f3601h != null) {
            this.f3595b.m4848q().m4696b(this.f3601h);
        }
        if (this.f3600g != null) {
            this.f3595b.m4826e().m2146b(this.f3600g);
        }
        if (this.f3584C != null) {
            this.f3597d.getContentResolver().unregisterContentObserver(this.f3584C);
            this.f3584C = null;
        }
        if (m5663i()) {
            this.f3597d.finish();
            return;
        }
        this.f3595b.m4782Q();
        if (C1768p.m5160a()) {
            this.f3595b.m4782Q().m5171a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo2190r();
    }

    /* JADX INFO: renamed from: a */
    protected void mo2184a(final String str, long j) {
        if (j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        m5651a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5628b(str);
            }
        }, j);
    }

    /* JADX INFO: renamed from: a */
    protected void m5652a(boolean z, long j) {
        if (this.f3594a.m4478D0()) {
            mo2184a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* JADX INFO: renamed from: a */
    protected boolean m5653a(boolean z) {
        List listM4041a = AbstractC1701q7.m4041a(z, this.f3594a, this.f3595b, this.f3597d);
        if (listM4041a.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3855X0)).booleanValue() && !AbstractC1701q7.m4070a(listM4041a, this.f3594a)) {
            m5624a(listM4041a, (C1735a) this.f3594a);
            return false;
        }
        String str = "Missing ad resources: " + listM4041a;
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f3594a);
        if (!((Boolean) this.f3595b.m4801a(C1831z4.f3860X5)).booleanValue()) {
            if (C1768p.m5160a()) {
                this.f3596c.m5174b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listM4041a);
            }
            this.f3594a.mo4221A0();
            m5622a(str, "Streaming ad", mapM2787a);
            return false;
        }
        if (C1768p.m5160a()) {
            this.f3596c.m5174b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listM4041a);
        }
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3884a6)).booleanValue()) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f3587F;
            if (appLovinAdDisplayListener instanceof InterfaceC1659n2) {
                AbstractC1793v2.m5389a(appLovinAdDisplayListener, "Missing ad resources");
            }
        } else {
            C1679p2.m3847a(this.f3594a, this.f3587F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
        }
        mo2085a("missing_ad_resources");
        m5622a(str, "Failing ad display", mapM2787a);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
        CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
        this.f3595b.m4830g().m2526a(C1548f2.f1474F, this.f3594a, mapHashMap);
        return ((Boolean) this.f3595b.m4801a(C1831z4.f3876Z5)).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public AppLovinAdView m5654b() {
        return this.f3602i;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2185b(long j);

    /* JADX INFO: renamed from: b */
    public void mo2186b(boolean z) {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        m5658d("javascript:al_onWindowFocusChanged( " + z + " );");
        C1593j7 c1593j7 = this.f3590I;
        if (c1593j7 != null) {
            if (z) {
                c1593j7.m3026e();
            } else {
                c1593j7.m3025d();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected int m5655c() {
        int iM4561t = this.f3594a.m4561t();
        return (iM4561t <= 0 && ((Boolean) this.f3595b.m4801a(C1831z4.f3996n2)).booleanValue()) ? this.f3614u + 1 : iM4561t;
    }

    /* JADX INFO: renamed from: c */
    protected void m5656c(long j) {
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f3589H = C1593j7.m3012a(j, this.f3595b, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5643k();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    protected void m5657c(boolean z) {
        m5652a(z, ((Long) this.f3595b.m4801a(C1831z4.f4005o2)).longValue());
        if (!this.f3594a.m4552o0()) {
            AbstractC1793v2.m5388a(this.f3587F, this.f3594a);
        }
        this.f3595b.m4773J().m5143a(this.f3594a);
        if (!this.f3594a.m4552o0() && (this.f3594a.hasVideoUrl() || m5662h())) {
            AbstractC1793v2.m5392a(this.f3588G, this.f3594a);
        }
        new C1681p4(this.f3597d).m3873a(this.f3594a);
        this.f3594a.setHasShown(true);
    }

    /* JADX INFO: renamed from: d */
    protected void m5658d(String str) {
        if (this.f3594a.m4558r0()) {
            mo2184a(str, 0L);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5659d(boolean z) {
        this.f3609p = z;
    }

    /* JADX INFO: renamed from: e */
    public void mo2187e() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5660e(String str) {
        mo2184a(str, 0L);
    }

    /* JADX INFO: renamed from: f */
    public void mo2188f() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f3613t = true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5661g() {
        return this.f3612s;
    }

    /* JADX INFO: renamed from: h */
    protected boolean m5662h() {
        return AppLovinAdType.INCENTIVIZED == this.f3594a.getType();
    }

    /* JADX INFO: renamed from: i */
    protected boolean m5663i() {
        return this.f3597d instanceof AppLovinFullscreenActivity;
    }

    /* JADX INFO: renamed from: l */
    protected void m5664l() {
        if (!this.f3609p && this.f3608o.compareAndSet(false, true)) {
            AbstractC1793v2.m5419b(this.f3587F, this.f3594a);
            this.f3595b.m4773J().m5148b(this.f3594a);
            HashMap map = new HashMap();
            AbstractC1736b abstractC1736b = this.f3594a;
            if (abstractC1736b != null) {
                CollectionUtils.putStringIfValid("source", abstractC1736b.m4564v(), map);
                CollectionUtils.putStringIfValid("details", AbstractC1568h2.m2791b(this.f3594a), map);
            }
            this.f3595b.m4830g().m2526a(C1548f2.f1476G, this.f3594a, map);
        }
    }

    /* JADX INFO: renamed from: m */
    protected abstract void mo2189m();

    /* JADX INFO: renamed from: n */
    protected void m5665n() {
        C1593j7 c1593j7 = this.f3589H;
        if (c1593j7 != null) {
            c1593j7.m3025d();
        }
    }

    /* JADX INFO: renamed from: o */
    protected void m5666o() {
        C1593j7 c1593j7 = this.f3589H;
        if (c1593j7 != null) {
            c1593j7.m3026e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        action.hashCode();
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                mo2187e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                m5623a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                m5634c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                m5629b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f3613t) {
                    mo2188f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                m5637d(action, map);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    protected void m5667p() {
        C1493b c1493bM1967f;
        if (this.f3602i == null || !this.f3594a.m4554p0() || (c1493bM1967f = this.f3602i.getController().m1967f()) == null) {
            return;
        }
        this.f3592K.m2972a(c1493bM1967f, new f());
    }

    /* JADX INFO: renamed from: q */
    public void m5668q() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f3593L) {
            mo2085a("back_button");
        }
        if (this.f3594a.m4486I0()) {
            m5660e("javascript:onBackPressed();");
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo2190r() {
        AppLovinAdView appLovinAdView = this.f3602i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f3602i.destroy();
            this.f3602i = null;
            if ((parent instanceof ViewGroup) && m5663i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo2189m();
        m5664l();
        this.f3586E = null;
        this.f3587F = null;
        this.f3588G = null;
        this.f3597d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    /* JADX INFO: renamed from: s */
    public void mo2088s() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onPause()");
        }
        m5658d("javascript:al_onAppPaused();");
        m5665n();
    }

    /* JADX INFO: renamed from: t */
    public void mo2089t() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onResume()");
        }
        m5658d("javascript:al_onAppResumed();");
        m5666o();
    }

    /* JADX INFO: renamed from: u */
    public void m5669u() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo2090v();

    /* JADX INFO: renamed from: w */
    public abstract void mo2091w();

    /* JADX INFO: renamed from: x */
    protected void mo5670x() {
        if (C1768p.m5160a()) {
            this.f3596c.m5175d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.f3591J = true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m5671y() {
        return this.f3609p;
    }
}
