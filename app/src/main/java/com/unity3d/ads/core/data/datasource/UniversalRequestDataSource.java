package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: UniversalRequestDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m43475d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "universalRequestStoreProvider", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "(Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;)V", "get", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "data", "Lcom/google/protobuf/ByteString;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2 */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @Metadata(m43474d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "exception", ""}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", m43504f = "UniversalRequestDataSource.kt", m43505i = {}, m43506l = {15}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144312 extends SuspendLambda implements Function3<FlowCollector<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C144312(Continuation<? super C144312> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super UniversalRequestStoreOuterClass.UniversalRequestStore> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C144312 c144312 = new C144312(continuation);
            c144312.L$0 = flowCollector;
            c144312.L$1 = th;
            return c144312.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof CorruptionException)) {
                    throw th;
                }
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(defaultInstance, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2 */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @Metadata(m43474d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m43475d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", m43504f = "UniversalRequestDataSource.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144322 extends SuspendLambda implements Function2<UniversalRequestStoreOuterClass.UniversalRequestStore, Continuation<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144322(String str, Continuation<? super C144322> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144322 c144322 = new C144322(this.$key, continuation);
            c144322.L$0 = obj;
            return c144322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, Continuation<? super UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
            return ((C144322) create(universalRequestStore, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2 */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @Metadata(m43474d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m43475d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", m43504f = "UniversalRequestDataSource.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144332 extends SuspendLambda implements Function2<UniversalRequestStoreOuterClass.UniversalRequestStore, Continuation<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144332(String str, ByteString byteString, Continuation<? super C144332> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144332 c144332 = new C144332(this.$key, this.$data, continuation);
            c144332.L$0 = obj;
            return c144332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, Continuation<? super UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
            return ((C144332) create(universalRequestStore, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestStoreProvider) {
        Intrinsics.checkNotNullParameter(universalRequestStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestStoreProvider;
    }

    public final Object get(Continuation<? super UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
        return FlowKt.first(FlowKt.m46468catch(this.universalRequestStoreProvider.invoke().getData(), new C144312(null)), continuation);
    }

    public final Object remove(String str, Continuation<? super Unit> continuation) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C144322(str, null), continuation);
        return objUpdateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : Unit.INSTANCE;
    }

    public final Object set(String str, ByteString byteString, Continuation<? super Unit> continuation) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C144332(str, byteString, null), continuation);
        return objUpdateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : Unit.INSTANCE;
    }
}
