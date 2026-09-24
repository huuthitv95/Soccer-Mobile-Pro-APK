package com.gadsme.nativeplugin;

import android.media.AudioManager;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class Audio {

    /* JADX INFO: renamed from: a */
    public static Object f21756a = new Object();

    /* JADX INFO: renamed from: b */
    public static float f21757b;

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.Audio$a */
    public static class RunnableC9299a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioManager audioManager = (AudioManager) UnityPlayer.currentActivity.getSystemService("audio");
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                synchronized (Audio.f21756a) {
                    Audio.f21757b = streamMaxVolume > 0 ? (streamVolume * 1.0f) / streamMaxVolume : 0.0f;
                }
            } catch (Throwable unused) {
                synchronized (Audio.f21756a) {
                    Audio.f21757b = 0.0f;
                }
            }
        }
    }

    public static float requestAudioVolume() {
        float f;
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9299a());
        synchronized (f21756a) {
            f = f21757b;
        }
        return f;
    }
}
