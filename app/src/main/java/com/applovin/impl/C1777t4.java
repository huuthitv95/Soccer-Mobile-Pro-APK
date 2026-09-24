package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;

/* JADX INFO: renamed from: com.applovin.impl.t4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1777t4 extends C1775t2 {

    /* JADX INFO: renamed from: n */
    private final AbstractC1694q0.a f3383n;

    /* JADX INFO: renamed from: o */
    private final Context f3384o;

    /* JADX INFO: renamed from: p */
    private final boolean f3385p;

    public C1777t4(AbstractC1694q0.a aVar, boolean z, Context context) {
        super(C1775t2.c.RIGHT_DETAIL);
        this.f3383n = aVar;
        this.f3384o = context;
        this.f3279c = new SpannedString(aVar.m3957a());
        this.f3385p = z;
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: f */
    public SpannedString mo5215f() {
        return new SpannedString(this.f3383n.m3958a(this.f3384o));
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: o */
    public boolean mo2107o() {
        return false;
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: p */
    public boolean mo5220p() {
        Boolean boolM3959b = this.f3383n.m3959b(this.f3384o);
        if (boolM3959b != null) {
            return boolM3959b.equals(Boolean.valueOf(this.f3385p));
        }
        return false;
    }
}
