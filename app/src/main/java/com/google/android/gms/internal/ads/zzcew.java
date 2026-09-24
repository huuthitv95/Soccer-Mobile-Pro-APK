package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcew implements zzbey {
    final zzcet zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzceu zzf = new zzceu();

    public zzcew(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcet(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (!z) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
            zzgVar.zzl(jCurrentTimeMillis);
            zzgVar.zzn(this.zza.zzd);
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zze;
        if (jCurrentTimeMillis - zzgVar2.zzm() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbG)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = zzgVar2.zzo();
        }
        this.zzg = true;
    }

    public final void zzb(zzcel zzcelVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcelVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        synchronized (this.zzd) {
            this.zza.zze(zzmVar, j);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int iZzd;
        synchronized (this.zzd) {
            iZzd = this.zza.zzd();
        }
        return iZzd;
    }

    public final zzcel zzk(Clock clock, String str) {
        return new zzcel(clock, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final zzces zzm(Set set, String str) {
        return this.zza.zzi(set, str);
    }

    public final Bundle zzn(Context context, zzflu zzfluVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcel) it2.next()).zzi());
        }
        bundle.putParcelableArrayList(AbstractC13068b.JSON_KEY_ADS, arrayList);
        zzfluVar.zzb(hashSet);
        return bundle;
    }
}
