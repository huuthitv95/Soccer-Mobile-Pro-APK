package com.bykv.p028vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.buffer.p036a.C1914a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.Common;
import com.bykv.p028vk.openvk.preload.geckox.net.Response;
import com.bykv.p028vk.openvk.preload.geckox.p033a.C1901a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.C1963a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1968e;
import com.ironsource.C11540L6;
import com.ironsource.C12460ra;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.util.UrlConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.statistic.c */
/* JADX INFO: compiled from: UploadStatistic.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1962c {
    /* JADX INFO: renamed from: a */
    private static Integer m6054a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    /* JADX INFO: renamed from: a */
    public static void m6055a(C1910b c1910b, C1914a c1914a) {
        IStatisticMonitor iStatisticMonitorM5937q = c1910b.m5937q();
        if (iStatisticMonitorM5937q != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", c1910b.m5938r());
                jSONObject.put(C11540L6.f24911F, 0);
                jSONObject.put("app_version", c1910b.m5935o());
                jSONObject.put("api_version", "v3");
                jSONObject.put(C12460ra.f31825b, c1910b.m5931k());
                jSONObject.put("x_tt_logid", c1914a.f4362e);
                jSONObject.put("http_status", c1914a.f4364g);
                jSONObject.put("err_msg", c1914a.f4361d);
                if (TextUtils.isEmpty(c1914a.f4362e)) {
                    jSONObject.put("deployments_info", c1914a.f4359b);
                    jSONObject.put("local_info", c1914a.f4358a);
                    jSONObject.put("custom_info", c1914a.f4360c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, c1914a.f4363f);
                iStatisticMonitorM5937q.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th) {
                GeckoLogger.m6043w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6056a(final C1910b c1910b, C1960a c1960a) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (C1963a c1963a : c1960a.m6049a()) {
            if (c1963a.f4460d != null || c1963a.f4462f != 0) {
                if (c1963a.f4464h && c1963a.f4465i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = c1963a.f4458b;
                    packageStatisticModel.accessKey = c1963a.f4457a;
                    packageStatisticModel.channel = c1963a.f4459c;
                    packageStatisticModel.f4451ac = c1963a.f4470n;
                    packageStatisticModel.f4452id = c1963a.f4472p;
                    packageStatisticModel.patchId = c1963a.f4471o;
                    packageStatisticModel.downloadRetryTimes = m6054a(c1963a.f4461e);
                    packageStatisticModel.downloadUrl = c1963a.f4460d;
                    packageStatisticModel.downloadFailRecords = m6058b(c1963a.f4461e);
                    packageStatisticModel.downloadDuration = Long.valueOf(c1963a.f4463g - c1963a.f4462f);
                    if (!c1963a.f4466j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = c1963a.f4459c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = c1963a.f4474r;
                        packageStatisticModel2.f4451ac = c1963a.f4470n;
                        packageStatisticModel2.patchId = c1963a.f4471o;
                        packageStatisticModel2.f4452id = c1963a.f4472p;
                        packageStatisticModel2.downloadRetryTimes = m6054a(c1963a.f4461e);
                        packageStatisticModel2.downloadUrl = c1963a.f4460d;
                        packageStatisticModel2.downloadFailRecords = m6058b(c1963a.f4461e);
                    } else if (c1963a.f4467k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = c1963a.f4457a;
                        packageStatisticModel3.groupName = c1963a.f4458b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = c1963a.f4471o;
                        packageStatisticModel3.f4452id = c1963a.f4472p;
                        packageStatisticModel3.channel = c1963a.f4459c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(c1963a.f4468l - c1963a.f4463g);
                        packageStatisticModel3.applyDuration = Long.valueOf(c1963a.f4469m - c1963a.f4468l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = c1963a.f4457a;
                        packageStatisticModel4.groupName = c1963a.f4458b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = c1963a.f4459c;
                        packageStatisticModel4.patchId = c1963a.f4471o;
                        packageStatisticModel4.f4452id = c1963a.f4472p;
                        packageStatisticModel4.errMsg = c1963a.f4475s;
                        m6057a(c1963a, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = c1963a.f4457a;
                    packageStatisticModel5.groupName = c1963a.f4458b;
                    packageStatisticModel5.channel = c1963a.f4459c;
                    packageStatisticModel5.f4451ac = c1963a.f4470n;
                    packageStatisticModel5.patchId = c1963a.f4471o;
                    packageStatisticModel5.f4452id = c1963a.f4472p;
                    packageStatisticModel5.downloadRetryTimes = m6054a(c1963a.f4461e);
                    packageStatisticModel5.downloadUrl = c1963a.f4460d;
                    packageStatisticModel5.downloadFailRecords = m6058b(c1963a.f4461e);
                    if (!c1963a.f4464h) {
                        packageStatisticModel5.errCode = "301";
                        if (c1963a.f4461e != null && !c1963a.f4461e.isEmpty()) {
                            packageStatisticModel5.errMsg = c1963a.f4461e.get(0).reason;
                        }
                    } else if (!c1963a.f4465i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = c1963a.f4473q;
                    }
                    m6057a(c1963a, arrayList);
                }
            }
            m6057a(c1963a, arrayList);
        }
        Context contextM5922a = c1910b.m5922a();
        arrayList.addAll(C1901a.m5896a(contextM5922a));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(c1910b.m5931k(), c1910b.m5935o(), c1910b.m5938r(), C1964a.m6071b(contextM5922a), C1968e.m6082a(contextM5922a), c1910b.m5932l(), c1910b.m5933m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorM5937q = c1910b.m5937q();
        if (iStatisticMonitorM5937q != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    Common common2 = statisticModel.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    jSONObject.put("patch_id", packageStatisticModel6.patchId == null ? 0L : packageStatisticModel6.patchId.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put(C11540L6.f24911F, common2.f4436os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    jSONObject.put("id", packageStatisticModel6.f4452id == null ? 0L : packageStatisticModel6.f4452id.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f4435ac);
                    jSONObject.put("download_retry_times", packageStatisticModel6.downloadRetryTimes == null ? 0 : packageStatisticModel6.downloadRetryTimes.intValue());
                    Object obj = "";
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, packageStatisticModel6.downloadUrl == null ? "" : packageStatisticModel6.downloadUrl);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    if (packageStatisticModel6.downloadFailRecords != null) {
                        obj = packageStatisticModel6.downloadFailRecords;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    jSONObject.put("active_check_duration", packageStatisticModel6.activeCheckDuration == null ? 0L : packageStatisticModel6.activeCheckDuration.longValue());
                    jSONObject.put("apply_duration", packageStatisticModel6.applyDuration == null ? 0L : packageStatisticModel6.applyDuration.longValue());
                    iStatisticMonitorM5937q.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th) {
                GeckoLogger.m6043w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (c1910b.m5925c()) {
            try {
                final String json = statisticModel.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str = UrlConst.HTTPS + c1910b.m5930j() + "/gecko/server/packages/stats";
                C1910b.m5919g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i = 0; i < 3; i++) {
                            try {
                                Response responseDoPost = c1910b.m5929i().doPost(str, json);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                                }
                                if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (Exception e) {
                                GeckoLogger.m6043w("gecko-debug-tag", "upload statistic:", e);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6057a(C1963a c1963a, List<StatisticModel.PackageStatisticModel> list) {
        if (!c1963a.f4482z || !c1963a.f4453A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 1;
            packageStatisticModel.accessKey = c1963a.f4457a;
            packageStatisticModel.groupName = c1963a.f4458b;
            packageStatisticModel.channel = c1963a.f4459c;
            packageStatisticModel.f4451ac = c1963a.f4470n;
            packageStatisticModel.f4452id = c1963a.f4472p;
            packageStatisticModel.downloadRetryTimes = m6054a(c1963a.f4477u);
            packageStatisticModel.downloadUrl = c1963a.f4476t;
            packageStatisticModel.downloadFailRecords = m6058b(c1963a.f4477u);
            if (c1963a.f4482z) {
                if (c1963a.f4453A) {
                    return;
                }
                packageStatisticModel.errCode = "450";
                packageStatisticModel.errMsg = c1963a.f4455C;
                return;
            }
            packageStatisticModel.errCode = "300";
            if (c1963a.f4477u == null || c1963a.f4477u.isEmpty()) {
                return;
            }
            packageStatisticModel.errMsg = c1963a.f4477u.get(0).reason;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel2);
        packageStatisticModel2.statsType = 0;
        packageStatisticModel2.accessKey = c1963a.f4457a;
        packageStatisticModel2.groupName = c1963a.f4458b;
        packageStatisticModel2.channel = c1963a.f4459c;
        packageStatisticModel2.f4451ac = c1963a.f4470n;
        packageStatisticModel2.f4452id = c1963a.f4472p;
        packageStatisticModel2.downloadRetryTimes = m6054a(c1963a.f4477u);
        packageStatisticModel2.downloadUrl = c1963a.f4476t;
        packageStatisticModel2.downloadFailRecords = m6058b(c1963a.f4477u);
        packageStatisticModel2.downloadDuration = Long.valueOf(c1963a.f4479w - c1963a.f4478v);
        if (c1963a.f4454B) {
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.accessKey = c1963a.f4457a;
            packageStatisticModel3.groupName = c1963a.f4458b;
            packageStatisticModel3.statsType = 2;
            packageStatisticModel3.f4452id = c1963a.f4472p;
            packageStatisticModel3.channel = c1963a.f4459c;
            packageStatisticModel3.activeCheckDuration = Long.valueOf(c1963a.f4480x - c1963a.f4479w);
            packageStatisticModel3.applyDuration = Long.valueOf(c1963a.f4481y - c1963a.f4480x);
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 3;
        packageStatisticModel4.accessKey = c1963a.f4457a;
        packageStatisticModel4.groupName = c1963a.f4458b;
        packageStatisticModel4.errCode = "500";
        packageStatisticModel4.f4452id = c1963a.f4472p;
        packageStatisticModel4.channel = c1963a.f4459c;
        packageStatisticModel4.errMsg = c1963a.f4456D;
    }

    /* JADX INFO: renamed from: b */
    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> m6058b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }
}
