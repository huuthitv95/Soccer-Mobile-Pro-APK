package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10950g;
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
        C10950g.m23359a(str, "VendorKey is null or empty");
        C10950g.m23357a(url, "ResourceURL is null");
        C10950g.m23359a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C10950g.m23357a(url, "ResourceURL is null");
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
        C10946c.m23332a(jSONObject, "vendorKey", this.vendorKey);
        C10946c.m23332a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C10946c.m23332a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
