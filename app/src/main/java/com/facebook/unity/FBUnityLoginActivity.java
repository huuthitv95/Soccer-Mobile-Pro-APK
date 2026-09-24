package com.facebook.unity;

import android.os.Bundle;
import com.facebook.CallbackManager;

/* JADX INFO: loaded from: classes4.dex */
public class FBUnityLoginActivity extends BaseActivity {
    public static final String LOGIN_PARAMS = "login_params";
    public static final String LOGIN_TYPE = "login_type";

    /* JADX INFO: renamed from: com.facebook.unity.FBUnityLoginActivity$1 */
    static /* synthetic */ class C78031 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType;

        static {
            int[] iArr = new int[LoginType.values().length];
            $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType = iArr;
            try {
                iArr[LoginType.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum LoginType {
        READ,
        PUBLISH,
        TV_READ,
        TV_PUBLISH
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LoginType loginType = (LoginType) getIntent().getSerializableExtra(LOGIN_TYPE);
        String stringExtra = getIntent().getStringExtra(LOGIN_PARAMS);
        int i = C78031.$SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[loginType.ordinal()];
        if (i == 1) {
            FBLogin.loginWithReadPermissions(stringExtra, this);
            return;
        }
        if (i == 2) {
            FBLogin.loginWithPublishPermissions(stringExtra, this);
        } else if (i == 3) {
            FBLogin.loginForTVWithReadPermissions(stringExtra, this);
        } else {
            if (i != 4) {
                return;
            }
            FBLogin.loginForTVWithPublishPermissions(stringExtra, this);
        }
    }
}
