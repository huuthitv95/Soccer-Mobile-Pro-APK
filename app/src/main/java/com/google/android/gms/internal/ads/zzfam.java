package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfam implements zzfbw {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzfam(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflb.zze(bundle, "pn", this.zza);
        zzflb.zzh(bundle, "vc", this.zzb);
        zzflb.zze(bundle, "vnm", this.zzc);
        zzflb.zze(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
        zzflb.zze(bundle, "ins_pn", this.zze);
        zzflb.zze(bundle, "ini_pn", this.zzf);
    }
}
