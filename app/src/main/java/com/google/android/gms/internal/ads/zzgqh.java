package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqh extends zzgri {
    private final int zza;
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzgqh(int i, String str, int i2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgri) {
            zzgri zzgriVar = (zzgri) obj;
            if (this.zza == zzgriVar.zza() && ((str = this.zzb) != null ? str.equals(zzgriVar.zzb()) : zzgriVar.zzb() == null) && this.zzc == zzgriVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i2).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgri
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgri
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgri
    public final int zzc() {
        return this.zzc;
    }
}
