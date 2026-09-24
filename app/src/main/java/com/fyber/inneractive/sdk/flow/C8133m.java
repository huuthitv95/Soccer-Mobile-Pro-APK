package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C8026q0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C8412s;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8133m extends AbstractC8167o {

    /* JADX INFO: renamed from: g */
    public C8131l f18106g;

    public C8133m(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m20559a(boolean z, AbstractC9087e abstractC9087e, InneractiveAdRequest inneractiveAdRequest) {
        String str;
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        String str2 = (String) iAConfigManager.f17691w.f17891d.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (str2.contains("-" + spotId + "-")) {
            return;
        }
        C8428w c8428w = new C8428w(EnumC8415t.MISSMATCH_SPOTID, inneractiveAdRequest, abstractC9087e);
        if (z) {
            str = "There is no " + spotId + " spot ID in current app config";
        } else {
            str = "spot ID " + spotId + " is not active in current app config";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", str);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "reason", str);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
        iAConfigManager.f17691w.f17891d.put("KEY_MISSMATCH_STATS_SPOTS", str2 + " -" + spotId + "-");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: a */
    public final void mo20549a() {
        IAlog.m21945a("%s onTimeout()", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8261b
    /* JADX INFO: renamed from: b */
    public final void mo20551b() {
        IAlog.m21945a("%s onRetry()", IAlog.m21943a(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m20560c(InneractiveAdRequest inneractiveAdRequest) {
        AbstractC8167o abstractC8167o;
        C8043t0 c8043t0;
        UnitDisplayType unitDisplayType;
        InterfaceC8135n interfaceC8135n;
        if (!InneractiveAdManager.wasInitialized() && (interfaceC8135n = this.f18185b) != null) {
            ((C8082e0) interfaceC8135n).m20497a(inneractiveAdRequest, m20584c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_NOT_INITIALIZED, EnumC8125i.NO_APP_CONFIG_AVAILABLE));
        }
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        HashMap map = iAConfigManager.f17669a;
        C8026q0 c8026q0 = (map == null || !map.containsKey(spotId)) ? null : (C8026q0) iAConfigManager.f17669a.get(spotId);
        AbstractC9087e abstractC9087eM20584c = m20584c();
        if (c8026q0 != null && !c8026q0.f17810b) {
            m20559a(false, abstractC9087eM20584c, inneractiveAdRequest);
            ((C8082e0) this.f18185b).m20497a(inneractiveAdRequest, m20584c(), new InneractiveInfrastructureError(InneractiveErrorCode.SPOT_DISABLED, EnumC8125i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        if (c8026q0 == null || !c8026q0.f17809a.iterator().hasNext()) {
            if (c8026q0 == null) {
                m20559a(true, abstractC9087eM20584c, inneractiveAdRequest);
                IAConfigManager.m20375a();
            }
            IAlog.m21950f("************************************************************************************************************************", new Object[0]);
            IAlog.m21950f("*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'", inneractiveAdRequest.getSpotId(), iAConfigManager.f17671c);
            IAlog.m21950f("*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?", new Object[0]);
            IAlog.m21950f("************************************************************************************************************************", new Object[0]);
            ((C8082e0) this.f18185b).m20497a(inneractiveAdRequest, abstractC9087eM20584c, new InneractiveInfrastructureError(InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT, EnumC8125i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        C8028r0 c8028r0 = (C8028r0) c8026q0.f17809a.get(0);
        if (c8028r0.f17815e != null || (c8028r0.f17813c == null && ((c8043t0 = c8028r0.f17816f) == null || ((unitDisplayType = c8043t0.f17876j) != UnitDisplayType.INTERSTITIAL && unitDisplayType != UnitDisplayType.REWARDED)))) {
            ((C8082e0) this.f18185b).m20497a(inneractiveAdRequest, m20584c(), new InneractiveInfrastructureError(InneractiveErrorCode.UNSUPPORTED_SPOT, EnumC8125i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        C8006r c8006rM20431a = C8006r.m20431a();
        this.f18186c = c8006rM20431a;
        c8006rM20431a.m20434a(false, inneractiveAdRequest.getSpotId());
        C8412s c8412s = new C8412s(inneractiveAdRequest, inneractiveAdRequest.f18328b, this.f18186c, this);
        this.f18187d = c8412s;
        c8412s.f18682b = false;
        IAlog.m21945a("IARemoteAdFetcher: requestAd called", new Object[0]);
        if (TextUtils.isEmpty(inneractiveAdRequest.getSpotId())) {
            IAlog.m21946b("appID is null or empty. Please provide a valid appID and re-try.", new Object[0]);
        } else {
            if (AbstractC9174o.m21996a("android.permission.INTERNET")) {
                if (!AbstractC9174o.m21996a("android.permission.ACCESS_NETWORK_STATE")) {
                    IAlog.m21946b("It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting", new Object[0]);
                }
                if (!AbstractC9174o.m21996a("android.permission.READ_PHONE_STATE")) {
                    IAlog.m21950f("It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting", new Object[0]);
                }
                iAConfigManager.f17686r.m20768a(c8412s.f18706f);
                return;
            }
            IAlog.m21946b("INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! ", new Object[0]);
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, EnumC8125i.VALIDATE_PARAMS_FAILED, new Exception("appID is null or empty or INTERNET permission is missing"));
        if (c8412s.f18682b || (abstractC8167o = c8412s.f18681a) == null) {
            return;
        }
        abstractC8167o.m20580a(inneractiveAdRequest, null, inneractiveInfrastructureError);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8167o
    /* JADX INFO: renamed from: d */
    public final String mo20561d() {
        return IAlog.m21943a(this);
    }
}
