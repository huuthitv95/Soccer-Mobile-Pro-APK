package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhls extends zzhdt {
    private final zzhnf zza;

    public zzhls(zzhnf zzhnfVar) {
        this.zza = zzhnfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhls)) {
            return false;
        }
        zzhnf zzhnfVar = ((zzhls) obj).zza;
        zzhnf zzhnfVar2 = this.zza;
        return zzhnfVar2.zzc().zzc().equals(zzhnfVar.zzc().zzc()) && zzhnfVar2.zzc().zza().equals(zzhnfVar.zzc().zza()) && zzhnfVar2.zzc().zzb().equals(zzhnfVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhnf zzhnfVar = this.zza;
        return Objects.hash(zzhnfVar.zzc(), zzhnfVar.zzf());
    }

    public final String toString() {
        String str;
        zzhnf zzhnfVar = this.zza;
        String strZza = zzhnfVar.zzc().zza();
        int iOrdinal = zzhnfVar.zzc().zzc().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZza, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhtb.RAW;
    }

    public final zzhnf zzb() {
        return this.zza;
    }
}
