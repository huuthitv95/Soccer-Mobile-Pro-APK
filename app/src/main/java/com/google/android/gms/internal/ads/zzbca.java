package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbca extends zzbcy {
    public zzbca(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxfVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxf zzaxfVar = this.zzd;
        zzaxfVar.zzd(-1L);
        zzaxfVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaxfVar) {
            zzaxfVar.zzd(iArr[0]);
            zzaxfVar.zze(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                zzaxfVar.zzO(i);
            }
        }
    }
}
