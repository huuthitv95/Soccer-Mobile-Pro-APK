package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zziby implements zzifk {
    static {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifk
    public final /* synthetic */ Object zza(InputStream inputStream, zzidb zzidbVar) throws zzieg {
        zzigg zziggVarZzaU;
        zzicr zzicrVarZzH = zzicr.zzH(inputStream, 4096);
        zzifc zzifcVar = (zzifc) zzb(zzicrVarZzH, zzidbVar);
        zzicrVarZzH.zzb(0);
        if (zzifcVar == null || zzifcVar.zzbi()) {
            return zzifcVar;
        }
        if (zzifcVar instanceof zzibw) {
            zziggVarZzaU = ((zzibw) zzifcVar).zzaU();
        } else {
            if (zzifcVar instanceof zzibx) {
                throw null;
            }
            zziggVarZzaU = new zzigg(zzifcVar);
        }
        throw zziggVarZzaU.zza();
    }
}
