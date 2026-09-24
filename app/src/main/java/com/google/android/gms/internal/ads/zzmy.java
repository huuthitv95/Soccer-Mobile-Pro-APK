package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmy {
    private final zzmu zza;
    private final int zzb;
    private final zzmu zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmy(zzmu zzmuVar, zzmu zzmuVar2, int i) {
        this.zza = zzmuVar;
        this.zzb = i;
        this.zzc = zzmuVar2;
    }

    private final boolean zzN() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzlw zzlwVar, zzmu zzmuVar) {
        if (zzmuVar == null) {
            return true;
        }
        zzyu[] zzyuVarArr = zzlwVar.zzc;
        int i = this.zzb;
        zzyu zzyuVar = zzyuVarArr[i];
        if (zzmuVar.zzcV() != null) {
            if (zzmuVar.zzcV() == zzyuVar) {
                if (zzyuVar != null && !zzmuVar.zzcW()) {
                    zzlwVar.zzp();
                    boolean z = zzlwVar.zzg.zzh;
                }
            }
            zzlw zzlwVarZzp = zzlwVar.zzp();
            return zzlwVarZzp != null && zzlwVarZzp.zzc[i] == zzmuVar.zzcV();
        }
        return true;
    }

    private final void zzR(zzmu zzmuVar, zzyu zzyuVar, zzjc zzjcVar, long j, boolean z) throws zzje {
        if (zzW(zzmuVar)) {
            if (zzyuVar != zzmuVar.zzcV()) {
                zzS(zzmuVar, zzjcVar);
            } else if (z) {
                zzmuVar.zzp(j, true);
            }
        }
    }

    private final void zzS(zzmu zzmuVar, zzjc zzjcVar) {
        boolean z = true;
        if (this.zza != zzmuVar && this.zzc != zzmuVar) {
            z = false;
        }
        zzgsw.zzi(z);
        if (zzW(zzmuVar)) {
            zzjcVar.zze(zzmuVar);
            zzY(zzmuVar);
            zzmuVar.zzr();
        }
    }

    private final void zzT(boolean z) {
        if (z) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzmu zzmuVar = this.zzc;
            zzmuVar.getClass();
            zzmuVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzmu zzmuVar, zzlw zzlwVar, zzaba zzabaVar, zzjc zzjcVar) throws zzje {
        if (zzmuVar != null && zzW(zzmuVar)) {
            zzmu zzmuVar2 = this.zza;
            boolean z = zzmuVar != zzmuVar2;
            if ((zzmuVar != zzmuVar2 || !zzN()) && (zzmuVar != this.zzc || !zzO())) {
                zzyu zzyuVarZzcV = zzmuVar.zzcV();
                zzyu[] zzyuVarArr = zzlwVar.zzc;
                int i = this.zzb;
                zzyu zzyuVar = zzyuVarArr[i];
                boolean zZza = zzabaVar.zza(i);
                if (zZza && zzyuVarZzcV == zzyuVar) {
                    return 1;
                }
                if (!zzmuVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzabaVar.zzc[i]);
                    zzyu zzyuVar2 = zzyuVarArr[i];
                    zzyuVar2.getClass();
                    zzmuVar.zzcU(zzvVarArrZzV, zzyuVar2, zzlwVar.zzc(), zzlwVar.zza(), zzlwVar.zzg.zza);
                    return 3;
                }
                if (!zzmuVar.zzab()) {
                    return 0;
                }
                zzS(zzmuVar, zzjcVar);
                if (!zZza || zzc()) {
                    zzT(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzaas zzaasVar) {
        int iZze = zzaasVar != null ? zzaasVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i = 0; i < iZze; i++) {
            zzaasVar.getClass();
            zzvVarArr[i] = zzaasVar.zzb(i);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzmu zzmuVar) {
        return zzmuVar.zze() != 0;
    }

    private final zzmu zzX(zzlw zzlwVar) {
        if (zzlwVar != null) {
            int i = this.zzb;
            zzyu[] zzyuVarArr = zzlwVar.zzc;
            if (zzyuVarArr[i] != null) {
                zzmu zzmuVar = this.zza;
                zzyu zzyuVarZzcV = zzmuVar.zzcV();
                zzyu zzyuVar = zzyuVarArr[i];
                if (zzyuVarZzcV == zzyuVar) {
                    return zzmuVar;
                }
                zzmu zzmuVar2 = this.zzc;
                if (zzmuVar2 != null && zzmuVar2.zzcV() == zzyuVar) {
                    return zzmuVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzmu zzmuVar) {
        if (zzmuVar.zze() == 2) {
            zzmuVar.zzq();
        }
    }

    private static final void zzZ(zzmu zzmuVar, long j) {
        zzmuVar.zzl();
        if (zzmuVar instanceof zzzj) {
            throw null;
        }
    }

    public final void zzA(zzjc zzjcVar) throws zzje {
        zzS(this.zza, zzjcVar);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            boolean z = zzW(zzmuVar) && this.zzd != 3;
            zzS(zzmuVar, zzjcVar);
            zzT(false);
            if (z) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzje {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzD(zzyu zzyuVar, zzjc zzjcVar, long j, boolean z) throws zzje {
        zzR(this.zza, zzyuVar, zzjcVar, j, z);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzR(zzmuVar, zzyuVar, zzjcVar, j, z);
        }
    }

    public final void zzE(zzlw zzlwVar, long j, boolean z) throws zzje {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        if (zzmuVarZzX != null) {
            zzmuVarZzX.zzp(j, z);
        }
    }

    public final boolean zzF(zzlw zzlwVar, long j) {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        return zzmuVarZzX != null && zzmuVarZzX.zzW(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzmu zzmuVar = this.zzc;
        if (zzmuVar == null || zzW(zzmuVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzlw zzlwVar, zzaba zzabaVar, zzjc zzjcVar) throws zzje {
        int iZzU = zzU(this.zza, zzlwVar, zzabaVar, zzjcVar);
        return iZzU == 1 ? zzU(this.zzc, zzlwVar, zzabaVar, zzjcVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzmuVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzje {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzmu zzmuVar = this.zzc;
        zzmuVar.getClass();
        zzmuVar.zzx(1, obj);
    }

    public final void zzK(zzadj zzadjVar) throws zzje {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzadjVar);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzmuVar.zzx(7, zzadjVar);
        }
    }

    public final void zzL(float f) throws zzje {
        if (zze() != 1) {
            return;
        }
        zzmu zzmuVar = this.zza;
        Float fValueOf = Float.valueOf(f);
        zzmuVar.zzx(2, fValueOf);
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 != null) {
            zzmuVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzW(this.zza);
        }
        zzmu zzmuVar = this.zzc;
        zzmuVar.getClass();
        return zzW(zzmuVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        zzgsw.zzi(!zzc());
        if (zzW(this.zza)) {
            i = 3;
        } else {
            zzmu zzmuVar = this.zzc;
            i = (zzmuVar == null || !zzW(zzmuVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzmu zzmuVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i = 0;
        if (zzmuVar != null && zzW(zzmuVar)) {
            i = 1;
        }
        return (zZzW ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzlw zzlwVar) {
        return ((zzmu) Objects.requireNonNull(zzX(zzlwVar))).zzk();
    }

    public final boolean zzg(zzlw zzlwVar) {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        zzmuVarZzX.getClass();
        return zzmuVarZzX.zzcW();
    }

    public final void zzh(zzlw zzlwVar, long j) {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        zzmuVarZzX.getClass();
        zzZ(zzmuVarZzX, j);
    }

    public final void zzi(zzaba zzabaVar, zzaba zzabaVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zZza = zzabaVar.zza(i2);
        boolean zZza2 = zzabaVar2.zza(i2);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar == null || (i = this.zzd) == 3 || (i == 0 && zzW(this.zza))) {
            zzmuVar = this.zza;
        }
        if (!zZza || zzmuVar.zzm()) {
            return;
        }
        zze();
        zzmx zzmxVar = zzabaVar.zzb[i2];
        zzmx zzmxVar2 = zzabaVar2.zzb[i2];
        if (zZza2 && Objects.equals(zzmxVar2, zzmxVar) && !zzc()) {
            return;
        }
        zzZ(zzmuVar, j);
    }

    public final void zzj(long j) {
        int i;
        zzmu zzmuVar = this.zza;
        if (zzW(zzmuVar) && (i = this.zzd) != 4 && i != 2) {
            zzZ(zzmuVar, j);
        }
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 == null || !zzW(zzmuVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmuVar2, j);
    }

    public final long zzk(long j, long j2) {
        zzmu zzmuVar = this.zza;
        long jZzV = zzW(zzmuVar) ? zzmuVar.zzV(j, j2) : Long.MAX_VALUE;
        zzmu zzmuVar2 = this.zzc;
        return (zzmuVar2 == null || !zzW(zzmuVar2)) ? jZzV : Math.min(jZzV, zzmuVar2.zzV(j, j2));
    }

    public final void zzl() {
        zzmu zzmuVar = this.zza;
        if (zzW(zzmuVar)) {
            zzmuVar.zzY();
            return;
        }
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 == null || !zzW(zzmuVar2)) {
            return;
        }
        zzmuVar2.zzY();
    }

    public final void zzm(float f, float f2) throws zzje {
        this.zza.zzX(f, f2);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzmuVar.zzX(f, f2);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzmuVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzmu zzmuVar = this.zza;
        boolean zZzab = zzW(zzmuVar) ? zzmuVar.zzab() : true;
        zzmu zzmuVar2 = this.zzc;
        return (zzmuVar2 == null || !zzW(zzmuVar2)) ? zZzab : zZzab & zzmuVar2.zzab();
    }

    public final boolean zzp(zzlw zzlwVar) {
        return zzX(zzlwVar) != null;
    }

    public final boolean zzq(zzlw zzlwVar) {
        return (zzN() && zzX(zzlwVar) == this.zza) || (zzO() && zzX(zzlwVar) == this.zzc);
    }

    public final boolean zzr(zzlw zzlwVar) {
        return zzP(zzlwVar, this.zza) && zzP(zzlwVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws zzje {
        zzmu zzmuVar = this.zza;
        if (zzW(zzmuVar)) {
            zzmuVar.zzZ(j, j2);
        }
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 == null || !zzW(zzmuVar2)) {
            return;
        }
        zzmuVar2.zzZ(j, j2);
    }

    public final boolean zzt(zzlw zzlwVar) {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        return zzmuVarZzX == null || zzmuVarZzX.zzcW() || zzmuVarZzX.zzaa() || zzmuVarZzX.zzab();
    }

    public final void zzu(zzlw zzlwVar) throws IOException {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        zzmuVarZzX.getClass();
        zzmuVarZzX.zzn();
    }

    public final void zzv() throws zzje {
        zzmu zzmuVar = this.zza;
        if (zzmuVar.zze() == 1 && this.zzd != 4) {
            zzmuVar.zzcT();
            return;
        }
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 == null || zzmuVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmuVar2.zzcT();
    }

    public final void zzw() {
        zzmu zzmuVar = this.zza;
        if (zzW(zzmuVar)) {
            zzY(zzmuVar);
        }
        zzmu zzmuVar2 = this.zzc;
        if (zzmuVar2 == null || !zzW(zzmuVar2)) {
            return;
        }
        zzY(zzmuVar2);
    }

    public final void zzx(zzmx zzmxVar, zzaas zzaasVar, zzyu zzyuVar, long j, boolean z, boolean z2, long j2, long j3, zzxc zzxcVar, zzjc zzjcVar) throws zzje {
        zzv[] zzvVarArrZzV = zzV(zzaasVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzmu zzmuVar = this.zza;
            zzmuVar.zzf(zzmxVar, zzvVarArrZzV, zzyuVar, j, z, z2, j2, j3, zzxcVar);
            zzjcVar.zzd(zzmuVar);
            return;
        }
        this.zzf = true;
        zzmu zzmuVar2 = this.zzc;
        zzmuVar2.getClass();
        zzmuVar2.zzf(zzmxVar, zzvVarArrZzV, zzyuVar, j, z, z2, j2, j3, zzxcVar);
        zzjcVar.zzd(zzmuVar2);
    }

    public final void zzy(int i, Object obj, zzlw zzlwVar) throws zzje {
        zzmu zzmuVarZzX = zzX(zzlwVar);
        zzmuVarZzX.getClass();
        zzmuVarZzX.zzx(11, obj);
    }

    public final void zzz(zznb zznbVar) throws zzje {
        this.zza.zzx(18, zznbVar);
        zzmu zzmuVar = this.zzc;
        if (zzmuVar != null) {
            zzmuVar.zzx(18, zznbVar);
        }
    }

    private final void zzQ(boolean z) throws zzje {
        if (z) {
            zzmu zzmuVar = this.zzc;
            zzmuVar.getClass();
            zzmuVar.zzx(17, this.zza);
        } else {
            zzmu zzmuVar2 = this.zza;
            zzmu zzmuVar3 = this.zzc;
            zzmuVar3.getClass();
            zzmuVar2.zzx(17, zzmuVar3);
        }
    }

    public final void zzC(zzjc zzjcVar) {
        boolean z;
        zzmu zzmuVar;
        if (zzc()) {
            int i = this.zzd;
            if (i == 4) {
                z = true;
            } else if (i == 2) {
                i = 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                zzmuVar = this.zza;
            } else {
                zzmuVar = this.zzc;
                zzmuVar.getClass();
            }
            zzS(zzmuVar, zzjcVar);
            zzT(z);
            this.zzd = i == 4 ? 1 : 0;
        }
    }
}
