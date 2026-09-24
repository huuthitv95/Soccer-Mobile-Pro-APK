package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarf implements zzarg {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzafs zzc;
    private final zzahb zzd;
    private final zzark zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzes zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzarf(zzafs zzafsVar, zzahb zzahbVar, zzark zzarkVar) throws zzat {
        this.zzc = zzafsVar;
        this.zzd = zzahbVar;
        this.zze = zzarkVar;
        int iMax = Math.max(1, zzarkVar.zzc / 10);
        this.zzi = iMax;
        zzes zzesVar = new zzes(zzarkVar.zzf);
        zzesVar.zzu();
        int iZzu = zzesVar.zzu();
        this.zzf = iZzu;
        int i = zzarkVar.zzb;
        int i2 = (((zzarkVar.zzd - (i * 4)) * 8) / (zzarkVar.zze * i)) + 1;
        if (iZzu != i2) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(iZzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(iZzu);
            throw zzat.zzb(sb.toString(), null);
        }
        String str = zzfk.zza;
        int i3 = ((iMax + iZzu) - 1) / iZzu;
        this.zzg = new byte[zzarkVar.zzd * i3];
        this.zzh = new zzes(i3 * (iZzu + iZzu) * i);
        int i4 = ((zzarkVar.zzc * zzarkVar.zzd) * 8) / iZzu;
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzi(i4);
        zztVar.zzj(i4);
        zztVar.zzp((iMax + iMax) * i);
        zztVar.zzG(zzarkVar.zzb);
        zztVar.zzH(zzarkVar.zzc);
        zztVar.zzI(2);
        this.zzj = zztVar.zzO();
    }

    private final void zzd(int i) {
        long jZzv = this.zzl + zzfk.zzv(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i);
        this.zzd.zze(jZzv, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i;
        this.zzm -= iZzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzb(int i, long j) {
        zzarn zzarnVar = new zzarn(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzarnVar);
        zzahb zzahbVar = this.zzd;
        zzahbVar.zzA(this.zzj);
        zzahbVar.zzO(zzarnVar.zza());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzarg
    public final boolean zzc(com.google.android.gms.internal.ads.zzafq r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarf.zzc(com.google.android.gms.internal.ads.zzafq, long):boolean");
    }
}
