package com.google.android.gms.internal.ads;

import com.ironsource.C11744X3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwk extends zzgwf {
    public final zzgwk zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder(C11744X3.j.f26438d);
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgvu zzgvuVarZzt = (zzgvu) zza().get(obj);
            if (zzgvuVarZzt == null) {
                zzgvuVarZzt = zzgwj.zzt(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzgvuVarZzt);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzguv.zza(obj, next);
                zzgvuVarZzt.zzd(next);
            }
        }
        return this;
    }

    public final zzgwm zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgvn.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgvn.zza;
        }
        zzgwb zzgwbVar = new zzgwb(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgwj zzgwjVarZzp = zzgwj.zzp(((zzgwi) entry.getValue()).zzh());
            if (!zzgwjVarZzp.isEmpty()) {
                zzgwbVar.zza(key, zzgwjVarZzp);
                size += zzgwjVarZzp.size();
            }
        }
        return new zzgwm(zzgwbVar.zzc(), size, null);
    }
}
