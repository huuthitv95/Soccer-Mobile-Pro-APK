package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.info.provider.listener.InterfaceC12778a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.e */
/* JADX INFO: compiled from: UserAgentProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12783e {

    /* JADX INFO: renamed from: d */
    static String f34053d = "UserAgentProvider";

    /* JADX INFO: renamed from: e */
    private static volatile C12783e f34054e;

    /* JADX INFO: renamed from: a */
    String f34055a = "";

    /* JADX INFO: renamed from: b */
    String f34056b = "";

    /* JADX INFO: renamed from: c */
    public AtomicBoolean f34057c = new AtomicBoolean(false);

    private C12783e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35310b(InterfaceC12778a interfaceC12778a) {
        this.f34055a = m35313f();
        m35308b();
        if (!TextUtils.isEmpty(this.f34055a)) {
            m35307a(this.f34055a);
        }
        if (TextUtils.isEmpty(this.f34055a)) {
            this.f34055a = m35311c();
            m35306a(C13008c.m36588n().m36542d());
        }
        if (interfaceC12778a != null) {
            HashMap map = new HashMap();
            map.put("userAgent", this.f34055a);
            interfaceC12778a.mo35252a(map);
        }
        this.f34057c.set(true);
    }

    /* JADX INFO: renamed from: c */
    private String m35311c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder sb = new StringBuilder("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sb.append(" Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static C12783e m35312d() {
        if (f34054e == null) {
            synchronized (C12783e.class) {
                if (f34054e == null) {
                    f34054e = new C12783e();
                }
            }
        }
        return f34054e;
    }

    /* JADX INFO: renamed from: a */
    public void m35315a(final InterfaceC12778a interfaceC12778a) {
        try {
            C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35310b(interfaceC12778a);
                }
            });
        } catch (Throwable th) {
            C13219q0.m37817b(f34053d, th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: e */
    public String m35316e() {
        if (TextUtils.isEmpty(this.f34055a) && TextUtils.isEmpty(this.f34056b)) {
            return m35311c();
        }
        if (TextUtils.isEmpty(this.f34055a)) {
            return TextUtils.isEmpty(this.f34056b) ? "" : this.f34056b;
        }
        return this.f34055a;
    }

    /* JADX INFO: renamed from: f */
    private String m35313f() {
        try {
            return WebSettings.getDefaultUserAgent(C13008c.m36588n().m36542d());
        } catch (Throwable th) {
            C13219q0.m37817b(f34053d, th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35309b(Context context) {
        try {
            this.f34055a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            C13219q0.m37817b(f34053d, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.f34055a)) {
            this.f34055a = m35311c();
        } else {
            m35307a(this.f34055a);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m35314a() {
        try {
            String strM35313f = m35313f();
            this.f34055a = strM35313f;
            if (!TextUtils.isEmpty(strM35313f)) {
                m35307a(this.f34055a);
            } else {
                m35308b();
            }
            if (TextUtils.isEmpty(this.f34055a)) {
                this.f34055a = m35311c();
            }
            this.f34057c.set(true);
        } catch (Throwable th) {
            C13219q0.m37817b(f34053d, th.getMessage(), th);
        }
        return m35311c();
    }

    /* JADX INFO: renamed from: b */
    private void m35308b() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            return;
        }
        this.f34056b = C12769b.m35186a(contextM36542d).m35192a("userAgent", m35311c());
    }

    /* JADX INFO: renamed from: a */
    private void m35306a(final Context context) {
        if (TextUtils.isEmpty(this.f34055a)) {
            C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.e$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35309b(context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35307a(String str) {
        Context contextM36542d;
        if (TextUtils.isEmpty(str) || (contextM36542d = C13008c.m36588n().m36542d()) == null) {
            return;
        }
        C12769b.m35186a(contextM36542d).m35195b("userAgent", str);
    }
}
