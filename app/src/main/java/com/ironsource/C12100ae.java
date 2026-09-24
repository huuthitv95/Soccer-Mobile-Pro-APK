package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ae */
/* JADX INFO: loaded from: classes6.dex */
public class C12100ae {

    /* JADX INFO: renamed from: a */
    private final C12270je f30042a;

    /* JADX INFO: renamed from: b */
    private final C11440Fe f30043b;

    /* JADX INFO: renamed from: c */
    private final C12113b9 f30044c;

    public C12100ae(C12270je sdkInitResponse, C11440Fe c11440Fe, C12113b9 c12113b9) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f30042a = sdkInitResponse;
        this.f30043b = c11440Fe;
        this.f30044c = c12113b9;
    }

    /* JADX INFO: renamed from: a */
    public final C11553M1 m31103a() {
        return this.f30042a.m31895a().m26719b().m25378d();
    }

    /* JADX INFO: renamed from: b */
    public final C11427F1 m31104b() {
        return this.f30042a.m31895a().m26719b().m25376b();
    }

    /* JADX INFO: renamed from: c */
    public final C11521K5 m31105c() {
        return this.f30042a.m31896b();
    }

    /* JADX INFO: renamed from: d */
    public final C11494Ie m31106d() {
        return this.f30042a.m31897c();
    }

    /* JADX INFO: renamed from: e */
    public final C11383Cb m31107e() {
        return this.f30042a.m31895a().m26719b().m25380f();
    }

    /* JADX INFO: renamed from: f */
    public final C12113b9 m31108f() {
        return this.f30044c;
    }

    /* JADX INFO: renamed from: g */
    public final C11494Ie.a m31109g() {
        C11494Ie.a aVarM26138i = this.f30042a.m31897c().m26138i();
        Intrinsics.checkNotNullExpressionValue(aVarM26138i, "sdkInitResponse.fullResponse.origin");
        return aVarM26138i;
    }

    /* JADX INFO: renamed from: h */
    protected final C12270je m31110h() {
        return this.f30042a;
    }

    /* JADX INFO: renamed from: i */
    public final C11440Fe m31111i() {
        return this.f30043b;
    }

    public /* synthetic */ C12100ae(C12270je c12270je, C11440Fe c11440Fe, C12113b9 c12113b9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12270je, (i & 2) != 0 ? null : c11440Fe, (i & 4) != 0 ? null : c12113b9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12100ae(C12100ae sdkConfig) {
        this(sdkConfig.f30042a, sdkConfig.f30043b, sdkConfig.f30044c);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
