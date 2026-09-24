package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13712c;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.tracker.network.C13846p;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private AbstractC13711b0 _responseBody;
    private C13846p monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v22 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v23 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v24 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v26 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v36 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private com.mbridge.msdk.foundation.download.DownloadResponse handleInputStream(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) throws java.io.IOException, java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.handleInputStream(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!C13223s0.m37831a().m37842a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, C13709a0 c13709a0, int i) throws IllegalAccessException, IOException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean zIsSupportResume = isSupportResume(i, this._downloadModel);
        boolean z = (c13709a0 == null || this._downloadRequest == null || i != 206 || c13709a0.m40167d() == null || this._downloadRequest.getTotalBytes() <= 0 || c13709a0.m40167d().mo40201k() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (!zIsSupportResume && z) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        AbstractC13711b0 abstractC13711b0M40167d = c13709a0.m40167d();
        this._responseBody = abstractC13711b0M40167d;
        if (Objects.isNull(abstractC13711b0M40167d)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long jMo40201k = this._responseBody.mo40201k();
        if (jMo40201k <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(jMo40201k);
        }
        InputStream inputStreamM40200d = this._responseBody.m40200d();
        this._inputStream = inputStreamM40200d;
        if (Objects.isNull(inputStreamM40200d)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        this._downloadMessage.setContentLength(this._downloadRequest.getTotalBytes());
        this._downloadRequest.handlerResponseStartEvent(this._downloadMessage);
        return handleInputStream(str, str2, str3, this._etag);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        if (i != 206 || TextUtils.isEmpty(this._etag)) {
            return false;
        }
        return downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag());
    }

    private void reportDownloadMessage() {
        boolean zIsSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(zIsSuccessful));
        boolean zIsCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(zIsCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!zIsSuccessful && !zIsCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        C13846p c13846p = this.monitor;
        if (c13846p != null) {
            if (zIsSuccessful) {
                c13846p.m41159a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                C13846p c13846p2 = this.monitor;
                if (zIsCancelled) {
                    exception = new IOException("download request canceled");
                }
                c13846p2.m41168a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.m41159a(3);
                } else {
                    this.monitor.m41159a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            if (downloadMessage != null) {
                downloadMessage.setCurrentDownloadRate(i);
                downloadMessage.setContentLength(j2);
            }
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01e8 A[Catch: Exception -> 0x01d3, all -> 0x028a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x028a, blocks: (B:29:0x01b5, B:31:0x01bb, B:34:0x01c7, B:36:0x01cf, B:40:0x01d7, B:42:0x01e8, B:48:0x021f, B:50:0x022f, B:52:0x0235, B:59:0x025b), top: B:90:0x01b5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0218  */
    /* JADX WARN: Code duplicated, block: B:48:0x021f A[Catch: all -> 0x028a, Exception -> 0x028d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x028d, blocks: (B:29:0x01b5, B:31:0x01bb, B:34:0x01c7, B:40:0x01d7, B:48:0x021f), top: B:90:0x01b5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x02ba  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x01e8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws Throwable {
        String str;
        String str2 = RESPONSE_CODE;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        C13846p monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            C13846p c13846p = new C13846p(C13093d.m37126a((DownloadRequest<?>) this._downloadRequest), "GET");
            this.monitor = c13846p;
            c13846p.m41188f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        C13846p c13846p2 = this.monitor;
        if (c13846p2 != null) {
            c13846p2.m41194i(timeout);
            this.monitor.m41184e(connectTimeout);
            this.monitor.m41187f(readTimeout);
            this.monitor.m41196j(writeTimeout);
            this.monitor.m41182d("queue");
            this.monitor.m41160a(requestQueueTime);
        }
        String str3 = String.format(Locale.ENGLISH, FORMAT_RANGE, Long.valueOf(downloadedBytes));
        try {
            C13786v.b bVarM40790s = GlobalComponent.getInstance().getOkHttpClient().m40790s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C13786v c13786vM40806a = bVarM40790s.m40807b(connectTimeout, timeUnit).m40804a(new MBridgeHostnameVerifier(downloadUrl)).m40810d(readTimeout, timeUnit).m40811e(writeTimeout, timeUnit).m40798a(Math.max(0L, timeout), timeUnit).m40802a(new OKHTTPEventListener(this.monitor)).m40808b(true).m40806a();
            C13789y c13789yM40839a = new C13789y.a().m40842b(downloadUrl).m40832a(new C13712c.a().m40218b().m40217a()).m40838a("Connection", "close").m40838a("Range", str3).m40836a("User-Agent").m40838a("User-Agent", Command.DEFAULT_USER_AGENT).m40839a();
            DownloaderReporter.Builder builder = this._downloaderReporter;
            String strM40738g = c13789yM40839a.m40831g().m40738g();
            String str4 = DownloadCommon.DOWNLOAD_REPORT_HOST;
            builder.add(DownloadCommon.DOWNLOAD_REPORT_HOST, strM40738g);
            DownloaderReporter.Builder builder2 = this._downloaderReporter;
            builder2.add("url", downloadUrl);
            InterfaceC13714d interfaceC13714dM40774a = c13786vM40806a.m40774a(c13789yM40839a);
            C13709a0 c13709a0 = null;
            try {
                try {
                    C13709a0 c13709a0Mo40225d = interfaceC13714dM40774a.mo40225d();
                    try {
                        try {
                            try {
                                if (!Objects.isNull(c13709a0Mo40225d) && !Objects.isNull(c13709a0Mo40225d.m40167d())) {
                                    int iM40169k = c13709a0Mo40225d.m40169k();
                                    C13846p c13846p3 = this.monitor;
                                    if (c13846p3 != null) {
                                        try {
                                            c13846p3.m41173b(iM40169k);
                                            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iM40169k));
                                            if (!c13709a0Mo40225d.m40172n()) {
                                                this._downloadResponse.setError(new IOException(RESPONSE_CODE + iM40169k));
                                                DownloadResponse downloadResponse = this._downloadResponse;
                                                Objects.closeInputStream(this._inputStream);
                                                Objects.closeOutputStream(this._outputStream);
                                                Objects.closeResponse(c13709a0Mo40225d);
                                                Objects.closeResponseBody(this._responseBody);
                                                if (!interfaceC13714dM40774a.mo40226h()) {
                                                    interfaceC13714dM40774a.cancel();
                                                }
                                                reportDownloadMessage();
                                                return downloadResponse;
                                            }
                                            this._etag = c13709a0Mo40225d.m40165a("ETag", "");
                                            str2 = saveFileName;
                                            try {
                                                this._downloadResponse = handlerRequestSuccessful(str2, cacheDirectoryPath, downloadId, c13709a0Mo40225d, iM40169k);
                                                Objects.closeInputStream(this._inputStream);
                                                Objects.closeOutputStream(this._outputStream);
                                                Objects.closeResponse(c13709a0Mo40225d);
                                                Objects.closeResponseBody(this._responseBody);
                                                if (!interfaceC13714dM40774a.mo40226h()) {
                                                    interfaceC13714dM40774a.cancel();
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                str4 = downloadId;
                                                builder2 = cacheDirectoryPath;
                                                c13709a0 = c13709a0Mo40225d;
                                                str = builder2;
                                                handlerException(str2, str, str4, e);
                                                Objects.closeInputStream(this._inputStream);
                                                Objects.closeOutputStream(this._outputStream);
                                                Objects.closeResponse(c13709a0);
                                                Objects.closeResponseBody(this._responseBody);
                                                if (!interfaceC13714dM40774a.mo40226h()) {
                                                }
                                                reportDownloadMessage();
                                                return this._downloadResponse;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            c13709a0 = c13709a0Mo40225d;
                                            str2 = saveFileName;
                                            str = cacheDirectoryPath;
                                            str4 = downloadId;
                                            handlerException(str2, str, str4, e);
                                            Objects.closeInputStream(this._inputStream);
                                            Objects.closeOutputStream(this._outputStream);
                                            Objects.closeResponse(c13709a0);
                                            Objects.closeResponseBody(this._responseBody);
                                            if (!interfaceC13714dM40774a.mo40226h()) {
                                            }
                                            reportDownloadMessage();
                                            return this._downloadResponse;
                                        }
                                        c13709a0 = c13709a0Mo40225d;
                                        str = builder2;
                                        handlerException(str2, str, str4, e);
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(c13709a0);
                                        Objects.closeResponseBody(this._responseBody);
                                        if (!interfaceC13714dM40774a.mo40226h()) {
                                            interfaceC13714dM40774a.cancel();
                                        }
                                    } else {
                                        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iM40169k));
                                        if (!c13709a0Mo40225d.m40172n()) {
                                            this._downloadResponse.setError(new IOException(RESPONSE_CODE + iM40169k));
                                            DownloadResponse downloadResponse2 = this._downloadResponse;
                                            Objects.closeInputStream(this._inputStream);
                                            Objects.closeOutputStream(this._outputStream);
                                            Objects.closeResponse(c13709a0Mo40225d);
                                            Objects.closeResponseBody(this._responseBody);
                                            if (!interfaceC13714dM40774a.mo40226h()) {
                                                interfaceC13714dM40774a.cancel();
                                            }
                                            reportDownloadMessage();
                                            return downloadResponse2;
                                        }
                                        this._etag = c13709a0Mo40225d.m40165a("ETag", "");
                                        str2 = saveFileName;
                                        this._downloadResponse = handlerRequestSuccessful(str2, cacheDirectoryPath, downloadId, c13709a0Mo40225d, iM40169k);
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(c13709a0Mo40225d);
                                        Objects.closeResponseBody(this._responseBody);
                                        if (!interfaceC13714dM40774a.mo40226h()) {
                                            interfaceC13714dM40774a.cancel();
                                        }
                                        c13709a0 = c13709a0Mo40225d;
                                        str = builder2;
                                        handlerException(str2, str, str4, e);
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(c13709a0);
                                        Objects.closeResponseBody(this._responseBody);
                                        if (!interfaceC13714dM40774a.mo40226h()) {
                                            interfaceC13714dM40774a.cancel();
                                        }
                                    }
                                    reportDownloadMessage();
                                    return this._downloadResponse;
                                }
                                this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                                DownloadResponse downloadResponse3 = this._downloadResponse;
                                Objects.closeInputStream(this._inputStream);
                                Objects.closeOutputStream(this._outputStream);
                                Objects.closeResponse(c13709a0Mo40225d);
                                Objects.closeResponseBody(this._responseBody);
                                if (!interfaceC13714dM40774a.mo40226h()) {
                                    interfaceC13714dM40774a.cancel();
                                }
                                reportDownloadMessage();
                                return downloadResponse3;
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str2 = saveFileName;
                            builder2 = cacheDirectoryPath;
                            str4 = downloadId;
                        }
                    } catch (Throwable th) {
                        th = th;
                        c13709a0 = c13709a0Mo40225d;
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(c13709a0);
                        Objects.closeResponseBody(this._responseBody);
                        if (!interfaceC13714dM40774a.mo40226h()) {
                            interfaceC13714dM40774a.cancel();
                        }
                        reportDownloadMessage();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            handlerException(saveFileName, cacheDirectoryPath, downloadId, e6);
            this._downloadResponse.setSuccessful(false);
            return this._downloadResponse;
        }
    }
}
