package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: renamed from: com.applovin.impl.j4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1590j4 {

    /* JADX INFO: renamed from: a */
    private final View f1891a;

    /* JADX INFO: renamed from: b */
    private final FriendlyObstructionPurpose f1892b;

    /* JADX INFO: renamed from: c */
    private final String f1893c;

    public C1590j4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f1891a = view;
        this.f1892b = friendlyObstructionPurpose;
        this.f1893c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m2987a() {
        return this.f1893c;
    }

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose m2988b() {
        return this.f1892b;
    }

    /* JADX INFO: renamed from: c */
    public View m2989c() {
        return this.f1891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1590j4 c1590j4 = (C1590j4) obj;
            View view = this.f1891a;
            if (view == null ? c1590j4.f1891a != null : !view.equals(c1590j4.f1891a)) {
                return false;
            }
            if (this.f1892b != c1590j4.f1892b) {
                return false;
            }
            String str = this.f1893c;
            String str2 = c1590j4.f1893c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f1891a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f1892b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f1893c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
