package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.AndroidCharacter;
import android.view.KeyEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cv */
/* JADX INFO: loaded from: classes6.dex */
public final class C11884cv extends C11886cx {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28356 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int[] f28357 = {-1413691423, -1996379914, 1794226439, -1998320882, 1353487666, 64351862, 1499991305, -1734957917, 63197905, -43151862, 383553245, -1514260470, 276016390, 166698889, -167229824, 64228116, -1885395792, -2096266012};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28358;

    /* JADX INFO: renamed from: ｋ */
    public final Object m29802(C11877co c11877co, List<Object> list) {
        C11877co c11877co2;
        int i = 2 % 2;
        List list2 = (List) m29851(list, 0, List.class);
        try {
            C11906dq c11906dq = (C11906dq) m29851(list, 1, C11906dq.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                c11877co2 = c11877co;
            } else if (m29852(list, 2, C11877co.class)) {
                int i2 = f28356 + 109;
                f28358 = i2 % 128;
                if (i2 % 2 != 0) {
                    c11877co2 = (C11877co) m29851(list, 5, C11877co.class);
                    if (list.size() > 5) {
                        arrayList = m29854(list, 3);
                    }
                } else {
                    c11877co2 = (C11877co) m29851(list, 2, C11877co.class);
                    if (list.size() > 3) {
                        arrayList = m29854(list, 3);
                    }
                }
            } else {
                arrayList = m29854(list, 2);
                c11877co2 = c11877co;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < list2.size(); i3++) {
                int i4 = f28358 + 95;
                f28356 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(0, list2.get(i3));
                arrayList2.add(c11906dq.m30048(c11877co2.m29669(), c11877co2, arrayList).m30066());
                arrayList.remove(0);
            }
            int i6 = f28358 + 91;
            f28356 = i6 % 128;
            if (i6 % 2 != 0) {
                return arrayList2;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Exception e) {
            C11875cm.m29607(c11877co.m29666(), m29801(new int[]{262624675, 58730878, -1821199250, 1444272349, -1570128507, -1574571885, 244859759, 456380349, 929169069, 1630480305, 615888354, -600248332, 1977725248, 474126855, -1792198216, 178248046, -1711343154, -1981049972}, 33 - KeyEvent.getDeadChar(0, 0)).intern(), e);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m29804(C11877co c11877co, List<Object> list) {
        int i = 2 % 2;
        int i2 = f28356 + 77;
        f28358 = i2 % 128;
        int i3 = i2 % 2;
        m29802(c11877co, list);
        int i4 = f28358 + 109;
        f28356 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d A[Catch: Exception -> 0x00be, TRY_ENTER, TryCatch #0 {Exception -> 0x00be, blocks: (B:3:0x000c, B:5:0x0020, B:9:0x0034, B:16:0x005d, B:17:0x0062, B:21:0x0075, B:22:0x007b, B:24:0x0081, B:29:0x00a2, B:31:0x00af, B:33:0x00b7, B:34:0x00ba, B:30:0x00a9, B:12:0x0044, B:18:0x0067), top: B:41:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:3:0x000c, B:5:0x0020, B:9:0x0034, B:16:0x005d, B:17:0x0062, B:21:0x0075, B:22:0x007b, B:24:0x0081, B:29:0x00a2, B:31:0x00af, B:33:0x00b7, B:34:0x00ba, B:30:0x00a9, B:12:0x0044, B:18:0x0067), top: B:41:0x000c }] */
    /* JADX INFO: renamed from: ﾇ */
    public final Object m29803(C11877co c11877co, List<Object> list) {
        C11877co c11877co2;
        int i;
        int i2 = 2 % 2;
        List list2 = (List) m29851(list, 0, List.class);
        try {
            C11906dq c11906dq = (C11906dq) m29851(list, 1, C11906dq.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                c11877co2 = c11877co;
            } else if (m29852(list, 2, C11877co.class)) {
                int i3 = f28356 + 113;
                f28358 = i3 % 128;
                if (i3 % 2 != 0) {
                    c11877co2 = (C11877co) m29851(list, 4, C11877co.class);
                    if (list.size() > 4) {
                        i = f28356 + 113;
                        f28358 = i % 128;
                        if (i % 2 != 0) {
                            arrayList = m29854(list, 2);
                        } else {
                            arrayList = m29854(list, 3);
                        }
                    }
                } else {
                    c11877co2 = (C11877co) m29851(list, 2, C11877co.class);
                    if (list.size() > 3) {
                        i = f28356 + 113;
                        f28358 = i % 128;
                        if (i % 2 != 0) {
                            arrayList = m29854(list, 2);
                        } else {
                            arrayList = m29854(list, 3);
                        }
                    }
                }
            } else {
                arrayList = m29854(list, 2);
                int i4 = f28358 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f28356 = i4 % 128;
                int i5 = i4 % 2;
                c11877co2 = c11877co;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < list2.size(); i6++) {
                arrayList.add(0, list2.get(i6));
                if (c11906dq.m30048(c11877co2.m29669(), c11877co2, arrayList).m30065()) {
                    int i7 = f28356 + 53;
                    f28358 = i7 % 128;
                    if (i7 % 2 != 0) {
                        arrayList2.add(list2.get(i6));
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }
                    arrayList2.add(list2.get(i6));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e) {
            C11875cm.m29607(c11877co.m29666(), m29801(new int[]{262624675, 58730878, -1821199250, 1444272349, -1570128507, -1574571885, -1032031294, 944887137, -1751789064, -1473819269, -681876097, 356277425, 621364211, 1492343823}, AndroidCharacter.getMirror('0') - 20).intern(), e);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29801(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28357.clone();
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
