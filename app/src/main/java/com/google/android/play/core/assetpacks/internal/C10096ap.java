package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.ap */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10096ap implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private InterfaceC10099as f22400a;

    /* JADX INFO: renamed from: b */
    public static void m22718b(InterfaceC10099as interfaceC10099as, InterfaceC10099as interfaceC10099as2) {
        C10096ap c10096ap = (C10096ap) interfaceC10099as;
        if (c10096ap.f22400a != null) {
            throw new IllegalStateException();
        }
        c10096ap.f22400a = interfaceC10099as2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final Object mo22526a() {
        InterfaceC10099as interfaceC10099as = this.f22400a;
        if (interfaceC10099as != null) {
            return interfaceC10099as.mo22526a();
        }
        throw new IllegalStateException();
    }
}
