package com.bytedance.sdk.openadsdk.p246nr;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.lr */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3480lr {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<C3481ri> list);
}
