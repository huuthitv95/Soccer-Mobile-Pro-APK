package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12371t;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12196fc {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, JSONObject> f30405a;

    /* JADX WARN: Multi-variable type inference failed */
    public C12196fc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, JSONObject> m31502a() {
        return this.f30405a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12196fc) && Intrinsics.areEqual(this.f30405a, ((C12196fc) obj).f30405a);
    }

    public int hashCode() {
        return this.f30405a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f30405a + ")";
    }

    public C12196fc(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f30405a = networkDataMap;
    }

    /* JADX INFO: renamed from: a */
    public final C12196fc m31503a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new C12196fc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12196fc m31501a(C12196fc c12196fc, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c12196fc.f30405a;
        }
        return c12196fc.m31503a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C12196fc(ConcurrentHashMap concurrentHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    /* JADX INFO: renamed from: a */
    public final void m31506a(C12371t networkData) {
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.f30405a.containsKey(networkData.m32694a())) {
            this.f30405a.put(networkData.m32694a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f30405a;
            String strM32694a = networkData.m32694a();
            JSONObject jSONObject = this.f30405a.get(networkData.m32694a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectM32737a = IronSourceUtils.m32737a(jSONObject, networkData.allData());
            Intrinsics.checkNotNullExpressionValue(jSONObjectM32737a, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strM32694a, jSONObjectM32737a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31504a(AbstractAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f30405a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (C12332c.m32301a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new C12371t((String) key, (JSONObject) value));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31505a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f30405a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (C12332c.m32302a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new C12371t((String) key, (JSONObject) value));
        }
    }
}
