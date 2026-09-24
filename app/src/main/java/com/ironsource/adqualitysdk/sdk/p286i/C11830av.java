package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.av */
/* JADX INFO: loaded from: classes6.dex */
public final class C11830av extends AbstractC11823ao.AnonymousClass3 {

    /* JADX INFO: renamed from: ﻐ */
    private static long f27273 = -7187338714458265620L;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27274 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27275;

    public C11830av(C11829au c11829au) {
        m28508(c11829au);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final List<String> m28600() {
        int i = 2 % 2;
        int i2 = f27274 + 105;
        f27275 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM28590 = m28506().m28590();
        int i4 = f27274 + 51;
        f27275 = i4 % 128;
        int i5 = i4 % 2;
        return listM28590;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final int m28597() {
        int i = 2 % 2;
        int i2 = f27274 + 89;
        f27275 = i2 % 128;
        if (i2 % 2 != 0) {
            m28506().m28588();
            throw null;
        }
        int iM28588 = m28506().m28588();
        int i3 = f27274 + 75;
        f27275 = i3 % 128;
        int i4 = i3 % 2;
        return iM28588;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final List<String> m28601() {
        int i = 2 % 2;
        int i2 = f27274 + 53;
        f27275 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listM28591 = m28506().m28591();
        int i4 = f27275 + 107;
        f27274 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return listM28591;
    }

    /* JADX INFO: renamed from: ｋ */
    public final int m28599() {
        int i = 2 % 2;
        int i2 = f27274 + 27;
        f27275 = i2 % 128;
        int i3 = i2 % 2;
        int iM28592 = m28506().m28592();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return iM28592;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m28598() {
        int i = 2 % 2;
        int i2 = f27274 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27275 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOptBoolean = m28507().optBoolean(m28595("ꉡᬲꈆ粩㙇里톈\ue62f", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern(), true);
        int i4 = f27275 + 101;
        f27274 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final boolean m28596() {
        JSONObject jSONObjectM28507;
        int modifierMetaStateMask;
        int i = 2 % 2;
        int i2 = f27274 + 115;
        f27275 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM28507 = m28507();
            modifierMetaStateMask = (-1) / ((byte) KeyEvent.getModifierMetaStateMask());
        } else {
            jSONObjectM28507 = m28507();
            modifierMetaStateMask = (-1) - ((byte) KeyEvent.getModifierMetaStateMask());
        }
        boolean zOptBoolean = jSONObjectM28507.optBoolean(m28595("秶湤禑\u09ff\udcb2ጉ찚﮽", modifierMetaStateMask).intern(), true);
        int i3 = f27275 + 29;
        f27274 = i3 % 128;
        int i4 = i3 % 2;
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28595(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27273, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27273));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
