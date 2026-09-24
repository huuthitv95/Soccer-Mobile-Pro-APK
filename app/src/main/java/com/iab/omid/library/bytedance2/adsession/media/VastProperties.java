package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.C10997d;
import com.iab.omid.library.bytedance2.utils.C11000g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f22817a;

    /* JADX INFO: renamed from: b */
    private final Float f22818b;

    /* JADX INFO: renamed from: c */
    private final boolean f22819c;

    /* JADX INFO: renamed from: d */
    private final Position f22820d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f22817a = z;
        this.f22818b = f;
        this.f22819c = z2;
        this.f22820d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11000g.m23601a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11000g.m23601a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m23446a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f22817a);
            if (this.f22817a) {
                jSONObject.put("skipOffset", this.f22818b);
            }
            jSONObject.put("autoPlay", this.f22819c);
            jSONObject.put(C11744X3.i.f26338L, this.f22820d);
            return jSONObject;
        } catch (JSONException e) {
            C10997d.m23591a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f22820d;
    }

    public Float getSkipOffset() {
        return this.f22818b;
    }

    public boolean isAutoPlay() {
        return this.f22819c;
    }

    public boolean isSkippable() {
        return this.f22817a;
    }
}
