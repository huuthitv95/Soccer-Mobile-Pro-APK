package com.gadsme.nativeplugin;

import android.webkit.WebSettings;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class UserAgent {

    /* JADX INFO: renamed from: a */
    public static int f21760a;

    /* JADX INFO: renamed from: b */
    public static String f21761b;

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.UserAgent$a */
    public static class RunnableC9301a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21762a;

        public RunnableC9301a(int i) {
            this.f21762a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Plugin.SendMessage("UserAgent", this.f21762a, UserAgent.f21761b);
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.UserAgent$b */
    public static class RunnableC9302b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21763a;

        public RunnableC9302b(int i) {
            this.f21763a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgent.f21761b = WebSettings.getDefaultUserAgent(UnityPlayer.currentActivity);
            } catch (Exception unused) {
            }
            Plugin.SendMessage("UserAgent", this.f21763a, UserAgent.f21761b);
        }
    }

    public static int requestUserAgent() {
        int i = f21760a;
        f21760a = i + 1;
        if (f21761b != null) {
            UnityPlayer.currentActivity.runOnUiThread(new RunnableC9301a(i));
            return i;
        }
        try {
            f21761b = System.getProperty("http.agent");
        } catch (Exception unused) {
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9302b(i));
        return i;
    }
}
