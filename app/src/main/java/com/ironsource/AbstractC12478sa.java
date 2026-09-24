package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sa */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12478sa {

    /* JADX INFO: renamed from: a */
    private final C12414p0 f31895a;

    /* JADX INFO: renamed from: b */
    private String f31896b;

    /* JADX INFO: renamed from: c */
    private boolean f31897c;

    public AbstractC12478sa(C12414p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f31895a = adTools;
        this.f31896b = "";
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m33306a() {
        return this.f31895a;
    }

    /* JADX INFO: renamed from: b */
    public final String m33311b() {
        return this.f31896b;
    }

    /* JADX INFO: renamed from: c */
    protected final boolean m33313c() {
        return this.f31897c;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo31634d();

    /* JADX INFO: renamed from: a */
    public final void m33309a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31896b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m33312b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f31895a.m33246e(callback);
    }

    /* JADX INFO: renamed from: a */
    protected final void m33310a(boolean z) {
        this.f31897c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m33308a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f31895a.m33245d(runnable);
    }

    /* JADX INFO: renamed from: a */
    public final void m33307a(C12220h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f31895a.m33047e().m34212a(new C11390D0(this.f31895a, adProperties, null, 4, null));
    }
}
