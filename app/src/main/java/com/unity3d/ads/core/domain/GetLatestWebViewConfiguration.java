package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JG\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "webviewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "invoke", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "", "receivedType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1 */
    /* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", m43504f = "GetLatestWebViewConfiguration.kt", m43505i = {0, 0, 0, 0, 0, 1}, m43506l = {17, 33}, m43507m = "invoke", m43508n = {"this", "receivedEntryPoint", "receivedVersion", "receivedAdditionalFiles", "receivedType", "result"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    static final class C145341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C145341(Continuation<? super C145341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetLatestWebViewConfiguration.this.invoke(null, null, null, null, this);
        }
    }

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        Intrinsics.checkNotNullParameter(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, str2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object invoke(String str, Integer num, List<String> list, String str2, Continuation<? super WebViewConfiguration> continuation) throws Throwable {
        C145341 c145341;
        GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        if (continuation instanceof C145341) {
            c145341 = (C145341) continuation;
            if ((c145341.label & Integer.MIN_VALUE) != 0) {
                c145341.label -= Integer.MIN_VALUE;
            } else {
                c145341 = new C145341(continuation);
            }
        } else {
            c145341 = new C145341(continuation);
        }
        Object obj = c145341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145341.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
            c145341.L$0 = this;
            c145341.L$1 = str;
            c145341.L$2 = num;
            c145341.L$3 = list;
            c145341.L$4 = str2;
            c145341.label = 1;
            obj = webviewConfigurationDataSource.get(c145341);
            if (obj != coroutine_suspended) {
                getLatestWebViewConfiguration = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WebViewConfiguration webViewConfiguration = (WebViewConfiguration) c145341.L$0;
            ResultKt.throwOnFailure(obj);
            return webViewConfiguration;
        }
        str2 = (String) c145341.L$4;
        list = (List) c145341.L$3;
        num = (Integer) c145341.L$2;
        str = (String) c145341.L$1;
        getLatestWebViewConfiguration = (GetLatestWebViewConfiguration) c145341.L$0;
        ResultKt.throwOnFailure(obj);
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
        int version = webViewConfigurationStore.getVersion();
        String entryPoint = webViewConfigurationStore.getEntryPoint();
        Intrinsics.checkNotNullExpressionValue(entryPoint, "it.entryPoint");
        List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
        Intrinsics.checkNotNullExpressionValue(additionalFilesList, "it.additionalFilesList");
        String type = webViewConfigurationStore.getType();
        Intrinsics.checkNotNullExpressionValue(type, "it.type");
        WebViewConfiguration webViewConfiguration2 = new WebViewConfiguration(version, entryPoint, additionalFilesList, type);
        if (str == null && num == null && list == null && str2 == null) {
            return webViewConfiguration2;
        }
        int iIntValue = num != null ? num.intValue() : webViewConfiguration2.getVersion();
        if (str == null) {
            str = webViewConfiguration2.getEntryPoint();
        }
        if (list == null) {
            list = webViewConfiguration2.getAdditionalFiles();
        }
        if (str2 == null) {
            str2 = webViewConfiguration2.getType();
        }
        WebViewConfiguration webViewConfiguration3 = new WebViewConfiguration(iIntValue, str, list, str2);
        if (!Intrinsics.areEqual(webViewConfiguration3, webViewConfiguration2)) {
            WebviewConfigurationDataSource webviewConfigurationDataSource2 = getLatestWebViewConfiguration.webviewConfigurationDataSource;
            WebviewConfigurationStore.WebViewConfigurationStore.Builder builderNewBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
            builderNewBuilder.setVersion(webViewConfiguration3.getVersion());
            builderNewBuilder.setEntryPoint(webViewConfiguration3.getEntryPoint());
            builderNewBuilder.addAllAdditionalFiles(webViewConfiguration3.getAdditionalFiles());
            builderNewBuilder.setType(webViewConfiguration3.getType());
            WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStoreBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(webViewConfigurationStoreBuild, "newBuilder().apply {\n   …                }.build()");
            c145341.L$0 = webViewConfiguration3;
            c145341.L$1 = null;
            c145341.L$2 = null;
            c145341.L$3 = null;
            c145341.L$4 = null;
            c145341.label = 2;
            if (webviewConfigurationDataSource2.set(webViewConfigurationStoreBuild, c145341) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return webViewConfiguration3;
    }
}
