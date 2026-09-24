package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6473Zm implements View.OnClickListener {
    public static String[] A01 = {"XFhwvfKkSyEqyRRacFdsqa616PFWUHCh", "TE99xZ7RorqY7SfVqRabPy9CgIKsfp3m", "kdLoeHuwvZoF6PjW0V2phiTjzwiVAf2t", "RlTzAejg9EfvSUQcXL5xjQX", "GFFSxtzm", "K1qZUjF5HHG2weDv49vHRNq0ZyDtpmc", "H0qCz3fL", "PDkQY8eSanvsX5OhJAHoWikZaqKVEEl4"};
    public final /* synthetic */ C5644MD A00;

    public ViewOnClickListenerC6473Zm(C5644MD c5644md) {
        this.A00 = c5644md;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th) {
            if (A01[0].charAt(19) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "TKgPwnLp";
            strArr[6] = "fznJdSDC";
            AbstractC6271WU.A00(th, this);
        }
    }
}
