package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3276bu {

    /* JADX INFO: renamed from: lr */
    private ri f11180lr;

    /* JADX INFO: renamed from: ri */
    private ri f11181ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.bu$ri */
    /* JADX INFO: loaded from: classes9.dex */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        C15462ri f11182lr;

        /* JADX INFO: renamed from: ri */
        C15462ri f11183ri;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.bu$ri$ri, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes3.dex */
        public static class C15462ri {

            /* JADX INFO: renamed from: ri */
            String f11184ri;

            public C15462ri(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.f11184ri = jSONObject.optString("entry");
            }

            /* JADX INFO: renamed from: ri */
            public boolean m14030ri() {
                return !TextUtils.isEmpty(this.f11184ri);
            }
        }

        public ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.f11183ri = new C15462ri(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has(MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL)) {
                this.f11182lr = new C15462ri(jSONObject.optJSONObject(MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL));
            }
        }

        /* JADX INFO: renamed from: ri */
        public String m14028ri(boolean z) {
            if (z) {
                C15462ri c15462ri = this.f11183ri;
                return c15462ri != null ? c15462ri.f11184ri : "";
            }
            C15462ri c15462ri2 = this.f11182lr;
            return c15462ri2 != null ? c15462ri2.f11184ri : "";
        }

        /* JADX INFO: renamed from: ri */
        public boolean m14029ri() {
            C15462ri c15462ri = this.f11182lr;
            if (c15462ri != null && c15462ri.m14030ri()) {
                return true;
            }
            C15462ri c15462ri2 = this.f11183ri;
            return c15462ri2 != null && c15462ri2.m14030ri();
        }
    }

    public C3276bu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.f11181ri = new ri(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.f11180lr = new ri(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    /* JADX INFO: renamed from: ik */
    public static ri m14024ik(wjv wjvVar) {
        C3276bu c3276buM14546vk;
        if (wjvVar == null || (c3276buM14546vk = wjvVar.m14546vk()) == null) {
            return null;
        }
        return c3276buM14546vk.f11181ri;
    }

    /* JADX INFO: renamed from: lr */
    public static ri m14025lr(wjv wjvVar) {
        C3276bu c3276buM14546vk;
        if (wjvVar == null || (c3276buM14546vk = wjvVar.m14546vk()) == null) {
            return null;
        }
        return c3276buM14546vk.f11180lr;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14026ri(wjv wjvVar) {
        return m14027ri(wjvVar, false);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14027ri(wjv wjvVar, boolean z) {
        C3276bu c3276buM14546vk;
        if (wjvVar == null || (c3276buM14546vk = wjvVar.m14546vk()) == null) {
            return false;
        }
        if (z) {
            ri riVar = c3276buM14546vk.f11180lr;
            return riVar != null && riVar.m14029ri();
        }
        ri riVar2 = c3276buM14546vk.f11181ri;
        return riVar2 != null && riVar2.m14029ri();
    }
}
