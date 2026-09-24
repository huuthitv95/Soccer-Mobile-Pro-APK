package com.google.android.gms.internal.ads;

import com.ironsource.C11744X3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagq {
    public final zzagt zza;
    public final zzagt zzb;

    public zzagq(zzagt zzagtVar, zzagt zzagtVar2) {
        this.zza = zzagtVar;
        this.zzb = zzagtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zza.equals(zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzagt zzagtVar = this.zza;
        zzagt zzagtVar2 = this.zzb;
        String string = zzagtVar.toString();
        String strConcat = zzagtVar.equals(zzagtVar2) ? "" : ", ".concat(zzagtVar2.toString());
        StringBuilder sb = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb.append(C11744X3.j.f26438d);
        sb.append(string);
        sb.append(strConcat);
        sb.append(C11744X3.j.f26440e);
        return sb.toString();
    }
}
