package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.flow.vast.C8231h;
import com.fyber.inneractive.sdk.response.nativead.C9095a;
import com.fyber.inneractive.sdk.response.nativead.C9096b;
import com.fyber.inneractive.sdk.response.nativead.C9097c;
import com.fyber.inneractive.sdk.response.nativead.C9098d;
import com.fyber.inneractive.sdk.response.nativead.C9099e;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.response.nativead.C9102h;
import com.fyber.inneractive.sdk.response.nativead.C9103i;
import com.fyber.inneractive.sdk.response.nativead.C9104j;
import com.fyber.inneractive.sdk.response.nativead.C9105k;
import com.fyber.inneractive.sdk.response.nativead.parser.AbstractC9106a;
import com.fyber.inneractive.sdk.response.nativead.parser.AbstractC9107b;
import com.fyber.inneractive.sdk.response.nativead.parser.AbstractC9108c;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C9094l extends AbstractC9084b {

    /* JADX INFO: renamed from: e */
    public C9104j f21337e;

    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX INFO: renamed from: a */
    public static C9103i m21897a(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new C9095a("Empty native body", "ErrorNoNativeBody");
        }
        if (!jSONObject.has("assets") || jSONObject.isNull("assets")) {
            throw new C9095a("Missing assets", "ErrorNoAssets");
        }
        if (!jSONObject.has("link") || jSONObject.isNull("link")) {
            throw new C9095a("Missing main link object", "ErrorNoMainLink");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assets");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    C9100f c9100f = new C9100f();
                    c9100f.f21342a = jSONObjectOptJSONObject.optInt("id");
                    jSONObjectOptJSONObject.optInt("required");
                    c9100f.f21347f = AbstractC9108c.m21903a(jSONObjectOptJSONObject.optJSONObject("link"));
                    if (jSONObjectOptJSONObject.has("title")) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("title");
                        C9098d c9098d = new C9098d();
                        if (jSONObjectOptJSONObject2 != null) {
                            c9098d.f21340a = AbstractC9195v.m22026a(jSONObjectOptJSONObject2, "text");
                            jSONObjectOptJSONObject2.optInt("len");
                        }
                        c9100f.f21343b = c9098d;
                    } else if (jSONObjectOptJSONObject.has("video")) {
                        if (z) {
                            c9100f = null;
                        } else {
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("video");
                            C9099e c9099e = new C9099e();
                            if (jSONObjectOptJSONObject3 != null) {
                                c9099e.f21341a = AbstractC9195v.m22026a(jSONObjectOptJSONObject3, "vasttag");
                            }
                            c9100f.f21344c = c9099e;
                            z = !TextUtils.isEmpty(c9099e.f21341a);
                        }
                    } else if (jSONObjectOptJSONObject.has("img")) {
                        int i2 = c9100f.f21342a;
                        boolean z3 = i2 == 2;
                        if (!(z3 && z) && (z3 || !z2)) {
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("img");
                            C9097c c9097c = new C9097c();
                            if (jSONObjectOptJSONObject4 != null) {
                                jSONObjectOptJSONObject4.optInt("width");
                                jSONObjectOptJSONObject4.optInt("height");
                                c9097c.f21339a = AbstractC9195v.m22026a(jSONObjectOptJSONObject4, "url");
                            }
                            if (i2 == 2) {
                                z = !TextUtils.isEmpty(c9097c.f21339a);
                            } else if (i2 == 4) {
                                z2 = !TextUtils.isEmpty(c9097c.f21339a);
                            }
                            c9100f.f21345d = c9097c;
                        } else {
                            c9100f = null;
                        }
                    } else if (jSONObjectOptJSONObject.has("data")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("data");
                        C9096b c9096b = new C9096b();
                        if (jSONObjectOptJSONObject5 != null) {
                            c9096b.f21338a = AbstractC9195v.m22026a(jSONObjectOptJSONObject5, "value");
                        }
                        c9100f.f21346e = c9096b;
                    }
                    if (c9100f != null) {
                        arrayList.add(c9100f);
                    }
                }
            }
            if (!z) {
                throw new C9095a("Missing valid main asset (video/image)", "ErrorNoMainAsset");
            }
        }
        C9102h c9102hM21903a = AbstractC9108c.m21903a(jSONObject.optJSONObject("link"));
        if (TextUtils.isEmpty(c9102hM21903a.f21352a)) {
            throw new C9095a("Missing url in main link object", "ErrorNoMainLink");
        }
        String strM22026a = AbstractC9195v.m22026a(jSONObject, "jstracker");
        AbstractC9195v.m22026a(jSONObject, ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
        ArrayList arrayListM21902a = AbstractC9107b.m21902a(jSONObject.optJSONArray("imptrackers"));
        ArrayList arrayListM21901a = AbstractC9106a.m21901a(jSONObject.optJSONArray("eventtrackers"));
        C9103i c9103i = new C9103i();
        c9103i.f21355a = arrayList;
        c9103i.f21356b = c9102hM21903a;
        c9103i.f21358d = strM22026a;
        c9103i.f21357c = arrayListM21902a;
        c9103i.f21359e = arrayListM21901a;
        return c9103i;
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final AbstractC9087e mo21885a() {
        C9104j c9104j = new C9104j();
        this.f21280a = c9104j;
        this.f21337e = c9104j;
        return c9104j;
    }

    /* JADX INFO: renamed from: a */
    public final void m21898a(C9104j c9104j, C8028r0 c8028r0) {
        C9099e c9099eM21899c = c9104j.f21360Q.m21899c();
        String str = c9099eM21899c != null ? c9099eM21899c.f21341a : null;
        if (str == null || str.isEmpty()) {
            throw new C8231h("Missing vast content", "VastErrorInvalidFile");
        }
        C9086d c9086d = new C9086d(false);
        c9086d.f21280a = new C9089g();
        c9086d.f21284e = this.f21337e;
        c9086d.mo21887a(str, c8028r0);
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final void mo21887a(String str, C8028r0 c8028r0) throws Exception {
        C9104j c9104j;
        if (this.f21280a == null || (c9104j = this.f21337e) == null) {
            throw new Exception("Missing response ".concat(this.f21280a == null ? "data" : "data native"));
        }
        if (c8028r0 == null) {
            c9104j.f21309i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f21337e.f21309i = "ErrorInvalidJsonResponse";
            throw new C9095a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            C9103i c9103iM21897a = m21897a(jSONObject.optJSONObject("native"));
            C9105k c9105k = this.f21337e.f21360Q;
            c9105k.f21361K = c9103iM21897a;
            if (c9105k.m21900d()) {
                m21898a(this.f21337e, c8028r0);
            }
        } catch (C8231h e) {
            if (e.getCause() != null) {
                this.f21337e.f21309i = e.getCause().getMessage();
            }
            this.f21337e.f21310j = e.getMessage();
            throw e;
        } catch (C9095a e2) {
            if (e2.getCause() != null) {
                this.f21337e.f21309i = e2.getCause().getMessage();
            }
            this.f21337e.f21310j = e2.getMessage();
            IAlog.m21950f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            this.f21337e.f21310j = e3.getMessage();
            C9104j c9104j2 = this.f21337e;
            c9104j2.f21309i = "ErrorInvalidNativeOrtbObject";
            c9104j2.f21323w = e3;
            IAlog.m21950f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e3.getMessage());
            if (IAlog.f21426a == 2) {
                e3.printStackTrace();
            }
            throw e3;
        }
    }
}
