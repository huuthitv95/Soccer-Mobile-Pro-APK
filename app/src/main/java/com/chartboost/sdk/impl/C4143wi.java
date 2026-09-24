package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.clickthrough.AbstractC4225a;
import com.chartboost.sdk.internal.clickthrough.AbstractC4226b;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wi */
/* JADX INFO: loaded from: classes3.dex */
public final class C4143wi {

    /* JADX INFO: renamed from: a */
    public final C4121vi f16752a;

    /* JADX INFO: renamed from: b */
    public final List f16753b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f16754c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16755b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16756c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4055si c4055si, Continuation continuation) {
            return ((a) create(c4055si, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f16756c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20214c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16755b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4055si c4055si = (C4055si) this.f16756c;
                this.f16755b = 1;
                objM20214c = AbstractC4226b.m20214c(c4055si, null, null, null, null, this, 30, null);
                if (objM20214c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM20214c = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objM20214c);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16757b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16758c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4055si c4055si, Continuation continuation) {
            return ((b) create(c4055si, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f16758c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20204a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16757b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4055si c4055si = (C4055si) this.f16758c;
                this.f16757b = 1;
                objM20204a = AbstractC4226b.m20204a(c4055si, null, null, null, null, null, this, 62, null);
                if (objM20204a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM20204a = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objM20204a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16759b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16760c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4055si c4055si, Continuation continuation) {
            return ((c) create(c4055si, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f16760c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20206a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16759b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4055si c4055si = (C4055si) this.f16760c;
                this.f16759b = 1;
                objM20206a = AbstractC4226b.m20206a(c4055si, null, null, null, null, this, 30, null);
                if (objM20206a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM20206a = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objM20206a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16761b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16762c;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4055si c4055si, Continuation continuation) {
            return ((d) create(c4055si, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f16762c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM20211b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16761b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4055si c4055si = (C4055si) this.f16762c;
                this.f16761b = 1;
                objM20211b = AbstractC4226b.m20211b(c4055si, null, null, null, null, this, 30, null);
                if (objM20211b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM20211b = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objM20211b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$e */
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16763b;

        /* JADX INFO: renamed from: c */
        public Object f16764c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f16765d;

        /* JADX INFO: renamed from: f */
        public int f16767f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16765d = obj;
            this.f16767f |= Integer.MIN_VALUE;
            Object objM19818a = C4143wi.this.m19818a((Function2) null, (C4055si) null, (InterfaceC3908m4) null, this);
            return objM19818a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19818a : Result.m44945boximpl(objM19818a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$f */
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16768b;

        /* JADX INFO: renamed from: c */
        public Object f16769c;

        /* JADX INFO: renamed from: d */
        public Object f16770d;

        /* JADX INFO: renamed from: e */
        public Object f16771e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f16772f;

        /* JADX INFO: renamed from: h */
        public int f16774h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16772f = obj;
            this.f16774h |= Integer.MIN_VALUE;
            return C4143wi.this.m19816a((C4055si) null, (InterfaceC3908m4) null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wi$g */
    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16775b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f16777d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC3908m4 f16778e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ EnumC3816i4 f16779f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f16780g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC3908m4 interfaceC3908m4, EnumC3816i4 enumC3816i4, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f16777d = str;
            this.f16778e = interfaceC3908m4;
            this.f16779f = enumC3816i4;
            this.f16780g = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4143wi.this.new g(this.f16777d, this.f16778e, this.f16779f, this.f16780g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16775b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4143wi c4143wi = C4143wi.this;
                Object objM19817a = c4143wi.m19817a(C4121vi.m19712a(c4143wi.f16752a, this.f16777d, 0, 2, null), this.f16777d, this.f16778e);
                String strM19719a = this.f16777d;
                Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM19817a);
                if (thM44949exceptionOrNullimpl == null) {
                    strM19719a = (String) objM19817a;
                } else if (thM44949exceptionOrNullimpl instanceof C4121vi.b.e) {
                    strM19719a = ((C4121vi.b.e) thM44949exceptionOrNullimpl).m19719a();
                }
                C4055si c4055si = new C4055si(strM19719a, this.f16779f, this.f16780g);
                C4143wi c4143wi2 = C4143wi.this;
                InterfaceC3908m4 interfaceC3908m4 = this.f16778e;
                this.f16775b = 1;
                if (c4143wi2.m19816a(c4055si, interfaceC3908m4, this) == coroutine_suspended) {
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

    public C4143wi(C4121vi urlRedirect, List actions, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(urlRedirect, "urlRedirect");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f16752a = urlRedirect;
        this.f16753b = actions;
        this.f16754c = ioDispatcher;
    }

    public /* synthetic */ C4143wi(C4121vi c4121vi, List list, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4121vi, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new Function2[]{new a(null), new b(null), new c(null), new d(null)}) : list, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Click m19815a(String str, EnumC3816i4 clkp, InterfaceC3908m4 clickTracking, boolean z) {
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        C4048sb.m19408a("Resolving url: " + str + ", clickPreference: " + clkp + ", userGesture: " + z, (Throwable) null, 2, (Object) null);
        if (str != null && str.length() != 0) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f16754c), null, null, new g(str, clickTracking, clkp, z, null), 3, null);
            return null;
        }
        CBError.Click click = CBError.Click.URI_INVALID;
        C4048sb.m19417e("Url is null or empty.", null, 2, null);
        return click;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[LOOP:0: B:15:0x0064->B:19:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x008b A[EDGE_INSN: B:23:0x008b->B:24:0x008f BREAK  A[LOOP:0: B:15:0x0064->B:19:0x0076]] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:24:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m19816a(com.chartboost.sdk.impl.C4055si r9, com.chartboost.sdk.impl.InterfaceC3908m4 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.chartboost.sdk.impl.C4143wi.f
            if (r0 == 0) goto L13
            r0 = r11
            com.chartboost.sdk.impl.wi$f r0 = (com.chartboost.sdk.impl.C4143wi.f) r0
            int r1 = r0.f16774h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16774h = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.wi$f r0 = new com.chartboost.sdk.impl.wi$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f16772f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16774h
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r9 = r0.f16771e
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.f16770d
            com.chartboost.sdk.impl.m4 r10 = (com.chartboost.sdk.impl.InterfaceC3908m4) r10
            java.lang.Object r2 = r0.f16769c
            com.chartboost.sdk.impl.si r2 = (com.chartboost.sdk.impl.C4055si) r2
            java.lang.Object r4 = r0.f16768b
            com.chartboost.sdk.impl.wi r4 = (com.chartboost.sdk.impl.C4143wi) r4
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            goto L8f
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L47:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r11 = r8.f16753b
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m44946constructorimpl(r2)
            java.util.Iterator r11 = r11.iterator()
            r4 = r10
            r10 = r9
            r9 = r11
            r11 = r4
            r4 = r8
        L64:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r9.next()
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Throwable r6 = kotlin.Result.m44949exceptionOrNullimpl(r2)
            if (r6 != 0) goto L7a
            r5 = r2
            com.chartboost.sdk.impl.ri r5 = (com.chartboost.sdk.impl.C4033ri) r5
            goto L64
        L7a:
            r0.f16768b = r4
            r0.f16769c = r10
            r0.f16770d = r11
            r0.f16771e = r9
            r0.f16774h = r3
            java.lang.Object r2 = r4.m19818a(r5, r10, r11, r0)
            if (r2 != r1) goto L8b
            return r1
        L8b:
            r7 = r2
            r2 = r10
            r10 = r11
            r11 = r7
        L8f:
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
            goto L64
        L94:
            java.lang.Throwable r9 = kotlin.Result.m44949exceptionOrNullimpl(r2)
            if (r9 == 0) goto Lc4
            java.lang.String r9 = r10.m19439b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "None of the actions was able to process URL "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.mo18631b(r9)
            java.lang.String r9 = r10.m19439b()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 2
            r11 = 0
            com.chartboost.sdk.impl.C4048sb.m19411b(r9, r11, r10, r11)
        Lc4:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4143wi.m19816a(com.chartboost.sdk.impl.si, com.chartboost.sdk.impl.m4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final Object m19817a(Object obj, String str, InterfaceC3908m4 interfaceC3908m4) {
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(obj);
        if (thM44949exceptionOrNullimpl != null) {
            interfaceC3908m4.mo18631b("Redirection failed for " + str + ": " + thM44949exceptionOrNullimpl);
            C4048sb.m19417e("Redirection failed for " + str + ": " + thM44949exceptionOrNullimpl, null, 2, null);
            return obj;
        }
        String str2 = (String) obj;
        interfaceC3908m4.mo18630a("Redirection successful from " + str + " to " + str2);
        C4048sb.m19408a("Redirection successful from " + str + " to " + str2, (Throwable) null, 2, (Object) null);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19818a(Function2 function2, C4055si c4055si, InterfaceC3908m4 interfaceC3908m4, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f16767f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f16767f = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objInvoke = eVar.f16765d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f16767f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            eVar.f16763b = c4055si;
            eVar.f16764c = interfaceC3908m4;
            eVar.f16767f = 1;
            objInvoke = function2.invoke(c4055si, eVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3908m4 = (InterfaceC3908m4) eVar.f16764c;
            c4055si = (C4055si) eVar.f16763b;
            ResultKt.throwOnFailure(objInvoke);
        }
        Object value = ((Result) objInvoke).getValue();
        if (Result.m44953isSuccessimpl(value)) {
            C4033ri c4033ri = (C4033ri) value;
            interfaceC3908m4.mo18630a("Url " + c4055si.m19439b() + " opened with action " + c4033ri.m19360a());
            C4048sb.m19408a("Url " + c4055si.m19439b() + " opened with action " + c4033ri.m19360a(), (Throwable) null, 2, (Object) null);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(value);
        if (thM44949exceptionOrNullimpl != null && !(thM44949exceptionOrNullimpl instanceof AbstractC4225a)) {
            interfaceC3908m4.mo18631b("Url " + c4055si.m19439b() + " opening failed with error " + thM44949exceptionOrNullimpl);
            C4048sb.m19411b("Url " + c4055si.m19439b() + " opening failed with error " + thM44949exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
        }
        return value;
    }
}
