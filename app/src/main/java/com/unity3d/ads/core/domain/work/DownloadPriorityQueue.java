package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: DownloadPriorityQueue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "", "()V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "nextTurn", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "queue", "Ljava/util/PriorityQueue;", "invoke", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "downloadAction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PriorityItem", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class DownloadPriorityQueue {
    private final Mutex mutex = MutexKt.Mutex(false);
    private final MutableStateFlow<PriorityItem> nextTurn = StateFlowKt.MutableStateFlow(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
        }
    });

    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    @Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(I)V", "getPriority", "()I", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1 */
    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", m43504f = "DownloadPriorityQueue.kt", m43505i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3}, m43506l = {47, 28, 31, 57}, m43507m = "invoke", m43508n = {"this", "downloadAction", "priorityItem", "$this$withLock_u24default$iv", "this", "downloadAction", "priorityItem", "this", "priorityItem", "this", "priorityItem", "$this$withLock_u24default$iv"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C146221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C146221(Continuation<? super C146221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3 */
    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", m43504f = "DownloadPriorityQueue.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C146233 extends SuspendLambda implements Function2<PriorityItem, Continuation<? super Boolean>, Object> {
        final /* synthetic */ PriorityItem $priorityItem;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146233(PriorityItem priorityItem, Continuation<? super C146233> continuation) {
            super(2, continuation);
            this.$priorityItem = priorityItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C146233 c146233 = new C146233(this.$priorityItem, continuation);
            c146233.L$0 = obj;
            return c146233;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PriorityItem priorityItem, Continuation<? super Boolean> continuation) {
            return ((C146233) create(priorityItem, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((PriorityItem) this.L$0) == this.$priorityItem);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[PHI: r2 r11
  0x0055: PHI (r2v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue) = 
  (r2v5 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
  (r2v11 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
 binds: [B:31:0x00de, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r11v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem) = 
  (r11v5 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
  (r11v16 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
 binds: [B:31:0x00de, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object invoke(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        C146221 c146221;
        DownloadPriorityQueue downloadPriorityQueue;
        Function1<? super Continuation<? super Unit>, ? extends Object> function2;
        Mutex mutex;
        PriorityItem priorityItem;
        Function1<? super Continuation<? super Unit>, ? extends Object> function3;
        DownloadPriorityQueue downloadPriorityQueue2;
        PriorityItem priorityItem2;
        Mutex mutex2;
        DownloadPriorityQueue downloadPriorityQueue3;
        if (continuation instanceof C146221) {
            c146221 = (C146221) continuation;
            if ((c146221.label & Integer.MIN_VALUE) != 0) {
                c146221.label -= Integer.MIN_VALUE;
            } else {
                c146221 = new C146221(continuation);
            }
        } else {
            c146221 = new C146221(continuation);
        }
        Object obj = c146221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c146221.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PriorityItem priorityItem3 = new PriorityItem(i);
                Mutex mutex3 = this.mutex;
                c146221.L$0 = this;
                c146221.L$1 = function1;
                c146221.L$2 = priorityItem3;
                c146221.L$3 = mutex3;
                c146221.label = 1;
                if (mutex3.lock(null, c146221) != coroutine_suspended) {
                    downloadPriorityQueue = this;
                    function2 = function1;
                    mutex = mutex3;
                    priorityItem = priorityItem3;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                Mutex mutex4 = (Mutex) c146221.L$3;
                PriorityItem priorityItem4 = (PriorityItem) c146221.L$2;
                function2 = (Function1) c146221.L$1;
                downloadPriorityQueue = (DownloadPriorityQueue) c146221.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex4;
                priorityItem = priorityItem4;
            } else {
                if (i2 == 2) {
                    priorityItem = (PriorityItem) c146221.L$2;
                    function3 = (Function1) c146221.L$1;
                    downloadPriorityQueue2 = (DownloadPriorityQueue) c146221.L$0;
                    ResultKt.throwOnFailure(obj);
                    c146221.L$0 = downloadPriorityQueue2;
                    c146221.L$1 = priorityItem;
                    c146221.L$2 = null;
                    c146221.label = 3;
                    if (function3.invoke(c146221) != coroutine_suspended) {
                        priorityItem2 = priorityItem;
                        mutex2 = downloadPriorityQueue2.mutex;
                        c146221.L$0 = downloadPriorityQueue2;
                        c146221.L$1 = priorityItem2;
                        c146221.L$2 = mutex2;
                        c146221.label = 4;
                        if (mutex2.lock(null, c146221) != coroutine_suspended) {
                            downloadPriorityQueue3 = downloadPriorityQueue2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 == 3) {
                    priorityItem = (PriorityItem) c146221.L$1;
                    DownloadPriorityQueue downloadPriorityQueue4 = (DownloadPriorityQueue) c146221.L$0;
                    ResultKt.throwOnFailure(obj);
                    downloadPriorityQueue2 = downloadPriorityQueue4;
                    priorityItem2 = priorityItem;
                    mutex2 = downloadPriorityQueue2.mutex;
                    c146221.L$0 = downloadPriorityQueue2;
                    c146221.L$1 = priorityItem2;
                    c146221.L$2 = mutex2;
                    c146221.label = 4;
                    if (mutex2.lock(null, c146221) != coroutine_suspended) {
                        downloadPriorityQueue3 = downloadPriorityQueue2;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c146221.L$2;
                priorityItem2 = (PriorityItem) c146221.L$1;
                downloadPriorityQueue3 = (DownloadPriorityQueue) c146221.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                downloadPriorityQueue3.queue.remove(priorityItem2);
                downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                mutex2.unlock(null);
            }
            downloadPriorityQueue.queue.offer(priorityItem);
            downloadPriorityQueue.nextTurn.setValue(downloadPriorityQueue.queue.peek());
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            MutableStateFlow<PriorityItem> mutableStateFlow = downloadPriorityQueue.nextTurn;
            C146233 c146233 = new C146233(priorityItem, null);
            c146221.L$0 = downloadPriorityQueue;
            c146221.L$1 = function2;
            c146221.L$2 = priorityItem;
            c146221.L$3 = null;
            c146221.label = 2;
            if (FlowKt.first(mutableStateFlow, c146233, c146221) != coroutine_suspended) {
                function3 = function2;
                downloadPriorityQueue2 = downloadPriorityQueue;
                c146221.L$0 = downloadPriorityQueue2;
                c146221.L$1 = priorityItem;
                c146221.L$2 = null;
                c146221.label = 3;
                if (function3.invoke(c146221) != coroutine_suspended) {
                    priorityItem2 = priorityItem;
                    mutex2 = downloadPriorityQueue2.mutex;
                    c146221.L$0 = downloadPriorityQueue2;
                    c146221.L$1 = priorityItem2;
                    c146221.L$2 = mutex2;
                    c146221.label = 4;
                    if (mutex2.lock(null, c146221) != coroutine_suspended) {
                        downloadPriorityQueue3 = downloadPriorityQueue2;
                        downloadPriorityQueue3.queue.remove(priorityItem2);
                        downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
                        Unit unit3 = Unit.INSTANCE;
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
