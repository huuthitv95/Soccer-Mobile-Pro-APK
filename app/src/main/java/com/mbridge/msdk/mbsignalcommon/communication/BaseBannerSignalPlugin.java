package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseBannerSignalPlugin extends BannerSignalPluginDiff {

    /* JADX INFO: renamed from: g */
    private final String f37107g = "BannerSignalPlugin";

    /* JADX INFO: renamed from: h */
    public InterfaceC13375e f37108h;

    public void click(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "click");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.click(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "click", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "getFileInfo");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.getFileInfo(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "getNetstat");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.mo38662b(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "handlerH5Exception");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.handlerH5Exception(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "increaseOfferFrequence");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.increaseOfferFrequence(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "init");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.init(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "init", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.AbstractC13393g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof InterfaceC13375e) {
                this.f37108h = (InterfaceC13375e) context;
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof InterfaceC13375e)) {
                    return;
                }
                this.f37108h = (InterfaceC13375e) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", MobileAdsBridgeBase.initializeMethodName, th);
        }
    }

    public void install(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "install");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.install(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "install", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "onSignalCommunication");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.mo34585c(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "openURL");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.openURL(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "readyStatus");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.readyStatus(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "reportUrls");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "resetCountdown");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.mo34582a(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "sendImpressions");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.mo34586d(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "toggleCloseBtn");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            C13219q0.m37816b("BannerSignalPlugin", "triggerCloseBtn");
            InterfaceC13375e interfaceC13375e = this.f37108h;
            if (interfaceC13375e != null) {
                interfaceC13375e.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }
}
