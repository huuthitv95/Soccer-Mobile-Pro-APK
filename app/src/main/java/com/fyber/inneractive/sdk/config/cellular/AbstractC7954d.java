package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7954d implements InterfaceC7958h {

    /* JADX INFO: renamed from: a */
    public final TelephonyManager f17708a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f17709b;

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArrayList f17710c = new CopyOnWriteArrayList();

    public AbstractC7954d(Context context) {
        this.f17708a = (TelephonyManager) context.getSystemService("phone");
        this.f17709b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20387a();

    /* JADX INFO: renamed from: a */
    public abstract void mo20388a(C7951a c7951a);

    /* JADX INFO: renamed from: a */
    public abstract void mo20389a(InterfaceC7958h interfaceC7958h);

    @Override // com.fyber.inneractive.sdk.config.cellular.InterfaceC7958h
    /* JADX INFO: renamed from: a */
    public final void mo20337a(EnumC9134a1 enumC9134a1) {
        CopyOnWriteArrayList<InterfaceC7958h> copyOnWriteArrayList = this.f17710c;
        if (copyOnWriteArrayList == null) {
            IAlog.m21945a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        for (InterfaceC7958h interfaceC7958h : copyOnWriteArrayList) {
            if (interfaceC7958h != null) {
                interfaceC7958h.mo20337a(enumC9134a1);
            }
        }
    }
}
