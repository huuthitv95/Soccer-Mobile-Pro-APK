package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzght extends zzgik {
    zzght(zzaxf zzaxfVar, zzghg zzghgVar, zzgpu zzgpuVar) {
        super("7N1N0HTBd0FX/DlFK+QEm49CjJk/0HuOUxvOOv1ySzbmqrH0/GjlE6wO1ZKfr7Hh", "F/OYjBO034TbLBQbPeCpbzYwooLGpTD8Jk82c4yVIIw=", zzaxfVar, zzghgVar, zzgpuVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzaxfVar) {
            zzaxfVar.zza(ExifInterface.LONGITUDE_EAST);
            zzaxfVar.zzB(0L);
            zzaxfVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            zzaxfVar.zza((String) objArr2[0]);
            zzaxfVar.zzB(((Long) objArr2[1]).longValue());
            zzaxfVar.zzV((String) objArr2[2]);
        }
    }
}
