package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdkv extends zzdid implements zzbpw {
    public zzdkv(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final synchronized void zza() {
        zzs(zzdku.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzb(final zzcbp zzcbpVar) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzbpw) obj).zzb(zzcbpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzc() {
        zzs(zzdkt.zza);
    }
}
