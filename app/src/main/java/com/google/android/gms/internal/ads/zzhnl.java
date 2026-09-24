package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhnl {
    private final Class zza;
    private final zziam zzb;

    /* synthetic */ zzhnl(Class cls, zziam zziamVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zziamVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnl)) {
            return false;
        }
        zzhnl zzhnlVar = (zzhnl) obj;
        return zzhnlVar.zza.equals(this.zza) && zzhnlVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zziam zziamVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zziamVar);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(strValueOf).length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
