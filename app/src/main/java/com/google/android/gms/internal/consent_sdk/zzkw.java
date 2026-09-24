package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzkw extends zzqm implements zzrr {
    private static final zzkw zzb;
    private zzqq zzd = zzs();

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzqm.zzz(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzkv.zza});
        }
        if (i2 == 3) {
            return new zzkw();
        }
        zzkz zzkzVar = null;
        if (i2 == 4) {
            return new zzku(zzkzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
