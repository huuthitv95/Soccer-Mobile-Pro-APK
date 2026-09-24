package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import com.applovin.mediation.AppLovinExtras;

/* JADX INFO: loaded from: classes4.dex */
public final class MintegralExtras {

    public static class Builder {
        private boolean muteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(AppLovinExtras.Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }
    }

    static class Keys {
        static final String MUTE_AUDIO = "mute_audio";

        Keys() {
        }
    }
}
