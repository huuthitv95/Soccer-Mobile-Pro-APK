package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.C11203d;
import com.iab.omid.library.mmadbridge.utils.C11206g;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a */
    private final boolean f23357a;

    /* JADX INFO: renamed from: b */
    private final Float f23358b;

    /* JADX INFO: renamed from: c */
    private final boolean f23359c;

    /* JADX INFO: renamed from: d */
    private final Position f23360d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f23357a = z;
        this.f23358b = f;
        this.f23359c = z2;
        this.f23360d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C11206g.m24620a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C11206g.m24620a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m24456a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23357a);
            if (this.f23357a) {
                jSONObject.put("skipOffset", this.f23358b);
            }
            jSONObject.put("autoPlay", this.f23359c);
            jSONObject.put(C11744X3.i.f26338L, this.f23360d);
            return jSONObject;
        } catch (JSONException e) {
            C11203d.m24610a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23360d;
    }

    public Float getSkipOffset() {
        return this.f23358b;
    }

    public boolean isAutoPlay() {
        return this.f23359c;
    }

    public boolean isSkippable() {
        return this.f23357a;
    }
}
