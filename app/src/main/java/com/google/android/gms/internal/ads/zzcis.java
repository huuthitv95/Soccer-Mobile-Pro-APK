package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcis extends zzcio {
    public zzcis(zzchb zzchbVar) {
        super(zzchbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zze(String str) {
        String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzchb zzchbVar = (zzchb) this.zzc.get();
        if (zzchbVar != null && strZzg != null) {
            zzchbVar.zzt(strZzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl() {
    }
}
