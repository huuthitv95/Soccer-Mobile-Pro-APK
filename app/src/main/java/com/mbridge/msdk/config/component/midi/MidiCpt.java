package com.mbridge.msdk.config.component.midi;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzes$$ExternalSyntheticBackport0;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.InterfaceC12712d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.midi.model.C12824a;
import com.mbridge.msdk.config.component.midi.monitor.C12826b;
import com.mbridge.msdk.config.component.midi.monitor.C12827c;
import com.mbridge.msdk.config.component.midi.monitor.InterfaceC12825a;
import com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MidiCpt extends C12709a implements InterfaceC12852a, InterfaceC12712d {

    /* JADX INFO: renamed from: h */
    private C12824a f34267h;

    /* JADX INFO: renamed from: i */
    private CusPlayerView f34268i;

    /* JADX INFO: renamed from: j */
    private InterfaceC12886a f34269j;

    /* JADX INFO: renamed from: k */
    private InterfaceC12825a f34270k;

    /* JADX INFO: renamed from: l */
    private C12826b f34271l;

    /* JADX INFO: renamed from: m */
    private C12827c f34272m;

    /* JADX INFO: renamed from: q */
    private String f34276q;

    /* JADX INFO: renamed from: n */
    private int f34273n = 0;

    /* JADX INFO: renamed from: o */
    private int f34274o = 0;

    /* JADX INFO: renamed from: p */
    private int f34275p = 0;

    /* JADX INFO: renamed from: r */
    private boolean f34277r = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.MidiCpt$a */
    class C12822a implements InterfaceC12825a {
        C12822a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m35563c(String str) {
            MidiCpt.this.f34276q = str;
            MidiCpt.this.m35555j();
            MidiCpt.this.m35551g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.InterfaceC12825a
        /* JADX INFO: renamed from: a */
        public void mo35564a(String str) {
            MidiCpt.this.m35539a("904010", str);
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.InterfaceC12825a
        /* JADX INFO: renamed from: b */
        public void mo35565b(final String str) {
            C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.MidiCpt$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35563c(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m35532a(int i, int i2) {
        return (int) ((i / i2) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public Map<String, Object> m35554i() {
        HashMap map = new HashMap();
        CusPlayerView cusPlayerView = this.f34268i;
        if (cusPlayerView == null) {
            C13219q0.m37816b("MidiCpt", "mbPlayerView is null in createProgressEventData");
            return map;
        }
        int iCeil = this.f34274o;
        if (iCeil == 0) {
            iCeil = (int) Math.ceil(((double) cusPlayerView.getCurPosition()) / 1000.0d);
        }
        int duration = this.f34275p;
        if (duration == 0) {
            duration = this.f34268i.getDuration();
        }
        int iM35532a = this.f34273n;
        if (iM35532a == 0) {
            iM35532a = m35532a(iCeil, duration);
        }
        map.put(C12770c.m35209b("percent"), Integer.valueOf(iM35532a));
        map.put(C12770c.m35209b("progress"), Integer.valueOf(iCeil));
        map.put(C12770c.m35209b("122"), this.f34268i.isSilent() ? "1" : "0");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m35555j() {
        C12824a c12824a = this.f34267h;
        if (c12824a == null) {
            m35546c("PlayerModel is null");
            return;
        }
        if (this.f34268i == null) {
            this.f34268i = c12824a.m35579d();
        }
        if (this.f34268i == null) {
            m35546c("PlayerWidget is null");
            return;
        }
        String strM35573b = this.f34267h.m35573b();
        if (TextUtils.isEmpty(strM35573b)) {
            m35546c("Command is empty");
            return;
        }
        try {
            if (C12770c.m35209b("315").equals(strM35573b)) {
                this.f34277r = true;
                m35559n();
                return;
            }
            if (C12770c.m35209b("307").equals(strM35573b)) {
                this.f34277r = false;
                m35553h();
                return;
            }
            if (C12770c.m35209b("316").equals(strM35573b)) {
                C12827c c12827c = this.f34272m;
                if (c12827c != null) {
                    c12827c.m35599h();
                }
                this.f34277r = false;
                m35558m();
                return;
            }
            if (C12770c.m35209b("335").equals(strM35573b)) {
                this.f34277r = true;
                m35560p();
            } else {
                C13219q0.m37816b("MidiCpt", "Unknown command: " + strM35573b);
            }
        } catch (Exception e) {
            C13219q0.m37817b("MidiCpt", "Error executing player action: " + strM35573b, e);
            m35546c("Error executing player action: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m35556k() {
        C12824a c12824a;
        C12824a c12824a2;
        if (this.f34271l == null && (c12824a2 = this.f34267h) != null && c12824a2.m35577c() == 1) {
            this.f34271l = new C12826b();
        }
        if (this.f34272m != null || (c12824a = this.f34267h) == null) {
            return;
        }
        this.f34272m = new C12827c(c12824a.m35584g(), this.f34267h.m35586i());
    }

    /* JADX INFO: renamed from: l */
    private void m35557l() {
        if (this.f34270k == null) {
            this.f34270k = new C12822a();
        }
        if (this.f34269j == null) {
            this.f34269j = new C12823b();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m35558m() {
        CusPlayerView cusPlayerView = this.f34268i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        m35543b("904003", m35554i());
    }

    /* JADX INFO: renamed from: n */
    private void m35559n() {
        if (this.f34267h == null || this.f34268i == null) {
            m35546c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.f34276q)) {
            m35546c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.f34267h.m35581e())) {
            try {
                this.f34268i.setMixWithOtherAudio(Integer.valueOf(this.f34267h.m35581e()).intValue());
            } catch (NumberFormatException e) {
                C13219q0.m37817b("MidiCpt", "Invalid mixWithOtherAudio value: " + this.f34267h.m35581e(), e);
            }
        }
        if (this.f34268i.getCurPosition() > 1) {
            m35560p();
            return;
        }
        int iM35568a = this.f34267h.m35568a();
        if (iM35568a >= 0) {
            this.f34268i.initBufferIngParam(iM35568a);
        }
        CusPlayerView cusPlayerView = this.f34268i;
        String str = this.f34276q;
        cusPlayerView.initVFPData(str, str, this.f34269j);
        this.f34268i.playVideo();
        m35543b("904004", m35554i());
    }

    /* JADX INFO: renamed from: p */
    private void m35560p() {
        CusPlayerView cusPlayerView = this.f34268i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
            C12827c c12827c = this.f34272m;
            if (c12827c != null && c12827c.m35596e()) {
                this.f34272m.m35599h();
            }
        }
        m35543b("904004", m35554i());
    }

    /* JADX INFO: renamed from: o */
    public void m35562o() {
        try {
            CusPlayerView cusPlayerView = this.f34268i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.f34268i.release();
                this.f34268i = null;
            }
            C12827c c12827c = this.f34272m;
            if (c12827c != null) {
                c12827c.m35595b();
                this.f34272m = null;
            }
            if (this.f34271l != null) {
                this.f34271l = null;
            }
            if (this.f34267h != null) {
                this.f34267h = null;
            }
            this.f34269j = null;
            this.f34270k = null;
        } catch (Exception e) {
            C13219q0.m37817b("MidiCpt", "Error in release", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m35551g() {
        CusPlayerView cusPlayerView = this.f34268i;
        if (cusPlayerView == null || this.f34267h == null) {
            C13219q0.m37816b("MidiCpt", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : "0").equals(this.f34267h.m35583f())) {
            return;
        }
        if ("0".equals(this.f34267h.m35583f())) {
            this.f34268i.openSound();
        } else {
            this.f34268i.closeSound();
        }
        m35543b("904006", m35554i());
    }

    /* JADX INFO: renamed from: h */
    private void m35553h() {
        CusPlayerView cusPlayerView = this.f34268i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        m35543b("904009", m35554i());
        m35562o();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        try {
            C13219q0.m37816b("MidiCpt", "execute " + this);
            m35557l();
            C12827c c12827c = this.f34272m;
            if (c12827c == null) {
                m35546c("TimeOutPlayerMonitor is null");
            } else {
                c12827c.m35594a(this.f34270k);
                this.f34272m.m35598g();
            }
        } catch (Exception e) {
            C13219q0.m37817b("MidiCpt", "Error in execute", e);
            m35546c("Error in execute: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: c */
    protected void mo34835c(Map<String, Object> map) {
        C12824a c12824a = this.f34267h;
        if (c12824a == null) {
            C13219q0.m37816b("MidiCpt", "playerModel is null, cannot parse event config");
        } else {
            c12824a.m35576b(map);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.MidiCpt$b */
    class C12823b implements InterfaceC12886a {
        C12823b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        /* JADX INFO: renamed from: a */
        public void mo35566a(long j) {
            if (MidiCpt.this.f34272m != null) {
                MidiCpt.this.f34272m.m35597f();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.m35543b("904002", (Map<String, Object>) midiCpt.m35554i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        public void onBufferingEnd() {
            C13219q0.m37816b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        public void onBufferingStart() {
            C13219q0.m37816b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        public void onBufferingTimeOut(String str) {
            C13219q0.m37816b("BufferState", "缓冲超时");
            MidiCpt.this.m35539a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.m35543b("904007", (Map<String, Object>) midiCpt.m35554i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        public void onPlayError(String str) {
            MidiCpt.this.m35546c(str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.InterfaceC12886a
        /* JADX INFO: renamed from: a */
        public void mo35567a(long j, long j2) {
            MidiCpt.this.f34274o = zzes$$ExternalSyntheticBackport0.m22291m(j);
            MidiCpt.this.f34275p = zzes$$ExternalSyntheticBackport0.m22291m(j2);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.f34273n = midiCpt.m35532a(midiCpt.f34274o, MidiCpt.this.f34275p);
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("percent"), Integer.valueOf(MidiCpt.this.f34273n));
            map.put(C12770c.m35209b("progress"), Long.valueOf(j));
            map.put(C12770c.m35209b("122"), MidiCpt.this.f34268i.isSilent() ? "1" : "0");
            MidiCpt.this.m35543b("904005", map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "904001";
        this.f34267h = new C12824a(map);
        try {
            ViewGroup viewGroupM34837e = m34837e();
            if (viewGroupM34837e != null) {
                if (!TextUtils.isEmpty(this.f34267h.m35585h())) {
                    this.f34268i = (CusPlayerView) m34837e().findViewWithTag(this.f34267h.m35585h());
                } else {
                    this.f34268i = (CusPlayerView) C12902d.m36155a(viewGroupM34837e, CusPlayerView.class);
                }
            }
            CusPlayerView cusPlayerView = this.f34268i;
            if (cusPlayerView != null) {
                this.f34267h.m35570a(cusPlayerView);
            } else {
                C13219q0.m37816b("MidiCpt", "Failed to get CusPlayerView from root view");
            }
        } catch (Exception e) {
            C13219q0.m37817b("MidiCpt", "Error getting CusPlayerView", e);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: a */
    public void mo34828a() {
        super.mo34828a();
        m35556k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m35546c(String str) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("reason"), str);
        m35543b("904008", map);
        m35562o();
    }

    @Override // com.mbridge.msdk.config.component.base.InterfaceC12712d
    /* JADX INFO: renamed from: a */
    public boolean mo34848a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = map.get(C12770c.m35209b("16"));
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(C12770c.m35209b("116"));
                    if (obj2 instanceof String) {
                        String strValueOf = String.valueOf(obj2);
                        if (!TextUtils.isEmpty(strValueOf)) {
                            return strValueOf.equals(this.f34267h.m35586i());
                        }
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b("MidiCpt", th.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35539a(String str, String str2) {
        Map<String, Object> mapM35554i = m35554i();
        mapM35554i.put(C12770c.m35209b("reason"), str2);
        mapM35554i.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "4001");
        m35543b(str, mapM35554i);
        m35562o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m35543b(String str, Map<String, Object> map) {
        m34829a(m34827a(str, map));
        C12826b c12826b = this.f34271l;
        if (c12826b != null) {
            c12826b.m35587a(str, this.f33806d);
        }
    }

    @Override // com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a
    /* JADX INFO: renamed from: a */
    public void mo35561a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13219q0.m37816b("MidiCpt", "eventName is null");
            return;
        }
        str.hashCode();
        if (!str.equals("onStop")) {
            if (str.equals("onResume") && this.f34277r) {
                m35560p();
                return;
            }
            return;
        }
        m35558m();
    }
}
