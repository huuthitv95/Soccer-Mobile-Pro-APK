package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.EnumC8049w0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7976d;
import com.fyber.inneractive.sdk.config.global.features.C7987o;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8083a;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c;
import com.fyber.inneractive.sdk.flow.endcard.C8086d;
import com.fyber.inneractive.sdk.flow.endcard.C8090h;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.endcard.C8107m;
import com.fyber.inneractive.sdk.flow.endcard.C8109o;
import com.fyber.inneractive.sdk.flow.endcard.C8110p;
import com.fyber.inneractive.sdk.flow.endcard.C8115u;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8180b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8181c;
import com.fyber.inneractive.sdk.flow.storepromo.events.EnumC8188a;
import com.fyber.inneractive.sdk.flow.storepromo.observer.C8214b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import com.fyber.inneractive.sdk.flow.storepromo.p275ui.C8217c;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.measurement.tracker.EnumC8279d;
import com.fyber.inneractive.sdk.model.vast.C8291a;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8306o;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.mediaplayer.C8868o;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.C8879c;
import com.fyber.inneractive.sdk.player.p277ui.C8883g;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8485z implements InterfaceC8455b, InterfaceC8475p, InterfaceC8474o, InterfaceC8890n {

    /* JADX INFO: renamed from: a */
    public final AbstractC8846f f18897a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8041s0 f18898b;

    /* JADX INFO: renamed from: c */
    public final C8006r f18899c;

    /* JADX INFO: renamed from: d */
    public final AbstractC8902s f18900d;

    /* JADX INFO: renamed from: e */
    public C8483x f18901e;

    /* JADX INFO: renamed from: g */
    public InterfaceC8466g0 f18903g;

    /* JADX INFO: renamed from: j */
    public Runnable f18906j;

    /* JADX INFO: renamed from: k */
    public boolean f18907k;

    /* JADX INFO: renamed from: m */
    public C8480u f18909m;

    /* JADX INFO: renamed from: n */
    public final boolean f18910n;

    /* JADX INFO: renamed from: u */
    public C8883g f18917u;

    /* JADX INFO: renamed from: v */
    public final String f18918v;

    /* JADX INFO: renamed from: f */
    public int f18902f = 0;

    /* JADX INFO: renamed from: h */
    public boolean f18904h = false;

    /* JADX INFO: renamed from: i */
    public float f18905i = -0.1f;

    /* JADX INFO: renamed from: l */
    public boolean f18908l = false;

    /* JADX INFO: renamed from: o */
    public boolean f18911o = false;

    /* JADX INFO: renamed from: p */
    public boolean f18912p = false;

    /* JADX INFO: renamed from: q */
    public boolean f18913q = false;

    /* JADX INFO: renamed from: r */
    public boolean f18914r = false;

    /* JADX INFO: renamed from: s */
    public boolean f18915s = false;

    /* JADX INFO: renamed from: t */
    public EnumC8253m f18916t = EnumC8253m.NONE;

    /* JADX INFO: renamed from: w */
    public boolean f18919w = false;

    /* JADX INFO: renamed from: y */
    public boolean f18921y = false;

    /* JADX INFO: renamed from: x */
    public final Skip f18920x = null;

    public AbstractC8485z(AbstractC8846f abstractC8846f, AbstractC8902s abstractC8902s, InterfaceC8041s0 interfaceC8041s0, C8006r c8006r, boolean z, String str) {
        AbstractC8476q abstractC8476q;
        this.f18897a = abstractC8846f;
        this.f18898b = interfaceC8041s0;
        this.f18899c = c8006r;
        this.f18900d = abstractC8902s;
        this.f18910n = z;
        this.f18918v = str;
        abstractC8902s.setListener(this);
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
            return;
        }
        if (!abstractC8476q.f18868b.contains(this)) {
            abstractC8476q.f18868b.add(this);
        }
        AbstractC8476q abstractC8476q2 = abstractC8846f.f20772a;
        if (abstractC8476q2.f18869c.contains(this)) {
            return;
        }
        abstractC8476q2.f18869c.add(this);
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo20873A();

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: B */
    public boolean mo20856B() {
        boolean z;
        AbstractC8846f abstractC8846f;
        AbstractC8476q abstractC8476q;
        InterfaceC8041s0 interfaceC8041s0 = this.f18898b;
        if (interfaceC8041s0 != null) {
            C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
            if (c8028r0.f17816f == null || c8028r0.f17816f.f17876j != UnitDisplayType.REWARDED) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!InneractiveAdManager.isCurrentUserAChild() || !z || this.f18900d == null || (abstractC8846f = this.f18897a) == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
            return false;
        }
        int iMo20841b = abstractC8476q.mo20841b() / 1000;
        return (this.f18897a.f20772a.mo20843c() / 1000) - iMo20841b <= 0 || iMo20841b < m20945l();
    }

    /* JADX INFO: renamed from: C */
    public void mo20857C() {
        Boolean boolMo20420c;
        C8006r c8006r = this.f18899c;
        C7994v c7994v = c8006r != null ? (C7994v) c8006r.m20432a(C7994v.class) : null;
        boolean zBooleanValue = (c7994v == null || (boolMo20420c = c7994v.mo20420c("show_cta")) == null) ? true : boolMo20420c.booleanValue();
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null) {
            this.f18916t = interfaceC8466g0.mo20899o();
        }
        EnumC8253m enumC8253m = this.f18916t;
        this.f18900d.mo21437a(enumC8253m == EnumC8253m.NONE ? zBooleanValue : true, enumC8253m);
    }

    /* JADX INFO: renamed from: D */
    public final void m20930D() {
        AbstractC8084b abstractC8084bM20525a;
        InterfaceC8466g0 interfaceC8466g0;
        C8181c c8181c;
        boolean z;
        C8217c c8217c;
        C8217c c8217c2;
        View view;
        View view2;
        AbstractC8084b abstractC8084b;
        C8306o c8306o;
        this.f18900d.mo21448i();
        C8093k c8093kM20944j = m20944j();
        if (c8093kM20944j != null) {
            abstractC8084bM20525a = c8093kM20944j.m20525a();
            C8090h c8090h = c8093kM20944j.f18004e;
            C8107m c8107m = c8093kM20944j.f18001b;
            c8090h.getClass();
            if (c8107m.f18036a.size() >= 1) {
                AbstractC8084b abstractC8084bM20530a = c8107m.m20530a();
                EnumC8300i enumC8300i = EnumC8300i.FMP_End_Card;
                Iterator it = c8107m.f18036a.iterator();
                do {
                    if (!it.hasNext()) {
                        abstractC8084b = null;
                        break;
                    }
                    abstractC8084b = (AbstractC8084b) it.next();
                } while (abstractC8084b.mo20513i() != enumC8300i);
                if (abstractC8084bM20530a != null && abstractC8084bM20530a.mo20513i() != EnumC8300i.FMP_End_Card && abstractC8084bM20530a.mo20513i() != EnumC8300i.Default_End_Card && abstractC8084bM20530a.mo20516l() && (c8306o = abstractC8084bM20530a.f17984c.f18383e.f18504f) != null && c8306o.f18558d && abstractC8084b != null && abstractC8084b.mo20516l()) {
                    c8090h.m20523a(abstractC8084bM20530a, abstractC8084b.mo20516l());
                    c8090h.m20524a(abstractC8084b, true, abstractC8084bM20530a.mo20515k());
                } else if (abstractC8084bM20530a == abstractC8084b || abstractC8084bM20530a == null || abstractC8084bM20530a.mo20511g() == EnumC9150g.DEFAULT_ENDCARD) {
                    c8090h.m20524a(abstractC8084bM20530a, false, false);
                } else {
                    c8090h.m20523a(abstractC8084bM20530a, false);
                }
            }
        } else {
            abstractC8084bM20525a = null;
        }
        if (abstractC8084bM20525a == null) {
            if (mo20863e() || (interfaceC8466g0 = this.f18903g) == null) {
                return;
            }
            interfaceC8466g0.mo20897i();
            return;
        }
        mo20851a(abstractC8084bM20525a);
        if (mo20867n() != null) {
            C8178b c8178bMo20867n = mo20867n();
            AbstractC8902s abstractC8902s = this.f18900d;
            C8180b c8180b = c8178bMo20867n.f18214d;
            if (c8180b == null || (c8181c = c8180b.f18223c) == null || !(z = c8181c.f18234e)) {
                c8178bMo20867n.f18211a.m20615a();
                c8178bMo20867n.m20601a();
                c8178bMo20867n.m20604a((c8178bMo20867n.f18214d == null ? EnumC8188a.CONTROLLER_NOT_INITIALIZED : EnumC8188a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            c8180b.f18229i = c8093kM20944j;
            if (c8181c == null || !z || (c8217c = c8180b.f18224d) == null || c8180b.f18227g) {
                return;
            }
            if (c8217c.f18312b == null || (view2 = c8217c.f18311a) == null || view2.getParent() == null || c8217c.f18312b.getVisibility() != 0) {
                C8217c c8217c3 = c8180b.f18224d;
                if (c8217c3.f18312b == null || c8217c3.f18311a == null) {
                    IAlog.m21950f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                c8217c3.m20622a();
                AbstractC9195v.m22027a(c8217c3.f18312b);
                abstractC8902s.addView(c8217c3.f18312b);
                c8217c3.f18311a.setAnimation(c8217c3.f18313c);
                c8217c3.f18312b.setVisibility(0);
                C8178b c8178b = c8217c3.f18316f;
                if (c8178b != null) {
                    C8180b c8180b2 = c8178b.f18214d;
                    C8214b c8214b = new C8214b((c8180b2 == null || (c8217c2 = c8180b2.f18224d) == null || c8217c2.f18312b == null || (view = c8217c2.f18311a) == null || view.getParent() == null || c8217c2.f18312b.getVisibility() != 0) ? false : true, c8178b.f18219i);
                    Iterator it2 = c8178b.f18218h.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC8213a) it2.next()).mo20621a(c8214b);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(c8178b.f18217g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.m21950f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    EnumC8424u enumC8424u = EnumC8424u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = c8178b.f18213c;
                    AbstractC9087e abstractC9087e = c8178b.f18212b;
                    String str = c8178b.f18216f;
                    C8428w c8428w = new C8428w(enumC8424u, inneractiveAdRequest, abstractC9087e);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.m21950f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    c8428w.f18758f.put(jSONObject);
                    c8428w.m20808a((String) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo20874E() {
        boolean z;
        AbstractC8476q abstractC8476q;
        AbstractC8476q abstractC8476q2;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (((abstractC8476q2 = abstractC8846f.f20772a) != null && abstractC8476q2.f18871e == EnumC8489b.Completed) || this.f18913q)) {
            abstractC8846f.m21399a();
        }
        boolean zM20438a = IAConfigManager.f17654M.f17688t.f17862b.m20444a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).m20438a();
        AbstractC8902s abstractC8902s = this.f18900d;
        AbstractC8846f abstractC8846f2 = this.f18897a;
        abstractC8902s.mo21443e((abstractC8846f2 == null || (abstractC8476q = abstractC8846f2.f20772a) == null || abstractC8476q.f18871e != EnumC8489b.Completed) && !(((z = this.f18913q) && !zM20438a) || this.f18914r || (z && zM20438a)));
    }

    /* JADX INFO: renamed from: a */
    public final C8879c m20931a(C8879c c8879c) {
        String string;
        c8879c.f20872h = this.f18897a != null && AbstractC8846f.m21398a(this.f18899c, this.f18916t);
        C8006r c8006r = this.f18899c;
        C7987o c7987o = c8006r != null ? (C7987o) c8006r.m20432a(C7987o.class) : null;
        if (c7987o != null) {
            string = c7987o.mo20417a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f18900d.getContext().getString(C7809R.string.ia_video_app_info_text);
        }
        c8879c.f20873i = string;
        c8879c.f20871g = this.f18916t;
        return c8879c;
    }

    /* JADX INFO: renamed from: a */
    public void mo20875a() {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8474o
    /* JADX INFO: renamed from: a */
    public final void mo20900a(int i) {
        InterfaceC8041s0 interfaceC8041s0;
        C8043t0 c8043t0;
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || abstractC8846f.f20772a == null) {
            return;
        }
        float fM20946m = m20946m();
        AbstractC8846f abstractC8846f2 = this.f18897a;
        if (abstractC8846f2 != null && (abstractC8476q = abstractC8846f2.f20772a) != null && abstractC8476q.mo20872h()) {
            float f = this.f18905i;
            if (fM20946m != f) {
                if (fM20946m > 0.0f && f >= 0.0f && m20947p()) {
                    m20943i(true);
                } else if (fM20946m == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    m20942f(true);
                }
            }
            this.f18900d.setMuteButtonState(m20947p());
        }
        this.f18905i = fM20946m;
        int iMo20843c = this.f18897a.f20772a.mo20843c();
        int iMo20841b = this.f18897a.f20772a.mo20841b();
        int i2 = iMo20841b / 1000;
        int i3 = iMo20843c / 1000;
        int i4 = i3 - i2;
        if (i4 < 0 || (!this.f18897a.f20772a.mo20872h() && iMo20841b == iMo20843c)) {
            i4 = 0;
        }
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.onProgress(iMo20843c, iMo20841b);
        }
        if (this.f18900d.mo21451l()) {
            return;
        }
        this.f18900d.setRemainingTime(Integer.toString(i4));
        if (this.f18902f >= i3) {
            this.f18900d.mo21446g(false);
            m20937b(i4);
        } else if (mo20873A()) {
            int iMo20843c2 = this.f18897a.f20772a.mo20843c();
            AbstractC8846f abstractC8846f3 = this.f18897a;
            if (!AbstractC8846f.m21397a(iMo20843c2, AbstractC8846f.m21396a(abstractC8846f3), ((C8870n) abstractC8846f3).f20837s) || this.f18904h) {
                this.f18900d.mo21446g(false);
            } else {
                int i5 = this.f18902f;
                if (i2 < i5) {
                    m20937b(i5 - i2);
                } else {
                    this.f18902f = 0;
                    mo20865h();
                }
                this.f18900d.mo21446g(true);
            }
        } else {
            this.f18900d.mo21446g(false);
        }
        if (this.f18897a.f20772a.f18871e != EnumC8489b.Paused) {
            this.f18900d.mo21432a(iMo20843c, iMo20841b);
            int iM20945l = m20945l();
            if (i3 <= iM20945l || i2 <= iM20945l || (interfaceC8041s0 = this.f18898b) == null || (c8043t0 = ((C8028r0) interfaceC8041s0).f17816f) == null || c8043t0.f17876j != UnitDisplayType.REWARDED) {
                return;
            }
            mo20865h();
            this.f18900d.mo21446g(true);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m20932a(int i, C9152g1 c9152g1) {
        IAlog.m21945a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (m20947p()) {
                    m20943i(true);
                    AbstractC8846f abstractC8846f = this.f18897a;
                    if (abstractC8846f != null) {
                        C8870n c8870n = (C8870n) abstractC8846f;
                        c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.MUTE, EnumC8315x.EVENT_UNMUTE);
                    }
                } else {
                    m20942f(true);
                    AbstractC8846f abstractC8846f2 = this.f18897a;
                    if (abstractC8846f2 != null) {
                        C8870n c8870n2 = (C8870n) abstractC8846f2;
                        c8870n2.mo21401a(c8870n2.f20834p, VideoClickOrigin.MUTE, EnumC8315x.EVENT_MUTE);
                    }
                }
                this.f18900d.setMuteButtonState(m20947p());
                break;
            case 2:
                mo20882v();
                break;
            case 3:
                m20934a(EnumC8049w0.CTA_BUTTON.m20455a());
                m20936a(false, VideoClickOrigin.CTA, c9152g1);
                break;
            case 4:
                m20934a(EnumC8049w0.COMPANION.m20455a());
                AbstractC8846f abstractC8846f3 = this.f18897a;
                String str = null;
                if (abstractC8846f3 != null) {
                    C8870n c8870n3 = (C8870n) abstractC8846f3;
                    AbstractC8084b abstractC8084bM20530a = c8870n3.f20838t.f18001b.m20530a();
                    if (abstractC8084bM20530a instanceof AbstractC8085c) {
                        AbstractC8085c abstractC8085c = (AbstractC8085c) abstractC8084bM20530a;
                        String str2 = abstractC8085c.f17988g.f18521g;
                        if (TextUtils.isEmpty(str2)) {
                            C8293b c8293b = c8870n3.f20834p;
                            if (c8293b != null) {
                                str = c8293b.f18500b;
                            }
                        } else {
                            str = str2;
                        }
                        abstractC8846f3.mo21401a(abstractC8085c, VideoClickOrigin.COMPANION, EnumC8315x.EVENT_CLICK);
                    }
                }
                AbstractC8902s abstractC8902s = this.f18900d;
                if (abstractC8902s != null) {
                    abstractC8902s.mo21445g();
                }
                InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
                if (interfaceC8466g0 != null) {
                    interfaceC8466g0.mo20885a(str, c9152g1, false);
                }
                break;
            case 5:
                mo20881t();
                break;
            case 6:
                if (!mo20856B()) {
                    m20940d(true);
                } else {
                    mo20864g(true);
                }
                break;
            case 7:
                mo20862b(c9152g1);
                break;
            case 8:
                m20934a(EnumC8049w0.COMPANION.m20455a());
                m20936a(true, VideoClickOrigin.COMPANION, c9152g1);
                break;
            case 9:
                AbstractC8846f abstractC8846f4 = this.f18897a;
                if (abstractC8846f4 != null && !this.f18900d.f20883h) {
                    abstractC8846f4.f20778g = true;
                    mo20915h(false);
                    break;
                }
                break;
            case 10:
                m20934a(EnumC8049w0.APP_INFO.m20455a());
                m20936a(false, VideoClickOrigin.APP_INFO, c9152g1);
                break;
            case 11:
                m20934a(EnumC8049w0.STORE_PROMO.m20455a());
                m20936a(false, VideoClickOrigin.STORE_PROMO, c9152g1);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: a */
    public void mo20851a(AbstractC8084b abstractC8084b) {
        AbstractC9240i1 abstractC9240i1;
        IAlog.m21945a("IAVideoUIControllerBase: showEndCard: dismiss time: %d sec.", Integer.valueOf(abstractC8084b.f17987f));
        if (abstractC8084b instanceof AbstractC8085c) {
            AbstractC8085c abstractC8085c = (AbstractC8085c) abstractC8084b;
            C8878b c8878b = new C8878b(m20931a(abstractC8085c.mo20508d()));
            if (c8878b.f20856a) {
                InterfaceC9218b0 interfaceC9218b0Mo20866k = mo20866k();
                AbstractC8083a abstractC8083a = (AbstractC8083a) abstractC8085c.m20510f();
                if ((abstractC8083a instanceof C8115u) && (abstractC9240i1 = ((C8115u) abstractC8083a).m20541e().f18827a) != null) {
                    abstractC9240i1.setListener(interfaceC9218b0Mo20866k);
                }
                this.f18900d.mo21443e(false);
                this.f18900d.mo21433a(abstractC8085c, c8878b);
                ViewGroup viewGroup = this.f18900d.f20957m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC8084b instanceof C8109o) {
            C8109o c8109o = (C8109o) abstractC8084b;
            C8878b c8878b2 = new C8878b(m20931a(c8109o.mo20508d()));
            if (c8878b2.f20856a) {
                InterfaceC9218b0 interfaceC9218b0Mo20866k2 = mo20866k();
                AbstractC9240i1 abstractC9240i2 = ((C8110p) c8109o.m20510f()).m20541e().f18827a;
                if (abstractC9240i2 != null) {
                    abstractC9240i2.setListener(interfaceC9218b0Mo20866k2);
                }
                this.f18900d.mo21433a(c8109o, c8878b2);
                return;
            }
            return;
        }
        if (abstractC8084b instanceof C8086d) {
            C8086d c8086d = (C8086d) abstractC8084b;
            C8879c c8879cMo20508d = c8086d.mo20508d();
            String str = this.f18918v;
            if (str == null) {
                C8006r c8006r = this.f18899c;
                if (c8006r != null) {
                    C7976d c7976d = (C7976d) c8006r.m20432a(C7976d.class);
                    c7976d.m20415d(IAConfigManager.f17654M.f17683o);
                    C8291a c8291a = c7976d.f17756e;
                    if (c8291a == null || !c8291a.f18497d) {
                        str = null;
                    } else {
                        str = c8291a.f18494a;
                    }
                } else {
                    str = null;
                }
            }
            c8879cMo20508d.f20867c = str;
            C8878b c8878b3 = new C8878b(m20931a(c8879cMo20508d));
            if (c8878b3.f20856a) {
                this.f18900d.mo21443e(false);
                this.f18900d.mo21434a(c8086d, c8878b3);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: a */
    public final void mo20901a(EnumC8489b enumC8489b) {
        IAlog.m21945a("%sonPlayerStateChanged with %s", IAlog.m21943a(this), enumC8489b);
        m20933a(enumC8489b, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m20933a(EnumC8489b enumC8489b, boolean z) {
        InterfaceC8466g0 interfaceC8466g0;
        AbstractC8902s abstractC8902s;
        switch (AbstractC8484y.f18895a[enumC8489b.ordinal()]) {
            case 1:
                boolean z2 = this.f18919w;
                if (z2) {
                    IAlog.m21945a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", enumC8489b, String.valueOf(z2));
                    m20948q();
                }
                break;
            case 2:
                if (this.f18911o) {
                    mo20874E();
                    mo20918w();
                }
                break;
            case 3:
                if (this.f18911o) {
                    this.f18919w = true;
                    m20948q();
                }
                break;
            case 4:
                if (this.f18919w) {
                    this.f18919w = false;
                }
                if (this.f18911o) {
                    mo20883x();
                }
                break;
            case 5:
                mo20917u();
                break;
            case 6:
                if (this.f18911o || (!mo20863e() && !this.f18915s)) {
                    this.f18915s = true;
                    if (!this.f18900d.mo21459c()) {
                        this.f18900d.mo21435a(false);
                        Runnable runnable = this.f18906j;
                        if (runnable != null) {
                            this.f18900d.removeCallbacks(runnable);
                            this.f18906j = null;
                        }
                        mo20874E();
                        m20930D();
                        this.f18907k = false;
                        this.f18904h = true;
                    }
                    if (z && (interfaceC8466g0 = this.f18903g) != null) {
                        boolean z3 = this.f18913q;
                        AbstractC8846f abstractC8846f = this.f18897a;
                        interfaceC8466g0.mo20886a((abstractC8846f != null ? abstractC8846f.f20772a : null) != null ? (abstractC8846f != null ? abstractC8846f.f20772a : null).mo20841b() : -1, z3);
                        break;
                    }
                }
                break;
            case 7:
                if (this.f18911o || ((abstractC8902s = this.f18900d) != null && abstractC8902s.isShown())) {
                    mo20868s();
                }
                break;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: a */
    public final void mo20902a(C8868o c8868o) {
    }

    /* JADX INFO: renamed from: a */
    public final void m20934a(String str) {
        C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
        InterfaceC8041s0 interfaceC8041s0 = this.f18898b;
        if (interfaceC8041s0 != null) {
            C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
            if (c8028r0.f17816f != null) {
                c8051x0.m20458a(c8028r0.f17816f.f17876j, "LAST_VAST_CLICKED_TYPE", str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo20876a(boolean z) {
        AbstractC8846f abstractC8846f;
        AbstractC8476q abstractC8476q;
        C8483x c8483x;
        AbstractC8902s abstractC8902s;
        int iMo20841b;
        Application application;
        if (this.f18911o == z || (abstractC8846f = this.f18897a) == null || abstractC8846f.f20772a == null) {
            return;
        }
        IAlog.m21945a("%sonVisibilityChanged: %s my video view is%s", IAlog.m21943a(this), Boolean.valueOf(z), this.f18900d);
        if (!z) {
            this.f18911o = false;
            AbstractC8846f abstractC8846f2 = this.f18897a;
            if (abstractC8846f2 != null && (abstractC8476q = abstractC8846f2.f20772a) != null && (c8483x = abstractC8476q.f18870d) != null && c8483x.equals(this.f18901e)) {
                IAlog.m21945a("%sonVisibilityChanged pausing video", IAlog.m21943a(this));
                mo20919z();
                if (this.f18897a.f20772a.f18871e == EnumC8489b.Completed || ((abstractC8902s = this.f18900d) != null && abstractC8902s.mo21459c())) {
                    this.f18900d.mo21449j();
                }
            }
            AbstractC8902s abstractC8902s2 = this.f18900d;
            if (abstractC8902s2 == null || !abstractC8902s2.f20883h) {
                mo20914g();
                return;
            }
            return;
        }
        this.f18911o = true;
        EnumC8489b enumC8489b = this.f18897a.f20772a.f18871e;
        if (enumC8489b != EnumC8489b.Completed && !this.f18900d.mo21459c()) {
            if (enumC8489b != EnumC8489b.Error) {
                if (enumC8489b != EnumC8489b.Idle) {
                    if (enumC8489b == EnumC8489b.Start_in_progress || enumC8489b == EnumC8489b.Playing) {
                        mo20883x();
                    }
                    AbstractC8846f abstractC8846f3 = this.f18897a;
                    if (!abstractC8846f3.f20781j) {
                        C8870n c8870n = (C8870n) abstractC8846f3;
                        c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.InvalidOrigin, EnumC8315x.EVENT_CREATIVE_VIEW);
                        abstractC8846f3.f20781j = true;
                    }
                    mo20877f();
                    if (this.f18909m != null || (application = AbstractC9174o.f21470a) == null) {
                        return;
                    }
                    C8480u c8480u = new C8480u(this);
                    this.f18909m = c8480u;
                    application.registerActivityLifecycleCallbacks(c8480u);
                    return;
                }
                this.f18897a.getClass();
            }
            mo20868s();
            return;
        }
        if (!this.f18915s) {
            this.f18915s = true;
            if (!this.f18921y) {
                if (!this.f18900d.mo21459c()) {
                    this.f18900d.mo21435a(false);
                    Runnable runnable = this.f18906j;
                    if (runnable != null) {
                        this.f18900d.removeCallbacks(runnable);
                        this.f18906j = null;
                    }
                    mo20874E();
                    m20930D();
                    this.f18907k = false;
                    this.f18904h = true;
                }
                InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
                if (interfaceC8466g0 != null) {
                    boolean z2 = this.f18913q;
                    AbstractC8846f abstractC8846f4 = this.f18897a;
                    if ((abstractC8846f4 != null ? abstractC8846f4.f20772a : null) != null) {
                        iMo20841b = (abstractC8846f4 != null ? abstractC8846f4.f20772a : null).mo20841b();
                    } else {
                        iMo20841b = -1;
                    }
                    interfaceC8466g0.mo20886a(iMo20841b, z2);
                }
            }
        }
        AbstractC8902s abstractC8902s3 = this.f18900d;
        if (abstractC8902s3 != null) {
            abstractC8902s3.mo21450k();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20935a(InterfaceC8213a interfaceC8213a) {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            C8870n c8870n = (C8870n) abstractC8846f;
            if (c8870n.f20840v != null) {
                C8178b c8178b = c8870n.f20840v;
                c8178b.getClass();
                synchronized (C8178b.f18210k) {
                    c8178b.f18218h.add(interfaceC8213a);
                }
                return true;
            }
        }
        IAlog.m21950f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20936a(boolean z, VideoClickOrigin videoClickOrigin, C9152g1 c9152g1) {
        EnumC9150g enumC9150g;
        AbstractC8902s abstractC8902s = this.f18900d;
        if (abstractC8902s != null) {
            abstractC8902s.mo21445g();
        }
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        boolean z2 = false;
        if (interfaceC8466g0 != null) {
            if (z) {
                AbstractC8846f abstractC8846f = this.f18897a;
                if (abstractC8846f != null) {
                    C8293b c8293b = ((C8870n) abstractC8846f).f20834p;
                    interfaceC8466g0.mo20885a(c8293b != null ? c8293b.f18500b : null, c9152g1, true);
                    C8870n c8870n = (C8870n) this.f18897a;
                    c8870n.mo21401a(c8870n.f20834p, videoClickOrigin, EnumC8315x.EVENT_CLICK);
                }
            } else {
                int i = AbstractC8484y.f18896b[videoClickOrigin.ordinal()];
                if (i == 1) {
                    enumC9150g = EnumC9150g.STORE_PROMO_CTA;
                } else if (i != 2) {
                    enumC9150g = i != 3 ? EnumC9150g.VIDEO_CTA : EnumC9150g.VIDEO_APP_INFO;
                } else {
                    enumC9150g = EnumC9150g.VIDEO_CLICK;
                }
                C9142d0 c9142d0Mo20884a = this.f18903g.mo20884a(c9152g1, enumC9150g);
                AbstractC8846f abstractC8846f2 = this.f18897a;
                if (abstractC8846f2 != null) {
                    C8870n c8870n2 = (C8870n) abstractC8846f2;
                    c8870n2.mo21401a(c8870n2.f20834p, videoClickOrigin, EnumC8315x.EVENT_CLICK);
                    C8272f c8272f = this.f18897a.f20776e;
                    if (c8272f != null && c8272f.f18444c != null) {
                        IAlog.m21945a("%s click", "OMVideo");
                        try {
                            c8272f.f18444c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th) {
                            c8272f.m20675a(th);
                        }
                    }
                }
                if (c9142d0Mo20884a.f21443a != EnumC9151g0.FAILED) {
                    z2 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            m20934a(EnumC8049w0.VIDEO.m20455a());
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m20937b(int i) {
        if (this.f18900d != null) {
            C8006r c8006r = this.f18899c;
            String str = null;
            C7976d c7976d = c8006r != null ? (C7976d) c8006r.m20432a(C7976d.class) : null;
            if (c7976d != null) {
                c7976d.m20415d(IAConfigManager.f17654M.f17683o);
                C8291a c8291a = c7976d.f17756e;
                if (c8291a != null && c8291a.f18497d) {
                    str = c8291a.f18496c;
                }
            }
            if (!TextUtils.isEmpty(this.f18918v) || str == null) {
                this.f18900d.setSkipText(String.valueOf(i));
            } else {
                this.f18900d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20938b(InterfaceC8213a interfaceC8213a) {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            C8870n c8870n = (C8870n) abstractC8846f;
            if (c8870n.f20840v != null) {
                C8178b c8178b = c8870n.f20840v;
                c8178b.getClass();
                synchronized (C8178b.f18210k) {
                    c8178b.f18218h.remove(interfaceC8213a);
                }
                return;
            }
        }
        IAlog.m21950f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo20862b(C9152g1 c9152g1);

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: b */
    public void mo20852b(boolean z) {
        IAlog.m21945a("%sinitUI", IAlog.m21943a(this));
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || abstractC8846f.f20772a == null) {
            return;
        }
        this.f18900d.setUnitConfig(this.f18898b);
        this.f18900d.mo21436a(this.f18910n, this.f18897a.f20772a.mo20847f(), this.f18897a.f20772a.mo20846e());
        if (mo20873A()) {
            this.f18902f = mo20879o();
        } else {
            this.f18900d.mo21446g(false);
        }
        if (!z) {
            mo20900a(this.f18897a.f20772a.mo20841b());
            m20933a(this.f18897a.f20772a.f18871e, false);
        }
        this.f18900d.setMuteButtonState(m20947p());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: b */
    public boolean mo20853b() {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null) {
            return false;
        }
        if (this.f18904h || abstractC8846f.f20772a == null) {
            return true;
        }
        AbstractC8902s abstractC8902s = this.f18900d;
        if (abstractC8902s != null && abstractC8902s.mo21439a()) {
            return true;
        }
        int iMo20843c = this.f18897a.f20772a.mo20843c();
        AbstractC8846f abstractC8846f2 = this.f18897a;
        return AbstractC8846f.m21397a(iMo20843c, AbstractC8846f.m21396a(abstractC8846f2), ((C8870n) abstractC8846f2).f20837s) && !this.f18904h && this.f18902f == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n
    /* JADX INFO: renamed from: c */
    public void mo20939c() {
        IAlog.m21945a("%sonVideoViewDetachedFromWindow", IAlog.m21943a(this));
        mo20914g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: c */
    public final void mo20903c(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: d */
    public final void mo20904d() {
        if (this.f18911o && !this.f18908l) {
            this.f18908l = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX INFO: renamed from: d */
    public final void m20940d(boolean z) {
        AbstractC8846f abstractC8846f;
        AbstractC8476q abstractC8476q;
        AbstractC8476q abstractC8476q2;
        C8043t0 c8043t0;
        int iMo20841b;
        C8272f c8272f;
        AbstractC8476q abstractC8476q3;
        InterfaceC8041s0 interfaceC8041s0;
        C8043t0 c8043t1;
        this.f18913q = true;
        C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
        if (z && c8051x0 != null && (interfaceC8041s0 = this.f18898b) != null && (c8043t1 = ((C8028r0) interfaceC8041s0).f17816f) != null) {
            c8051x0.m20458a(c8043t1.f17876j, "LAST_VAST_SKIPED", "1");
        }
        AbstractC8846f abstractC8846f2 = this.f18897a;
        if (abstractC8846f2 != null && (abstractC8476q3 = abstractC8846f2.f20772a) != null) {
            abstractC8476q3.m20909k();
            this.f18897a.f20772a.mo20849i();
        }
        AbstractC8846f abstractC8846f3 = this.f18897a;
        if (abstractC8846f3 != null && z && (c8272f = abstractC8846f3.f20776e) != null && c8272f.f18444c != null) {
            IAlog.m21945a("%s skipped", "OMVideo");
            try {
                c8272f.f18444c.skipped();
            } catch (Throwable th) {
                c8272f.m20675a(th);
            }
        }
        if (!this.f18900d.mo21459c()) {
            this.f18900d.mo21435a(false);
            Runnable runnable = this.f18906j;
            if (runnable != null) {
                this.f18900d.removeCallbacks(runnable);
                this.f18906j = null;
            }
            this.f18907k = false;
            this.f18904h = true;
            InterfaceC8041s0 interfaceC8041s1 = this.f18898b;
            if (interfaceC8041s1 != null && (c8043t0 = ((C8028r0) interfaceC8041s1).f17816f) != null && c8043t0.f17876j == UnitDisplayType.REWARDED && this.f18903g != null) {
                AbstractC8846f abstractC8846f4 = this.f18897a;
                AbstractC8476q abstractC8476q4 = abstractC8846f4 != null ? abstractC8846f4.f20772a : null;
                if ((abstractC8846f4 != null ? abstractC8846f4.f20772a : null) != null) {
                    iMo20841b = (abstractC8846f4 != null ? abstractC8846f4.f20772a : null).mo20841b();
                } else {
                    iMo20841b = -1;
                }
                boolean z2 = this.f18913q;
                if (!z2 || this.f18897a == null || abstractC8476q4 == null) {
                    this.f18903g.mo20886a(iMo20841b, z2);
                } else {
                    int iMo20841b2 = abstractC8476q4.mo20841b();
                    int iMo20843c = abstractC8476q4.mo20843c() - iMo20841b2;
                    int iM20945l = m20945l() * 1000;
                    if (iMo20843c <= 0 || iMo20841b2 >= iM20945l) {
                        this.f18903g.mo20886a(iMo20841b, this.f18913q);
                    } else {
                        this.f18921y = true;
                    }
                }
            }
        }
        if (z) {
            boolean zM20438a = IAConfigManager.f17654M.f17688t.f17862b.m20444a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).m20438a();
            AbstractC8846f abstractC8846f5 = this.f18897a;
            if ((abstractC8846f5 != null && (abstractC8476q2 = abstractC8846f5.f20772a) != null && abstractC8476q2.f18871e == EnumC8489b.Completed) || ((this.f18913q && !zM20438a) || this.f18914r)) {
                m20930D();
            }
        } else {
            m20930D();
        }
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null && (this.f18902f <= 0 || this.f18904h || ((abstractC8846f = this.f18897a) != null && (abstractC8476q = abstractC8846f.f20772a) != null && abstractC8476q.f18871e == EnumC8489b.Completed))) {
            interfaceC8466g0.mo20890a(z);
        }
        mo20914g();
    }

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    public void destroy() {
        AbstractC8476q abstractC8476q;
        Application application;
        C8480u c8480u = this.f18909m;
        if (c8480u != null && (application = AbstractC9174o.f21470a) != null) {
            application.unregisterActivityLifecycleCallbacks(c8480u);
        }
        IAlog.m21945a("%sdestroy called", IAlog.m21943a(this));
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null) {
            abstractC8476q.f18868b.remove(this);
            this.f18897a.f20772a.f18869c.remove(this);
        }
        mo20914g();
        Runnable runnable = this.f18906j;
        if (runnable != null) {
            this.f18900d.removeCallbacks(runnable);
            this.f18906j = null;
        }
        this.f18903g = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m20941e(boolean z) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
            return;
        }
        EnumC8489b enumC8489b = abstractC8476q.f18871e;
        if (z && enumC8489b != EnumC8489b.Completed && !this.f18900d.mo21459c()) {
            mo20915h(false);
            return;
        }
        if (!z && enumC8489b == EnumC8489b.Paused && this.f18900d.mo21459c()) {
            int iMo20841b = abstractC8476q.mo20841b();
            int iMo20843c = abstractC8476q.mo20843c();
            if (iMo20841b <= 0 || iMo20841b > iMo20843c) {
                return;
            }
            abstractC8476q.mo20837a(iMo20841b - 1, false);
            abstractC8476q.mo20837a(iMo20841b, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo20863e() {
        String str;
        C8093k c8093kM20944j = m20944j();
        if (c8093kM20944j != null) {
            C9089g c9089g = c8093kM20944j.f18000a.f18382d;
            if (!((c9089g == null || (str = c9089g.f21292B) == null || !TextUtils.equals(str, "1")) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo20877f() {
        AbstractC8476q abstractC8476q;
        AbstractC8476q abstractC8476q2;
        C8272f c8272f;
        if (this.f18917u == null) {
            C8883g c8883g = new C8883g(this.f18900d);
            this.f18917u = c8883g;
            c8883g.setId(C7809R.id.ia_inn_texture_view);
            AbstractC8846f abstractC8846f = this.f18897a;
            if (abstractC8846f != null && (c8272f = abstractC8846f.f20776e) != null) {
                AbstractC8902s abstractC8902s = this.f18900d;
                View[] trackingFriendlyView = abstractC8902s.getTrackingFriendlyView();
                AdSession adSession = c8272f.f18442a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(abstractC8902s);
                    } catch (Throwable th) {
                        c8272f.m20675a(th);
                    }
                }
                if (c8272f.f18442a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                c8272f.f18442a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th2) {
                                c8272f.m20675a(th2);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f18900d.getTrackingFriendlyViewObstructionPurposeOther();
                if (c8272f.f18442a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                c8272f.f18442a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th3) {
                                c8272f.m20675a(th3);
                            }
                        }
                    }
                }
                if (this.f18900d.getWatermarkView() != null) {
                    View watermarkView = this.f18900d.getWatermarkView();
                    AdSession adSession2 = c8272f.f18442a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(watermarkView, FriendlyObstructionPurpose.NOT_VISIBLE, EnumC8279d.Watermark.name());
                    }
                }
            }
        }
        IAlog.m21945a("%sconnectToTextureView called %s", IAlog.m21943a(this), this.f18900d.getTextureHost());
        if (this.f18917u != null && this.f18900d.getTextureHost().equals(this.f18917u.getParent())) {
            IAlog.m21945a("%sconnectToTextureView called but already connected", IAlog.m21943a(this));
            return;
        }
        AbstractC8846f abstractC8846f2 = this.f18897a;
        if (abstractC8846f2 != null && (abstractC8476q2 = abstractC8846f2.f20772a) != null) {
            abstractC8476q2.m20906a(this.f18917u);
        }
        C8883g c8883g2 = this.f18917u;
        if (c8883g2 != null && c8883g2.getParent() == null) {
            IAlog.m21945a("%supdateView adding texture to parent", IAlog.m21943a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f18900d.getTextureHost().addView(this.f18917u, layoutParams);
        }
        this.f18908l = false;
        C8483x c8483x = new C8483x(this);
        this.f18901e = c8483x;
        AbstractC8846f abstractC8846f3 = this.f18897a;
        if (abstractC8846f3 == null || (abstractC8476q = abstractC8846f3.f20772a) == null) {
            return;
        }
        abstractC8476q.f18870d = c8483x;
    }

    /* JADX INFO: renamed from: f */
    public final void m20942f(boolean z) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null) {
            abstractC8476q.mo20842b(z);
        }
        this.f18900d.setMuteButtonState(true);
    }

    /* JADX INFO: renamed from: g */
    public void mo20914g() {
        if (this.f18917u != null) {
            IAlog.m21945a("%sdestroyTextureView", IAlog.m21943a(this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: g */
    public void mo20864g(boolean z) {
        C7975c c7975c;
        Context context = this.f18900d.getContext();
        C8006r c8006r = this.f18899c;
        if (c8006r != null) {
            C7975c c7975c2 = (C7975c) c8006r.m20432a(C7975c.class);
            c7975c2.getClass();
            if (new ArrayList(c7975c2.f17758c.values()).size() > 0) {
                c7975c = (C7975c) this.f18899c.m20432a(C7975c.class);
            } else {
                c7975c = null;
            }
        } else {
            c7975c = null;
        }
        new C8464f0(context, c7975c, new C8481v(this, z)).f18852b.show();
    }

    /* JADX INFO: renamed from: h */
    public void mo20865h() {
        if (mo20873A()) {
            C8006r c8006r = this.f18899c;
            String str = null;
            C7976d c7976d = c8006r != null ? (C7976d) c8006r.m20432a(C7976d.class) : null;
            if (c7976d != null) {
                c7976d.m20415d(IAConfigManager.f17654M.f17683o);
                C8291a c8291a = c7976d.f17756e;
                if (c8291a != null && c8291a.f18497d) {
                    str = c8291a.f18495b;
                }
            }
            if (!TextUtils.isEmpty(this.f18918v) || str == null) {
                AbstractC8902s abstractC8902s = this.f18900d;
                abstractC8902s.setSkipText(abstractC8902s.getContext().getString(C7809R.string.ia_video_skip_text));
            } else {
                this.f18900d.setSkipText(str);
            }
            this.f18900d.mo21447h();
            this.f18902f = 0;
            InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
            if (interfaceC8466g0 != null) {
                interfaceC8466g0.mo20892c();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo20915h(boolean z) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            if (!abstractC8846f.f20778g) {
                mo20874E();
                return;
            }
            if (z && (abstractC8476q = abstractC8846f.f20772a) != null) {
                abstractC8476q.mo20837a(0, true);
                return;
            }
            AbstractC8476q abstractC8476q2 = abstractC8846f.f20772a;
            if (abstractC8476q2 != null) {
                EnumC8489b enumC8489b = abstractC8476q2.f18871e;
                if (enumC8489b == EnumC8489b.Completed || enumC8489b == EnumC8489b.Prepared) {
                    abstractC8476q2.mo20837a(1, true);
                } else {
                    abstractC8476q2.mo20850j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo20878i();

    /* JADX INFO: renamed from: i */
    public final void m20943i(boolean z) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null) {
            abstractC8476q.mo20845d(z);
        }
        this.f18900d.setMuteButtonState(false);
    }

    /* JADX INFO: renamed from: j */
    public final C8093k m20944j() {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            return ((C8870n) abstractC8846f).f20838t;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC9218b0 mo20866k() {
        return new C8482w(this);
    }

    /* JADX INFO: renamed from: l */
    public final int m20945l() {
        int i;
        try {
            i = Integer.parseInt(IAConfigManager.f17654M.f17688t.f17862b.m20445a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i = 30;
        }
        if (i < 1) {
            return 30;
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final float m20946m() {
        try {
            return ((AudioManager) this.f18900d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: n */
    public C8178b mo20867n() {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            return ((C8870n) abstractC8846f).f20840v;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo20879o();

    /* JADX INFO: renamed from: p */
    public final boolean m20947p() {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        return (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null || (!abstractC8476q.mo20848g() && ((double) m20946m()) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final void m20948q() {
        this.f18900d.mo21435a(true);
        this.f18900d.mo21443e(false);
        Runnable runnable = this.f18906j;
        if (runnable == null) {
            if (runnable == null) {
                this.f18906j = new RunnableC8479t(this);
            }
            int iMo20878i = mo20878i();
            IAlog.m21945a("%s Starting buffering timeout with %d", IAlog.m21943a(this), Integer.valueOf(iMo20878i));
            this.f18900d.postDelayed(this.f18906j, iMo20878i);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo20880r();

    /* JADX INFO: renamed from: s */
    public void mo20868s() {
        if (mo20856B()) {
            mo20864g(false);
        } else {
            m20940d(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo20881t();

    /* JADX INFO: renamed from: u */
    public void mo20917u() {
        Runnable runnable = this.f18906j;
        if (runnable != null) {
            this.f18900d.removeCallbacks(runnable);
            this.f18906j = null;
        }
        this.f18900d.mo21435a(false);
        mo20874E();
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo20882v();

    /* JADX INFO: renamed from: w */
    public void mo20918w() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX INFO: renamed from: x */
    public void mo20883x() {
        AbstractC8476q abstractC8476q;
        this.f18900d.mo21435a(false);
        this.f18900d.mo21443e(false);
        Runnable runnable = this.f18906j;
        if (runnable != null) {
            this.f18900d.removeCallbacks(runnable);
            this.f18906j = null;
        }
        if (this.f18897a != null && mo20873A() && !this.f18904h) {
            int iMo20843c = this.f18897a.f20772a.mo20843c();
            AbstractC8846f abstractC8846f = this.f18897a;
            if (AbstractC8846f.m21397a(iMo20843c, AbstractC8846f.m21396a(abstractC8846f), ((C8870n) abstractC8846f).f20837s)) {
                if (this.f18902f <= 0) {
                    this.f18900d.mo21446g(true);
                    mo20865h();
                } else {
                    AbstractC8846f abstractC8846f2 = this.f18897a;
                    if (abstractC8846f2 == null || (abstractC8476q = abstractC8846f2.f20772a) == null) {
                        if (!this.f18912p) {
                            this.f18900d.mo21446g(true);
                            m20937b(this.f18902f);
                            this.f18912p = true;
                        }
                    } else if (this.f18902f >= abstractC8476q.mo20843c() / 1000) {
                        this.f18900d.mo21446g(false);
                    } else if (!this.f18912p) {
                        this.f18900d.mo21446g(true);
                        m20937b(this.f18902f);
                        this.f18912p = true;
                    }
                }
            }
        }
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null && !this.f18907k) {
            this.f18907k = true;
            interfaceC8466g0.mo20898j();
        }
        this.f18913q = false;
    }

    /* JADX INFO: renamed from: y */
    public final void m20949y() {
        C8883g c8883g;
        AbstractC8902s abstractC8902s = this.f18900d;
        if (abstractC8902s != null) {
            abstractC8902s.mo21454o();
        }
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && abstractC8846f.f20772a != null && (c8883g = this.f18917u) != null) {
            c8883g.invalidate();
            this.f18917u.requestLayout();
        }
        AbstractC8902s abstractC8902s2 = this.f18900d;
        if (abstractC8902s2 != null) {
            abstractC8902s2.invalidate();
            this.f18900d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo20919z() {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
            return;
        }
        if (abstractC8476q.f18871e == EnumC8489b.Paused) {
            IAlog.m21945a("%spauseVideo called in bad state! %s", IAlog.m21943a(this), abstractC8476q.f18871e);
            return;
        }
        IAlog.m21945a("%spauseVideo %s", IAlog.m21943a(this), this.f18900d);
        TextureView textureView = abstractC8476q.f18876j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f18900d.getTextureHost()) {
            return;
        }
        abstractC8476q.mo20849i();
    }
}
