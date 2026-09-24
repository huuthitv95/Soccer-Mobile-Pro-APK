package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.openadsdk.component.reward.C2985bu;
import com.bytedance.sdk.openadsdk.component.reward.C2986co;
import com.bytedance.sdk.openadsdk.component.reward.C2987di;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3023sf;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3275ay;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2858lr {

    /* JADX INFO: renamed from: ik */
    private static InterfaceC3496lr f8399ik;

    /* JADX INFO: renamed from: lr */
    private static InterfaceC3495ri f8400lr;

    /* JADX INFO: renamed from: ac */
    private final boolean f8401ac;

    /* JADX INFO: renamed from: aw */
    private Activity f8402aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private final boolean f8404co;

    /* JADX INFO: renamed from: di */
    private final com.bytedance.sdk.openadsdk.p174aw.jbs f8405di;
    private final boolean jbs;

    /* JADX INFO: renamed from: ka */
    private final wjv f8407ka;

    /* JADX INFO: renamed from: mj */
    private InterfaceC3496lr f8408mj;

    /* JADX INFO: renamed from: nr */
    private boolean f8409nr;

    /* JADX INFO: renamed from: qt */
    private final boolean f8410qt;

    /* JADX INFO: renamed from: ri */
    public C2986co f8411ri;

    /* JADX INFO: renamed from: sf */
    private AbstractC2854ik f8412sf;
    private Runnable slm;
    private boolean tan;

    /* JADX INFO: renamed from: vr */
    private Bundle f8413vr;
    private InterfaceC3495ri xha;

    /* JADX INFO: renamed from: fi */
    private final Bundle f8406fi = new Bundle();

    /* JADX INFO: renamed from: bu */
    private final C3023sf.lr f8403bu = new C3023sf.lr();
    private final boolean ihz = C3606fi.m16702qt();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$fi */
    public static class fi {

        /* JADX INFO: renamed from: fi */
        public boolean f8428fi;

        /* JADX INFO: renamed from: ik */
        public final C3022ri f8429ik;

        /* JADX INFO: renamed from: ka */
        public boolean f8430ka;

        /* JADX INFO: renamed from: lr */
        public final int f8431lr;

        /* JADX INFO: renamed from: ri */
        public final Bundle f8432ri = new Bundle();

        public fi(int i, C3022ri c3022ri) {
            this.f8431lr = i;
            this.f8429ik = c3022ri;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$ik */
    public static class ik implements Runnable {

        /* JADX INFO: renamed from: ri */
        private final wjv f8433ri;

        public ik(wjv wjvVar) {
            this.f8433ri = wjvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8433ri.m14367bl()) {
                return;
            }
            if (this.f8433ri.m14472qa()) {
                if (C3578lr.m16535lr()) {
                    C2985bu.m11638ri(C3299nr.m14642ri()).m11793ri(this.f8433ri.m14388eb());
                    return;
                } else {
                    slm.m12192ri(C3299nr.m14642ri()).m12202ri(this.f8433ri.m14388eb());
                    return;
                }
            }
            if (C3578lr.m16535lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.m12322ri(C3299nr.m14642ri()).m11793ri(this.f8433ri.m14388eb());
            } else {
                C2987di.m11663ri(C3299nr.m14642ri()).m11673ri(this.f8433ri.m14388eb());
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$ka */
    static class ka extends lr {

        /* JADX INFO: renamed from: co */
        private boolean f8434co;

        /* JADX INFO: renamed from: qt */
        private final int f8435qt;

        /* JADX INFO: renamed from: sf */
        private int f8436sf;

        public ka(C2858lr c2858lr, wjv wjvVar, C3060ik c3060ik) {
            super(c2858lr, wjvVar, c3060ik);
            if (wjvVar == null) {
                this.f8435qt = 100;
            } else if (wjvVar.m14572zk() >= 0) {
                this.f8435qt = Math.min(100, wjvVar.m14572zk());
            } else {
                this.f8435qt = C3299nr.m14639ka().m14883su(String.valueOf(wjvVar.m14545ur())).f11586di;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2858lr.lr, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.f8434co && this.f8449ka <= this.f8436sf) {
                this.f8434co = true;
                AbstractC2859mj abstractC2859mjM10968sf = this.f8458ri.m10968sf();
                if (abstractC2859mjM10968sf != null) {
                    abstractC2859mjM10968sf.bnj();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2858lr.lr
        /* JADX INFO: renamed from: ri */
        protected int mo10973ri(wjv wjvVar) {
            if (wjvVar != null) {
                return wjvVar.vnt();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2858lr.lr
        /* JADX INFO: renamed from: ri */
        public void mo10974ri(int i, wjv wjvVar) {
            boolean z = this.f8442di == 0;
            int i2 = this.f8449ka;
            super.mo10974ri(i, wjvVar);
            if (!z) {
                if (this.f8447ik < i2) {
                    this.f8436sf = (int) ((1.0f - (this.f8435qt / 100.0f)) * this.f8449ka);
                }
            } else {
                if (this.f8442di == 1) {
                    this.f8436sf = 3;
                } else {
                    this.f8436sf = (int) ((1.0f - (this.f8435qt / 100.0f)) * this.f8447ik);
                }
                if (this.f8458ri.f8411ri != null) {
                    this.f8458ri.f8411ri.m11653ri(this.f8449ka);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$lr */
    static abstract class lr implements Handler.Callback {

        /* JADX INFO: renamed from: ac */
        private int f8437ac;

        /* JADX INFO: renamed from: ay */
        private int f8439ay;
        private boolean bgr;

        /* JADX INFO: renamed from: bu */
        private boolean f8440bu;

        /* JADX INFO: renamed from: co */
        private final Context f8441co;

        /* JADX INFO: renamed from: di */
        protected int f8442di;

        /* JADX INFO: renamed from: dw */
        private boolean f8443dw;
        private int dzy;
        private boolean feb;

        /* JADX INFO: renamed from: fi */
        protected int f8444fi;

        /* JADX INFO: renamed from: fr */
        private int f8445fr;

        /* JADX INFO: renamed from: ig */
        private boolean f8446ig;
        private boolean igq;
        private int ihz;

        /* JADX INFO: renamed from: ik */
        protected float f8447ik;

        /* JADX INFO: renamed from: jc */
        private int f8448jc;

        /* JADX INFO: renamed from: ka */
        protected int f8449ka;

        /* JADX INFO: renamed from: kt */
        private int f8450kt;

        /* JADX INFO: renamed from: lr */
        protected wjv f8451lr;

        /* JADX INFO: renamed from: nr */
        private float f8453nr;

        /* JADX INFO: renamed from: oh */
        private int f8454oh;
        private int ory;

        /* JADX INFO: renamed from: pv */
        private boolean f8455pv;

        /* JADX INFO: renamed from: qd */
        private boolean f8456qd;

        /* JADX INFO: renamed from: ri */
        protected final C2858lr f8458ri;

        /* JADX INFO: renamed from: sf */
        private final C3060ik f8459sf;
        private boolean slm;
        private int srn;

        /* JADX INFO: renamed from: su */
        private boolean f8460su;
        private boolean tnn;

        /* JADX INFO: renamed from: uq */
        private int f8461uq;

        /* JADX INFO: renamed from: vr */
        private boolean f8462vr;
        private int wjv;

        /* JADX INFO: renamed from: xd */
        private int f8463xd;

        /* JADX INFO: renamed from: zf */
        private int f8464zf;
        private boolean zyn;

        /* JADX INFO: renamed from: qt */
        private final Handler f8457qt = new Handler(Looper.getMainLooper(), this);

        /* JADX INFO: renamed from: aw */
        private final int f8438aw = 1000;
        protected int xha = -1;
        private int tan = 1000;
        private boolean hcw = false;

        /* JADX INFO: renamed from: mj */
        boolean f8452mj = false;
        public int jbs = -1;

        public lr(C2858lr c2858lr, wjv wjvVar, C3060ik c3060ik) {
            this.f8458ri = c2858lr;
            this.f8451lr = wjvVar;
            this.f8459sf = c3060ik;
            this.f8441co = c3060ik.getContext();
            this.f8449ka = mo10973ri(wjvVar);
        }

        /* JADX INFO: renamed from: aw */
        private void m10975aw() {
            int i = this.f8463xd;
            int i2 = this.srn;
            boolean z = this.zyn;
            int i3 = this.f8450kt;
            int i4 = this.f8448jc;
            if (i < i2 || z) {
                return;
            }
            if (i3 >= i4) {
                this.feb = false;
            } else {
                this.f8450kt = i3 + 1;
                bgr();
            }
        }

        private void bgr() {
            AbstractC2859mj abstractC2859mjM10968sf;
            this.zyn = true;
            this.f8463xd = 0;
            C2858lr c2858lr = this.f8458ri;
            if (c2858lr == null || (abstractC2859mjM10968sf = c2858lr.m10968sf()) == null || abstractC2859mjM10968sf.m11023tw()) {
                return;
            }
            m10976co();
        }

        /* JADX INFO: renamed from: co */
        private void m10976co() {
            C3060ik c3060ik;
            if (this.f8443dw || this.f8462vr || this.slm || (c3060ik = this.f8459sf) == null) {
                return;
            }
            c3060ik.setShowEndCardNextAd(true, this.f8451lr);
        }

        /* JADX INFO: renamed from: fi */
        private void m10977fi(int i) {
            if (this.tnn && i == 4) {
                this.f8442di = i;
                m10980ri(i, 1000);
            }
        }

        /* JADX INFO: renamed from: ka */
        private void m10978ka(int i) {
            if (this.xha > 0 && this.f8440bu && i == 3) {
                this.f8442di = i;
                m10980ri(i, 1000);
            }
        }

        /* JADX INFO: renamed from: qt */
        private void m10979qt() {
            int i = this.xha;
            if (i > 0) {
                this.xha = i - 1;
            }
            if (this.xha == 0 && this.f8440bu) {
                this.f8440bu = false;
                C2858lr c2858lr = this.f8458ri;
                if (c2858lr == null || c2858lr.m10968sf() == null) {
                    return;
                }
                AbstractC2859mj abstractC2859mjM10968sf = this.f8458ri.m10968sf();
                if (abstractC2859mjM10968sf instanceof C2853fi) {
                    ((C2853fi) abstractC2859mjM10968sf).ihz();
                }
            }
        }

        /* JADX INFO: renamed from: ri */
        private void m10980ri(int i, int i2) {
            if (this.hcw) {
                return;
            }
            this.f8457qt.removeMessages(i);
            this.f8457qt.sendEmptyMessageDelayed(i, i2);
        }

        /* JADX INFO: renamed from: ri */
        private void m10981ri(int i, boolean z) {
            if (this.feb && i == 5) {
                this.f8442di = i;
                if (z) {
                    m10980ri(i, 1000);
                } else {
                    this.f8457qt.sendEmptyMessage(i);
                }
            }
        }

        /* JADX INFO: renamed from: ri */
        private void m10982ri(Message message) {
            int i = this.f8449ka;
            if (i <= 0) {
                m10978ka(3);
                m10977fi(4);
                m10981ri(5, true);
                m10983sf();
                return;
            }
            int i2 = this.f8444fi;
            int i3 = (int) ((((double) (i2 - i)) * 100.0d) / ((double) i2));
            C3060ik c3060ik = this.f8459sf;
            StringBuilder sb = new StringBuilder();
            int i4 = this.f8449ka;
            this.f8449ka = i4 - 1;
            sb.append(i4);
            sb.append(CmcdData.Factory.STREAMING_FORMAT_SS);
            c3060ik.setCountDownFor1InN(sb.toString(), i3);
            m10979qt();
            m10985fi();
            if (this.f8449ka >= 0) {
                m10980ri(message.what, this.tan);
            }
            xha();
        }

        /* JADX INFO: renamed from: sf */
        private void m10983sf() {
            if (this.f8458ri.m10924ac()) {
                this.f8459sf.showSkipButton();
                this.f8462vr = true;
            } else {
                this.slm = true;
                this.f8459sf.showCloseButton();
            }
            this.f8459sf.setShowPlayableNextAd(false, this.f8451lr);
        }

        /* JADX INFO: renamed from: di */
        public void m10984di() {
            this.igq = true;
        }

        /* JADX INFO: renamed from: fi */
        public void m10985fi() {
            if (this.igq && this.tnn) {
                if (this.slm) {
                    this.tnn = false;
                }
                if (this.f8443dw) {
                    return;
                }
                int i = this.f8464zf;
                boolean z = this.f8460su;
                int i2 = i + 1;
                this.f8464zf = i2;
                if (z) {
                    this.f8439ay = this.wjv;
                } else {
                    this.f8439ay = this.f8437ac + this.ihz;
                }
                if (i2 >= this.f8437ac) {
                    if (!this.f8452mj) {
                        this.ory++;
                        this.f8452mj = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.f8449ka);
                            jSONObject.put("hint_sequence", this.ory);
                            C3414ik.m15514ka(this.f8451lr, this.f8458ri.m10968sf().mo10767d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    AbstractC2854ik abstractC2854ik = this.f8458ri.f8412sf;
                    int i3 = this.f8445fr;
                    this.f8445fr = i3 - 1;
                    abstractC2854ik.mo10815ri(i3, this.f8449ka);
                } else {
                    this.f8452mj = false;
                    this.f8458ri.f8412sf.mo10815ri(-1, this.f8449ka);
                }
                if (this.f8460su && this.f8464zf >= this.f8461uq) {
                    boolean z2 = this.f8462vr;
                    boolean z3 = this.slm;
                    if (!z2 && !z3) {
                        this.f8459sf.setShowPlayableNextAd(true, this.f8451lr);
                    }
                }
                if (this.f8464zf < this.f8439ay || this.f8458ri.m10968sf() == null) {
                    return;
                }
                AbstractC2859mj abstractC2859mjM10968sf = this.f8458ri.m10968sf();
                if (abstractC2859mjM10968sf instanceof C2853fi) {
                    this.f8457qt.removeMessages(4);
                    ((C2853fi) abstractC2859mjM10968sf).ihz();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 || message.what == 2) {
                m10982ri(message);
            } else if (message.what == 3) {
                if (this.xha > 0) {
                    m10979qt();
                    if (this.xha >= 0) {
                        m10980ri(message.what, 1000);
                    }
                }
            } else if (message.what == 4) {
                if (this.tnn) {
                    m10985fi();
                    if (this.tnn && !this.f8443dw) {
                        m10980ri(message.what, 1000);
                    }
                }
            } else if (message.what == 5 && this.feb) {
                xha();
                if (this.feb && !this.f8443dw) {
                    m10980ri(message.what, 1000);
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ik */
        public void m10986ik() {
            this.f8457qt.removeMessages(this.f8442di);
        }

        /* JADX INFO: renamed from: ik */
        public void m10987ik(int i) {
            this.xha = i;
            if (i > 0) {
                this.f8440bu = true;
                if (this.f8449ka <= 0 || this.f8462vr) {
                    m10978ka(3);
                }
            }
        }

        public void jbs() {
            if (this.feb) {
                this.zyn = true;
            }
        }

        /* JADX INFO: renamed from: ka */
        public void m10988ka() {
            if (this.f8462vr || this.slm) {
                return;
            }
            m10994ri(-1);
            this.hcw = true;
            C3060ik c3060ik = this.f8459sf;
            if (c3060ik != null) {
                c3060ik.setCountDownFor1InN("", -1);
                this.f8459sf.setShowEndCardNextAd(true, this.f8451lr);
            }
        }

        /* JADX INFO: renamed from: lr */
        public void m10989lr() {
            this.tnn = false;
            this.feb = false;
            this.f8452mj = false;
            this.ory = 0;
            this.jbs = -1;
            this.zyn = false;
            this.f8448jc = 0;
            this.f8463xd = 0;
            this.f8454oh = 0;
            this.f8460su = false;
            this.f8450kt = 0;
            this.hcw = false;
            C3060ik c3060ik = this.f8459sf;
            if (c3060ik != null) {
                c3060ik.setShowPlayableNextAd(false, this.f8451lr);
            }
        }

        /* JADX INFO: renamed from: lr */
        public void m10990lr(int i) {
            if (this.jbs != 2 || i == 1) {
                if (i != -1) {
                    this.jbs = i;
                }
                if (this.f8457qt.hasMessages(this.f8442di) || this.hcw) {
                    return;
                }
                C2858lr c2858lr = this.f8458ri;
                if (c2858lr == null || c2858lr.m10968sf() == null || this.f8458ri.m10968sf().mo10787ay() == null || !this.f8458ri.m10968sf().mo10787ay().f9399qt.get()) {
                    int i2 = this.f8449ka;
                    boolean z = this.f8462vr;
                    int i3 = this.f8442di;
                    if (i3 == 1 || i3 == 2) {
                        if (i2 < 0 || z || this.slm) {
                            return;
                        }
                        this.f8457qt.sendEmptyMessageDelayed(i3, this.tan);
                        return;
                    }
                    if (i3 == 3) {
                        m10978ka(3);
                    } else if (i3 == 4) {
                        m10977fi(4);
                    } else if (i3 == 5) {
                        m10981ri(5, true);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: lr */
        public void m10991lr(boolean z) {
            if (z) {
                this.tan = (int) (1000.0f / this.f8453nr);
            } else {
                this.tan = 1000;
            }
        }

        /* JADX INFO: renamed from: mj */
        public void m10992mj() {
            if (this.feb) {
                m10976co();
                this.zyn = false;
            }
        }

        /* JADX INFO: renamed from: ri */
        public int m10993ri() {
            return this.f8449ka;
        }

        /* JADX INFO: renamed from: ri */
        protected abstract int mo10973ri(wjv wjvVar);

        /* JADX INFO: renamed from: ri */
        public void m10994ri(int i) {
            int i2 = this.f8442di;
            if (i != -1) {
                this.jbs = i;
            }
            this.f8457qt.removeMessages(i2);
        }

        /* JADX INFO: renamed from: ri */
        public void mo10974ri(int i, wjv wjvVar) {
            if (wjvVar != null && wjvVar.cmy() != null) {
                this.f8453nr = wjvVar.cmy().m14239ri();
                this.f8451lr = wjvVar;
            }
            int i2 = this.f8449ka;
            boolean z = this.f8462vr;
            boolean z2 = this.slm;
            int i3 = this.f8442di;
            if (z || z2) {
                return;
            }
            float f = i;
            this.f8447ik = f;
            if (f <= i2) {
                this.f8442di = 2;
                this.f8449ka = (int) f;
            } else if (i3 == 0) {
                this.f8442di = 1;
            }
            if (!this.bgr) {
                this.f8444fi = this.f8449ka;
                this.bgr = true;
            }
            int i4 = this.f8442di;
            if (i3 == i4 && this.f8457qt.hasMessages(i4)) {
                return;
            }
            this.f8457qt.removeCallbacksAndMessages(null);
            this.f8457qt.sendEmptyMessage(this.f8442di);
        }

        /* JADX INFO: renamed from: ri */
        public void m10995ri(AbstractC2859mj abstractC2859mj) {
            C3275ay c3275ayM14484ri;
            if (abstractC2859mj == null || abstractC2859mj.f8468di == null || (c3275ayM14484ri = abstractC2859mj.f8468di.m14484ri()) == null) {
                return;
            }
            this.dzy = c3275ayM14484ri.m14019ik();
            this.f8443dw = abstractC2859mj.f8466bu;
            this.f8448jc = c3275ayM14484ri.m14021ri();
            this.f8456qd = abstractC2859mj.slm;
            this.srn = c3275ayM14484ri.m14020lr();
            this.f8455pv = C3273ac.m13958di(abstractC2859mj.f8468di);
            this.f8446ig = C3273ac.m13961fi(abstractC2859mj.f8468di);
            this.feb = true;
            if ((this.f8449ka <= 0 || this.f8462vr) && !this.f8457qt.hasMessages(5)) {
                m10981ri(5, false);
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m10996ri(wjv wjvVar, boolean z) {
            this.f8437ac = C3279dw.ihz(wjvVar);
            this.ihz = C3279dw.m14089fr(wjvVar);
            this.f8461uq = C3279dw.m14099su(wjvVar);
            this.wjv = C3279dw.igq(wjvVar);
            this.f8445fr = this.ihz;
            this.igq = false;
            this.f8460su = false;
            this.f8464zf = 0;
            this.tnn = true;
            C3060ik c3060ik = this.f8459sf;
            if (c3060ik != null) {
                c3060ik.setShowPlayableNextAd(false, wjvVar);
            }
            this.f8443dw = z;
            if (this.f8449ka <= 0 || this.f8462vr) {
                m10977fi(4);
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m10997ri(boolean z) {
            this.f8460su = z;
            this.f8463xd = 0;
            if (z) {
                int i = this.wjv;
                int i2 = this.ihz;
                this.f8437ac = i - i2;
                this.f8445fr = i2;
                this.f8439ay = i;
            }
        }

        public void xha() {
            if (this.igq && this.feb && !this.f8443dw) {
                int i = this.f8454oh;
                int i2 = this.f8463xd;
                boolean z = this.f8460su;
                int i3 = i + 1;
                this.f8454oh = i3;
                this.f8463xd = i2 + 1;
                if (z && i3 >= this.dzy) {
                    m10976co();
                }
                if (this.f8446ig || this.f8455pv) {
                    m10975aw();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.lr$ri */
    static class ri extends lr {
        public ri(C2858lr c2858lr, wjv wjvVar, C3060ik c3060ik) {
            super(c2858lr, wjvVar, c3060ik);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2858lr.lr
        /* JADX INFO: renamed from: ri */
        protected int mo10973ri(wjv wjvVar) {
            if (wjvVar != null) {
                return wjvVar.m14524sp();
            }
            return 5;
        }
    }

    public C2858lr(Activity activity, wjv wjvVar, boolean z) {
        this.f8407ka = wjvVar;
        this.tan = z;
        this.f8402aw = activity;
        this.f8405di = new com.bytedance.sdk.openadsdk.p174aw.jbs(activity.getApplicationContext());
        boolean zZyn = wjvVar.zyn();
        this.jbs = zZyn;
        this.f8410qt = zZyn && 39 == wjvVar.m14453nd();
        this.f8404co = zZyn && 40 == wjvVar.m14453nd();
        int iM14453nd = wjvVar.m14453nd();
        if (iM14453nd == 43 || iM14453nd == 44) {
            this.f8412sf = new C2857ka(this.f8402aw, wjvVar, this);
        } else {
            this.f8412sf = new jbs(this.f8402aw, wjvVar, this);
        }
        this.f8401ac = C3606fi.m16703ri("adapt_decor_size", 0) == 1;
        this.f8412sf.mo10812ri();
        m10923xd();
    }

    /* JADX INFO: renamed from: xd */
    private void m10923xd() {
        if (this.f8407ka.m14472qa()) {
            this.f8411ri = new C2986co(new C2986co.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.C2986co.ri
                /* JADX INFO: renamed from: ri */
                public void mo10696ri(int i) {
                    AbstractC2859mj abstractC2859mjM10968sf;
                    if (C2858lr.this.m10928co().getBoolean("reward_verify", false) || C2858lr.this.m10927bu() || C2858lr.this.m10925aw() || (abstractC2859mjM10968sf = C2858lr.this.m10968sf()) == null) {
                        return;
                    }
                    abstractC2859mjM10968sf.m11006ik(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ac */
    public boolean m10924ac() {
        return this.f8412sf.mo10805ka();
    }

    /* JADX INFO: renamed from: aw */
    public boolean m10925aw() {
        return this.f8407ka.slm();
    }

    /* JADX INFO: renamed from: ay */
    public C3060ik m10926ay() {
        return this.f8412sf.mo10801co();
    }

    public void bgr() {
        InterfaceC3495ri interfaceC3495ri = this.xha;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.onAdClicked();
            return;
        }
        InterfaceC3496lr interfaceC3496lr = this.f8408mj;
        if (interfaceC3496lr != null) {
            interfaceC3496lr.onAdClicked();
        }
    }

    /* JADX INFO: renamed from: bu */
    public boolean m10927bu() {
        wjv wjvVar = this.f8407ka;
        return wjvVar != null && wjvVar.m14423jc();
    }

    /* JADX INFO: renamed from: co */
    public Bundle m10928co() {
        return this.f8406fi;
    }

    /* JADX INFO: renamed from: di */
    public boolean m10929di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: dw */
    public void m10930dw() {
        this.f8412sf.mo10800bu();
    }

    /* JADX INFO: renamed from: fi */
    public void m10931fi(TTAdActivity tTAdActivity) {
        this.bgr = 6;
        this.f8412sf.mo10816ri(tTAdActivity);
        this.f8403bu.m12025ri(tTAdActivity);
        this.f8402aw = null;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m10932fi() {
        if (this.f8407ka != null && this.jbs) {
            return this.f8410qt || this.f8404co;
        }
        return false;
    }

    /* JADX INFO: renamed from: fr */
    public AbstractC2859mj m10933fr() {
        return this.f8412sf.mo10799aw();
    }

    public void hcw() {
        this.f8412sf.tan();
    }

    public boolean igq() {
        return this.f8409nr;
    }

    public void ihz() {
        this.f8407ka.m14449mj(true);
        this.f8412sf.slm();
    }

    /* JADX INFO: renamed from: ik */
    public void m10934ik(TTAdActivity tTAdActivity) {
        this.bgr = 4;
        this.f8412sf.mo10804ik();
        C2986co c2986co = this.f8411ri;
        if (c2986co != null) {
            c2986co.m11652ri();
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m10935ik(boolean z) {
        this.f8409nr = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m10936ik() {
        return this.ihz;
    }

    public void jbs() {
        this.f8412sf.jbs();
    }

    /* JADX INFO: renamed from: ka */
    public void m10937ka(TTAdActivity tTAdActivity) {
        this.bgr = 5;
        this.f8412sf.xha();
    }

    /* JADX INFO: renamed from: ka */
    public boolean m10938ka() {
        return this.f8404co;
    }

    /* JADX INFO: renamed from: lr */
    public void m10939lr(TTAdActivity tTAdActivity) {
        this.bgr = 3;
        this.f8412sf.mo10806lr();
        C2986co c2986co = this.f8411ri;
        if (c2986co != null) {
            c2986co.m11651lr();
        }
        this.f8403bu.m12026ri(tTAdActivity, this.f8407ka.bbu(), this.f8407ka.m14406gz(), this.f8401ac);
    }

    /* JADX INFO: renamed from: lr */
    public void m10940lr(AbstractC2859mj abstractC2859mj) {
        abstractC2859mj.mo10793ri(this.f8402aw, this.f8413vr);
        int i = this.bgr;
        if (i == 2) {
            abstractC2859mj.mo10786aw();
            return;
        }
        if (i == 3) {
            abstractC2859mj.mo10786aw();
            abstractC2859mj.mo10788ik();
            abstractC2859mj.mo10789ik(true);
        } else if (i == 4) {
            abstractC2859mj.mo10789ik(false);
            abstractC2859mj.bgr();
        } else {
            if (i != 5) {
                return;
            }
            abstractC2859mj.mo10770ka();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m10941lr(AbstractC2859mj abstractC2859mj, int i) {
        this.f8412sf.mo10808lr(abstractC2859mj, i);
    }

    /* JADX INFO: renamed from: lr */
    public void m10942lr(AbstractC2859mj abstractC2859mj, fi fiVar) {
        this.f8412sf.mo10821ri(abstractC2859mj, fiVar);
    }

    /* JADX INFO: renamed from: lr */
    public void m10943lr(boolean z) {
        try {
            wjv wjvVar = this.f8407ka;
            if (wjvVar != null) {
                wjvVar.m14420ik(z);
            }
            C2986co.m11648ri(this.f8407ka, false, 3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public boolean m10944lr() {
        return this.f8401ac;
    }

    /* JADX INFO: renamed from: mj */
    public Activity m10945mj() {
        AbstractC2854ik abstractC2854ik = this.f8412sf;
        return abstractC2854ik == null ? this.f8402aw : abstractC2854ik.f8301ri;
    }

    /* JADX INFO: renamed from: nr */
    public void m10946nr() {
        wjv wjvVar = this.f8407ka;
        if (wjvVar != null) {
            wjvVar.jbs(true);
        }
        C2986co c2986co = this.f8411ri;
        if (c2986co != null) {
            c2986co.m11649ik();
        }
    }

    /* JADX INFO: renamed from: oh */
    public int m10947oh() {
        return this.f8412sf.mo10809mj();
    }

    public void ory() {
        this.f8412sf.mo10810nr();
    }

    /* JADX INFO: renamed from: qt */
    public int m10948qt() {
        return this.f8412sf.mo10811qt();
    }

    /* JADX INFO: renamed from: ri */
    public wjv m10949ri() {
        return this.f8407ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m10950ri(float f) {
        this.f8412sf.mo10813ri(f);
    }

    /* JADX INFO: renamed from: ri */
    public void m10951ri(int i) {
        this.f8412sf.mo10814ri(i);
    }

    /* JADX INFO: renamed from: ri */
    public void m10952ri(Activity activity) {
        this.f8412sf.mo10807lr(activity);
    }

    /* JADX INFO: renamed from: ri */
    public void m10953ri(View view) {
        this.f8412sf.mo10818ri(view);
    }

    /* JADX INFO: renamed from: ri */
    public void m10954ri(View view, boolean z) {
        this.f8412sf.mo10819ri(view, z);
    }

    /* JADX INFO: renamed from: ri */
    public void m10955ri(TTAdActivity tTAdActivity) {
        this.bgr = 2;
        this.f8412sf.mo10802di();
    }

    /* JADX INFO: renamed from: ri */
    public void m10956ri(TTAdActivity tTAdActivity, Bundle bundle, int i) {
        C3019lr.m11956ri(this.f8407ka, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i);
        if (this.tan) {
            return;
        }
        InterfaceC3495ri interfaceC3495ri = this.xha;
        if (interfaceC3495ri != null) {
            f8400lr = interfaceC3495ri;
            return;
        }
        InterfaceC3496lr interfaceC3496lr = this.f8408mj;
        if (interfaceC3496lr != null) {
            f8399ik = interfaceC3496lr;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10957ri(TTAdActivity tTAdActivity, Bundle bundle, InterfaceC3495ri interfaceC3495ri, InterfaceC3496lr interfaceC3496lr) {
        this.f8413vr = bundle;
        this.bgr = 1;
        this.xha = interfaceC3495ri;
        this.f8408mj = interfaceC3496lr;
        if (!this.tan && bundle != null) {
            if (interfaceC3495ri == null) {
                this.xha = f8400lr;
                f8400lr = null;
            }
            if (interfaceC3496lr == null) {
                this.f8408mj = f8399ik;
                f8399ik = null;
            }
        }
        this.f8412sf.mo10817ri(bundle);
    }

    /* JADX INFO: renamed from: ri */
    public void m10958ri(AbstractC2859mj abstractC2859mj) {
        AbstractC2854ik abstractC2854ik = this.f8412sf;
        if (abstractC2854ik == null) {
            return;
        }
        abstractC2854ik.mo10820ri(abstractC2859mj);
    }

    /* JADX INFO: renamed from: ri */
    public void m10959ri(AbstractC2859mj abstractC2859mj, fi fiVar) {
        this.f8412sf.mo10822ri(abstractC2859mj, null, fiVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m10960ri(AbstractC2859mj abstractC2859mj, boolean z) {
        AbstractC2854ik abstractC2854ik = this.f8412sf;
        if (abstractC2854ik == null) {
            return;
        }
        abstractC2854ik.mo10823ri(abstractC2859mj, z);
    }

    /* JADX INFO: renamed from: ri */
    public void m10961ri(final AbstractC2859mj abstractC2859mj, final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        Activity activity;
        if (!tan()) {
            this.slm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    C2858lr.this.m10961ri(abstractC2859mj, z, i, str, i2, str2, i3);
                }
            };
            return;
        }
        if (m10927bu()) {
            return;
        }
        m10946nr();
        if (this.xha == null || (activity = this.f8402aw) == null) {
            C2986co.m11648ri(this.f8407ka, false, i3);
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lr.3
                @Override // java.lang.Runnable
                public void run() {
                    C2858lr.this.xha.mo12182ri(z, i, str, i2, str2);
                }
            });
            C2986co.m11648ri(this.f8407ka, z, i3);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10962ri(AbstractC2859mj abstractC2859mj, boolean z, boolean z2, boolean z3, int i) {
        this.f8412sf.mo10824ri(abstractC2859mj, z, z2, z3, i);
    }

    /* JADX INFO: renamed from: ri */
    public void m10963ri(AbstractC2860ri abstractC2860ri, boolean z) {
        this.f8412sf.mo10825ri(abstractC2860ri, z);
    }

    /* JADX INFO: renamed from: ri */
    public void m10964ri(Map<String, Object> map, AbstractC2859mj abstractC2859mj, float f, float f2) {
        this.f8412sf.mo10826ri(map, abstractC2859mj, f, f2);
    }

    /* JADX INFO: renamed from: ri */
    public void m10965ri(boolean z) {
        this.f8412sf.mo10827ri(z);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m10966ri(AbstractC2859mj abstractC2859mj, int i) {
        return this.f8412sf.mo10828ri(abstractC2859mj, i);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m10967ri(wjv wjvVar) {
        return (wjvVar == null || C3273ac.m13950aw(wjvVar) || wjvVar.m14532tl() || wjvVar.dob() == null || wjvVar.dob().m14298ka() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: sf */
    public AbstractC2859mj m10968sf() {
        return this.f8412sf.mo10829sf();
    }

    public void slm() {
        if (tan()) {
            return;
        }
        ihz();
        Objects.toString(this.xha);
        Objects.toString(this.f8408mj);
        InterfaceC3495ri interfaceC3495ri = this.xha;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.mo12181ri();
        } else {
            InterfaceC3496lr interfaceC3496lr = this.f8408mj;
            if (interfaceC3496lr != null) {
                interfaceC3496lr.mo11531ri();
            } else {
                AbstractC2859mj abstractC2859mjM10968sf = m10968sf();
                C3429qt.m15619ri(this.f8407ka, "show", abstractC2859mjM10968sf != null ? abstractC2859mjM10968sf.srn() : 0);
            }
        }
        Runnable runnable = this.slm;
        if (runnable != null) {
            runnable.run();
            this.slm = null;
        }
    }

    /* JADX INFO: renamed from: su */
    public boolean m10969su() {
        return this.f8412sf instanceof C2857ka;
    }

    public boolean tan() {
        return this.f8407ka.srn();
    }

    /* JADX INFO: renamed from: uq */
    public com.bytedance.sdk.openadsdk.p174aw.jbs m10970uq() {
        return this.f8405di;
    }

    /* JADX INFO: renamed from: vr */
    public void m10971vr() {
        InterfaceC3495ri interfaceC3495ri = this.xha;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.mo12180lr();
            return;
        }
        InterfaceC3496lr interfaceC3496lr = this.f8408mj;
        if (interfaceC3496lr != null) {
            interfaceC3496lr.mo11530lr();
        } else {
            AbstractC2859mj abstractC2859mjM10968sf = m10968sf();
            C3429qt.m15619ri(this.f8407ka, "close", abstractC2859mjM10968sf != null ? abstractC2859mjM10968sf.srn() : 0);
        }
    }

    public boolean wjv() {
        return this.f8412sf.mo10803fi();
    }

    public void xha() {
        Activity activity = this.f8402aw;
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: zf */
    public List<wjv> m10972zf() {
        return this.f8412sf.mo10830vr();
    }
}
