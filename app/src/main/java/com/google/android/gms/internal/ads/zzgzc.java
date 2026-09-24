package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzc implements Closeable, AutoCloseable {
    private static final zzgzb zzc = zzgzb.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    zzgzc(zzgzb zzgzbVar) {
    }

    public static zzgzc zza() {
        return new zzgzc(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        Logger logger = zzgza.zza;
                        Level level = Level.WARNING;
                        String strValueOf = String.valueOf(closeable);
                        String.valueOf(strValueOf);
                        logger.logp(level, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(strValueOf)), th2);
                    }
                }
            }
        }
        if (this.zzb != null || th == null) {
            return;
        }
        zzgtt.zza(th, IOException.class);
        zzgtt.zzb(th);
        throw new AssertionError(th);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th) throws Throwable {
        this.zzb = th;
        zzgtt.zza(th, IOException.class);
        zzgtt.zzb(th);
        throw new RuntimeException(th);
    }
}
