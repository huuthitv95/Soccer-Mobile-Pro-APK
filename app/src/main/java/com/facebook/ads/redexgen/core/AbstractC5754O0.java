package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5754O0 {
    public static String[] A00 = {"8XYGd5ZHSKJUGKcOBZRj1wh994qBk", "BxRxgsb39CeS8gUybSCvfMthfoa7WN", "MbLF7RBGQJ5IZlZwsL", "5COIZmJumnkEkrhpQeQyhRhZGCLVsyVV", "KxSUW8Yx0pGLd", "vVb3IVkHxruGPbcu6dN9QNWQiYSW5FCa", "S8VYx", "aJn40"};

    public static void A00(AbstractC5718NQ abstractC5718NQ, C6056Sx c6056Sx, String str) {
        if (abstractC5718NQ.A0t() != null && abstractC5718NQ.A0t().A05() != null) {
            int iA04 = abstractC5718NQ.A0t().A04();
            if (A00[2].length() == 15) {
                throw new RuntimeException();
            }
            A00[4] = "IYXFBoSH0TRoN";
            if (iA04 > 0 && abstractC5718NQ.A0t().A03() > 0) {
                c6056Sx.A0c(new C6054Sv(abstractC5718NQ.A0t().A05(), (int) (abstractC5718NQ.A0t().A03() * AbstractC6334XX.A02), (int) (abstractC5718NQ.A0t().A04() * AbstractC6334XX.A02), abstractC5718NQ.A1D(), str));
            }
        }
    }
}
