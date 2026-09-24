package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzctj implements zzdcf, zzddt, zzdcz, com.google.android.gms.ads.internal.client.zza, zzdcv, zzdkd, zzdfa {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfke zze;
    private final zzfjt zzf;
    private final zzfrk zzg;
    private final zzfkz zzh;
    private final zzbai zzi;
    private final zzbjl zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzdbi zzm;
    private final zzdeu zzn;
    private final zzdbb zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzces zzs = null;

    zzctj(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfke zzfkeVar, zzfjt zzfjtVar, zzfrk zzfrkVar, zzfkz zzfkzVar, View view, zzcki zzckiVar, zzbai zzbaiVar, zzbjl zzbjlVar, zzbjn zzbjnVar, zzfps zzfpsVar, zzdbi zzdbiVar, zzdeu zzdeuVar, zzdbb zzdbbVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfkeVar;
        this.zzf = zzfjtVar;
        this.zzg = zzfrkVar;
        this.zzh = zzfkzVar;
        this.zzi = zzbaiVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzckiVar);
        this.zzj = zzbjlVar;
        this.zzm = zzdbiVar;
        this.zzn = zzdeuVar;
        this.zzo = zzdbbVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzu = com.google.android.gms.ads.internal.util.zzs.zzu(context);
                if (numZzu != null) {
                    int iMin = Math.min(numZzu.intValue(), 20);
                    Integer numValueOf = Integer.valueOf(iMin);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        Uri.Builder builderBuildUpon = Uri.parse((String) it.next()).buildUpon();
                        numValueOf.getClass();
                        arrayList.add(builderBuildUpon.appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i;
        zzfjt zzfjtVar = this.zzf;
        List list = zzfjtVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpi)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzet)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbe)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbkd.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfjtVar, false, strZzj, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbkd.zzg.zze()).booleanValue() && ((i = zzfjtVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzhbi.zzr((zzhba) zzhbi.zzi(zzhba.zzw(zzhbi.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbH)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctd(this, strZzj), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbe)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbkd.zzd.zze()).booleanValue()) {
            zzhbi.zzr((zzhba) zzhbi.zzg(zzhba.zzw(this.zzj.zzb()), Throwable.class, zzcti.zza, zzcff.zzh), new zzctc(this), this.zzb);
            return;
        }
        zzfkz zzfkzVar = this.zzh;
        zzfrk zzfrkVar = this.zzg;
        zzfke zzfkeVar = this.zze;
        zzfjt zzfjtVar = this.zzf;
        zzfkzVar.zzb(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
        zzfrk zzfrkVar = this.zzg;
        zzfkz zzfkzVar = this.zzh;
        zzfjt zzfjtVar = this.zzf;
        zzfkzVar.zza(zzfrkVar.zzc(zzfjtVar, zzfjtVar.zzh, zzcbdVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeC)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeD)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeB)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcte
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
        zzfrk zzfrkVar = this.zzg;
        zzfke zzfkeVar = this.zze;
        zzfkz zzfkzVar = this.zzh;
        zzfjt zzfjtVar = this.zzf;
        zzfkzVar.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
        zzfrk zzfrkVar = this.zzg;
        zzfke zzfkeVar = this.zze;
        zzfkz zzfkzVar = this.zzh;
        zzfjt zzfjtVar = this.zzf;
        zzfkzVar.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzg() {
        zzdbi zzdbiVar;
        if (this.zzq) {
            ArrayList arrayList = new ArrayList(zzp());
            zzfjt zzfjtVar = this.zzf;
            arrayList.addAll(zzfjtVar.zzf);
            this.zzh.zza(this.zzg.zzb(this.zze, zzfjtVar, true, null, null, arrayList, null, null), null);
        } else {
            zzfkz zzfkzVar = this.zzh;
            zzfrk zzfrkVar = this.zzg;
            zzfke zzfkeVar = this.zze;
            zzfjt zzfjtVar2 = this.zzf;
            zzfkzVar.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar2, zzfjtVar2.zzm), null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzey)).booleanValue() && (zzdbiVar = this.zzm) != null) {
                List list = zzdbiVar.zzb().zzm;
                String strZzg = zzdbiVar.zzc().zzg();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(zzfrk.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                }
                long jZzh = zzdbiVar.zzc().zzh();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(zzfrk.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                }
                zzfkzVar.zza(zzfrkVar.zza(zzdbiVar.zza(), zzdbiVar.zzb(), arrayList3), null);
            }
            zzfkzVar.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar2, zzfjtVar2.zzf), null);
        }
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzi() {
        zzfrk zzfrkVar = this.zzg;
        zzfke zzfkeVar = this.zze;
        zzfkz zzfkzVar = this.zzh;
        zzfjt zzfjtVar = this.zzf;
        zzfkzVar.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcg)).booleanValue()) {
            int i = zzeVar.zza;
            zzfjt zzfjtVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfjtVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfrk.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfjtVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfa
    public final void zzk() {
        zzfjt zzfjtVar = this.zzf;
        if (zzfjtVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfjtVar, zzfjtVar.zzaA), null);
        }
    }

    final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    final /* synthetic */ void zzm(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i, i2);
            }
        });
    }

    final /* synthetic */ void zzn(int i, int i2) {
        zzy(i - 1, i2);
    }

    final /* synthetic */ Context zzq() {
        return this.zza;
    }

    final /* synthetic */ zzfke zzr() {
        return this.zze;
    }

    final /* synthetic */ zzfjt zzs() {
        return this.zzf;
    }

    final /* synthetic */ zzfrk zzt() {
        return this.zzg;
    }

    final /* synthetic */ zzfkz zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzdeu zzv() {
        return this.zzn;
    }

    final /* synthetic */ zzdbb zzw() {
        return this.zzo;
    }

    final /* synthetic */ zzces zzx() {
        return this.zzs;
    }
}
