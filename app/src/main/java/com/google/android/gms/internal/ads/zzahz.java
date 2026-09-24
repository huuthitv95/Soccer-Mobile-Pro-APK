package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahz extends zzafb {
    public zzahz(final zzagc zzagcVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzagcVar);
        zzaey zzaeyVar = new zzaey() { // from class: com.google.android.gms.internal.ads.zzahx
            @Override // com.google.android.gms.internal.ads.zzaey
            public final /* synthetic */ long zza(long j4) {
                return zzagcVar.zzb(j4);
            }
        };
        zzahy zzahyVar = new zzahy(zzagcVar, i, null);
        long jZza = zzagcVar.zza();
        long j4 = zzagcVar.zzj;
        int i2 = zzagcVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzagcVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzagcVar.zza;
            int i4 = zzagcVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * ((long) zzagcVar.zzg)) * ((long) zzagcVar.zzh)) / 8);
        }
        super(zzaeyVar, zzahyVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzagcVar.zzc));
    }
}
