package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzchv implements zzhj {
    private final Context zza;
    private final zzhj zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbgp zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhn zzl;

    public zzchv(Context context, zzhj zzhjVar, String str, int i, zzih zzihVar, zzchu zzchuVar) {
        this.zza = context;
        this.zzb = zzhjVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfn)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfo)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhnVar.zza;
        this.zzh = uri;
        this.zzl = zzhnVar;
        this.zzi = zzbgp.zza(uri);
        zzbgm zzbgmVarZzc = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfk)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhnVar.zze;
                this.zzi.zzi = zzgtn.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbgmVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbgmVarZzc != null && zzbgmVarZzc.zza()) {
                this.zzj = zzbgmVarZzc.zzg();
                this.zzk = zzbgmVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbgmVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhnVar.zze;
            this.zzi.zzi = zzgtn.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfm);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfl);
            }
            long jLongValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbha.zza(this.zza, this.zzi);
            try {
                try {
                    zzbhb zzbhbVar = (zzbhb) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbhbVar.zzc();
                    this.zzj = zzbhbVar.zzd();
                    this.zzk = zzbhbVar.zzf();
                    zzbhbVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbhbVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhm zzhmVarZzb = zzhnVar.zzb();
            zzhmVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzhmVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public /* synthetic */ Map zzj() {
        return Collections.EMPTY_MAP;
    }
}
