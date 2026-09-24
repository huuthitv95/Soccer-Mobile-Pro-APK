package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class DialogInterfaceOnClickListenerC6390YR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C5864Pp A01;

    public DialogInterfaceOnClickListenerC6390YR(C5864Pp c5864Pp, EditText editText) {
        this.A01 = c5864Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new C5876Q1(this, dialogInterface));
    }
}
