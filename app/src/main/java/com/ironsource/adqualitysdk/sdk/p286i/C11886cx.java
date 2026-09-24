package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.view.Gravity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cx */
/* JADX INFO: loaded from: classes6.dex */
public class C11886cx {

    /* JADX INFO: renamed from: ﻛ */
    private static long f28470 = 5366394697164734432L;

    /* JADX INFO: renamed from: ｋ */
    private static int f28471 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28472;

    /* JADX INFO: renamed from: ﻐ */
    public static <T> T m29851(List<Object> list, int i, Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = f28471 + 15;
        f28472 = i3 % 128;
        int i4 = i3 % 2;
        T t = (T) list.get(i);
        if (t == null) {
            return t;
        }
        int i5 = f28471 + 87;
        f28472 = i5 % 128;
        if (i5 % 2 != 0) {
            cls.isAssignableFrom(t.getClass());
            throw null;
        }
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m29853("㾣ྺ忸꼿｣캳Ả渞빙趀\udddaⵉ", 12347 - Gravity.getAbsoluteGravity(0, 0)).intern());
        sb.append(t.getClass().getName());
        sb.append(m29853("㿀➡\u0fe5睟", 6197 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        sb.append(cls.getName());
        throw new ClassCastException(sb.toString());
    }

    /* JADX INFO: renamed from: ｋ */
    protected static <T> boolean m29852(List<Object> list, int i, Class<T> cls) {
        int i2 = 2 % 2;
        Object obj = list.get(i);
        if (obj == null) {
            return true;
        }
        int i3 = f28472 + 3;
        f28471 = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsAssignableFrom = cls.isAssignableFrom(obj.getClass());
        if (i4 == 0) {
            int i5 = 86 / 0;
            if (zIsAssignableFrom) {
                return true;
            }
        } else if (zIsAssignableFrom) {
            return true;
        }
        int i6 = f28472 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28471 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ */
    protected static List<Object> m29854(List<Object> list, int i) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list.size() <= i || !m29852(list, i, List.class)) {
            return arrayList;
        }
        int i3 = f28471 + 47;
        f28472 = i3 % 128;
        int i4 = i3 % 2;
        List<Object> list2 = (List) m29851(list, i, List.class);
        int i5 = f28471 + 15;
        f28472 = i5 % 128;
        int i6 = i5 % 2;
        return list2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29853(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28470);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
