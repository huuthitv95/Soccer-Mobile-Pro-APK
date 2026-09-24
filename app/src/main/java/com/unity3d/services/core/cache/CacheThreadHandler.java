package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    CacheThreadHandler() {
    }

    /* JADX WARN: Code duplicated, block: B:138:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.unity3d.services.core.request.WebRequest] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.unity3d.services.core.cache.CacheThreadHandler] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v35 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37 */
    /* JADX WARN: Type inference failed for: r25v38 */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v42 */
    /* JADX WARN: Type inference failed for: r25v43 */
    /* JADX WARN: Type inference failed for: r25v44 */
    /* JADX WARN: Type inference failed for: r25v45 */
    /* JADX WARN: Type inference failed for: r25v46 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v50 */
    /* JADX WARN: Type inference failed for: r25v51 */
    /* JADX WARN: Type inference failed for: r25v52 */
    /* JADX WARN: Type inference failed for: r25v64 */
    /* JADX WARN: Type inference failed for: r25v65 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void downloadFile(String str, String str2, int i, int i2, final int i3, HashMap<String, List<String>> map, boolean z, final CacheEventSender cacheEventSender) throws Throwable {
        char c;
        ?? r5;
        int i4;
        char c2;
        WebRequest webRequest;
        ?? r6;
        int i5;
        char c3;
        WebRequest webRequest2;
        ?? r7;
        int i6;
        char c4;
        WebRequest webRequest3;
        ?? r8;
        int i7;
        char c5;
        WebRequest webRequest4;
        ?? r9;
        int i8;
        char c6;
        WebRequest webRequest5;
        ?? r10;
        int i9;
        char c7;
        WebRequest webRequest6;
        Throwable th;
        ?? r25;
        ?? r15;
        ?? r11;
        int i10;
        boolean z2;
        char c8;
        FileOutputStream fileOutputStream;
        char c9;
        WebRequest webRequest7;
        boolean z3;
        int i11;
        char c10;
        WebRequest webRequest8;
        boolean z4;
        int i12;
        char c11;
        WebRequest webRequest9;
        boolean z5;
        int i13;
        char c12;
        WebRequest webRequest10;
        boolean z6;
        int i14;
        char c13;
        WebRequest webRequest11;
        boolean z7;
        int i15;
        char c14;
        WebRequest webRequest12;
        boolean z8;
        int i16;
        char c15;
        WebRequest webRequest13;
        if (this._canceled || str == null || str2 == 0) {
            return;
        }
        final ?? file = new File((String) str2);
        if (z) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + ((String) str2) + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + ((String) str2));
        }
        ?? r16 = 2;
        ?? r3 = 1;
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream((File) file, z);
                try {
                    WebRequest webRequest14 = getWebRequest(str, i, i2, map);
                    this._currentRequest = webRequest14;
                    webRequest14.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j, long j2) {
                            if (i3 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i3) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j), Long.valueOf(j2));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j, int i17, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(j + file.length()), Integer.valueOf(i17), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream3);
                    this._active = false;
                    char c16 = 2;
                    WebRequest webRequest15 = null;
                    c = 1;
                    fileOutputStream = fileOutputStream3;
                    try {
                        postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                        this._currentRequest = null;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            DeviceLog.exception("Error closing stream", e);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        }
                    } catch (NetworkIOException e2) {
                        e = e2;
                        i16 = 3;
                        z8 = false;
                        webRequest13 = webRequest15;
                        c15 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i9 = i16;
                        r10 = z8;
                        webRequest6 = webRequest13;
                        c7 = c15;
                        DeviceLog.exception("Network error", e);
                        this._active = r10;
                        CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                        String message = e.getMessage();
                        Object[] objArr = new Object[i9];
                        objArr[r10] = CacheError.NETWORK_ERROR;
                        objArr[c] = str;
                        objArr[c7] = message;
                        cacheEventSender.sendEvent(cacheEvent, objArr);
                        this._currentRequest = webRequest6;
                        r3 = i9;
                        file = r10;
                        r16 = webRequest6;
                        str2 = c7;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i9;
                                file = r10;
                                r16 = webRequest6;
                                str2 = c7;
                            } catch (Exception e3) {
                                DeviceLog.exception("Error closing stream", e3);
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                String message2 = e3.getMessage();
                                Object[] objArr2 = new Object[i9];
                                objArr2[r10] = CacheError.FILE_IO_ERROR;
                                objArr2[c] = str;
                                objArr2[c7] = message2;
                                cacheEventSender.sendEvent(cacheEvent2, objArr2);
                                r3 = objArr2;
                                file = r10;
                                r16 = webRequest6;
                                str2 = c7;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        i15 = 3;
                        z7 = false;
                        webRequest12 = webRequest15;
                        c14 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i8 = i15;
                        r9 = z7;
                        webRequest5 = webRequest12;
                        c6 = c14;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = r9;
                        CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                        String message3 = e.getMessage();
                        Object[] objArr3 = new Object[i8];
                        objArr3[r9] = CacheError.FILE_IO_ERROR;
                        objArr3[c] = str;
                        objArr3[c6] = message3;
                        cacheEventSender.sendEvent(cacheEvent3, objArr3);
                        this._currentRequest = webRequest5;
                        r3 = i8;
                        file = r9;
                        r16 = webRequest5;
                        str2 = c6;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i8;
                                file = r9;
                                r16 = webRequest5;
                                str2 = c6;
                            } catch (Exception e5) {
                                DeviceLog.exception("Error closing stream", e5);
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                String message4 = e5.getMessage();
                                Object[] objArr4 = new Object[i8];
                                objArr4[r9] = CacheError.FILE_IO_ERROR;
                                objArr4[c] = str;
                                objArr4[c6] = message4;
                                cacheEventSender.sendEvent(cacheEvent4, objArr4);
                                r3 = objArr4;
                                file = r9;
                                r16 = webRequest5;
                                str2 = c6;
                            }
                        }
                    } catch (IllegalStateException e6) {
                        e = e6;
                        i12 = 3;
                        z4 = false;
                        webRequest9 = webRequest15;
                        c11 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i5 = i12;
                        r6 = z4;
                        webRequest2 = webRequest9;
                        c3 = c11;
                        DeviceLog.exception("Illegal state", e);
                        this._active = r6;
                        CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                        String message5 = e.getMessage();
                        Object[] objArr5 = new Object[i5];
                        objArr5[r6] = CacheError.ILLEGAL_STATE;
                        objArr5[c] = str;
                        objArr5[c3] = message5;
                        cacheEventSender.sendEvent(cacheEvent5, objArr5);
                        this._currentRequest = webRequest2;
                        r3 = i5;
                        file = r6;
                        r16 = webRequest2;
                        str2 = c3;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i5;
                                file = r6;
                                r16 = webRequest2;
                                str2 = c3;
                            } catch (Exception e7) {
                                DeviceLog.exception("Error closing stream", e7);
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                String message6 = e7.getMessage();
                                Object[] objArr6 = new Object[i5];
                                objArr6[r6] = CacheError.FILE_IO_ERROR;
                                objArr6[c] = str;
                                objArr6[c3] = message6;
                                cacheEventSender.sendEvent(cacheEvent6, objArr6);
                                r3 = objArr6;
                                file = r6;
                                r16 = webRequest2;
                                str2 = c3;
                            }
                        }
                    } catch (MalformedURLException e8) {
                        e = e8;
                        i14 = 3;
                        z6 = false;
                        webRequest11 = webRequest15;
                        c13 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i7 = i14;
                        r8 = z6;
                        webRequest4 = webRequest11;
                        c5 = c13;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = r8;
                        CacheEvent cacheEvent7 = CacheEvent.DOWNLOAD_ERROR;
                        String message7 = e.getMessage();
                        Object[] objArr7 = new Object[i7];
                        objArr7[r8] = CacheError.MALFORMED_URL;
                        objArr7[c] = str;
                        objArr7[c5] = message7;
                        cacheEventSender.sendEvent(cacheEvent7, objArr7);
                        this._currentRequest = webRequest4;
                        r3 = i7;
                        file = r8;
                        r16 = webRequest4;
                        str2 = c5;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i7;
                                file = r8;
                                r16 = webRequest4;
                                str2 = c5;
                            } catch (Exception e9) {
                                DeviceLog.exception("Error closing stream", e9);
                                CacheEvent cacheEvent8 = CacheEvent.DOWNLOAD_ERROR;
                                String message8 = e9.getMessage();
                                Object[] objArr8 = new Object[i7];
                                objArr8[r8] = CacheError.FILE_IO_ERROR;
                                objArr8[c] = str;
                                objArr8[c5] = message8;
                                cacheEventSender.sendEvent(cacheEvent8, objArr8);
                                r3 = objArr8;
                                file = r8;
                                r16 = webRequest4;
                                str2 = c5;
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        i13 = 3;
                        z5 = false;
                        webRequest10 = webRequest15;
                        c12 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i6 = i13;
                        r7 = z5;
                        webRequest3 = webRequest10;
                        c4 = c12;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = r7;
                        CacheEvent cacheEvent9 = CacheEvent.DOWNLOAD_ERROR;
                        String message9 = e.getMessage();
                        Object[] objArr9 = new Object[i6];
                        objArr9[r7] = CacheError.FILE_IO_ERROR;
                        objArr9[c] = str;
                        objArr9[c4] = message9;
                        cacheEventSender.sendEvent(cacheEvent9, objArr9);
                        this._currentRequest = webRequest3;
                        r3 = i6;
                        file = r7;
                        r16 = webRequest3;
                        str2 = c4;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i6;
                                file = r7;
                                r16 = webRequest3;
                                str2 = c4;
                            } catch (Exception e11) {
                                DeviceLog.exception("Error closing stream", e11);
                                CacheEvent cacheEvent10 = CacheEvent.DOWNLOAD_ERROR;
                                String message10 = e11.getMessage();
                                Object[] objArr10 = new Object[i6];
                                objArr10[r7] = CacheError.FILE_IO_ERROR;
                                objArr10[c] = str;
                                objArr10[c4] = message10;
                                cacheEventSender.sendEvent(cacheEvent10, objArr10);
                                r3 = objArr10;
                                file = r7;
                                r16 = webRequest3;
                                str2 = c4;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        i11 = 3;
                        z3 = false;
                        webRequest8 = webRequest15;
                        c10 = c16;
                        fileOutputStream2 = fileOutputStream;
                        i4 = i11;
                        r5 = z3;
                        webRequest = webRequest8;
                        c2 = c10;
                        DeviceLog.exception("Unknown error", e);
                        this._active = r5;
                        CacheEvent cacheEvent11 = CacheEvent.DOWNLOAD_ERROR;
                        String message11 = e.getMessage();
                        Object[] objArr11 = new Object[i4];
                        objArr11[r5] = CacheError.UNKNOWN_ERROR;
                        objArr11[c] = str;
                        objArr11[c2] = message11;
                        cacheEventSender.sendEvent(cacheEvent11, objArr11);
                        this._currentRequest = webRequest;
                        r3 = i4;
                        file = r5;
                        r16 = webRequest;
                        str2 = c2;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r3 = i4;
                                file = r5;
                                r16 = webRequest;
                                str2 = c2;
                            } catch (Exception e13) {
                                DeviceLog.exception("Error closing stream", e13);
                                CacheEvent cacheEvent12 = CacheEvent.DOWNLOAD_ERROR;
                                String message12 = e13.getMessage();
                                Object[] objArr12 = new Object[i4];
                                objArr12[r5] = CacheError.FILE_IO_ERROR;
                                objArr12[c] = str;
                                objArr12[c2] = message12;
                                cacheEventSender.sendEvent(cacheEvent12, objArr12);
                                r3 = objArr12;
                                file = r5;
                                r16 = webRequest;
                                str2 = c2;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c8 = 3;
                        z2 = false;
                        webRequest7 = webRequest15;
                        c9 = c16;
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        i10 = c8;
                        r11 = z2;
                        r15 = webRequest7;
                        r25 = c9;
                        this._currentRequest = r15;
                        if (fileOutputStream2 == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Exception e14) {
                            DeviceLog.exception("Error closing stream", e14);
                            CacheEvent cacheEvent13 = CacheEvent.DOWNLOAD_ERROR;
                            String message13 = e14.getMessage();
                            Object[] objArr13 = new Object[i10];
                            objArr13[r11] = CacheError.FILE_IO_ERROR;
                            objArr13[c] = str;
                            objArr13[r25] = message13;
                            cacheEventSender.sendEvent(cacheEvent13, objArr13);
                            throw th;
                        }
                    }
                } catch (NetworkIOException e15) {
                    e = e15;
                    c = 1;
                    z8 = false;
                    i16 = 3;
                    fileOutputStream = fileOutputStream3;
                    c15 = 2;
                    webRequest13 = null;
                } catch (FileNotFoundException e16) {
                    e = e16;
                    c = 1;
                    z7 = false;
                    i15 = 3;
                    fileOutputStream = fileOutputStream3;
                    c14 = 2;
                    webRequest12 = null;
                } catch (MalformedURLException e17) {
                    e = e17;
                    c = 1;
                    z6 = false;
                    i14 = 3;
                    fileOutputStream = fileOutputStream3;
                    c13 = 2;
                    webRequest11 = null;
                } catch (IOException e18) {
                    e = e18;
                    c = 1;
                    z5 = false;
                    i13 = 3;
                    fileOutputStream = fileOutputStream3;
                    c12 = 2;
                    webRequest10 = null;
                } catch (IllegalStateException e19) {
                    e = e19;
                    c = 1;
                    z4 = false;
                    i12 = 3;
                    fileOutputStream = fileOutputStream3;
                    c11 = 2;
                    webRequest9 = null;
                } catch (Exception e20) {
                    e = e20;
                    c = 1;
                    z3 = false;
                    i11 = 3;
                    fileOutputStream = fileOutputStream3;
                    c10 = 2;
                    webRequest8 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c = 1;
                    z2 = false;
                    c8 = 3;
                    fileOutputStream = fileOutputStream3;
                    c9 = 2;
                    webRequest7 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                i10 = r3;
                r11 = file;
                r15 = r16;
                r25 = str2;
                this._currentRequest = r15;
                if (fileOutputStream2 == null) {
                    throw th;
                }
                fileOutputStream2.close();
                throw th;
            }
        } catch (NetworkIOException e21) {
            e = e21;
            c = 1;
            r10 = 0;
            i9 = 3;
            c7 = 2;
            webRequest6 = null;
        } catch (FileNotFoundException e22) {
            e = e22;
            c = 1;
            r9 = 0;
            i8 = 3;
            c6 = 2;
            webRequest5 = null;
        } catch (MalformedURLException e23) {
            e = e23;
            c = 1;
            r8 = 0;
            i7 = 3;
            c5 = 2;
            webRequest4 = null;
        } catch (IOException e24) {
            e = e24;
            c = 1;
            r7 = 0;
            i6 = 3;
            c4 = 2;
            webRequest3 = null;
        } catch (IllegalStateException e25) {
            e = e25;
            c = 1;
            r6 = 0;
            i5 = 3;
            c3 = 2;
            webRequest2 = null;
        } catch (Exception e26) {
            e = e26;
            c = 1;
            r5 = 0;
            i4 = 3;
            c2 = 2;
            webRequest = null;
        } catch (Throwable th5) {
            th = th5;
            c = 1;
            file = 0;
            r3 = 3;
            str2 = 2;
            r16 = 0;
            th = th;
            i10 = r3;
            r11 = file;
            r15 = r16;
            r25 = str2;
            this._currentRequest = r15;
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString(TypedValues.AttributesType.S_TARGET);
        data.remove(TypedValues.AttributesType.S_TARGET);
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, map2, z, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
