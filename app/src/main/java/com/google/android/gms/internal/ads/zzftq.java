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
public final class zzftq extends zzftl {
    public zzftq(ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock) {
        super(clientApi, context, i, zzfliVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final ListenableFuture zza(Context context) {
        zzbuq zzbuqVarZzd = this.zzd.zzd();
        if (zzbuqVarZzd == null) {
            return zzhbi.zzc(new zzfsa(1, "Failed to create a rewarded ad."));
        }
        zzfjk zzfjkVar = (zzfjk) this.zza.zzl(ObjectWrapper.wrap(context), this.zze.zza, zzbuqVarZzd, this.zzc);
        if (zzfjkVar == null) {
            return zzhbi.zzc(new zzfsa(1, "Failed to create a rewarded ad."));
        }
        zzhcb zzhcbVarZze = zzhcb.zze();
        try {
            zzx(this.zze.zzc);
            zzfrz zzfrzVar = this.zzf;
            if (zzfrzVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzU)).booleanValue()) {
                    zzfjkVar.zzu(new zzfsk(zzfrzVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzW)).longValue()));
                }
            }
            zzfjkVar.zzc(this.zze.zzc, new zzftp(zzfjkVar, new zzfta(this, zzhcbVarZze), this.zze.zza));
            return zzhcbVarZze;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
            return zzhbi.zzc(new zzfsa(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzS)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((zzcbw) obj).zzm();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzftq(String str, ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock, zzfrz zzfrzVar) {
        super(str, clientApi, context, i, zzfliVar, zzfpVar, zzceVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock, zzfrzVar);
    }
}
