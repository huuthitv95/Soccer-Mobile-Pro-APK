package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7987o;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.C8430x;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.controller.C8453a;
import com.fyber.inneractive.sdk.player.controller.C8463f;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8474o;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8475p;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.mediaplayer.C8868o;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C12538u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.f */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8846f implements InterfaceC8475p, InterfaceC8474o {

    /* JADX INFO: renamed from: a */
    public AbstractC8476q f20772a;

    /* JADX INFO: renamed from: b */
    public C8219t0 f20773b;

    /* JADX INFO: renamed from: c */
    public InneractiveAdRequest f20774c;

    /* JADX INFO: renamed from: d */
    public C8271e f20775d;

    /* JADX INFO: renamed from: e */
    public C8272f f20776e;

    /* JADX INFO: renamed from: l */
    public InterfaceC8873q f20783l;

    /* JADX INFO: renamed from: m */
    public int f20784m;

    /* JADX INFO: renamed from: n */
    public C8309r f20785n;

    /* JADX INFO: renamed from: f */
    public C8872p f20777f = null;

    /* JADX INFO: renamed from: g */
    public boolean f20778g = true;

    /* JADX INFO: renamed from: h */
    public boolean f20779h = false;

    /* JADX INFO: renamed from: i */
    public volatile boolean f20780i = false;

    /* JADX INFO: renamed from: j */
    public boolean f20781j = false;

    /* JADX INFO: renamed from: k */
    public int f20782k = 0;

    /* JADX INFO: renamed from: o */
    public final C8438c f20786o = new C8438c(this);

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public AbstractC8846f(Context context, C8006r c8006r) {
        boolean zBooleanValue;
        AbstractC8476q c8453a = null;
        if (c8006r != null) {
            try {
                Boolean boolMo20420c = ((C7994v) c8006r.m20432a(C7994v.class)).mo20420c("use_fmp_cache_mechanism");
                if (boolMo20420c != null) {
                    zBooleanValue = boolMo20420c.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c8453a = new C8463f(context, zBooleanValue, c8006r);
            } catch (Throwable th) {
                if (IAlog.f21426a <= 3) {
                    IAlog.m21945a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
            }
        } else {
            zBooleanValue = false;
            c8453a = new C8463f(context, zBooleanValue, c8006r);
        }
        c8453a = c8453a == null ? new C8453a(context) : c8453a;
        this.f20772a = c8453a;
        if (!c8453a.f18868b.contains(this)) {
            c8453a.f18868b.add(this);
        }
        AbstractC8476q abstractC8476q = this.f20772a;
        if (!abstractC8476q.f18869c.contains(this)) {
            abstractC8476q.f18869c.add(this);
        }
        this.f20772a.f18872f = this.f20786o;
    }

    /* JADX INFO: renamed from: a */
    public static int m21396a(AbstractC8846f abstractC8846f) {
        AbstractC9087e abstractC9087e;
        C8219t0 c8219t0 = abstractC8846f.f20773b;
        if (c8219t0 == null || (abstractC9087e = c8219t0.f18374b) == null) {
            return -1;
        }
        return ((C9089g) abstractC9087e).f21322v;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21397a(int i, int i2, InterfaceC8041s0 interfaceC8041s0) {
        UnitDisplayType unitDisplayType;
        if (interfaceC8041s0 != null && ((C8028r0) interfaceC8041s0).f17815e != null) {
            return false;
        }
        if (i2 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        C8043t0 c8043t0 = interfaceC8041s0 != null ? ((C8028r0) interfaceC8041s0).f17816f : null;
        return (c8043t0 == null || c8043t0.f17874h == Skip.DEFAULT || (unitDisplayType = c8043t0.f17876j) == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21398a(C8006r c8006r, EnumC8253m enumC8253m) {
        enumC8253m.getClass();
        if (enumC8253m != EnumC8253m.TRUE_SINGLE_TAP || !IAConfigManager.f17654M.f17660D.m20650n() || c8006r == null || c8006r.m20432a(C7987o.class) == null) {
            return false;
        }
        Boolean boolMo20420c = ((C7987o) c8006r.m20432a(C7987o.class)).mo20420c("enable_app_info_button");
        return boolMo20420c != null ? boolMo20420c.booleanValue() : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m21399a() {
        C8272f c8272f = this.f20776e;
        if (c8272f != null) {
            if (c8272f.f18442a != null) {
                IAlog.m21945a("%s destroy", "OMVideo");
                try {
                    c8272f.f18442a.finish();
                } catch (Throwable th) {
                    c8272f.m20675a(th);
                }
            }
            c8272f.f18443b = null;
            c8272f.f18442a = null;
            c8272f.f18444c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21400a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: a */
    public final void mo20902a(C8868o c8868o) {
        IAlog.m21945a("IMediaPlayerFlowManager: onPlayerError called with: %s", c8868o.getMessage());
        mo21400a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, c8868o), new JSONObject());
        if (this.f20779h) {
            IAlog.m21945a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            mo21400a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, c8868o), new JSONObject());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21401a(InterfaceC9091i interfaceC9091i, VideoClickOrigin videoClickOrigin, EnumC8315x... enumC8315xArr);

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: c */
    public final void mo20903c(boolean z) {
        try {
            C8219t0 c8219t0 = this.f20773b;
            C9089g c9089g = c8219t0 != null ? (C9089g) c8219t0.f18374b : null;
            EnumC8424u enumC8424u = EnumC8424u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f20774c;
            C8219t0 c8219t1 = this.f20773b;
            JSONArray jSONArrayM20435b = c8219t1 == null ? null : c8219t1.f18375c.m20435b();
            C8428w c8428w = new C8428w(c9089g);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            if (this.f20785n != null && c9089g != null) {
                c8428w.f18758f.put(new C8430x().m20809a(String.valueOf(z), "waudio").m20809a(this.f20785n.f18570g, "url").m20809a(this.f20785n.f18568e, "bitrate").m20809a(TextUtils.isEmpty(this.f20785n.f18567d) ? "na" : this.f20785n.f18567d, "mime").m20809a(this.f20785n.f18564a, C12538u.f32486g).m20809a(Integer.valueOf(this.f20782k), "media_file_index").m20809a(this.f20772a.mo20844d(), "player").f18760a);
            }
            c8428w.m20808a((String) null);
        } catch (Exception unused) {
        }
    }
}
