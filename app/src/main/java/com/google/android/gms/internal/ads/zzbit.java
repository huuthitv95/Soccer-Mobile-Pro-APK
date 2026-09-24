package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbit {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbit(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbiq zzf() {
        return new zzbiq(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbit zzbitVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbiq zzbiqVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbiq(j, strArr[0], zzbiqVar));
        }
        return true;
    }

    public final zzbis zzc() {
        zzbis zzbisVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            List<zzbiq> list = this.zza;
            for (zzbiq zzbiqVar : list) {
                long jZza = zzbiqVar.zza();
                String strZzb = zzbiqVar.zzb();
                zzbiq zzbiqVarZzc = zzbiqVar.zzc();
                if (zzbiqVarZzc != null && jZza > 0) {
                    long jZza2 = jZza - zzbiqVarZzc.zza();
                    sb.append(strZzb);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(AbstractJsonLexerKt.COMMA);
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbiqVarZzc.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbiqVarZzc.zza()));
                            sb2.append('+');
                            sb2.append(strZzb);
                        } else {
                            map.put(Long.valueOf(zzbiqVarZzc.zza()), new StringBuilder(strZzb));
                        }
                    }
                }
            }
            list.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                    sb3.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbisVar = new zzbis(sb.toString(), string);
        }
        return zzbisVar;
    }

    public final void zzd(String str, String str2) {
        zzbij zzbijVarZza;
        if (TextUtils.isEmpty(str2) || (zzbijVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbip zzbipVarZzd = zzbijVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbipVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
