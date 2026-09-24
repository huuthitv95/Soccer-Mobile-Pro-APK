package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.C11540L6;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4105v2 {

    /* JADX INFO: renamed from: a */
    public final Context f16518a;

    /* JADX INFO: renamed from: b */
    public final C3836j1 f16519b;

    /* JADX INFO: renamed from: c */
    public final C3775g9 f16520c;

    /* JADX INFO: renamed from: d */
    public final C3768g2 f16521d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f16522e;

    /* JADX INFO: renamed from: f */
    public final Lazy f16523f;

    /* JADX INFO: renamed from: g */
    public final Lazy f16524g;

    /* JADX INFO: renamed from: h */
    public final Lazy f16525h;

    /* JADX INFO: renamed from: i */
    public volatile Job f16526i;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v2$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f16527b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v2$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16528b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4105v2.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16528b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4105v2.this.m19629b();
            C4105v2.this.f16526i = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v2$c */
    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m19638a(AppSetIdInfo appSetIdInfo) {
            C4105v2.this.m19627a(appSetIdInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19638a((AppSetIdInfo) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v2$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final d f16531b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.v2$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final e f16532b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicInteger invoke() {
            return new AtomicInteger();
        }
    }

    public C4105v2(Context context, C3836j1 android2, C3775g9 ifa, C3768g2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f16518a = context;
        this.f16519b = android2;
        this.f16520c = ifa;
        this.f16521d = base64Wrapper;
        this.f16522e = ioDispatcher;
        this.f16523f = LazyKt.lazy(d.f16531b);
        this.f16524g = LazyKt.lazy(e.f16532b);
        this.f16525h = LazyKt.lazy(a.f16527b);
        m19633f();
    }

    public /* synthetic */ C4105v2(Context context, C3836j1 c3836j1, C3775g9 c3775g9, C3768g2 c3768g2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c3836j1, c3775g9, c3768g2, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: a */
    public static final void m19624a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: a */
    public final C3958o9 m19625a(Context context) {
        try {
            C3744f1 c3744f1M17791a = this.f16520c.m17791a();
            C4048sb.m19411b("IFA: " + c3744f1M17791a, (Throwable) null, 2, (Object) null);
            String strM17600a = c3744f1M17791a.m17600a();
            EnumC3922mi enumC3922miM17601b = c3744f1M17791a.m17601b();
            String strM17792a = this.f16520c.m17792a(context, enumC3922miM17601b == EnumC3922mi.TRACKING_LIMITED);
            if (strM17600a != null) {
                strM17792a = "000000000";
            }
            String str = strM17792a;
            String str2 = Chartboost.instanceId;
            if (C3851jg.f14967a.m18286d()) {
                C3851jg.m18283b(strM17600a);
                C3851jg.m18285c(str);
            }
            return new C3958o9(enumC3922miM17601b, m19626a(strM17600a, str, str2), str, strM17600a, (String) m19631d().get(), Integer.valueOf(m19632e().get()), str2);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message != null) {
                C4048sb.m19411b(message, (Throwable) null, 2, (Object) null);
            }
            return new C3958o9(null, null, null, null, null, null, null, 127, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m19626a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            AbstractC4171y2.m20015a(jSONObject, C11540L6.f24947V0, str);
        } else if (str2 != null) {
            AbstractC4171y2.m20015a(jSONObject, "uuid", str2);
        }
        String str4 = (String) m19631d().get();
        if (str4 != null) {
            AbstractC4171y2.m20015a(jSONObject, "appsetid", str4);
        }
        if (str3 != null) {
            AbstractC4171y2.m20015a(jSONObject, "instance_id", str3);
        }
        C3768g2 c3768g2 = this.f16521d;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return c3768g2.m17752c(string);
    }

    /* JADX INFO: renamed from: a */
    public final void m19627a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            m19631d().set(appSetIdInfo.getId());
            m19632e().set(appSetIdInfo.getScope());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19628a() {
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19629b() {
        m19634g();
        m19630c().set(m19625a(this.f16518a));
    }

    /* JADX INFO: renamed from: c */
    public final AtomicReference m19630c() {
        return (AtomicReference) this.f16525h.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final AtomicReference m19631d() {
        return (AtomicReference) this.f16523f.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final AtomicInteger m19632e() {
        return (AtomicInteger) this.f16524g.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m19633f() {
        try {
            this.f16526i = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f16522e), null, null, new b(null), 3, null);
        } catch (Throwable th) {
            C4048sb.m19410b("Error launching identity job", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19634g() {
        try {
            if (!m19628a()) {
                C4048sb.m19411b("AppSetId dependency not present", (Throwable) null, 2, (Object) null);
                return;
            }
            Task taskM18134a = this.f16519b.m18134a(this.f16518a);
            if (taskM18134a != null) {
                final c cVar = new c();
                taskM18134a.addOnSuccessListener(new OnSuccessListener() { // from class: com.chartboost.sdk.impl.v2$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        C4105v2.m19624a(cVar, obj);
                    }
                });
            }
        } catch (Exception e2) {
            C4048sb.m19410b("Error requesting AppSetId", e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C3958o9 m19635h() {
        if (this.f16526i == null) {
            m19633f();
            Unit unit = Unit.INSTANCE;
        }
        C3958o9 c3958o9 = (C3958o9) m19630c().get();
        return c3958o9 == null ? m19625a(this.f16518a) : c3958o9;
    }
}
