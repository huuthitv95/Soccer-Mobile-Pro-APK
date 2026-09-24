package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8361b1;
import java.io.File;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.y */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC9275y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9239i0 f21713b;

    public DialogInterfaceOnClickListenerC9275y(AbstractC9239i0 abstractC9239i0, String str) {
        this.f21713b = abstractC9239i0;
        this.f21712a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC9239i0 abstractC9239i0 = this.f21713b;
        String str = this.f21712a;
        abstractC9239i0.getClass();
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        AbstractC8236x abstractC8236x = abstractC9239i0.f21582s;
        IAConfigManager.f17654M.f17686r.m20768a(new C8361b1(new C9273x(abstractC9239i0), str, abstractC8236x != null ? abstractC8236x.f18375c : null));
    }
}
