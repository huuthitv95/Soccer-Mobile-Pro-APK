package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxg {
    private final Context zza;
    private final Executor zzb;
    private final zzfwq zzc;
    private final zzfxf zzd;
    private Task zze;

    zzfxg(Context context, Executor executor, zzfwq zzfwqVar, zzfws zzfwsVar, zzfxc zzfxcVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfwqVar;
        this.zzd = zzfxcVar;
    }

    public static zzfxg zza(Context context, Executor executor, zzfwq zzfwqVar, zzfws zzfwsVar) {
        final zzfxg zzfxgVar = new zzfxg(context, executor, zzfwqVar, zzfwsVar, new zzfxc());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfxe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        };
        Executor executor2 = zzfxgVar.zzb;
        zzfxgVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfxd
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
        return zzfxgVar;
    }

    public final zzayf zzb() {
        zzfxf zzfxfVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfxfVar.zza() : (zzayf) task.getResult();
    }

    final /* synthetic */ zzayf zzc() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return zzfwx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
