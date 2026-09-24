package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h4 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12224h4 {

    /* JADX INFO: renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC12224h4 {

        /* JADX INFO: renamed from: a */
        private final boolean f30460a;

        public a(boolean z) {
            this.f30460a = z;
        }

        @Override // com.ironsource.InterfaceC12224h4
        /* JADX INFO: renamed from: a */
        public void mo31585a() {
            C12547u8.m33895a(C11703Ud.f25985x, new C12422p8().m33061a(C11341A5.f23834y, Boolean.valueOf(this.f30460a)).m33062a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC12224h4 {

        /* JADX INFO: renamed from: a */
        private final boolean f30461a;

        /* JADX INFO: renamed from: b */
        private final long f30462b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC12400o4 f30463c;

        public b(boolean z, long j, InterfaceC12400o4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f30461a = z;
            this.f30462b = j;
            this.f30463c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC12224h4
        /* JADX INFO: renamed from: a */
        public void mo31585a() {
            C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23834y, Boolean.valueOf(this.f30461a));
            if (this.f30462b > 0) {
                c12422p8M33061a.m33061a(C11341A5.f23789B, Long.valueOf(this.f30463c.mo32926a() - this.f30462b));
            }
            C12547u8.m33895a(C11703Ud.f25984w, c12422p8M33061a.m33062a());
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC12400o4 m31586b() {
            return this.f30463c;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo31585a();
}
