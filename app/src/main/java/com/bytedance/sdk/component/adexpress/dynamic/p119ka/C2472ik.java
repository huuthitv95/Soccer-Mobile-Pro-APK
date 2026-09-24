package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2472ik {

    /* JADX INFO: renamed from: lr */
    private JSONObject f6759lr;

    /* JADX INFO: renamed from: ri */
    private HashMap<String, Object> f6760ri = new HashMap<>();

    public C2472ik(JSONObject jSONObject) {
        this.f6759lr = jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    private void m8602ri(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.f6760ri.put(str + "." + str2 + "." + next + "." + i + "." + next2, objOpt2);
                        }
                        i++;
                    }
                }
            } else {
                this.f6760ri.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public boolean m8603lr(String str) {
        return this.f6760ri.containsKey(str);
    }

    /* JADX INFO: renamed from: ri */
    public Object m8604ri(String str) {
        if (this.f6760ri.containsKey(str)) {
            return this.f6760ri.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m8605ri() {
        Iterator<String> itKeys = this.f6759lr.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.f6759lr.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.f6760ri.put(next + "." + i + "." + next2, objOpt2);
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((JSONArray) objOpt3).length(); i2++) {
                                    this.f6760ri.put(next + "." + next3 + "." + i2, ((JSONArray) objOpt3).opt(i2));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, FirebaseAnalytics.Param.COUPON)) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.f6760ri.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                m8602ri(next, next3, objOpt3);
                            } else {
                                this.f6760ri.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                this.f6760ri.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.f6760ri.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.f6760ri.put(next + "." + next5, objOpt5);
                }
            }
        }
    }
}
