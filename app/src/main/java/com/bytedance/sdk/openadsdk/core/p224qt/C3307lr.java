package com.bytedance.sdk.openadsdk.core.p224qt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3228co;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3307lr {

    /* JADX INFO: renamed from: ri */
    public static final Long f11538ri = 0L;

    /* JADX INFO: renamed from: lr */
    private AtomicBoolean f11539lr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt.lr$ri */
    /* JADX INFO: loaded from: classes9.dex */
    private static final class ri {

        /* JADX INFO: renamed from: ri */
        static final C3307lr f11544ri = new C3307lr();
    }

    private C3307lr() {
        this.f11539lr = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: ri */
    public static C3307lr m14718ri() {
        return ri.f11544ri;
    }

    private void slm() {
        if (m14718ri().m14722fi() || this.f11539lr.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        C3606fi.m16709ri();
        C3228co.m13617lr();
        C3116ri.m12672ri().m12683lr();
    }

    /* JADX INFO: renamed from: aw */
    public long m14719aw() {
        return C3535ri.m16065ri("sp_compliance_file", "allow_req_time", f11538ri.longValue());
    }

    public void bgr() {
        m14718ri().m14725lr();
    }

    /* JADX INFO: renamed from: co */
    public boolean m14720co() {
        return C3535ri.m16063ri("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    /* JADX INFO: renamed from: di */
    public boolean m14721di() {
        return C3535ri.m16063ri("sp_compliance_file", "app_reg", -1) == 1;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m14722fi() {
        return (!m14724ka() && m14721di() && jbs()) ? false : true;
    }

    /* JADX INFO: renamed from: ik */
    public int m14723ik() {
        return C3535ri.m16063ri("sp_compliance_file", "app_reg", -1);
    }

    public boolean jbs() {
        int iM16063ri = C3535ri.m16063ri("sp_compliance_file", "user_compliance_status", -1);
        return iM16063ri == 1 || iM16063ri == 2;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m14724ka() {
        long jM14719aw = m14719aw();
        return m14720co() && jM14719aw != 0 && System.currentTimeMillis() < jM14719aw;
    }

    /* JADX INFO: renamed from: lr */
    public void m14725lr() {
        String strGcp = C3322sf.m14819lr().gcp();
        if (TextUtils.isEmpty(strGcp)) {
            return;
        }
        if (TextUtils.equals("true", strGcp)) {
            m14729ri(1);
        } else if (TextUtils.equals("false", strGcp)) {
            m14729ri(0);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m14726lr(int i) {
        C3535ri.m16074ri("sp_compliance_file", "user_compliance_status", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: mj */
    public int m14727mj() {
        return C3535ri.m16063ri("sp_compliance_file", "user_compliance_status", -1);
    }

    /* JADX INFO: renamed from: qt */
    public boolean m14728qt() {
        return C3535ri.m16063ri("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    /* JADX INFO: renamed from: ri */
    public void m14729ri(int i) {
        C3535ri.m16074ri("sp_compliance_file", "app_reg", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ri */
    public void m14730ri(long j) {
        C3535ri.m16075ri("sp_compliance_file", "allow_req_time", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ri */
    public void m14731ri(final InterfaceC3306ka interfaceC3306ka, final boolean z) {
        C3305ik c3305ik = new C3305ik();
        c3305ik.m14716ri(new InterfaceC3306ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.p224qt.InterfaceC3306ka
            /* JADX INFO: renamed from: ri */
            public void mo14717ri(boolean z2) {
                if (!z2) {
                    interfaceC3306ka.mo14717ri(false);
                    return;
                }
                C3308ri c3308ri = new C3308ri(z);
                c3308ri.m14747ri(new InterfaceC3306ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.lr.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.p224qt.InterfaceC3306ka
                    /* JADX INFO: renamed from: ri */
                    public void mo14717ri(boolean z3) {
                        interfaceC3306ka.mo14717ri(z3);
                    }
                });
                c3308ri.m14746ri();
            }
        });
        c3305ik.m14715ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m14732ri(String str) {
        C3535ri.m16077ri("sp_compliance_file", "user_compliance_status_reason", str);
    }

    /* JADX INFO: renamed from: sf */
    public boolean m14733sf() {
        return C3535ri.m16063ri("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    /* JADX INFO: renamed from: vr */
    public void m14734vr() {
        slm();
    }

    public boolean xha() {
        return C3535ri.m16063ri("sp_compliance_file", "app_reg", -1) == -1;
    }
}
