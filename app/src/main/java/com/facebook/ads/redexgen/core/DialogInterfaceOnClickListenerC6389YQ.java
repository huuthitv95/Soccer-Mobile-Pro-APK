package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class DialogInterfaceOnClickListenerC6389YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C5864Pp A00;

    public DialogInterfaceOnClickListenerC6389YQ(C5864Pp c5864Pp) {
        this.A00 = c5864Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
