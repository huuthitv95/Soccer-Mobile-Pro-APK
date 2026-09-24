package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8434z {
    /* JADX INFO: renamed from: a */
    public static void m20811a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        C8428w c8428w = new C8428w(EnumC8424u.CAUGHT_EXCEPTION, inneractiveAdRequest, abstractC9087e);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "description", str2);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m20812a(Throwable th, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        C8428w c8428w = new C8428w(EnumC8424u.CAUGHT_EXCEPTION, inneractiveAdRequest, abstractC9087e);
        JSONObject jSONObject = new JSONObject();
        String string2 = th.getClass().toString();
        try {
            jSONObject.put("exception_name", string2);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "exception_name", string2);
        }
        String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", string);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "stack_trace", string);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }
}
