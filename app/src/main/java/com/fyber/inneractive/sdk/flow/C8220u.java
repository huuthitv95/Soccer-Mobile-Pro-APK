package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.cache.C7910l;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.measurement.C8273g;
import com.fyber.inneractive.sdk.measurement.C8274h;
import com.fyber.inneractive.sdk.measurement.EnumC8275i;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.events.AbstractC8371a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.AbstractC8874r;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.C8872p;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.InterfaceC8436a;
import com.fyber.inneractive.sdk.player.InterfaceC8875s;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8901g;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C8220u extends AbstractC8129k implements InterfaceC8875s {

    /* JADX INFO: renamed from: m */
    public C8876t f18323m;

    /* JADX INFO: renamed from: n */
    public String f18324n;

    /* JADX INFO: renamed from: o */
    public final C8218t f18325o = new C8218t(this);

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k, com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: a */
    public final void mo20549a() {
        InneractiveVideoError inneractiveVideoError;
        C8293b c8293b;
        if (this.f18323m != null) {
            AbstractC9087e abstractC9087e = this.f18090b;
            if (abstractC9087e == null || (c8293b = ((C9089g) abstractC9087e).f21329L) == null) {
                inneractiveVideoError = null;
            } else {
                inneractiveVideoError = c8293b.f18502d.size() == 0 ? new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null);
            }
            this.f18323m.m21422a(inneractiveVideoError, null, true);
        }
        IAlog.m21945a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.m21943a(this));
        AbstractC9183r.f21478b.removeCallbacks(this.f18100l);
        this.f18099k.m20496a();
        super.mo20549a();
    }

    /* JADX INFO: renamed from: a */
    public final void m20623a(C8006r c8006r, C9089g c9089g, InneractiveAdRequest inneractiveAdRequest, InterfaceC8875s interfaceC8875s) {
        C8293b c8293b;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration;
        String str;
        EnumC8415t enumC8415t;
        C8293b c8293b2;
        InneractiveAdRequest inneractiveAdRequest2 = this.f18089a;
        InterfaceC8041s0 selectedUnitConfig = inneractiveAdRequest2 == null ? this.f18094f : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig == null && c9089g != null) {
            selectedUnitConfig = AbstractC7945a.m20382a(c9089g.f21313m);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = null;
        C8293b c8293b3 = c9089g == null ? null : c9089g.f21329L;
        if (c8293b3 != null && c8293b3.f18502d.size() < c8293b3.f18507i) {
            c8293b3.f18502d.clear();
            c8293b3.f18505g.clear();
            c8293b3.f18502d.addAll(c8293b3.f18509k);
            c8293b3.f18505g.addAll(c8293b3.f18510l);
        }
        C8219t0 c8219t0 = new C8219t0(selectedUnitConfig, c8006r, c9089g, inneractiveAdRequest);
        this.f18091c = c8219t0;
        C8876t c8876t = new C8876t(c9089g, inneractiveAdRequest, c8219t0, interfaceC8875s);
        this.f18323m = c8876t;
        C8219t0 c8219t1 = (C8219t0) this.f18091c;
        c8219t1.f18321i = c8876t;
        c8219t1.f18378f = this.f18096h;
        this.f18324n = c8293b3 != null ? c8293b3.f18512n : null;
        c8876t.f20852e = null;
        if (c9089g != null && (c8293b2 = c9089g.f21329L) != null) {
            c8876t.f20852e = (C8309r) c8293b2.f18502d.poll();
        }
        if (c8876t.f20852e == null) {
            InneractiveVideoError.Error playerError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i = AbstractC8874r.f20847a[playerError.ordinal()];
            if (i == 1) {
                enumC8415t = EnumC8415t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i == 2) {
                enumC8415t = EnumC8415t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i == 3) {
                enumC8415t = EnumC8415t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i == 4) {
                enumC8415t = EnumC8415t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i != 5) {
                IAlog.m21945a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                enumC8415t = EnumC8415t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                enumC8415t = EnumC8415t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest3 = c8876t.f20849b;
            C9089g c9089g2 = c8876t.f20850c;
            JSONArray jSONArrayM20435b = c8876t.f20855h.m20435b();
            C8428w c8428w = new C8428w(c9089g2);
            c8428w.f18754b = enumC8415t;
            c8428w.f18753a = inneractiveAdRequest3;
            c8428w.f18756d = jSONArrayM20435b;
            c8428w.m20808a((String) null);
            interfaceC8875s.mo20570a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                c8876t.f20853f = c8876t.f20848a.m20814a();
            } catch (Throwable th) {
                c8876t.f20851d.mo20570a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_CREATE_FLOW_MANAGER, th));
            }
            InterfaceC8436a interfaceC8436a = c8876t.f20853f;
            if (interfaceC8436a != null) {
                C8870n c8870n = (C8870n) interfaceC8436a;
                C8271e c8271e = c8870n.f20775d;
                if (c8271e != null) {
                    C8272f c8272f = new C8272f();
                    ArrayList arrayList = c8870n.f20834p.f18503e;
                    C8219t0 c8219t2 = c8870n.f20773b;
                    try {
                        try {
                            CreativeType creativeType = CreativeType.VIDEO;
                            ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                            Owner owner = Owner.NATIVE;
                            adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                        } catch (Throwable th2) {
                            c8272f.m20675a(th2);
                            adSessionConfigurationCreateAdSessionConfiguration = null;
                        }
                        ArrayList arrayListM20674a = c8272f.m20674a(arrayList);
                        Partner partner = c8271e.f18437e;
                        if (partner != null && (str = c8271e.f18434b) != null) {
                            try {
                                adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, arrayListM20674a, "", "");
                            } catch (Throwable th3) {
                                c8272f.m20675a(th3);
                            }
                        }
                        AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
                        c8272f.f18442a = adSessionCreateAdSession;
                        c8272f.f18443b = AdEvents.createAdEvents(adSessionCreateAdSession);
                        c8272f.f18444c = MediaEvents.createMediaEvents(c8272f.f18442a);
                        c8272f.f18442a.start();
                        c8272f.f18447f = c8219t2;
                    } catch (Throwable th4) {
                        c8272f.m20675a(th4);
                    }
                    c8870n.f20776e = c8272f;
                    c8870n.f20777f = new C8872p(c8272f);
                }
                if (c8870n.f20776e == null && (c8293b = c8870n.f20834p) != null) {
                    for (C8274h c8274h : c8293b.f18503e) {
                        EnumC8275i enumC8275i = EnumC8275i.ERROR_DURING_RESOURCE_LOAD;
                        EnumC8315x enumC8315x = EnumC8315x.EVENT_VERIFICATION_NOT_EXECUTED;
                        C8870n.m21417a(new C8273g(c8274h.mo20518a(enumC8315x), enumC8275i), enumC8315x);
                    }
                }
            }
            c8876t.m21421a();
        }
        if (TextUtils.isEmpty(this.f18324n)) {
            return;
        }
        IAConfigManager.f17654M.f17686r.m20768a(new C8427v0(this.f18325o, AbstractC9174o.f21470a, new C7910l(this.f18324n)));
    }

    @Override // com.fyber.inneractive.sdk.player.InterfaceC8875s
    /* JADX INFO: renamed from: a */
    public final void mo20570a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(this.f18090b, this.f18089a, "send_failed_vast_creatives", this.f18095g.m20435b()), inneractiveInfrastructureError));
        m20552b(inneractiveInfrastructureError);
    }

    /* JADX INFO: renamed from: a */
    public final void m20624a(Exception exc, String str, boolean z) {
        HashMap map = new HashMap();
        map.put("description", str);
        if (exc != null) {
            map.put("exception", exc.getMessage());
        }
        if (m20625i() != null) {
            m20625i().f20953a.m21462a();
        }
        AbstractC8371a.m20742a(EnumC8415t.VAST_ERROR_DVC_FAILURE, EnumC8372b.TEMPLATE_ERROR.name(), this.f18324n, this.f18089a, this.f18090b, map, Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k, com.fyber.inneractive.sdk.interfaces.InterfaceC8262c
    public final void cancel() {
        IAlog.m21945a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.m21943a(this));
        AbstractC9183r.f21478b.removeCallbacks(this.f18100l);
        this.f18099k.m20496a();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: e */
    public final String mo20555e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8129k
    /* JADX INFO: renamed from: g */
    public final void mo20557g() {
        IAlog.m21945a(IAlog.m21943a(this) + "start called", new Object[0]);
        m20623a(this.f18095g, (C9089g) this.f18090b, this.f18089a, this);
    }

    /* JADX INFO: renamed from: i */
    public final C8901g m20625i() {
        InterfaceC8436a interfaceC8436a;
        C8876t c8876t = this.f18323m;
        if (c8876t == null || (interfaceC8436a = c8876t.f20853f) == null) {
            return null;
        }
        C8870n c8870n = (C8870n) interfaceC8436a;
        if (c8870n.f20839u != null) {
            return c8870n.f20839u;
        }
        return null;
    }
}
