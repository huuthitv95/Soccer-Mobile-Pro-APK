package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.I1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11481I1 {

    /* JADX INFO: renamed from: a */
    private final String f24454a;

    /* JADX INFO: renamed from: b */
    private final boolean f24455b;

    /* JADX INFO: renamed from: c */
    private final boolean f24456c;

    /* JADX INFO: renamed from: d */
    private final boolean f24457d;

    /* JADX INFO: renamed from: e */
    private final int f24458e;

    /* JADX INFO: renamed from: f */
    private final String f24459f;

    /* JADX INFO: renamed from: g */
    private final String f24460g;

    /* JADX INFO: renamed from: h */
    private final int f24461h;

    /* JADX INFO: renamed from: i */
    private final int f24462i;

    /* JADX INFO: renamed from: j */
    private final int f24463j;

    /* JADX INFO: renamed from: k */
    private final List<Integer> f24464k;

    /* JADX INFO: renamed from: l */
    private final List<Integer> f24465l;

    /* JADX INFO: renamed from: m */
    private final List<Integer> f24466m;

    /* JADX INFO: renamed from: n */
    private final List<Integer> f24467n;

    public C11481I1(JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        String it = applicationEvents.optString("abt");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f24454a = it.length() <= 0 ? null : it;
        this.f24455b = applicationEvents.optBoolean(C11517K1.f24790a, false);
        this.f24456c = applicationEvents.optBoolean(C11517K1.f24791b, false);
        this.f24457d = applicationEvents.optBoolean(C11517K1.f24792c, false);
        this.f24458e = applicationEvents.optInt(C11517K1.f24793d, -1);
        String strOptString = applicationEvents.optString(C11517K1.f24794e);
        Intrinsics.checkNotNullExpressionValue(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f24459f = strOptString;
        String strOptString2 = applicationEvents.optString(C11517K1.f24795f);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f24460g = strOptString2;
        this.f24461h = applicationEvents.optInt(C11517K1.f24796g, -1);
        this.f24462i = applicationEvents.optInt(C11517K1.f24797h, -1);
        this.f24463j = applicationEvents.optInt(C11517K1.f24798i, 5000);
        this.f24464k = m26049a(applicationEvents, C11517K1.f24799j);
        this.f24465l = m26049a(applicationEvents, C11517K1.f24800k);
        this.f24466m = m26049a(applicationEvents, C11517K1.f24801l);
        this.f24467n = m26049a(applicationEvents, C11517K1.f24802m);
    }

    /* JADX INFO: renamed from: a */
    public final String m26050a() {
        return this.f24454a;
    }

    /* JADX INFO: renamed from: b */
    public final int m26051b() {
        return this.f24461h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26052c() {
        return this.f24457d;
    }

    /* JADX INFO: renamed from: d */
    public final int m26053d() {
        return this.f24458e;
    }

    /* JADX INFO: renamed from: e */
    public final String m26054e() {
        return this.f24460g;
    }

    /* JADX INFO: renamed from: f */
    public final int m26055f() {
        return this.f24463j;
    }

    /* JADX INFO: renamed from: g */
    public final int m26056g() {
        return this.f24462i;
    }

    /* JADX INFO: renamed from: h */
    public final List<Integer> m26057h() {
        return this.f24467n;
    }

    /* JADX INFO: renamed from: i */
    public final List<Integer> m26058i() {
        return this.f24465l;
    }

    /* JADX INFO: renamed from: j */
    public final List<Integer> m26059j() {
        return this.f24464k;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m26060k() {
        return this.f24456c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m26061l() {
        return this.f24455b;
    }

    /* JADX INFO: renamed from: m */
    public final String m26062m() {
        return this.f24459f;
    }

    /* JADX INFO: renamed from: n */
    public final List<Integer> m26063n() {
        return this.f24466m;
    }

    /* JADX INFO: renamed from: a */
    private final List<Integer> m26049a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((IntIterator) it).nextInt())));
        }
        return arrayList;
    }
}
