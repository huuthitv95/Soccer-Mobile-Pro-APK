package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;

/* JADX INFO: renamed from: com.ironsource.P7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11613P7 implements InterfaceC11621Pf {

    /* JADX INFO: renamed from: c */
    private static boolean f25512c = false;

    /* JADX INFO: renamed from: d */
    public static final String f25513d = "deviceStatus";

    /* JADX INFO: renamed from: e */
    public static final String f25514e = "iabTokenAPI";

    /* JADX INFO: renamed from: f */
    public static final String f25515f = "dsSharedSignalsAPI";

    /* JADX INFO: renamed from: g */
    public static final String f25516g = "deleteFolder";

    /* JADX INFO: renamed from: h */
    public static final String f25517h = "deleteFile";

    /* JADX INFO: renamed from: i */
    public static final String f25518i = "getCachedFilesMap";

    /* JADX INFO: renamed from: j */
    public static final String f25519j = "permissionsAPI";

    /* JADX INFO: renamed from: k */
    public static final String f25520k = "deviceDataAPI";

    /* JADX INFO: renamed from: l */
    public static final String f25521l = "adViewAPI";

    /* JADX INFO: renamed from: o */
    private static final HandlerThreadC11615P9 f25524o;

    /* JADX INFO: renamed from: p */
    private static final HandlerThreadC11615P9 f25525p;

    /* JADX INFO: renamed from: q */
    private static final HandlerThreadC11615P9 f25526q;

    /* JADX INFO: renamed from: a */
    public static final C11613P7 f25510a = new C11613P7();

    /* JADX INFO: renamed from: b */
    private static final Handler f25511b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    private static final Lazy f25522m = LazyKt.lazy(a.f25527a);

    /* JADX INFO: renamed from: n */
    private static final Lazy f25523n = LazyKt.lazy(b.f25528a);

    /* JADX INFO: renamed from: com.ironsource.P7$a */
    static final class a extends Lambda implements Function0<C11771Yd> {

        /* JADX INFO: renamed from: a */
        public static final a f25527a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11771Yd invoke() {
            return new C11771Yd(0, null, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.P7$b */
    static final class b extends Lambda implements Function0<Map<String, ? extends KFunction<? extends Boolean>>> {

        /* JADX INFO: renamed from: a */
        public static final b f25528a = new b();

        /* JADX INFO: renamed from: com.ironsource.P7$b$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Boolean> {
            a(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32186m());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$b, reason: collision with other inner class name */
        /* synthetic */ class C15515b extends FunctionReferenceImpl implements Function0<Boolean> {
            C15515b(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32189p());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$c */
        /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Boolean> {
            c(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32188o());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$d */
        /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Boolean> {
            d(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32183j());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$e */
        /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Boolean> {
            e(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32187n());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$f */
        /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Boolean> {
            f(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32175b());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$g */
        /* synthetic */ class g extends FunctionReferenceImpl implements Function0<Boolean> {
            g(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32170A());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$h */
        /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Boolean> {
            h(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32199z());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P7$b$i */
        /* synthetic */ class i extends FunctionReferenceImpl implements Function0<Boolean> {
            i(Object obj) {
                super(0, obj, InterfaceC12618y7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC12618y7) this.receiver).mo32172C());
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, KFunction<Boolean>> invoke() {
            InterfaceC12618y7 interfaceC12618y7Mo25846h = C11455Gb.f24351s.m25905d().mo25846h();
            return MapsKt.mapOf(TuplesKt.m43482to(C11613P7.f25513d, new a(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25514e, new C15515b(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25515f, new c(interfaceC12618y7Mo25846h)), TuplesKt.m43482to("deleteFolder", new d(interfaceC12618y7Mo25846h)), TuplesKt.m43482to("deleteFile", new e(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25518i, new f(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25519j, new g(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25520k, new h(interfaceC12618y7Mo25846h)), TuplesKt.m43482to(C11613P7.f25521l, new i(interfaceC12618y7Mo25846h)));
        }
    }

    static {
        HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("isadplayer-background");
        handlerThreadC11615P9.start();
        handlerThreadC11615P9.m27240a();
        f25524o = handlerThreadC11615P9;
        HandlerThreadC11615P9 handlerThreadC11615P10 = new HandlerThreadC11615P9("isadplayer-publisher-callbacks");
        handlerThreadC11615P10.start();
        handlerThreadC11615P10.m27240a();
        f25525p = handlerThreadC11615P10;
        HandlerThreadC11615P9 handlerThreadC11615P11 = new HandlerThreadC11615P9("isadplayer-release");
        handlerThreadC11615P11.start();
        handlerThreadC11615P11.m27240a();
        f25526q = handlerThreadC11615P11;
    }

    private C11613P7() {
    }

    /* JADX INFO: renamed from: f */
    private final boolean m27213f(Runnable runnable) {
        return f25512c && m27209b().getQueue().contains(runnable);
    }

    /* JADX INFO: renamed from: a */
    public final void m27218a(boolean z) {
        f25512c = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m27219b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m27208a(this, action, 0L, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m27221c(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m27210b(this, action, 0L, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m27224d(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m27212c(this, action, 0L, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m27227e() {
        return f25512c;
    }

    /* JADX INFO: renamed from: b */
    private final C11771Yd m27209b() {
        return (C11771Yd) f25522m.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final Map<String, Function0<Boolean>> m27211c() {
        return (Map) f25523n.getValue();
    }

    @Override // com.ironsource.InterfaceC11621Pf
    /* JADX INFO: renamed from: a */
    public void mo27215a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m27212c(this, action, 0L, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m27225d(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f25511b.postDelayed(action, j);
    }

    /* JADX INFO: renamed from: e */
    public final void m27226e(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m27213f(action)) {
            m27209b().remove(action);
        } else {
            f25526q.m27243b(action);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27208a(C11613P7 c11613p7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c11613p7.m27220b(runnable, j);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m27212c(C11613P7 c11613p7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c11613p7.m27225d(runnable, j);
    }

    /* JADX INFO: renamed from: b */
    public final void m27220b(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f25524o.m27242a(action, j);
    }

    /* JADX INFO: renamed from: d */
    public final ThreadPoolExecutor m27223d() {
        return m27209b();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m27210b(C11613P7 c11613p7, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c11613p7.m27222c(runnable, j);
    }

    @Override // com.ironsource.InterfaceC11621Pf
    /* JADX INFO: renamed from: a */
    public void mo27216a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f25512c) {
            m27209b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f25526q.m27242a(action, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27222c(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f25525p.m27242a(action, j);
    }

    /* JADX INFO: renamed from: a */
    public final Looper m27214a() {
        return f25524o.getLooper();
    }

    /* JADX INFO: renamed from: a */
    public final void m27217a(Runnable action, String name) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(name, "name");
        Function0<Boolean> function0 = m27211c().get(name);
        if (function0 != null ? function0.invoke().booleanValue() : false) {
            m27208a(this, action, 0L, 2, null);
        } else {
            action.run();
        }
    }
}
