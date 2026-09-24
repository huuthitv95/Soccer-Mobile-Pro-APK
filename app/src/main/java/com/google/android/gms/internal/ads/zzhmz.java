package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhmz {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhmz(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmz)) {
            return false;
        }
        zzhmz zzhmzVar = (zzhmz) obj;
        return zzhmzVar.zza.equals(this.zza) && zzhmzVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 22 + String.valueOf(simpleName2).length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
