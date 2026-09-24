package com.ironsource.mediationsdk;

import com.ironsource.C11399D9;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12371t implements AdapterNetworkData {

    /* JADX INFO: renamed from: a */
    private final String f31457a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f31458b;

    public C12371t(String networkName, JSONObject data) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f31457a = networkName;
        this.f31458b = new JSONObject(data.toString());
    }

    /* JADX INFO: renamed from: b */
    private final void m32693b(Collection<? extends AdapterBaseWrapper> collection) {
        List listFilterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (C12332c.m32302a(this.f31457a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m32694a() {
        return this.f31457a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f31458b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        T next;
        Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Iterator<String> itKeys = allData().keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "allData()\n          .keys()");
        Iterator<T> it = SequencesKt.asSequence(itKeys).iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!StringsKt.equals((String) next, desiredKey, true));
        String str = next;
        if (str != null) {
            Object objOpt = allData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f31458b.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f31457a + ", networkData=" + this.f31458b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m32695a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            m32692a(adapters);
            m32693b(networkAdapters);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m32692a(Collection<? extends AbstractAdapter> collection) {
        List listFilterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (C12332c.m32301a(this.f31457a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m32696b() throws JSONException {
        Iterator<String> itKeys = this.f31458b.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "networkData.keys()");
        String strJoinToString$default = CollectionsKt.joinToString$default(SequencesKt.toList(SequencesKt.asSequence(itKeys)), ",", null, null, 0, null, null, 62, null);
        C11399D9.m25613i().mo25281a(new C12580w5(EnumC12598x5.SET_NETWORK_DATA, IronSourceUtils.m32751b(false).put(IronSourceConstants.EVENTS_EXT1, this.f31457a + " - " + strJoinToString$default)));
    }
}
