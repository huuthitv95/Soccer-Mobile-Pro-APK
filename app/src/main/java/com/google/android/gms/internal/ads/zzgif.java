package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgif extends zzgik {
    private final Context zza;
    private final Map zzb;

    zzgif(zzaxf zzaxfVar, zzghg zzghgVar, Map map, Context context, zzgpu zzgpuVar) {
        super("Pt5oy6vdiOsAlmK5xGhewpZDwiDaXWdHs0dIC271RZneoCnOgrDiN5S7yVnR6Ayj", "owbXqBqU1t9p5nhuPxNMyYbRZbmDif7k9HhYwz0h83Y=", zzaxfVar, zzghgVar, zzgpuVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l = (Long) method.invoke("", this.zza);
                if (l == null) {
                    throw null;
                }
                lValueOf = l;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((zzayf) listenableFuture.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaxfVar) {
            zzaxfVar.zzR(lValueOf.longValue());
        }
    }
}
