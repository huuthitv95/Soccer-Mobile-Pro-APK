package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11316g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C11316g.m25159a(creativeType, "CreativeType is null");
        C11316g.m25159a(impressionType, "ImpressionType is null");
        C11316g.m25159a(owner, "Impression owner is null");
        C11316g.m25157a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "impressionOwner", this.impressionOwner);
        C11312c.m25131a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C11312c.m25131a(jSONObject, "creativeType", this.creativeType);
        C11312c.m25131a(jSONObject, "impressionType", this.impressionType);
        C11312c.m25131a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
