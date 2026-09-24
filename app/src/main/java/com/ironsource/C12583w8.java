package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12583w8 {

    /* JADX INFO: renamed from: a */
    public static final C12583w8 f32701a = new C12583w8();

    private C12583w8() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final String m34049a() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(C11744X3.a.f26166c);
        Object objOpt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt(C11341A5.f23798K) : null;
        if (objOpt == null || !(objOpt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objOpt;
        IntRange intRangeUntil = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            Object objOpt2 = jSONArray.opt(((IntIterator) it).nextInt());
            if (objOpt2 != null) {
                arrayList.add(objOpt2);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}
