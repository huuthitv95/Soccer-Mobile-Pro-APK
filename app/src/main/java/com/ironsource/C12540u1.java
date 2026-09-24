package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12540u1 {

    /* JADX INFO: renamed from: a */
    public static final b f32509a;

    /* JADX INFO: renamed from: b */
    private static final String f32510b;

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f32511a;

        /* JADX INFO: renamed from: b */
        private final C12386n8.e f32512b;

        /* JADX INFO: renamed from: c */
        private final String f32513c;

        /* JADX INFO: renamed from: d */
        private final JSONObject f32514d;

        public a(String name, C12386n8.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f32511a = name;
            this.f32512b = productType;
            this.f32513c = demandSourceName;
            this.f32514d = params;
        }

        /* JADX INFO: renamed from: a */
        public final String m33856a() {
            return this.f32511a;
        }

        /* JADX INFO: renamed from: b */
        public final C12386n8.e m33857b() {
            return this.f32512b;
        }

        /* JADX INFO: renamed from: c */
        public final String m33858c() {
            return this.f32513c;
        }

        /* JADX INFO: renamed from: d */
        public final JSONObject m33859d() {
            return this.f32514d;
        }

        /* JADX INFO: renamed from: e */
        public final String m33860e() {
            return this.f32513c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f32511a, aVar.f32511a) && this.f32512b == aVar.f32512b && Intrinsics.areEqual(this.f32513c, aVar.f32513c) && Intrinsics.areEqual(this.f32514d.toString(), aVar.f32514d.toString());
        }

        /* JADX INFO: renamed from: f */
        public final String m33861f() {
            return this.f32511a;
        }

        /* JADX INFO: renamed from: g */
        public final JSONObject m33862g() {
            return this.f32514d;
        }

        /* JADX INFO: renamed from: h */
        public final C12386n8.e m33863h() {
            return this.f32512b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final JSONObject m33864i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.f32514d.toString()).put(C11744X3.i.f26378m, this.f32512b).put("demandSourceName", this.f32513c);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f32511a + ", productType=" + this.f32512b + ", demandSourceName=" + this.f32513c + ", params=" + this.f32514d + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m33855a(String name, C12386n8.e productType, String demandSourceName, JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m33854a(a aVar, String str, C12386n8.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32511a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.f32512b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f32513c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.f32514d;
            }
            return aVar.m33855a(str, eVar, str2, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u1$c */
    @DebugMetadata(m43503c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", m43504f = "AndroidSandboxJSHandler.kt", m43505i = {}, m43506l = {80}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        int f32515a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ MeasurementManager f32517c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Uri f32518d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ MotionEvent f32519e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f32517c = measurementManager;
            this.f32518d = uri;
            this.f32519e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12540u1.this.new c(this.f32517c, this.f32518d, this.f32519e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32515a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C12540u1 c12540u1 = C12540u1.this;
                MeasurementManager measurementManager = this.f32517c;
                Uri uri = this.f32518d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.f32519e;
                this.f32515a = 1;
                if (c12540u1.m33851a(measurementManager, uri, motionEvent, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.ironsource.u1$d */
    @DebugMetadata(m43503c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", m43504f = "AndroidSandboxJSHandler.kt", m43505i = {}, m43506l = {60}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        int f32520a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ MeasurementManager f32522c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Uri f32523d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MeasurementManager measurementManager, Uri uri, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f32522c = measurementManager;
            this.f32523d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12540u1.this.new d(this.f32522c, this.f32523d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32520a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C12540u1 c12540u1 = C12540u1.this;
                MeasurementManager measurementManager = this.f32522c;
                Uri uri = this.f32523d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.f32520a = 1;
                if (c12540u1.m33851a(measurementManager, uri, null, this) == coroutine_suspended) {
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

    static {
        b bVar = new b(null);
        f32509a = bVar;
        String name = bVar.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        f32510b = name;
    }

    /* JADX INFO: renamed from: a */
    public final a m33853a(Context context, InterfaceC12576w1 message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC12576w1.a) {
            return m33846a(context, (InterfaceC12576w1.a) message);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    private final a m33846a(Context context, InterfaceC12576w1.a aVar) {
        MeasurementManager measurementManagerM31958a = C12292l0.m31958a(context);
        if (measurementManagerM31958a == null) {
            Logger.m33642i(f32510b, "could not obtain measurement manager");
            return m33850a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC12576w1.a.b) {
                return m33849a(aVar, measurementManagerM31958a);
            }
            if (aVar instanceof InterfaceC12576w1.a.C15547a) {
                return m33847a((InterfaceC12576w1.a.C15547a) aVar, measurementManagerM31958a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return m33850a(aVar, "failed to handle attribution, message: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private final a m33849a(InterfaceC12576w1.a aVar, MeasurementManager measurementManager) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new d(measurementManager, Uri.parse(aVar.mo34001b()), null), 1, null);
        return m33848a(aVar);
    }

    /* JADX INFO: renamed from: a */
    private final a m33847a(InterfaceC12576w1.a.C15547a c15547a, MeasurementManager measurementManager) throws InterruptedException {
        Uri uri = Uri.parse(c15547a.mo34001b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        BuildersKt__BuildersKt.runBlocking$default(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c15547a.m34012n(), c15547a.m34013o().m34019c(), c15547a.m34013o().m34020d(), c15547a.m34014p()), null), 1, null);
        return m33848a(c15547a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final Object m33851a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation<? super Unit> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C12558v1.m33922a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    private final a m33848a(InterfaceC12576w1.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC12576w1.a.C15547a ? "click" : "impression"));
        String strMo33996a = aVar.mo33996a();
        C12386n8.e eVarMo33998d = aVar.mo33998d();
        String strMo33999e = aVar.mo33999e();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new a(strMo33996a, eVarMo33998d, strMo33999e, params);
    }

    /* JADX INFO: renamed from: a */
    private final a m33850a(InterfaceC12576w1 interfaceC12576w1, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC12576w1 instanceof InterfaceC12576w1.a.C15547a ? "click" : "impression");
        String strMo33997c = interfaceC12576w1.mo33997c();
        C12386n8.e eVarMo33998d = interfaceC12576w1.mo33998d();
        String strMo33999e = interfaceC12576w1.mo33999e();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strMo33997c, eVarMo33998d, strMo33999e, jSONObjectPut2);
    }
}
