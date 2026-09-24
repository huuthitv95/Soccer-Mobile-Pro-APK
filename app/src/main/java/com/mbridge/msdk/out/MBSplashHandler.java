package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.splash.middle.C13663c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MBSplashHandler implements BaseExtraInterfaceForHandler {
    private static final String TAG = "MBSplashHandler";
    private static boolean canSkip = true;
    private static int defCountDownS = 5;
    private static int logoSizeH = 0;
    private static int logoSizeW = 0;
    private static int orientation = 1;
    private C13663c splashProvider;
    private String unitId;

    public MBSplashHandler(String str, String str2) {
        this(str, str2, canSkip, defCountDownS);
    }

    public void allowClickSplash(boolean z) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39985a(z);
        }
    }

    public ViewGroup createZoomOutByType(ZoomOutTypeEnum zoomOutTypeEnum) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            return c13663c.m39974a(zoomOutTypeEnum);
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        C13663c c13663c = this.splashProvider;
        return c13663c != null ? c13663c.m39987b() : "";
    }

    public String getRequestId() {
        C13663c c13663c = this.splashProvider;
        return c13663c != null ? c13663c.m39995c() : "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void loadAndShow(ViewGroup viewGroup) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39984a("", viewGroup);
        }
    }

    public void loadAndShowByToken(String str, ViewGroup viewGroup) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39993b(str, viewGroup);
        }
    }

    public void onDestroy() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39975a();
        }
    }

    public void onPause() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40007h();
        }
    }

    public void onResume() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40008i();
        }
    }

    public void preLoad() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39991b("");
        }
    }

    public void preLoadByToken(String str) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39996c(str);
        }
    }

    public void setDevCloseView(ViewGroup viewGroup) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39980a(viewGroup);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        C13008c.m36588n().m36530a(this.unitId, jSONObject);
    }

    public void setLoadTimeOut(long j) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39978a(j);
        }
    }

    public void setLogoView(View view, int i, int i2) {
        if (this.splashProvider != null) {
            this.splashProvider.m39979a(view, new RelativeLayout.LayoutParams(i, i2));
        }
    }

    public void setNotchScreenParameter(int i, int i2, int i3, int i4) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39977a(i, i3, i2, i4);
        }
    }

    public void setOrientation(int i) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39976a(i);
        }
    }

    public void setSplashLoadListener(MBSplashLoadListener mBSplashLoadListener) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39981a(mBSplashLoadListener);
        }
    }

    public void setSplashShowListener(MBSplashShowListener mBSplashShowListener) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39982a(mBSplashShowListener);
        }
    }

    public void setSupportZoomOut(boolean z) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40003d(z);
        }
    }

    public void show(ViewGroup viewGroup) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39998c("", viewGroup);
        }
    }

    public void zoomOutAttacked() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40009j();
        }
    }

    public void zoomOutPlayFinish() {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40010k();
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2) {
        this(activity, str, str2, canSkip, defCountDownS);
    }

    public boolean isReady(String str) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            return c13663c.m39986a(str);
        }
        return false;
    }

    public MBSplashHandler(String str, String str2, boolean z, int i) {
        this(str, str2, z, i, orientation, logoSizeH, logoSizeW);
    }

    public void loadAndShow(Activity activity) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39983a("", activity);
        }
    }

    public void loadAndShowByToken(String str, Activity activity) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39992b(str, activity);
        }
    }

    public void show(ViewGroup viewGroup, String str) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40002d(str, viewGroup);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z, int i) {
        this(activity, str, str2, z, i, orientation, logoSizeH, logoSizeW);
    }

    public MBSplashHandler(String str, String str2, boolean z, int i, int i2, int i3, int i4) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.unitId = str2;
        C13663c c13663c = new C13663c(null, str, str2);
        this.splashProvider = c13663c;
        c13663c.m39999c(z);
        this.splashProvider.m39988b(i);
        this.splashProvider.m39976a(i2);
        this.splashProvider.m39989b(i3, i4);
    }

    public void show(Activity activity) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m39997c("", activity);
        }
    }

    public void show(Activity activity, String str) {
        C13663c c13663c = this.splashProvider;
        if (c13663c != null) {
            c13663c.m40001d(str, activity);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z, int i, int i2, int i3, int i4) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        C13663c c13663c = new C13663c(activity, str, str2);
        this.splashProvider = c13663c;
        c13663c.m39999c(z);
        this.splashProvider.m39988b(i);
        this.splashProvider.m39976a(i2);
        this.splashProvider.m39989b(i3, i4);
    }
}
