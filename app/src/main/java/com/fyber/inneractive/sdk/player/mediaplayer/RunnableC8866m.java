package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.m */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8866m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8869p f20812a;

    public RunnableC8866m(C8869p c8869p) {
        this.f20812a = c8869p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p c8869p = this.f20812a;
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) c8869p.f20813a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.m21945a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", c8869p.m21413b(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        c8869p.setVolume(f, f);
        IAlog.m21949e(strM21413b + "timelog: unmute took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
