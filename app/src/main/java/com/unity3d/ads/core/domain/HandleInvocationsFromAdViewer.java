package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.p293om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.p293om.GetOmData;
import com.unity3d.ads.core.domain.p293om.IsOMActivated;
import com.unity3d.ads.core.domain.p293om.OmFinishSession;
import com.unity3d.ads.core.domain.p293om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.p295di.IServiceComponent;
import com.unity3d.services.core.p295di.IServiceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "Lkotlinx/coroutines/flow/SharedFlow;", "adData", "", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onSubscription", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1 */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/Invocation;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", m43504f = "HandleInvocationsFromAdViewer.kt", m43505i = {}, m43506l = {189}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C145351 extends SuspendLambda implements Function2<FlowCollector<? super Invocation>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C145351(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C145351> continuation) {
            super(2, continuation);
            this.$onSubscription = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C145351(this.$onSubscription, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Invocation> flowCollector, Continuation<? super Unit> continuation) {
            return ((C145351) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.$onSubscription;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2 */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", m43504f = "HandleInvocationsFromAdViewer.kt", m43505i = {}, m43506l = {194, 198}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C145362 extends SuspendLambda implements Function2<Invocation, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Function0<ExposedFunction>> $definition;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
        @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
        @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", m43504f = "HandleInvocationsFromAdViewer.kt", m43505i = {}, m43506l = {195}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
            @Metadata(m43474d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m43475d2 = {"<anonymous>", ""}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
            @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1$1", m43504f = "HandleInvocationsFromAdViewer.kt", m43505i = {}, m43506l = {195}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
            static final class C155691 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
                final /* synthetic */ ExposedFunction $exposedFunction;
                final /* synthetic */ Invocation $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C155691(ExposedFunction exposedFunction, Invocation invocation, Continuation<? super C155691> continuation) {
                    super(1, continuation);
                    this.$exposedFunction = exposedFunction;
                    this.$it = invocation;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C155691(this.$exposedFunction, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
                    return invoke2((Continuation<Object>) continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Continuation<Object> continuation) {
                    return ((C155691) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    Object objInvoke = exposedFunction.invoke(parameters, this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Invocation invocation, ExposedFunction exposedFunction, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = invocation;
                this.$exposedFunction = exposedFunction;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.$exposedFunction, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$it.handle(new C155691(this.$exposedFunction, this.$it, null), this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
        @Metadata(m43474d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m43475d2 = {"<anonymous>", ""}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
        @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2", m43504f = "HandleInvocationsFromAdViewer.kt", m43505i = {}, m43506l = {198}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ExposedFunction exposedFunction, Invocation invocation, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.$exposedFunction, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
                return invoke2((Continuation<Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<Object> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object objInvoke = exposedFunction.invoke(parameters, this);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C145362(Map<String, ? extends Function0<? extends ExposedFunction>> map, Continuation<? super C145362> continuation) {
            super(2, continuation);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145362 c145362 = new C145362(this.$definition, continuation);
            c145362.L$0 = obj;
            return c145362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Invocation invocation, Continuation<? super Unit> continuation) {
            return ((C145362) create(invocation, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            if (r8.handle(new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.C145362.AnonymousClass2(r1, r8, null), r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.NonCancellable.INSTANCE, new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.C145362.AnonymousClass1(r8, r1, null), r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Le
                if (r1 != r2) goto L12
            Le:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L7c
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>> r1 = r7.$definition
                java.lang.String r4 = r8.getLocation()
                java.lang.Object r1 = r1.get(r4)
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                if (r1 == 0) goto L7f
                java.lang.Object r1 = r1.invoke()
                com.unity3d.ads.adplayer.ExposedFunction r1 = (com.unity3d.ads.adplayer.ExposedFunction) r1
                if (r1 != 0) goto L38
                goto L7f
            L38:
                java.lang.String r4 = r8.getLocation()
                java.lang.String r5 = "com.unity3d.services.ads.api.AdViewer.sendOperativeEvent"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                r5 = 0
                if (r4 != 0) goto L65
                java.lang.String r4 = r8.getLocation()
                java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r4 == 0) goto L52
                goto L65
            L52:
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2 r3 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2
                r3.<init>(r1, r8, r5)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                r1 = r7
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r7.label = r2
                java.lang.Object r8 = r8.handle(r3, r1)
                if (r8 != r0) goto L7c
                goto L7b
            L65:
                kotlinx.coroutines.NonCancellable r2 = kotlinx.coroutines.NonCancellable.INSTANCE
                kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
                com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1 r4 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1
                r4.<init>(r8, r1, r5)
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                r8 = r7
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r8)
                if (r8 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L7f:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.C145362.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.unity3d.services.core.p295di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Flow<Invocation> invoke(SharedFlow<Invocation> onInvocations, String adData, String adDataRefreshToken, String impressionConfig, final AdObject adObject, Function1<? super Continuation<? super Unit>, ? extends Object> onSubscription) {
        Intrinsics.checkNotNullParameter(onInvocations, "onInvocations");
        Intrinsics.checkNotNullParameter(adData, "adData");
        Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(onSubscription, "onSubscription");
        final String strM44672constructorimpl = AdData.m44672constructorimpl(adData);
        final String strM44686constructorimpl = ImpressionConfig.m44686constructorimpl(impressionConfig);
        final String strM44679constructorimpl = AdDataRefreshToken.m44679constructorimpl(adDataRefreshToken);
        return FlowKt.onEach(FlowKt.onSubscription(onInvocations, new C145351(onSubscription, null)), new C145362(MapsKt.mapOf(TuplesKt.m43482to(ExposedFunctionLocation.GET_AD_CONTEXT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.m44695getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), strM44672constructorimpl, strM44686constructorimpl, strM44679constructorimpl, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(IsOMActivated.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_CONNECTION_TYPE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_DEVICE_VOLUME, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_SCREEN_WIDTH, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.OPEN_URL, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) this.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(HandleOpenUrl.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SET_ORIENTATION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_WRITE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_READ, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_DELETE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_CLEAR, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_GET_KEYS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_GET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.STORAGE_SET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_PRIVACY_FSM, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SET_PRIVACY_FSM, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_PRIVACY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SET_PRIVACY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_ALLOWED_PII, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SET_ALLOWED_PII, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_SESSION_TOKEN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.REFRESH_AD_DATA, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(Refresh.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.DOWNLOAD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download((CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CacheFile.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.IS_FILE_CACHED, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetIsFileCache.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.OM_START_SESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.OM_FINISH_SESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(OmFinishSession.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.OM_IMPRESSION, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.OM_GET_DATA, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetOmData.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.LOAD_SCAR_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(LoadScarAd.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SHOW_SCAR_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(LoadOfferwallAd.class)), adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.REQUEST_GET, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.REQUEST_POST, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.REQUEST_HEAD, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject);
            }
        }), TuplesKt.m43482to(ExposedFunctionLocation.GET_EXTRA, new Function0<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$52
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)), adObject);
            }
        })), null));
    }
}
