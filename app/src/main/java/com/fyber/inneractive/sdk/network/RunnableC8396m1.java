package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.m1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8396m1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8399n1 f18685a;

    public RunnableC8396m1(C8399n1 c8399n1) {
        this.f18685a = c8399n1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        C8399n1 c8399n1 = this.f18685a;
        AbstractC8416t0 abstractC8416t0 = (AbstractC8416t0) AbstractC9195v.m22024a(c8399n1.f18687b);
        Thread thread = (Thread) AbstractC9195v.m22024a(this.f18685a.f18686a);
        if (abstractC8416t0 == null || abstractC8416t0.f18716f == EnumC8384i1.DONE || abstractC8416t0.f18716f == EnumC8384i1.RESOLVED) {
            return;
        }
        boolean zM20795v = abstractC8416t0.m20795v();
        IAlog.m21945a("%s : NetworkWatchdogHolder : should report: %s", IAlog.m21942a(C8399n1.class), Boolean.valueOf(zM20795v));
        if (zM20795v) {
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Exception exc = new Exception();
                exc.setStackTrace(stackTrace);
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.getBuffer().toString();
            } else {
                string = "";
            }
            String strMo20732r = abstractC8416t0.mo20732r();
            InneractiveAdRequest inneractiveAdRequest = abstractC8416t0 instanceof C8407q0 ? ((C8407q0) abstractC8416t0).f18696p : null;
            AbstractC9087e abstractC9087e = abstractC8416t0 instanceof C8375f1 ? ((C8375f1) abstractC8416t0).f18652s : null;
            EnumC8424u enumC8424u = EnumC8424u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
            JSONArray jSONArrayM20435b = abstractC8416t0.mo20751k() != null ? abstractC8416t0.mo20751k().m20435b() : null;
            C8428w c8428w = new C8428w(abstractC9087e);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", strMo20732r);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "url", strMo20732r);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "stack_trace", string);
            }
            Integer numValueOf = Integer.valueOf(c8399n1.f18688c);
            try {
                jSONObject.put("total_time", numValueOf);
            } catch (Exception unused3) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "total_time", numValueOf);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
        }
        IAlog.m21945a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.m21943a(c8399n1), Integer.valueOf(c8399n1.f18688c));
        abstractC8416t0.mo20748d();
    }
}
