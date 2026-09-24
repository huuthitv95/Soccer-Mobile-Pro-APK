package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcx {
    private final zzbbl zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbcx(zzbbl zzbblVar, String str, String str2, Class... clsArr) {
        this.zza = zzbblVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbblVar.zzd().submit(new zzbcw(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzbap, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void zzb() {
        try {
            zzbbl zzbblVar = this.zza;
            Class clsLoadClass = zzbblVar.zze().loadClass(zzc(zzbblVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbblVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzbap | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            this.zzf.countDown();
        }
    }
}
