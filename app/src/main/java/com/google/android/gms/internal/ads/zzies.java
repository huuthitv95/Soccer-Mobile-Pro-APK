package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzies implements zzifa {
    private final zzifa[] zza;

    zzies(zzifa... zzifaVarArr) {
        this.zza = zzifaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziez zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzifa zzifaVar = this.zza[i];
            if (zzifaVar.zzb(cls)) {
                return zzifaVar.zzc(cls);
            }
        }
        String name = cls.getName();
        String.valueOf(name);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(name)));
    }
}
