package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.C10947d;
import com.iab.omid.library.applovin.utils.C10950g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f22682a;

    /* JADX INFO: renamed from: b */
    private final Float f22683b;

    /* JADX INFO: renamed from: c */
    private final boolean f22684c;

    /* JADX INFO: renamed from: d */
    private final Position f22685d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f22682a = z;
        this.f22683b = f;
        this.f22684c = z2;
        this.f22685d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C10950g.m23357a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C10950g.m23357a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m23193a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f22682a);
            if (this.f22682a) {
                jSONObject.put("skipOffset", this.f22683b);
            }
            jSONObject.put("autoPlay", this.f22684c);
            jSONObject.put(C11744X3.i.f26338L, this.f22685d);
            return jSONObject;
        } catch (JSONException e) {
            C10947d.m23347a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f22685d;
    }

    public Float getSkipOffset() {
        return this.f22683b;
    }

    public boolean isAutoPlay() {
        return this.f22684c;
    }

    public boolean isSkippable() {
        return this.f22682a;
    }
}
