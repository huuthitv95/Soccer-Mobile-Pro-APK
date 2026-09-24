package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.C3613R;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.be */
/* JADX INFO: loaded from: classes3.dex */
public final class C3665be {

    /* JADX INFO: renamed from: a */
    public final Context f13566a;

    /* JADX INFO: renamed from: b */
    public final C4097ug f13567b;

    /* JADX INFO: renamed from: c */
    public final C3713dg f13568c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f13569d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f13570e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.be$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13571b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3665be.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13571b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Omid.activate(C3665be.this.f13566a);
                C4048sb.m19408a("OMSDK is initialized successfully!", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                C4048sb.m19410b("OMSDK initialization exception", e);
            }
            return Unit.INSTANCE;
        }
    }

    public C3665be(Context context, C4097ug sharedPrefsHelper, C3713dg resourcesLoader, AtomicReference sdkConfig, CoroutineDispatcher mainDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f13566a = context;
        this.f13567b = sharedPrefsHelper;
        this.f13568c = resourcesLoader;
        this.f13569d = sdkConfig;
        this.f13570e = mainDispatcher;
    }

    public /* synthetic */ C3665be(Context context, C4097ug c4097ug, C3713dg c3713dg, AtomicReference atomicReference, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c4097ug, c3713dg, atomicReference, (i & 16) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: a */
    public final String m16924a() {
        return m16925a(C3613R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
    }

    /* JADX INFO: renamed from: a */
    public final String m16925a(int i, String str) {
        try {
            String strM19600a = this.f13567b.m19600a(str);
            return strM19600a == null ? m16927a(str, i) : strM19600a;
        } catch (Exception e) {
            C4048sb.m19410b("OmidJS exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m16926a(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        if (!m16933g()) {
            C4048sb.m19411b("OMSDK injectOmidJsIntoHtml is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return html;
        }
        if (Omid.isActive()) {
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(m16924a(), html);
                Intrinsics.checkNotNull(strInjectScriptContentIntoHtml);
                return strInjectScriptContentIntoHtml;
            } catch (Exception e) {
                C4048sb.m19410b("OmidJS injection exception", e);
            }
        }
        return html;
    }

    /* JADX INFO: renamed from: a */
    public final String m16927a(String str, int i) {
        try {
            String strM17303a = this.f13568c.m17303a(i);
            if (strM17303a == null) {
                return null;
            }
            this.f13567b.m19601a(str, strM17303a);
            return strM17303a;
        } catch (Exception e) {
            C4048sb.m19410b("OmidJS resource file exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C4138wd m16928b() {
        C3920mg c3920mg = (C3920mg) this.f13569d.get();
        C4138wd c4138wdM18665d = c3920mg != null ? c3920mg.m18665d() : null;
        return c4138wdM18665d == null ? new C4138wd(false, false, 0, 0, 0L, 0, null, 127, null) : c4138wdM18665d;
    }

    /* JADX INFO: renamed from: c */
    public final Partner m16929c() {
        try {
            return Partner.createPartner(m16935i(), "9.11.1");
        } catch (Exception e) {
            C4048sb.m19410b("Omid Partner exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m16930d() {
        C4138wd c4138wdM18665d;
        List listM19788e;
        C3920mg c3920mg = (C3920mg) this.f13569d.get();
        return (c3920mg == null || (c4138wdM18665d = c3920mg.m18665d()) == null || (listM19788e = c4138wdM18665d.m19788e()) == null) ? CollectionsKt.emptyList() : listM19788e;
    }

    /* JADX INFO: renamed from: e */
    public final void m16931e() {
        if (!m16933g()) {
            C4048sb.m19408a("OMSDK initialize is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        if (m16932f()) {
            C4048sb.m19408a("OMSDK initialize is already active!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f13570e), null, null, new a(null), 3, null);
        } catch (Exception e) {
            C4048sb.m19410b("Error launching om activate job", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16932f() {
        try {
            return Omid.isActive();
        } catch (Exception e) {
            C4048sb.m19407a("OMSDK error when checking isActive", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m16933g() {
        C4138wd c4138wdM18665d;
        C3920mg c3920mg = (C3920mg) this.f13569d.get();
        if (c3920mg == null || (c4138wdM18665d = c3920mg.m18665d()) == null) {
            return false;
        }
        return c4138wdM18665d.m19790g();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16934h() {
        C4138wd c4138wdM18665d;
        C3920mg c3920mg = (C3920mg) this.f13569d.get();
        if (c3920mg == null || (c4138wdM18665d = c3920mg.m18665d()) == null) {
            return false;
        }
        return c4138wdM18665d.m19787d();
    }

    /* JADX INFO: renamed from: i */
    public final String m16935i() {
        return "Chartboost";
    }
}
