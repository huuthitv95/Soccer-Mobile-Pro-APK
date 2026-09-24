package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.C7961e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.C8381h1;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9209z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import com.ironsource.C11341A5;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C7944r {

    /* JADX INFO: renamed from: a */
    public final C9209z0 f17640a;

    /* JADX INFO: renamed from: b */
    public Context f17641b;

    /* JADX INFO: renamed from: c */
    public String f17642c;

    /* JADX INFO: renamed from: d */
    public final boolean f17643d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7941o f17644e;

    /* JADX INFO: renamed from: i */
    public C8381h1 f17648i;

    /* JADX INFO: renamed from: k */
    public C9270v0 f17650k;

    /* JADX INFO: renamed from: l */
    public boolean f17651l;

    /* JADX INFO: renamed from: m */
    public EnumC8253m f17652m;

    /* JADX INFO: renamed from: f */
    public volatile boolean f17645f = false;

    /* JADX INFO: renamed from: h */
    public long f17647h = 0;

    /* JADX INFO: renamed from: j */
    public final ArrayList f17649j = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f17646g = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final boolean f17653n = IAConfigManager.f17654M.f17688t.f17862b.m20446a(false, "should_decode_url");

    public C7944r(boolean z, AbstractC8236x abstractC8236x) {
        this.f17643d = true;
        this.f17643d = z;
        this.f17640a = new C9209z0(abstractC8236x);
    }

    /* JADX INFO: renamed from: a */
    public static C7928b m20369a(String str, String str2, String str3) {
        return new C7928b(str, EnumC7943q.FAILED, str2, new C7942p(str3));
    }

    /* JADX INFO: renamed from: a */
    public static void m20370a(C7944r c7944r, String str, String str2, String str3, Exception exc) {
        if (!c7944r.f17643d) {
            c7944r.f17646g.add(new C7936j(str2, false, EnumC7943q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
            c7944r.m20371a(m20369a(str2, "followRedirects", "internal browser not usable"));
            return;
        }
        Intent intent = new Intent(c7944r.f17641b, (Class<?>) InneractiveInternalBrowserActivity.class);
        if (!TextUtils.isEmpty(str)) {
            InneractiveInternalBrowserActivity.setHtmlExtra(str);
        }
        intent.putExtra("extra_url", str2);
        intent.putExtra("spotId", str3);
        if (!(c7944r.f17641b instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            Context context = c7944r.f17641b;
            if (context != null) {
                context.startActivity(intent);
            }
            ArrayList arrayList = c7944r.f17646g;
            boolean z = exc == null;
            EnumC7943q enumC7943q = EnumC7943q.OPENED_IN_INTERNAL_BROWSER;
            arrayList.add(new C7936j(str2, z, enumC7943q, AbstractC9195v.m22025a(exc)));
            c7944r.m20371a(new C7928b(str2, enumC7943q, "followRedirects", null));
        } catch (ActivityNotFoundException unused) {
            c7944r.f17646g.add(new C7936j(str2, false, EnumC7943q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
            c7944r.m20371a(m20369a(str2, "followRedirects", "internal browser not registered"));
        }
    }

    /* JADX INFO: renamed from: a */
    public final C7928b m20371a(C7928b c7928b) {
        ArrayList arrayList = this.f17646g;
        c7928b.f17612f.clear();
        c7928b.f17612f.addAll(arrayList);
        c7928b.f17611e = System.currentTimeMillis() - this.f17647h;
        IAlog.m21945a("%s reporting result: %s", IAlog.m21943a(this), c7928b);
        AbstractC9183r.f21478b.post(new RunnableC7940n(this, c7928b));
        return c7928b;
    }

    /* JADX INFO: renamed from: a */
    public final C7928b m20372a(String str) {
        Uri uri;
        C9209z0 c9209z0;
        boolean z;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.m21945a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f17646g.add(new C7936j(str, false, null, "illegal uri"));
            return m20371a(m20369a(str, null, "illegal uri"));
        }
        if (this.f17649j.isEmpty()) {
            this.f17646g.add(new C7936j(str, false, null, "no click handlers found"));
            return m20371a(m20369a(str, null, "no click handlers found"));
        }
        for (AbstractC7927a abstractC7927a : this.f17649j) {
            if (abstractC7927a.mo20367a(uri, this)) {
                Context context = this.f17641b;
                C7928b c7928bMo20365a = context != null ? abstractC7927a.mo20365a(context, uri, this.f17646g) : null;
                if (c7928bMo20365a != null) {
                    if (c7928bMo20365a.f17607a == EnumC7943q.OPEN_GOOGLE_STORE && !(z = (c9209z0 = this.f17640a).f21517c) && !z) {
                        c9209z0.f21517c = true;
                        c9209z0.f21516b = System.currentTimeMillis();
                        C7961e c7961e = IAConfigManager.f17654M.f17691w.f17889b;
                        if (c7961e != null) {
                            c7961e.f17716a.add(c9209z0);
                        }
                    }
                    return m20371a(c7928bMo20365a);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20373a(Context context, String str, InterfaceC7941o interfaceC7941o, C9270v0 c9270v0, boolean z, EnumC8253m enumC8253m, String str2) {
        Uri uri;
        this.f17641b = context;
        this.f17642c = str;
        this.f17644e = interfaceC7941o;
        this.f17651l = z;
        this.f17647h = System.currentTimeMillis();
        this.f17650k = c9270v0;
        this.f17652m = enumC8253m;
        C7928b c7928bM20372a = m20372a(this.f17642c);
        IAlog.m21948d("%s EVENT_CLICK %s %s", "VAST_EVENT", c7928bM20372a, str);
        if (c7928bM20372a == null) {
            String str3 = this.f17642c;
            try {
                try {
                    if (this.f17653n) {
                        uri = !AbstractC9154h0.m21967c(str3) ? Uri.parse(URLDecoder.decode(str3, C11341A5.f23802O)) : Uri.parse(str3);
                    } else {
                        uri = AbstractC9154h0.m21967c(str3) ? Uri.parse(URLDecoder.decode(str3, C11341A5.f23802O)) : Uri.parse(str3);
                    }
                } catch (Exception unused) {
                    IAlog.m21945a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (m20374a(uri)) {
                    IAlog.m21945a("%sfollowRedirects: Fetching uri: %s", IAlog.m21943a(this), uri.toString());
                    String string = uri.toString();
                    C8381h1 c8381h1 = new C8381h1(new C7939m(this, string, str2), string);
                    this.f17648i = c8381h1;
                    IAConfigManager.f17654M.f17686r.m20768a(c8381h1);
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    return;
                }
                IAlog.m21946b("%sfailed followRedirects %s", IAlog.m21943a(this), e);
                this.f17646g.add(new C7936j(str3, false, EnumC7943q.INTERNAL_REDIRECT, null));
                m20371a(new C7928b(str3, EnumC7943q.FAILED, "followRedirects", e));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20374a(Uri uri) {
        if (uri == null) {
            IAlog.m21945a("%s followRedirects: Got a url which is not valid: null", IAlog.m21943a(this));
            this.f17646g.add(new C7936j(null, false, null, "Invalid url"));
            m20371a(m20369a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTP) || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        IAlog.m21945a("%scould not follow redirects for scheme: %s", IAlog.m21943a(this), uri.getScheme());
        IAlog.m21945a("%sfull url: %s", IAlog.m21943a(this), uri.toString());
        this.f17646g.add(new C7936j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        m20371a(m20369a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }
}
