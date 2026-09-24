package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.google.common.base.Ascii;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6356Xt {
    public static byte[] A00;
    public static String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{Ascii.f22490CR, 121, 86, Ascii.f22500SO, 68, 81, 121, 86, Ascii.f22500SO, 126, 68, 8, 95, Ascii.f22503VT, 120, Ascii.f22500SO, Ascii.f22492FF, 126, 100, 8, 127, 120, Ascii.f22503VT, Ascii.f22499SI, 125, 75, 76, 76, 91, 80, 74, Ascii.f22498RS, 77, 74, 95, 93, 85, Ascii.f22498RS, 74, 76, 95, 93, 91, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93};
    }

    static {
        A07();
        A02 = Pattern.compile(A02(0, 24, 9));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int iA0M = C6171Up.A0M(context);
        int maxStacktraceLines = C6171Up.A03(context);
        return A06(th, iA0M, maxStacktraceLines, C6171Up.A1h(context));
    }

    public static String A04(String str) {
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i, int i2, boolean z) {
        String strA02 = A02(0, 0, 105);
        if (th == null) {
            return strA02;
        }
        try {
            C5895QK c5895qk = new C5895QK();
            InterfaceC6354Xr c5894qj = c5895qk;
            String[] strArr = A01;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
            strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
            if (i2 >= 0) {
                c5894qj = new C5893QI(c5894qj, i2);
            }
            if (i >= 0) {
                c5894qj = new C5890QF(c5894qj, i, i);
            }
            if (z) {
                c5894qj = new C5894QJ(c5894qj);
            }
            C5896QL c5896ql = new C5896QL(c5895qk, 1, c5894qj);
            th.printStackTrace(new PrintWriter(new C6355Xs(c5896ql)));
            c5896ql.flush();
            return c5895qk.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(C6353Xq c6353Xq) {
        String middle = c6353Xq.A02();
        if (middle == null) {
            return false;
        }
        boolean zA0A = A0A(middle);
        if (A01[7].charAt(20) == 'o') {
            throw new RuntimeException();
        }
        A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
        if (zA0A) {
            return true;
        }
        for (String str : c6353Xq.A01()) {
            if (A01[2].charAt(10) != '8') {
                if (A0A(str)) {
                    return true;
                }
            } else {
                String[] strArr = A01;
                strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                if (A0A(str)) {
                    return true;
                }
            }
        }
        Iterator<String> it = c6353Xq.A00().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 2));
    }
}
