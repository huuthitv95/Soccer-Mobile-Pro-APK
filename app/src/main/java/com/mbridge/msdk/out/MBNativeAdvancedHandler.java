package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.advanced.middle.C12661c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MBNativeAdvancedHandler {
    private C12661c nativeAdvancedProvider;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.MBNativeAdvancedHandler$1 */
    static /* synthetic */ class C134431 {
        static final /* synthetic */ int[] $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum;

        static {
            int[] iArr = new int[MBMultiStateEnum.values().length];
            $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum = iArr;
            try {
                iArr[MBMultiStateEnum.negative.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.undefined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBNativeAdvancedHandler(Activity activity, String str, String str2) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.nativeAdvancedProvider = new C12661c(str, str2, activity);
    }

    public void autoLoopPlay(int i) {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34523h(i);
        }
    }

    public ViewGroup getAdViewGroup() {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            return c12661c.m34516d();
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        C12661c c12661c = this.nativeAdvancedProvider;
        return c12661c != null ? c12661c.m34514c() : "";
    }

    public String getRequestId() {
        C12661c c12661c = this.nativeAdvancedProvider;
        return c12661c != null ? c12661c.m34519e() : "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void load() throws Throwable {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34515c("");
        }
    }

    public void loadByToken(String str) throws Throwable {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34518d(str);
        }
    }

    public void onPause() {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34521f(3);
        }
    }

    public void onResume() {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34524i(3);
        }
    }

    public void release() {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34508b();
        }
    }

    public void setAdListener(NativeAdvancedAdListener nativeAdvancedAdListener) {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34506a(nativeAdvancedAdListener);
        }
    }

    public void setCloseButtonState(MBMultiStateEnum mBMultiStateEnum) {
        int i = C134431.$SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[mBMultiStateEnum.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            i2 = -1;
        }
        this.nativeAdvancedProvider.m34509b(i2);
    }

    public void setNativeViewSize(int i, int i2) {
        this.nativeAdvancedProvider.m34510b(i2, i);
    }

    public void setPlayMuteState(int i) {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34517d(i);
        }
    }

    public void setViewElementStyle(JSONObject jSONObject) {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            c12661c.m34512b(jSONObject);
        }
    }

    public boolean isReady(String str) {
        C12661c c12661c = this.nativeAdvancedProvider;
        if (c12661c != null) {
            return c12661c.m34513b(str);
        }
        return false;
    }
}
