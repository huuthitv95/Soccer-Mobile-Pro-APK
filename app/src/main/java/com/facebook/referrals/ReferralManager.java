package com.facebook.referrals;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class ReferralManager {
    private static volatile ReferralManager instance;
    private ReferralLogger logger;

    private static class ActivityStartActivityDelegate implements StartActivityDelegate {
        private final Activity activity;

        ActivityStartActivityDelegate(Activity activity) {
            Validate.notNull(activity, "activity");
            this.activity = activity;
        }

        @Override // com.facebook.referrals.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activity;
        }

        @Override // com.facebook.referrals.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            this.activity.startActivityForResult(intent, i);
        }
    }

    private static class FragmentStartActivityDelegate implements StartActivityDelegate {
        private final FragmentWrapper fragment;

        FragmentStartActivityDelegate(FragmentWrapper fragmentWrapper) {
            Validate.notNull(fragmentWrapper, "fragment");
            this.fragment = fragmentWrapper;
        }

        @Override // com.facebook.referrals.StartActivityDelegate
        public Activity getActivityContext() {
            return this.fragment.getActivity();
        }

        @Override // com.facebook.referrals.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            this.fragment.startActivityForResult(intent, i);
        }
    }

    ReferralManager() {
        Validate.sdkInitialized();
    }

    public static ReferralManager getInstance() {
        if (instance == null) {
            synchronized (ReferralManager.class) {
                if (instance == null) {
                    instance = new ReferralManager();
                }
            }
        }
        return instance;
    }

    private ReferralLogger getLogger(Context context) {
        if (context == null) {
            context = FacebookSdk.getApplicationContext();
        }
        if (context == null) {
            return null;
        }
        if (this.logger == null) {
            this.logger = new ReferralLogger(context, FacebookSdk.getApplicationId());
        }
        return this.logger;
    }

    private static boolean resolveIntent(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void startReferralImpl(StartActivityDelegate startActivityDelegate) {
        ReferralLogger logger = getLogger(startActivityDelegate.getActivityContext());
        if (logger != null) {
            logger.logStartReferral();
        }
        if (tryFacebookActivity(startActivityDelegate)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Failed to open Referral dialog: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        if (logger == null) {
            throw facebookException;
        }
        logger.logError(facebookException);
        throw facebookException;
    }

    private boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(ReferralFragment.TAG);
        if (!resolveIntent(intent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(intent, CallbackManagerImpl.RequestCodeOffset.Referral.toRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: JSONException -> 0x0060, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0060, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001a, B:12:0x0036, B:14:0x003c, B:16:0x0046, B:18:0x0057), top: B:36:0x000a }] */
    boolean onActivityResult(int i, Intent intent, FacebookCallback<ReferralResult> facebookCallback) {
        FacebookException facebookException;
        FacebookException facebookException2;
        ReferralResult referralResult;
        if (i != -1 || intent == null) {
            if (i != 0) {
                facebookException = new FacebookException("Unexpected call to ReferralManager.onActivityResult");
            } else if (intent == null && intent.getExtras() != null && intent.getExtras().containsKey("error_message")) {
                facebookException = new FacebookException(intent.getExtras().getString("error_message"));
            } else {
                facebookException2 = null;
                referralResult = null;
            }
            facebookException2 = facebookException;
            referralResult = null;
        } else {
            try {
                if (intent.getExtras() == null || !intent.getExtras().containsKey("fb_referral_codes")) {
                    if (i != 0) {
                        if (intent == null) {
                        }
                        facebookException2 = null;
                        referralResult = null;
                    } else {
                        facebookException = new FacebookException("Unexpected call to ReferralManager.onActivityResult");
                    }
                    facebookException2 = facebookException;
                    referralResult = null;
                } else {
                    referralResult = new ReferralResult(Utility.convertJSONArrayToList(new JSONArray(intent.getExtras().getString("fb_referral_codes"))));
                    facebookException2 = null;
                }
            } catch (JSONException unused) {
                facebookException2 = new FacebookException("Unable to parse referral codes from response");
            }
        }
        ReferralLogger logger = getLogger(null);
        if (logger != null) {
            if (referralResult != null) {
                logger.logSuccess();
            } else if (facebookException2 != null) {
                logger.logError(facebookException2);
            } else {
                logger.logCancel();
            }
        }
        if (referralResult != null) {
            facebookCallback.onSuccess(referralResult);
            return true;
        }
        if (facebookException2 != null) {
            facebookCallback.onError(facebookException2);
            return true;
        }
        facebookCallback.onCancel();
        return true;
    }

    public void registerCallback(CallbackManager callbackManager, final FacebookCallback<ReferralResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(ReferralClient.getReferralRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.referrals.ReferralManager.1
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public boolean onActivityResult(int i, Intent intent) {
                return ReferralManager.this.onActivityResult(i, intent, facebookCallback);
            }
        });
    }

    public void startReferral(Activity activity) {
        startReferralImpl(new ActivityStartActivityDelegate(activity));
    }

    public void startReferral(Fragment fragment) {
        startReferralImpl(new FragmentStartActivityDelegate(new FragmentWrapper(fragment)));
    }

    public void startReferral(androidx.fragment.app.Fragment fragment) {
        startReferralImpl(new FragmentStartActivityDelegate(new FragmentWrapper(fragment)));
    }

    public void startReferral(FragmentWrapper fragmentWrapper) {
        startReferralImpl(new FragmentStartActivityDelegate(fragmentWrapper));
    }
}
