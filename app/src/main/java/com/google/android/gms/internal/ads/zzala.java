package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzala implements zzakx {
    private final int zza;
    private final int zzb;
    private final zzes zzc;

    public zzala(zzfx zzfxVar, zzv zzvVar) {
        zzes zzesVar = zzfxVar.zza;
        this.zzc = zzesVar;
        zzesVar.zzh(12);
        int iZzH = zzesVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int iZzF = zzfk.zzF(zzvVar.zzJ) * zzvVar.zzH;
            if (iZzH % iZzF != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzF).length() + 66 + String.valueOf(iZzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iZzF);
                sb.append(", stsz sample size: ");
                sb.append(iZzH);
                zzef.zzc("BoxParsers", sb.toString());
                iZzH = iZzF;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzesVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
