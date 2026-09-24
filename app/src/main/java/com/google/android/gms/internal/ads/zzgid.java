package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgid extends zzgik {
    private final Context zza;

    zzgid(zzaxf zzaxfVar, zzghg zzghgVar, Context context, zzgpu zzgpuVar) {
        super("Gw9By3kOjW1dlKqpMN9Ru+bAsi5RkhHpFGEM1BbgghZLy9dbjqQnjubzrMDb//Uh", "gb20XjpeCPjPPPz5rLevwoV0OQNDhI+r1LgAZVFNL3Y=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            zzaxfVar.zzc(((Long) objArr2[0]).longValue());
            zzaxfVar.zzP(((Long) objArr2[1]).longValue());
        }
    }
}
