package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12630z1 {

    /* JADX INFO: renamed from: a */
    private final Map<LevelPlay.AdFormat, C12431q> f33236a;

    public C12630z1(JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(C12518sf.m33677a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C12431q(jSONObjectOptJSONObject));
        }
        this.f33236a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final Map<LevelPlay.AdFormat, C12431q> m34250a() {
        return this.f33236a;
    }
}
