package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.a */
/* JADX INFO: compiled from: Mapping.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13378a extends Throwable {

    /* JADX INFO: renamed from: a */
    private Class<?> f37114a;

    /* JADX INFO: renamed from: b */
    private String f37115b;

    public C13378a(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public void m38674a(Class<?> cls) {
        this.f37114a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public C13378a(Exception exc) {
        super(exc);
    }

    /* JADX INFO: renamed from: a */
    public void m38675a(String str) {
        this.f37115b = str;
    }
}
