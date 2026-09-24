package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.utils.C11101d;
import com.iab.omid.library.fyber.utils.C11104g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f23087a;

    /* JADX INFO: renamed from: b */
    private final Float f23088b;

    /* JADX INFO: renamed from: c */
    private final boolean f23089c;

    /* JADX INFO: renamed from: d */
    private final Position f23090d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f23087a = z;
        this.f23088b = f;
        this.f23089c = z2;
        this.f23090d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11104g.m24114a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11104g.m24114a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m23950a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23087a);
            if (this.f23087a) {
                jSONObject.put("skipOffset", this.f23088b);
            }
            jSONObject.put("autoPlay", this.f23089c);
            jSONObject.put(C11744X3.i.f26338L, this.f23090d);
            return jSONObject;
        } catch (JSONException e) {
            C11101d.m24104a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23090d;
    }

    public Float getSkipOffset() {
        return this.f23088b;
    }

    public boolean isAutoPlay() {
        return this.f23089c;
    }

    public boolean isSkippable() {
        return this.f23087a;
    }
}
