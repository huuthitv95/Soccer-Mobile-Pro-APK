package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.CloseableKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4024r9 extends AbstractC3860k2 {

    /* JADX INFO: renamed from: o */
    public final Context f16141o;

    /* JADX INFO: renamed from: p */
    public final URL f16142p;

    /* JADX INFO: renamed from: q */
    public final C4085u4 f16143q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3917md f16144r;

    /* JADX INFO: renamed from: s */
    public final Mediation f16145s;

    /* JADX INFO: renamed from: t */
    public final Mutex f16146t;

    /* JADX INFO: renamed from: u */
    public ImageView f16147u;

    /* JADX INFO: renamed from: v */
    public Bitmap f16148v;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r9$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f16149b;

        /* JADX INFO: renamed from: d */
        public int f16151d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16149b = obj;
            this.f16151d |= Integer.MIN_VALUE;
            Object objMo17313a = C4024r9.this.mo17313a((Context) null, this);
            return objMo17313a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17313a : Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r9$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f16152b;

        /* JADX INFO: renamed from: c */
        public Object f16153c;

        /* JADX INFO: renamed from: d */
        public int f16154d;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: a */
        public static final void m19326a(C4024r9 c4024r9, View view) {
            List listEmptyList;
            InterfaceC4074tf interfaceC4074tfM19067i;
            C4085u4 c4085u4 = c4024r9.f16143q;
            c4024r9.m18331a(c4085u4 != null ? c4085u4.m19552b() : null, true);
            C4085u4 c4085u5 = c4024r9.f16143q;
            if (c4085u5 == null || (listEmptyList = c4085u5.m19553c()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!c4024r9.m18335r().m17617a((AbstractC3724e4) new AbstractC3724e4.c(listEmptyList), true) || (interfaceC4074tfM19067i = c4024r9.m19067i()) == null) {
                return;
            }
            interfaceC4074tfM19067i.mo17323f();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4024r9.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x009c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0019, B:26:0x0096, B:28:0x009c, B:30:0x00a2, B:31:0x00ba, B:34:0x00c4, B:32:0x00be), top: B:41:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0019, B:26:0x0096, B:28:0x009c, B:30:0x00a2, B:31:0x00ba, B:34:0x00c4, B:32:0x00be), top: B:41:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00be A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0019, B:26:0x0096, B:28:0x009c, B:30:0x00a2, B:31:0x00ba, B:34:0x00c4, B:32:0x00be), top: B:41:0x0019 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            C4024r9 c4024r9;
            Mutex mutex2;
            Object value;
            final C4024r9 c4024r10;
            Object objM44946constructorimpl;
            ImageView imageViewM19325z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16154d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = C4024r9.this.f16146t;
                    c4024r9 = C4024r9.this;
                    this.f16152b = mutex;
                    this.f16153c = c4024r9;
                    this.f16154d = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4024r10 = (C4024r9) this.f16153c;
                    mutex2 = (Mutex) this.f16152b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                        if (Result.m44953isSuccessimpl(value)) {
                            imageViewM19325z = c4024r10.m19325z();
                            if (imageViewM19325z == null) {
                                imageViewM19325z = new ImageView(c4024r10.f16141o);
                                imageViewM19325z.setImageBitmap(c4024r10.m19324y());
                                imageViewM19325z.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.r9$b$$ExternalSyntheticLambda0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C4024r9.b.m19326a(c4024r10, view);
                                    }
                                });
                            }
                            c4024r10.m19323a(imageViewM19325z);
                        } else {
                            c4024r10.mo17319a(EnumC3737eh.FAILURE);
                        }
                        objM44946constructorimpl = value;
                        Result resultM44945boximpl = Result.m44945boximpl(objM44946constructorimpl);
                        mutex2.unlock(null);
                        return resultM44945boximpl;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                c4024r9 = (C4024r9) this.f16153c;
                Mutex mutex3 = (Mutex) this.f16152b;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                if (c4024r9.m19325z() == null || c4024r9.m19324y() == null) {
                    URL url = c4024r9.f16142p;
                    this.f16152b = mutex;
                    this.f16153c = c4024r9;
                    this.f16154d = 2;
                    Object objM19321a = c4024r9.m19321a(url, this);
                    if (objM19321a != coroutine_suspended) {
                        mutex2 = mutex;
                        value = objM19321a;
                        c4024r10 = c4024r9;
                        if (Result.m44953isSuccessimpl(value)) {
                            imageViewM19325z = c4024r10.m19325z();
                            if (imageViewM19325z == null) {
                                imageViewM19325z = new ImageView(c4024r10.f16141o);
                                imageViewM19325z.setImageBitmap(c4024r10.m19324y());
                                imageViewM19325z.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.r9$b$$ExternalSyntheticLambda0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C4024r9.b.m19326a(c4024r10, view);
                                    }
                                });
                            }
                            c4024r10.m19323a(imageViewM19325z);
                        } else {
                            c4024r10.mo17319a(EnumC3737eh.FAILURE);
                        }
                        objM44946constructorimpl = value;
                    }
                    return coroutine_suspended;
                }
                C4048sb.m19408a("Image already loaded for URL: " + c4024r9.f16142p + ". Skipping.", (Throwable) null, 2, (Object) null);
                Result.Companion companion = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
                mutex2 = mutex;
                Result resultM44945boximpl2 = Result.m44945boximpl(objM44946constructorimpl);
                mutex2.unlock(null);
                return resultM44945boximpl2;
            } catch (Throwable th2) {
                th = th2;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r9$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f16156b;

        /* JADX INFO: renamed from: d */
        public int f16158d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16156b = obj;
            this.f16158d |= Integer.MIN_VALUE;
            Object objM19321a = C4024r9.this.m19321a((URL) null, this);
            return objM19321a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19321a : Result.m44945boximpl(objM19321a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r9$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f16159b;

        /* JADX INFO: renamed from: c */
        public int f16160c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f16161d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ URL f16163f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, Continuation continuation) {
            super(2, continuation);
            this.f16163f = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C4024r9.this.new d(this.f16163f, continuation);
            dVar.f16161d = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C4024r9 c4024r9;
            d dVar;
            URL url;
            Throwable th;
            Object objM44946constructorimpl;
            ChartboostError unknown;
            ChartboostError chartboostError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16160c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c4024r9 = C4024r9.this;
                URL url2 = this.f16163f;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC3917md interfaceC3917md = c4024r9.f16144r;
                    String string = url2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.f16161d = c4024r9;
                    this.f16159b = url2;
                    this.f16160c = 1;
                    dVar = this;
                    try {
                        Object objM18645a = InterfaceC3917md.a.m18645a(interfaceC3917md, string, null, dVar, 2, null);
                        if (objM18645a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        url = url2;
                        obj = objM18645a;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar = this;
                    th = th;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) this.f16159b;
                c4024r9 = (C4024r9) this.f16161d;
                try {
                    ResultKt.throwOnFailure(obj);
                    dVar = this;
                } catch (Throwable th4) {
                    th = th4;
                    dVar = this;
                    Result.Companion companion4 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
            }
            C4006qd c4006qd = (C4006qd) obj;
            if (!c4006qd.m19168f()) {
                Throwable thM19166d = c4006qd.m19166d();
                if (thM19166d != null) {
                    throw thM19166d;
                }
                throw new IOException("Failed to download image: " + c4006qd.m19167e());
            }
            byte[] bArrM19164b = c4006qd.m19164b();
            if (bArrM19164b == null) {
                throw new IOException("Response body was null for URL: " + url);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM19164b);
            try {
                c4024r9.m19322a(BitmapFactory.decodeStream(byteArrayInputStream));
                if (c4024r9.m19324y() == null) {
                    throw new IOException("Failed to decode image from URL: " + url);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(byteArrayInputStream, null);
                objM44946constructorimpl = Result.m44946constructorimpl(unit);
                URL url3 = dVar.f16163f;
                Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                if (thM44949exceptionOrNullimpl == null) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m44945boximpl(Result.m44946constructorimpl(Unit.INSTANCE));
                }
                C4048sb.m19410b("Failed to load image from URL: " + url3, thM44949exceptionOrNullimpl);
                if (thM44949exceptionOrNullimpl instanceof ChartboostError) {
                    chartboostError = (ChartboostError) thM44949exceptionOrNullimpl;
                } else {
                    if (thM44949exceptionOrNullimpl instanceof IOException) {
                        unknown = new ChartboostError.Load.AssetUnavailable(url3.toString(), "Failed to load image from URL: " + url3, thM44949exceptionOrNullimpl);
                    } else {
                        unknown = new ChartboostError.Load.Unknown("Failed to load image from URL: " + url3, thM44949exceptionOrNullimpl);
                    }
                    chartboostError = unknown;
                }
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(chartboostError)));
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(byteArrayInputStream, th5);
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024r9(Context context, URL imageUrl, C4085u4 c4085u4, C4008qf renderableConfig, C4168y adMarkupConfig, InterfaceC3917md networkClient, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, EnumC4036s adFormat, Mediation mediation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f16141o = context;
        this.f16142p = imageUrl;
        this.f16143q = c4085u4;
        this.f16144r = networkClient;
        this.f16145s = mediation;
        this.f16146t = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImageView mo17327k() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return this.f16147u;
        }
        throw new IllegalStateException("nextAd() must be called from the main thread for ImageRenderable.".toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public Object mo17313a(Context context, Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f16151d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f16151d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f16149b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f16151d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            b bVar = new b(null);
            aVar.f16151d = 1;
            objWithContext = BuildersKt.withContext(main, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19321a(URL url, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f16158d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f16158d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.f16156b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f16158d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io = Dispatchers.getIO();
            d dVar = new d(url, null);
            cVar.f16158d = 1;
            objWithContext = BuildersKt.withContext(io, dVar, cVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m19322a(Bitmap bitmap) {
        this.f16148v = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final void m19323a(ImageView imageView) {
        this.f16147u = imageView;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17319a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ImageView imageView = this.f16147u;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f16147u = null;
        Bitmap bitmap = this.f16148v;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.f16148v = null;
        C4048sb.m19408a("ImageRenderable stopped for URL: " + this.f16142p + ". Reason: " + reason + ". Resources cleaned up.", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: y */
    public final Bitmap m19324y() {
        return this.f16148v;
    }

    /* JADX INFO: renamed from: z */
    public final ImageView m19325z() {
        return this.f16147u;
    }
}
