package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import androidx.work.WorkRequest;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class H5DownLoadManager {
    public static final String SP_ENDING_PAGE_SAVE_TIME = "ending_page_save_time";
    public static final String SP_ENDING_PAGE_SOURCE = "ending_page_source";
    private static final String TAG = "H5DownLoadManager";
    private static volatile H5DownLoadManager sH5Manager;
    private final String DOWN_TYPE = "down_type";
    private final String LOCAL_RID = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private HTMLResourceManager htmlResourceManager;
    private boolean isUseDownloadModule;
    private CopyOnWriteArrayList<String> mResDownloadingList;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private ResourceManager resourceManager;

    public interface H5ResDownloadListerInter {
        void onFailed(String str, String str2);

        void onSuccess(String str, String str2, boolean z);
    }

    public interface IH5SourceDownloadListener extends H5ResDownloadListerInter {
    }

    public interface IOnDownLoadH5Source {
        void onFailed(String str);

        void onStart();

        void onSuccess(String str, byte[] bArr, String str2);
    }

    public interface ZipDownloadListener extends H5ResDownloadListerInter {
    }

    private H5DownLoadManager() {
        this.isUseDownloadModule = false;
        try {
            this.resourceManager = ResourceManager.getinstance();
            this.htmlResourceManager = HTMLResourceManager.getInstance();
            this.mResDownloadingList = new CopyOnWriteArrayList<>();
            this.mResDownloadingMap = new ConcurrentHashMap();
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null) {
                this.isUseDownloadModule = c13635gM39718d.m39476b(1);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(TAG, th.getMessage(), th);
        }
    }

    private void downloadHTML(final C13154c c13154c, final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        try {
            C13219q0.m37816b(TAG, "download url:" + str);
            final C13157e c13157e = new C13157e();
            c13157e.m37501a("scenes", "1");
            c13157e.m37501a("url", str);
            if (c13154c != null) {
                c13157e.m37501a("resource_type", Integer.valueOf(c13154c.m37460q()));
            }
            if (this.mResDownloadingList.contains(str)) {
                return;
            }
            this.mResDownloadingList.add(str);
            DownloadTask.getInstance().runTask(new AbstractRunnableC13163a() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2
                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void pauseTask(boolean z) {
                }

                @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                public void runTask() {
                    if (TextUtils.isEmpty(H5DownLoadManager.this.htmlResourceManager.getHtmlContentFromUrl(str))) {
                        DownLoadUtils.getSourceCodeFromNetUrl(str, new IOnDownLoadH5Source() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2.1
                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onFailed(String str2) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                                    C130562 c130562 = C130562.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter2 != null) {
                                        h5ResDownloadListerInter2.onFailed(str, str2);
                                    }
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    C130562 c130563 = C130562.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str, str2);
                                    }
                                }
                                C130562 c130564 = C130562.this;
                                if (h5ResDownloadListerInter == null) {
                                    c13157e.m37501a("result", 3);
                                    C130562 c130565 = C130562.this;
                                    c13154c.m37423a("m_download_end", c13157e);
                                    C13156d.m37475b().m37491b("m_download_end", c13154c, null);
                                }
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onStart() {
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onSuccess(String str2, byte[] bArr, String str3) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str3);
                                    if (bArr == null || bArr.length <= 0) {
                                        return;
                                    }
                                    if (H5DownLoadManager.this.htmlResourceManager.saveResHtmlFile(str3, bArr)) {
                                        C130562 c130562 = C130562.this;
                                        H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                        if (h5ResDownloadListerInter2 != null) {
                                            h5ResDownloadListerInter2.onSuccess(str3, "", false);
                                            return;
                                        }
                                        c13157e.m37501a("result", 3);
                                        C130562 c130563 = C130562.this;
                                        c13154c.m37423a("m_download_end", c13157e);
                                        C13156d.m37475b().m37491b("m_download_end", c13154c, null);
                                        return;
                                    }
                                    C130562 c130564 = C130562.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str3, "save file failed");
                                        return;
                                    }
                                    c13157e.m37501a("result", 3);
                                    C130562 c130565 = C130562.this;
                                    c13154c.m37423a("m_download_end", c13157e);
                                    C13156d.m37475b().m37491b("m_download_end", c13154c, null);
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    C130562 c130566 = C130562.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter4 != null) {
                                        h5ResDownloadListerInter4.onFailed(str3, e.getMessage());
                                        return;
                                    }
                                    c13157e.m37501a("result", 3);
                                    C130562 c130567 = C130562.this;
                                    c13154c.m37423a("m_download_end", c13157e);
                                    C13156d.m37475b().m37491b("m_download_end", c13154c, null);
                                }
                            }
                        }, true);
                        c13157e.m37501a("cache", 1);
                        c13154c.m37423a("m_download_start", c13157e);
                        C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                        return;
                    }
                    c13157e.m37501a("cache", 2);
                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", true);
                    }
                    c13154c.m37423a("m_download_start", c13157e);
                    C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                }
            });
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    private void downloadHTMLByDownloadModule(final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (TextUtils.isEmpty(str)) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is null", str);
                return;
            }
            return;
        }
        try {
            new URL(str);
            String str2 = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML) + RemoteSettings.FORWARD_SLASH_STRING;
            String md5 = SameMD5.getMD5(C13188c1.m37646b(str));
            MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, md5 + ".html", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withTimeout(60000L).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(str2).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.1
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载取消： ");
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载结束： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType() + " " + downloadMessage.getSaveFilePath());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", false);
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载结束失败： " + downloadError.getException().getMessage());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "开始下载 html： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType());
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onResponseStart(DownloadMessage downloadMessage) {
                }
            }).build().start();
        } catch (Exception unused) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is unlawful", str);
            }
        }
    }

    private void downloadZipByDownloadModule(final C13154c c13154c, String str, final ZipDownloadListener zipDownloadListener) {
        if (TextUtils.isEmpty(str)) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is null");
                return;
            }
            return;
        }
        try {
            new URL(str);
            final C13157e c13157e = new C13157e();
            c13157e.m37501a("scenes", "1");
            c13157e.m37501a("url", str);
            if (c13154c != null) {
                c13157e.m37501a("resource_type", Integer.valueOf(c13154c.m37460q()));
            }
            String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_700_RES);
            String md5 = SameMD5.getMD5(C13188c1.m37646b(str));
            String str2 = strM37149b + RemoteSettings.FORWARD_SLASH_STRING;
            final String str3 = strM37149b + RemoteSettings.FORWARD_SLASH_STRING + md5;
            DownloadMessage<?> downloadMessage = new DownloadMessage<>(c13154c, str, md5 + ".zip", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
            if (c13154c != null) {
                downloadMessage.setUseCronetDownload(c13154c.m37461r());
            }
            MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(str2).withTimeout(60000L).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.3
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage2) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载取消： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                    C13157e c13157e2 = c13157e;
                    if (c13157e2 != null) {
                        c13157e2.m37501a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    C13154c c13154c2 = c13154c;
                    if (c13154c2 != null) {
                        c13154c2.m37423a("m_download_start", c13157e);
                    }
                    C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), "task cancel");
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage2) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + " " + downloadMessage2.getSaveFilePath());
                    try {
                        C13157e c13157e2 = c13157e;
                        if (c13157e2 != null) {
                            c13157e2.m37501a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                        }
                        C13154c c13154c2 = c13154c;
                        if (c13154c2 != null) {
                            c13154c2.m37423a("m_download_start", c13157e);
                        }
                        C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                        if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                            MBResourceManager.getInstance().unZip(downloadMessage2.getSaveFilePath(), str3);
                        }
                        String str4 = "";
                        try {
                            str4 = (String) downloadMessage2.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            C13219q0.m37816b(H5DownLoadManager.TAG, th.getMessage());
                        }
                        C13219q0.m37813a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压成功： " + str3);
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), str4, downloadMessage2.isCache());
                        }
                    } catch (IOException e) {
                        C13219q0.m37813a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压失败： " + e.getMessage());
                        ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                        if (zipDownloadListener3 != null) {
                            zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), e.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage2, DownloadError downloadError) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "下载错误： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + "  " + downloadError.getException().getMessage());
                    C13157e c13157e2 = c13157e;
                    if (c13157e2 != null) {
                        c13157e2.m37501a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    C13154c c13154c2 = c13154c;
                    if (c13154c2 != null) {
                        c13154c2.m37423a("m_download_start", c13157e);
                    }
                    C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), downloadError.getException().getMessage());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage2) {
                    C13219q0.m37813a(H5DownLoadManager.TAG, "开始下载 zip： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onResponseStart(DownloadMessage downloadMessage2) {
                }
            }).build().start();
        } catch (Exception unused) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is unlawful");
            }
        }
    }

    private void downloadZipByOldDownloadModule(C13154c c13154c, String str, ZipDownloadListener zipDownloadListener) {
        C13157e c13157e = new C13157e();
        c13157e.m37501a("scenes", "1");
        c13157e.m37501a("url", str);
        if (c13154c != null) {
            c13157e.m37501a("resource_type", Integer.valueOf(c13154c.m37460q()));
        }
        try {
            if (TextUtils.isEmpty(this.resourceManager.getResDirFromCampaign(str))) {
                c13157e.m37501a("cache", 2);
                if (this.mResDownloadingMap.containsKey(str)) {
                    DownLoadH5SourceListener downLoadH5SourceListener = this.mResDownloadingMap.get(str);
                    if (downLoadH5SourceListener != null) {
                        downLoadH5SourceListener.setZipDownloadListener(zipDownloadListener);
                    }
                    if (c13154c == null || c13154c.m37418G()) {
                        return;
                    }
                    c13154c.m37423a("m_download_start", c13157e);
                    C13156d.m37475b().m37491b("m_download_start", c13154c, null);
                    return;
                }
                DownLoadH5SourceListener downLoadH5SourceListener2 = new DownLoadH5SourceListener(this.mResDownloadingMap, this.resourceManager, zipDownloadListener, str);
                this.mResDownloadingMap.put(str, downLoadH5SourceListener2);
                DownLoadUtils.getSourceCodeFromNetUrl(str, downLoadH5SourceListener2, true);
            } else {
                c13157e.m37501a("cache", 1);
                if (zipDownloadListener != null) {
                    zipDownloadListener.onSuccess(str, "", true);
                }
            }
            if (c13154c == null || c13154c.m37418G()) {
                return;
            }
            c13154c.m37423a("m_download_start", c13157e);
            C13156d.m37475b().m37491b("m_download_start", c13154c, null);
        } catch (Exception e) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "downloadzip failed");
            }
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private String getHtmlAddress(String str) {
        HTMLResourceManager hTMLResourceManager = this.htmlResourceManager;
        return hTMLResourceManager != null ? hTMLResourceManager.getHtmlPathFromUrl(str) : str;
    }

    public static H5DownLoadManager getInstance() {
        if (sH5Manager == null) {
            synchronized (H5DownLoadManager.class) {
                if (sH5Manager == null) {
                    sH5Manager = new H5DownLoadManager();
                }
            }
        }
        return sH5Manager;
    }

    private long getPreSaveTimeFromSp(String str) {
        try {
            Object objM37956a = C13235y0.m37956a(C13008c.m36588n().m36542d(), SP_ENDING_PAGE_SAVE_TIME + str, 0L);
            if (objM37956a != null && (objM37956a instanceof Long)) {
                return ((Long) objM37956a).longValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    private void saveSourceContent(String str, String str2) {
        try {
            C13219q0.m37818c(TAG, "sourceContent:" + str);
            C13235y0.m37957b(C13008c.m36588n().m36542d(), SP_ENDING_PAGE_SOURCE + str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateEndingPageSaveTime(String str) {
        try {
            C13235y0.m37957b(C13008c.m36588n().m36542d(), SP_ENDING_PAGE_SAVE_TIME + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void download(C13154c c13154c, String str) {
        download(c13154c, str, null);
    }

    public void downloadH5Res(C13154c c13154c, String str) {
        downloadH5Res(c13154c, str, null);
    }

    public void downloadZip(C13154c c13154c, String str, ZipDownloadListener zipDownloadListener) {
        if (this.isUseDownloadModule) {
            downloadZipByDownloadModule(c13154c, str, zipDownloadListener);
        } else {
            downloadZipByOldDownloadModule(c13154c, str, zipDownloadListener);
        }
    }

    public String getH5ResAddress(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return path.toLowerCase().endsWith(".zip") ? getResAddress(str) : getHtmlAddress(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public String getResAddress(String str) {
        ResourceManager resourceManager = this.resourceManager;
        if (resourceManager != null) {
            return resourceManager.getResDirFromCampaign(str);
        }
        return null;
    }

    public String getSourceContentFromSp(String str) {
        try {
            Object objM37956a = C13235y0.m37956a(C13008c.m36588n().m36542d(), SP_ENDING_PAGE_SOURCE + str, "");
            if (objM37956a == null || !(objM37956a instanceof String)) {
                return null;
            }
            String str2 = (String) objM37956a;
            if (C13182a1.m37597b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void download(C13154c c13154c, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (this.isUseDownloadModule) {
            downloadHTMLByDownloadModule(str, h5ResDownloadListerInter);
        } else {
            downloadHTML(c13154c, str, h5ResDownloadListerInter);
        }
    }

    public void downloadH5Res(C13154c c13154c, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        C13154c c13154cM37476a = C13156d.m37475b().m37476a(c13154c);
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        downloadZip(c13154cM37476a, str, (ZipDownloadListener) h5ResDownloadListerInter);
                        return;
                    } else {
                        download(c13154cM37476a, str, h5ResDownloadListerInter);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (h5ResDownloadListerInter != null) {
            h5ResDownloadListerInter.onFailed(str, "The URL does not contain a path ");
        }
    }

    public void downloadH5Res(String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        downloadH5Res(new C13154c(), str, h5ResDownloadListerInter);
    }
}
