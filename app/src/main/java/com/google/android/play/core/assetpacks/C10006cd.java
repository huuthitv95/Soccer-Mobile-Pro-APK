package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.cd */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10006cd {

    /* JADX INFO: renamed from: a */
    private C10136p f22149a;

    private C10006cd() {
    }

    /* synthetic */ C10006cd(C10005cc c10005cc) {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC9948a m22612a() {
        C10136p c10136p = this.f22149a;
        if (c10136p != null) {
            return new C10004cb(c10136p, null);
        }
        throw new IllegalStateException(String.valueOf(C10136p.class.getCanonicalName()).concat(" must be set"));
    }

    /* JADX INFO: renamed from: b */
    public final C10006cd m22613b(C10136p c10136p) {
        this.f22149a = c10136p;
        return this;
    }
}
