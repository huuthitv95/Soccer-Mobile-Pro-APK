package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfya {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbdh zzd;

    public zzfya(Context context, zzbdh zzbdhVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfyb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfyb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbdhVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    public final boolean zza(zzbdj zzbdjVar, zzfyg zzfygVar) {
        boolean z;
        String strZza = zzbdjVar.zza().zza();
        byte[] bArrZzA = zzbdjVar.zzb().zzA();
        byte[] bArrZzA2 = zzbdjVar.zzc().zzA();
        if (!TextUtils.isEmpty(strZza) && bArrZzA2 != null && bArrZzA2.length != 0) {
            File file = this.zza;
            zzfyb.zze(file);
            file.mkdirs();
            zzfyb.zzc(strZza, file).mkdirs();
            File fileZza = zzfyb.zza(strZza, "pcam.jar", file);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfyb.zzb(fileZza, bArrZzA)) && zzfyb.zzb(zzfyb.zza(strZza, "pcbc", file), bArrZzA2)) {
                File fileZza2 = zzfyb.zza(zzbdjVar.zza().zza(), "pcam.jar", file);
                if (fileZza2.exists() && zzfygVar != null && !zzfygVar.zza(fileZza2)) {
                    return false;
                }
                String strZza2 = zzbdjVar.zza().zza();
                if (TextUtils.isEmpty(strZza2)) {
                    z = false;
                } else {
                    File fileZza3 = zzfyb.zza(strZza2, "pcam.jar", file);
                    File fileZza4 = zzfyb.zza(strZza2, "pcbc", file);
                    File fileZza5 = zzfyb.zza(strZza2, "pcam.jar", zzd());
                    File fileZza6 = zzfyb.zza(strZza2, "pcbc", zzd());
                    if ((!fileZza3.exists() || fileZza3.renameTo(fileZza5)) && fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                        zzbdo zzbdoVarZzi = zzbdp.zzi();
                        zzbdoVarZzi.zza(zzbdjVar.zza().zza());
                        zzbdoVarZzi.zzb(zzbdjVar.zza().zzb());
                        zzbdoVarZzi.zzd(zzbdjVar.zza().zzd());
                        zzbdoVarZzi.zze(zzbdjVar.zza().zze());
                        zzbdoVarZzi.zzc(zzbdjVar.zza().zzc());
                        zzbdp zzbdpVar = (zzbdp) zzbdoVarZzi.zzbu();
                        zzbdp zzbdpVarZzc = zzc(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzbdpVarZzc != null && !zzbdpVar.zza().equals(zzbdpVarZzc.zza())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzbdpVarZzc.zzaN()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzbdpVar.zzaN()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzbdp zzbdpVarZzc2 = zzc(1);
                if (zzbdpVarZzc2 != null) {
                    hashSet.add(zzbdpVarZzc2.zza());
                }
                zzbdp zzbdpVarZzc3 = zzc(2);
                if (zzbdpVarZzc3 != null) {
                    hashSet.add(zzbdpVarZzc3.zza());
                }
                for (File file2 : zzd().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        zzfyb.zze(zzfyb.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final zzfxz zzb(int i) {
        zzbdp zzbdpVarZzc = zzc(1);
        if (zzbdpVarZzc == null) {
            return null;
        }
        String strZza = zzbdpVarZzc.zza();
        File fileZza = zzfyb.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfyb.zza(strZza, "pcam", zzd());
        }
        return new zzfxz(zzbdpVarZzc, fileZza, zzfyb.zza(strZza, "pcbc", zzd()), zzfyb.zza(strZza, "pcopt", zzd()));
    }

    final zzbdp zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzicn zzicnVar = zzicn.zza;
            zzbdp zzbdpVarZzg = zzbdp.zzg(zzicn.zzt(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzbdpVarZzg.zza();
            File fileZza = zzfyb.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfyb.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfyb.zza(strZza, "pcbc", zzd());
            if (fileZza.exists() && fileZza2.exists()) {
                return zzbdpVarZzg;
            }
            return null;
        } catch (zzieg unused) {
        }
    }
}
