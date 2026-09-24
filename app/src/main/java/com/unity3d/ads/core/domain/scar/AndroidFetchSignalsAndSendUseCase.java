package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.p299v1.AdFormatOuterClass;
import gatewayprotocol.p299v1.UniversalResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J+\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/scar/AndroidFetchSignalsAndSendUseCase;", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "handleGetTokenRequest", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scarEligibleEffectiveUseCase", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "getTags", "", "", "formats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "invoke", "", "tokenNumber", "", "tokenId", "Lcom/google/protobuf/ByteString;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/google/protobuf/ByteString;Lcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
    private final ScarManager scarManager;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2 */
    /* JADX INFO: compiled from: AndroidFetchSignalsAndSendUseCase.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", m43504f = "AndroidFetchSignalsAndSendUseCase.kt", m43505i = {0, 0, 1, 1}, m43506l = {35, 56}, m43507m = "invokeSuspend", m43508n = {"requestedSignals", "startTime", "requestedSignals", "uploadStartTime"}, m43509s = {"L$0", "J$0", "L$0", "J$0"})
    static final class C146182 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ ByteString $tokenId;
        final /* synthetic */ int $tokenNumber;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146182(TokenConfiguration tokenConfiguration, int i, ByteString byteString, Continuation<? super C146182> continuation) {
            super(2, continuation);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i;
            this.$tokenId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidFetchSignalsAndSendUseCase.this.new C146182(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:60:0x0134  */
        /* JADX WARN: Code duplicated, block: B:67:0x0143  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            List<AdFormatOuterClass.AdFormat> list;
            Object signals;
            Object objM44946constructorimpl;
            long j2;
            List<AdFormatOuterClass.AdFormat> list2;
            Object objInvoke;
            Object objM44946constructorimpl2;
            UniversalResponseOuterClass.UniversalResponse universalResponse;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        long jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
                        List<AdFormatOuterClass.AdFormat> listInvoke = AndroidFetchSignalsAndSendUseCase.this.scarEligibleEffectiveUseCase.invoke(this.$tokenConfiguration);
                        if (listInvoke.isEmpty()) {
                            return Unit.INSTANCE;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, Boxing.boxInt(this.$tokenNumber), 30, null);
                        AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = AndroidFetchSignalsAndSendUseCase.this;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            C146182 c146182 = this;
                            ScarManager scarManager = androidFetchSignalsAndSendUseCase.scarManager;
                            this.L$0 = listInvoke;
                            this.J$0 = jM46400markNowz9LOYto;
                            this.label = 1;
                            signals = scarManager.getSignals(listInvoke, this);
                            if (signals != coroutine_suspended) {
                                j = jM46400markNowz9LOYto;
                                list = listInvoke;
                            }
                        } catch (Throwable th) {
                            th = th;
                            j = jM46400markNowz9LOYto;
                            list = listInvoke;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = this.J$0;
                        list2 = (List) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objInvoke = obj;
                            objM44946constructorimpl2 = Result.m44946constructorimpl(objInvoke);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion3 = Result.INSTANCE;
                            objM44946constructorimpl2 = Result.m44946constructorimpl(ResultKt.createFailure(th));
                        }
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m44952isFailureimpl(objM44946constructorimpl2) ? null : objM44946constructorimpl2);
                        if (universalResponse != null || universalResponse.hasError()) {
                            str = "native_scar_signals_upload_failure_time";
                        } else {
                            str = "native_scar_signals_upload_success_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j2))), AndroidFetchSignalsAndSendUseCase.this.getTags(list2), null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                        return Unit.INSTANCE;
                    }
                    j = this.J$0;
                    list = (List) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        signals = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion4 = Result.INSTANCE;
                        objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                    }
                    objM44946constructorimpl = Result.m44946constructorimpl(signals);
                    if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
                        objM44946constructorimpl = null;
                    }
                    BiddingSignals biddingSignals = (BiddingSignals) objM44946constructorimpl;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, biddingSignals != null ? "native_scar_signals_collection_success_time" : "native_scar_signals_collection_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j))), AndroidFetchSignalsAndSendUseCase.this.getTags(list), null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                    if (biddingSignals == null) {
                        return Unit.INSTANCE;
                    }
                    long jM46400markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_upload_started", null, null, null, null, Boxing.boxInt(this.$tokenNumber), 30, null);
                    AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase2 = AndroidFetchSignalsAndSendUseCase.this;
                    ByteString byteString = this.$tokenId;
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        C146182 c146183 = this;
                        HandleGetTokenRequest handleGetTokenRequest = androidFetchSignalsAndSendUseCase2.handleGetTokenRequest;
                        this.L$0 = list;
                        this.J$0 = jM46400markNowz9LOYto2;
                        this.label = 2;
                        objInvoke = handleGetTokenRequest.invoke(byteString, biddingSignals, this);
                        if (objInvoke != coroutine_suspended) {
                            j2 = jM46400markNowz9LOYto2;
                            list2 = list;
                            objM44946constructorimpl2 = Result.m44946constructorimpl(objInvoke);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m44952isFailureimpl(objM44946constructorimpl2) ? null : objM44946constructorimpl2);
                            if (universalResponse != null) {
                                str = "native_scar_signals_upload_failure_time";
                            } else {
                                str = "native_scar_signals_upload_failure_time";
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j2))), AndroidFetchSignalsAndSendUseCase.this.getTags(list2), null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        j2 = jM46400markNowz9LOYto2;
                        list2 = list;
                        Result.Companion companion6 = Result.INSTANCE;
                        objM44946constructorimpl2 = Result.m44946constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        }
    }

    public AndroidFetchSignalsAndSendUseCase(CoroutineScope scope, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(handleGetTokenRequest, "handleGetTokenRequest");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = scope;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> formats) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i, ByteString byteString, TokenConfiguration tokenConfiguration, Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C146182(tokenConfiguration, i, byteString, null), 3, null);
        return Unit.INSTANCE;
    }
}
