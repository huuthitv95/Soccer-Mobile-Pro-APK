package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.web.AbstractC9238i;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import com.fyber.inneractive.sdk.web.C9226e;
import com.iab.omid.library.fyber.ScriptInjector;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9141d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object[] f21441a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9226e f21442b;

    public RunnableC9141d(C9226e c9226e) {
        this.f21442b = c9226e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        C9226e c9226e;
        boolean zM20446a;
        String strM21999b;
        C8271e c8271e;
        AbstractC8236x abstractC8236x;
        AbstractC9087e abstractC9087e;
        boolean z;
        String string;
        StringBuilder sb;
        C9226e c9226e2 = this.f21442b;
        Object[] objArr = this.f21441a;
        c9226e2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string2 = c9226e2.f21546g;
        char c2 = 0;
        if (c9226e2.f21547h) {
            AbstractC9238i abstractC9238i = c9226e2.f21551l;
            String str = c9226e2.f21548i;
            String str2 = c9226e2.f21549j;
            AbstractC9240i1 abstractC9240i1 = (AbstractC9240i1) abstractC9238i;
            abstractC9240i1.getClass();
            StringBuilder sb2 = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            if (TextUtils.isEmpty(string2)) {
                IAlog.m21945a("loadHtml called with an empty HTML!", new Object[0]);
                string2 = null;
            } else if (abstractC9240i1.f21619F) {
                String strM21999b2 = AbstractC9174o.m21999b("ia_js_load_monitor.txt");
                if (TextUtils.isEmpty(strM21999b2)) {
                    c2 = 0;
                    c = 1;
                } else {
                    sb2.append(strM21999b2);
                    sb2.append("<script> window.iaPreCachedAd = true; </script>");
                    IAConfigManager iAConfigManager = IAConfigManager.f17654M;
                    zM20446a = iAConfigManager.f17688t.f17862b.m20446a(false, "use_js_inline");
                    c = 1;
                    c2 = 0;
                    if (zM20446a || iAConfigManager.f17661E.f17580b == null) {
                        sb2.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                    } else {
                        sb2.append("<script type=\"text/javascript\">");
                        sb2.append(iAConfigManager.f17661E.f17580b);
                        sb2.append("</script>");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sb2.append(str);
                    }
                    sb2.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                    if (!TextUtils.isEmpty(str2)) {
                        sb2.append(str2);
                    }
                    sb2.append("</style><body id=\"iaBody\">");
                    if (abstractC9240i1.f21615B && abstractC9240i1.mo22076m()) {
                        if (zM20446a || iAConfigManager.f17661E.f17581c == null) {
                            sb2.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb2.append("<style type=\"text/css\">");
                            sb2.append(iAConfigManager.f17661E.f17581c);
                            sb2.append("</style>");
                        }
                        if (zM20446a || iAConfigManager.f17661E.f17582d == null) {
                            sb2.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb2.append("<script type=\"text/javascript\">");
                            sb2.append(iAConfigManager.f17661E.f17582d);
                            sb2.append("</script>");
                        }
                    }
                    strM21999b = AbstractC9174o.m21999b("ia_mraid_bridge.txt");
                    if (!TextUtils.isEmpty(strM21999b)) {
                        sb2.append("<div id='iaScriptBr' style='display:none;'>");
                        sb2.append(strM21999b);
                        sb2.append("</div>");
                        if (IAlog.f21426a >= 2) {
                            sb2.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                        }
                    }
                    sb2.append(string2);
                    sb2.append("</body></html>");
                    c8271e = abstractC9240i1.f21621H;
                    if (c8271e != null) {
                        abstractC8236x = abstractC9240i1.f21582s;
                        if (abstractC8236x != null) {
                            abstractC9087e = abstractC8236x.f18374b;
                            if (abstractC9087e == null && abstractC9087e.f21297G) {
                                z = true;
                            } else {
                                z = false;
                            }
                            string = sb2.toString();
                            if (z) {
                                sb = new StringBuilder();
                                if (!TextUtils.isEmpty(c8271e.f18435c)) {
                                    sb.append(c8271e.f18435c);
                                }
                                if (!TextUtils.isEmpty(c8271e.f18436d)) {
                                    sb.append(c8271e.f18436d);
                                }
                                string = ScriptInjector.injectScriptContentIntoHtml(sb.toString(), string);
                            }
                            if (TextUtils.isEmpty(c8271e.f18434b)) {
                                string2 = string;
                            } else {
                                string2 = ScriptInjector.injectScriptContentIntoHtml(c8271e.f18434b, string);
                            }
                        }
                    } else {
                        string2 = sb2.toString();
                    }
                }
                string2 = null;
            } else {
                sb2.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager2 = IAConfigManager.f17654M;
                zM20446a = iAConfigManager2.f17688t.f17862b.m20446a(false, "use_js_inline");
                c = 1;
                c2 = 0;
                if (zM20446a) {
                    sb2.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                } else {
                    sb2.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                }
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                }
                sb2.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(str2);
                }
                sb2.append("</style><body id=\"iaBody\">");
                if (abstractC9240i1.f21615B) {
                    if (zM20446a) {
                        sb2.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    } else {
                        sb2.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    }
                    if (zM20446a) {
                        sb2.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    } else {
                        sb2.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    }
                }
                strM21999b = AbstractC9174o.m21999b("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(strM21999b)) {
                    sb2.append("<div id='iaScriptBr' style='display:none;'>");
                    sb2.append(strM21999b);
                    sb2.append("</div>");
                    if (IAlog.f21426a >= 2) {
                        sb2.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb2.append(string2);
                sb2.append("</body></html>");
                c8271e = abstractC9240i1.f21621H;
                if (c8271e != null) {
                    abstractC8236x = abstractC9240i1.f21582s;
                    if (abstractC8236x != null) {
                        string2 = null;
                    } else {
                        abstractC9087e = abstractC8236x.f18374b;
                        if (abstractC9087e == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        string = sb2.toString();
                        if (z) {
                            sb = new StringBuilder();
                            if (!TextUtils.isEmpty(c8271e.f18435c)) {
                                sb.append(c8271e.f18435c);
                            }
                            if (!TextUtils.isEmpty(c8271e.f18436d)) {
                                sb.append(c8271e.f18436d);
                            }
                            string = ScriptInjector.injectScriptContentIntoHtml(sb.toString(), string);
                        }
                        if (TextUtils.isEmpty(c8271e.f18434b)) {
                            string2 = ScriptInjector.injectScriptContentIntoHtml(c8271e.f18434b, string);
                        } else {
                            string2 = string;
                        }
                    }
                } else {
                    string2 = sb2.toString();
                }
            }
            AbstractC9238i abstractC9238i2 = c9226e2.f21551l;
            abstractC9238i2.getClass();
            String strM21943a = IAlog.m21943a(abstractC9238i2);
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            Object[] objArr2 = new Object[2];
            objArr2[c2] = strM21943a;
            objArr2[c] = lValueOf;
            IAlog.m21945a("%sbuild html string took %d msec", objArr2);
            c9226e = this.f21442b;
            if (c9226e.f21545f) {
                return;
            }
            c9226e.f21542c = new RunnableC9144e(c9226e, string2);
            c9226e.m22052a().post(this.f21442b.f21542c);
        }
        c = 1;
        AbstractC9238i abstractC9238i3 = c9226e2.f21551l;
        abstractC9238i3.getClass();
        String strM21943a2 = IAlog.m21943a(abstractC9238i3);
        Long lValueOf2 = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        Object[] objArr3 = new Object[2];
        objArr3[c2] = strM21943a2;
        objArr3[c] = lValueOf2;
        IAlog.m21945a("%sbuild html string took %d msec", objArr3);
        c9226e = this.f21442b;
        if (c9226e.f21545f) {
            return;
        }
        c9226e.f21542c = new RunnableC9144e(c9226e, string2);
        c9226e.m22052a().post(this.f21442b.f21542c);
    }
}
