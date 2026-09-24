package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzebk {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdwq zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdzk zzl;
    private final VersionInfoParcel zzm;
    private final zzdjl zzo;
    private final zzfpv zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcfk zze = new zzcfk();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzebk(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdwq zzdwqVar, ScheduledExecutorService scheduledExecutorService, zzdzk zzdzkVar, VersionInfoParcel versionInfoParcel, zzdjl zzdjlVar, zzfpv zzfpvVar) {
        this.zzh = zzdwqVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdzkVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdjlVar;
        this.zzp = zzfpvVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized ListenableFuture zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzhbi.zza(strZzd);
        }
        final zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcfkVar);
            }
        });
        return zzcfkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbrd(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzbrk zzbrkVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbrkVar.zzb(this.zza.zzd());
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbkk.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcy)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zze();
                    this.zzo.zze();
                    zzcfk zzcfkVar = this.zze;
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzebc
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf();
                        }
                    };
                    Executor executor = this.zzi;
                    zzcfkVar.addListener(runnable, executor);
                    this.zza = true;
                    ListenableFuture listenableFutureZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebe
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzh();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcA)).longValue(), TimeUnit.SECONDS);
                    zzhbi.zzr(listenableFutureZzu, new zzeba(this), executor);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbrd zzbrdVar = (zzbrd) map.get(str);
            arrayList.add(new zzbrd(str, zzbrdVar.zzb, zzbrdVar.zzc, zzbrdVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final zzcfk zzcfkVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcfk zzcfkVar2 = zzcfkVar;
                if (zIsEmpty) {
                    zzcfkVar2.zzd(new Exception());
                } else {
                    zzcfkVar2.zzc(strZzd);
                }
            }
        });
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
            this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzi(Object obj, zzcfk zzcfkVar, String str, long j, zzfpi zzfpiVar) {
        synchronized (obj) {
            if (!zzcfkVar.isDone()) {
                zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzfpv zzfpvVar = this.zzp;
                zzfpiVar.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                zzfpiVar.zzd(false);
                zzfpvVar.zzb(zzfpiVar.zzm());
                zzcfkVar.zzc(false);
            }
        }
    }

    final /* synthetic */ Object zzj(zzfpi zzfpiVar) {
        this.zze.zzc(true);
        zzfpiVar.zzd(true);
        this.zzp.zzb(zzfpiVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(String str, zzbrh zzbrhVar, zzflk zzflkVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbrhVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzflkVar.zzA(context, zzbrhVar, list);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
        } catch (RemoteException e2) {
            throw new zzgtu(e2);
        } catch (zzfkt unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbrhVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(String str) {
        final zzebk zzebkVar = this;
        Context context = zzebkVar.zzf;
        int i = 5;
        final zzfpi zzfpiVarZzn = zzfpi.CC.zzn(context, 5);
        zzfpiVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfpi zzfpiVarZzn2 = zzfpi.CC.zzn(context, i);
                zzfpiVarZzn2.zza();
                zzfpiVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzcfk zzcfkVar = new zzcfk();
                ListenableFuture listenableFutureZzi = zzhbi.zzi(zzcfkVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcz)).longValue(), TimeUnit.SECONDS, zzebkVar.zzk);
                zzebkVar.zzl.zza(next);
                zzebkVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                listenableFutureZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcfkVar, next, jElapsedRealtime, zzfpiVarZzn2);
                    }
                }, zzebkVar.zzi);
                arrayList.add(listenableFutureZzi);
                try {
                    try {
                        final zzebb zzebbVar = new zzebb(this, obj, next, jElapsedRealtime, zzfpiVarZzn2, zzcfkVar);
                        zzebkVar = this;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i2 = 0;
                                while (i2 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzbrn(strOptString, bundle));
                                    i2++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzebkVar.zzm(next, false, "", 0);
                        try {
                            final zzflk zzflkVarZza = zzebkVar.zzh.zza(next, new JSONObject());
                            zzebkVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebh
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzk(next, zzebbVar, zzflkVarZza, arrayList2);
                                }
                            });
                        } catch (zzfkt e) {
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzow)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                zzebbVar.zzf(string);
                            } catch (RemoteException e2) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                            }
                        }
                        i = 5;
                    } catch (JSONException e3) {
                        e = e3;
                        zzebkVar = this;
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                        zzebkVar.zzo.zzd("MalformedJson");
                        zzebkVar.zzl.zzd("MalformedJson");
                        zzebkVar.zze.zzd(e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                        zzfpv zzfpvVar = zzebkVar.zzp;
                        zzfpiVarZzn.zzj(e);
                        zzfpiVarZzn.zzd(false);
                        zzfpvVar.zzb(zzfpiVarZzn.zzm());
                    }
                } catch (JSONException e4) {
                    e = e4;
                    zzebkVar = this;
                }
            }
            zzhbi.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfpiVarZzn);
                    return null;
                }
            }, zzebkVar.zzi);
        } catch (JSONException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzebkVar.zzo.zzd("MalformedJson");
            zzebkVar.zzl.zzd("MalformedJson");
            zzebkVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfpv zzfpvVar2 = zzebkVar.zzp;
            zzfpiVarZzn.zzj(e);
            zzfpiVarZzn.zzd(false);
            zzfpvVar2.zzb(zzfpiVarZzn.zzm());
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ zzcfk zzp() {
        return this.zze;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ zzdzk zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzdjl zzs() {
        return this.zzo;
    }

    final /* synthetic */ zzfpv zzt() {
        return this.zzp;
    }
}
