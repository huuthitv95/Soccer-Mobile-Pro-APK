package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.p299v1.AdFormatOuterClass;
import gatewayprotocol.p299v1.HeaderBiddingTokenOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "fetchSignalsAndSendUseCase", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "scarEligibleEffectiveUseCase", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "invoke", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 */
    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", m43504f = "CommonGetHeaderBiddingToken.kt", m43505i = {0, 0, 0, 0, 1}, m43506l = {15, 18}, m43507m = "invoke", m43508n = {"this", "tokenConfiguration", "scarEligibleEffectiveList", "tokenNumber", "rawToken"}, m43509s = {"L$0", "L$1", "L$2", "I$0", "L$0"})
    static final class C145261 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C145261(Continuation<? super C145261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        Intrinsics.checkNotNullParameter(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    public Object invoke(int i, TokenConfiguration tokenConfiguration, Continuation<? super String> continuation) throws Throwable {
        C145261 c145261;
        TokenConfiguration tokenConfiguration2;
        List<AdFormatOuterClass.AdFormat> list;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken2;
        if (continuation instanceof C145261) {
            c145261 = (C145261) continuation;
            if ((c145261.label & Integer.MIN_VALUE) != 0) {
                c145261.label -= Integer.MIN_VALUE;
            } else {
                c145261 = new C145261(continuation);
            }
        } else {
            c145261 = new C145261(continuation);
        }
        Object obj = c145261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c145261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<AdFormatOuterClass.AdFormat> listInvoke = this.scarEligibleEffectiveUseCase.invoke(tokenConfiguration);
            BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
            boolean z = !listInvoke.isEmpty();
            c145261.L$0 = this;
            c145261.L$1 = tokenConfiguration;
            c145261.L$2 = listInvoke;
            c145261.I$0 = i;
            c145261.label = 1;
            Object objInvoke = buildHeaderBiddingToken.invoke(i, tokenConfiguration, z, c145261);
            if (objInvoke != coroutine_suspended) {
                tokenConfiguration2 = tokenConfiguration;
                list = listInvoke;
                obj = objInvoke;
                commonGetHeaderBiddingToken = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            i = c145261.I$0;
            list = (List) c145261.L$2;
            tokenConfiguration2 = (TokenConfiguration) c145261.L$1;
            commonGetHeaderBiddingToken = (CommonGetHeaderBiddingToken) c145261.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            headerBiddingToken2 = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) c145261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        headerBiddingToken = headerBiddingToken2;
        ByteString byteString = headerBiddingToken.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString, "rawToken.toByteString()");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null);
        headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj;
        if (!list.isEmpty()) {
            FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase = commonGetHeaderBiddingToken.fetchSignalsAndSendUseCase;
            ByteString tokenId = headerBiddingToken.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "rawToken.tokenId");
            c145261.L$0 = headerBiddingToken;
            c145261.L$1 = null;
            c145261.L$2 = null;
            c145261.label = 2;
            if (fetchSignalsAndSendUseCase.invoke(i, tokenId, tokenConfiguration2, c145261) != coroutine_suspended) {
                headerBiddingToken2 = headerBiddingToken;
                headerBiddingToken = headerBiddingToken2;
            }
            return coroutine_suspended;
        }
        ByteString byteString2 = headerBiddingToken.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString2, "rawToken.toByteString()");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null);
    }
}
