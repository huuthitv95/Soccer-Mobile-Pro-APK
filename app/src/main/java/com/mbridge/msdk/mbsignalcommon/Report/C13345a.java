package com.mbridge.msdk.mbsignalcommon.Report;

import android.content.Context;
import android.util.Base64;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.Report.a */
/* JADX INFO: compiled from: H5ReportManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13345a {

    /* JADX INFO: renamed from: c */
    private static final String f37035c = "a";

    /* JADX INFO: renamed from: a */
    int f37036a = 0;

    /* JADX INFO: renamed from: b */
    int f37037b = 1;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.Report.a$a */
    /* JADX INFO: compiled from: H5ReportManager.java */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static C13345a f37038a = new C13345a();
    }

    /* JADX INFO: renamed from: a */
    public static C13345a m38594a() {
        return a.f37038a;
    }

    /* JADX INFO: renamed from: a */
    public void m38596a(Object obj, String str, JSONArray jSONArray, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        JSONObject jSONObjectOptJSONObject7;
        JSONObject jSONObjectOptJSONObject8;
        JSONObject jSONObjectOptJSONObject9;
        JSONObject jSONObjectOptJSONObject10;
        JSONObject jSONObjectOptJSONObject11;
        int i2;
        try {
            if (jSONArray == null) {
                m38595a(this.f37037b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                m38595a(this.f37037b, "called reporter failed, params empty", obj);
                return;
            }
            int i3 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i2 = length - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject12 != null) {
                        stringBuffer = stringBuffer.append(jSONObjectOptJSONObject12.optString("key")).append(C11744X3.j.f26434b).append(jSONObjectOptJSONObject12.opt("value")).append(C11744X3.j.f26436c);
                    }
                    i3++;
                }
                JSONObject jSONObjectOptJSONObject13 = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject13 != null) {
                    stringBuffer = stringBuffer.append(jSONObjectOptJSONObject13.optString("key")).append(C11744X3.j.f26434b).append(jSONObjectOptJSONObject13.opt("value"));
                }
                m38597a(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                m38598a((length <= 0 || (jSONObjectOptJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : jSONObjectOptJSONObject11.getString("value"), (length <= 1 || (jSONObjectOptJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : jSONObjectOptJSONObject10.getInt("value"), (length <= 2 || (jSONObjectOptJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : jSONObjectOptJSONObject9.getInt("value"), (length <= 3 || (jSONObjectOptJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : jSONObjectOptJSONObject8.getInt("value"), (length <= 4 || (jSONObjectOptJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : jSONObjectOptJSONObject7.getInt("value"), (length <= 5 || (jSONObjectOptJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : jSONObjectOptJSONObject6.getString("value"), (length <= 6 || (jSONObjectOptJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : jSONObjectOptJSONObject5.getString("value"), (length <= 7 || (jSONObjectOptJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : jSONObjectOptJSONObject4.getInt("value"), (length <= 8 || (jSONObjectOptJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : jSONObjectOptJSONObject3.getString("value"), (length <= 9 || (jSONObjectOptJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : jSONObjectOptJSONObject2.getInt("value"), (length <= 10 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(10)) == null) ? "" : jSONObjectOptJSONObject.getString("value"));
            }
            m38595a(this.f37036a, "called reporter success", obj);
        } catch (Throwable th) {
            C13219q0.m37813a(f37035c, th.getMessage());
            m38595a(this.f37037b, "exception: " + th.getMessage(), obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38597a(String str) {
        C13156d.m37475b().m37498e(str);
    }

    /* JADX INFO: renamed from: a */
    public void m38598a(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                C13026n.m36744a(C13017g.m36693a(contextM36542d)).m36745a(new C13080n(str, i, i2, i3, i4, str2, str3, i5, str4, i6, str5));
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f37035c, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38595a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            jSONObject.put("message", str);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C13219q0.m37813a(f37035c, e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37813a(f37035c, th.getMessage());
        }
    }
}
