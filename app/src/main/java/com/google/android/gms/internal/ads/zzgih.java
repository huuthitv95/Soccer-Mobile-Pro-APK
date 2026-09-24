package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgih extends zzgik {
    private static final Long zza = -1L;
    private final zzgdl zzb;
    private final Context zzc;
    private final Map zzd;

    zzgih(zzaxf zzaxfVar, zzghg zzghgVar, zzgdl zzgdlVar, Context context, Map map, zzgpu zzgpuVar) {
        super("XSwl76jY++LJvrRqZgjH4lZ2jFO5K8JgU9OdjTzzRCmkGCpw/GB5yLIlhp6BclQb", "+/3tZ5MRGKHAc7ucIqJjzsaLNcEh4NvqzRk0nWDZMBM=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.zzb = zzgdlVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        zzgdl zzgdlVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgdlVar.ordinal()), this.zzc, zzgst.zza(this.zzd.get("up"), true));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxfVar) {
            if (zzgdlVar == zzgdl.QUERY) {
                Object obj = objArr2[0];
                Long l = zza;
                zzaxfVar.zzq(((Long) zzgst.zza(obj, l)).longValue());
                zzaxfVar.zzr(((Long) zzgst.zza(objArr2[1], l)).longValue());
            }
            zzaxfVar.zzg(((Long) objArr2[2]).longValue());
            zzaxfVar.zzQ(((Long) objArr2[3]).longValue());
        }
    }
}
