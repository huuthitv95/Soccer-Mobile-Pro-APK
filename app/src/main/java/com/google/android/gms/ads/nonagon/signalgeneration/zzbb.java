package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzeeu;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbb implements zzimi {
    private final zzimr zza;

    private zzbb(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzbb zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzbb(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzba zzb() {
        return new zzba(zzfno.zzc(), ((zzeeu) this.zza).zzb());
    }
}
