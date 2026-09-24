package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3656b5 {

    /* JADX INFO: renamed from: a */
    public final C3679c5 f13538a;

    /* JADX INFO: renamed from: b */
    public C3966oh f13539b;

    /* JADX INFO: renamed from: c */
    public Function0 f13540c;

    public C3656b5(C3679c5 compositeCloseChipView) {
        Intrinsics.checkNotNullParameter(compositeCloseChipView, "compositeCloseChipView");
        this.f13538a = compositeCloseChipView;
    }

    /* JADX INFO: renamed from: a */
    public final void m16901a() {
        C3966oh c3966oh = this.f13539b;
        if (c3966oh != null) {
            c3966oh.m18966a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16902a(long j, EnumC4032rh mode, String str, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f13540c = function0;
        C3966oh c3966oh = this.f13539b;
        if (c3966oh != null) {
            c3966oh.m18966a();
        }
        C3966oh c3966oh2 = new C3966oh(j, this.f13540c);
        c3966oh2.m18967a(this.f13538a.getTimerChipView());
        c3966oh2.m18968a(mode, str, str2);
        this.f13539b = c3966oh2;
    }

    /* JADX INFO: renamed from: a */
    public final void m16903a(Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13540c = listener;
    }

    /* JADX INFO: renamed from: b */
    public final C3966oh m16904b() {
        return this.f13539b;
    }

    /* JADX INFO: renamed from: c */
    public final void m16905c() {
        C3966oh c3966oh = this.f13539b;
        if (c3966oh != null) {
            c3966oh.m18973e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16906d() {
        C3966oh c3966oh = this.f13539b;
        if (c3966oh != null) {
            c3966oh.m18974f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16907e() {
        C3966oh c3966oh = this.f13539b;
        if (c3966oh != null) {
            c3966oh.m18975g();
        }
    }
}
