package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.remote.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8034f {

    /* JADX INFO: renamed from: a */
    public Set f17832a = null;

    /* JADX INFO: renamed from: a */
    public static C8034f m20452a(JSONObject jSONObject) {
        Track trackFromValue;
        C8034f c8034f = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track");
        if (jSONArrayOptJSONArray != null) {
            c8034f = new C8034f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString) && (trackFromValue = Track.fromValue(strOptString)) != null) {
                    linkedHashSet.add(trackFromValue);
                }
            }
            c8034f.f17832a = linkedHashSet;
        }
        return c8034f;
    }
}
