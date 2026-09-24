package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.unity3d.player.b */
/* JADX INFO: loaded from: classes7.dex */
final class C14681b {

    /* JADX INFO: renamed from: a */
    private final Context f41668a;

    /* JADX INFO: renamed from: b */
    private final AudioManager f41669b;

    /* JADX INFO: renamed from: c */
    private a f41670c;

    /* JADX INFO: renamed from: com.unity3d.player.b$a */
    private class a extends ContentObserver {

        /* JADX INFO: renamed from: b */
        private final b f41672b;

        /* JADX INFO: renamed from: c */
        private final AudioManager f41673c;

        /* JADX INFO: renamed from: d */
        private final int f41674d;

        /* JADX INFO: renamed from: e */
        private int f41675e;

        public a(Handler handler, AudioManager audioManager, int i, b bVar) {
            super(handler);
            this.f41673c = audioManager;
            this.f41674d = 3;
            this.f41672b = bVar;
            this.f41675e = audioManager.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            int streamVolume;
            AudioManager audioManager = this.f41673c;
            if (audioManager == null || this.f41672b == null || (streamVolume = audioManager.getStreamVolume(this.f41674d)) == this.f41675e) {
                return;
            }
            this.f41675e = streamVolume;
            this.f41672b.onAudioVolumeChanged(streamVolume);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.b$b */
    public interface b {
        void onAudioVolumeChanged(int i);
    }

    public C14681b(Context context) {
        this.f41668a = context;
        this.f41669b = (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: renamed from: a */
    public final void m43266a() {
        if (this.f41670c != null) {
            this.f41668a.getContentResolver().unregisterContentObserver(this.f41670c);
            this.f41670c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43267a(b bVar) {
        this.f41670c = new a(new Handler(), this.f41669b, 3, bVar);
        this.f41668a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f41670c);
    }
}
