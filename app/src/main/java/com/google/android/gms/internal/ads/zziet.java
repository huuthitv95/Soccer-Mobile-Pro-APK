package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziet implements zzifv {
    private static final zzifa zzb = new zzier();
    private final zzifa zza;

    public zziet() {
        zzifa zzifaVar = zzb;
        int i = zzica.zza;
        zzies zziesVar = new zzies(zzidk.zza(), zzifaVar);
        byte[] bArr = zziee.zzb;
        this.zza = zziesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifv
    public final zzifu zza(Class cls) {
        int i = zzifw.zza;
        if (!zzidr.class.isAssignableFrom(cls)) {
            int i2 = zzica.zza;
        }
        zziez zziezVarZzc = this.zza.zzc(cls);
        if (zziezVarZzc.zza()) {
            int i3 = zzica.zza;
            return zzifg.zzh(zzifw.zzF(), zzide.zza(), zziezVarZzc.zzb());
        }
        int i4 = zzica.zza;
        return zziff.zzm(cls, zziezVarZzc, zzifj.zza(), zziep.zza(), zzifw.zzF(), zziezVarZzc.zzc() + (-1) != 1 ? zzide.zza() : null, zziey.zza());
    }
}
