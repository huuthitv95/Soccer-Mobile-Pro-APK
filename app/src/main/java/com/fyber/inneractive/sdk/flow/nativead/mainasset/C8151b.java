package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.cache.C7902d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.nativead.C8142f;
import com.fyber.inneractive.sdk.flow.nativead.C8143g;
import com.fyber.inneractive.sdk.flow.nativead.C8162t;
import com.fyber.inneractive.sdk.flow.nativead.EnumC8138b;
import com.fyber.inneractive.sdk.flow.nativead.InterfaceC8161s;
import com.fyber.inneractive.sdk.network.C8425u0;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.nativead.C9097c;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.response.nativead.C9104j;
import com.fyber.inneractive.sdk.util.AbstractC9192u;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.mainasset.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8151b implements InterfaceC8153d, InterfaceC8161s {

    /* JADX INFO: renamed from: h */
    public static final String f18146h = IAlog.m21942a(C8151b.class);

    /* JADX INFO: renamed from: a */
    public C9100f f18147a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8152c f18148b;

    /* JADX INFO: renamed from: c */
    public C8425u0 f18149c;

    /* JADX INFO: renamed from: d */
    public EnumC8138b f18150d = EnumC8138b.UNINITIALIZED;

    /* JADX INFO: renamed from: e */
    public C9104j f18151e;

    /* JADX INFO: renamed from: f */
    public C8006r f18152f;

    /* JADX INFO: renamed from: g */
    public long f18153g;

    public C8151b(C9100f c9100f, C8142f c8142f, C9104j c9104j, C8006r c8006r) {
        this.f18147a = c9100f;
        this.f18148b = c8142f;
        this.f18151e = c9104j;
        this.f18152f = c8006r;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8161s
    /* JADX INFO: renamed from: a */
    public final void mo20566a(C8143g c8143g, Exception exc, C9100f c9100f) throws Throwable {
        String message;
        if (this.f18150d == EnumC8138b.LOADED) {
            return;
        }
        if (c8143g == null) {
            this.f18150d = EnumC8138b.FAILED;
            EnumC8125i enumC8125i = EnumC8125i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + enumC8125i.name();
            }
            IAlog.m21950f("%s : %s", f18146h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, enumC8125i);
            InterfaceC8152c interfaceC8152c = this.f18148b;
            if (interfaceC8152c != null) {
                ((C8142f) interfaceC8152c).m20565a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f18151e != null && this.f18152f != null) {
            EnumC8424u enumC8424u = EnumC8424u.EVENT_READY_ON_CLIENT;
            C9104j c9104j = this.f18151e;
            JSONArray jSONArrayM20435b = this.f18152f.m20435b();
            C8428w c8428w = new C8428w(c9104j);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = null;
            c8428w.f18756d = jSONArrayM20435b;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f18153g;
            IAlog.m21945a("%sMain image load took: " + jCurrentTimeMillis + " msec", IAlog.m21943a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f18147a.f21345d.f21339a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strM22020b = AbstractC9192u.m22020b(c8143g.f18127b);
            try {
                jSONObject.put("mime", strM22020b);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "mime", strM22020b);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
        }
        this.f18150d = EnumC8138b.LOADED;
        InterfaceC8152c interfaceC8152c2 = this.f18148b;
        if (interfaceC8152c2 != null) {
            C8142f c8142f = (C8142f) interfaceC8152c2;
            c8142f.f18117d.add(c8143g);
            c8142f.m20564a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: a */
    public final boolean mo20562a() {
        return this.f18150d == EnumC8138b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: b */
    public final void mo20563b() {
        C9097c c9097c;
        String str;
        C9100f c9100f = this.f18147a;
        if (c9100f != null && (c9097c = c9100f.f21345d) != null && (str = c9097c.f21339a) != null && !str.trim().isEmpty()) {
            this.f18153g = System.currentTimeMillis();
            this.f18150d = EnumC8138b.LOADING;
            C8162t c8162t = new C8162t(this.f18147a, this);
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            C8425u0 c8425u0 = new C8425u0(c8162t, iAConfigManager.f17689u.f17785a, new C7902d(this.f18147a.f21345d.f21339a));
            this.f18149c = c8425u0;
            iAConfigManager.f17686r.m20768a(c8425u0);
            return;
        }
        C8150a c8150a = new C8150a("Main media image is not loadable");
        this.f18150d = EnumC8138b.FAILED;
        EnumC8125i enumC8125i = EnumC8125i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = c8150a.getMessage();
        IAlog.m21950f("%s : %s", f18146h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, enumC8125i);
        InterfaceC8152c interfaceC8152c = this.f18148b;
        if (interfaceC8152c != null) {
            ((C8142f) interfaceC8152c).m20565a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    public final void destroy() {
        C8425u0 c8425u0 = this.f18149c;
        if (c8425u0 != null) {
            c8425u0.mo20790c();
            this.f18149c = null;
        }
        this.f18151e = null;
        this.f18152f = null;
        this.f18147a = null;
        this.f18148b = null;
        this.f18150d = EnumC8138b.DESTROYED;
    }
}
