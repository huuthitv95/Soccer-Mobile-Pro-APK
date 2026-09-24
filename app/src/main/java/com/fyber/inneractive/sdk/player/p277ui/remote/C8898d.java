package com.fyber.inneractive.sdk.player.p277ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.events.AbstractC8371a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.remoteui.C9261b;
import com.fyber.inneractive.sdk.web.remoteui.InterfaceC9260a;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.remote.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8898d implements InterfaceC9260a, InterfaceC8895a {

    /* JADX INFO: renamed from: a */
    public InterfaceC9260a f20924a;

    /* JADX INFO: renamed from: b */
    public final C9261b f20925b;

    /* JADX INFO: renamed from: c */
    public final C8219t0 f20926c;

    /* JADX INFO: renamed from: d */
    public final C8899e f20927d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8890n f20928e;

    /* JADX INFO: renamed from: f */
    public final String f20929f;

    /* JADX INFO: renamed from: i */
    public boolean f20932i;

    /* JADX INFO: renamed from: j */
    public C8121g f20933j;

    /* JADX INFO: renamed from: g */
    public boolean f20930g = false;

    /* JADX INFO: renamed from: h */
    public boolean f20931h = false;

    /* JADX INFO: renamed from: k */
    public final RunnableC8896b f20934k = new RunnableC8896b(this);

    /* JADX INFO: renamed from: l */
    public final RunnableC8897c f20935l = new RunnableC8897c(this);

    /* JADX INFO: renamed from: m */
    public boolean f20936m = false;

    /* JADX INFO: renamed from: n */
    public boolean f20937n = false;

    public C8898d(Context context, C8219t0 c8219t0, String str) {
        this.f20926c = c8219t0;
        this.f20929f = str;
        C9261b c9261b = new C9261b();
        this.f20925b = c9261b;
        this.f20927d = new C8899e(this);
        c9261b.setCommandHandler(this);
        c9261b.setResultFailureListener(this);
        c9261b.setCommandHandler(this);
        this.f20933j = new C8121g(context, true, c8219t0 != null ? c8219t0.f18373a : null, m21464b(), null);
    }

    /* JADX INFO: renamed from: a */
    public final void m21462a() {
        this.f20931h = true;
        this.f20928e = null;
        C8899e c8899e = this.f20927d;
        c8899e.f20939b.clear();
        c8899e.f20938a = null;
        IAlog.m21945a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        AbstractC9183r.f21478b.removeCallbacks(this.f20934k);
        this.f20925b.setVisibility(8);
        this.f20925b.setUiReady(false);
        AbstractC9195v.m22027a(this.f20925b);
        this.f20925b.destroy();
        this.f20933j = null;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.InterfaceC9260a
    /* JADX INFO: renamed from: a */
    public final void mo21463a(EnumC8372b enumC8372b, String str, boolean z, HashMap map) {
        HashMap map2;
        IAlog.m21945a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        AbstractC9183r.f21478b.removeCallbacks(this.f20934k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f20929f : (String) map.get("failedURL");
        if (z) {
            if (m21464b() != null) {
                m21464b().f21299I = false;
            }
            m21462a();
            EnumC8415t enumC8415t = EnumC8415t.VAST_ERROR_DVC_FAILURE;
            C8219t0 c8219t0 = this.f20926c;
            AbstractC8371a.m20741a(enumC8415t, enumC8372b, c8219t0 != null ? c8219t0.f18373a : null, m21464b(), str, str2, Boolean.valueOf(this.f20932i));
            map2 = map;
        } else {
            EnumC8415t enumC8415t2 = EnumC8415t.VAST_ERROR_DVC_FAILURE;
            String strName = enumC8372b.name();
            C8219t0 c8219t1 = this.f20926c;
            map2 = map;
            AbstractC8371a.m20742a(enumC8415t2, strName, str2, c8219t1 != null ? c8219t1.f18373a : null, m21464b(), map2, Boolean.valueOf(this.f20932i));
        }
        InterfaceC9260a interfaceC9260a = this.f20924a;
        if (interfaceC9260a != null) {
            interfaceC9260a.mo21463a(enumC8372b, str, z, map2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.fyber.inneractive.sdk.player.p277ui.remote.InterfaceC8895a
    /* JADX INFO: renamed from: a */
    public final void mo21461a(String str, HashMap map) {
        C8898d c8898d;
        C8121g c8121g;
        C9152g1 lastClickedLocation = this.f20925b.getLastClickedLocation();
        C8899e c8899e = this.f20927d;
        c8899e.getClass();
        str.getClass();
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1965090009:
                if (str.equals("clickSkip")) {
                    b = 0;
                }
                break;
            case -1744940703:
                if (str.equals("expandCollapseClick")) {
                    b = 1;
                }
                break;
            case -1379096487:
                if (str.equals("appInfoClick")) {
                    b = 2;
                }
                break;
            case -1351774483:
                if (str.equals("shouldSkipUpdateUi.true")) {
                    b = 3;
                }
                break;
            case -866863745:
                if (str.equals("onGeneralError")) {
                    b = 4;
                }
                break;
            case -841999016:
                if (str.equals("ctaClick")) {
                    b = 5;
                }
                break;
            case -791299859:
                if (str.equals("isSkipEnabled.false")) {
                    b = 6;
                }
                break;
            case -671397037:
                if (str.equals("clickMuteUnmute")) {
                    b = 7;
                }
                break;
            case -505134137:
                if (str.equals("DOMLoaded")) {
                    b = 8;
                }
                break;
            case -315413572:
                if (str.equals("adIdentifierClick")) {
                    b = 9;
                }
                break;
            case 1031220132:
                if (str.equals("shouldSkipUpdateUi.false")) {
                    b = 10;
                }
                break;
            case 1221833860:
                if (str.equals("isSkipEnabled.true")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1696642316:
                if (str.equals("onVideoClick")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 1812159227:
                if (str.equals("onResourceError")) {
                    b = Ascii.f22490CR;
                }
                break;
        }
        switch (b) {
            case 0:
                c8899e.m21465a(6, lastClickedLocation);
                break;
            case 1:
                c8899e.m21465a(5, lastClickedLocation);
                break;
            case 2:
                c8899e.m21465a(10, lastClickedLocation);
                break;
            case 3:
                C8898d c8898d2 = c8899e.f20938a;
                if (c8898d2 != null) {
                    c8898d2.f20936m = true;
                }
                break;
            case 4:
                C8898d c8898d3 = c8899e.f20938a;
                if (c8898d3 != null) {
                    c8898d3.mo21463a(EnumC8372b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                }
                break;
            case 5:
                c8899e.m21465a(3, lastClickedLocation);
                break;
            case 6:
                C8898d c8898d4 = c8899e.f20938a;
                if (c8898d4 != null) {
                    c8898d4.f20937n = false;
                }
                break;
            case 7:
                c8899e.m21465a(1, lastClickedLocation);
                break;
            case 8:
                String str2 = c8899e.f20940c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                C8898d c8898d5 = c8899e.f20938a;
                if (c8898d5 != null) {
                    c8898d5.f20925b.m22085a(str2);
                }
                Iterator it = c8899e.f20939b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) c8899e.f20939b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (c8898d = c8899e.f20938a) != null) {
                        c8898d.f20925b.m22085a(str3);
                    }
                }
                c8899e.f20939b.clear();
                C8898d c8898d6 = c8899e.f20938a;
                if (c8898d6 != null) {
                    IAlog.m21945a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.m21945a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    AbstractC9183r.f21478b.removeCallbacks(c8898d6.f20934k);
                    c8898d6.f20930g = false;
                    c8898d6.f20925b.setUiReady(true);
                    if (c8898d6.m21464b() != null) {
                        c8898d6.m21464b().f21299I = true;
                    }
                    c8898d6.f20925b.setVisibility(0);
                }
                break;
            case 9:
                C8898d c8898d7 = c8899e.f20938a;
                if (c8898d7 != null && (c8121g = c8898d7.f20933j) != null) {
                    c8121g.mo20542a();
                }
                break;
            case 10:
                C8898d c8898d8 = c8899e.f20938a;
                if (c8898d8 != null) {
                    c8898d8.f20936m = false;
                }
                break;
            case 11:
                C8898d c8898d9 = c8899e.f20938a;
                if (c8898d9 != null) {
                    c8898d9.f20937n = true;
                }
                break;
            case 12:
                c8899e.m21465a(7, lastClickedLocation);
                break;
            case 13:
                C8898d c8898d10 = c8899e.f20938a;
                if (c8898d10 != null) {
                    c8898d10.mo21463a(EnumC8372b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                }
                break;
            default:
                IAlog.m21945a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        C8898d c8898d11 = c8899e.f20938a;
        if (c8898d11 != null) {
            c8898d11.f20925b.m22085a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC9087e m21464b() {
        C8219t0 c8219t0 = this.f20926c;
        if (c8219t0 != null) {
            return c8219t0.f18374b;
        }
        return null;
    }
}
