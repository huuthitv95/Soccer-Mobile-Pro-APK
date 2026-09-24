package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkm {
    public final com.google.android.gms.ads.internal.client.zzfw zza;
    public final zzbrp zzb;
    public final zzesq zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzblh zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzcl zzo;
    public final zzfka zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final com.google.android.gms.ads.internal.client.zzcp zzw;

    /* synthetic */ zzfkm(zzfkl zzfklVar, byte[] bArr) {
        this.zzf = zzfklVar.zzE();
        this.zzg = zzfklVar.zzF();
        this.zzw = zzfklVar.zzaa();
        this.zze = zzfklVar.zzD().zzB;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD2 = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD3 = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD4 = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD5 = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD6 = zzfklVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD7 = zzfklVar.zzD();
        int i = zzfklVar.zzD().zza;
        long j = zzmVarZzD7.zzb;
        Bundle bundle = zzmVarZzD6.zzc;
        int i2 = zzmVarZzD5.zzd;
        List list = zzmVarZzD4.zze;
        boolean z = zzmVarZzD3.zzf;
        int i3 = zzmVarZzD2.zzg;
        boolean z2 = true;
        if (!zzmVarZzD.zzh && !zzfklVar.zzH()) {
            z2 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfklVar.zzD().zzi, zzfklVar.zzD().zzj, zzfklVar.zzD().zzk, zzfklVar.zzD().zzl, zzfklVar.zzD().zzm, zzfklVar.zzD().zzn, zzfklVar.zzD().zzo, zzfklVar.zzD().zzp, zzfklVar.zzD().zzq, zzfklVar.zzD().zzr, zzfklVar.zzD().zzs, zzfklVar.zzD().zzt, zzfklVar.zzD().zzu, zzfklVar.zzD().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfklVar.zzD().zzw), zzfklVar.zzD().zzx, zzfklVar.zzD().zzy, zzfklVar.zzD().zzz, zzfklVar.zzD().zzA);
        this.zzd = zzmVar;
        this.zza = zzfklVar.zzG() != null ? zzfklVar.zzG() : zzfklVar.zzK() != null ? zzfklVar.zzK().zzf : null;
        this.zzh = zzfklVar.zzI();
        this.zzi = zzfklVar.zzJ();
        this.zzj = zzfklVar.zzI() == null ? null : zzfklVar.zzK() == null ? new zzblh(new NativeAdOptions.Builder().build()) : zzfklVar.zzK();
        this.zzk = zzfklVar.zzL();
        this.zzl = zzfklVar.zzP();
        this.zzm = zzfklVar.zzM();
        this.zzn = zzfklVar.zzN();
        this.zzo = zzfklVar.zzO();
        this.zzb = zzfklVar.zzQ();
        this.zzp = new zzfka(zzfklVar.zzR(), null);
        this.zzq = zzfklVar.zzS();
        this.zzr = zzfklVar.zzT();
        this.zzc = zzfklVar.zzU();
        this.zzs = zzfklVar.zzV();
        this.zzt = zzfklVar.zzW();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfklVar.zzX();
        this.zzv = zzfklVar.zzY();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzef));
    }
}
