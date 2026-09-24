package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdva extends zzcxh {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdnc zze;
    private final zzdjq zzf;
    private final zzdcs zzg;
    private final zzddz zzh;
    private final zzcyc zzi;
    private final zzcbt zzj;
    private final zzfxa zzk;
    private final zzfkg zzl;
    private final zzdyz zzm;
    private boolean zzn;

    zzdva(zzcxg zzcxgVar, Context context, zzcki zzckiVar, zzdnc zzdncVar, zzdjq zzdjqVar, zzdcs zzdcsVar, zzddz zzddzVar, zzcyc zzcycVar, zzfjt zzfjtVar, zzfxa zzfxaVar, zzfkg zzfkgVar, zzdyz zzdyzVar) {
        super(zzcxgVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdncVar;
        this.zzd = new WeakReference(zzckiVar);
        this.zzf = zzdjqVar;
        this.zzg = zzdcsVar;
        this.zzh = zzddzVar;
        this.zzi = zzcycVar;
        this.zzk = zzfxaVar;
        zzcbp zzcbpVar = zzfjtVar.zzl;
        this.zzj = new zzccn(zzcbpVar != null ? zzcbpVar.zza : "", zzcbpVar != null ? zzcbpVar.zzb : 1);
        this.zzl = zzfkgVar;
        this.zzm = zzdyzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcki zzckiVar = (zzcki) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhG)).booleanValue()) {
                if (!this.zzn && zzckiVar != null) {
                    zzhbs zzhbsVar = zzcff.zzf;
                    Objects.requireNonNull(zzckiVar);
                    zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzckiVar.destroy();
                        }
                    });
                }
            } else if (zzckiVar != null) {
                zzckiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z, Activity activity) {
        Context context;
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnc zzdncVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdncVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpa)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbo)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzflo.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdjq zzdjqVar = this.zzf;
        zzdjqVar.zza();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            zzdncVar.zza(z, context, this.zzg);
            zzdjqVar.zzb();
            return true;
        } catch (zzdnb e) {
            this.zzg.zzd(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzcbt zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcki zzckiVar = (zzcki) this.zzd.get();
        return (zzckiVar == null || zzckiVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfkg zzh() {
        return this.zzl;
    }
}
