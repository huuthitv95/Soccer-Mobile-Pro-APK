package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13014d;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.click.b */
/* JADX INFO: compiled from: CommonClickControlDiff.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12683b {
    /* JADX INFO: renamed from: a */
    public static void m34645a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m34646a(Context context, CampaignEx campaignEx, String str, JumpLoaderResult jumpLoaderResult, Boolean bool, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        C13227u0.m37857a(context, jumpLoaderResult.getUrl(), nativeTrackingListener, campaignEx, list);
    }

    /* JADX INFO: renamed from: a */
    public static void m34647a(Context context, String str, CampaignEx campaignEx, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C12682a.m34606a(context, campaignEx, str, str2, true, false, C12701a.f33768o);
    }

    /* JADX INFO: renamed from: a */
    public static void m34648a(JumpLoaderResult jumpLoaderResult, Context context, String str, CampaignEx campaignEx, Boolean bool, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
    }

    /* JADX INFO: renamed from: a */
    public static void m34649a(C13014d c13014d, CampaignEx campaignEx, String str) {
        c13014d.m36638a(campaignEx, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m34650a(CampaignEx campaignEx) {
    }

    /* JADX INFO: renamed from: a */
    public static void m34651a(String str, Context context, String str2, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener) {
    }
}
