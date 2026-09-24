package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.vast.C8226c;
import com.fyber.inneractive.sdk.flow.vast.C8231h;
import com.fyber.inneractive.sdk.model.vast.C8292a0;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8297f;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.C8312u;
import com.fyber.inneractive.sdk.model.vast.C8316y;
import com.fyber.inneractive.sdk.model.vast.C8317z;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.network.events.AbstractC8371a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9086d extends AbstractC9084b {

    /* JADX INFO: renamed from: e */
    public C9089g f21284e;

    /* JADX INFO: renamed from: f */
    public C8028r0 f21285f;

    /* JADX INFO: renamed from: g */
    public C8297f f21286g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f21287h;

    /* JADX INFO: renamed from: i */
    public int f21288i;

    /* JADX INFO: renamed from: j */
    public C8317z f21289j;

    /* JADX INFO: renamed from: k */
    public final boolean f21290k;

    public C9086d() {
        this.f21290k = true;
        this.f21287h = new ArrayList();
    }

    public C9086d(boolean z) {
        this();
        this.f21290k = z;
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final AbstractC9087e mo21885a() {
        C9089g c9089g = new C9089g();
        this.f21280a = c9089g;
        this.f21284e = c9089g;
        return c9089g;
    }

    /* JADX INFO: renamed from: a */
    public final void m21889a(C8297f c8297f, List list) {
        C8226c c8226c = new C8226c(this.f21290k);
        int iIntValue = this.f21285f.f17816f.f17869c.intValue();
        int iIntValue2 = this.f21285f.f17816f.f17868b.intValue();
        int iIntValue3 = this.f21285f.f17816f.f17873g.intValue();
        c8226c.f18336b = iIntValue;
        c8226c.f18337c = iIntValue2;
        c8226c.f18338d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f21285f.f17816f.f17876j)) {
            c8226c.f18339e = true;
        }
        if (this.f21285f.f17816f.f17877k.contains(2)) {
            c8226c.f18340f = true;
        }
        try {
            C8317z c8317z = this.f21289j;
            this.f21284e.f21329L = c8226c.m20628a(c8297f, list, c8317z != null ? c8317z.f18586b : "");
        } catch (C8231h e) {
            C9089g c9089g = this.f21284e;
            c9089g.getClass();
            c9089g.f21309i = e.getMessage();
        }
        C8293b c8293b = this.f21284e.f21329L;
        if (c8293b != null) {
            String str = c8293b.f18512n;
            if (!TextUtils.isEmpty(str) && AbstractC9154h0.m21970f(str)) {
                C8428w c8428w = new C8428w(EnumC8424u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f21280a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str);
                } catch (Exception unused) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "templateURL", str);
                }
                c8428w.f18758f.put(jSONObject);
                c8428w.m20808a((String) null);
            } else if (!TextUtils.isEmpty(str)) {
                this.f21284e.f21329L.f18512n = "";
                AbstractC8371a.m20741a(EnumC8415t.VAST_ERROR_DVC_FAILURE, EnumC8372b.SSL_ERROR, (InneractiveAdRequest) null, this.f21280a, "Unsecured URL", str, Boolean.FALSE);
            }
        }
        C9089g c9089g2 = this.f21284e;
        LinkedHashMap linkedHashMap = c8226c.f18341g;
        if (linkedHashMap != null) {
            c9089g2.f21330M.putAll(linkedHashMap);
        } else {
            c9089g2.getClass();
        }
        C9089g c9089g3 = this.f21284e;
        ArrayList arrayList = c8226c.f18342h;
        if (arrayList != null) {
            c9089g3.f21331N.addAll(arrayList);
        } else {
            c9089g3.getClass();
        }
        C9089g c9089g4 = this.f21284e;
        ArrayList arrayList2 = c8226c.f18345k;
        if (arrayList2 != null) {
            c9089g4.f21332O.addAll(arrayList2);
        } else {
            c9089g4.getClass();
        }
        if (IAlog.f21426a == 2) {
            LinkedHashMap linkedHashMap2 = c8226c.f18341g;
            if (linkedHashMap2.size() <= 0) {
                IAlog.m21949e("VParser: Unsupported media files: none", new Object[0]);
                return;
            }
            IAlog.m21949e(" VParser: Unsupported media files:", new Object[0]);
            for (C8309r c8309r : linkedHashMap2.keySet()) {
                IAlog.m21949e("VParser: %s", c8309r);
                IAlog.m21949e("VParser: reason = %s", linkedHashMap2.get(c8309r));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21890a(String str, int i) throws Exception {
        C8312u c8312uM20710a;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (!firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    IAlog.m21945a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
                c8312uM20710a = C8312u.m20710a(firstChild);
            } else {
                c8312uM20710a = null;
            }
            try {
                if (this.f21289j == null) {
                    this.f21289j = new C8317z(c8312uM20710a.f18571a);
                } else {
                    C8317z c8317z = new C8317z(c8312uM20710a.f18571a);
                    if (c8317z.compareTo(this.f21289j) >= 0) {
                        this.f21289j = c8317z;
                    }
                }
            } catch (C8316y unused) {
            }
            ArrayList arrayList = c8312uM20710a.f18572b;
            if (arrayList == null || arrayList.isEmpty()) {
                IAlog.m21945a("Vast response parser: no ads found in model. aborting", new Object[0]);
                throw new C8231h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
            }
            C8297f c8297f = (C8297f) arrayList.get(0);
            C8292a0 c8292a0 = c8297f.f18529b;
            if (c8292a0 == null) {
                if (c8297f.f18530c == null) {
                    throw new C8231h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
                }
                this.f21286g = c8297f;
                return;
            }
            IAlog.m21945a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f21287h.size()));
            int size = this.f21287h.size();
            int i2 = this.f21288i;
            if (size >= i2) {
                IAlog.m21945a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i2));
                throw new C8231h("VastErrorTooManyWrappers", "More than " + this.f21288i + " found");
            }
            this.f21287h.add(c8297f);
            String str2 = c8292a0.f18498i;
            if (TextUtils.isEmpty(str2)) {
                IAlog.m21945a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                throw new C8231h("VastErrorInvalidFile", "No ad tag URI for wrapper");
            }
            if (!AbstractC9154h0.m21970f(str2)) {
                IAlog.m21945a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                throw new C8231h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
            }
            String strM22011a = AbstractC9186s.m22011a(str2, 3000, 5000);
            if (TextUtils.isEmpty(strM22011a)) {
                throw new C8231h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
            }
            int i3 = this.f21288i - i;
            if (i3 <= 0) {
                throw new C8231h("VastErrorInvalidFile", "Invalid level for wrapper");
            }
            c8292a0.f18536f = i3;
            this.f21284e.f21333P.put(str2, strM22011a);
            m21890a(strM22011a, i + 1);
        } catch (Exception e) {
            IAlog.m21945a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new C8231h("VastErrorInvalidFile", e.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final void mo21887a(String str, C8028r0 c8028r0) {
        this.f21285f = c8028r0;
        if (c8028r0 == null || c8028r0.f17816f == null) {
            this.f21280a.f21309i = "ErrorConfigurationMismatch";
            return;
        }
        this.f21284e.f21328K = System.currentTimeMillis();
        C9089g c9089g = this.f21284e;
        c9089g.f21326z = this.f21285f.f17812b;
        this.f21288i = IAConfigManager.f17654M.f17677i.f17790b;
        c9089g.getClass();
        try {
            m21890a(str, 0);
            m21889a(this.f21286g, this.f21287h);
        } catch (C8231h e) {
            this.f21284e.f21309i = e.getMessage();
            this.f21284e.f21310j = e.getCause().getMessage();
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.f21284e.f21310j = e3.getMessage();
            C9089g c9089g2 = this.f21284e;
            c9089g2.f21309i = "VastErrorInvalidFile";
            c9089g2.f21323w = e3;
            if (IAlog.f21426a == 2) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: b */
    public final boolean mo21888b() {
        return true;
    }
}
