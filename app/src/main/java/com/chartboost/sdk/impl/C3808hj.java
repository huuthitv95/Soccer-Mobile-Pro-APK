package com.chartboost.sdk.impl;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3808hj {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3917md f14494a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hj$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14495b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f14496c;

        /* JADX INFO: renamed from: e */
        public int f14498e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14496c = obj;
            this.f14498e |= Integer.MIN_VALUE;
            Object objM17916a = C3808hj.this.m17916a(null, this);
            return objM17916a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17916a : Result.m44945boximpl(objM17916a);
        }
    }

    public C3808hj(InterfaceC3917md networkClient) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.f14494a = networkClient;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x0056, B:27:0x005e, B:29:0x0064, B:34:0x006e, B:35:0x0073, B:36:0x0080, B:37:0x0081, B:38:0x009a), top: B:56:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x0056, B:27:0x005e, B:29:0x0064, B:34:0x006e, B:35:0x0073, B:36:0x0080, B:37:0x0081, B:38:0x009a), top: B:56:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x0056, B:27:0x005e, B:29:0x0064, B:34:0x006e, B:35:0x0073, B:36:0x0080, B:37:0x0081, B:38:0x009a), top: B:56:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x0056, B:27:0x005e, B:29:0x0064, B:34:0x006e, B:35:0x0073, B:36:0x0080, B:37:0x0081, B:38:0x009a), top: B:56:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:48:0x00b3, B:50:0x00c8, B:51:0x00c9, B:52:0x00ea), top: B:59:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:48:0x00b3, B:50:0x00c8, B:51:0x00c9, B:52:0x00ea), top: B:59:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0081, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00c9, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m17916a(String str, Continuation continuation) throws Throwable {
        a aVar;
        Throwable th;
        Object objM44946constructorimpl;
        Throwable thM44949exceptionOrNullimpl;
        C4006qd c4006qd;
        String strM19163a;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f14498e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f14498e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objM18645a = aVar2.f14496c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.f14498e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM18645a);
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC3917md interfaceC3917md = this.f14494a;
                aVar2.f14495b = str;
                aVar2.f14498e = 1;
                try {
                    objM18645a = InterfaceC3917md.a.m18645a(interfaceC3917md, str, null, aVar2, 2, null);
                    if (objM18645a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str;
                    c4006qd = (C4006qd) objM18645a;
                    if (c4006qd.m19168f()) {
                        throw new C3785gj("Failed to fetch VAST. HTTP response code: " + c4006qd.m19167e(), Boxing.boxInt(301));
                    }
                    strM19163a = c4006qd.m19163a();
                    if (strM19163a != null) {
                        if (strM19163a.length() > 0) {
                            strM19163a = null;
                        }
                        if (strM19163a != null) {
                            objM44946constructorimpl = Result.m44946constructorimpl(strM19163a);
                        }
                    }
                    throw new C3785gj("Received empty VAST response.", Boxing.boxInt(303));
                } catch (Throwable th2) {
                    th = th2;
                    str = str;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                Result.Companion companion3 = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                if (thM44949exceptionOrNullimpl == null) {
                    return objM44946constructorimpl;
                }
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    C4048sb.m19410b("Error fetching VAST from URL: " + str, thM44949exceptionOrNullimpl);
                    if (thM44949exceptionOrNullimpl instanceof C3785gj) {
                        throw thM44949exceptionOrNullimpl;
                    }
                    throw new C3785gj("Error fetching VAST from URL: " + str + ". " + thM44949exceptionOrNullimpl.getMessage(), Boxing.boxInt(301));
                } catch (Throwable th4) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(th4));
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f14495b;
            try {
                ResultKt.throwOnFailure(objM18645a);
                c4006qd = (C4006qd) objM18645a;
                if (c4006qd.m19168f()) {
                    throw new C3785gj("Failed to fetch VAST. HTTP response code: " + c4006qd.m19167e(), Boxing.boxInt(301));
                }
                strM19163a = c4006qd.m19163a();
                if (strM19163a != null) {
                    if (strM19163a.length() > 0) {
                        strM19163a = null;
                    }
                    if (strM19163a != null) {
                        objM44946constructorimpl = Result.m44946constructorimpl(strM19163a);
                    }
                }
                throw new C3785gj("Received empty VAST response.", Boxing.boxInt(303));
            } catch (Throwable th5) {
                th = th5;
                th = th;
                Result.Companion companion6 = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
            }
        }
        thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null) {
            return objM44946constructorimpl;
        }
        Result.Companion companion7 = Result.INSTANCE;
        C4048sb.m19410b("Error fetching VAST from URL: " + str, thM44949exceptionOrNullimpl);
        if (thM44949exceptionOrNullimpl instanceof C3785gj) {
            throw thM44949exceptionOrNullimpl;
        }
        throw new C3785gj("Error fetching VAST from URL: " + str + ". " + thM44949exceptionOrNullimpl.getMessage(), Boxing.boxInt(301));
    }
}
