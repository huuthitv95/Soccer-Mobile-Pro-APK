package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.ByteStreamsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidExecuteAdViewerRequest;", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/GetCachedAsset;)V", "createRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "parameters", "", "", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;)Lcom/unity3d/services/core/network/model/HttpRequest;", "invoke", "Lcom/unity3d/services/core/network/model/HttpResponse;", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final CoroutineDispatcher ioDispatcher;

    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2 */
    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", m43504f = "AndroidExecuteAdViewerRequest.kt", m43505i = {}, m43506l = {28, 29}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144822 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;
        final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144822(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, Continuation<? super C144822> continuation) {
            super(2, continuation);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C144822(this.$parameters, this.this$0, this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
            return ((C144822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM44946constructorimpl;
            Object objInvoke;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object orNull = ArraysKt.getOrNull(this.$parameters, 1);
                byte[] bytes = null;
                String str = orNull instanceof String ? (String) orNull : null;
                if (str == null) {
                    str = "";
                }
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Uri uri = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
                    objM44946constructorimpl = Result.m44946constructorimpl(uri);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
                    objM44946constructorimpl = null;
                }
                Uri uri2 = (Uri) objM44946constructorimpl;
                if (uri2 != null) {
                    if (this.$type != RequestType.GET) {
                        uri2 = null;
                    }
                    if (uri2 != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri2, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        bytes = ByteStreamsKt.readBytes(data);
                    }
                }
                byte[] bArr = bytes;
                if (bArr != null) {
                    return new HttpResponse(bArr, 0, null, null, null, null, 0L, 126, null);
                }
                this.label = 1;
                objInvoke = this.this$0.httpClientProvider.invoke(this);
                if (objInvoke != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            objInvoke = obj;
            this.label = 2;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, this.this$0.createRequest(this.$type, this.$parameters), false, this, 2, null);
            return objExecute$default == coroutine_suspended ? coroutine_suspended : objExecute$default;
        }
    }

    public AndroidExecuteAdViewerRequest(CoroutineDispatcher ioDispatcher, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType type, Object[] parameters) {
        Map<String, List<String>> mapEmptyMap;
        Map<String, List<String>> mapEmptyMap2;
        String str = (String) ArraysKt.getOrNull(parameters, 1);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) ArraysKt.getOrNull(parameters, 2);
            Integer num = (Integer) ArraysKt.getOrNull(parameters, 3);
            Integer num2 = (Integer) ArraysKt.getOrNull(parameters, 4);
            if (jSONArray == null || (mapEmptyMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new HttpRequest(str, null, type, null, mapEmptyMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str3 = (String) ArraysKt.getOrNull(parameters, 2);
        JSONArray jSONArray2 = (JSONArray) ArraysKt.getOrNull(parameters, 3);
        Integer num3 = (Integer) ArraysKt.getOrNull(parameters, 4);
        Integer num4 = (Integer) ArraysKt.getOrNull(parameters, 5);
        if (jSONArray2 == null || (mapEmptyMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        return new HttpRequest(str, null, type, str3, mapEmptyMap2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, Continuation<? super HttpResponse> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C144822(objArr, this, requestType, null), continuation);
    }
}
