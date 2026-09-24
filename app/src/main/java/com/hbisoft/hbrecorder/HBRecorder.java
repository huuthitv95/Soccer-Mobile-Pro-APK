package com.hbisoft.hbrecorder;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.ironsource.C11661S5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class HBRecorder implements MyListener {
    private byte[] byteArray;
    private final Context context;
    private String fileName;
    private final HBRecorderListener hbRecorderListener;
    private int mScreenDensity;
    private int mScreenHeight;
    private int mScreenWidth;
    Uri mUri;
    private String notificationButtonText;
    private String notificationDescription;
    private String notificationTitle;
    private FileObserver observer;
    private int orientation;
    private String outputPath;
    private int resultCode;
    Intent service;
    private boolean isAudioEnabled = true;
    private boolean isVideoHDEnabled = true;
    private int audioBitrate = 0;
    private int audioSamplingRate = 0;
    private int vectorDrawable = 0;
    private String audioSource = "MIC";
    private String videoEncoder = MessengerShareContentUtility.PREVIEW_DEFAULT;
    private boolean enableCustomSettings = false;
    private int videoFrameRate = 30;
    private int videoBitrate = 40000000;
    private String outputFormat = MessengerShareContentUtility.PREVIEW_DEFAULT;
    private long maxFileSize = 0;
    boolean wasOnErrorCalled = false;
    boolean isPaused = false;
    boolean isMaxDurationSet = false;
    int maxDuration = 0;
    boolean mWasUriSet = false;
    Countdown countDown = null;

    public HBRecorder(Context context, HBRecorderListener hBRecorderListener) {
        this.context = context.getApplicationContext();
        this.hbRecorderListener = hBRecorderListener;
        setScreenDensity();
    }

    public void setOrientationHint(int i) {
        this.orientation = i;
    }

    public void setOutputPath(String str) {
        this.outputPath = str;
    }

    public void setOutputUri(Uri uri) {
        this.mWasUriSet = true;
        this.mUri = uri;
    }

    public void setMaxDuration(int i) {
        this.isMaxDurationSet = true;
        this.maxDuration = i * 1000;
    }

    public void setMaxFileSize(long j) {
        this.maxFileSize = j;
    }

    public boolean wasUriSet() {
        return this.mWasUriSet;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    public void setAudioSamplingRate(int i) {
        this.audioSamplingRate = i;
    }

    public void isAudioEnabled(boolean z) {
        this.isAudioEnabled = z;
    }

    public void setAudioSource(String str) {
        this.audioSource = str;
    }

    public void recordHDVideo(boolean z) {
        this.isVideoHDEnabled = z;
    }

    public void setVideoEncoder(String str) {
        this.videoEncoder = str;
    }

    public void enableCustomSettings() {
        this.enableCustomSettings = true;
    }

    public void setVideoFrameRate(int i) {
        this.videoFrameRate = i;
    }

    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    private void setScreenDensity() {
        this.mScreenDensity = Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public int getDefaultWidth() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedWidth();
    }

    public int getDefaultHeight() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedHeight();
    }

    public void setScreenDimensions(int i, int i2) {
        this.mScreenHeight = i;
        this.mScreenWidth = i2;
    }

    public String getFilePath() {
        return ScreenRecordService.getFilePath();
    }

    public String getFileName() {
        return ScreenRecordService.getFileName();
    }

    public void startScreenRecording(Intent intent, int i) {
        this.resultCode = i;
        startService(intent);
    }

    public void stopScreenRecording() {
        this.context.stopService(new Intent(this.context, (Class<?>) ScreenRecordService.class));
    }

    public void pauseScreenRecording() {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = true;
            intent.setAction(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            this.context.startService(this.service);
        }
    }

    public void resumeScreenRecording() {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = false;
            intent.setAction(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            this.context.startService(this.service);
        }
    }

    public boolean isRecordingPaused() {
        return this.isPaused;
    }

    public boolean isBusyRecording() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (ScreenRecordService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public void setNotificationSmallIcon(int i) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.context.getResources(), i);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        this.byteArray = byteArrayOutputStream.toByteArray();
    }

    public void setNotificationSmallIconVector(int i) {
        this.vectorDrawable = i;
    }

    public void setNotificationSmallIcon(byte[] bArr) {
        this.byteArray = bArr;
    }

    public void setNotificationTitle(String str) {
        this.notificationTitle = str;
    }

    public void setNotificationDescription(String str) {
        this.notificationDescription = str;
    }

    public void setNotificationButtonText(String str) {
        this.notificationButtonText = str;
    }

    private void startService(Intent intent) {
        try {
            if (!this.mWasUriSet) {
                if (this.outputPath != null) {
                    this.observer = new FileObserver(new File(this.outputPath).getParent(), this);
                } else {
                    this.observer = new FileObserver(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)), this);
                }
                this.observer.startWatching();
            }
            Intent intent2 = new Intent(this.context, (Class<?>) ScreenRecordService.class);
            this.service = intent2;
            if (this.mWasUriSet) {
                intent2.putExtra("mUri", this.mUri.toString());
            }
            this.service.putExtra(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, this.resultCode);
            this.service.putExtra("data", intent);
            this.service.putExtra("audio", this.isAudioEnabled);
            this.service.putExtra("width", this.mScreenWidth);
            this.service.putExtra("height", this.mScreenHeight);
            this.service.putExtra("density", this.mScreenDensity);
            this.service.putExtra("quality", this.isVideoHDEnabled);
            this.service.putExtra("path", this.outputPath);
            this.service.putExtra(C11661S5.c.f25653b, this.fileName);
            this.service.putExtra("orientation", this.orientation);
            this.service.putExtra("audioBitrate", this.audioBitrate);
            this.service.putExtra("audioSamplingRate", this.audioSamplingRate);
            this.service.putExtra("notificationSmallBitmap", this.byteArray);
            this.service.putExtra("notificationSmallVector", this.vectorDrawable);
            this.service.putExtra("notificationTitle", this.notificationTitle);
            this.service.putExtra("notificationDescription", this.notificationDescription);
            this.service.putExtra("notificationButtonText", this.notificationButtonText);
            this.service.putExtra("enableCustomSettings", this.enableCustomSettings);
            this.service.putExtra("audioSource", this.audioSource);
            this.service.putExtra("videoEncoder", this.videoEncoder);
            this.service.putExtra("videoFrameRate", this.videoFrameRate);
            this.service.putExtra("videoBitrate", this.videoBitrate);
            this.service.putExtra("outputFormat", this.outputFormat);
            this.service.putExtra("listener", new ResultReceiver(new Handler()) { // from class: com.hbisoft.hbrecorder.HBRecorder.1
                @Override // android.os.ResultReceiver
                protected void onReceiveResult(int i, Bundle bundle) {
                    super.onReceiveResult(i, bundle);
                    if (i == -1) {
                        String string = bundle.getString(Constants.ERROR_REASON_KEY);
                        String string2 = bundle.getString(Constants.ON_COMPLETE_KEY);
                        int i2 = bundle.getInt(Constants.ON_START_KEY);
                        int i3 = bundle.getInt("error");
                        if (string != null) {
                            HBRecorder.this.stopCountDown();
                            if (!HBRecorder.this.mWasUriSet) {
                                HBRecorder.this.observer.stopWatching();
                            }
                            HBRecorder.this.wasOnErrorCalled = true;
                            if (i3 > 0) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(i3, string);
                            } else {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(100, string);
                            }
                            try {
                                HBRecorder.this.context.stopService(new Intent(HBRecorder.this.context, (Class<?>) ScreenRecordService.class));
                            } catch (Exception unused) {
                            }
                        } else if (string2 != null) {
                            HBRecorder.this.stopCountDown();
                            if (HBRecorder.this.mWasUriSet && !HBRecorder.this.wasOnErrorCalled) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                            }
                            HBRecorder.this.wasOnErrorCalled = false;
                        } else if (i2 != 0) {
                            HBRecorder.this.hbRecorderListener.HBRecorderOnStart();
                            if (HBRecorder.this.isMaxDurationSet) {
                                HBRecorder.this.startCountdown();
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            String string3 = bundle.getString("onPause");
                            String string4 = bundle.getString("onResume");
                            if (string3 != null) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnPause();
                            } else if (string4 != null) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnResume();
                            }
                        }
                    }
                }
            });
            this.service.putExtra(Constants.MAX_FILE_SIZE_KEY, this.maxFileSize);
            this.context.startService(this.service);
        } catch (Exception e) {
            this.hbRecorderListener.HBRecorderOnError(0, Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCountdown() {
        Countdown countdown = new Countdown(this.maxDuration, 1000L, 0L) { // from class: com.hbisoft.hbrecorder.HBRecorder.2
            @Override // com.hbisoft.hbrecorder.Countdown
            public void onStopCalled() {
            }

            @Override // com.hbisoft.hbrecorder.Countdown
            public void onTick(long j) {
            }

            @Override // com.hbisoft.hbrecorder.Countdown
            public void onFinished() {
                onTick(0L);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.hbisoft.hbrecorder.HBRecorder.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HBRecorder.this.stopScreenRecording();
                            HBRecorder.this.observer.stopWatching();
                            HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        };
        this.countDown = countdown;
        countdown.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCountDown() {
        Countdown countdown = this.countDown;
        if (countdown != null) {
            countdown.stop();
        }
    }

    @Override // com.hbisoft.hbrecorder.MyListener
    public void onCompleteCallback() {
        this.observer.stopWatching();
        this.hbRecorderListener.HBRecorderOnComplete();
    }
}
