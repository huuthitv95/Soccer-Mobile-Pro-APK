package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzajy implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    /* synthetic */ zzajy(long j, long j2, long j3, byte[] bArr) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzajy) obj).zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajy)) {
            return false;
        }
        zzajy zzajyVar = (zzajy) obj;
        return this.zza == zzajyVar.zza && this.zzb == zzajyVar.zzb && this.zzc == zzajyVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    final /* synthetic */ long zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
