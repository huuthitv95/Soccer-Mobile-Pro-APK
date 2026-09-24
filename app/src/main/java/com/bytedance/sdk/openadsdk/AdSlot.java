package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2009lr;
import com.bytedance.sdk.component.utils.C2730vr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;

    /* JADX INFO: renamed from: ac */
    private int f7857ac;

    /* JADX INFO: renamed from: aw */
    private boolean f7858aw;

    /* JADX INFO: renamed from: ay */
    private int f7859ay;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private String f7860bu;

    /* JADX INFO: renamed from: co */
    private int f7861co;

    /* JADX INFO: renamed from: di */
    private int f7862di;

    /* JADX INFO: renamed from: fi */
    private float f7863fi;

    /* JADX INFO: renamed from: fr */
    private boolean f7864fr;
    private long igq;
    private int ihz;

    /* JADX INFO: renamed from: ik */
    private int f7865ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private float f7866ka;

    /* JADX INFO: renamed from: lr */
    private int f7867lr;

    /* JADX INFO: renamed from: mj */
    private String f7868mj;

    /* JADX INFO: renamed from: nr */
    private String f7869nr;

    /* JADX INFO: renamed from: qt */
    private String f7870qt;

    /* JADX INFO: renamed from: ri */
    private String f7871ri;

    /* JADX INFO: renamed from: sf */
    private String f7872sf;
    private String slm;

    /* JADX INFO: renamed from: su */
    private int f7873su;
    private String tan;

    /* JADX INFO: renamed from: uq */
    private int f7874uq;

    /* JADX INFO: renamed from: vr */
    private String f7875vr;
    private int wjv;
    private boolean xha;

    /* JADX INFO: renamed from: zf */
    private Map<String, Object> f7876zf;

    public static class Builder {

        /* JADX INFO: renamed from: aw */
        private boolean f7878aw;
        private String bgr;

        /* JADX INFO: renamed from: bu */
        private String f7879bu;

        /* JADX INFO: renamed from: co */
        private float f7880co;
        private int ihz;

        /* JADX INFO: renamed from: mj */
        private String f7886mj;

        /* JADX INFO: renamed from: nr */
        private String f7887nr;

        /* JADX INFO: renamed from: qt */
        private int f7888qt;

        /* JADX INFO: renamed from: ri */
        private String f7889ri;

        /* JADX INFO: renamed from: sf */
        private float f7890sf;
        private String slm;

        /* JADX INFO: renamed from: vr */
        private String f7892vr;

        /* JADX INFO: renamed from: lr */
        private int f7885lr = 640;

        /* JADX INFO: renamed from: ik */
        private int f7883ik = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;

        /* JADX INFO: renamed from: ka */
        private final boolean f7884ka = true;

        /* JADX INFO: renamed from: fi */
        private int f7882fi = 1;

        /* JADX INFO: renamed from: di */
        private final String f7881di = "";
        private final int xha = 0;
        private String jbs = "defaultUser";
        private boolean tan = true;

        /* JADX INFO: renamed from: ac */
        private Map<String, Object> f7877ac = null;

        /* JADX INFO: renamed from: uq */
        private int f7891uq = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.f7871ri = this.f7889ri;
            adSlot.f7862di = this.f7882fi;
            adSlot.xha = true;
            adSlot.f7867lr = this.f7885lr;
            adSlot.f7865ik = this.f7883ik;
            float f = this.f7890sf;
            if (f <= 0.0f) {
                adSlot.f7866ka = this.f7885lr;
                adSlot.f7863fi = this.f7883ik;
            } else {
                adSlot.f7866ka = f;
                adSlot.f7863fi = this.f7880co;
            }
            adSlot.f7868mj = "";
            adSlot.jbs = 0;
            adSlot.f7870qt = this.f7886mj;
            adSlot.f7872sf = this.jbs;
            adSlot.f7861co = this.f7888qt;
            adSlot.f7858aw = this.tan;
            adSlot.bgr = this.f7878aw;
            adSlot.f7875vr = this.bgr;
            adSlot.slm = this.f7892vr;
            adSlot.f7860bu = this.slm;
            adSlot.f7869nr = this.f7879bu;
            adSlot.tan = this.f7887nr;
            adSlot.f7876zf = this.f7877ac;
            adSlot.wjv = this.ihz;
            adSlot.f7859ay = this.f7891uq;
            return adSlot;
        }

        public Builder isExpressAd(boolean z) {
            this.f7878aw = z;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.f7882fi = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.f7892vr = str;
            return this;
        }

        public Builder setBannerType(int i) {
            this.f7891uq = i;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f7889ri = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.slm = str;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.ihz = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.f7890sf = f;
            this.f7880co = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.f7879bu = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.f7885lr = i;
            this.f7883ik = i2;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.tan = z;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f7886mj = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.f7888qt = i;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.f7877ac = map;
            return this;
        }

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setUserData(String str) {
            this.f7887nr = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.jbs = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (C2730vr.m10314ik()) {
                C2009lr.m6445ri(str);
            }
            this.bgr = str;
            return this;
        }
    }

    private AdSlot() {
        this.f7858aw = true;
        this.bgr = false;
        this.f7857ac = 0;
        this.ihz = 0;
        this.f7874uq = 0;
        this.f7859ay = 1;
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.f7862di;
    }

    public String getAdId() {
        return this.slm;
    }

    public int getBannerType() {
        return this.f7859ay;
    }

    public String getBidAdm() {
        return this.f7875vr;
    }

    public int getCacheScene() {
        return this.f7873su;
    }

    public long getCacheTime() {
        return this.igq;
    }

    public String getCodeId() {
        return this.f7871ri;
    }

    public String getCreativeId() {
        return this.f7860bu;
    }

    public int getDurationSlotType() {
        return this.wjv;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f7863fi;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f7866ka;
    }

    public String getExt() {
        return this.f7869nr;
    }

    public int getImgAcceptedHeight() {
        return this.f7865ik;
    }

    public int getImgAcceptedWidth() {
        return this.f7867lr;
    }

    public int getIsRotateBanner() {
        return this.f7857ac;
    }

    public String getMediaExtra() {
        return this.f7870qt;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.f7876zf;
    }

    public int getRewardAmount() {
        return this.jbs;
    }

    public String getRewardName() {
        return this.f7868mj;
    }

    public int getRotateOrder() {
        return this.f7874uq;
    }

    public int getRotateTime() {
        return this.ihz;
    }

    public String getUserData() {
        return this.tan;
    }

    public String getUserID() {
        return this.f7872sf;
    }

    public boolean isAutoPlay() {
        return this.f7858aw;
    }

    public boolean isExpressAd() {
        return this.bgr;
    }

    public boolean isPreload() {
        return this.f7864fr;
    }

    public boolean isSupportDeepLink() {
        return this.xha;
    }

    public void setAdCount(int i) {
        this.f7862di = i;
    }

    public void setCacheScene(int i) {
        this.f7873su = i;
    }

    public void setCacheTime(long j) {
        this.igq = j;
    }

    public void setDurationSlotType(int i) {
        this.wjv = i;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.f7866ka = f;
        this.f7863fi = f2;
    }

    public void setIsRotateBanner(int i) {
        this.f7857ac = i;
    }

    public void setPreload(boolean z) {
        this.f7864fr = z;
    }

    public void setRotateOrder(int i) {
        this.f7874uq = i;
    }

    public void setRotateTime(int i) {
        this.ihz = i;
    }

    public void setUserData(String str) {
        this.tan = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f7871ri);
            jSONObject.put("mAdCount", this.f7862di);
            jSONObject.put("mIsAutoPlay", this.f7858aw);
            jSONObject.put("mImgAcceptedWidth", this.f7867lr);
            jSONObject.put("mImgAcceptedHeight", this.f7865ik);
            jSONObject.put("mExpressViewAcceptedWidth", this.f7866ka);
            jSONObject.put("mExpressViewAcceptedHeight", this.f7863fi);
            jSONObject.put("mSupportDeepLink", this.xha);
            jSONObject.put("mRewardName", this.f7868mj);
            jSONObject.put("mRewardAmount", this.jbs);
            jSONObject.put("mMediaExtra", this.f7870qt);
            jSONObject.put("mUserID", this.f7872sf);
            jSONObject.put("mNativeAdType", this.f7861co);
            jSONObject.put("mIsExpressAd", this.bgr);
            jSONObject.put("mAdId", this.slm);
            jSONObject.put("mCreativeId", this.f7860bu);
            jSONObject.put("mExt", this.f7869nr);
            jSONObject.put("mBidAdm", this.f7875vr);
            jSONObject.put("mUserData", this.tan);
            jSONObject.put("mDurationSlotType", this.wjv);
            jSONObject.put("mBannerType", this.f7859ay);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }
}
