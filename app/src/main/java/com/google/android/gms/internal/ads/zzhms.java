package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhms {
    private final Map zza = new HashMap();

    public final zzhms zza(zziam zziamVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zziamVar.zzd() != 0 && zziamVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zziamVar)) {
            list = (List) map.get(zziamVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zziamVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzhmu zzb() {
        return new zzhmu(this.zza, null);
    }
}
