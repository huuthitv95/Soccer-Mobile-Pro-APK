package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgmf {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzhdw zzb = null;
    private zzhdw zzc = null;

    zzgmf() {
    }

    public final boolean zza(zzbdf zzbdfVar) {
        byte[] bArrZzA = zzbdfVar.zza().zzb().zzb().zzA();
        byte[] bArrZzA2 = zzbdfVar.zza().zzd().zzA();
        try {
            try {
                if (!this.zza.getAndSet(true)) {
                    try {
                        zzhxa.zza();
                        this.zzb = (zzhdw) zzhdy.zza(new String(zzgdj.zzb("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(zzhni.zzc(), zzhdw.class);
                        this.zzc = (zzhdw) zzhdy.zza(new String(zzgdj.zzb("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(zzhni.zzc(), zzhdw.class);
                    } catch (Exception e) {
                        throw new GeneralSecurityException("Failed to verify program", e);
                    }
                }
                zzhdw zzhdwVar = this.zzb;
                if (zzhdwVar == null) {
                    throw new GeneralSecurityException();
                }
                zzhdwVar.zza(bArrZzA, bArrZzA2);
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            zzhdw zzhdwVar2 = this.zzc;
            if (zzhdwVar2 != null) {
                zzhdwVar2.zza(bArrZzA, bArrZzA2);
            }
            return false;
        }
    }
}
