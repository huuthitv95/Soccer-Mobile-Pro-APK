package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzima {
    public static zzima zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzilv(cls.getSimpleName()) : new zzilx(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
