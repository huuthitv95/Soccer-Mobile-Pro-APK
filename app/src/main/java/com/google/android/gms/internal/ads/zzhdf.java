package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdf {
    static final zzhsi zza(zzhdt zzhdtVar) {
        try {
            return ((zzhnf) zzhmj.zza().zzk(null, zzhnf.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhnp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e);
        }
    }

    public static final zzhdt zzb(zzhdt zzhdtVar) throws GeneralSecurityException {
        return zzhdtVar != null ? zzhdtVar : zzhdz.zzb(zza(null).zzaN());
    }
}
