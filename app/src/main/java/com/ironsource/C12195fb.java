package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.fb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12195fb {

    /* JADX INFO: renamed from: a */
    private final C12231hb f30403a;

    /* JADX INFO: renamed from: com.ironsource.fb$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C12195fb f30404a = new C12195fb(null);

        /* JADX INFO: renamed from: a */
        public final a m31498a(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f30404a.m31485a(adUnitId);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m31500b(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.f30404a.m31487b(placementName);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m31497a(InterfaceC12267jb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f30404a.m31489a(listener);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C12195fb m31499a() {
            return this.f30404a;
        }
    }

    public /* synthetic */ C12195fb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public final String m31491c() {
        return this.f30403a.m31638i();
    }

    /* JADX INFO: renamed from: d */
    public final String m31492d() {
        return this.f30403a.m31639j();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC12213gb.a m31493e() {
        return this.f30403a.m31640k();
    }

    /* JADX INFO: renamed from: f */
    public final AdapterNativeAdViewBinder m31494f() {
        return this.f30403a.m31641l();
    }

    /* JADX INFO: renamed from: g */
    public final String m31495g() {
        return this.f30403a.m31642m();
    }

    /* JADX INFO: renamed from: h */
    public final void m31496h() {
        this.f30403a.m31643n();
    }

    private C12195fb() {
        this.f30403a = new C12231hb(C12546u7.f32555a.m33891a(), this);
    }

    /* JADX INFO: renamed from: a */
    public final void m31488a() {
        this.f30403a.m31635f();
    }

    /* JADX INFO: renamed from: b */
    public final String m31490b() {
        return this.f30403a.m31637h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m31485a(String str) {
        this.f30403a.m33309a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m31487b(String str) {
        this.f30403a.m31633b(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m31489a(InterfaceC12267jb interfaceC12267jb) {
        this.f30403a.m31632a(interfaceC12267jb);
    }
}
