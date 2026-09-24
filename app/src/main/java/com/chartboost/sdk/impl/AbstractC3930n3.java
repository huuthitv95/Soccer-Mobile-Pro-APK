package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11744X3;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3930n3 implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: A */
    public int f15427A;

    /* JADX INFO: renamed from: B */
    public int f15428B;

    /* JADX INFO: renamed from: C */
    public int f15429C;

    /* JADX INFO: renamed from: D */
    public int f15430D;

    /* JADX INFO: renamed from: E */
    public int f15431E;

    /* JADX INFO: renamed from: F */
    public int f15432F;

    /* JADX INFO: renamed from: G */
    public boolean f15433G;

    /* JADX INFO: renamed from: H */
    public int f15434H;

    /* JADX INFO: renamed from: I */
    public EnumC4029re f15435I;

    /* JADX INFO: renamed from: J */
    public AbstractC3969ok f15436J;

    /* JADX INFO: renamed from: K */
    public float f15437K;

    /* JADX INFO: renamed from: L */
    public float f15438L;

    /* JADX INFO: renamed from: M */
    public float f15439M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC4064t5 f15440N;

    /* JADX INFO: renamed from: a */
    public final Context f15441a;

    /* JADX INFO: renamed from: b */
    public final String f15442b;

    /* JADX INFO: renamed from: c */
    public final EnumC3709dc f15443c;

    /* JADX INFO: renamed from: d */
    public final String f15444d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3945ni f15445e;

    /* JADX INFO: renamed from: f */
    public final C4001q8 f15446f;

    /* JADX INFO: renamed from: g */
    public final C3746f3 f15447g;

    /* JADX INFO: renamed from: h */
    public final C3861k3 f15448h;

    /* JADX INFO: renamed from: i */
    public final Mediation f15449i;

    /* JADX INFO: renamed from: j */
    public final String f15450j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3642ae f15451k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC3971p0 f15452l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC3856jl f15453m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3911m7 f15454n;

    /* JADX INFO: renamed from: o */
    public final Function2 f15455o;

    /* JADX INFO: renamed from: p */
    public String f15456p;

    /* JADX INFO: renamed from: q */
    public long f15457q;

    /* JADX INFO: renamed from: r */
    public long f15458r;

    /* JADX INFO: renamed from: s */
    public boolean f15459s;

    /* JADX INFO: renamed from: t */
    public int f15460t;

    /* JADX INFO: renamed from: u */
    public int f15461u;

    /* JADX INFO: renamed from: v */
    public int f15462v;

    /* JADX INFO: renamed from: w */
    public int f15463w;

    /* JADX INFO: renamed from: x */
    public int f15464x;

    /* JADX INFO: renamed from: y */
    public int f15465y;

    /* JADX INFO: renamed from: z */
    public int f15466z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n3$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: b */
        public static final a f15467b = new a();

        public a() {
            super(2, C3959oa.class, "<init>", "<init>(Ljava/lang/String;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3959oa invoke(String p0, InterfaceC3911m7 p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return new C3959oa(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n3$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15468a;

        static {
            int[] iArr = new int[EnumC4012qj.values().length];
            try {
                iArr[EnumC4012qj.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4012qj.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4012qj.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4012qj.BUFFER_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4012qj.BUFFER_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4012qj.QUARTILE1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4012qj.MIDPOINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC4012qj.QUARTILE3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC4012qj.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC4012qj.SKIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC4012qj.VOLUME_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f15468a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n3$c */
    public static final class c implements InterfaceC4064t5 {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: a */
        public void mo18757a() {
            AbstractC3930n3.this.f15457q = System.currentTimeMillis();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: a */
        public void mo18758a(View obstructionView) {
            Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
            AbstractC3930n3.this.m18746n().mo16823a(obstructionView);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: a */
        public void mo18759a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            AbstractC3930n3.this.m18736c(message);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: b */
        public void mo18760b() {
            AbstractC3969ok abstractC3969okM18753u = AbstractC3930n3.this.m18753u();
            C3952o3 webView = abstractC3969okM18753u != null ? abstractC3969okM18753u.getWebView() : null;
            if (AbstractC3930n3.this.f15443c == EnumC3709dc.VIDEO || webView == null) {
                return;
            }
            InterfaceC3642ae interfaceC3642aeM18746n = AbstractC3930n3.this.m18746n();
            EnumC3709dc enumC3709dc = AbstractC3930n3.this.f15443c;
            List list = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
            interfaceC3642aeM18746n.mo16824a(enumC3709dc, webView, null, list);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: c */
        public void mo18761c() {
            AbstractC3930n3.this.mo18755x();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4064t5
        /* JADX INFO: renamed from: d */
        public void mo18762d() {
            AbstractC3930n3.this.m18718B();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n3$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC3969ok f15470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC3969ok abstractC3969ok) {
            super(0);
            this.f15470b = abstractC3969ok;
        }

        /* JADX INFO: renamed from: a */
        public final void m18763a() {
            this.f15470b.mo17055a();
            this.f15470b.removeAllViews();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18763a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n3$e */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18764a() {
            if (AbstractC3930n3.this.f15459s) {
                return;
            }
            C4048sb.m19408a("Webview seems to be taking more time loading the html content, so closing the view.", (Throwable) null, 2, (Object) null);
            AbstractC3930n3.this.m18729a(InterfaceC3807hi.i.TIMEOUT_EVENT, "");
            AbstractC3930n3.this.f15453m.mo18300a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18764a();
            return Unit.INSTANCE;
        }
    }

    public AbstractC3930n3(Context context, String location, EnumC3709dc adUnitMType, String adTypeTraitsName, InterfaceC3945ni uiPoster, C4001q8 fileCache, C3746f3 c3746f3, C3861k3 c3861k3, Mediation mediation, String str, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3971p0 adUnitRendererCallback, InterfaceC3856jl webViewTimeoutInterface, InterfaceC3911m7 eventTracker, Function2 impressionTrackerRequestFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnitMType, "adUnitMType");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(impressionTrackerRequestFactory, "impressionTrackerRequestFactory");
        this.f15441a = context;
        this.f15442b = location;
        this.f15443c = adUnitMType;
        this.f15444d = adTypeTraitsName;
        this.f15445e = uiPoster;
        this.f15446f = fileCache;
        this.f15447g = c3746f3;
        this.f15448h = c3861k3;
        this.f15449i = mediation;
        this.f15450j = str;
        this.f15451k = openMeasurementImpressionCallback;
        this.f15452l = adUnitRendererCallback;
        this.f15453m = webViewTimeoutInterface;
        this.f15454n = eventTracker;
        this.f15455o = impressionTrackerRequestFactory;
        this.f15433G = true;
        this.f15434H = -1;
        this.f15435I = EnumC4029re.PLAYING;
        this.f15440N = new c();
    }

    public /* synthetic */ AbstractC3930n3(Context context, String str, EnumC3709dc enumC3709dc, String str2, InterfaceC3945ni interfaceC3945ni, C4001q8 c4001q8, C3746f3 c3746f3, C3861k3 c3861k3, Mediation mediation, String str3, InterfaceC3642ae interfaceC3642ae, InterfaceC3971p0 interfaceC3971p0, InterfaceC3856jl interfaceC3856jl, InterfaceC3911m7 interfaceC3911m7, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, enumC3709dc, str2, interfaceC3945ni, c4001q8, c3746f3, c3861k3, mediation, str3, interfaceC3642ae, interfaceC3971p0, interfaceC3856jl, interfaceC3911m7, (i & 16384) != 0 ? a.f15467b : function2);
    }

    /* JADX INFO: renamed from: A */
    public final CBError.Impression m18717A() {
        File file = this.f15446f.m19133a().f16132a;
        if (file == null) {
            C4048sb.m19411b("External Storage path is unavailable or media not mounted", (Throwable) null, 2, (Object) null);
            return CBError.Impression.ERROR_LOADING_WEB_VIEW;
        }
        this.f15456p = AdPayload.FILE_SCHEME + file.getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING;
        String str = this.f15450j;
        if (str == null || str.length() != 0) {
            return null;
        }
        C4048sb.m19411b("Empty template being passed in the response", (Throwable) null, 2, (Object) null);
        return CBError.Impression.ERROR_DISPLAYING_VIEW;
    }

    /* JADX INFO: renamed from: B */
    public final void m18718B() {
        this.f15445e.mo18804a(15000L, new e());
    }

    /* JADX INFO: renamed from: C */
    public final void m18719C() {
        this.f15452l.mo18584a();
        this.f15433G = true;
        this.f15434H = -1;
    }

    /* JADX INFO: renamed from: D */
    public final void m18720D() {
        this.f15439M = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Impression m18721a(ViewGroup viewGroup) {
        if (this.f15436J == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) == null) {
                return CBError.Impression.ERROR_CREATING_VIEW;
            }
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f15436J = mo16799b(context);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Impression m18722a(CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f15436J == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.f15436J = mo16799b(applicationContext);
        }
        this.f15452l.mo18586a(this.f15441a);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m18723a(int i) {
        if (i == -1) {
            return "none";
        }
        if (i != 0) {
            return i != 1 ? "error" : C11744X3.i.f26322D;
        }
        return C11744X3.i.f26320C;
    }

    /* JADX INFO: renamed from: a */
    public final String m18724a(int i, int i2, int i3, int i4) {
        String string = AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("x", Integer.valueOf(i)), AbstractC4171y2.m20012a("y", Integer.valueOf(i2)), AbstractC4171y2.m20012a("width", Integer.valueOf(i3)), AbstractC4171y2.m20012a("height", Integer.valueOf(i4))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final void m18725a(float f) {
        this.f15437K = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m18726a(float f, float f2) {
        float f3 = 4;
        float f4 = f / f3;
        float f5 = f / 2;
        float f6 = (f * 3) / f3;
        if (f2 >= f4 && f2 < f5) {
            m18730a(EnumC4012qj.QUARTILE1);
            return;
        }
        if (f2 >= f5 && f2 < f6) {
            m18730a(EnumC4012qj.MIDPOINT);
        } else if (f2 >= f6) {
            m18730a(EnumC4012qj.QUARTILE3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18727a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f15460t = displayMetrics.widthPixels;
        this.f15461u = displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: a */
    public final void m18728a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f15462v = webView.getWidth();
        this.f15463w = webView.getHeight();
    }

    /* JADX INFO: renamed from: a */
    public final void m18729a(InterfaceC3807hi interfaceC3807hi, String str) {
        if (str == null) {
            str = "no message";
        }
        track((AbstractC3738ei) new C3954o5(interfaceC3807hi, str, this.f15444d, this.f15442b, this.f15449i, null, 32, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m18730a(EnumC4012qj event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C4048sb.m19408a("sendWebViewVastOmEvent: " + event.name(), (Throwable) null, 2, (Object) null);
        if (this.f15443c != EnumC3709dc.VIDEO) {
            return;
        }
        InterfaceC3642ae interfaceC3642ae = this.f15451k;
        switch (b.f15468a[event.ordinal()]) {
            case 1:
                interfaceC3642ae.mo16822a(this.f15437K, this.f15439M);
                break;
            case 2:
                if (this.f15435I == EnumC4029re.PAUSED) {
                    interfaceC3642ae.mo16831e();
                }
                break;
            case 3:
                interfaceC3642ae.mo16820a();
                break;
            case 4:
                interfaceC3642ae.mo16827a(true);
                break;
            case 5:
                interfaceC3642ae.mo16827a(false);
                break;
            case 6:
                interfaceC3642ae.mo16825a(EnumC3804hf.FIRST);
                break;
            case 7:
                interfaceC3642ae.mo16825a(EnumC3804hf.MIDDLE);
                break;
            case 8:
                interfaceC3642ae.mo16825a(EnumC3804hf.THIRD);
                break;
            case 9:
                interfaceC3642ae.mo16830d();
                break;
            case 10:
                interfaceC3642ae.mo16829c();
                break;
            case 11:
                interfaceC3642ae.mo16821a(this.f15439M);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18731a(EnumC4029re newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f15435I = newState;
    }

    /* JADX INFO: renamed from: a */
    public final void m18732a(List verificationScriptResourceList, Integer num) {
        C3952o3 webView;
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok == null || (webView = abstractC3969ok.getWebView()) == null) {
            return;
        }
        this.f15451k.mo16824a(this.f15443c, webView, num, verificationScriptResourceList);
    }

    /* JADX INFO: renamed from: a */
    public final void m18733a(boolean z, String forceOrientationString) {
        Intrinsics.checkNotNullParameter(forceOrientationString, "forceOrientationString");
        this.f15433G = z;
        int iM18734b = m18734b(forceOrientationString);
        this.f15434H = iM18734b;
        this.f15452l.mo18585a(iM18734b, z);
    }

    /* JADX INFO: renamed from: b */
    public final int m18734b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, C11744X3.i.f26322D)) {
            return 1;
        }
        return Intrinsics.areEqual(name, C11744X3.i.f26320C) ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC3969ok mo16799b(Context context);

    /* JADX INFO: renamed from: b */
    public final void m18735b(float f) {
        this.f15438L = f;
    }

    /* JADX INFO: renamed from: c */
    public final CBError.Impression m18736c(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m18729a(InterfaceC3807hi.i.WEBVIEW_ERROR, error);
        C4048sb.m19411b(error, (Throwable) null, 2, (Object) null);
        this.f15459s = true;
        return CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15454n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15454n.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15454n.mo43985clearFromStorage(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m18737d(String str) {
        C3746f3 c3746f3;
        if (str == null || str.length() == 0 || (c3746f3 = this.f15447g) == null) {
            C4048sb.m19408a("###### Sending VAST Tracking Event Failed: " + str, (Throwable) null, 2, (Object) null);
        } else {
            c3746f3.m17614a((AbstractC3654b3) this.f15455o.invoke(str, this.f15454n));
            C4048sb.m19408a("###### Sending VAST Tracking Event: " + str, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18738e() {
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok == null || !this.f15459s) {
            this.f15429C = this.f15465y;
            this.f15430D = this.f15466z;
            this.f15431E = this.f15427A;
            this.f15432F = this.f15428B;
            return;
        }
        int[] iArr = new int[2];
        abstractC3969ok.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1] - this.f15464x;
        int width = abstractC3969ok.getWidth();
        int height = abstractC3969ok.getHeight();
        this.f15465y = i;
        this.f15466z = i2;
        int i3 = width + i;
        this.f15427A = i3;
        int i4 = height + i2;
        this.f15428B = i4;
        this.f15429C = i;
        this.f15430D = i2;
        this.f15431E = i3;
        this.f15432F = i4;
        C4048sb.m19408a("CalculatePosition: defaultXPos: " + i + " , currentXPos: " + i, (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public void mo17930f() {
        this.f15451k.mo16832f();
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok != null) {
            this.f15445e.mo18804a(1000L, new d(abstractC3969ok));
        }
        this.f15436J = null;
    }

    /* JADX INFO: renamed from: g */
    public final String m18739g() {
        return this.f15444d;
    }

    /* JADX INFO: renamed from: h */
    public final String m18740h() {
        return this.f15456p;
    }

    /* JADX INFO: renamed from: i */
    public final String m18741i() {
        m18738e();
        return m18724a(this.f15429C, this.f15430D, this.f15431E, this.f15432F);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC4064t5 m18742j() {
        return this.f15440N;
    }

    /* JADX INFO: renamed from: k */
    public final String m18743k() {
        m18738e();
        return m18724a(this.f15465y, this.f15466z, this.f15427A, this.f15428B);
    }

    /* JADX INFO: renamed from: l */
    public final String m18744l() {
        return this.f15442b;
    }

    /* JADX INFO: renamed from: m */
    public final String m18745m() {
        String string = AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("width", Integer.valueOf(this.f15462v)), AbstractC4171y2.m20012a("height", Integer.valueOf(this.f15463w))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3642ae m18746n() {
        return this.f15451k;
    }

    /* JADX INFO: renamed from: o */
    public final String m18747o() {
        String string = AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("allowOrientationChange", Boolean.valueOf(this.f15433G)), AbstractC4171y2.m20012a("forceOrientation", m18723a(this.f15434H))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: p */
    public final String m18748p() {
        String string = AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("width", Integer.valueOf(this.f15460t)), AbstractC4171y2.m20012a("height", Integer.valueOf(this.f15461u))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15454n.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15454n.mo43986persist(event);
    }

    /* JADX INFO: renamed from: q */
    public final C3861k3 m18749q() {
        return this.f15448h;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3945ni m18750r() {
        return this.f15445e;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15454n.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15454n.mo43987refresh(config);
    }

    /* JADX INFO: renamed from: s */
    public final float m18751s() {
        return this.f15437K;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15454n.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15454n.mo43988store(ad);
    }

    /* JADX INFO: renamed from: t */
    public final float m18752t() {
        return this.f15438L;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15454n.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15454n.mo43989track(event);
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC3969ok m18753u() {
        return this.f15436J;
    }

    /* JADX INFO: renamed from: v */
    public final void m18754v() {
        this.f15439M = 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo16800w();

    /* JADX INFO: renamed from: x */
    public void mo18755x() {
        C3952o3 webView;
        Context context;
        this.f15459s = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f15458r = jCurrentTimeMillis;
        C4048sb.m19408a("Total web view load response time " + ((jCurrentTimeMillis - this.f15457q) / ((long) 1000)), (Throwable) null, 2, (Object) null);
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok != null && (context = abstractC3969ok.getContext()) != null) {
            m18727a(context);
        }
        AbstractC3969ok abstractC3969ok2 = this.f15436J;
        if (abstractC3969ok2 == null || (webView = abstractC3969ok2.getWebView()) == null) {
            return;
        }
        m18728a((WebView) webView);
        m18738e();
    }

    /* JADX INFO: renamed from: y */
    public void mo17932y() {
        C3952o3 webView;
        C3861k3 c3861k3;
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok == null || (webView = abstractC3969ok.getWebView()) == null || (c3861k3 = this.f15448h) == null) {
            return;
        }
        c3861k3.m18340a(webView, this.f15442b, this.f15444d);
        webView.onPause();
    }

    /* JADX INFO: renamed from: z */
    public void mo17933z() {
        C3952o3 webView;
        C3861k3 c3861k3;
        AbstractC3969ok abstractC3969ok = this.f15436J;
        if (abstractC3969ok == null || (webView = abstractC3969ok.getWebView()) == null || (c3861k3 = this.f15448h) == null) {
            return;
        }
        c3861k3.m18344b(webView, this.f15442b, this.f15444d);
        webView.onResume();
    }
}
