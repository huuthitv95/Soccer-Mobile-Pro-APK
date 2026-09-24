package com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p063lr.InterfaceC2003ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ory;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3401aw;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3403di;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3404fi;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3406ka;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3407lr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3408mj;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3410ri;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.bgr;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3413ri {

    /* JADX INFO: renamed from: ri */
    private static final Map<InterfaceC2003ri, C3412vr> f12194ri = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: fi */
    public static void m15479fi(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || riVar == null || riVar.m15469qt() <= 0 || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15461ka = riVar.m15461ka();
        C3401aw c3401aw = new C3401aw();
        c3401aw.m15409ri(riVar.m15457ik());
        c3401aw.m15407lr(jM15461ka);
        c3401aw.m15408ri(riVar.m15469qt());
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3401aw);
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        m15498ri(c3410riM15490ri, "play_buffer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static long m15480ik(C1996ik c1996ik) {
        if (c1996ik == null) {
            return 0L;
        }
        C1997lr c1997lrM6301ay = c1996ik.bgr() ? c1996ik.m6301ay() : c1996ik.wjv();
        if (c1997lrM6301ay != null) {
            return Double.valueOf(c1997lrM6301ay.m6339di() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ik */
    public static void m15481ik(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || riVar == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        bgr bgrVar = new bgr(riVar.m15453aw());
        bgrVar.m15412ri(riVar.m15457ik());
        bgrVar.m15411lr(jM15461ka);
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(bgrVar);
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15500ri(c3410riM15490ri, "play_error", jSONObject);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public static String m15482ka(C1996ik c1996ik) {
        return new File(c1996ik.m6307fi(), c1996ik.m6302bu()).getAbsolutePath();
    }

    /* JADX INFO: renamed from: ka */
    public static void m15483ka(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || riVar == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        C3407lr c3407lr = new C3407lr();
        c3407lr.m15430ri(riVar.m15457ik());
        c3407lr.m15428lr(jM15461ka);
        c3407lr.m15429ri(riVar.m15456fi());
        c3407lr.m15427lr(riVar.m15455di());
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3407lr);
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15500ri(c3410riM15490ri, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
        f12194ri.remove(interfaceC2003ri);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15485lr(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || riVar == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        if (jM15461ka <= 0 || jM15464lr <= 0) {
            return;
        }
        C3404fi c3404fi = new C3404fi();
        c3404fi.m15422ri(riVar.m15457ik());
        c3404fi.m15421lr(jM15461ka);
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3404fi);
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15500ri(c3410riM15490ri, "feed_continue", jSONObject);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m15486lr(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar, xha xhaVar) {
        if (interfaceC2003ri == null || riVar == null) {
            return;
        }
        m15479fi(interfaceC2003ri, riVar);
        C3412vr c3412vr = f12194ri.get(interfaceC2003ri);
        if (c3412vr == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        C3403di c3403di = new C3403di(c1996ikM15450ka);
        c3403di.m15417lr(riVar.m15457ik());
        c3403di.m15419ri(jM15461ka);
        c3403di.m15418ri(riVar.jbs());
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3403di);
        JSONObject jSONObjectM15443ka = c3410riM15490ri.m15443ka();
        m15502ri(riVar, wjvVarM15448fi, jSONObjectM15443ka);
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            jSONObjectM15443ka.put("surface_texture_updated", riVar.m15476vr() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15501ri(c3410riM15490ri, "feed_over", jSONObject, xhaVar);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
        f12194ri.remove(interfaceC2003ri);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15487lr(C3410ri c3410ri) {
        C3521ka.m15949ri("load_video_cancel", c3410ri);
    }

    /* JADX INFO: renamed from: ri */
    public static C3410ri m15489ri(wjv wjvVar, String str, int i, C1996ik c1996ik) {
        return m15490ri(wjvVar, str, i, c1996ik, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x005a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x006a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0076 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX INFO: renamed from: ri */
    public static C3410ri m15490ri(wjv wjvVar, String str, int i, C1996ik c1996ik, C3412vr.ri riVar) {
        C1997lr c1997lrM14389eu;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = null;
        if (i > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i));
                if (wjvVar != null) {
                    c1997lrM14389eu = wjvVar.m14389eu();
                    if (c1997lrM14389eu != null) {
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, c1997lrM14389eu.jbs());
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(c1997lrM14389eu.m6342fi()));
                        jSONObject.put("video_url", c1997lrM14389eu.m6364sf());
                        jSONObject.put("player_type", c1996ik.m6323nr());
                        jSONObject.put("video_encode_type", c1996ik.bgr() ? 1 : 0);
                    }
                    jSONObject.put("play_time", c1996ik.f4616fi);
                    jSONObject2 = c1996ik.m6330ri() ? new JSONObject(c1996ik.m6310ik().toString()) : null;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
                    }
                    jSONObject.put("dp_creative_type", wjvVar.m14565yv());
                }
            } catch (JSONException e) {
                C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
            }
        } else if (wjvVar != null) {
            c1997lrM14389eu = wjvVar.m14389eu();
            if (c1997lrM14389eu != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, c1997lrM14389eu.jbs());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(c1997lrM14389eu.m6342fi()));
                jSONObject.put("video_url", c1997lrM14389eu.m6364sf());
                jSONObject.put("player_type", c1996ik.m6323nr());
                jSONObject.put("video_encode_type", c1996ik.bgr() ? 1 : 0);
            }
            jSONObject.put("play_time", c1996ik.f4616fi);
            if (c1996ik.m6330ri()) {
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
            }
            jSONObject.put("dp_creative_type", wjvVar.m14565yv());
        }
        return new C3410ri(wjvVar, C3571ig.m16476ri(wjvVar), jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15491ri(Context context, InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar, xha xhaVar) {
        C3412vr c3412vr;
        if (context == null || interfaceC2003ri == null || riVar == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        if (!riVar.m15475sf()) {
            m15495ri(wjvVarM15448fi, c1996ikM15450ka, riVar);
        }
        C3408mj c3408mj = new C3408mj(c1996ikM15450ka);
        c3408mj.m15432ri(riVar.m15454co() ? 1 : 0);
        c3408mj.m15431lr(CacheDirFactory.getICacheDir(wjvVarM15448fi.m14476qf()).mo6272lr(c1996ikM15450ka));
        c3408mj.m15433ri(SystemClock.elapsedRealtime() - c3412vr.m15452ri());
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3408mj);
        JSONObject jSONObjectM15443ka = c3410riM15490ri.m15443ka();
        try {
            jSONObjectM15443ka.put("is_received_video_not_playing_info", riVar.bgr() ? 1 : 0);
            jSONObjectM15443ka.put("new_media_source", C1979ri.m6211di());
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        m15499ri(c3410riM15490ri, "feed_play", xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15492ri(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || riVar == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        if (jM15461ka <= 0 || jM15464lr <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.xha xhaVar = new com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.xha();
        xhaVar.m15478ri(riVar.m15457ik());
        xhaVar.m15477lr(jM15461ka);
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(xhaVar);
        m15502ri(riVar, wjvVarM15448fi, c3410riM15490ri.m15443ka());
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15500ri(c3410riM15490ri, "feed_pause", jSONObject);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15493ri(InterfaceC2003ri interfaceC2003ri, C3412vr.ri riVar, xha xhaVar) {
        if (interfaceC2003ri == null || riVar == null) {
            return;
        }
        m15479fi(interfaceC2003ri, riVar);
        C3412vr c3412vr = f12194ri.get(interfaceC2003ri);
        if (c3412vr == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        long jM15464lr = riVar.m15464lr();
        long jM15461ka = riVar.m15461ka();
        C3406ka c3406ka = new C3406ka();
        c3406ka.m15424lr(riVar.m15457ik());
        c3406ka.m15426ri(jM15461ka);
        c3406ka.m15425ri(riVar.m15468mj());
        c3406ka.m15423lr(riVar.jbs());
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, riVar);
        c3410riM15490ri.m15446ri(c3406ka);
        m15502ri(riVar, wjvVarM15448fi, c3410riM15490ri.m15443ka());
        c3410riM15490ri.m15447ri(riVar.m15475sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jM15464lr);
            jSONObject.put("percent", riVar.xha());
            m15501ri(c3410riM15490ri, "feed_break", jSONObject, xhaVar);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15494ri(InterfaceC2003ri interfaceC2003ri, boolean z, String str) {
        C3412vr c3412vr;
        if (interfaceC2003ri == null || (c3412vr = f12194ri.get(interfaceC2003ri)) == null) {
            return;
        }
        C1996ik c1996ikM15450ka = c3412vr.m15450ka();
        wjv wjvVarM15448fi = c3412vr.m15448fi();
        if (c1996ikM15450ka == null || wjvVarM15448fi == null) {
            return;
        }
        C3410ri c3410riM15490ri = m15490ri(wjvVarM15448fi, c3412vr.m15451lr(), c3412vr.m15449ik(), c1996ikM15450ka, null);
        try {
            c3410riM15490ri.m15442ik().put("is_mute", z ? 1 : 0);
            c3410riM15490ri.m15443ka().put(TypedValues.TransitionType.S_FROM, str);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
        m15498ri(c3410riM15490ri, "mute_state_change");
    }

    /* JADX INFO: renamed from: ri */
    private static void m15495ri(final wjv wjvVar, final C1996ik c1996ik, final C3412vr.ri riVar) {
        C3521ka.m15942ri();
        C3521ka.m15952ri("pangle_video_play_state", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.ka.fi.ri.ri.2
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", C3413ri.m15480ik(c1996ik));
                jSONObject.put("player_duration", riVar.m15461ka());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", c1996ik.slm());
                jSONObject.put("path", C3413ri.m15482ka(c1996ik));
                jSONObject.put("player_type", c1996ik.m6323nr());
                C3531ka c3531kaM15985ri = C3531ka.m15967lr().m15985ri("pangle_video_play_state");
                wjv wjvVar2 = wjvVar;
                return c3531kaM15985ri.m15984ri(wjvVar2 != null ? wjvVar2.lji() : 0).m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX INFO: renamed from: ri */
    public static void m15496ri(wjv wjvVar, InterfaceC2003ri interfaceC2003ri, C1996ik c1996ik) {
        int i;
        int i2;
        if (wjvVar == null || interfaceC2003ri == null || c1996ik == null) {
            return;
        }
        String strM16658ri = C3593su.m16658ri();
        try {
            if (!c1996ik.m6309fr()) {
                if (CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6276ri(c1996ik)) {
                    i2 = 1;
                } else {
                    i = 2;
                }
                f12194ri.put(interfaceC2003ri, new C3412vr(SystemClock.elapsedRealtime(), strM16658ri, i2, c1996ik, wjvVar));
                C3410ri c3410riM15490ri = m15490ri(wjvVar, strM16658ri, i2, c1996ik, null);
                c3410riM15490ri.m15442ik().put("is_mute", c1996ik.m6331sf() ? 1 : 0);
                c3410riM15490ri.m15447ri(c1996ik.m6323nr() == -1);
                m15498ri(c3410riM15490ri, "play_start");
            }
            i = 3;
            c3410riM15490ri.m15442ik().put("is_mute", c1996ik.m6331sf() ? 1 : 0);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAD.VideoEventManager", "", e);
        }
        i2 = i;
        f12194ri.put(interfaceC2003ri, new C3412vr(SystemClock.elapsedRealtime(), strM16658ri, i2, c1996ik, wjvVar));
        C3410ri c3410riM15490ri2 = m15490ri(wjvVar, strM16658ri, i2, c1996ik, null);
        c3410riM15490ri2.m15447ri(c1996ik.m6323nr() == -1);
        m15498ri(c3410riM15490ri2, "play_start");
    }

    /* JADX INFO: renamed from: ri */
    public static void m15497ri(C3410ri c3410ri) {
        C3521ka.m15949ri("load_video_error", c3410ri);
    }

    /* JADX INFO: renamed from: ri */
    private static void m15498ri(C3410ri c3410ri, String str) {
        m15501ri(c3410ri, str, (JSONObject) null, (xha) null);
    }

    /* JADX INFO: renamed from: ri */
    private static void m15499ri(C3410ri c3410ri, String str, xha xhaVar) {
        m15501ri(c3410ri, str, (JSONObject) null, xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    private static void m15500ri(C3410ri c3410ri, String str, JSONObject jSONObject) {
        m15501ri(c3410ri, str, jSONObject, (xha) null);
    }

    /* JADX INFO: renamed from: ri */
    private static void m15501ri(final C3410ri c3410ri, String str, final JSONObject jSONObject, final xha xhaVar) {
        if (c3410ri == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c3410ri.m15440di() && !TextUtils.isEmpty(c3410ri.m15444lr())) {
            String strM15444lr = c3410ri.m15444lr();
            strM15444lr.hashCode();
            if (strM15444lr.equals("stream") || strM15444lr.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        C3414ik.m15532ri(System.currentTimeMillis(), c3410ri.m15445ri(), c3410ri.m15444lr(), str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.fi.ri.ri.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                xha xhaVar2;
                try {
                    JSONObject jSONObjectM15442ik = c3410ri.m15442ik();
                    if (c3410ri.m15441fi() != null) {
                        c3410ri.m15441fi().mo15410ri(jSONObjectM15442ik);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (xhaVar2 = xhaVar) != null) {
                        xhaVar2.m15722ri(jSONObjectM15442ik);
                    }
                    return jSONObjectM15442ik;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                c3410ri.xha();
                return c3410ri.m15443ka();
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static void m15502ri(C3412vr.ri riVar, wjv wjvVar, JSONObject jSONObject) {
        if (wjvVar != null) {
            try {
                ory oryVarCmy = wjvVar.cmy();
                if (oryVarCmy != null) {
                    jSONObject.put("speed_type", oryVarCmy.m14238lr());
                    jSONObject.put("speed", oryVarCmy.m14239ri());
                    jSONObject.put("speed_duration", riVar.m15470ri());
                }
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.VideoEventManager", "", th);
            }
        }
    }
}
