package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhm {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzhm() {
        this.zzb = Collections.EMPTY_MAP;
        this.zzd = -1L;
    }

    /* synthetic */ zzhm(zzhn zzhnVar, byte[] bArr) {
        this.zza = zzhnVar.zza;
        this.zzb = zzhnVar.zzd;
        this.zzc = zzhnVar.zze;
        this.zzd = zzhnVar.zzf;
        this.zze = zzhnVar.zzg;
    }

    public final zzhm zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhm zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzhm zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzhm zzd(int i) {
        this.zze = 6;
        return this;
    }

    public final zzhn zze() {
        zzgsw.zzk(this.zza, "The uri must be set.");
        return new zzhn(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }
}
