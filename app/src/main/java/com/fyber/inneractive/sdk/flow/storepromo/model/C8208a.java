package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.model.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8208a implements Comparable {

    /* JADX INFO: renamed from: a */
    public final EnumC8209b f18292a;

    /* JADX INFO: renamed from: b */
    public final String f18293b;

    /* JADX INFO: renamed from: c */
    public final int f18294c;

    public C8208a(String str, EnumC8209b enumC8209b) {
        this.f18293b = str;
        this.f18292a = enumC8209b;
        this.f18294c = -1;
    }

    public C8208a(String str, EnumC8209b enumC8209b, int i) {
        this.f18293b = str;
        this.f18292a = enumC8209b;
        this.f18294c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18294c - ((C8208a) obj).f18294c;
    }
}
