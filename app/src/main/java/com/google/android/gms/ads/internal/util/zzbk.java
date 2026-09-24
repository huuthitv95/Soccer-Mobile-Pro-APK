package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.ads.zzcfk;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbk extends zzasx {
    private final zzcfk zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcfk zzcfkVar) {
        super(0, str, new zzbj(zzcfkVar));
        this.zza = zzcfkVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    protected final zzatd zzr(zzast zzastVar) {
        return zzatd.zza(zzastVar, zzatu.zza(zzastVar));
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzast zzastVar = (zzast) obj;
        Map map = zzastVar.zzc;
        int i = zzastVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzastVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzastVar);
    }
}
