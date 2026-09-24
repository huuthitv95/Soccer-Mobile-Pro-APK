package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rf */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12465rf {

    /* JADX INFO: renamed from: com.ironsource.rf$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final C11645R6.a.InterfaceC15516a f31845a;

        /* JADX INFO: renamed from: b */
        private boolean f31846b;

        public a(C11645R6.a.InterfaceC15516a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.f31845a = onCancel;
        }

        /* JADX INFO: renamed from: a */
        public final void m33252a() {
            this.f31845a.cancel();
            this.f31846b = true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m33253b() {
            return this.f31846b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rf$b */
    public static final class b {

        /* JADX INFO: renamed from: b */
        public static final a f31847b = new a(null);

        /* JADX INFO: renamed from: a */
        private final AbstractRunnableC11754Xd f31848a;

        /* JADX INFO: renamed from: com.ironsource.rf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.rf$b$a$a, reason: collision with other inner class name */
            public static final class C15543a extends AbstractRunnableC11754Xd {

                /* JADX INFO: renamed from: b */
                final /* synthetic */ WeakReference<T> f31849b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ Function1<T, Unit> f31850c;

                /* JADX WARN: Multi-variable type inference failed */
                C15543a(WeakReference<T> weakReference, Function1<? super T, Unit> function1) {
                    this.f31849b = weakReference;
                    this.f31850c = function1;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.AbstractRunnableC11754Xd
                /* JADX INFO: renamed from: a */
                public void mo25366a() {
                    Object obj = this.f31849b.get();
                    if (obj != null) {
                        this.f31850c.invoke((T) obj);
                    }
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final <T> b m33255a(T t, Function1<? super T, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                return new b(new C15543a(new WeakReference(t), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC11754Xd abstractRunnableC11754Xd, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractRunnableC11754Xd);
        }

        /* JADX INFO: renamed from: a */
        public final AbstractRunnableC11754Xd m33254a() {
            return this.f31848a;
        }

        private b(AbstractRunnableC11754Xd abstractRunnableC11754Xd) {
            this.f31848a = abstractRunnableC11754Xd;
        }
    }

    /* JADX INFO: renamed from: a */
    a mo27335a(b bVar, long j);

    /* JADX INFO: renamed from: a */
    a mo27336a(Runnable runnable, long j);
}
