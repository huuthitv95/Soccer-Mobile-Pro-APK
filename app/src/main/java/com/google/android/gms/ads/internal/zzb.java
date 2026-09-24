package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbzy;
import com.google.android.gms.internal.ads.zzcdb;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcdb zzc;
    private final zzbzy zzd = new zzbzy(false, Collections.EMPTY_LIST);

    public zzb(Context context, zzcdb zzcdbVar, zzbzy zzbzyVar) {
        this.zza = context;
        this.zzc = zzcdbVar;
    }

    private final boolean zzd() {
        zzcdb zzcdbVar = this.zzc;
        return (zzcdbVar != null && zzcdbVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcdb zzcdbVar = this.zzc;
            if (zzcdbVar != null) {
                zzcdbVar.zze(str, null, 3);
                return;
            }
            zzbzy zzbzyVar = this.zzd;
            if (!zzbzyVar.zza || (list = zzbzyVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(context, "", strReplace);
                }
            }
        }
    }
}
