package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.remote.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8033e {

    /* JADX INFO: renamed from: a */
    public C8029a f17829a;

    /* JADX INFO: renamed from: b */
    public List f17830b = null;

    /* JADX INFO: renamed from: c */
    public String f17831c;

    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX INFO: renamed from: a */
    public static C8033e m20451a(JSONObject jSONObject) {
        C8029a c8029a;
        int i;
        String str;
        String str2;
        Object obj;
        String str3;
        ArrayList arrayList;
        C8035g c8035g;
        String str4 = null;
        String strOptString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C8033e c8033e = new C8033e();
        c8033e.f17831c = strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        int iOptInt = jSONObjectOptJSONObject == null ? -1 : jSONObjectOptJSONObject.optInt("id", -1);
        String str5 = "isActive";
        if (iOptInt == -1) {
            c8029a = null;
        } else {
            c8029a = new C8029a();
            c8029a.f17818a = String.valueOf(iOptInt);
            c8029a.f17819b = jSONObjectOptJSONObject.optString("publisherId", null);
            c8029a.f17820c = C8034f.m20452a(jSONObjectOptJSONObject.optJSONObject("monitor"));
            c8029a.f17821d = C8038j.m20453a(jSONObjectOptJSONObject.optJSONObject("video"));
            c8029a.f17822e = C8030b.m20450a(jSONObjectOptJSONObject.optJSONObject("display"));
            c8029a.f17823f = C8039k.m20454a(jSONObjectOptJSONObject.optJSONObject("viewability"));
            c8029a.f17824g = jSONObjectOptJSONObject.optString("isActive", null);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject2 != null) {
                UnitDisplayType.fromValue(jSONObjectOptJSONObject2.optString("unitDisplayType"));
            }
        }
        if (c8029a == null) {
            return null;
        }
        c8033e.f17829a = c8029a;
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spots");
        if (jSONArrayOptJSONArray != null) {
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    String str6 = str4;
                    i = i2;
                    str = str5;
                    str2 = str6;
                    obj = str6;
                } else {
                    String strOptString2 = jSONObjectOptJSONObject3.optString("id", str4);
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        String str7 = str4;
                        i = i2;
                        str = str5;
                        str2 = str7;
                        obj = str7;
                    } else {
                        C8036h c8036h = new C8036h();
                        c8036h.f17833a = strOptString2;
                        c8036h.f17834b = jSONObjectOptJSONObject3.optString(str5, str4);
                        c8036h.f17835c = C8030b.m20450a(jSONObjectOptJSONObject3.optJSONObject("display"));
                        c8036h.f17836d = C8034f.m20452a(jSONObjectOptJSONObject3.optJSONObject("monitor"));
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("native");
                        if (jSONObjectOptJSONObject4 != null) {
                            UnitDisplayType.fromValue(jSONObjectOptJSONObject4.optString("unitDisplayType"));
                        }
                        c8036h.f17837e = C8038j.m20453a(jSONObjectOptJSONObject3.optJSONObject("video"));
                        c8036h.f17838f = C8039k.m20454a(jSONObjectOptJSONObject3.optJSONObject("viewability"));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("units");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            i = i2;
                            str = str5;
                            str3 = str4;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i3);
                                int i4 = i3;
                                if (jSONObjectOptJSONObject5 != null) {
                                    C8037i c8037i = new C8037i();
                                    c8037i.f17840a = jSONObjectOptJSONObject5.optString("id", null);
                                    c8037i.f17841b = jSONObjectOptJSONObject5.optString("spotId", null);
                                    c8037i.f17842c = C8030b.m20450a(jSONObjectOptJSONObject5.optJSONObject("display"));
                                    c8037i.f17843d = C8034f.m20452a(jSONObjectOptJSONObject5.optJSONObject("monitor"));
                                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("native");
                                    if (jSONObjectOptJSONObject6 == null) {
                                        c8035g = null;
                                    } else {
                                        C8035g c8035g2 = new C8035g();
                                        if (UnitDisplayType.fromValue(jSONObjectOptJSONObject6.optString("unitDisplayType")) != null) {
                                            c8035g = c8035g2;
                                        } else {
                                            c8035g = null;
                                        }
                                    }
                                    c8037i.f17844e = c8035g;
                                    c8037i.f17845f = C8038j.m20453a(jSONObjectOptJSONObject5.optJSONObject("video"));
                                    c8037i.f17846g = C8039k.m20454a(jSONObjectOptJSONObject5.optJSONObject("viewability"));
                                    arrayList.add(c8037i);
                                }
                                i3 = i4 + 1;
                                str5 = str5;
                                i2 = i2;
                            }
                            i = i2;
                            str = str5;
                            str3 = null;
                        }
                        c8036h.f17839g = arrayList;
                        obj = c8036h;
                        str2 = str3;
                    }
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
                str4 = str2;
                str5 = str;
                i2 = i + 1;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
        }
        c8033e.f17830b = arrayList2;
        return c8033e;
    }
}
