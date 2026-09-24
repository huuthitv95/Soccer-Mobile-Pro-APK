package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11730W6 {

    /* JADX INFO: renamed from: com.ironsource.W6$a */
    public static final class a implements InterfaceC11730W6 {

        /* JADX INFO: renamed from: a */
        private final EnumC11764Y6 f26092a;

        public a(EnumC11764Y6 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f26092a = strategy;
        }

        @Override // com.ironsource.InterfaceC11730W6
        /* JADX INFO: renamed from: a */
        public String mo27807a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC11730W6
        /* JADX INFO: renamed from: b */
        public EnumC11764Y6 mo27808b() {
            return this.f26092a;
        }

        /* JADX INFO: renamed from: c */
        public final EnumC11764Y6 m27809c() {
            return this.f26092a;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo27807a();

    /* JADX INFO: renamed from: b */
    EnumC11764Y6 mo27808b();
}
