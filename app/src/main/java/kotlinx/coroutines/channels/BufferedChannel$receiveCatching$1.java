package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "kotlinx.coroutines.channels.BufferedChannel", m43504f = "BufferedChannel.kt", m43505i = {}, m43506l = {739}, m43507m = "receiveCatching-JP2dKIU$suspendImpl", m43508n = {}, m43509s = {})
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM46441receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m46441receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM46441receiveCatchingJP2dKIU$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM46441receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m46449boximpl(objM46441receiveCatchingJP2dKIU$suspendImpl);
    }
}
