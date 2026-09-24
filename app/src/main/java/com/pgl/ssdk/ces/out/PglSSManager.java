package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.C14272b;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a */
    private static volatile PglSSManager f41315a;

    /* JADX INFO: renamed from: b */
    private final C14272b f41316b;

    /* JADX INFO: renamed from: c */
    private volatile int f41317c = 0;

    /* JADX INFO: renamed from: d */
    private volatile PglSSCallBack f41318d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f41316b = C14272b.m43034a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return C14272b.m43043d();
    }

    public static PglSSManager getInstance() {
        return f41315a;
    }

    public static String getLoadError() {
        if (C14272b.m43046f() != null) {
            return C14272b.m43046f().f41283b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f41315a == null) {
            synchronized (PglSSManager.class) {
                if (f41315a == null) {
                    f41315a = new PglSSManager(context, pglSSConfig);
                    if (C14272b.m43043d() == 0) {
                        f41315a.f41318d = pglSSConfig.getCallBack();
                        f41315a.f41316b.m43053a(pglSSConfig.getCustomInfo());
                        f41315a.f41316b.m43051a(str, str3, str2, str4);
                    }
                }
            }
        }
        return f41315a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (C14272b.m43043d() == 0) {
            this.f41316b.m43049a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (C14272b.m43043d() == 0) {
            return this.f41316b.m43048a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f41318d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (C14272b.m43043d() == 0) {
            return this.f41316b.m43056g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (C14272b.m43043d() == 0) {
            this.f41316b.m43050a(str);
            int i = this.f41317c;
            C14272b c14272b = this.f41316b;
            if (i % c14272b.f41299o == 0) {
                c14272b.m43052a(str, map);
            }
            this.f41317c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (C14272b.m43043d() == 0) {
            this.f41316b.m43053a(map);
        }
    }

    public void setDeviceId(String str) {
        if (C14272b.m43043d() == 0) {
            this.f41316b.m43054c(str);
        }
    }

    public void setGaid(String str) {
        if (C14272b.m43043d() == 0) {
            this.f41316b.m43055d(str);
        }
    }
}
