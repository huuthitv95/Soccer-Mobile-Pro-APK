package com.mbridge.msdk.advanced.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C11744X3;
import com.mbridge.msdk.advanced.common.C12653b;
import com.mbridge.msdk.advanced.middle.InterfaceC12659a;
import com.mbridge.msdk.advanced.report.C12663a;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.base.C13351d;
import com.mbridge.msdk.mbsignalcommon.communication.AbstractC13373c;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.signal.b */
/* JADX INFO: compiled from: NativeAdvancedSignalCommunicationImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12676b extends AbstractC13373c {

    /* JADX INFO: renamed from: c */
    private WeakReference<Context> f33579c;

    /* JADX INFO: renamed from: d */
    private List<CampaignEx> f33580d;

    /* JADX INFO: renamed from: e */
    private String f33581e;

    /* JADX INFO: renamed from: f */
    private String f33582f;

    /* JADX INFO: renamed from: g */
    private int f33583g;

    /* JADX INFO: renamed from: h */
    private int f33584h;

    /* JADX INFO: renamed from: j */
    private InterfaceC12659a f33586j;

    /* JADX INFO: renamed from: k */
    private NativeAdvancedExpandDialog f33587k;

    /* JADX INFO: renamed from: b */
    private String f33578b = "NativeAdvancedJSBridgeImpl";

    /* JADX INFO: renamed from: i */
    private int f33585i = 5;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.signal.b$a */
    /* JADX INFO: compiled from: NativeAdvancedSignalCommunicationImpl.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f33588a;

        a(ArrayList arrayList) {
            this.f33588a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                Iterator it = this.f33588a.iterator();
                while (it.hasNext()) {
                    c13020jM36706a.m36709b((String) it.next());
                }
            } catch (Exception unused) {
                C13219q0.m37816b(C12676b.this.f33578b, "campain can't insert db");
            }
        }
    }

    public C12676b(Context context, String str, String str2) {
        this.f33582f = str;
        this.f33581e = str2;
        this.f33579c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public List<CampaignEx> m34579a() {
        return this.f33580d;
    }

    /* JADX INFO: renamed from: a */
    public void m34580a(int i) {
        this.f33584h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m34581a(InterfaceC12659a interfaceC12659a) {
        if (interfaceC12659a != null) {
            this.f33586j = interfaceC12659a;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.AbstractC13371a, com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: a */
    public void mo34582a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = new JSONObject(str).getInt("countdown");
            InterfaceC12659a interfaceC12659a = this.f33586j;
            if (interfaceC12659a != null) {
                interfaceC12659a.mo34407a(i);
            }
        } catch (JSONException e) {
            C13219q0.m37817b(this.f33578b, "resetCountdown", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34583a(List<CampaignEx> list) {
        this.f33580d = list;
    }

    /* JADX INFO: renamed from: b */
    public void m34584b(int i) {
        this.f33585i = i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.AbstractC13371a, com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: c */
    public void mo34585c(Object obj, String str) {
        try {
            if (obj instanceof C13387a) {
                C13392f.m38726a().m38727a(((C13387a) obj).f37156b);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "onSignalCommunicationConnect", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void click(Object obj, String str) {
        try {
            List<CampaignEx> list = this.f33580d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f33580d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
                C13219q0.m37816b(this.f33578b, e.getMessage());
            }
            InterfaceC12659a interfaceC12659a = this.f33586j;
            if (interfaceC12659a != null) {
                interfaceC12659a.mo34408a(campaignEx);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "click", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        C13219q0.m37816b(this.f33578b, "close");
        try {
            InterfaceC12659a interfaceC12659a = this.f33586j;
            if (interfaceC12659a != null) {
                interfaceC12659a.close();
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "close", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: d */
    public void mo34586d(Object obj, String str) {
        C13219q0.m37813a(this.f33578b, "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (CampaignEx campaignEx : this.f33580d) {
                    if (campaignEx.getId().equals(string)) {
                        C13091b.m37104a(this.f33581e, campaignEx, "h5_native");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new a(arrayList)).start();
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f33579c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f33587k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f33579c.get(), bundle, this.f33586j);
                this.f33587k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f33581e, this.f33580d);
                this.f33587k.show();
                InterfaceC12659a interfaceC12659a = this.f33586j;
                if (interfaceC12659a != null) {
                    interfaceC12659a.mo34409a(true);
                }
                C12663a.m34539a(this.f33581e, getMraidCampaign(), str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "expand", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is empty");
            return;
        }
        try {
            C12675a.m34577a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37813a(this.f33578b, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f33580d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f33580d.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C12653b c12653b = new C12653b(C13008c.m36588n().m36542d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f33583g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C11744X3.i.f26328G, c12653b.m34378b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f33580d));
            C13640l c13640lM39709a = C13636h.m39706b().m39709a(C13008c.m36588n().m36533b(), this.f33581e);
            if (c13640lM39709a == null) {
                c13640lM39709a = C13640l.m39755k(this.f33581e);
            }
            if (!TextUtils.isEmpty(this.f33582f)) {
                c13640lM39709a.m39634d(this.f33582f);
            }
            c13640lM39709a.m39637e(this.f33581e);
            c13640lM39709a.m39649j(this.f33585i);
            c13640lM39709a.m39618a(this.f33584h);
            jSONObject.put("unitSetting", c13640lM39709a.m39616M());
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                jSONObject.put("appSetting", new JSONObject(strM39721e));
            }
            jSONObject.put("sdk_info", C13351d.f37046a);
            C13219q0.m37816b(this.f33578b, "init" + jSONObject.toString());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "init", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.AbstractC13371a, com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void install(Object obj, String str) {
        C13219q0.m37816b(this.f33578b, "install");
        try {
            List<CampaignEx> list = this.f33580d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f33580d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            InterfaceC12659a interfaceC12659a = this.f33586j;
            if (interfaceC12659a != null) {
                interfaceC12659a.mo34408a(campaignEx);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "install", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        InterfaceC12659a interfaceC12659a = this.f33586j;
        if (interfaceC12659a != null) {
            interfaceC12659a.mo34410a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof C13387a) || (windVaneWebView = ((C13387a) obj).f37156b) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().mo34467a(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().mo34467a(windVaneWebView, 2);
            }
        } catch (Throwable th) {
            C13219q0.m37813a(this.f33578b, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void reportUrls(Object obj, String str) {
        C13219q0.m37813a(this.f33578b, "reportUrls:" + str);
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
                    List<CampaignEx> list = this.f33580d;
                    C12682a.m34605a(contextM36542d, list != null ? list.get(0) : null, "", strM37887a, false, iOptInt != 0);
                } else {
                    Context contextM36542d2 = C13008c.m36588n().m36542d();
                    List<CampaignEx> list2 = this.f33580d;
                    C12682a.m34606a(contextM36542d2, list2 != null ? list2.get(0) : null, "", strM37887a, false, iOptInt != 0, iOptInt2);
                }
            }
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(0));
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "reportUrls", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC12659a interfaceC12659a = this.f33586j;
            if (interfaceC12659a != null) {
                interfaceC12659a.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void triggerCloseBtn(Object obj, String str) {
        if (this.f33586j != null) {
            C12675a.m34576a(obj);
            this.f33586j.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void useCustomClose(boolean z) {
        try {
            if (this.f33584h == -1) {
                int i = z ? 2 : 1;
                InterfaceC12659a interfaceC12659a = this.f33586j;
                if (interfaceC12659a != null) {
                    interfaceC12659a.toggleCloseBtn(i);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b(this.f33578b, "useCustomClose", th);
        }
    }
}
