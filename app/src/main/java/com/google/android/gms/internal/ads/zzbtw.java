package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbtw {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbtu();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbtv();
    private final zzbti zzc;

    public zzbtw(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfpv zzfpvVar) {
        this.zzc = new zzbti(context, versionInfoParcel, str, zza, zzb, zzfpvVar);
    }

    public final zzbtm zza(String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        return new zzbua(this.zzc, str, zzbtpVar, zzbtoVar);
    }

    public final zzbuf zzb() {
        return new zzbuf(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
