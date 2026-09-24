package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8876t implements InterfaceC8873q {

    /* JADX INFO: renamed from: a */
    public final C8437b f20848a;

    /* JADX INFO: renamed from: b */
    public final InneractiveAdRequest f20849b;

    /* JADX INFO: renamed from: c */
    public final C9089g f20850c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8875s f20851d;

    /* JADX INFO: renamed from: e */
    public C8309r f20852e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8436a f20853f;

    /* JADX INFO: renamed from: g */
    public boolean f20854g = false;

    /* JADX INFO: renamed from: h */
    public final C8006r f20855h;

    public C8876t(C9089g c9089g, InneractiveAdRequest inneractiveAdRequest, C8219t0 c8219t0, InterfaceC8875s interfaceC8875s) {
        this.f20849b = inneractiveAdRequest;
        this.f20850c = c9089g;
        this.f20851d = interfaceC8875s;
        this.f20855h = c8219t0.f18375c;
        this.f20848a = new C8437b(c8219t0);
    }

    /* JADX INFO: renamed from: a */
    public final void m21421a() {
        InterfaceC8436a interfaceC8436a = this.f20853f;
        if (interfaceC8436a == null) {
            this.f20851d.mo20570a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        C8309r c8309r = this.f20852e;
        C8870n c8870n = (C8870n) interfaceC8436a;
        c8870n.f20783l = this;
        if (c8309r != null) {
            String str = c8309r.f18570g;
            c8870n.f20785n = c8309r;
            c8870n.f20782k++;
            c8870n.f20779h = false;
            c8870n.f20781j = false;
            IAlog.m21945a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            IAlog.m21945a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
            if (c8870n.f20780i) {
                return;
            }
            c8870n.f20772a.mo20839a(str, c8870n.f20784m);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21422a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        InneractiveErrorCode inneractiveErrorCode;
        EnumC8415t enumC8415t;
        C8293b c8293b;
        EnumC8415t enumC8415t2;
        if (jSONObject != null || inneractiveVideoError == null || this.f20853f == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            ((C8870n) this.f20853f).m21420b(inneractiveVideoError, jSONObject2);
        }
        EnumC8125i enumC8125i = EnumC8125i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i = AbstractC8874r.f20847a[playerError.ordinal()];
            if (i == 1) {
                enumC8415t2 = EnumC8415t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i == 2) {
                enumC8415t2 = EnumC8415t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i == 3) {
                enumC8415t2 = EnumC8415t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i == 4) {
                enumC8415t2 = EnumC8415t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i != 5) {
                IAlog.m21945a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                enumC8415t2 = EnumC8415t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                enumC8415t2 = EnumC8415t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest = this.f20849b;
            C9089g c9089g = this.f20850c;
            JSONArray jSONArrayM20435b = this.f20855h.m20435b();
            C8428w c8428w = new C8428w(c9089g);
            c8428w.f18754b = enumC8415t2;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            if (jSONObject2 != null) {
                try {
                    c8428w.f18758f.put(new JSONObject(jSONObject2.toString()));
                } catch (Exception unused) {
                }
            }
            c8428w.m20808a((String) null);
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            EnumC8415t enumC8415t3 = EnumC8415t.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f20849b;
            C9089g c9089g2 = this.f20850c;
            JSONArray jSONArrayM20435b2 = this.f20855h.m20435b();
            C8428w c8428w2 = new C8428w(c9089g2);
            c8428w2.f18754b = enumC8415t3;
            c8428w2.f18753a = inneractiveAdRequest2;
            c8428w2.f18756d = jSONArrayM20435b2;
            c8428w2.m20808a((String) null);
        }
        if (inneractiveVideoError != null) {
            IAlog.m21945a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            if (z) {
                inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
                enumC8125i = EnumC8125i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            IAlog.m21945a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                enumC8125i = EnumC8125i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                enumC8125i = EnumC8125i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z) {
            return;
        }
        this.f20852e = null;
        C9089g c9089g3 = this.f20850c;
        if (c9089g3 != null && (c8293b = c9089g3.f21329L) != null) {
            this.f20852e = (C8309r) c8293b.f18502d.poll();
        }
        if (this.f20852e != null) {
            if (this.f20854g) {
                return;
            }
            try {
                this.f20853f = this.f20848a.m20814a();
            } catch (Throwable th) {
                this.f20851d.mo20570a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.COULD_NOT_CREATE_FLOW_MANAGER, th));
            }
            m21421a();
            return;
        }
        InneractiveVideoError.Error playerError2 = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
        int i2 = AbstractC8874r.f20847a[playerError2.ordinal()];
        if (i2 == 1) {
            enumC8415t = EnumC8415t.VAST_ERROR_NO_MEDIA_FILES;
        } else if (i2 == 2) {
            enumC8415t = EnumC8415t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        } else if (i2 == 3) {
            enumC8415t = EnumC8415t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        } else if (i2 == 4) {
            enumC8415t = EnumC8415t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        } else if (i2 != 5) {
            IAlog.m21945a("IAReportError, Does not know player error " + playerError2.getErrorString(), new Object[0]);
            enumC8415t = EnumC8415t.VAST_UNKNOWN_PLAYER_ERROR;
        } else {
            enumC8415t = EnumC8415t.VAST_ERROR_BUFFER_TIMEOUT;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f20849b;
        C9089g c9089g4 = this.f20850c;
        JSONArray jSONArrayM20435b3 = this.f20855h.m20435b();
        C8428w c8428w3 = new C8428w(c9089g4);
        c8428w3.f18754b = enumC8415t;
        c8428w3.f18753a = inneractiveAdRequest3;
        c8428w3.f18756d = jSONArrayM20435b3;
        c8428w3.m20808a((String) null);
        InterfaceC8875s interfaceC8875s = this.f20851d;
        if (interfaceC8875s != null) {
            if (inneractiveVideoError != null) {
                interfaceC8875s.mo20570a(new InneractiveInfrastructureError(inneractiveErrorCode, enumC8125i, inneractiveVideoError.getCause()));
            } else {
                interfaceC8875s.mo20570a(new InneractiveInfrastructureError(inneractiveErrorCode, EnumC8125i.VIDEO_ERROR_NULL));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21423a(String str, String... strArr) {
        InterfaceC8436a interfaceC8436a = this.f20853f;
        if (interfaceC8436a != null) {
            C8870n c8870n = (C8870n) interfaceC8436a;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                c8870n.f20836r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.InvalidOrigin, EnumC8315x.m20711a(str2));
                }
            }
        }
    }
}
