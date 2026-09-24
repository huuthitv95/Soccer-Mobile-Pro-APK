package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzemo extends zzbwc {
    final /* synthetic */ zzemp zza;
    private final zzelj zzb;

    /* synthetic */ zzemo(zzemp zzempVar, zzelj zzeljVar, byte[] bArr) {
        Objects.requireNonNull(zzempVar);
        this.zza = zzempVar;
        this.zzb = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzemv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(String str) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(zzbuz zzbuzVar) throws RemoteException {
        this.zza.zze(zzbuzVar);
        ((zzemv) this.zzb.zzc).zzj();
    }
}
