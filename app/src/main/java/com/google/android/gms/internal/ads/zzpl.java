package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpl implements zzng {
    private final zzdo zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzpk zzd;
    private final SparseArray zze;
    private zzee zzf;
    private zzbb zzg;
    private zzdy zzh;
    private boolean zzi;

    private final zznh zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zznh zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zznh zzag(int i, zzxc zzxcVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzxcVar != null) {
            return this.zzd.zze(zzxcVar) != null ? zzad(zzxcVar) : zzaa(zzbf.zza, i, zzxcVar);
        }
        zzbf zzbfVarZzq = zzbbVar.zzq();
        if (i >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, i, null);
    }

    private final zznh zzah(zzau zzauVar) {
        zzxc zzxcVar;
        return (!(zzauVar instanceof zzje) || (zzxcVar = ((zzje) zzauVar).zzh) == null) ? zzZ() : zzad(zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zznh zznhVarZzZ = zzZ();
        this.zzi = true;
        zzY(zznhVarZzZ, -1, new zzdz(zznhVarZzZ) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzB(final int i, final int i2, final boolean z) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new zzdz(zznhVarZzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzC(final zziv zzivVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1007, new zzdz(zznhVarZzaf, zzivVar) { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzD(final String str, final long j, final long j2) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1008, new zzdz(zznhVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzpb
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzE(final zzv zzvVar, final zziw zziwVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1009, new zzdz() { // from class: com.google.android.gms.internal.ads.zzpe
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzk(zznhVarZzaf, zzvVar, zziwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzF(final long j) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1010, new zzdz(zznhVarZzaf, j) { // from class: com.google.android.gms.internal.ads.zzpf
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzG(final int i, final long j, final long j2) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1011, new zzdz(zznhVarZzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzpg
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzH(final String str) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1012, new zzdz(zznhVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzph
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzI(final zziv zzivVar) {
        final zznh zznhVarZzae = zzae();
        zzY(zznhVarZzae, 1013, new zzdz(zznhVarZzae, zzivVar) { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzJ(final Exception exc) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1014, new zzdz(zznhVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzK(final Exception exc) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1029, new zzdz(zznhVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzL(final zzrq zzrqVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1031, new zzdz(zznhVarZzaf, zzrqVar) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzM(final zzrq zzrqVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1032, new zzdz(zznhVarZzaf, zzrqVar) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzN(final zziv zzivVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1015, new zzdz(zznhVarZzaf, zzivVar) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzO(final String str, final long j, final long j2) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1016, new zzdz(zznhVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzP(final zzv zzvVar, final zziw zziwVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1017, new zzdz() { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzl(zznhVarZzaf, zzvVar, zziwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzQ(final int i, final long j) {
        final zznh zznhVarZzae = zzae();
        zzY(zznhVarZzae, 1018, new zzdz() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzm(zznhVarZzae, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzR(final String str) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1019, new zzdz(zznhVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzS(final zziv zzivVar) {
        final zznh zznhVarZzae = zzae();
        zzY(zznhVarZzae, 1020, new zzdz() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzdh(zznhVarZzae, zzivVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzT(final Object obj, final long j) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 26, new zzdz() { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj2) {
                ((zznj) obj2).zzo(zznhVarZzaf, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzU(final long j, final int i) {
        final zznh zznhVarZzae = zzae();
        zzY(zznhVarZzae, 1021, new zzdz(zznhVarZzae, j, i) { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzV(final Exception exc) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 1030, new zzdz(zznhVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzW(final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new zzdz(zznhVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzX(final int i, final long j, final long j2) {
        final zznh zznhVarZzad = zzad(this.zzd.zzd());
        zzY(zznhVarZzad, 1006, new zzdz() { // from class: com.google.android.gms.internal.ads.zzpc
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzdg(zznhVarZzad, i, j, j2);
            }
        });
    }

    protected final void zzY(zznh zznhVar, int i, zzdz zzdzVar) {
        this.zze.put(i, zznhVar);
        zzee zzeeVar = this.zzf;
        zzeeVar.zze(i, zzdzVar);
        zzeeVar.zzf();
    }

    protected final zznh zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    @RequiresNonNull({"player"})
    protected final zznh zzaa(zzbf zzbfVar, int i, zzxc zzxcVar) {
        zzxc zzxcVar2 = true == zzbfVar.zzg() ? null : zzxcVar;
        long jZzb = this.zza.zzb();
        boolean z = zzbfVar.equals(this.zzg.zzq()) && i == this.zzg.zzs();
        long jZzr = 0;
        if (zzxcVar2 == null || !zzxcVar2.zzb()) {
            if (z) {
                jZzr = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j = zzbfVar.zzb(i, this.zzc, 0L).zzl;
                jZzr = zzfk.zzr(0L);
            }
        } else if (z && this.zzg.zzy() == zzxcVar2.zzb && this.zzg.zzz() == zzxcVar2.zzc) {
            jZzr = this.zzg.zzu();
        }
        return new zznh(jZzb, zzbfVar, i, zzxcVar2, jZzr, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    final /* synthetic */ void zzab(zzbb zzbbVar, zznj zznjVar, zzs zzsVar) {
        zznjVar.zzdi(zzbbVar, new zzni(zzsVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 1028, new zzdz(zznhVarZzZ) { // from class: com.google.android.gms.internal.ads.zzpd
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzai(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final int i2) {
        final zznh zznhVarZzag = zzag(i, zzxcVar);
        zzY(zznhVarZzag, 1000, new zzdz(zznhVarZzag, zzwtVar, zzwyVar, i2) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzaj(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final zznh zznhVarZzag = zzag(i, zzxcVar);
        zzY(zznhVarZzag, 1001, new zzdz(zznhVarZzag, zzwtVar, zzwyVar) { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzak(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final zznh zznhVarZzag = zzag(i, zzxcVar);
        zzY(zznhVarZzag, 1002, new zzdz(zznhVarZzag, zzwtVar, zzwyVar) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzal(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final IOException iOException, final boolean z) {
        final zznh zznhVarZzag = zzag(i, zzxcVar);
        zzY(zznhVarZzag, 1003, new zzdz() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzh(zznhVarZzag, zzwtVar, zzwyVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzam(int i, zzxc zzxcVar, final zzwy zzwyVar) {
        final zznh zznhVarZzag = zzag(i, zzxcVar);
        zzY(zznhVarZzag, 1004, new zzdz() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzdf(zznhVarZzag, zzwyVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 1, new zzdz(zznhVarZzZ, zzakVar, i) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 2, new zzdz(zznhVarZzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 14, new zzdz(zznhVarZzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 3, new zzdz(zznhVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 13, new zzdz(zznhVarZzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z, final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, -1, new zzdz(zznhVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zze(zznhVarZzZ, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z, final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 5, new zzdz(zznhVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 6, new zzdz(zznhVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 7, new zzdz(zznhVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zznh zznhVarZzah = zzah(zzauVar);
        zzY(zznhVarZzah, 10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzg(zznhVarZzah, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zznh zznhVarZzah = zzah(zzauVar);
        zzY(zznhVarZzah, 10, new zzdz(zznhVarZzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 12, new zzdz(zznhVarZzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 21, new zzdz(zznhVarZzaf, i) { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 22, new zzdz(zznhVarZzaf, f) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 23, new zzdz(zznhVarZzaf, z) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 25, new zzdz() { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                zznh zznhVar = zznhVarZzaf;
                zzbv zzbvVar2 = zzbvVar;
                ((zznj) obj).zzp(zznhVar, zzbvVar2);
                int i = zzbvVar2.zzb;
                int i2 = zzbvVar2.zzc;
                float f = zzbvVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i, final int i2) {
        final zznh zznhVarZzaf = zzaf();
        zzY(zznhVarZzaf, 24, new zzdz(zznhVarZzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzv(zznj zznjVar) {
        this.zzf.zzc(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzw(zznj zznjVar) {
        this.zzf.zzd(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzgsw.zzi(z);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdo zzdoVar = this.zza;
        this.zzh = zzdoVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdoVar, new zzea() { // from class: com.google.android.gms.internal.ads.zzpj
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                this.zza.zzab(zzbbVar, (zznj) obj, zzsVar);
            }
        });
    }

    private final zznh zzad(zzxc zzxcVar) {
        this.zzg.getClass();
        zzbf zzbfVarZze = zzxcVar == null ? null : this.zzd.zze(zzxcVar);
        if (zzxcVar != null && zzbfVarZze != null) {
            return zzaa(zzbfVarZze, zzbfVarZze.zzo(zzxcVar.zza, this.zzb).zzc, zzxcVar);
        }
        int iZzs = this.zzg.zzs();
        zzbf zzbfVarZzq = this.zzg.zzq();
        if (iZzs >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, iZzs, null);
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzy() {
        zzdy zzdyVar = this.zzh;
        zzdyVar.getClass();
        zzdyVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzz(List list, zzxc zzxcVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzxcVar, zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 0, new zzdz(zznhVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzpk zzpkVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpkVar.zzf(zzbbVar);
        final zznh zznhVarZzZ = zzZ();
        zzY(zznhVarZzZ, 11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                ((zznj) obj).zzde(zznhVarZzZ, zzbaVar, zzbaVar2, i);
            }
        });
    }

    public zzpl(zzdo zzdoVar) {
        zzdoVar.getClass();
        this.zza = zzdoVar;
        this.zzf = new zzee(zzfk.zzf().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzpk(zzbdVar);
        this.zze = new SparseArray();
    }
}
