package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.w2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1802w2 implements Comparable {

    /* JADX INFO: renamed from: a */
    private final String f3502a;

    /* JADX INFO: renamed from: b */
    private final String f3503b;

    /* JADX INFO: renamed from: c */
    private final boolean f3504c;

    /* JADX INFO: renamed from: d */
    private final C1559g3 f3505d;

    C1802w2(String str, String str2, boolean z, C1559g3 c1559g3) {
        this.f3502a = str;
        this.f3503b = str2;
        this.f3504c = z;
        this.f3505d = c1559g3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1802w2 c1802w2) {
        return this.f3503b.compareToIgnoreCase(c1802w2.f3503b);
    }

    /* JADX INFO: renamed from: a */
    public String m5504a() {
        return this.f3503b;
    }

    /* JADX INFO: renamed from: b */
    public List m5505b() {
        List listM2709l = this.f3505d.m2709l();
        return (listM2709l == null || listM2709l.isEmpty()) ? Collections.singletonList(this.f3502a) : listM2709l;
    }

    /* JADX INFO: renamed from: c */
    public String m5506c() {
        return this.f3502a;
    }

    /* JADX INFO: renamed from: d */
    public C1559g3 m5507d() {
        return this.f3505d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1802w2 c1802w2 = (C1802w2) obj;
            String str = this.f3502a;
            if (str == null ? c1802w2.f3502a != null : !str.equals(c1802w2.f3502a)) {
                return false;
            }
            String str2 = this.f3503b;
            if (str2 == null ? c1802w2.f3503b != null : !str2.equals(c1802w2.f3503b)) {
                return false;
            }
            if (this.f3504c == c1802w2.f3504c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3502a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3503b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f3504c ? 1 : 0);
    }
}
