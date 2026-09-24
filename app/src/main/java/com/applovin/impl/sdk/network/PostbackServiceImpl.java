package com.applovin.impl.sdk.network;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1719s5;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a */
    private final C1748l f3157a;

    public PostbackServiceImpl(C1748l c1748l) {
        this.f3157a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private boolean m5012a(C1766e c1766e) {
        Map mapM5026i = c1766e.m5026i();
        if (mapM5026i == null) {
            return false;
        }
        Object obj = mapM5026i.get(NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = mapM5026i.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C1766e.m5118b(this.f3157a).mo5045b(str).mo5042a(false).mo5043a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C1766e c1766e, C1552f6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        C1719s5 c1719s5 = new C1719s5(c1766e, bVar, this.f3157a, appLovinPostbackListener);
        c1719s5.m3083a(m5012a(c1766e));
        this.f3157a.m4853s0().m2604a((AbstractRunnableC1601k5) c1719s5, bVar);
    }

    public void dispatchPostbackRequest(C1766e c1766e, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(c1766e, C1552f6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
