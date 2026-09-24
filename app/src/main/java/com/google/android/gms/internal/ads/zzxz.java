package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzxz implements zzabr, zzwr {
    final /* synthetic */ zzyi zza;
    private final long zzb;
    private final Uri zzc;
    private final zzig zzd;
    private final zzxv zze;
    private final zzafs zzf;
    private final zzdr zzg;
    private final zzagp zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhn zzl;
    private zzahb zzm;
    private boolean zzn;

    public zzxz(zzyi zzyiVar, Uri uri, zzhj zzhjVar, zzxv zzxvVar, zzafs zzafsVar, zzdr zzdrVar) {
        Objects.requireNonNull(zzyiVar);
        this.zza = zzyiVar;
        this.zzc = uri;
        this.zzd = new zzig(zzhjVar);
        this.zze = zzxvVar;
        this.zzf = zzafsVar;
        this.zzg = zzdrVar;
        this.zzh = new zzagp();
        this.zzj = true;
        this.zzb = zzwt.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhn zzi(long j, String str) {
        Map mapZzd = zzyi.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgwb zzgwbVar = new zzgwb();
            zzgwbVar.zzb(mapZzd.entrySet());
            zzgwbVar.zza(HttpHeaders.IF_RANGE, str);
            mapZzd = zzgwbVar.zzd();
        }
        zzhm zzhmVar = new zzhm();
        zzhmVar.zza(this.zzc);
        zzhmVar.zzc(j);
        zzhmVar.zzd(6);
        zzhmVar.zzb(mapZzd);
        return zzhmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020c */
    /* JADX WARN: Code duplicated, block: B:111:0x0233  */
    /* JADX WARN: Code duplicated, block: B:113:0x023d  */
    @Override // com.google.android.gms.internal.ads.zzabr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxz.zzc():void");
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzig zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhn zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzes zzesVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzesVar.zzd();
        zzahb zzahbVar = this.zzm;
        zzahbVar.getClass();
        zzahbVar.zzc(zzesVar, iZzd);
        zzahbVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }
}
