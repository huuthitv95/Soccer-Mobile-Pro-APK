package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzffu extends zzffb {
    public zzffu(Context context, Executor executor, zzcmx zzcmxVar, zzfhk zzfhkVar, zzffs zzffsVar, zzfkl zzfklVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcmxVar, zzfhkVar, zzffsVar, zzfklVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzffb
    protected final /* bridge */ /* synthetic */ zzdbm zzc(zzcuw zzcuwVar, zzdbp zzdbpVar, zzdif zzdifVar) {
        zzcum zzcumVarZzk = this.zza.zzk();
        zzcumVarZzk.zzd(zzdbpVar);
        zzcumVarZzk.zze(zzdifVar);
        return zzcumVarZzk;
    }
}
