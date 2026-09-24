package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.Mediation;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hk */
/* JADX INFO: loaded from: classes9.dex */
public final class C3809hk extends AbstractC3930n3 implements InterfaceC3721e1 {

    /* JADX INFO: renamed from: e0 */
    public static final b f14499e0 = new b(null);

    /* JADX INFO: renamed from: O */
    public final C4001q8 f14500O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC3855jk f14501P;

    /* JADX INFO: renamed from: Q */
    public final String f14502Q;

    /* JADX INFO: renamed from: R */
    public final Mediation f14503R;

    /* JADX INFO: renamed from: S */
    public final Function5 f14504S;

    /* JADX INFO: renamed from: T */
    public final String f14505T;

    /* JADX INFO: renamed from: U */
    public final InterfaceC3868ka f14506U;

    /* JADX INFO: renamed from: V */
    public final C3848jd f14507V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC3911m7 f14508W;

    /* JADX INFO: renamed from: X */
    public final Function1 f14509X;

    /* JADX INFO: renamed from: Y */
    public long f14510Y;

    /* JADX INFO: renamed from: Z */
    public long f14511Z;

    /* JADX INFO: renamed from: a0 */
    public long f14512a0;

    /* JADX INFO: renamed from: b0 */
    public int f14513b0;

    /* JADX INFO: renamed from: c0 */
    public C4100uj f14514c0;

    /* JADX INFO: renamed from: d0 */
    public InterfaceC3698d1 f14515d0;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hk$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f14516b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3952o3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C3952o3(it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hk$b */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3809hk(Context context, String location, EnumC3709dc mtype, String adUnitParameters, InterfaceC3945ni uiPoster, C4001q8 fileCache, C3861k3 templateProxy, InterfaceC3855jk videoRepository, String videoFilename, Mediation mediation, Function5 adsVideoPlayerFactory, C3746f3 networkService, String templateHtml, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3971p0 adUnitRendererImpressionCallback, InterfaceC3868ka impressionInterface, InterfaceC3856jl webViewTimeoutInterface, C3848jd nativeBridgeCommand, InterfaceC3911m7 eventTracker, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, networkService, templateProxy, mediation, templateHtml, openMeasurementImpressionCallback, adUnitRendererImpressionCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(adsVideoPlayerFactory, "adsVideoPlayerFactory");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(templateHtml, "templateHtml");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.f14500O = fileCache;
        this.f14501P = videoRepository;
        this.f14502Q = videoFilename;
        this.f14503R = mediation;
        this.f14504S = adsVideoPlayerFactory;
        this.f14505T = templateHtml;
        this.f14506U = impressionInterface;
        this.f14507V = nativeBridgeCommand;
        this.f14508W = eventTracker;
        this.f14509X = cbWebViewFactory;
    }

    public /* synthetic */ C3809hk(Context context, String str, EnumC3709dc enumC3709dc, String str2, InterfaceC3945ni interfaceC3945ni, C4001q8 c4001q8, C3861k3 c3861k3, InterfaceC3855jk interfaceC3855jk, String str3, Mediation mediation, Function5 function5, C3746f3 c3746f3, String str4, InterfaceC3642ae interfaceC3642ae, InterfaceC3971p0 interfaceC3971p0, InterfaceC3868ka interfaceC3868ka, InterfaceC3856jl interfaceC3856jl, C3848jd c3848jd, InterfaceC3911m7 interfaceC3911m7, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, enumC3709dc, str2, interfaceC3945ni, c4001q8, c3861k3, interfaceC3855jk, str3, mediation, function5, c3746f3, str4, interfaceC3642ae, interfaceC3971p0, interfaceC3868ka, interfaceC3856jl, c3848jd, interfaceC3911m7, (i & 524288) != 0 ? a.f14516b : function1);
    }

    /* JADX INFO: renamed from: E */
    public final void m17917E() {
        m17918F();
    }

