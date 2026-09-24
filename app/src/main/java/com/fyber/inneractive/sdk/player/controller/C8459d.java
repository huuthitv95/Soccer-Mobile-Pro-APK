package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.endcard.C8111q;
import com.fyber.inneractive.sdk.flow.vast.C8224a;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.renderers.C9070n;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.RunnableC9138c;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import com.fyber.inneractive.sdk.web.C9217b;
import com.fyber.inneractive.sdk.web.C9226e;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.EnumC9221c0;
import com.fyber.inneractive.sdk.web.EnumC9224d0;
import com.fyber.inneractive.sdk.web.EnumC9277z;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8459d {

    /* JADX INFO: renamed from: a */
    public AbstractC9240i1 f18827a;

    /* JADX INFO: renamed from: b */
    public final EnumC9221c0 f18828b;

    /* JADX INFO: renamed from: c */
    public final UnitDisplayType f18829c;

    /* JADX INFO: renamed from: d */
    public final EnumC9277z f18830d;

    /* JADX INFO: renamed from: e */
    public final boolean f18831e;

    public C8459d(Context context, C8224a c8224a, EnumC8300i enumC8300i, C8111q c8111q) {
        this.f18828b = EnumC9221c0.INLINE;
        EnumC9277z enumC9277z = EnumC9277z.ENABLED;
        this.f18830d = enumC9277z;
        UnitDisplayType unitDisplayType = c8224a.f18329a;
        boolean z = c8224a.f18330b;
        this.f18829c = unitDisplayType;
        this.f18831e = z;
        int i = AbstractC8457c.f18824a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            this.f18830d = enumC9277z;
            if (z) {
                this.f18828b = EnumC9221c0.INTERSTITIAL;
            }
        } else {
            this.f18830d = enumC9277z;
        }
        try {
            UnitDisplayType unitDisplayType2 = c8224a.f18329a;
            boolean z2 = !(unitDisplayType2 == null || unitDisplayType2.isFullscreenUnit()) || IAConfigManager.f17654M.f17688t.f17862b.m20446a(true, "use_fraud_detection_fullscreen");
            AbstractC9240i1 c9217b = enumC8300i == EnumC8300i.FMP_End_Card ? new C9217b(c8111q, z2) : new IAmraidWebViewController(z2, this.f18828b, this.f18830d, EnumC9224d0.AD_CONTROLLED, true, null, null);
            this.f18827a = c9217b;
            C9248m c9248m = c9217b.f21565b;
            if (c9248m != null) {
                int i2 = AbstractC8457c.f18825b[enumC8300i.ordinal()];
                if (i2 == 1) {
                    c9248m.setId(C7809R.id.ia_inneractive_vast_endcard_static);
                } else if (i2 == 2 || i2 == 3) {
                    c9248m.setId(C7809R.id.ia_inneractive_vast_endcard_html);
                } else if (i2 == 4) {
                    c9248m.setId(C7809R.id.ia_inneractive_vast_endcard_iframe);
                }
            }
            AbstractC9240i1 abstractC9240i1 = this.f18827a;
            C9248m c9248m2 = abstractC9240i1.f21565b;
            if (c9248m2 != null) {
                AbstractC9166l0.f21461a.m21982a(context, c9248m2, abstractC9240i1);
            }
            AbstractC9240i1 abstractC9240i2 = this.f18827a;
            C9248m c9248m3 = abstractC9240i2.f21565b;
            if (c9248m3 != null) {
                c9248m3.setTapListener(abstractC9240i2);
            }
            C9155h1 c9155h1M21869a = C9070n.m21869a(c8224a.f18331c, c8224a.f18332d, c8224a.f18333e);
            this.f18827a.setAdDefaultSize(c9155h1M21869a.f21454a, c9155h1M21869a.f21455b);
        } catch (Throwable unused) {
            this.f18827a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20869a() {
        C9248m c9248m;
        AbstractC9240i1 abstractC9240i1 = this.f18827a;
        if (abstractC9240i1 == null || (c9248m = abstractC9240i1.f21565b) == null) {
            return;
        }
        WebSettings settings = c9248m.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m20870a(String str, InterfaceC9232g interfaceC9232g, boolean z) {
        String str2;
        AbstractC8236x abstractC8236x;
        if (this.f18827a == null || TextUtils.isEmpty(str)) {
            interfaceC9232g.mo20539a(null, new InneractiveInfrastructureError(InneractiveErrorCode.UNSPECIFIED, EnumC8125i.NO_WEBVIEW_CONTROLLER_AVAILABLE));
            return;
        }
        AbstractC9240i1 abstractC9240i1 = this.f18827a;
        UnitDisplayType unitDisplayType = this.f18829c;
        boolean z2 = true;
        abstractC9240i1.setAutoplayMRAIDVideos(unitDisplayType != null && unitDisplayType.isFullscreenUnit());
        this.f18827a.setCenteringTagsRequired(false);
        AbstractC9240i1 abstractC9240i2 = this.f18827a;
        if (abstractC9240i2 == null || (abstractC8236x = abstractC9240i2.f21582s) == null || (!IAConfigManager.f17654M.f17679k && !abstractC8236x.f18378f)) {
            z2 = false;
        }
        abstractC9240i2.setMuteMraidVideo(z2);
        AbstractC9240i1 abstractC9240i3 = this.f18827a;
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            str2 = "wv.inner-active.mobi/simpleM2M/";
        } else {
            str2 = property + ".inner-active.mobi/simpleM2M/";
        }
        String str3 = str2;
        UnitDisplayType unitDisplayType2 = this.f18829c;
        boolean z3 = this.f18831e;
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z3) {
            sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        String string = sb.toString();
        UnitDisplayType unitDisplayType3 = this.f18829c;
        StringBuilder sb2 = new StringBuilder();
        if (unitDisplayType3 != null && !unitDisplayType3.isFullscreenUnit()) {
            if (unitDisplayType3 == UnitDisplayType.BANNER) {
                sb2.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb2.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        String string2 = sb2.toString();
        abstractC9240i3.f21569f = interfaceC9232g;
        try {
            abstractC9240i3.mo22063h();
            C9226e c9226e = new C9226e(abstractC9240i3, str, z, string, string2, str3);
            abstractC9240i3.f21578o = c9226e;
            c9226e.m22052a().post(new RunnableC9138c(c9226e));
        } catch (Throwable th) {
            abstractC9240i3.m22059a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_CONFIGURE_WEBVIEW, th));
        }
    }
}
