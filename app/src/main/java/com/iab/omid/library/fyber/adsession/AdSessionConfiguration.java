package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11104g;
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
        C11104g.m24114a(creativeType, "CreativeType is null");
        C11104g.m24114a(impressionType, "ImpressionType is null");
        C11104g.m24114a(owner, "Impression owner is null");
        C11104g.m24112a(owner, creativeType, impressionType);
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
        C11100c.m24089a(jSONObject, "impressionOwner", this.impressionOwner);
        C11100c.m24089a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C11100c.m24089a(jSONObject, "creativeType", this.creativeType);
        C11100c.m24089a(jSONObject, "impressionType", this.impressionType);
        C11100c.m24089a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
