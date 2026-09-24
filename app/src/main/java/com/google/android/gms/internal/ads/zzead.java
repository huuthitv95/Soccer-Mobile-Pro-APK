package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzead {
    public final long zza;
    public final int[] zzb;

    private zzead(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgvz zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgvz zzgvzVarZzi = zzgvz.zzi();
            jsonReader.beginObject();
            zzead zzeadVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgvw zzgvwVar2 = new zzgvw();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgvwVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgvzVarZzi = zzgvwVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgvzVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                if (zzgvzVarZzi == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzgvzVarZzi.size()];
                    for (int i2 = 0; i2 < zzgvzVarZzi.size(); i2++) {
                        iArr2[i2] = ((Integer) zzgvzVarZzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzeadVar = new zzead(jLongValue, iArr);
            }
            if (zzeadVar != null) {
                zzgvwVar.zzf(zzeadVar);
            }
        }
        jsonReader.endArray();
        return zzgvwVar.zzi();
    }
}
