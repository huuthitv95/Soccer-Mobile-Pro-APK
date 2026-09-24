package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ig */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11496Ig {

    /* JADX INFO: renamed from: com.ironsource.Ig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AbstractC11353B $default$c(InterfaceC11496Ig _this) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Ig$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C15508a f24696a = new C15508a(null);

        /* JADX INFO: renamed from: com.ironsource.Ig$a$a, reason: collision with other inner class name */
        public static final class C15508a {
            public /* synthetic */ C15508a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final InterfaceC11496Ig m26146a(boolean z, InterfaceC11370Bg waterfallOperations) {
                Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
                return z ? new C11460Gg(waterfallOperations) : new C11442Fg(waterfallOperations);
            }

            private C15508a() {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo25803a();

    /* JADX INFO: renamed from: a */
    void mo25804a(AbstractC11353B abstractC11353B);

    /* JADX INFO: renamed from: b */
    EnumC11349Ad mo25805b();

    /* JADX INFO: renamed from: c */
    AbstractC11353B mo25806c();
}
