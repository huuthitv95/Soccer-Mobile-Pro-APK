package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4127w2 {

    /* JADX INFO: renamed from: a */
    public final CoroutineDispatcher f16665a;

    /* JADX INFO: renamed from: b */
    public final Function1 f16666b;

    /* JADX INFO: renamed from: c */
    public final Function1 f16667c;

    /* JADX INFO: renamed from: d */
    public final long f16668d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.w2$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16669b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new URL(it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.w2$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f16670b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke(InputStream it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BitmapFactory.decodeStream(it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.w2$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f16671b;

        /* JADX INFO: renamed from: c */
        public Object f16672c;

        /* JADX INFO: renamed from: d */
        public Object f16673d;

        /* JADX INFO: renamed from: e */
        public int f16674e;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f16676g;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.w2$c$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f16677b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Ref.ObjectRef f16678c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ URL f16679d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Ref.ObjectRef f16680e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Ref.ObjectRef f16681f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ C4127w2 f16682g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef objectRef, URL url, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, C4127w2 c4127w2, Continuation continuation) {
                super(2, continuation);
                this.f16678c = objectRef;
                this.f16679d = url;
                this.f16680e = objectRef2;
                this.f16681f = objectRef3;
                this.f16682g = c4127w2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f16678c, this.f16679d, this.f16680e, this.f16681f, this.f16682g, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, android.graphics.Bitmap] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.io.InputStream] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ?? r0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f16677b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = this.f16678c;
                URLConnection uRLConnectionOpenConnection = this.f16679d.openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                ?? r1 = (HttpsURLConnection) uRLConnectionOpenConnection;
                Ref.ObjectRef objectRef2 = this.f16681f;
                r1.setDoInput(true);
                objectRef2.element = r1.getInputStream();
                objectRef.element = r1;
                Ref.ObjectRef objectRef3 = this.f16680e;
                InputStream inputStream = (InputStream) this.f16681f.element;
                if (inputStream == null || (r0 = (Bitmap) this.f16682g.f16667c.invoke(inputStream)) == 0) {
                    throw new IOException("Bitmap decoded to null");
                }
                objectRef3.element = r0;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f16676g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4127w2.this.new c(this.f16676g, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0074  */
        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code duplicated, block: B:35:0x009a A[PHI: r3 r13
  0x009a: PHI (r3v4 kotlin.jvm.internal.Ref$ObjectRef) = (r3v3 kotlin.jvm.internal.Ref$ObjectRef), (r3v6 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:34:0x0098, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r13v15 javax.net.ssl.HttpsURLConnection) = (r13v14 javax.net.ssl.HttpsURLConnection), (r13v20 javax.net.ssl.HttpsURLConnection) binds: [B:34:0x0098, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Throwable th;
            Exception exc;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            HttpsURLConnection httpsURLConnection2;
            InputStream inputStream3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16674e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                try {
                    URL url = (URL) C4127w2.this.f16666b.invoke(this.f16676g);
                    long j = C4127w2.this.f16668d;
                    a aVar = new a(objectRef, url, objectRef6, objectRef2, C4127w2.this, null);
                    this.f16671b = objectRef6;
                    this.f16672c = objectRef;
                    this.f16673d = objectRef2;
                    this.f16674e = 1;
                    if (TimeoutKt.withTimeout(j, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef3 = objectRef;
                    objectRef4 = objectRef6;
                    objectRef5 = objectRef2;
                    inputStream3 = (InputStream) objectRef5.element;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef3.element;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                } catch (Exception e) {
                    exc = e;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef6;
                    objectRef5 = objectRef2;
                    C4048sb.m19416e("Unable to download the info icon image", exc);
                    inputStream2 = (InputStream) objectRef5.element;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef3.element;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = (InputStream) objectRef2.element;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpsURLConnection = (HttpsURLConnection) objectRef.element;
                    if (httpsURLConnection != null) {
                        throw th;
                    }
                    httpsURLConnection.disconnect();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef5 = (Ref.ObjectRef) this.f16673d;
                objectRef3 = (Ref.ObjectRef) this.f16672c;
                objectRef4 = (Ref.ObjectRef) this.f16671b;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        inputStream3 = (InputStream) objectRef5.element;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        httpsURLConnection2 = (HttpsURLConnection) objectRef3.element;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        C4048sb.m19416e("Unable to download the info icon image", exc);
                        inputStream2 = (InputStream) objectRef5.element;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection2 = (HttpsURLConnection) objectRef3.element;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectRef2 = objectRef5;
                    objectRef = objectRef3;
                    inputStream = (InputStream) objectRef2.element;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpsURLConnection = (HttpsURLConnection) objectRef.element;
                    if (httpsURLConnection != null) {
                        throw th;
                    }
                    httpsURLConnection.disconnect();
                    throw th;
                }
            }
            return objectRef4.element;
        }
    }

    public C4127w2(CoroutineDispatcher ioDispatcher, Function1 urlFactory, Function1 bitmapFactory) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        this.f16665a = ioDispatcher;
        this.f16666b = urlFactory;
        this.f16667c = bitmapFactory;
        this.f16668d = 1000L;
    }

    public /* synthetic */ C4127w2(CoroutineDispatcher coroutineDispatcher, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 2) != 0 ? a.f16669b : function1, (i & 4) != 0 ? b.f16670b : function2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m19737a(String str, Continuation continuation) {
        return BuildersKt.withContext(this.f16665a, new c(str, null), continuation);
    }
}
