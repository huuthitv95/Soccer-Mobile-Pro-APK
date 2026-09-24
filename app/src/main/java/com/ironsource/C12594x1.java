package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12594x1 implements InterfaceC11607P1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.ironsource.x1$a */
    static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a */
        private final InterfaceC12212ga f32731a;

        /* JADX INFO: renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C15549a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f32732a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f32732a = iArr;
            }
        }

        public a(InterfaceC12212ga listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f32731a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m34095a(Lifecycle.Event event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = C15549a.f32732a[event.ordinal()];
            if (i == 1) {
                this$0.f32731a.mo27938b();
                return;
            }
            if (i == 2) {
                this$0.f32731a.mo27939c();
            } else if (i == 3) {
                this$0.f32731a.mo27940d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.f32731a.mo27937a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC12212ga interfaceC12212ga = this.f32731a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.areEqual(interfaceC12212ga, aVar != null ? aVar.f32731a : null);
        }

        public int hashCode() {
            return this.f32731a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, final Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12594x1.a.m34095a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m34093c(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m34094d(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: a */
    public void mo26714a(final InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12594x1.m34093c(observer);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: b */
    public void mo26715b(final InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12594x1.m34094d(observer);
            }
        }, 0L, 2, null);
    }
}
