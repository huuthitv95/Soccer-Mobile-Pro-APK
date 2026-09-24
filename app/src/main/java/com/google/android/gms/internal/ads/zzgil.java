package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgil extends zzgik {
    private final Map zza;
    private final zzgdl zzb;

    zzgil(zzaxf zzaxfVar, zzghg zzghgVar, zzgdl zzgdlVar, Map map, zzgpu zzgpuVar) {
        super("iqNxrA39udYfZwL8ikj8QrH6GLNyDgn2xpJcGD9bSCzMyXQCZ9vm5NTDuXRD03vB", "Xa72p7jIVzvp+ti20aPtDwi/Mq1wVJXGo11cqYEjDFo=", zzaxfVar, zzghgVar, zzgpuVar.zza(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        this.zza = map;
        this.zzb = zzgdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzgst.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzgst.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzgst.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzgst.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzgst.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzgst.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzgst.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzgst.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzgst.zza((Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        Long[] lArr3 = lArr2;
        synchronized (zzaxfVar) {
            zzaxfVar.zzac(lArr3[0].longValue());
            zzaxfVar.zzs(lArr3[1].longValue());
            zzaxfVar.zzn(lArr3[2].longValue());
            zzaxfVar.zzk(lArr3[3].longValue());
            zzaxfVar.zzY(lArr3[4].longValue());
            zzaxfVar.zzZ(lArr3[5].longValue());
            zzaxfVar.zzF(lArr3[6].longValue());
            zzaxfVar.zzG(lArr3[7].longValue());
        }
    }
}
