package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cz */
/* JADX INFO: loaded from: classes6.dex */
public final class C11888cz extends C11886cx {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28473 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28474 = 40990;

    /* JADX INFO: renamed from: ｋ */
    private static long f28475;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28476;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28477;

    /* JADX INFO: renamed from: ﻛ */
    public static Object m29860(C11877co c11877co, List<Object> list) {
        int i = 2 % 2;
        Class cls = (Class) m29851(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList = (List) m29851(list, 1, List.class);
            int i2 = f28473 + 101;
            f28477 = i2 % 128;
            int i3 = i2 % 2;
        }
        List list2 = list.size() > 2 ? (List) m29851(list, 2, List.class) : null;
        try {
            if (list2 == null) {
                return C12079ka.m30819(cls, (List<Object>) arrayList);
            }
            int i4 = f28473 + 51;
            f28477 = i4 % 128;
            int i5 = i4 % 2;
            Class[] clsArr = new Class[list2.size()];
            list2.toArray(clsArr);
            return C12079ka.m30831(cls, arrayList, clsArr);
        } catch (Exception e) {
            String strM29740 = c11877co.m29676().m29740();
            StringBuilder sb = new StringBuilder();
            sb.append(m29862("㶴䏶眙\uea76빊薮Ņ㝞䇮䋦瘝鉶嫊\ud80a\ue5d8侚\ueed8奌砊", (char) (27713 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1286077059, "莅ꟺ䅌뵬").intern());
            sb.append(cls.getName());
            String string = "";
            sb.append(m29862("곴⫒儳灔崛ﾳꅢ埂치朄\ueb61", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", (-1600988829) - TextUtils.getOffsetAfter("", 0), "描鋙ꆠ\udfef").intern());
            sb.append(arrayList);
            if (list2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m29862("똹\uf72c燙틿仉ꃔ⚸Ꮔ㠓읉ῳ暢젏", (char) (16802 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", 1785328020 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "鑀槱ꍪꝁ").intern());
                sb2.append(list2);
                string = sb2.toString();
            }
            sb.append(string);
            C11875cm.m29607(strM29740, sb.toString(), e);
            int i6 = f28473 + 83;
            f28477 = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static char m29859(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28477 + 37;
        f28473 = i2 % 128;
        char cIntValue = (char) ((Number) m29851(list, i2 % 2 == 0 ? 1 : 0, Number.class)).intValue();
        int i3 = f28473 + 81;
        f28477 = i3 % 128;
        int i4 = i3 % 2;
        return cIntValue;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Class m29863(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28473 + 33;
        f28477 = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Array.newInstance((Class<?>) m29851(list, 0, Class.class), 0).getClass();
        int i4 = f28477 + 53;
        f28473 = i4 % 128;
        int i5 = i4 % 2;
        return cls;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static boolean m29861(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28473 + 61;
        f28477 = i2 % 128;
        if (i2 % 2 == 0 ? C12079ka.m30829(m29851(list, 0, Object.class), (String) m29851(list, 1, String.class), (List) m29851(list, 2, List.class)) == null : C12079ka.m30829(m29851(list, 0, Object.class), (String) m29851(list, 0, String.class), (List) m29851(list, 4, List.class)) == null) {
            return false;
        }
        int i3 = f28473 + 17;
        f28477 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29862(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28475) ^ ((long) f28476)) ^ ((long) f28474));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
