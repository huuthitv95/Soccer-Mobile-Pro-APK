package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzatb;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzaua;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbh extends zzaua {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbl zzblVar, int i, String str, zzatc zzatcVar, zzatb zzatbVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzatcVar, zzatbVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final Map zzm() throws zzasf {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final byte[] zzn() throws zzasf {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaua, com.google.android.gms.internal.ads.zzasx
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzs((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaua
    /* JADX INFO: renamed from: zzz */
    public final void zzs(String str) {
        this.zzc.zze(str);
        super.zzs(str);
    }
}
