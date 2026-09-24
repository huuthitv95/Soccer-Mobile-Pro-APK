package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: di */
    private String f6812di;

    /* JADX INFO: renamed from: fi */
    private C2471fi f6813fi;

    /* JADX INFO: renamed from: ik */
    public JSONObject f6814ik;

    /* JADX INFO: renamed from: ka */
    private C2470di f6815ka;

    /* JADX INFO: renamed from: lr */
    public String f6816lr;

    /* JADX INFO: renamed from: ri */
    public int f6817ri;

    public xha(C2471fi c2471fi) {
        this.f6813fi = c2471fi;
        this.f6817ri = c2471fi.m8599ri();
        this.f6816lr = c2471fi.m8593ik();
        this.f6814ik = c2471fi.m8592fi().saa();
        this.f6812di = c2471fi.m8595ka();
        if (C2490ka.m8808ik() == 1) {
            this.f6815ka = c2471fi.xha();
        } else {
            this.f6815ka = c2471fi.m8592fi();
        }
        if (C2490ka.m8810lr()) {
            this.f6815ka = c2471fi.m8592fi();
        }
    }

    private boolean hws() {
        if (C2490ka.m8810lr()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f6816lr) && this.f6816lr.contains("adx:")) || C2440sf.m8414lr();
    }

    /* JADX INFO: renamed from: id */
    private boolean m8690id() {
        return (C2490ka.m8810lr() && (this.f6813fi.m8596lr().contains("logo-union") || this.f6813fi.m8596lr().contains("logounion") || this.f6813fi.m8596lr().contains("logoad"))) || "logo-union".equals(this.f6813fi.m8596lr()) || "logounion".equals(this.f6813fi.m8596lr()) || "logoad".equals(this.f6813fi.m8596lr());
    }

    /* JADX INFO: renamed from: lr */
    public static float[] m8691lr(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    /* JADX INFO: renamed from: ri */
    public static int m8692ri(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(C11744X3.i.f26348T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public double aac() {
        return this.f6815ka.dzy();
    }

    /* JADX INFO: renamed from: ac */
    public boolean m8693ac() {
        return this.f6815ka.adz();
    }

    public boolean ajz() {
        return this.f6815ka.iph();
    }

    /* JADX INFO: renamed from: aw */
    public double m8694aw() {
        if (this.f6817ri == 11) {
            try {
                double d = Double.parseDouble(this.f6816lr);
                return !C2490ka.m8810lr() ? (int) d : d;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    /* JADX INFO: renamed from: ay */
    public String m8695ay() {
        return this.f6815ka.m8548qd();
    }

    public double bgr() {
        return this.f6815ka.tan();
    }

    public int bnj() {
        return this.f6815ka.m8489eb();
    }

    /* JADX INFO: renamed from: bu */
    public float m8696bu() {
        return this.f6815ka.m8476co();
    }

    /* JADX INFO: renamed from: co */
    public String m8697co() {
        return this.f6812di;
    }

    /* JADX INFO: renamed from: di */
    public String m8698di() {
        if (this.f6817ri == 0) {
            return !TextUtils.isEmpty(this.f6816lr) ? this.f6816lr : this.f6814ik.optString(com.bytedance.sdk.component.adexpress.p124ka.xha.m8829ik(C2490ka.m8811ri()));
        }
        return "";
    }

    /* JADX INFO: renamed from: dw */
    public double m8699dw() {
        return this.f6815ka.m8531mj();
    }

    public int dzy() {
        return this.f6815ka.jbs();
    }

    /* JADX INFO: renamed from: fe */
    public int m8700fe() {
        return this.f6815ka.m8491fb();
    }

    public boolean feb() {
        return this.f6815ka.sez();
    }

    /* JADX INFO: renamed from: fi */
    public float m8701fi() {
        return this.f6815ka.m8538nr();
    }

    /* JADX INFO: renamed from: fr */
    public String m8702fr() {
        return this.f6815ka.m8500fn();
    }

    public boolean gcp() {
        return this.f6815ka.hcw();
    }

    public int hcw() {
        return this.f6815ka.m8524lr();
    }

    public boolean hpn() {
        return this.f6815ka.akr();
    }

    /* JADX INFO: renamed from: ig */
    public String m8703ig() {
        return this.f6815ka.srn();
    }

    public int igq() {
        String strM8548qd = this.f6815ka.m8548qd();
        if ("skip-with-time-skip-btn".equals(this.f6813fi.m8596lr()) || "skip".equals(this.f6813fi.m8596lr()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f6813fi.m8596lr())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f6813fi.m8596lr()) && !"skip-with-time".equals(this.f6813fi.m8596lr())) {
            if (this.f6817ri == 10 && TextUtils.equals(this.f6815ka.srn(), "click")) {
                return 5;
            }
            if (m8690id() && hws()) {
                return 0;
            }
            if (m8690id()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f6813fi.m8596lr())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strM8548qd) && !strM8548qd.equals("none")) {
                if (strM8548qd.equals("video") || (this.f6813fi.m8599ri() == 7 && TextUtils.equals(strM8548qd, Constants.NORMAL))) {
                    return (C2490ka.m8810lr() && this.f6813fi.m8592fi() != null && this.f6813fi.m8592fi().m8569sz()) ? 11 : 4;
                }
                if (strM8548qd.equals(Constants.NORMAL)) {
                    return 1;
                }
                return (strM8548qd.equals("creative") || "slide".equals(this.f6815ka.srn())) ? 2 : 0;
            }
        }
        return 0;
    }

    public String ihz() {
        return this.f6815ka.m8469ay();
    }

    /* JADX INFO: renamed from: ik */
    public int m8704ik() {
        return (int) this.f6815ka.m8576vr();
    }

    public int jbs() {
        int iM8709mj = m8709mj();
        if (iM8709mj == 4) {
            return 17;
        }
        return iM8709mj == 3 ? GravityCompat.END : GravityCompat.START;
    }

    /* JADX INFO: renamed from: jc */
    public int m8705jc() {
        return this.f6815ka.m8589zk();
    }

    /* JADX INFO: renamed from: ka */
    public int m8706ka() {
        return (int) this.f6815ka.slm();
    }

    /* JADX INFO: renamed from: kt */
    public String m8707kt() {
        return this.f6815ka.m8506ig();
    }

    /* JADX INFO: renamed from: lr */
    public int m8708lr() {
        return (int) this.f6815ka.m8472bu();
    }

    public int luy() {
        return this.f6815ka.che();
    }

    /* JADX INFO: renamed from: mj */
    public int m8709mj() {
        String strIhz = this.f6815ka.ihz();
        if ("left".equals(strIhz)) {
            return 17;
        }
        if ("center".equals(strIhz)) {
            return 4;
        }
        return "right".equals(strIhz) ? 3 : 2;
    }

    /* JADX INFO: renamed from: nd */
    public int m8710nd() {
        return this.f6815ka.m8542oh();
    }

    /* JADX INFO: renamed from: nr */
    public int m8711nr() {
        return this.f6815ka.m8515jm();
    }

    /* JADX INFO: renamed from: oh */
    public int m8712oh() {
        return this.f6815ka.m8493fi();
    }

    public int ory() {
        return this.f6815ka.m8507ik();
    }

    /* JADX INFO: renamed from: pc */
    public String m8713pc() {
        return this.f6815ka.m8580vt();
    }

    /* JADX INFO: renamed from: pv */
    public String m8714pv() {
        return this.f6815ka.m8550qt();
    }

    /* JADX INFO: renamed from: qd */
    public boolean m8715qd() {
        return this.f6815ka.ajz();
    }

    /* JADX INFO: renamed from: qh */
    public boolean m8716qh() {
        return this.f6815ka.m8468aw();
    }

    public String qmx() {
        return this.f6815ka.m8501fr();
    }

    /* JADX INFO: renamed from: qt */
    public String m8717qt() {
        int i = this.f6817ri;
        return (i == 2 || i == 13) ? this.f6816lr : "";
    }

    /* JADX INFO: renamed from: ri */
    public int m8718ri() {
        return (int) this.f6815ka.bgr();
    }

    /* JADX INFO: renamed from: ri */
    public void m8719ri(float f) {
        this.f6815ka.m8555ri(f);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m8720ri(int i) {
        C2471fi c2471fi = this.f6813fi;
        if (c2471fi == null) {
            return false;
        }
        if (i == 1) {
            this.f6815ka = c2471fi.xha();
        } else {
            this.f6815ka = c2471fi.m8592fi();
        }
        return this.f6815ka != null;
    }

    public String rzk() {
        return this.f6815ka.bzf();
    }

    public String saa() {
        return this.f6815ka.eqw();
    }

    /* JADX INFO: renamed from: sf */
    public String m8721sf() {
        return this.f6817ri == 1 ? this.f6816lr : "";
    }

    public boolean siy() {
        return this.f6815ka.akr();
    }

    public int slm() {
        return m8692ri(this.f6815ka.m8566su());
    }

    public int srn() {
        return this.f6815ka.luy();
    }

    /* JADX INFO: renamed from: su */
    public long m8722su() {
        return this.f6815ka.m8584xh();
    }

    /* JADX INFO: renamed from: ta */
    public int m8723ta() {
        return this.f6815ka.nbc();
    }

    public int tan() {
        return this.f6815ka.ezp();
    }

    public int tnn() {
        return this.f6815ka.tpb();
    }

    /* JADX INFO: renamed from: tw */
    public String m8724tw() {
        return this.f6815ka.ory();
    }

    /* JADX INFO: renamed from: ud */
    public int m8725ud() {
        return this.f6815ka.m8545pu();
    }

    /* JADX INFO: renamed from: uq */
    public boolean m8726uq() {
        return this.f6815ka.feb();
    }

    /* JADX INFO: renamed from: vr */
    public float m8727vr() {
        return this.f6815ka.m8562sf();
    }

    public String whw() {
        return this.f6815ka.m8487dw();
    }

    public int wjv() {
        return this.f6815ka.zyn();
    }

    /* JADX INFO: renamed from: xd */
    public int m8728xd() {
        return this.f6815ka.m8516ka();
    }

    /* JADX INFO: renamed from: xe */
    public double m8729xe() {
        return this.f6815ka.m8546pv();
    }

    public int xha() {
        return m8692ri(this.f6815ka.m8573uq());
    }

    /* JADX INFO: renamed from: xm */
    public String m8730xm() {
        return this.f6815ka.m8480de();
    }

    public int yjm() {
        return this.f6815ka.m8590zv();
    }

    /* JADX INFO: renamed from: zb */
    public int m8731zb() {
        return this.f6815ka.m8581xd();
    }

    /* JADX INFO: renamed from: zf */
    public int m8732zf() {
        return m8692ri(this.f6815ka.wjv());
    }

    /* JADX INFO: renamed from: zk */
    public int m8733zk() {
        return this.f6815ka.m8504hd();
    }

    public int zyn() {
        return this.f6815ka.xha();
    }
}
