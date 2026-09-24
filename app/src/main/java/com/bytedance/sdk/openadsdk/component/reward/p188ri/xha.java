package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3550ka;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends jbs implements Handler.Callback {

    /* JADX INFO: renamed from: ac */
    private final Handler f9512ac;

    /* JADX INFO: renamed from: ay */
    private boolean f9513ay;

    /* JADX INFO: renamed from: di */
    boolean f9514di;

    /* JADX INFO: renamed from: fi */
    int f9515fi;

    /* JADX INFO: renamed from: fr */
    private int f9516fr;
    private boolean igq;
    private boolean ihz;

    /* JADX INFO: renamed from: ik */
    int f9517ik;

    /* JADX INFO: renamed from: ka */
    int f9518ka;

    /* JADX INFO: renamed from: lr */
    long f9519lr;

    /* JADX INFO: renamed from: ri */
    boolean f9520ri;

    /* JADX INFO: renamed from: su */
    private int f9521su;

    /* JADX INFO: renamed from: uq */
    private int f9522uq;
    private int wjv;
    protected int xha;

    public xha(C3022ri c3022ri) {
        super(c3022ri);
        this.f9512ac = new Handler(this);
        this.f9520ri = false;
        this.f9519lr = 0L;
        this.f9517ik = 0;
        this.f9518ka = 0;
        this.f9515fi = 0;
        this.f9514di = false;
        this.ihz = false;
        this.f9522uq = 0;
        this.f9513ay = false;
        this.f9516fr = 0;
        this.f9521su = 0;
        this.igq = false;
        this.xha = C3279dw.jbs(this.f9340qt);
        this.f9518ka = this.f9340qt.m14405gy();
        int iM14563ye = this.f9340qt.m14563ye();
        this.f9515fi = iM14563ye;
        this.f9516fr = Math.max(0, this.f9518ka - iM14563ye);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bu */
    public void m12172bu() {
        int i = !this.f9513ay ? this.f9515fi - this.f9517ik : this.f9515fi + this.f9521su;
        int i2 = C3299nr.m14639ka().m14883su(String.valueOf(this.f9335co.f9377di)).f11586di;
        int i3 = this.f9518ka;
        boolean z = false;
        boolean z2 = i3 <= 0 || (((float) i) / ((float) i3)) * 100.0f >= ((float) i2);
        int iM14875ri = C3299nr.m14639ka().m14875ri(String.valueOf(this.f9335co.f9377di));
        if (iM14875ri == 0) {
            boolean zM16294di = this.f9339nr != null ? this.f9339nr.m16294di() : false;
            if (this.f9343vr) {
                zM16294di = true;
            }
            if (z2 && zM16294di) {
                z = true;
            }
        } else if (iM14875ri == 1) {
            z = z2;
        }
        if (z) {
            this.f9335co.f9397qd.mo10611lr(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12173lr(int i) {
        mo11931ri(this.f9515fi);
        if (this.ihz) {
            return;
        }
        Handler handler = this.f9512ac;
        handler.sendMessage(handler.obtainMessage(900, this.f9515fi, i));
    }

    /* JADX INFO: renamed from: nr */
    private boolean m12176nr() {
        return this.f9338mj && C3279dw.m14090ik(this.f9335co.f9389lr) && !this.tan.get();
    }

    private boolean slm() {
        if (this.f9335co.f9410xe) {
            return false;
        }
        int i = this.xha;
        return 1 == i || 2 == i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: di */
    public void mo11921di() {
        if (this.bgr && !this.slm) {
            super.mo11921di();
            this.f9512ac.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: fi */
    public void mo11922fi() {
        if (this.bgr) {
            super.mo11922fi();
            jbs();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !m12176nr()) {
            return true;
        }
        int i = message.arg1;
        boolean z = false;
        if (this.f9513ay) {
            int i2 = this.f9515fi;
            int i3 = this.f9521su;
            int i4 = i2 + i3;
            int i5 = this.f9518ka;
            if (i4 < i5) {
                this.f9521su = i3 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.f9512ac.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.f9521su = i5 - i2;
            }
        } else if (i > 0) {
            if (this.f9522uq == 0 && 2 == this.xha) {
                z = true;
            }
            this.f9335co.f9394oh.m11863ka(true);
            if (!z) {
                this.f9335co.f9394oh.m11872ri(String.valueOf(i), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i6 = i - 1;
            messageObtain2.arg1 = i6;
            this.f9512ac.sendMessageDelayed(messageObtain2, 1000L);
            this.f9517ik = i6;
            this.wjv = i;
        } else {
            this.f9514di = true;
            if (!C3279dw.m14093mj(this.f9340qt) || (C3279dw.m14081ac(this.f9340qt) && this.f9339nr.m16295fi())) {
                this.f9335co.f9394oh.m11863ka(false);
                this.f9335co.slm.set(true);
                this.f9335co.f9391nd.m11739aw();
            } else {
                this.f9335co.f9394oh.m11860ik();
                this.f9335co.f9394oh.m11859fi(true);
            }
            if (this.f9339nr == null || this.f9339nr.m16295fi()) {
                this.f9343vr = true;
            }
            if (this.f9516fr > 0) {
                this.f9513ay = true;
                this.f9521su++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.f9512ac.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.wjv = 0;
        }
        m12172bu();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ik */
    public void mo11923ik() {
        if (this.bgr) {
            this.f9338mj = true;
            boolean zSlm = slm();
            if (zSlm) {
                this.f9339nr.m16304ri(new C3552ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.xha.2
                    @Override // com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo12179ri(int i) {
                        if (xha.this.igq) {
                            return;
                        }
                        xha.this.f9522uq = i;
                        xha.this.f9339nr.m16304ri((C3552ri.ri) null);
                        xha.this.m12173lr(i);
                    }
                });
            }
            this.f9339nr.mo16276ri();
            if (C3279dw.m14093mj(this.f9340qt)) {
                this.f9335co.ory.m12077di();
            }
            this.f9519lr = System.currentTimeMillis();
            if (!zSlm) {
                m12173lr(0);
            }
            this.f9335co.f9397qd.mo10585zb();
            if (this.f9335co.f9414zk != null) {
                this.f9335co.f9414zk.m11653ri(this.f9518ka);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    public void jbs() {
        if (this.bgr) {
            this.ihz = true;
            this.f9512ac.removeMessages(900);
            this.f9512ac.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ka */
    public void mo11925ka() {
        if (this.bgr) {
            super.mo11925ka();
            if (DeviceUtils.xha() == 0) {
                this.f9335co.zyn = true;
            }
            if (this.f9335co.zyn) {
                this.f9335co.f9394oh.m11865lr(true);
                m11924ik(true);
            }
            if ((this.f9335co.f9391nd == null || this.f9335co.f9391nd.f9195co == null || !this.f9335co.f9391nd.f9195co.isShowing()) && m11935sf() && xha() > 0) {
                mo11932ri(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: lr */
    protected InterfaceC2879di mo11926lr() {
        return new InterfaceC2879di() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.xha.1
            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di
            /* JADX INFO: renamed from: ri */
            public void mo11086ri() {
                xha.this.m12172bu();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: mj */
    public int mo11928mj() {
        return this.wjv;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: qt */
    public boolean mo11929qt() {
        return this.f9514di;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ri */
    public void mo11930ri() {
        if (this.bgr && !this.f9333aw) {
            super.mo11930ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ri */
    public void mo11931ri(int i) {
        this.f9517ik = i;
        this.wjv = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ri */
    public void mo11932ri(long j) {
        if (this.bgr && this.f9338mj && !this.f9335co.f9399qt.get() && this.ihz) {
            this.ihz = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = xha();
            messageObtain.arg2 = this.f9522uq;
            this.f9512ac.sendMessageDelayed(messageObtain, j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    /* JADX INFO: renamed from: ri */
    protected void mo11934ri(boolean z) {
        if (this.f9334bu != null) {
            try {
                this.f9339nr = C3550ka.m16268ri().m16270ri(this.f9340qt, this.f9334bu, mo11926lr());
                this.f9339nr.m16301ri(this.f9335co.f9397qd);
            } catch (Throwable th) {
                C2707ac.m10196ik("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.f9339nr == null) {
                super.mo11934ri(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.jbs
    public int xha() {
        return this.f9517ik;
    }
}
