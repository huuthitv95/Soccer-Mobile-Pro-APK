package com.bytedance.sdk.component.p168ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2703ri {

    /* JADX INFO: renamed from: fi */
    protected String f7737fi;

    /* JADX INFO: renamed from: ik */
    protected xha f7738ik;

    /* JADX INFO: renamed from: lr */
    protected InterfaceC2704sf f7740lr;

    /* JADX INFO: renamed from: ri */
    protected Context f7742ri;
    C2695di xha;

    /* JADX INFO: renamed from: ka */
    protected Handler f7739ka = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: di */
    protected volatile boolean f7736di = false;

    /* JADX INFO: renamed from: mj */
    private final Map<String, C2695di> f7741mj = new HashMap();

    protected AbstractC2703ri() {
    }

    /* JADX INFO: renamed from: lr */
    private C2695di m10173lr(String str) {
        return (TextUtils.equals(str, this.f7737fi) || TextUtils.isEmpty(str)) ? this.xha : this.f7741mj.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public bgr m10175ri(JSONObject jSONObject) {
        String strOptString;
        if (this.f7736di) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (mo10109ri() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    strValueOf = objOpt instanceof String ? (String) objOpt : String.valueOf(objOpt);
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            return bgr.m10115ri().m10129ri(string2).m10128lr(string).m10126ik(strOptString3).m10127ka(strOptString).m10125fi(strOptString2).m10124di(jSONObject.optString("namespace")).xha(jSONObject.optString("__iframe_url")).m10130ri();
        } catch (JSONException unused2) {
            return bgr.m10116ri(strOptString2, -1);
        }
    }

    /* JADX INFO: renamed from: ik */
    final void m10176ik(jbs jbsVar) {
        this.f7742ri = mo10108ri(jbsVar);
        this.f7738ik = jbsVar.f7726ka;
        this.f7740lr = jbsVar.f7728mj;
        this.xha = new C2695di(jbsVar, this);
        this.f7737fi = jbsVar.f7729qt;
        mo10107lr(jbsVar);
    }

    protected void invokeMethod(final String str) {
        if (this.f7736di) {
            return;
        }
        this.f7739ka.post(new Runnable() { // from class: com.bytedance.sdk.component.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                bgr bgrVarM10175ri;
                if (AbstractC2703ri.this.f7736di) {
                    return;
                }
                try {
                    bgrVarM10175ri = AbstractC2703ri.this.m10175ri(new JSONObject(str));
                } catch (Exception unused) {
                    bgrVarM10175ri = null;
                }
                if (!bgr.m10117ri(bgrVarM10175ri)) {
                    AbstractC2703ri.this.m10178ri(bgrVarM10175ri);
                    return;
                }
                Objects.toString(bgrVarM10175ri);
                if (bgrVarM10175ri != null) {
                    AbstractC2703ri.this.m10177lr(tan.m10181ri(new slm(bgrVarM10175ri.f7694ri, "Failed to parse invocation.")), bgrVarM10175ri);
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    protected void mo10106lr() {
        this.xha.m10143ri();
        Iterator<C2695di> it = this.f7741mj.values().iterator();
        while (it.hasNext()) {
            it.next().m10143ri();
        }
        this.f7739ka.removeCallbacksAndMessages(null);
        this.f7736di = true;
    }

    /* JADX INFO: renamed from: lr */
    protected abstract void mo10107lr(jbs jbsVar);

    /* JADX INFO: renamed from: lr */
    final void m10177lr(String str, bgr bgrVar) {
        JSONObject jSONObject;
        if (this.f7736di || TextUtils.isEmpty(bgrVar.f7688di)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C2700mj.m10169ri(new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
        }
        String str2 = bgrVar.f7688di;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        mo10111ri(C2690aw.m10112ri().m10114ri("__msg_type", "callback").m10114ri("__callback_id", bgrVar.f7688di).m10114ri("__params", jSONObject).m10113lr(), bgrVar);
    }

    /* JADX INFO: renamed from: ri */
    protected abstract Context mo10108ri(jbs jbsVar);

    /* JADX INFO: renamed from: ri */
    protected abstract String mo10109ri();

    /* JADX INFO: renamed from: ri */
    protected final void m10178ri(bgr bgrVar) {
        String strMo10109ri;
        if (this.f7736di || (strMo10109ri = mo10109ri()) == null) {
            return;
        }
        C2695di c2695diM10173lr = m10173lr(bgrVar.xha);
        if (c2695diM10173lr == null) {
            Objects.toString(bgrVar);
            if (this.f7740lr != null) {
                mo10109ri();
            }
            m10177lr(tan.m10181ri(new slm(-4, "Namespace " + bgrVar.xha + " unknown.")), bgrVar);
            return;
        }
        C2696fi c2696fi = new C2696fi();
        c2696fi.f7716lr = strMo10109ri;
        c2696fi.f7717ri = this.f7742ri;
        c2696fi.f7715ik = c2695diM10173lr;
        try {
            C2695di.ri riVarM10142ri = c2695diM10173lr.m10142ri(bgrVar, c2696fi);
            if (riVarM10142ri != null) {
                if (riVarM10142ri.f7714ri) {
                    m10177lr(riVarM10142ri.f7713lr, bgrVar);
                }
                if (this.f7740lr != null) {
                    mo10109ri();
                    return;
                }
                return;
            }
            Objects.toString(bgrVar);
            if (this.f7740lr != null) {
                mo10109ri();
            }
            m10177lr(tan.m10181ri(new slm(-2, "Function " + bgrVar.f7691ka + " is not registered.")), bgrVar);
        } catch (Exception e) {
            Objects.toString(bgrVar);
            m10177lr(tan.m10181ri(e), bgrVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10110ri(String str);

    /* JADX INFO: renamed from: ri */
    protected void mo10111ri(String str, bgr bgrVar) {
        mo10110ri(str);
    }
}
