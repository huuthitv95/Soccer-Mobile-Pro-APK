package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.qa */
/* JADX INFO: loaded from: classes6.dex */
public final class C12442qa {

    /* JADX INFO: renamed from: a */
    private static final int f31779a = 100;

    /* JADX INFO: renamed from: a */
    public static final boolean m33165a(JSONObject lhs, JSONObject rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return m33166a(lhs, rhs, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m33163a(JSONArray lhs, JSONArray rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return m33164a(lhs, rhs, 0);
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m33166a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "lhs.keys()");
        for (String str : SequencesKt.asSequence(itKeys)) {
            if (!jSONObject2.has(str) || !m33162a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m33164a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i > 100) {
            return false;
        }
        Iterable iterableUntil = RangesKt.until(0, jSONArray.length());
        if (!(iterableUntil instanceof Collection) || !((Collection) iterableUntil).isEmpty()) {
            Iterator it = iterableUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (!m33162a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m33162a(Object obj, Object obj2, int i) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return m33166a((JSONObject) obj, (JSONObject) obj2, i + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return m33164a((JSONArray) obj, (JSONArray) obj2, i + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return Intrinsics.areEqual(obj, obj2);
    }
}
