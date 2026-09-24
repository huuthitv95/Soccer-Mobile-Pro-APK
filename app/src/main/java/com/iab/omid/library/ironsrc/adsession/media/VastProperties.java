package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.C11152d;
import com.iab.omid.library.ironsrc.utils.C11155g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f23222a;

    /* JADX INFO: renamed from: b */
    private final Float f23223b;

    /* JADX INFO: renamed from: c */
    private final boolean f23224c;

    /* JADX INFO: renamed from: d */
    private final Position f23225d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f23222a = z;
        this.f23223b = f;
        this.f23224c = z2;
        this.f23225d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11155g.m24367a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11155g.m24367a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m24203a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23222a);
            if (this.f23222a) {
                jSONObject.put("skipOffset", this.f23223b);
            }
            jSONObject.put("autoPlay", this.f23224c);
            jSONObject.put(C11744X3.i.f26338L, this.f23225d);
            return jSONObject;
        } catch (JSONException e) {
            C11152d.m24357a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23225d;
    }

    public Float getSkipOffset() {
        return this.f23223b;
    }

    public boolean isAutoPlay() {
        return this.f23224c;
    }

    public boolean isSkippable() {
        return this.f23222a;
    }
}
