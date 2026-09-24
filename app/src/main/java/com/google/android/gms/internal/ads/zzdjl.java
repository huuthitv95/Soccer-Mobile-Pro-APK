package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdjl extends zzdid implements zzdjn {
    public zzdjl(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zza(final String str) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjn) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzb(final String str) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdjf
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjn) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzc(final String str, final String str2) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdjg
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjn) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdic(str2) { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjn) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zze() {
        zzs(zzdji.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzf() {
        zzs(zzdjj.zza);
    }
}
