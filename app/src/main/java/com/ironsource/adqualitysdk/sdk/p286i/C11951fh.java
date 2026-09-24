package com.ironsource.adqualitysdk.sdk.p286i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fh */
/* JADX INFO: loaded from: classes6.dex */
public class C11951fh<T> extends AbstractC11919ec {

    /* JADX INFO: renamed from: ｋ */
    private T f28867;

    public C11951fh(T t, C11904do c11904do) {
        super(c11904do);
        this.f28867 = t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        return new C11908ds(this.f28867);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28867);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f28867;
            T t2 = ((C11951fh) obj).f28867;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f28867;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
