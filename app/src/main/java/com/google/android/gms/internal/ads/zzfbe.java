package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfbe implements zzfby {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfbf zzc = new zzfbf(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzhbs zzd;
    private final ScheduledExecutorService zze;
    private final zzerk zzf;
    private final Context zzg;
    private final zzfkm zzh;
    private final zzerf zzi;
    private final zzdwq zzj;
    private final zzebm zzk;

    zzfbe(zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, String str, zzerk zzerkVar, Context context, zzfkm zzfkmVar, zzerf zzerfVar, zzdwq zzdwqVar, zzebm zzebmVar) {
        this.zzd = zzhbsVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzerkVar;
        this.zzg = context;
        this.zzh = zzfkmVar;
        this.zzi = zzerfVar;
        this.zzj = zzdwqVar;
        this.zzk = zzebmVar;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzero zzeroVar = (zzero) ((Map.Entry) it.next()).getValue();
            String str = zzeroVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeroVar.zze), zzg(str), zzeroVar.zzb, zzeroVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzhba zzh(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzhap zzhapVar = new zzhap() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // com.google.android.gms.internal.ads.zzhap
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        };
        zzhbs zzhbsVar = this.zzd;
        zzhba zzhbaVarZzw = zzhba.zzw(zzhbi.zzf(zzhapVar, zzhbsVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzck)).booleanValue()) {
            zzhbaVarZzw = (zzhba) zzhbi.zzi(zzhbaVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcd)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzhba) zzhbi.zzg(zzhbaVarZzw, Throwable.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfba
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzfbe.zzb;
                String str2 = str;
                String.valueOf(str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoy)).booleanValue()) {
                    zzcer zzcerVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
                    String.valueOf(str2);
                    zzcerVarZzh.zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                zzcer zzcerVarZzh2 = com.google.android.gms.ads.internal.zzt.zzh();
                String.valueOf(str2);
                zzcerVarZzh2.zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzhbsVar);
    }

    private final void zzi(zzbwp zzbwpVar, Bundle bundle, List list, zzern zzernVar) throws RemoteException {
        zzbwpVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzernVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        zzfkm zzfkmVar = this.zzh;
        if (zzfkmVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcq)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfkmVar.zzd)))) {
                return zzhbi.zza(zzc);
            }
        }
        return zzhbi.zzf(new zzhap() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // com.google.android.gms.internal.ads.zzhap
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ ListenableFuture zzc() {
        final String str;
        zzfbe zzfbeVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmn)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzco)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfd)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcx)).booleanValue()) {
            zzfbeVar = this;
            zzf(arrayList, zzfbeVar.zzf.zzd(zzfbeVar.zza, lowerCase));
        } else {
            zzerk zzerkVar = this.zzf;
            for (Map.Entry entry : zzerkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzfbeVar = this;
            zzf(arrayList, zzerkVar.zzb());
        }
        return zzhbi.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfay
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i = zzfbe.zzb;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzfbf(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfd)).booleanValue()) {
                    return new zzfbf(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzfbeVar.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws RemoteException {
        final zzbwp zzbwpVar;
        zzbwp zzbwpVarZzb;
        final zzcfk zzcfkVar = new zzcfk();
        if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcp)).booleanValue()) {
                try {
                    zzbwpVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
                    zzbwpVar = null;
                }
            } else {
                zzerf zzerfVar = this.zzi;
                zzerfVar.zza(str);
                zzbwpVarZzb = zzerfVar.zzb(str);
            }
            zzbwpVar = zzbwpVarZzb;
        } else {
            zzbwpVarZzb = this.zzj.zzb(str);
            zzbwpVar = zzbwpVarZzb;
        }
        if (zzbwpVar == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcf)).booleanValue()) {
                throw null;
            }
            zzern.zzd(str, zzcfkVar);
            return zzcfkVar;
        }
        final zzern zzernVar = new zzern(str, zzbwpVar, zzcfkVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzck)).booleanValue()) {
            this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzernVar.zzc();
                }
            }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcd)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z) {
            zzernVar.zzb();
            return zzcfkVar;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcr)).booleanValue()) {
            this.zzd.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzbwpVar, bundle, list, zzernVar, zzcfkVar);
                }
            });
            return zzcfkVar;
        }
        zzi(zzbwpVar, bundle, list, zzernVar);
        return zzcfkVar;
    }

    final /* synthetic */ void zze(zzbwp zzbwpVar, Bundle bundle, List list, zzern zzernVar, zzcfk zzcfkVar) {
        try {
            zzi(zzbwpVar, bundle, list, zzernVar);
        } catch (RemoteException e) {
            zzcfkVar.zzd(e);
        }
    }
}
