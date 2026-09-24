package com.tiktok.appevents;

import android.app.Application;
import android.text.TextUtils;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.IOUtils;
import com.tiktok.util.JSON;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTCrashHandler {
    private static final String CRASH_REPORT_FILE = "tt_crash_log";
    private static final int MONITOR_BATCH_MAX = 5;
    private static final int MONITOR_RETRY_LIMIT = 2;
    private static final String TAG = "TTCrashHandler";
    private static final TTLogger ttLogger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
    static volatile TTCrashReport crashReport = new TTCrashReport();

    static class TTCrashReport implements Serializable {
        List<Monitor> reports = new CopyOnWriteArrayList();

        static class Monitor implements Serializable {
            public int attempt;
            public final String monitor;

            /* JADX INFO: renamed from: ts */
            public long f41370ts;

            public Monitor(String o, long t, int a2) {
                this.monitor = o;
                this.f41370ts = t;
                this.attempt = a2;
            }
        }

        TTCrashReport() {
        }

        public void addReport(String o, long t, int a2) {
            if (a2 < 2) {
                this.reports.add(new Monitor(o, t, a2));
            }
        }
    }

    public static void handleCrash(String originTag, Throwable ex, int type) {
        if (ex != null) {
            if (TextUtils.isEmpty(originTag)) {
                originTag = "";
            }
            ttLogger.error(ex, "Error caused by sdk at " + originTag + "\n" + ex.getMessage(), new Object[0]);
            persistException(ex, type);
        }
    }

    public static void initCrashReporter() {
        try {
            TTCrashReport fromFile = readFromFile();
            if (fromFile != null && fromFile.reports != null) {
                crashReport.reports.addAll(fromFile.reports);
            }
            try {
                File file = new File(TikTokBusinessSdk.getApplicationContext().getFilesDir(), CRASH_REPORT_FILE);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            saveToFile(reportMonitor(crashReport));
            crashReport = new TTCrashReport();
        } catch (Throwable unused2) {
        }
    }

    public static boolean isTTSDKRelatedException(Throwable e) {
        if (e == null) {
            return false;
        }
        Throwable th = null;
        while (e != null && e != th) {
            if (isTTSDKRelatedException(e.getStackTrace())) {
                return true;
            }
            th = e;
            e = e.getCause();
        }
        return false;
    }

    public static boolean isTTSDKRelatedException(StackTraceElement[] elts) {
        if (elts != null && elts.length >= 1) {
            for (StackTraceElement stackTraceElement : elts) {
                if (stackTraceElement != null && stackTraceElement.getClassName().startsWith("com.tiktok")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void persistException(Throwable ex, int type) {
        JSONObject jSONObject = null;
        try {
            JSONObject healthMonitorBase = TTRequestBuilder.getHealthMonitorBase();
            try {
                JSON.putObject(healthMonitorBase, "monitor", TTUtil.getMonitorException(ex, null, type));
                crashReport.addReport(healthMonitorBase.toString(), System.currentTimeMillis(), 0);
                saveToFile(crashReport);
                crashReport = new TTCrashReport();
            } catch (Throwable unused) {
                jSONObject = healthMonitorBase;
                if (jSONObject == null || !jSONObject.has("monitor")) {
                    return;
                }
                JSONArray jSONArrayBuildArr = JSON.buildArr();
                JSON.putArr(jSONArrayBuildArr, jSONObject);
                JSONObject basePayloadWithTs = TTRequestBuilder.getBasePayloadWithTs();
                JSON.putObject(basePayloadWithTs, "batch", jSONArrayBuildArr);
                TTRequest.reportMonitorEvent(basePayloadWithTs);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void persistToFile() {
        try {
            if (crashReport == null || crashReport.reports.isEmpty()) {
                return;
            }
            saveToFile(crashReport);
            crashReport = new TTCrashReport();
        } catch (Throwable unused) {
        }
    }

    private static TTCrashReport readFromFile() {
        FileInputStream fileInputStreamOpenFileInput;
        Application applicationContext = TikTokBusinessSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            fileInputStreamOpenFileInput = applicationContext.openFileInput(CRASH_REPORT_FILE);
            try {
                TTCrashReport tTCrashReportSafeReadTTCrashHandler = TTSafeReadObjectUtil.safeReadTTCrashHandler(fileInputStreamOpenFileInput);
                IOUtils.close(fileInputStreamOpenFileInput);
                return tTCrashReportSafeReadTTCrashHandler;
            } catch (Throwable unused) {
                IOUtils.close(fileInputStreamOpenFileInput);
                return null;
            }
        } catch (Throwable unused2) {
            fileInputStreamOpenFileInput = null;
        }
    }

    private static TTCrashReport reportMonitor(TTCrashReport cr) {
        if (cr.reports == null || cr.reports.isEmpty()) {
            return cr;
        }
        TTCrashReport tTCrashReport = new TTCrashReport();
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < cr.reports.size()) {
                int i2 = i + 5;
                try {
                    List<TTCrashReport.Monitor> listSubList = cr.reports.subList(i, i2 > cr.reports.size() ? cr.reports.size() : i2);
                    JSONArray jSONArrayBuildArr = JSON.buildArr();
                    Iterator<TTCrashReport.Monitor> it = listSubList.iterator();
                    while (it.hasNext()) {
                        try {
                            String str = it.next().monitor;
                            if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                                arrayList.add(str);
                                JSONObject jSONObjectBuild = JSON.build(str);
                                if (jSONObjectBuild != null && jSONObjectBuild.length() > 0) {
                                    JSON.putArr(jSONArrayBuildArr, jSONObjectBuild);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (jSONArrayBuildArr.length() > 0) {
                        JSONObject basePayloadWithTs = TTRequestBuilder.getBasePayloadWithTs();
                        JSON.putObject(basePayloadWithTs, "batch", jSONArrayBuildArr);
                        HttpRequestUtil.HttpResponse httpResponseReportMonitorEvent = TTRequest.reportMonitorEvent(basePayloadWithTs);
                        if (httpResponseReportMonitorEvent == null || !httpResponseReportMonitorEvent.isOK()) {
                            for (TTCrashReport.Monitor monitor : listSubList) {
                                tTCrashReport.addReport(monitor.monitor, System.currentTimeMillis(), monitor.attempt + 1);
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                i = i2;
            }
        } catch (Throwable unused3) {
        }
        return tTCrashReport;
    }

    public static void retryLater(JSONObject monitor) {
        try {
            if (crashReport != null) {
                crashReport.addReport(monitor.toString(), System.currentTimeMillis(), 0);
            }
        } catch (Throwable unused) {
        }
    }

    private static void saveToFile(TTCrashReport cr) {
        ObjectOutputStream objectOutputStream;
        if (cr == null || cr.reports == null || cr.reports.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = TikTokBusinessSdk.getApplicationContext().openFileOutput(CRASH_REPORT_FILE, 0);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                try {
                    objectOutputStream.writeObject(cr);
                    IOUtils.close(fileOutputStreamOpenFileOutput, objectOutputStream);
                } catch (Throwable unused) {
                    fileOutputStream = fileOutputStreamOpenFileOutput;
                    try {
                        reportMonitor(cr);
                        IOUtils.close(fileOutputStream, objectOutputStream);
                    } catch (Throwable th) {
                        IOUtils.close(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable unused2) {
                objectOutputStream = null;
            }
        } catch (Throwable unused3) {
            objectOutputStream = null;
        }
    }
}
