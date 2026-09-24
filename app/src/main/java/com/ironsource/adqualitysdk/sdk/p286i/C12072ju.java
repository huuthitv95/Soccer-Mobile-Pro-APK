package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ju */
/* JADX INFO: loaded from: classes6.dex */
public class C12072ju {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29736 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f29737;

    /* JADX INFO: renamed from: ﾒ */
    private static int[] f29738 = {-1296654328, -1863864952, 1969125490, 1852356833, -1467609127, 1210427264, -888038989, 1157150590, -981879975, 419061461, -435348779, -617853603, -1419023415, -712078375, 518329671, -1014269820, -1205050954, -1893253067};

    /* JADX INFO: renamed from: ﾇ */
    public static void m30751(AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f29737 + 97;
        f29736 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Executors.newSingleThreadExecutor().execute(abstractRunnableC12044it);
            } else {
                Executors.newSingleThreadExecutor().execute(abstractRunnableC12044it);
                throw null;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30747(new int[]{1410987069, -1686062593, -808732742, -1421329368, 1666909846, -388580618, -1177256668, 900120477}, 14 - View.MeasureSpec.getSize(0)).intern(), m30747(new int[]{1123964314, 28599447, 1229594113, 1985649954, -846766716, 1664681094, -1810895952, -1217046147, 517930267, -1796781530, 514209756, 186592049, 480206066, -1687568986}, TextUtils.getOffsetAfter("", 0) + 26).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static long m30752() {
        int i = 2 % 2;
        int i2 = f29737 + 101;
        f29736 = i2 % 128;
        int i3 = i2 % 2;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i4 = f29737 + 1;
        f29736 = i4 % 128;
        if (i4 % 2 != 0) {
            return timeInMillis;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public static long m30750() {
        int i = 2 % 2;
        int i2 = f29736 + 19;
        f29737 = i2 % 128;
        if (i2 % 2 == 0) {
            return SystemClock.elapsedRealtime();
        }
        int i3 = 37 / 0;
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ﻐ */
    public static String m30746(String str, String str2, String str3, String str4) {
        long j;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
            CipherInputStream cipherInputStream = null;
            try {
                try {
                    byte[] bArrM30748 = m30748(str3);
                    byte[] bArrM30749 = m30748(str4);
                    Cipher cipher = Cipher.getInstance(m30747(new int[]{704505407, -2094319922, 739405921, -1880122823, -1336617293, 137927232, 1000521766, 839960871, 923650911, 691614715}, 20 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                    j = 0;
                    try {
                        cipher.init(2, SecretKeyFactory.getInstance(m30747(new int[]{-777648670, 505037437, 1329101334, 1108315605, -1380787515, -1553148841, 104365122, 2046539093, 359166674, -1139763114, 92551876, -1782014740, -1629043831, -225461788, 222561691, 746121720, -1148320540, -1323187321}, 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m30747(new int[]{1708560604, -818881384}, 2 - ExpandableListView.getPackedPositionGroup(0L)).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), bArrM30749, 1, 256)), new IvParameterSpec(bArrM30748, 0, cipher.getBlockSize()));
                        CipherInputStream cipherInputStream2 = new CipherInputStream(new ByteArrayInputStream(bArrCopyOfRange), cipher);
                        try {
                            m30747(new int[]{892933741, 836594385, -1367944008, 604026250}, (ViewConfiguration.getTapTimeout() >> 16) + 5).intern();
                            byte[] bArr = new byte[8192];
                            for (int i2 = cipherInputStream2.read(bArr); i2 >= 0; i2 = cipherInputStream2.read(bArr)) {
                                sb.append(new String(bArr, 0, i2, m30747(new int[]{892933741, 836594385, -1367944008, 604026250}, AndroidCharacter.getMirror('0') - '+').intern()));
                            }
                            cipherInputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            cipherInputStream = cipherInputStream2;
                            try {
                                C12080kb.m30845(m30747(new int[]{1410987069, -1686062593, -808732742, -1421329368, 1666909846, -388580618, -1177256668, 900120477}, 13 - MotionEvent.axisFromString("")).intern(), m30747(new int[]{1123964314, 28599447, 449207135, 2104616111, 11821430, 812930233, -1836118066, 1400317244, 2061747491, 210127229, 869811505, 1145778313}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22).intern(), th, false);
                                if (cipherInputStream != null) {
                                    cipherInputStream.close();
                                } else {
                                    int i3 = f29737 + 83;
                                    f29736 = i3 % 128;
                                    int i4 = i3 % 2;
                                }
                                return sb.toString();
                            } catch (Throwable th2) {
                                if (cipherInputStream != null) {
                                    cipherInputStream.close();
                                    int i5 = f29736 + 1;
                                    f29737 = i5 % 128;
                                    int i6 = i5 % 2;
                                }
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    C12080kb.m30845(m30747(new int[]{1410987069, -1686062593, -808732742, -1421329368, 1666909846, -388580618, -1177256668, 900120477}, TextUtils.lastIndexOf("", '0', 0) + 15).intern(), m30747(new int[]{1123964314, 28599447, -909132650, -2026011511, -1659688171, 1464843740, -1844478748, 1737931308, -1752995566, 1438804208, -233460997, -1416650112, 453575119, -16069322}, ExpandableListView.getPackedPositionGroup(j) + 27).intern(), th, false);
                                    return sb.toString();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j = 0;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th6) {
            th = th6;
            j = 0;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] m30748(String str) {
        int i = 2 % 2;
        int i2 = f29737 + 41;
        f29736 = i2 % 128;
        int i3 = i2 % 2;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 / 2] = (byte) ((Character.digit(str.charAt(i4), 16) << 4) + Character.digit(str.charAt(i4 + 1), 16));
        }
        int i5 = f29736 + 49;
        f29737 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static List m30749(List list, List list2) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i2 = f29736 + 83;
            f29737 = i2 % 128;
            int i3 = i2 % 2;
            hashSet.addAll(list2);
            int i4 = f29737 + 7;
            f29736 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new ArrayList(hashSet);
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30747(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29738.clone();
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
