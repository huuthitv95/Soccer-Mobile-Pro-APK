package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m43504f = "Emitters.kt", m43505i = {0}, m43506l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m43507m = "invokeSafely$FlowKt__EmittersKt", m43508n = {"cause"}, m43509s = {"L$0"})
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FlowKt__EmittersKt$invokeSafely$1(Continuation<? super FlowKt__EmittersKt$invokeSafely$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(null, null, null, this);
    }
}
