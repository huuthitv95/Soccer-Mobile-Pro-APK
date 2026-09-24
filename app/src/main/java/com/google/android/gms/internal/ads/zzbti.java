package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbti {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfpv zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbth zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbti(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfpv zzfpvVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfpvVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    protected final zzbth zza(zzbai zzbaiVar) {
        zzfpi zzfpiVarZzn = zzfpi.CC.zzn(this.zzb, 6);
        zzfpiVarZzn.zza();
        final zzbth zzbthVar = new zzbth(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzbai zzbaiVar2 = null;
        zzcff.zzf.execute(new Runnable(zzbaiVar2, zzbthVar) { // from class: com.google.android.gms.internal.ads.zzbsy
            private final /* synthetic */ zzbth zzb;

            {
                this.zzb = zzbthVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbthVar.zze(new zzbsr(this, zzbthVar, zzfpiVarZzn), new zzbss(this, zzbthVar, zzfpiVarZzn));
        return zzbthVar;
    }

    public final zzbtc zzb(zzbai zzbaiVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (obj) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbth zzbthVar = this.zzh;
                if (zzbthVar != null && this.zzi == 0) {
                    zzbthVar.zze(new zzcfo() { // from class: com.google.android.gms.internal.ads.zzbsu
                        @Override // com.google.android.gms.internal.ads.zzcfo
                        public final /* synthetic */ void zza(Object obj2) {
                            this.zza.zze((zzbsd) obj2);
                        }
                    }, zzbsv.zza);
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbth zzbthVar2 = this.zzh;
        if (zzbthVar2 != null && zzbthVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbth zzbthVar = this.zzh;
        if (zzbthVar != null) {
            zzbthVar.zzc();
            this.zzh = null;
        }
    }

    final /* synthetic */ void zzd(zzbai zzbaiVar, final zzbth zzbthVar) {
        final long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbsl zzbslVar = new zzbsl(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbslVar.zzi(new zzbsc() { // from class: com.google.android.gms.internal.ads.zzbsw
                @Override // com.google.android.gms.internal.ads.zzbsc
                public final /* synthetic */ void zza() {
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(strValueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzfzw zzfzwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbti zzbtiVar = this.zza;
                    final zzbth zzbthVar2 = zzbthVar;
                    final zzbsd zzbsdVar = zzbslVar;
                    zzfzwVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbtiVar.zzf(zzbthVar2, zzbsdVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbslVar.zzm("/jsLoaded", new zzbsn(this, jCurrentTimeMillis, zzbthVar, zzbslVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbso zzbsoVar = new zzbso(this, null, zzbslVar, zzbvVar);
            zzbvVar.zzb(zzbsoVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbke.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbslVar.zzm("/requestReload", zzbsoVar);
            }
            String str = this.zzc;
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbslVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbslVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbslVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbsq(this, zzbthVar, zzbslVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zze)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziF)).booleanValue()) {
                zzbthVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbthVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbthVar.zzg();
            }
        }
    }

    final /* synthetic */ void zze(zzbsd zzbsdVar) {
        if (zzbsdVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zzf(zzbth zzbthVar, final zzbsd zzbsdVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbthVar.zzi() != -1 && zzbthVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziF)).booleanValue()) {
                    zzbthVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbthVar.zzg();
                }
                zzhbs zzhbsVar = zzcff.zzf;
                Objects.requireNonNull(zzbsdVar);
                zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbst
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbsdVar.zzj();
                    }
                });
                String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzd));
                int iZzi = zzbthVar.zzi();
                int i = this.zzi;
                String strValueOf2 = String.valueOf(arrayList.get(0));
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i).length() + 57 + String.valueOf(strValueOf2).length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                sb.append("Could not receive /jsLoaded in ");
                sb.append(strValueOf);
                sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                sb.append(iZzi);
                sb.append(". Update status(onEngLoadedTimeout) is ");
                sb.append(i);
                sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                sb.append(strValueOf2);
                sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                sb.append(jCurrentTimeMillis);
                sb.append(" ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ Object zzg() {
        return this.zza;
    }

    final /* synthetic */ zzfpv zzh() {
        return this.zze;
    }

    final /* synthetic */ zzbth zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzj(zzbth zzbthVar) {
        this.zzh = zzbthVar;
    }

    final /* synthetic */ int zzk() {
        return this.zzi;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
