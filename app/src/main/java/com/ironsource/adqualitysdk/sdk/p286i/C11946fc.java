package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.PointF;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11946fc extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28856 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f28857 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static long f28858 = 2148721239103029372L;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11919ec f28859;

    public C11946fc(AbstractC11919ec abstractC11919ec, C11904do c11904do) {
        super(c11904do);
        this.f28859 = abstractC11919ec;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        return new C11908ds(Boolean.valueOf(!this.f28859.m30156(c11907dr, c11877co).m30065()));
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30192("㩖\uec93㩷甥籁", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        sb.append(this.f28859);
        String string = sb.toString();
        int i2 = f28857 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28856 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30192(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28858, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28858));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
