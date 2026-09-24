package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tool.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3539ri {
    /* JADX INFO: renamed from: ri */
    private static FilterWord m16094ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordM16094ri = m16094ri(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordM16094ri != null && filterWordM16094ri.isValid()) {
                        filterWord.addOption(filterWordM16094ri);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m16095ri(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectM16097ri = m16097ri(it.next());
            if (jSONObjectM16097ri != null) {
                jSONArray.put(jSONObjectM16097ri);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ri */
    public static List<FilterWord> m16096ri(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord filterWordM16094ri = m16094ri(jSONArray.optJSONObject(i));
                if (filterWordM16094ri != null && filterWordM16094ri.isValid()) {
                    arrayList.add(filterWordM16094ri);
                }
            }
        } catch (JSONException e) {
            C2707ac.m10196ik("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private static JSONObject m16097ri(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(m16097ri(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
