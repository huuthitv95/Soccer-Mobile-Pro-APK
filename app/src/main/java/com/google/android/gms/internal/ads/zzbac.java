package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbac {
    protected volatile Boolean zzb;
    private final zzbbl zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfym zza = null;
    private static volatile Random zze = null;

    public zzbac(zzbbl zzbblVar) {
        this.zzc = zzbblVar;
        zzbblVar.zzd().execute(new zzbab(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzbac.class) {
                    if (zze == null) {
                        zze = new Random();
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzawl zzawlVarZza = zzawp.zza();
            zzawlVarZza.zza(this.zzc.zza.getPackageName());
            zzawlVarZza.zzb(j);
            if (str != null) {
                zzawlVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzawlVarZza.zzc(stringWriter.toString());
                zzawlVarZza.zzd(exc.getClass().getName());
            }
            zzfyl zzfylVarZza = zza.zza(((zzawp) zzawlVarZza.zzbu()).zzaN());
            zzfylVarZza.zzc(i);
            if (i2 != -1) {
                zzfylVarZza.zzb(i2);
            }
            zzfylVarZza.zza();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ zzbbl zzb() {
        return this.zzc;
    }
}
