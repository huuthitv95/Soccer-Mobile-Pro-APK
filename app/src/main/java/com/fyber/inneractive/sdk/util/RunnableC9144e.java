package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.web.AbstractC9238i;
import com.fyber.inneractive.sdk.web.C9226e;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;
import com.ironsource.C11341A5;
import com.tiktok.util.UrlConst;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9144e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9226e f21447b;

    public RunnableC9144e(C9226e c9226e, String str) {
        this.f21447b = c9226e;
        this.f21446a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9226e c9226e = this.f21447b;
        Object obj = this.f21446a;
        c9226e.getClass();
        String str = (String) obj;
        String str2 = AbstractC9186s.m22012a() ? "http://" : UrlConst.HTTPS;
        if (!TextUtils.isEmpty(str) && !c9226e.f21540a.isTerminated() && !c9226e.f21540a.isShutdown()) {
            if (TextUtils.isEmpty(c9226e.f21550k)) {
                c9226e.f21551l.f21579p = str2.concat("wv.inner-active.mobi/");
            } else {
                c9226e.f21551l.f21579p = str2 + c9226e.f21550k;
            }
            if (c9226e.f21545f) {
                return;
            }
            AbstractC9238i abstractC9238i = c9226e.f21551l;
            C9248m c9248m = abstractC9238i.f21565b;
            if (c9248m != null) {
                c9248m.loadDataWithBaseURL(abstractC9238i.f21579p, str, "text/html", C11341A5.f23802O, null);
                c9226e.f21551l.f21580q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_LOAD_TO_WEBVIEW);
                InterfaceC9232g interfaceC9232g = abstractC9238i.f21569f;
                if (interfaceC9232g != null) {
                    interfaceC9232g.mo20539a(abstractC9238i, inneractiveInfrastructureError);
                }
                abstractC9238i.mo22061b(true);
            }
        } else if (!c9226e.f21540a.isTerminated() && !c9226e.f21540a.isShutdown()) {
            AbstractC9238i abstractC9238i2 = c9226e.f21551l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.EMPTY_FINAL_HTML);
            InterfaceC9232g interfaceC9232g2 = abstractC9238i2.f21569f;
            if (interfaceC9232g2 != null) {
                interfaceC9232g2.mo20539a(abstractC9238i2, inneractiveInfrastructureError2);
            }
            abstractC9238i2.mo22061b(true);
        }
        c9226e.f21545f = true;
        c9226e.f21540a.shutdownNow();
        Handler handler = c9226e.f21541b;
        if (handler != null) {
            RunnableC9141d runnableC9141d = c9226e.f21543d;
            if (runnableC9141d != null) {
                handler.removeCallbacks(runnableC9141d);
            }
            RunnableC9144e runnableC9144e = c9226e.f21542c;
            if (runnableC9144e != null) {
                c9226e.f21541b.removeCallbacks(runnableC9144e);
            }
            c9226e.f21541b = null;
        }
        c9226e.f21551l.f21578o = null;
    }
}
