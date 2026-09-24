package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d */
/* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13383d {

    /* JADX INFO: renamed from: f */
    public static double f37123f = -1.0d;

    /* JADX INFO: renamed from: a */
    private Context f37124a;

    /* JADX INFO: renamed from: b */
    private AudioManager f37125b;

    /* JADX INFO: renamed from: c */
    private boolean f37126c = false;

    /* JADX INFO: renamed from: d */
    private b f37127d;

    /* JADX INFO: renamed from: e */
    private a f37128e;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$a */
    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    private static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private WeakReference<C13383d> f37129a;

        public a(C13383d c13383d) {
            this.f37129a = new WeakReference<>(c13383d);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C13383d c13383d;
            b bVarM38704b;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (c13383d = this.f37129a.get()) == null || (bVarM38704b = c13383d.m38704b()) == null) {
                return;
            }
            double dM38702a = c13383d.m38702a();
            if (dM38702a >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                bVarM38704b.mo38122a(dM38702a);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$b */
    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo38122a(double d);
    }

    public C13383d(Context context) {
        this.f37124a = context;
        this.f37125b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* JADX INFO: renamed from: a */
    public double m38702a() {
        AudioManager audioManager = this.f37125b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f37125b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f37123f = streamVolume;
        return streamVolume;
    }

    /* JADX INFO: renamed from: b */
    public b m38704b() {
        return this.f37127d;
    }

    /* JADX INFO: renamed from: c */
    public void m38705c() {
        if (this.f37124a != null) {
            this.f37128e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f37124a.registerReceiver(this.f37128e, intentFilter);
            this.f37126c = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m38706d() {
        Context context;
        if (!this.f37126c || (context = this.f37124a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f37128e);
            this.f37127d = null;
            this.f37126c = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38703a(b bVar) {
        this.f37127d = bVar;
    }
}
