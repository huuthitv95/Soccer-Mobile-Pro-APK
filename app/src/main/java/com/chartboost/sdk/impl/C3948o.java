package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948o implements InterfaceC3752f9 {

    /* JADX INFO: renamed from: n */
    public static final a f15526n = new a(null);

    /* JADX INFO: renamed from: o */
    public static final Map f15527o = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final C3834j f15528a;

    /* JADX INFO: renamed from: b */
    public final Mediation f15529b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3991pk f15530c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4098uh f15531d;

    /* JADX INFO: renamed from: e */
    public final C3829ih f15532e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4052sf f15533f;

    /* JADX INFO: renamed from: g */
    public final C3768g2 f15534g;

    /* JADX INFO: renamed from: h */
    public final CoroutineScope f15535h;

    /* JADX INFO: renamed from: i */
    public final Mutex f15536i;

    /* JADX INFO: renamed from: j */
    public c f15537j;

    /* JADX INFO: renamed from: k */
    public boolean f15538k;

    /* JADX INFO: renamed from: l */
    public Job f15539l;

    /* JADX INFO: renamed from: m */
    public final d f15540m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Map m18830a() {
            return C3948o.f15527o;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m18831a(C3768g2 base64Wrapper, String bidResponse) {
            Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
            Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(base64Wrapper.m17751b(bidResponse)).optJSONArray("seatbid");
                return jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0;
            } catch (JSONException e) {
                C4048sb.m19416e("Failed to parse bid response, routing to legacy pipeline", e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public static final a f15541a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1722768625;
            }

            public String toString() {
                return "AdClosed";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$b, reason: collision with other inner class name */
        public static final class C15481b extends b {

            /* JADX INFO: renamed from: a */
            public final EnumC3820i8 f15542a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15481b(EnumC3820i8 reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.f15542a = reason;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C15481b) && this.f15542a == ((C15481b) obj).f15542a;
            }

            public int hashCode() {
                return this.f15542a.hashCode();
            }

            public String toString() {
                return "AdExpired(reason=" + this.f15542a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a */
            public final String f15543a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String callerStackTrace) {
                super(null);
                Intrinsics.checkNotNullParameter(callerStackTrace, "callerStackTrace");
                this.f15543a = callerStackTrace;
            }

            /* JADX INFO: renamed from: a */
            public final String m18832a() {
                return this.f15543a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f15543a, ((c) obj).f15543a);
            }

            public int hashCode() {
                return this.f15543a.hashCode();
            }

            public String toString() {
                return "ClearRequested(callerStackTrace=" + this.f15543a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$d */
        public static final class d extends b {

            /* JADX INFO: renamed from: a */
            public static final d f15544a = new d();

            public d() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -812566506;
            }

            public String toString() {
                return "DestroyRequested";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$e */
        public static final class e extends b {

            /* JADX INFO: renamed from: a */
            public final Throwable f15545a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f15545a = exception;
            }

            /* JADX INFO: renamed from: a */
            public final Throwable m18833a() {
                return this.f15545a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f15545a, ((e) obj).f15545a);
            }

            public int hashCode() {
                return this.f15545a.hashCode();
            }

            public String toString() {
                return "LoadFailed(exception=" + this.f15545a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$f */
        public static final class f extends b {

            /* JADX INFO: renamed from: a */
            public final Context f15546a;

            /* JADX INFO: renamed from: b */
            public final String f15547b;

            /* JADX INFO: renamed from: c */
            public final CompletableDeferred f15548c;

            /* JADX INFO: renamed from: d */
            public final C4058t f15549d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Context context, String str, CompletableDeferred completion, C4058t adLoadConfig) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                Intrinsics.checkNotNullParameter(adLoadConfig, "adLoadConfig");
                this.f15546a = context;
                this.f15547b = str;
                this.f15548c = completion;
                this.f15549d = adLoadConfig;
            }

            /* JADX INFO: renamed from: a */
            public final C4058t m18834a() {
                return this.f15549d;
            }

            /* JADX INFO: renamed from: b */
            public final String m18835b() {
                return this.f15547b;
            }

            /* JADX INFO: renamed from: c */
            public final CompletableDeferred m18836c() {
                return this.f15548c;
            }

            /* JADX INFO: renamed from: d */
            public final Context m18837d() {
                return this.f15546a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f15546a, fVar.f15546a) && Intrinsics.areEqual(this.f15547b, fVar.f15547b) && Intrinsics.areEqual(this.f15548c, fVar.f15548c) && Intrinsics.areEqual(this.f15549d, fVar.f15549d);
            }

            public int hashCode() {
                int iHashCode = this.f15546a.hashCode() * 31;
                String str = this.f15547b;
                return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15548c.hashCode()) * 31) + this.f15549d.hashCode();
            }

            public String toString() {
                return "LoadRequested(context=" + this.f15546a + ", bidResponse=" + this.f15547b + ", completion=" + this.f15548c + ", adLoadConfig=" + this.f15549d + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$g */
        public static final class g extends b {

            /* JADX INFO: renamed from: a */
            public final C4026rb f15550a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(C4026rb loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.f15550a = loadedAd;
            }

            /* JADX INFO: renamed from: a */
            public final C4026rb m18838a() {
                return this.f15550a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f15550a, ((g) obj).f15550a);
            }

            public int hashCode() {
                return this.f15550a.hashCode();
            }

            public String toString() {
                return "LoadSucceeded(loadedAd=" + this.f15550a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$h */
        public static final class h extends b {

            /* JADX INFO: renamed from: a */
            public final Throwable f15551a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f15551a = exception;
            }

            /* JADX INFO: renamed from: a */
            public final Throwable m18839a() {
                return this.f15551a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.areEqual(this.f15551a, ((h) obj).f15551a);
            }

            public int hashCode() {
                return this.f15551a.hashCode();
            }

            public String toString() {
                return "ShowFailed(exception=" + this.f15551a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$i */
        public static final class i extends b {

            /* JADX INFO: renamed from: a */
            public final Context f15552a;

            /* JADX INFO: renamed from: b */
            public final CompletableDeferred f15553b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Context context, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f15552a = context;
                this.f15553b = completion;
            }

            /* JADX INFO: renamed from: a */
            public final CompletableDeferred m18840a() {
                return this.f15553b;
            }

            /* JADX INFO: renamed from: b */
            public final Context m18841b() {
                return this.f15552a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.areEqual(this.f15552a, iVar.f15552a) && Intrinsics.areEqual(this.f15553b, iVar.f15553b);
            }

            public int hashCode() {
                return (this.f15552a.hashCode() * 31) + this.f15553b.hashCode();
            }

            public String toString() {
                return "ShowRequested(context=" + this.f15552a + ", completion=" + this.f15553b + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$b$j */
        public static final class j extends b {

            /* JADX INFO: renamed from: a */
            public final View f15554a;

            public j(View view) {
                super(null);
                this.f15554a = view;
            }

            /* JADX INFO: renamed from: a */
            public final View m18842a() {
                return this.f15554a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.f15554a, ((j) obj).f15554a);
            }

            public int hashCode() {
                View view = this.f15554a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public String toString() {
                return "ShowSucceeded(view=" + this.f15554a + ")";
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c */
    public static abstract class c {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$a */
        public static final class a extends c {

            /* JADX INFO: renamed from: a */
            public static final a f15555a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1843455502;
            }

            public String toString() {
                return "Destroyed";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$b */
        public static final class b extends c {

            /* JADX INFO: renamed from: a */
            public final Throwable f15556a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f15556a = exception;
            }

            /* JADX INFO: renamed from: a */
            public final Throwable m18843a() {
                return this.f15556a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f15556a, ((b) obj).f15556a);
            }

            public int hashCode() {
                return this.f15556a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f15556a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$c, reason: collision with other inner class name */
        public static final class C15482c extends c {

            /* JADX INFO: renamed from: a */
            public static final C15482c f15557a = new C15482c();

            public C15482c() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C15482c)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1837959871;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$d */
        public static final class d extends c {

            /* JADX INFO: renamed from: a */
            public final C4026rb f15558a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C4026rb loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.f15558a = loadedAd;
            }

            /* JADX INFO: renamed from: a */
            public final C4026rb m18844a() {
                return this.f15558a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f15558a, ((d) obj).f15558a);
            }

            public int hashCode() {
                return this.f15558a.hashCode();
            }

            public String toString() {
                return "Loaded(loadedAd=" + this.f15558a + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$e */
        public static final class e extends c {

            /* JADX INFO: renamed from: a */
            public final String f15559a;

            /* JADX INFO: renamed from: b */
            public final CompletableDeferred f15560b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String bidResponse, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f15559a = bidResponse;
                this.f15560b = completion;
            }

            /* JADX INFO: renamed from: a */
            public final String m18845a() {
                return this.f15559a;
            }

            /* JADX INFO: renamed from: b */
            public final CompletableDeferred m18846b() {
                return this.f15560b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f15559a, eVar.f15559a) && Intrinsics.areEqual(this.f15560b, eVar.f15560b);
            }

            public int hashCode() {
                return (this.f15559a.hashCode() * 31) + this.f15560b.hashCode();
            }

            public String toString() {
                return "Loading(bidResponse=" + this.f15559a + ", completion=" + this.f15560b + ")";
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$c$f */
        /* JADX INFO: loaded from: classes9.dex */
        public static final class f extends c {

            /* JADX INFO: renamed from: a */
            public final C4026rb f15561a;

            /* JADX INFO: renamed from: b */
            public final CompletableDeferred f15562b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C4026rb adBeingShown, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(adBeingShown, "adBeingShown");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f15561a = adBeingShown;
                this.f15562b = completion;
            }

            /* JADX INFO: renamed from: a */
            public final C4026rb m18847a() {
                return this.f15561a;
            }

            /* JADX INFO: renamed from: b */
            public final CompletableDeferred m18848b() {
                return this.f15562b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f15561a, fVar.f15561a) && Intrinsics.areEqual(this.f15562b, fVar.f15562b);
            }

            public int hashCode() {
                return (this.f15561a.hashCode() * 31) + this.f15562b.hashCode();
            }

            public String toString() {
                return "Showing(adBeingShown=" + this.f15561a + ", completion=" + this.f15562b + ")";
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$d */
    public static final class d implements InterfaceC3880l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC3880l f15563a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3948o f15564b;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f15565b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3948o f15566c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3948o c3948o, Continuation continuation) {
                super(2, continuation);
                this.f15566c = c3948o;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f15566c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f15565b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C3948o c3948o = this.f15566c;
                    b.a aVar = b.a.f15541a;
                    this.f15565b = 1;
                    if (c3948o.m18815a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$d$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f15567b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3948o f15568c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ EnumC3820i8 f15569d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3948o c3948o, EnumC3820i8 enumC3820i8, Continuation continuation) {
                super(2, continuation);
                this.f15568c = c3948o;
                this.f15569d = enumC3820i8;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f15568c, this.f15569d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f15567b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C3948o c3948o = this.f15568c;
                    b.C15481b c15481b = new b.C15481b(this.f15569d);
                    this.f15567b = 1;
                    if (c3948o.m18815a(c15481b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$d$c */
        /* JADX INFO: loaded from: classes9.dex */
        public static final class c extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f15570b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3948o f15571c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C4026rb f15572d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C3948o c3948o, C4026rb c4026rb, Continuation continuation) {
                super(2, continuation);
                this.f15571c = c3948o;
                this.f15572d = c4026rb;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f15571c, this.f15572d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f15570b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f15571c.m18821a(this.f15572d, false);
                return Unit.INSTANCE;
            }
        }

        public d(InterfaceC3880l interfaceC3880l, C3948o c3948o) {
            this.f15563a = interfaceC3880l;
            this.f15564b = c3948o;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18166a() {
            this.f15563a.mo18166a();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18167a(EnumC3820i8 expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            BuildersKt__Builders_commonKt.launch$default(this.f15564b.f15535h, null, null, new b(this.f15564b, expirationReason, null), 3, null);
            this.f15563a.mo18167a(expirationReason);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18168a(EnumC3895le request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f15563a.mo18168a(request);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18169a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f15563a.mo18169a(url);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: b */
        public void mo18170b() {
            BuildersKt__Builders_commonKt.launch$default(this.f15564b.f15535h, null, null, new a(this.f15564b, null), 3, null);
            this.f15563a.mo18170b();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: c */
        public void mo18171c() {
            InterfaceC3880l.a.m18461a(this);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: d */
        public void mo18172d() {
            C4026rb c4026rbM18847a;
            if (this.f15564b.f15538k) {
                return;
            }
            this.f15563a.mo18172d();
            this.f15564b.f15538k = true;
            c cVarM18829g = this.f15564b.m18829g();
            c.f fVar = cVarM18829g instanceof c.f ? (c.f) cVarM18829g : null;
            if (fVar == null || (c4026rbM18847a = fVar.m18847a()) == null) {
                return;
            }
            C3948o c3948o = this.f15564b;
            BuildersKt__Builders_commonKt.launch$default(c3948o.f15535h, null, null, new c(c3948o, c4026rbM18847a, null), 3, null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: e */
        public void mo18173e() {
            this.f15563a.mo18173e();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15573b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f15575d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.f15575d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3948o.this.new e(this.f15575d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15573b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3948o c3948o = C3948o.this;
                b.c cVar = new b.c(this.f15575d);
                this.f15573b = 1;
                if (c3948o.m18815a(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15576b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3948o.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15576b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3948o c3948o = C3948o.this;
                b.d dVar = b.d.f15544a;
                this.f15576b = 1;
                if (c3948o.m18815a(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$g */
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15578b;

        /* JADX INFO: renamed from: c */
        public Object f15579c;

        /* JADX INFO: renamed from: d */
        public Object f15580d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f15581e;

        /* JADX INFO: renamed from: g */
        public int f15583g;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15581e = obj;
            this.f15583g |= Integer.MIN_VALUE;
            return C3948o.this.m18815a((b) null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$h */
    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15584b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ b f15586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f15586d = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3948o.this.new h(this.f15586d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15584b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3948o c3948o = C3948o.this;
                Context contextM18837d = ((b.f) this.f15586d).m18837d();
                String strM18835b = ((b.f) this.f15586d).m18835b();
                C4058t c4058tM18834a = ((b.f) this.f15586d).m18834a();
                this.f15584b = 1;
                if (c3948o.m18823b(contextM18837d, strM18835b, c4058tM18834a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$i */
    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15587b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ b f15589d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ c f15590e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b bVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f15589d = bVar;
            this.f15590e = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3948o.this.new i(this.f15589d, this.f15590e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15587b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3948o c3948o = C3948o.this;
                Context contextM18841b = ((b.i) this.f15589d).m18841b();
                C4026rb c4026rbM18844a = ((c.d) this.f15590e).m18844a();
                this.f15587b = 1;
                if (c3948o.m18814a(contextM18841b, c4026rbM18844a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$j */
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15591b;

        /* JADX INFO: renamed from: c */
        public Object f15592c;

        /* JADX INFO: renamed from: d */
        public Object f15593d;

        /* JADX INFO: renamed from: e */
        public long f15594e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f15595f;

        /* JADX INFO: renamed from: h */
        public int f15597h;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15595f = obj;
            this.f15597h |= Integer.MIN_VALUE;
            Object objMo17665a = C3948o.this.mo17665a((Context) null, (String) null, (C4058t) null, this);
            return objMo17665a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17665a : Result.m44945boximpl(objMo17665a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$k */
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15598b;

        /* JADX INFO: renamed from: c */
        public Object f15599c;

        /* JADX INFO: renamed from: d */
        public Object f15600d;

        /* JADX INFO: renamed from: e */
        public Object f15601e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f15602f;

        /* JADX INFO: renamed from: h */
        public int f15604h;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15602f = obj;
            this.f15604h |= Integer.MIN_VALUE;
            return C3948o.this.m18823b(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$l */
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15605b;

        /* JADX INFO: renamed from: c */
        public Object f15606c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f15607d;

        /* JADX INFO: renamed from: f */
        public int f15609f;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15607d = obj;
            this.f15609f |= Integer.MIN_VALUE;
            return C3948o.this.m18814a((Context) null, (C4026rb) null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$m */
    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15610b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f15611c;

        /* JADX INFO: renamed from: e */
        public int f15613e;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15611c = obj;
            this.f15613e |= Integer.MIN_VALUE;
            Object objMo17666a = C3948o.this.mo17666a((Context) null, this);
            return objMo17666a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17666a : Result.m44945boximpl(objMo17666a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o$n */
    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15614b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f15615c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3948o f15616d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i, C3948o c3948o, Continuation continuation) {
            super(2, continuation);
            this.f15615c = i;
            this.f15616d = c3948o;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f15615c, this.f15616d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r9.m18815a(r1, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f15614b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r9)
                goto L42
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L30
            L1e:
                kotlin.ResultKt.throwOnFailure(r9)
                int r9 = r8.f15615c
                long r4 = (long) r9
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
                r8.f15614b = r3
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r4, r8)
                if (r9 != r0) goto L30
                goto L41
            L30:
                com.chartboost.sdk.impl.o r9 = r8.f15616d
                com.chartboost.sdk.impl.o$b$b r1 = new com.chartboost.sdk.impl.o$b$b
                com.chartboost.sdk.impl.i8 r3 = com.chartboost.sdk.impl.EnumC3820i8.TTL_EXPIRED
                r1.<init>(r3)
                r8.f15614b = r2
                java.lang.Object r9 = r9.m18815a(r1, r8)
                if (r9 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3948o.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3948o(C3834j adConfig, Mediation mediation, InterfaceC3880l externalAdContainerListener, InterfaceC3991pk viewabilityComponent, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, InterfaceC4052sf renderableFactory, C3768g2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(externalAdContainerListener, "externalAdContainerListener");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(renderableFactory, "renderableFactory");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f15528a = adConfig;
        this.f15529b = mediation;
        this.f15530c = viewabilityComponent;
        this.f15531d = trackerComponent;
        this.f15532e = telemetryManager;
        this.f15533f = renderableFactory;
        this.f15534g = base64Wrapper;
        this.f15535h = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.f15536i = MutexKt.Mutex$default(false, 1, null);
        this.f15537j = c.C15482c.f15557a;
        this.f15540m = new d(externalAdContainerListener, this);
    }

    public /* synthetic */ C3948o(C3834j c3834j, Mediation mediation, InterfaceC3880l interfaceC3880l, InterfaceC3991pk interfaceC3991pk, InterfaceC4098uh interfaceC4098uh, C3829ih c3829ih, InterfaceC4052sf interfaceC4052sf, C3768g2 c3768g2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3834j, mediation, interfaceC3880l, interfaceC3991pk, interfaceC4098uh, c3829ih, interfaceC4052sf, (i2 & 128) != 0 ? new C3768g2() : c3768g2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ed, code lost:
    
        if (m18815a(r0, r12) == r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
    
        if (r3.m18815a(r2, r12) == r13) goto L59;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0107, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0124, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x013c, please report this as an issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18814a(android.content.Context r17, com.chartboost.sdk.impl.C4026rb r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3948o.m18814a(android.content.Context, com.chartboost.sdk.impl.rb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    public Object mo17665a(Context context, String str, C4058t c4058t, Continuation continuation) {
        j jVar;
        C3948o c3948o;
        String str2;
        CompletableDeferred completableDeferred;
        long j2;
        String str3;
        C3948o c3948o2;
        Object value;
        long jCurrentTimeMillis;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f15597h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f15597h = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objAwait = jVar.f15595f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f15597h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            b.f fVar = new b.f(context, str, completableDeferredCompletableDeferred$default, c4058t);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jVar.f15591b = this;
            jVar.f15592c = str;
            jVar.f15593d = completableDeferredCompletableDeferred$default;
            jVar.f15594e = jCurrentTimeMillis2;
            jVar.f15597h = 1;
            if (m18815a(fVar, jVar) != coroutine_suspended) {
                c3948o = this;
                str2 = str;
                completableDeferred = completableDeferredCompletableDeferred$default;
                j2 = jCurrentTimeMillis2;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            j2 = jVar.f15594e;
            completableDeferred = (CompletableDeferred) jVar.f15593d;
            str2 = (String) jVar.f15592c;
            c3948o = (C3948o) jVar.f15591b;
            ResultKt.throwOnFailure(objAwait);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = jVar.f15594e;
            str3 = (String) jVar.f15592c;
            c3948o2 = (C3948o) jVar.f15591b;
            ResultKt.throwOnFailure(objAwait);
        }
        value = ((Result) objAwait).getValue();
        jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (str3 != null) {
            c3948o2.m18822a(value, str3, jCurrentTimeMillis);
        }
        return value;
        jVar.f15591b = c3948o;
        jVar.f15592c = str2;
        jVar.f15593d = null;
        jVar.f15594e = j2;
        jVar.f15597h = 2;
        objAwait = completableDeferred.await(jVar);
        if (objAwait != coroutine_suspended) {
            str3 = str2;
            c3948o2 = c3948o;
            value = ((Result) objAwait).getValue();
            jCurrentTimeMillis = System.currentTimeMillis() - j2;
            if (str3 != null) {
                c3948o2.m18822a(value, str3, jCurrentTimeMillis);
            }
            return value;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo17666a(android.content.Context r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.chartboost.sdk.impl.C3948o.m
            if (r0 == 0) goto L13
            r0 = r8
            com.chartboost.sdk.impl.o$m r0 = (com.chartboost.sdk.impl.C3948o.m) r0
            int r1 = r0.f15613e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15613e = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.o$m r0 = new com.chartboost.sdk.impl.o$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15611c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f15613e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f15610b
            kotlinx.coroutines.CompletableDeferred r7 = (kotlinx.coroutines.CompletableDeferred) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L55
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r5, r4, r5)
            com.chartboost.sdk.impl.o$b$i r2 = new com.chartboost.sdk.impl.o$b$i
            r2.<init>(r7, r8)
            r0.f15610b = r8
            r0.f15613e = r4
            java.lang.Object r7 = r6.m18815a(r2, r0)
            if (r7 != r1) goto L54
            goto L5f
        L54:
            r7 = r8
        L55:
            r0.f15610b = r5
            r0.f15613e = r3
            java.lang.Object r8 = r7.await(r0)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.getValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3948o.mo17666a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: a */
    public final Object m18815a(b bVar, Continuation continuation) throws Throwable {
        g gVar;
        b bVar2;
        Mutex mutex;
        C3948o c3948o;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f15583g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f15583g = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f15581e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = gVar.f15583g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.f15536i;
            gVar.f15578b = this;
            bVar2 = bVar;
            gVar.f15579c = bVar2;
            gVar.f15580d = mutex2;
            gVar.f15583g = 1;
            if (mutex2.lock(null, gVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            c3948o = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) gVar.f15580d;
            bVar2 = (b) gVar.f15579c;
            c3948o = (C3948o) gVar.f15578b;
            ResultKt.throwOnFailure(obj);
        }
        try {
            c cVar = c3948o.f15537j;
            C4048sb.m19408a(Reflection.getOrCreateKotlinClass(cVar.getClass()).getSimpleName() + " --> " + Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
            if (cVar instanceof c.a) {
                C4048sb.m19408a("AdController is already destroyed. Ignoring event " + Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName() + ".", (Throwable) null, 2, (Object) null);
            } else {
                if (cVar instanceof c.C15482c) {
                    if (bVar2 instanceof b.f) {
                        String strM18835b = ((b.f) bVar2).m18835b();
                        if (strM18835b == null || StringsKt.isBlank(strM18835b)) {
                            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Bid response is null or empty", null);
                            c3948o.f15537j = new c.b(invalidAdm);
                            CompletableDeferred completableDeferredM18836c = ((b.f) bVar2).m18836c();
                            Result.Companion companion = Result.INSTANCE;
                            completableDeferredM18836c.complete(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(invalidAdm))));
                        } else {
                            c3948o.f15537j = new c.e(((b.f) bVar2).m18835b(), ((b.f) bVar2).m18836c());
                            BuildersKt__Builders_commonKt.launch$default(c3948o.f15535h, Dispatchers.getIO(), null, c3948o.new h(bVar2, null), 2, null);
                        }
                    }
                } else if (cVar instanceof c.e) {
                    if (bVar2 instanceof b.g) {
                        c3948o.f15537j = new c.d(((b.g) bVar2).m18838a());
                        c3948o.m18817a(((b.g) bVar2).m18838a().m19329a().m20003e());
                        CompletableDeferred completableDeferredM18846b = ((c.e) cVar).m18846b();
                        Result.Companion companion2 = Result.INSTANCE;
                        completableDeferredM18846b.complete(Result.m44945boximpl(Result.m44946constructorimpl(Unit.INSTANCE)));
                    } else if (bVar2 instanceof b.e) {
                        c3948o.f15537j = new c.b(((b.e) bVar2).m18833a());
                        CompletableDeferred completableDeferredM18846b2 = ((c.e) cVar).m18846b();
                        Result.Companion companion3 = Result.INSTANCE;
                        completableDeferredM18846b2.complete(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(((b.e) bVar2).m18833a()))));
                    } else if (bVar2 instanceof b.c) {
                        ChartboostError.Load.Internal internal = new ChartboostError.Load.Internal("Load operation was cancelled by clear request. AuctionId=" + c3948o.m18816a(((c.e) cVar).m18845a()) + " Thread=" + Thread.currentThread().getName() + " ClearCallerStackTrace=[" + ((b.c) bVar2).m18832a() + C11744X3.j.f26440e, new IllegalStateException("Load cancelled"));
                        C4048sb.m19410b(C11744X3.j.f26438d + internal.getCode() + "] " + internal.getConstant() + " - Load cancelled", internal);
                        CompletableDeferred completableDeferredM18846b3 = ((c.e) cVar).m18846b();
                        Result.Companion companion4 = Result.INSTANCE;
                        completableDeferredM18846b3.complete(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(internal))));
                        c3948o.m18818a(cVar, EnumC3737eh.FAILURE);
                    }
                } else if (cVar instanceof c.d) {
                    if (bVar2 instanceof b.i) {
                        c3948o.f15537j = new c.f(((c.d) cVar).m18844a(), ((b.i) bVar2).m18840a());
                        BuildersKt__Builders_commonKt.launch$default(c3948o.f15535h, null, null, c3948o.new i(bVar2, cVar, null), 3, null);
                    } else if (bVar2 instanceof b.c) {
                        c3948o.m18818a(cVar, EnumC3737eh.FAILURE);
                    } else if (bVar2 instanceof b.C15481b) {
                        c3948o.m18824b(((c.d) cVar).m18844a());
                        c3948o.m18818a(cVar, EnumC3737eh.FAILURE);
                    }
                } else if (cVar instanceof c.f) {
                    if (bVar2 instanceof b.j) {
                        CompletableDeferred completableDeferredM18848b = ((c.f) cVar).m18848b();
                        Result.Companion companion5 = Result.INSTANCE;
                        completableDeferredM18848b.complete(Result.m44945boximpl(Result.m44946constructorimpl(((b.j) bVar2).m18842a())));
                    } else if (bVar2 instanceof b.a) {
                        c3948o.m18819a(((c.f) cVar).m18847a());
                        if (c3948o.f15528a.m18083a() == EnumC4036s.REWARDED && !c3948o.f15538k) {
                            c3948o.m18821a(((c.f) cVar).m18847a(), true);
                        }
                        c3948o.f15538k = false;
                        c3948o.m18818a(cVar, EnumC3737eh.CLOSE);
                    } else if (bVar2 instanceof b.h) {
                        CompletableDeferred completableDeferredM18848b2 = ((c.f) cVar).m18848b();
                        Result.Companion companion6 = Result.INSTANCE;
                        completableDeferredM18848b2.complete(Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(((b.h) bVar2).m18839a()))));
                        c3948o.f15537j = new c.b(((b.h) bVar2).m18839a());
                    }
                } else if (!(cVar instanceof c.b)) {
                    boolean z = cVar instanceof c.a;
                }
                if (bVar2 instanceof b.d) {
                    c3948o.m18818a(cVar, cVar instanceof c.f ? EnumC3737eh.CLOSE : EnumC3737eh.FAILURE);
                }
                String simpleName = Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName();
                c cVar2 = c3948o.f15537j;
                String simpleName2 = Reflection.getOrCreateKotlinClass(cVar2.getClass()).getSimpleName();
                if ((cVar2 instanceof c.b) && (((c.b) cVar2).m18843a() instanceof ChartboostError)) {
                    Throwable thM18843a = ((c.b) cVar2).m18843a();
                    C4048sb.m19408a(simpleName + " --> " + simpleName2 + " [" + ((ChartboostError) thM18843a).getCode() + "] " + ((ChartboostError) thM18843a).getConstant(), (Throwable) null, 2, (Object) null);
                } else {
                    C4048sb.m19408a(simpleName + " --> " + simpleName2, (Throwable) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18816a(String str) {
        try {
            String strOptString = new JSONObject(this.f15534g.m17751b(str)).optString("auction_id", "");
            Intrinsics.checkNotNull(strOptString);
            return strOptString;
        } catch (IllegalArgumentException e2) {
            C4048sb.m19416e("Failed to decode bidResponse base64", e2);
            return "<base64_decode_error>";
        } catch (JSONException e3) {
            C4048sb.m19416e("Failed to extract auction_id from bidResponse", e3);
            return "<json_parse_error>";
        } catch (Exception e4) {
            C4048sb.m19416e("Unexpected error extracting auction_id", e4);
            return "<auction_id_error>";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18817a(int i2) {
        Job job = this.f15539l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f15539l = BuildersKt__Builders_commonKt.launch$default(this.f15535h, null, null, new n(i2, this, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18818a(c cVar, EnumC3737eh enumC3737eh) {
        if (this.f15537j instanceof c.a) {
            return;
        }
        if (!(cVar instanceof c.e)) {
            if (cVar instanceof c.d) {
                ((c.d) cVar).m18844a().m19331c().mo17319a(enumC3737eh);
            } else if (cVar instanceof c.f) {
                ((c.f) cVar).m18847a().m19331c().mo17319a(enumC3737eh);
            }
        }
        Job job = this.f15539l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineScopeKt.cancel$default(this.f15535h, "AdController Destroyed with reason: " + enumC3737eh, null, 2, null);
        this.f15537j = c.a.f15555a;
    }

    /* JADX INFO: renamed from: a */
    public final void m18819a(C4026rb c4026rb) {
        C3829ih c3829ih = this.f15532e;
        C3997q4 c3997q4 = new C3997q4(c4026rb.m19330b(), CollectionsKt.emptyList(), null, null, null, null, this.f15529b, 60, null);
        List listM20002d = c4026rb.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.CLOSE.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3997q4, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18820a(C4026rb ad, Throwable throwable) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ChartboostError.Show show = throwable instanceof ChartboostError.Show ? (ChartboostError.Show) throwable : null;
        C3829ih c3829ih = this.f15532e;
        C4119vg c4119vg = new C4119vg(ad.m19330b(), CollectionsKt.emptyList(), throwable.getMessage(), show != null ? show.getCode() : null, show != null ? show.getCauseDescription() : null, show != null ? show.getConstant() : null, this.f15529b);
        List listM20002d = ad.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.SHOW.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c4119vg, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18821a(C4026rb c4026rb, boolean z) {
        C3829ih c3829ih = this.f15532e;
        C3736eg c3736eg = new C3736eg(c4026rb.m19330b(), CollectionsKt.emptyList(), z, null, null, null, null, this.f15529b, 120, null);
        List listM20002d = c4026rb.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.REWARD.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3736eg, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18822a(Object obj, String bidResponse, long j2) {
        Object objM44946constructorimpl;
        String strM18816a;
        String message;
        List listEmptyList;
        C4168y c4168yM19827a;
        List listM20002d;
        C4168y c4168yM19827a2;
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(C4146x.f16788c.m19829a(new JSONObject(this.f15534g.m17751b(bidResponse))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        C4146x c4146x = (C4146x) (Result.m44952isFailureimpl(objM44946constructorimpl) ? null : objM44946constructorimpl);
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(obj);
        ChartboostError.Load load = thM44949exceptionOrNullimpl instanceof ChartboostError.Load ? (ChartboostError.Load) thM44949exceptionOrNullimpl : null;
        if (c4146x == null || (c4168yM19827a2 = c4146x.m19827a()) == null || (strM18816a = c4168yM19827a2.m20000b()) == null) {
            strM18816a = m18816a(bidResponse);
        }
        ChartboostError.Load load2 = load;
        List listEmptyList2 = CollectionsKt.emptyList();
        if (load2 == null || (message = load2.getMessage()) == null) {
            message = thM44949exceptionOrNullimpl != null ? thM44949exceptionOrNullimpl.getMessage() : null;
            if (message == null) {
                Throwable thM44949exceptionOrNullimpl2 = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                message = thM44949exceptionOrNullimpl2 != null ? thM44949exceptionOrNullimpl2.getMessage() : null;
            }
        }
        String code = load2 != null ? load2.getCode() : null;
        C3938nb c3938nb = new C3938nb(strM18816a, listEmptyList2, message, code, load2 != null ? load2.getConstant() : null, load2 != null ? load2.getCauseDescription() : null, Long.valueOf(j2), bidResponse, this.f15529b);
        if (c4146x == null || (c4168yM19827a = c4146x.m19827a()) == null || (listM20002d = c4168yM19827a.m20002d()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList<C3865k7> arrayList = new ArrayList();
            for (Object obj2 : listM20002d) {
                if (Intrinsics.areEqual(((C3865k7) obj2).m18358d(), C3865k7.b.LOAD.m18362b())) {
                    arrayList.add(obj2);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (C3865k7 c3865k7 : arrayList) {
                listEmptyList.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), null, 8, null));
            }
        }
        C3829ih.m18024a(this.f15532e, c3938nb, listEmptyList, null, 4, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    public boolean mo17667a() {
        return this.f15537j instanceof c.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x028f, code lost:
    
        if (r9.m18815a(r0, r12) == r13) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
    
        if (r9.m18815a(r0, r12) == r13) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0239, code lost:
    
        if (r9.m18815a(r2, r12) == r13) goto L105;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x01ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x01e7, please report this as an issue */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18823b(android.content.Context r24, java.lang.String r25, com.chartboost.sdk.impl.C4058t r26, kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3948o.m18823b(android.content.Context, java.lang.String, com.chartboost.sdk.impl.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: b */
    public void mo17607b() {
        BuildersKt__Builders_commonKt.launch$default(this.f15535h, null, null, new f(null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m18824b(C4026rb c4026rb) {
        C3829ih c3829ih = this.f15532e;
        C3797h8 c3797h8 = new C3797h8(c4026rb.m19330b(), CollectionsKt.emptyList(), null, null, null, null, this.f15529b, 60, null);
        List listM20002d = c4026rb.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.EXPIRATION.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3797h8, arrayList2, null, 4, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: c */
    public void mo17668c() {
        BuildersKt__Builders_commonKt.launch$default(this.f15535h, null, null, new e(AbstractC4044s7.m19389a(10), null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m18825c(C4026rb ad) {
        C3825id c3825idM19331c;
        Intrinsics.checkNotNullParameter(ad, "ad");
        C3829ih c3829ih = this.f15532e;
        C3822ia c3822ia = new C3822ia(ad.m19330b(), CollectionsKt.emptyList(), null, null, null, null, this.f15529b, 60, null);
        List listM20002d = ad.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.IMPRESSION.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c3822ia, arrayList2, null, 4, null);
        C4026rb c4026rbM18828f = m18828f();
        if (c4026rbM18828f == null || (c3825idM19331c = c4026rbM18828f.m19331c()) == null) {
            return;
        }
        c3825idM19331c.mo17331o();
    }

    /* JADX INFO: renamed from: d */
    public final void m18826d(C4026rb c4026rb) {
        C3829ih c3829ih = this.f15532e;
        C4119vg c4119vg = new C4119vg(c4026rb.m19330b(), CollectionsKt.emptyList(), null, null, null, null, this.f15529b, 56, null);
        List listM20002d = c4026rb.m19329a().m20002d();
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : listM20002d) {
            if (Intrinsics.areEqual(((C3865k7) obj).m18358d(), C3865k7.b.SHOW.m18362b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            arrayList2.add(new C4120vh(c3865k7.m18359e(), c3865k7.m18357c(), c3865k7.m18355a(), c3865k7.m18356b()));
        }
        C3829ih.m18024a(c3829ih, c4119vg, arrayList2, null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m18827e() {
        Job job = this.f15539l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C4026rb m18828f() {
        c cVar = this.f15537j;
        if (cVar instanceof c.d) {
            return ((c.d) cVar).m18844a();
        }
        if (cVar instanceof c.f) {
            return ((c.f) cVar).m18847a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final c m18829g() {
        return this.f15537j;
    }
}
