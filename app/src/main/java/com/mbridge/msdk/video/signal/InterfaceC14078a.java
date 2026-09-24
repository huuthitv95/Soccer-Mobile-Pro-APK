package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.videocommon.setting.C14223c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.a */
/* JADX INFO: compiled from: BaseIJSCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC14078a extends InterfaceC14174e {

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.a$a */
    /* JADX INFO: compiled from: BaseIJSCommon.java */
    public interface a extends NativeListener.NativeTrackingListener {
        /* JADX INFO: renamed from: a */
        void mo41601a();

        /* JADX INFO: renamed from: a */
        void mo41602a(int i, String str);

        /* JADX INFO: renamed from: a */
        void mo41603a(boolean z);

        void onInitSuccess();
    }

    /* JADX INFO: renamed from: a */
    void mo42207a(int i);

    /* JADX INFO: renamed from: a */
    void mo42208a(int i, String str);

    /* JADX INFO: renamed from: a */
    void mo42209a(a aVar);

    /* JADX INFO: renamed from: a */
    void mo42210a(String str);

    /* JADX INFO: renamed from: a */
    void mo42211a(boolean z);

    /* JADX INFO: renamed from: a */
    boolean mo42212a();

    /* JADX INFO: renamed from: b */
    int mo42213b();

    /* JADX INFO: renamed from: b */
    void mo42214b(int i);

    /* JADX INFO: renamed from: b */
    void mo42215b(boolean z);

    /* JADX INFO: renamed from: c */
    String mo42216c();

    /* JADX INFO: renamed from: c */
    void mo42217c(int i);

    /* JADX INFO: renamed from: d */
    int mo42218d();

    /* JADX INFO: renamed from: d */
    void mo42219d(int i);

    /* JADX INFO: renamed from: e */
    String mo42220e();

    /* JADX INFO: renamed from: e */
    void mo42221e(int i);

    /* JADX INFO: renamed from: f */
    String mo42222f(int i);

    /* JADX INFO: renamed from: f */
    void mo42223f();

    /* JADX INFO: renamed from: g */
    String mo42224g();

    /* JADX INFO: renamed from: g */
    void mo42225g(int i);

    /* JADX INFO: renamed from: h */
    void mo42226h();

    /* JADX INFO: renamed from: i */
    int mo42227i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(AdEvents adEvents);

    void setAdSession(AdSession adSession);

    void setRewardUnitSetting(C14223c c14223c);

    void setUnitId(String str);

    void setVideoEvents(MediaEvents mediaEvents);

    void setWebViewFront(int i);
}
