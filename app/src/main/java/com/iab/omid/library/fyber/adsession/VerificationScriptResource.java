package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11104g;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C11104g.m24116a(str, "VendorKey is null or empty");
        C11104g.m24114a(url, "ResourceURL is null");
        C11104g.m24116a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C11104g.m24114a(url, "ResourceURL is null");
        return new VerificationScriptResource(null, url, null);
    }

    public URL getResourceUrl() {
        return this.resourceUrl;
    }

    public String getVendorKey() {
        return this.vendorKey;
    }

    public String getVerificationParameters() {
        return this.verificationParameters;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "vendorKey", this.vendorKey);
        C11100c.m24089a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C11100c.m24089a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
