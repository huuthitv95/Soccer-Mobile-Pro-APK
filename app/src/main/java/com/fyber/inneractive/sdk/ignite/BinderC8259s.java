package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.AbstractC8234w;
import com.fyber.inneractive.sdk.flow.C8222v;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.s */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC8259s extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8258r f18426a;

    /* JADX INFO: renamed from: b */
    public final C8242c f18427b;

    public BinderC8259s(C8244e c8244e, C8242c c8242c) {
        this.f18426a = c8244e;
        this.f18427b = c8242c;
    }

    /* JADX INFO: renamed from: a */
    public static String m20655a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        String strOptString;
        IAlog.m21945a("InstallCallback onError %s", str);
        if (this.f18426a != null) {
            String strM20655a = m20655a(str);
            String strOptString2 = null;
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
                strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("message") : null;
            } catch (Exception unused) {
            }
            try {
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString2 = jSONObjectOptJSONObject2.optString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
                }
            } catch (Exception unused2) {
            }
            this.f18426a.mo20642a(strM20655a, strOptString, strOptString2);
        }
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.m21945a("InstallCallback onProgress %s", str);
        try {
            String strM20655a = m20655a(str);
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("progress")) == null) {
                return;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("action");
            double dOptDouble = jSONObjectOptJSONObject.optDouble("value");
            InterfaceC8258r interfaceC8258r = this.f18426a;
            if (interfaceC8258r != null) {
                interfaceC8258r.mo20640a(strM20655a, iOptInt, dOptDouble);
            }
        } catch (Exception unused) {
            IAlog.m21945a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        String strOptString;
        IAlog.m21945a("InstallCallback onScheduled %s", str);
        try {
            String strM20655a = m20655a(str);
            try {
                strOptString = new JSONObject(str).getJSONObject("application").optString("packageName");
            } catch (Exception unused) {
                strOptString = null;
            }
            InterfaceC8258r interfaceC8258r = this.f18426a;
            if (interfaceC8258r != null) {
                interfaceC8258r.mo20641a(strM20655a, strOptString);
            }
        } catch (Exception unused2) {
            IAlog.m21945a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.m21945a("InstallCallback onStart %s", str);
        if (this.f18426a != null) {
            this.f18426a.mo20639a(m20655a(str));
        }
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.m21945a("InstallCallback onSuccess %s", str);
        if (this.f18426a != null) {
            this.f18426a.mo20643b(m20655a(str));
            C8242c c8242c = this.f18427b;
            if (c8242c != null) {
                C8248h c8248h = c8242c.f18400b;
                String str2 = c8242c.f18399a.f18404a;
                c8248h.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    IAConfigManager.f17654M.f17686r.m20768a(new C8435z0(new C8246f(str2), str2));
                }
                C8247g c8247g = c8242c.f18399a;
                AbstractC8234w abstractC8234w = c8247g.f18405b;
                EnumC8253m enumC8253m = c8247g.f18406c;
                C8222v c8222v = abstractC8234w.f18354h;
                EnumC8424u enumC8424u = EnumC8424u.IGNITE_FLOW_INSTALL_DONE;
                if (enumC8253m == null) {
                    enumC8253m = EnumC8253m.SINGLE_TAP;
                }
                c8222v.m20627a(enumC8424u, enumC8253m);
            }
        }
    }
}
