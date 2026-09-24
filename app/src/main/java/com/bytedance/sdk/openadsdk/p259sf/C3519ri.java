package com.bytedance.sdk.openadsdk.p259sf;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3211fi;
import com.bytedance.sdk.openadsdk.core.model.C3278di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.sf.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3519ri implements InterfaceC3516ik {

    /* JADX INFO: renamed from: ik */
    private final Map<String, InterfaceC3370ik> f12751ik = new HashMap();

    /* JADX INFO: renamed from: lr */
    private final InterfaceC3518lr f12752lr;

    /* JADX INFO: renamed from: ri */
    private final wjv f12753ri;

    private C3519ri(InterfaceC3518lr interfaceC3518lr, wjv wjvVar) {
        this.f12752lr = interfaceC3518lr;
        this.f12753ri = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    private wjv m15928ri(JSONObject jSONObject, String str) {
        String strM14077ri;
        if (jSONObject == null) {
            return null;
        }
        wjv wjvVar = new wjv();
        wjvVar.m14398fi(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            wjvVar.m14528su(str);
        }
        if (this.f12753ri != null) {
            String strM14077ri2 = wjvVar.tyz() != null ? wjvVar.tyz().m14077ri() : null;
            if (TextUtils.isEmpty(strM14077ri2)) {
                return this.f12753ri;
            }
            C3278di c3278diTyz = this.f12753ri.tyz();
            if (c3278diTyz != null && strM14077ri2.equals(c3278diTyz.m14077ri())) {
                return this.f12753ri;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (c3278diTyz != null) {
                try {
                    strM14077ri = c3278diTyz.m14077ri();
                } catch (JSONException unused) {
                }
            } else {
                strM14077ri = AbstractJsonLexerKt.NULL;
            }
            jSONObject2.put("lu", strM14077ri);
            jSONObject2.put("ju", strM14077ri2);
            wjv wjvVar2 = this.f12753ri;
            C3211fi.m13462ri(wjvVar2, C3571ig.m16476ri(wjvVar2), -5, jSONObject2);
            if (c3278diTyz != null && strM14077ri2.contains("play.google.com/store") && !strM14077ri2.contains(Constants.REFERRER)) {
                wjvVar.tyz().m14080ri(c3278diTyz.m14077ri());
            }
        }
        return wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    private InterfaceC3370ik m15929ri(Context context, String str) {
        return C3371ka.m15240ri(context, str);
    }

    /* JADX INFO: renamed from: ri */
    public static C3519ri m15930ri(InterfaceC3518lr interfaceC3518lr, wjv wjvVar) {
        return new C3519ri(interfaceC3518lr, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m15931ri(Context context, wjv wjvVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || wjvVar == null || wjvVar.tyz() == null || jSONObject == null || this.f12752lr == null || this.f12751ik.get(wjvVar.tyz().m14077ri()) != null) {
            return;
        }
        String strM16458lr = C3571ig.m16458lr(i);
        if (TextUtils.isEmpty(strM16458lr)) {
            return;
        }
        this.f12751ik.put(wjvVar.tyz().m14077ri(), m15929ri(context, strM16458lr));
    }

    /* JADX INFO: renamed from: ri */
    private void m15932ri(wjv wjvVar, JSONObject jSONObject) {
        if (this.f12752lr == null || wjvVar == null || wjvVar.tyz() == null) {
            return;
        }
        String strM14077ri = wjvVar.tyz().m14077ri();
        if (this.f12751ik.containsKey(strM14077ri)) {
            this.f12751ik.remove(strM14077ri);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f12752lr.mo13455ri("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                C2707ac.m10196ik("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3516ik
    /* JADX INFO: renamed from: ri */
    public void mo15924ri() {
        this.f12751ik.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3516ik
    /* JADX INFO: renamed from: ri */
    public void mo15925ri(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.f12753ri == null) {
            return;
        }
        C3371ka.m15240ri(context, str).mo15239ri(this.f12753ri);
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3516ik
    /* JADX INFO: renamed from: ri */
    public void mo15926ri(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        m15931ri(context, m15928ri(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z);
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3516ik
    /* JADX INFO: renamed from: ri */
    public void mo15927ri(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        m15932ri(m15928ri(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }
}
