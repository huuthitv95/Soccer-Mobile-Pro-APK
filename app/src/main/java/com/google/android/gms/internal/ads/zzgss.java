package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgss {
    private final String zza;
    private final zzgsr zzb;
    private zzgsr zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzgsr zzgsrVar = this.zzb.zzb;
        String str = "";
        while (zzgsrVar != null) {
            Object obj = zzgsrVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgsrVar = zzgsrVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzgss zza(Object obj) {
        zzgsr zzgsrVar = new zzgsr();
        this.zzc.zzb = zzgsrVar;
        this.zzc = zzgsrVar;
        zzgsrVar.zza = obj;
        return this;
    }

    /* synthetic */ zzgss(String str, byte[] bArr) {
        zzgsr zzgsrVar = new zzgsr();
        this.zzb = zzgsrVar;
        this.zzc = zzgsrVar;
        str.getClass();
        this.zza = str;
    }
}
