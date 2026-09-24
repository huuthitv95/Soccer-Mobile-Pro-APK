package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ve */
/* JADX INFO: loaded from: classes6.dex */
public final class C12571ve implements InterfaceC11470H8, InterfaceC11470H8.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12589we f32613a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12306le f32614b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12400o4 f32615c;

    /* JADX INFO: renamed from: d */
    private int f32616d;

    /* JADX INFO: renamed from: e */
    private long f32617e;

    /* JADX INFO: renamed from: com.ironsource.ve$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f32618a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f32619b = -1;

        /* JADX INFO: renamed from: c */
        public static final int f32620c = 0;

        /* JADX INFO: renamed from: d */
        public static final long f32621d = -1;

        private a() {
        }
    }

    public C12571ve(InterfaceC12589we storage, InterfaceC12306le initResponseStorage, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f32613a = storage;
        this.f32614b = initResponseStorage;
        this.f32615c = currentTimeProvider;
        this.f32616d = -1;
        this.f32617e = -1L;
    }

    /* JADX INFO: renamed from: b */
    private final int m33968b(Context context, InterfaceC12589we interfaceC12589we) {
        int iMo34178b = interfaceC12589we.mo34178b(context, 0) + 1;
        interfaceC12589we.mo34177a(context, iMo34178b);
        return iMo34178b;
    }

    @Override // com.ironsource.InterfaceC11470H8.a
    /* JADX INFO: renamed from: a */
    public void mo25988a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32616d = m33968b(context, this.f32613a);
        this.f32617e = m33967a(context, this.f32613a);
    }

    @Override // com.ironsource.InterfaceC11470H8
    /* JADX INFO: renamed from: c */
    public int mo25987c() {
        return this.f32616d;
    }

    /* JADX INFO: renamed from: a */
    private final long m33967a(Context context, InterfaceC12589we interfaceC12589we) {
        long jMo31327a = interfaceC12589we.mo31327a(context, -1L);
        if (this.f32614b.mo32085a(context) || jMo31327a != -1) {
            return jMo31327a;
        }
        long jMo32926a = this.f32615c.mo32926a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jMo32926a);
        interfaceC12589we.mo31328b(context, jMo32926a);
        return jMo32926a;
    }

    @Override // com.ironsource.InterfaceC11470H8
    /* JADX INFO: renamed from: b */
    public String mo25986b() {
        String strM32764d = IronSourceUtils.m32764d();
        Intrinsics.checkNotNullExpressionValue(strM32764d, "getSessionId()");
        return strM32764d;
    }

    public /* synthetic */ C12571ve(InterfaceC12589we interfaceC12589we, InterfaceC12306le interfaceC12306le, InterfaceC12400o4 interfaceC12400o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12589we, (i & 2) != 0 ? new C12327me() : interfaceC12306le, (i & 4) != 0 ? new InterfaceC12400o4.a() : interfaceC12400o4);
    }

    @Override // com.ironsource.InterfaceC11470H8
    /* JADX INFO: renamed from: a */
    public long mo25985a() {
        return this.f32617e;
    }
}
