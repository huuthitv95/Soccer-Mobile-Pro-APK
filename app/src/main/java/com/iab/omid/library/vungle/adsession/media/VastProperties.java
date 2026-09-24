package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.C11313d;
import com.iab.omid.library.vungle.utils.C11316g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f23620a;

    /* JADX INFO: renamed from: b */
    private final Float f23621b;

    /* JADX INFO: renamed from: c */
    private final boolean f23622c;

    /* JADX INFO: renamed from: d */
    private final Position f23623d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f23620a = z;
        this.f23621b = f;
        this.f23622c = z2;
        this.f23623d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11316g.m25159a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11316g.m25159a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m24945a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23620a);
            if (this.f23620a) {
                jSONObject.put("skipOffset", this.f23621b);
            }
            jSONObject.put("autoPlay", this.f23622c);
            jSONObject.put(C11744X3.i.f26338L, this.f23623d);
            return jSONObject;
        } catch (JSONException e) {
            C11313d.m25147a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23623d;
    }

    public Float getSkipOffset() {
        return this.f23621b;
    }

    public boolean isAutoPlay() {
        return this.f23622c;
    }

    public boolean isSkippable() {
        return this.f23620a;
    }
}
