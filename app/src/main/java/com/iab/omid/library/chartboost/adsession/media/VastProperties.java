package com.iab.omid.library.chartboost.adsession.media;

import com.iab.omid.library.chartboost.utils.C11049d;
import com.iab.omid.library.chartboost.utils.C11052g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f22946a;

    /* JADX INFO: renamed from: b */
    private final Float f22947b;

    /* JADX INFO: renamed from: c */
    private final boolean f22948c;

    /* JADX INFO: renamed from: d */
    private final Position f22949d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f22946a = z;
        this.f22947b = f;
        this.f22948c = z2;
        this.f22949d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11052g.m23858a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11052g.m23858a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m23689a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f22946a);
            if (this.f22946a) {
                jSONObject.put("skipOffset", this.f22947b);
            }
            jSONObject.put("autoPlay", this.f22948c);
            jSONObject.put(C11744X3.i.f26338L, this.f22949d);
            return jSONObject;
        } catch (JSONException e) {
            C11049d.m23848a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f22949d;
    }

    public Float getSkipOffset() {
        return this.f22947b;
    }

    public boolean isAutoPlay() {
        return this.f22948c;
    }

    public boolean isSkippable() {
        return this.f22946a;
    }
}
