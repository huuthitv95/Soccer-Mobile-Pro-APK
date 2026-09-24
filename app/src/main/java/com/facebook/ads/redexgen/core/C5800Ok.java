package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ok */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5800Ok implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C5800Ok A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C5800Ok> A04;

    public C5800Ok(int i, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public C5800Ok(String str) {
        this(0, null, str);
    }

    private void A00(C5800Ok c5800Ok) {
        this.A00 = c5800Ok;
    }

    public final int A01() {
        return this.A01;
    }

    public final C5800Ok A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C5800Ok> A05() {
        return this.A04;
    }

    public final void A06(C5800Ok c5800Ok) {
        c5800Ok.A00(this);
        this.A04.add(c5800Ok);
    }
}
