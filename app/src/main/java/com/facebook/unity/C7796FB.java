package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.applinks.AppLinkData;
import com.facebook.gamingservices.GamingImageUploader;
import com.facebook.gamingservices.GamingVideoUploader;
import com.facebook.gamingservices.cloudgaming.AppToUserNotificationSender;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.GameFeaturesLibrary;
import com.facebook.gamingservices.cloudgaming.InAppAdLibrary;
import com.facebook.gamingservices.cloudgaming.InAppPurchaseLibrary;
import com.facebook.gamingservices.cloudgaming.PlayableAdsLibrary;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.login.LoginManager;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.widget.ShareDialog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C11744X3;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Currency;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.unity.FB */
/* JADX INFO: loaded from: classes4.dex */
public class C7796FB {
    static final String FB_UNITY_OBJECT = "UnityFacebookSDKPlugin";
    static final String TAG = "com.facebook.unity.FB";
    private static AppEventsLogger appEventsLogger;
    private static Intent clearedIntent;
    private static Intent intent;
    private static AtomicBoolean activateAppCalled = new AtomicBoolean();
    static ShareDialog.Mode ShareDialogMode = ShareDialog.Mode.AUTOMATIC;

    public static void ActivateApp() {
        AppEventsLogger.activateApp(getUnityActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ActivateApp(String str) {
        if (!activateAppCalled.compareAndSet(false, true)) {
            Log.w(TAG, "Activite app only needs to be called once");
            return;
        }
        final Activity unityActivity = getUnityActivity();
        if (str != null) {
            AppEventsLogger.activateApp(unityActivity.getApplication(), str);
        } else {
            AppEventsLogger.activateApp(unityActivity.getApplication());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.unity.FB.9
            @Override // java.lang.Runnable
            public void run() {
                ActivityLifecycleTracker.onActivityCreated(unityActivity);
                ActivityLifecycleTracker.onActivityResumed(unityActivity);
            }
        });
    }

    public static void AppRequest(String str) {
        Log.v(TAG, "AppRequest(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityGameRequestActivity.class);
        intent2.putExtra(FBUnityGameRequestActivity.GAME_REQUEST_PARAMS, UnityParams.parse(str).getStringParams());
        getUnityActivity().startActivity(intent2);
    }

    public static void ClearAppLink() {
        Log.v(TAG, "ClearAppLink");
        clearedIntent = intent;
    }

    public static void ConsumePurchase(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnConsumePurchaseComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppPurchaseLibrary.consumePurchase(getUnityActivity().getApplicationContext(), new JSONObject().put("purchaseToken", unityParams.getString("purchaseToken")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void CreateTournament(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnCreateTournamentComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int i = Integer.parseInt(unityParams.getString(SDKConstants.PARAM_INITIAL_SCORE));
            String string = unityParams.getString("title");
            String string2 = unityParams.getString("imageBase64DataUrl");
            String string3 = unityParams.getString(SDKConstants.PARAM_SORT_ORDER);
            String string4 = unityParams.getString(SDKConstants.PARAM_SCORE_FORMAT);
            Bundle stringParams = unityParams.getParamsObject("data").getStringParams();
            JSONObject jSONObject = new JSONObject();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", e.getMessage()));
                }
            }
            try {
                GameFeaturesLibrary.createTournamentAsync(getUnityActivity().getApplicationContext(), i, string, string2, string3, string4, null, jSONObject, createDaemonCallback(unityMessage));
            } catch (JSONException e2) {
                unityMessage.sendError(e2.getMessage());
            }
        } catch (NumberFormatException e3) {
            unityMessage.sendError(String.format("Invalid initialScore: %s", e3.getMessage()));
        }
    }

    public static void FeedShare(String str) {
        Log.v(TAG, "FeedShare(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialog.Mode.FEED);
        intent2.putExtra(FBUnityDialogsActivity.FEED_DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void FetchDeferredAppLinkData(String str) {
        LogMethodCall("FetchDeferredAppLinkData", str);
        UnityParams unityParams = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnFetchDeferredAppLinkComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        AppLinkData.fetchDeferredAppLinkData(getUnityActivity(), new AppLinkData.CompletionHandler() { // from class: com.facebook.unity.FB.3
            @Override // com.facebook.applinks.AppLinkData.CompletionHandler
            public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                C7796FB.addAppLinkToMessage(unityMessage, appLinkData);
                unityMessage.send();
            }
        });
    }

    public static void GameGroupCreate(String str) {
        Log.v(TAG, "GameGroupCreate(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityCreateGameGroupActivity.class);
        intent2.putExtra(FBUnityCreateGameGroupActivity.CREATE_GAME_GROUP_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void GameGroupJoin(String str) {
        Log.v(TAG, "GameGroupJoin(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityJoinGameGroupActivity.class);
        intent2.putExtra(FBUnityJoinGameGroupActivity.JOIN_GAME_GROUP_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void GetAppLink(String str) {
        Log.v(TAG, "GetAppLink(" + str + ")");
        UnityMessage unityMessageCreateWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnGetAppLinkComplete", UnityParams.parse(str));
        Intent intent2 = intent;
        if (intent2 == null) {
            unityMessageCreateWithCallbackFromParams.put("did_complete", true);
            unityMessageCreateWithCallbackFromParams.send();
            return;
        }
        if (intent2 == clearedIntent) {
            unityMessageCreateWithCallbackFromParams.put("did_complete", true);
            unityMessageCreateWithCallbackFromParams.send();
            return;
        }
        AppLinkData appLinkDataCreateFromAlApplinkData = AppLinkData.createFromAlApplinkData(intent2);
        if (appLinkDataCreateFromAlApplinkData != null) {
            addAppLinkToMessage(unityMessageCreateWithCallbackFromParams, appLinkDataCreateFromAlApplinkData);
            unityMessageCreateWithCallbackFromParams.put("url", intent.getDataString());
        } else if (intent.getData() != null) {
            unityMessageCreateWithCallbackFromParams.put("url", intent.getDataString());
        } else {
            unityMessageCreateWithCallbackFromParams.put("did_complete", true);
        }
        unityMessageCreateWithCallbackFromParams.send();
    }

    public static void GetCatalog(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetCatalogComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getCatalog(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static String GetCurrentProfile() {
        if (!FacebookSdk.isInitialized()) {
            return null;
        }
        Profile currentProfile = Profile.getCurrentProfile();
        try {
            JSONObject jSONObject = new JSONObject();
            if (currentProfile != null) {
                String id = currentProfile.getId();
                String firstName = currentProfile.getFirstName();
                String middleName = currentProfile.getMiddleName();
                String lastName = currentProfile.getLastName();
                String name = currentProfile.getName();
                Uri linkUri = currentProfile.getLinkUri();
                if (id != null) {
                    jSONObject.put(SDKConstants.PARAM_USER_ID, id);
                }
                if (firstName != null) {
                    jSONObject.put("firstName", firstName);
                }
                if (middleName != null) {
                    jSONObject.put("middleName", middleName);
                }
                if (lastName != null) {
                    jSONObject.put("lastName", lastName);
                }
                if (name != null) {
                    jSONObject.put("name", name);
                }
                if (linkUri != null) {
                    jSONObject.put("linkURL", linkUri.toString());
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void GetPayload(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPayloadComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getPayload(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void GetPurchases(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPurchasesComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getPurchases(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static String GetSdkVersion() {
        return FacebookSdk.getSdkVersion();
    }

    public static void GetTournament(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetTournamentComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getTournamentAsync(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    public static String GetUserID() {
        if (FacebookSdk.isInitialized()) {
            return AppEventsLogger.getUserID();
        }
        return null;
    }

    public static void Init(String str) {
        Log.v(TAG, "Init(" + str + ")");
        StringBuilder sb = new StringBuilder("couldn't parse init params: ");
        sb.append(str);
        UnityParams unityParams = UnityParams.parse(str, sb.toString());
        final String string = unityParams.hasString(RemoteConfigConstants.RequestFieldKey.APP_ID).booleanValue() ? unityParams.getString(RemoteConfigConstants.RequestFieldKey.APP_ID) : Utility.getMetadataApplicationId(getUnityActivity());
        FacebookSdk.setApplicationId(string);
        FacebookSdk.sdkInitialize(getUnityActivity(), new FacebookSdk.InitializeCallback() { // from class: com.facebook.unity.FB.1
            @Override // com.facebook.FacebookSdk.InitializeCallback
            public void onInitialized() {
                UnityMessage unityMessage = new UnityMessage("OnInitComplete");
                AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                if (currentAccessToken != null) {
                    FBLogin.addLoginParametersToMessage(unityMessage, currentAccessToken, null);
                } else {
                    unityMessage.put("key_hash", C7796FB.getKeyHash());
                }
                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    C7796FB.ActivateApp(string);
                }
                unityMessage.send();
            }
        });
    }

    public static void InitCloudGame(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnInitCloudGameComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            AccessToken accessTokenInit = CloudGameLoginHandler.init(getUnityActivity().getApplicationContext(), 25);
            UnityMessage unityMessage2 = new UnityMessage("OnLoginComplete");
            if (accessTokenInit == null) {
                unityMessage.sendError("Failed to receive access token.");
                return;
            }
            FBLogin.addLoginParametersToMessage(unityMessage2, accessTokenInit, null);
            unityMessage2.send();
            unityMessage.put("success", "");
            unityMessage.send();
        } catch (FacebookException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static boolean IsImplicitPurchaseLoggingEnabled() {
        return AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
    }

    public static void LoadInterstitialAd(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadInterstitialAdComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.loadInterstitialAd(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", unityParams.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void LoadRewardedVideo(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadRewardedVideoComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.loadRewardedVideo(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", unityParams.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void LogAppEvent(String str) {
        String str2 = TAG;
        Log.v(str2, "LogAppEvent(" + str + ")");
        UnityParams unityParams = UnityParams.parse(str);
        Bundle bundle = new Bundle();
        if (unityParams.has("parameters")) {
            bundle = unityParams.getParamsObject("parameters").getStringParams();
        }
        if (unityParams.has("logPurchase")) {
            getAppEventsLogger().logPurchase(new BigDecimal(unityParams.getDouble("logPurchase")), Currency.getInstance(unityParams.getString("currency")), bundle);
            return;
        }
        if (!unityParams.hasString("logEvent").booleanValue()) {
            Log.e(str2, "couldn't logPurchase or logEvent params: " + str);
        } else if (unityParams.has("valueToSum")) {
            getAppEventsLogger().logEvent(unityParams.getString("logEvent"), unityParams.getDouble("valueToSum"), bundle);
        } else {
            getAppEventsLogger().logEvent(unityParams.getString("logEvent"), bundle);
        }
    }

    private static void LogMethodCall(String str, String str2) {
        Log.v(TAG, String.format(Locale.ROOT, "%s(%s)", str, str2));
    }

    public static void LoginForTVWithPublishPermissions(String str) {
        Log.v(TAG, "LoginForTVWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_PUBLISH);
        getUnityActivity().startActivity(intent2);
    }

    public static void LoginWithPublishPermissions(String str) {
        Log.v(TAG, "LoginWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.PUBLISH);
        getUnityActivity().startActivity(intent2);
    }

    public static void LoginWithReadPermissions(String str) {
        Log.v(TAG, "LoginWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.READ);
        getUnityActivity().startActivity(intent2);
    }

    public static void Logout(String str) {
        Log.v(TAG, "Logout(" + str + ")");
        LoginManager.getInstance().logOut();
        UnityMessage unityMessage = new UnityMessage("OnLogoutComplete");
        unityMessage.put("did_complete", true);
        unityMessage.send();
    }

    public static void OnIAPReady(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOnIAPReadyComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.onReady(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void OpenAppStore(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOpenAppStoreComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        PlayableAdsLibrary.openAppStore(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void OpenFriendFinderDialog(String str) {
        Log.v(TAG, "OpenFriendFinderDialog(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityGamingServicesFriendFinderActivity.class);
        intent2.putExtra(FBUnityGamingServicesFriendFinderActivity.DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void PostSessionScore(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostSessionScoreComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            try {
                GameFeaturesLibrary.postSessionScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(unityParams.getString("score")), createDaemonCallback(unityMessage));
            } catch (JSONException e) {
                unityMessage.sendError(e.getMessage());
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", e2.getMessage()));
        }
    }

    public static void PostTournamentScore(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostTournamentScoreComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            try {
                GameFeaturesLibrary.postTournamentScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(unityParams.getString("score")), createDaemonCallback(unityMessage));
            } catch (JSONException e) {
                unityMessage.sendError(e.getMessage());
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", e2.getMessage()));
        }
    }

    public static void Purchase(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPurchaseComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = unityParams.getString("productID");
        String string2 = unityParams.getString("developerPayload");
        try {
            JSONObject jSONObjectPut = new JSONObject().put("productID", string);
            if (!string2.isEmpty()) {
                jSONObjectPut.put("developerPayload", string2);
            }
            InAppPurchaseLibrary.purchase(getUnityActivity().getApplicationContext(), jSONObjectPut, createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void RefreshCurrentAccessToken(String str) {
        LogMethodCall("RefreshCurrentAccessToken", str);
        UnityParams unityParams = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnRefreshCurrentAccessTokenComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        AccessToken.refreshCurrentAccessTokenAsync(new AccessToken.AccessTokenRefreshCallback() { // from class: com.facebook.unity.FB.4
            @Override // com.facebook.AccessToken.AccessTokenRefreshCallback
            public void OnTokenRefreshFailed(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
            }

            @Override // com.facebook.AccessToken.AccessTokenRefreshCallback
            public void OnTokenRefreshed(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(unityMessage, accessToken, null);
                unityMessage.send();
            }
        });
    }

    public static void RetrieveLoginStatus(String str) {
        final String string;
        String str2 = TAG;
        Log.v(str2, "RetrieveLoginStatus(" + str + ")");
        if (!FacebookSdk.isInitialized()) {
            Log.w(str2, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginStatusRetrieved");
        unityMessage.put("key_hash", getKeyHash());
        UnityParams unityParams = UnityParams.parse(str, "couldn't parse login params: " + str);
        if (unityParams.has(Constants.CALLBACK_ID_KEY)) {
            string = unityParams.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        } else {
            string = null;
        }
        LoginManager.getInstance().retrieveLoginStatus(getUnityActivity(), new LoginStatusCallback() { // from class: com.facebook.unity.FB.2
            @Override // com.facebook.LoginStatusCallback
            public void onCompleted(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(unityMessage, accessToken, string);
                unityMessage.send();
            }

            @Override // com.facebook.LoginStatusCallback
            public void onError(Exception exc) {
                unityMessage.sendError(exc.getMessage());
            }

            @Override // com.facebook.LoginStatusCallback
            public void onFailure() {
                unityMessage.put(C11744X3.i.f26392t, true);
                unityMessage.send();
            }
        });
    }

    public static void ScheduleAppToUserNotification(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnScheduleAppToUserNotificationComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = unityParams.getString("title");
        String string2 = unityParams.getString("body");
        Uri uriBuild = Uri.parse(unityParams.getString("media"));
        if (uriBuild.getScheme() == null) {
            uriBuild = uriBuild.buildUpon().scheme(C11744X3.i.f26356b).build();
        }
        Uri uri = uriBuild;
        try {
            int i = Integer.parseInt(unityParams.getString("timeInterval"));
            String string3 = unityParams.getString("payload");
            if (string3.equals(AbstractJsonLexerKt.NULL)) {
                string3 = null;
            }
            try {
                AppToUserNotificationSender.scheduleAppToUserNotification(string, string2, uri, i, string3, new GraphRequest.Callback() { // from class: com.facebook.unity.FB.7
                    @Override // com.facebook.GraphRequest.Callback
                    public void onCompleted(GraphResponse graphResponse) {
                        if (graphResponse.getError() != null) {
                            unityMessage.sendError(graphResponse.getError().toString());
                        } else {
                            unityMessage.put("success", "");
                            unityMessage.send();
                        }
                    }
                });
            } catch (FileNotFoundException e) {
                unityMessage.sendError(String.format(e.getMessage(), new Object[0]));
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid timeInterval: %s", e2.getMessage()));
        }
    }

    public static void SetAdvertiserIDCollectionEnabled(String str) {
        Log.v(TAG, "SetAdvertiserIDCollectionEnabled(" + str + ")");
        FacebookSdk.setAdvertiserIDCollectionEnabled(Boolean.valueOf(str).booleanValue());
    }

    public static void SetAutoLogAppEventsEnabled(String str) {
        Log.v(TAG, "SetAutoLogAppEventsEnabled(" + str + ")");
        FacebookSdk.setAutoLogAppEventsEnabled(Boolean.valueOf(str).booleanValue());
    }

    public static void SetDataProcessingOptions(String str) {
        Log.v(TAG, "SetDataProcessingOptions(" + str + ")");
        try {
            JSONObject jSONObject = UnityParams.parse(str).json;
            JSONArray jSONArray = jSONObject.getJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            int iOptInt = jSONObject.optInt("country", 0);
            int iOptInt2 = jSONObject.optInt("state", 0);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            FacebookSdk.setDataProcessingOptions(strArr, iOptInt, iOptInt2);
        } catch (Exception unused) {
        }
    }

    public static void SetIntent(Intent intent2) {
        intent = intent2;
    }

    public static void SetLimitEventUsage(String str) {
        Log.v(TAG, "SetLimitEventUsage(" + str + ")");
        FacebookSdk.setLimitEventAndDataUsage(getUnityActivity().getApplicationContext(), Boolean.valueOf(str).booleanValue());
    }

    public static void SetShareDialogMode(String str) {
        Log.v(TAG, "SetShareDialogMode(" + str + ")");
        if (str.equalsIgnoreCase("NATIVE")) {
            ShareDialogMode = ShareDialog.Mode.NATIVE;
            return;
        }
        if (str.equalsIgnoreCase("WEB")) {
            ShareDialogMode = ShareDialog.Mode.WEB;
        } else if (str.equalsIgnoreCase("FEED")) {
            ShareDialogMode = ShareDialog.Mode.FEED;
        } else {
            ShareDialogMode = ShareDialog.Mode.AUTOMATIC;
        }
    }

    public static void SetUserAgentSuffix(String str) {
        Log.v(TAG, "SetUserAgentSuffix(" + str + ")");
        InternalSettings.setCustomUserAgent(str);
    }

    public static void SetUserID(String str) {
        Log.v(TAG, "SetUserID(" + str + ")");
        AppEventsLogger.setUserID(str);
    }

    public static void ShareLink(String str) {
        Log.v(TAG, "ShareLink(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialogMode);
        intent2.putExtra(FBUnityDialogsActivity.SHARE_DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void ShareTournament(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShareTournamentComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int i = Integer.parseInt(unityParams.getString("score"));
            JSONObject jSONObject = new JSONObject();
            Bundle stringParams = unityParams.getParamsObject("data").getStringParams();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", e.getMessage()));
                }
            }
            try {
                GameFeaturesLibrary.shareTournamentAsync(getUnityActivity().getApplicationContext(), Integer.valueOf(i), jSONObject, createDaemonCallback(unityMessage));
            } catch (JSONException e2) {
                unityMessage.sendError(e2.getMessage());
            }
        } catch (NumberFormatException e3) {
            unityMessage.sendError(String.format("Invalid score: %s", e3.getMessage()));
        }
    }

    public static void ShowInterstitialAd(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowInterstitialAdComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.showInterstitialAd(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", unityParams.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void ShowRewardedVideo(String str) {
        UnityParams unityParams = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowRewardedVideoComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.showRewardedVideo(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", unityParams.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void UpdateUserProperties(String str) {
        Log.v(TAG, "UpdateUserProperties(" + str + ")");
        AppEventsLogger.updateUserProperties(UnityParams.parse(str).getStringParams(), null);
    }

    public static void UploadImageToMediaLibrary(String str) {
        Log.v(TAG, "UploadImageToMediaLibrary(" + str + ")");
        UnityParams unityParams = UnityParams.parse(str);
        String string = unityParams.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri uriBuild = Uri.parse(unityParams.getString("imageUri"));
        if (uriBuild.getScheme() == null) {
            uriBuild = uriBuild.buildUpon().scheme(C11744X3.i.f26356b).build();
        }
        boolean z = Boolean.parseBoolean(unityParams.getString("shouldLaunchMediaDialog"));
        final UnityMessage unityMessage = new UnityMessage("OnUploadImageToMediaLibraryComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingImageUploader(getUnityActivity()).uploadToMediaLibrary(string, uriBuild, z, new GraphRequest.Callback() { // from class: com.facebook.unity.FB.5
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        unityMessage.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String strOptString = graphResponse.getGraphObject().optString("id", null);
                    if (strOptString == null) {
                        unityMessage.sendError("Response did not contain ImageID");
                    } else {
                        unityMessage.put("id", strOptString);
                        unityMessage.send();
                    }
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    public static void UploadVideoToMediaLibrary(String str) {
        Log.v(TAG, "UploadVideoToMediaLibrary(" + str + ")");
        UnityParams unityParams = UnityParams.parse(str);
        String string = unityParams.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri uriBuild = Uri.parse(unityParams.getString("videoUri"));
        if (uriBuild.getScheme() == null) {
            uriBuild = uriBuild.buildUpon().scheme(C11744X3.i.f26356b).build();
        }
        final UnityMessage unityMessage = new UnityMessage("OnUploadVideoToMediaLibraryComplete");
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingVideoUploader(getUnityActivity()).uploadToMediaLibrary(string, uriBuild, new GraphRequest.OnProgressCallback() { // from class: com.facebook.unity.FB.6
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        unityMessage.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String strOptString = graphResponse.getGraphObject().optString("video_id", null);
                    if (strOptString == null) {
                        unityMessage.sendError("Response did not contain ImageID");
                    } else {
                        unityMessage.put("video_id", strOptString);
                        unityMessage.send();
                    }
                }

                @Override // com.facebook.GraphRequest.OnProgressCallback
                public void onProgress(long j, long j2) {
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addAppLinkToMessage(UnityMessage unityMessage, AppLinkData appLinkData) {
        if (appLinkData == null) {
            unityMessage.put("did_complete", true);
            return;
        }
        unityMessage.put("ref", appLinkData.getRef());
        unityMessage.put("target_url", appLinkData.getTargetUri().toString());
        try {
            if (appLinkData.getArgumentBundle() != null) {
                unityMessage.put("extras", BundleJSONConverter.convertToJSON(appLinkData.getArgumentBundle()).toString());
            }
        } catch (JSONException e) {
            Log.e(TAG, e.getLocalizedMessage());
        }
    }

    private static DaemonRequest.Callback createDaemonCallback(final UnityMessage unityMessage) {
        return new DaemonRequest.Callback() { // from class: com.facebook.unity.FB.8
            @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                FacebookRequestError error = graphResponse.getError();
                if (error != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorCode", error.getErrorCode());
                        jSONObject.put("subErrorCode", error.getSubErrorCode());
                        jSONObject.put("errorType", error.getErrorType());
                        jSONObject.put("errorMessage", error.getErrorMessage());
                        unityMessage.sendError(jSONObject.toString());
                        return;
                    } catch (JSONException unused) {
                        unityMessage.sendError(error.toString());
                        return;
                    }
                }
                if (graphResponse.getGraphObject() != null) {
                    unityMessage.put("success", graphResponse.getGraphObject().toString());
                    unityMessage.send();
                } else if (graphResponse.getGraphObjectArray() == null) {
                    unityMessage.sendError("invalid response");
                } else {
                    unityMessage.put("success", graphResponse.getGraphObjectArray().toString());
                    unityMessage.send();
                }
            }
        };
    }

    private static AppEventsLogger getAppEventsLogger() {
        if (appEventsLogger == null) {
            appEventsLogger = AppEventsLogger.newLogger(getUnityActivity().getApplicationContext());
        }
        return appEventsLogger;
    }

    public static String getKeyHash() {
        try {
            Activity unityActivity = getUnityActivity();
            if (unityActivity == null) {
                return "";
            }
            Signature[] signatureArr = unityActivity.getPackageManager().getPackageInfo(unityActivity.getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                Signature signature = signatureArr[0];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 0);
                Log.d(TAG, "KeyHash: " + strEncodeToString);
                return strEncodeToString;
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return "";
    }

    public static Activity getUnityActivity() {
        return UnityReflection.GetUnityActivity();
    }

    public static void loginForTVWithReadPermissions(String str) {
        Log.v(TAG, "loginForTVWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_READ);
        getUnityActivity().startActivity(intent2);
    }

    private static void startActivity(Class<?> cls, String str) {
        Intent intent2 = new Intent(getUnityActivity(), cls);
        intent2.putExtra(BaseActivity.ACTIVITY_PARAMS, UnityParams.parse(str).getStringParams());
        getUnityActivity().startActivity(intent2);
    }
}
