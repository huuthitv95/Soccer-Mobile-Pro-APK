package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzwb implements zzxe {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzxm zzc = new zzxm();
    private final zzua zzd = new zzua();
    private Looper zze;
    private zzbf zzf;
    private zzpz zzg;

    @Override // com.google.android.gms.internal.ads.zzxe
    public /* synthetic */ void zzA(zzak zzakVar) {
        zzxe.CC.$default$zzA(this, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public /* synthetic */ zzbf zzH() {
        return zzxe.CC.$default$zzH(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public /* synthetic */ boolean zzI() {
        return zzxe.CC.$default$zzI(this);
    }

    protected void zzM() {
    }

    protected abstract void zza(zzih zzihVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    protected final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxd) arrayList.get(i)).zza(this, zzbfVar);
        }
    }

    protected final zzxm zzf(zzxc zzxcVar) {
        return this.zzc.zza(0, zzxcVar);
    }

    protected final zzxm zzg(int i, zzxc zzxcVar) {
        return this.zzc.zza(0, zzxcVar);
    }

    protected final zzua zzh(zzxc zzxcVar) {
        return this.zzd.zza(0, zzxcVar);
    }

    protected final zzua zzi(int i, zzxc zzxcVar) {
        return this.zzd.zza(0, zzxcVar);
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzl(Handler handler, zzxn zzxnVar) {
        this.zzc.zzb(handler, zzxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzm(zzxn zzxnVar) {
        this.zzc.zzc(zzxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzn(Handler handler, zzub zzubVar) {
        this.zzd.zzb(handler, zzubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzo(zzub zzubVar) {
        this.zzd.zzc(zzubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzp(zzxd zzxdVar, zzih zzihVar, zzpz zzpzVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzgsw.zza(z);
        this.zzg = zzpzVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzxdVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzxdVar);
            zza(zzihVar);
        } else if (zzbfVar != null) {
            zzq(zzxdVar);
            zzxdVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzq(zzxd zzxdVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzxdVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzr(zzxd zzxdVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzxdVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzs(zzxd zzxdVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzxdVar);
        if (!arrayList.isEmpty()) {
            zzr(zzxdVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }

    protected final zzpz zzk() {
        zzpz zzpzVar = this.zzg;
        zzpzVar.getClass();
        return zzpzVar;
    }
}
