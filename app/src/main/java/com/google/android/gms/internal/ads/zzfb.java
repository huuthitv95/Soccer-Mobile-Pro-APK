package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfb {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzev zzc;
    private final zzbd zzd = new zzbd();
    private final zzdy zze;
    private final zzew zzf;
    private final zzey zzg;
    private final zzez zzh;
    private final zzfa zzi;

    public zzfb(zzbb zzbbVar, zzev zzevVar, zzdo zzdoVar, int i, int i2, int i3, int i4) {
        this.zza = zzbbVar;
        this.zzc = zzevVar;
        this.zze = zzdoVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzex
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.zza.zzb(message);
            }
        });
        this.zzf = new zzew(this, i);
        this.zzg = new zzey(this, i2);
        this.zzh = new zzez(this, i3);
        this.zzi = new zzfa(this, i4);
        zzeu zzeuVar = new zzeu(this);
        this.zzb = zzeuVar;
        zzbbVar.zze(zzeuVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    final /* synthetic */ boolean zzb(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zzf.zza();
            return true;
        }
        if (i == 2) {
            this.zzg.zza();
            return true;
        }
        if (i == 3) {
            this.zzh.zza();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    final /* synthetic */ zzev zze() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzdy zzg() {
        return this.zze;
    }
}
