package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.C11250d;
import com.iab.omid.library.unity3d.utils.C11253g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f23493a;

    /* JADX INFO: renamed from: b */
    private final Float f23494b;

    /* JADX INFO: renamed from: c */
    private final boolean f23495c;

    /* JADX INFO: renamed from: d */
    private final Position f23496d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f23493a = z;
        this.f23494b = f;
        this.f23495c = z2;
        this.f23496d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11253g.m24859a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11253g.m24859a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m24712a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23493a);
            if (this.f23493a) {
                jSONObject.put("skipOffset", this.f23494b);
            }
            jSONObject.put("autoPlay", this.f23495c);
            jSONObject.put(C11744X3.i.f26338L, this.f23496d);
            return jSONObject;
        } catch (JSONException e) {
            C11250d.m24850a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23496d;
    }

    public Float getSkipOffset() {
        return this.f23494b;
    }

    public boolean isAutoPlay() {
        return this.f23495c;
    }

    public boolean isSkippable() {
        return this.f23493a;
    }
}
