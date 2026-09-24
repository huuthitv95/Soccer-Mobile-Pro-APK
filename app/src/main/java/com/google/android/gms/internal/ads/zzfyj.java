package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyj {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfyk zzc;
    private final zzfwq zzd;
    private final zzfwl zze;
    private final boolean zzf;
    private zzfxy zzg;
    private final Object zzh = new Object();

    public zzfyj(Context context, zzfyk zzfykVar, zzfwq zzfwqVar, zzfwl zzfwlVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfykVar;
        this.zzd = zzfwqVar;
        this.zze = zzfwlVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfxz zzfxzVar) throws zzfyi {
        if (zzfxzVar.zza() == null) {
            throw new zzfyi(4010, "mc");
        }
        String strZza = zzfxzVar.zza().zza();
        HashMap map = zza;
        Class cls = (Class) map.get(strZza);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfxzVar.zzb())) {
                throw new zzfyi(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzc = zzfxzVar.zzc();
                if (!fileZzc.exists()) {
                    fileZzc.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfxzVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZza, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfyi(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfyi(2026, e2);
        }
    }

    public final boolean zza(zzfxz zzfxzVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfxy zzfxyVar = new zzfxy(zzd(zzfxzVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfxzVar.zzd(), null, new Bundle(), 2), zzfxzVar, this.zzc, this.zzd, this.zzf);
                if (!zzfxyVar.zzf()) {
                    throw new zzfyi(4000, "init failed");
                }
                int iZzh = zzfxyVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfyi(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfxy zzfxyVar2 = this.zzg;
                    if (zzfxyVar2 != null) {
                        try {
                            zzfxyVar2.zzg();
                        } catch (zzfyi e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzg = zzfxyVar;
                    } else {
                        this.zzg = zzfxyVar;
                    }
                    throw th;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfyi(2004, e2);
            }
        } catch (zzfyi e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final zzfwt zzb() {
        zzfxy zzfxyVar;
        synchronized (this.zzh) {
            zzfxyVar = this.zzg;
        }
        return zzfxyVar;
    }

    public final zzfxz zzc() {
        synchronized (this.zzh) {
            zzfxy zzfxyVar = this.zzg;
            if (zzfxyVar == null) {
                return null;
            }
            return zzfxyVar.zze();
        }
    }
}
