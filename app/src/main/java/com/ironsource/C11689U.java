package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.U */
/* JADX INFO: loaded from: classes6.dex */
public final class C11689U implements InterfaceC12218gg {

    /* JADX INFO: renamed from: a */
    private final String f25822a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12283k9 f25823b;

    /* JADX INFO: renamed from: c */
    private final boolean f25824c;

    /* JADX INFO: renamed from: com.ironsource.U$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final a f25825a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33765r();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U$b */
    static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final b f25826a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33762o();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U$c */
    static final class c extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final c f25827a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33761n();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U$d */
    static final class d extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final d f25828a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33764q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U$e */
    static final class e extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final e f25829a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33762o();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U$f */
    static final class f extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final f f25830a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33754g();
        }
    }

    public C11689U(String adm, InterfaceC12283k9 interfaceC12283k9, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f25822a = adm;
        this.f25823b = interfaceC12283k9;
        this.f25824c = z;
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public void mo26555a() throws C12172ee {
        mo26556a(this.f25824c, a.f25825a);
        mo26556a(this.f25823b != null, b.f25826a);
        InterfaceC12283k9 interfaceC12283k9 = this.f25823b;
        if (interfaceC12283k9 != null) {
            if (interfaceC12283k9.mo25705f() == EnumC12322m9.NonBidder) {
                mo26556a(this.f25822a.length() == 0, c.f25827a);
            }
            if (interfaceC12283k9.mo25705f() == EnumC12322m9.Bidder) {
                mo26556a(this.f25822a.length() > 0, d.f25828a);
            }
            mo26556a(interfaceC12283k9.mo25705f() != EnumC12322m9.NotSupported, e.f25829a);
            mo26556a(interfaceC12283k9.mo25704e().length() > 0, f.f25830a);
        }
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo26556a(boolean z, Function0 function0) {
        InterfaceC12218gg.CC.$default$a(this, z, function0);
    }
}
