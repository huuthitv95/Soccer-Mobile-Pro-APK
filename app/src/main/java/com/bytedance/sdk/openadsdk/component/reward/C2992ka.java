package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1977ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p063lr.InterfaceC2003ri;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2992ka implements InterfaceC1999ik {

    /* JADX INFO: renamed from: ik */
    private final InterfaceC2003ri f9174ik;

    /* JADX INFO: renamed from: lr */
    private final wjv f9176lr;

    /* JADX INFO: renamed from: mj */
    private C3119ri.ri f9177mj;

    /* JADX INFO: renamed from: ri */
    private final ri f9178ri;
    private long xha;

    /* JADX INFO: renamed from: ka */
    private boolean f9175ka = true;

    /* JADX INFO: renamed from: fi */
    private long f9173fi = 0;

    /* JADX INFO: renamed from: di */
    private boolean f9172di = false;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ka$ri */
    private static class ri implements InterfaceC2004ri {

        /* JADX INFO: renamed from: di */
        private CountDownTimer f9180di;

        /* JADX INFO: renamed from: fi */
        private int f9181fi = 0;

        /* JADX INFO: renamed from: ik */
        private final com.bytedance.sdk.openadsdk.p236ka.xha f9182ik;
        private long jbs;

        /* JADX INFO: renamed from: ka */
        private long f9183ka;

        /* JADX INFO: renamed from: lr */
        private final InterfaceC2003ri f9184lr;

        /* JADX INFO: renamed from: mj */
        private long f9185mj;

        /* JADX INFO: renamed from: ri */
        private final long f9186ri;
        private InterfaceC1999ik.ri xha;

        public ri(long j, InterfaceC2003ri interfaceC2003ri, com.bytedance.sdk.openadsdk.p236ka.xha xhaVar) {
            this.f9186ri = j;
            this.f9184lr = interfaceC2003ri;
            this.f9182ik = xhaVar;
        }

        /* JADX INFO: renamed from: aw */
        public void m11702aw() {
            this.f9181fi = 0;
            CountDownTimer countDownTimer = this.f9180di;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f9180di = null;
            }
            if (this.xha != null) {
                this.xha = null;
            }
        }

        public long bgr() {
            return 0L;
        }

        /* JADX INFO: renamed from: bu */
        public long m11703bu() {
            return this.f9185mj;
        }

        /* JADX INFO: renamed from: co */
        public void m11704co() {
            this.f9181fi = 2;
            this.f9183ka = this.f9185mj;
            CountDownTimer countDownTimer = this.f9180di;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f9180di = null;
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: di */
        public boolean mo6167di() {
            return this.f9181fi == 1;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: fi */
        public int mo6168fi() {
            return 0;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: ik */
        public boolean mo6169ik() {
            return false;
        }

        public long jbs() {
            return this.jbs;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: ka */
        public int mo6170ka() {
            return 0;
        }

        /* JADX INFO: renamed from: lr */
        public void m11705lr(long j) {
            this.f9183ka = j;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: lr */
        public boolean mo6173lr() {
            return this.f9181fi == 4;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: mj */
        public boolean mo6174mj() {
            return this.f9181fi == 0;
        }

        /* JADX INFO: renamed from: qt */
        public void m11706qt() {
            this.f9185mj = 0L;
            m11709sf();
        }

        /* JADX INFO: renamed from: ri */
        public void m11707ri(long j) {
            this.jbs = j;
        }

        /* JADX INFO: renamed from: ri */
        public void m11708ri(InterfaceC1999ik.ri riVar) {
            this.xha = riVar;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        /* JADX INFO: renamed from: ri */
        public boolean mo6186ri() {
            return false;
        }

        /* JADX INFO: renamed from: sf */
        public void m11709sf() {
            if (this.f9181fi == 1) {
                return;
            }
            this.f9181fi = 1;
            final long jSlm = slm();
            if (this.f9183ka >= jSlm) {
                this.f9183ka = 0L;
            }
            final long j = jSlm - this.f9183ka;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.ka.ri.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (ri.this.xha != null) {
                        InterfaceC1999ik.ri riVar = ri.this.xha;
                        long j2 = jSlm;
                        riVar.mo6400ri(j2, j2);
                    }
                    ri.this.f9181fi = 4;
                    ri.this.f9185mj = jSlm;
                    ri.this.f9183ka = jSlm;
                    if (ri.this.xha != null) {
                        ri.this.xha.mo6399ri(ri.this.m11703bu(), 100);
                    }
                    C3412vr.ri riVar2 = new C3412vr.ri();
                    riVar2.m15466lr(jSlm);
                    riVar2.m15463ka(jSlm);
                    riVar2.m15459ik(ri.this.bgr());
                    riVar2.m15462ka(ri.this.m11710vr());
                    riVar2.m15472ri(ri.this.jbs());
                    C3413ri.m15486lr(ri.this.f9184lr, riVar2, ri.this.f9182ik);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + ri.this.f9183ka;
                    ri.this.f9185mj = j3;
                    if (ri.this.xha != null) {
                        ri.this.xha.mo6400ri(j3, jSlm);
                    }
                }
            };
            this.f9180di = countDownTimer;
            countDownTimer.start();
        }

        public long slm() {
            return this.f9186ri;
        }

        /* JADX INFO: renamed from: vr */
        public int m11710vr() {
            return 0;
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
        public boolean xha() {
            return this.f9181fi == 2;
        }
    }

    public C2992ka(wjv wjvVar, com.bytedance.sdk.openadsdk.p236ka.xha xhaVar) {
        InterfaceC2003ri interfaceC2003ri = new InterfaceC2003ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ka.1
        };
        this.f9174ik = interfaceC2003ri;
        this.f9176lr = wjvVar;
        C1997lr c1997lrM14389eu = wjvVar.m14389eu();
        long j = 10;
        long jM6339di = c1997lrM14389eu != null ? (long) c1997lrM14389eu.m6339di() : 10L;
        if (jM6339di <= 0) {
            c1997lrM14389eu.m6360ri(10.0d);
        } else {
            j = jM6339di;
        }
        this.f9178ri = new ri(j * 1000, interfaceC2003ri, xhaVar);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: aw */
    public boolean mo6371aw() {
        return this.f9178ri.mo6173lr();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public boolean bgr() {
        return false;
    }

    /* JADX INFO: renamed from: bu */
    public InterfaceC2003ri m11691bu() {
        return this.f9174ik;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: co */
    public InterfaceC2000lr mo6372co() {
        return null;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: di */
    public long mo6373di() {
        return this.f9178ri.m11703bu();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: fi */
    public void mo6374fi() {
        mo6376ka();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ik */
    public void mo6375ik() {
        this.f9178ri.m11709sf();
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(mo6373di());
        riVar.m15463ka(jbs());
        riVar.m15459ik(xha());
        C3413ri.m15485lr(this.f9174ik, riVar);
        C3119ri.ri riVar2 = this.f9177mj;
        if (riVar2 != null) {
            riVar2.mo10536ri(1);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public long jbs() {
        return this.f9178ri.slm();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ka */
    public void mo6376ka() {
        this.f9178ri.m11702aw();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: lr */
    public void mo6377lr() {
        this.f9178ri.m11704co();
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(mo6373di());
        riVar.m15463ka(jbs());
        riVar.m15459ik(xha());
        riVar.m15472ri(slm());
        C3413ri.m15492ri(this.f9174ik, riVar);
        C3119ri.ri riVar2 = this.f9177mj;
        if (riVar2 != null) {
            riVar2.mo10536ri(2);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: mj */
    public int mo6378mj() {
        return 0;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: qt */
    public int mo6379qt() {
        return C1977ri.m6207ri(this.f9178ri.f9185mj, this.f9178ri.f9186ri);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6380ri() {
        this.f9178ri.m11706qt();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6381ri(long j) {
        this.xha = j;
        ri riVar = this.f9178ri;
        if (riVar != null) {
            riVar.m11707ri(j);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6382ri(SurfaceTexture surfaceTexture) {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6383ri(InterfaceC1999ik.ri riVar) {
        this.f9178ri.m11708ri(riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m11692ri(C3119ri.ri riVar) {
        this.f9177mj = riVar;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6384ri(boolean z, int i) {
        mo6376ka();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6385ri(boolean z, String str) {
        this.f9172di = z;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6386ri(float f) {
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6387ri(C1996ik c1996ik) {
        this.f9172di = c1996ik.m6331sf();
        if (c1996ik.m6324qt() > 0) {
            this.f9178ri.m11705lr(c1996ik.m6324qt());
        }
        c1996ik.m6319lr(C3606fi.m16703ri("player_force_raw_url", 0) == 1);
        C3413ri.m15496ri(this.f9176lr, this.f9174ik, c1996ik);
        this.f9178ri.m11709sf();
        C3119ri.ri riVar = this.f9177mj;
        if (riVar != null) {
            riVar.mo10536ri(1);
        }
        return true;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: sf */
    public InterfaceC2004ri mo6388sf() {
        return this.f9178ri;
    }

    public long slm() {
        return this.xha;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: vr */
    public boolean mo6389vr() {
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public long xha() {
        return 0L;
    }
}
