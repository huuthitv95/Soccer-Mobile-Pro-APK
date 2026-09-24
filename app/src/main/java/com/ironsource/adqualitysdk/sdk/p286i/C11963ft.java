package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ft */
/* JADX INFO: loaded from: classes6.dex */
public final class C11963ft extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﻛ */
    private C11931eo f28926;

    /* JADX INFO: renamed from: ﾇ */
    private C11954fk f28927;

    /* JADX INFO: renamed from: ﾒ */
    private C11954fk f28928;

    public C11963ft(C11954fk c11954fk, C11954fk c11954fk2, C11931eo c11931eo) {
        this.f28927 = c11954fk;
        this.f28928 = c11954fk2;
        this.f28926 = c11931eo;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        try {
            C11954fk c11954fk = this.f28927;
            if (c11954fk != null) {
                return c11954fk.mo30195(new C11907dr(c11907dr), c11877co);
            }
        } catch (Throwable th) {
            if (this.f28928 != null) {
                HashMap map = new HashMap();
                C11931eo c11931eo = this.f28926;
                if (c11931eo != null) {
                    map.put(C11914dy.m30142(c11931eo.m30179()), th);
                }
                return this.f28928.mo30195(new C11907dr(map, c11907dr), c11877co);
            }
        }
        return new C11908ds(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11963ft c11963ft = (C11963ft) obj;
            C11954fk c11954fk = this.f28927;
            if (c11954fk == null ? c11963ft.f28927 != null : !c11954fk.equals(c11963ft.f28927)) {
                return false;
            }
            C11954fk c11954fk2 = this.f28928;
            if (c11954fk2 == null ? c11963ft.f28928 != null : !c11954fk2.equals(c11963ft.f28928)) {
                return false;
            }
            C11931eo c11931eo = this.f28926;
            C11931eo c11931eo2 = c11963ft.f28926;
            if (c11931eo != null) {
                return c11931eo.equals(c11931eo2);
            }
            if (c11931eo2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C11954fk c11954fk = this.f28927;
        int iHashCode = (c11954fk != null ? c11954fk.hashCode() : 0) * 31;
        C11954fk c11954fk2 = this.f28928;
        int iHashCode2 = (iHashCode + (c11954fk2 != null ? c11954fk2.hashCode() : 0)) * 31;
        C11931eo c11931eo = this.f28926;
        return iHashCode2 + (c11931eo != null ? c11931eo.hashCode() : 0);
    }
}
