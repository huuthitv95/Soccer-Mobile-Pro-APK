package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgik implements zzgij {
    private final String zza;
    private final String zzb;
    private final zzghg zzc;
    private final zzaxf zzd;
    private final zzgps zze;

    public zzgik(String str, String str2, zzaxf zzaxfVar, zzghg zzghgVar, zzgps zzgpsVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaxfVar;
        this.zzc = zzghgVar;
        this.zze = zzgpsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    protected abstract void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException;
}
