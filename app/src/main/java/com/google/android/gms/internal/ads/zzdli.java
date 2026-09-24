package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdli extends zzdid {
    private boolean zzb;

    protected zzdli(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdlh.zza);
    }

    public final void zzb() {
        zzs(zzdld.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdle.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(zzdlg.zza);
            this.zzb = true;
        }
        zzs(zzdlf.zza);
    }
}
