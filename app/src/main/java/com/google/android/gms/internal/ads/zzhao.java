package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhao extends zzhab.zzf {
    private static final zzhal zzbp;
    private static final zzhbq zzbq = new zzhbq(zzhao.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzhal zzhanVar;
        byte[] bArr = null;
        try {
            zzhanVar = new zzham(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhanVar = new zzhan(bArr);
        }
        zzbp = zzhanVar;
        if (th != null) {
            zzbq.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzhao(int i) {
        this.remainingField = i;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbp.zza(this, null, setNewSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    final int zzC() {
        return zzbp.zzb(this);
    }

    abstract void zzf(Set set);
}
