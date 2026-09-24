package com.chartboost.sdk.internal.Networking.okhttp;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.AbstractC4094ud;
import com.chartboost.sdk.impl.C4006qd;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.InterfaceC3917md;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p300io.CloseableKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB%\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0096@¢\u0006\u0004\b\t\u0010\u000bJ@\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m43475d2 = {"Lcom/chartboost/sdk/internal/Networking/okhttp/OkHttpNetworkClient;", "Lcom/chartboost/sdk/impl/md;", "", "url", "jsonBody", "", "headers", "contentType", "Lcom/chartboost/sdk/impl/qd;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "method", "Lokhttp3/RequestBody;", "requestBody", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "", "connectTimeoutSecs", "writeTimeoutSecs", "readTimeoutSecs", "<init>", "(JJJ)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class OkHttpNetworkClient implements InterfaceC3917md {
    public static volatile Interceptor customInterceptor;
    private final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient$b */
    public static final class C4216b extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f17179b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f17180c;

        /* JADX INFO: renamed from: e */
        public int f17182e;

        public C4216b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17180c = obj;
            this.f17182e |= Integer.MIN_VALUE;
            return OkHttpNetworkClient.this.m20177a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient$c */
    public static final class C4217c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17183b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f17185d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Map f17186e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4217c(String str, Map map, Continuation continuation) {
            super(2, continuation);
            this.f17185d = str;
            this.f17186e = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C4217c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OkHttpNetworkClient.this.new C4217c(this.f17185d, this.f17186e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17183b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            OkHttpNetworkClient okHttpNetworkClient = OkHttpNetworkClient.this;
            String str = this.f17185d;
            Map map = this.f17186e;
            this.f17183b = 1;
            Object objM20174a = OkHttpNetworkClient.m20174a(okHttpNetworkClient, str, map, "GET", null, this, 8, null);
            return objM20174a == coroutine_suspended ? coroutine_suspended : objM20174a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient$d */
    public static final class C4218d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17187b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17188c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f17189d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ OkHttpNetworkClient f17190e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f17191f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Map f17192g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4218d(String str, String str2, OkHttpNetworkClient okHttpNetworkClient, String str3, Map map, Continuation continuation) {
            super(2, continuation);
            this.f17188c = str;
            this.f17189d = str2;
            this.f17190e = okHttpNetworkClient;
            this.f17191f = str3;
            this.f17192g = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C4218d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C4218d(this.f17188c, this.f17189d, this.f17190e, this.f17191f, this.f17192g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17187b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MediaType.Companion companion = MediaType.INSTANCE;
            String str = this.f17188c;
            if (str == null) {
                str = "application/json; charset=utf-8";
            }
            RequestBody requestBodyCreate = RequestBody.INSTANCE.create(this.f17189d, companion.get(str));
            OkHttpNetworkClient okHttpNetworkClient = this.f17190e;
            String str2 = this.f17191f;
            Map map = this.f17192g;
            this.f17187b = 1;
            Object objM20176a = okHttpNetworkClient.m20176a(str2, map, "POST", requestBodyCreate, this);
            return objM20176a == coroutine_suspended ? coroutine_suspended : objM20176a;
        }
    }

    public OkHttpNetworkClient(long j, long j2, long j3) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(j, timeUnit).writeTimeout(j2, timeUnit).readTimeout(j3, timeUnit);
        Interceptor interceptor = customInterceptor;
        if (interceptor != null) {
            C4048sb.m19408a("Adding custom networking interceptor: " + interceptor.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
            timeout.addInterceptor(interceptor);
        }
        this.okHttpClient = timeout.build();
    }

    public /* synthetic */ OkHttpNetworkClient(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) != 0 ? 5L : j2, (i & 4) != 0 ? 5L : j3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m20174a(OkHttpNetworkClient okHttpNetworkClient, String str, Map map, String str2, RequestBody requestBody, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            requestBody = null;
        }
        return okHttpNetworkClient.m20176a(str, map, str2, requestBody, continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3917md
    /* JADX INFO: renamed from: a */
    public Object mo18643a(String str, String str2, Map map, String str3, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C4218d(str3, str2, this, str, map, null), continuation);
    }

    /* JADX INFO: renamed from: a */
    public final Object m20176a(String str, Map map, String str2, RequestBody requestBody, Continuation continuation) {
        try {
            Request.Builder builderMethod = new Request.Builder().url(str).method(str2, requestBody);
            for (Map.Entry entry : map.entrySet()) {
                builderMethod.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            return m20177a(builderMethod.build(), continuation);
        } catch (IllegalArgumentException e) {
            C4048sb.m19407a("Invalid URL: " + str, e);
            String message = e.getMessage();
            if (message == null) {
                message = "malformed URL";
            }
            return new C4006qd(false, -1, null, new ChartboostError.Connectivity.Unknown("Invalid URL: " + message, e), null, 20, null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3917md
    /* JADX INFO: renamed from: a */
    public Object mo18644a(String str, Map map, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C4217c(str, map, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m20177a(Request request, Continuation continuation) throws Throwable {
        C4216b c4216b;
        String str;
        MediaType contentType;
        Charset charsetCharset$default;
        if (continuation instanceof C4216b) {
            c4216b = (C4216b) continuation;
            int i = c4216b.f17182e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4216b.f17182e = i - Integer.MIN_VALUE;
            } else {
                c4216b = new C4216b(continuation);
            }
        } else {
            c4216b = new C4216b(continuation);
        }
        Object objM19587a = c4216b.f17180c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4216b.f17182e;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM19587a);
                OkHttpClient okHttpClient = this.okHttpClient;
                c4216b.f17179b = request;
                c4216b.f17182e = 1;
                objM19587a = AbstractC4094ud.m19587a(okHttpClient, request, c4216b);
                if (objM19587a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM19587a);
            }
            Closeable closeable = (Closeable) objM19587a;
            try {
                Response response = (Response) closeable;
                boolean zIsSuccessful = response.isSuccessful();
                ResponseBody responseBodyBody = response.body();
                C4006qd c4006qd = new C4006qd(zIsSuccessful, response.code(), responseBodyBody != null ? responseBodyBody.bytes() : null, !zIsSuccessful ? AbstractC4219a.f17193c.m20184b(response.code()) : null, (responseBodyBody == null || (contentType = responseBodyBody.getContentType()) == null || (charsetCharset$default = MediaType.charset$default(contentType, null, 1, null)) == null) ? null : charsetCharset$default.name());
                CloseableKt.closeFinally(closeable, null);
                return c4006qd;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(closeable, th);
                    throw th2;
                }
            }
        } catch (SocketTimeoutException e) {
            C4048sb.m19407a("SocketTimeoutException while making network request to " + request.url(), e);
            return new C4006qd(false, -1, null, ChartboostError.Connectivity.TimedOut.INSTANCE, null, 20, null);
        } catch (UnknownHostException e2) {
            C4048sb.m19407a("UnknownHostException while making network request to " + request.url(), e2);
            String message = e2.getMessage();
            if (message != null) {
                str = "Unknown host: " + message;
                if (str == null) {
                    str = "Unknown host";
                }
            } else {
                str = "Unknown host";
            }
            return new C4006qd(false, -1, null, new ChartboostError.Connectivity.NetworkError(str, e2), null, 20, null);
        } catch (IOException e3) {
            C4048sb.m19407a("IOException while making network request to " + request.url(), e3);
            String message2 = e3.getMessage();
            if (message2 == null) {
                message2 = "Network error";
            }
            return new C4006qd(false, -1, null, new ChartboostError.Connectivity.NetworkError(message2, e3), null, 20, null);
        } catch (Exception e4) {
            C4048sb.m19407a("Exception while making network request to " + request.url(), e4);
            String message3 = e4.getMessage();
            if (message3 == null) {
                message3 = "Unknown error";
            }
            return new C4006qd(false, -1, null, new ChartboostError.Connectivity.Unknown(message3, e4), null, 20, null);
        }
    }
}
