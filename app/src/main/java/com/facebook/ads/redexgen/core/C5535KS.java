package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5535KS implements InterfaceC6543au {
    public static String[] A01 = {"Kf9IFIGkXS68FEluY8iO", "HZKyOot4e1aVyegaf8lIb0bgnGZodGvN", "MGWXSz8iondoAx3vwHSWPDz", "1vF28DvouTYuJpgxZbcCtj3BonOpfXf0", "hNMoe3gYfV5QWpuVljUPjUuKx8toPdic", "kDVCOfKU1nzjkl2JPkHRjE9k6FSheaPB", "SHeKxuODcoO7wzXqEy6VB5XREjq4nAxo", "ViwjD0ocXU7cRIhjEHnYvFil28fnYSUL"};
    public final /* synthetic */ C5521KE A00;

    public C5535KS(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6543au
    public final void ADO() {
        this.A00.A0i(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6543au
    public final void AF0() {
        if (C6171Up.A15(this.A00.getAdContextWrapper())) {
            C5521KE c5521ke = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "KrFGzHoXsfsafO9ToSguPoB5cWeuxqIV";
            strArr2[4] = "kqOpGw0ynU1zwk9LjTPYr4TgjSNfVfpA";
            c5521ke.A0K();
        }
    }
}
