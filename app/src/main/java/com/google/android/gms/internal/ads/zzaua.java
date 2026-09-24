package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C9415C;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaua extends zzasx {
    private final Object zza;
    private final zzatc zzb;

    public zzaua(int i, String str, zzatc zzatcVar, zzatb zzatbVar) {
        super(i, str, zzatbVar);
        this.zza = new Object();
        this.zzb = zzatcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    protected final zzatd zzr(zzast zzastVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzastVar.zzb;
            Map map = zzastVar.zzc;
            String str3 = C9415C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split(C11744X3.j.f26434b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(C11341A5.f23801N)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzastVar.zzb);
        }
        return zzatd.zza(str, zzatu.zza(zzastVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzasx
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatc zzatcVar;
        synchronized (this.zza) {
            zzatcVar = this.zzb;
        }
        zzatcVar.zza(str);
    }
}
