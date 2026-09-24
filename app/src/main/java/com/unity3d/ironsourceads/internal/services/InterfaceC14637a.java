package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C12229h9;
import com.ironsource.EnumC12265j9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC14637a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m43175a(InterfaceC14637a interfaceC14637a, Context context, EnumC12265j9 enumC12265j9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
            }
            if ((i & 2) != 0) {
                enumC12265j9 = EnumC12265j9.APP_ACTIVITY;
            }
            return interfaceC14637a.mo43174a(context, enumC12265j9);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C15571a extends a {

            /* JADX INFO: renamed from: a */
            private final String f41415a;

            /* JADX WARN: Multi-variable type inference failed */
            public C15571a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15571a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f41415a = errorMessage;
            }

            public /* synthetic */ C15571a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ C15571a m43176a(C15571a c15571a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c15571a.f41415a;
                }
                return c15571a.m43177a(str);
            }

            /* JADX INFO: renamed from: a */
            public final C15571a m43177a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C15571a(errorMessage);
            }

            /* JADX INFO: renamed from: a */
            public final String m43178a() {
                return this.f41415a;
            }

            /* JADX INFO: renamed from: b */
            public final String m43179b() {
                return this.f41415a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C15571a) && Intrinsics.areEqual(this.f41415a, ((C15571a) obj).f41415a);
            }

            public int hashCode() {
                return this.f41415a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f41415a + ")";
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f41416a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    a mo43173a(Context context, C12229h9 c12229h9);

    /* JADX INFO: renamed from: a */
    a mo43174a(Context context, EnumC12265j9 enumC12265j9);
}
