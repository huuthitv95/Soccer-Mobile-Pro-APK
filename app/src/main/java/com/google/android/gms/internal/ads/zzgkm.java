package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkm {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzimc zzd;
    private final zzgpu zze;

    zzgkm(Context context, SharedPreferences sharedPreferences, zzimc zzimcVar, zzgpu zzgpuVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfyb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfyb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzimcVar;
        this.zze = zzgpuVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbdh) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = ((zzbdh) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String zzf() {
        int iZza = ((zzbdh) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    public final boolean zza(zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        boolean z;
        String strZza = zzgfdVar.zza().zza();
        if (!TextUtils.isEmpty(strZza) && bArr2.length != 0) {
            File file = this.zza;
            zzfyb.zze(file);
            file.mkdirs();
            File fileZzc = zzfyb.zzc(strZza, file);
            fileZzc.getClass();
            fileZzc.mkdirs();
            File fileZza = zzfyb.zza(strZza, "pcam.jar", file);
            fileZza.getClass();
            if (bArr == null || bArr.length <= 0 || zzfyb.zzb(fileZza, bArr)) {
                File fileZza2 = zzfyb.zza(strZza, "pcbc", file);
                fileZza2.getClass();
                if (zzfyb.zzb(fileZza2, bArr2)) {
                    String strZza2 = zzgfdVar.zza().zza();
                    if (TextUtils.isEmpty(strZza2)) {
                        z = false;
                    } else {
                        File fileZza3 = zzfyb.zza(strZza2, "pcam.jar", file);
                        fileZza3.getClass();
                        File fileZza4 = zzfyb.zza(strZza2, "pcbc", file);
                        fileZza4.getClass();
                        File fileZza5 = zzfyb.zza(strZza2, "pcam.jar", zzd());
                        fileZza5.getClass();
                        File fileZza6 = zzfyb.zza(strZza2, "pcbc", zzd());
                        fileZza6.getClass();
                        if (fileZza3.exists() && !fileZza3.renameTo(fileZza5)) {
                            this.zze.zzb(15318);
                        } else if (fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                            zzgfd zzgfdVarZzc = zzc(1);
                            SharedPreferences.Editor editorEdit = this.zzc.edit();
                            if (zzgfdVarZzc != null && !zzgfdVar.zza().zza().equals(zzgfdVarZzc.zza().zza())) {
                                editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzgfdVarZzc.zzaN()));
                            }
                            editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzgfdVar.zzaN()));
                            if (editorEdit.commit()) {
                                z = true;
                            } else {
                                this.zze.zzb(15320);
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzgfd zzgfdVarZzc2 = zzc(1);
                    if (zzgfdVarZzc2 != null) {
                        hashSet.add(zzgfdVarZzc2.zza().zza());
                    }
                    zzgfd zzgfdVarZzc3 = zzc(2);
                    if (zzgfdVarZzc3 != null) {
                        hashSet.add(zzgfdVarZzc3.zza().zza());
                    }
                    File[] fileArrListFiles = zzd().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileZzc2 = zzfyb.zzc(name, zzd());
                                fileZzc2.getClass();
                                zzfyb.zze(fileZzc2);
                            }
                        }
                    }
                    return z;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfxz zzb(int i) {
        zzgfd zzgfdVarZzc = zzc(1);
        if (zzgfdVarZzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String strZza = zzgfdVarZzc.zza().zza();
        File fileZza = zzfyb.zza(strZza, "pcam.jar", zzd());
        fileZza.getClass();
        if (!fileZza.exists()) {
            fileZza = zzfyb.zza(strZza, "pcam", zzd());
            fileZza.getClass();
        }
        File fileZza2 = zzfyb.zza(strZza, "pcopt", zzd());
        fileZza2.getClass();
        File fileZza3 = zzfyb.zza(strZza, "pcbc", zzd());
        fileZza3.getClass();
        return new zzfxz(zzgfdVarZzc.zza(), fileZza, fileZza3, fileZza2);
    }

    public final zzgfd zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzicn zzicnVar = zzicn.zza;
            zzgfd zzgfdVarZzd = zzgfd.zzd(zzicn.zzt(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzgfdVarZzd.zza().zza();
            File fileZza = zzfyb.zza(strZza, "pcam.jar", zzd());
            if (fileZza == null) {
                throw null;
            }
            File file = fileZza;
            if (!fileZza.exists()) {
                fileZza = zzfyb.zza(strZza, "pcam", zzd());
                if (fileZza == null) {
                    throw null;
                }
                File file2 = fileZza;
            }
            File fileZza2 = zzfyb.zza(strZza, "pcbc", zzd());
            if (fileZza2 == null) {
                throw null;
            }
            File file3 = fileZza2;
            if (fileZza.exists() && fileZza2.exists()) {
                return zzgfdVarZzd;
            }
            return null;
        } catch (zzieg unused) {
            this.zze.zzb(15317);
        }
    }
}
