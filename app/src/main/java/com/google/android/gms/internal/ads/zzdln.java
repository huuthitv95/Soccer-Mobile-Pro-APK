package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdln extends zzcxh {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjq zze;
    private final zzdnc zzf;
    private final zzcyc zzg;
    private final zzfxa zzh;
    private final zzdcs zzi;
    private final zzcew zzj;
    private final zzdyz zzk;
    private boolean zzl;

    zzdln(zzcxg zzcxgVar, Context context, @Nullable zzcki zzckiVar, zzdjq zzdjqVar, zzdnc zzdncVar, zzcyc zzcycVar, zzfxa zzfxaVar, zzdcs zzdcsVar, zzcew zzcewVar, zzdyz zzdyzVar) {
        super(zzcxgVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzckiVar);
        this.zze = zzdjqVar;
        this.zzf = zzdncVar;
        this.zzg = zzcycVar;
        this.zzh = zzfxaVar;
        this.zzi = zzdcsVar;
        this.zzj = zzcewVar;
        this.zzk = zzdyzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcki zzckiVar = (zzcki) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhG)).booleanValue()) {
                if (!this.zzl && zzckiVar != null) {
                    zzhbs zzhbsVar = zzcff.zzf;
                    Objects.requireNonNull(zzckiVar);
                    zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlm
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

    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
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
    public final boolean zza(boolean z, @Nullable Activity activity) {
        Context context;
        zzfjt zzfjtVarZzC;
        zzdjq zzdjqVar = this.zze;
        zzdjqVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnc zzdncVar = this.zzf;
        if (com.google.android.gms.ads.internal.util.zzs.zzR(zzdncVar.zzb())) {
            zzcki zzckiVar = (zzcki) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue()) {
                if (this.zzl) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzflo.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdncVar.zza(z, context, this.zzi);
                    zzdjqVar.zzb();
                    this.zzl = true;
                    return true;
                }
            } else {
                if (this.zzl) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzflo.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdncVar.zza(z, context, this.zzi);
                    zzdjqVar.zzb();
                    this.zzl = true;
                    return true;
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpa)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbo)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzcki zzckiVar2 = (zzcki) this.zzd.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue() || zzckiVar2 == null || (zzfjtVarZzC = zzckiVar2.zzC()) == null || !zzfjtVarZzC.zzar || zzfjtVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                            this.zzi.zzc(zzflo.zzd(10, null, null));
                        }
                        context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdncVar.zza(z, context, this.zzi);
                                zzdjqVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdnb e) {
                                this.zzi.zzd(e);
                            }
                        }
                    } else {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzflo.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            } else {
                zzcki zzckiVar3 = (zzcki) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue()) {
                    if (this.zzl) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzflo.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdncVar.zza(z, context, this.zzi);
                        zzdjqVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                } else {
                    if (this.zzl) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzflo.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdncVar.zza(z, context, this.zzi);
                        zzdjqVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
