package com.mbridge.msdk.video.dynview.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13211m0;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.a */
/* JADX INFO: compiled from: UIControlUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13976a {
    /* JADX INFO: renamed from: a */
    public static int m41857a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 1;
        }
        return campaignEx.getRewardTemplateMode().m36778g();
    }

    /* JADX INFO: renamed from: a */
    public static String m41858a(long j, Context context) {
        String strM37763p = C13211m0.m37763p(context);
        if (strM37763p.startsWith("zh")) {
            if (strM37763p.contains("TW") || strM37763p.contains("HK")) {
                return j + " 秒後自動播放";
            }
            return j + " 秒后自动播放";
        }
        if (strM37763p.startsWith("ja")) {
            return j + " 秒後自動的に再生 ";
        }
        if (strM37763p.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "Automatische Wiedergabe nach " + j + " Sekunden";
        }
        if (strM37763p.startsWith("ko")) {
            return j + " 초 후 자동 재생 ";
        }
        if (strM37763p.startsWith("fr")) {
            return "Lecture de vidéo dans " + j + " secondes";
        }
        if (strM37763p.startsWith("ar")) {
            return " ثوان" + j + "لعب تلقائيا بعد ";
        }
        if (strM37763p.startsWith("ru")) {
            return "Автовоспроизведение через " + j + " секунд";
        }
        return "Auto play after " + j + " s";
    }

    /* JADX INFO: renamed from: a */
    public static String m41859a(Context context, int i) {
        String str = i == 1 ? "_por" : "_land";
        String strM37763p = C13211m0.m37763p(context);
        if (strM37763p.startsWith("zh")) {
            return (strM37763p.contains("TW") || strM37763p.contains("HK")) ? "mbridge_reward_two_title_zh_trad" : "mbridge_reward_two_title_zh";
        }
        if (strM37763p.startsWith("ja")) {
            return "mbridge_reward_two_title_japan".concat(str);
        }
        if (strM37763p.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany".concat(str);
        }
        if (strM37763p.startsWith("ko")) {
            return "mbridge_reward_two_title_korea".concat(str);
        }
        if (strM37763p.startsWith("fr")) {
            return "mbridge_reward_two_title_france".concat(str);
        }
        if (strM37763p.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia".concat(str);
        }
        return strM37763p.startsWith("ru") ? "mbridge_reward_two_title_russian".concat(str) : "mbridge_reward_two_title_en".concat(str);
    }

    /* JADX INFO: renamed from: a */
    public static String m41860a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m41861a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m41862a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("alecfc");
                if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals("1")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m41863b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 100;
        }
        int iM36782k = campaignEx.getRewardTemplateMode().m36782k();
        if (iM36782k == 302 || iM36782k == 802 || iM36782k == 902) {
            return -3;
        }
        if (iM36782k != 904) {
            return 100;
        }
        return !m41862a(campaignEx.getRewardTemplateMode().m36781j()) ? -1 : -3;
    }
}
