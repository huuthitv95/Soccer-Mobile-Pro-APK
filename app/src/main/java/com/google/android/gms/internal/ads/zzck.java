package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzck {
    private final zzgvz zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgvz zzgvzVar) {
        this.zza = zzgvzVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= zzj(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcoVar.zzf();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((zzco) list.get(i + 1)).zze();
                    }
                }
            }
        } while (z);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgvz zzgvzVar = this.zza;
        int size = zzgvzVar.size();
        zzgvz zzgvzVar2 = ((zzck) obj).zza;
        if (size != zzgvzVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgvzVar.size(); i++) {
            if (zzgvzVar.get(i) != zzgvzVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        zzcl zzclVar2 = zzcl.zza;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgsw.zzi(!zzclVarZzb.equals(zzclVar2));
                zzclVar = zzclVarZzb;
            }
            i++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgsw.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzj(); i2++) {
            this.zzc[i2] = ((zzco) list.get(i2)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i);
            zzcoVar.zzi(zzcm.zza);
            zzcoVar.zzj();
            i++;
        }
    }
}
