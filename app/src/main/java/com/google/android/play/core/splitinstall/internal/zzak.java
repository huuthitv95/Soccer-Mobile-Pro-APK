package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer numZze = zzakVar.zze(list);
        if (numZze == null) {
            return;
        }
        if (numZze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(numZze.intValue());
        }
    }

    static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                Log.i("SplitCompat", "Splits installed.");
                zzfVar.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                zzfVar.zzb(-12);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            zzfVar.zzb(-12);
        }
    }

    private final Integer zze(List list) {
        FileLock fileLockTryLock;
        int i;
        try {
            FileChannel channel = new RandomAccessFile(this.zzb.zzd(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileZze = this.zzb.zze(stringExtra);
                                if ((fileZze.exists() && fileZze.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileZze.exists()) {
                                    if (!this.zzb.zzg(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileZze);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i2 = bufferedInputStream.read(bArr);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i2);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            bufferedInputStream.close();
                                            throw th4;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th5) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th6) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                    }
                                }
                                throw th5;
                            }
                            Log.e("SplitCompat", "Error locking files.", e);
                            return -13;
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            File[] fileArrListFiles = this.zzb.zzb().listFiles();
                            try {
                                if (this.zzc.zzc(fileArrListFiles) && this.zzc.zza(fileArrListFiles)) {
                                    try {
                                        File[] fileArrListFiles2 = this.zzb.zzb().listFiles();
                                        Arrays.sort(fileArrListFiles2);
                                        int length = fileArrListFiles2.length;
                                        while (true) {
                                            length--;
                                            if (length < 0) {
                                                break;
                                            }
                                            com.google.android.play.core.splitcompat.zze.zzm(fileArrListFiles2[length]);
                                            File file = fileArrListFiles2[length];
                                            file.renameTo(this.zzb.zzf(file));
                                        }
                                        Log.i("SplitCompat", "Splits verified.");
                                    } catch (IOException e) {
                                        Log.e("SplitCompat", "Cannot write verified split.", e);
                                        i = -13;
                                    }
                                } else {
                                    Log.e("SplitCompat", "Split verification failed.");
                                    i = -11;
                                }
                            } catch (Exception e2) {
                                Log.e("SplitCompat", "Error verifying splits.", e2);
                            }
                        } catch (IOException e3) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e3);
                        }
                    } catch (Exception e4) {
                        Log.e("SplitCompat", "Error copying splits.", e4);
                    }
                    numValueOf = Integer.valueOf(i);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th7) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                    }
                }
                throw th7;
            }
        } catch (Exception e5) {
            Log.e("SplitCompat", "Error locking files.", e5);
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
