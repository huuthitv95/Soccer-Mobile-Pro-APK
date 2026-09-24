package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6229Vm {
    public final AdErrorType A00;
    public final String A01;

    public C6229Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C6229Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C6229Vm A00(AdErrorType adErrorType) {
        return new C6229Vm(adErrorType, (String) null);
    }

    public static C6229Vm A01(AdErrorType adErrorType, String str) {
        return new C6229Vm(adErrorType, str);
    }

    public static C6229Vm A02(C6230Vn c6230Vn) {
        return new C6229Vm(c6230Vn.A00(), c6230Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
