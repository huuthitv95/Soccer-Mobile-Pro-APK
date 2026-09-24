package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzidk implements zzifa {
    private static final zzidk zza = new zzidk();

    private zzidk() {
    }

    public static zzidk zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zzb(Class cls) {
        return zzidr.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziez zzc(Class cls) {
        if (!zzidr.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zziez) zzidr.zzbt(cls.asSubclass(zzidr.class)).zzbs();
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
