package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgib extends zzgik {
    private final Map zza;

    zzgib(zzaxf zzaxfVar, zzghg zzghgVar, Map map, zzgpu zzgpuVar) {
        super("tbIKq6FOiOfxdW8ZfvJyrn0iZTQEuEsM8aeex4vhphuLvDBk2MG5LCqWKXzBm1MV", "oRl8qE5oXqOacbiOMIzOiRlot6BynopML8fxeJkSvog=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            zzaxfVar.zzf(((Long) objArr2[0]).longValue());
            long jLongValue = ((Long) objArr2[1]).longValue();
            if (jLongValue >= 0) {
                zzaxfVar.zzW(jLongValue);
            }
            long jLongValue2 = ((Long) objArr2[2]).longValue();
            if (jLongValue2 >= 0) {
                zzaxfVar.zzX(jLongValue2);
            }
        }
    }
}
