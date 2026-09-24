package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class HTMLResourceManager {
    public static final int EXPIRE_TIME = 259200000;
    private static final String TAG = "HTMLResourceManager";
    private String mFileSaveSDDir;

    private static class ResourceManagerHolder {
        public static HTMLResourceManager instance = new HTMLResourceManager();

        private ResourceManagerHolder() {
        }
    }

    public static HTMLResourceManager getInstance() {
        return ResourceManagerHolder.instance;
    }

    public void cleanHtmlRes() {
        try {
            if (TextUtils.isEmpty(this.mFileSaveSDDir)) {
                return;
            }
            DownloadTask.getInstance().runTask(new AbstractRunnableC13163a() { // from class: com.mbridge.msdk.foundation.download.download.HTMLResourceManager.1
                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void pauseTask(boolean z) {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void runTask() {
                    C13215o0.m37793a(HTMLResourceManager.this.mFileSaveSDDir);
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public String getHtmlContentFromUrl(String str) {
        try {
            File file = new File(this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".html");
            if (file.exists()) {
                return C13215o0.m37805e(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String getHtmlPathFromUrl(String str) {
        try {
            String str2 = this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null && !TextUtils.isEmpty(c13635gM39718d.m39444U())) {
                C13093d.m37129a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public void init() {
        this.mFileSaveSDDir = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
    }

    public boolean saveResHtmlFile(String str, byte[] bArr) {
        try {
            C13219q0.m37818c(TAG, "saveResHtmlFile url:" + str);
            if (bArr == null || bArr.length <= 0) {
                return false;
            }
            String str2 = this.mFileSaveSDDir + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".html";
            C13219q0.m37818c(TAG, "saveResHtmlFile folderName:" + str2);
            return C13215o0.m37795a(bArr, new File(str2));
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    private HTMLResourceManager() {
        init();
    }
}
