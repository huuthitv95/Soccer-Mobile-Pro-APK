package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.aq */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10097aq implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private static final Object f22401a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC10099as f22402b;

    /* JADX INFO: renamed from: c */
    private volatile Object f22403c = f22401a;

    private C10097aq(InterfaceC10099as interfaceC10099as) {
        this.f22402b = interfaceC10099as;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10099as m22719b(InterfaceC10099as interfaceC10099as) {
        return interfaceC10099as instanceof C10097aq ? interfaceC10099as : new C10097aq(interfaceC10099as);
    }

    /* JADX INFO: renamed from: c */
    public static C10097aq m22720c(InterfaceC10099as interfaceC10099as) {
        return new C10097aq(interfaceC10099as);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final Object mo22526a() {
        Object objA;
        Object obj = this.f22403c;
        Object obj2 = f22401a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.f22403c;
            if (objA == obj2) {
                objA = this.f22402b.mo22526a();
                Object obj3 = this.f22403c;
                if (obj3 != obj2 && obj3 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f22403c = objA;
                this.f22402b = null;
            }
        }
        return objA;
    }
}
