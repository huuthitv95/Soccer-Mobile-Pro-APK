package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.C11744X3;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.p299v1.AdRequestOuterClass;
import gatewayprotocol.p299v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p299v1.ErrorOuterClass;
import gatewayprotocol.p299v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidLoad.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eH\u0002JC\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010!\u001a\u00020\"H\u0096Bø\u0001\u0000¢\u0006\u0002\u00103R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "validateExtrasSize", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;)V", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "handleGatewayException", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "incrementLoadRequestAdmCount", "", C11744X3.f26161w, "incrementLoadRequestCount", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "context", "Landroid/content/Context;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "bannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ValidateExtrasSize validateExtrasSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2 */
    /* JADX INFO: compiled from: AndroidLoad.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", m43504f = "AndroidLoad.kt", m43505i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, m43506l = {88, 92, 109, 113, 152}, m43507m = "invokeSuspend", m43508n = {"$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", "$this$withContext", "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv"}, m43509s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0"})
    static final class C145142 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoadResult>, Object> {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145142(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, Continuation<? super C145142> continuation) {
            super(2, continuation);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145142 c145142 = AndroidLoad.this.new C145142(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
            c145142.L$0 = obj;
            return c145142;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoadResult> continuation) {
            return ((C145142) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x02f0 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:123:0x03fc, B:125:0x0402, B:127:0x0410, B:128:0x0425, B:129:0x042e, B:132:0x0433, B:133:0x0438, B:96:0x0296, B:100:0x02c4, B:102:0x02f0, B:104:0x0309, B:107:0x0311, B:109:0x032b, B:111:0x0394, B:112:0x03a0, B:114:0x03ad, B:115:0x03be, B:116:0x03c4, B:120:0x03de, B:95:0x028c, B:21:0x0058, B:81:0x023d, B:67:0x0193, B:71:0x01c1, B:66:0x0189, B:29:0x0088, B:52:0x013c, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f5, B:48:0x0106, B:73:0x01f3, B:75:0x0211, B:77:0x0218, B:43:0x00c7), top: B:146:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0309 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:123:0x03fc, B:125:0x0402, B:127:0x0410, B:128:0x0425, B:129:0x042e, B:132:0x0433, B:133:0x0438, B:96:0x0296, B:100:0x02c4, B:102:0x02f0, B:104:0x0309, B:107:0x0311, B:109:0x032b, B:111:0x0394, B:112:0x03a0, B:114:0x03ad, B:115:0x03be, B:116:0x03c4, B:120:0x03de, B:95:0x028c, B:21:0x0058, B:81:0x023d, B:67:0x0193, B:71:0x01c1, B:66:0x0189, B:29:0x0088, B:52:0x013c, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f5, B:48:0x0106, B:73:0x01f3, B:75:0x0211, B:77:0x0218, B:43:0x00c7), top: B:146:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x030f  */
        /* JADX WARN: Code duplicated, block: B:109:0x032b A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:123:0x03fc, B:125:0x0402, B:127:0x0410, B:128:0x0425, B:129:0x042e, B:132:0x0433, B:133:0x0438, B:96:0x0296, B:100:0x02c4, B:102:0x02f0, B:104:0x0309, B:107:0x0311, B:109:0x032b, B:111:0x0394, B:112:0x03a0, B:114:0x03ad, B:115:0x03be, B:116:0x03c4, B:120:0x03de, B:95:0x028c, B:21:0x0058, B:81:0x023d, B:67:0x0193, B:71:0x01c1, B:66:0x0189, B:29:0x0088, B:52:0x013c, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f5, B:48:0x0106, B:73:0x01f3, B:75:0x0211, B:77:0x0218, B:43:0x00c7), top: B:146:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0394 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:123:0x03fc, B:125:0x0402, B:127:0x0410, B:128:0x0425, B:129:0x042e, B:132:0x0433, B:133:0x0438, B:96:0x0296, B:100:0x02c4, B:102:0x02f0, B:104:0x0309, B:107:0x0311, B:109:0x032b, B:111:0x0394, B:112:0x03a0, B:114:0x03ad, B:115:0x03be, B:116:0x03c4, B:120:0x03de, B:95:0x028c, B:21:0x0058, B:81:0x023d, B:67:0x0193, B:71:0x01c1, B:66:0x0189, B:29:0x0088, B:52:0x013c, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f5, B:48:0x0106, B:73:0x01f3, B:75:0x0211, B:77:0x0218, B:43:0x00c7), top: B:146:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:114:0x03ad A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #5 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:123:0x03fc, B:125:0x0402, B:127:0x0410, B:128:0x0425, B:129:0x042e, B:132:0x0433, B:133:0x0438, B:96:0x0296, B:100:0x02c4, B:102:0x02f0, B:104:0x0309, B:107:0x0311, B:109:0x032b, B:111:0x0394, B:112:0x03a0, B:114:0x03ad, B:115:0x03be, B:116:0x03c4, B:120:0x03de, B:95:0x028c, B:21:0x0058, B:81:0x023d, B:67:0x0193, B:71:0x01c1, B:66:0x0189, B:29:0x0088, B:52:0x013c, B:33:0x0099, B:35:0x00a5, B:37:0x00bb, B:42:0x00c4, B:44:0x00c9, B:46:0x00f5, B:48:0x0106, B:73:0x01f3, B:75:0x0211, B:77:0x0218, B:43:0x00c7), top: B:146:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0173  */
        /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:87:0x0275  */
        /* JADX WARN: Code duplicated, block: B:98:0x02bf  */
        /* JADX WARN: Code duplicated, block: B:99:0x02c2  */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x03f9, code lost:
        
            if (r0 == r9) goto L122;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v3, types: [int] */
        /* JADX WARN: Type inference failed for: r12v4, types: [int] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20, types: [int] */
        /* JADX WARN: Type inference failed for: r3v23, types: [int] */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v29 */
        /* JADX WARN: Type inference failed for: r3v30 */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1090
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.C145142.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidLoad(CoroutineDispatcher defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        Intrinsics.checkNotNullParameter(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(handleGatewayAdResponse, "handleGatewayAdResponse");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(validateExtrasSize, "validateExtrasSize");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString opportunityId, String placement, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, UnityAdsLoadOptions loadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(opportunityId, placement, EMPTY, false, null, null, null, false, null, null, null, loadOptions, isHeaderBidding, adType, null, null, null, null, null, 509432, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException e) {
        ErrorOuterClass.PublicErrorCode errorCode;
        String loadErrorMsg;
        ErrorOuterClass.PublicErrorCode errorCode2;
        boolean z = e instanceof NetworkTimeoutException;
        if (z) {
            errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
        } else if (!(e instanceof GatewayException) || (errorCode = ((GatewayException) e).getErrorCode()) == null) {
            errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode = errorCode;
        if (z) {
            loadErrorMsg = UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT;
        } else if (!(e instanceof GatewayException) || (errorCode2 = ((GatewayException) e).getErrorCode()) == null || (loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(errorCode2)) == null) {
            loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
        }
        return new LoadResult.Failure(publicErrorCode, loadErrorMsg, e, z ? "timeout" : "gateway", e.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, Continuation<? super LoadResult> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new C145142(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), continuation);
    }
}
