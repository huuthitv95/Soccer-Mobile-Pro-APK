package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwe implements zzxv {
    private final zzafv zza;
    private zzafp zzb;
    private zzafq zzc;

    public zzwe(zzafv zzafvVar) {
        this.zza = zzafvVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzafs zzafsVar) throws IOException {
        zzafg zzafgVar = new zzafg(zzjVar, j, j2);
        this.zzc = zzafgVar;
        if (this.zzb != null) {
            return;
        }
        zzafp[] zzafpVarArrZzb = this.zza.zzb(uri, map);
        int length = zzafpVarArrZzb.length;
        zzgvw zzgvwVarZzv = zzgvz.zzv(length);
        if (length == 1) {
            this.zzb = zzafpVarArrZzb[0];
        } else {
            for (int i = 0; i < length; i++) {
                zzafp zzafpVar = zzafpVarArrZzb[i];
                try {
                    if (zzafpVar.zza(zzafgVar)) {
                        this.zzb = zzafpVar;
                        zzgsw.zzi(zzafpVar != null || zzafgVar.zzn() == j);
                        zzafgVar.zzl();
                        break;
                    } else {
                        zzgvwVarZzv.zzh(zzafpVar.zzb());
                        boolean z = this.zzb != null || zzafgVar.zzn() == j;
                        zzgsw.zzi(z);
                        zzafgVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzafgVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    zzgsw.zzi(this.zzb != null || zzafgVar.zzn() == j);
                    zzafgVar.zzl();
                    throw th;
                }
                zzgsw.zzi(z);
                zzafgVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzgsq.zzd(zzgwz.zzc(zzgvz.zzr(zzafpVarArrZzb), zzwd.zza), ", ");
                StringBuilder sb = new StringBuilder(strZzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzd);
                sb.append(") could read the stream.");
                throw new zzzg(sb.toString(), uri, zzgvwVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzafsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzb() {
        zzafp zzafpVar = this.zzb;
        if (zzafpVar != null) {
            zzafpVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzc() {
        zzafp zzafpVar = this.zzb;
        if (zzafpVar != null && (zzafpVar instanceof zzakj)) {
            ((zzakj) zzafpVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final long zzd() {
        zzafq zzafqVar = this.zzc;
        if (zzafqVar != null) {
            return zzafqVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zze(long j, long j2) {
        zzafp zzafpVar = this.zzb;
        zzafpVar.getClass();
        zzafpVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzf(zzagp zzagpVar) throws IOException {
        zzafq zzafqVar;
        zzafp zzafpVar = this.zzb;
        if (zzafpVar == null || (zzafqVar = this.zzc) == null) {
            throw null;
        }
        return zzafpVar.zzd(zzafqVar, zzagpVar);
    }
}
