package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimt {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzimt(int i, int i2, zzims zzimsVar) {
        this.zza = zzimf.zza(i);
        this.zzb = zzimf.zza(i2);
    }

    public final zzimt zza(zzimr zzimrVar) {
        this.zza.add(zzimrVar);
        return this;
    }

    public final zzimt zzb(zzimr zzimrVar) {
        this.zzb.add(zzimrVar);
        return this;
    }

    public final zzimu zzc() {
        return new zzimu(this.zza, this.zzb, null);
    }
}
