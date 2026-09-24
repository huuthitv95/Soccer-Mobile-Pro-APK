package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C12496e;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.M9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11561M9 implements InterfaceC11737Wd, InterfaceC12525t4, InterfaceC12472s4, InterfaceC12436q4, InterfaceC12454r4, InterfaceC11665S9, InterfaceC11492Ic {

    /* JADX INFO: renamed from: m */
    private static final String f25127m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n */
    private static C11561M9 f25128n;

    /* JADX INFO: renamed from: a */
    private C12496e f25129a;

    /* JADX INFO: renamed from: b */
    private String f25130b;

    /* JADX INFO: renamed from: c */
    private String f25131c;

    /* JADX INFO: renamed from: d */
    private C11677T4 f25132d;

    /* JADX INFO: renamed from: e */
    private C12268jc f25133e;

    /* JADX INFO: renamed from: g */
    private C11796a4 f25135g;

    /* JADX INFO: renamed from: f */
    private boolean f25134f = false;

    /* JADX INFO: renamed from: h */
    private FeaturesManager f25136h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i */
    private InterfaceC11542L8.a f25137i = C11455Gb.m25885O().mo25776j();

    /* JADX INFO: renamed from: j */
    private InterfaceC11622Q.a f25138j = C11455Gb.m25885O().mo25771E();

    /* JADX INFO: renamed from: k */
    private InterfaceC11622Q f25139k = C11455Gb.m25891U().mo25841G();

    /* JADX INFO: renamed from: l */
    private InterfaceC12300l8 f25140l = C11455Gb.m25891U().mo25853t();

    /* JADX INFO: renamed from: com.ironsource.M9$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25141a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f25142b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11660S4 f25143c;

        a(String str, String str2, C11660S4 c11660s4) {
            this.f25141a = str;
            this.f25142b = str2;
            this.f25143c = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33413a(this.f25141a, this.f25142b, this.f25143c, (InterfaceC12525t4) c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f25145a;

        b(JSONObject jSONObject) {
            this.f25145a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33417a(this.f25145a, (InterfaceC12525t4) c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25147a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f25148b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C11660S4 f25149c;

        c(String str, String str2, C11660S4 c11660s4) {
            this.f25147a = str;
            this.f25148b = str2;
            this.f25149c = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33412a(this.f25147a, this.f25148b, this.f25149c, (InterfaceC12472s4) c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25151a;

        d(String str) {
            this.f25151a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33409a(this.f25151a, c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f25153a;

        e(JSONObject jSONObject) {
            this.f25153a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33416a(this.f25153a, (InterfaceC12472s4) c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11471H9 f25155a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f25156b;

        f(C11471H9 c11471h9, Map map) {
            this.f25155a = c11471h9;
            this.f25156b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12386n8.e eVar = this.f25155a.m25999i() ? C12386n8.e.Banner : C12386n8.e.Interstitial;
            C11660S4 c11660s4M27512a = C11561M9.this.f25132d.m27512a(eVar, this.f25155a);
            C12422p8 c12422p8 = new C12422p8();
            c12422p8.m33061a(C11341A5.f23833x, Boolean.valueOf(this.f25155a.m26000j())).m33061a(C11341A5.f23794G, Boolean.valueOf(this.f25155a.m26003m())).m33061a(C11341A5.f23831v, this.f25155a.m25997g()).m33061a(C11341A5.f23832w, C11682T9.m27524a(this.f25155a)).m33061a(C11341A5.f23796I, Long.valueOf(C11569N.f25195a.m26595b(this.f25155a.m25995e())));
            C12547u8.m33895a(C11703Ud.f25969h, c12422p8.m33062a());
            if (eVar == C12386n8.e.Banner) {
                C11561M9 c11561m9 = C11561M9.this;
                c11561m9.f25129a.mo33411a(c11561m9.f25130b, c11561m9.f25131c, c11660s4M27512a, (InterfaceC12454r4) c11561m9);
                C11561M9 c11561m10 = C11561M9.this;
                c11561m10.f25129a.mo33405a(c11660s4M27512a, this.f25156b, (InterfaceC12454r4) c11561m10);
                return;
            }
            C11561M9 c11561m11 = C11561M9.this;
            c11561m11.f25129a.mo33412a(c11561m11.f25130b, c11561m11.f25131c, c11660s4M27512a, (InterfaceC12472s4) c11561m11);
            C11561M9 c11561m12 = C11561M9.this;
            c11561m12.f25129a.mo33422b(c11660s4M27512a, this.f25156b, c11561m12);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11660S4 f25158a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f25159b;

        g(C11660S4 c11660s4, Map map) {
            this.f25158a = c11660s4;
            this.f25159b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11561M9 c11561m9 = C11561M9.this;
            c11561m9.f25129a.mo33406a(this.f25158a, this.f25159b, (InterfaceC12472s4) c11561m9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.M9$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11471H9 f25161a;

        h(C11471H9 c11471h9) {
            this.f25161a = c11471h9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12386n8.e eVar = this.f25161a.m25999i() ? C12386n8.e.Banner : C12386n8.e.Interstitial;
            C11660S4 c11660s4M27512a = C11561M9.this.f25132d.m27512a(eVar, this.f25161a);
            C12422p8 c12422p8 = new C12422p8();
            c12422p8.m33061a(C11341A5.f23833x, Boolean.valueOf(this.f25161a.m26000j())).m33061a(C11341A5.f23831v, this.f25161a.m25997g()).m33061a(C11341A5.f23832w, C11682T9.m27524a(this.f25161a)).m33061a("isMultipleAdObjects", Boolean.valueOf(this.f25161a.m26002l()));
            C12547u8.m33895a(C11703Ud.f25974m, c12422p8.m33062a());
            if (eVar == C12386n8.e.Banner) {
                C11561M9.this.f25129a.mo33404a(c11660s4M27512a);
            } else {
                c11660s4M27512a.m27437a(false);
                C11561M9.this.f25129a.mo33421b(c11660s4M27512a);
            }
        }
    }

    private C11561M9(Context context, int i) {
        m26509c(context);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC11665S9 m26502a(Context context, String str, String str2) {
        return m26503a(str, str2, context);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C11561M9 m26506b(Context context) throws Exception {
        return m26501a(context, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m26509c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C11802aa.m28149a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C12411of(SDKUtils.getNetworkConfiguration().optJSONObject(C11744X3.a.f26174k)));
            C11802aa.m28151e().m28160d(SDKUtils.getSDKVersion());
            this.f25132d = new C11677T4();
            C11796a4 c11796a4 = new C11796a4();
            this.f25135g = c11796a4;
            if (context instanceof Activity) {
                c11796a4.m28106a((Activity) context);
            }
            int debugMode = this.f25136h.getDebugMode();
            this.f25133e = new C12268jc();
            this.f25129a = new C12496e(context, this.f25135g, this.f25132d, C11613P7.f25510a, debugMode, this.f25136h.getDataManagerConfig(), this.f25130b, this.f25131c, this.f25133e);
            Logger.enableLogging(debugMode);
            Logger.m33642i(f25127m, "C'tor");
            m26515a(context);
            this.f25133e.m31893d();
            this.f25133e.m31894e();
            this.f25133e.m31884a(context);
            this.f25133e.m31890b();
            this.f25133e.m31883a();
            this.f25133e.m31891b(context);
            this.f25133e.m31892c();
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC12472s4
    /* JADX INFO: renamed from: d */
    public void mo26544d(String str, String str2) {
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.Interstitial, str);
        if (c11660s4M26511d != null) {
            C11471H9 c11471h9M27441c = c11660s4M26511d.m27441c();
            this.f25138j.mo27265a(EnumC12396o0.SHOW_FAIL, c11471h9M27441c.m25995e());
            if (m26543c(c11471h9M27441c)) {
                this.f25137i.mo26362a(new C11755Xe(this.f25139k.mo27262a(c11471h9M27441c.m25995e())));
            }
            InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
            if (interfaceC11438FcM26505b != null) {
                interfaceC11438FcM26505b.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.InterfaceC11492Ic
    /* JADX INFO: renamed from: e */
    public void mo26102e(Activity activity) {
        this.f25135g.m28106a(activity);
        this.f25129a.mo33426g();
        this.f25129a.mo33420b(activity);
    }

    @Override // com.ironsource.InterfaceC12472s4
    public void onInterstitialAdRewarded(String str, int i) {
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.Interstitial, str);
        InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
        if (c11660s4M26511d == null || interfaceC11438FcM26505b == null) {
            return;
        }
        interfaceC11438FcM26505b.onInterstitialAdRewarded(str, i);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC11665S9 m26503a(String str, String str2, Context context) {
        if (f25128n == null) {
            C12547u8.m33894a(C11703Ud.f25962a);
            f25128n = new C11561M9(str, str2, context);
        }
        return f25128n;
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC11438Fc m26505b(C11660S4 c11660s4) {
        if (c11660s4 == null) {
            return null;
        }
        return (InterfaceC11438Fc) c11660s4.m27448i();
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: b */
    public void mo26537b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f25129a.m33408a(new d(strOptString));
    }

    @Override // com.ironsource.InterfaceC11737Wd, com.ironsource.InterfaceC11665S9
    /* JADX INFO: renamed from: b */
    public void mo26531b(Activity activity) {
        if (this.f25134f) {
            return;
        }
        mo26101d(activity);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C11561M9 m26501a(Context context, int i) throws Exception {
        Logger.m33642i(f25127m, "getInstance()");
        if (f25128n == null) {
            f25128n = new C11561M9(context, i);
        }
        return f25128n;
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: b */
    public void mo26534b(C12386n8.e eVar, String str) {
        InterfaceC11438Fc interfaceC11438FcM26505b;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        if (c11660s4M26511d != null) {
            if (eVar == C12386n8.e.RewardedVideo) {
                InterfaceC11528Kc interfaceC11528KcM26508c = m26508c(c11660s4M26511d);
                if (interfaceC11528KcM26508c != null) {
                    interfaceC11528KcM26508c.m26295d();
                    return;
                }
                return;
            }
            if (eVar != C12386n8.e.Interstitial || (interfaceC11438FcM26505b = m26505b(c11660s4M26511d)) == null) {
                return;
            }
            interfaceC11438FcM26505b.onInterstitialClose();
        }
    }

    /* JADX INFO: renamed from: d */
    private C11660S4 m26511d(C12386n8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f25132d.m27513a(eVar, str);
    }

    @Override // com.ironsource.InterfaceC11665S9
    /* JADX INFO: renamed from: a */
    public C12496e mo26512a() {
        return this.f25129a;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC11402Dc m26500a(C11660S4 c11660s4) {
        if (c11660s4 == null) {
            return null;
        }
        return (InterfaceC11402Dc) c11660s4.m27448i();
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: a */
    public void mo26526a(String str, String str2, String str3, Map<String, String> map, InterfaceC11528Kc interfaceC11528Kc) {
        this.f25130b = str;
        this.f25131c = str2;
        this.f25129a.m33408a(new a(str, str2, this.f25132d.m27514a(C12386n8.e.RewardedVideo, str3, map, interfaceC11528Kc)));
    }

    @Override // com.ironsource.InterfaceC11492Ic
    /* JADX INFO: renamed from: d */
    public void mo26101d(Activity activity) {
        try {
            this.f25129a.mo33424e();
            this.f25129a.mo33403a((Context) activity);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    C11561M9(String str, String str2, Context context) {
        this.f25130b = str;
        this.f25131c = str2;
        m26509c(context);
    }

    @Override // com.ironsource.InterfaceC12525t4
    /* JADX INFO: renamed from: b */
    public void mo26536b(String str, String str2) {
        InterfaceC11528Kc interfaceC11528KcM26508c;
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.RewardedVideo, str);
        if (c11660s4M26511d == null || (interfaceC11528KcM26508c = m26508c(c11660s4M26511d)) == null) {
            return;
        }
        interfaceC11528KcM26508c.m26290a(str2);
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: a */
    public void mo26528a(JSONObject jSONObject) {
        this.f25129a.m33408a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: a */
    public void mo26525a(String str, String str2, String str3, Map<String, String> map, InterfaceC11438Fc interfaceC11438Fc) {
        this.f25130b = str;
        this.f25131c = str2;
        this.f25129a.m33408a(new c(str, str2, this.f25132d.m27514a(C12386n8.e.Interstitial, str3, map, interfaceC11438Fc)));
    }

    @Override // com.ironsource.InterfaceC12472s4
    /* JADX INFO: renamed from: b */
    public void mo26535b(String str) {
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.Interstitial, str);
        if (c11660s4M26511d != null) {
            C11471H9 c11471h9M27441c = c11660s4M26511d.m27441c();
            this.f25138j.mo27265a(EnumC12396o0.SHOW_SUCCESS, c11471h9M27441c.m25995e());
            if (m26543c(c11471h9M27441c)) {
                this.f25137i.mo26362a(new C11772Ye(this.f25139k.mo27262a(c11471h9M27441c.m25995e())));
            }
            InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
            if (interfaceC11438FcM26505b != null) {
                interfaceC11438FcM26505b.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: a */
    public boolean mo26530a(String str) {
        return this.f25129a.mo33418a(str);
    }

    @Override // com.ironsource.InterfaceC11737Wd, com.ironsource.InterfaceC11665S9
    /* JADX INFO: renamed from: a */
    public void mo26513a(Activity activity) {
        if (this.f25134f) {
            return;
        }
        mo26102e(activity);
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: a */
    public void mo26518a(C12386n8.e eVar, String str, C12105b1 c12105b1) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        if (c11660s4M26511d != null) {
            c11660s4M26511d.m27440b(2);
            if (eVar == C12386n8.e.RewardedVideo) {
                InterfaceC11528Kc interfaceC11528KcM26508c = m26508c(c11660s4M26511d);
                if (interfaceC11528KcM26508c != null) {
                    interfaceC11528KcM26508c.m26289a(c12105b1);
                    return;
                }
                return;
            }
            if (eVar == C12386n8.e.Interstitial) {
                InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
                if (interfaceC11438FcM26505b != null) {
                    interfaceC11438FcM26505b.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C12386n8.e.Banner || (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) == null) {
                return;
            }
            interfaceC11402DcM26500a.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.InterfaceC11699U9
    /* JADX INFO: renamed from: b */
    public void mo26532b(Activity activity, C11471H9 c11471h9, Map<String, String> map) {
        if (C11455Gb.m25891U().mo25846h().mo32182i()) {
            this.f25135g.m28106a(activity);
        }
        mo26516a(c11471h9, map);
    }

    /* JADX INFO: renamed from: b */
    private void m26507b(C11471H9 c11471h9, Map<String, String> map) {
        Logger.m33638d(f25127m, "loadOnNewInstance " + c11471h9.m25995e());
        this.f25129a.m33408a(new f(c11471h9, map));
    }

    @Override // com.ironsource.InterfaceC11699U9
    /* JADX INFO: renamed from: b */
    public void mo26533b(C11471H9 c11471h9) {
        Logger.m33638d(f25127m, "destroyInstance " + c11471h9.m25995e());
        if (m26543c(c11471h9)) {
            this.f25138j.mo27265a(EnumC12396o0.DESTROYED, c11471h9.m25995e());
            this.f25137i.mo26362a(new C11704Ue(this.f25139k.mo27262a(c11471h9.m25995e())));
        }
        this.f25129a.m33408a(new h(c11471h9));
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC11528Kc m26508c(C11660S4 c11660s4) {
        if (c11660s4 == null) {
            return null;
        }
        return (InterfaceC11528Kc) c11660s4.m27448i();
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: a */
    public void mo26519a(C12386n8.e eVar, String str, String str2) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23831v, str).m33061a(C11341A5.f23832w, eVar).m33061a(C11341A5.f23788A, str2);
        if (c11660s4M26511d != null) {
            C11569N c11569n = C11569N.f25195a;
            c12422p8M33061a.m33061a(C11341A5.f23796I, Long.valueOf(c11569n.m26595b(c11660s4M26511d.m27447h())));
            c12422p8M33061a.m33061a(C11341A5.f23833x, Boolean.valueOf(C12565v8.m33938a(c11660s4M26511d)));
            c11569n.m26593a(c11660s4M26511d.m27447h());
            c11660s4M26511d.m27440b(3);
            if (eVar == C12386n8.e.RewardedVideo) {
                InterfaceC11528Kc interfaceC11528KcM26508c = m26508c(c11660s4M26511d);
                if (interfaceC11528KcM26508c != null) {
                    interfaceC11528KcM26508c.m26293b(str2);
                }
            } else if (eVar == C12386n8.e.Interstitial) {
                InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
                if (interfaceC11438FcM26505b != null) {
                    interfaceC11438FcM26505b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C12386n8.e.Banner && (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) != null) {
                interfaceC11402DcM26500a.onBannerLoadFail(str2);
            }
        }
        C12547u8.m33895a(C11703Ud.f25970i, c12422p8M33061a.m33062a());
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: c */
    public void mo26542c(JSONObject jSONObject) {
        this.f25129a.m33408a(new e(jSONObject));
    }

    @Override // com.ironsource.InterfaceC11737Wd, com.ironsource.InterfaceC11665S9
    /* JADX INFO: renamed from: c */
    public void mo26538c(Activity activity) {
        try {
            Logger.m33642i(f25127m, "release()");
            C11728W4.m27794g();
            this.f25135g.m28107b();
            this.f25129a.mo33403a((Context) activity);
            this.f25129a.mo33401a();
            this.f25129a = null;
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
        }
        f25128n = null;
    }

    @Override // com.ironsource.InterfaceC12525t4
    /* JADX INFO: renamed from: c */
    public void mo26540c(String str) {
        InterfaceC11528Kc interfaceC11528KcM26508c;
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.RewardedVideo, str);
        if (c11660s4M26511d == null || (interfaceC11528KcM26508c = m26508c(c11660s4M26511d)) == null) {
            return;
        }
        interfaceC11528KcM26508c.m26294c();
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: c */
    public void mo26539c(C12386n8.e eVar, String str) {
        InterfaceC11528Kc interfaceC11528KcM26508c;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        if (c11660s4M26511d != null) {
            if (eVar == C12386n8.e.Interstitial) {
                InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
                if (interfaceC11438FcM26505b != null) {
                    interfaceC11438FcM26505b.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C12386n8.e.RewardedVideo || (interfaceC11528KcM26508c = m26508c(c11660s4M26511d)) == null) {
                return;
            }
            interfaceC11528KcM26508c.m26292b();
        }
    }

    @Override // com.ironsource.InterfaceC12454r4
    /* JADX INFO: renamed from: c */
    public void mo26541c(String str, String str2) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.Banner, str);
        if (c11660s4M26511d == null || (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) == null) {
            return;
        }
        interfaceC11402DcM26500a.onBannerLoadFail(str2);
    }

    /* JADX INFO: renamed from: c */
    private void m26510c(C11471H9 c11471h9, Map<String, String> map) {
        try {
            map = m26504a(map);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23788A, e2.getMessage()).m33061a(C11341A5.f23833x, Boolean.valueOf(c11471h9.m26000j())).m33061a(C11341A5.f23794G, Boolean.valueOf(c11471h9.m26003m())).m33061a(C11341A5.f23831v, c11471h9.m25997g()).m33061a(C11341A5.f23832w, C11682T9.m27524a(c11471h9)).m33061a(C11341A5.f23796I, Long.valueOf(C11569N.f25195a.m26595b(c11471h9.m25995e())));
            C11569N.f25195a.m26593a(c11471h9.m25995e());
            C12547u8.m33895a(C11703Ud.f25972k, c12422p8M33061a.m33062a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.m33638d(f25127m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        m26507b(c11471h9, map);
    }

    @Override // com.ironsource.InterfaceC12525t4
    /* JADX INFO: renamed from: a */
    public void mo26521a(String str, int i) {
        InterfaceC11528Kc interfaceC11528KcM26508c;
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.RewardedVideo, str);
        if (c11660s4M26511d == null || (interfaceC11528KcM26508c = m26508c(c11660s4M26511d)) == null) {
            return;
        }
        interfaceC11528KcM26508c.m26288a(i);
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: a */
    public void mo26517a(C12386n8.e eVar, String str) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        if (c11660s4M26511d != null) {
            if (eVar == C12386n8.e.RewardedVideo) {
                InterfaceC11528Kc interfaceC11528KcM26508c = m26508c(c11660s4M26511d);
                if (interfaceC11528KcM26508c != null) {
                    interfaceC11528KcM26508c.m26287a();
                    return;
                }
                return;
            }
            if (eVar == C12386n8.e.Interstitial) {
                InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
                if (interfaceC11438FcM26505b != null) {
                    interfaceC11438FcM26505b.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C12386n8.e.Banner || (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) == null) {
                return;
            }
            interfaceC11402DcM26500a.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC12436q4
    /* JADX INFO: renamed from: a */
    public void mo26520a(C12386n8.e eVar, String str, String str2, JSONObject jSONObject) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        if (c11660s4M26511d == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.m33642i(f25127m, "Received Event Notification: " + str2 + " for demand source: " + c11660s4M26511d.m27445f());
            if (eVar == C12386n8.e.Interstitial) {
                InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
                if (interfaceC11438FcM26505b != null) {
                    jSONObject.put("demandSourceName", str);
                    interfaceC11438FcM26505b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C12386n8.e.RewardedVideo) {
                InterfaceC11528Kc interfaceC11528KcM26508c = m26508c(c11660s4M26511d);
                if (interfaceC11528KcM26508c != null) {
                    jSONObject.put("demandSourceName", str);
                    interfaceC11528KcM26508c.m26291a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C12386n8.e.Banner || (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                interfaceC11402DcM26500a.onBannerShowSuccess();
            }
        } catch (JSONException e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m26543c(C11471H9 c11471h9) {
        return c11471h9.m26002l() && !c11471h9.m25999i() && mo26529a(c11471h9);
    }

    @Override // com.ironsource.InterfaceC12472s4
    /* JADX INFO: renamed from: a */
    public void mo26527a(String str, JSONObject jSONObject) {
        C12386n8.e eVar = C12386n8.e.Interstitial;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23831v, str);
        if (c11660s4M26511d != null) {
            C11471H9 c11471h9M27441c = c11660s4M26511d.m27441c();
            this.f25138j.mo27266a(jSONObject, EnumC12396o0.LOAD_SUCCESS, c11471h9M27441c.m25995e());
            if (m26543c(c11471h9M27441c)) {
                this.f25137i.mo26362a(new C11738We(this.f25139k.mo27262a(c11471h9M27441c.m25995e())));
            }
            C12422p8 c12422p8M33061a2 = c12422p8M33061a.m33061a(C11341A5.f23832w, C12565v8.m33935a(c11660s4M26511d, eVar)).m33061a(C11341A5.f23833x, Boolean.valueOf(C12565v8.m33938a(c11660s4M26511d)));
            C11569N c11569n = C11569N.f25195a;
            c12422p8M33061a2.m33061a(C11341A5.f23796I, Long.valueOf(c11569n.m26595b(c11660s4M26511d.m27447h())));
            c11569n.m26593a(c11660s4M26511d.m27447h());
            InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
            if (interfaceC11438FcM26505b != null) {
                interfaceC11438FcM26505b.onInterstitialLoadSuccess(c11660s4M26511d.m27441c());
            }
        }
        C12547u8.m33895a(C11703Ud.f25973l, c12422p8M33061a.m33062a());
    }

    @Override // com.ironsource.InterfaceC12472s4
    /* JADX INFO: renamed from: a */
    public void mo26523a(String str, String str2) {
        Object obj;
        C12386n8.e eVar = C12386n8.e.Interstitial;
        C11660S4 c11660s4M26511d = m26511d(eVar, str);
        C12422p8 c12422p8 = new C12422p8();
        c12422p8.m33061a(C11341A5.f23788A, str2).m33061a(C11341A5.f23831v, str);
        if (c11660s4M26511d != null) {
            C12422p8 c12422p8M33061a = c12422p8.m33061a(C11341A5.f23832w, C12565v8.m33935a(c11660s4M26511d, eVar));
            if (c11660s4M26511d.m27444e() == 2) {
                obj = C11341A5.f23792E;
            } else {
                obj = C11341A5.f23793F;
            }
            C12422p8 c12422p8M33061a2 = c12422p8M33061a.m33061a(C11341A5.f23834y, obj).m33061a(C11341A5.f23833x, Boolean.valueOf(C12565v8.m33938a(c11660s4M26511d)));
            C11569N c11569n = C11569N.f25195a;
            c12422p8M33061a2.m33061a(C11341A5.f23796I, Long.valueOf(c11569n.m26595b(c11660s4M26511d.m27447h())));
            c11569n.m26593a(c11660s4M26511d.m27447h());
            InterfaceC11438Fc interfaceC11438FcM26505b = m26505b(c11660s4M26511d);
            if (interfaceC11438FcM26505b != null) {
                interfaceC11438FcM26505b.onInterstitialLoadFailed(str2);
            }
        }
        C12547u8.m33895a(C11703Ud.f25968g, c12422p8.m33062a());
    }

    @Override // com.ironsource.InterfaceC11737Wd
    /* JADX INFO: renamed from: a */
    public void mo26524a(String str, String str2, int i) {
        C12386n8.e productType;
        C11660S4 c11660s4M27513a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (c11660s4M27513a = this.f25132d.m27513a(productType, str2)) == null) {
            return;
        }
        c11660s4M27513a.m27442c(i);
    }

    @Override // com.ironsource.InterfaceC12454r4
    /* JADX INFO: renamed from: a */
    public void mo26522a(String str, C12166e8 c12166e8) {
        InterfaceC11402Dc interfaceC11402DcM26500a;
        C11660S4 c11660s4M26511d = m26511d(C12386n8.e.Banner, str);
        if (c11660s4M26511d == null || (interfaceC11402DcM26500a = m26500a(c11660s4M26511d)) == null) {
            return;
        }
        interfaceC11402DcM26500a.onBannerLoadSuccess(c11660s4M26511d.m27441c(), c12166e8);
    }

    @Override // com.ironsource.InterfaceC11699U9
    /* JADX INFO: renamed from: a */
    public void mo26516a(C11471H9 c11471h9, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C11744X3.i.f26403y0, String.valueOf(jCurrentTimeMillis));
        C11569N.f25195a.m26594a(c11471h9.m25995e(), jCurrentTimeMillis);
        C12422p8 c12422p8 = new C12422p8();
        c12422p8.m33061a(C11341A5.f23833x, Boolean.valueOf(c11471h9.m26000j())).m33061a(C11341A5.f23794G, Boolean.valueOf(c11471h9.m26003m())).m33061a(C11341A5.f23831v, c11471h9.m25997g()).m33061a(C11341A5.f23832w, C11682T9.m27524a(c11471h9)).m33061a(C11341A5.f23796I, Long.valueOf(jCurrentTimeMillis));
        C12547u8.m33895a(C11703Ud.f25967f, c12422p8.m33062a());
        Logger.m33638d(f25127m, "loadAd " + c11471h9.m25995e());
        C11605P c11605p = new C11605P(c11471h9);
        this.f25138j.mo27264a(c11605p);
        this.f25138j.mo27266a(new JSONObject(map), EnumC12396o0.LOAD_REQUEST, c11605p.m26788c());
        if (m26543c(c11471h9)) {
            this.f25137i.mo26362a(new C11721Ve(c11605p));
        }
        if (c11471h9.m26001k()) {
            m26510c(c11471h9, map);
        } else {
            m26507b(c11471h9, map);
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m26504a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.InterfaceC11699U9
    /* JADX INFO: renamed from: a */
    public void mo26514a(Activity activity, C11471H9 c11471h9, Map<String, String> map) {
        this.f25135g.m28106a(activity);
        Logger.m33642i(f25127m, "showAd " + c11471h9.m25995e());
        C11660S4 c11660s4M27513a = this.f25132d.m27513a(C12386n8.e.Interstitial, c11471h9.m25995e());
        if (c11660s4M27513a == null) {
            return;
        }
        this.f25129a.m33408a(new g(c11660s4M27513a, map));
    }

    @Override // com.ironsource.InterfaceC11699U9
    /* JADX INFO: renamed from: a */
    public boolean mo26529a(C11471H9 c11471h9) {
        Logger.m33638d(f25127m, "isAdAvailable " + c11471h9.m25995e());
        C11660S4 c11660s4M27513a = this.f25132d.m27513a(C12386n8.e.Interstitial, c11471h9.m25995e());
        if (c11660s4M27513a == null) {
            return false;
        }
        return c11660s4M27513a.m27443d();
    }

    /* JADX INFO: renamed from: a */
    public void m26515a(Context context) {
        this.f25134f = false;
        Boolean boolMo32061c = this.f25140l.mo32061c(C11744X3.a.f26170g);
        if (boolMo32061c == null) {
            boolMo32061c = Boolean.FALSE;
        }
        boolean zBooleanValue = boolMo32061c.booleanValue();
        this.f25134f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C12237i(this));
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                C12422p8 c12422p8 = new C12422p8();
                c12422p8.m33061a(C11341A5.f23834y, th.getMessage());
                C12547u8.m33895a(C11703Ud.f25982u, c12422p8.m33062a());
            }
        }
    }
}
