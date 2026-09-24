package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgei implements zzgej {
    private final zzifc zza;

    public zzgei(zzifc zzifcVar) {
        this.zza = zzifcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzifc) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzifc) this.zza.zzbd().zza(inputStream, zzidb.zza());
        } catch (zzieg e) {
            throw new zzgef("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
