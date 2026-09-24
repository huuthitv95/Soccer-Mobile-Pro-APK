package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakl implements zzao {
    public final float zza;
    public final zzakk zzb;
    public final zzakk zzc;

    private zzakl(float f, zzakk zzakkVar, zzakk zzakkVar2) {
        this.zza = f;
        this.zzb = zzakkVar;
        this.zzc = zzakkVar2;
    }

    public static zzakl zzb(float f, int i, int i2) {
        zzakk zzakkVarZza = zzakk.zza(i);
        zzakk zzakkVarZza2 = zzakk.zza(i2);
        if (f <= 0.0f && zzakkVarZza == null && zzakkVarZza2 == null) {
            return null;
        }
        return new zzakl(f, zzakkVarZza, zzakkVarZza2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakl)) {
            return false;
        }
        zzakl zzaklVar = (zzakl) obj;
        return Float.compare(this.zza, zzaklVar.zza) == 0 && Objects.equals(this.zzb, zzaklVar.zzb) && Objects.equals(this.zzc, zzaklVar.zzc);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) * 31;
        zzakk zzakkVar = this.zzb;
        int iHashCode = (iFloatToIntBits + (zzakkVar != null ? zzakkVar.hashCode() : 0)) * 31;
        zzakk zzakkVar2 = this.zzc;
        return iHashCode + (zzakkVar2 != null ? zzakkVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        float f = this.zza;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(strValueOf).length() + 10 + String.valueOf(strValueOf2).length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(strValueOf);
        sb.append(", field 2=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        zzao.CC.$default$zza(this, zzamVar);
    }
}
