package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9215a0 implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a */
    public final String f21520a;

    /* JADX INFO: renamed from: b */
    public MediaScannerConnection f21521b;

    public C9215a0(String str) {
        this.f21520a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.f21521b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f21520a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.f21521b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
