package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7196lb implements InterfaceC5490Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C7196lb A02 = new C7196lb();
    public final List<C7422pT> A00;

    public C7196lb() {
        this.A00 = Collections.emptyList();
    }

    public C7196lb(C7422pT c7422pT) {
        this.A00 = Collections.singletonList(c7422pT);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        AbstractC45353y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
