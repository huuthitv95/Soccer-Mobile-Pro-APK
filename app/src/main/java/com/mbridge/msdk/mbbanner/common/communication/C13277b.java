package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.C13079m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.p289db.C13023m;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13226u;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbsignalcommon.base.C13351d;
import com.mbridge.msdk.mbsignalcommon.communication.AbstractC13373c;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.b */
/* JADX INFO: compiled from: BannerSignalCommunicationImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13277b extends AbstractC13373c {

    /* JADX INFO: renamed from: b */
    private WeakReference<Context> f36609b;

    /* JADX INFO: renamed from: c */
    private List<CampaignEx> f36610c;

    /* JADX INFO: renamed from: d */
    private String f36611d;

    /* JADX INFO: renamed from: e */
    private String f36612e;

    /* JADX INFO: renamed from: f */
    private int f36613f;

    /* JADX INFO: renamed from: g */
    private InterfaceC13282a f36614g;

    /* JADX INFO: renamed from: h */
    private BannerExpandDialog f36615h;

    /* JADX INFO: renamed from: i */
    private boolean f36616i = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.b$a */
    /* JADX INFO: compiled from: BannerSignalCommunicationImpl.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f36617a;

        a(ArrayList arrayList) {
            this.f36617a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                Iterator it = this.f36617a.iterator();
                while (it.hasNext()) {
                    c13020jM36706a.m36709b((String) it.next());
                }
            } catch (Exception e) {
                C13219q0.m37816b("BannerSignalCommunicationImpl", e.getMessage());
            }
        }
    }

    public C13277b(Context context, String str, String str2) {
        this.f36611d = str;
        this.f36612e = str2;
        this.f36609b = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public void m38151a(InterfaceC13282a interfaceC13282a) {
        if (interfaceC13282a != null) {
            this.f36614g = interfaceC13282a;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void click(Object obj, String str) {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "click");
        try {
            List<CampaignEx> list = this.f36610c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f36610c.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
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
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.mo38172a(campaignEx);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "click", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "close");
        try {
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.close();
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "close", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: d */
    public void mo34586d(Object obj, String str) {
        C13219q0.m37813a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (CampaignEx campaignEx : this.f36610c) {
                    if (campaignEx.getId().equals(string)) {
                        C13091b.m37104a(this.f36612e, campaignEx, "banner");
                        arrayList.add(string);
                    }
                }
            }
            C13167a.m37543b().execute(new a(arrayList));
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
        Context context;
        String bannerUrl;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    bannerUrl = getMraidCampaign().getBannerUrl();
                } else {
                    bannerUrl = "file:////" + getMraidCampaign().getBannerHtml();
                }
                str2 = bannerUrl;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f36609b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f36615h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f36614g);
                this.f36615h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f36612e, this.f36610c);
                this.f36615h.show();
            }
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.mo38173a(true);
            }
            C13291a.m38289a(this.f36612e, getMraidCampaign(), str);
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "expand", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is empty");
            return;
        }
        try {
            m38148a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C13219q0.m37813a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f36610c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f36610c.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void init(Object obj, String str) {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            C13226u c13226u = new C13226u(C13008c.m36588n().m36542d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f36613f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C11744X3.i.f26328G, c13226u.mo37664a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f36610c));
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f36612e);
            if (c13640lM39720e == null) {
                c13640lM39720e = C13640l.m39753i(this.f36612e);
            }
            if (!TextUtils.isEmpty(this.f36611d)) {
                c13640lM39720e.m39634d(this.f36611d);
            }
            jSONObject.put("unitSetting", c13640lM39720e.m39616M());
            String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
            if (!TextUtils.isEmpty(strM39721e)) {
                jSONObject.put("appSetting", new JSONObject(strM39721e));
            }
            jSONObject.put("sdk_info", C13351d.f37046a);
            C13219q0.m37816b("BannerSignalCommunicationImpl", "init" + jSONObject.toString());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "init", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "open");
        try {
            C13219q0.m37816b("BannerSignalCommunicationImpl", str);
            if (this.f36610c.size() > 1) {
                C13008c.m36588n().m36542d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.mo38174a(true, str);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "open", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                C13392f.m38726a().m38731b(obj, C13374d.m38664a(0));
                InterfaceC13282a interfaceC13282a = this.f36614g;
                if (interfaceC13282a != null) {
                    interfaceC13282a.readyStatus(iOptInt);
                }
            } catch (Throwable th) {
                C13219q0.m37817b("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void reportUrls(Object obj, String str) {
        C13219q0.m37813a("BannerSignalCommunicationImpl", "reportUrls:" + str);
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
                    List<CampaignEx> list = this.f36610c;
                    C12682a.m34605a(contextM36542d, list != null ? list.get(0) : null, "", strM37887a, false, iOptInt != 0);
                } else {
                    Context contextM36542d2 = C13008c.m36588n().m36542d();
                    List<CampaignEx> list2 = this.f36610c;
                    C12682a.m34606a(contextM36542d2, list2 != null ? list2.get(0) : null, "", strM37887a, false, iOptInt != 0, iOptInt2);
                }
            }
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "reportUrls", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void toggleCloseBtn(Object obj, String str) {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void triggerCloseBtn(Object obj, String str) {
        C13219q0.m37816b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.triggerCloseBtn(strOptString);
            }
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(0));
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(-1));
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
            InterfaceC13282a interfaceC13282a = this.f36614g;
            if (interfaceC13282a != null) {
                interfaceC13282a.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38152a(List<CampaignEx> list) {
        this.f36610c = list;
    }

    /* JADX INFO: renamed from: a */
    public void m38150a(int i) {
        this.f36613f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m38149a() {
        if (this.f36614g != null) {
            this.f36614g = null;
        }
        if (this.f36615h != null) {
            this.f36615h = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38148a(Object obj, JSONObject jSONObject) {
        int i;
        boolean z;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "params is null");
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                C13219q0.m37813a("BannerSignalCommunicationImpl", e.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject2.put("message", "");
                JSONArray jSONArray = jSONObject.getJSONArray("resource");
                if (jSONArray != null && jSONArray.length() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                        String strOptString = jSONObject3.optString("ref", str2);
                        int i4 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i4 == i2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            C13079m c13079mM36727b = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36727b(strOptString);
                            if (c13079mM36727b != null) {
                                C13219q0.m37813a("BannerSignalCommunicationImpl", "VideoBean not null");
                                jSONObject5.put("type", 1);
                                i = length;
                                jSONObject5.put("videoDataLength", c13079mM36727b.m36948d());
                                String strM36949e = c13079mM36727b.m36949e();
                                if (TextUtils.isEmpty(strM36949e)) {
                                    C13219q0.m37813a("BannerSignalCommunicationImpl", "VideoPath null");
                                    jSONObject5.put("path", str2);
                                    jSONObject5.put("path4Web", str2);
                                } else {
                                    C13219q0.m37813a("BannerSignalCommunicationImpl", "VideoPath not null");
                                    jSONObject5.put("path", strM36949e);
                                    jSONObject5.put("path4Web", strM36949e);
                                }
                                if (c13079mM36727b.m36943b() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                    z = false;
                                } else {
                                    z = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } else {
                                str2 = str2;
                                i = length;
                                z = false;
                                C13219q0.m37813a("BannerSignalCommunicationImpl", "VideoBean null");
                            }
                        } else {
                            str2 = str2;
                            i = length;
                            z = false;
                            if (i4 == 2 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put("path", H5DownLoadManager.getInstance().getResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                                jSONObject4.put(strOptString, jSONObject6);
                                jSONArray2.put(jSONObject4);
                            } else if (i4 == 3 && !TextUtils.isEmpty(strOptString)) {
                                try {
                                    File file = new File(strOptString);
                                    if (file.exists() && file.isFile() && file.canRead()) {
                                        C13219q0.m37813a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + strOptString);
                                        str = "file:////" + strOptString;
                                    } else {
                                        str = str2;
                                    }
                                } catch (Throwable th) {
                                    if (MBridgeConstans.DEBUG) {
                                        th.printStackTrace();
                                    }
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put("path", str);
                                jSONObject4.put(strOptString, jSONObject7);
                                jSONArray2.put(jSONObject4);
                            } else if (i4 == 4 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put("path", C13227u0.m37853a(strOptString) == null ? str2 : C13227u0.m37853a(strOptString));
                                jSONObject4.put(strOptString, jSONObject8);
                                jSONArray2.put(jSONObject4);
                            }
                        }
                        i3++;
                        jSONArray = jSONArray3;
                        length = i;
                        str2 = str2;
                        i2 = 1;
                    }
                    jSONObject2.put("resource", jSONArray2);
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
                try {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    jSONObject2.put("message", "resource is null");
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e2) {
                    C13219q0.m37813a("BannerSignalCommunicationImpl", e2.getMessage());
                    return;
                }
            } catch (Throwable th2) {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", th2.getLocalizedMessage());
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e3) {
            C13219q0.m37813a("BannerSignalCommunicationImpl", e3.getMessage());
            return;
        }
    }
}
