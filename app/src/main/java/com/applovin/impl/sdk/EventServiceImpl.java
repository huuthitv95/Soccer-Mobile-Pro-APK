package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC1587j1;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1804w4;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1546f0;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1774t1;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", C11744X3.i.f26363e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a */
    private final C1748l f2854a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f2855b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    private final Deque f2856c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    private final Object f2857d = new Object();

    /* JADX INFO: renamed from: e */
    private volatile boolean f2858e;

    public EventServiceImpl(C1748l c1748l) {
        this.f2854a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private String m4400a() {
        return ((String) this.f2854a.m4801a(C1831z4.f4035s0)) + "v1/app";
    }

    /* JADX INFO: renamed from: a */
    private Map m4401a(C1774t1 c1774t1, boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put("AppLovin-Event", c1774t1.m5208c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", c1774t1.m5208c());
        return map;
    }

    /* JADX INFO: renamed from: a */
    private Map m4402a(C1774t1 c1774t1, boolean z, boolean z2) {
        Map mapM4941a = this.f2854a.m4759B().m4941a((Map) null, z, false);
        mapM4941a.put("event_id", c1774t1.m5207b());
        mapM4941a.put("ts", Long.toString(c1774t1.m5206a()));
        if (z2) {
            mapM4941a.put(NotificationCompat.CATEGORY_EVENT, c1774t1.m5208c());
        } else {
            mapM4941a.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            mapM4941a.put("sub_event", c1774t1.m5208c());
        }
        return AbstractC1701q7.m4042a(mapM4941a);
    }

    /* JADX INFO: renamed from: a */
    private Map m4403a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        C1774t1 c1774t1 = new C1774t1(str, map);
        map3.put("id", c1774t1.m5207b());
        map3.put("name", c1774t1.m5208c());
        map3.put("data", c1774t1.m5209d());
        map3.put("timestamp", AbstractC1587j1.m2978a(c1774t1.m5206a()));
        Map mapM4933G = this.f2854a.m4759B().m4933G();
        map3.put("app_info", mapM4933G);
        map3.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, this.f2854a.m4759B().m4947p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f2854a.m4850r());
        CollectionUtils.putStringIfValid("eventId", this.f2854a.m4766F(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2854a.m4839k0());
        map4.put(C11540L6.f24917H, this.f2854a.m4759B().m4932A());
        if (((Boolean) this.f2854a.m4801a(C1831z4.f3778N3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f2854a.m4852s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapM4933G.get("ia_v2"));
        map5.put("lastVisitTs", mapM4933G.get("last_launch_ms"));
        map5.put("visitCount", mapM4933G.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapM4933G.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    /* JADX INFO: renamed from: a */
    private void m4404a(String str) {
        C1768p.m5167h("AppLovinEventService", str);
        if (AbstractC1701q7.m4092c(this.f2854a)) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4405a(final String str, final Map map) {
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f2854a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2854a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4407a(str, map, zContains);
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: a */
    private void m4406a(String str, Map map, Map map2, String str2) {
        C1546f0 c1546f0 = new C1546f0(str, map, map2, str2);
        synchronized (this.f2857d) {
            if (this.f2856c.size() == ((Integer) this.f2854a.m4801a(C1831z4.f3679B0)).intValue()) {
                this.f2856c.pollLast();
            }
            this.f2856c.addFirst(c1546f0);
        }
        this.f2858e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4407a(String str, Map map, boolean z) {
        C1774t1 c1774t1 = new C1774t1(str, map);
        boolean zContains = this.f2854a.m4821c(C1831z4.f4091z0).contains(c1774t1.m5208c());
        Map mapM4402a = m4402a(c1774t1, false, zContains);
        HashMap map2 = new HashMap(c1774t1.m5209d());
        if (((Boolean) this.f2854a.m4801a(C1831z4.f3732H5)).booleanValue() || ((Boolean) this.f2854a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            map2.putAll(mapM4402a);
            mapM4402a = null;
        }
        this.f2854a.m4833h0().m5073e(C1765d.m5076b().m5116d(m4412d()).m5106a(m4410c()).m5107a(m4401a(c1774t1, zContains)).m5111b(mapM4402a).m5114c(map2).m5115c(((Boolean) this.f2854a.m4801a(C1831z4.f3820S5)).booleanValue()).m5108a(((Boolean) this.f2854a.m4801a(C1831z4.f3999n5)).booleanValue()).m5117d(z).m5105a(AbstractC1804w4.a.m5546a(((Integer) this.f2854a.m4801a(C1831z4.f4080x5)).intValue())).m5109a());
    }

    /* JADX INFO: renamed from: b */
    private String m4408b() {
        return ((String) this.f2854a.m4801a(C1831z4.f4027r0)) + "v1/app";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4409b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        C1765d.b bVarM5117d = C1765d.m5076b().m5116d(m4408b()).m5106a(m4400a()).m5107a(map3).m5114c(m4403a(str, map, map2)).m5108a(((Boolean) this.f2854a.m4801a(C1831z4.f3999n5)).booleanValue()).m5105a(AbstractC1804w4.a.m5546a(((Integer) this.f2854a.m4801a(C1831z4.f4088y5)).intValue())).m5117d(false);
        if (this.f2854a.m4857u0().m2928c()) {
            bVarM5117d.m5111b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f2854a.m4833h0().m5073e(bVarM5117d.m5109a());
    }

    /* JADX INFO: renamed from: c */
    private String m4410c() {
        return ((String) this.f2854a.m4801a(C1831z4.f4019q0)) + "4.0/pix";
    }

    /* JADX INFO: renamed from: c */
    private void m4411c(final String str, final Map map, final Map map2) {
        if (map.containsKey(FirebaseAnalytics.Param.ITEMS)) {
            Object obj = map.get(FirebaseAnalytics.Param.ITEMS);
            if (!(obj instanceof List)) {
                m4406a(str, map, map2, "Invalid 'items' value: expected a list.");
                m4404a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    m4406a(str, map, map2, "Invalid element in 'items': expected a map.");
                    m4404a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        m4406a(str, map, map2, "");
        this.f2854a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2854a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4409b(str, map, map2);
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: d */
    private String m4412d() {
        return ((String) this.f2854a.m4801a(C1831z4.f4011p0)) + "4.0/pix";
    }

    public void clearTrackedAxonEvents() {
        synchronized (this.f2857d) {
            this.f2856c.clear();
        }
    }

    public List<C1546f0> getTrackedAxonEvents() {
        ArrayList arrayList;
        synchronized (this.f2857d) {
            arrayList = new ArrayList(this.f2856c);
        }
        return arrayList;
    }

    public boolean isAxonEventTracked() {
        return this.f2858e;
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f2855b.compareAndSet(false, true)) {
            this.f2854a.m4768G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            m4404a("Unable to track empty event");
        } else if (this.f2854a.m4821c(C1831z4.f3671A0).contains(str)) {
            m4411c(str, map, map2);
        } else {
            m4405a(str, map);
        }
    }

    public void trackEventSynchronously(String str) {
        this.f2854a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2854a.m4782Q().m5171a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C1774t1 c1774t1 = new C1774t1(str, new HashMap());
        boolean zContains = this.f2854a.m4821c(C1831z4.f4091z0).contains(c1774t1.m5208c());
        Map mapM4402a = m4402a(c1774t1, true, zContains);
        HashMap map = new HashMap(c1774t1.m5209d());
        if (((Boolean) this.f2854a.m4801a(C1831z4.f3732H5)).booleanValue() || ((Boolean) this.f2854a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            map.putAll(mapM4402a);
            mapM4402a = null;
        }
        this.f2854a.m4833h0().m5073e(C1765d.m5076b().m5116d(m4412d()).m5106a(m4410c()).m5111b(mapM4402a).m5114c(map).m5107a(m4401a(c1774t1, zContains)).m5115c(((Boolean) this.f2854a.m4801a(C1831z4.f3820S5)).booleanValue()).m5108a(((Boolean) this.f2854a.m4801a(C1831z4.f3999n5)).booleanValue()).m5109a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f2854a.m4764E().m4329a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }
}
