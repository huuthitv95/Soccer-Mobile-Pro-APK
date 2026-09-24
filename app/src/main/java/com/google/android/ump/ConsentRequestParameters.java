package com.google.android.ump;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    private final String zzb;
    private final ConsentDebugSettings zzc;
    private final String zzd;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public static final class Builder {
        private boolean zza;
        private String zzb;
        private ConsentDebugSettings zzc;
        private String zzd;

        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        public Builder setAdMobAppId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.zzc = consentDebugSettings;
            return this;
        }

        public Builder setConsentSyncId(String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.zzd = str;
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    public ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public String getConsentSyncId() {
        return this.zzd;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    public final String zza() {
        return this.zzb;
    }
}
