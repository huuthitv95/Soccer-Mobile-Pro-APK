package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcq extends zzbcy {
    private final StackTraceElement[] zzh;

    public zzbcq(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzbblVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzaxfVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbbc zzbbcVar = new zzbbc((String) this.zze.invoke(null, stackTraceElementArr));
            zzaxf zzaxfVar = this.zzd;
            synchronized (zzaxfVar) {
                zzaxfVar.zzC(zzbbcVar.zza.longValue());
                if (zzbbcVar.zzb.booleanValue()) {
                    zzaxfVar.zzag(true != zzbbcVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    zzaxfVar.zzag(3);
                }
            }
        }
    }
}
