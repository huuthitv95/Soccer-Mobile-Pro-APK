package com.football.flsplitinstallloader;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.ironsource.C11744X3;
import com.unity3d.player.UnityPlayer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SplitInstall {
    private static String TAG = "SplitInstall";
    static Activity activity = null;
    static Context context = null;
    static String goName = "[Singleton]LanguageSplitLoader";
    static SplitInstallStateUpdatedListener listener;
    static int mySessionId;
    static SplitInstallManager splitInstallManager;
    static String targetRes;

    public static boolean CopyFile(Context context2, String str, String str2) {
        int identifier = context2.getResources().getIdentifier(str, "raw", context2.getApplicationContext().getPackageName());
        Log.d(goName, "rawFileName " + identifier);
        try {
            InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(identifier);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            if (inputStreamOpenRawResource.available() == 0) {
                inputStreamOpenRawResource.close();
                fileOutputStream.close();
                File file = new File(str2);
                if (file.exists() && !file.delete()) {
                    Log.e(goName, "Failed to delete empty file: " + str2);
                }
                Log.e(goName, "file is empty");
                return false;
            }
            byte[] bArr = new byte[40960];
            while (true) {
                int i = inputStreamOpenRawResource.read(bArr);
                if (i == -1) {
                    Log.d(TAG, "CopyFile");
                    inputStreamOpenRawResource.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            Log.e(goName, e.toString());
            return false;
        }
    }

    public static void LoadLanguageRes(Activity activity2, String str) {
        targetRes = str;
        activity = activity2;
        activity2.runOnUiThread(new Runnable() { // from class: com.football.flsplitinstallloader.SplitInstall.1
            @Override // java.lang.Runnable
            public void run() {
                if (SplitInstall.splitInstallManager == null) {
                    SplitInstall.listener = new SplitInstallStateUpdatedListener() { // from class: com.football.flsplitinstallloader.SplitInstall.1Listener
                        @Override // com.google.android.play.core.listener.StateUpdatedListener
                        public void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                            Log.d(SplitInstall.TAG, "state:" + splitInstallSessionState.status());
                            int iStatus = splitInstallSessionState.status();
                            if (iStatus == 5) {
                                SplitInstall.activity.runOnUiThread(new Runnable() { // from class: com.football.flsplitinstallloader.SplitInstall.1Listener.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.d(SplitInstall.TAG, "INSTALLED");
                                        Configuration configuration = new Configuration();
                                        configuration.setLocale(Locale.forLanguageTag(SplitInstall.targetRes));
                                        SplitInstall.context = SplitInstall.activity.createConfigurationContext(configuration);
                                        Log.d(SplitInstall.TAG, "" + SplitCompat.installActivity(SplitInstall.context));
                                        Log.d(SplitInstall.TAG, "" + SplitCompat.installActivity(SplitInstall.activity));
                                        UnityPlayer.UnitySendMessage(SplitInstall.goName, "OnSuccess", "");
                                    }
                                });
                                return;
                            }
                            if (iStatus == 6 || iStatus == 7) {
                                UnityPlayer.UnitySendMessage(SplitInstall.goName, "OnFailure", "");
                            } else {
                                if (iStatus != 8) {
                                    return;
                                }
                                try {
                                    SplitInstall.splitInstallManager.startConfirmationDialogForResult(splitInstallSessionState, SplitInstall.activity, TTAdConstant.STYLE_SIZE_RADIO_2_3);
                                } catch (IntentSender.SendIntentException unused) {
                                    UnityPlayer.UnitySendMessage(SplitInstall.goName, "OnFailure", "");
                                }
                            }
                        }
                    };
                    SplitInstall.splitInstallManager = SplitInstallManagerFactory.create(SplitInstall.activity.getApplicationContext());
                    SplitInstall.splitInstallManager.registerListener(SplitInstall.listener);
                }
                SplitInstall.splitInstallManager.startInstall(SplitInstallRequest.newBuilder().addLanguage(Locale.forLanguageTag(SplitInstall.targetRes)).build()).addOnSuccessListener(new OnSuccessListener<Integer>() { // from class: com.football.flsplitinstallloader.SplitInstall.1.2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public void onSuccess(Integer num) {
                        Log.d(SplitInstall.TAG, "onSuccess");
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.football.flsplitinstallloader.SplitInstall.1.1
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        UnityPlayer.UnitySendMessage(SplitInstall.goName, "OnFailure", "");
                        Log.d(SplitInstall.TAG, C11744X3.g.f26257e);
                    }
                });
            }
        });
    }
}
