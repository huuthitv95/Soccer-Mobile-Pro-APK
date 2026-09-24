package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhma {
    public static final /* synthetic */ int zza = 0;
    private static final zzhlf zzc = zzhlz.zza;
    private static final zzhma zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhma zza() {
        return zzd;
    }

    private static zzhma zzd() {
        zzhma zzhmaVar = new zzhma();
        try {
            zzhmaVar.zzb(zzc, zzhls.class);
            return zzhmaVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzhdc zze(zzhdt zzhdtVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhlf zzhlfVar;
        zzhlfVar = (zzhlf) this.zzb.get(zzhdtVar.getClass());
        if (zzhlfVar == null) {
            String string = zzhdtVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhlfVar.zza(zzhdtVar, num);
    }

    public final synchronized void zzb(zzhlf zzhlfVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzhlf zzhlfVar2 = (zzhlf) map.get(cls);
        if (zzhlfVar2 != null && !zzhlfVar2.equals(zzhlfVar)) {
            String string = cls.toString();
            StringBuilder sb = new StringBuilder(string.length() + 60);
            sb.append("Different key creator for parameters class ");
            sb.append(string);
            sb.append(" already inserted");
            throw new GeneralSecurityException(sb.toString());
        }
        map.put(cls, zzhlfVar);
    }

    public final zzhdc zzc(zzhdt zzhdtVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzhdtVar, num);
    }
}
