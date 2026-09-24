package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziaa extends ThreadLocal {
    final /* synthetic */ zziab zza;

    zziaa(zziab zziabVar) {
        Objects.requireNonNull(zziabVar);
        this.zza = zziabVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhzm zzhzmVar = zzhzm.zzb;
            zziab zziabVar = this.zza;
            Mac mac = (Mac) zzhzmVar.zzb(zziabVar.zzb());
            mac.init(zziabVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
