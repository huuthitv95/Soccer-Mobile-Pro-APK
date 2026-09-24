package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ha */
/* JADX INFO: loaded from: classes6.dex */
public final class C11998ha extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29105 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f29106;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29107 = {2954, 13398, 29732, 46263, 62684, 13463, 30048, 46381, 62736, 13706, 30125, 46647, 63066, 13852, 30459, 46767, 63104, 14170, 30508, 47082, 63367, 14252, 28775, 45104, 61469, 12480, 28826, 45436, 61787, 12559, 29152, 45498, 61836, 12874, 39664, 42299, 58700, 9601, 26044, 42484, 58369, 9286};

    /* JADX INFO: renamed from: ﻐ */
    private static long f29104 = 6185582198779101136L;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int edgeSlop;
        char windowTouchSlop;
        int i;
        int i2 = 2 % 2;
        int i3 = f29105 + 85;
        f29106 = i3 % 128;
        if (i3 % 2 != 0) {
            edgeSlop = ViewConfiguration.getEdgeSlop() * 115;
            windowTouchSlop = (char) (7334 >>> (ViewConfiguration.getWindowTouchSlop() << 114));
            i = (ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)) + 120;
        } else {
            edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
            windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3049);
            i = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35;
        }
        String strIntern = m30251(edgeSlop, windowTouchSlop, i).intern();
        int i4 = f29106 + 57;
        f29105 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29106 + 109;
        int i3 = i2 % 128;
        f29105 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i3 + 9;
        f29106 = i4 % 128;
        int i5 = i4 % 2;
        return UnityServices.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11867ce c11867ce = new C11867ce(mo30209());
        int i2 = f29106 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29105 = i2 % 128;
        if (i2 % 2 != 0) {
            return c11867ce;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29105 + 89;
        f29106 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30251((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39557), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        int i4 = f29105 + 23;
        f29106 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ha$d */
    public static class d extends AbstractC11980gj {

        /* JADX INFO: renamed from: ﻐ */
        private static int f29108 = 1;

        /* JADX INFO: renamed from: ﻛ */
        private static int f29109;

        /* JADX INFO: renamed from: ﾇ */
        private static char[] f29110 = {'K', 156, 161, 128, 132, 164, 158, 161, Typography.copyright, 137, '~', '|', 131, 159, 158, Typography.section, Typography.cent, 153, 151, 159, 131, 'z', 149, 158, 131, 'z', 149, 159, 164, 158, 161, 132, 'j', 133, 143, 148, 158, 161, 141, 133, 158, 161, Typography.cent, Typography.cent, 161, Typography.copyright, 146, 289, 281, 278, 284, 287, 278, 269};

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f29109 + 105;
            f29108 = i2 % 128;
            int i3 = i2 % 2;
            if (m30252()) {
                return null;
            }
            String strIntern = m30253(new int[]{0, 46, 51, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false).intern();
            int i4 = f29109 + 105;
            f29108 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29108 + 17;
            f29109 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!m30252()) {
                    return AdUnitActivity.class;
                }
                int i3 = f29108 + 33;
                f29109 = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            m30252();
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            C11867ce.a aVar = new C11867ce.a(mo30209());
            int i2 = f29109 + 93;
            f29108 = i2 % 128;
            if (i2 % 2 != 0) {
                return aVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﻛ */
        public final String mo30209() {
            int i = 2 % 2;
            int i2 = f29108 + 65;
            f29109 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m30253(new int[]{46, 8, 171, 5}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true).intern();
            int i4 = f29108 + 13;
            f29109 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        /* JADX INFO: renamed from: ﮐ */
        private static boolean m30252() {
            int i = 2 % 2;
            boolean zM28721 = C11836ba.m28721(new C11998ha());
            int i2 = f29108 + 69;
            f29109 = i2 % 128;
            int i3 = i2 % 2;
            return zM28721;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30253(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(C9415C.ISO88591_NAME);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (C12024i.f29270) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f29110, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C12024i.f29269 = 0;
                    char c = 0;
                    while (C12024i.f29269 < i2) {
                        if (bArr[C12024i.f29269] == 1) {
                            cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                        } else {
                            cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                        }
                        c = cArr2[C12024i.f29269];
                        C12024i.f29269++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C12024i.f29269 = 0;
                    while (C12024i.f29269 < i2) {
                        cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                        C12024i.f29269++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C12024i.f29269 = 0;
                    while (C12024i.f29269 < i2) {
                        cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                        C12024i.f29269++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30251(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29107[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29104)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
