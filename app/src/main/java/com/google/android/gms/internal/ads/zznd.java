package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zznd {
    private final zzjn zza;

    @Deprecated
    public zznd(Context context, zzmz zzmzVar) {
        this.zza = new zzjn(context, zzmzVar);
    }

    @Deprecated
    public final zznd zza(final zzaaz zzaazVar) {
        zzjn zzjnVar = this.zza;
        zzgsw.zzi(!zzjnVar.zzw);
        zzaazVar.getClass();
        zzjnVar.zze = new zzgto() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return zzaazVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zznd zzb(final zzls zzlsVar) {
        zzjn zzjnVar = this.zza;
        zzgsw.zzi(!zzjnVar.zzw);
        zzlsVar.getClass();
        zzjnVar.zzf = new zzgto() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return zzlsVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzne zzc() {
        zzjn zzjnVar = this.zza;
        zzgsw.zzi(!zzjnVar.zzw);
        zzjnVar.zzw = true;
        return new zzne(zzjnVar);
    }
}
