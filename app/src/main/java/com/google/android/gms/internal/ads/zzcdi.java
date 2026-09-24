package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdi {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcdn zzd;

    private zzcdi() {
        throw null;
    }

    /* synthetic */ zzcdi(byte[] bArr) {
    }

    public final zzcdi zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcdi zzd(zzcdn zzcdnVar) {
        this.zzd = zzcdnVar;
        return this;
    }

    public final zzcdo zze() {
        zzimq.zzc(this.zza, Context.class);
        zzimq.zzc(this.zzb, Clock.class);
        zzimq.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzimq.zzc(this.zzd, zzcdn.class);
        return new zzcdj(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzcdi zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcdi zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
