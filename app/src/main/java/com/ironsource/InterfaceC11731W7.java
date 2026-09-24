package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W7 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11731W7<T> {

    /* JADX INFO: renamed from: com.ironsource.W7$a */
    public static class a<ListenerType> implements InterfaceC11731W7<ListenerType> {

        /* JADX INFO: renamed from: a */
        private ListenerType f26093a;

        /* JADX INFO: renamed from: com.ironsource.W7$a$a, reason: collision with other inner class name */
        public static final class C15518a extends AbstractRunnableC11754Xd {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Runnable f26094b;

            C15518a(Runnable runnable) {
                this.f26094b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC11754Xd
            /* JADX INFO: renamed from: a */
            public void mo25366a() {
                this.f26094b.run();
            }
        }

        /* JADX INFO: renamed from: a */
        public final ListenerType m27812a() {
            return this.f26093a;
        }

        /* JADX INFO: renamed from: b */
        public final void m27815b(ListenerType listenertype) {
            this.f26093a = listenertype;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m27811a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.m27813a(runnable, z);
        }

        /* JADX INFO: renamed from: a */
        public final void m27813a(Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C15518a(runnable), 0L, 2, null);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m27814a(String instanceId, String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.InterfaceC11731W7
        /* JADX INFO: renamed from: a */
        public void mo27810a(ListenerType listenertype) {
            this.f26093a = listenertype;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo27810a(T t);
}
