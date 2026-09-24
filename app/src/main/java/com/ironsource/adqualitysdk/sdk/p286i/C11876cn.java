package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn */
/* JADX INFO: loaded from: classes6.dex */
public final class C11876cn {

    /* JADX INFO: renamed from: ｋ */
    private e f28190;

    /* JADX INFO: renamed from: ﾇ */
    private C11906dq f28191;

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m29612(InterfaceC12018hu interfaceC12018hu, C11907dr c11907dr, C11877co c11877co, List<Object> list) {
        e eVar = this.f28190;
        if (eVar != null && !eVar.mo29618(interfaceC12018hu)) {
            return false;
        }
        if (this.f28191 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, interfaceC12018hu);
        return this.f28191.m30048(c11907dr, c11877co, arrayList).m30065();
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn$a */
    public static class a {

        /* JADX INFO: renamed from: ﻐ */
        private C11876cn f28192 = new C11876cn();

        /* JADX INFO: renamed from: ﾒ */
        public final a m29616(Class cls) {
            this.f28192.f28190 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        public final a m29613(Class cls) {
            this.f28192.f28190 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final a m29614(Class cls) {
            this.f28192.f28190 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final a m29615(C11906dq c11906dq) {
            this.f28192.f28191 = c11906dq;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final C11876cn m29617() {
            return this.f28192;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn$e */
    static abstract class e {

        /* JADX INFO: renamed from: ﾒ */
        private Class f28193;

        /* JADX INFO: renamed from: ﻛ */
        abstract boolean mo29618(InterfaceC12018hu interfaceC12018hu);

        e(Class cls) {
            this.f28193 = cls;
        }

        /* JADX INFO: renamed from: ｋ */
        final Class m29619() {
            return this.f28193;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn$d */
    static class d extends e {
        d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C11876cn.e
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo29618(InterfaceC12018hu interfaceC12018hu) {
            return m29619().isAssignableFrom(interfaceC12018hu.mo30360().getType());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn$c */
    static class c extends e {
        c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C11876cn.e
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo29618(InterfaceC12018hu interfaceC12018hu) {
            return m29619().equals(interfaceC12018hu.mo30360().getType());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cn$b */
    static class b extends e {
        b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C11876cn.e
        /* JADX INFO: renamed from: ﻛ */
        final boolean mo29618(InterfaceC12018hu interfaceC12018hu) {
            return m29619().isInstance(interfaceC12018hu.mo30359());
        }
    }
}
