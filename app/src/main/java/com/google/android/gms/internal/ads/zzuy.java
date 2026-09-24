package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzuy {
    public final zzve zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzux zzf;

    private zzuy(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzux zzuxVar) {
        this.zza = zzveVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzuxVar;
    }

    public static zzuy zza(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzux zzuxVar) {
        return new zzuy(zzveVar, mediaFormat, zzvVar, null, null, zzuxVar);
    }

    public static zzuy zzb(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzuy(zzveVar, mediaFormat, zzvVar, surface, null, null);
    }
}
