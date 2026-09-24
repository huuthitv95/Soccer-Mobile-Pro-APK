package com.gadsme.nativeplugin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class AdvertisingIdentifier {

    /* JADX INFO: renamed from: a */
    public static int f21751a;

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.AdvertisingIdentifier$a */
    public static class RunnableC9297a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21752a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdvertisingIdClient.Info f21753b;

        public RunnableC9297a(int i, AdvertisingIdClient.Info info) {
            this.f21752a = i;
            this.f21753b = info;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f21752a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21753b.getId());
            sb.append("$");
            sb.append(this.f21753b.isLimitAdTrackingEnabled() ? "2" : ExifInterface.GPS_MEASUREMENT_3D);
            Plugin.SendMessage("AdvertisingIdentifier", i, sb.toString());
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.AdvertisingIdentifier$b */
    public static class RunnableC9298b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21754a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f21755b;

        public RunnableC9298b(int i, String str) {
            this.f21754a = i;
            this.f21755b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Plugin.SendMessage("AdvertisingIdentifier", this.f21754a, "$$" + this.f21755b);
        }
    }

    public static int requestIdentifier() {
        int i = f21751a;
        f21751a = i + 1;
        try {
            UnityPlayer.currentActivity.runOnUiThread(new RunnableC9297a(i, AdvertisingIdClient.getAdvertisingIdInfo(UnityPlayer.currentActivity)));
            return i;
        } catch (Exception e) {
            UnityPlayer.currentActivity.runOnUiThread(new RunnableC9298b(i, e.toString()));
            return i;
        }
    }
}
