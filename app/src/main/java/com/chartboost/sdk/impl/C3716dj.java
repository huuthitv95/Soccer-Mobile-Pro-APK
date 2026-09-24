package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.C11744X3;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3716dj extends AbstractC3860k2 implements InterfaceC4074tf {

    /* JADX INFO: renamed from: A */
    public static final a f13841A = new a(null);

    /* JADX INFO: renamed from: o */
    public final Context f13842o;

    /* JADX INFO: renamed from: p */
    public final String f13843p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4098uh f13844q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3991pk f13845r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3917md f13846s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC3764fl f13847t;

    /* JADX INFO: renamed from: u */
    public final Mediation f13848u;

    /* JADX INFO: renamed from: v */
    public C3825id f13849v;

    /* JADX INFO: renamed from: w */
    public C4188yj f13850w;

    /* JADX INFO: renamed from: x */
    public final Lazy f13851x;

    /* JADX INFO: renamed from: y */
    public final Lazy f13852y;

    /* JADX INFO: renamed from: z */
    public final d f13853z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f13854b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4105v2 invoke() {
            return C3678c4.f13658b.mo17019a().mo19002p();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$c */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f13855b;

        /* JADX INFO: renamed from: c */
        public Object f13856c;

        /* JADX INFO: renamed from: d */
        public Object f13857d;

        /* JADX INFO: renamed from: e */
        public Object f13858e;

        /* JADX INFO: renamed from: f */
        public Object f13859f;

        /* JADX INFO: renamed from: g */
        public Object f13860g;

        /* JADX INFO: renamed from: h */
        public Object f13861h;

        /* JADX INFO: renamed from: i */
        public Object f13862i;

        /* JADX INFO: renamed from: j */
        public Object f13863j;

        /* JADX INFO: renamed from: k */
        public Object f13864k;

        /* JADX INFO: renamed from: l */
        public Object f13865l;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f13866m;

        /* JADX INFO: renamed from: o */
        public int f13868o;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13866m = obj;
            this.f13868o |= Integer.MIN_VALUE;
            return C3716dj.this.m17312a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$d */
    public static final class d implements InterfaceC4175y6 {
        public d() {
        }

        @Override // com.chartboost.sdk.impl.InterfaceC4175y6
        /* JADX INFO: renamed from: b */
        public void mo17338b(boolean z) {
            C3825id c3825idM17336z = C3716dj.this.m17336z();
            if (c3825idM17336z != null) {
                c3825idM17336z.m17978b(z);
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$e */
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f13870b;

        /* JADX INFO: renamed from: c */
        public Object f13871c;

        /* JADX INFO: renamed from: d */
        public Object f13872d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f13873e;

        /* JADX INFO: renamed from: g */
        public int f13875g;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13873e = obj;
            this.f13875g |= Integer.MIN_VALUE;
            Object objMo17313a = C3716dj.this.mo17313a((Context) null, this);
            return objMo17313a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17313a : Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dj$f */
    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final f f13876b = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3665be invoke() {
            return C3678c4.f13658b.m17030j().mo17169a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3716dj(Context context, String xml, C4008qf renderableConfig, C4168y adMarkupConfig, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, InterfaceC3991pk viewabilityComponent, InterfaceC3917md okHttpNetworkClient, EnumC4036s adFormat, InterfaceC3764fl webViewFactory, Mediation mediation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xml, "xml");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(okHttpNetworkClient, "okHttpNetworkClient");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        this.f13842o = context;
        this.f13843p = xml;
        this.f13844q = trackerComponent;
        this.f13845r = viewabilityComponent;
        this.f13846s = okHttpNetworkClient;
        this.f13847t = webViewFactory;
        this.f13848u = mediation;
        this.f13851x = LazyKt.lazy(f.f13876b);
        this.f13852y = LazyKt.lazy(b.f13854b);
        this.f13853z = new d();
    }

    /* JADX INFO: renamed from: A */
    private final C3665be m17308A() {
        return (C3665be) this.f13851x.getValue();
    }

    /* JADX INFO: renamed from: y */
    private final C4105v2 m17310y() {
        return (C4105v2) this.f13852y.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final C4188yj m17311B() {
        return this.f13850w;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0437  */
    /* JADX WARN: Code duplicated, block: B:144:0x0510  */
    /* JADX WARN: Code duplicated, block: B:145:0x051b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m17312a(Context context, C3739ej c3739ej, Continuation continuation) throws Throwable {
        c cVar;
        List arrayList;
        List arrayList2;
        List arrayList3;
        EnumC3895le enumC3895le;
        C4085u4 c4085u4M19748a;
        C3640ac c3640acM17074a;
        String strM16816d;
        Object objM17543c;
        URL url;
        C3716dj c3716dj;
        C3739ej c3739ej2;
        Context context2;
        C4047sa c4047saM16994a;
        List<AbstractC3863k5> listM19402b;
        String strM17870a;
        URL url2;
        C3718dl c3718dl;
        String lowerCase;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f13868o;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f13868o = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f13866m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f13868o;
        boolean z = true;
        AbstractC3986pf c4024r9 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList3 = new ArrayList();
            for (AbstractC3673c abstractC3673c : c3739ej.m17590a()) {
                AbstractC3673c.a aVar = abstractC3673c instanceof AbstractC3673c.a ? (AbstractC3673c.a) abstractC3673c : null;
                if (aVar != null && (c4047saM16994a = aVar.m16994a()) != null && (listM19402b = c4047saM16994a.m19402b()) != null) {
                    for (AbstractC3863k5 abstractC3863k5 : listM19402b) {
                        if (abstractC3863k5 instanceof AbstractC3863k5.a) {
                            arrayList4.addAll(((AbstractC3863k5.a) abstractC3863k5).m18350a().m19883a());
                        } else if (abstractC3863k5 instanceof AbstractC3863k5.b) {
                            AbstractC3863k5.b bVar = (AbstractC3863k5.b) abstractC3863k5;
                            for (C3640ac c3640ac : bVar.m18351a().m18500a()) {
                                arrayList2.add(new C3640ac(c3640ac.m16815c(), c3640ac.m16817e(), c3640ac.m16814b(), c3640ac.m16813a(), c3640ac.m16816d()));
                                arrayList3.add(bVar.m18351a().m18502c());
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            C4140wf c4140wf = new C4140wf(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, null, null, 24, null);
            enumC3895le = displayMetrics.widthPixels >= displayMetrics.heightPixels ? EnumC3895le.LANDSCAPE_ONLY : EnumC3895le.PORTRAIT_ONLY;
            C3670bj c3670bjM19190o = m18336v().m19190o();
            c4085u4M19748a = (c3670bjM19190o == null || !c3670bjM19190o.m16954e()) ? null : C4129w4.f16683a.m19748a(arrayList4, c4140wf);
            c3640acM17074a = C3686cc.f13697a.m17074a(arrayList2, c4140wf);
            if (c3640acM17074a == null) {
                throw new ChartboostError.Load.VastError("No suitable MediaFile found for Linear Ad. (VAST error 403)", new C3831ij("No suitable MediaFile found for Linear Ad.", 403));
            }
            strM16816d = c3640acM17074a.m16816d();
            try {
                URL url3 = new URL(c3640acM17074a.m16816d());
                cVar.f13855b = this;
                cVar.f13856c = context;
                cVar.f13857d = c3739ej;
                cVar.f13858e = arrayList;
                cVar.f13859f = arrayList2;
                cVar.f13860g = arrayList3;
                cVar.f13861h = enumC3895le;
                cVar.f13862i = c4085u4M19748a;
                cVar.f13863j = c3640acM17074a;
                cVar.f13864k = strM16816d;
                cVar.f13865l = url3;
                cVar.f13868o = 1;
                objM17543c = AbstractC3732ec.m17543c(url3, cVar);
                if (objM17543c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                url = url3;
                c3716dj = this;
                c3739ej2 = c3739ej;
                context2 = context;
            } catch (MalformedURLException e2) {
                throw new ChartboostError.Load.InvalidAssetUrl(c3640acM17074a.m16816d(), "Invalid video URL format", e2);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            URL url4 = (URL) cVar.f13865l;
            strM16816d = (String) cVar.f13864k;
            c3640acM17074a = (C3640ac) cVar.f13863j;
            c4085u4M19748a = (C4085u4) cVar.f13862i;
            enumC3895le = (EnumC3895le) cVar.f13861h;
            arrayList3 = (List) cVar.f13860g;
            arrayList2 = (List) cVar.f13859f;
            arrayList = (List) cVar.f13858e;
            C3739ej c3739ej3 = (C3739ej) cVar.f13857d;
            context2 = (Context) cVar.f13856c;
            C3716dj c3716dj2 = (C3716dj) cVar.f13855b;
            ResultKt.throwOnFailure(obj);
            url = url4;
            c3716dj = c3716dj2;
            objM17543c = obj;
            c3739ej2 = c3739ej3;
        }
        EnumC3895le enumC3895le2 = enumC3895le;
        List list = (List) objM17543c;
        if (list.isEmpty()) {
            ChartboostError.Load.UnsupportedCodec unsupportedCodec = new ChartboostError.Load.UnsupportedCodec("No supported codecs found for media file: " + strM16816d + " (VAST error 405)", new C3831ij("No supported codecs found for media file: " + strM16816d, 405));
            C4048sb.m19416e(C11744X3.j.f26438d + unsupportedCodec.getCode() + "] No codecs found for media file: " + strM16816d, unsupportedCodec);
            throw unsupportedCodec;
        }
        C4048sb.m19408a("Supported codecs for " + strM16816d + ": " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null), (Throwable) null, 2, (Object) null);
        int iIndexOf = arrayList2.indexOf(c3640acM17074a);
        c3716dj.f13850w = (iIndexOf == -1 || iIndexOf >= arrayList3.size()) ? null : (C4188yj) arrayList3.get(iIndexOf);
        C4110v7 c4110v7 = new C4110v7(new C4174y5(), new C4196z5(), null, 4, null);
        C4008qf c4008qfM18336v = c3716dj.m18336v();
        C4168y c4168yM18334q = c3716dj.m18334q();
        InterfaceC4153x6 interfaceC4153x6Mo18995i = C3678c4.f13658b.mo17019a().mo18995i();
        List<C3761fi> listM17591b = c3739ej2.m17591b();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM17591b, 10));
        for (C3761fi c3761fi : listM17591b) {
            arrayList5.add(new C3761fi(c3761fi.m17740a(), c3761fi.m17744e(), c3761fi.m17742c(), c3761fi.m17743d(), c3761fi.m17741b(), null, 32, null));
        }
        C3832ik c3832ik = new C3832ik(context2, url, c4008qfM18336v, c4168yM18334q, interfaceC4153x6Mo18995i, c4110v7, CollectionsKt.toSet(arrayList5), c3716dj.f13844q, c3716dj.m18337w(), c3716dj.f13845r, c3739ej2.m17592c(), c3716dj.m18333p(), c3716dj.f13848u, enumC3895le2);
        c3832ik.m19066a((InterfaceC4074tf) c3716dj);
        arrayList.add(c3832ik);
        if (c4085u4M19748a != null) {
            InterfaceC3946nj interfaceC3946njM19550a = c4085u4M19748a.m19550a();
            if (interfaceC3946njM19550a == null) {
                C4048sb.m19417e("Companion ad selected, but it has no resource content; skipping.", null, 2, null);
            } else {
                List mutableList = CollectionsKt.toMutableList((Collection) c3716dj.m18336v().m19181f());
                for (C3761fi c3761fi2 : c4085u4M19748a.m19558h()) {
                    String strM17744e = c3761fi2.m17744e();
                    if (strM17744e != null) {
                        String strM17740a = c3761fi2.m17740a();
                        if (strM17740a == null) {
                            strM17740a = "unknown";
                        }
                        mutableList.add(new C3865k7(strM17740a, "GET", strM17744e, "", null));
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                String strM19177b = c3716dj.m18336v().m19177b();
                String strM19187l = c3716dj.m18336v().m19187l();
                Map mapM19182g = c3716dj.m18336v().m19182g();
                long jM19178c = c3716dj.m18336v().m19178c();
                C3670bj c3670bjM19190o2 = c3716dj.m18336v().m19190o();
                C3840j5 c3840j5M16951b = c3670bjM19190o2 != null ? c3670bjM19190o2.m16951b() : null;
                C3670bj c3670bjM19190o3 = c3716dj.m18336v().m19190o();
                C4177y8 c4177y8M19185j = c3716dj.m18336v().m19185j();
                int iM19186k = c3716dj.m18336v().m19186k();
                boolean zM19180e = c3716dj.m18336v().m19180e();
                C3670bj c3670bjM19190o4 = c3716dj.m18336v().m19190o();
                C4008qf c4008qf = new C4008qf(strM19177b, strM19187l, mapM19182g, jM19178c, c3840j5M16951b, mutableList, c3670bjM19190o3, c4177y8M19185j, iM19186k, zM19180e, false, c3670bjM19190o4 != null ? c3670bjM19190o4.m16953d() : true, null, null, null, 29696, null);
                if (interfaceC3946njM19550a instanceof C3637a9) {
                    strM17870a = ((C3637a9) interfaceC3946njM19550a).m16809a();
                } else if (interfaceC3946njM19550a instanceof C3798h9) {
                    strM17870a = ((C3798h9) interfaceC3946njM19550a).m17870a();
                } else if (interfaceC3946njM19550a instanceof C3691ch) {
                    C3691ch c3691ch = (C3691ch) interfaceC3946njM19550a;
                    String strM17196b = c3691ch.m17196b();
                    if (Intrinsics.areEqual("application/x-javascript", c3691ch.m17195a()) && strM17196b != null && StringsKt.endsWith$default(strM17196b, ".js", false, 2, (Object) null)) {
                        strM17870a = strM17196b;
                    } else {
                        strM17870a = strM17196b;
                    }
                    if (strM17870a != null || StringsKt.isBlank(strM17870a)) {
                        C4048sb.m19417e("Companion resource content string is null or blank; skipping.", null, 2, null);
                    } else {
                        if (z) {
                            c3718dl = new C3718dl(StringsKt.trimIndent("\n                    <!DOCTYPE html>\n                    <html style=\"width: 100%; height: 100%; margin: 0; padding: 0;\">\n                    <head>\n                        <meta charset=\"UTF-8\">\n                        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                        <style>\n                            /* Basic CSS Reset & Full-Screen Setup */\n                            html, body {\n                                width: 100%;\n                                height: 100%;\n                                margin: 0;\n                                padding: 0;\n                                overflow: hidden; /* Prevent unexpected scrollbars */\n                                box-sizing: border-box; /* Use border-box sizing globally */\n                                background-color: transparent; /* Start transparent */\n                            }\n                            /* Ensure all elements inherit border-box */\n                            *, *:before, *:after {\n                                box-sizing: inherit;\n                            }\n                        </style>\n                    </head>\n                    <body style=\"position: relative;\">\n                        <script id=\"vast-companion-script\" src=\"" + strM17870a + "\" defer crossorigin=\"anonymous\"></script>\n                        </body>\n                    </html>\n                    "), null, EnumC4049sc.INTERSTITIAL, c4085u4M19748a, c3716dj.f13847t, c4008qf, c3716dj.m18334q(), c3716dj.f13844q, c3716dj.m18337w(), c3716dj.m18333p(), c3716dj.f13845r, c3739ej2.m17592c(), c3716dj.f13848u, null, 8194, null);
                        } else {
                            C4085u4 c4085u4 = c4085u4M19748a;
                            try {
                                url2 = new URL(strM17870a);
                            } catch (MalformedURLException unused) {
                                C4048sb.m19408a("Companion content failed URL parsing. Assuming it's an HTML snippet or invalid. Content: \"" + strM17870a + "\"", (Throwable) null, 2, (Object) null);
                                url2 = null;
                            }
                            if (url2 != null) {
                                String path = url2.getPath();
                                if (path != null) {
                                    Intrinsics.checkNotNull(path);
                                    lowerCase = path.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                    if (lowerCase == null) {
                                        lowerCase = "";
                                    }
                                } else {
                                    lowerCase = "";
                                }
                                if (StringsKt.endsWith$default(lowerCase, ".png", false, 2, (Object) null) || StringsKt.endsWith$default(lowerCase, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(lowerCase, ".jpeg", false, 2, (Object) null) || StringsKt.endsWith$default(lowerCase, ".gif", false, 2, (Object) null) || StringsKt.endsWith$default(lowerCase, ".webp", false, 2, (Object) null)) {
                                    c4024r9 = new C4024r9(context2, url2, c4085u4, c4008qf, c3716dj.m18334q(), c3716dj.f13846s, c3716dj.f13844q, c3716dj.m18337w(), c3716dj.m18333p(), c3716dj.f13848u);
                                } else {
                                    c3718dl = new C3718dl(null, url2, EnumC4049sc.INTERSTITIAL, c4085u4, c3716dj.f13847t, c4008qf, c3716dj.m18334q(), c3716dj.f13844q, c3716dj.m18337w(), c3716dj.m18333p(), c3716dj.f13845r, c3739ej2.m17592c(), c3716dj.f13848u, null, 8193, null);
                                }
                            } else if (new Regex("<\\s*(html|body|div|p|a|img|iframe|script|style)\\b", RegexOption.IGNORE_CASE).containsMatchIn(strM17870a)) {
                                c3718dl = new C3718dl(strM17870a, null, EnumC4049sc.INTERSTITIAL, c4085u4, c3716dj.f13847t, c4008qf, c3716dj.m18334q(), c3716dj.f13844q, c3716dj.m18337w(), c3716dj.m18333p(), c3716dj.f13845r, c3739ej2.m17592c(), c3716dj.f13848u, null, 8194, null);
                            } else {
                                C4048sb.m19417e("Cannot determine renderable type from string content heuristics (Not URL, no common HTML tags found). Skipping content: \"" + strM17870a + "\"", null, 2, null);
                            }
                            if (c4024r9 != null) {
                                c4024r9.m19066a(c3716dj);
                                Boxing.boxBoolean(arrayList.add(c4024r9));
                            }
                        }
                        c4024r9 = c3718dl;
                        if (c4024r9 != null) {
                            c4024r9.m19066a(c3716dj);
                            Boxing.boxBoolean(arrayList.add(c4024r9));
                        }
                    }
                } else {
                    C4048sb.m19417e("Unknown VAST companion resource type encountered: " + interfaceC3946njM19550a.getClass().getSimpleName(), null, 2, null);
                    strM17870a = null;
                }
                z = false;
                if (strM17870a != null) {
                    C4048sb.m19417e("Companion resource content string is null or blank; skipping.", null, 2, null);
                } else {
                    C4048sb.m19417e("Companion resource content string is null or blank; skipping.", null, 2, null);
                }
            }
            Unit unit3 = Unit.INSTANCE;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x021b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0230  */
    /* JADX WARN: Code duplicated, block: B:111:0x0233  */
    /* JADX WARN: Code duplicated, block: B:131:0x0274  */
    /* JADX WARN: Code duplicated, block: B:133:0x027e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0281  */
    /* JADX WARN: Code duplicated, block: B:136:0x0284  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x0326  */
    /* JADX WARN: Code duplicated, block: B:156:0x0330  */
    /* JADX WARN: Code duplicated, block: B:157:0x037b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0220 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x02d0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x0330, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x037b, please report this as an issue */
    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public Object mo17313a(Context context, Continuation continuation) throws Throwable {
        e eVar;
        Object objM18521a;
        C3716dj c3716dj;
        Context context2;
        C3739ej c3739ej;
        Context context3;
        Throwable vastError;
        C3739ej c3739ej2;
        C3716dj c3716dj2;
        Object objMo17313a;
        String strM19391a;
        String simpleName;
        String message;
        int size;
        List<AbstractC3673c> listM17590a;
        int i;
        AbstractC3673c.a aVar;
        C4047sa c4047saM16994a;
        List listM19402b;
        int i2;
        C3739ej c3739ej3;
        C3716dj c3716dj3;
        Exception exc;
        Throwable unknown;
        AbstractC3673c.a aVar2;
        int size2;
        C4047sa c4047saM16994a2;
        List<AbstractC3863k5> listM19402b2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.f13875g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f13875g = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objM17312a = eVar.f13873e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = eVar.f13875g;
        int i5 = 0;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objM17312a);
            C3900lj c3900lj = new C3900lj(new C3808hj(this.f13846s), 0, 2, null);
            String str = this.f13843p;
            eVar.f13870b = this;
            eVar.f13871c = context;
            eVar.f13875g = 1;
            objM18521a = c3900lj.m18521a(str, eVar);
            if (objM18521a != coroutine_suspended) {
                c3716dj = this;
                context2 = context;
            }
            return coroutine_suspended;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3739ej2 = (C3739ej) eVar.f13871c;
                c3716dj2 = (C3716dj) eVar.f13870b;
                try {
                    ResultKt.throwOnFailure(objM17312a);
                    return ((Result) objM17312a).getValue();
                } catch (AbstractC3762fj e2) {
                    e = e2;
                    c3716dj = c3716dj2;
                    c3739ej = c3739ej2;
                    return c3716dj.m17314a(e, c3739ej);
                } catch (Exception e3) {
                    e = e3;
                    c3716dj = c3716dj2;
                    c3739ej = c3739ej2;
                    strM19391a = AbstractC4044s7.m19391a(e, 5);
                    simpleName = e.getClass().getSimpleName();
                    message = e.getMessage();
                    if (message == null) {
                        message = "<no_message>";
                    }
                    size = c3739ej.m17590a().size();
                    listM17590a = c3739ej.m17590a();
                    if (listM17590a instanceof Collection) {
                        i = 0;
                        for (AbstractC3673c abstractC3673c : listM17590a) {
                            if (abstractC3673c instanceof AbstractC3673c.a) {
                                aVar = (AbstractC3673c.a) abstractC3673c;
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                            }
                        }
                    } else {
                        i = 0;
                        while (r10.hasNext()) {
                            if (abstractC3673c instanceof AbstractC3673c.a) {
                                aVar = (AbstractC3673c.a) abstractC3673c;
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                            }
                        }
                    }
                    i2 = 0;
                    for (AbstractC3673c abstractC3673c2 : c3739ej.m17590a()) {
                        if (abstractC3673c2 instanceof AbstractC3673c.a) {
                            aVar2 = (AbstractC3673c.a) abstractC3673c2;
                        } else {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            size2 = 0;
                        } else {
                            size2 = 0;
                        }
                        i2 += size2;
                        i5 = 0;
                    }
                    if (e instanceof IOException) {
                        c3739ej3 = c3739ej;
                        c3716dj3 = c3716dj;
                        Exception exc2 = e;
                        unknown = new ChartboostError.Load.AssetUnavailable(null, "Asset unavailable during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc2);
                    } else {
                        c3739ej3 = c3739ej;
                        c3716dj3 = c3716dj;
                        exc = e;
                        if (exc instanceof SecurityException) {
                            unknown = new ChartboostError.Load.Internal("Security error during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                        } else {
                            unknown = new ChartboostError.Load.Unknown("Error during VAST renderable creation/load: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                        }
                    }
                    return c3716dj3.m17314a(unknown, c3739ej3);
                }
            }
            c3739ej = (C3739ej) eVar.f13872d;
            context3 = (Context) eVar.f13871c;
            c3716dj = (C3716dj) eVar.f13870b;
            try {
                ResultKt.throwOnFailure(objM17312a);
                try {
                    C3825id c3825id = new C3825id((List) objM17312a, c3716dj.m18334q(), null, 4, null);
                    c3825id.m19066a(c3716dj);
                    c3716dj.f13849v = c3825id;
                    eVar.f13870b = c3716dj;
                    eVar.f13871c = c3739ej;
                    eVar.f13872d = null;
                    eVar.f13875g = 3;
                    objMo17313a = c3825id.mo17313a(context3, eVar);
                    if (objMo17313a != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objMo17313a;
                } catch (AbstractC3762fj e4) {
                    e = e4;
                    c3739ej2 = c3739ej;
                    c3716dj2 = c3716dj;
                    c3716dj = c3716dj2;
                    c3739ej = c3739ej2;
                    return c3716dj.m17314a(e, c3739ej);
                } catch (Exception e5) {
                    e = e5;
                    c3739ej2 = c3739ej;
                    c3716dj2 = c3716dj;
                    c3716dj = c3716dj2;
                    c3739ej = c3739ej2;
                    strM19391a = AbstractC4044s7.m19391a(e, 5);
                    simpleName = e.getClass().getSimpleName();
                    message = e.getMessage();
                    if (message == null) {
                        message = "<no_message>";
                    }
                    size = c3739ej.m17590a().size();
                    listM17590a = c3739ej.m17590a();
                    if ((listM17590a instanceof Collection) || !listM17590a.isEmpty()) {
                        i = 0;
                        while (r10.hasNext()) {
                            if (abstractC3673c instanceof AbstractC3673c.a) {
                                aVar = (AbstractC3673c.a) abstractC3673c;
                            } else {
                                aVar = null;
                            }
                            if (aVar == null && (c4047saM16994a = aVar.m16994a()) != null && (listM19402b = c4047saM16994a.m19402b()) != null && !listM19402b.isEmpty()) {
                                Iterator it = listM19402b.iterator();
                                while (it.hasNext()) {
                                    if (((AbstractC3863k5) it.next()) instanceof AbstractC3863k5.b) {
                                        i++;
                                        if (i >= 0) {
                                            break;
                                        }
                                        CollectionsKt.throwCountOverflow();
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    i2 = 0;
                    while (r10.hasNext()) {
                        if (abstractC3673c2 instanceof AbstractC3673c.a) {
                            aVar2 = (AbstractC3673c.a) abstractC3673c2;
                        } else {
                            aVar2 = null;
                        }
                        if (aVar2 != null || (c4047saM16994a2 = aVar2.m16994a()) == null || (listM19402b2 = c4047saM16994a2.m19402b()) == null) {
                            size2 = 0;
                        } else {
                            size2 = i5;
                            for (AbstractC3863k5 abstractC3863k5 : listM19402b2) {
                                size2 += abstractC3863k5 instanceof AbstractC3863k5.a ? ((AbstractC3863k5.a) abstractC3863k5).m18350a().m19883a().size() : 0;
                            }
                        }
                        i2 += size2;
                        i5 = 0;
                    }
                    if (e instanceof IOException) {
                        c3739ej3 = c3739ej;
                        c3716dj3 = c3716dj;
                        Exception exc3 = e;
                        unknown = new ChartboostError.Load.AssetUnavailable(null, "Asset unavailable during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc3);
                    } else {
                        c3739ej3 = c3739ej;
                        c3716dj3 = c3716dj;
                        exc = e;
                        if (exc instanceof SecurityException) {
                            unknown = new ChartboostError.Load.Internal("Security error during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                        } else {
                            unknown = new ChartboostError.Load.Unknown("Error during VAST renderable creation/load: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                        }
                    }
                    return c3716dj3.m17314a(unknown, c3739ej3);
                }
            } catch (AbstractC3762fj e6) {
                e = e6;
                return c3716dj.m17314a(e, c3739ej);
            } catch (Exception e7) {
                e = e7;
                strM19391a = AbstractC4044s7.m19391a(e, 5);
                simpleName = e.getClass().getSimpleName();
                message = e.getMessage();
                if (message == null) {
                    message = "<no_message>";
                }
                size = c3739ej.m17590a().size();
                listM17590a = c3739ej.m17590a();
                if (listM17590a instanceof Collection) {
                    i = 0;
                    while (r10.hasNext()) {
                        if (abstractC3673c instanceof AbstractC3673c.a) {
                            aVar = (AbstractC3673c.a) abstractC3673c;
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                        }
                    }
                } else {
                    i = 0;
                    while (r10.hasNext()) {
                        if (abstractC3673c instanceof AbstractC3673c.a) {
                            aVar = (AbstractC3673c.a) abstractC3673c;
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                        }
                    }
                }
                i2 = 0;
                while (r10.hasNext()) {
                    if (abstractC3673c2 instanceof AbstractC3673c.a) {
                        aVar2 = (AbstractC3673c.a) abstractC3673c2;
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        size2 = 0;
                    } else {
                        size2 = 0;
                    }
                    i2 += size2;
                    i5 = 0;
                }
                if (e instanceof IOException) {
                    c3739ej3 = c3739ej;
                    c3716dj3 = c3716dj;
                    Exception exc4 = e;
                    unknown = new ChartboostError.Load.AssetUnavailable(null, "Asset unavailable during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc4);
                } else {
                    c3739ej3 = c3739ej;
                    c3716dj3 = c3716dj;
                    exc = e;
                    if (exc instanceof SecurityException) {
                        unknown = new ChartboostError.Load.Internal("Security error during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                    } else {
                        unknown = new ChartboostError.Load.Unknown("Error during VAST renderable creation/load: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                    }
                }
                return c3716dj3.m17314a(unknown, c3739ej3);
            }
        }
        context2 = (Context) eVar.f13871c;
        c3716dj = (C3716dj) eVar.f13870b;
        ResultKt.throwOnFailure(objM17312a);
        objM18521a = ((Result) objM17312a).getValue();
        if (Result.m44952isFailureimpl(objM18521a)) {
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM18521a);
            if (thM44949exceptionOrNullimpl == null) {
                thM44949exceptionOrNullimpl = new IllegalStateException("Unknown VAST parsing error");
            }
            if (thM44949exceptionOrNullimpl instanceof C3877kj) {
                vastError = ChartboostError.Load.NoAd.INSTANCE;
            } else if (thM44949exceptionOrNullimpl instanceof C3823ib) {
                vastError = new ChartboostError.Load.InvalidAdm(thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl);
            } else if (thM44949exceptionOrNullimpl instanceof C3785gj) {
                vastError = new ChartboostError.Load.AssetUnavailable(null, thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl);
            } else if (thM44949exceptionOrNullimpl instanceof C4202zb) {
                vastError = new ChartboostError.Load.InvalidResponse(thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl);
            } else {
                vastError = thM44949exceptionOrNullimpl instanceof AbstractC3762fj ? new ChartboostError.Load.VastError(thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl) : new ChartboostError.Load.Unknown(thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl);
            }
            if (thM44949exceptionOrNullimpl instanceof AbstractC3762fj) {
                AbstractC3762fj abstractC3762fj = (AbstractC3762fj) thM44949exceptionOrNullimpl;
                if (abstractC3762fj.m17745a() != null) {
                    c3716dj.m17317a(abstractC3762fj.m17745a().intValue());
                }
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(vastError));
        }
        ResultKt.throwOnFailure(objM18521a);
        C3739ej c3739ej4 = (C3739ej) objM18521a;
        if (c3739ej4.m17590a().isEmpty()) {
            C3877kj c3877kj = new C3877kj("VAST response contained no ads.", 303);
            List listM17591b = c3739ej4.m17591b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM17591b) {
                C3761fi c3761fi = (C3761fi) obj;
                if (Intrinsics.areEqual(c3761fi.m17740a(), "error") && Intrinsics.areEqual(c3761fi.m17741b().get("VAST_ERROR_CODE"), Boxing.boxInt(303))) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                c3716dj.m17314a(c3877kj, c3739ej4);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C3693cj.f13754a.m17206a(AbstractC3968oj.f.f15754b, (C3761fi) it2.next(), c3716dj.f13842o, c3716dj.m17308A(), c3716dj.m17310y());
                }
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Load.NoAd.INSTANCE));
        }
        try {
            eVar.f13870b = c3716dj;
            eVar.f13871c = context2;
            eVar.f13872d = c3739ej4;
            eVar.f13875g = 2;
            objM17312a = c3716dj.m17312a(context2, c3739ej4, eVar);
            if (objM17312a != coroutine_suspended) {
                context3 = context2;
                c3739ej = c3739ej4;
                C3825id c3825id2 = new C3825id((List) objM17312a, c3716dj.m18334q(), null, 4, null);
                c3825id2.m19066a(c3716dj);
                c3716dj.f13849v = c3825id2;
                eVar.f13870b = c3716dj;
                eVar.f13871c = c3739ej;
                eVar.f13872d = null;
                eVar.f13875g = 3;
                objMo17313a = c3825id2.mo17313a(context3, eVar);
                if (objMo17313a != coroutine_suspended) {
                    return objMo17313a;
                }
            }
            return coroutine_suspended;
        } catch (AbstractC3762fj e8) {
            e = e8;
            c3739ej = c3739ej4;
            return c3716dj.m17314a(e, c3739ej);
        } catch (Exception e9) {
            e = e9;
            c3739ej = c3739ej4;
            strM19391a = AbstractC4044s7.m19391a(e, 5);
            simpleName = e.getClass().getSimpleName();
            message = e.getMessage();
            if (message == null) {
                message = "<no_message>";
            }
            size = c3739ej.m17590a().size();
            listM17590a = c3739ej.m17590a();
            if (listM17590a instanceof Collection) {
                i = 0;
                while (r10.hasNext()) {
                    if (abstractC3673c instanceof AbstractC3673c.a) {
                        aVar = (AbstractC3673c.a) abstractC3673c;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                    }
                }
            } else {
                i = 0;
                while (r10.hasNext()) {
                    if (abstractC3673c instanceof AbstractC3673c.a) {
                        aVar = (AbstractC3673c.a) abstractC3673c;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                    }
                }
            }
            i2 = 0;
            while (r10.hasNext()) {
                if (abstractC3673c2 instanceof AbstractC3673c.a) {
                    aVar2 = (AbstractC3673c.a) abstractC3673c2;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    size2 = 0;
                } else {
                    size2 = 0;
                }
                i2 += size2;
                i5 = 0;
            }
            if (e instanceof IOException) {
                c3739ej3 = c3739ej;
                c3716dj3 = c3716dj;
                Exception exc5 = e;
                unknown = new ChartboostError.Load.AssetUnavailable(null, "Asset unavailable during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc5);
            } else {
                c3739ej3 = c3739ej;
                c3716dj3 = c3716dj;
                exc = e;
                if (exc instanceof SecurityException) {
                    unknown = new ChartboostError.Load.Internal("Security error during VAST processing: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                } else {
                    unknown = new ChartboostError.Load.Unknown("Error during VAST renderable creation/load: " + message + " ExceptionType=" + simpleName + " AdsCount=" + size + " LinearCount=" + i + " CompanionCount=" + i2 + " Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, exc);
                }
            }
            return c3716dj3.m17314a(unknown, c3739ej3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m17314a(Throwable th, C3739ej c3739ej) {
        Collection<C3761fi> collectionEmptyList;
        List listM17591b;
        Integer numM17745a;
        AbstractC3762fj abstractC3762fj = th instanceof AbstractC3762fj ? (AbstractC3762fj) th : null;
        int iIntValue = (abstractC3762fj == null || (numM17745a = abstractC3762fj.m17745a()) == null) ? 900 : numM17745a.intValue();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown VAST error";
        }
        Throwable vastError = th instanceof ChartboostError.Load ? (ChartboostError.Load) th : new ChartboostError.Load.VastError(message, th);
        C4048sb.m19410b("VAST processing error (" + iIntValue + "): " + message, th);
        if (c3739ej == null || (listM17591b = c3739ej.m17591b()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            collectionEmptyList = new ArrayList();
            for (Object obj : listM17591b) {
                if (Intrinsics.areEqual(((C3761fi) obj).m17740a(), "error")) {
                    collectionEmptyList.add(obj);
                }
            }
        }
        if (collectionEmptyList.isEmpty()) {
            m17317a(iIntValue);
            C4048sb.m19417e("VAST error " + iIntValue + " (" + message + ") occurred, but no <Error> tracking URLs found in VAST.", null, 2, null);
        } else {
            for (C3761fi c3761fi : collectionEmptyList) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.f.f15754b, C3761fi.m17738a(c3761fi, null, null, 0, null, MapsKt.plus(c3761fi.m17741b(), TuplesKt.m43482to("VAST_ERROR_CODE", Integer.valueOf(iIntValue))), null, 47, null), this.f13842o, m17308A(), m17310y());
            }
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(vastError));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17315a() {
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17315a();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17316a(float f2) {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17316a(f2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17317a(int i) {
        C3693cj.f13754a.m17206a(AbstractC3968oj.f.f15754b, new C3761fi("error", null, 0, null, MapsKt.mapOf(TuplesKt.m43482to("VAST_ERROR_CODE", Integer.valueOf(i))), null, 40, null), this.f13842o, m17308A(), m17310y());
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17318a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17318a(context);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17319a(EnumC3737eh reason) {
        AbstractC3860k2 abstractC3860k2M17984t;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason == EnumC3737eh.CLOSE) {
            C3825id c3825id = this.f13849v;
            if (c3825id != null) {
                c3825id.mo17319a(reason);
            }
            this.f13849v = null;
            return;
        }
        C3825id c3825id2 = this.f13849v;
        if (c3825id2 == null || (abstractC3860k2M17984t = c3825id2.m17984t()) == null) {
            return;
        }
        abstractC3860k2M17984t.mo17319a(reason);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17320a(EnumC3895le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17320a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17321a(boolean z) {
        List listEmptyList;
        Unit unit;
        InterfaceC4074tf interfaceC4074tfM19067i;
        AbstractC3860k2 abstractC3860k2M17984t;
        C4188yj c4188yj = this.f13850w;
        m18331a(c4188yj != null ? c4188yj.m20068a() : null, z);
        C4188yj c4188yj2 = this.f13850w;
        if (c4188yj2 == null || (listEmptyList = c4188yj2.m20069b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        boolean zM17617a = m18335r().m17617a(new AbstractC3724e4.d(listEmptyList), z);
        C3825id c3825id = this.f13849v;
        if (c3825id == null || (abstractC3860k2M17984t = c3825id.m17984t()) == null) {
            unit = null;
        } else {
            abstractC3860k2M17984t.mo17321a(z);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19417e("Failed to track a click for VAST because no current ad", null, 2, null);
        }
        if (!zM17617a || (interfaceC4074tfM19067i = m19067i()) == null) {
            return;
        }
        interfaceC4074tfM19067i.mo17323f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: b */
    public void mo17322b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17322b(error);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: f */
    public void mo17323f() {
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17323f();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: g */
    public long mo17324g() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            return c3825id.mo17324g();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: h */
    public boolean mo17325h() {
        C3825id c3825id = this.f13849v;
        return c3825id != null && c3825id.mo17325h();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: j */
    public float mo17326j() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            return c3825id.mo17326j();
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: k */
    public View mo17327k() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            return c3825id.mo17327k();
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: l */
    public void mo17328l() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17328l();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: m */
    public void mo17329m() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17329m();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: n */
    public void mo17330n() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17330n();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: o */
    public void mo17331o() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.mo17331o();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: s */
    public long mo17332s() {
        C3840j5 c3840j5M16951b;
        C3825id c3825id = this.f13849v;
        if (c3825id != null && c3825id.m17985u() == 0) {
            return super.mo17332s();
        }
        C3670bj c3670bjM19190o = m18336v().m19190o();
        if (c3670bjM19190o == null || (c3840j5M16951b = c3670bjM19190o.m16951b()) == null) {
            return 0L;
        }
        return c3840j5M16951b.m18186a();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: t */
    public long mo17333t() {
        C3840j5 c3840j5M16951b;
        C3825id c3825id = this.f13849v;
        if (c3825id != null && c3825id.m17985u() == 0) {
            return super.mo17333t();
        }
        C3670bj c3670bjM19190o = m18336v().m19190o();
        if (c3670bjM19190o == null || (c3840j5M16951b = c3670bjM19190o.m16951b()) == null) {
            return 0L;
        }
        return c3840j5M16951b.m18187b();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: u */
    public int mo17334u() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null && c3825id.m17985u() == 0) {
            return super.mo17334u();
        }
        C3670bj c3670bjM19190o = m18336v().m19190o();
        if (c3670bjM19190o != null) {
            return c3670bjM19190o.m16952c();
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: x */
    public void mo17335x() {
        C3825id c3825id = this.f13849v;
        if (c3825id != null) {
            c3825id.m17989y();
        }
    }

    /* JADX INFO: renamed from: z */
    public final C3825id m17336z() {
        return this.f13849v;
    }
}
