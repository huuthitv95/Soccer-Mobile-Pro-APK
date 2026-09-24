package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BusMonitorDependWrapper implements InterfaceC3480lr {

    /* JADX INFO: renamed from: lr */
    private Handler f7909lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC3480lr f7910ri;

    public BusMonitorDependWrapper(InterfaceC3480lr interfaceC3480lr) {
        this.f7910ri = interfaceC3480lr;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public Context getContext() {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        return (interfaceC3480lr == null || interfaceC3480lr.getContext() == null) ? getReflectContext() : this.f7910ri.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public Handler getHandler() {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null && interfaceC3480lr.getHandler() != null) {
            return this.f7910ri.getHandler();
        }
        if (this.f7909lr == null) {
            this.f7909lr = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.f7909lr;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public int getOnceLogCount() {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null) {
            return interfaceC3480lr.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public int getOnceLogInterval() {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null) {
            return interfaceC3480lr.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public HandlerThread getSafeHandlerThread(String str, int i) {
        HandlerThread safeHandlerThread;
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null && (safeHandlerThread = interfaceC3480lr.getSafeHandlerThread(str, i)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr == null || (uploadIntervalTime = interfaceC3480lr.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public boolean isMonitorOpen() {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null) {
            return interfaceC3480lr.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
    public void onMonitorUpload(List<C3481ri> list) {
        InterfaceC3480lr interfaceC3480lr = this.f7910ri;
        if (interfaceC3480lr != null) {
            interfaceC3480lr.onMonitorUpload(list);
        }
    }
}
