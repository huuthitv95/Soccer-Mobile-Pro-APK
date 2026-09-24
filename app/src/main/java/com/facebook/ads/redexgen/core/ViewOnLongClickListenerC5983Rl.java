package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC5983Rl implements View.OnLongClickListener {
    public final /* synthetic */ C6942hM A00;
    public final /* synthetic */ C6555b6 A01;

    public ViewOnLongClickListenerC5983Rl(C6942hM c6942hM, C6555b6 c6555b6) {
        this.A00 = c6942hM;
        this.A01 = c6555b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
