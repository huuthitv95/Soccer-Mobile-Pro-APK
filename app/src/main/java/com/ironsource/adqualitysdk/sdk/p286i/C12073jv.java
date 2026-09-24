package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jv */
/* JADX INFO: loaded from: classes6.dex */
public final class C12073jv {

    /* JADX INFO: renamed from: ｋ */
    private static int[] f29739 = {390815827, -948949440, -1122812077, -1853809465, -741090005, 159709146, 1786874167, 946840139, -2136067917, 880462095, -2047478595, 755208786, 1050946452, 1920557003, 737550895, -1939336046, 856952846, -1528927884};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29740 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29741;

    /* JADX INFO: renamed from: ﻐ */
    public static String m30753(String str) {
        int i = 2 % 2;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m30754(new int[]{2103363353, -276329775, -600947817, 320909458, -257097281, -1513629734, 474723678, -14570196, 1997672544, -1952178414, -871162285, -910971727, -2113408905, 31798544, 133739668, -407466548, 746613566, -493613543}, TextUtils.getOffsetBefore("", 0) + 34).intern().getBytes(m30754(new int[]{161618433, -1283765514, -318721837, -1085398435}, TextUtils.indexOf((CharSequence) "", '0') + 6).intern()), mac.getAlgorithm()));
            String strM30484 = C12030if.m30484(mac.doFinal(str.replaceAll(m30754(new int[]{-1219306102, 371216995}, -MotionEvent.axisFromString("")).intern(), "").replaceAll(m30754(new int[]{1008457869, 433423455}, 1 - TextUtils.getCapsMode("", 0, 0)).intern(), "").getBytes(m30754(new int[]{161618433, -1283765514, -318721837, -1085398435}, 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())));
            int i2 = f29741 + 59;
            f29740 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return strM30484;
        } catch (Exception e) {
            String strIntern = m30754(new int[]{1868091106, 1141888148, 1275789660, 1963145949, 1023572656, 1290238461}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30754(new int[]{453461910, -36267501, -1446855784, -330562020}, TextUtils.lastIndexOf("", '0', 0, 0) + 8).intern());
            sb.append(e.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30754(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29739.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
