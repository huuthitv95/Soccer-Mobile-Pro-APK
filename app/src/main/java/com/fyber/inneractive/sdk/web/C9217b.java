package com.fyber.inneractive.sdk.web;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.endcard.C8110p;
import com.fyber.inneractive.sdk.flow.endcard.C8111q;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import com.fyber.inneractive.sdk.util.AbstractC9181q0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ViewOnLongClickListenerC9178p0;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C9217b extends AbstractC9240i1 {

    /* JADX INFO: renamed from: N */
    public final C8111q f21523N;

    public C9217b(C8111q c8111q, boolean z) {
        super(z, EnumC9221c0.INTERSTITIAL, null);
        this.f21523N = c8111q;
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public final void mo22044a() {
        super.mo22044a();
        if (this.f21569f != null) {
            this.f21569f.mo20539a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.WEBVIEW_FMP_ENDCARD_ERROR, new WebViewRendererProcessHasGoneError()));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public final void mo22045a(WebView webView) {
        String string;
        if (webView == null || this.f21523N == null) {
            return;
        }
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new ViewOnLongClickListenerC9178p0());
        C8111q c8111q = this.f21523N;
        C8110p c8110p = (C8110p) c8111q.f18048d.m20510f();
        c8110p.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            AbstractC9140c1.m21959a(jSONObject, "name", c8110p.f18042j);
            JSONArray jSONArray = new JSONArray();
            String str = c8110p.f18043k;
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(str);
            }
            AbstractC9140c1.m21959a(jSONObject, "icons", jSONArray);
            string = jSONObject.toString();
        } catch (Exception e) {
            IAlog.m21944a("%s FMP End-Card JSON error: %s", e, c8110p.f17980a, e.getMessage());
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            IAlog.m21950f("%s FMP End-Card JSON required", c8111q.f18045a);
            return;
        }
        AbstractC9181q0.m22008a(webView, "loadAssets(" + string + ");");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: a */
    public final boolean mo21935a(String str, C9152g1 c9152g1) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            if (str.toLowerCase(locale).startsWith("fmpendcard://".toLowerCase(locale))) {
                C8111q c8111q = this.f21523N;
                if (c8111q != null) {
                    InterfaceC9232g interfaceC9232g = this.f21569f;
                    InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
                    Uri uri = Uri.parse(str);
                    String authority = uri != null ? uri.getAuthority() : null;
                    if (!TextUtils.isEmpty(authority)) {
                        authority.getClass();
                        authority.hashCode();
                        switch (authority) {
                            case "success":
                                String queryParameter = uri.getQueryParameter("version");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    c8111q.f18047c = queryParameter;
                                }
                                InterfaceC9232g interfaceC9232g2 = this.f21569f;
                                if (interfaceC9232g2 != null) {
                                    interfaceC9232g2.mo20538a(this);
                                    break;
                                }
                                break;
                            case "failure":
                                String queryParameter2 = uri.getQueryParameter("version");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    c8111q.f18047c = queryParameter2;
                                }
                                String queryParameter3 = uri.getQueryParameter("error");
                                if (interfaceC9232g != null) {
                                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        inneractiveInfrastructureError.setCause(new Exception(queryParameter3));
                                    }
                                    interfaceC9232g.mo20539a(this, inneractiveInfrastructureError);
                                    break;
                                }
                                break;
                            case "click":
                                if (interfaceC9243j1 != null) {
                                    C8293b c8293b = c8111q.f18046b;
                                    C8093k c8093k = c8293b.f18513o;
                                    if (c8093k != null) {
                                        AbstractC8084b abstractC8084bM20530a = c8093k.f18001b.m20530a();
                                        str2 = c8093k.f18000a.f18383e.f18500b;
                                        AbstractC8085c abstractC8085c = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Other);
                                        if (abstractC8085c == null && (abstractC8085c = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Html)) == null && (abstractC8085c = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Iframe)) == null) {
                                            abstractC8085c = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Static);
                                        }
                                        if (abstractC8084bM20530a != null && abstractC8084bM20530a.mo20514j() && abstractC8085c != null) {
                                            String str3 = abstractC8085c.f17988g.f18521g;
                                            if (!TextUtils.isEmpty(str3)) {
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str2 = c8293b.f18500b;
                                    }
                                    interfaceC9243j1.mo20920a(str2, c9152g1);
                                    break;
                                }
                                break;
                        }
                    } else if (interfaceC9232g != null) {
                        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                        if (!TextUtils.isEmpty("empty type")) {
                            inneractiveInfrastructureError2.setCause(new Exception("empty type"));
                        }
                        interfaceC9232g.mo20539a(this, inneractiveInfrastructureError2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: b */
    public final void mo22046b() {
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: c */
    public final void mo22047c() {
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: d */
    public final void mo22048d() {
        if (this.f21523N == null || this.f21569f == null) {
            return;
        }
        this.f21569f.mo20539a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.WEBVIEW_FMP_ENDCARD_ERROR));
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: f */
    public final AbstractC8280e mo21937f() {
        return null;
    }
}
