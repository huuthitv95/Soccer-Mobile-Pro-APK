package com.ironsource;

import com.ironsource.lifecycle.C12311b;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p0 */
/* JADX INFO: loaded from: classes6.dex */
public class C12414p0 extends C12461rb {

    /* JADX INFO: renamed from: b */
    private final IronSource.EnumC12328a f31668b;

    /* JADX INFO: renamed from: c */
    private final C12518sf.b f31669c;

    /* JADX INFO: renamed from: d */
    private final C12616y5 f31670d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC11452G8 f31671e;

    /* JADX INFO: renamed from: f */
    private final long f31672f;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f31673a = new a();

        private a() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final C12414p0 m33050a(IronSource.EnumC12328a adFormat, C11426F0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C12414p0(adFormat, level);
        }
    }

    public C12414p0(IronSource.EnumC12328a adFormat, C11426F0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f31671e = C11455Gb.f24351s.m25905d().mo25844f();
        this.f31672f = TimeUnit.HOURS.toMillis(1L);
        this.f31668b = adFormat;
        this.f31670d = new C12616y5(adFormat, level, null, null, 12, null);
        C12518sf.b bVarM33683b = C12518sf.m33683b(adFormat);
        Intrinsics.checkNotNullExpressionValue(bVarM33683b, "createLogFactory(adFormat)");
        this.f31669c = bVarM33683b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m33033a(C12414p0 c12414p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c12414p0.m33037a(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final String m33042b(String str) {
        return m33033a(this, str, (String) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final String m33044c() {
        return m33033a(this, (String) null, (String) null, 3, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    protected final IronSource.EnumC12328a m33046d() {
        return this.f31668b;
    }

    /* JADX INFO: renamed from: e */
    public final C12616y5 m33047e() {
        return this.f31670d;
    }

    /* JADX INFO: renamed from: f */
    public final int m33048f() {
        return C11455Gb.f24351s.m25905d().mo25852s().mo26265a(this.f31668b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m33049g() {
        return C11455Gb.f24351s.m25905d().mo25844f().mo25858c();
    }

    /* JADX INFO: renamed from: a */
    public final String m33037a(String str, String str2) {
        String strM33688a = this.f31669c.m33688a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strM33688a, "logFactory.createLogMessage(message, suffix)");
        return strM33688a;
    }

    /* JADX INFO: renamed from: b */
    public final C12311b m33040b() {
        C12311b c12311bM32099d = C12311b.m32099d();
        Intrinsics.checkNotNullExpressionValue(c12311bM32099d, "getInstance()");
        return c12311bM32099d;
    }

    /* JADX INFO: renamed from: c */
    public final C12135cd m33043c(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        C11666Sa c11666SaMo25856a = this.f31671e.mo25856a();
        if (c11666SaMo25856a == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C12135cd c12135cdM27469c = c11666SaMo25856a.m27469c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c12135cdM27469c != null) {
            return c12135cdM27469c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* JADX INFO: renamed from: d */
    public final C11649Ra.a m33045d(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C11666Sa c11666SaMo25856a = this.f31671e.mo25856a();
        if (c11666SaMo25856a != null) {
            return c11666SaMo25856a.m27461a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* JADX INFO: renamed from: a */
    public final C12135cd m33035a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        C11666Sa c11666SaMo25856a = this.f31671e.mo25856a();
        if (c11666SaMo25856a != null) {
            C12135cd c12135cdM27469c = c11666SaMo25856a.m27469c(LevelPlay.AdFormat.BANNER, placementName);
            if (c12135cdM27469c != null) {
                return c12135cdM27469c;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12527t6.a m33041b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C11666Sa c11666SaMo25856a = this.f31671e.mo25856a();
        if (c11666SaMo25856a != null) {
            return c11666SaMo25856a.m27467b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* JADX INFO: renamed from: b */
    public final long m33039b(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C11666Sa c11666SaMo25856a = this.f31671e.mo25856a();
        return c11666SaMo25856a != null ? c11666SaMo25856a.m27465b(adFormat) : this.f31672f;
    }

    /* JADX INFO: renamed from: a */
    public final C12135cd m33034a(LevelPlay.AdFormat adFormat, String str) {
        C11666Sa c11666SaMo25856a;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (c11666SaMo25856a = this.f31671e.mo25856a()) == null) {
            return null;
        }
        return c11666SaMo25856a.m27469c(adFormat, str);
    }

    public C12414p0(C12414p0 adTools, C11426F0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f31671e = C11455Gb.f24351s.m25905d().mo25844f();
        this.f31672f = TimeUnit.HOURS.toMillis(1L);
        IronSource.EnumC12328a enumC12328a = adTools.f31668b;
        this.f31668b = enumC12328a;
        this.f31669c = adTools.f31669c;
        this.f31670d = new C12616y5(enumC12328a, level, adTools.f31670d.m34215c(), null, 8, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m33038a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        C12357j.m32540a(data, size);
    }

    /* JADX INFO: renamed from: a */
    public final ISBannerSize m33036a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C12313m0().m32121b(adSize);
    }
}
