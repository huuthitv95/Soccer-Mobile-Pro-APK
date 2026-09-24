package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfmn implements zzfml {
    private final String zza;

    public zzfmn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final boolean equals(Object obj) {
        if (obj instanceof zzfmn) {
            return this.zza.equals(((zzfmn) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
