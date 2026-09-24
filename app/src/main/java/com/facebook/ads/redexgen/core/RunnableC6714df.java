package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.df */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6714df implements Runnable {
    public static String[] A01 = {"fzjyGYuq3piyXiDZRjFkW67NOQ", "BBiqyoJQ78KnhCEDEb2JbAozax", "1KByreOTKkBHOeAHWLPqFTrN6QP2TzEC", "MP4Zvm8LfRa", "DgL9liz0G6FW", "NXDVupkXAhI36dZ8X7NCFVcgk2Bhw4pc", "8y8TgWmK0Yc5iAE5REQxk164k6eqV1M2", "0ZHlEJC1wd2fv29SneAo5e4vf7D"};
    public final /* synthetic */ C460455 A00;

    public RunnableC6714df(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0D) {
                this.A00.A0N();
            }
        } catch (Throwable th) {
            if (A01[7].length() == 26) {
                throw new RuntimeException();
            }
            A01[7] = "zshW7x6N5qX8w7YdYsjxjIdxV";
            AbstractC6271WU.A00(th, this);
        }
    }
}
