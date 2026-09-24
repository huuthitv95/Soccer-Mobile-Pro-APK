package com.facebook.unity;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.widget.JoinAppGroupDialog;

/* JADX INFO: loaded from: classes4.dex */
public class FBUnityJoinGameGroupActivity extends BaseActivity {
    public static String JOIN_GAME_GROUP_PARAMS = "join_game_group_params";

    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra(JOIN_GAME_GROUP_PARAMS);
        final UnityMessage unityMessage = new UnityMessage("OnJoinGroupComplete");
        if (bundleExtra.containsKey(Constants.CALLBACK_ID_KEY)) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, bundleExtra.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = bundleExtra.containsKey("id") ? bundleExtra.getString("id") : "";
        JoinAppGroupDialog joinAppGroupDialog = new JoinAppGroupDialog(this);
        joinAppGroupDialog.registerCallback(this.mCallbackManager, new FacebookCallback<JoinAppGroupDialog.Result>() { // from class: com.facebook.unity.FBUnityJoinGameGroupActivity.1
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getLocalizedMessage());
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(JoinAppGroupDialog.Result result) {
                unityMessage.put(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETE_KEY, true);
                unityMessage.send();
            }
        });
        joinAppGroupDialog.show(string);
    }
}
