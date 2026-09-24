package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfrm implements zzhbf {
    final /* synthetic */ zzfpi zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzdeu zzc;
    final /* synthetic */ zzfro zzd;

    zzfrm(zzfro zzfroVar, zzfpi zzfpiVar, zzfps zzfpsVar, zzdeu zzdeuVar) {
        this.zza = zzfpiVar;
        this.zzb = zzfpsVar;
        this.zzc = zzdeuVar;
        Objects.requireNonNull(zzfroVar);
        this.zzd = zzfroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfpi zzfpiVar = this.zza;
        if (zzfpiVar == null) {
            return;
        }
        zzfpiVar.zzd(false);
        zzfps zzfpsVar = this.zzb;
        if (zzfpsVar != null) {
            zzfpsVar.zza(zzfpiVar);
            zzfpsVar.zzh();
        } else {
            zzfro zzfroVar = this.zzd;
            zzfroVar.zze().zzb(zzfpiVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        byte b;
        int i;
        int i2;
        zzfpi zzfpiVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfpiVar != null) {
            zzfpiVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfps zzfpsVar = this.zzb;
            if (zzfpsVar == null) {
                this.zzd.zze().zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zza(zzfpiVar);
                zzfpsVar.zzh();
            }
        }
        zzdeu zzdeuVar = this.zzc;
        if (zzdeuVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode = strOptString.hashCode();
                byte b2 = -1;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strOptString.equals("CPM")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strOptString.equals("CPC")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    i = 1;
                } else if (b == 1) {
                    i = 2;
                } else if (b != 2) {
                    i = 0;
                } else {
                    jOptLong /= 1000;
                    i = 3;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            b2 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b2 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b2 = 0;
                }
                if (b2 == 0) {
                    i2 = 1;
                } else if (b2 != 1) {
                    i2 = b2 != 2 ? 0 : 3;
                } else {
                    i2 = 2;
                }
                zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, strOptString3, jOptLong));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "UrlPinger.pingUrl");
            }
        }
    }
}
