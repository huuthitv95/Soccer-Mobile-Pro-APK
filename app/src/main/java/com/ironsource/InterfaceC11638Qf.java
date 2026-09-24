package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Qf */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11638Qf {

    /* JADX INFO: renamed from: com.ironsource.Qf$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo26432a();
    }

    /* JADX INFO: renamed from: com.ironsource.Qf$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private long f25562a;

        /* JADX INFO: renamed from: b */
        private long f25563b;

        /* JADX INFO: renamed from: a */
        public final long m27306a() {
            return this.f25563b;
        }

        /* JADX INFO: renamed from: b */
        public final long m27308b() {
            return this.f25562a;
        }

        /* JADX INFO: renamed from: a */
        public final void m27307a(long j) {
            this.f25563b = j;
        }

        /* JADX INFO: renamed from: b */
        public final void m27309b(long j) {
            this.f25562a = j;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Qf$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC11638Qf mo27310a(b bVar);
    }

    /* JADX INFO: renamed from: com.ironsource.Qf$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC11638Qf.c
        /* JADX INFO: renamed from: a */
        public InterfaceC11638Qf mo27310a(b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new C11671Sf(timerConfig.m27308b()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Qf$e */
    private static final class e implements InterfaceC11638Qf {

        /* JADX INFO: renamed from: a */
        private final C11671Sf f25564a;

        /* JADX INFO: renamed from: com.ironsource.Qf$e$a */
        public static final class a implements C11671Sf.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ a f25565a;

            a(a aVar) {
                this.f25565a = aVar;
            }

            @Override // com.ironsource.C11671Sf.a
            /* JADX INFO: renamed from: a */
            public void mo27311a() {
                this.f25565a.mo26432a();
            }
        }

        public e(C11671Sf timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f25564a = timer;
        }

        @Override // com.ironsource.InterfaceC11638Qf
        /* JADX INFO: renamed from: a */
        public void mo27305a(a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f25564a.m27481a((C11671Sf.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC11638Qf
        public void cancel() {
            this.f25564a.m27483e();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo27305a(a aVar);

    void cancel();
}
