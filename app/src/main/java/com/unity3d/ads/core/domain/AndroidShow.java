package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: AndroidShow.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "gameServerIdReader", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "validateExtrasSize", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "terminate", "", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final ValidateExtrasSize validateExtrasSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1 */
    /* JADX INFO: compiled from: AndroidShow.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", m43504f = "AndroidShow.kt", m43505i = {}, m43506l = {63}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C145171 extends SuspendLambda implements Function2<FlowCollector<? super ShowEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
        @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", m43504f = "AndroidShow.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<FlowCollector<? super ShowEvent>, Continuation<? super Unit>, Object> {
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$ad, this.this$0, this.$adObject, this.$showOptions, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                JSONObject data;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AdObject adObject = this.$ad;
                GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                Object playerServerId = this.$ad.getPlayerServerId();
                Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj2 != null) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
                    if (!(obj2 instanceof String)) {
                        obj2 = playerServerId;
                    }
                    if (obj2 != null) {
                        playerServerId = obj2;
                    }
                }
                Object obj3 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj3 != null) {
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(key)");
                    gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                }
                adObject.setPlayerServerId((String) playerServerId);
                this.$adObject.getState().setValue(AdObjectState.SHOWING);
                AdPlayer adPlayer = this.$ad.getAdPlayer();
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                adPlayer.show(new AndroidShowOptions((unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null) ? null : JSONObjectExtensionsKt.toBuiltInMap(data), this.$ad.getPlacementId(), this.$ad.isScarAd(), this.$ad.getScarQueryId(), this.$ad.getScarAdString(), this.$ad.getScarAdUnitId(), this.$ad.isOfferwallAd(), this.$ad.getOfferwallPlacementName()));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @Metadata(m43474d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
        @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", m43504f = "AndroidShow.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super ShowEvent>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AdObject adObject, AndroidShow androidShow, ByteString byteString, Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass4(this.$adObject, this.this$0, this.$opportunityId, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @Metadata(m43474d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
        @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", m43504f = "AndroidShow.kt", m43505i = {0}, m43506l = {60}, m43507m = "invokeSuspend", m43508n = {"it"}, m43509s = {"L$0"})
        static final class AnonymousClass5 extends SuspendLambda implements Function3<FlowCollector<? super ShowEvent>, ShowEvent, Continuation<? super Boolean>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, ShowEvent showEvent, Continuation<? super Boolean> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = flowCollector;
                anonymousClass5.L$1 = showEvent;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ShowEvent showEvent;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (flowCollector.emit(showEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145171(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, Continuation<? super C145171> continuation) {
            super(2, continuation);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145171 c145171 = new C145171(this.$adObject, this.this$0, this.$showOptions, continuation);
            c145171.L$0 = obj;
            return c145171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Continuation<? super Unit> continuation) {
            return ((C145171) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShowConfigurationInternal showConfigurationInternal;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId".toString());
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad = this.this$0.adRepository.getAd(opportunityId);
                if (ad == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                if (unityAdsShowOptions != null && (showConfigurationInternal = unityAdsShowOptions.showConfiguration) != null) {
                    this.this$0.validateExtrasSize.invoke(showConfigurationInternal.getExtras(), "show", this.$adObject);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                this.label = 1;
                if (FlowKt.transformWhile(FlowKt.onCompletion(FlowKt.onStart(adPlayer.getOnShowEvent(), new AnonymousClass3(ad, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass4(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass5(null)).collect(new FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.6
                    public final Object emit(ShowEvent showEvent, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(showEvent, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ShowEvent) obj2, (Continuation<? super Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(gameServerIdReader, "gameServerIdReader");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(validateExtrasSize, "validateExtrasSize");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Flow<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return FlowKt.flow(new C145171(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, Continuation<? super Unit> continuation) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objDestroy;
    }
}
