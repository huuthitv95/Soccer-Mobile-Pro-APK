package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C7985m;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.RunnableC8278c;
import com.fyber.inneractive.sdk.network.timeouts.content.C8419a;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9088f;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC9138c;
import com.fyber.inneractive.sdk.web.C9226e;
import com.fyber.inneractive.sdk.web.EnumC9221c0;
import com.fyber.inneractive.sdk.web.EnumC9224d0;
import com.fyber.inneractive.sdk.web.EnumC9277z;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.mediationsdk.metadata.C12364a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8175s extends AbstractC8129k {

    /* JADX INFO: renamed from: m */
    public IAmraidWebViewController f18208m;

    /* JADX INFO: renamed from: n */
    public final C8171q f18209n = new C8171q(this);

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k, com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: a */
    public final void mo20549a() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.m21945a("%s : IAMraidContentLoader : destroyController", IAlog.m21943a(this));
        if (this.f18091c != null && (iAmraidWebViewController = this.f18208m) != null) {
            AbstractC8280e abstractC8280e = iAmraidWebViewController.f21622I;
            if (abstractC8280e != null && (adSession = abstractC8280e.f18458a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                AbstractC9183r.f21478b.postDelayed(new RunnableC8278c(abstractC8280e), 1000);
                abstractC8280e.f18458a = null;
                abstractC8280e.f18459b = null;
            }
            this.f18208m.mo21936e();
            this.f18208m = null;
        }
        super.mo20549a();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k, com.fyber.inneractive.sdk.interfaces.InterfaceC8262c
    public final void cancel() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.m21945a("%s : IAMraidContentLoader : destroyController", IAlog.m21943a(this));
        if (this.f18091c != null && (iAmraidWebViewController = this.f18208m) != null) {
            AbstractC8280e abstractC8280e = iAmraidWebViewController.f21622I;
            if (abstractC8280e != null && (adSession = abstractC8280e.f18458a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                AbstractC9183r.f21478b.postDelayed(new RunnableC8278c(abstractC8280e), 1000);
                abstractC8280e.f18458a = null;
                abstractC8280e.f18459b = null;
            }
            this.f18208m.mo21936e();
            this.f18208m = null;
        }
        this.f18099k.m20496a();
        IAlog.m21945a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.m21943a(this));
        AbstractC9183r.f21478b.removeCallbacks(this.f18100l);
        this.f18089a = null;
        this.f18090b = null;
        this.f18091c = null;
        this.f18092d = null;
        this.f18093e = null;
        this.f18094f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: d */
    public final InneractiveInfrastructureError mo20554d() {
        C8419a c8419a = this.f18098j;
        int i = 0;
        if (c8419a != null) {
            int i2 = this.f18097i;
            if (c8419a.f18732g) {
                i2 = c8419a.f18726a - i2;
            }
            i = (i2 == c8419a.f18726a ? c8419a.f18733h : 0) + (c8419a.f18727b * i2) + c8419a.f18729d;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, EnumC8125i.WEBVIEW_LOAD_TIMEOUT, new Exception("LoadTimeout after " + i + " ms"));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: e */
    public final String mo20555e() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: g */
    public final void mo20557g() {
        EnumC9277z enumC9277z;
        String str;
        String str2;
        InneractiveAdRequest inneractiveAdRequest = this.f18089a;
        C8172q0 c8172q0 = new C8172q0(inneractiveAdRequest == null ? this.f18094f : inneractiveAdRequest.getSelectedUnitConfig(), this.f18095g);
        this.f18091c = c8172q0;
        AbstractC9087e abstractC9087e = this.f18090b;
        C9088f c9088f = (C9088f) abstractC9087e;
        c8172q0.f18374b = c9088f;
        c8172q0.f18378f = this.f18096h;
        UnitDisplayType unitDisplayType = abstractC9087e != null ? c9088f.f21314n : null;
        EnumC9221c0 enumC9221c0 = EnumC9221c0.INLINE;
        if (unitDisplayType == null) {
            this.f18209n.mo20539a(null, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.EMPTY_UNIT_DISPLAY_TYPE, new Exception("Unit display type was not found")));
            return;
        }
        int i = AbstractC8173r.f18207a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            enumC9277z = EnumC9277z.ENABLED;
            InneractiveAdRequest inneractiveAdRequest2 = this.f18089a;
            if (inneractiveAdRequest2 == null || inneractiveAdRequest2.getAllowFullscreen()) {
                enumC9221c0 = EnumC9221c0.INTERSTITIAL;
            }
        } else {
            enumC9277z = EnumC9277z.ENABLED;
        }
        EnumC9221c0 enumC9221c1 = enumC9221c0;
        EnumC9277z enumC9277z2 = enumC9277z;
        AbstractC9087e abstractC9087e2 = this.f18090b;
        boolean z = (abstractC9087e2 == null || (str2 = ((C9088f) abstractC9087e2).f21327K) == null || str2.contains("iaNotifyLoadFinished")) ? false : true;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        boolean z2 = !unitDisplayType.isFullscreenUnit() || iAConfigManager.f17688t.f17862b.m20446a(true, "use_fraud_detection_fullscreen");
        try {
            EnumC9224d0 enumC9224d0 = EnumC9224d0.AD_CONTROLLED;
            Boolean boolMo20420c = ((C7985m) iAConfigManager.f17667K.m20432a(C7985m.class)).mo20420c(C12364a.f31324j);
            boolean zBooleanValue = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
            IAlog.m21945a("OMSDK AB %s", String.valueOf(zBooleanValue));
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(z2, enumC9221c1, enumC9277z2, enumC9224d0, z, zBooleanValue ? iAConfigManager.f17665I : null, this.f18095g);
            this.f18208m = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f18091c);
            this.f18208m.setAdRequest(this.f18089a);
            IAmraidWebViewController iAmraidWebViewController2 = this.f18208m;
            C8172q0 c8172q1 = (C8172q0) this.f18091c;
            c8172q1.getClass();
            iAmraidWebViewController2.setMuteMraidVideo(iAConfigManager.f17679k || c8172q1.f18378f);
            ((C8172q0) this.f18091c).f18206i = this.f18208m;
            AbstractC9087e abstractC9087e3 = this.f18090b;
            if (abstractC9087e3 != null) {
                UnitDisplayType unitDisplayType2 = ((C9088f) abstractC9087e3).f21314n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f18089a;
                boolean z3 = inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen();
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z3) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType2 != null && !unitDisplayType2.isFullscreenUnit()) {
                    if (unitDisplayType2 == UnitDisplayType.BANNER) {
                        sb2.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
                    } else {
                        sb2.append(" #iawrapper { position:unset !important; display: unset !important; }");
                    }
                }
                String string2 = sb2.toString();
                this.f18208m.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit() || UnitDisplayType.MRECT.equals(unitDisplayType));
                IAmraidWebViewController iAmraidWebViewController3 = this.f18208m;
                int i2 = AbstractC8013k.f17788a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                if (TextUtils.isEmpty(property)) {
                    str = "wv.inner-active.mobi/simpleM2M/";
                } else {
                    str = property + ".inner-active.mobi/simpleM2M/";
                }
                String str3 = str;
                String str4 = "" + ((C9088f) this.f18090b).f21327K;
                iAmraidWebViewController3.f21569f = this.f18209n;
                try {
                    iAmraidWebViewController3.mo22063h();
                    C9226e c9226e = new C9226e(iAmraidWebViewController3, str4, true, string, string2, str3);
                    iAmraidWebViewController3.f21578o = c9226e;
                    c9226e.m22052a().post(new RunnableC9138c(c9226e));
                } catch (Throwable th) {
                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_CONFIGURE_WEBVIEW, th);
                    InterfaceC9232g interfaceC9232g = iAmraidWebViewController3.f21569f;
                    if (interfaceC9232g != null) {
                        interfaceC9232g.mo20539a(iAmraidWebViewController3, inneractiveInfrastructureError);
                    }
                    iAmraidWebViewController3.mo22061b(true);
                }
            }
        } catch (Throwable th2) {
            m20552b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th2));
        }
    }
}
