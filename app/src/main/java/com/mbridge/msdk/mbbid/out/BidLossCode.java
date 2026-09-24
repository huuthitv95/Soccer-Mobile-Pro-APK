package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes6.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a */
    private static int f36810a;

    private BidLossCode(int i) {
        f36810a = i;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f36810a;
    }
}
