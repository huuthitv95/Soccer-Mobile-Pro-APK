package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11155g;
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
        C11155g.m24367a(creativeType, "CreativeType is null");
        C11155g.m24367a(impressionType, "ImpressionType is null");
        C11155g.m24367a(owner, "Impression owner is null");
        C11155g.m24365a(owner, creativeType, impressionType);
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
        C11151c.m24342a(jSONObject, "impressionOwner", this.impressionOwner);
        C11151c.m24342a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C11151c.m24342a(jSONObject, "creativeType", this.creativeType);
        C11151c.m24342a(jSONObject, "impressionType", this.impressionType);
        C11151c.m24342a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
