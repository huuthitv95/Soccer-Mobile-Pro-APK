package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.lj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3900lj {

    /* JADX INFO: renamed from: a */
    public final C3808hj f15235a;

    /* JADX INFO: renamed from: b */
    public final int f15236b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lj$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f15237a = new a();

        /* JADX INFO: renamed from: a */
        public final void m18522a(String str, int i, C3923mj context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<C3761fi> listM18689b = context.m18689b();
            if (!(listM18689b instanceof Collection) || !listM18689b.isEmpty()) {
                for (C3761fi c3761fi : listM18689b) {
                    if (Intrinsics.areEqual(c3761fi.m17740a(), "error") && c3761fi.m17742c() == context.m18690c() && Intrinsics.areEqual(c3761fi.m17744e(), str) && Intrinsics.areEqual(c3761fi.m17741b().get("VAST_ERROR_CODE"), Integer.valueOf(i))) {
                        return;
                    }
                }
            }
            context.m18689b().add(new C3761fi("error", str, context.m18690c(), null, MapsKt.mapOf(TuplesKt.m43482to("VAST_ERROR_CODE", Integer.valueOf(i))), null, 40, null));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lj$b */
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f15238b;

        /* JADX INFO: renamed from: d */
        public int f15240d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f15238b = obj;
            this.f15240d |= Integer.MIN_VALUE;
            Object objM18521a = C3900lj.this.m18521a(null, this);
            return objM18521a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18521a : Result.m44945boximpl(objM18521a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lj$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f15241b;

        /* JADX INFO: renamed from: c */
        public Object f15242c;

        /* JADX INFO: renamed from: d */
        public Object f15243d;

        /* JADX INFO: renamed from: e */
        public Object f15244e;

        /* JADX INFO: renamed from: f */
        public Object f15245f;

        /* JADX INFO: renamed from: g */
        public Object f15246g;

        /* JADX INFO: renamed from: h */
        public Object f15247h;

        /* JADX INFO: renamed from: i */
        public Object f15248i;

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f15249j;

        /* JADX INFO: renamed from: l */
        public int f15251l;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f15249j = obj;
            this.f15251l |= Integer.MIN_VALUE;
            Object objM18520a = C3900lj.this.m18520a(null, null, this);
            return objM18520a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18520a : Result.m44945boximpl(objM18520a);
        }
    }

    public C3900lj(C3808hj vastFetcher, int i) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        this.f15235a = vastFetcher;
        this.f15236b = i;
    }

    public /* synthetic */ C3900lj(C3808hj c3808hj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3808hj, (i2 & 2) != 0 ? 10 : i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0387 A[LOOP:8: B:99:0x0381->B:101:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x03da A[EDGE_INSN: B:106:0x03da->B:107:0x03e2 BREAK  A[LOOP:2: B:53:0x01d8->B:138:0x053d]] */
    /* JADX WARN: Code duplicated, block: B:109:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:112:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:117:0x0402  */
    /* JADX WARN: Code duplicated, block: B:120:0x0425  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x053d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x01de  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0211  */
    /* JADX WARN: Code duplicated, block: B:61:0x021a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0223  */
    /* JADX WARN: Code duplicated, block: B:66:0x022f A[LOOP:3: B:64:0x0229->B:66:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0241  */
    /* JADX WARN: Code duplicated, block: B:70:0x024a  */
    /* JADX WARN: Code duplicated, block: B:71:0x024f  */
    /* JADX WARN: Code duplicated, block: B:75:0x025d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0280  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0295 A[LOOP:4: B:78:0x028f->B:80:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0315  */
    /* JADX WARN: Code duplicated, block: B:89:0x031f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0333 A[LOOP:6: B:90:0x032d->B:92:0x0333, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x035b  */
    /* JADX WARN: Code duplicated, block: B:95:0x035f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0373  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x045a, code lost:
    
        if (r0 == r3) goto L122;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01f0, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x045a -> B:13:0x005b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18520a(java.lang.String r31, com.chartboost.sdk.impl.C3923mj r32, kotlin.coroutines.Continuation r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3900lj.m18520a(java.lang.String, com.chartboost.sdk.impl.mj, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m18521a(String str, Continuation continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f15240d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f15240d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f15238b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f15240d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        C3923mj c3923mj = new C3923mj(this.f15235a, this.f15236b, 0, null, null, 24, null);
        bVar.f15240d = 1;
        Object objM18520a = m18520a(str, c3923mj, bVar);
        return objM18520a == coroutine_suspended ? coroutine_suspended : objM18520a;
    }
}
