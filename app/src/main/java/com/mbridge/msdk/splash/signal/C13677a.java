package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.base.C13351d;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.splash.common.C13650b;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.splash.report.C13665a;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.a */
/* JADX INFO: compiled from: BaseSplashSignalCommunicationImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13677a implements InterfaceC13381b {

    /* JADX INFO: renamed from: b */
    private WeakReference<Context> f38392b;

    /* JADX INFO: renamed from: c */
    private List<CampaignEx> f38393c;

    /* JADX INFO: renamed from: d */
    private String f38394d;

    /* JADX INFO: renamed from: e */
    private String f38395e;

    /* JADX INFO: renamed from: f */
    private int f38396f;

    /* JADX INFO: renamed from: g */
    private int f38397g;

    /* JADX INFO: renamed from: i */
    private int f38399i;

    /* JADX INFO: renamed from: j */
    private InterfaceC13661a f38400j;

    /* JADX INFO: renamed from: k */
    private SplashExpandDialog f38401k;

    /* JADX INFO: renamed from: a */
    protected String f38391a = "SplashSignalCommunicationImpl";

    /* JADX INFO: renamed from: h */
    private int f38398h = 5;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.a$a */
    /* JADX INFO: compiled from: BaseSplashSignalCommunicationImpl.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f38402a;

        a(ArrayList arrayList) {
            this.f38402a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                Iterator it = this.f38402a.iterator();
                while (it.hasNext()) {
                    c13020jM36706a.m36709b((String) it.next());
                }
            } catch (Exception unused) {
                C13219q0.m37816b(C13677a.this.f38391a, "campain can't insert db");
            }
        }
    }

    public C13677a(Context context, String str, String str2) {
        this.f38395e = str;
        this.f38394d = str2;
        this.f38392b = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13661a m40062a() {
        return this.f38400j;
    }

    /* JADX INFO: renamed from: a */
    public void m40063a(int i) {
        this.f38397g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m40064a(Context context) {
        this.f38392b = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public void m40065a(InterfaceC13661a interfaceC13661a) {
        if (interfaceC13661a != null) {
            this.f38400j = interfaceC13661a;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40066a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = new JSONObject(str).getInt("countdown");
            InterfaceC13661a interfaceC13661a = this.f38400j;
            if (interfaceC13661a != null) {
                interfaceC13661a.mo39869a(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40067a(List<CampaignEx> list) {
        this.f38393c = list;
    }

    /* JADX INFO: renamed from: b */
    public List<CampaignEx> m40068b() {
        return this.f38393c;
    }

    /* JADX INFO: renamed from: b */
    public void m40069b(int i) {
        this.f38398h = i;
    }

    /* JADX INFO: renamed from: c */
    public void m40070c(int i) {
        this.f38399i = i;
    }

    /* JADX INFO: renamed from: c */
    public void m40071c(Object obj, String str) {
        try {
            if (obj instanceof C13387a) {
                C13392f.m38726a().m38727a(((C13387a) obj).f37156b);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "onJSBridgeConnect", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        C13219q0.m37816b(this.f38391a, "close");
        try {
            InterfaceC13661a interfaceC13661a = this.f38400j;
            if (interfaceC13661a != null) {
                interfaceC13661a.close();
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "close", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m40072d(Object obj, String str) {
        C13219q0.m37813a(this.f38391a, "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (CampaignEx campaignEx : this.f38393c) {
                    if (campaignEx.getId().equals(string)) {
                        C13091b.m37104a(this.f38394d, campaignEx, "splash");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new a(arrayList)).start();
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "sendImpressions", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m40073e(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject.put("message", "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f38399i);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13219q0.m37816b(this.f38391a, e.getMessage());
        }
        InterfaceC13661a interfaceC13661a = this.f38400j;
        if (interfaceC13661a != null) {
            interfaceC13661a.mo39870a(1, -1);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f38392b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f38401k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f38392b.get(), bundle, this.f38400j);
                this.f38401k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f38394d, this.f38393c);
                this.f38401k.show();
                InterfaceC13661a interfaceC13661a = this.f38400j;
                if (interfaceC13661a != null) {
                    interfaceC13661a.mo39872a(true);
                }
                C13665a.m40027a(this.f38394d, getMraidCampaign(), str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "expand", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m40074f(Object obj, String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                int iOptInt = new JSONObject(str).optInt("countdown");
                try {
                    C13392f.m38726a().m38731b(obj, C13679c.m40076a(0));
                    i = iOptInt;
                } catch (Exception e) {
                    e = e;
                    i = iOptInt;
                    C13219q0.m37816b(this.f38391a, e.getMessage());
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        InterfaceC13661a interfaceC13661a = this.f38400j;
        if (interfaceC13661a != null) {
            interfaceC13661a.mo39870a(2, i);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f38393c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f38393c.get(0);
    }

    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C13650b c13650b = new C13650b(C13008c.m36588n().m36542d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f38396f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C11744X3.i.f26328G, c13650b.m39782b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f38393c));
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f38394d);
            if (c13640lM39720e == null) {
                c13640lM39720e = C13640l.m39753i(this.f38394d);
            }
            if (!TextUtils.isEmpty(this.f38395e)) {
                c13640lM39720e.m39634d(this.f38395e);
            }
            c13640lM39720e.m39637e(this.f38394d);
            c13640lM39720e.m39649j(this.f38398h);
            c13640lM39720e.m39618a(this.f38397g);
            jSONObject.put("unitSetting", c13640lM39720e.m39616M());
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                jSONObject.put("appSetting", new JSONObject(strM39721e));
            }
            jSONObject.put("sdk_info", C13351d.f37046a);
            C13219q0.m37816b(this.f38391a, "init" + jSONObject.toString());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "init", th);
        }
    }

    public void install(Object obj, String str) {
        C13219q0.m37816b(this.f38391a, "install");
        try {
            List<CampaignEx> list = this.f38393c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f38393c.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                campaignEx = campaignWithBackData;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            InterfaceC13661a interfaceC13661a = this.f38400j;
            if (interfaceC13661a != null) {
                interfaceC13661a.mo39871a(campaignEx);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "click", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        InterfaceC13661a interfaceC13661a = this.f38400j;
        if (interfaceC13661a != null) {
            interfaceC13661a.mo39873a(true, str);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C13219q0.m37816b(this.f38391a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM36542d == null) {
            try {
                if ((obj instanceof C13387a) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    contextM36542d = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                C13219q0.m37816b(this.f38391a, e.getMessage());
            }
        }
        if (contextM36542d == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(contextM36542d, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(contextM36542d, strOptString);
            }
        } catch (JSONException e2) {
            C13219q0.m37816b(this.f38391a, e2.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b(this.f38391a, th.getMessage());
        }
    }

    public void reportUrls(Object obj, String str) {
        C13219q0.m37813a(this.f38391a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strM37887a = C13229v0.m37887a(jSONObject.optString("url"), "&tun=", C13211m0.m37715A() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    Context contextM36542d = C13008c.m36588n().m36542d();
                    List<CampaignEx> list = this.f38393c;
                    C12682a.m34605a(contextM36542d, list != null ? list.get(0) : null, "", strM37887a, false, iOptInt != 0);
                } else {
                    Context contextM36542d2 = C13008c.m36588n().m36542d();
                    List<CampaignEx> list2 = this.f38393c;
                    C12682a.m34606a(contextM36542d2, list2 != null ? list2.get(0) : null, "", strM37887a, false, iOptInt != 0, iOptInt2);
                }
            }
            C13392f.m38726a().m38731b(obj, C13679c.m40076a(0));
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "reportUrls", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC13661a interfaceC13661a = this.f38400j;
            if (interfaceC13661a != null) {
                interfaceC13661a.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        InterfaceC13661a interfaceC13661a = this.f38400j;
        if (interfaceC13661a != null) {
            interfaceC13661a.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            InterfaceC13661a interfaceC13661a = this.f38400j;
            if (interfaceC13661a != null) {
                interfaceC13661a.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f38391a, "useCustomClose", th);
        }
    }
}
