package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.C8116v;
import com.fyber.inneractive.sdk.flow.endcard.C8117w;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.model.vast.EnumC8302k;
import com.fyber.inneractive.sdk.network.C8367d1;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8100d implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final C8117w f18022a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8106a f18023b;

    /* JADX INFO: renamed from: c */
    public final C8116v f18024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8101e f18025d;

    public C8100d(C8101e c8101e, C8116v c8116v, InterfaceC8106a interfaceC8106a) {
        this.f18025d = c8101e;
        this.f18024c = c8116v;
        this.f18022a = (C8117w) c8116v.m20510f();
        this.f18023b = interfaceC8106a;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        Bitmap bitmap;
        C8367d1 c8367d1 = (C8367d1) obj;
        boolean zEqualsIgnoreCase = false;
        if (exc == null && c8367d1 != null && c8367d1.f18635b == null && (bitmap = c8367d1.f18634a) != null) {
            C8117w c8117w = this.f18022a;
            Bitmap bitmap2 = c8117w.f18060c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            c8117w.f18060c = bitmap;
            c8117w.f18061d.setImageBitmap(bitmap);
            C8101e c8101e = this.f18025d;
            C8116v c8116v = this.f18024c;
            c8101e.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectM20700a = c8116v.f17988g.m20700a();
            try {
                jSONObject.put("companion_data", jSONObjectM20700a);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectM20700a);
            }
            C8237x0 c8237x0 = c8116v.f17984c;
            EnumC8424u enumC8424u = EnumC8424u.VAST_COMPANION_LOADED;
            InneractiveAdRequest inneractiveAdRequest = c8237x0.f18381c;
            C9089g c9089g = c8237x0.f18382d;
            JSONArray jSONArray = c8237x0.f18384f;
            C8428w c8428w = new C8428w(c9089g);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArray;
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
            this.f18023b.mo20527a();
            return;
        }
        String str = c8367d1 != null ? c8367d1.f18635b : null;
        C8101e c8101e2 = this.f18025d;
        C8116v c8116v2 = this.f18024c;
        c8101e2.getClass();
        IAlog.m21945a("%s sending VAST_COMPANION_FAILED_LOADING event", "StaticCompanionEndCardLoader");
        JSONObject jSONObject2 = new JSONObject();
        String strM22025a = TextUtils.isEmpty(str) ? AbstractC9195v.m22025a(exc) : str;
        if (!TextUtils.isEmpty(strM22025a)) {
            try {
                jSONObject2.put("reason", strM22025a);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "reason", strM22025a);
            }
        }
        JSONObject jSONObjectM20700a2 = c8116v2.f17988g.m20700a();
        try {
            jSONObject2.put("companion_data", jSONObjectM20700a2);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectM20700a2);
        }
        C8237x0 c8237x1 = c8116v2.f17984c;
        EnumC8415t enumC8415t = EnumC8415t.VAST_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest2 = c8237x1.f18381c;
        C9089g c9089g2 = c8237x1.f18382d;
        JSONArray jSONArray2 = c8237x1.f18384f;
        C8428w c8428w2 = new C8428w(c9089g2);
        c8428w2.f18754b = enumC8415t;
        c8428w2.f18753a = inneractiveAdRequest2;
        c8428w2.f18756d = jSONArray2;
        c8428w2.f18758f.put(jSONObject2);
        c8428w2.m20808a((String) null);
        this.f18023b.mo20528a(str);
        C8116v c8116v3 = this.f18024c;
        String str2 = c8116v3.f17988g.f18520f;
        EnumC8302k enumC8302k = c8116v3.f18059h;
        if (!TextUtils.isEmpty(str2)) {
            String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
            if (enumC8302k.extension.equalsIgnoreCase(strSubstring)) {
                zEqualsIgnoreCase = true;
            } else {
                EnumC8302k enumC8302k2 = EnumC8302k.Jpeg;
                if (enumC8302k == enumC8302k2) {
                    zEqualsIgnoreCase = EnumC8302k.Jpg.extension.equalsIgnoreCase(strSubstring);
                } else if (enumC8302k == EnumC8302k.Jpg) {
                    zEqualsIgnoreCase = enumC8302k2.extension.equalsIgnoreCase(strSubstring);
                }
            }
        }
        if (zEqualsIgnoreCase) {
            return;
        }
        C8237x0 c8237x2 = this.f18024c.f17984c;
        EnumC8415t enumC8415t2 = EnumC8415t.VAST_COMPANION_INCOMPATIBLE_MIMETYPE;
        InneractiveAdRequest inneractiveAdRequest3 = c8237x2.f18381c;
        C9089g c9089g3 = c8237x2.f18382d;
        JSONArray jSONArray3 = c8237x2.f18384f;
        C8428w c8428w3 = new C8428w(c9089g3);
        c8428w3.f18754b = enumC8415t2;
        c8428w3.f18753a = inneractiveAdRequest3;
        c8428w3.f18756d = jSONArray3;
        c8428w3.m20808a((String) null);
    }
}
