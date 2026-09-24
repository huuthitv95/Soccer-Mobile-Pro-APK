package com.unity3d.ads.core.domain.scar;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: CommonScarEventReceiver.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J9\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "_gmaEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "_versionFlow", "", "gmaEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getGmaEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "versionFlow", "getVersionFlow", "canSend", "", "sendEvent", "eventCategory", "", "eventId", "params", "", "", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonScarEventReceiver implements IEventSender {
    private final MutableSharedFlow<GmaEventData> _gmaEventFlow;
    private final MutableSharedFlow<String> _versionFlow;
    private final SharedFlow<GmaEventData> gmaEventFlow;
    private final CoroutineScope scope;
    private final SharedFlow<String> versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1 */
    /* JADX INFO: compiled from: CommonScarEventReceiver.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", m43504f = "CommonScarEventReceiver.kt", m43505i = {}, m43506l = {35, 41, 52, 66, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C146191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146191(Enum<?> r1, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, Continuation<? super C146191> continuation) {
            super(2, continuation);
            this.$eventId = r1;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146191(this.$eventId, this.$params, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0102  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r3.emit(r2, r20) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        
            if (r3.emit(r10, r20) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
        
            if (r3.emit(r10, r20) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
        
            if (r2.emit(new com.unity3d.ads.core.domain.scar.GmaEventData(r11, r12, (java.lang.String) r4, null, null, null, null, 120, null), r20) == r1) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.C146191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CommonScarEventReceiver(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._versionFlow = mutableSharedFlowMutableSharedFlow$default;
        this.versionFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<GmaEventData> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._gmaEventFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.gmaEventFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final SharedFlow<GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final SharedFlow<String> getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!CollectionsKt.contains(SetsKt.setOf((Object[]) new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C146191(eventId, params, this, null), 3, null);
        return true;
    }
}
