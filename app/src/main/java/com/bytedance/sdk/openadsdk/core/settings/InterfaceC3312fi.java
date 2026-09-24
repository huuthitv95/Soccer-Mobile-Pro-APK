package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.C2707ac;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.fi */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3312fi {

    /* JADX INFO: renamed from: ri */
    public static final lr<JSONObject> f11567ri = new lr<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fi.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public JSONObject mo14757lr(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                C2707ac.m10206ri("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: lr */
    public static final lr<Set<String>> f11566lr = new lr<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fi.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Set<String> mo14757lr(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                C2707ac.m10206ri("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.fi$lr */
    public interface lr<T> {
        /* JADX INFO: renamed from: lr */
        T mo14757lr(String str);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.fi$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        ri mo14760ri(String str);

        /* JADX INFO: renamed from: ri */
        ri mo14761ri(String str, float f);

        /* JADX INFO: renamed from: ri */
        ri mo14762ri(String str, int i);

        /* JADX INFO: renamed from: ri */
        ri mo14763ri(String str, long j);

        /* JADX INFO: renamed from: ri */
        ri mo14764ri(String str, String str2);

        /* JADX INFO: renamed from: ri */
        ri mo14765ri(String str, boolean z);

        /* JADX INFO: renamed from: ri */
        void mo14766ri();
    }

    /* JADX INFO: renamed from: ri */
    void mo14756ri(JSONObject jSONObject);
}
