package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13236z;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a */
/* JADX INFO: compiled from: OrderCampAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13969a extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private boolean f40019a = false;

    /* JADX INFO: renamed from: b */
    private b f40020b;

    /* JADX INFO: renamed from: c */
    private List<CampaignEx> f40021c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a */
    /* JADX INFO: compiled from: OrderCampAdapter.java */
    class a implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ImageView f40022a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f40023b;

        a(ImageView imageView, boolean z) {
            this.f40022a = imageView;
            this.f40023b = z;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            if (this.f40023b) {
                this.f40022a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f40022a.setImageBitmap(bitmap);
            } catch (Throwable th) {
                C13219q0.m37816b("OrderCampAdapter", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$b */
    /* JADX INFO: compiled from: OrderCampAdapter.java */
    static class b {

        /* JADX INFO: renamed from: a */
        RelativeLayout f40025a;

        /* JADX INFO: renamed from: b */
        MBRotationView f40026b;

        /* JADX INFO: renamed from: c */
        MBridgeImageView f40027c;

        /* JADX INFO: renamed from: d */
        RoundImageView f40028d;

        /* JADX INFO: renamed from: e */
        TextView f40029e;

        /* JADX INFO: renamed from: f */
        TextView f40030f;

        /* JADX INFO: renamed from: g */
        TextView f40031g;

        /* JADX INFO: renamed from: h */
        TextView f40032h;

        /* JADX INFO: renamed from: i */
        MBridgeLevelLayoutView f40033i;

        /* JADX INFO: renamed from: j */
        ImageView f40034j;

        /* JADX INFO: renamed from: k */
        ImageView f40035k;

        /* JADX INFO: renamed from: l */
        MBCusRoundImageView f40036l;

        /* JADX INFO: renamed from: m */
        MBCusRoundImageView f40037m;

        /* JADX INFO: renamed from: n */
        MBStarLevelLayoutView f40038n;

        /* JADX INFO: renamed from: o */
        MBHeatLevelLayoutView f40039o;

        /* JADX INFO: renamed from: p */
        MBFrameLayout f40040p;

        b() {
        }
    }

    public C13969a(List<CampaignEx> list) {
        this.f40021c = list;
    }

    /* JADX INFO: renamed from: a */
    private int m41801a(String str) {
        return this.f40019a ? m41808b(str) : m41811c(str);
    }

    /* JADX INFO: renamed from: a */
    private View m41802a() {
        View viewInflate = LayoutInflater.from(C13008c.m36588n().m36542d()).inflate(m41812d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f40020b = bVar;
        bVar.f40027c = (MBridgeImageView) viewInflate.findViewById(m41811c("mbridge_lv_iv"));
        this.f40020b.f40035k = (ImageView) viewInflate.findViewById(m41811c("mbridge_lv_iv_burl"));
        this.f40020b.f40028d = (RoundImageView) viewInflate.findViewById(m41811c("mbridge_lv_icon_iv"));
        this.f40020b.f40033i = (MBridgeLevelLayoutView) viewInflate.findViewById(m41811c("mbridge_lv_sv_starlevel"));
        this.f40020b.f40026b = (MBRotationView) viewInflate.findViewById(m41811c("mbridge_lv_ration"));
        viewInflate.setTag(this.f40020b);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a */
    private View m41803a(int i, List<String> list) {
        int iM37728G = C13211m0.m37728G(C13008c.m36588n().m36542d());
        C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f40021c.get(i)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iM37728G).adChoiceLink(C13229v0.m37883a(this.f40021c.get(i))).build());
        if (viewCreateDynamicView != null) {
            this.f40019a = true;
            b bVar = new b();
            this.f40020b = bVar;
            bVar.f40036l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(m41808b("mbridge_lv_iv"));
            this.f40020b.f40035k = (ImageView) viewCreateDynamicView.findViewById(m41808b("mbridge_lv_iv_burl"));
            this.f40020b.f40037m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(m41808b("mbridge_lv_icon_iv"));
            this.f40020b.f40038n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(m41808b("mbridge_lv_sv_starlevel"));
            this.f40020b.f40040p = (MBFrameLayout) viewCreateDynamicView.findViewById(m41808b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f40020b);
        }
        return viewCreateDynamicView;
    }

    /* JADX INFO: renamed from: a */
    private void m41804a(int i) {
        b bVar = this.f40020b;
        if (bVar != null) {
            if (bVar.f40029e != null) {
                this.f40020b.f40029e.setText(this.f40021c.get(i).getAppName());
            }
            if (this.f40020b.f40030f != null) {
                this.f40020b.f40030f.setText(this.f40021c.get(i).getAppDesc());
            }
            if (this.f40020b.f40031g != null) {
                String adCall = this.f40021c.get(i).getAdCall();
                if (this.f40020b.f40031g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f40020b.f40031g).setObjectAnimator(new C13975b().m41847a(this.f40020b.f40031g));
                }
                this.f40020b.f40031g.setText(adCall);
            }
            if (this.f40020b.f40034j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextM36542d = C13008c.m36588n().m36542d();
                    if (contextM36542d != null) {
                        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                            this.f40020b.f40034j.setImageDrawable(contextM36542d.getResources().getDrawable(contextM36542d.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", C13008c.m36588n().m36550i())));
                        } else {
                            this.f40020b.f40034j.setImageDrawable(contextM36542d.getResources().getDrawable(contextM36542d.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", C13008c.m36588n().m36550i())));
                        }
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("OrderCampAdapter", e.getMessage());
                }
                C13229v0.m37892a(2, this.f40020b.f40034j, this.f40021c.get(i), C13008c.m36588n().m36542d(), false, null);
            }
            if (this.f40020b.f40032h != null) {
                try {
                    this.f40020b.f40032h.setText(C13008c.m36588n().m36542d().getResources().getString(C13008c.m36588n().m36542d().getResources().getIdentifier("mbridge_reward_viewed_text_str", TypedValues.Custom.S_STRING, C13008c.m36588n().m36550i())));
                    this.f40020b.f40032h.setVisibility(0);
                } catch (Exception e2) {
                    C13219q0.m37816b("OrderCampAdapter", e2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41805a(int i, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f40021c;
        if (list == null || this.f40020b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f40020b.f40027c;
        if (mBridgeImageView != null) {
            m41807a(mBridgeImageView, this.f40021c.get(i).getImageUrl(), false);
        }
        ImageView imageView = this.f40020b.f40035k;
        if (imageView != null) {
            m41807a(imageView, this.f40021c.get(i).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f40020b.f40028d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            m41807a(this.f40020b.f40028d, this.f40021c.get(i).getIconUrl(), true);
        }
        double rating = this.f40021c.get(i).getRating();
        if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f40020b.f40033i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f40021c.get(i).getNumberRating());
            this.f40020b.f40033i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f40020b.f40026b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f40020b.f40026b.setHeightRatio(1.0f);
            this.f40020b.f40026b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f40020b.f40027c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41806a(View view) {
        this.f40020b.f40025a = (RelativeLayout) view.findViewById(m41801a("mbridge_lv_item_rl"));
        this.f40020b.f40029e = (TextView) view.findViewById(m41801a("mbridge_lv_title_tv"));
        this.f40020b.f40031g = (TextView) view.findViewById(m41801a("mbridge_lv_tv_install"));
        this.f40020b.f40039o = (MBHeatLevelLayoutView) view.findViewById(m41801a("mbridge_lv_sv_heat_level"));
        this.f40020b.f40030f = (TextView) view.findViewById(m41801a("mbridge_lv_desc_tv"));
        this.f40020b.f40034j = (ImageView) view.findViewById(m41801a("mbridge_iv_flag"));
        this.f40020b.f40032h = (TextView) view.findViewById(m41801a("mbridge_order_viewed_tv"));
    }

    /* JADX INFO: renamed from: a */
    private void m41807a(ImageView imageView, String str, boolean z) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            C13100b.m37152a(imageView.getContext()).m37155a(str, new a(imageView, z));
        } else if (z) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    private int m41808b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: b */
    private View m41809b(int i) throws Throwable {
        View viewM41803a;
        String str;
        try {
            List<CampaignEx> list = this.f40021c;
            String cMPTEntryUrl = "";
            if (list == null || list.get(i) == null) {
                str = "501";
            } else {
                str = this.f40021c.get(i).getMof_tplid() + "";
                cMPTEntryUrl = this.f40021c.get(i).getCMPTEntryUrl();
            }
            if (TextUtils.isEmpty(cMPTEntryUrl)) {
                return m41802a();
            }
            int iM37728G = C13211m0.m37728G(C13008c.m36588n().m36542d());
            String strM37958a = C13236z.m37958a(0, str, cMPTEntryUrl);
            if (TextUtils.isEmpty(strM37958a)) {
                return m41802a();
            }
            File file = new File(strM37958a + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                List<String> listM37790a = C13215o0.m37790a(strM37958a, "template_" + str + "_" + iM37728G + "_item");
                if (listM37790a == null) {
                    return m41802a();
                }
                viewM41803a = m41803a(i, listM37790a);
                return this.f40019a ? viewM41803a : m41802a();
            }
            return m41802a();
        } catch (Exception e) {
            C13219q0.m37816b("OrderCampAdapter", e.getMessage());
            viewM41803a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41810b(int i, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f40021c;
        if (list == null || this.f40020b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f40020b.f40036l;
        if (mBCusRoundImageView != null && (mBCusRoundImageView instanceof MBCusRoundImageView)) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            m41807a(this.f40020b.f40036l, this.f40021c.get(i).getImageUrl(), false);
        }
        ImageView imageView = this.f40020b.f40035k;
        if (imageView != null) {
            m41807a(imageView, this.f40021c.get(i).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f40020b.f40037m;
        if (mBCusRoundImageView2 != null && (mBCusRoundImageView2 instanceof MBCusRoundImageView)) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            m41807a(this.f40020b.f40037m, this.f40021c.get(i).getIconUrl(), true);
        }
        double rating = this.f40021c.get(i).getRating();
        if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f40020b.f40038n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f40020b.f40038n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f40020b.f40039o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f40021c.get(i).getNumberRating());
        }
    }

    /* JADX INFO: renamed from: c */
    private int m41811c(String str) {
        return C13203i0.m37707a(C13008c.m36588n().m36542d().getApplicationContext(), str, "id");
    }

    /* JADX INFO: renamed from: d */
    public int m41812d(String str) {
        return C13203i0.m37707a(C13008c.m36588n().m36542d().getApplicationContext(), str, "layout");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f40021c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f40021c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<CampaignEx> list = this.f40021c;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = m41809b(i);
            } else {
                this.f40020b = (b) view.getTag();
            }
            m41806a(view);
            if (this.f40019a) {
                m41810b(i, viewGroup);
            } else {
                m41805a(i, viewGroup);
            }
            m41804a(i);
        } catch (Exception e) {
            C13219q0.m37816b("OrderCampAdapter", e.getMessage());
        }
        List<CampaignEx> list = this.f40021c;
        if (list != null && list.size() > i) {
            C13185b1.m37632a(view, this.f40021c.get(i).getLocalRequestId(), this.f40021c.get(i).getLocalAllowTrackClick());
        }
        return view;
    }
}
