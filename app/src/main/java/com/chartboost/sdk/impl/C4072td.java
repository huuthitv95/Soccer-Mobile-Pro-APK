package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.internal.Networking.okhttp.AbstractC4219a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p300io.CloseableKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.td */
/* JADX INFO: loaded from: classes3.dex */
public final class C4072td implements InterfaceC4045s8 {

    /* JADX INFO: renamed from: c */
    public static final a f16340c = new a(null);

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f16341a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f16342b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16343b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16344c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, Continuation continuation) {
            super(2, continuation);
            this.f16344c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f16344c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16343b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (this.f16344c.exists()) {
                    if (this.f16344c.delete()) {
                        C4048sb.m19415d("Cleaned up temporary download file: " + this.f16344c.getName(), null, 2, null);
                    } else {
                        C4048sb.m19417e("Failed to delete temporary download file: " + this.f16344c.getName(), null, 2, null);
                    }
                }
            } catch (Exception e) {
                C4048sb.m19410b("Error during temporary file cleanup for " + this.f16344c.getName(), e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16345b;

        /* JADX INFO: renamed from: c */
        public Object f16346c;

        /* JADX INFO: renamed from: d */
        public Object f16347d;

        /* JADX INFO: renamed from: e */
        public Object f16348e;

        /* JADX INFO: renamed from: f */
        public Object f16349f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f16350g;

        /* JADX INFO: renamed from: i */
        public int f16352i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16350g = obj;
            this.f16352i |= Integer.MIN_VALUE;
            Object objMo19395a = C4072td.this.mo19395a(null, null, this);
            return objMo19395a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo19395a : Result.m44945boximpl(objMo19395a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16353b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16354c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ResponseBody f16355d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ File f16356e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Ref.LongRef f16357f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ResponseBody responseBody, File file, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.f16355d = responseBody;
            this.f16356e = file;
            this.f16357f = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f16355d, this.f16356e, this.f16357f, continuation);
            dVar.f16354c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16353b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f16354c;
            InputStream inputStreamByteStream = this.f16355d.byteStream();
            File file = this.f16356e;
            Ref.LongRef longRef = this.f16357f;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamByteStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamByteStream, null);
                            return unit;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        fileOutputStream.write(bArr, 0, i);
                        longRef.element += (long) i;
                        try {
                            throw th;
                        } catch (Throwable th) {
                            CloseableKt.closeFinally(inputStreamByteStream, th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$e */
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16358b;

        /* JADX INFO: renamed from: c */
        public Object f16359c;

        /* JADX INFO: renamed from: d */
        public Object f16360d;

        /* JADX INFO: renamed from: e */
        public Object f16361e;

        /* JADX INFO: renamed from: f */
        public Object f16362f;

        /* JADX INFO: renamed from: g */
        public Object f16363g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f16364h;

        /* JADX INFO: renamed from: j */
        public int f16366j;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16364h = obj;
            this.f16366j |= Integer.MIN_VALUE;
            Object objMo19394a = C4072td.this.mo19394a(null, null, 0L, 0L, this);
            return objMo19394a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo19394a : Result.m44945boximpl(objMo19394a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.td$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16367b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16368c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ResponseBody f16369d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ File f16370e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f16371f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f16372g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Ref.LongRef f16373h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ResponseBody responseBody, File file, long j, long j2, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.f16369d = responseBody;
            this.f16370e = file;
            this.f16371f = j;
            this.f16372g = j2;
            this.f16373h = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.f16369d, this.f16370e, this.f16371f, this.f16372g, this.f16373h, continuation);
            fVar.f16368c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16367b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f16368c;
            InputStream inputStreamByteStream = this.f16369d.byteStream();
            File file = this.f16370e;
            long j2 = this.f16371f;
            long j3 = this.f16372g;
            Ref.LongRef longRef = this.f16373h;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[8192];
                    Ref.IntRef intRef = new Ref.IntRef();
                    long j4 = (j2 - j3) + 1;
                    do {
                        int i = inputStreamByteStream.read(bArr);
                        intRef.element = i;
                        if (i == -1) {
                            break;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        long j5 = longRef.element;
                        int i2 = intRef.element;
                        if (((long) i2) + j5 > j4) {
                            i2 = (int) (j4 - j5);
                        }
                        if (i2 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                        j = longRef.element + ((long) i2);
                        longRef.element = j;
                    } while (j < j4);
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(inputStreamByteStream, null);
                    return unit;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamByteStream, th3);
                    throw th4;
                }
            }
        }
    }

    public C4072td(OkHttpClient okHttpClient, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f16341a = okHttpClient;
        this.f16342b = ioDispatcher;
    }

    /* JADX INFO: renamed from: a */
    public final Object m19483a(File file, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE.plus(this.f16342b), new b(file, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02d7 A[Catch: all -> 0x0294, TryCatch #16 {all -> 0x0294, blocks: (B:67:0x01ea, B:69:0x01f8, B:71:0x0208, B:119:0x02d3, B:121:0x02d7, B:126:0x02f6, B:122:0x02ed, B:152:0x037a, B:47:0x0175, B:49:0x017b, B:53:0x0186, B:54:0x01aa, B:55:0x01ab, B:57:0x01b1, B:59:0x01ca, B:60:0x01cd, B:62:0x01d3, B:94:0x025c, B:95:0x026d, B:96:0x026e, B:97:0x028f), top: B:176:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ed A[Catch: all -> 0x0294, TryCatch #16 {all -> 0x0294, blocks: (B:67:0x01ea, B:69:0x01f8, B:71:0x0208, B:119:0x02d3, B:121:0x02d7, B:126:0x02f6, B:122:0x02ed, B:152:0x037a, B:47:0x0175, B:49:0x017b, B:53:0x0186, B:54:0x01aa, B:55:0x01ab, B:57:0x01b1, B:59:0x01ca, B:60:0x01cd, B:62:0x01d3, B:94:0x025c, B:95:0x026d, B:96:0x026e, B:97:0x028f), top: B:176:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x0328  */
    /* JADX WARN: Code duplicated, block: B:132:0x032d A[Catch: all -> 0x0072, TryCatch #11 {all -> 0x0072, blocks: (B:17:0x0058, B:130:0x0329, B:132:0x032d, B:134:0x0333, B:137:0x0342, B:139:0x034d, B:141:0x0355, B:143:0x035d, B:144:0x035f, B:22:0x006d, B:156:0x03a4), top: B:175:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0333 A[Catch: all -> 0x0072, TryCatch #11 {all -> 0x0072, blocks: (B:17:0x0058, B:130:0x0329, B:132:0x032d, B:134:0x0333, B:137:0x0342, B:139:0x034d, B:141:0x0355, B:143:0x035d, B:144:0x035f, B:22:0x006d, B:156:0x03a4), top: B:175:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0340  */
    /* JADX WARN: Code duplicated, block: B:139:0x034d A[Catch: all -> 0x0072, TryCatch #11 {all -> 0x0072, blocks: (B:17:0x0058, B:130:0x0329, B:132:0x032d, B:134:0x0333, B:137:0x0342, B:139:0x034d, B:141:0x0355, B:143:0x035d, B:144:0x035f, B:22:0x006d, B:156:0x03a4), top: B:175:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x035d A[Catch: all -> 0x0072, TryCatch #11 {all -> 0x0072, blocks: (B:17:0x0058, B:130:0x0329, B:132:0x032d, B:134:0x0333, B:137:0x0342, B:139:0x034d, B:141:0x0355, B:143:0x035d, B:144:0x035f, B:22:0x006d, B:156:0x03a4), top: B:175:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x036b  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b6 A[PHI: r0 r2
  0x03b6: PHI (r0v58 java.lang.Object) = (r0v53 java.lang.Object), (r0v56 java.lang.Object), (r0v62 java.lang.Object) binds: [B:74:0x0226, B:159:0x03b4, B:147:0x036f] A[DONT_GENERATE, DONT_INLINE]
  0x03b6: PHI (r2v19 okhttp3.ResponseBody) = (r2v16 okhttp3.ResponseBody), (r2v18 okhttp3.ResponseBody), (r2v21 okhttp3.ResponseBody) binds: [B:74:0x0226, B:159:0x03b4, B:147:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x02d7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v47, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.chartboost.sdk.impl.td$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.chartboost.sdk.impl.td$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.chartboost.sdk.impl.td$e, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v20, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.chartboost.sdk.impl.td] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.chartboost.sdk.impl.td] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.chartboost.sdk.impl.td] */
    /* JADX WARN: Type inference failed for: r8v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    @Override // com.chartboost.sdk.impl.InterfaceC4045s8
    /* JADX INFO: renamed from: a */
    public Object mo19394a(URL url, File file, long j, long j2, Continuation continuation) throws Throwable {
        e eVar;
        ?? Execute;
        ResponseBody responseBodyBody;
        ?? r7;
        Object obj;
        Object obj2;
        String str;
        ?? r0;
        ?? r2;
        String str2;
        ?? r3;
        Object objM44946constructorimpl;
        ResponseBody responseBodyBody2;
        String message;
        String lowerCase;
        URL url2 = url;
        ?? r8 = j;
        Object obj3 = "Server doesn't support range requests for ";
        ?? r13 = "HTTP ";
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f16366j;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f16366j = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj4 = eVar.f16364h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f16366j;
        obj3 = coroutine_suspended;
        ?? longRef = " (";
        r8 = ")";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj4);
                int i3 = (r8 > 0L ? 1 : (r8 == 0L ? 0 : -1));
                if (i3 < 0) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(new IllegalArgumentException("startByte must be non-negative, got: " + r8)));
                }
                if (j2 < r8) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(new IllegalArgumentException("endByte (" + j2 + ") must be >= startByte (" + r8 + ")")));
                }
                r13 = i3;
                String str3 = "bytes=" + r8 + "-" + j2;
                Request requestBuild = new Request.Builder().url(url2).header("Range", str3).get().build();
                e eVar2 = eVar;
                longRef = new Ref.LongRef();
                try {
                    try {
                        try {
                            C4048sb.m19415d("Starting OkHttp partial download for " + url2 + " (" + str3 + ") to " + file.getAbsolutePath(), null, 2, null);
                            Execute = this.f16341a.newCall(requestBuild).execute();
                            try {
                                try {
                                    file = Execute.isSuccessful();
                                    try {
                                        if (file == 0) {
                                            AbstractC4219a abstractC4219aM20184b = AbstractC4219a.f17193c.m20184b(Execute.code());
                                            String string = url2.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                            throw AbstractC3706d9.m17262a(abstractC4219aM20184b, string);
                                        }
                                        if (Execute.code() != 206 && r13 > 0) {
                                            C4048sb.m19417e("Server doesn't support range requests for " + url2 + ", got HTTP " + Execute.code(), null, 2, null);
                                            throw new IOException("Server doesn't support range requests for partial download");
                                        }
                                        ResponseBody responseBodyBody3 = Execute.body();
                                        if (responseBodyBody3 == null) {
                                            throw new IOException("Response body was null for " + url2);
                                        }
                                        CoroutineDispatcher coroutineDispatcher = this.f16342b;
                                        obj = " (";
                                        r13 = "HTTP ";
                                        obj2 = ")";
                                        r13 = eVar2;
                                        file = file;
                                        try {
                                            f fVar = new f(responseBodyBody3, file, j2, r8, longRef, null);
                                            try {
                                                r13.f16358b = this;
                                                r13.f16359c = url2;
                                                file = file;
                                                r13.f16360d = file;
                                                r13.f16361e = str3;
                                                r13.f16362f = Execute;
                                                r13.f16363g = longRef;
                                                r13.f16366j = 1;
                                                obj3 = obj3;
                                                if (BuildersKt.withContext(coroutineDispatcher, fVar, r13) != obj3) {
                                                    str = str3;
                                                    r7 = this;
                                                    r0 = longRef;
                                                    file = file;
                                                    Execute = Execute;
                                                    r13 = r13;
                                                    r13 = r13;
                                                    long j3 = r0.element;
                                                    ?? sb = new StringBuilder("OkHttp partial download complete for ");
                                                    sb.append(url2);
                                                    longRef = obj;
                                                    sb.append(longRef);
                                                    sb.append(j3);
                                                    sb.append(" bytes, range: ");
                                                    sb.append(str);
                                                    r8 = obj2;
                                                    sb.append(r8);
                                                    C4048sb.m19415d(sb.toString(), null, 2, null);
                                                    Result.Companion companion3 = Result.INSTANCE;
                                                    objM44946constructorimpl = Result.m44946constructorimpl(Boxing.boxLong(r0.element));
                                                    if (Execute != 0) {
                                                    }
                                                    return objM44946constructorimpl;
                                                }
                                            } catch (CancellationException e2) {
                                                e = e2;
                                                file = file;
                                                obj3 = obj3;
                                                r7 = this;
                                                C4048sb.m19417e("OkHttp partial download cancelled for " + url2, null, 2, null);
                                                r13.f16358b = Execute;
                                                r13.f16359c = e;
                                                r13.f16360d = null;
                                                r13.f16361e = null;
                                                r13.f16362f = null;
                                                r13.f16363g = null;
                                                r13.f16366j = 2;
                                                if (r7.m19483a(file, r13) != obj3) {
                                                    r2 = Execute;
                                                    Result.Companion companion4 = Result.INSTANCE;
                                                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                                    if (r2 != 0) {
                                                        responseBodyBody2.close();
                                                    }
                                                    return objM44946constructorimpl;
                                                }
                                                return obj3;
                                            } catch (Exception e3) {
                                                e = e3;
                                                file = file;
                                                r8 = obj2;
                                                obj3 = obj3;
                                                longRef = obj;
                                                r7 = this;
                                                if (e instanceof AbstractC4219a) {
                                                    str2 = ((String) r13) + ((AbstractC4219a) e).m20181b();
                                                } else if (e instanceof IOException) {
                                                    str2 = "Network/IO error";
                                                } else {
                                                    str2 = "Unexpected error";
                                                }
                                                C4048sb.m19410b("Error during OkHttp partial download for " + url2 + longRef + str2 + r8, e);
                                                r13.f16358b = Execute;
                                                r13.f16359c = e;
                                                r13.f16360d = null;
                                                r13.f16361e = null;
                                                r13.f16362f = null;
                                                r13.f16363g = null;
                                                r13.f16366j = 3;
                                                if (r7.m19483a(file, r13) != obj3) {
                                                    r3 = Execute;
                                                    if (e instanceof IOException) {
                                                        message = e.getMessage();
                                                        if (message != null) {
                                                            lowerCase = message.toLowerCase(Locale.ROOT);
                                                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                            if (lowerCase == null) {
                                                                lowerCase = "";
                                                            }
                                                        } else {
                                                            lowerCase = "";
                                                        }
                                                        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                                            e = ChartboostError.Load.NoStorage.INSTANCE;
                                                        } else {
                                                            e = ChartboostError.Load.NoStorage.INSTANCE;
                                                        }
                                                    }
                                                    Result.Companion companion5 = Result.INSTANCE;
                                                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                                    if (r3 != 0) {
                                                        responseBodyBody2.close();
                                                    }
                                                    return objM44946constructorimpl;
                                                }
                                                return obj3;
                                            }
                                        } catch (CancellationException e4) {
                                            e = e4;
                                        } catch (Exception e5) {
                                            e = e5;
                                        }
                                        return obj3;
                                    } catch (CancellationException e6) {
                                        e = e6;
                                    } catch (Exception e7) {
                                        e = e7;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (Execute != 0 && (responseBodyBody = Execute.body()) != null) {
                                        responseBodyBody.close();
                                    }
                                    throw th;
                                }
                            } catch (CancellationException e8) {
                                e = e8;
                                file = file;
                                obj3 = obj3;
                                r13 = eVar2;
                            } catch (Exception e9) {
                                e = e9;
                                file = file;
                                obj3 = obj3;
                                longRef = " (";
                                r13 = "HTTP ";
                                r8 = ")";
                                r13 = eVar2;
                            }
                        } catch (CancellationException e10) {
                            e = e10;
                            r13 = eVar2;
                            r7 = this;
                            Execute = 0;
                            C4048sb.m19417e("OkHttp partial download cancelled for " + url2, null, 2, null);
                            r13.f16358b = Execute;
                            r13.f16359c = e;
                            r13.f16360d = null;
                            r13.f16361e = null;
                            r13.f16362f = null;
                            r13.f16363g = null;
                            r13.f16366j = 2;
                            if (r7.m19483a(file, r13) != obj3) {
                                r2 = Execute;
                                Result.Companion companion6 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                if (r2 != 0) {
                                    responseBodyBody2.close();
                                }
                                return objM44946constructorimpl;
                            }
                            return obj3;
                        } catch (Exception e11) {
                            e = e11;
                            r13 = eVar2;
                            r7 = this;
                            Execute = 0;
                            if (e instanceof AbstractC4219a) {
                                str2 = ((String) r13) + ((AbstractC4219a) e).m20181b();
                            } else if (e instanceof IOException) {
                                str2 = "Network/IO error";
                            } else {
                                str2 = "Unexpected error";
                            }
                            C4048sb.m19410b("Error during OkHttp partial download for " + url2 + longRef + str2 + r8, e);
                            r13.f16358b = Execute;
                            r13.f16359c = e;
                            r13.f16360d = null;
                            r13.f16361e = null;
                            r13.f16362f = null;
                            r13.f16363g = null;
                            r13.f16366j = 3;
                            if (r7.m19483a(file, r13) != obj3) {
                                r3 = Execute;
                                if (e instanceof IOException) {
                                    message = e.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                        if (lowerCase == null) {
                                            lowerCase = "";
                                        }
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        e = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                Result.Companion companion7 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                if (r3 != 0) {
                                    responseBodyBody2.close();
                                }
                                return objM44946constructorimpl;
                            }
                            return obj3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Execute = 0;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    r13 = eVar2;
                } catch (Exception e13) {
                    e = e13;
                    r13 = eVar2;
                }
            } else if (i2 == 1) {
                Ref.LongRef longRef2 = (Ref.LongRef) eVar.f16363g;
                Response response = (Response) eVar.f16362f;
                String str4 = (String) eVar.f16361e;
                file = (File) eVar.f16360d;
                URL url3 = (URL) eVar.f16359c;
                r7 = (C4072td) eVar.f16358b;
                try {
                    ResultKt.throwOnFailure(obj4);
                    Execute = response;
                    str = str4;
                    url2 = url3;
                    obj = " (";
                    r13 = "HTTP ";
                    obj3 = obj3;
                    r13 = eVar;
                    obj2 = ")";
                    r0 = longRef2;
                    file = file;
                    r7 = r7;
                    try {
                        try {
                            long j4 = r0.element;
                            ?? sb2 = new StringBuilder("OkHttp partial download complete for ");
                            sb2.append(url2);
                            longRef = obj;
                            try {
                                sb2.append(longRef);
                                sb2.append(j4);
                                sb2.append(" bytes, range: ");
                                sb2.append(str);
                                r8 = obj2;
                                try {
                                    sb2.append(r8);
                                    C4048sb.m19415d(sb2.toString(), null, 2, null);
                                    Result.Companion companion8 = Result.INSTANCE;
                                    objM44946constructorimpl = Result.m44946constructorimpl(Boxing.boxLong(r0.element));
                                    if (Execute != 0 || (responseBodyBody2 = Execute.body()) == null) {
                                        return objM44946constructorimpl;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    if (e instanceof AbstractC4219a) {
                                        str2 = ((String) r13) + ((AbstractC4219a) e).m20181b();
                                    } else if (e instanceof IOException) {
                                        str2 = "Network/IO error";
                                    } else {
                                        str2 = "Unexpected error";
                                    }
                                    C4048sb.m19410b("Error during OkHttp partial download for " + url2 + longRef + str2 + r8, e);
                                    r13.f16358b = Execute;
                                    r13.f16359c = e;
                                    r13.f16360d = null;
                                    r13.f16361e = null;
                                    r13.f16362f = null;
                                    r13.f16363g = null;
                                    r13.f16366j = 3;
                                    if (r7.m19483a(file, r13) != obj3) {
                                        r3 = Execute;
                                        if (e instanceof IOException) {
                                            message = e.getMessage();
                                            if (message != null) {
                                                lowerCase = message.toLowerCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                if (lowerCase == null) {
                                                    lowerCase = "";
                                                }
                                            } else {
                                                lowerCase = "";
                                            }
                                            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                                e = ChartboostError.Load.NoStorage.INSTANCE;
                                            } else {
                                                e = ChartboostError.Load.NoStorage.INSTANCE;
                                            }
                                        }
                                        Result.Companion companion9 = Result.INSTANCE;
                                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                        if (r3 != 0) {
                                        }
                                        return objM44946constructorimpl;
                                    }
                                    return obj3;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                r8 = obj2;
                            }
                        } catch (CancellationException e16) {
                            e = e16;
                            C4048sb.m19417e("OkHttp partial download cancelled for " + url2, null, 2, null);
                            r13.f16358b = Execute;
                            r13.f16359c = e;
                            r13.f16360d = null;
                            r13.f16361e = null;
                            r13.f16362f = null;
                            r13.f16363g = null;
                            r13.f16366j = 2;
                            if (r7.m19483a(file, r13) != obj3) {
                                r2 = Execute;
                                Result.Companion companion10 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                                if (r2 != 0) {
                                }
                                return objM44946constructorimpl;
                            }
                            return obj3;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        r8 = obj2;
                        longRef = obj;
                    }
                } catch (CancellationException e18) {
                    e = e18;
                    obj3 = obj3;
                    Execute = response;
                    url2 = url3;
                    r13 = eVar;
                    C4048sb.m19417e("OkHttp partial download cancelled for " + url2, null, 2, null);
                    r13.f16358b = Execute;
                    r13.f16359c = e;
                    r13.f16360d = null;
                    r13.f16361e = null;
                    r13.f16362f = null;
                    r13.f16363g = null;
                    r13.f16366j = 2;
                    if (r7.m19483a(file, r13) != obj3) {
                        r2 = Execute;
                        Result.Companion companion11 = Result.INSTANCE;
                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                        if (r2 != 0) {
                            responseBodyBody2.close();
                        }
                        return objM44946constructorimpl;
                    }
                    return obj3;
                } catch (Exception e19) {
                    e = e19;
                    obj3 = obj3;
                    Execute = response;
                    url2 = url3;
                    r13 = "HTTP ";
                    r8 = ")";
                    r13 = eVar;
                    longRef = " (";
                    if (e instanceof AbstractC4219a) {
                        str2 = ((String) r13) + ((AbstractC4219a) e).m20181b();
                    } else if (e instanceof IOException) {
                        str2 = "Network/IO error";
                    } else {
                        str2 = "Unexpected error";
                    }
                    C4048sb.m19410b("Error during OkHttp partial download for " + url2 + longRef + str2 + r8, e);
                    r13.f16358b = Execute;
                    r13.f16359c = e;
                    r13.f16360d = null;
                    r13.f16361e = null;
                    r13.f16362f = null;
                    r13.f16363g = null;
                    r13.f16366j = 3;
                    if (r7.m19483a(file, r13) != obj3) {
                        r3 = Execute;
                        if (e instanceof IOException) {
                            message = e.getMessage();
                            if (message != null) {
                                lowerCase = message.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (lowerCase == null) {
                                    lowerCase = "";
                                }
                            } else {
                                lowerCase = "";
                            }
                            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                e = ChartboostError.Load.NoStorage.INSTANCE;
                            } else {
                                e = ChartboostError.Load.NoStorage.INSTANCE;
                            }
                        }
                        Result.Companion companion12 = Result.INSTANCE;
                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                        if (r3 != 0) {
                            responseBodyBody2.close();
                        }
                        return objM44946constructorimpl;
                    }
                    return obj3;
                } catch (Throwable th3) {
                    th = th3;
                    Execute = response;
                    if (Execute != 0) {
                        responseBodyBody.close();
                    }
                    throw th;
                }
                responseBodyBody2.close();
            } else if (i2 == 2) {
                e = (CancellationException) eVar.f16359c;
                Response response2 = (Response) eVar.f16358b;
                ResultKt.throwOnFailure(obj4);
                r2 = response2;
                Result.Companion companion13 = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                if (r2 != 0 && (responseBodyBody2 = r2.body()) != null) {
                    responseBodyBody2.close();
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = (Exception) eVar.f16359c;
                Response response3 = (Response) eVar.f16358b;
                ResultKt.throwOnFailure(obj4);
                r3 = response3;
                if (e instanceof IOException) {
                    message = e.getMessage();
                    if (message != null) {
                        lowerCase = message.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase == null) {
                            lowerCase = "";
                        }
                    } else {
                        lowerCase = "";
                    }
                    if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "disk full", false, 2, (Object) null)) {
                        e = ChartboostError.Load.NoStorage.INSTANCE;
                    }
                }
                Result.Companion companion14 = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(e));
                if (r3 != 0 && (responseBodyBody2 = r3.body()) != null) {
                    responseBodyBody2.close();
                }
            }
            return objM44946constructorimpl;
        } catch (Throwable th4) {
            th = th4;
            Execute = url2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0248  */
    /* JADX WARN: Code duplicated, block: B:106:0x024e A[PHI: r0 r2
  0x024e: PHI (r0v36 java.lang.Object) = (r0v31 java.lang.Object), (r0v34 java.lang.Object), (r0v40 java.lang.Object) binds: [B:45:0x012e, B:105:0x024c, B:94:0x020f] A[DONT_GENERATE, DONT_INLINE]
  0x024e: PHI (r2v16 okhttp3.ResponseBody) = (r2v13 okhttp3.ResponseBody), (r2v15 okhttp3.ResponseBody), (r2v19 okhttp3.ResponseBody) binds: [B:45:0x012e, B:105:0x024c, B:94:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x017a A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:42:0x00fe, B:66:0x0176, B:68:0x017a, B:73:0x0197, B:69:0x018e, B:98:0x0215, B:34:0x00d4, B:36:0x00da, B:38:0x00e0, B:54:0x013e, B:55:0x014f, B:56:0x0150, B:57:0x0167), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x018e A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:42:0x00fe, B:66:0x0176, B:68:0x017a, B:73:0x0197, B:69:0x018e, B:98:0x0215, B:34:0x00d4, B:36:0x00da, B:38:0x00e0, B:54:0x013e, B:55:0x014f, B:56:0x0150, B:57:0x0167), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd A[Catch: all -> 0x0084, TryCatch #3 {all -> 0x0084, blocks: (B:16:0x0049, B:77:0x01c9, B:79:0x01cd, B:81:0x01d3, B:84:0x01e2, B:86:0x01ed, B:88:0x01f5, B:90:0x01fd, B:91:0x01ff, B:21:0x005e, B:102:0x023c, B:24:0x0077), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d3 A[Catch: all -> 0x0084, TryCatch #3 {all -> 0x0084, blocks: (B:16:0x0049, B:77:0x01c9, B:79:0x01cd, B:81:0x01d3, B:84:0x01e2, B:86:0x01ed, B:88:0x01f5, B:90:0x01fd, B:91:0x01ff, B:21:0x005e, B:102:0x023c, B:24:0x0077), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ed A[Catch: all -> 0x0084, TryCatch #3 {all -> 0x0084, blocks: (B:16:0x0049, B:77:0x01c9, B:79:0x01cd, B:81:0x01d3, B:84:0x01e2, B:86:0x01ed, B:88:0x01f5, B:90:0x01fd, B:91:0x01ff, B:21:0x005e, B:102:0x023c, B:24:0x0077), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fd A[Catch: all -> 0x0084, TryCatch #3 {all -> 0x0084, blocks: (B:16:0x0049, B:77:0x01c9, B:79:0x01cd, B:81:0x01d3, B:84:0x01e2, B:86:0x01ed, B:88:0x01f5, B:90:0x01fd, B:91:0x01ff, B:21:0x005e, B:102:0x023c, B:24:0x0077), top: B:113:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chartboost.sdk.impl.InterfaceC4045s8
    /* JADX INFO: renamed from: a */
    public Object mo19395a(URL url, File file, Continuation continuation) throws Throwable {
        c cVar;
        Response response;
        ResponseBody responseBodyBody;
        Ref.LongRef longRef;
        C4072td c4072td;
        Response responseExecute;
        C4072td c4072td2;
        String str;
        Exception exc;
        Response response2;
        CancellationException cancellationException;
        Response response3;
        Object objM44946constructorimpl;
        ResponseBody responseBodyBody2;
        String message;
        String lowerCase;
        URL url2 = url;
        File file2 = file;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f16352i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f16352i = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f16350g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f16352i;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Request requestBuild = new Request.Builder().url(url2).get().build();
                    longRef = new Ref.LongRef();
                    try {
                        C4048sb.m19415d("Starting OkHttp download for " + url2 + " to " + file2.getAbsolutePath(), null, 2, null);
                        responseExecute = this.f16341a.newCall(requestBuild).execute();
                        try {
                            if (!responseExecute.isSuccessful()) {
                                AbstractC4219a abstractC4219aM20184b = AbstractC4219a.f17193c.m20184b(responseExecute.code());
                                String string = url2.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                throw AbstractC3706d9.m17262a(abstractC4219aM20184b, string);
                            }
                            ResponseBody responseBodyBody3 = responseExecute.body();
                            if (responseBodyBody3 == null) {
                                throw new IOException("Response body was null for " + url2);
                            }
                            CoroutineDispatcher coroutineDispatcher = this.f16342b;
                            d dVar = new d(responseBodyBody3, file2, longRef, null);
                            cVar.f16345b = this;
                            cVar.f16346c = url2;
                            cVar.f16347d = file2;
                            cVar.f16348e = responseExecute;
                            cVar.f16349f = longRef;
                            cVar.f16352i = 1;
                            if (BuildersKt.withContext(coroutineDispatcher, dVar, cVar) != coroutine_suspended) {
                                c4072td2 = this;
                                C4048sb.m19415d("OkHttp download complete for " + url2 + " (" + longRef.element + " bytes)", null, 2, null);
                                Result.Companion companion = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(Boxing.boxLong(longRef.element));
                                if (responseExecute != null) {
                                }
                                return objM44946constructorimpl;
                            }
                            return coroutine_suspended;
                        } catch (CancellationException e2) {
                            e = e2;
                            c4072td = this;
                            C4048sb.m19417e("OkHttp download cancelled for " + url2, null, 2, null);
                            cVar.f16345b = responseExecute;
                            cVar.f16346c = e;
                            cVar.f16347d = null;
                            cVar.f16348e = null;
                            cVar.f16349f = null;
                            cVar.f16352i = 2;
                            if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                                cancellationException = e;
                                response3 = responseExecute;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(cancellationException));
                                if (response3 != null) {
                                    responseBodyBody2.close();
                                }
                                return objM44946constructorimpl;
                            }
                            return coroutine_suspended;
                        } catch (Exception e3) {
                            e = e3;
                            c4072td = this;
                            if (e instanceof AbstractC4219a) {
                                str = "HTTP " + ((AbstractC4219a) e).m20181b();
                            } else if (e instanceof IOException) {
                                str = "Network/IO error";
                            } else {
                                str = "Unexpected error";
                            }
                            C4048sb.m19410b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                            cVar.f16345b = responseExecute;
                            cVar.f16346c = e;
                            cVar.f16347d = null;
                            cVar.f16348e = null;
                            cVar.f16349f = null;
                            cVar.f16352i = 3;
                            if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                                exc = e;
                                response2 = responseExecute;
                                if (exc instanceof IOException) {
                                    message = exc.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                        if (lowerCase == null) {
                                            lowerCase = "";
                                        }
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                Result.Companion companion3 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(exc));
                                if (response2 != null) {
                                    responseBodyBody2.close();
                                }
                                return objM44946constructorimpl;
                            }
                            return coroutine_suspended;
                        }
                    } catch (CancellationException e4) {
                        e = e4;
                        c4072td = this;
                        responseExecute = null;
                    } catch (Exception e5) {
                        e = e5;
                        c4072td = this;
                        responseExecute = null;
                    } catch (Throwable th) {
                        th = th;
                        response = 0;
                        if (response != 0 && (responseBodyBody = response.body()) != null) {
                            responseBodyBody.close();
                        }
                        throw th;
                    }
                } else if (i2 == 1) {
                    Ref.LongRef longRef2 = (Ref.LongRef) cVar.f16349f;
                    Response response4 = (Response) cVar.f16348e;
                    File file3 = (File) cVar.f16347d;
                    URL url3 = (URL) cVar.f16346c;
                    c4072td = (C4072td) cVar.f16345b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        longRef = longRef2;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        c4072td2 = c4072td;
                        try {
                            C4048sb.m19415d("OkHttp download complete for " + url2 + " (" + longRef.element + " bytes)", null, 2, null);
                            Result.Companion companion4 = Result.INSTANCE;
                            objM44946constructorimpl = Result.m44946constructorimpl(Boxing.boxLong(longRef.element));
                            if (responseExecute != null || (responseBodyBody2 = responseExecute.body()) == null) {
                                return objM44946constructorimpl;
                            }
                        } catch (CancellationException e6) {
                            e = e6;
                            c4072td = c4072td2;
                            C4048sb.m19417e("OkHttp download cancelled for " + url2, null, 2, null);
                            cVar.f16345b = responseExecute;
                            cVar.f16346c = e;
                            cVar.f16347d = null;
                            cVar.f16348e = null;
                            cVar.f16349f = null;
                            cVar.f16352i = 2;
                            if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                                cancellationException = e;
                                response3 = responseExecute;
                                Result.Companion companion5 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(cancellationException));
                                if (response3 != null) {
                                }
                                return objM44946constructorimpl;
                            }
                            return coroutine_suspended;
                        } catch (Exception e7) {
                            e = e7;
                            c4072td = c4072td2;
                            if (e instanceof AbstractC4219a) {
                                str = "HTTP " + ((AbstractC4219a) e).m20181b();
                            } else if (e instanceof IOException) {
                                str = "Network/IO error";
                            } else {
                                str = "Unexpected error";
                            }
                            C4048sb.m19410b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                            cVar.f16345b = responseExecute;
                            cVar.f16346c = e;
                            cVar.f16347d = null;
                            cVar.f16348e = null;
                            cVar.f16349f = null;
                            cVar.f16352i = 3;
                            if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                                exc = e;
                                response2 = responseExecute;
                                if (exc instanceof IOException) {
                                    message = exc.getMessage();
                                    if (message != null) {
                                        lowerCase = message.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                        if (lowerCase == null) {
                                            lowerCase = "";
                                        }
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    } else {
                                        exc = ChartboostError.Load.NoStorage.INSTANCE;
                                    }
                                }
                                Result.Companion companion6 = Result.INSTANCE;
                                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(exc));
                                if (response2 != null) {
                                }
                                return objM44946constructorimpl;
                            }
                            return coroutine_suspended;
                        }
                    } catch (CancellationException e8) {
                        e = e8;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        C4048sb.m19417e("OkHttp download cancelled for " + url2, null, 2, null);
                        cVar.f16345b = responseExecute;
                        cVar.f16346c = e;
                        cVar.f16347d = null;
                        cVar.f16348e = null;
                        cVar.f16349f = null;
                        cVar.f16352i = 2;
                        if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                            cancellationException = e;
                            response3 = responseExecute;
                            Result.Companion companion7 = Result.INSTANCE;
                            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(cancellationException));
                            if (response3 != null) {
                                responseBodyBody2.close();
                            }
                            return objM44946constructorimpl;
                        }
                        return coroutine_suspended;
                    } catch (Exception e9) {
                        e = e9;
                        url2 = url3;
                        responseExecute = response4;
                        file2 = file3;
                        if (e instanceof AbstractC4219a) {
                            str = "HTTP " + ((AbstractC4219a) e).m20181b();
                        } else if (e instanceof IOException) {
                            str = "Network/IO error";
                        } else {
                            str = "Unexpected error";
                        }
                        C4048sb.m19410b("Error during OkHttp download for " + url2 + " (" + str + ")", e);
                        cVar.f16345b = responseExecute;
                        cVar.f16346c = e;
                        cVar.f16347d = null;
                        cVar.f16348e = null;
                        cVar.f16349f = null;
                        cVar.f16352i = 3;
                        if (c4072td.m19483a(file2, cVar) != coroutine_suspended) {
                            exc = e;
                            response2 = responseExecute;
                            if (exc instanceof IOException) {
                                message = exc.getMessage();
                                if (message != null) {
                                    lowerCase = message.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                    if (lowerCase == null) {
                                        lowerCase = "";
                                    }
                                } else {
                                    lowerCase = "";
                                }
                                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null)) {
                                    exc = ChartboostError.Load.NoStorage.INSTANCE;
                                } else {
                                    exc = ChartboostError.Load.NoStorage.INSTANCE;
                                }
                            }
                            Result.Companion companion8 = Result.INSTANCE;
                            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(exc));
                            if (response2 != null) {
                                responseBodyBody2.close();
                            }
                            return objM44946constructorimpl;
                        }
                        return coroutine_suspended;
                    }
                    responseBodyBody2.close();
                } else if (i2 == 2) {
                    cancellationException = (CancellationException) cVar.f16346c;
                    response3 = (Response) cVar.f16345b;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion9 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(cancellationException));
                    if (response3 != null && (responseBodyBody2 = response3.body()) != null) {
                        responseBodyBody2.close();
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) cVar.f16346c;
                    response2 = (Response) cVar.f16345b;
                    ResultKt.throwOnFailure(obj);
                    if (exc instanceof IOException) {
                        message = exc.getMessage();
                        if (message != null) {
                            lowerCase = message.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                        } else {
                            lowerCase = "";
                        }
                        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "disk full", false, 2, (Object) null)) {
                            exc = ChartboostError.Load.NoStorage.INSTANCE;
                        }
                    }
                    Result.Companion companion10 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(exc));
                    if (response2 != null && (responseBodyBody2 = response2.body()) != null) {
                        responseBodyBody2.close();
                    }
                }
                return objM44946constructorimpl;
            } catch (Throwable th2) {
                th = th2;
                response = "Starting OkHttp download for ";
            }
        } catch (Throwable th3) {
            th = th3;
            response = file2;
        }
    }
}
