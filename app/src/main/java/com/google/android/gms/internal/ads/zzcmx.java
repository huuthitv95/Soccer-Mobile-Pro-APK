package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcmx implements zzcre {

    @Nullable
    private static zzcmx zza;

    private static synchronized zzcmx zzH(Context context, @Nullable zzbuq zzbuqVar, int i, boolean z, int i2, zzcoh zzcohVar) {
        zzcmx zzcmxVar = zza;
        if (zzcmxVar != null) {
            return zzcmxVar;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        zzbie.zza(context);
        if (((Boolean) zzbjw.zze.zze()).booleanValue()) {
            zzbhp.zza(context);
        }
        zzfli zzfliVarZza = zzfli.zza(context);
        VersionInfoParcel versionInfoParcelZzb = zzfliVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i2);
        zzfliVarZza.zzc(zzbuqVar);
        zzcow zzcowVar = new zzcow(null);
        zzcmy zzcmyVar = new zzcmy();
        zzcmyVar.zza(versionInfoParcelZzb);
        zzcmyVar.zzb(context);
        zzcmyVar.zzc(jCurrentTimeMillis);
        zzcowVar.zza(new zzcmz(zzcmyVar, null));
        zzcowVar.zzb(new zzcpt(zzcohVar));
        zzcmx zzcmxVarZzc = zzcowVar.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zze().zza(zzfno.zzc(), zzcmxVarZzc.zzD(), context);
            com.google.android.gms.ads.internal.zzt.zze().zzb();
        }
        ((zzedp) ((zzcol) zzcmxVarZzc).zzs.zzb()).zza();
        ((zzcmq) ((zzcol) zzcmxVarZzc).zzr.zzb()).zza(context, versionInfoParcelZzb);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, versionInfoParcelZzb, zzcmxVarZzc.zzD());
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
        com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzt.zzg().zza(context);
        com.google.android.gms.ads.internal.zzt.zzA().zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpF)).booleanValue()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpG);
            if (!str.isEmpty()) {
                if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                    zzcmxVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpE)).booleanValue()) {
                zzcmxVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpP)).booleanValue()) {
            ((DeviceTierManager) ((zzcol) zzcmxVarZzc).zzm.zzb()).initialize();
        }
        ((com.google.android.gms.ads.internal.util.zzbz) ((zzcol) zzcmxVarZzc).zzay.zzb()).zza();
        zzcdo.zzb(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbj)).booleanValue()) {
                new zzeji(context, versionInfoParcelZzb, new zzbhd(new zzbhi(context)), new zzein(new zzeij(context), (zzhbs) ((zzcol) zzcmxVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpy)).booleanValue()) {
            zzcmxVarZzc.zzg().zza();
        }
        zza = zzcmxVarZzc;
        return zzcmxVarZzc;
    }

    public static zzcmx zza(Context context, @Nullable zzbuq zzbuqVar, int i) {
        return zzH(context, zzbuqVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcoh());
    }

    public abstract zzeaq zzA();

    public abstract zzflc zzB();

    public abstract zzedc zzC();

    public abstract zzdyz zzD();

    abstract zzdwi zzE();

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzceh zzF() {
        return zzG();
    }

    public abstract zzceh zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdfg zzd();

    public abstract zzcqf zze();

    public abstract zzfsn zzf();

    public abstract zzegu zzg();

    public abstract zzegw zzh();

    public abstract zzcwd zzi();

    public abstract zzfgi zzj();

    public abstract zzcum zzk();

    public abstract zzfeu zzl();

    public abstract zzdmt zzm();

    public abstract zzfhy zzn();

    public abstract zzdnp zzo();

    public abstract zzdve zzp();

    public abstract zzfjm zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt();

    public abstract zzekf zzu();

    public abstract zzfll zzv();

    public abstract zzecf zzw();

    public abstract zzfpv zzx();

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzfda zzy(zzcar zzcarVar, int i) {
        return zzz(new zzfed(zzcarVar, i));
    }

    protected abstract zzfda zzz(zzfed zzfedVar);
}
