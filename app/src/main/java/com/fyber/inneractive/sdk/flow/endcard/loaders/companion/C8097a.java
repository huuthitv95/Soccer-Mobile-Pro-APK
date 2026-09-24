package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c;
import com.fyber.inneractive.sdk.flow.endcard.C8092j;
import com.fyber.inneractive.sdk.flow.endcard.C8110p;
import com.fyber.inneractive.sdk.flow.endcard.C8112r;
import com.fyber.inneractive.sdk.flow.endcard.C8114t;
import com.fyber.inneractive.sdk.flow.endcard.C8115u;
import com.fyber.inneractive.sdk.flow.endcard.C8116v;
import com.fyber.inneractive.sdk.flow.endcard.C8118x;
import com.fyber.inneractive.sdk.flow.endcard.loaders.C8096b;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.flow.vast.C8231h;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8294c;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8302k;
import com.fyber.inneractive.sdk.network.C8370e1;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.player.controller.C8459d;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9240i1;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.companion.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8097a implements InterfaceC8106a {

    /* JADX INFO: renamed from: a */
    public final C8092j f18013a;

    /* JADX INFO: renamed from: b */
    public final C8098b f18014b = new C8098b();

    /* JADX INFO: renamed from: c */
    public final C8101e f18015c = new C8101e();

    /* JADX INFO: renamed from: d */
    public final C8102f f18016d = new C8102f();

    /* JADX INFO: renamed from: e */
    public final C8237x0 f18017e;

    /* JADX INFO: renamed from: f */
    public Iterator f18018f;

    /* JADX INFO: renamed from: g */
    public AbstractC8085c f18019g;

    /* JADX INFO: renamed from: h */
    public final C8096b f18020h;

    public C8097a(C8092j c8092j, C8237x0 c8237x0, C8096b c8096b) {
        this.f18013a = c8092j;
        this.f18017e = c8237x0;
        this.f18020h = c8096b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a
    /* JADX INFO: renamed from: a */
    public final void mo20527a() {
        C8096b c8096b = this.f18020h;
        AbstractC8085c abstractC8085c = this.f18019g;
        c8096b.getClass();
        if (abstractC8085c != null) {
            IAlog.m21945a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", abstractC8085c.mo20513i());
            c8096b.f18012d.m20532a(abstractC8085c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a
    /* JADX INFO: renamed from: a */
    public final void mo20528a(String str) {
        this.f18020h.getClass();
        IAlog.m21945a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        m20529b();
    }

    /* JADX INFO: renamed from: b */
    public final void m20529b() {
        Iterator it = this.f18018f;
        if (it == null || !it.hasNext()) {
            return;
        }
        AbstractC8085c abstractC8085c = (AbstractC8085c) this.f18018f.next();
        this.f18019g = abstractC8085c;
        String str = null;
        if (abstractC8085c instanceof C8112r) {
            C8112r c8112r = (C8112r) abstractC8085c;
            this.f18014b.getClass();
            String str2 = c8112r.f17988g.f18520f;
            C8237x0 c8237x0 = c8112r.f17984c;
            EnumC8424u enumC8424u = EnumC8424u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
            C9089g c9089g = c8237x0.f18382d;
            JSONArray jSONArray = c8237x0.f18384f;
            C8428w c8428w = new C8428w(c9089g);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArray;
            c8428w.m20808a((String) null);
            C8115u c8115u = (C8115u) c8112r.m20510f();
            c8115u.f18054e = str2;
            c8115u.m20540a(this);
            return;
        }
        if (abstractC8085c instanceof C8116v) {
            C8101e c8101e = this.f18015c;
            C8116v c8116v = (C8116v) abstractC8085c;
            c8101e.getClass();
            EnumC8302k enumC8302k = c8116v.f18059h;
            int i = AbstractC8099c.f18021a[enumC8302k.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                IAlog.m21950f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", enumC8302k);
                return;
            }
            String str3 = c8116v.f17988g.f18520f;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            IAlog.m21947c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            C8237x0 c8237x1 = c8116v.f17984c;
            EnumC8424u enumC8424u2 = EnumC8424u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest2 = c8237x1.f18381c;
            C9089g c9089g2 = c8237x1.f18382d;
            JSONArray jSONArray2 = c8237x1.f18384f;
            C8428w c8428w2 = new C8428w(c9089g2);
            c8428w2.f18755c = enumC8424u2;
            c8428w2.f18753a = inneractiveAdRequest2;
            c8428w2.f18756d = jSONArray2;
            c8428w2.m20808a((String) null);
            IAConfigManager.f17654M.f17686r.m20768a(new C8370e1(new C8100d(c8101e, c8116v, this), c8116v.f17988g.f18520f, c8116v.f17984c.f18380b.f18375c));
            return;
        }
        if (abstractC8085c instanceof C8118x) {
            C8118x c8118x = (C8118x) abstractC8085c;
            this.f18016d.getClass();
            if (c8118x.f17988g.f18515a != EnumC8300i.Static) {
                C8237x0 c8237x2 = c8118x.f17984c;
                EnumC8424u enumC8424u3 = EnumC8424u.VAST_COMPANION_LOAD_ATTEMPT;
                InneractiveAdRequest inneractiveAdRequest3 = c8237x2.f18381c;
                C9089g c9089g3 = c8237x2.f18382d;
                JSONArray jSONArray3 = c8237x2.f18384f;
                C8428w c8428w3 = new C8428w(c9089g3);
                c8428w3.f18755c = enumC8424u3;
                c8428w3.f18753a = inneractiveAdRequest3;
                c8428w3.f18756d = jSONArray3;
                c8428w3.m20808a((String) null);
                String str4 = c8118x.f17988g.f18520f;
                String strM21999b = AbstractC9174o.m21999b("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(strM21999b)) {
                    strM21999b = strM21999b.replace("$__SrcIframeUrl__$", str4);
                }
                C8115u c8115u2 = (C8115u) c8118x.m20510f();
                c8115u2.f18054e = strM21999b;
                c8115u2.m20540a(this);
                return;
            }
            C8237x0 c8237x3 = c8118x.f17984c;
            EnumC8424u enumC8424u4 = EnumC8424u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest4 = c8237x3.f18381c;
            C9089g c9089g4 = c8237x3.f18382d;
            JSONArray jSONArray4 = c8237x3.f18384f;
            C8428w c8428w4 = new C8428w(c9089g4);
            c8428w4.f18755c = enumC8424u4;
            c8428w4.f18753a = inneractiveAdRequest4;
            c8428w4.f18756d = jSONArray4;
            c8428w4.m20808a((String) null);
            C8294c c8294c = c8118x.f17988g;
            String str5 = c8294c.f18520f;
            String str6 = c8294c.f18521g;
            if (TextUtils.isEmpty(str6)) {
                C8293b c8293b = c8118x.f17984c.f18382d.f21329L;
                if (c8293b != null) {
                    str = c8293b.f18500b;
                }
            } else {
                str = str6;
            }
            String strM21999b2 = AbstractC9174o.m21999b("fyb_static_endcard_tmpl.html");
            if (!TextUtils.isEmpty(strM21999b2)) {
                strM21999b2 = strM21999b2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    strM21999b2 = strM21999b2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            C8115u c8115u3 = (C8115u) c8118x.m20510f();
            c8115u3.f18054e = strM21999b2;
            if (TextUtils.isEmpty(strM21999b2)) {
                throw new C8231h("End-Card HTML not loaded", "No template");
            }
            C8459d c8459dM20541e = c8115u3.m20541e();
            c8459dM20541e.m20869a();
            AbstractC9240i1 abstractC9240i1 = c8459dM20541e.f18827a;
            if (abstractC9240i1 != null) {
                abstractC9240i1.f21619F = false;
            }
            c8459dM20541e.m20870a(strM21999b2, new C8114t(c8115u3, this), !(c8115u3 instanceof C8110p));
        }
    }
}
