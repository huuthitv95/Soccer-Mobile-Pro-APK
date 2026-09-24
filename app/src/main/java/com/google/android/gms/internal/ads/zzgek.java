package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgek extends zzgec {
    private final ExecutorService zzb;
    private final zzgej zzc;
    private final zzgsn zzd;

    public zzgek(File file, ExecutorService executorService, zzgej zzgejVar, zzgsn zzgsnVar) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgejVar;
        this.zzd = zzgsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final ListenableFuture zzb() {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgeh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final ListenableFuture zzc(final Object obj) {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgeg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object objApply;
        Object objZzb;
        synchronized (this) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.zza);
                try {
                    objZzb = this.zzc.zzb(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (zzgef e) {
                objApply = this.zzd.apply(e);
                return objApply;
            } catch (FileNotFoundException unused) {
                objApply = this.zzc.zzc();
                return objApply;
            } catch (IOException e2) {
                objApply = this.zzd.apply(new zzgef(e2));
                return objApply;
            }
        }
        return objZzb;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgzg.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                file2.delete();
                throw e;
            }
        }
        return null;
    }
}
