package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgaf extends zzidl implements zzifd {
    private zzgaf() {
        throw null;
    }

    /* synthetic */ zzgaf(byte[] bArr) {
        super(zzgah.zzb);
    }

    public final zzgaf zza(String str) {
        str.getClass();
        zzbg();
        ((zzgah) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgah) this.zza).zzb());
    }

    public final zzgaf zzc(String str, zzgad zzgadVar) {
        str.getClass();
        zzgadVar.getClass();
        zzbg();
        ((zzgah) this.zza).zze().put(str, zzgadVar);
        return this;
    }
}