    /* JADX INFO: renamed from: F */
    public final void m17918F() {
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.stop();
        }
        C4100uj c4100uj = this.f14514c0;
        if (c4100uj != null) {
            c4100uj.m19605b();
        }
        this.f14515d0 = null;
        this.f14514c0 = null;
    }

    /* JADX INFO: renamed from: G */
    public final int m17919G() {
        C4048sb.m19408a("getAssetDownloadStateNow()", (Throwable) null, 2, (Object) null);
        C4078tj c4078tjMo18298b = this.f14501P.mo18298b(this.f14502Q);
        if (c4078tjMo18298b != null) {
            return this.f14501P.mo18293a(c4078tjMo18298b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public final C3952o3 m17920H() {
        C4100uj c4100uj = this.f14514c0;
        if (c4100uj != null) {
            return c4100uj.getWebView();
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m17921I() {
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.mo16786f();
        }
        m18746n().mo16821a(0.0f);
    }

    /* JADX INFO: renamed from: J */
    public final void m17922J() {
        C3861k3 c3861k3M18749q = m18749q();
        if (c3861k3M18749q != null) {
            c3861k3M18749q.m18346c(m17920H(), m18744l(), m18739g());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m17923K() {
        C4048sb.m19408a("notifyTemplateVideoStarted() duration: " + this.f14510Y, (Throwable) null, 2, (Object) null);
        C3861k3 c3861k3M18749q = m18749q();
        if (c3861k3M18749q != null) {
            c3861k3M18749q.m18343b(m17920H(), this.f14510Y / 1000.0f, m18744l(), m18739g());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m17924L() {
        C4048sb.m19408a("pauseVideo()", (Throwable) null, 2, (Object) null);
        m18746n().mo16820a();
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.pause();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m17925M() {
        C4048sb.m19408a("playVideo()", (Throwable) null, 2, (Object) null);
        m17926N();
        this.f14511Z = AbstractC3760fh.m17736a();
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.play();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m17926N() {
        m18746n().mo16826a(PlayerState.FULLSCREEN);
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 == null || interfaceC3698d1.mo16788h()) {
            m18746n().mo16831e();
            return;
        }
        InterfaceC3642ae interfaceC3642aeM18746n = m18746n();
        float f = this.f14510Y / 1000.0f;
        InterfaceC3698d1 interfaceC3698d2 = this.f14515d0;
        interfaceC3642aeM18746n.mo16822a(f, interfaceC3698d2 != null ? interfaceC3698d2.mo16787g() : 1.0f);
    }

    /* JADX INFO: renamed from: O */
    public final void m17927O() {
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.mo16781b();
        }
        m18746n().mo16821a(1.0f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: a */
    public void mo17463a() {
        C4048sb.m19408a("onVideoDisplayStarted", (Throwable) null, 2, (Object) null);
        m17923K();
        this.f14512a0 = AbstractC3760fh.m17736a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: a */
    public void mo17464a(long j) {
        float f = j / 1000.0f;
        float f2 = this.f14510Y / 1000.0f;
        if (C3851jg.f14967a.m18286d()) {
            C4048sb.m19413c("onVideoDisplayProgress: " + f + RemoteSettings.FORWARD_SLASH_STRING + f2, null, 2, null);
        }
        C3861k3 c3861k3M18749q = m18749q();
        if (c3861k3M18749q != null) {
            c3861k3M18749q.m18339a(m17920H(), f, m18744l(), m18739g());
        }
        m18726a(f2, f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: a */
    public void mo17465a(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4048sb.m19408a("onVideoDisplayError: " + error, (Throwable) null, 2, (Object) null);
        m17928a(false);
        C3861k3 c3861k3M18749q = m18749q();
        if (c3861k3M18749q != null) {
            c3861k3M18749q.m18347d(m17920H(), m18744l(), m18739g());
        }
        m17918F();
        m18736c(error);
    }

    /* JADX INFO: renamed from: a */
    public final void m17928a(boolean z) {
        String strValueOf = String.valueOf(this.f14513b0);
        if (z) {
            m17931f(strValueOf);
        } else {
            m17929e(strValueOf);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: b */
    public AbstractC3969ok mo16799b(Context context) {
        int i;
        C4100uj c4100uj;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14507V.m18227a(this.f14506U);
        C4048sb.m19408a("createViewObject()", (Throwable) null, 2, (Object) null);
        try {
            SurfaceView surfaceView = new SurfaceView(context);
            try {
                i = 2;
                try {
                    c4100uj = new C4100uj(context, this.f14505T, m18742j(), this.f14506U, this.f14507V, m18740h(), surfaceView, null, this.f14508W, this.f14509X, 128, null);
                } catch (Exception e) {
                    e = e;
                    m18736c("Can't instantiate VideoBase: " + e);
                    c4100uj = null;
                }
            } catch (Exception e2) {
                e = e2;
                i = 2;
            }
            this.f14514c0 = c4100uj;
            int i2 = i;
            InterfaceC3698d1 interfaceC3698d1 = (InterfaceC3698d1) this.f14504S.invoke(context, surfaceView, this, m18750r(), this.f14500O);
            C4078tj c4078tjMo18298b = this.f14501P.mo18298b(this.f14502Q);
            if (c4078tjMo18298b != null) {
                interfaceC3698d1.mo16779a(c4078tjMo18298b);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Video asset not found in the repository", (Throwable) null, i2, (Object) null);
            }
            this.f14515d0 = interfaceC3698d1;
            return this.f14514c0;
        } catch (Exception e3) {
            m18736c("Can't instantiate SurfaceView: " + e3);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: b */
    public void mo17466b() {
        C4048sb.m19408a("onVideoDisplayCompleted", (Throwable) null, 2, (Object) null);
        m17928a(true);
        m17922J();
        m18746n().mo16830d();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: b */
    public void mo17467b(long j) {
        C4048sb.m19408a("onVideoDisplayPrepared ready to receive signal from template, duration: " + j, (Throwable) null, 2, (Object) null);
        this.f14513b0 = m17919G();
        this.f14510Y = j;
        mo18755x();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: c */
    public void mo17468c() {
        m18746n().mo16827a(true);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3721e1
    /* JADX INFO: renamed from: d */
    public void mo17469d() {
        m18746n().mo16827a(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m17929e(String str) {
        long jM17736a;
        long jM17736a2;
        C3796h7 c3796h7 = new C3796h7(InterfaceC3807hi.j.FINISH_FAILURE, str, m18739g(), m18744l(), this.f14503R);
        if (this.f14512a0 == 0) {
            jM17736a = this.f14511Z;
            jM17736a2 = AbstractC3760fh.m17736a();
        } else {
            jM17736a = AbstractC3760fh.m17736a();
            jM17736a2 = this.f14512a0;
        }
        c3796h7.m17571a(jM17736a - jM17736a2);
        c3796h7.m17574a(true);
        c3796h7.m17576b(false);
        track((AbstractC3738ei) c3796h7);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: f */
    public void mo17930f() {
        C4048sb.m19408a("destroyView()", (Throwable) null, 2, (Object) null);
        m17918F();
        super.mo17930f();
    }

    /* JADX INFO: renamed from: f */
    public final void m17931f(String str) {
        C4091ua c4091ua = new C4091ua(InterfaceC3807hi.j.FINISH_SUCCESS, str, m18739g(), m18744l(), this.f14503R, null, 32, null);
        c4091ua.m17571a(this.f14512a0 - this.f14511Z);
        c4091ua.m17574a(true);
        c4091ua.m17576b(false);
        track((AbstractC3738ei) c4091ua);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: w */
    public void mo16800w() {
        C4100uj c4100uj = this.f14514c0;
        int width = c4100uj != null ? c4100uj.getWidth() : 0;
        C4100uj c4100uj2 = this.f14514c0;
        int height = c4100uj2 != null ? c4100uj2.getHeight() : 0;
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (!(interfaceC3698d1 instanceof InterfaceC3874kg)) {
            interfaceC3698d1 = null;
        }
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.mo16778a(width, height);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: y */
    public void mo17932y() {
        C4048sb.m19413c("onPause()", null, 2, null);
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            interfaceC3698d1.pause();
        }
        super.mo17932y();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: z */
    public void mo17933z() {
        C4048sb.m19413c("onResume()", null, 2, null);
        this.f14501P.mo18295a(null, 1, false);
        InterfaceC3698d1 interfaceC3698d1 = this.f14515d0;
        if (interfaceC3698d1 != null) {
            InterfaceC3653b2 interfaceC3653b2 = interfaceC3698d1 instanceof InterfaceC3653b2 ? (InterfaceC3653b2) interfaceC3698d1 : null;
            if (interfaceC3653b2 != null) {
                interfaceC3653b2.mo16783c();
            }
            interfaceC3698d1.play();
        }
        super.mo17933z();
    }
}
