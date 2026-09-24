package androidx.datastore.core;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: StorageConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a&\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m43475d2 = {"readData", "T", "Landroidx/datastore/core/StorageConnection;", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "", "value", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m43476k = 2, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class StorageConnectionKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m43475d2 = {"<anonymous>", "T", "Landroidx/datastore/core/ReadScope;", "it", ""}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "androidx.datastore.core.StorageConnectionKt$readData$2", m43504f = "StorageConnection.kt", m43505i = {}, m43506l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C03912<T> extends SuspendLambda implements Function3<ReadScope<T>, Boolean, Continuation<? super T>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C03912(Continuation<? super C03912> continuation) {
            super(3, continuation);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z, Continuation<? super T> continuation) {
            C03912 c03912 = new C03912(continuation);
            c03912.L$0 = readScope;
            return c03912.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return invoke((ReadScope) obj, bool.booleanValue(), (Continuation) obj2);
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
            this.label = 1;
            Object data = ((ReadScope) this.L$0).readData(this);
            return data == coroutine_suspended ? coroutine_suspended : data;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object readData(StorageConnection<T> storageConnection, Continuation<? super T> continuation) {
        return storageConnection.readScope(new C03912(null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "T", "Landroidx/datastore/core/WriteScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m43504f = "StorageConnection.kt", m43505i = {}, m43506l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C03922<T> extends SuspendLambda implements Function2<WriteScope<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03922(T t, Continuation<? super C03922> continuation) {
            super(2, continuation);
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03922 c03922 = new C03922(this.$value, continuation);
            c03922.L$0 = obj;
            return c03922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WriteScope<T> writeScope, Continuation<? super Unit> continuation) {
            return ((C03922) create(writeScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((WriteScope) this.L$0).writeData(this.$value, this) == coroutine_suspended) {
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

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, Continuation<? super Unit> continuation) {
        Object objWriteScope = storageConnection.writeScope(new C03922(t, null), continuation);
        return objWriteScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteScope : Unit.INSTANCE;
    }
}
