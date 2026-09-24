package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.g */
/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13837g {

    /* JADX INFO: renamed from: a */
    private final String f39450a;

    /* JADX INFO: renamed from: b */
    private final String f39451b;

    public C13837g(String str, String str2) {
        this.f39450a = str;
        this.f39451b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m41105a() {
        return this.f39450a;
    }

    /* JADX INFO: renamed from: b */
    public final String m41106b() {
        return this.f39451b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13837g.class == obj.getClass()) {
            C13837g c13837g = (C13837g) obj;
            if (TextUtils.equals(this.f39450a, c13837g.f39450a) && TextUtils.equals(this.f39451b, c13837g.f39451b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f39450a.hashCode() * 31) + this.f39451b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f39450a + ",value=" + this.f39451b + C11744X3.j.f26440e;
    }
}
