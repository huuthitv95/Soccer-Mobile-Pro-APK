package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.base.C13352e;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.e */
/* JADX INFO: compiled from: WindVaneApiManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13391e {

    /* JADX INFO: renamed from: d */
    private static HashMap<String, Class> f37174d = new HashMap<>();

    /* JADX INFO: renamed from: a */
    private Context f37175a;

    /* JADX INFO: renamed from: b */
    private Object f37176b;

    /* JADX INFO: renamed from: c */
    private WindVaneWebView f37177c;

    public C13391e(Context context, WindVaneWebView windVaneWebView) {
        this.f37175a = context;
        this.f37177c = windVaneWebView;
        m38722a();
    }

    /* JADX INFO: renamed from: a */
    public void m38723a(Context context) {
        this.f37175a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m38724a(Object obj) {
        this.f37176b = obj;
    }

    /* JADX INFO: renamed from: a */
    private Object m38720a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f37174d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!AbstractC13393g.class.isAssignableFrom(cls)) {
                return null;
            }
            AbstractC13393g abstractC13393g = (AbstractC13393g) cls.newInstance();
            abstractC13393g.initialize(context, windVaneWebView);
            abstractC13393g.initialize(this.f37176b, windVaneWebView);
            return abstractC13393g;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38725a(String str, Class cls) {
        if (f37174d == null) {
            f37174d = new HashMap<>();
        }
        f37174d.put(str, cls);
    }

    /* JADX INFO: renamed from: a */
    public Object m38721a(String str) {
        if (f37174d == null) {
            f37174d = new HashMap<>();
        }
        return m38720a(str, this.f37177c, this.f37175a);
    }

    /* JADX INFO: renamed from: a */
    public void m38722a() {
        try {
            int i = interstitial.f36523i;
            m38725a(C13352e.f37047a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i2 = RewardSignal.f40597i;
            m38725a(C13352e.f37048b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i3 = VideoCommunication.f40623j;
            m38725a(C13352e.f37049c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i4 = MraidSignalCommunication.f37118h;
            m38725a(C13352e.f37051e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i5 = BannerSignalPlugin.f37106i;
            m38725a(C13352e.f37052f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i6 = SplashSignal.f38389i;
            m38725a(C13352e.f37053g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i7 = WebGLCheckSignal.f37130g;
            m38725a(C13352e.f37054h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (C13884b.m41421a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                m38725a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
