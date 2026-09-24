package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C7972f implements InterfaceC7970d {

    /* JADX INFO: renamed from: a */
    public final String f17753a;

    /* JADX INFO: renamed from: b */
    public final boolean f17754b;

    public C7972f(boolean z, String str) {
        this.f17753a = str;
        this.f17754b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC7970d
    /* JADX INFO: renamed from: a */
    public final boolean mo20412a(C7971e c7971e) {
        String str = this.f17753a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f17754b : this.f17754b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f17753a + " include: " + this.f17754b;
    }
}
