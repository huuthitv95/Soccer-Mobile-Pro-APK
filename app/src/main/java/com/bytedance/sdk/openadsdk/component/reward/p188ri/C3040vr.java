package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p063lr.InterfaceC2003ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.C2992ka;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.ihz;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3040vr {

    /* JADX INFO: renamed from: ac */
    private String f9490ac;

    /* JADX INFO: renamed from: aw */
    private boolean f9491aw;

    /* JADX INFO: renamed from: ay */
    private boolean f9492ay;
    private boolean bgr;

    /* JADX INFO: renamed from: co */
    private long f9494co;

    /* JADX INFO: renamed from: di */
    InterfaceC1999ik f9495di;

    /* JADX INFO: renamed from: dw */
    private C3119ri.ri f9496dw;

    /* JADX INFO: renamed from: ik */
    boolean f9499ik;
    private FrameLayout jbs;

    /* JADX INFO: renamed from: ka */
    final boolean f9500ka;

    /* JADX INFO: renamed from: mj */
    private final wjv f9502mj;

    /* JADX INFO: renamed from: nr */
    private long f9503nr;
    private xha ory;

    /* JADX INFO: renamed from: qt */
    private final String f9504qt;

    /* JADX INFO: renamed from: sf */
    private long f9506sf;
    private long tan;

    /* JADX INFO: renamed from: uq */
    private boolean f9508uq;

    /* JADX INFO: renamed from: vr */
    private boolean f9509vr;
    private final C3022ri wjv;
    private final Activity xha;

    /* JADX INFO: renamed from: ri */
    protected boolean f9505ri = false;

    /* JADX INFO: renamed from: lr */
    boolean f9501lr = false;

    /* JADX INFO: renamed from: fi */
    protected boolean f9497fi = false;
    private long slm = -1;

    /* JADX INFO: renamed from: bu */
    private int f9493bu = -1;

    /* JADX INFO: renamed from: fr */
    private boolean f9498fr = false;

    /* JADX INFO: renamed from: su */
    private int f9507su = 0;
    private float igq = 1.0f;

    /* JADX INFO: renamed from: zf */
    private boolean f9510zf = false;
    private volatile boolean hcw = false;
    private HashSet<String> ihz = new HashSet<>();

    public C3040vr(C3022ri c3022ri) {
        this.wjv = c3022ri;
        this.xha = c3022ri.f9384ig;
        this.f9502mj = c3022ri.f9389lr;
        this.f9500ka = c3022ri.f9387ka;
        this.f9504qt = c3022ri.f9381fi;
    }

    /* JADX INFO: renamed from: lr */
    private void m12117lr(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.f9493bu) - j);
        int i = this.f9493bu;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.ihz.contains(this.f9490ac)) {
            return;
        }
        if (this.f9493bu > j) {
            C3332vr.m14976ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.vr.1
                @Override // java.lang.Runnable
                public void run() {
                    C3040vr.this.m12146pv();
                    C3040vr.this.wjv.f9374ay.m12265ri(C3040vr.this.f9493bu, C3040vr.this.f9490ac);
                }
            }, iAbs);
        } else {
            m12146pv();
            this.wjv.f9374ay.m12265ri(this.f9493bu, this.f9490ac);
        }
        this.ihz.add(this.f9490ac);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12119ri(long j, boolean z) {
        if (this.f9495di == null || this.f9502mj.m14389eu() == null) {
            return false;
        }
        String strMo6274ri = CacheDirFactory.getICacheDir(this.f9502mj.m14476qf()).mo6274ri();
        File file = new File(strMo6274ri, this.f9502mj.m14389eu().bgr());
        if (file.exists() && file.length() > 0) {
            this.f9501lr = true;
        }
        C3126lr c3126lrM14345ri = wjv.m14345ri(strMo6274ri, this.f9502mj);
        c3126lrM14345ri.m6318lr(this.f9502mj.m14533tn());
        c3126lrM14345ri.m6317lr(this.jbs.getWidth());
        c3126lrM14345ri.m6311ik(this.jbs.getHeight());
        c3126lrM14345ri.m6312ik(this.f9502mj.yjg());
        c3126lrM14345ri.m6326ri(j);
        c3126lrM14345ri.m6329ri(z);
        return this.f9495di.mo6387ri(c3126lrM14345ri);
    }

    /* JADX INFO: renamed from: ta */
    private void m12120ta() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik == null || interfaceC1999ik.mo6388sf() == null) {
            return;
        }
        this.f9506sf = this.f9495di.mo6373di();
        if (this.f9495di.mo6388sf().mo6169ik() || !this.f9495di.mo6388sf().mo6173lr()) {
            this.f9495di.mo6377lr();
            this.f9495di.mo6376ka();
            this.f9505ri = true;
        }
    }

    /* JADX INFO: renamed from: ac */
    public void m12121ac() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6374fi();
        }
    }

    /* JADX INFO: renamed from: aw */
    public long m12122aw() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return interfaceC1999ik != null ? interfaceC1999ik.mo6373di() : this.f9506sf;
    }

    /* JADX INFO: renamed from: ay */
    public int m12123ay() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.mo6379qt();
        }
        return 0;
    }

    public long bgr() {
        return this.f9494co;
    }

    /* JADX INFO: renamed from: bu */
    public long m12124bu() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.xha();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: co */
    public boolean m12125co() {
        return this.f9505ri;
    }

    /* JADX INFO: renamed from: di */
    public boolean m12126di() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return (interfaceC1999ik == null || interfaceC1999ik.mo6388sf() == null || !this.f9495di.mo6388sf().mo6167di()) ? false : true;
    }

    /* JADX INFO: renamed from: dw */
    public boolean m12127dw() {
        return this.f9495di != null;
    }

    public void dzy() {
        this.f9498fr = false;
        tan();
    }

    /* JADX INFO: renamed from: fe */
    public boolean m12128fe() {
        return this.f9491aw;
    }

    public void feb() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik instanceof C3119ri) {
            ((C3119ri) interfaceC1999ik).srn();
        }
    }

    /* JADX INFO: renamed from: fi */
    public xha m12129fi() {
        return this.ory;
    }

    /* JADX INFO: renamed from: fi */
    public void m12130fi(boolean z) {
        this.f9509vr = z;
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik instanceof C3119ri) {
            ((C3119ri) interfaceC1999ik).m12774di(z);
        }
    }

    /* JADX INFO: renamed from: fr */
    public int m12131fr() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.mo6378mj();
        }
        return 0;
    }

    public boolean hcw() {
        return this.hcw;
    }

    /* JADX INFO: renamed from: ig */
    public boolean m12132ig() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik == null || interfaceC1999ik.mo6388sf() == null) {
            return false;
        }
        return this.f9495di.mo6388sf().mo6186ri();
    }

    public long igq() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.jbs();
        }
        return 0L;
    }

    public void ihz() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6375ik();
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m12133ik(boolean z) {
        this.f9499ik = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m12134ik() {
        return this.f9498fr;
    }

    public boolean jbs() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return (interfaceC1999ik == null || interfaceC1999ik.mo6388sf() == null || !this.f9495di.mo6388sf().xha()) ? false : true;
    }

    /* JADX INFO: renamed from: jc */
    public View m12135jc() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik instanceof C3119ri) {
            return (View) ((C3119ri) interfaceC1999ik).m12776ig();
        }
        return null;
    }

    /* JADX INFO: renamed from: ka */
    public void m12136ka(boolean z) {
        this.f9492ay = z;
        if (this.f9495di instanceof C3119ri) {
            if (z) {
                ((C3119ri) this.f9495di).m12972lr(this.f9502mj.m14389eu().m6365uq());
            } else {
                this.f9502mj.m14389eu().m6358qt(1);
                ((C3119ri) this.f9495di).m12972lr(1);
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m12137ka() {
        int i;
        if (this.f9510zf) {
            return this.f9498fr && this.f9507su == 1;
        }
        return this.f9498fr && ((i = this.f9507su) == 2 || i == 1);
    }

    /* JADX INFO: renamed from: kt */
    public void m12138kt() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik instanceof C3119ri) {
            ((C3119ri) interfaceC1999ik).m12778qd();
        }
    }

    /* JADX INFO: renamed from: lr */
    public long m12139lr() {
        return this.f9503nr;
    }

    /* JADX INFO: renamed from: lr */
    public void m12140lr(long j) {
        this.f9506sf = j;
    }

    /* JADX INFO: renamed from: lr */
    protected void m12141lr(InterfaceC3118lr interfaceC3118lr) {
        if (!m12171zf() || interfaceC3118lr == null) {
            return;
        }
        interfaceC3118lr.mo10580ri(m12169vr(), true);
    }

    /* JADX INFO: renamed from: lr */
    public void m12142lr(boolean z) {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6377lr();
            this.bgr = z;
        }
    }

    /* JADX INFO: renamed from: mj */
    public InterfaceC2003ri m12143mj() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik instanceof C2992ka ? ((C2992ka) interfaceC1999ik).m11691bu() : interfaceC1999ik.mo6372co();
        }
        return null;
    }

    /* JADX INFO: renamed from: nr */
    public InterfaceC2004ri m12144nr() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.mo6388sf();
        }
        return null;
    }

    /* JADX INFO: renamed from: oh */
    public void m12145oh() {
        int i = this.f9507su;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                m12165ri(jSONObject);
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public boolean ory() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return interfaceC1999ik != null && interfaceC1999ik.mo6388sf() == null;
    }

    /* JADX INFO: renamed from: pv */
    public void m12146pv() {
        try {
            if (m12126di()) {
                this.f9497fi = true;
                m12168uq();
            }
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX INFO: renamed from: qd */
    public double m12147qd() {
        double dM6339di;
        long jM14165ka;
        ihz ihzVarM14364ay = this.f9502mj.m14364ay();
        if (!C3273ac.m13968ka(this.f9502mj) || ihzVarM14364ay == null) {
            if (!C3273ac.xha(this.f9502mj) || ihzVarM14364ay == null) {
                C1997lr c1997lrM14389eu = this.f9502mj.m14389eu();
                dM6339di = c1997lrM14389eu != null ? c1997lrM14389eu.m6339di() * ((double) c1997lrM14389eu.m6365uq()) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } else {
                jM14165ka = ihzVarM14364ay.m14165ka();
            }
            if (this.wjv.f9414zk != null) {
                this.wjv.f9414zk.m11653ri((long) dM6339di);
            }
            return dM6339di;
        }
        jM14165ka = ihzVarM14364ay.m14167lr();
        dM6339di = jM14165ka;
        if (this.wjv.f9414zk != null) {
            this.wjv.f9414zk.m11653ri((long) dM6339di);
        }
        return dM6339di;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m12148qt() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return interfaceC1999ik != null && interfaceC1999ik.bgr();
    }

    /* JADX INFO: renamed from: ri */
    public long m12149ri() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ri */
    public void m12150ri(int i, int i2) {
        if (this.f9495di != null) {
            C3412vr.ri riVar = new C3412vr.ri();
            riVar.m15459ik(m12124bu());
            riVar.m15463ka(m12167su());
            riVar.m15466lr(m12122aw());
            riVar.m15471ri(i);
            riVar.m15465lr(i2);
            C3413ri.m15483ka(this.f9495di.mo6372co(), riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12151ri(int i, String str) {
        this.f9493bu = i;
        this.f9490ac = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m12152ri(long j) {
        this.slm = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m12153ri(long j, long j2) {
        this.f9494co = j;
        if (this.hcw && (m12132ig() || m12126di() || j > 0)) {
            m12166sf();
        }
        m12117lr(j, j2);
    }

    /* JADX INFO: renamed from: ri */
    public void m12154ri(FrameLayout frameLayout, xha xhaVar) {
        if (this.f9508uq) {
            return;
        }
        this.f9508uq = true;
        this.jbs = frameLayout;
        if (this.f9502mj.cmy() != null) {
            this.f9507su = this.f9502mj.cmy().m14238lr();
            this.igq = this.f9502mj.cmy().m14239ri();
        }
        this.ory = xhaVar;
        if (wjv.m14332fi(this.f9502mj)) {
            this.f9510zf = true;
            this.f9495di = new C3119ri(this.xha, this.jbs, this.f9502mj, xhaVar);
            m12136ka(this.f9492ay);
            C3119ri.ri riVar = this.f9496dw;
            if (riVar != null) {
                ((C3119ri) this.f9495di).m12779ri(riVar);
            }
            ((C3119ri) this.f9495di).m12774di(this.f9509vr);
            return;
        }
        this.f9510zf = false;
        C2992ka c2992ka = new C2992ka(this.f9502mj, xhaVar);
        this.f9495di = c2992ka;
        C3119ri.ri riVar2 = this.f9496dw;
        if (riVar2 != null) {
            c2992ka.m11692ri(riVar2);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12155ri(InterfaceC1999ik.ri riVar) {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6383ri(riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12156ri(AbstractC2998lr abstractC2998lr) {
        if (this.wjv.jbs.get() || !this.wjv.tnn || C3279dw.m14090ik(this.wjv.f9389lr)) {
            return;
        }
        boolean zM14332fi = wjv.m14332fi(this.wjv.f9389lr);
        boolean zM12258ka = this.wjv.f9374ay.m12258ka();
        int iM14829aw = C3299nr.m14639ka().m14829aw(String.valueOf(this.wjv.f9377di));
        if ((!zM14332fi && iM14829aw == 1 && zM12258ka) || C3273ac.m13968ka(this.wjv.f9389lr) || C3273ac.xha(this.wjv.f9389lr) || this.f9497fi || !abstractC2998lr.mo11716fi()) {
            return;
        }
        this.wjv.f9386jc.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.wjv.f9386jc.sendMessageDelayed(messageObtain, 5000L);
        this.hcw = true;
    }

    /* JADX INFO: renamed from: ri */
    public void m12157ri(InterfaceC3118lr interfaceC3118lr) {
        try {
            this.f9497fi = false;
            if (m12125co()) {
                m12120ta();
                m12141lr(interfaceC3118lr);
            } else if (jbs()) {
                ihz();
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12158ri(C3119ri.ri riVar) {
        this.f9496dw = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m12159ri(xha xhaVar) {
        this.ory = xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m12160ri(String str, boolean z) {
        if (this.f9495di != null) {
            long jM12122aw = m12122aw();
            if (this.f9502mj.siy()) {
                jM12122aw = this.wjv.m11997di();
            }
            long j = jM12122aw;
            JSONObject jSONObjectM16480ri = C3571ig.m16480ri(this.f9502mj, this.f9495di.xha(), this.f9495di.mo6388sf());
            try {
                jSONObjectM16480ri.put("auto_click", z);
                if (!z) {
                    C3414ik.m15567ri(jSONObjectM16480ri, this.wjv.f9387ka ? this.wjv.f9389lr.plm() : this.wjv.f9389lr.mhp(), (int) j);
                }
            } catch (Exception unused) {
            }
            C3414ik.m15550ri(this.f9502mj, this.f9504qt, str, j, m12123ay(), jSONObjectM16480ri, this.ory);
            m12167su();
            m12123ay();
        }
        m12138kt();
    }

    /* JADX INFO: renamed from: ri */
    public void m12161ri(boolean z) {
        this.f9505ri = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m12162ri(boolean z, InterfaceC3118lr interfaceC3118lr, boolean z2) {
        if (this.bgr || !(!z2 || z || this.f9497fi)) {
            if (jbs()) {
                ihz();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                m12120ta();
                m12141lr(interfaceC3118lr);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.bgr = false;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12163ri(boolean z, String str) {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6385ri(z, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12164ri(long j, boolean z, Map<String, Object> map, AbstractC2998lr abstractC2998lr) {
        boolean zM12119ri;
        boolean z2 = false;
        if (!m12127dw()) {
            C3429qt.m15620ri(this.wjv.f9389lr, "show_ad_fail", this.wjv.f9381fi, "video_controller_not_ready");
            return false;
        }
        if (C3273ac.m13968ka(this.wjv.f9389lr) || C3273ac.xha(this.wjv.f9389lr)) {
            return true;
        }
        if (!z || !ory()) {
            m12156ri(abstractC2998lr);
        }
        try {
            zM12119ri = m12119ri(j, this.wjv.zyn);
            try {
                this.f9491aw = false;
            } catch (Exception e) {
                e = e;
                z2 = zM12119ri;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                zM12119ri = z2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (zM12119ri && !z) {
            this.wjv.f9402su.m11994ri(map);
        } else if (!zM12119ri) {
            C3429qt.m15620ri(this.wjv.f9389lr, "show_ad_fail", this.wjv.f9381fi, "video_play_fail");
        }
        return zM12119ri;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12165ri(JSONObject jSONObject) {
        int i;
        if (this.f9495di == null || jSONObject == null || !((i = this.f9507su) == 1 || i == 2)) {
            this.f9498fr = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.igq = fOptDouble;
        if (fOptDouble <= 0.0f && this.wjv.f9389lr.cmy() != null) {
            this.igq = this.wjv.f9389lr.cmy().m14239ri();
        }
        if (iOptInt == 0) {
            this.igq = 1.0f;
            if (this.f9498fr) {
                long jCurrentTimeMillis = this.f9503nr + (System.currentTimeMillis() - this.tan);
                this.f9503nr = jCurrentTimeMillis;
                InterfaceC1999ik interfaceC1999ik = this.f9495di;
                if (interfaceC1999ik != null) {
                    interfaceC1999ik.mo6381ri(jCurrentTimeMillis);
                }
                if (this.wjv.f9397qd != null) {
                    this.wjv.f9397qd.mo10565ka(false);
                }
            }
        } else if (iOptInt == 1 && !this.f9498fr) {
            this.tan = System.currentTimeMillis();
            if (this.wjv.f9397qd != null) {
                this.wjv.f9397qd.mo10565ka(true);
            }
        }
        this.f9498fr = iOptInt == 1;
        if (this.f9507su == 1) {
            return true;
        }
        InterfaceC1999ik interfaceC1999ik2 = this.f9495di;
        if (interfaceC1999ik2 == null) {
            return false;
        }
        return interfaceC1999ik2.mo6386ri(this.igq);
    }

    /* JADX INFO: renamed from: sf */
    public void m12166sf() {
        this.hcw = false;
        if (this.wjv.f9386jc != null) {
            this.wjv.f9386jc.removeMessages(300);
        }
    }

    public void slm() {
        try {
            if (m12126di()) {
                this.f9495di.mo6377lr();
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void srn() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik instanceof C3119ri) {
            ((C3119ri) interfaceC1999ik).dzy();
        }
    }

    /* JADX INFO: renamed from: su */
    public long m12167su() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.jbs() + this.f9495di.xha();
        }
        return 0L;
    }

    public void tan() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik == null) {
            return;
        }
        interfaceC1999ik.mo6376ka();
        this.f9495di = null;
    }

    public void tnn() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik == null || interfaceC1999ik.mo6388sf() == null) {
            return;
        }
        this.f9506sf = this.f9495di.mo6373di();
        m12121ac();
        m12161ri(true);
        this.f9491aw = true;
    }

    /* JADX INFO: renamed from: uq */
    public void m12168uq() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6377lr();
        }
    }

    /* JADX INFO: renamed from: vr */
    public long m12169vr() {
        return this.f9506sf;
    }

    public long wjv() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            return interfaceC1999ik.jbs();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: xd */
    public boolean m12170xd() {
        return this.f9499ik;
    }

    public boolean xha() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        return interfaceC1999ik != null && interfaceC1999ik.mo6371aw();
    }

    /* JADX INFO: renamed from: zf */
    public boolean m12171zf() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            if (interfaceC1999ik.mo6388sf() != null) {
                InterfaceC2004ri interfaceC2004riMo6388sf = this.f9495di.mo6388sf();
                if (interfaceC2004riMo6388sf.xha() || interfaceC2004riMo6388sf.mo6174mj()) {
                    InterfaceC1999ik interfaceC1999ik2 = this.f9495di;
                    if (interfaceC1999ik2 instanceof C3119ri) {
                        ((C3119ri) interfaceC1999ik2).m12777pv();
                    }
                    return true;
                }
            } else if (m12125co()) {
                m12161ri(false);
                InterfaceC1999ik interfaceC1999ik3 = this.f9495di;
                if (interfaceC1999ik3 instanceof C3119ri) {
                    ((C3119ri) interfaceC1999ik3).m12777pv();
                }
                return true;
            }
        }
        return false;
    }

    public void zyn() {
        InterfaceC1999ik interfaceC1999ik = this.f9495di;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6380ri();
        }
    }
}
