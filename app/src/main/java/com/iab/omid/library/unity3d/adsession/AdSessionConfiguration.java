package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11253g;
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
        C11253g.m24859a(creativeType, "CreativeType is null");
        C11253g.m24859a(impressionType, "ImpressionType is null");
        C11253g.m24859a(owner, "Impression owner is null");
        C11253g.m24857a(owner, creativeType, impressionType);
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
        C11249c.m24836a(jSONObject, "impressionOwner", this.impressionOwner);
        C11249c.m24836a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C11249c.m24836a(jSONObject, "creativeType", this.creativeType);
        C11249c.m24836a(jSONObject, "impressionType", this.impressionType);
        C11249c.m24836a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
