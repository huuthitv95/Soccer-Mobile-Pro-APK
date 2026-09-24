package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2007ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.component.xha.p169ik.C2736ik;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.C3300oh;
import com.bytedance.sdk.openadsdk.utils.C3571ig;

/* JADX INFO: loaded from: classes3.dex */
public final class PAGConfig implements InitConfig {
    private static String xha;

    /* JADX INFO: renamed from: di */
    private String f8550di;

    /* JADX INFO: renamed from: fi */
    private String f8551fi;

    /* JADX INFO: renamed from: ik */
    private int f8552ik = -1;

    /* JADX INFO: renamed from: ka */
    private int f8553ka = 0;

    /* JADX INFO: renamed from: lr */
    private boolean f8554lr;

    /* JADX INFO: renamed from: mj */
    private String f8555mj;

    /* JADX INFO: renamed from: ri */
    private String f8556ri;

    public static class Builder {

        /* JADX INFO: renamed from: di */
        private String f8557di;

        /* JADX INFO: renamed from: fi */
        private String[] f8558fi;

        /* JADX INFO: renamed from: lr */
        private boolean f8561lr;

        /* JADX INFO: renamed from: ri */
        private String f8563ri;
        private String xha;

        /* JADX INFO: renamed from: ik */
        private int f8559ik = -1;

        /* JADX INFO: renamed from: ka */
        private int f8560ka = 0;

        /* JADX INFO: renamed from: mj */
        private String f8562mj = "";

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder appId(String str) {
            this.f8563ri = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.m11071lr(this.f8563ri);
            pAGConfig.m11068lr(this.f8560ka);
            pAGConfig.m11072ri(this.f8559ik);
            pAGConfig.m11077ri(this.f8561lr);
            pAGConfig.m11065ik(this.f8557di);
            pAGConfig.m11076ri(this.xha);
            pAGConfig.m11067ka(this.f8562mj);
            return pAGConfig;
        }

        public Builder debugLog(boolean z) {
            this.f8561lr = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.f8558fi = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.f8562mj = str;
            return this;
        }

        public Builder setPAConsent(int i) {
            if (i == 0 || i == 1) {
                this.f8559ik = i;
                return this;
            }
            this.f8559ik = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f8557di = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.xha = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.f8560ka = i;
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }
    }

    public static void debugLog(boolean z) {
        if (C3300oh.m14646ri() != null) {
            if (z) {
                C3300oh.m14646ri().mo13486lr(1);
                C3300oh.m14646ri().mo13485lr();
                return;
            }
            C3300oh.m14646ri().mo13486lr(0);
            C2736ik.m10351ri(C2736ik.ri.OFF);
            C2730vr.m10315lr();
            C2007ik.m6437lr();
            C2707ac.m10199lr();
        }
    }

    public static int getPAConsent() {
        if (C3571ig.jbs("getPAConsent")) {
            return C3300oh.m14646ri().mo13479fi();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11065ik(String str) {
        this.f8551fi = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m11067ka(String str) {
        this.f8555mj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m11068lr(int i) {
        this.f8553ka = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m11071lr(String str) {
        this.f8556ri = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11072ri(int i) {
        this.f8552ik = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11076ri(String str) {
        this.f8550di = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11077ri(boolean z) {
        this.f8554lr = z;
    }

    public static void setAppIconId(int i) {
        if (C3300oh.m14646ri() != null) {
            C3300oh.m14646ri().mo13480ik(i);
        }
    }

    public static void setPAConsent(int i) {
        if (C3571ig.jbs("setPAConsent")) {
            if (i == 1 || i == 0) {
                C3300oh.m14646ri().mo13484ka(i);
            } else {
                C3300oh.m14646ri().mo13484ka(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        xha = str;
    }

    public static void setUserData(String str) {
        if (C3300oh.m14646ri() != null) {
            C3300oh.m14646ri().mo13487lr(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.f8555mj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.f8556ri;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.f8550di;
    }

    public boolean getDebugLog() {
        return this.f8554lr;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.f8552ik;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.f8551fi) ? xha : this.f8551fi;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.f8553ka;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }
}
