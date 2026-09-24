package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.InterfaceC12712d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TimeCpt extends C12709a implements InterfaceC12712d {

    /* JADX INFO: renamed from: h */
    Map<String, Object> f34436h = new HashMap();

    /* JADX INFO: renamed from: i */
    Map<String, Object> f34437i = new HashMap();

    /* JADX INFO: renamed from: j */
    String f34438j;

    /* JADX INFO: renamed from: k */
    long f34439k;

    /* JADX INFO: renamed from: l */
    int f34440l;

    /* JADX INFO: renamed from: m */
    String f34441m;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.time.TimeCpt$a */
    private class RunnableC12847a implements Runnable {

        /* JADX INFO: renamed from: a */
        int f34442a = 0;

        /* JADX INFO: renamed from: b */
        boolean f34443b;

        public RunnableC12847a(boolean z) {
            this.f34443b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strM35209b = C12770c.m35209b("triggered_count");
            int i = this.f34442a;
            this.f34442a = i + 1;
            map.put(strM35209b, Integer.valueOf(i));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.m34829a(timeCpt.m34827a("919003", map));
            if (this.f34443b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f34436h.get(timeCpt2.f34438j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f34439k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.InterfaceC12712d
    /* JADX INFO: renamed from: a */
    public boolean mo34848a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(C12770c.m35209b("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(C12770c.m35209b("110"));
                if (obj2 instanceof String) {
                    return this.f34438j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(C12770c.m35209b("110"));
        if (obj != null) {
            this.f34438j = String.valueOf(obj);
        }
        Object obj2 = map.get(C12770c.m35209b("152"));
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f34439k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get(C12770c.m35209b("153"));
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f34440l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.f34441m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: c */
    protected void mo34835c(Map<String, Object> map) {
        super.mo34835c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        Handler handler;
        Runnable runnableC12847a;
        super.mo34836d();
        if (this.f34436h.containsKey(this.f34438j)) {
            handler = (Handler) this.f34436h.get(this.f34438j);
        } else {
            handler = new Handler();
            this.f34436h.put(this.f34438j, handler);
        }
        if (this.f34437i.containsKey(this.f34438j)) {
            runnableC12847a = (Runnable) this.f34437i.get(this.f34438j);
        } else {
            runnableC12847a = new RunnableC12847a(this.f34440l == 1);
            this.f34437i.put(this.f34438j, runnableC12847a);
        }
        if (handler == null || runnableC12847a == null) {
            return;
        }
        if (C12770c.m35209b("310").equals(this.f34441m) || C12770c.m35209b("335").equals(this.f34441m)) {
            handler.postDelayed(runnableC12847a, this.f34439k);
            return;
        }
        if (C12770c.m35209b("311").equals(this.f34441m)) {
            handler.removeCallbacks(runnableC12847a);
            this.f34436h.remove(this.f34438j);
        } else if (C12770c.m35209b("316").equals(this.f34441m)) {
            handler.removeCallbacks(runnableC12847a);
        }
    }
}
