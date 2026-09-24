package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzghx extends zzgik {
    private final zzgco zza;

    zzghx(zzaxf zzaxfVar, zzghg zzghgVar, zzgco zzgcoVar, zzgpu zzgpuVar) {
        super("QAALZee1lWGAe589YsiTa46+uzjzJ7LEveHUrWjg+9LDaSgAv7ZinNmexZIORMeU", "bbyGeNb6T9PAPwsbUB0SVCkLaQwEzwrXERajf7mZH48=", zzaxfVar, zzghgVar, zzgpuVar.zza(116));
        this.zza = zzgcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzd());
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            zzaxfVar.zzb((String) objArr2[0]);
            zzaxfVar.zzaa((String) objArr2[1]);
        }
    }
}
