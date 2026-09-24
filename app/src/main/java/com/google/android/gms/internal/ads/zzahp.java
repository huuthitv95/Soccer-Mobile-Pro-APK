package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahp implements zzahl {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahp(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzahp zzb(zzes zzesVar) {
        int iZzC = zzesVar.zzC();
        zzesVar.zzk(8);
        int iZzC2 = zzesVar.zzC();
        int iZzC3 = zzesVar.zzC();
        zzesVar.zzk(4);
        int iZzC4 = zzesVar.zzC();
        zzesVar.zzk(12);
        return new zzahp(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return 1751742049;
    }
}
