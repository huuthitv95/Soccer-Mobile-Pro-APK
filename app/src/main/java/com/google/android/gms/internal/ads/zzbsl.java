package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbsl implements zzbsd, zzbsb {
    private zzcki zza;

    public zzbsl(Context context, VersionInfoParcel versionInfoParcel, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzckx {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcki zzckiVarZza = zzcky.zza(context, zzcms.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbhd.zza(), null, null, null, null, null);
        this.zza = zzckiVarZza;
        zzckiVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzc(String str, String str2) {
        zzbsb.CC.$default$zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        zzbsb.CC.$default$zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public /* synthetic */ void zze(String str, Map map) {
        zzbsb.CC.$default$zze(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzf(String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzg(final String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzi(final zzbsc zzbscVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzcmg zzcmgVarZzP = zzckiVar.zzP();
            Objects.requireNonNull(zzbscVar);
            zzcmgVarZzP.zzH(new zzcmf() { // from class: com.google.android.gms.internal.ads.zzbsf
                @Override // com.google.android.gms.internal.ads.zzcmf
                public final /* synthetic */ void zza() {
                    zzbscVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzj() {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final boolean zzk() {
        zzcki zzckiVar = this.zza;
        return zzckiVar == null || zzckiVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final zzbtk zzl() {
        return new zzbtk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzm(String str, zzbpe zzbpeVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzab(str, new zzbse(this, zzbpeVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzn(String str, final zzbpe zzbpeVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbsj
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbpe zzbpeVar2 = (zzbpe) obj;
                    if (zzbpeVar2 instanceof zzbse) {
                        return ((zzbse) zzbpeVar2).zzb().equals(zzbpeVar);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzq(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzr(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadUrl(str);
        }
    }
}
