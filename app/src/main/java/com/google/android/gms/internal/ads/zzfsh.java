package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsh extends zzftl {
    public zzfsh(ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock) {
        super(clientApi, context, i, zzfliVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final ListenableFuture zza(Context context) {
        zzbuq zzbuqVarZzd = this.zzd.zzd();
        if (zzbuqVarZzd == null) {
            return zzhbi.zzc(new zzfsa(1, "Failed to create an app open ad manager."));
        }
        zzfga zzfgaVar = (zzfga) this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), this.zze.zza, zzbuqVarZzd, this.zzc);
        if (zzfgaVar == null) {
            return zzhbi.zzc(new zzfsa(1, "Failed to create an app open ad manager."));
        }
        zzhcb zzhcbVarZze = zzhcb.zze();
        try {
            zzx(this.zze.zzc);
            zzfrz zzfrzVar = this.zzf;
            if (zzfrzVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzU)).booleanValue()) {
                    zzfgaVar.zzL(new zzfsk(zzfrzVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzX)).longValue()));
                }
            }
            zzfgaVar.zzJ(new zzfsg(new zzfta(this, zzhcbVarZze), this.zze.zza));
            zzfgaVar.zze(this.zze.zzc);
            return zzhcbVarZze;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e);
            return zzhbi.zzc(new zzfsa(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzT)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((zzbfx) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    public zzfsh(String str, ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock, zzfrz zzfrzVar) {
        super(str, clientApi, context, i, zzfliVar, zzfpVar, zzceVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock, zzfrzVar);
    }
}
