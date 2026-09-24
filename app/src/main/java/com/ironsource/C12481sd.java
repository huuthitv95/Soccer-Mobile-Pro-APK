package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12481sd {

    /* JADX INFO: renamed from: a */
    private final Map<LevelPlay.AdFormat, a> f31910a;

    /* JADX INFO: renamed from: com.ironsource.sd$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Map<String, b> f31911a;

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> listM31483b = C12194fa.m31483b(adFormatProviderOrder.names());
            listM31483b = listM31483b == null ? CollectionsKt.emptyList() : listM31483b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM31483b, 10)), 16));
            for (Object obj : listM31483b) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f31911a = linkedHashMap;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, b> m33320a() {
            return this.f31911a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sd$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final List<String> f31912a;

        public b(JSONArray providerOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> listM31483b = C12194fa.m31483b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(listM31483b, "jsonArrayToStringList(providerOrder)");
            this.f31912a = listM31483b;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m33321a() {
            return this.f31912a;
        }
    }

    public C12481sd(JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(C12518sf.m33677a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f31910a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final Map<LevelPlay.AdFormat, a> m33319a() {
        return this.f31910a;
    }
}
