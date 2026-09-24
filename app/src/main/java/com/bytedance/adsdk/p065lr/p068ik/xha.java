package com.bytedance.adsdk.p065lr.p068ik;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class xha<T> {

    /* JADX INFO: renamed from: lr */
    T f5050lr;

    /* JADX INFO: renamed from: ri */
    T f5051ri;

    /* JADX INFO: renamed from: lr */
    private static boolean m6917lr(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return m6917lr(pair.first, this.f5051ri) && m6917lr(pair.second, this.f5050lr);
    }

    public int hashCode() {
        T t = this.f5051ri;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f5050lr;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ri */
    public void m6918ri(T t, T t2) {
        this.f5051ri = t;
        this.f5050lr = t2;
    }

    public String toString() {
        return "Pair{" + this.f5051ri + " " + this.f5050lr + "}";
    }
}
