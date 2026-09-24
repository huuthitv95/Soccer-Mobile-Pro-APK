package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzff implements zzdy {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzff(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzo(zzfe zzfeVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzfeVar);
            }
        }
    }

    private static zzfe zzp() {
        zzfe zzfeVar;
        List list = zza;
        synchronized (list) {
            zzfeVar = list.isEmpty() ? new zzfe(null) : (zzfe) list.remove(list.size() - 1);
        }
        return zzfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzb(int i) {
        return this.zzb.hasMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzc(int i) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzd(int i, Object obj) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i, obj), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zze(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzf(int i, int i2, int i3, Object obj) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzg(zzdx zzdxVar) {
        return ((zzfe) zzdxVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzi(int i, int i2) {
        return this.zzb.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzl(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzn(Runnable runnable, long j) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
