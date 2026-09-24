package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1606l0;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1685p8;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1795v4;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1772t;
import com.applovin.impl.C1789u7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.C1834z7;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.adview.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1493b extends AbstractC1606l0 {

    /* JADX INFO: renamed from: j */
    private static final Set f1082j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k */
    private static final Object f1083k = new Object();

    /* JADX INFO: renamed from: c */
    private final C1768p f1084c;

    /* JADX INFO: renamed from: d */
    private final C1748l f1085d;

    /* JADX INFO: renamed from: e */
    private AbstractC1736b f1086e;

    /* JADX INFO: renamed from: f */
    private boolean f1087f;

    /* JADX INFO: renamed from: g */
    private boolean f1088g;

    /* JADX INFO: renamed from: h */
    private final List f1089h;

    /* JADX INFO: renamed from: i */
    private final Object f1090i;

    /* JADX INFO: renamed from: com.applovin.impl.adview.b$a */
    class a extends AbstractC1795v4 {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1795v4
        /* JADX INFO: renamed from: a */
        protected Map mo1977a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public C1493b(C1494c c1494c, C1748l c1748l, Context context) {
        super(context);
        this.f1089h = new ArrayList();
        this.f1090i = new Object();
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f1085d = c1748l;
        this.f1084c = c1748l.m4782Q();
        Integer num = (Integer) c1748l.m4801a(C1831z4.f3741I6);
        if (num.intValue() > 0) {
            synchronized (f1083k) {
                Set set = f1082j;
                set.add(this);
                AbstractC1701q7.m4052a("AdWebView", set.size(), num.intValue(), c1748l.m4764E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(c1494c != null ? c1494c : new a());
        setWebChromeClient(new C1772t(c1494c != null ? c1494c.m2012d() : null, c1748l));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (AbstractC1677p0.m3813g() && ((Boolean) c1748l.m4801a(C1831z4.f3910d6)).booleanValue()) {
            setWebViewRenderProcessClient(new C1495d(c1748l).m2014a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C1493b.m1997a(view, motionEvent);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f$0.m1996a(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private String m1994a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m1995a(String str, String str2, String str3, C1748l c1748l, C1711r7 c1711r7) {
        String strM1994a = m1994a(str3, str);
        if (StringUtils.isValidString(strM1994a)) {
            if (C1768p.m5160a()) {
                this.f1084c.m5171a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strM1994a);
            }
            loadDataWithBaseURL(str2, strM1994a, "text/html", null, "");
            return;
        }
        String strM1994a2 = m1994a((String) c1748l.m4801a(C1831z4.f3811R4), str);
        if (!StringUtils.isValidString(strM1994a2)) {
            if (C1768p.m5160a()) {
                this.f1084c.m5171a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
            }
            loadUrl(str);
            return;
        }
        if (c1711r7.m4244r1() && c1711r7.isOpenMeasurementEnabled()) {
            strM1994a2 = c1748l.m4831g0().m3127a(strM1994a2, AbstractC1568h2.m2787a((AppLovinAdImpl) c1711r7));
        }
        if (C1768p.m5160a()) {
            this.f1084c.m5171a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strM1994a2);
        }
        loadDataWithBaseURL(str2, strM1994a2, "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m1996a(View view) {
        if (!C1768p.m5160a()) {
            return true;
        }
        this.f1084c.m5171a("AdWebView", "Received a LongClick event.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1997a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m1998b() {
        synchronized (this.f1090i) {
            Iterator it = this.f1089h.iterator();
            while (it.hasNext()) {
                AbstractC1685p8.m3906a(this, (String) it.next(), "AdWebView", this.f1085d);
            }
            this.f1089h.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1999a(AbstractC1736b abstractC1736b) {
        if (this.f1087f) {
            C1768p.m5167h("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.f1086e = abstractC1736b;
        try {
            applySettings(abstractC1736b);
            if (AbstractC1701q7.m4065a(abstractC1736b.getSize())) {
                setVisibility(0);
            }
            abstractC1736b.m4520a(SystemClock.elapsedRealtime());
            if (abstractC1736b instanceof C1735a) {
                loadDataWithBaseURL(abstractC1736b.m4543k(), ((C1735a) abstractC1736b).m4440a1(), "text/html", null, "");
                if (C1768p.m5160a()) {
                    this.f1084c.m5171a("AdWebView", "AppLovinAd rendered");
                    return;
                }
                return;
            }
            if (abstractC1736b instanceof C1711r7) {
                C1711r7 c1711r7 = (C1711r7) abstractC1736b;
                C1789u7 c1789u7M4228a1 = c1711r7.m4228a1();
                if (c1789u7M4228a1 == null) {
                    if (C1768p.m5160a()) {
                        this.f1084c.m5171a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                C1834z7 c1834z7M5318e = c1789u7M4228a1.m5318e();
                Uri uriM5761c = c1834z7M5318e.m5761c();
                String string = uriM5761c != null ? uriM5761c.toString() : "";
                String strM5760b = c1834z7M5318e.m5760b();
                String strM4230c1 = c1711r7.m4230c1();
                if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strM5760b)) {
                    if (C1768p.m5160a()) {
                        this.f1084c.m5174b("AdWebView", "Unable to load companion ad. No resources provided.");
                        return;
                    }
                    return;
                }
                if (c1834z7M5318e.m5762d() == C1834z7.a.STATIC) {
                    if (C1768p.m5160a()) {
                        this.f1084c.m5171a("AdWebView", "Rendering WebView for static VAST ad");
                    }
                    String strM1994a = m1994a((String) this.f1085d.m4801a(C1831z4.f3803Q4), string);
                    if (c1711r7.m4244r1() && c1711r7.isOpenMeasurementEnabled() && c1711r7.m4245s1()) {
                        strM1994a = this.f1085d.m4831g0().m3127a(strM1994a, AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
                    }
                    loadDataWithBaseURL(abstractC1736b.m4543k(), strM1994a, "text/html", null, "");
                    return;
                }
                if (c1834z7M5318e.m5762d() == C1834z7.a.HTML) {
                    if (!StringUtils.isValidString(strM5760b)) {
                        if (StringUtils.isValidString(string)) {
                            if (C1768p.m5160a()) {
                                this.f1084c.m5171a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                            }
                            m1995a(string, abstractC1736b.m4543k(), strM4230c1, this.f1085d, c1711r7);
                            return;
                        }
                        return;
                    }
                    String strM1994a2 = m1994a(strM4230c1, strM5760b);
                    String str = StringUtils.isValidString(strM1994a2) ? strM1994a2 : strM5760b;
                    if (C1768p.m5160a()) {
                        this.f1084c.m5171a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                    }
                    loadDataWithBaseURL(abstractC1736b.m4543k(), str, "text/html", null, "");
                    return;
                }
                String str2 = string;
                if (c1834z7M5318e.m5762d() != C1834z7.a.IFRAME) {
                    if (C1768p.m5160a()) {
                        this.f1084c.m5174b("AdWebView", "Failed to render VAST companion ad of invalid type");
                        return;
                    }
                    return;
                }
                if (StringUtils.isValidString(str2)) {
                    if (C1768p.m5160a()) {
                        this.f1084c.m5171a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                    }
                    m1995a(str2, abstractC1736b.m4543k(), strM4230c1, this.f1085d, c1711r7);
                } else if (StringUtils.isValidString(strM5760b)) {
                    String strM1994a3 = m1994a(strM4230c1, strM5760b);
                    String str3 = StringUtils.isValidString(strM1994a3) ? strM1994a3 : strM5760b;
                    if (C1768p.m5160a()) {
                        this.f1084c.m5171a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                    }
                    loadDataWithBaseURL(abstractC1736b.m4543k(), str3, "text/html", null, "");
                }
            }
        } catch (Throwable th) {
            throw new RuntimeException("Unable to render AppLovin ad (" + (abstractC1736b != null ? String.valueOf(abstractC1736b.getAdIdNumber()) : AbstractJsonLexerKt.NULL) + ") - " + th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2000a(String str) {
        if (!((Boolean) this.f1085d.m4801a(C1831z4.f3677A6)).booleanValue()) {
            AbstractC1685p8.m3906a(this, str, "AdWebView", this.f1085d);
        } else {
            if (this.f1088g) {
                AbstractC1685p8.m3906a(this, str, "AdWebView", this.f1085d);
                return;
            }
            synchronized (this.f1089h) {
                this.f1089h.add(str);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f1087f = true;
        this.f1088g = false;
        super.destroy();
    }

    public AbstractC1736b getCurrentAd() {
        return this.f1086e;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.f1088g = z;
        if (z && ((Boolean) this.f1085d.m4801a(C1831z4.f3677A6)).booleanValue()) {
            m1998b();
        }
    }
}
