package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfu implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzfu(String str, byte[] bArr, int i, int i2) {
        byte b;
        byte b2;
        boolean z = true;
        switch (str) {
            case "com.android.capture.fps":
                b = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b = 4;
                break;
            case "auxiliary.tracks.length":
                b = 2;
                break;
            case "auxiliary.tracks.offset":
                b = 1;
                break;
            case "auxiliary.tracks.map":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            if (i2 != 23) {
                z = false;
            } else if (bArr.length == 4) {
                i2 = 23;
            } else {
                i2 = 23;
                z = false;
            }
            zzgsw.zza(z);
        } else if (b == 1 || b == 2) {
            if (i2 != 78) {
                z = false;
            } else if (bArr.length == 8) {
                i2 = 78;
            } else {
                i2 = 78;
                z = false;
            }
            zzgsw.zza(z);
        } else if (b == 3) {
            zzgsw.zza(i2 == 0);
        } else if (b == 4) {
            if (i2 != 75) {
                z = false;
            } else if (bArr.length == 1 && ((b2 = bArr[0]) == 0 || b2 == 1)) {
                i2 = 75;
            } else {
                i2 = 75;
                z = false;
            }
            zzgsw.zza(z);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfu zzfuVar = (zzfu) obj;
            if (this.zza.equals(zzfuVar.zza) && Arrays.equals(this.zzb, zzfuVar.zzb) && this.zzc == zzfuVar.zzc && this.zzd == zzfuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        zzao.CC.$default$zza(this, zzamVar);
    }

    public final List zzb() {
        zzgsw.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    public final String toString() {
        String string;
        int i = this.zzd;
        if (i != 0) {
            if (i == 1) {
                string = zzfk.zzj(this.zzb);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgzt.zzd(this.zzb)));
            } else if (i == 67) {
                string = String.valueOf(zzgzt.zzd(this.zzb));
            } else if (i == 75) {
                string = String.valueOf(zzes$$ExternalSyntheticBackport0.m22289m(this.zzb[0]));
            } else if (i != 78) {
                byte[] bArr = this.zzb;
                String str = zzfk.zza;
                string = zzgyu.zzn().zzi().zzj(bArr, 0, bArr.length);
            } else {
                string = String.valueOf(new zzes(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb = new StringBuilder();
            sb.append("track types = ");
            zzgsq.zzb(sb, listZzb, ",");
            string = sb.toString();
        } else {
            byte[] bArr2 = this.zzb;
            String str2 = zzfk.zza;
            string = zzgyu.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        }
        String str3 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb2.append("mdta: key=");
        sb2.append(str3);
        sb2.append(", value=");
        sb2.append(string);
        return sb2.toString();
    }
}
