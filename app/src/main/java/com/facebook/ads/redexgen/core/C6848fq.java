package com.facebook.ads.redexgen.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6848fq {
    public float A00;
    public EnumC5622Lr A01;
    public Map<String, String> A02;

    public C6848fq(EnumC5622Lr enumC5622Lr) {
        this(enumC5622Lr, 0.0f);
    }

    public C6848fq(EnumC5622Lr enumC5622Lr, float f) {
        this(enumC5622Lr, f, null);
    }

    public C6848fq(@Nullable EnumC5622Lr enumC5622Lr, float f, Map<String, String> windowParams) {
        this.A01 = enumC5622Lr;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC5622Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC5622Lr.A0I;
    }
}
