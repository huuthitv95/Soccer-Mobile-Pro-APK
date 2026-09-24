package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3288qt {

    /* JADX INFO: renamed from: lr */
    private List<String> f11327lr;

    /* JADX INFO: renamed from: ri */
    private String f11328ri;

    public C3288qt(String str) {
        this.f11328ri = "";
        this.f11327lr = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : m14242ri(str);
        try {
            this.f11328ri = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.f11327lr = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f11327lr.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            C2707ac.m10196ik("AutoTestModel", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private static final HashMap<String, Object> m14242ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: lr */
    public List<String> m14243lr() {
        return this.f11327lr;
    }

    /* JADX INFO: renamed from: ri */
    public String m14244ri() {
        return this.f11328ri;
    }
}
