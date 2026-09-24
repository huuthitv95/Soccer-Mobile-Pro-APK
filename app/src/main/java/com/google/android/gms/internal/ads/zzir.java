package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzir implements zzmu, zzmw {
    private final int zzb;
    private zzmx zzd;
    private int zze;
    private zzpz zzf;
    private zzdo zzg;
    private int zzh;
    private zzyu zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzxc zzq;
    private zzmv zzr;
    private final Object zza = new Object();
    private final zzlq zzc = new zzlq();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    public zzir(int i) {
        this.zzb = i;
    }

    private final void zzae(long j, boolean z, boolean z2) throws zzje {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z2) {
            z2 = zzR(j) != 0;
        }
        zzA(j, z, z2);
    }

    protected void zzA(long j, boolean z, boolean z2) throws zzje {
        throw null;
    }

    protected void zzB() throws zzje {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected void zzG(zzbf zzbfVar) {
    }

    protected final long zzH() {
        return this.zzl;
    }

    protected final zzlq zzI() {
        zzlq zzlqVar = this.zzc;
        zzlqVar.zza = null;
        zzlqVar.zzb = null;
        return zzlqVar;
    }

    protected final zzbf zzN() {
        return this.zzp;
    }

    protected final zzxc zzO() {
        return this.zzq;
    }

    protected final zzje zzP(Throwable th, zzv zzvVar, boolean z, int i) {
        int iZzad = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzad = zzad(zzvVar) & 7;
            } catch (zzje unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzje.zzb(th, zzU(), this.zze, zzvVar, iZzad, this.zzq, z, i);
    }

    protected final int zzQ(zzlq zzlqVar, zzip zzipVar, int i) {
        zzyu zzyuVar = this.zzi;
        zzyuVar.getClass();
        int iZzd = zzyuVar.zzd(zzlqVar, zzipVar, i);
        if (iZzd == -4) {
            if (zzipVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzipVar.zze + this.zzk;
            zzipVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
            return iZzd;
        }
        if (iZzd == -5) {
            zzv zzvVar = zzlqVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzu;
            if (j2 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(j2 + this.zzk);
                zzlqVar.zzb = zztVarZza.zzO();
                return -5;
            }
        }
        return iZzd;
    }

    protected final void zzT() {
        zzmv zzmvVar;
        synchronized (this.zza) {
            zzmvVar = this.zzr;
        }
        if (zzmvVar != null) {
            zzmvVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public /* synthetic */ long zzV(long j, long j2) {
        return zzmu.CC.$default$zzV(this, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public /* synthetic */ boolean zzW(long j) {
        return zzmu.CC.$default$zzW(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public /* synthetic */ void zzX(float f, float f2) throws zzje {
        zzmu.CC.$default$zzX(this, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public /* synthetic */ void zzY() {
        zzmu.CC.$default$zzY(this);
    }

    @Override // com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzmw
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final zzmw zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzc(int i, zzpz zzpzVar, zzdo zzdoVar) {
        this.zze = i;
        this.zzf = zzpzVar;
        this.zzg = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzcT() throws zzje {
        zzgsw.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzcU(zzv[] zzvVarArr, zzyu zzyuVar, long j, long j2, zzxc zzxcVar) throws zzje {
        zzgsw.zzi(!this.zzn);
        this.zzi = zzyuVar;
        this.zzq = zzxcVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final zzyu zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public zzlv zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzf(zzmx zzmxVar, zzv[] zzvVarArr, zzyu zzyuVar, long j, boolean z, boolean z2, long j2, long j3, zzxc zzxcVar) throws zzje {
        zzgsw.zzi(this.zzh == 0);
        this.zzd = zzmxVar;
        this.zzq = zzxcVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcU(zzvVarArr, zzyuVar, j2, j3, zzxcVar);
        zzae(j2, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzG(zzbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzp(long j, boolean z) throws zzje {
        zzae(j, false, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzq() {
        zzgsw.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzr() {
        zzgsw.zzi(this.zzh == 1);
        zzlq zzlqVar = this.zzc;
        zzlqVar.zza = null;
        zzlqVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzs() {
        zzgsw.zzi(this.zzh == 0);
        zzlq zzlqVar = this.zzc;
        zzlqVar.zza = null;
        zzlqVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzt() {
        zzgsw.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public int zzu() throws zzje {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzv(zzmv zzmvVar) {
        synchronized (this.zza) {
            this.zzr = zzmvVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public void zzx(int i, Object obj) throws zzje {
    }

    protected void zzy(boolean z, boolean z2) throws zzje {
    }

    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzxc zzxcVar) throws zzje {
    }

    protected final zzv[] zzJ() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final zzmx zzK() {
        zzmx zzmxVar = this.zzd;
        zzmxVar.getClass();
        return zzmxVar;
    }

    protected final zzpz zzL() {
        zzpz zzpzVar = this.zzf;
        zzpzVar.getClass();
        return zzpzVar;
    }

    protected final zzdo zzM() {
        zzdo zzdoVar = this.zzg;
        zzdoVar.getClass();
        return zzdoVar;
    }

    protected final int zzR(long j) {
        zzyu zzyuVar = this.zzi;
        zzyuVar.getClass();
        return zzyuVar.zze(j - this.zzk);
    }

    protected final boolean zzS() {
        if (zzcW()) {
            return this.zzn;
        }
        zzyu zzyuVar = this.zzi;
        zzyuVar.getClass();
        return zzyuVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzn() throws IOException {
        zzyu zzyuVar = this.zzi;
        zzyuVar.getClass();
        zzyuVar.zzc();
    }
}
