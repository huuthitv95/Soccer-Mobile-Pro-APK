package com.bytedance.sdk.openadsdk.p230di;

import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3367ri {

    /* JADX INFO: renamed from: ri */
    private static volatile C3367ri f11929ri;

    /* JADX INFO: renamed from: aw */
    private boolean f11930aw;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f11931bu;

    /* JADX INFO: renamed from: co */
    private int[] f11932co;

    /* JADX INFO: renamed from: di */
    private int[] f11933di;

    /* JADX INFO: renamed from: fi */
    private int[] f11934fi;

    /* JADX INFO: renamed from: ik */
    private boolean f11935ik;
    private int[] jbs;

    /* JADX INFO: renamed from: ka */
    private boolean f11936ka;

    /* JADX INFO: renamed from: lr */
    private boolean f11937lr;

    /* JADX INFO: renamed from: mj */
    private int[] f11938mj;

    /* JADX INFO: renamed from: qt */
    private boolean f11939qt;

    /* JADX INFO: renamed from: sf */
    private boolean f11940sf;
    private boolean slm;

    /* JADX INFO: renamed from: vr */
    private int f11941vr;
    private int[] xha;

    private C3367ri() {
        m15206lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public int[] m15184ik(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int i2 = Integer.parseInt(str);
                iArr[i] = i2;
                if (i2 > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public int[] m15190lr(String[] strArr) {
        return strArr.length > 0 ? m15184ik(strArr[0].split(",")) : new int[0];
    }

    /* JADX INFO: renamed from: ri */
    public static C3367ri m15193ri() {
        if (f11929ri == null) {
            synchronized (C3215ik.class) {
                if (f11929ri == null) {
                    f11929ri = new C3367ri();
                }
            }
        }
        return f11929ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m15197ri(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: aw */
    public int[] m15199aw() {
        return this.jbs;
    }

    public boolean bgr() {
        return this.f11939qt;
    }

    /* JADX INFO: renamed from: bu */
    public boolean m15200bu() {
        return this.f11930aw;
    }

    /* JADX INFO: renamed from: co */
    public int[] m15201co() {
        return this.f11938mj;
    }

    /* JADX INFO: renamed from: di */
    public boolean m15202di() {
        return this.f11937lr;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m15203fi() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m15204ik() {
        return this.bgr;
    }

    public int[] jbs() {
        return this.f11934fi;
    }

    /* JADX INFO: renamed from: ka */
    public int m15205ka() {
        return this.f11941vr;
    }

    /* JADX INFO: renamed from: lr */
    public void m15206lr() {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.ri.1
            @Override // java.lang.Runnable
            public void run() {
                C3367ri.this.bgr = C3606fi.m16710ri("feature_switch", false);
                if (C3367ri.this.bgr) {
                    try {
                        C3367ri.this.f11931bu = C3606fi.m16710ri("exclude_banner_native", false);
                        C3367ri.this.f11941vr = C3606fi.m16703ri("feature_timer_interval", 10000);
                        C3367ri.this.slm = C3606fi.m16710ri("enable_feature_cids", true);
                        String[] strArrSplit = C3606fi.m16707ri("pag_ad_show_cnt", "1,3,5&session").split(C11744X3.j.f26436c);
                        String[] strArrSplit2 = C3606fi.m16707ri("pag_ad_click_cnt", "1,3,5&session").split(C11744X3.j.f26436c);
                        String[] strArrSplit3 = C3606fi.m16707ri("pag_video_play_cnt", "1,3,5&session").split(C11744X3.j.f26436c);
                        String[] strArrSplit4 = C3606fi.m16707ri("pag_dislike_cnt", "1,3,5session").split(",");
                        C3367ri c3367ri = C3367ri.this;
                        c3367ri.f11937lr = c3367ri.m15197ri(strArrSplit);
                        C3367ri c3367ri2 = C3367ri.this;
                        c3367ri2.f11935ik = c3367ri2.m15197ri(strArrSplit2);
                        C3367ri c3367ri3 = C3367ri.this;
                        c3367ri3.f11936ka = c3367ri3.m15197ri(strArrSplit3);
                        C3367ri c3367ri4 = C3367ri.this;
                        c3367ri4.f11934fi = c3367ri4.m15190lr(strArrSplit);
                        C3367ri c3367ri5 = C3367ri.this;
                        c3367ri5.f11933di = c3367ri5.m15190lr(strArrSplit2);
                        C3367ri c3367ri6 = C3367ri.this;
                        c3367ri6.xha = c3367ri6.m15190lr(strArrSplit3);
                        C3367ri c3367ri7 = C3367ri.this;
                        c3367ri7.f11932co = c3367ri7.m15184ik(strArrSplit4);
                        String[] strArrSplit5 = C3606fi.m16707ri("pag_landingPage_stay_time", "1,3,5&session").split(C11744X3.j.f26436c);
                        String[] strArrSplit6 = C3606fi.m16707ri("pag_video_stay_time", "1,3,5&session").split(C11744X3.j.f26436c);
                        C3367ri c3367ri8 = C3367ri.this;
                        c3367ri8.f11939qt = c3367ri8.m15197ri(strArrSplit5);
                        C3367ri c3367ri9 = C3367ri.this;
                        c3367ri9.f11940sf = c3367ri9.m15197ri(strArrSplit6);
                        C3367ri c3367ri10 = C3367ri.this;
                        c3367ri10.f11938mj = c3367ri10.m15190lr(strArrSplit5);
                        C3367ri c3367ri11 = C3367ri.this;
                        c3367ri11.jbs = c3367ri11.m15190lr(strArrSplit6);
                        C3367ri.this.f11930aw = C3606fi.m16710ri("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: mj */
    public boolean m15207mj() {
        return this.f11936ka;
    }

    /* JADX INFO: renamed from: nr */
    public boolean m15208nr() {
        return this.f11931bu;
    }

    /* JADX INFO: renamed from: qt */
    public int[] m15209qt() {
        return this.f11933di;
    }

    /* JADX INFO: renamed from: sf */
    public int[] m15210sf() {
        return this.xha;
    }

    public int[] slm() {
        return this.f11932co;
    }

    /* JADX INFO: renamed from: vr */
    public boolean m15211vr() {
        return this.f11940sf;
    }

    public boolean xha() {
        return this.f11935ik;
    }
}
