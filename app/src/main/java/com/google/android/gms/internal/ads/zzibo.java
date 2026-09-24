package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibo extends zziaz {
    public static final zzibo zza = new zzibo();

    private zzibo() {
    }

    public final void zza(zzibs zzibsVar, zziat zziatVar) throws IOException {
        if (zziatVar == null || (zziatVar instanceof zziau)) {
            zzibsVar.zzj();
            return;
        }
        if (zziatVar instanceof zziax) {
            zziax zziaxVarZzg = zziatVar.zzg();
            if (zziaxVarZzg.zzc()) {
                zzibsVar.zzi(zziaxVarZzg.zzh());
                return;
            } else if (zziaxVarZzg.zza()) {
                zzibsVar.zzh(zziaxVarZzg.zzb());
                return;
            } else {
                zzibsVar.zzg(zziaxVarZzg.zzd());
                return;
            }
        }
        if (zziatVar instanceof zzias) {
            zzibsVar.zzb();
            Iterator it = zziatVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzibsVar, (zziat) it.next());
            }
            zzibsVar.zzc();
            return;
        }
        if (!(zziatVar instanceof zziav)) {
            String strValueOf = String.valueOf(zziatVar.getClass());
            String.valueOf(strValueOf);
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(strValueOf)));
        }
        zzibsVar.zzd();
        for (Map.Entry entry : zziatVar.zze().zzb()) {
            zzibsVar.zzf((String) entry.getKey());
            zza(zzibsVar, (zziat) entry.getValue());
        }
        zzibsVar.zze();
    }
}
