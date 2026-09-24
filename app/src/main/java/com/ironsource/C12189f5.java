package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.f5 */
/* JADX INFO: loaded from: classes6.dex */
public class C12189f5 {

    /* JADX INFO: renamed from: a */
    private long f30389a = new Date().getTime();

    /* JADX INFO: renamed from: a */
    public static long m31432a(C12189f5 c12189f5) {
        if (c12189f5 == null) {
            return 0L;
        }
        return new Date().getTime() - c12189f5.f30389a;
    }
}
