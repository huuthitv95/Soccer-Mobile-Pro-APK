package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyh {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfxo zzd;
    private boolean zze;

    public zzfyh(Context context, zzbdh zzbdhVar, zzfxo zzfxoVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbdhVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfxoVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String str = this.zzc;
        String.valueOf(str);
        return "FBAMTD".concat(String.valueOf(str));
    }

    private final String zzg() {
        String str = this.zzc;
        String.valueOf(str);
        return "LATMTD".concat(String.valueOf(str));
    }

    private static String zzh(zzbdj zzbdjVar) {
        zzbdo zzbdoVarZzi = zzbdp.zzi();
        zzbdoVarZzi.zza(zzbdjVar.zza().zza());
        zzbdoVarZzi.zzb(zzbdjVar.zza().zzb());
        zzbdoVarZzi.zzd(zzbdjVar.zza().zzd());
        zzbdoVarZzi.zze(zzbdjVar.zza().zze());
        zzbdoVarZzi.zzc(zzbdjVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbdp) zzbdoVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    private final zzbdp zzk(int i) {
        String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzicn zzicnVar = zzicn.zza;
            return zzbdp.zzh(zzicn.zzt(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zzidb.zza() : zzidb.zzb());
        } catch (zzieg unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzbdj zzbdjVar, zzfyg zzfygVar) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbdp zzbdpVarZzk = zzk(1);
            String strZza = zzbdjVar.zza().zza();
            if (zzbdpVarZzk != null && zzbdpVarZzk.zza().equals(strZza)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZza);
            if (fileZze.exists()) {
                String str = true != fileZze.isDirectory() ? "0" : "1";
                String str2 = true != fileZze.isFile() ? "0" : "1";
                z = false;
                StringBuilder sb = new StringBuilder(7);
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, jCurrentTimeMillis2, sb.toString());
                zzi(4015, jCurrentTimeMillis2);
            } else {
                z = false;
                if (!fileZze.mkdirs()) {
                    zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                    return false;
                }
            }
            File fileZze2 = zze(strZza);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfyb.zzb(file, zzbdjVar.zzb().zzA())) {
                zzi(4016, jCurrentTimeMillis);
                return z;
            }
            if (!zzfyb.zzb(file2, zzbdjVar.zzc().zzA())) {
                zzi(4017, jCurrentTimeMillis);
                return z;
            }
            if (zzfygVar != null && !zzfygVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfyb.zze(fileZze2);
                return z;
            }
            String strZzh = zzh(zzbdjVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.zzb;
            String string = sharedPreferences.getString(zzg(), null);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(zzg(), strZzh);
            if (string != null) {
                editorEdit.putString(zzf(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return z;
            }
            HashSet hashSet = new HashSet();
            zzbdp zzbdpVarZzk2 = zzk(1);
            if (zzbdpVarZzk2 != null) {
                hashSet.add(zzbdpVarZzk2.zza());
            }
            zzbdp zzbdpVarZzk3 = zzk(2);
            if (zzbdpVarZzk3 != null) {
                hashSet.add(zzbdpVarZzk3.zza());
            }
            boolean z2 = z;
            File[] fileArrListFiles = new File(this.zza.getDir("pccache", z2 ? 1 : 0), this.zzc).listFiles();
            int length = fileArrListFiles.length;
            for (int i = z2 ? 1 : 0; i < length; i++) {
                File file3 = fileArrListFiles[i];
                if (!hashSet.contains(file3.getName())) {
                    zzfyb.zze(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(zzbdj zzbdjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfyb.zzb(new File(zze(zzbdjVar.zza().zza()), "pcbc"), zzbdjVar.zzc().zzA())) {
                zzi(4020, jCurrentTimeMillis);
                return false;
            }
            String strZzh = zzh(zzbdjVar);
            SharedPreferences.Editor editorEdit = this.zzb.edit();
            editorEdit.putString(zzg(), strZzh);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final zzfxz zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbdp zzbdpVarZzk = zzk(1);
            if (zzbdpVarZzk == null) {
                zzi(4022, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzbdpVarZzk.zza());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfxz(zzbdpVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbdp zzbdpVarZzk = zzk(1);
            if (zzbdpVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzbdpVarZzk.zza());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
