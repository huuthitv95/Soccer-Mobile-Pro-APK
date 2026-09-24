package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanh implements zzahb {
    private final zzahb zza;
    private final zzanc zzb;
    private zzane zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfk.zzb;
    private final zzes zzc = new zzes();

    public zzanh(zzahb zzahbVar, zzanc zzancVar) {
        this.zza = zzahbVar;
        this.zzb = zzancVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzgsw.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanc zzancVar = this.zzb;
            this.zzg = zzancVar.zza(zzvVar) ? zzancVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzahb zzahbVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzo(MimeTypes.APPLICATION_MEDIA3_CUES);
        zztVarZza.zzk(str);
        zztVarZza.zzt(Long.MAX_VALUE);
        zztVarZza.zzM(this.zzb.zzb(zzvVar));
        zzahbVar.zzA(zztVarZza.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzO(long j) {
        zzahb.CC.$default$zzO(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ int zza(zzj zzjVar, int i, boolean z) {
        return zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i, z, 0);
        }
        zzi(i);
        int iZza = zzjVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzc(zzes zzesVar, int i) {
        zzd(zzesVar, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzesVar, i, i2);
            return;
        }
        zzi(i);
        zzesVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zze(final long j, final int i, int i2, int i3, zzaha zzahaVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzahaVar);
            return;
        }
        zzgsw.zzb(zzahaVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzand.zza(), new zzds() { // from class: com.google.android.gms.internal.ads.zzang
                @Override // com.google.android.gms.internal.ads.zzds
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j, i, (zzamw) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzef.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j, int i, zzamw zzamwVar) {
        this.zzh.getClass();
        zzgvz zzgvzVar = zzamwVar.zza;
        long j2 = zzamwVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgvzVar.size());
        Iterator<E> it = zzgvzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzes zzesVar = this.zzc;
        int length = bArrMarshall.length;
        zzesVar.zzb(bArrMarshall, length);
        zzahb zzahbVar = this.zza;
        zzahbVar.zzc(zzesVar, length);
        long j3 = zzamwVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzgsw.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzu;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzahbVar.zze(j, i | 1, length, 0, null);
    }
}
