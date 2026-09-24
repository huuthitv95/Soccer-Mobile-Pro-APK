package com.androidgamegou.androidutils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Toast;
import com.android.unityengine.UnityPIayerNativeActivity;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hbisoft.hbrecorder.C10912R;
import com.hbisoft.hbrecorder.HBRecorder;
import com.hbisoft.hbrecorder.HBRecorderListener;
import com.savegame.SavesRestoring;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidUtils extends UnityPlayerActivity implements HBRecorderListener {
    private static final int PERMISSION_REQ_ID_RECORD_AUDIO = 22;
    private static final int PERMISSION_REQ_ID_WRITE_EXTERNAL_STORAGE = 23;
    private static final int SCREEN_RECORD_REQUEST_CODE = 777;
    ContentValues contentValues;
    HBRecorder hbRecorder;
    Uri mUri;
    ContentResolver resolver;
    private String mGameObject = "[Singleton]AndroidScreenRecorder";
    private String saveFolder = "AndroidUtils";
    boolean customSetting = false;

    private void createFolder() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
            return;
        }
        Log.e("DIRECTORY_DCIM", "Failed to create directory");
    }

    private void createSubFolder() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), this.saveFolder);
        if (file.exists() || !file.mkdirs()) {
            return;
        }
        Log.i("Folder ", "created");
    }

    private byte[] drawable2ByteArray(int i) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private String generateFileName() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())).replace(" ", "");
    }

    public static String getRealPathFromURI(Context context, Uri uri) throws Throwable {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String string = cursorQuery.getString(columnIndexOrThrow);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void quickSettings() {
        this.hbRecorder.recordHDVideo(false);
        this.hbRecorder.isAudioEnabled(false);
        this.hbRecorder.setNotificationSmallIcon(drawable2ByteArray(C10912R.drawable.icon));
        this.hbRecorder.setNotificationTitle("Recording your screen");
        this.hbRecorder.setNotificationDescription("Drag down to stop the recording");
    }

    private void refreshGalleryFile() {
        MediaScannerConnection.scanFile(this, new String[]{this.hbRecorder.getFilePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.androidgamegou.androidutils.AndroidUtils.1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                Log.i("Unity ", "Scanned " + str + CertificateUtil.DELIMITER);
                StringBuilder sb = new StringBuilder("-> uri=");
                sb.append(uri);
                Log.i("Unity ", sb.toString());
                AndroidUtils.this.mUri = uri;
                UnityPlayer.UnitySendMessage(AndroidUtils.this.mGameObject, "OnVideoPathQuery", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputPath() {
        String str;
        String strGenerateFileName = generateFileName();
        if (Build.VERSION.SDK_INT >= 29) {
            this.resolver = getContentResolver();
            ContentValues contentValues = new ContentValues();
            this.contentValues = contentValues;
            contentValues.put("relative_path", "DCIM/" + this.saveFolder);
            this.contentValues.put("title", strGenerateFileName);
            this.contentValues.put("_display_name", strGenerateFileName);
            this.contentValues.put("mime_type", "video/mp4");
            this.mUri = this.resolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.contentValues);
            this.hbRecorder.setFileName(strGenerateFileName);
            this.hbRecorder.setOutputUri(this.mUri);
            return;
        }
        createFolder();
        createSubFolder();
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath();
        if (path.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = path + this.saveFolder;
        } else {
            str = path + RemoteSettings.FORWARD_SLASH_STRING + this.saveFolder;
        }
        this.hbRecorder.setOutputPath(str);
    }

    private void showLongToast(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    private void startRecording() {
        if (!this.customSetting) {
            quickSettings();
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
        final Intent intentCreateScreenCaptureIntent = mediaProjectionManager != null ? mediaProjectionManager.createScreenCaptureIntent() : null;
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.androidgamegou.androidutils.AndroidUtils.2
            @Override // java.lang.Runnable
            public void run() {
                AndroidUtils.this.startActivityForResult(intentCreateScreenCaptureIntent, AndroidUtils.SCREEN_RECORD_REQUEST_CODE);
            }
        });
    }

    private void updateGalleryUri() throws Throwable {
        this.contentValues.clear();
        this.contentValues.put("is_pending", (Integer) 0);
        getContentResolver().update(this.mUri, this.contentValues, null, null);
        String realPathFromURI = getRealPathFromURI(this, this.mUri);
        Log.i("Unity ", "updateGalleryUri: " + realPathFromURI);
        UnityPlayer.UnitySendMessage(this.mGameObject, "OnVideoPathQuery", realPathFromURI);
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public void HBRecorderOnComplete() throws Throwable {
        showLongToast("Saved Successfully");
        if (this.hbRecorder.wasUriSet()) {
            updateGalleryUri();
        } else {
            refreshGalleryFile();
        }
        UnityPlayer.UnitySendMessage(this.mGameObject, "VideoRecorderCallback", "stop_record");
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public void HBRecorderOnError(int i, String str) {
        if (i == 38) {
            showLongToast("Some settings are not supported by your device");
        } else {
            showLongToast("HBRecorderOnError - See Log");
            Log.e("HBRecorderOnError", str);
        }
        UnityPlayer.UnitySendMessage(this.mGameObject, "VideoRecorderCallback", "init_record_error");
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public void HBRecorderOnPause() {
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public void HBRecorderOnResume() {
    }

    @Override // com.hbisoft.hbrecorder.HBRecorderListener
    public void HBRecorderOnStart() {
        Log.e("HBRecorder", "HBRecorderOnStart called");
        UnityPlayer.UnitySendMessage(this.mGameObject, "VideoRecorderCallback", "start_record");
    }

    public void ShareVideo(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", this.mUri);
        intent.setType("video/mp4");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, "Share Video"));
    }

    public boolean hasPermission(String str) {
        return UnityPlayer.currentActivity.getApplicationContext().checkCallingOrSelfPermission(str) == 0;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, final int i2, final Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == SCREEN_RECORD_REQUEST_CODE) {
            new Timer().schedule(new TimerTask() { // from class: com.androidgamegou.androidutils.AndroidUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    AndroidUtils.this.runOnUiThread(new Runnable() { // from class: com.androidgamegou.androidutils.AndroidUtils.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i2 == -1) {
                                AndroidUtils.this.setOutputPath();
                                AndroidUtils.this.hbRecorder.startScreenRecording(intent, i2);
                            } else {
                                Log.e("Record", "OnCancel");
                                UnityPlayer.UnitySendMessage(AndroidUtils.this.mGameObject, "OnCancel", "");
                            }
                        }
                    });
                }
            }, 300L);
        }
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SavesRestoring.DoSmth(this);
        UnityPIayerNativeActivity.Init(this);
        super.onCreate(bundle);
        Log.d("Unity", "onCreate");
        this.hbRecorder = new HBRecorder(this, this);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            return;
        }
        if (iArr[0] == 0) {
            UnityPlayer.UnitySendMessage(this.mGameObject, "OnAllow", "");
        } else if (shouldShowRequestPermissionRationale(strArr[0])) {
            UnityPlayer.UnitySendMessage(this.mGameObject, "OnDeny", "");
        } else {
            UnityPlayer.UnitySendMessage(this.mGameObject, "OnDenyAndNeverAskAgain", "");
        }
    }

    public void requestPermission(String str) {
        if (hasPermission(str)) {
            return;
        }
        UnityPlayer.currentActivity.requestPermissions(new String[]{str}, 0);
    }

    public void setUpSaveFolder(String str) {
        this.saveFolder = str;
    }

    public void setupVideo(int i, int i2, int i3, int i4, boolean z) {
        this.hbRecorder.enableCustomSettings();
        this.hbRecorder.setScreenDimensions(i2, i);
        this.hbRecorder.setVideoFrameRate(i4);
        this.hbRecorder.setVideoBitrate(i3);
        this.hbRecorder.recordHDVideo(false);
        this.hbRecorder.isAudioEnabled(false);
        this.customSetting = true;
    }

    public void setupVideo(int i, int i2, int i3, int i4, boolean z, String str) {
        this.hbRecorder.enableCustomSettings();
        this.hbRecorder.setScreenDimensions(i2, i);
        this.hbRecorder.setVideoFrameRate(i4);
        this.hbRecorder.setVideoBitrate(i3);
        this.hbRecorder.setVideoEncoder(str);
        this.hbRecorder.recordHDVideo(false);
        this.hbRecorder.isAudioEnabled(false);
        this.customSetting = true;
    }

    public void stopRecording() {
        this.hbRecorder.stopScreenRecording();
        UnityPlayer.UnitySendMessage(this.mGameObject, "VideoRecorderCallback", "stop_record");
    }
}
