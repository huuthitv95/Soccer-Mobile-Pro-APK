package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p210fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3163lr extends C2320ri<C3164ri> {
    private int akr;

    /* JADX INFO: renamed from: de */
    private JSONArray f10413de;

    /* JADX INFO: renamed from: zv */
    private int f10414zv;

    public C3163lr(Context context) {
        super(context);
        this.akr = 0;
        this.f10414zv = 0;
    }

    /* JADX INFO: renamed from: ik */
    private void m13202ik() {
        if (this.f5929ri == null || this.f5929ri.isEmpty()) {
            return;
        }
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f5929ri.get(0);
        if (this.f10413de == null) {
            return;
        }
        for (int i = 0; i < this.f10413de.length(); i++) {
            C2228co c2228co = new C2228co(this.f5888lr);
            c2228co.m7349ri(this.f5911vt);
            try {
                JSONObject jSONObjectOptJSONObject = this.f10413de.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.f5886ka.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.f5886ka.put("$item", jSONObjectOptJSONObject);
                    }
                    ((C3164ri) this.f5875fi).m13206ri(c2228co.m7344ri(abstractViewOnTouchListenerC2318ik.ory(), this.f5886ka, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m13203ka() {
        for (int i = 0; i < this.f5929ri.size(); i++) {
            AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f5929ri.get(i);
            if (abstractViewOnTouchListenerC2318ik != null) {
                C2228co c2228co = new C2228co(this.f5888lr);
                c2228co.m7349ri(this.f5911vt);
                ((C3164ri) this.f5875fi).m13206ri(c2228co.m7344ri(abstractViewOnTouchListenerC2318ik.ory(), this.f5886ka, (JSONObject) null));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        if (this.f5875fi instanceof C3164ri) {
            ((C3164ri) this.f5875fi).setOrientation(this.akr);
            ((C3164ri) this.f5875fi).m13207ri(this);
            if (this.f10414zv == 1) {
                m13203ka();
            } else {
                m13202ik();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public View mo7552ri() {
        try {
            this.f5875fi = new C3164ri(this.f5888lr);
            ((C3164ri) this.f5875fi).m13205ri((InterfaceC2282ka) this);
        } catch (Throwable unused) {
            this.f5875fi = new View(this.f5888lr);
        }
        return this.f5875fi;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7661ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7822ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, ViewGroup.LayoutParams layoutParams) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "driveMode":
                this.f10414zv = C2343ik.m8030ri(str2, 0);
                break;
            case "direction":
                if (!TextUtils.equals(str2, "vertical")) {
                    this.akr = 0;
                    break;
                } else {
                    this.akr = 1;
                    break;
                }
                break;
            case "dataList":
                this.f10413de = C2346lr.m8038ri(str2, (JSONArray) null);
                break;
        }
    }
}
