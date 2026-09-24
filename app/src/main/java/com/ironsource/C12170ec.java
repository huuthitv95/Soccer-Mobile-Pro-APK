package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ec */
/* JADX INFO: loaded from: classes6.dex */
public final class C12170ec {

    /* JADX INFO: renamed from: e */
    public static final a f30306e = new a(null);

    /* JADX INFO: renamed from: f */
    private static volatile C12170ec f30307f;

    /* JADX INFO: renamed from: a */
    private C12624yd f30308a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f30309b;

    /* JADX INFO: renamed from: c */
    private String f30310c;

    /* JADX INFO: renamed from: d */
    private C11573N3 f30311d;

    /* JADX INFO: renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final C12170ec m31373a() {
            C12170ec c12170ec;
            C12170ec c12170ec2 = C12170ec.f30307f;
            if (c12170ec2 != null) {
                return c12170ec2;
            }
            synchronized (this) {
                c12170ec = C12170ec.f30307f;
                if (c12170ec == null) {
                    c12170ec = new C12170ec(null);
                    a aVar = C12170ec.f30306e;
                    C12170ec.f30307f = c12170ec;
                }
            }
            return c12170ec;
        }

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC12203g1 m31374a(IronSource.EnumC12328a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C12170ec c12170ec = C12170ec.f30307f;
            C11573N3 c11573n3M31368b = c12170ec != null ? c12170ec.m31368b() : null;
            C12170ec c12170ec2 = C12170ec.f30307f;
            C12624yd c12624ydM31370e = c12170ec2 != null ? c12170ec2.m31370e() : null;
            if (c11573n3M31368b != null && c12624ydM31370e != null) {
                return new C12277k3(c11573n3M31368b, c12624ydM31370e, adFormat);
            }
            return new C12225h5();
        }
    }

    public /* synthetic */ C12170ec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final C12170ec m31364d() {
        return f30306e.m31373a();
    }

    /* JADX INFO: renamed from: b */
    public final C11573N3 m31368b() {
        return this.f30311d;
    }

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean m31369c() {
        return this.f30309b;
    }

    /* JADX INFO: renamed from: e */
    public final C12624yd m31370e() {
        return this.f30308a;
    }

    /* JADX INFO: renamed from: f */
    public final String m31371f() {
        return this.f30310c;
    }

    /* JADX INFO: renamed from: g */
    public final void m31372g() {
        this.f30309b.set(true);
    }

    private C12170ec() {
        this.f30309b = new AtomicBoolean(false);
        this.f30310c = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m31366a(C12624yd c12624yd) {
        this.f30308a = c12624yd;
    }

    /* JADX INFO: renamed from: a */
    public final void m31367a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f30310c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m31365a(C11573N3 c11573n3) {
        this.f30311d = c11573n3;
    }
}
