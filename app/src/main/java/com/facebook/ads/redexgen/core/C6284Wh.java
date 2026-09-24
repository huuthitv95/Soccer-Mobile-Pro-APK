package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6284Wh {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C6284Wh> A02 = new ThreadLocal<>();
    public final C6267WQ A00 = new C6267WQ();

    public static C6267WQ A00() {
        return A02().A00;
    }

    public static C6267WQ A01(C6283Wg c6283Wg) {
        C6267WQ currentStackTraces = new C6267WQ(A00());
        currentStackTraces.add(c6283Wg);
        return currentStackTraces;
    }

    public static C6284Wh A02() {
        C6284Wh c6284Wh = A02.get();
        if (c6284Wh == null) {
            C6284Wh c6284Wh2 = new C6284Wh();
            A02.set(c6284Wh2);
            return c6284Wh2;
        }
        return c6284Wh;
    }

    public static void A03(AbstractRunnableC6279Wc abstractRunnableC6279Wc) {
        C6267WQ c6267wqA06 = abstractRunnableC6279Wc.A06();
        if (c6267wqA06 != null) {
            C6267WQ createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c6267wqA06);
        }
    }

    public static void A04(AbstractRunnableC6279Wc abstractRunnableC6279Wc) {
        C6267WQ c6267wqA06 = abstractRunnableC6279Wc.A06();
        if (c6267wqA06 != null) {
            C6267WQ c6267wq = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c6267wq.removeAll(c6267wqA06);
        }
    }
}
