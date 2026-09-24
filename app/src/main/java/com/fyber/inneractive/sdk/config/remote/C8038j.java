package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.remote.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8038j {

    /* JADX INFO: renamed from: a */
    public Boolean f17847a;

    /* JADX INFO: renamed from: b */
    public Integer f17848b;

    /* JADX INFO: renamed from: c */
    public Integer f17849c;

    /* JADX INFO: renamed from: d */
    public Skip f17850d;

    /* JADX INFO: renamed from: e */
    public Boolean f17851e;

    /* JADX INFO: renamed from: f */
    public TapAction f17852f;

    /* JADX INFO: renamed from: g */
    public Orientation f17853g;

    /* JADX INFO: renamed from: h */
    public Integer f17854h;

    /* JADX INFO: renamed from: i */
    public Integer f17855i;

    /* JADX INFO: renamed from: j */
    public UnitDisplayType f17856j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f17857k = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static C8038j m20453a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C8038j c8038j = new C8038j();
        int iOptInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        c8038j.f17848b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        c8038j.f17849c = numValueOf2;
        c8038j.f17850d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        c8038j.f17851e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        c8038j.f17847a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        c8038j.f17853g = Orientation.fromValue(jSONObject.optString("orientation"));
        c8038j.f17852f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        c8038j.f17854h = numValueOf3;
        c8038j.f17855i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        c8038j.f17856j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    c8038j.f17857k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return c8038j;
    }
}
