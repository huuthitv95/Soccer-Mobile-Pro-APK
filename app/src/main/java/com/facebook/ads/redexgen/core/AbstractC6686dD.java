package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6686dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C6685dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C6685dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C6685dC A01(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, int i, InterfaceC6683dA interfaceC6683dA) {
        C6685dC c6685dC = new C6685dC(c6902gi, abstractC7077jd, c6902gi.A02().A0A(), i);
        c6685dC.A0b(interfaceC6683dA);
        c6685dC.A0X();
        A01.put(abstractC7077jd.A1D(), new WeakReference<>(c6685dC));
        return c6685dC;
    }

    public static C6685dC A02(String str) {
        WeakReference<C6685dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC7077jd abstractC7077jd, C6685dC c6685dC) {
        A01.put(abstractC7077jd.A1D(), new WeakReference<>(c6685dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
