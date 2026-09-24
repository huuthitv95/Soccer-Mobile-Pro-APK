package com.bytedance.adsdk.ugeno.p101ka.p104lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.C2292ka;
import com.bytedance.adsdk.ugeno.p101ka.C2303lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2308ri {

    /* JADX INFO: renamed from: ri */
    public static final HashSet<String> f5834ri = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "preventEvent"));

    /* JADX INFO: renamed from: di */
    protected Map<String, String> f5835di;

    /* JADX INFO: renamed from: fi */
    protected String f5836fi;

    /* JADX INFO: renamed from: ik */
    protected AbstractViewOnTouchListenerC2318ik f5837ik;

    /* JADX INFO: renamed from: ka */
    protected String f5838ka;

    /* JADX INFO: renamed from: lr */
    protected C2285di.ri f5839lr;

    /* JADX INFO: renamed from: mj */
    protected String f5840mj;
    protected String xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.ri$ri */
    /* JADX INFO: loaded from: classes9.dex */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static AbstractC2308ri m7802ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
            AbstractC2308ri abstractC2308riMo7758ri;
            if (riVar == null) {
                return null;
            }
            String strM7751lr = riVar.m7751lr();
            riVar.m7754ri();
            C2303lr c2303lrM7774ri = C2292ka.m7774ri(strM7751lr);
            if (c2303lrM7774ri == null && (TextUtils.isEmpty(riVar.m7754ri()) || !TextUtils.equals(riVar.m7754ri(), "global"))) {
                c2303lrM7774ri = C2292ka.m7774ri(riVar.m7746fi());
            }
            return (c2303lrM7774ri == null || (abstractC2308riMo7758ri = c2303lrM7774ri.mo7758ri(abstractViewOnTouchListenerC2318ik, str, riVar)) == null) ? new C2305ik(abstractViewOnTouchListenerC2318ik, str, riVar) : abstractC2308riMo7758ri;
        }
    }

    public AbstractC2308ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        this.f5837ik = abstractViewOnTouchListenerC2318ik;
        this.f5839lr = riVar;
        this.xha = str;
        m7799fi();
    }

    /* JADX INFO: renamed from: fi */
    private void m7799fi() {
        C2285di.ri riVar = this.f5839lr;
        if (riVar == null) {
            return;
        }
        this.f5838ka = riVar.m7754ri();
        this.f5836fi = this.f5839lr.m7751lr();
        Map<String, String> mapM7747ik = this.f5839lr.m7747ik();
        this.f5835di = mapM7747ik;
        if (mapM7747ik == null || mapM7747ik.isEmpty() || !this.f5835di.containsKey("emitCustomEvent")) {
            return;
        }
        this.f5840mj = this.f5835di.get("emitCustomEvent");
    }

    /* JADX INFO: renamed from: ik */
    public void m7800ik() {
        if (m7801ka()) {
            C2285di.ri riVar = new C2285di.ri();
            riVar.m7755ri("custom");
            riVar.m7752lr("emit");
            HashMap map = new HashMap();
            map.put("name", this.f5840mj);
            riVar.m7756ri(map);
            new C2307lr(this.f5837ik, this.f5836fi, riVar).mo7759ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m7801ka() {
        return !TextUtils.isEmpty(this.f5840mj);
    }

    /* JADX INFO: renamed from: lr */
    public void mo7798lr() {
        m7800ik();
    }

    /* JADX INFO: renamed from: ri */
    public abstract void mo7759ri();
}
