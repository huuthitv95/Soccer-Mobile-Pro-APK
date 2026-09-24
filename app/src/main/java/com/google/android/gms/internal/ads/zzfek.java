package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfek implements zzimi {
    public static zzfcb zza(Context context, zzceg zzcegVar, zzceh zzcehVar, Object obj, zzfdd zzfddVar, zzfdx zzfdxVar, zzimc zzimcVar, zzimc zzimcVar2, zzimc zzimcVar3, zzimc zzimcVar4, zzimc zzimcVar5, zzimc zzimcVar6, zzimc zzimcVar7, Executor executor, zzfps zzfpsVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfdq) obj);
        hashSet.add(zzfddVar);
        hashSet.add(zzfdxVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgM)).booleanValue()) {
            hashSet.add((zzfby) zzimcVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgN)).booleanValue()) {
            hashSet.add((zzfby) zzimcVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgP)).booleanValue()) {
            hashSet.add((zzfby) zzimcVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgQ)).booleanValue()) {
            hashSet.add((zzfby) zzimcVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdV)).booleanValue()) {
            hashSet.add((zzfby) zzimcVar7.zzb());
        }
        return new zzfcb(context, executor, hashSet, zzfpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
