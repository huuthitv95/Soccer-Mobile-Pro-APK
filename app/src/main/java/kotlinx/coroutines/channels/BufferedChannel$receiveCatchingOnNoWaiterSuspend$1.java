package kotlinx.coroutines.channels;

import com.ironsource.C11391D1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "kotlinx.coroutines.channels.BufferedChannel", m43504f = "BufferedChannel.kt", m43505i = {0, 0, 0, 0}, m43506l = {3064}, m43507m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m43508n = {"this", C11391D1.f24199i, "index", "r"}, m43509s = {"L$0", "L$1", "I$0", "J$0"})
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM46442receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m46442receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM46442receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM46442receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m46449boximpl(objM46442receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
