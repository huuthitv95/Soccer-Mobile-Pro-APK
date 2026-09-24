package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemp implements zzelm {
    private final Context zza;
    private final zzcwe zzb;
    private View zzc;
    private zzbuz zzd;

    public zzemp(Context context, zzcwe zzcweVar) {
        this.zza = context;
        this.zzb = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza(zzfke zzfkeVar, zzfjt zzfjtVar, zzelj zzeljVar) throws zzfkt {
        try {
            zzbwp zzbwpVar = (zzbwp) zzeljVar.zzb;
            zzbwpVar.zzo(zzfjtVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) {
                String str = zzfjtVar.zzU;
                String string = zzfjtVar.zzv.toString();
                zzfkm zzfkmVar = zzfkeVar.zza.zza;
                zzbwpVar.zzq(str, string, zzfkmVar.zzd, ObjectWrapper.wrap(this.zza), new zzemo(this, zzeljVar, null), (zzbuw) zzeljVar.zzc, zzfkmVar.zzf);
                return;
            }
            String str2 = zzfjtVar.zzU;
            String string2 = zzfjtVar.zzv.toString();
            zzfkm zzfkmVar2 = zzfkeVar.zza.zza;
            zzbwpVar.zzi(str2, string2, zzfkmVar2.zzd, ObjectWrapper.wrap(this.zza), new zzemo(this, zzeljVar, null), (zzbuw) zzeljVar.zzc, zzfkmVar2.zzf);
        } catch (RemoteException e) {
            throw new zzfkt(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ Object zzb(zzfke zzfkeVar, final zzfjt zzfjtVar, final zzelj zzeljVar) throws zzfkt, zzeov {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziZ)).booleanValue() && zzfjtVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfkt(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzemm
                            @Override // com.google.android.gms.internal.ads.zzhaq
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfjtVar, obj);
                            }
                        }, zzcff.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfkt(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfkt(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcva zzcvaVarZzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, zzeljVar.zza), new zzcvg(view, null, new zzcxf() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() throws zzfkt {
                try {
                    return ((zzbwp) zzeljVar.zzb).zzh();
                } catch (RemoteException e3) {
                    throw new zzfkt(e3);
                }
            }
        }, (zzfju) zzfjtVar.zzu.get(0)));
        zzcvaVarZzf.zzk().zza(view);
        ((zzemv) zzeljVar.zzc).zzc(zzcvaVarZzf.zzg());
        return zzcvaVarZzf.zzi();
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfjt zzfjtVar, Object obj) {
        return zzhbi.zza(zzcwt.zza(this.zza, view, zzfjtVar));
    }

    final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    final /* synthetic */ void zze(zzbuz zzbuzVar) {
        this.zzd = zzbuzVar;
    }
}
