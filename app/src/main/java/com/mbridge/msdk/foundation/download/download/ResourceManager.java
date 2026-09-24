package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13213n0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ResourceManager {
    public static final int EXPIRE_TIME = 259200000;
    public static final String KEY_INDEX_HTML = "foldername";
    public static final String KEY_MD5CHECK = "nc";
    public static final String KEY_MD5FILENAME = "md5filename";
    private static String TAG = "ResourceManager";
    private String mFileSaveSDDir;

    private static class ResourceManagerHolder {
        public static ResourceManager instance = new ResourceManager();

        private ResourceManagerHolder() {
        }
    }

    public static ResourceManager getinstance() {
        return ResourceManagerHolder.instance;
    }

    private String save(String str, String str2, File file) throws Throwable {
        String strM37796b = C13215o0.m37796b(str2, this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)));
        return TextUtils.isEmpty(strM37796b) ? C13215o0.m37789a(file) : strM37796b;
    }

    public void cleanZipRes() {
        try {
            if (TextUtils.isEmpty(this.mFileSaveSDDir)) {
                return;
            }
            DownloadTask.getInstance().runTask(new AbstractRunnableC13163a() { // from class: com.mbridge.msdk.foundation.download.download.ResourceManager.1
                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void pauseTask(boolean z) {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void runTask() {
                    C13215o0.m37793a(ResourceManager.this.mFileSaveSDDir);
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public String getResDirFromCampaign(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(KEY_INDEX_HTML);
            C13219q0.m37813a(TAG, "check zip 下载情况：url:" + str);
            C13219q0.m37813a(TAG, "check zip 下载情况：indexHtml:" + queryParameters);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + RemoteSettings.FORWARD_SLASH_STRING + str4 + RemoteSettings.FORWARD_SLASH_STRING + str4 + ".html";
            if (!C13215o0.m37806e(str5)) {
                return null;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null && !TextUtils.isEmpty(c13635gM39718d.m39444U())) {
                C13093d.m37129a(str, new File(str5));
            }
            try {
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                str2 = "?" + strSubstring;
            }
            return AdPayload.FILE_SCHEME + str5 + str2;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public void init() {
        this.mFileSaveSDDir = C13098e.m37149b(EnumC13096c.MBRIDGE_700_RES);
    }

    public synchronized String saveResFile(String str, byte[] bArr) {
        String message;
        String strSave;
        String str2 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str3 = this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".zip";
                    File file = new File(str3);
                    if (C13215o0.m37795a(bArr, file)) {
                        Uri uri = Uri.parse(str);
                        List<String> queryParameters = uri.getQueryParameters(KEY_MD5CHECK);
                        if (queryParameters == null || queryParameters.size() == 0) {
                            List<String> queryParameters2 = uri.getQueryParameters(KEY_MD5FILENAME);
                            if (queryParameters2 != null && queryParameters2.size() > 0) {
                                String str4 = queryParameters2.get(0);
                                if (!TextUtils.isEmpty(str4) && str4.equals(C13213n0.m37785a(file))) {
                                    strSave = save(str, str3, file);
                                }
                            }
                        } else {
                            strSave = save(str, str3, file);
                        }
                        str2 = strSave;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        C13215o0.m37789a(file);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                message = e.getMessage();
            }
        }
        message = str2;
        return message;
    }

    private ResourceManager() {
        init();
    }
}
