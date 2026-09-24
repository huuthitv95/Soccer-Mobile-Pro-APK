package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.m */
/* JADX INFO: loaded from: classes7.dex */
final class C14692m {

    /* JADX INFO: renamed from: a */
    private static boolean f41761a;

    /* JADX INFO: renamed from: b */
    private boolean f41762b = false;

    /* JADX INFO: renamed from: c */
    private boolean f41763c = false;

    /* JADX INFO: renamed from: d */
    private boolean f41764d = true;

    /* JADX INFO: renamed from: e */
    private boolean f41765e = false;

    C14692m() {
    }

    /* JADX INFO: renamed from: a */
    static void m43414a() {
        f41761a = true;
    }

    /* JADX INFO: renamed from: b */
    static void m43415b() {
        f41761a = false;
    }

    /* JADX INFO: renamed from: c */
    static boolean m43416c() {
        return f41761a;
    }

    /* JADX INFO: renamed from: a */
    final void m43417a(boolean z) {
        this.f41762b = z;
    }

    /* JADX INFO: renamed from: b */
    final void m43418b(boolean z) {
        this.f41764d = z;
    }

    /* JADX INFO: renamed from: c */
    final void m43419c(boolean z) {
        this.f41765e = z;
    }

    /* JADX INFO: renamed from: d */
    final void m43420d(boolean z) {
        this.f41763c = z;
    }

    /* JADX INFO: renamed from: d */
    final boolean m43421d() {
        return this.f41764d;
    }

    /* JADX INFO: renamed from: e */
    final boolean m43422e() {
        return this.f41765e;
    }

    /* JADX INFO: renamed from: e */
    final boolean m43423e(boolean z) {
        if (f41761a) {
            return ((!z && !this.f41762b) || this.f41764d || this.f41763c) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    final boolean m43424f() {
        return this.f41763c;
    }

    public final String toString() {
        return super.toString();
    }
}
