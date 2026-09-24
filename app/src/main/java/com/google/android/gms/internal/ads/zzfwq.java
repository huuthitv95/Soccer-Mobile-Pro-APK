package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzfwq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfwq(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfwq zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfwq.zza;
                    taskCompletionSource.setResult(zzfym.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfwq.zza;
                    taskCompletionSource.setResult(zzfym.zzc());
                }
            });
        }
        return new zzfwq(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfwp.zza);
        }
        Context context = this.zzb;
        final zzawl zzawlVarZza = zzawp.zza();
        zzawlVarZza.zza(context.getPackageName());
        zzawlVarZza.zzb(j);
        zzawlVarZza.zzg(zzf);
        if (exc != null) {
            int i2 = zzgtt.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzawlVarZza.zzc(stringWriter.toString());
            zzawlVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzawlVarZza.zze(str2);
        }
        if (str != null) {
            zzawlVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfwn
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i3 = zzfwq.zza;
                if (!task.isSuccessful()) {
                    return false;
                }
                int i4 = i;
                zzfyl zzfylVarZza = ((zzfym) task.getResult()).zza(((zzawp) zzawlVarZza.zzbu()).zzaN());
                zzfylVarZza.zzc(i4);
                zzfylVarZza.zza();
                return true;
            }
        });
    }

    public Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public Task zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
