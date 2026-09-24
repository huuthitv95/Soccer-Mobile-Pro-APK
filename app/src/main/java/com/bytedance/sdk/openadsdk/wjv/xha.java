package com.bytedance.sdk.openadsdk.wjv;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC3605di {

    /* JADX INFO: renamed from: lr */
    private InterfaceC3605di f13376lr;

    /* JADX INFO: renamed from: ri */
    Handler f13377ri = null;

    xha(InterfaceC3605di interfaceC3605di) {
        this.f13376lr = interfaceC3605di;
    }

    private Context jbs() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: di */
    public JSONObject mo16687di() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        if (interfaceC3605di != null) {
            return interfaceC3605di.mo16687di();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: fi */
    public String mo16688fi() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        if (interfaceC3605di != null) {
            return interfaceC3605di.mo16688fi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: ik */
    public String mo16689ik() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        return (interfaceC3605di == null || TextUtils.isEmpty(interfaceC3605di.mo16689ik())) ? AbstractJsonLexerKt.NULL : this.f13376lr.mo16689ik();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: ka */
    public Handler mo16690ka() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        if (interfaceC3605di != null && interfaceC3605di.xha() != null) {
            return this.f13376lr.mo16690ka();
        }
        Handler handler = new Handler(mo16693ri("pag_strategy", -1).getLooper());
        this.f13377ri = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: lr */
    public Context mo16691lr() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        return (interfaceC3605di == null || interfaceC3605di.mo16691lr() == null) ? jbs() : this.f13376lr.mo16691lr();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: mj */
    public boolean mo16692mj() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        if (interfaceC3605di != null) {
            return interfaceC3605di.mo16692mj();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: ri */
    public HandlerThread mo16693ri(String str, int i) {
        HandlerThread handlerThreadMo16693ri;
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        if (interfaceC3605di != null && (handlerThreadMo16693ri = interfaceC3605di.mo16693ri(str, i)) != null) {
            return handlerThreadMo16693ri;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: ri */
    public ExecutorService mo16694ri() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        return (interfaceC3605di == null || interfaceC3605di.mo16694ri() == null) ? Executors.newCachedThreadPool() : this.f13376lr.mo16694ri();
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    /* JADX INFO: renamed from: ri */
    public JSONObject mo16695ri(JSONObject jSONObject) {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        return interfaceC3605di != null ? interfaceC3605di.mo16695ri(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
    public Map<String, String> xha() {
        InterfaceC3605di interfaceC3605di = this.f13376lr;
        return (interfaceC3605di == null || interfaceC3605di.xha() == null) ? new HashMap() : this.f13376lr.xha();
    }
}
