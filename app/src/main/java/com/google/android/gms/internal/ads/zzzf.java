package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzf {
    public static final zzzf zza = new zzzf(new zzbg[0]);
    public final int zzb;
    private final zzgvz zzc;
    private int zzd;

    static {
        String str = zzfk.zza;
        Integer.toString(0, 36);
    }

    public zzzf(zzbg... zzbgVarArr) {
        this.zzc = zzgvz.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((zzbg) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    zzef.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzf zzzfVar = (zzzf) obj;
            if (this.zzb == zzzfVar.zzb && this.zzc.equals(zzzfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i) {
        return (zzbg) this.zzc.get(i);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgvz zzc() {
        return zzgvz.zzq(zzgwz.zzc(this.zzc, zzze.zza));
    }
}
