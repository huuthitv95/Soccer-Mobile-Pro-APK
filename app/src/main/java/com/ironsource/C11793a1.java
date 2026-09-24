package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11793a1 {

    /* JADX INFO: renamed from: b */
    public static final a f26717b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final String f26718c = "adUnits";

    /* JADX INFO: renamed from: a */
    private final JSONObject f26719a;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11793a1(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f26719a = configurations.optJSONObject(f26718c);
    }

    /* JADX INFO: renamed from: a */
    public final <T> Map<String, T> m28096a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f26719a;
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "adUnits.keys()");
        Sequence sequenceAsSequence = SequencesKt.asSequence(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequenceAsSequence) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
