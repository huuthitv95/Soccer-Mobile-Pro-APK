package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzidb {
    static final zzidb zza = new zzidb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzidb zzd;
    private final Map zze;

    zzidb() {
        this.zze = new HashMap();
    }

    public static zzidb zza() {
        int i = zzica.zza;
        return zza;
    }

    public static zzidb zzb() {
        zzidb zzidbVar = zzd;
        if (zzidbVar != null) {
            return zzidbVar;
        }
        synchronized (zzidb.class) {
            zzidb zzidbVar2 = zzd;
            if (zzidbVar2 != null) {
                return zzidbVar2;
            }
            int i = zzica.zza;
            zzidb zzidbVarZzb = zzidj.zzb(zzidb.class);
            zzd = zzidbVarZzb;
            return zzidbVarZzb;
        }
    }

    public final zzidp zzc(zzifc zzifcVar, int i) {
        return (zzidp) this.zze.get(new zzida(zzifcVar, i));
    }

    zzidb(boolean z) {
        this.zze = Collections.EMPTY_MAP;
    }
}
