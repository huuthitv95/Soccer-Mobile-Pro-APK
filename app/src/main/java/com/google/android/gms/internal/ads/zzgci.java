package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgci {
    private final zzgeo zza;
    private final zzgfp zzb;
    private final zzgop zzc;
    private final zzgpu zzd;
    private final zzgdu zze;
    private final long zzf;
    private final zzimc zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    zzgci(zzgeo zzgeoVar, zzgfp zzgfpVar, zzgop zzgopVar, zzgpu zzgpuVar, zzgdu zzgduVar, zzimc zzimcVar, zzgco zzgcoVar) {
        this.zza = zzgeoVar;
        this.zzb = zzgfpVar;
        this.zzc = zzgopVar;
        this.zzd = zzgpuVar;
        this.zze = zzgduVar;
        this.zzf = zzgcoVar.zzj();
        this.zzg = zzimcVar;
        this.zzh = zzgcoVar.zzi();
        this.zzj = zzgcoVar.zzs();
        this.zzk = zzgcoVar.zzr();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(final Context context) {
        String string;
        boolean z = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        zzgps zzgpsVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgpsVarZza.zza();
                    string = (String) zzhbi.zzj(this.zza.zzb(), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgch
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhbz.zza()).get(z ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    zzgpsVarZza.zzb(e);
                    string = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgpsVarZza.zzb(e);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                if (z) {
                    string = ((zzgir) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    string = Integer.toString(17);
                }
            } catch (Throwable th) {
                zzgpsVarZza.zzb(th);
                throw th;
            }
            zzgpsVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgpsVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0079: IGET (r9 I:com.google.android.gms.internal.ads.zzgdu) = (r2 I:com.google.android.gms.internal.ads.zzgci) com.google.android.gms.internal.ads.zzgci.zze com.google.android.gms.internal.ads.zzgdu, block:B:32:0x0075 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgci] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgci zzgciVar;
        ?? r2;
        String string;
        zzgps zzgpsVarZza = this.zzd.zza(4);
        try {
            try {
                zzgpsVarZza.zza();
                final String str2 = null;
                zzgciVar = this;
                try {
                    string = (String) zzhbi.zzj(this.zza.zzb(), new zzhaq(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgcf
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzhbz.zza()).get(zzgciVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    zzgpsVarZza.zzb(e);
                    string = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    ExecutionException executionException = e;
                    Throwable cause = executionException.getCause();
                    if (cause != null) {
                        executionException = cause;
                    }
                    zzgpsVarZza.zzb(executionException);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgciVar.zzd.zzb(57);
                    string = Integer.toString(17);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    zzgpsVarZza.zzb(th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                zzgpsVarZza.zzc();
                r2.zze.zzb();
                throw th3;
            }
        } catch (InterruptedException e3) {
            e = e3;
            zzgciVar = this;
        } catch (ExecutionException e4) {
            e = e4;
            zzgciVar = this;
        } catch (TimeoutException unused2) {
            zzgciVar = this;
        } catch (Throwable th4) {
            th = th4;
        }
        zzgpsVarZza.zzc();
        zzgciVar.zze.zzb();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0079: IGET (r9 I:com.google.android.gms.internal.ads.zzgdu) = (r2 I:com.google.android.gms.internal.ads.zzgci) com.google.android.gms.internal.ads.zzgci.zze com.google.android.gms.internal.ads.zzgdu, block:B:32:0x0075 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgci] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgci zzgciVar;
        ?? r2;
        String string;
        zzgps zzgpsVarZza = this.zzd.zza(5);
        try {
            try {
                zzgpsVarZza.zza();
                final Activity activity2 = null;
                zzgciVar = this;
                try {
                    string = (String) zzhbi.zzj(this.zza.zzb(), new zzhaq(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgcg
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzhbz.zza()).get(zzgciVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    zzgpsVarZza.zzb(e);
                    string = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    ExecutionException executionException = e;
                    Throwable cause = executionException.getCause();
                    if (cause != null) {
                        executionException = cause;
                    }
                    zzgpsVarZza.zzb(executionException);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgciVar.zzd.zzb(58);
                    string = Integer.toString(17);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    zzgpsVarZza.zzb(th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                zzgpsVarZza.zzc();
                r2.zze.zzb();
                throw th3;
            }
        } catch (InterruptedException e3) {
            e = e3;
            zzgciVar = this;
        } catch (ExecutionException e4) {
            e = e4;
            zzgciVar = this;
        } catch (TimeoutException unused2) {
            zzgciVar = this;
        } catch (Throwable th4) {
            th = th4;
        }
        zzgpsVarZza.zzc();
        zzgciVar.zze.zzb();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ ListenableFuture zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
