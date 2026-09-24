package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12588wd {

    /* JADX INFO: renamed from: a */
    private final Map<String, C12533tc> f32709a;

    /* JADX INFO: renamed from: com.ironsource.wd$a */
    static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C12533tc>> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f32710a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C12533tc> invoke(String networkName) throws JSONException {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f32710a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.m43482to(networkName, new C12533tc(networkName, jSONObject));
        }
    }

    public C12588wd(JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        Map<String, C12533tc> map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(itKeys), new a(providerSettings)));
        this.f32709a = map;
        for (Map.Entry<String, C12533tc> entry : map.entrySet()) {
            entry.getKey();
            C12533tc value = entry.getValue();
            if (m34060b(value)) {
                value.m33795b(m34059a(value));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m34060b(C12533tc c12533tc) {
        return c12533tc.m33808o() && c12533tc.m33805l().length() > 0;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, C12533tc> m34061a() {
        return this.f32709a;
    }

    /* JADX INFO: renamed from: a */
    private final C12533tc m34059a(C12533tc c12533tc) {
        return this.f32709a.get(c12533tc.m33801h());
    }
}
