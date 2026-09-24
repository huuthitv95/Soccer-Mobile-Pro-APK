package com.bytedance.sdk.openadsdk.p230di;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p178bu.C2904ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3581oh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3366lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C3366lr f11902ri;

    /* JADX INFO: renamed from: lr */
    private final ConcurrentHashMap<String, C2904ri> f11907lr = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ik */
    private C2904ri f11905ik = null;

    /* JADX INFO: renamed from: ka */
    private volatile boolean f11906ka = false;

    /* JADX INFO: renamed from: fi */
    private volatile HandlerThread f11904fi = null;

    /* JADX INFO: renamed from: di */
    private volatile Handler f11903di = null;
    private String xha = "";

    /* JADX INFO: renamed from: mj */
    private int f11908mj = 0;
    private volatile long jbs = 0;

    /* JADX INFO: renamed from: qt */
    private final Runnable f11909qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (C3367ri.m15193ri().m15203fi()) {
                        Set<String> setKeySet = C3366lr.this.f11907lr.keySet();
                        if (setKeySet.size() > C3366lr.this.f11908mj) {
                            C3366lr.this.f11908mj = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(C3366lr.this.f11907lr.values());
                        Collections.sort(arrayList);
                        for (int i = 0; i < arrayList.size() && i < 5; i++) {
                            hashSet.add(((C2904ri) arrayList.get(i)).m11192lr());
                        }
                        try {
                            for (String str : setKeySet) {
                                C2904ri c2904ri = (C2904ri) C3366lr.this.f11907lr.get(str);
                                if (c2904ri != null) {
                                    JSONObject jSONObjectM11194ri = c2904ri.m11194ri(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectM11194ri);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e) {
                            C2707ac.m10197ik(e.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (C3366lr.this.f11905ik != null) {
                                jSONObject.put("common", C3366lr.this.f11905ik.m11194ri(jSONObject2));
                            }
                        } catch (JSONException e2) {
                            C2707ac.m10197ik(e2.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.getMessage(), new Object[0]);
                }
                C3366lr.this.xha = jSONObject.toString();
                C3366lr c3366lr = C3366lr.this;
                c3366lr.m15170ri(c3366lr.f11909qt, C3367ri.m15193ri().m15205ka());
            } catch (OutOfMemoryError e3) {
                C2707ac.m10197ik(e3.getMessage(), new Object[0]);
            }
        }
    };

    private C3366lr() {
    }

    /* JADX INFO: renamed from: fi */
    private void m15156fi() {
        if (this.f11906ka) {
            return;
        }
        this.f11906ka = true;
        m15170ri(this.f11909qt, C3367ri.m15193ri().m15205ka());
    }

    /* JADX INFO: renamed from: ik */
    private Handler m15157ik() {
        if (this.f11904fi == null || !this.f11904fi.isAlive()) {
            synchronized (C3332vr.class) {
                if (this.f11904fi == null || !this.f11904fi.isAlive()) {
                    this.f11904fi = C2723mj.m10251ri("pag_feature", -1);
                    this.f11903di = new Handler(this.f11904fi.getLooper());
                }
            }
        } else if (this.f11903di == null) {
            synchronized (C3332vr.class) {
                if (this.f11903di == null) {
                    this.f11903di = new Handler(this.f11904fi.getLooper());
                }
            }
        }
        return this.f11903di;
    }

    /* JADX INFO: renamed from: ka */
    private void m15160ka() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.jbs > 10000) {
            C3521ka.m15952ri("track_feature_result", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.di.lr.1
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    C3366lr.this.jbs = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(C3366lr.this.f11908mj));
                    return C3531ka.m15967lr().m15985ri("track_feature_result").m15980lr(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3366lr m15165ri() {
        if (f11902ri == null) {
            synchronized (C3215ik.class) {
                if (f11902ri == null) {
                    f11902ri = new C3366lr();
                }
            }
        }
        return f11902ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m15169ri(Runnable runnable) {
        if (C3581oh.f13200ri || runnable == null) {
            return;
        }
        try {
            m15157ik().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15170ri(Runnable runnable, long j) {
        if (C3581oh.f13200ri || runnable == null) {
            return;
        }
        try {
            m15157ik().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15171ri(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && C3367ri.m15193ri().m15204ik()) {
                m15156fi();
                if (!C3367ri.m15193ri().m15203fi()) {
                    if (this.f11905ik == null) {
                        this.f11905ik = new C2904ri(str2);
                    }
                    this.f11905ik.m11196ri(str, str3);
                } else {
                    C2904ri c2904ri = this.f11907lr.get(str2);
                    if (c2904ri == null) {
                        c2904ri = new C2904ri(str2);
                    }
                    c2904ri.m11196ri(str, str3);
                    this.f11907lr.put(str2, c2904ri);
                }
            }
        } catch (OutOfMemoryError e) {
            C2707ac.m10197ik(e.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m15172lr() {
        try {
            if (C3367ri.m15193ri().m15204ik()) {
                m15169ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3367ri.m15193ri().m15203fi()) {
                            if (C3366lr.this.f11905ik != null) {
                                C3366lr.this.f11905ik.m11195ri();
                            }
                        } else {
                            Iterator it = C3366lr.this.f11907lr.keySet().iterator();
                            while (it.hasNext()) {
                                C2904ri c2904ri = (C2904ri) C3366lr.this.f11907lr.get((String) it.next());
                                if (c2904ri != null) {
                                    c2904ri.m11195ri();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            C2707ac.m10197ik(e.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15173ri(final String str, final wjv wjvVar) {
        if (!TextUtils.isEmpty(str) && C3367ri.m15193ri().m15204ik() && wjv.m14332fi(wjvVar)) {
            if (!C3367ri.m15193ri().m15208nr() || wjvVar.m14404go() == 8 || wjvVar.m14404go() == 7 || wjvVar.m14404go() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    m15169ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strM14392fe = wjvVar.m14392fe();
                            String strM14424jf = wjvVar.m14424jf();
                            if (TextUtils.isEmpty(strM14392fe)) {
                                return;
                            }
                            C3366lr.this.m15171ri(str, strM14392fe, strM14424jf);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15174ri(final String str, final wjv wjvVar, final String str2) {
        if (TextUtils.isEmpty(str) || !C3367ri.m15193ri().m15204ik()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            m15169ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.5
                @Override // java.lang.Runnable
                public void run() {
                    wjv wjvVar2 = wjvVar;
                    if (wjvVar2 == null || TextUtils.isEmpty(wjvVar2.m14392fe())) {
                        return;
                    }
                    C3366lr.this.m15171ri(str, wjvVar.m14392fe(), wjvVar.m14424jf() + str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15175ri(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !C3367ri.m15193ri().m15204ik()) {
            return;
        }
        if ("show".equals(str) || "click".equals(str) || "dislike".equals(str)) {
            m15169ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    C3366lr.this.m15171ri(str, str2, str3);
                }
            });
            return;
        }
        if (C3367ri.m15193ri().m15208nr()) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                return;
            }
        }
        if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
            m15169ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.3
                @Override // java.lang.Runnable
                public void run() {
                    C3366lr.this.m15171ri(str, str2, str3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15176ri(JSONObject jSONObject) {
        if (C3367ri.m15193ri().m15204ik()) {
            try {
                jSONObject.put("feature_data", this.xha);
                m15160ka();
            } catch (JSONException e) {
                C2707ac.m10197ik(e.getMessage(), new Object[0]);
            }
        }
    }
}
