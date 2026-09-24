package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdvv {
    private final zzdcd zza;
    private final zzdkk zzb;
    private final zzddm zzc;
    private final zzddz zzd;
    private final zzdeq zze;
    private final zzdhj zzf;
    private final Executor zzg;
    private final zzdkg zzh;
    private final zzctu zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcdb zzk;
    private final zzbai zzl;
    private final zzdha zzm;
    private final zzeju zzn;
    private final zzfro zzo;
    private final zzdyz zzp;
    private final zzcsx zzq;
    private final zzdwb zzr;
    private final zzeac zzs;
    private final zzdbg zzt;
    private final zzdbb zzu;

    public zzdvv(zzdcd zzdcdVar, zzddm zzddmVar, zzddz zzddzVar, zzdeq zzdeqVar, zzdhj zzdhjVar, Executor executor, zzdkg zzdkgVar, zzctu zzctuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar, zzbai zzbaiVar, zzdha zzdhaVar, zzeju zzejuVar, zzfro zzfroVar, zzdyz zzdyzVar, zzdkk zzdkkVar, zzcsx zzcsxVar, zzdwb zzdwbVar, zzeac zzeacVar, zzdbg zzdbgVar, zzdbb zzdbbVar) {
        this.zza = zzdcdVar;
        this.zzc = zzddmVar;
        this.zzd = zzddzVar;
        this.zze = zzdeqVar;
        this.zzf = zzdhjVar;
        this.zzg = executor;
        this.zzh = zzdkgVar;
        this.zzi = zzctuVar;
        this.zzj = zzbVar;
        this.zzk = zzcdbVar;
        this.zzl = zzbaiVar;
        this.zzm = zzdhaVar;
        this.zzn = zzejuVar;
        this.zzo = zzfroVar;
        this.zzp = zzdyzVar;
        this.zzb = zzdkkVar;
        this.zzq = zzcsxVar;
        this.zzr = zzdwbVar;
        this.zzs = zzeacVar;
        this.zzt = zzdbgVar;
        this.zzu = zzdbbVar;
    }

    public static final ListenableFuture zzj(zzcki zzckiVar, String str, String str2, final zzdyu zzdyuVar, zzfps zzfpsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcQ)).booleanValue()) {
            zzdyuVar.zzf(zzdyi.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final zzcfk zzcfkVar = new zzcfk();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzki)).booleanValue()) {
            zzfpi zzfpiVarZzn = zzfpi.CC.zzn(zzckiVar.getContext(), 112);
            zzfpiVarZzn.zza();
            zzfpr.zzd(zzcfkVar, zzfpsVar, zzfpiVarZzn);
        }
        zzckiVar.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdvt
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcfk zzcfkVar2 = zzcfkVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcQ)).booleanValue()) {
                        zzdyuVar.zzf(zzdyi.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    zzcfkVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcfkVar2.zzd(new Exception(sb.toString()));
            }
        });
        zzckiVar.zzau(str, str2, null);
        return zzcfkVar;
    }

    final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzf(zzcki zzckiVar, zzcki zzckiVar2, Map map) {
        this.zzi.zzn(zzckiVar);
    }

    final /* synthetic */ zzddm zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzdha zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcki zzckiVar, boolean z, zzbph zzbphVar, zzdyu zzdyuVar) {
        zzbad zzbadVarZzb;
        zzbhv zzbhvVar = zzbie.zzcQ;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            zzdyuVar.zzf(zzdyi.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzckiVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdvu
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbnw() { // from class: com.google.android.gms.internal.ads.zzdvn
            @Override // com.google.android.gms.internal.ads.zzbnw
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvo
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z, zzbphVar, this.zzj, new zzdvm(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzckiVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdvp
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzckiVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdvq
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdz)).booleanValue() && (zzbadVarZzb = this.zzl.zzb()) != null) {
            zzbadVarZzb.zzh(zzckiVar.zzE());
        }
        zzdkg zzdkgVar = this.zzh;
        Executor executor = this.zzg;
        zzdkgVar.zzq(zzckiVar, executor);
        zzdkgVar.zzq(new zzbee() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzbee
            public final /* synthetic */ void zzdj(zzbed zzbedVar) {
                Rect rect = zzbedVar.zzd;
                zzckiVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdkgVar.zza(zzckiVar.zzE());
        zzckiVar.zzab("/trackActiveViewUnit", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdvs
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzckiVar, (zzcki) obj, map);
            }
        });
        this.zzi.zzo(zzckiVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            zzdyuVar.zzf(zzdyi.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }
}
