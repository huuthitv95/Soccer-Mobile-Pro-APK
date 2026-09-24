package com.bytedance.sdk.openadsdk.core.p190aw;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3100lr;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3101ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3097ka {

    /* JADX INFO: renamed from: ac */
    private boolean f9794ac;

    /* JADX INFO: renamed from: bu */
    private wjv f9796bu;
    private String ihz;

    /* JADX INFO: renamed from: nr */
    private boolean f9804nr;
    private long slm;
    private boolean tan;

    /* JADX INFO: renamed from: uq */
    private String f9808uq;

    /* JADX INFO: renamed from: vr */
    private boolean f9809vr;

    /* JADX INFO: renamed from: aw */
    private final AtomicBoolean f9795aw = new AtomicBoolean(false);
    private final AtomicBoolean bgr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    public List<C3099ik> f9806ri = new ArrayList();

    /* JADX INFO: renamed from: lr */
    public List<C3099ik> f9802lr = new ArrayList();

    /* JADX INFO: renamed from: ik */
    public List<C3099ik> f9800ik = new ArrayList();

    /* JADX INFO: renamed from: ka */
    public List<C3099ik> f9801ka = new ArrayList();

    /* JADX INFO: renamed from: fi */
    public List<C3099ik> f9799fi = new ArrayList();

    /* JADX INFO: renamed from: di */
    public List<C3099ik> f9798di = new ArrayList();
    public List<C3099ik> xha = new ArrayList();

    /* JADX INFO: renamed from: mj */
    public List<C3099ik> f9803mj = new ArrayList();
    public List<C3099ik> jbs = new ArrayList();

    /* JADX INFO: renamed from: qt */
    public List<C3099ik> f9805qt = new ArrayList();

    /* JADX INFO: renamed from: sf */
    public List<C3100lr> f9807sf = new ArrayList();

    /* JADX INFO: renamed from: co */
    public List<C3101ri> f9797co = new ArrayList();

    /* JADX INFO: renamed from: ri */
    private String m12461ri() {
        if (this.f9808uq == null) {
            this.f9808uq = UUID.randomUUID().toString();
        }
        return this.f9808uq;
    }

    /* JADX INFO: renamed from: ri */
    private void m12462ri(final C3090di c3090di, final int i) {
        jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.ka.1
            @Override // java.lang.Runnable
            public void run() {
                C3090di c3090di2 = c3090di;
                if (c3090di2 != null) {
                    c3090di2.m12403ri(i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m12463ri(String str) {
        try {
            if (this.f9809vr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
                C3414ik.m15522lr(this.f9796bu, this.ihz, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                C3414ik.m15522lr(this.f9796bu, this.ihz, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                C3414ik.m15522lr(this.f9796bu, this.ihz, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                C3414ik.m15522lr(this.f9796bu, this.ihz, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12464ri(long j, List<C3099ik> list, EnumC3106ri enumC3106ri) {
        return m12465ri(j, list, enumC3106ri, null);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12465ri(long j, List<C3099ik> list, EnumC3106ri enumC3106ri, C3099ik.lr lrVar) {
        C1997lr c1997lrM14389eu;
        wjv wjvVar = this.f9796bu;
        String strM6364sf = null;
        if (wjvVar != null && (c1997lrM14389eu = wjvVar.m14389eu()) != null) {
            strM6364sf = c1997lrM14389eu.m6364sf();
        }
        return C3099ik.m12504ri(this.f9796bu, list, enumC3106ri, j, strM6364sf, lrVar, m12461ri());
    }

    /* JADX INFO: renamed from: co */
    public void m12466co(List<C3099ik> list) {
        this.f9805qt.addAll(list);
    }

    /* JADX INFO: renamed from: di */
    public void m12467di(long j) {
        if (!m12465ri(j, this.xha, null, this.f9809vr ? null : new C3099ik.lr("skip", this.f9796bu)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_skip", (JSONObject) null);
    }

    /* JADX INFO: renamed from: di */
    public void m12468di(List<C3099ik> list) {
        this.xha.addAll(list);
    }

    /* JADX INFO: renamed from: fi */
    public void m12469fi(long j) {
        if (this.bgr.compareAndSet(false, true)) {
            m12464ri(j, this.f9798di, (EnumC3106ri) null);
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m12470fi(List<C3099ik> list) {
        this.f9798di.addAll(list);
    }

    /* JADX INFO: renamed from: ik */
    public void m12471ik(long j) {
        if (!m12465ri(j, this.f9801ka, null, this.f9809vr ? null : new C3099ik.lr(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.f9796bu, j)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_resume", (JSONObject) null);
    }

    /* JADX INFO: renamed from: ik */
    public void m12472ik(List<C3099ik> list) {
        this.f9801ka.addAll(list);
    }

    public void jbs(long j) {
        if (!m12465ri(j, this.f9805qt, null, this.f9809vr ? null : new C3099ik.lr(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.f9796bu, j)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_unmute", (JSONObject) null);
    }

    public void jbs(List<C3101ri> list) {
        this.f9797co.addAll(list);
        Collections.sort(this.f9797co);
    }

    /* JADX INFO: renamed from: ka */
    public void m12473ka(long j) {
        if (!m12465ri(j, this.f9799fi, null, new C3099ik.lr(this.f9809vr ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.f9796bu, 1.0f)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_complete", (JSONObject) null);
    }

    /* JADX INFO: renamed from: ka */
    public void m12474ka(List<C3099ik> list) {
        this.f9799fi.addAll(list);
    }

    /* JADX INFO: renamed from: lr */
    public void m12475lr(long j) {
        if (!m12465ri(j, this.f9800ik, null, this.f9809vr ? null : new C3099ik.lr(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.f9796bu, j)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_pause", (JSONObject) null);
    }

    /* JADX INFO: renamed from: lr */
    public void m12476lr(List<C3099ik> list) {
        this.f9800ik.addAll(list);
    }

    /* JADX INFO: renamed from: mj */
    public void m12477mj(long j) {
        if (!m12465ri(j, this.jbs, null, this.f9809vr ? null : new C3099ik.lr(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f9796bu, j)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_mute", (JSONObject) null);
    }

    /* JADX INFO: renamed from: mj */
    public void m12478mj(List<C3100lr> list) {
        this.f9807sf.addAll(list);
        Collections.sort(this.f9807sf);
    }

    /* JADX INFO: renamed from: qt */
    public void m12479qt(List<C3099ik> list) {
        this.f9806ri.addAll(list);
    }

    /* JADX INFO: renamed from: ri */
    public List<C3099ik> m12480ri(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f9807sf.size(); i++) {
            C3100lr c3100lr = this.f9807sf.get(i);
            if (c3100lr.m12512ri(f)) {
                arrayList.add(c3100lr);
            }
        }
        for (int i2 = 0; i2 < this.f9797co.size(); i2++) {
            C3101ri c3101ri = this.f9797co.get(i2);
            if (c3101ri.m12517ri(j)) {
                arrayList.add(c3101ri);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public void m12481ri(long j) {
        if (this.f9795aw.compareAndSet(false, true)) {
            if (!m12465ri(j, this.f9802lr, null, new C3099ik.lr(this.f9809vr ? "show_impression" : "impression", this.f9796bu)) || this.f9809vr) {
                return;
            }
            C3414ik.m15522lr(this.f9796bu, this.ihz, "track_impression", (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12482ri(long j, long j2, C3090di c3090di) {
        C3099ik.lr lrVar;
        if (System.currentTimeMillis() - this.slm >= 1000 && j >= 0 && j2 > 0) {
            this.slm = System.currentTimeMillis();
            float f = j / j2;
            List<C3099ik> listM12480ri = m12480ri(j, f);
            float f2 = 0.25f;
            if (f < 0.25f || this.f9804nr) {
                f2 = 0.5f;
                if (f < 0.5f || this.tan) {
                    f2 = 0.75f;
                    if (f < 0.75f || this.f9794ac) {
                        lrVar = null;
                    } else {
                        m12463ri("thirdQuartile");
                        this.f9794ac = true;
                        if (c3090di != null) {
                            m12462ri(c3090di, 8);
                        }
                        if (!this.f9809vr) {
                            lrVar = new C3099ik.lr("thirdQuartile", this.f9796bu, 0.75f);
                            f = f2;
                        }
                        f = f2;
                        lrVar = null;
                    }
                } else {
                    m12463ri(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.tan = true;
                    if (c3090di != null) {
                        m12462ri(c3090di, 7);
                    }
                    if (!this.f9809vr) {
                        lrVar = new C3099ik.lr(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.f9796bu, 0.5f);
                        f = f2;
                    }
                    f = f2;
                    lrVar = null;
                }
            } else {
                m12463ri("firstQuartile");
                this.f9804nr = true;
                if (c3090di != null) {
                    m12462ri(c3090di, 6);
                }
                if (!this.f9809vr) {
                    lrVar = new C3099ik.lr("firstQuartile", this.f9796bu, 0.25f);
                    f = f2;
                }
                f = f2;
                lrVar = null;
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            if (!this.f9809vr && !listM12480ri.isEmpty()) {
                C3099ik c3099ik = listM12480ri.get(0);
                if ((c3099ik instanceof C3101ri) && ((C3101ri) c3099ik).m12516ri() == 0) {
                    C3414ik.m15522lr(this.f9796bu, this.ihz, "track_start", (JSONObject) null);
                    lrVar = new C3099ik.lr("start", this.f9796bu, f);
                }
            }
            if (listM12480ri.isEmpty()) {
                return;
            }
            if (lrVar == null) {
                lrVar = new C3099ik.lr("video_progress", this.f9796bu, f);
            }
            m12465ri(j, listM12480ri, null, lrVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12483ri(C3097ka c3097ka) {
        m12479qt(c3097ka.f9806ri);
        m12488ri(c3097ka.f9802lr);
        m12476lr(c3097ka.f9800ik);
        m12472ik(c3097ka.f9801ka);
        m12474ka(c3097ka.f9799fi);
        m12470fi(c3097ka.f9798di);
        m12468di(c3097ka.xha);
        xha(c3097ka.f9803mj);
        m12490sf(c3097ka.jbs);
        m12466co(c3097ka.f9805qt);
        m12478mj(c3097ka.f9807sf);
        jbs(c3097ka.f9797co);
    }

    /* JADX INFO: renamed from: ri */
    public void m12484ri(EnumC3106ri enumC3106ri) {
        if (!m12465ri(-1L, this.f9806ri, enumC3106ri, this.f9809vr ? null : new C3099ik.lr("error", this.f9796bu, 0.0f)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_error", (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public void m12485ri(wjv wjvVar) {
        this.f9796bu = wjvVar;
        this.ihz = wjvVar.m14394fi();
        this.f9809vr = wjvVar.m14576zz();
    }

    /* JADX INFO: renamed from: ri */
    public void m12486ri(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        m12478mj(Collections.singletonList(new C3100lr.ri(str, f).m12513ri()));
    }

    /* JADX INFO: renamed from: ri */
    public void m12487ri(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        jbs(Collections.singletonList(new C3101ri.ri(str, j).m12518ri()));
    }

    /* JADX INFO: renamed from: ri */
    public void m12488ri(List<C3099ik> list) {
        this.f9802lr.addAll(list);
    }

    /* JADX INFO: renamed from: ri */
    public void m12489ri(JSONObject jSONObject) {
        m12479qt(C3099ik.m12499ri(jSONObject.optJSONArray("errorTrackers")));
        m12488ri(C3099ik.m12499ri(jSONObject.optJSONArray("impressionTrackers")));
        m12476lr(C3099ik.m12500ri(jSONObject.optJSONArray("pauseTrackers"), true));
        m12472ik(C3099ik.m12500ri(jSONObject.optJSONArray("resumeTrackers"), true));
        m12474ka(C3099ik.m12499ri(jSONObject.optJSONArray("completeTrackers")));
        m12470fi(C3099ik.m12499ri(jSONObject.optJSONArray("closeTrackers")));
        m12468di(C3099ik.m12499ri(jSONObject.optJSONArray("skipTrackers")));
        xha(C3099ik.m12499ri(jSONObject.optJSONArray("clickTrackers")));
        m12490sf(C3099ik.m12500ri(jSONObject.optJSONArray("muteTrackers"), true));
        m12466co(C3099ik.m12500ri(jSONObject.optJSONArray("unMuteTrackers"), true));
        m12478mj(C3099ik.m12495lr(jSONObject.optJSONArray("fractionalTrackers")));
        jbs(C3099ik.m12494ik(jSONObject.optJSONArray("absoluteTrackers")));
    }

    /* JADX INFO: renamed from: sf */
    public void m12490sf(List<C3099ik> list) {
        this.jbs.addAll(list);
    }

    public void xha(long j) {
        if (!m12465ri(j, this.f9803mj, null, new C3099ik.lr(this.f9809vr ? "click" : "clickTracking", this.f9796bu)) || this.f9809vr) {
            return;
        }
        C3414ik.m15522lr(this.f9796bu, this.ihz, "track_video_click", (JSONObject) null);
    }

    public void xha(List<C3099ik> list) {
        this.f9803mj.addAll(list);
    }
}
