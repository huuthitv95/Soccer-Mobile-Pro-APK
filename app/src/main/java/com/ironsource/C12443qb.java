package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.qb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12443qb {

    /* JADX INFO: renamed from: a */
    public static final C12443qb f31780a = new C12443qb();

    /* JADX INFO: renamed from: b */
    private static final C12461rb f31781b = new C12461rb();

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    public static final class a implements InterfaceC12216ge {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LevelPlayInitRequest f31782a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f31783b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12189f5 f31784c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ LevelPlayInitListener f31785d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C12189f5 c12189f5, LevelPlayInitListener levelPlayInitListener) {
            this.f31782a = levelPlayInitRequest;
            this.f31783b = context;
            this.f31784c = c12189f5;
            this.f31785d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26373a(final C12100ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C12461rb c12461rb = C12443qb.f31781b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f31782a;
            final Context context = this.f31783b;
            final C12189f5 c12189f5 = this.f31784c;
            final LevelPlayInitListener levelPlayInitListener = this.f31785d;
            c12461rb.m33233a(new Runnable() { // from class: com.ironsource.qb$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C12443qb.a.m33190a(sdkConfig, levelPlayInitRequest, context, c12189f5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33190a(C12100ae sdkConfig, LevelPlayInitRequest initRequest, Context context, C12189f5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C11801a9 c11801a9M31184a;
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C12113b9 c12113b9M31108f = sdkConfig.m31108f();
            if (c12113b9M31108f != null && (c11801a9M31184a = c12113b9M31108f.m31184a()) != null) {
                new C12211g9().m31548a(c11801a9M31184a.m28140f(), c11801a9M31184a.m28139e().m28146d(), c11801a9M31184a.m28139e().m28147e(), c11801a9M31184a.m28139e().m28148f(), c11801a9M31184a.m28138d());
            }
            C12443qb.f31780a.m33179a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26374a(final C12136ce error, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C12461rb c12461rb = C12443qb.f31781b;
            final LevelPlayInitListener levelPlayInitListener = this.f31785d;
            final C12189f5 c12189f5 = this.f31784c;
            c12461rb.m33233a(new Runnable() { // from class: com.ironsource.qb$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12443qb.a.m33191a(levelPlayInitListener, c12189f5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33191a(LevelPlayInitListener levelPlayInitListener, C12189f5 initDuration, C12136ce error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C12443qb.f31780a.m33177a(levelPlayInitListener, initDuration, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qb$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11666Sa f31786a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12189f5 f31787b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f31788c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ LevelPlayInitListener f31789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C11666Sa c11666Sa, C12189f5 c12189f5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f31786a = c11666Sa;
            this.f31787b = c12189f5;
            this.f31788c = j;
            this.f31789d = levelPlayInitListener;
        }

        /* JADX INFO: renamed from: a */
        public final void m33192a() {
            C12443qb.f31780a.m33170a(this.f31786a, this.f31787b, this.f31788c, this.f31789d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m33192a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qb$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f31790a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List<String> f31791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<String> list) {
            super(0);
            this.f31790a = str;
            this.f31791b = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m33193a() {
            C12367p.m32628h().m32652a(this.f31790a, this.f31791b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m33193a();
            return Unit.INSTANCE;
        }
    }

    private C12443qb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33181b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f31780a.m33182c(context, initRequest, levelPlayInitListener);
    }

    /* JADX INFO: renamed from: c */
    private final void m33182c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C12189f5 c12189f5 = new C12189f5();
        C12461rb c12461rb = f31781b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        C12428pe.f31723a.m33111a(context, new C12252ie(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c12461rb.m33239a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c12189f5, levelPlayInitListener));
    }

    /* JADX INFO: renamed from: b */
    public final void m33189b(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        C12367p.m32628h().m32650a(m33167a(segment));
    }

    /* JADX INFO: renamed from: b */
    public final void m33188b(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C12367p.m32628h().mo27521a(new C11751Xa(listener));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33172a(C12443qb c12443qb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c12443qb.m33183a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m33183a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        f31781b.m33245d(new Runnable() { // from class: com.ironsource.qb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12443qb.m33181b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m33184a(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C12367p.m32628h().mo27522b(new C11751Xa(listener));
    }

    /* JADX INFO: renamed from: a */
    private final C11767Y9 m33167a(LevelPlaySegment levelPlaySegment) {
        C11767Y9 c11767y9 = new C11767Y9();
        c11767y9.m28023a(levelPlaySegment.getLevel());
        c11767y9.m28022a(levelPlaySegment.getIapTotal());
        c11767y9.m28027a(levelPlaySegment.isPaying());
        c11767y9.m28024a(levelPlaySegment.getUserCreationDate());
        c11767y9.m28025a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c11767y9.m28026a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c11767y9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33179a(LevelPlayInitRequest levelPlayInitRequest, C12100ae c12100ae, Context context, C12189f5 c12189f5, LevelPlayInitListener levelPlayInitListener) {
        C11455Gb.b bVar = C11455Gb.f24351s;
        InterfaceC11452G8.a aVarMo25770D = bVar.m25903a().mo25770D();
        C11666Sa c11666Sa = new C11666Sa(c12100ae);
        if (c11666Sa.m27476n()) {
            f31781b.m33229a(context);
        }
        InterfaceC11487I7.a aVarMo25772b = bVar.m25903a().mo25772b();
        C12461rb c12461rb = f31781b;
        c11666Sa.m27466b(c12461rb).m31511a(aVarMo25772b);
        c11666Sa.m27462a(c12461rb).mo25766a(bVar.m25903a().mo25777l());
        c11666Sa.m27468c(c12461rb).m25794a(bVar.m25903a().mo25780v());
        C12443qb c12443qb = f31780a;
        c12443qb.m33178a(levelPlayInitRequest, c11666Sa);
        long jMo32185l = bVar.m25905d().mo25846h().mo32185l();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        c12443qb.m33169a(jMo32185l, new b(c11666Sa, c12189f5, jMo32185l, levelPlayInitListener));
        aVarMo25770D.mo25859a(c11666Sa);
        if (c12100ae.m31103a().m26453e()) {
            new C11367Bd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).m25508c(context);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33169a(long j, Function0<Unit> function0) {
        if (!C11455Gb.f24351s.m25905d().mo25844f().mo25858c() && j > 0) {
            f31781b.m33237a(function0, j);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33170a(final C11666Sa c11666Sa, C12189f5 c12189f5, long j, final LevelPlayInitListener levelPlayInitListener) {
        C11455Gb.f24351s.m25903a().mo25770D().mo25860d();
        long jM31432a = C12189f5.m31432a(c12189f5);
        C12461rb c12461rb = f31781b;
        C12461rb.m33217a(c12461rb, jM31432a, c11666Sa.m31109g(), j, null, 8, null);
        c12461rb.m33246e(new Runnable() { // from class: com.ironsource.qb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12443qb.m33176a(levelPlayInitListener, c11666Sa);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33176a(LevelPlayInitListener levelPlayInitListener, C11666Sa levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m27475m(), levelPlayConfig.m27472j()));
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33178a(LevelPlayInitRequest levelPlayInitRequest, C11666Sa c11666Sa) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (m33180a(levelPlayInitRequest, adFormat) && c11666Sa.m31106d().m26133c().m26606f() != null) {
            C11619Pd.a aVar = C11619Pd.f25533z;
            IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.REWARDED_VIDEO;
            C11619Pd c11619PdM27259a = aVar.m27259a(new C12220h0(enumC12328a, C12546u7.f32555a.m33891a(), "", null, null, null, 56, null), c11666Sa, true);
            List<C12533tc> listM27470c = c11666Sa.m27470c(adFormat);
            C11426F0.b bVar = C11426F0.b.MEDIATION;
            new C12445qd(new C11707V0(new C12414p0(enumC12328a, bVar), c11619PdM27259a, bVar), adFormat, listM27470c, c11619PdM27259a).m33200a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (m33180a(levelPlayInitRequest, adFormat2) && c11666Sa.m31106d().m26133c().m26604d() != null) {
            C12638z9.a aVar2 = C12638z9.f33257z;
            IronSource.EnumC12328a enumC12328a2 = IronSource.EnumC12328a.INTERSTITIAL;
            C12638z9 c12638z9M34278a = aVar2.m34278a(new C12220h0(enumC12328a2, C12546u7.f32555a.m33891a(), "", null, null, null, 56, null), c11666Sa, true);
            List<C12533tc> listM27470c2 = c11666Sa.m27470c(adFormat2);
            C11426F0.b bVar2 = C11426F0.b.MEDIATION;
            new C12445qd(new C11707V0(new C12414p0(enumC12328a2, bVar2), c12638z9M34278a, bVar2), adFormat2, listM27470c2, c12638z9M34278a).m33200a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!m33180a(levelPlayInitRequest, adFormat3) || c11666Sa.m31106d().m26133c().m26603c() == null) {
            return;
        }
        C11554M2 c11554m2M26476a = C11554M2.f25108z.m26476a(new C11500J2(), c11666Sa, true);
        List<C12533tc> listM27470c3 = c11666Sa.m27470c(adFormat3);
        IronSource.EnumC12328a enumC12328a3 = IronSource.EnumC12328a.BANNER;
        C11426F0.b bVar3 = C11426F0.b.MEDIATION;
        new C12445qd(new C11707V0(new C12414p0(enumC12328a3, bVar3), c11554m2M26476a, bVar3), adFormat3, listM27470c3, c11554m2M26476a).m33200a();
    }

    /* JADX INFO: renamed from: a */
    private final boolean m33180a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33177a(final LevelPlayInitListener levelPlayInitListener, C12189f5 c12189f5, final C12136ce c12136ce) {
        long jM31432a = C12189f5.m31432a(c12189f5);
        C12461rb c12461rb = f31781b;
        final C12136ce c12136ceM33240b = c12461rb.m33240b(c12136ce);
        C12461rb.m33219a(c12461rb, c12136ceM33240b, jM31432a, null, 4, null);
        c12461rb.m33246e(new Runnable() { // from class: com.ironsource.qb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12443qb.m33171a(c12136ce, levelPlayInitListener, c12136ceM33240b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33171a(C12136ce error, LevelPlayInitListener levelPlayInitListener, C12136ce eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(f31781b.m33226a(eventError)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33185a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        m33186a(key, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m33186a(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        m33187a(new c(key, values));
    }

    /* JADX INFO: renamed from: a */
    public final void m33187a(Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (C11455Gb.f24351s.m25904c().mo25846h().mo32197x()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC11754Xd.f26559a.m27962a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }
}
