package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhd {
    private final zzbhi zza;
    private final zzbhj.zzt.zza zzb;
    private final boolean zzc;

    private zzbhd() {
        this.zzb = zzbhj.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbhi();
    }

    public static zzbhd zza() {
        return new zzbhd();
    }

    private final synchronized void zzd(int i) {
        zzbhj.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzj());
        zzbhh zzbhhVar = new zzbhh(this.zza, zzaVar.zzbu().zzaN(), null);
        int i2 = i - 1;
        zzbhhVar.zzb(i2);
        zzbhhVar.zza();
        String string = Integer.toString(i2, 10);
        String.valueOf(string);
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(string)));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfyu.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzf(i).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i) {
        zzbhj.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbhc zzbhcVar) {
        if (this.zzc) {
            try {
                zzbhcVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgf)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbhd(zzbhi zzbhiVar) {
        this.zzb = zzbhj.zzt.zzx();
        this.zza = zzbhiVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue();
    }
}
