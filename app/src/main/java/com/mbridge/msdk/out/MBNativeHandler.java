package com.mbridge.msdk.out;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbnative.demand.AbstractC13338b;
import com.mbridge.msdk.mbnative.listener.C13339a;
import com.mbridge.msdk.mbnative.service.C13342a;
import com.mbridge.msdk.util.C13884b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MBNativeHandler extends AbstractC13338b implements BaseExtraInterfaceForHandler {
    private static final String TAG = "com.mbridge.msdk.out.MBNativeHandler";
    public static final String TEMPLATE_ID = "id";
    public static final String TEMPLATE_NUM = "ad_num";
    private static String mUnitID;
    private C13339a adListener;
    private C12682a clickControler;
    private Context context;
    private Map<String, Object> map;
    private C13342a nativeProvider;
    private List<NativeListener.Template> templateList;
    private NativeListener.NativeTrackingListener trackingListener;

    public static class KeyWordInfo {
        String keyWordPN;
        String keyWorkVN;

        public KeyWordInfo(String str, String str2) {
            this.keyWordPN = str;
            this.keyWorkVN = str2;
        }

        public String getKeyWordPN() {
            return this.keyWordPN;
        }

        public String getKeyWorkVN() {
            return this.keyWorkVN;
        }

        public void setKeyWordPN(String str) {
            this.keyWordPN = str;
        }

        public void setKeyWorkVN(String str) {
            this.keyWorkVN = str;
        }
    }

    public MBNativeHandler(Context context) {
        this.adListener = new C13339a();
        this.context = context;
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        Map<String, Object> map = this.map;
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            return;
        }
        String str = (String) this.map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C13339a c13339a = this.adListener;
        if (c13339a != null) {
            c13339a.m38556a(str);
        }
        String strM37926e = C13229v0.m37926e(str);
        if (TextUtils.isEmpty(strM37926e)) {
            return;
        }
        C13229v0.m37922d(str, strM37926e);
    }

    public static Map<String, Object> getNativeProperties(String str, String str2) {
        HashMap map = new HashMap();
        mUnitID = str2;
        map.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        String str3 = MBridgeConstans.PLACEMENT_ID;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        map.put(str3, str);
        map.put(MBridgeConstans.PLUGIN_NAME, new String[]{MBridgeConstans.PLUGIN_NATIVE});
        map.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        return map;
    }

    public static String getTemplateString(List<NativeListener.Template> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template template : list) {
                stringBuffer.append("{\"id\":").append(template.getId() + ",").append("\"ad_num\":").append(template.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean loadMB() {
        Map<String, Object> map = this.properties;
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C13219q0.m37820d(TAG, "no unit id.");
            return true;
        }
        List<NativeListener.Template> list = this.templateList;
        if (list != null && list.size() > 0) {
            try {
                this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
            } catch (Exception unused) {
                C13219q0.m37820d(TAG, "MBSDK set template error");
            }
        }
        try {
            this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            if (this.nativeProvider == null) {
                C13342a c13342a = new C13342a(this.adListener, this.trackingListener);
                this.nativeProvider = c13342a;
                c13342a.m38575a(this.context, (Resources) null, this.properties);
            }
            this.nativeProvider.m38585d();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private boolean loadMBFrame() {
        List<NativeListener.Template> list = this.templateList;
        if (list != null && list.size() > 0) {
            try {
                this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
            } catch (Exception unused) {
                C13219q0.m37820d(TAG, "MBSDK set template error");
            }
        }
        try {
            this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            if (this.nativeProvider == null) {
                C13342a c13342a = new C13342a(this.adListener, this.trackingListener);
                this.nativeProvider = c13342a;
                c13342a.m38575a(this.context, (Resources) null, this.properties);
            }
            this.nativeProvider.m38586e();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void addTemplate(NativeListener.Template template) {
        if (template != null) {
            if (this.templateList == null) {
                this.templateList = new ArrayList();
            }
            this.templateList.add(template);
        }
    }

    public String buildTemplateString() {
        try {
            List<NativeListener.Template> list = this.templateList;
            if (list == null || list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template template : this.templateList) {
                stringBuffer.append("{\"id\":").append(template.getId() + ",").append("\"ad_num\":").append(template.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    public void clearCacheByUnitid(String str) {
        try {
            if (C13182a1.m37596a(str)) {
                return;
            }
            C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36653a(str);
            if (C13884b.m41421a()) {
                return;
            }
            C13008c.m36588n().m36529a(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearVideoCache() {
        try {
            C13342a c13342a = this.nativeProvider;
            if (c13342a != null) {
                c13342a.m38574a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C13339a getAdListener() {
        return this.adListener;
    }

    public String getCreativeIdWithUnitId() {
        C13342a c13342a = this.nativeProvider;
        return c13342a != null ? c13342a.m38581b() : "";
    }

    public String getRequestId() {
        C13342a c13342a = this.nativeProvider;
        return c13342a != null ? c13342a.m38584c() : "";
    }

    public NativeListener.NativeTrackingListener getTrackingListener() {
        return this.trackingListener;
    }

    public void handleResult(Campaign campaign, String str) {
        if (this.clickControler == null) {
            Map<String, Object> map = this.map;
            this.clickControler = new C12682a(this.context, map != null ? (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID) : null);
        }
        this.clickControler.m34635a(campaign, str);
    }

    @Override // com.mbridge.msdk.out.MBCommonHandler
    public boolean load() {
        Map<String, Object> map = this.properties;
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C13219q0.m37820d(TAG, "no unit id.");
            return true;
        }
        loadMB();
        return true;
    }

    public boolean loadFrame() {
        Map<String, Object> map = this.properties;
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C13219q0.m37820d(TAG, "no unit id.");
            return true;
        }
        loadMBFrame();
        return true;
    }

    public void registerView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C13342a(this.adListener, this.trackingListener);
            Map<String, Object> map = this.properties;
            if (map != null) {
                map.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.m38575a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.m38576a(view, campaign);
    }

    @Override // com.mbridge.msdk.out.MBCommonHandler
    public void release() {
        C13342a c13342a = this.nativeProvider;
        if (c13342a != null) {
            c13342a.m38587g();
        }
        this.trackingListener = null;
        C13008c.m36588n().m36529a(mUnitID);
    }

    public void setAdListener(NativeListener.NativeAdListener nativeAdListener) {
        C13339a c13339a = new C13339a(nativeAdListener);
        this.adListener = c13339a;
        c13339a.m38556a(mUnitID);
        C13342a c13342a = this.nativeProvider;
        if (c13342a != null) {
            c13342a.m38578a(this.adListener);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        C13008c.m36588n().m36530a(mUnitID, jSONObject);
    }

    public void setMustBrowser(boolean z) {
        C13227u0.f36392b = z;
    }

    public void setTrackingListener(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.trackingListener = nativeTrackingListener;
        C13342a c13342a = this.nativeProvider;
        if (c13342a != null) {
            c13342a.m38579a(nativeTrackingListener);
        }
    }

    public void unregisterView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C13342a(this.adListener, this.trackingListener);
            Map<String, Object> map = this.properties;
            if (map != null) {
                map.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.m38575a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.m38582b(view, campaign);
        C13008c.m36588n().m36529a(mUnitID);
    }

    public void registerView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C13342a(this.adListener, this.trackingListener);
            Map<String, Object> map = this.properties;
            if (map != null) {
                map.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.m38575a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.m38577a(view, list, campaign);
    }

    public void unregisterView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C13342a(this.adListener, this.trackingListener);
            Map<String, Object> map = this.properties;
            if (map != null) {
                map.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.m38575a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.m38583b(view, list, campaign);
        C13008c.m36588n().m36529a(mUnitID);
    }

    public MBNativeHandler(Map<String, Object> map, Context context) {
        super(map, context);
        this.adListener = new C13339a();
        this.context = context;
        this.map = map;
        if (C13008c.m36588n().m36542d() == null && context != null) {
            C13008c.m36588n().m36535b(context);
        }
        if (map != null) {
            try {
                if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && map.get(MBridgeConstans.PROPERTIES_UNIT_ID) != null && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) && map.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && map.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) != null && (map.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer) && map.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && map.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) != null) {
                    boolean z = map.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            return;
        }
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C13339a c13339a = this.adListener;
        if (c13339a != null) {
            c13339a.m38556a(str);
        }
        String strM37926e = C13229v0.m37926e(str);
        if (TextUtils.isEmpty(strM37926e)) {
            return;
        }
        C13229v0.m37922d(str, strM37926e);
    }
}
