package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5962RQ {
    public int A00;
    public C5933Qx A01;
    public C5933Qx A02;
    public static String[] A04 = {"3L5xTrYaZHGbjsCndSxeOQfzJoqaksAO", "yNuit7zcaXLgcR4Esus3jmJQTJqqE", "DjfkS9z5OPUyV9QdiCBZ1KUSwMFmGRPN", "lc54RdKLiwdhlc59ssIRjbGGERTX6o9W", "6o2d", "DSh0O66K0UoAsbtG5khJTMnGYv0IzoNn", "Wt9X6yajIBXU34hiGluB33HbNXSszdRF", "6wPar1yvZmOBSMEilq5oC74eJWuAafP4"};
    public static InterfaceC5829PD<C5962RQ> A03 = new C6985i6(20);

    public static C5962RQ A00() {
        C5962RQ c5962rqA3B = A03.A3B();
        if (A04[5].charAt(2) == 'q') {
            throw new RuntimeException();
        }
        A04[5] = "RnCaU2E938mENSzRzPrAuXo67ZnkzA8g";
        C5962RQ record = c5962rqA3B;
        return record == null ? new C5962RQ() : record;
    }

    public static void A01() {
        while (A03.A3B() != null) {
        }
    }

    public static void A02(C5962RQ c5962rq) {
        c5962rq.A00 = 0;
        c5962rq.A02 = null;
        c5962rq.A01 = null;
        A03.AHf(c5962rq);
    }
}
