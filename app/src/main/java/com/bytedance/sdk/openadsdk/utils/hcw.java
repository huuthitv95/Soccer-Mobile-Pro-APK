package com.bytedance.sdk.openadsdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri;

/* JADX INFO: loaded from: classes3.dex */
public class hcw implements Handler.Callback, C3119ri.ri {

    /* JADX INFO: renamed from: co */
    private int f13147co;

    /* JADX INFO: renamed from: di */
    private boolean f13148di;

    /* JADX INFO: renamed from: fi */
    private final C3022ri f13149fi;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private final com.bytedance.sdk.openadsdk.core.model.wjv f13151ka;

    /* JADX INFO: renamed from: mj */
    private boolean f13153mj;

    /* JADX INFO: renamed from: qt */
    private int f13154qt;
    private boolean xha;

    /* JADX INFO: renamed from: ri */
    private float f13155ri = 1.0f;

    /* JADX INFO: renamed from: lr */
    private int f13152lr = 1000;

    /* JADX INFO: renamed from: ik */
    private final Handler f13150ik = new Handler(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: sf */
    private int f13156sf = 0;

    public hcw(C3022ri c3022ri, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        this.f13154qt = 0;
        this.f13147co = 0;
        this.f13149fi = c3022ri;
        this.f13151ka = wjvVar;
        if (wjvVar.m14472qa()) {
            if (wjvVar.plm() >= 0) {
                this.f13147co = wjvVar.plm();
            } else {
                this.f13147co = C3299nr.m14639ka().m14872qt(String.valueOf(wjvVar.m14545ur()));
            }
        } else if (wjvVar.m14467pg()) {
            if (wjvVar.mhp() >= 0) {
                this.f13147co = wjvVar.mhp();
            } else {
                this.f13147co = C3299nr.m14639ka().tan(String.valueOf(wjvVar.m14545ur()));
            }
        }
        this.f13154qt = (int) c3022ri.ihz.m12147qd();
        C2707ac.m10205ri("TTAD.TopLayoutHelper", "totalTime: " + this.f13154qt + ", skipTime=" + this.f13147co);
    }

    /* JADX INFO: renamed from: fi */
    public void m16422fi() {
        this.f13150ik.removeMessages(1024);
        this.f13148di = false;
        this.f13153mj = true;
        C3022ri c3022ri = this.f13149fi;
        if (c3022ri != null) {
            c3022ri.ihz.m12145oh();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            int i = this.f13154qt - this.f13156sf;
            this.f13149fi.ihz.m12152ri(((long) this.f13156sf) * 1000);
            C2707ac.m10205ri("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.f13156sf + ", mRemainTimeInSeconds=" + i);
            if (i > 0) {
                if (this.f13149fi.f9384ig instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) this.f13149fi.f9384ig).m10693ik(((long) this.f13156sf) * 1000, this.f13154qt);
                }
                boolean z = false;
                if (this.f13149fi.f9374ay != null && this.f13149fi.f9374ay.m12263ri() != null) {
                    this.f13149fi.f9374ay.m12263ri().setTime(String.valueOf(i), this.f13156sf, 0, false);
                }
                if (this.f13151ka.m14472qa()) {
                    if (this.f13149fi.f9374ay != null) {
                        if (this.f13149fi.f9374ay.jbs() && this.f13147co > 0) {
                            z = true;
                        }
                        this.jbs = z;
                    }
                    if (!this.jbs || this.f13156sf < this.f13147co || this.f13149fi.f9389lr.m14453nd() == 5 || this.f13149fi.f9389lr.m14453nd() == 33) {
                        this.f13149fi.f9394oh.m11872ri(String.valueOf(i), null);
                    } else {
                        this.f13149fi.m12005ri(true);
                        this.f13149fi.f9394oh.m11872ri(String.valueOf(i), TTAdDislikeToast.getSkipText());
                        this.f13149fi.f9394oh.m11859fi(true);
                    }
                } else if (this.f13151ka.m14467pg() && (this.f13149fi.f9374ay.jbs() || this.f13149fi.f9389lr.vgs())) {
                    if (this.f13149fi.f9384ig instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) this.f13149fi.f9384ig).m10612ri(this.f13156sf);
                    }
                    this.f13149fi.f9394oh.m11863ka(true);
                    this.f13149fi.f9394oh.m11872ri(String.valueOf(i), null);
                }
                this.f13156sf++;
                if (this.f13149fi.ihz.m12134ik()) {
                    com.bytedance.sdk.openadsdk.core.model.ory oryVarCmy = this.f13149fi.f9389lr.cmy();
                    if (oryVarCmy != null) {
                        float fM14239ri = oryVarCmy.m14239ri();
                        this.f13155ri = fM14239ri;
                        if (fM14239ri <= 0.0f) {
                            this.f13155ri = 1.0f;
                        }
                    }
                } else {
                    this.f13155ri = 1.0f;
                }
                int i2 = (int) (1000.0f / this.f13155ri);
                C2707ac.m10205ri("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i2)));
                this.f13150ik.sendEmptyMessageDelayed(message.what, i2);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m16423ik() {
        if (this.f13148di) {
            this.f13150ik.removeMessages(1024);
            this.f13150ik.sendEmptyMessage(1024);
            this.xha = false;
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m16424ka() {
        if (!this.f13148di || this.xha) {
            return;
        }
        this.f13150ik.removeMessages(1024);
        this.xha = true;
    }

    /* JADX INFO: renamed from: lr */
    public void m16425lr() {
        this.f13150ik.sendEmptyMessage(1024);
        this.xha = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo10536ri(int i) {
        C2707ac.m10205ri("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            m16423ik();
            return;
        }
        if (i == 2) {
            m16424ka();
        } else if (i == 3 || i == 4) {
            m16422fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16426ri(long j) {
        int iCeil = (int) Math.ceil(j / 1000.0d);
        if (this.xha && !this.f13153mj) {
            this.f13156sf = iCeil;
            m16423ik();
        } else {
            if (this.f13148di || this.f13153mj) {
                return;
            }
            this.f13156sf = iCeil;
            this.f13148di = true;
            m16425lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m16427ri() {
        return this.f13148di;
    }
}
