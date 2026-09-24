package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ka.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2475mj {

    /* JADX INFO: renamed from: aw */
    private String f6777aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co */
    private List<List<C2475mj>> f6778co;

    /* JADX INFO: renamed from: di */
    private float f6779di;

    /* JADX INFO: renamed from: fi */
    private float f6780fi;

    /* JADX INFO: renamed from: ik */
    private float f6781ik;
    private C2471fi jbs;

    /* JADX INFO: renamed from: ka */
    private float f6782ka;

    /* JADX INFO: renamed from: lr */
    private float f6783lr;

    /* JADX INFO: renamed from: mj */
    private float f6784mj;

    /* JADX INFO: renamed from: qt */
    private List<C2475mj> f6785qt;

    /* JADX INFO: renamed from: ri */
    private String f6786ri;

    /* JADX INFO: renamed from: sf */
    private C2475mj f6787sf;
    private float xha;

    /* JADX INFO: renamed from: vr */
    private Map<String, String> f6788vr = new HashMap();
    private Map<Integer, String> slm = new HashMap();

    /* JADX INFO: renamed from: ac */
    public Map<String, String> m8607ac() {
        return this.f6788vr;
    }

    /* JADX INFO: renamed from: aw */
    public int m8608aw() {
        C2470di c2470diM8592fi = this.jbs.m8592fi();
        return c2470diM8592fi.m8570ta() + c2470diM8592fi.bnj();
    }

    /* JADX INFO: renamed from: ay */
    public boolean m8609ay() {
        return this.jbs.m8592fi().qmx() < 0 || this.jbs.m8592fi().m8505id() < 0 || this.jbs.m8592fi().m8572ud() < 0 || this.jbs.m8592fi().hpn() < 0;
    }

    public int bgr() {
        C2470di c2470diM8592fi = this.jbs.m8592fi();
        return c2470diM8592fi.tnn() + c2470diM8592fi.m8492fe();
    }

    /* JADX INFO: renamed from: bu */
    public List<List<C2475mj>> m8610bu() {
        return this.f6778co;
    }

    /* JADX INFO: renamed from: co */
    public C2475mj m8611co() {
        return this.f6787sf;
    }

    /* JADX INFO: renamed from: di */
    public float m8612di() {
        return this.f6783lr;
    }

    /* JADX INFO: renamed from: di */
    public void m8613di(float f) {
        this.xha = f;
    }

    /* JADX INFO: renamed from: fi */
    public float m8614fi() {
        return this.f6780fi;
    }

    /* JADX INFO: renamed from: fi */
    public void m8615fi(float f) {
        this.f6779di = f;
    }

    public void ihz() {
        List<List<C2475mj>> list = this.f6778co;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<C2475mj> list2 : this.f6778co) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.f6778co = arrayList;
    }

    /* JADX INFO: renamed from: ik */
    public String m8616ik() {
        return this.f6786ri;
    }

    /* JADX INFO: renamed from: ik */
    public void m8617ik(float f) {
        this.f6783lr = f;
    }

    /* JADX INFO: renamed from: ik */
    public void m8618ik(String str) {
        this.jbs.m8592fi().m8485di(str);
    }

    public float jbs() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ka */
    public float m8619ka() {
        return this.f6782ka;
    }

    /* JADX INFO: renamed from: ka */
    public void m8620ka(float f) {
        this.f6781ik = f;
    }

    /* JADX INFO: renamed from: lr */
    public Map<Integer, String> m8621lr() {
        return this.slm;
    }

    /* JADX INFO: renamed from: lr */
    public void m8622lr(float f) {
        this.f6780fi = f;
    }

    /* JADX INFO: renamed from: lr */
    public void m8623lr(String str) {
        this.f6786ri = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m8624lr(List<List<C2475mj>> list) {
        this.f6778co = list;
    }

    /* JADX INFO: renamed from: mj */
    public float m8625mj() {
        return this.f6779di;
    }

    /* JADX INFO: renamed from: nr */
    public boolean m8626nr() {
        List<C2475mj> list = this.f6785qt;
        return list == null || list.size() <= 0;
    }

    /* JADX INFO: renamed from: qt */
    public C2471fi m8627qt() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public String m8628ri() {
        return this.f6777aw;
    }

    /* JADX INFO: renamed from: ri */
    public String m8629ri(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.jbs.m8596lr());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f6786ri);
        if (this.jbs.m8592fi() != null) {
            sb.append(CertificateUtil.DELIMITER);
            sb.append(this.jbs.m8592fi().m8490eu());
        }
        sb.append(CertificateUtil.DELIMITER);
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ri */
    public void m8630ri(float f) {
        this.f6782ka = f;
    }

    /* JADX INFO: renamed from: ri */
    public void m8631ri(C2471fi c2471fi) {
        this.jbs = c2471fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m8632ri(C2475mj c2475mj) {
        this.f6787sf = c2475mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m8633ri(String str) {
        this.f6777aw = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m8634ri(String str, String str2) {
        this.f6788vr.put(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m8635ri(List<C2475mj> list) {
        this.f6785qt = list;
    }

    /* JADX INFO: renamed from: ri */
    public void m8636ri(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.slm.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8637ri(boolean z) {
        this.bgr = z;
    }

    /* JADX INFO: renamed from: sf */
    public List<C2475mj> m8638sf() {
        return this.f6785qt;
    }

    public float slm() {
        C2470di c2470diM8592fi = this.jbs.m8592fi();
        return bgr() + c2470diM8592fi.m8472bu() + c2470diM8592fi.bgr() + (c2470diM8592fi.m8476co() * 2.0f);
    }

    public boolean tan() {
        return this.bgr;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f6786ri + "', x=" + this.f6783lr + ", y=" + this.f6781ik + ", width=" + this.f6779di + ", height=" + this.xha + ", remainWidth=" + this.f6784mj + ", rootBrick=" + this.jbs + ", childrenBrickUnits=" + this.f6785qt + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: uq */
    public boolean m8639uq() {
        return TextUtils.equals(this.jbs.m8592fi().m8587zf(), "flex");
    }

    /* JADX INFO: renamed from: vr */
    public float m8640vr() {
        C2470di c2470diM8592fi = this.jbs.m8592fi();
        return m8608aw() + c2470diM8592fi.m8576vr() + c2470diM8592fi.slm() + (c2470diM8592fi.m8476co() * 2.0f);
    }

    public String wjv() {
        return this.jbs.m8592fi().wjv();
    }

    public float xha() {
        return this.f6781ik;
    }

    public void xha(float f) {
        this.f6784mj = f;
    }
}
