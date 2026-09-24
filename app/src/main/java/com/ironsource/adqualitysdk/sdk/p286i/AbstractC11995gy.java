package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.warren.VungleApiClient;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gy */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11995gy extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static char f29086 = 3;

    /* JADX INFO: renamed from: ｋ */
    private static int f29087 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29088;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f29089 = {'v', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'w', 'x', 'y'};

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gy$d */
    public static class d extends AbstractC11995gy {

        /* JADX INFO: renamed from: ﱡ */
        private static int f29094 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static char f29095 = 42734;

        /* JADX INFO: renamed from: ﻛ */
        private static char f29096 = 53337;

        /* JADX INFO: renamed from: ｋ */
        private static char f29097 = 8978;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29098 = 2681;

        /* JADX INFO: renamed from: ﾒ */
        private static int f29099;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f29094 + 9;
            f29099 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m30250("풄ﻊᐱ洬ꌹ듍\udaeb㓠䔯嗘㻢匄ꪷैⲴ챍ϭ娋\ued37ᔾ\udaeb㓠䔯嗘稼ꍗ匦셿ẍ嗧\ueab7괒ℸ\udc98", (ViewConfiguration.getScrollBarSize() >> 8) + 33).intern();
            int i4 = f29099 + 77;
            f29094 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29094 + 15;
            f29099 = i2 % 128;
            if (i2 % 2 == 0) {
                return VungleApiClient.class;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            C11866cd c11866cd = new C11866cd(m30250("ꌹ듍\udaeb㓠䔯嗘", AndroidCharacter.getMirror('0') - '*').intern());
            int i2 = f29094 + 19;
            f29099 = i2 % 128;
            int i3 = i2 % 2;
            return c11866cd;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m30250(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29098)) ^ ((c2 >>> 5) + f29096)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29095) ^ ((c3 + i2) ^ ((c3 << 4) + f29097))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gy$a */
    public static class a extends AbstractC11995gy {

        /* JADX INFO: renamed from: ﻐ */
        private static int f29090 = 0;

        /* JADX INFO: renamed from: ﻛ */
        private static char[] f29091 = {'c', 'o', 'm', '.', 'v', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'a', 'd', 's', 'i', 't', 'r', 'w', 'k', 'V', 'A', 'p', 'C', 'f', 'h', 'j'};

        /* JADX INFO: renamed from: ﾇ */
        private static int f29092 = 1;

        /* JADX INFO: renamed from: ﾒ */
        private static char f29093 = 5;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int iLastIndexOf;
            int iAxisFromString;
            int i = 2 % 2;
            int i2 = f29092 + 65;
            f29090 = i2 % 128;
            if (i2 % 2 != 0) {
                iLastIndexOf = TextUtils.lastIndexOf("", ';', 1) * 98;
                iAxisFromString = 61 >>> MotionEvent.axisFromString("");
            } else {
                iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 48;
                iAxisFromString = 64 - MotionEvent.axisFromString("");
            }
            String strIntern = m30249("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u0000\r\f\r\b\u0012\t\u000b\u0005\u0013\u0005\u000b\r\b\u0007\u0005\u000b\u0013\u0000\u0010\u0012\u0002\u000f\b\u0007\b\t\u0005\u000f\u0018\u000b\u0017\r\u0012\u0005\u0007µ", iLastIndexOf, (byte) iAxisFromString).intern();
            int i3 = f29092 + 9;
            f29090 = i3 % 128;
            if (i3 % 2 == 0) {
                return strIntern;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29090 + 37;
            f29092 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return com.vungle.ads.internal.network.VungleApiClient.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            C11872cj c11872cj = new C11872cj(mo30209());
            int i2 = f29092 + 49;
            f29090 = i2 % 128;
            if (i2 % 2 == 0) {
                return c11872cj;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        private static String m30249(String str, int i, byte b) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11970g.f28961) {
                char[] cArr2 = f29091;
                char c = f29093;
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

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int keyRepeatTimeout;
        int iIndexOf;
        int i = 2 % 2;
        int i2 = f29087 + 11;
        f29088 = i2 % 128;
        if (i2 % 2 != 0) {
            keyRepeatTimeout = 38 - (ViewConfiguration.getKeyRepeatTimeout() + 36);
            iIndexOf = TextUtils.indexOf((CharSequence) "", 'H', 1, 1) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE;
        } else {
            keyRepeatTimeout = 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            iIndexOf = 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        }
        return m30248("\u0001\u0002\u0000\u0005\u0005\u0003", keyRepeatTimeout, (byte) iIndexOf).intern();
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30248(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29089;
            char c = f29086;
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
