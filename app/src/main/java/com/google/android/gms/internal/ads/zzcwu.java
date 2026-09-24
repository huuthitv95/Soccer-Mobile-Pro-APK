package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwu implements zzddt, zzdcz {
    private final Context zza;
    private final zzcki zzb;
    private final zzfjt zzc;
    private final VersionInfoParcel zzd;
    private zzelb zze;
    private boolean zzf;
    private final zzekz zzg;

    public zzcwu(Context context, zzcki zzckiVar, zzfjt zzfjtVar, VersionInfoParcel versionInfoParcel, zzekz zzekzVar) {
        this.zza = context;
        this.zzb = zzckiVar;
        this.zzc = zzfjtVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzekzVar;
    }

    private final synchronized void zza() {
        zzcki zzckiVar;
        zzeky zzekyVar;
        zzekx zzekxVar;
        zzfjt zzfjtVar = this.zzc;
        if (zzfjtVar.zzT && (zzckiVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
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
                    int i3 = zzfjtVar.zze;
                    zzekx zzekxVar2 = zzekx.HTML_DISPLAY;
                    zzekyVar = i3 == 1 ? zzeky.ONE_PIXEL : zzeky.BEGIN_TO_RENDER;
                    zzekxVar = zzekxVar2;
                }
                zzelb zzelbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzckiVar.zzD(), "", "javascript", strZza, zzekyVar, zzekxVar, zzfjtVar.zzal);
                this.zze = zzelbVarZzc;
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
                    zzckiVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zzftuVarZza);
                    this.zzf = true;
                    zzckiVar.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void zzdr() {
        zzcki zzckiVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzckiVar = this.zzb) == null) {
            return;
        }
        zzckiVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
