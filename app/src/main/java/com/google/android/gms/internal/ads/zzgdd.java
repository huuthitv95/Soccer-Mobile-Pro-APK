package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgdd implements zzggk {
    private final zzgcu zza;
    private final zzgda zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzaxf zzh;
    private zzgdl zzi;

    /* synthetic */ zzgdd(zzgcu zzgcuVar, zzgda zzgdaVar, byte[] bArr) {
        this.zza = zzgcuVar;
        this.zzb = zzgdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final zzggl zza() {
        zzimq.zzc(this.zzc, Context.class);
        zzimq.zzc(this.zzg, Map.class);
        zzimq.zzc(this.zzh, zzaxf.class);
        zzimq.zzc(this.zzi, zzgdl.class);
        return new zzgde(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* bridge */ /* synthetic */ zzggk zzd(Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* synthetic */ zzggk zze(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* synthetic */ zzggk zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* synthetic */ zzggk zzg(View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* bridge */ /* synthetic */ zzggk zzb(zzgdl zzgdlVar) {
        zzgdlVar.getClass();
        this.zzi = zzgdlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* bridge */ /* synthetic */ zzggk zzc(zzaxf zzaxfVar) {
        zzaxfVar.getClass();
        this.zzh = zzaxfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final /* bridge */ /* synthetic */ zzggk zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
