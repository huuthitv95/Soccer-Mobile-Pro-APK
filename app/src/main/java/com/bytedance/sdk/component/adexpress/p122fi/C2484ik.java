package com.bytedance.sdk.component.adexpress.p122fi;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.fi.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2484ik {

    /* JADX INFO: renamed from: ri */
    private WeakReference<InterfaceC2486lr> f6855ri;

    public C2484ik(InterfaceC2486lr interfaceC2486lr) {
        this.f6855ri = new WeakReference<>(interfaceC2486lr);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f6855ri.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f6855ri.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f6855ri.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f6855ri.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f6855ri.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().mo8780ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m8778ri(InterfaceC2486lr interfaceC2486lr) {
        this.f6855ri = new WeakReference<>(interfaceC2486lr);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<InterfaceC2486lr> weakReference = this.f6855ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6855ri.get().videoFrameChanged(str);
    }
}
