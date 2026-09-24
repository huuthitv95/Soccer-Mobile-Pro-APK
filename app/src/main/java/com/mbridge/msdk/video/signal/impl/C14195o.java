package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.o */
/* JADX INFO: compiled from: JSRewardVideoV1.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14195o extends C14196p {

    /* JADX INFO: renamed from: a */
    private Activity f40952a;

    /* JADX INFO: renamed from: b */
    private MBridgeContainerView f40953b;

    public C14195o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f40952a = activity;
        this.f40953b = mBridgeContainerView;
    }

    /* JADX INFO: renamed from: a */
    private String m42390a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            Object camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", camplistToJson);
            m42393a(jSONObject2);
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C13636h.m39706b() != null) {
                String strM39721e = C13636h.m39706b().m39721e(C13008c.m36588n().m36533b());
                if (!TextUtils.isEmpty(strM39721e)) {
                    JSONObject jSONObject3 = new JSONObject(strM39721e);
                    m42391a(jSONObject3, str);
                    String strM39717c = C13636h.m39706b().m39717c(str);
                    if (!TextUtils.isEmpty(strM39717c)) {
                        jSONObject3.put("ivreward", new JSONObject(strM39717c));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42391a(JSONObject jSONObject, String str) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            String string = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmContent" + str, "").toString();
            String string3 = C13235y0.m37956a(contextM36542d, "MBridge_CancelText" + str, "").toString();
            String string4 = C13235y0.m37956a(contextM36542d, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private C14223c m42392b(String str) {
        if (C14222b.m42658b() == null) {
            return null;
        }
        return C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), str);
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14180i
    /* JADX INFO: renamed from: a */
    public void mo42349a(String str) {
        super.mo42349a(str);
        try {
            if (this.f40952a == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals(C11744X3.i.f26320C)) {
                this.f40952a.setRequestedOrientation(0);
            } else if (str.equals(C11744X3.i.f26322D)) {
                this.f40952a.setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14180i
    /* JADX INFO: renamed from: b */
    public String mo42350b() {
        if (this.f40953b == null) {
            super.mo42350b();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f40953b.getCampaign());
                String unitID = this.f40953b.getUnitID();
                C14223c c14223cM42392b = m42392b(unitID);
                JSONObject jSONObject = new JSONObject();
                if (c14223cM42392b != null) {
                    jSONObject = c14223cM42392b.m42696H();
                }
                C13219q0.m37813a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f40953b.getCampaign());
                return m42390a(arrayList, unitID, "MAL_17.0.91,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.mo42350b();
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14180i
    public void handlerPlayableException(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f40952a == null || TextUtils.isEmpty(str) || (mBridgeContainerView = this.f40953b) == null) {
                return;
            }
            mBridgeContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14179h
    public void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f40953b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14179h
    public void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f40953b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14187g, com.mbridge.msdk.video.signal.InterfaceC14180i
    public void triggerCloseBtn(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.triggerCloseBtn(str);
        try {
            if (this.f40952a == null || TextUtils.isEmpty(str) || !str.equals("click") || (mBridgeContainerView = this.f40953b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
