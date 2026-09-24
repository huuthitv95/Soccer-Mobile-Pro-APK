package com.example.copyasset;

import android.app.Activity;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class copyasset {
    static String TAG = "GL2JNILib";
    static String s_resourcePath;

    public static boolean CopyFile(final Activity activity, final String str, final PluginCallback pluginCallback) {
        activity.runOnUiThread(new Runnable() { // from class: com.example.copyasset.copyasset.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                pluginCallback.OnOperationFinish(copyasset.copysinglefile(activity, str), copyasset.getDestPath(activity));
            }
        });
        return true;
    }

    public static String GetSavePath(Activity activity) {
        return activity.getFilesDir().getAbsolutePath();
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[40960];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    public static boolean copysinglefile(Activity activity, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        String destPath = getDestPath(activity);
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = activity.getAssets().open(str);
            try {
                File file = new File(destPath, str);
                ensurePathExists(file.getParent());
                if (file.exists() && file.length() == inputStreamOpen.available()) {
                    Log.i(TAG, "skip copy " + str);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                            return true;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    copyFile(inputStreamOpen, fileOutputStream2);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return true;
                } catch (IOException e4) {
                    inputStream = inputStreamOpen;
                    fileOutputStream = fileOutputStream2;
                    e = e4;
                    try {
                        Log.e(ViewHierarchyConstants.TAG_KEY, "Failed to copy asset file: " + str, e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return false;
                        }
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    fileOutputStream = fileOutputStream2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                inputStream = inputStreamOpen;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamOpen;
                fileOutputStream = null;
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static void ensurePathExists(String str) {
        try {
            new File(str).mkdirs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String getDestPath(Activity activity) {
        return activity.getFilesDir().getAbsolutePath();
    }
}
