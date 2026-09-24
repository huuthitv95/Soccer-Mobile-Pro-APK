package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13236z;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.util.C13976a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.c */
/* JADX INFO: compiled from: ViewOptionWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13987c {
    /* JADX INFO: renamed from: a */
    public C13942c m41933a(Context context, CampaignEx campaignEx, int i, String str) throws Throwable {
        String string;
        String str2;
        StringBuilder sb;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int iM37728G = C13211m0.m37728G(context);
            int iM37878a = C13229v0.m37878a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (iM37728G == 1) {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_portrait_");
                } else {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_landscape_");
                }
                sb.append(ecTemplateId);
                string = sb.toString();
                str2 = "template_" + str + iM37728G + "_" + ecTemplateId;
            } else {
                string = iM37728G == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str2 = "template_" + str + iM37728G;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = C13215o0.m37790a(C13236z.m37958a(2, i + "", campaignEx.getendcard_url()), str2);
            }
            return C13942c.m41705a().mo41749c(string).mo41746b(4).mo41740a(context).orientation(C13211m0.m37728G(context)).fileDirs(arrayList).mo41750d(campaignEx.getDynamicTempCode()).mo41739a(i).mo41742a(str).mo41751e(iM37878a).build();
        } catch (Exception e) {
            C13219q0.m37816b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13942c m41934a(Context context, List<CampaignEx> list) throws Throwable {
        String mof_template_url;
        int iM41857a;
        int mof_tplid;
        int dynamicTempCode;
        if (list == null) {
            return null;
        }
        try {
            float fM37930g = C13229v0.m37930g(C13008c.m36588n().m36542d());
            float fM37927f = C13229v0.m37927f(C13008c.m36588n().m36542d());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                mof_template_url = "";
                iM41857a = 1;
                mof_tplid = 0;
                dynamicTempCode = 0;
            } else {
                iM41857a = C13976a.m41857a(list.get(0));
                mof_tplid = list.get(0).getMof_tplid();
                mof_template_url = list.get(0).getMof_template_url();
                dynamicTempCode = list.get(0).getDynamicTempCode();
            }
            if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                arrayList = C13215o0.m37790a(C13236z.m37958a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + iM41857a);
            }
            String str = "mbridge_same_choice_one_layout_portrait";
            if (iM41857a != 1) {
                if (iM41857a == 2) {
                    str = "mbridge_same_choice_one_layout_landscape";
                } else if (C13976a.m41861a(context)) {
                    str = "mbridge_same_choice_one_layout_landscape";
                    iM41857a = 2;
                } else {
                    iM41857a = 1;
                }
            }
            return C13942c.m41705a().mo41740a(context).mo41749c(str).mo41746b(1).mo41745b(fM37927f).mo41738a(fM37930g).mo41743a(list).orientation(iM41857a).fileDirs(arrayList).mo41750d(dynamicTempCode).mo41739a(mof_tplid).build();
        } catch (Exception e) {
            C13219q0.m37816b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13942c m41935a(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            C14223c c14223cM42661a = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), campaignEx.getCampaignUnitId(), false);
            int iM42688D = c14223cM42661a != null ? c14223cM42661a.m42688D() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return C13942c.m41705a().mo41749c("mbridge_reward_layer_floor_bottom").mo41746b(3).mo41743a(arrayList).mo41740a(view.getContext()).mo41741a(view).mo41748c(iM42688D).orientation(C13211m0.m37728G(view.getContext())).build();
        } catch (Exception e) {
            C13219q0.m37816b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public C13942c m41936b(Context context, List<CampaignEx> list) throws Throwable {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float fM37930g = C13229v0.m37930g(C13008c.m36588n().m36542d());
                    float fM37927f = C13229v0.m37927f(C13008c.m36588n().m36542d());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int iM37728G = C13211m0.m37728G(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = C13215o0.m37790a(C13236z.m37958a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + iM37728G);
                    }
                    return C13942c.m41705a().mo41749c(iM37728G == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").mo41746b(5).mo41740a(context).mo41745b(fM37927f).mo41738a(fM37930g).mo41743a(list).orientation(iM37728G).fileDirs(arrayList).mo41750d(dynamicTempCode).mo41739a(mof_tplid).build();
                }
            } catch (Exception e) {
                C13219q0.m37816b("ViewOptionWrapper", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C13942c m41937b(View view, CampaignEx campaignEx) {
        String strM36781j;
        int iM36782k;
        String str;
        if (campaignEx == null) {
            return null;
        }
        try {
            List<String> arrayList = new ArrayList<>();
            String campaignUnitId = campaignEx.getCampaignUnitId();
            if (campaignEx.getRewardTemplateMode() != null) {
                iM36782k = campaignEx.getRewardTemplateMode().m36782k();
                strM36781j = campaignEx.getRewardTemplateMode().m36781j();
            } else {
                strM36781j = "";
                iM36782k = 0;
            }
            int iM37878a = C13229v0.m37878a(strM36781j, "ia_tp", -5);
            if (iM36782k == 0 || iM36782k == 102 || iM36782k == 202) {
                str = "mbridge_reward_layer_floor";
            } else {
                str = "mbridge_reward_layer_floor_" + iM36782k;
            }
            if (!TextUtils.isEmpty(strM36781j)) {
                String strM37958a = C13236z.m37958a(1, iM36782k + "", strM36781j);
                StringBuilder sb = new StringBuilder("template_");
                sb.append(iM36782k);
                arrayList = C13215o0.m37790a(strM37958a, sb.toString());
            }
            boolean zM41862a = C13976a.m41862a(strM36781j);
            String strM41860a = C13976a.m41860a(strM36781j, "whs_chn");
            C14223c c14223cM42661a = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), campaignUnitId, false);
            int iM42688D = c14223cM42661a != null ? c14223cM42661a.m42688D() : 0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(campaignEx);
            return C13942c.m41705a().mo41749c(str).mo41746b(2).mo41743a(arrayList2).mo41740a(view.getContext()).mo41741a(view).mo41748c(iM42688D).mo41752f(iM37878a).orientation(C13211m0.m37728G(view.getContext())).mo41739a(iM36782k).mo41744a(zM41862a).mo41747b(strM41860a).fileDirs(arrayList).mo41750d(campaignEx.getDynamicTempCode()).build();
        } catch (Exception e) {
            C13219q0.m37816b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }
}
