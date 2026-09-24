package kotlinx.coroutines.channels;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m43504f = "Channel.kt", m43505i = {0}, m43506l = {CommonGatewayClient.CODE_599}, m43507m = "next", m43508n = {"$this"}, m43509s = {"L$0"})
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ChannelIterator$next0$1(Continuation<? super ChannelIterator$next0$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.next(null, this);
    }
}
