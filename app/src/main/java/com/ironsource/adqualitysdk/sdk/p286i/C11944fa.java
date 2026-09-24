package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.KeyEvent;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11944fa extends AbstractC11922ef {

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28849 = {'|'};

    /* JADX INFO: renamed from: ﻛ */
    private static int f28850 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char f28851 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28852;

    public C11944fa(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908dsM30156 = m30162().m30156(c11907dr, c11877co);
        if (!c11908dsM30156.m30065()) {
            C11908ds c11908dsM30157 = m30163().m30156(c11907dr, c11877co);
            int i2 = f28850 + 3;
            f28852 = i2 % 128;
            int i3 = i2 % 2;
            return c11908dsM30157;
        }
        int i4 = f28850 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28852 = i4 % 128;
        if (i4 % 2 == 0) {
            return c11908dsM30156;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28850 + 91;
        f28852 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30190("ÏÏ", KeyEvent.normalizeMetaState(0) + 2, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 84)).intern();
        int i4 = f28850 + 103;
        f28852 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30190(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28849;
            char c = f28851;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
