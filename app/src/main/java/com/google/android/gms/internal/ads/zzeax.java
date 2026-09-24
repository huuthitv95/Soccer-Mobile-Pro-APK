package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeax implements zzeai {
    private final long zza;
    private final zzeam zzb;
    private final zzfjk zzc;

    zzeax(long j, Context context, zzeam zzeamVar, zzcmx zzcmxVar, String str) {
        this.zza = j;
        this.zzb = zzeamVar;
        zzfjm zzfjmVarZzq = zzcmxVar.zzq();
        zzfjmVarZzq.zzc(context);
        zzfjmVarZzq.zzb(str);
        this.zzc = zzfjmVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzeav(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzb() {
        try {
            zzfjk zzfjkVar = this.zzc;
            zzfjkVar.zze(new zzeaw(this));
            zzfjkVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ zzeam zze() {
        return this.zzb;
    }
}
