package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3K */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C44963K extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C44963K() {
    }

    @Deprecated
    public C44963K(String str) {
        super(str);
    }

    public C44963K(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }

    public static C44963K A00(String str) {
        return new C44963K(str, null, false, 1);
    }

    public static C44963K A01(String str, Throwable th) {
        return new C44963K(str, th, true, 1);
    }

    public static C44963K A02(String str, Throwable th) {
        return new C44963K(str, th, true, 0);
    }
}
