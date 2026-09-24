package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3710dd {

    /* JADX INFO: renamed from: a */
    public Context f13828a;

    /* JADX INFO: renamed from: b */
    public boolean f13829b;

    /* JADX INFO: renamed from: c */
    public C3685cb f13830c;

    /* JADX INFO: renamed from: d */
    public C3685cb f13831d;

    public C3710dd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13828a = context;
        this.f13830c = new C3685cb(0, 0, 0, 0, 15, null);
        this.f13831d = new C3685cb(0, 0, 0, 0, 15, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17280a(int i, int i2) {
        if (this.f13830c.m17064b() == i && this.f13830c.m17062a() == i2) {
            return;
        }
        C3685cb c3685cb = this.f13830c;
        c3685cb.m17067c(0);
        c3685cb.m17069d(0);
        c3685cb.m17065b(i);
        c3685cb.m17063a(i2);
        m17282a(this.f13830c, this.f13831d);
        this.f13829b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m17281a(int i, int i2, int i3, int i4) {
        if (Intrinsics.areEqual(new C3685cb(i, i2, i3, i4), this.f13830c)) {
            return;
        }
        C3685cb c3685cb = this.f13830c;
        c3685cb.m17067c(i);
        c3685cb.m17069d(i2);
        c3685cb.m17065b(i3);
        c3685cb.m17063a(i4);
        m17282a(this.f13830c, this.f13831d);
        this.f13829b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m17282a(C3685cb c3685cb, C3685cb c3685cb2) {
        C3955o6 c3955o6 = C3955o6.f15634a;
        c3685cb2.m17067c(c3955o6.m18879a(c3685cb.m17066c(), this.f13828a));
        c3685cb2.m17069d(c3955o6.m18879a(c3685cb.m17068d(), this.f13828a));
        c3685cb2.m17065b(c3955o6.m18879a(c3685cb.m17064b(), this.f13828a));
        c3685cb2.m17063a(c3955o6.m18879a(c3685cb.m17062a(), this.f13828a));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17283a() {
        if (!this.f13829b) {
            return false;
        }
        this.f13829b = false;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C3685cb m17284b() {
        return this.f13831d;
    }

    public String toString() {
        return "width: " + this.f13831d.m17064b() + " height: " + this.f13831d.m17062a() + " + x: " + this.f13831d.m17066c() + " y: " + this.f13831d.m17068d();
    }
}
