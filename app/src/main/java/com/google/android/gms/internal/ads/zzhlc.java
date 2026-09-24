package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhlc extends zziaz {
    public static final zziat zza(zzibq zzibqVar) throws IOException {
        String strZzh;
        int iZzm = zzibqVar.zzm();
        zziat zziatVarZzc = zzc(zzibqVar, iZzm);
        if (zziatVarZzc == null) {
            return zzb(zzibqVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzibqVar.zzf()) {
                if (zziatVarZzc instanceof zziav) {
                    strZzh = zzibqVar.zzh();
                    if (!zzhle.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzibqVar.zzm();
                zziat zziatVarZzc2 = zzc(zzibqVar, iZzm2);
                zziat zziatVarZzb = zziatVarZzc2 == null ? zzb(zzibqVar, iZzm2) : zziatVarZzc2;
                if (zziatVarZzc instanceof zzias) {
                    ((zzias) zziatVarZzc).zza(zziatVarZzb);
                } else {
                    zziav zziavVar = (zziav) zziatVarZzc;
                    if (zziavVar.zzc(strZzh)) {
                        String.valueOf(strZzh);
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zziavVar.zza(strZzh, zziatVarZzb);
                }
                if (zziatVarZzc2 != null) {
                    arrayDeque.addLast(zziatVarZzc);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zziatVarZzc = zziatVarZzb;
                } else {
                    continue;
                }
            } else {
                if (zziatVarZzc instanceof zzias) {
                    zzibqVar.zzc();
                } else {
                    zzibqVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zziatVarZzc;
                }
                zziatVarZzc = (zziat) arrayDeque.removeLast();
            }
        }
    }

    private static final zziat zzb(zzibq zzibqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String strZzi = zzibqVar.zzi();
            if (zzhle.zza(strZzi)) {
                return new zziax(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new zziax(new zzhld(zzibqVar.zzi()));
        }
        if (i2 == 7) {
            return new zziax(Boolean.valueOf(zzibqVar.zzj()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzibr.zza(i)));
        }
        zzibqVar.zzk();
        return zziau.zza;
    }

    @Nullable
    private static final zziat zzc(zzibq zzibqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzibqVar.zzb();
            return new zzias();
        }
        if (i2 != 2) {
            return null;
        }
        zzibqVar.zzd();
        return new zziav();
    }
}
