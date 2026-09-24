package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajb extends zzajh {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajb(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajb zzajbVar = (zzajb) obj;
            if (Objects.equals(this.zzb, zzajbVar.zzb) && Objects.equals(this.zza, zzajbVar.zza) && Objects.equals(this.zzc, zzajbVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = length + 11 + str3.length();
        String str4 = this.zzb;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb.append(str);
        sb.append(": language=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", text=");
        sb.append(str2);
        return sb.toString();
    }
}
