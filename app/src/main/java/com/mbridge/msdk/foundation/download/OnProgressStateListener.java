package com.mbridge.msdk.foundation.download;

/* JADX INFO: loaded from: classes6.dex */
public interface OnProgressStateListener<T> {
    void onProgress(DownloadMessage<T> downloadMessage, DownloadProgress downloadProgress);
}
