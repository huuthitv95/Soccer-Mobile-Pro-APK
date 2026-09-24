package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeor {
    private final Clock zza;
    private final zzeot zzb;
    private final zzfro zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhN)).booleanValue();
    private final zzell zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeor(Clock clock, zzeot zzeotVar, zzell zzellVar, zzfro zzfroVar) {
        this.zza = clock;
        this.zzb = zzeotVar;
        this.zzf = zzellVar;
        this.zzc = zzfroVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfjt zzfjtVar) {
        zzeoq zzeoqVar = (zzeoq) this.zzd.get(zzfjtVar);
        if (zzeoqVar == null) {
            return false;
        }
        return zzeoqVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfjt zzfjtVar = (zzfjt) it.next();
            String str = zzfjtVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfjtVar, new zzeoq(str, zzfjtVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfjt zzfjtVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfjtVar != null) {
            this.zzf.zzi(zzfjtVar);
        }
        this.zzg = true;
    }

    final synchronized ListenableFuture zze(zzfke zzfkeVar, zzfjt zzfjtVar, ListenableFuture listenableFuture, zzfrk zzfrkVar) {
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfjtVar.zzw;
        if (str != null) {
            this.zzd.put(zzfjtVar, new zzeoq(str, zzfjtVar.zzaf, 9, 0L, null));
            zzhbi.zzr(listenableFuture, new zzeop(this, jElapsedRealtime, zzfjwVar, zzfjtVar, str, zzfrkVar, zzfkeVar), zzcff.zzh);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(zzfjt zzfjtVar) {
        zzeoq zzeoqVar = (zzeoq) this.zzd.get(zzfjtVar);
        if (zzeoqVar == null || this.zzg) {
            return;
        }
        zzeoqVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzeoq zzeoqVar = (zzeoq) ((Map.Entry) it.next()).getValue();
            if (zzeoqVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeoqVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    final /* synthetic */ zzeot zzk() {
        return this.zzb;
    }

    final /* synthetic */ zzfro zzl() {
        return this.zzc;
    }

    final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ zzell zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
