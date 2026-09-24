package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgrp implements ServiceConnection {
    final /* synthetic */ zzgrv zza;

    /* synthetic */ zzgrp(zzgrv zzgrvVar, byte[] bArr) {
        Objects.requireNonNull(zzgrvVar);
        this.zza = zzgrvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Object[] objArr = {componentName};
        zzgrv zzgrvVar = this.zza;
        zzgrvVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        zzgrvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgro
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgpz zzgpzVarZzb = zzgpy.zzb(iBinder);
                zzgrp zzgrpVar = this.zza;
                zzgrv zzgrvVar2 = zzgrpVar.zza;
                zzgrvVar2.zzn(zzgpzVarZzb);
                zzgrvVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceZzm = zzgrvVar2.zzm();
                    if (iInterfaceZzm == null) {
                        throw null;
                    }
                    IInterface iInterface = iInterfaceZzm;
                    iInterfaceZzm.asBinder().linkToDeath(zzgrvVar2.zzl(), 0);
                    zzgrv zzgrvVar3 = zzgrpVar.zza;
                    zzgrvVar3.zzk(false);
                    synchronized (zzgrvVar3.zzj()) {
                        Iterator it = zzgrvVar3.zzj().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzgrvVar3.zzj().clear();
                    }
                } catch (RemoteException e) {
                    zzgrpVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        zzgrv zzgrvVar = this.zza;
        zzgrvVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        zzgrvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgrv zzgrvVar2 = this.zza.zza;
                zzgrvVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgrvVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgrvVar2.zzl(), 0);
                zzgrvVar2.zzn(null);
                zzgrvVar2.zzk(false);
            }
        });
    }
}
