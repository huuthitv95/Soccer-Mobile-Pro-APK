package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezp implements zzimi {
    private final zzimr zza;

    private zzezp(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzezp zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzezp(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezn zzb() {
        return new zzezn(zzfno.zzc(), (zzecf) this.zza.zzb());
    }
}
