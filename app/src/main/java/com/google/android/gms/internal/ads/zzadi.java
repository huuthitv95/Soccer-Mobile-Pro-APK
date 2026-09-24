package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadi implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaem zze;
    private final zzdo zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadn zzi;
    private zzfg zzj = new zzfg(10);
    private zzv zzk;
    private zzdy zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzaem zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfk.zza(sparseArray, 0)) {
            return (zzaem) sparseArray.get(0);
        }
        zzadc zzadcVar = new zzadc(this, this.zza, 0);
        this.zzg.add(zzadcVar);
        sparseArray.put(0, zzadcVar);
        return zzadcVar;
    }

    public final void zzc(Surface surface, zzet zzetVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzet) this.zzm.second).equals(zzetVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzetVar);
        zzetVar.zza();
        zzetVar.zzb();
    }

    public final void zzd() {
        zzet zzetVar = zzet.zza;
        zzetVar.zza();
        zzetVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdy zzdyVar = this.zzl;
        if (zzdyVar != null) {
            zzdyVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: zzdv -> 0x0096, TRY_LEAVE, TryCatch #0 {zzdv -> 0x0096, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0024, B:16:0x0032, B:18:0x0038, B:21:0x003f, B:26:0x0060), top: B:36:0x0012 }] */
    final /* synthetic */ boolean zzi(zzv zzvVar, int i) throws zzael {
        zzgsw.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzF);
        try {
            int i2 = zziVarZzC.zzd;
            if (i2 != 7) {
                if (zzdw.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzfk.zza;
                    zzef.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zziVarZzC = zzi.zza;
                } else if (i2 != 2 || i2 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdw.zzd()) {
                i2 = 7;
                if (zzdw.zzc(i2)) {
                    if (i2 != 2) {
                        zziVarZzC = zzi.zza;
                    } else {
                        zziVarZzC = zzi.zza;
                    }
                } else if (i2 != 2) {
                    zziVarZzC = zzi.zza;
                } else {
                    zziVarZzC = zzi.zza;
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdo zzdoVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            this.zzl = zzdoVar.zzd(looperMyLooper, null);
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                final zzdy zzdyVar = this.zzl;
                Objects.requireNonNull(zzdyVar);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadb
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdyVar.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e) {
                throw new zzael(e, zzvVar);
            }
        } catch (zzdv e2) {
            throw new zzael(e2, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) throws zzael {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzaem zzaemVar = this.zze;
            zzaemVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzadh zzadhVar = (zzadh) this.zzj.zzd();
                zzadhVar.getClass();
                zzaemVar.zzs(1, this.zzk, zzadhVar.zza, zzadhVar.zzb, zzgvz.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzdy zzdyVar = this.zzl;
            zzdyVar.getClass();
            zzdyVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzadj zzadjVar) {
        this.zze.zzl(zzadjVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzadn zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzfg zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzfg zzfgVar) {
        this.zzj = zzfgVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* synthetic */ zzadi(zzada zzadaVar, byte[] bArr) {
        this.zza = zzadaVar.zze();
        zzbs zzbsVarZzg = zzadaVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgvz.zzi();
        this.zzd = zzadaVar.zzh();
        zzdo zzdoVarZzi = zzadaVar.zzi();
        this.zzf = zzdoVarZzi;
        this.zzh = -zzadaVar.zzj();
        zzadn zzadnVarZzk = zzadaVar.zzk();
        this.zzi = zzadnVarZzk;
        this.zze = new zzacn(zzadaVar.zzf(), zzadnVarZzk, zzdoVarZzi);
        new zzacz(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzO();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }
}
