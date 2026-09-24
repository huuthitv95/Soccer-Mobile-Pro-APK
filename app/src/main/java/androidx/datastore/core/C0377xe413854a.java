package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m43504f = "MultiProcessCoordinator.android.kt", m43505i = {0, 0}, m43506l = {182}, m43507m = "getExclusiveFileLockWithRetryIfDeadlock", m43508n = {"lockFileStream", "backoff"}, m43509s = {"L$0", "J$0"})
final class C0377xe413854a extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0377xe413854a(MultiProcessCoordinator.Companion companion, Continuation<? super C0377xe413854a> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
