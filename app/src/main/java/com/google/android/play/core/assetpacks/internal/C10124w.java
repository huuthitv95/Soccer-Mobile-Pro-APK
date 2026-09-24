package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.w */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10124w extends AbstractRunnableC10117p {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceConnectionC10126y f22424a;

    C10124w(ServiceConnectionC10126y serviceConnectionC10126y) {
        this.f22424a = serviceConnectionC10126y;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractRunnableC10117p
    /* JADX INFO: renamed from: a */
    public final void mo22482a() {
        C10127z.m22772r(this.f22424a.f22425a);
        this.f22424a.f22425a.f22439n = null;
        this.f22424a.f22425a.f22433h = false;
    }
}
