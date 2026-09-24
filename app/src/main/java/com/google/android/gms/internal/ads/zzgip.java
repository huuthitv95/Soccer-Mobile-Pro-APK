package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgip extends zzgik {
    private final DisplayMetrics zza;
    private final View zzb;

    zzgip(zzaxf zzaxfVar, zzghg zzghgVar, DisplayMetrics displayMetrics, View view, zzgpu zzgpuVar) {
        super("m32trfefsHf6wWx1xdEw1mUC1D9AoGGYGQTzPIk/NmCEVKjWhdoUc1wLYHPz/Hjg", "ee17EF8QfsLpUNArPEzfX1HuyyKq/mGCnHh3OtrInIw=", zzaxfVar, zzghgVar, zzgpuVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    protected final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzayd zzaydVarZza = zzaye.zza();
        zzaydVarZza.zzb(lArr[2].longValue());
        zzaydVarZza.zzc(lArr[1].longValue());
        zzaydVarZza.zzd(lArr[0].longValue());
        zzaydVarZza.zza(lArr[3].longValue());
        zzaydVarZza.zze(lArr[4].longValue());
        zzaxfVar.zzM((zzaye) zzaydVarZza.zzbu());
    }
}
