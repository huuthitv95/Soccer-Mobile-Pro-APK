package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacy extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacx zzd;
    private boolean zze;

    /* synthetic */ zzacy(zzacx zzacxVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacxVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        if (!zzc) {
            try {
                if (zzdw.zza(context)) {
                    i = zzdw.zzb() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (zzdv e) {
                String message = e.getMessage();
                String.valueOf(message);
                zzef.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(message)));
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzacy zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzgsw.zzi(z2);
        return new zzacx().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacx zzacxVar = this.zzd;
        synchronized (zzacxVar) {
            if (!this.zze) {
                zzacxVar.zzb();
                this.zze = true;
            }
        }
    }
}
