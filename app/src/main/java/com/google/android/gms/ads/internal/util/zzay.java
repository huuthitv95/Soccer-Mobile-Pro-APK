package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatm;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzfyu;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay extends zzatm {
    private final Context zzb;

    private zzay(Context context, zzatl zzatlVar) {
        super(zzatlVar);
        this.zzb = context;
    }

    public static zzata zzb(Context context) {
        zzata zzataVar = new zzata(new zzatt(new File(zzfyu.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaty(null, null)), 4);
        zzataVar.zza();
        return zzataVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatm, com.google.android.gms.internal.ads.zzasq
    public final zzast zza(zzasx zzasxVar) throws zzatg {
        if (zzasxVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfr), zzasxVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    zzast zzastVarZza = new zzbrc(context).zza(zzasxVar);
                    if (zzastVarZza != null) {
                        String strZzh = zzasxVar.zzh();
                        String.valueOf(strZzh);
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(strZzh)));
                        return zzastVarZza;
                    }
                    String strZzh2 = zzasxVar.zzh();
                    String.valueOf(strZzh2);
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(strZzh2)));
                }
            }
        }
        return super.zza(zzasxVar);
    }
}
