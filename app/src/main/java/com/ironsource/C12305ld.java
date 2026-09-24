package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ld */
/* JADX INFO: loaded from: classes6.dex */
public final class C12305ld {

    /* JADX INFO: renamed from: b */
    public static final a f30862b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final String f30863c = "placements";

    /* JADX INFO: renamed from: d */
    public static final String f30864d = "placementName";

    /* JADX INFO: renamed from: a */
    private final JSONArray f30865a;

    /* JADX INFO: renamed from: com.ironsource.ld$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12305ld(JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f30865a = configuration.optJSONArray(f30863c);
    }

    /* JADX INFO: renamed from: a */
    public final <T> Map<String, T> m32084a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f30865a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i);
                String key = jsonObject.optString("placementName");
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T tInvoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
