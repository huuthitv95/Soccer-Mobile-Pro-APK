package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcgh extends TextureView implements zzche {
    protected final zzcgv zza;
    protected final zzchf zzb;

    public zzcgh(Context context) {
        super(context);
        this.zza = new zzcgv();
        this.zzb = new zzchf(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public void zzC(int i) {
    }

    public abstract String zza();

    public abstract void zzb(zzcgg zzcggVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i);

    public abstract void zzj(float f, float f2);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public Integer zzw() {
        return null;
    }

    public void zzx(String str, String[] strArr, Integer num) {
        zzc(str);
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
