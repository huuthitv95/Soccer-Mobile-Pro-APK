package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4156x9 implements InterfaceC4200z9, InterfaceC3908m4 {

    /* JADX INFO: renamed from: a */
    public final C3651b0 f16909a;

    /* JADX INFO: renamed from: b */
    public final C4143wi f16910b;

    /* JADX INFO: renamed from: c */
    public final C3708db f16911c;

    /* JADX INFO: renamed from: d */
    public final C3839j4 f16912d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3908m4 f16913e;

    /* JADX INFO: renamed from: f */
    public final EnumC3914ma f16914f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4178y9 f16915g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3642ae f16916h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3971p0 f16917i;

    /* JADX INFO: renamed from: j */
    public final C3920mg f16918j;

    /* JADX INFO: renamed from: k */
    public boolean f16919k;

    /* JADX INFO: renamed from: l */
    public Boolean f16920l;

    /* JADX INFO: renamed from: m */
    public boolean f16921m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x9$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f16922b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CBError.Click f16923c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4156x9 f16924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CBError.Click click, C4156x9 c4156x9) {
            super(1);
            this.f16922b = str;
            this.f16923c = click;
            this.f16924d = c4156x9;
        }

        /* JADX INFO: renamed from: a */
        public final void m19939a(InterfaceC4178y9 notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.mo18597a(this.f16922b, this.f16923c);
            this.f16924d.mo18631b("Impression click callback for: " + this.f16922b + " failed with error: " + this.f16923c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19939a((InterfaceC4178y9) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x9$b */
    public static final class b implements InterfaceC3862k4 {
        @Override // com.chartboost.sdk.impl.InterfaceC3862k4
        /* JADX INFO: renamed from: a */
        public void mo18348a(String str) {
            C4048sb.m19411b("onClickRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3862k4
        /* JADX INFO: renamed from: a */
        public void mo18349a(JSONObject jSONObject) {
            String string;
            if (jSONObject == null || (string = jSONObject.toString()) == null) {
                string = "";
            }
            C4048sb.m19411b("onClickRequestSuccess " + string, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x9$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f16926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f16926c = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m19940a(InterfaceC4178y9 notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.mo18605d();
            C4156x9.this.mo18630a("Url impression callback success: " + this.f16926c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19940a((InterfaceC4178y9) obj);
            return Unit.INSTANCE;
        }
    }

    public C4156x9(C3651b0 adUnit, C4143wi urlResolver, C3708db intentResolver, C3839j4 clickRequest, InterfaceC3908m4 clickTracking, EnumC3914ma mediaType, InterfaceC4178y9 impressionCallback, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3971p0 adUnitRendererImpressionCallback, C3920mg sdkConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f16909a = adUnit;
        this.f16910b = urlResolver;
        this.f16911c = intentResolver;
        this.f16912d = clickRequest;
        this.f16913e = clickTracking;
        this.f16914f = mediaType;
        this.f16915g = impressionCallback;
        this.f16916h = openMeasurementImpressionCallback;
        this.f16917i = adUnitRendererImpressionCallback;
        this.f16918j = sdkConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4156x9(C3651b0 c3651b0, C4143wi c4143wi, C3708db c3708db, C3839j4 c3839j4, InterfaceC3908m4 interfaceC3908m4, EnumC3914ma enumC3914ma, InterfaceC4178y9 interfaceC4178y9, InterfaceC3642ae interfaceC3642ae, InterfaceC3971p0 interfaceC3971p0, C3920mg c3920mg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C3920mg c3920mg2;
        if ((i & 512) != 0) {
            Object obj = C3678c4.f13658b.mo17019a().mo18988b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            c3920mg2 = (C3920mg) obj;
        } else {
            c3920mg2 = c3920mg;
        }
        this(c3651b0, c4143wi, c3708db, c3839j4, interfaceC3908m4, enumC3914ma, interfaceC4178y9, interfaceC3642ae, interfaceC3971p0, c3920mg2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public void mo19851a(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        m19938d(cbUrl.m18483b());
    }

    /* JADX INFO: renamed from: a */
    public final void m19932a(InterfaceC4178y9 interfaceC4178y9, String str) {
        m19934a(interfaceC4178y9, new c(str));
    }

    /* JADX INFO: renamed from: a */
    public final void m19933a(InterfaceC4178y9 interfaceC4178y9, String str, CBError.Click click) {
        m19934a(interfaceC4178y9, new a(str, click, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m19934a(InterfaceC4178y9 interfaceC4178y9, Function1 function1) {
        Unit unit;
        if (interfaceC4178y9 != null) {
            interfaceC4178y9.mo18599a(false);
            function1.invoke(interfaceC4178y9);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Impression callback is null", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3908m4
    /* JADX INFO: renamed from: a */
    public void mo18630a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16913e.mo18630a(message);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public void mo19855a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16917i.mo18598a(this.f16909a.m16871m(), str, error);
    }

    /* JADX INFO: renamed from: a */
    public final void m19935a(String str, Boolean bool, boolean z) {
        Unit unit;
        this.f16916h.mo16828b();
        if (bool != null) {
            this.f16921m = bool.booleanValue();
        }
        CBError.Click clickM19815a = this.f16910b.m19815a(str, this.f16909a.m16866h(), this.f16913e, z);
        if (clickM19815a != null) {
            m19933a(this.f16915g, str, clickM19815a);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m19932a(this.f16915g, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m19936a() {
        return this.f16919k;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: a */
    public boolean mo19858a(String urlFromCreative, Boolean bool, EnumC3937na impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        if (bool != null) {
            this.f16921m = bool.booleanValue();
        }
        if (impressionState != EnumC3937na.DISPLAYED) {
            return false;
        }
        if (!this.f16918j.f15357A || StringsKt.isBlank(urlFromCreative)) {
            urlFromCreative = this.f16909a.m16873o();
        }
        String strM16869k = this.f16909a.m16869k();
        if (this.f16911c.m17275b(strM16869k)) {
            this.f16920l = Boolean.TRUE;
            urlFromCreative = strM16869k;
        } else {
            this.f16920l = Boolean.FALSE;
        }
        if (m19936a()) {
            return false;
        }
        mo19867e(true);
        this.f16915g.mo18603b(false);
        m19935a(urlFromCreative, Boolean.valueOf(this.f16921m), true);
        return true;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: b */
    public void mo19860b(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        m19935a(cbUrl.m18483b(), cbUrl.m18482a(), true);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3908m4
    /* JADX INFO: renamed from: b */
    public void mo18631b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16913e.mo18631b(message);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: b */
    public void mo19863b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f16912d.m18185a(new b(), new C3793h4(location, this.f16909a.m16859a(), this.f16909a.m16854A(), this.f16909a.m16865g(), this.f16909a.m16867i(), f, f2, this.f16914f, this.f16920l));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: c */
    public void mo19864c(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        m19937c(cbUrl.m18483b());
    }

    /* JADX INFO: renamed from: c */
    public final void m19937c(String str) {
        m19933a(this.f16915g, str, CBError.Click.LOAD_NOT_FINISHED);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: d */
    public void mo19865d() {
        this.f16917i.mo18602b(this.f16909a.m16871m());
        if (this.f16921m) {
            this.f16915g.mo18579D();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19938d(String str) {
        this.f16910b.m19815a(str, this.f16909a.m16866h(), this.f16913e, false);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4200z9
    /* JADX INFO: renamed from: e */
    public void mo19867e(boolean z) {
        this.f16919k = z;
    }
}
