package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzg {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgyv zzgyvVar = new zzgyv();
        file.getClass();
        zzgwj zzgwjVarZzq = zzgwj.zzq(new zzgzd[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamZza = zzgze.zza(file, zzgwjVarZzq, zzgyvVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzf zzgzfVar = new zzgzf(file, null);
        zzgyv zzgyvVar = new zzgyv();
        zzgwj zzgwjVarZzq = zzgwj.zzq(new zzgzd[0]);
        zzgzc zzgzcVarZza = zzgzc.zza();
        try {
            InputStream inputStreamZza = zzgzfVar.zza();
            zzgzcVarZza.zzb(inputStreamZza);
            InputStream inputStream = inputStreamZza;
            FileOutputStream fileOutputStreamZza = zzgze.zza(file2, zzgwjVarZzq, zzgyvVar);
            zzgzcVarZza.zzb(fileOutputStreamZza);
            FileOutputStream fileOutputStream = fileOutputStreamZza;
            int i = zzgyz.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = inputStreamZza.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i2);
                }
            }
            zzgzcVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zzgzcVarZza.zzc(th);
            } catch (Throwable th2) {
                zzgzcVarZza.close();
                throw th2;
            }
        }
    }
}
