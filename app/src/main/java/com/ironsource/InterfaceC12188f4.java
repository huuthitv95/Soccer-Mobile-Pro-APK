package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f4 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12188f4 {

    /* JADX INFO: renamed from: a */
    public static final c f30381a = c.f30388a;

    /* JADX INFO: renamed from: com.ironsource.f4$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            c cVar = InterfaceC12188f4.f30381a;
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static InterfaceC12188f4 m31426a(C11747X6 c11747x6) {
            return InterfaceC12188f4.f30381a.m31430a(c11747x6);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$a */
    public static final class a implements InterfaceC12188f4 {

        /* JADX INFO: renamed from: b */
        private final InterfaceC11713V6 f30382b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC11638Qf f30383c;

        /* JADX INFO: renamed from: d */
        private final AtomicBoolean f30384d;

        /* JADX INFO: renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C15538a implements InterfaceC11638Qf.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ d f30385a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ a f30386b;

            C15538a(d dVar, a aVar) {
                this.f30385a = dVar;
                this.f30386b = aVar;
            }

            @Override // com.ironsource.InterfaceC11638Qf.a
            /* JADX INFO: renamed from: a */
            public void mo26432a() {
                this.f30385a.mo31431a(new InterfaceC11781Z6.a(new InterfaceC11730W6.a(this.f30386b.f30382b.mo27596b())));
                this.f30386b.f30384d.set(false);
            }
        }

        public a(InterfaceC11713V6 config, InterfaceC11638Qf timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f30382b = config;
            this.f30383c = timer;
            this.f30384d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC12188f4
        /* JADX INFO: renamed from: a */
        public synchronized void mo31425a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f30384d.compareAndSet(false, true)) {
                this.f30383c.mo27305a(new C15538a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC12188f4
        /* JADX INFO: renamed from: a */
        public synchronized void mo31424a() {
            this.f30383c.cancel();
            this.f30384d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$b */
    public static final class b implements InterfaceC12188f4 {

        /* JADX INFO: renamed from: b */
        public static final b f30387b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC12188f4
        /* JADX INFO: renamed from: a */
        public void mo31424a() {
        }

        @Override // com.ironsource.InterfaceC12188f4
        /* JADX INFO: renamed from: a */
        public void mo31425a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo31431a(InterfaceC11781Z6 interfaceC11781Z6);
    }

    /* JADX INFO: renamed from: a */
    void mo31424a();

    /* JADX INFO: renamed from: a */
    void mo31425a(d dVar);

    /* JADX INFO: renamed from: com.ironsource.f4$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ c f30388a = new c();

        private c() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final InterfaceC12188f4 m31430a(C11747X6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.mo26172b()) {
                return b.f30387b;
            }
            C11696U6 c11696u6 = new C11696U6(featureFlag);
            InterfaceC11638Qf.b bVar = new InterfaceC11638Qf.b();
            bVar.m27309b(c11696u6.mo27595a());
            bVar.m27307a(c11696u6.mo27595a());
            return new a(c11696u6, new InterfaceC11638Qf.d().mo27310a(bVar));
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC12188f4 m31429a() {
            return b.f30387b;
        }
    }
}
