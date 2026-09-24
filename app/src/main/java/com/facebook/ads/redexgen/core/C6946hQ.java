package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6946hQ extends AbstractRunnableC6266WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C6942hM A00;
    public final /* synthetic */ C6229Vm A01;

    public C6946hQ(C6942hM c6942hM, C6229Vm c6229Vm) {
        this.A00 = c6942hM;
        this.A01 = c6229Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            AdListener adListenerA06 = this.A00.A01.A06();
            C5975Rd c5975Rd = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            adListenerA06.onError(c5975Rd.A07(), AbstractC6315XE.A00(this.A01));
        }
    }
}
