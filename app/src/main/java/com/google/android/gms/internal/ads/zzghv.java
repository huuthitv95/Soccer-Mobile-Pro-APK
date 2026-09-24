package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzghv extends zzgik {
    private final Context zza;

    zzghv(zzaxf zzaxfVar, zzghg zzghgVar, Context context, zzgpu zzgpuVar) {
        super("BTx4gmr6iqVvyaR358mezAtZCPvtStL7BPHGGOJ4OcKHl+Vljn9A2vv4NNBM0FZk", "84FqTQQSJD5YjosrKgct4ZY3fp+nQq6NhxB6H7N7GBg=", zzaxfVar, zzghgVar, zzgpuVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        int i = 1;
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            zzaxfVar.zzO(((Integer) objArr2[0]).intValue());
            zzaxfVar.zzd(((Integer) objArr2[1]).intValue());
            zzaxfVar.zze(((Integer) objArr2[2]).intValue());
            zzaxfVar.zzab(((Integer) objArr2[3]).intValue());
            Boolean bool = (Boolean) objArr2[4];
            if (bool == null) {
                zzaxfVar.zzaf(3);
            } else {
                zzaxfVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            Boolean bool2 = (Boolean) objArr2[5];
            if (bool2 == null) {
                zzaxfVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzaxfVar.zzae(i);
            }
        }
    }
}
