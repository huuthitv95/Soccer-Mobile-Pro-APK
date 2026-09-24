package com.chartboost.sdk.internal.clickthrough;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.chartboost.sdk.impl.AbstractC3885l4;
import com.chartboost.sdk.impl.AbstractC4099ui;
import com.chartboost.sdk.impl.C3708db;
import com.chartboost.sdk.impl.C4033ri;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.C4055si;
import com.chartboost.sdk.impl.EnumC3816i4;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4226b {

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f17223b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f17224c;

        /* JADX INFO: renamed from: d */
        public int f17225d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17224c = obj;
            this.f17225d |= Integer.MIN_VALUE;
            Object objM20203a = AbstractC4226b.m20203a(null, null, null, null, null, null, this);
            return objM20203a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM20203a : Result.m44945boximpl(objM20203a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f17226b = new b();

        public b() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final c f17227b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$d */
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f17228b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f17229c;

        /* JADX INFO: renamed from: d */
        public int f17230d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17229c = obj;
            this.f17230d |= Integer.MIN_VALUE;
            Object objM20205a = AbstractC4226b.m20205a(null, null, null, null, null, this);
            return objM20205a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM20205a : Result.m44945boximpl(objM20205a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$e */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final e f17231b = new e();

        public e() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$f */
    public static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f17232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.f17232b = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return EmbeddedBrowserActivity.INSTANCE.m20191a(this.f17232b, url);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$g */
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f17233b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f17234c;

        /* JADX INFO: renamed from: d */
        public int f17235d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17234c = obj;
            this.f17235d |= Integer.MIN_VALUE;
            Object objM20210b = AbstractC4226b.m20210b(null, null, null, null, null, this);
            return objM20210b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM20210b : Result.m44945boximpl(objM20210b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$h */
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final h f17236b = new h();

        public h() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$i */
    public static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final i f17237b = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$j */
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f17238b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f17239c;

        /* JADX INFO: renamed from: d */
        public int f17240d;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17239c = obj;
            this.f17240d |= Integer.MIN_VALUE;
            Object objM20213c = AbstractC4226b.m20213c(null, null, null, null, null, this);
            return objM20213c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM20213c : Result.m44945boximpl(objM20213c);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$k */
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final k f17241b = new k();

        public k() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$l */
    public static final class l extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final l f17242b = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$m */
    public static final class m extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17243b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f17244c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Intent f17245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.f17244c = context;
            this.f17245d = intent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f17244c, this.f17245d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17243b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.f17244c.startActivity(AbstractC4226b.m20209b(this.f17245d));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m20202a(Context context, Intent intent, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, new m(context, intent, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m20203a(C4055si c4055si, Context context, C3708db c3708db, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) throws Throwable {
        a aVar;
        Object objM44946constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f17225d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f17225d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f17224c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f17225d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                C4048sb.m19408a("Attempting to open deep link. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
                if (!c4055si.m19440c()) {
                    throw AbstractC4225a.b.f17220b;
                }
                if (!c3708db.m17275b(c4055si.m19439b())) {
                    throw AbstractC4225a.a.f17219b;
                }
                Intent intent = (Intent) function2.invoke(function1.invoke(c4055si.m19439b()));
                aVar.f17223b = c4055si;
                aVar.f17225d = 1;
                if (m20202a(context, intent, coroutineDispatcher, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4055si = (C4055si) aVar.f17223b;
                ResultKt.throwOnFailure(obj);
            }
            C4033ri c4033ri = new C4033ri("openDeepLink");
            C4048sb.m19408a("Successfully opened deep link. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
            objM44946constructorimpl = Result.m44946constructorimpl(c4033ri);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19417e("Failed to open deep link. Url: " + c4055si.m19439b() + ", Reason: " + thM44949exceptionOrNullimpl, null, 2, null);
        }
        return objM44946constructorimpl;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m20204a(C4055si c4055si, Context context, C3708db c3708db, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = AbstractC3885l4.m18484a();
        }
        if ((i2 & 4) != 0) {
            c3708db = AbstractC3885l4.m18485b();
        }
        if ((i2 & 8) != 0) {
            function1 = b.f17226b;
        }
        if ((i2 & 16) != 0) {
            function2 = c.f17227b;
        }
        if ((i2 & 32) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        return m20203a(c4055si, context, c3708db, function1, function2, coroutineDispatcher2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m20205a(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) throws Throwable {
        d dVar;
        Object objM44946constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f17230d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f17230d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f17229c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar.f17230d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                C4048sb.m19408a("Attempting to open in embedded browser. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
                if (!c4055si.m19440c()) {
                    throw AbstractC4225a.b.f17220b;
                }
                if (!m20207a(c4055si)) {
                    throw AbstractC4225a.d.f17222b;
                }
                function1.invoke(c4055si.m19439b());
                Intent intent = (Intent) function2.invoke(AbstractC4099ui.m19604b(c4055si).m19439b());
                dVar.f17228b = c4055si;
                dVar.f17230d = 1;
                if (m20202a(context, intent, coroutineDispatcher, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4055si = (C4055si) dVar.f17228b;
                ResultKt.throwOnFailure(obj);
            }
            C4033ri c4033ri = new C4033ri("openInEmbeddedBrowser");
            C4048sb.m19408a("Successfully opened in embedded browser. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
            objM44946constructorimpl = Result.m44946constructorimpl(c4033ri);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19417e("Failed to open in embedded browser. Url: " + c4055si.m19439b() + ", Reason: " + thM44949exceptionOrNullimpl, null, 2, null);
        }
        return objM44946constructorimpl;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m20206a(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = AbstractC3885l4.m18484a();
        }
        if ((i2 & 4) != 0) {
            function1 = e.f17231b;
        }
        if ((i2 & 8) != 0) {
            function2 = new f(context);
        }
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        Function1 function3 = function2;
        return m20205a(c4055si, context, function1, function3, coroutineDispatcher, continuation);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m20207a(C4055si c4055si) {
        return c4055si.m19437a() == EnumC3816i4.CLICK_PREFERENCE_EMBEDDED;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m20208a(C4055si c4055si, Function1 function1) {
        if (c4055si != null) {
            return Intrinsics.areEqual(((Uri) function1.invoke(c4055si.m19439b())).getScheme(), ProxyConfig.MATCH_HTTP);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final Intent m20209b(Intent intent) {
        intent.setFlags(268435456);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Object m20210b(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) throws Throwable {
        g gVar;
        Object objM44946constructorimpl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f17235d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f17235d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f17234c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = gVar.f17235d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                C4048sb.m19408a("Attempting to open in native browser. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
                if (!c4055si.m19440c()) {
                    throw AbstractC4225a.b.f17220b;
                }
                if (!m20212b(c4055si)) {
                    throw AbstractC4225a.d.f17222b;
                }
                Intent intent = (Intent) function2.invoke(function1.invoke(AbstractC4099ui.m19604b(c4055si).m19439b()));
                gVar.f17233b = c4055si;
                gVar.f17235d = 1;
                if (m20202a(context, intent, coroutineDispatcher, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4055si = (C4055si) gVar.f17233b;
                ResultKt.throwOnFailure(obj);
            }
            C4033ri c4033ri = new C4033ri("openInNativeBrowser");
            C4048sb.m19408a("Successfully opened in native browser. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
            objM44946constructorimpl = Result.m44946constructorimpl(c4033ri);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19417e("Failed to open in native browser. Url: " + c4055si.m19439b() + ", Reason: " + thM44949exceptionOrNullimpl, null, 2, null);
        }
        return objM44946constructorimpl;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m20211b(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = AbstractC3885l4.m18484a();
        }
        if ((i2 & 4) != 0) {
            function1 = h.f17236b;
        }
        if ((i2 & 8) != 0) {
            function2 = i.f17237b;
        }
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        Function1 function3 = function2;
        return m20210b(c4055si, context, function1, function3, coroutineDispatcher, continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m20212b(C4055si c4055si) {
        return c4055si.m19437a() == EnumC3816i4.CLICK_PREFERENCE_NATIVE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final Object m20213c(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation) throws Throwable {
        j jVar;
        Object objM44946constructorimpl;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f17240d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f17240d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.f17239c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f17240d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                C4048sb.m19408a("Attempting to open unsecure link. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
                if (!m20208a(c4055si, function1)) {
                    throw AbstractC4225a.c.f17221b;
                }
                Intent intent = (Intent) function2.invoke(function1.invoke(c4055si.m19439b()));
                jVar.f17238b = c4055si;
                jVar.f17240d = 1;
                if (m20202a(context, intent, coroutineDispatcher, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4055si = (C4055si) jVar.f17238b;
                ResultKt.throwOnFailure(obj);
            }
            C4033ri c4033ri = new C4033ri("openUnsecureLink");
            C4048sb.m19408a("Successfully opened unsecure link. Url: " + c4055si.m19439b(), (Throwable) null, 2, (Object) null);
            objM44946constructorimpl = Result.m44946constructorimpl(c4033ri);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19417e("Failed to open unsecure link. Url: " + c4055si.m19439b() + ", Reason: " + thM44949exceptionOrNullimpl, null, 2, null);
        }
        return objM44946constructorimpl;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m20214c(C4055si c4055si, Context context, Function1 function1, Function1 function2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = AbstractC3885l4.m18484a();
        }
        if ((i2 & 4) != 0) {
            function1 = k.f17241b;
        }
        if ((i2 & 8) != 0) {
            function2 = l.f17242b;
        }
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        Function1 function3 = function2;
        return m20213c(c4055si, context, function1, function3, coroutineDispatcher, continuation);
    }
}
