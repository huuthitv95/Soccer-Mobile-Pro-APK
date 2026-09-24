package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqf extends zzgrg {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* synthetic */ zzgqf(IBinder iBinder, String str, int i, float f, int i2, int i3, String str2, int i4, String str3, String str4, String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i4;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgrg) {
            zzgrg zzgrgVar = (zzgrg) obj;
            if (this.zza.equals(zzgrgVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgrgVar.zzb()) : zzgrgVar.zzb() == null) && this.zzc == zzgrgVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzgrgVar.zzd())) {
                zzgrgVar.zze();
                zzgrgVar.zzf();
                zzgrgVar.zzg();
                if (this.zze == zzgrgVar.zzh()) {
                    zzgrgVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgrgVar.zzj()) : zzgrgVar.zzj() == null) {
                        zzgrgVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        float f = this.zzd;
        int length4 = String.valueOf(f).length();
        int i2 = this.zze;
        int length5 = String.valueOf(i2).length();
        String str2 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        sb.append("OverlayDisplayShowRequest{windowToken=");
        sb.append(string);
        sb.append(", appId=");
        sb.append(str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i2);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final String zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final String zzj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    public final String zzk() {
        return null;
    }
}
