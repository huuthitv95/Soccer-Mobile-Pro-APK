package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnd implements zzddt, com.google.android.gms.ads.internal.overlay.zzr, zzdcz {
    zzelb zza;
    private final Context zzb;
    private final zzcki zzc;
    private final zzfjt zzd;
    private final VersionInfoParcel zze;
    private final zzekz zzf;

    public zzdnd(Context context, zzcki zzckiVar, zzfjt zzfjtVar, VersionInfoParcel versionInfoParcel, zzekz zzekzVar) {
        this.zzb = context;
        this.zzc = zzckiVar;
        this.zzd = zzfjtVar;
        this.zze = versionInfoParcel;
        this.zzf = zzekzVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        zzcki zzckiVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzckiVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgq)).booleanValue()) {
                zzckiVar.zze("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        zzcki zzckiVar;
        zzeky zzekyVar;
        zzekx zzekxVar;
        zzfjt zzfjtVar = this.zzd;
        if (!zzfjtVar.zzT || (zzckiVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i = versionInfoParcel.buddyApkVersion;
            int i2 = versionInfoParcel.clientJarVersion;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String string = sb.toString();
            zzfkp zzfkpVar = zzfjtVar.zzV;
            String strZza = zzfkpVar.zza();
            if (zzfkpVar.zzc() == 1) {
                zzekxVar = zzekx.VIDEO;
                zzekyVar = zzeky.DEFINED_BY_JAVASCRIPT;
            } else {
                zzekyVar = zzfjtVar.zzY == 2 ? zzeky.UNSPECIFIED : zzeky.BEGIN_TO_RENDER;
                zzekxVar = zzekx.HTML_DISPLAY;
            }
            zzelb zzelbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzckiVar.zzD(), "", "javascript", strZza, zzekyVar, zzekxVar, zzfjtVar.zzal);
            this.zza = zzelbVarZzc;
            if (zzelbVarZzc != null) {
                zzftu zzftuVarZza = zzelbVarZzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgm)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzftuVarZza, zzckiVar.zzD());
                    Iterator it = zzckiVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzftuVarZza, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzftuVarZza, zzckiVar.zzE());
                }
                zzckiVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzftuVarZza);
                zzckiVar.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzcki zzckiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgq)).booleanValue() || (zzckiVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzckiVar.zze("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
