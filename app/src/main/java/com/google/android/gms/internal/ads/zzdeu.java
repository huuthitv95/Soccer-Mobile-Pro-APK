package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdeu extends zzdid implements zzdcz, zzdee {
    private final zzfjt zzb;
    private final AtomicBoolean zzc;
    private final zzfke zzd;

    public zzdeu(Set set, zzfjt zzfjtVar, zzfke zzfkeVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfjtVar;
        this.zzd = zzfkeVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziX)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdet
                @Override // com.google.android.gms.internal.ads.zzdic
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdew) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdes
                @Override // com.google.android.gms.internal.ads.zzdic
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdew) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
